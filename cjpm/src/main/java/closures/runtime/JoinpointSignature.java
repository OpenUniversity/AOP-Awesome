package closures.runtime;

public @interface JoinpointSignature {
	Class<?>[] args();
	String name();
}
