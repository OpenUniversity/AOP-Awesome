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

@SuppressWarnings("all") public class option_to_boxes_0_0 extends Strategy 
{ 
  public static option_to_boxes_0_0 instance = new option_to_boxes_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    Fail108:
    { 
      IStrategoTerm term103 = term;
      IStrategoConstructor cons6 = term.getTermType() == IStrategoTerm.APPL ? ((IStrategoAppl)term).getConstructor() : null;
      Success101:
      { 
        if(cons6 == transform._consSome_1)
        { 
          Fail109:
          { 
            IStrategoTerm p_18 = null;
            p_18 = term.getSubterm(0);
            term = p_18;
            term = (IStrategoTerm)termFactory.makeListCons(term, (IStrategoList)cjp.constNil0);
            if(true)
              break Success101;
          }
          term = term103;
        }
        if(cons6 == transform._consNone_0)
        { 
          term = cjp.constNil0;
        }
        else
        { 
          break Fail108;
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