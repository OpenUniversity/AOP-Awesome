package ejp.runtime;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.CLASS)
@Target(ElementType.METHOD)
public @interface Pointcutargs {
	String aspect();
	String joinpoint();
	String pointcut();
	String expr();
}
