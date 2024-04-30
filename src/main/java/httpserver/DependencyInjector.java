package httpserver;

import java.lang.reflect.Constructor;
import java.util.HashMap;
import java.util.Map;

// Unfinished, so it is unused.
// Currently:
// - only handles singleton
// - slow
public class DependencyInjector {
    private final Map<Class<?>, Object> singletons = new HashMap<>();

    public void addSingleton(Object obj) {
        singletons.put(obj.getClass(), obj);
    }

    public <T> T create(Class<T> tClass) {
        return create(tClass, new HashMap<>());
    }

    public <T> T create(Class<T> tClass, Map<Class<?>, Object> extraData) {
        var constructors = tClass.getConstructors();
        if (constructors.length == 0)
            throw new RuntimeException("The class " + tClass.getName() + " contains no constructor.");
        Constructor<T> constructor;
        try {
            constructor = tClass.getConstructor(constructors[0].getParameterTypes());
        } catch (NoSuchMethodException e) {
            throw new RuntimeException(e);
        }
        var parameters = constructor.getParameters();
        var arguments = new Object[parameters.length];
        for (int i = 0; i < parameters.length; i++) {
            var parameter = parameters[i];
            if (parameter.getType() == this.getClass()) {
                arguments[i] = this;
                continue;
            }
            if (singletons.containsKey(parameter.getType())) {
                arguments[i] = singletons.get(parameter.getType());
                continue;
            }
            if (extraData.containsKey(parameter.getType())) {
                arguments[i] = extraData.get(parameter.getType());
                continue;
            }
            throw new RuntimeException("Unable to resolve parameter " + parameter.getType() + " for the constructor of class " + tClass.getName());
        }
        try {
            return constructor.newInstance(arguments);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
