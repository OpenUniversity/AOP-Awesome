package lom.runtime;

public @interface BridgedSourceLocation {
    public String file();
    public int line();
    public String module();
}

