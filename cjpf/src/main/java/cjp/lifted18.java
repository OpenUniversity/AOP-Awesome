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

@SuppressWarnings("all") final class lifted18 extends Strategy 
{ 
  TermReference o_23;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail176:
    { 
      lifted19 lifted190 = new lifted19();
      lifted190.o_23 = o_23;
      term = try_1_0.instance.invoke(context, term, lifted190);
      if(term == null)
        break Fail176;
      if(true)
        return term;
    }
    return null;
  }
}