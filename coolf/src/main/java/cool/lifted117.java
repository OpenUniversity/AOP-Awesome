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

@SuppressWarnings("all") final class lifted117 extends Strategy 
{ 
  public static final lifted117 instance = new lifted117();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail250:
    { 
      term = strip_annos_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail250;
      if(true)
        return term;
    }
    return null;
  }
}