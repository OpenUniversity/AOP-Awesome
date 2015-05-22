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
      IStrategoTerm z_31 = null;
      IStrategoTerm a_32 = null;
      IStrategoTerm b_32 = null;
      z_31 = term;
      b_32 = term;
      a_32 = term;
      term = b_32;
      IStrategoTerm term43 = term;
      Success43:
      { 
        Fail86:
        { 
          IStrategoTerm c_32 = null;
          c_32 = term;
          term = a_32;
          if(term.getTermType() != IStrategoTerm.APPL || transform._consLit_1 != ((IStrategoAppl)term).getConstructor())
            break Fail86;
          IStrategoTerm arg77 = term.getSubterm(0);
          if(arg77.getTermType() != IStrategoTerm.APPL || transform._consString_1 != ((IStrategoAppl)arg77).getConstructor())
            break Fail86;
          term = c_32;
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
            IStrategoTerm d_32 = null;
            d_32 = term;
            term = a_32;
            if(term.getTermType() != IStrategoTerm.APPL || transform._consLit_1 != ((IStrategoAppl)term).getConstructor())
              break Fail87;
            IStrategoTerm arg79 = term.getSubterm(0);
            if(arg79.getTermType() != IStrategoTerm.APPL || transform._consChar_1 != ((IStrategoAppl)arg79).getConstructor())
              break Fail87;
            term = d_32;
            { 
              term = ejp.constLit1;
              if(true)
                break Success44;
            }
          }
          term = pp_java5_to_string_0_0.instance.invoke(context, z_31);
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