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

@SuppressWarnings("all") final class lifted35 extends Strategy 
{ 
  TermReference x_26;

  TermReference y_26;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail479:
    { 
      lifted37 lifted370 = new lifted37();
      lifted36 lifted360 = new lifted36();
      lifted370.x_26 = x_26;
      lifted370.y_26 = y_26;
      lifted360.x_26 = x_26;
      lifted360.y_26 = y_26;
      term = or_2_0.instance.invoke(context, term, lifted360, lifted370);
      if(term == null)
        break Fail479;
      if(true)
        return term;
    }
    return null;
  }
}