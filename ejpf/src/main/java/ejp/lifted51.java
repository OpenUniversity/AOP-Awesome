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

@SuppressWarnings("all") final class lifted51 extends Strategy 
{ 
  TermReference t_25;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail295:
    { 
      term = handle_pointcutarg_helper_0_1.instance.invoke(context, term, t_25.value);
      if(term == null)
        break Fail295;
      if(true)
        return term;
    }
    return null;
  }
}