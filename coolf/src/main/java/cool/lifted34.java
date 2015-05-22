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
  TermReference y_10;

  TermReference z_10;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail372:
    { 
      lifted36 lifted360 = new lifted36();
      lifted35 lifted350 = new lifted35();
      lifted360.y_10 = y_10;
      lifted360.z_10 = z_10;
      lifted350.y_10 = y_10;
      lifted350.z_10 = z_10;
      term = or_2_0.instance.invoke(context, term, lifted350, lifted360);
      if(term == null)
        break Fail372;
      if(true)
        return term;
    }
    return null;
  }
}