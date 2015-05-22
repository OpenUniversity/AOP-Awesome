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
  TermReference s_22;

  TermReference t_22;

  TermReference a_23;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail303:
    { 
      lifted44 lifted440 = new lifted44();
      lifted440.s_22 = s_22;
      lifted440.t_22 = t_22;
      lifted440.a_23 = a_23;
      term = try_1_0.instance.invoke(context, term, lifted440);
      if(term == null)
        break Fail303;
      if(true)
        return term;
    }
    return null;
  }
}