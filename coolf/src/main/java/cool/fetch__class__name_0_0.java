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

@SuppressWarnings("all") public class fetch__class__name_0_0 extends Strategy 
{ 
  public static fetch__class__name_0_0 instance = new fetch__class__name_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail112:
    { 
      IStrategoTerm term105 = term;
      IStrategoConstructor cons7 = term.getTermType() == IStrategoTerm.APPL ? ((IStrategoAppl)term).getConstructor() : null;
      Success102:
      { 
        if(cons7 == transform._consTypeName_2)
        { 
          Fail113:
          { 
            IStrategoTerm d_23 = null;
            IStrategoTerm arg12 = term.getSubterm(1);
            if(arg12.getTermType() != IStrategoTerm.APPL || transform._consId_1 != ((IStrategoAppl)arg12).getConstructor())
              break Fail113;
            d_23 = arg12.getSubterm(0);
            term = d_23;
            if(true)
              break Success102;
          }
          term = term105;
        }
        if(cons7 == transform._consTypeName_1)
        { 
          IStrategoTerm c_23 = null;
          IStrategoTerm arg13 = term.getSubterm(0);
          if(arg13.getTermType() != IStrategoTerm.APPL || transform._consId_1 != ((IStrategoAppl)arg13).getConstructor())
            break Fail112;
          c_23 = arg13.getSubterm(0);
          term = c_23;
        }
        else
        { 
          break Fail112;
        }
      }
      if(true)
        return term;
    }
    context.push("fetch__class__name_0_0");
    context.popOnFailure();
    return null;
  }
}