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

@SuppressWarnings("all") final class lifted20 extends Strategy 
{ 
  TermReference z_77;

  TermReference x_18;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail324:
    { 
      lifted21 lifted211 = new lifted21();
      lifted211.z_77 = z_77;
      lifted211.x_18 = x_18;
      term = try_1_0.instance.invoke(context, term, lifted211);
      if(term == null)
        break Fail324;
      if(true)
        return term;
    }
    return null;
  }
}