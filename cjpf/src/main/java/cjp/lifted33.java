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

@SuppressWarnings("all") final class lifted33 extends Strategy 
{ 
  public static final lifted33 instance = new lifted33();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail165:
    { 
      term = try_1_0.instance.invoke(context, term, check_for_change_in_aspect_or_class_0_0.instance);
      if(term == null)
        break Fail165;
      if(true)
        return term;
    }
    return null;
  }
}