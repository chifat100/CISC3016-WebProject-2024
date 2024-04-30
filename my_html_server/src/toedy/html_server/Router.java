package toedy.html_server;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Parameter;
import java.net.URLDecoder;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Objects;

public class Router {
    //    private final toedy.html_server.DependencyInjector dependencyInjector;
    private final ArrayList<Route> routes = new ArrayList<>();

//    public toedy.html_server.Router(toedy.html_server.DependencyInjector dependencyInjector) {
//        this.dependencyInjector = dependencyInjector;
//    }

    public String call(String path) throws Throwable {
        String[] parts = path.split("\\?");
//        String[] pathSegments = parts[0].charAt(0) == '/'
//                ? parts[0].substring(1).split("/")
//                : parts[0].split("/");
        String[] pathSegments = parts[0].split("/");
        String[] querySegments = parts.length > 1 ? parts[1].split("&") : null;
        for (Route route : routes) {
            Object[] args = matchPath(route, pathSegments, querySegments);
            if (Objects.isNull(args))
                continue;

            try {
                return route.method.invoke(
                        route.containingClass.getConstructor().newInstance(),
//                        dependencyInjector.create(route.containingClass),
                        args
                ).toString();
            } catch (InvocationTargetException e) {
                throw e.getCause();
            }
        }
        return null;
    }

    private Object[] matchPath(Route route, String[] pathSegments, String[] querySegments) {
        // Because it starts with "/", the first element of pathSegments will be empty
        if (pathSegments.length - 1 != route.path().length)
            return null;
        Object[] args = new Object[route.parameters().length];
        for (int i = 1; i < pathSegments.length; i++) {
            if (route.path()[i - 1].type() == SegmentType.Literal) {
                if (!Objects.equals(pathSegments[i], route.path()[i - 1].name()))
                    return null;
                continue;
            }

            Object value = castParam(pathSegments[i], route.path()[i - 1].type());
            if (Objects.isNull(value))
                return null;
            args[route.path()[i - 1].parameterIndex()] = value;
        }

        if (Objects.isNull(querySegments))
            return args;

        for (String querySegment : querySegments) {
            String[] keyValue = querySegment.split("=");
            if (keyValue.length == 1)
                continue;

            int j;
            for (j = 0; j < route.parameters().length; j++)
                if (Objects.equals(keyValue[0], route.parameters()[j].name()))
                    break;
            if (Objects.nonNull(args[route.parameters()[j].parameterIndex]))
                continue;
            Object value = castParam(keyValue[1], route.parameters()[j].type);
            if (Objects.isNull(value))
                continue;
            args[route.parameters()[j].parameterIndex] = value;
        }

        return args;
    }

    private Object castParam(String value, SegmentType type) {
        try {
            switch (type) {
                case SegmentType.Literal:
                    return null;
                case SegmentType.Integer:
                    return Integer.parseInt(value);
                case SegmentType.Float:
                    return Float.parseFloat(value);
                case SegmentType.String:
                default:
                    return URLDecoder.decode(value, StandardCharsets.UTF_8);
            }
        } catch (NumberFormatException e) {
            return null;
        }
    }

    public void registerController(Class<? extends Controller> controller) throws RouteParsingException {
        System.out.println(this.getClass().getPackageName());
        for (Method method : controller.getMethods()) {
            register(controller, method);
        }
    }

    public void build() {
        routes.sort((a, b) -> {
            if (a.path.length != b.path.length)
                return Integer.compare(a.path.length, b.path.length);
            for (int i = 0; i < a.path.length; i++) {
                if (a.path[i].type == SegmentType.Literal && b.path[i].type != SegmentType.Literal)
                    return -1;
                if (a.path[i].type != SegmentType.Literal && b.path[i].type == SegmentType.Literal)
                    return 1;
                int com = a.path[i].name.compareTo(b.path[i].name);
                if (com != 0)
                    return com;
            }
            return 0;
        });
    }

    private void register(Class<?> containingClass, Method method) throws RouteParsingException {
        Action action = method.getAnnotation(Action.class);
        if (Objects.isNull(action))
            return;
        String pattern = action.value();
        if (pattern.charAt(0) != '/')
            throw new RouteParsingException("Routes must start with '/'.");

        Parameter[] methodParameters = method.getParameters();
        ParamSegment[] requiredParameters = new ParamSegment[methodParameters.length];
        for (int i = 0; i < methodParameters.length; i++) {
            FromRoute fromRoute = methodParameters[i].getAnnotation(FromRoute.class);
            if (Objects.isNull(fromRoute))
                continue;
            SegmentType type = parseType(methodParameters[i].getType());
            if (Objects.isNull(type))
                continue;
            requiredParameters[i] = new ParamSegment(fromRoute.value(), type, i);
        }

        String[] segments = pattern.split("/");
        ParamSegment[] path = new ParamSegment[segments.length - 1];
        for (int i = 1; i < segments.length; i++) {
            if (segments[i].isEmpty())
                throw new RouteParsingException("Empty segment found in path: " + pattern);
            if (segments[i].charAt(0) != '{') {
                path[i - 1] = new ParamSegment(segments[i], SegmentType.Literal, 0);
                continue;
            }

            if (segments[i].charAt(segments[i].length() - 1) != '}')
                throw new RouteParsingException("Invalid syntax: " + pattern);

            String name = segments[i].substring(1, segments[i].length() - 1);
            int j;
            for (j = 0; j < requiredParameters.length; j++)
                if (Objects.equals(name, requiredParameters[j].name()))
                    break;
            if (j == requiredParameters.length) {
                throw new RouteParsingException("Cannot find " + name + " as a parameter of " + method.getName() + " (missing @toedy.html_server.FromRoute?)");
            }
            path[i - 1] = new ParamSegment(name, requiredParameters[j].type(), j);
        }

        routes.add(new Route(path, containingClass, method, requiredParameters));
    }

    private SegmentType parseType(Class<?> type) {
        if (type.equals(Integer.class))
            return SegmentType.Integer;
        if (type.equals(Float.class))
            return SegmentType.Float;
        if (type.equals(String.class))
            return SegmentType.String;
        return null;
    }

    private enum SegmentType {
        Literal, Integer, Float, String
    }

    public static class RouteParsingException extends Exception {
        public RouteParsingException(String message) {
            super(message);
        }
    }

    private record Route(ParamSegment[] path, Class<?> containingClass, Method method, ParamSegment[] parameters) {
    }

    private record ParamSegment(String name, SegmentType type, int parameterIndex) {
    }
}