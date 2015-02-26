package ex_pointcutargs;

public class Main {

  public static void main(String[] args) {
    new Main().foo();
  }

  public void foo() {
    System.out.println("at foo");
    ex_pointcutargs.Aspect.aa() pointcutargs mm():call(* goo(..));

    ex_pointcutargs.Aspect.aa() pointcutargs mm():call(private * *());
    goo(10);
    koo(); 
  }

  public void goo(int k) {
    System.out.println("at goo with k = " + k);
  }

  private void koo() {
    System.out.println("at koo");
  }
}

