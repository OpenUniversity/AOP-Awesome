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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm u_30, IStrategoTerm v_30)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("add_key_to_multiple_values_table_0_2");
    Fail78:
    { 
      IStrategoTerm w_30 = null;
      w_30 = term;
      Success40:
      { 
        Fail79:
        { 
          IStrategoTerm x_30 = null;
          x_30 = term;
          term = hashtable_keys_0_0.instance.invoke(context, w_30);
          if(term == null)
            break Fail79;
          term = termFactory.makeTuple(u_30, term);
          term = elem_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail79;
          term = x_30;
          { 
            IStrategoTerm d_31 = null;
            d_31 = w_30;
            term = hashtable_get_0_1.instance.invoke(context, w_30, u_30);
            if(term == null)
              break Fail78;
            term = termFactory.makeTuple(term, (IStrategoTerm)termFactory.makeListCons(v_30, (IStrategoList)ejp.constNil0));
            term = conc_0_0.instance.invoke(context, term);
            if(term == null)
              break Fail78;
            term = hashtable_put_0_2.instance.invoke(context, d_31, u_30, term);
            if(term == null)
              break Fail78;
            if(true)
              break Success40;
          }
        }
        IStrategoTerm h_31 = null;
        h_31 = w_30;
        term = (IStrategoTerm)termFactory.makeListCons(v_30, (IStrategoList)ejp.constNil0);
        term = hashtable_put_0_2.instance.invoke(context, h_31, u_30, term);
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