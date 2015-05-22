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

@SuppressWarnings("all") final class lifted43 extends Strategy 
{ 
  TermReference c_23;

  TermReference d_23;

  TermReference k_23;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail303:
    { 
      lifted44 lifted440 = new lifted44();
      lifted440.c_23 = c_23;
      lifted440.d_23 = d_23;
      lifted440.k_23 = k_23;
      term = try_1_0.instance.invoke(context, term, lifted440);
      if(term == null)
        break Fail303;
      if(true)
        return term;
    }
    return null;
  }
}