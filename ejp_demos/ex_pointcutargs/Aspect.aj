package ex_pointcutargs;

aspect Aspect {

 public joinpoint void aa() pointcutargs mm();

 before(): aa.mm() {
   System.out.println("calling something that was added to aa.mm");
 }

}
