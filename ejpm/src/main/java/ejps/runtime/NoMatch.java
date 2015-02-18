package ejps.runtime;

public @interface NoMatch {
	String expr();
	String error();
	String granularity();
}
