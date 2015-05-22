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

@SuppressWarnings("all") final class lifted52 extends Strategy 
{ 
  TermReference s_25;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail296:
    { 
      IStrategoTerm v_25 = null;
      v_25 = term;
      if(s_25.value == null)
        break Fail296;
      term = iset_add_0_1.instance.invoke(context, s_25.value, v_25);
      if(term == null)
        break Fail296;
      if(true)
        return term;
    }
    return null;
  }
}