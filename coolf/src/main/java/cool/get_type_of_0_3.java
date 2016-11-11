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

@SuppressWarnings("all") public class get_type_of_0_3 extends Strategy 
{ 
  public static get_type_of_0_3 instance = new get_type_of_0_3();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm n_41, IStrategoTerm o_41, IStrategoTerm p_41)
  { 
    context.push("get_type_of_0_3");
    Fail210:
    { 
      IStrategoTerm q_41 = null;
      IStrategoTerm term228 = term;
      Success183:
      { 
        Fail211:
        { 
          IStrategoTerm r_41 = null;
          r_41 = term;
          IStrategoTerm term229 = term;
          Success184:
          { 
            Fail212:
            { 
              term = type_of_0_3.instance.invoke(context, term, n_41, o_41, p_41);
              if(term == null)
                break Fail212;
              q_41 = term;
              { 
                if(true)
                  break Fail211;
                if(true)
                  break Success184;
              }
            }
            term = term229;
          }
          term = r_41;
          { 
            term = cool.constNone0;
            if(q_41 == null)
              q_41 = term;
            else
              if(q_41 != term && !q_41.match(term))
                break Fail210;
            if(true)
              break Success183;
          }
        }
        term = term228;
      }
      if(q_41 == null)
        break Fail210;
      term = q_41;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}