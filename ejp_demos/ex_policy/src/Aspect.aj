package ex_policy;

import org.aspectj.lang.reflect.*;
import org.aspectj.lang.annotation.Before;

public aspect Aspect {
 
  public scoped joinpoint int aa(int a, int b);

  declare error nomatch by ejp: 
          call(* foo(..)):
          call(* goo(..)):
          "no match error";
}

