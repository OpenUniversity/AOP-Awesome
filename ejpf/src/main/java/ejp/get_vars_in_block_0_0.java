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
      IStrategoTerm w_24 = null;
      TermReference x_24 = new TermReference();
      w_24 = term;
      term = new_iset_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail40;
      if(x_24.value == null)
        x_24.value = term;
      else
        if(x_24.value != term && !x_24.value.match(term))
          break Fail40;
      term = w_24;
      lifted47 lifted470 = new lifted47();
      lifted470.x_24 = x_24;
      term = topdown_1_0.instance.invoke(context, term, lifted470);
      if(term == null)
        break Fail40;
      if(x_24.value == null)
        break Fail40;
      term = x_24.value;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}