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

@SuppressWarnings("all") final class lifted55 extends Strategy 
{ 
  TermReference u_29;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail293:
    { 
      IStrategoTerm v_29 = null;
      v_29 = term;
      if(u_29.value == null)
        break Fail293;
      term = hashtable_remove_0_1.instance.invoke(context, u_29.value, v_29);
      if(term == null)
        break Fail293;
      if(true)
        return term;
    }
    return null;
  }
}