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

@SuppressWarnings("all") public class add_local_var_0_2 extends Strategy 
{ 
  public static add_local_var_0_2 instance = new add_local_var_0_2();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm z_18, IStrategoTerm a_19)
  { 
    context.push("add_local_var_0_2");
    Fail25:
    { 
      TermReference b_19 = new TermReference();
      IStrategoTerm c_19 = null;
      lifted29 lifted290 = new lifted29();
      lifted28 lifted280 = new lifted28();
      lifted290.b_19 = b_19;
      lifted280.b_19 = b_19;
      term = or_2_0.instance.invoke(context, term, lifted280, lifted290);
      if(term == null)
        break Fail25;
      c_19 = term;
      term = hashtable_remove_0_1.instance.invoke(context, z_18, b_19.value);
      if(term == null)
        break Fail25;
      term = hashtable_put_0_2.instance.invoke(context, z_18, b_19.value, a_19);
      if(term == null)
        break Fail25;
      term = c_19;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}