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

@SuppressWarnings("all") final class lifted3 extends Strategy 
{ 
  TermReference c_10;

  TermReference o_10;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail402:
    { 
      term = decreament_0_2.instance.invoke(context, term, c_10.value, o_10.value);
      if(term == null)
        break Fail402;
      if(true)
        return term;
    }
    return null;
  }
}