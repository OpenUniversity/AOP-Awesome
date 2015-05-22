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

@SuppressWarnings("all") final class lifted30 extends Strategy 
{ 
  TermReference y_10;

  TermReference z_10;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail371:
    { 
      lifted34 lifted340 = new lifted34();
      lifted31 lifted311 = new lifted31();
      lifted340.y_10 = y_10;
      lifted340.z_10 = z_10;
      lifted311.y_10 = y_10;
      lifted311.z_10 = z_10;
      term = or_2_0.instance.invoke(context, term, lifted311, lifted340);
      if(term == null)
        break Fail371;
      if(true)
        return term;
    }
    return null;
  }
}