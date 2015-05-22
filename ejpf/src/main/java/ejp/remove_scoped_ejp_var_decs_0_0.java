package ejp;

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

@SuppressWarnings("all") public class remove_scoped_ejp_var_decs_0_0 extends Strategy 
{ 
  public static remove_scoped_ejp_var_decs_0_0 instance = new remove_scoped_ejp_var_decs_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    context.push("remove_scoped_ejp_var_decs_0_0");
    Fail35:
    { 
      IStrategoTerm c_22 = null;
      c_22 = term;
      term = allow_extends_1_1.instance.invoke(context, term, remove_vars_decs_from_local_var_dec_stm_0_0.instance, c_22);
      if(term == null)
        break Fail35;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}