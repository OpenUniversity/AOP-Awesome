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
      IStrategoTerm c_25 = null;
      TermReference d_25 = new TermReference();
      c_25 = term;
      term = new_hashtable_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail41;
      if(d_25.value == null)
        d_25.value = term;
      else
        if(d_25.value != term && !d_25.value.match(term))
          break Fail41;
      term = c_25;
      lifted49 lifted490 = new lifted49();
      lifted490.d_25 = d_25;
      term = SRTS_all.instance.invoke(context, term, lifted490);
      if(term == null)
        break Fail41;
      if(d_25.value == null)
        break Fail41;
      term = d_25.value;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}