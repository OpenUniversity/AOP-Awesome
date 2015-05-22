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

@SuppressWarnings("all") public class decreament_0_2 extends Strategy 
{ 
  public static decreament_0_2 instance = new decreament_0_2();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm n_27, IStrategoTerm o_27)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("decreament_0_2");
    Fail108:
    { 
      IStrategoTerm p_27 = null;
      IStrategoTerm q_27 = null;
      q_27 = term;
      IStrategoTerm term129 = term;
      Success87:
      { 
        Fail109:
        { 
          IStrategoTerm r_27 = null;
          r_27 = term;
          term = hashtable_keys_0_0.instance.invoke(context, n_27);
          if(term == null)
            break Fail109;
          term = termFactory.makeTuple(q_27, term);
          term = elem_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail109;
          term = r_27;
          { 
            IStrategoTerm y_27 = null;
            term = hashtable_get_0_1.instance.invoke(context, n_27, q_27);
            if(term == null)
              break Fail108;
            p_27 = term;
            term = hashtable_remove_0_1.instance.invoke(context, n_27, q_27);
            if(term == null)
              break Fail108;
            y_27 = n_27;
            term = hashtable_get_0_1.instance.invoke(context, o_27, q_27);
            if(term == null)
              break Fail108;
            term = termFactory.makeTuple(p_27, term);
            term = subti_0_0.instance.invoke(context, term);
            if(term == null)
              break Fail108;
            term = hashtable_put_0_2.instance.invoke(context, y_27, q_27, term);
            if(term == null)
              break Fail108;
            IStrategoTerm term130 = term;
            Success88:
            { 
              Fail110:
              { 
                IStrategoTerm s_27 = null;
                s_27 = term;
                term = hashtable_get_0_1.instance.invoke(context, n_27, q_27);
                if(term == null)
                  break Fail110;
                term = termFactory.makeTuple(term, cool.const18);
                term = equal_0_0.instance.invoke(context, term);
                if(term == null)
                  break Fail110;
                term = s_27;
                { 
                  term = hashtable_remove_0_1.instance.invoke(context, n_27, q_27);
                  if(term == null)
                    break Fail108;
                  if(true)
                    break Success88;
                }
              }
              term = term130;
            }
            if(true)
              break Success87;
          }
        }
        term = term129;
      }
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}