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

@SuppressWarnings("all") final class lifted16 extends Strategy 
{ 
  TermReference x_13;

  TermReference s_77;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail328:
    { 
      lifted17 lifted170 = new lifted17();
      lifted170.x_13 = x_13;
      lifted170.s_77 = s_77;
      term = try_1_0.instance.invoke(context, term, lifted170);
      if(term == null)
        break Fail328;
      if(true)
        return term;
    }
    return null;
  }
}