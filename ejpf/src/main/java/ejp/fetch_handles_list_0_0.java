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

@SuppressWarnings("all") public class fetch_handles_list_0_0 extends Strategy 
{ 
  public static fetch_handles_list_0_0 instance = new fetch_handles_list_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail115:
    { 
      IStrategoTerm term69 = term;
      IStrategoConstructor cons16 = term.getTermType() == IStrategoTerm.APPL ? ((IStrategoAppl)term).getConstructor() : null;
      Success64:
      { 
        if(cons16 == transform._consSome_1)
        { 
          Fail116:
          { 
            IStrategoTerm p_40 = null;
            IStrategoTerm arg131 = term.getSubterm(0);
            if(arg131.getTermType() != IStrategoTerm.APPL || transform._consHandles_1 != ((IStrategoAppl)arg131).getConstructor())
              break Fail116;
            p_40 = arg131.getSubterm(0);
            term = p_40;
            if(true)
              break Success64;
          }
          term = term69;
        }
        if(cons16 == transform._consNone_0)
        { 
          term = ejp.constNil0;
        }
        else
        { 
          break Fail115;
        }
      }
      if(true)
        return term;
    }
    context.push("fetch_handles_list_0_0");
    context.popOnFailure();
    return null;
  }
}