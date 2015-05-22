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
  TermReference v_13;

  TermReference f_77;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail329:
    { 
      IStrategoTerm b_14 = null;
      IStrategoTerm d_14 = null;
      IStrategoTerm e_14 = null;
      d_14 = term;
      b_14 = ejp.constNone0;
      e_14 = d_14;
      term = ejp_to_java_0_4.instance.invoke(context, e_14, v_13.value, b_14, ejp.constNone0, f_77.value);
      if(term == null)
        break Fail329;
      if(true)
        return term;
    }
    return null;
  }
}