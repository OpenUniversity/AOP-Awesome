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
    Fail230:
    { 
      IStrategoTerm term209 = term;
      IStrategoConstructor cons8 = term.getTermType() == IStrategoTerm.APPL ? ((IStrategoAppl)term).getConstructor() : null;
      Success167:
      { 
        if(cons8 == transform._consSelfex_1)
        { 
          Fail231:
          { 
            IStrategoTerm o_52 = null;
            o_52 = term.getSubterm(0);
            term = o_52;
            if(true)
              break Success167;
          }
          term = term209;
        }
        Success168:
        { 
          if(cons8 == transform._consMutex_1)
          { 
            Fail232:
            { 
              IStrategoTerm n_52 = null;
              n_52 = term.getSubterm(0);
              term = n_52;
              if(true)
                break Success168;
            }
            term = term209;
          }
          if(cons8 == transform._consNone_0)
          { 
            term = cool.constNil0;
          }
          else
          { 
            break Fail230;
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