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

@SuppressWarnings("all") public class fetch_default_value_0_0 extends Strategy 
{ 
  public static fetch_default_value_0_0 instance = new fetch_default_value_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail113:
    { 
      IStrategoTerm term68 = term;
      IStrategoConstructor cons15 = term.getTermType() == IStrategoTerm.APPL ? ((IStrategoAppl)term).getConstructor() : null;
      Success63:
      { 
        if(cons15 == transform._consSome_1)
        { 
          Fail114:
          { 
            IStrategoTerm o_40 = null;
            IStrategoTerm arg130 = term.getSubterm(0);
            if(arg130.getTermType() != IStrategoTerm.APPL || transform._consExplicitJoinPointInitializer_1 != ((IStrategoAppl)arg130).getConstructor())
              break Fail114;
            o_40 = arg130.getSubterm(0);
            term = o_40;
            if(true)
              break Success63;
          }
          term = term68;
        }
        if(cons15 == transform._consNone_0)
        { 
          term = ejp.constNone0;
        }
        else
        { 
          break Fail113;
        }
      }
      if(true)
        return term;
    }
    context.push("fetch_default_value_0_0");
    context.popOnFailure();
    return null;
  }
}