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

@SuppressWarnings("all") final class lifted15 extends Strategy 
{ 
  TermReference j_14;

  TermReference f_77;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail331:
    { 
      IStrategoTerm p_14 = null;
      IStrategoTerm r_14 = null;
      IStrategoTerm s_14 = null;
      r_14 = term;
      p_14 = ejp.constNone0;
      s_14 = r_14;
      term = ejp_to_java_0_4.instance.invoke(context, s_14, j_14.value, p_14, ejp.constNone0, f_77.value);
      if(term == null)
        break Fail331;
      if(true)
        return term;
    }
    return null;
  }
}