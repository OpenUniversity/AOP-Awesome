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

@SuppressWarnings("all") final class lifted122 extends Strategy 
{ 
  TermReference c_43;

  TermReference d_43;

  TermReference e_43;

  TermReference f_43;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail253:
    { 
      term = fill$Method$Maps_0_4.instance.invoke(context, term, c_43.value, d_43.value, e_43.value, f_43.value);
      if(term == null)
        break Fail253;
      if(true)
        return term;
    }
    return null;
  }
}