package cjp;

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

@SuppressWarnings("all") final class lifted37 extends Strategy 
{ 
  public static final lifted37 instance = new lifted37();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail160:
    { 
      term = try_1_0.instance.invoke(context, term, lifted38.instance);
      if(term == null)
        break Fail160;
      if(true)
        return term;
    }
    return null;
  }
}