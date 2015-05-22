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

@SuppressWarnings("all") public class get_inner_scoped_vars_0_0 extends Strategy 
{ 
  public static get_inner_scoped_vars_0_0 instance = new get_inner_scoped_vars_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    context.push("get_inner_scoped_vars_0_0");
    Fail41:
    { 
      IStrategoTerm m_25 = null;
      TermReference n_25 = new TermReference();
      m_25 = term;
      term = new_hashtable_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail41;
      if(n_25.value == null)
        n_25.value = term;
      else
        if(n_25.value != term && !n_25.value.match(term))
          break Fail41;
      term = m_25;
      lifted49 lifted490 = new lifted49();
      lifted490.n_25 = n_25;
      term = SRTS_all.instance.invoke(context, term, lifted490);
      if(term == null)
        break Fail41;
      if(n_25.value == null)
        break Fail41;
      term = n_25.value;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}