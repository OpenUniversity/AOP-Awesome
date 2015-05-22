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

@SuppressWarnings("all") final class lifted44 extends Strategy 
{ 
  TermReference s_22;

  TermReference t_22;

  TermReference a_23;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail304:
    { 
      term = pointcutarg_0_3.instance.invoke(context, term, s_22.value, t_22.value, a_23.value);
      if(term == null)
        break Fail304;
      if(true)
        return term;
    }
    return null;
  }
}