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

@SuppressWarnings("all") final class lifted125 extends Strategy 
{ 
  TermReference e_43;

  TermReference n_42;

  TermReference q_42;

  TermReference f_43;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail240:
    { 
      term = make_on_entry_method_0_4.instance.invoke(context, term, e_43.value, n_42.value, q_42.value, f_43.value);
      if(term == null)
        break Fail240;
      if(true)
        return term;
    }
    return null;
  }
}