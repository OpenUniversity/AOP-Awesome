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

@SuppressWarnings("all") final class lifted9 extends Strategy 
{ 
  TermReference b_26;

  TermReference n_26;

  TermReference c_26;

  TermReference h_26;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail507:
    { 
      term = add__params_0_4.instance.invoke(context, term, b_26.value, n_26.value, c_26.value, h_26.value);
      if(term == null)
        break Fail507;
      if(true)
        return term;
    }
    return null;
  }
}