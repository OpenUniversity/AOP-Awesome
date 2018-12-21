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

@SuppressWarnings("all") public class add__params_0_4 extends Strategy 
{ 
  public static add__params_0_4 instance = new add__params_0_4();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm o_21, IStrategoTerm p_21, IStrategoTerm q_21, IStrategoTerm r_21)
  { 
    context.push("add__params_0_4");
    Fail38:
    { 
      TermReference s_21 = new TermReference();
      lifted57 lifted570 = new lifted57();
      lifted56 lifted560 = new lifted56();
      lifted570.s_21 = s_21;
      lifted560.s_21 = s_21;
      term = or_2_0.instance.invoke(context, term, lifted560, lifted570);
      if(term == null)
        break Fail38;
      term = add__var_0_5.instance.invoke(context, term, s_21.value, o_21, p_21, q_21, r_21);
      if(term == null)
        break Fail38;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}