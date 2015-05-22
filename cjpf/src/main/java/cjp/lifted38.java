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

@SuppressWarnings("all") final class lifted38 extends Strategy 
{ 
  public static final lifted38 instance = new lifted38();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail161:
    { 
      IStrategoTerm term126 = term;
      IStrategoConstructor cons13 = term.getTermType() == IStrategoTerm.APPL ? ((IStrategoAppl)term).getConstructor() : null;
      Success127:
      { 
        if(cons13 == transform._consShortClosureJoinpoints_2)
        { 
          Fail162:
          { 
            term = cjp.constNone0;
            if(true)
              break Success127;
          }
          term = term126;
        }
        if(cons13 == transform._consClosureJoinpoints_4)
        { 
          term = cjp.constNone0;
        }
        else
        { 
          break Fail161;
        }
      }
      if(true)
        return term;
    }
    return null;
  }
}