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

@SuppressWarnings("all") final class lifted126 extends Strategy 
{ 
  TermReference d_43;

  TermReference n_42;

  TermReference p_42;

  TermReference f_43;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail239:
    { 
      term = make_on_exit_method_0_4.instance.invoke(context, term, d_43.value, n_42.value, p_42.value, f_43.value);
      if(term == null)
        break Fail239;
      if(true)
        return term;
    }
    return null;
  }
}