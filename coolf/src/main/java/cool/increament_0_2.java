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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm c_43, IStrategoTerm d_43)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("increament_0_2");
    Fail220:
    { 
      IStrategoTerm e_43 = null;
      Success189:
      { 
        Fail221:
        { 
          IStrategoTerm f_43 = null;
          f_43 = term;
          term = hashtable_keys_0_0.instance.invoke(context, d_43);
          if(term == null)
            break Fail221;
          term = termFactory.makeTuple(c_43, term);
          term = elem_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail221;
          term = f_43;
          { 
            IStrategoTerm j_43 = null;
            term = hashtable_get_0_1.instance.invoke(context, d_43, c_43);
            if(term == null)
              break Fail220;
            e_43 = term;
            term = hashtable_remove_0_1.instance.invoke(context, d_43, c_43);
            if(term == null)
              break Fail220;
            j_43 = d_43;
            term = termFactory.makeTuple(cool.const83, e_43);
            term = add_0_0.instance.invoke(context, term);
            if(term == null)
              break Fail220;
            term = hashtable_put_0_2.instance.invoke(context, j_43, c_43, term);
            if(term == null)
              break Fail220;
            if(true)
              break Success189;
          }
        }
        IStrategoTerm l_43 = null;
        l_43 = d_43;
        term = hashtable_put_0_2.instance.invoke(context, l_43, c_43, cool.const83);
        if(term == null)
          break Fail220;
      }
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}