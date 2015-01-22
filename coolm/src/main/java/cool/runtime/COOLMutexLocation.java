package cool.runtime;

public @interface COOLMutexLocation {
	String file();
	int startLine();
	int endLine();
	int column();
	int offset();
}
