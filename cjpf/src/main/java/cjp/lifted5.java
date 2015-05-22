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

@SuppressWarnings("all") final class lifted5 extends Strategy 
{ 
  TermReference x_18;

  TermReference y_18;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail190:
    { 
      term = closures_to_ajc_0_2.instance.invoke(context, term, x_18.value, y_18.value);
      if(term == null)
        break Fail190;
      if(true)
        return term;
    }
    return null;
  }
}