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
  TermReference f_72;

  TermReference a_58;

  TermReference j_72;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail348:
    { 
      term = make_requires_method_0_3.instance.invoke(context, term, f_72.value, a_58.value, j_72.value);
      if(term == null)
        break Fail348;
      if(true)
        return term;
    }
    return null;
  }
}