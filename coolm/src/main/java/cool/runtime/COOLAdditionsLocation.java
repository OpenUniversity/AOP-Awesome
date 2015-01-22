package cool.runtime;

public @interface COOLAdditionsLocation {
	String file();
	int startLine();
	int endLine();
	int column();
	int offset();
}
