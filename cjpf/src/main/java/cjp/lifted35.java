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

@SuppressWarnings("all") final class lifted35 extends Strategy 
{ 
  TermReference r_31;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail163:
    { 
      lifted36 lifted360 = new lifted36();
      lifted360.r_31 = r_31;
      term = try_1_0.instance.invoke(context, term, lifted360);
      if(term == null)
        break Fail163;
      if(true)
        return term;
    }
    return null;
  }
}