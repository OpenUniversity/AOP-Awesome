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

@SuppressWarnings("all") final class lifted45 extends Strategy 
{ 
  TermReference e_23;

  TermReference v_23;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail302:
    { 
      term = handle_pointcutargs_0_2.instance.invoke(context, term, e_23.value, v_23.value);
      if(term == null)
        break Fail302;
      if(true)
        return term;
    }
    return null;
  }
}