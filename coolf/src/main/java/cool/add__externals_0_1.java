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

@SuppressWarnings("all") public class add__externals_0_1 extends Strategy 
{ 
  public static add__externals_0_1 instance = new add__externals_0_1();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm p_8)
  { 
    context.push("add__externals_0_1");
    Fail18:
    { 
      IStrategoTerm q_8 = null;
      TermReference t_8 = new TermReference();
      q_8 = term;
      term = new_iset_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail18;
      if(t_8.value == null)
        t_8.value = term;
      else
        if(t_8.value != term && !t_8.value.match(term))
          break Fail18;
      term = add_external_impl_0_2.instance.invoke(context, q_8, t_8.value, p_8);
      if(term == null)
        break Fail18;
      lifted0 lifted00 = new lifted0();
      lifted00.t_8 = t_8;
      term = topdown_1_0.instance.invoke(context, term, lifted00);
      if(term == null)
        break Fail18;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}