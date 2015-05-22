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

@SuppressWarnings("all") final class lifted21 extends Strategy 
{ 
  TermReference n_77;

  TermReference v_18;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail325:
    { 
      term = add_local_var_0_2.instance.invoke(context, term, n_77.value, v_18.value);
      if(term == null)
        break Fail325;
      if(true)
        return term;
    }
    return null;
  }
}