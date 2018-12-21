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
  TermReference v_43;

  TermReference x_43;

  TermReference w_43;

  TermReference y_43;

  TermReference e_44;

  TermReference f_44;

  TermReference n_44;

  TermReference a_44;

  TermReference b_44;

  TermReference i_44;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail241:
    { 
      term = make_lock_and_unlock_methods_0_10.instance.invokeDynamic(context, term, NO_STRATEGIES, new IStrategoTerm[]{v_43.value, x_43.value, w_43.value, y_43.value, e_44.value, f_44.value, n_44.value, a_44.value, b_44.value, i_44.value});
      if(term == null)
        break Fail241;
      if(true)
        return term;
    }
    return null;
  }
}