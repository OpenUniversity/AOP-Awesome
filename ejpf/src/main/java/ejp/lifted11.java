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

@SuppressWarnings("all") final class lifted11 extends Strategy 
{ 
  TermReference p_77;

  TermReference q_77;

  TermReference r_77;

  TermReference s_77;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail333:
    { 
      lifted12 lifted120 = new lifted12();
      lifted120.p_77 = p_77;
      lifted120.q_77 = q_77;
      lifted120.r_77 = r_77;
      lifted120.s_77 = s_77;
      term = try_1_0.instance.invoke(context, term, lifted120);
      if(term == null)
        break Fail333;
      if(true)
        return term;
    }
    return null;
  }
}