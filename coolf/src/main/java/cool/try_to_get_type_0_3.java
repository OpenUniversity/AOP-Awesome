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

@SuppressWarnings("all") public class try_to_get_type_0_3 extends Strategy 
{ 
  public static try_to_get_type_0_3 instance = new try_to_get_type_0_3();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm a_22, IStrategoTerm b_22, IStrategoTerm c_22)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("try_to_get_type_0_3");
    Fail40:
    { 
      IStrategoTerm d_22 = null;
      IStrategoTerm e_22 = null;
      IStrategoTerm f_22 = null;
      IStrategoTerm g_22 = null;
      if(term.getTermType() != IStrategoTerm.TUPLE || term.getSubtermCount() != 2)
        break Fail40;
      d_22 = term.getSubterm(0);
      f_22 = term.getSubterm(1);
      term = get_type_of_0_3.instance.invoke(context, d_22, a_22, b_22, c_22);
      if(term == null)
        break Fail40;
      e_22 = term;
      Success32:
      { 
        Fail41:
        { 
          IStrategoTerm h_22 = null;
          h_22 = term;
          IStrategoTerm term75 = term;
          Success33:
          { 
            Fail42:
            { 
              term = termFactory.makeTuple(e_22, cool.constNone0);
              term = equal_0_0.instance.invoke(context, term);
              if(term == null)
                break Fail42;
              { 
                if(true)
                  break Fail41;
                if(true)
                  break Success33;
              }
            }
            term = term75;
          }
          term = h_22;
          { 
            term = e_22;
            if(true)
              break Success32;
          }
        }
        term = get_type_of_0_3.instance.invoke(context, f_22, a_22, b_22, c_22);
        if(term == null)
          break Fail40;
        g_22 = term;
        Success34:
        { 
          Fail43:
          { 
            IStrategoTerm i_22 = null;
            i_22 = term;
            IStrategoTerm term77 = term;
            Success35:
            { 
              Fail44:
              { 
                term = termFactory.makeTuple(g_22, cool.constNone0);
                term = equal_0_0.instance.invoke(context, term);
                if(term == null)
                  break Fail44;
                { 
                  if(true)
                    break Fail43;
                  if(true)
                    break Success35;
                }
              }
              term = term77;
            }
            term = i_22;
            { 
              term = g_22;
              if(true)
                break Success34;
            }
          }
          term = debug_0_0.instance.invoke(context, cool.const11);
          if(term == null)
            break Fail40;
          term = cool.const9;
          if(true)
            break Fail40;
        }
      }
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}