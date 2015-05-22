package ejp;

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

@SuppressWarnings("all") final class lifted4 extends Strategy 
{ 
  TermReference c_77;

  TermReference o_16;

  TermReference e_77;

  TermReference f_77;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail340:
    { 
      lifted5 lifted510 = new lifted5();
      lifted510.c_77 = c_77;
      lifted510.o_16 = o_16;
      lifted510.e_77 = e_77;
      lifted510.f_77 = f_77;
      term = try_1_0.instance.invoke(context, term, lifted510);
      if(term == null)
        break Fail340;
      if(true)
        return term;
    }
    return null;
  }
}