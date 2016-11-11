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

@SuppressWarnings("all") final class lifted125 extends Strategy 
{ 
  TermReference j_72;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail349:
    { 
      term = gen_method_state_0_1.instance.invoke(context, term, j_72.value);
      if(term == null)
        break Fail349;
      if(true)
        return term;
    }
    return null;
  }
}