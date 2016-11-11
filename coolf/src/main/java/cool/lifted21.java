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

@SuppressWarnings("all") final class lifted21 extends Strategy 
{ 
  TermReference x_26;

  TermReference y_26;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail492:
    { 
      lifted23 lifted230 = new lifted23();
      lifted22 lifted220 = new lifted22();
      lifted230.x_26 = x_26;
      lifted230.y_26 = y_26;
      lifted220.x_26 = x_26;
      lifted220.y_26 = y_26;
      term = or_2_0.instance.invoke(context, term, lifted220, lifted230);
      if(term == null)
        break Fail492;
      if(true)
        return term;
    }
    return null;
  }
}