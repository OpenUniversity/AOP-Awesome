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

@SuppressWarnings("all") final class lifted85 extends Strategy 
{ 
  public static final lifted85 instance = new lifted85();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail275:
    { 
      term = or_2_0.instance.invoke(context, term, lifted86.instance, lifted87.instance);
      if(term == null)
        break Fail275;
      if(true)
        return term;
    }
    return null;
  }
}