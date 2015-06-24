package cool.runtime;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
public @interface COOLSelfexLocation {
	String file();
	int startLine();
        int endLine();
        int column();
        int offset();
}
