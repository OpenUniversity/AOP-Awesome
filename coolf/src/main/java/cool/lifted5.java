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

@SuppressWarnings("all") final class lifted5 extends Strategy 
{ 
  TermReference c_10;

  TermReference o_10;

  TermReference d_10;

  TermReference i_10;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail403:
    { 
      term = add__params_0_4.instance.invoke(context, term, c_10.value, o_10.value, d_10.value, i_10.value);
      if(term == null)
        break Fail403;
      if(true)
        return term;
    }
    return null;
  }
}