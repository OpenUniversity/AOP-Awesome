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

@SuppressWarnings("all") final class lifted126 extends Strategy 
{ 
  TermReference f_44;

  TermReference p_43;

  TermReference r_43;

  TermReference h_44;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail241:
    { 
      term = make_on_exit_method_0_4.instance.invoke(context, term, f_44.value, p_43.value, r_43.value, h_44.value);
      if(term == null)
        break Fail241;
      if(true)
        return term;
    }
    return null;
  }
}