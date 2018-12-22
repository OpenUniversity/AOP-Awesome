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

@SuppressWarnings("all") final class lifted127 extends Strategy 
{ 
  TermReference n_42;

  TermReference p_42;

  TermReference o_42;

  TermReference q_42;

  TermReference w_42;

  TermReference x_42;

  TermReference f_43;

  TermReference s_42;

  TermReference t_42;

  TermReference a_43;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail238:
    { 
      term = make_lock_and_unlock_methods_0_10.instance.invokeDynamic(context, term, NO_STRATEGIES, new IStrategoTerm[]{n_42.value, p_42.value, o_42.value, q_42.value, w_42.value, x_42.value, f_43.value, s_42.value, t_42.value, a_43.value});
      if(term == null)
        break Fail238;
      if(true)
        return term;
    }
    return null;
  }
}