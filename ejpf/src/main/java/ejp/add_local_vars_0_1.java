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

@SuppressWarnings("all") public class add_local_vars_0_1 extends Strategy 
{ 
  public static add_local_vars_0_1 instance = new add_local_vars_0_1();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm ref_n_77)
  { 
    TermReference n_77 = new TermReference(ref_n_77);
    context.push("add_local_vars_0_1");
    Fail23:
    { 
      IStrategoTerm term18 = term;
      Success18:
      { 
        Fail24:
        { 
          IStrategoTerm u_18 = null;
          TermReference v_18 = new TermReference();
          IStrategoTerm w_18 = null;
          if(term.getTermType() != IStrategoTerm.APPL || transform._consLocalVarDecStm_1 != ((IStrategoAppl)term).getConstructor())
            break Fail24;
          IStrategoTerm arg31 = term.getSubterm(0);
          if(arg31.getTermType() != IStrategoTerm.APPL || transform._consLocalVarDec_3 != ((IStrategoAppl)arg31).getConstructor())
            break Fail24;
          if(v_18.value == null)
            v_18.value = arg31.getSubterm(1);
          else
            if(v_18.value != arg31.getSubterm(1) && !v_18.value.match(arg31.getSubterm(1)))
              break Fail24;
          u_18 = arg31.getSubterm(2);
          w_18 = term;
          term = u_18;
          lifted20 lifted200 = new lifted20();
          lifted200.n_77 = n_77;
          lifted200.v_18 = v_18;
          term = SRTS_all.instance.invoke(context, term, lifted200);
          if(term == null)
            break Fail24;
          term = w_18;
          if(true)
            break Success18;
        }
        term = term18;
        TermReference p_18 = new TermReference();
        IStrategoTerm q_18 = null;
        lifted25 lifted250 = new lifted25();
        lifted22 lifted220 = new lifted22();
        lifted250.p_18 = p_18;
        lifted220.p_18 = p_18;
        term = or_2_0.instance.invoke(context, term, lifted220, lifted250);
        if(term == null)
          break Fail23;
        q_18 = term;
        if(p_18.value == null)
          break Fail23;
        term = p_18.value;
        lifted26 lifted260 = new lifted26();
        lifted260.n_77 = n_77;
        term = SRTS_all.instance.invoke(context, term, lifted260);
        if(term == null)
          break Fail23;
        term = q_18;
      }
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}