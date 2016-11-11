package cool;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.java_front.*;
import org.strategoxt.stratego_gpp.*;
import org.strategoxt.stratego_sglr.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class add__var_0_5 extends Strategy 
{ 
  public static add__var_0_5 instance = new add__var_0_5();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm u_37, IStrategoTerm v_37, IStrategoTerm w_37, IStrategoTerm x_37, IStrategoTerm y_37)
  { 
    context.push("add__var_0_5");
    Fail153:
    { 
      term = hashtable_put_0_2.instance.invoke(context, x_37, u_37, y_37);
      if(term == null)
        break Fail153;
      term = increament_0_2.instance.invoke(context, v_37, u_37, v_37);
      if(term == null)
        break Fail153;
      term = increament_0_2.instance.invoke(context, w_37, u_37, w_37);
      if(term == null)
        break Fail153;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}