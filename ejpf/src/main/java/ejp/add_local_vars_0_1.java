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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm ref_z_77)
  { 
    TermReference z_77 = new TermReference(ref_z_77);
    context.push("add_local_vars_0_1");
    Fail23:
    { 
      IStrategoTerm term18 = term;
      Success18:
      { 
        Fail24:
        { 
          IStrategoTerm w_18 = null;
          TermReference x_18 = new TermReference();
          IStrategoTerm y_18 = null;
          if(term.getTermType() != IStrategoTerm.APPL || transform._consLocalVarDecStm_1 != ((IStrategoAppl)term).getConstructor())
            break Fail24;
          IStrategoTerm arg31 = term.getSubterm(0);
          if(arg31.getTermType() != IStrategoTerm.APPL || transform._consLocalVarDec_3 != ((IStrategoAppl)arg31).getConstructor())
            break Fail24;
          if(x_18.value == null)
            x_18.value = arg31.getSubterm(1);
          else
            if(x_18.value != arg31.getSubterm(1) && !x_18.value.match(arg31.getSubterm(1)))
              break Fail24;
          w_18 = arg31.getSubterm(2);
          y_18 = term;
          term = w_18;
          lifted20 lifted200 = new lifted20();
          lifted200.z_77 = z_77;
          lifted200.x_18 = x_18;
          term = SRTS_all.instance.invoke(context, term, lifted200);
          if(term == null)
            break Fail24;
          term = y_18;
          if(true)
            break Success18;
        }
        term = term18;
        TermReference r_18 = new TermReference();
        IStrategoTerm s_18 = null;
        lifted25 lifted250 = new lifted25();
        lifted22 lifted220 = new lifted22();
        lifted250.r_18 = r_18;
        lifted220.r_18 = r_18;
        term = or_2_0.instance.invoke(context, term, lifted220, lifted250);
        if(term == null)
          break Fail23;
        s_18 = term;
        if(r_18.value == null)
          break Fail23;
        term = r_18.value;
        lifted26 lifted260 = new lifted26();
        lifted260.z_77 = z_77;
        term = SRTS_all.instance.invoke(context, term, lifted260);
        if(term == null)
          break Fail23;
        term = s_18;
      }
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}