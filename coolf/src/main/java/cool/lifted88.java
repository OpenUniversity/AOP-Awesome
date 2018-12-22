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

@SuppressWarnings("all") final class lifted88 extends Strategy 
{ 
  public static final lifted88 instance = new lifted88();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail272:
    { 
      term = or_2_0.instance.invoke(context, term, lifted89.instance, lifted90.instance);
      if(term == null)
        break Fail272;
      if(true)
        return term;
    }
    return null;
  }
}