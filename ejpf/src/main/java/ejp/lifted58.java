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

@SuppressWarnings("all") final class lifted58 extends Strategy 
{ 
  Strategy n_31;

  Strategy o_31;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail291:
    { 
      term = allow_extends_helper_2_0.instance.invoke(context, term, n_31, o_31);
      if(term == null)
        break Fail291;
      if(true)
        return term;
    }
    return null;
  }
}