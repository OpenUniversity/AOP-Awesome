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

@SuppressWarnings("all") public class fetch_type_0_0 extends Strategy 
{ 
  public static fetch_type_0_0 instance = new fetch_type_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("fetch_type_0_0");
    Fail85:
    { 
      IStrategoTerm p_31 = null;
      IStrategoTerm q_31 = null;
      IStrategoTerm r_31 = null;
      p_31 = term;
      r_31 = term;
      q_31 = term;
      term = r_31;
      IStrategoTerm term43 = term;
      Success43:
      { 
        Fail86:
        { 
          IStrategoTerm s_31 = null;
          s_31 = term;
          term = q_31;
          if(term.getTermType() != IStrategoTerm.APPL || transform._consLit_1 != ((IStrategoAppl)term).getConstructor())
            break Fail86;
          IStrategoTerm arg77 = term.getSubterm(0);
          if(arg77.getTermType() != IStrategoTerm.APPL || transform._consString_1 != ((IStrategoAppl)arg77).getConstructor())
            break Fail86;
          term = s_31;
          { 
            term = ejp.constLit0;
            if(true)
              break Success43;
          }
        }
        term = term43;
        Success44:
        { 
          Fail87:
          { 
            IStrategoTerm t_31 = null;
            t_31 = term;
            term = q_31;
            if(term.getTermType() != IStrategoTerm.APPL || transform._consLit_1 != ((IStrategoAppl)term).getConstructor())
              break Fail87;
            IStrategoTerm arg79 = term.getSubterm(0);
            if(arg79.getTermType() != IStrategoTerm.APPL || transform._consChar_1 != ((IStrategoAppl)arg79).getConstructor())
              break Fail87;
            term = t_31;
            { 
              term = ejp.constLit1;
              if(true)
                break Success44;
            }
          }
          term = pp_java5_to_string_0_0.instance.invoke(context, p_31);
          if(term == null)
            break Fail85;
          term = termFactory.makeAppl(transform._consLit_1, new IStrategoTerm[]{termFactory.makeAppl(transform._consString_1, new IStrategoTerm[]{(IStrategoTerm)termFactory.makeListCons(termFactory.makeAppl(transform._consChars_1, new IStrategoTerm[]{term}), (IStrategoList)ejp.constNil0)})});
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