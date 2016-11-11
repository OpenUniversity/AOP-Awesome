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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm m_43, IStrategoTerm n_43)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("decreament_0_2");
    Fail222:
    { 
      IStrategoTerm o_43 = null;
      IStrategoTerm p_43 = null;
      p_43 = term;
      IStrategoTerm term235 = term;
      Success190:
      { 
        Fail223:
        { 
          IStrategoTerm q_43 = null;
          q_43 = term;
          term = hashtable_keys_0_0.instance.invoke(context, m_43);
          if(term == null)
            break Fail223;
          term = termFactory.makeTuple(p_43, term);
          term = elem_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail223;
          term = q_43;
          { 
            IStrategoTerm x_43 = null;
            term = hashtable_get_0_1.instance.invoke(context, m_43, p_43);
            if(term == null)
              break Fail222;
            o_43 = term;
            term = hashtable_remove_0_1.instance.invoke(context, m_43, p_43);
            if(term == null)
              break Fail222;
            x_43 = m_43;
            term = hashtable_get_0_1.instance.invoke(context, n_43, p_43);
            if(term == null)
              break Fail222;
            term = termFactory.makeTuple(o_43, term);
            term = subti_0_0.instance.invoke(context, term);
            if(term == null)
              break Fail222;
            term = hashtable_put_0_2.instance.invoke(context, x_43, p_43, term);
            if(term == null)
              break Fail222;
            IStrategoTerm term236 = term;
            Success191:
            { 
              Fail224:
              { 
                IStrategoTerm r_43 = null;
                r_43 = term;
                term = hashtable_get_0_1.instance.invoke(context, m_43, p_43);
                if(term == null)
                  break Fail224;
                term = termFactory.makeTuple(term, cool.const85);
                term = equal_0_0.instance.invoke(context, term);
                if(term == null)
                  break Fail224;
                term = r_43;
                { 
                  term = hashtable_remove_0_1.instance.invoke(context, m_43, p_43);
                  if(term == null)
                    break Fail222;
                  if(true)
                    break Success191;
                }
              }
              term = term236;
            }
            if(true)
              break Success190;
          }
        }
        term = term235;
      }
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}