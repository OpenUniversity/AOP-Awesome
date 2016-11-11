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

@SuppressWarnings("all") final class lifted96 extends Strategy 
{ 
  TermReference e_50;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail373:
    { 
      lifted98 lifted980 = new lifted98();
      lifted97 lifted970 = new lifted97();
      lifted980.e_50 = e_50;
      lifted970.e_50 = e_50;
      term = or_2_0.instance.invoke(context, term, lifted970, lifted980);
      if(term == null)
        break Fail373;
      if(true)
        return term;
    }
    return null;
  }
}