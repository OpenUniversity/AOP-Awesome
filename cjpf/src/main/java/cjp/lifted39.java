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

@SuppressWarnings("all") final class lifted39 extends Strategy 
{ 
  public static final lifted39 instance = new lifted39();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail159:
    { 
      term = try_1_0.instance.invoke(context, term, remove_closures_additions_0_0.instance);
      if(term == null)
        break Fail159;
      if(true)
        return term;
    }
    return null;
  }
}