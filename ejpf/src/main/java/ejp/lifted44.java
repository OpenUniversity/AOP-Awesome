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
  TermReference c_23;

  TermReference d_23;

  TermReference k_23;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail304:
    { 
      term = pointcutarg_0_3.instance.invoke(context, term, c_23.value, d_23.value, k_23.value);
      if(term == null)
        break Fail304;
      if(true)
        return term;
    }
    return null;
  }
}