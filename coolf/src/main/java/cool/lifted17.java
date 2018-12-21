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

@SuppressWarnings("all") final class lifted17 extends Strategy 
{ 
  TermReference y_10;

  TermReference z_10;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail389:
    { 
      lifted19 lifted190 = new lifted19();
      lifted18 lifted180 = new lifted18();
      lifted190.y_10 = y_10;
      lifted190.z_10 = z_10;
      lifted180.y_10 = y_10;
      lifted180.z_10 = z_10;
      term = or_2_0.instance.invoke(context, term, lifted180, lifted190);
      if(term == null)
        break Fail389;
      if(true)
        return term;
    }
    return null;
  }
}