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

@SuppressWarnings("all") final class lifted47 extends Strategy 
{ 
  TermReference h_25;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail299:
    { 
      lifted48 lifted480 = new lifted48();
      lifted480.h_25 = h_25;
      term = try_1_0.instance.invoke(context, term, lifted480);
      if(term == null)
        break Fail299;
      if(true)
        return term;
    }
    return null;
  }
}