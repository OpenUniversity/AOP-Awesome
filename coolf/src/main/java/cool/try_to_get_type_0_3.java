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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm z_37, IStrategoTerm a_38, IStrategoTerm b_38)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("try_to_get_type_0_3");
    Fail154:
    { 
      IStrategoTerm c_38 = null;
      IStrategoTerm d_38 = null;
      IStrategoTerm e_38 = null;
      IStrategoTerm f_38 = null;
      if(term.getTermType() != IStrategoTerm.TUPLE || term.getSubtermCount() != 2)
        break Fail154;
      c_38 = term.getSubterm(0);
      e_38 = term.getSubterm(1);
      term = get_type_of_0_3.instance.invoke(context, c_38, z_37, a_38, b_38);
      if(term == null)
        break Fail154;
      d_38 = term;
      Success135:
      { 
        Fail155:
        { 
          IStrategoTerm g_38 = null;
          g_38 = term;
          IStrategoTerm term181 = term;
          Success136:
          { 
            Fail156:
            { 
              term = termFactory.makeTuple(d_38, cool.constNone0);
              term = equal_0_0.instance.invoke(context, term);
              if(term == null)
                break Fail156;
              { 
                if(true)
                  break Fail155;
                if(true)
                  break Success136;
              }
            }
            term = term181;
          }
          term = g_38;
          { 
            term = d_38;
            if(true)
              break Success135;
          }
        }
        term = get_type_of_0_3.instance.invoke(context, e_38, z_37, a_38, b_38);
        if(term == null)
          break Fail154;
        f_38 = term;
        Success137:
        { 
          Fail157:
          { 
            IStrategoTerm h_38 = null;
            h_38 = term;
            IStrategoTerm term183 = term;
            Success138:
            { 
              Fail158:
              { 
                term = termFactory.makeTuple(f_38, cool.constNone0);
                term = equal_0_0.instance.invoke(context, term);
                if(term == null)
                  break Fail158;
                { 
                  if(true)
                    break Fail157;
                  if(true)
                    break Success138;
                }
              }
              term = term183;
            }
            term = h_38;
            { 
              term = f_38;
              if(true)
                break Success137;
            }
          }
          term = debug_0_0.instance.invoke(context, cool.const79);
          if(term == null)
            break Fail154;
          term = cool.const77;
          if(true)
            break Fail154;
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