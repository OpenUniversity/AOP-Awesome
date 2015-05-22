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

@SuppressWarnings("all") public class remove_ejp_decs_0_0 extends Strategy 
{ 
  public static remove_ejp_decs_0_0 instance = new remove_ejp_decs_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail117:
    { 
      IStrategoTerm term70 = term;
      IStrategoConstructor cons17 = term.getTermType() == IStrategoTerm.APPL ? ((IStrategoAppl)term).getConstructor() : null;
      Success65:
      { 
        if(cons17 == transform._consExplicitJoinPointDeclaration_5)
        { 
          Fail118:
          { 
            term = ejp.constNone0;
            if(true)
              break Success65;
          }
          term = term70;
        }
        Success66:
        { 
          if(cons17 == transform._consDecNoMatch_4)
          { 
            Fail119:
            { 
              term = ejp.constNone0;
              if(true)
                break Success66;
            }
            term = term70;
          }
          Success67:
          { 
            if(cons17 == transform._consExplicitJoinPointPattern_1)
            { 
              Fail120:
              { 
                term = ejp.constNone0;
                if(true)
                  break Success67;
              }
              term = term70;
            }
            Success68:
            { 
              if(cons17 == transform._consNotExplicitJoinPointPattern_1)
              { 
                Fail121:
                { 
                  term = ejp.constNone0;
                  if(true)
                    break Success68;
                }
                term = term70;
              }
              Success69:
              { 
                if(cons17 == transform._consExplicitJoinPointScopePattern_1)
                { 
                  Fail122:
                  { 
                    term = ejp.constNone0;
                    if(true)
                      break Success69;
                  }
                  term = term70;
                }
                if(cons17 == transform._consNotExplicitJoinPointScopePattern_1)
                { 
                  term = ejp.constNone0;
                }
                else
                { 
                  break Fail117;
                }
              }
            }
          }
        }
      }
      if(true)
        return term;
    }
    context.push("remove_ejp_decs_0_0");
    context.popOnFailure();
    return null;
  }
}