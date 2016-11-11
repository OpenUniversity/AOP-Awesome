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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm n_37, IStrategoTerm o_37, IStrategoTerm p_37, IStrategoTerm q_37)
  { 
    context.push("add__params_0_4");
    Fail152:
    { 
      TermReference r_37 = new TermReference();
      lifted61 lifted611 = new lifted61();
      lifted60 lifted600 = new lifted60();
      lifted611.r_37 = r_37;
      lifted600.r_37 = r_37;
      term = or_2_0.instance.invoke(context, term, lifted600, lifted611);
      if(term == null)
        break Fail152;
      term = add__var_0_5.instance.invoke(context, term, r_37.value, n_37, o_37, p_37, q_37);
      if(term == null)
        break Fail152;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}