package org.aspectj.weaver.bcel;


public class NameAndArgumentType {

	private String name;
	private String arguments;

	public NameAndArgumentType(String name, String arguments) {
		this.name = name;
		this.arguments = arguments;
	}

	@Override
	public int hashCode() {
		return name.hashCode() * 7 + arguments.hashCode() * 13;
	}

	@Override
	public boolean equals(Object obj) {
		if (!(obj instanceof NameAndArgumentType))
			return false;
		NameAndArgumentType naat = (NameAndArgumentType) obj;
		// TODO: compare argument types instead of type names
		return name.equals(naat.name) && arguments.equals(naat.arguments);
	}

	@Override
	public String toString() {
		return name + "(" + arguments + ")";
	}

	public String getName() {
		return name;
	}
}
