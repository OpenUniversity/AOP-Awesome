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

@SuppressWarnings("all") final class lifted130 extends Strategy 
{ 
  TermReference z_47;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail236:
    { 
      term = equal_0_1.instance.invoke(context, term, z_47.value);
      if(term == null)
        break Fail236;
      if(true)
        return term;
    }
    return null;
  }
}