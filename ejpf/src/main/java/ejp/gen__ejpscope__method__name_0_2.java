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

@SuppressWarnings("all") public class gen__ejpscope__method__name_0_2 extends Strategy 
{ 
  public static gen__ejpscope__method__name_0_2 instance = new gen__ejpscope__method__name_0_2();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm d_78, IStrategoTerm e_78)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("gen__ejpscope__method__name_0_2");
    Fail59:
    { 
      IStrategoTerm term30 = term;
      IStrategoConstructor cons8 = term.getTermType() == IStrategoTerm.APPL ? ((IStrategoAppl)term).getConstructor() : null;
      Success30:
      { 
        if(cons8 == transform._consMemberName_1)
        { 
          Fail60:
          { 
            IStrategoTerm k_28 = null;
            IStrategoTerm l_28 = null;
            k_28 = term.getSubterm(0);
            Success31:
            { 
              Fail61:
              { 
                IStrategoTerm m_28 = null;
                m_28 = term;
                term = d_78;
                if(term.getTermType() != IStrategoTerm.APPL || transform._consNone_0 != ((IStrategoAppl)term).getConstructor())
                  break Fail61;
                term = m_28;
                { 
                  term = (IStrategoTerm)termFactory.makeListCons(ejp.const20, termFactory.makeListCons(e_78, termFactory.makeListCons(ejp.const19, termFactory.makeListCons(k_28, (IStrategoList)ejp.constNil0))));
                  term = concat_strings_0_0.instance.invoke(context, term);
                  if(term == null)
                    break Fail60;
                  l_28 = term;
                  if(true)
                    break Success31;
                }
              }
              term = convert_package_name_0_0.instance.invoke(context, d_78);
              if(term == null)
                break Fail60;
              term = (IStrategoTerm)termFactory.makeListCons(ejp.const20, termFactory.makeListCons(term, termFactory.makeListCons(e_78, termFactory.makeListCons(ejp.const19, termFactory.makeListCons(k_28, (IStrategoList)ejp.constNil0)))));
              term = concat_strings_0_0.instance.invoke(context, term);
              if(term == null)
                break Fail60;
              l_28 = term;
            }
            term = termFactory.makeAppl(transform._consMemberName_2, new IStrategoTerm[]{ejp.constRefTypePattern0, l_28});
            if(true)
              break Success30;
          }
          term = term30;
        }
        if(cons8 == transform._consMemberName_2)
        { 
          term = gen__ejpscope__method__name_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail59;
        }
        else
        { 
          break Fail59;
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