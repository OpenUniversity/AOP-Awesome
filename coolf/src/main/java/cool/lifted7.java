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

@SuppressWarnings("all") final class lifted7 extends Strategy 
{ 
  TermReference b_26;

  TermReference n_26;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail508:
    { 
      term = decreament_0_2.instance.invoke(context, term, b_26.value, n_26.value);
      if(term == null)
        break Fail508;
      if(true)
        return term;
    }
    return null;
  }
}