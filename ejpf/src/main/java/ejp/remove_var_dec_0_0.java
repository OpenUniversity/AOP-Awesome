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

@SuppressWarnings("all") public class remove_var_dec_0_0 extends Strategy 
{ 
  public static remove_var_dec_0_0 instance = new remove_var_dec_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    Fail46:
    { 
      IStrategoTerm term22 = term;
      IStrategoConstructor cons4 = term.getTermType() == IStrategoTerm.APPL ? ((IStrategoAppl)term).getConstructor() : null;
      Success22:
      { 
        if(cons4 == transform._consVarDec_1)
        { 
          Fail47:
          { 
            term = ejp.constNone0;
            if(true)
              break Success22;
          }
          term = term22;
        }
        if(cons4 == transform._consVarDec_2)
        { 
          IStrategoTerm u_26 = null;
          IStrategoTerm v_26 = null;
          u_26 = term.getSubterm(0);
          v_26 = term.getSubterm(1);
          term = termFactory.makeAppl(transform._consExprStm_1, new IStrategoTerm[]{termFactory.makeAppl(transform._consAssign_2, new IStrategoTerm[]{termFactory.makeAppl(transform._consExprName_1, new IStrategoTerm[]{u_26}), v_26})});
        }
        else
        { 
          break Fail46;
        }
      }
      if(true)
        return term;
    }
    context.push("remove_var_dec_0_0");
    context.popOnFailure();
    return null;
  }
}