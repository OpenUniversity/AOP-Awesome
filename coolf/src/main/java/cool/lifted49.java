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

@SuppressWarnings("all") final class lifted49 extends Strategy 
{ 
  TermReference c_10;

  TermReference d_10;

  TermReference e_10;

  TermReference f_10;

  TermReference g_10;

  TermReference h_10;

  TermReference i_10;

  TermReference j_10;

  TermReference k_10;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail356:
    { 
      term = add_external_impl_0_9.instance.invokeDynamic(context, term, NO_STRATEGIES, new IStrategoTerm[]{c_10.value, d_10.value, e_10.value, f_10.value, g_10.value, h_10.value, i_10.value, j_10.value, k_10.value});
      if(term == null)
        break Fail356;
      if(true)
        return term;
    }
    return null;
  }
}