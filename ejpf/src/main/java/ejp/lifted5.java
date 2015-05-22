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

@SuppressWarnings("all") final class lifted5 extends Strategy 
{ 
  TermReference c_77;

  TermReference o_16;

  TermReference e_77;

  TermReference f_77;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail341:
    { 
      IStrategoTerm f_17 = null;
      f_17 = term;
      if(c_77.value == null)
        break Fail341;
      term = hashtable_copy_0_0.instance.invoke(context, c_77.value);
      if(term == null)
        break Fail341;
      term = ejp_to_java_0_4.instance.invoke(context, f_17, term, o_16.value, e_77.value, f_77.value);
      if(term == null)
        break Fail341;
      if(true)
        return term;
    }
    return null;
  }
}