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

@SuppressWarnings("all") public class my_hashtable_remove_0_1 extends Strategy 
{ 
  public static my_hashtable_remove_0_1 instance = new my_hashtable_remove_0_1();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm t_29)
  { 
    context.push("my_hashtable_remove_0_1");
    Fail75:
    { 
      TermReference u_29 = new TermReference();
      if(u_29.value == null)
        u_29.value = term;
      else
        if(u_29.value != term && !u_29.value.match(term))
          break Fail75;
      term = iset_elements_0_0.instance.invoke(context, t_29);
      if(term == null)
        break Fail75;
      lifted55 lifted550 = new lifted55();
      lifted550.u_29 = u_29;
      term = map_1_0.instance.invoke(context, term, lifted550);
      if(term == null)
        break Fail75;
      if(u_29.value == null)
        break Fail75;
      term = u_29.value;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}