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
  TermReference m_44;

  TermReference v_43;

  TermReference y_43;

  TermReference n_44;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail243:
    { 
      term = make_on_entry_method_0_4.instance.invoke(context, term, m_44.value, v_43.value, y_43.value, n_44.value);
      if(term == null)
        break Fail243;
      if(true)
        return term;
    }
    return null;
  }
}