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

@SuppressWarnings("all") final class lifted14 extends Strategy 
{ 
  TermReference l_14;

  TermReference s_77;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail330:
    { 
      lifted15 lifted150 = new lifted15();
      lifted150.l_14 = l_14;
      lifted150.s_77 = s_77;
      term = try_1_0.instance.invoke(context, term, lifted150);
      if(term == null)
        break Fail330;
      if(true)
        return term;
    }
    return null;
  }
}