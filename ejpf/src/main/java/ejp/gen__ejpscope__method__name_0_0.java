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

@SuppressWarnings("all") public class gen__ejpscope__method__name_0_0 extends Strategy 
{ 
  public static gen__ejpscope__method__name_0_0 instance = new gen__ejpscope__method__name_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("gen__ejpscope__method__name_0_0");
    Fail63:
    { 
      IStrategoTerm term32 = term;
      IStrategoConstructor cons9 = term.getTermType() == IStrategoTerm.APPL ? ((IStrategoAppl)term).getConstructor() : null;
      Success32:
      { 
        if(cons9 == transform._consExplicitJoinPoint_3)
        { 
          Fail64:
          { 
            IStrategoTerm q_28 = null;
            IStrategoTerm r_28 = null;
            q_28 = term.getSubterm(0);
            IStrategoTerm arg70 = term.getSubterm(1);
            if(arg70.getTermType() != IStrategoTerm.APPL || transform._consId_1 != ((IStrategoAppl)arg70).getConstructor())
              break Fail64;
            r_28 = arg70.getSubterm(0);
            term = gen__ejpscope__method__name__helper_0_0.instance.invoke(context, q_28);
            if(term == null)
              break Fail64;
            term = (IStrategoTerm)termFactory.makeListCons(ejp.const20, termFactory.makeListCons(term, termFactory.makeListCons(ejp.const19, termFactory.makeListCons(r_28, (IStrategoList)ejp.constNil0))));
            term = concat_strings_0_0.instance.invoke(context, term);
            if(term == null)
              break Fail64;
            if(true)
              break Success32;
          }
          term = term32;
        }
        if(cons9 == transform._consMemberName_2)
        { 
          IStrategoTerm h_28 = null;
          IStrategoTerm i_28 = null;
          IStrategoTerm arg72 = term.getSubterm(0);
          if(arg72.getTermType() != IStrategoTerm.APPL || transform._consRefTypePattern_1 != ((IStrategoAppl)arg72).getConstructor())
            break Fail63;
          h_28 = arg72.getSubterm(0);
          i_28 = term.getSubterm(1);
          Success33:
          { 
            Fail65:
            { 
              IStrategoTerm j_28 = null;
              j_28 = term;
              term = termFactory.makeTuple(ejp.constNamePattern0, h_28);
              term = equal_0_0.instance.invoke(context, term);
              if(term == null)
                break Fail65;
              term = j_28;
              { 
                term = (IStrategoTerm)termFactory.makeListCons(ejp.const20, termFactory.makeListCons(i_28, (IStrategoList)ejp.constNil0));
                term = concat_strings_0_0.instance.invoke(context, term);
                if(term == null)
                  break Fail63;
                term = termFactory.makeAppl(transform._consMemberName_1, new IStrategoTerm[]{term});
                if(true)
                  break Success33;
              }
            }
            term = gen__ejpscope__method__name__helper_0_0.instance.invoke(context, h_28);
            if(term == null)
              break Fail63;
            term = (IStrategoTerm)termFactory.makeListCons(ejp.const20, termFactory.makeListCons(term, termFactory.makeListCons(ejp.const19, termFactory.makeListCons(i_28, (IStrategoList)ejp.constNil0))));
            term = concat_strings_0_0.instance.invoke(context, term);
            if(term == null)
              break Fail63;
            term = termFactory.makeAppl(transform._consMemberName_1, new IStrategoTerm[]{term});
          }
        }
        else
        { 
          break Fail63;
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