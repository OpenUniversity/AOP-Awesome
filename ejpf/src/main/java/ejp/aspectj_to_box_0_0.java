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

@SuppressWarnings("all") public class aspectj_to_box_0_0 extends Strategy 
{ 
  public static aspectj_to_box_0_0 instance = new aspectj_to_box_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("aspectj_to_box_0_0");
    Fail227:
    { 
      IStrategoTerm term174 = term;
      IStrategoConstructor cons23 = term.getTermType() == IStrategoTerm.APPL ? ((IStrategoAppl)term).getConstructor() : null;
      Success169:
      { 
        if(cons23 == transform._consCall_1)
        { 
          Fail228:
          { 
            IStrategoTerm o_50 = null;
            o_50 = term.getSubterm(0);
            term = termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{ejp.constCons25, (IStrategoTerm)termFactory.makeListCons(ejp.constFBOX46, termFactory.makeListCons(ejp.constS1, termFactory.makeListCons(o_50, (IStrategoList)ejp.constCons26)))});
            if(true)
              break Success169;
          }
          term = term174;
        }
        Success170:
        { 
          if(cons23 == transform._consExec_1)
          { 
            Fail229:
            { 
              IStrategoTerm n_50 = null;
              n_50 = term.getSubterm(0);
              term = termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{ejp.constCons25, (IStrategoTerm)termFactory.makeListCons(ejp.constFBOX47, termFactory.makeListCons(ejp.constS1, termFactory.makeListCons(n_50, (IStrategoList)ejp.constCons26)))});
              if(true)
                break Success170;
            }
            term = term174;
          }
          term = aspectj_to_box_0_0_fragment_4.instance.invoke(context, term);
          if(term == null)
            break Fail227;
        }
      }
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}