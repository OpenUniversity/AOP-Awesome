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

@SuppressWarnings("all") final class lifted22 extends Strategy 
{ 
  TermReference r_18;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail321:
    { 
      lifted24 lifted240 = new lifted24();
      lifted23 lifted230 = new lifted23();
      lifted240.r_18 = r_18;
      lifted230.r_18 = r_18;
      term = or_2_0.instance.invoke(context, term, lifted230, lifted240);
      if(term == null)
        break Fail321;
      if(true)
        return term;
    }
    return null;
  }
}