package ex_handles;


public class Main {
  public static void main(String[] args) {
    new Main().foo();
  }

  public void foo() {
    ex_handles.Aspect.jp() {
     goo(); 
    };
  }

  public void goo() throws java.io.IOException {
    throw new java.io.IOException("my IOException");
  }
}

