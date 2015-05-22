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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy j_31, Strategy k_31)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("allow_extends_helper_2_0");
    Fail82:
    { 
      IStrategoTerm f_31 = null;
      IStrategoTerm g_31 = null;
      g_31 = term;
      Success41:
      { 
        Fail83:
        { 
          IStrategoTerm h_31 = null;
          h_31 = term;
          term = j_31.invoke(context, g_31);
          if(term == null)
            break Fail83;
          f_31 = term;
          term = h_31;
          { 
            Success42:
            { 
              Fail84:
              { 
                IStrategoTerm i_31 = null;
                i_31 = term;
                term = is_list_0_0.instance.invoke(context, f_31);
                if(term == null)
                  break Fail84;
                term = i_31;
                { 
                  term = f_31;
                  if(true)
                    break Success42;
                }
              }
              term = (IStrategoTerm)termFactory.makeListCons(f_31, (IStrategoList)ejp.constNil0);
            }
            if(true)
              break Success41;
          }
        }
        term = k_31.invoke(context, g_31);
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