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

@SuppressWarnings("all") final class lifted4 extends Strategy 
{ 
  TermReference s_24;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail510:
    { 
      lifted5 lifted510 = new lifted5();
      lifted510.s_24 = s_24;
      term = try_1_0.instance.invoke(context, term, lifted510);
      if(term == null)
        break Fail510;
      if(true)
        return term;
    }
    return null;
  }
}