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

@SuppressWarnings("all") public class add_key_to_multiple_values_table_0_2 extends Strategy 
{ 
  public static add_key_to_multiple_values_table_0_2 instance = new add_key_to_multiple_values_table_0_2();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm k_30, IStrategoTerm l_30)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("add_key_to_multiple_values_table_0_2");
    Fail78:
    { 
      IStrategoTerm m_30 = null;
      m_30 = term;
      Success40:
      { 
        Fail79:
        { 
          IStrategoTerm n_30 = null;
          n_30 = term;
          term = hashtable_keys_0_0.instance.invoke(context, m_30);
          if(term == null)
            break Fail79;
          term = termFactory.makeTuple(k_30, term);
          term = elem_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail79;
          term = n_30;
          { 
            IStrategoTerm t_30 = null;
            t_30 = m_30;
            term = hashtable_get_0_1.instance.invoke(context, m_30, k_30);
            if(term == null)
              break Fail78;
            term = termFactory.makeTuple(term, (IStrategoTerm)termFactory.makeListCons(l_30, (IStrategoList)ejp.constNil0));
            term = conc_0_0.instance.invoke(context, term);
            if(term == null)
              break Fail78;
            term = hashtable_put_0_2.instance.invoke(context, t_30, k_30, term);
            if(term == null)
              break Fail78;
            if(true)
              break Success40;
          }
        }
        IStrategoTerm x_30 = null;
        x_30 = m_30;
        term = (IStrategoTerm)termFactory.makeListCons(l_30, (IStrategoList)ejp.constNil0);
        term = hashtable_put_0_2.instance.invoke(context, x_30, k_30, term);
        if(term == null)
          break Fail78;
      }
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}