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

@SuppressWarnings("all") final class lifted31 extends Strategy 
{ 
  TermReference y_10;

  TermReference z_10;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail373:
    { 
      lifted33 lifted330 = new lifted33();
      lifted32 lifted320 = new lifted32();
      lifted330.y_10 = y_10;
      lifted330.z_10 = z_10;
      lifted320.y_10 = y_10;
      lifted320.z_10 = z_10;
      term = or_2_0.instance.invoke(context, term, lifted320, lifted330);
      if(term == null)
        break Fail373;
      if(true)
        return term;
    }
    return null;
  }
}