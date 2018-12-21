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

@SuppressWarnings("all") final class lifted124 extends Strategy 
{ 
  TermReference k_44;

  TermReference w_43;

  TermReference n_44;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail244:
    { 
      term = make_requires_method_0_3.instance.invoke(context, term, k_44.value, w_43.value, n_44.value);
      if(term == null)
        break Fail244;
      if(true)
        return term;
    }
    return null;
  }
}