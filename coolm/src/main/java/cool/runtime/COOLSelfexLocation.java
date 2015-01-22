package cool.runtime;

public @interface COOLSelfexLocation {
	String file();
	int startLine();
	int endLine();
	int column();
	int offset();
}
