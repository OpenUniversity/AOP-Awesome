package ejps.runtime;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.CLASS)
@Target(ElementType.METHOD)
public @interface ExplicitScopedJoinPoint {
	String[] handles() default {};
	String aspect();
	String joinpoint();
	String[] args();
}
