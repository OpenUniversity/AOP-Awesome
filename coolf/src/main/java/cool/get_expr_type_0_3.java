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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm r_44, IStrategoTerm s_44, IStrategoTerm t_44)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("get_expr_type_0_3");
    Fail233:
    { 
      Success199:
      { 
        Fail234:
        { 
          IStrategoTerm u_44 = null;
          u_44 = term;
          term = hashtable_keys_0_0.instance.invoke(context, s_44);
          if(term == null)
            break Fail234;
          term = termFactory.makeTuple(r_44, term);
          term = elem_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail234;
          term = u_44;
          { 
            term = hashtable_get_0_1.instance.invoke(context, t_44, r_44);
            if(term == null)
              break Fail233;
            if(true)
              break Success199;
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