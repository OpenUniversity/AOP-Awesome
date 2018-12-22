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

@SuppressWarnings("all") final class lifted4 extends Strategy 
{ 
  TermReference c_10;

  TermReference o_10;

  TermReference d_10;

  TermReference i_10;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail400:
    { 
      lifted5 lifted510 = new lifted5();
      lifted510.c_10 = c_10;
      lifted510.o_10 = o_10;
      lifted510.d_10 = d_10;
      lifted510.i_10 = i_10;
      term = try_1_0.instance.invoke(context, term, lifted510);
      if(term == null)
        break Fail400;
      if(true)
        return term;
    }
    return null;
  }
}