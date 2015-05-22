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

@SuppressWarnings("all") public class gen__ejp__name_0_0 extends Strategy 
{ 
  public static gen__ejp__name_0_0 instance = new gen__ejp__name_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("gen__ejp__name_0_0");
    Fail51:
    { 
      IStrategoTerm term25 = term;
      IStrategoConstructor cons6 = term.getTermType() == IStrategoTerm.APPL ? ((IStrategoAppl)term).getConstructor() : null;
      Success25:
      { 
        if(cons6 == transform._consMemberName_1)
        { 
          Fail52:
          { 
            if(true)
              break Success25;
          }
          term = term25;
        }
        if(cons6 == transform._consMemberName_2)
        { 
          IStrategoTerm v_26 = null;
          IStrategoTerm w_26 = null;
          IStrategoTerm arg67 = term.getSubterm(0);
          if(arg67.getTermType() != IStrategoTerm.APPL || transform._consRefTypePattern_1 != ((IStrategoAppl)arg67).getConstructor())
            break Fail51;
          v_26 = arg67.getSubterm(0);
          w_26 = term.getSubterm(1);
          Success26:
          { 
            Fail53:
            { 
              IStrategoTerm x_26 = null;
              x_26 = term;
              term = termFactory.makeTuple(ejp.constNamePattern0, v_26);
              term = equal_0_0.instance.invoke(context, term);
              if(term == null)
                break Fail53;
              term = x_26;
              { 
                term = termFactory.makeAppl(transform._consMemberName_1, new IStrategoTerm[]{w_26});
                if(true)
                  break Success26;
              }
            }
            term = termFactory.makeAppl(transform._consMemberName_2, new IStrategoTerm[]{termFactory.makeAppl(transform._consRefTypePattern_1, new IStrategoTerm[]{v_26}), w_26});
            term = pp_aspectj_string_0_0.instance.invoke(context, term);
            if(term == null)
              break Fail51;
            term = termFactory.makeAppl(transform._consMemberName_1, new IStrategoTerm[]{term});
          }
        }
        else
        { 
          break Fail51;
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