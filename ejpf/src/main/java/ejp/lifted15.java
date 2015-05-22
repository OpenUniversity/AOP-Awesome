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
  TermReference l_14;

  TermReference s_77;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail331:
    { 
      IStrategoTerm r_14 = null;
      IStrategoTerm t_14 = null;
      IStrategoTerm u_14 = null;
      t_14 = term;
      r_14 = ejp.constNone0;
      u_14 = t_14;
      term = ejp_to_java_0_4.instance.invoke(context, u_14, l_14.value, r_14, ejp.constNone0, s_77.value);
      if(term == null)
        break Fail331;
      if(true)
        return term;
    }
    return null;
  }
}