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

@SuppressWarnings("all") final class lifted41 extends Strategy 
{ 
  public static final lifted41 instance = new lifted41();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail365:
    { 
      term = or_2_0.instance.invoke(context, term, lifted42.instance, lifted43.instance);
      if(term == null)
        break Fail365;
      if(true)
        return term;
    }
    return null;
  }
}