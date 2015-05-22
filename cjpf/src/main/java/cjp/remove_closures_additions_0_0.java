package cjp;

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

@SuppressWarnings("all") public class remove_closures_additions_0_0 extends Strategy 
{ 
  public static remove_closures_additions_0_0 instance = new remove_closures_additions_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail111:
    { 
      IStrategoTerm term105 = term;
      IStrategoConstructor cons7 = term.getTermType() == IStrategoTerm.APPL ? ((IStrategoAppl)term).getConstructor() : null;
      Success102:
      { 
        if(cons7 == transform._consJoinpointDeclaration_4)
        { 
          Fail112:
          { 
            term = cjp.constNone0;
            if(true)
              break Success102;
          }
          term = term105;
        }
        Success103:
        { 
          if(cons7 == transform._consShortClosureJoinpoints_2)
          { 
            Fail113:
            { 
              term = cjp.constNone0;
              if(true)
                break Success103;
            }
            term = term105;
          }
          Success104:
          { 
            if(cons7 == transform._consClosureJoinpoints_4)
            { 
              Fail114:
              { 
                term = cjp.constNone0;
                if(true)
                  break Success104;
              }
              term = term105;
            }
            if(cons7 == transform._consCJPAdvice_4)
            { 
              term = cjp.constNone0;
            }
            else
            { 
              break Fail111;
            }
          }
        }
      }
      if(true)
        return term;
    }
    context.push("remove_closures_additions_0_0");
    context.popOnFailure();
    return null;
  }
}