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

@SuppressWarnings("all") public class pointcutarg_0_3 extends Strategy 
{ 
  public static pointcutarg_0_3 instance = new pointcutarg_0_3();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm a_78, IStrategoTerm b_78, IStrategoTerm c_78)
  { 
    ITermFactory termFactory = context.getFactory();
    Fail48:
    { 
      IStrategoTerm term23 = term;
      IStrategoConstructor cons5 = term.getTermType() == IStrategoTerm.APPL ? ((IStrategoAppl)term).getConstructor() : null;
      Success23:
      { 
        if(cons5 == transform._consThisClass_0)
        { 
          Fail49:
          { 
            term = termFactory.makeAppl(transform._consWithin_1, new IStrategoTerm[]{termFactory.makeAppl(transform._consAnnoTypePattern_2, new IStrategoTerm[]{termFactory.makeAppl(transform._consAnnoPattern_1, new IStrategoTerm[]{(IStrategoTerm)termFactory.makeListCons(termFactory.makeAppl(transform._consSimpleAnnoPatternValue_2, new IStrategoTerm[]{ejp.constTypeName4, termFactory.makeAppl(transform._consLit_1, new IStrategoTerm[]{termFactory.makeAppl(transform._consDeci_1, new IStrategoTerm[]{a_78})})}), (IStrategoList)ejp.constNil0)}), ejp.constRefTypePattern0})});
            if(true)
              break Success23;
          }
          term = term23;
        }
        Success24:
        { 
          if(cons5 == transform._consThisMethod_0)
          { 
            Fail50:
            { 
              term = termFactory.makeAppl(transform._consMethodPattern_6, new IStrategoTerm[]{termFactory.makeAppl(transform._consAnnoPattern_1, new IStrategoTerm[]{(IStrategoTerm)termFactory.makeListCons(termFactory.makeAppl(transform._consSimpleAnnoPatternValue_2, new IStrategoTerm[]{ejp.constTypeName5, termFactory.makeAppl(transform._consLit_1, new IStrategoTerm[]{termFactory.makeAppl(transform._consDeci_1, new IStrategoTerm[]{b_78})})}), (IStrategoList)ejp.constNil0)}), ejp.constModPattern0, ejp.constRefTypePattern0, ejp.constMemberName0, ejp.constCons2, ejp.constNone0});
              if(true)
                break Success24;
            }
            term = term23;
          }
          if(cons5 == transform._consThisBlock_0)
          { 
            term = termFactory.makeAppl(transform._consMethodPattern_6, new IStrategoTerm[]{termFactory.makeAppl(transform._consAnnoPattern_1, new IStrategoTerm[]{(IStrategoTerm)termFactory.makeListCons(termFactory.makeAppl(transform._consSimpleAnnoPatternValue_2, new IStrategoTerm[]{ejp.constTypeName6, termFactory.makeAppl(transform._consLit_1, new IStrategoTerm[]{termFactory.makeAppl(transform._consDeci_1, new IStrategoTerm[]{c_78})})}), (IStrategoList)ejp.constNil0)}), ejp.constModPattern0, ejp.constRefTypePattern0, ejp.constMemberName0, ejp.constCons2, ejp.constNone0});
          }
          else
          { 
            break Fail48;
          }
        }
      }
      if(true)
        return term;
    }
    context.push("pointcutarg_0_3");
    context.popOnFailure();
    return null;
  }
}