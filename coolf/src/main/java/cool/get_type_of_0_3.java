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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm o_25, IStrategoTerm p_25, IStrategoTerm q_25)
  { 
    context.push("get_type_of_0_3");
    Fail96:
    { 
      IStrategoTerm r_25 = null;
      IStrategoTerm term122 = term;
      Success80:
      { 
        Fail97:
        { 
          IStrategoTerm s_25 = null;
          s_25 = term;
          IStrategoTerm term123 = term;
          Success81:
          { 
            Fail98:
            { 
              term = type_of_0_3.instance.invoke(context, term, o_25, p_25, q_25);
              if(term == null)
                break Fail98;
              r_25 = term;
              { 
                if(true)
                  break Fail97;
                if(true)
                  break Success81;
              }
            }
            term = term123;
          }
          term = s_25;
          { 
            term = cool.constNone0;
            if(r_25 == null)
              r_25 = term;
            else
              if(r_25 != term && !r_25.match(term))
                break Fail96;
            if(true)
              break Success80;
          }
        }
        term = term122;
      }
      if(r_25 == null)
        break Fail96;
      term = r_25;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}