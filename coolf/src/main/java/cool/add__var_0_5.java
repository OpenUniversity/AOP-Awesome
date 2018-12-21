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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm v_21, IStrategoTerm w_21, IStrategoTerm x_21, IStrategoTerm y_21, IStrategoTerm z_21)
  { 
    context.push("add__var_0_5");
    Fail39:
    { 
      term = hashtable_put_0_2.instance.invoke(context, y_21, v_21, z_21);
      if(term == null)
        break Fail39;
      term = increament_0_2.instance.invoke(context, w_21, v_21, w_21);
      if(term == null)
        break Fail39;
      term = increament_0_2.instance.invoke(context, x_21, v_21, x_21);
      if(term == null)
        break Fail39;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}