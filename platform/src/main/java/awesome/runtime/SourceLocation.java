package awesome.runtime;

public @interface SourceLocation {
	String file();
	int startLine();
	int endLine();
	int column();
	int offset();
}
