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
    Fail224:
    { 
      IStrategoTerm term210 = term;
      IStrategoConstructor cons8 = term.getTermType() == IStrategoTerm.APPL ? ((IStrategoAppl)term).getConstructor() : null;
      Success168:
      { 
        if(cons8 == transform._consSelfex_1)
        { 
          Fail225:
          { 
            IStrategoTerm u_51 = null;
            u_51 = term.getSubterm(0);
            term = u_51;
            if(true)
              break Success168;
          }
          term = term210;
        }
        Success169:
        { 
          if(cons8 == transform._consMutex_1)
          { 
            Fail226:
            { 
              IStrategoTerm t_51 = null;
              t_51 = term.getSubterm(0);
              term = t_51;
              if(true)
                break Success169;
            }
            term = term210;
          }
          if(cons8 == transform._consNone_0)
          { 
            term = cool.constNil0;
          }
          else
          { 
            break Fail224;
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