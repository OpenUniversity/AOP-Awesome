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

@SuppressWarnings("all") public class typename__2__ambname_0_0 extends Strategy 
{ 
  public static typename__2__ambname_0_0 instance = new typename__2__ambname_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("typename__2__ambname_0_0");
    Fail54:
    { 
      IStrategoTerm term27 = term;
      IStrategoConstructor cons7 = term.getTermType() == IStrategoTerm.APPL ? ((IStrategoAppl)term).getConstructor() : null;
      Success27:
      { 
        if(cons7 == transform._consTypeName_1)
        { 
          Fail55:
          { 
            IStrategoTerm r_27 = null;
            r_27 = term.getSubterm(0);
            term = termFactory.makeAppl(transform._consAmbName_1, new IStrategoTerm[]{r_27});
            if(true)
              break Success27;
          }
          term = term27;
        }
        Success28:
        { 
          if(cons7 == transform._consTypeName_2)
          { 
            Fail56:
            { 
              IStrategoTerm n_27 = null;
              IStrategoTerm o_27 = null;
              n_27 = term.getSubterm(0);
              o_27 = term.getSubterm(1);
              term = this.invoke(context, n_27);
              if(term == null)
                break Fail56;
              term = termFactory.makeAppl(transform._consAmbName_2, new IStrategoTerm[]{term, o_27});
              if(true)
                break Success28;
            }
            term = term27;
          }
          Success29:
          { 
            if(cons7 == transform._consPackageOrTypeName_1)
            { 
              Fail57:
              { 
                IStrategoTerm m_27 = null;
                m_27 = term.getSubterm(0);
                term = termFactory.makeAppl(transform._consAmbName_1, new IStrategoTerm[]{m_27});
                if(true)
                  break Success29;
              }
              term = term27;
            }
            if(cons7 == transform._consPackageOrTypeName_2)
            { 
              IStrategoTerm i_27 = null;
              IStrategoTerm j_27 = null;
              i_27 = term.getSubterm(0);
              j_27 = term.getSubterm(1);
              term = this.invoke(context, i_27);
              if(term == null)
                break Fail54;
              term = termFactory.makeAppl(transform._consAmbName_2, new IStrategoTerm[]{term, j_27});
            }
            else
            { 
              break Fail54;
            }
          }
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