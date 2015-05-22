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

@SuppressWarnings("all") final class lifted10 extends Strategy 
{ 
  TermReference c_77;

  TermReference d_77;

  TermReference t_15;

  TermReference f_77;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail335:
    { 
      term = ejp_to_java_0_4.instance.invoke(context, term, c_77.value, d_77.value, t_15.value, f_77.value);
      if(term == null)
        break Fail335;
      if(true)
        return term;
    }
    return null;
  }
}