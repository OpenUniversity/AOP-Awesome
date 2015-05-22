package cjp.runtime;

public @interface JoinpointSignature {
	Class<?>[] args();
	String name();
}
