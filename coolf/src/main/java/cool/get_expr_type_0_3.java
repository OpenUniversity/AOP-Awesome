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

@SuppressWarnings("all") public class get_expr_type_0_3 extends Strategy 
{ 
  public static get_expr_type_0_3 instance = new get_expr_type_0_3();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm s_28, IStrategoTerm t_28, IStrategoTerm u_28)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("get_expr_type_0_3");
    Fail119:
    { 
      Success96:
      { 
        Fail120:
        { 
          IStrategoTerm v_28 = null;
          v_28 = term;
          term = hashtable_keys_0_0.instance.invoke(context, t_28);
          if(term == null)
            break Fail120;
          term = termFactory.makeTuple(s_28, term);
          term = elem_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail120;
          term = v_28;
          { 
            term = hashtable_get_0_1.instance.invoke(context, u_28, s_28);
            if(term == null)
              break Fail119;
            if(true)
              break Success96;
          }
        }
        term = cool.constNone0;
      }
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}