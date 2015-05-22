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

@SuppressWarnings("all") final class lifted17 extends Strategy 
{ 
  TermReference x_13;

  TermReference s_77;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail329:
    { 
      IStrategoTerm d_14 = null;
      IStrategoTerm f_14 = null;
      IStrategoTerm g_14 = null;
      f_14 = term;
      d_14 = ejp.constNone0;
      g_14 = f_14;
      term = ejp_to_java_0_4.instance.invoke(context, g_14, x_13.value, d_14, ejp.constNone0, s_77.value);
      if(term == null)
        break Fail329;
      if(true)
        return term;
    }
    return null;
  }
}