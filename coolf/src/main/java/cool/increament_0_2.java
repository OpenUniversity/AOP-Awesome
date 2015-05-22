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

@SuppressWarnings("all") public class increament_0_2 extends Strategy 
{ 
  public static increament_0_2 instance = new increament_0_2();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm d_27, IStrategoTerm e_27)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("increament_0_2");
    Fail106:
    { 
      IStrategoTerm f_27 = null;
      Success86:
      { 
        Fail107:
        { 
          IStrategoTerm g_27 = null;
          g_27 = term;
          term = hashtable_keys_0_0.instance.invoke(context, e_27);
          if(term == null)
            break Fail107;
          term = termFactory.makeTuple(d_27, term);
          term = elem_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail107;
          term = g_27;
          { 
            IStrategoTerm k_27 = null;
            term = hashtable_get_0_1.instance.invoke(context, e_27, d_27);
            if(term == null)
              break Fail106;
            f_27 = term;
            term = hashtable_remove_0_1.instance.invoke(context, e_27, d_27);
            if(term == null)
              break Fail106;
            k_27 = e_27;
            term = termFactory.makeTuple(cool.const16, f_27);
            term = add_0_0.instance.invoke(context, term);
            if(term == null)
              break Fail106;
            term = hashtable_put_0_2.instance.invoke(context, k_27, d_27, term);
            if(term == null)
              break Fail106;
            if(true)
              break Success86;
          }
        }
        IStrategoTerm m_27 = null;
        m_27 = e_27;
        term = hashtable_put_0_2.instance.invoke(context, m_27, d_27, cool.const16);
        if(term == null)
          break Fail106;
      }
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}