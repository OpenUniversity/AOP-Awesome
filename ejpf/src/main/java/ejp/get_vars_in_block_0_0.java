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

@SuppressWarnings("all") public class get_vars_in_block_0_0 extends Strategy 
{ 
  public static get_vars_in_block_0_0 instance = new get_vars_in_block_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    context.push("get_vars_in_block_0_0");
    Fail40:
    { 
      IStrategoTerm g_25 = null;
      TermReference h_25 = new TermReference();
      g_25 = term;
      term = new_iset_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail40;
      if(h_25.value == null)
        h_25.value = term;
      else
        if(h_25.value != term && !h_25.value.match(term))
          break Fail40;
      term = g_25;
      lifted47 lifted470 = new lifted47();
      lifted470.h_25 = h_25;
      term = topdown_1_0.instance.invoke(context, term, lifted470);
      if(term == null)
        break Fail40;
      if(h_25.value == null)
        break Fail40;
      term = h_25.value;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}