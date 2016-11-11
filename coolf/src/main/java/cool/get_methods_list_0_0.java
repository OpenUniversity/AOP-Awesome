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

@SuppressWarnings("all") public class get_methods_list_0_0 extends Strategy 
{ 
  public static get_methods_list_0_0 instance = new get_methods_list_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail331:
    { 
      IStrategoTerm term313 = term;
      IStrategoConstructor cons14 = term.getTermType() == IStrategoTerm.APPL ? ((IStrategoAppl)term).getConstructor() : null;
      Success268:
      { 
        if(cons14 == transform._consSelfex_1)
        { 
          Fail332:
          { 
            IStrategoTerm d_81 = null;
            d_81 = term.getSubterm(0);
            term = d_81;
            if(true)
              break Success268;
          }
          term = term313;
        }
        Success269:
        { 
          if(cons14 == transform._consMutex_1)
          { 
            Fail333:
            { 
              IStrategoTerm c_81 = null;
              c_81 = term.getSubterm(0);
              term = c_81;
              if(true)
                break Success269;
            }
            term = term313;
          }
          if(cons14 == transform._consNone_0)
          { 
            term = cool.constNil0;
          }
          else
          { 
            break Fail331;
          }
        }
      }
      if(true)
        return term;
    }
    context.push("get_methods_list_0_0");
    context.popOnFailure();
    return null;
  }
}