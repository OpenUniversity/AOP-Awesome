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

@SuppressWarnings("all") final class lifted103 extends Strategy 
{ 
  TermReference e_49;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail366:
    { 
      lifted105 lifted1050 = new lifted105();
      lifted104 lifted1040 = new lifted104();
      lifted1050.e_49 = e_49;
      lifted1040.e_49 = e_49;
      term = or_2_0.instance.invoke(context, term, lifted1040, lifted1050);
      if(term == null)
        break Fail366;
      if(true)
        return term;
    }
    return null;
  }
}