package ex_policy;

public class Main {
        public void foo(int a) {
		System.out.println("at foo with a = " + a);
	}
        
        public void goo() {
 		System.out.println("at goo");
        }   

	public static void main(String[] args) {
            new Main().arik();
        }

 	public void arik() {
		System.out.println("at arik");
         	ex_policy.Aspect.aa(7,8) {
			System.out.println("in scoped block");
  			foo(9);
// 			goo();
		};

		foo(98765);
	}

}
