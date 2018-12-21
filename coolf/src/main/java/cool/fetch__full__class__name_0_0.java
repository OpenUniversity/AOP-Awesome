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

@SuppressWarnings("all") public class fetch__full__class__name_0_0 extends Strategy 
{ 
  public static fetch__full__class__name_0_0 instance = new fetch__full__class__name_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("fetch__full__class__name_0_0");
    Fail0:
    { 
      IStrategoTerm term0 = term;
      IStrategoConstructor cons0 = term.getTermType() == IStrategoTerm.APPL ? ((IStrategoAppl)term).getConstructor() : null;
      Success0:
      { 
        if(cons0 == transform._consTypeName_2)
        { 
          Fail1:
          { 
            IStrategoTerm l_7 = null;
            IStrategoTerm m_7 = null;
            l_7 = term.getSubterm(0);
            IStrategoTerm arg0 = term.getSubterm(1);
            if(arg0.getTermType() != IStrategoTerm.APPL || transform._consId_1 != ((IStrategoAppl)arg0).getConstructor())
              break Fail1;
            m_7 = arg0.getSubterm(0);
            term = this.invoke(context, l_7);
            if(term == null)
              break Fail1;
            term = (IStrategoTerm)termFactory.makeListCons(term, termFactory.makeListCons(cool.const0, termFactory.makeListCons(m_7, (IStrategoList)cool.constNil0)));
            term = concat_strings_0_0.instance.invoke(context, term);
            if(term == null)
              break Fail1;
            if(true)
              break Success0;
          }
          term = term0;
        }
        Success1:
        { 
          if(cons0 == transform._consTypeName_1)
          { 
            Fail2:
            { 
              IStrategoTerm k_7 = null;
              IStrategoTerm arg1 = term.getSubterm(0);
              if(arg1.getTermType() != IStrategoTerm.APPL || transform._consId_1 != ((IStrategoAppl)arg1).getConstructor())
                break Fail2;
              k_7 = arg1.getSubterm(0);
              term = k_7;
              if(true)
                break Success1;
            }
            term = term0;
          }
          Success2:
          { 
            if(cons0 == transform._consPackageOrTypeName_1)
            { 
              Fail3:
              { 
                IStrategoTerm j_7 = null;
                IStrategoTerm arg2 = term.getSubterm(0);
                if(arg2.getTermType() != IStrategoTerm.APPL || transform._consId_1 != ((IStrategoAppl)arg2).getConstructor())
                  break Fail3;
                j_7 = arg2.getSubterm(0);
                term = j_7;
                if(true)
                  break Success2;
              }
              term = term0;
            }
            if(cons0 == transform._consPackageOrTypeName_2)
            { 
              IStrategoTerm f_7 = null;
              IStrategoTerm g_7 = null;
              f_7 = term.getSubterm(0);
              IStrategoTerm arg3 = term.getSubterm(1);
              if(arg3.getTermType() != IStrategoTerm.APPL || transform._consId_1 != ((IStrategoAppl)arg3).getConstructor())
                break Fail0;
              g_7 = arg3.getSubterm(0);
              term = this.invoke(context, f_7);
              if(term == null)
                break Fail0;
              term = (IStrategoTerm)termFactory.makeListCons(term, termFactory.makeListCons(cool.const0, termFactory.makeListCons(g_7, (IStrategoList)cool.constNil0)));
              term = concat_strings_0_0.instance.invoke(context, term);
              if(term == null)
                break Fail0;
            }
            else
            { 
              break Fail0;
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