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

@SuppressWarnings("all") public class remove_vars_decs_from_local_var_dec_stm_0_0 extends Strategy 
{ 
  public static remove_vars_decs_from_local_var_dec_stm_0_0 instance = new remove_vars_decs_from_local_var_dec_stm_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    context.push("remove_vars_decs_from_local_var_dec_stm_0_0");
    Fail44:
    { 
      IStrategoTerm n_26 = null;
      IStrategoTerm o_26 = null;
      IStrategoTerm p_26 = null;
      if(term.getTermType() != IStrategoTerm.APPL || transform._consLocalVarDecStm_1 != ((IStrategoAppl)term).getConstructor())
        break Fail44;
      IStrategoTerm arg63 = term.getSubterm(0);
      if(arg63.getTermType() != IStrategoTerm.APPL || transform._consLocalVarDec_3 != ((IStrategoAppl)arg63).getConstructor())
        break Fail44;
      n_26 = arg63.getSubterm(2);
      p_26 = term;
      IStrategoTerm term21 = term;
      Success21:
      { 
        Fail45:
        { 
          term = allow_extends_1_1.instance.invoke(context, term, remove_var_dec_0_0.instance, n_26);
          if(term == null)
            break Fail45;
          o_26 = term;
          if(true)
            break Success21;
        }
        term = term21;
        IStrategoTerm t_26 = null;
        t_26 = term;
        term = report_with_failure_0_1.instance.invoke(context, t_26, ejp.const13);
        if(term == null)
          break Fail44;
      }
      term = p_26;
      if(o_26 == null)
        break Fail44;
      term = o_26;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}