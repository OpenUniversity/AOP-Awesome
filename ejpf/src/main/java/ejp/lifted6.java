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

@SuppressWarnings("all") final class lifted6 extends Strategy 
{ 
  TermReference c_77;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail338:
    { 
      lifted7 lifted710 = new lifted7();
      lifted710.c_77 = c_77;
      term = try_1_0.instance.invoke(context, term, lifted710);
      if(term == null)
        break Fail338;
      if(true)
        return term;
    }
    return null;
  }
}