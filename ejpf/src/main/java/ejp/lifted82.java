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

@SuppressWarnings("all") final class lifted82 extends Strategy 
{ 
  TermReference k_52;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail262:
    { 
      lifted83 lifted830 = new lifted83();
      lifted830.k_52 = k_52;
      term = try_1_0.instance.invoke(context, term, lifted830);
      if(term == null)
        break Fail262;
      if(true)
        return term;
    }
    return null;
  }
}