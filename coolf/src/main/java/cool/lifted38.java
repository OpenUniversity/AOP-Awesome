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

@SuppressWarnings("all") final class lifted38 extends Strategy 
{ 
  TermReference x_26;

  TermReference y_26;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail476:
    { 
      lifted40 lifted400 = new lifted40();
      lifted39 lifted390 = new lifted39();
      lifted400.x_26 = x_26;
      lifted400.y_26 = y_26;
      lifted390.x_26 = x_26;
      lifted390.y_26 = y_26;
      term = or_2_0.instance.invoke(context, term, lifted390, lifted400);
      if(term == null)
        break Fail476;
      if(true)
        return term;
    }
    return null;
  }
}