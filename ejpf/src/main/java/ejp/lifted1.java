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

@SuppressWarnings("all") final class lifted1 extends Strategy 
{ 
  TermReference l_11;

  TermReference o_11;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail345:
    { 
      IStrategoTerm v_11 = null;
      IStrategoTerm x_11 = null;
      IStrategoTerm a_12 = null;
      x_11 = term;
      term = new_hashtable_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail345;
      v_11 = term;
      a_12 = x_11;
      term = ejp_to_java_0_4.instance.invoke(context, a_12, v_11, l_11.value, ejp.constNone0, o_11.value);
      if(term == null)
        break Fail345;
      if(true)
        return term;
    }
    return null;
  }
}