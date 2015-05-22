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

@SuppressWarnings("all") public class process_method_param_0_1 extends Strategy 
{ 
  public static process_method_param_0_1 instance = new process_method_param_0_1();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm l_19)
  { 
    context.push("process_method_param_0_1");
    Fail26:
    { 
      TermReference m_19 = new TermReference();
      TermReference n_19 = new TermReference();
      IStrategoTerm o_19 = null;
      IStrategoTerm r_19 = null;
      IStrategoTerm t_19 = null;
      IStrategoTerm u_19 = null;
      lifted31 lifted311 = new lifted31();
      lifted30 lifted300 = new lifted30();
      lifted311.n_19 = n_19;
      lifted311.m_19 = m_19;
      lifted300.n_19 = n_19;
      lifted300.m_19 = m_19;
      term = or_2_0.instance.invoke(context, term, lifted300, lifted311);
      if(term == null)
        break Fail26;
      o_19 = term;
      term = l_19;
      t_19 = l_19;
      if(m_19.value == null)
        break Fail26;
      term = strip_annos_0_0.instance.invoke(context, m_19.value);
      if(term == null)
        break Fail26;
      r_19 = term;
      term = t_19;
      u_19 = t_19;
      if(n_19.value == null)
        break Fail26;
      term = strip_annos_0_0.instance.invoke(context, n_19.value);
      if(term == null)
        break Fail26;
      term = hashtable_put_0_2.instance.invoke(context, u_19, r_19, term);
      if(term == null)
        break Fail26;
      term = o_19;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}