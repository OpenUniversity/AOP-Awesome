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

@SuppressWarnings("all") public class option_to_boxes_0_0 extends Strategy 
{ 
  public static option_to_boxes_0_0 instance = new option_to_boxes_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    Fail231:
    { 
      IStrategoTerm term178 = term;
      IStrategoConstructor cons24 = term.getTermType() == IStrategoTerm.APPL ? ((IStrategoAppl)term).getConstructor() : null;
      Success171:
      { 
        if(cons24 == transform._consSome_1)
        { 
          Fail232:
          { 
            IStrategoTerm q_50 = null;
            q_50 = term.getSubterm(0);
            term = q_50;
            term = (IStrategoTerm)termFactory.makeListCons(term, (IStrategoList)ejp.constNil0);
            if(true)
              break Success171;
          }
          term = term178;
        }
        if(cons24 == transform._consNone_0)
        { 
          term = ejp.constNil0;
        }
        else
        { 
          break Fail231;
        }
      }
      if(true)
        return term;
    }
    context.push("option_to_boxes_0_0");
    context.popOnFailure();
    return null;
  }
}