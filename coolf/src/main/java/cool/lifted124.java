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

@SuppressWarnings("all") final class lifted124 extends Strategy 
{ 
  TermReference c_43;

  TermReference o_42;

  TermReference f_43;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail241:
    { 
      term = make_requires_method_0_3.instance.invoke(context, term, c_43.value, o_42.value, f_43.value);
      if(term == null)
        break Fail241;
      if(true)
        return term;
    }
    return null;
  }
}