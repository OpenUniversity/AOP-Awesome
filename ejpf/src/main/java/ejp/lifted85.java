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

@SuppressWarnings("all") final class lifted85 extends Strategy 
{ 
  public static final lifted85 instance = new lifted85();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail260:
    { 
      IStrategoTerm term185 = term;
      IStrategoConstructor cons26 = term.getTermType() == IStrategoTerm.APPL ? ((IStrategoAppl)term).getConstructor() : null;
      Success181:
      { 
        if(cons26 == transform._consScopedEJPCall_3)
        { 
          Fail261:
          { 
            term = ejp.constNone0;
            if(true)
              break Success181;
          }
          term = term185;
        }
        if(cons26 == transform._consEJPCall_2)
        { 
          term = ejp.constNone0;
        }
        else
        { 
          break Fail260;
        }
      }
      if(true)
        return term;
    }
    return null;
  }
}