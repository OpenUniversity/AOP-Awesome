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

@SuppressWarnings("all") final class lifted19 extends Strategy 
{ 
  TermReference o_23;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail177:
    { 
      term = replace_proceed_calls_0_1.instance.invoke(context, term, o_23.value);
      if(term == null)
        break Fail177;
      if(true)
        return term;
    }
    return null;
  }
}