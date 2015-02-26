package ex_handles;

aspect Aspect {
  public scoped joinpoint void jp() handles java.io.IOException;
}

