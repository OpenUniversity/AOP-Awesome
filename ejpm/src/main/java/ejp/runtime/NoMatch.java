package ejp.runtime;

public @interface NoMatch {
	String expr();
	String error();
	String granularity();
}
