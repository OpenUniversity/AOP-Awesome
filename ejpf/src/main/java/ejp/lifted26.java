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

@SuppressWarnings("all") final class lifted26 extends Strategy 
{ 
  TermReference z_77;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail318:
    { 
      lifted27 lifted270 = new lifted27();
      lifted270.z_77 = z_77;
      term = try_1_0.instance.invoke(context, term, lifted270);
      if(term == null)
        break Fail318;
      if(true)
        return term;
    }
    return null;
  }
}