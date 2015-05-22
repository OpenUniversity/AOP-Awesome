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

@SuppressWarnings("all") final class lifted41 extends Strategy 
{ 
  TermReference a_22;

  TermReference b_22;

  TermReference d_22;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail307:
    { 
      term = pointcutarg_0_3.instance.invoke(context, term, a_22.value, b_22.value, d_22.value);
      if(term == null)
        break Fail307;
      if(true)
        return term;
    }
    return null;
  }
}