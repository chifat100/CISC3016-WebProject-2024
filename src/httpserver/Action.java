package httpserver;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * put <code>@Action("/path/{id}/sth")</code> on a method
 * will call the method when a user visit "/path/123/sth" with the parameter <code>id</code> set to 123.
 * Every parameter in the method needs to have the <code>@FromRoute</code> attribute to
 * accept values from the route's path or query
 *
 * @see FromRoute
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface Action {
    String value();
}

