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

@SuppressWarnings("all") public class allow_extends_helper_2_0 extends Strategy 
{ 
  public static allow_extends_helper_2_0 instance = new allow_extends_helper_2_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy t_31, Strategy u_31)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("allow_extends_helper_2_0");
    Fail82:
    { 
      IStrategoTerm p_31 = null;
      IStrategoTerm q_31 = null;
      q_31 = term;
      Success41:
      { 
        Fail83:
        { 
          IStrategoTerm r_31 = null;
          r_31 = term;
          term = t_31.invoke(context, q_31);
          if(term == null)
            break Fail83;
          p_31 = term;
          term = r_31;
          { 
            Success42:
            { 
              Fail84:
              { 
                IStrategoTerm s_31 = null;
                s_31 = term;
                term = is_list_0_0.instance.invoke(context, p_31);
                if(term == null)
                  break Fail84;
                term = s_31;
                { 
                  term = p_31;
                  if(true)
                    break Success42;
                }
              }
              term = (IStrategoTerm)termFactory.makeListCons(p_31, (IStrategoList)ejp.constNil0);
            }
            if(true)
              break Success41;
          }
        }
        term = u_31.invoke(context, q_31);
        if(term == null)
          break Fail82;
        term = (IStrategoTerm)termFactory.makeListCons(term, (IStrategoList)ejp.constNil0);
      }
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}