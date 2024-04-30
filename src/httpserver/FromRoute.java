package httpserver;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * put <code>@FromRoute("/path/{id}/sth")</code> on a method parameter
 * to capture a value from the route's path or query
 *
 * @see Action
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.PARAMETER)
public @interface FromRoute {
    String value();
}
