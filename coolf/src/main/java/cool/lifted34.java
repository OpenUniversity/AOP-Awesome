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

@SuppressWarnings("all") final class lifted34 extends Strategy 
{ 
  TermReference x_26;

  TermReference y_26;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail475:
    { 
      lifted38 lifted380 = new lifted38();
      lifted35 lifted350 = new lifted35();
      lifted380.x_26 = x_26;
      lifted380.y_26 = y_26;
      lifted350.x_26 = x_26;
      lifted350.y_26 = y_26;
      term = or_2_0.instance.invoke(context, term, lifted350, lifted380);
      if(term == null)
        break Fail475;
      if(true)
        return term;
    }
    return null;
  }
}