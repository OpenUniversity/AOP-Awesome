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

@SuppressWarnings("all") final class lifted6 extends Strategy 
{ 
  TermReference b_26;

  TermReference c_26;

  TermReference d_26;

  TermReference n_26;

  TermReference f_26;

  TermReference g_26;

  TermReference h_26;

  TermReference i_26;

  TermReference j_26;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail509:
    { 
      term = add_external_impl_0_9.instance.invokeDynamic(context, term, NO_STRATEGIES, new IStrategoTerm[]{b_26.value, c_26.value, d_26.value, n_26.value, f_26.value, g_26.value, h_26.value, i_26.value, j_26.value});
      if(term == null)
        break Fail509;
      if(true)
        return term;
    }
    return null;
  }
}