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

@SuppressWarnings("all") public class gen_class_head_0_1 extends Strategy 
{ 
  public static gen_class_head_0_1 instance = new gen_class_head_0_1();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm w_38)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("gen_class_head_0_1");
    Fail185:
    { 
      IStrategoTerm y_38 = null;
      IStrategoTerm z_38 = null;
      term = w_38;
      IStrategoTerm term187 = term;
      IStrategoConstructor cons6 = term.getTermType() == IStrategoTerm.APPL ? ((IStrategoAppl)term).getConstructor() : null;
      Success145:
      { 
        if(cons6 == transform._consTypeName_2)
        { 
          Fail186:
          { 
            IStrategoTerm z_171 = null;
            IStrategoTerm arg140 = term.getSubterm(1);
            if(arg140.getTermType() != IStrategoTerm.APPL || transform._consId_1 != ((IStrategoAppl)arg140).getConstructor())
              break Fail186;
            z_171 = arg140.getSubterm(0);
            term = z_171;
            if(true)
              break Success145;
          }
          term = term187;
        }
        if(cons6 == transform._consTypeName_1)
        { 
          IStrategoTerm a_172 = null;
          IStrategoTerm arg141 = term.getSubterm(0);
          if(arg141.getTermType() != IStrategoTerm.APPL || transform._consId_1 != ((IStrategoAppl)arg141).getConstructor())
            break Fail185;
          a_172 = arg141.getSubterm(0);
          term = a_172;
        }
        else
        { 
          break Fail185;
        }
      }
      z_38 = term;
      term = fetch__full__class__name_0_0.instance.invoke(context, w_38);
      if(term == null)
        break Fail185;
      term = (IStrategoTerm)termFactory.makeListCons(termFactory.makeAppl(transform._consAnno_2, new IStrategoTerm[]{cool.constTypeName4, (IStrategoTerm)termFactory.makeListCons(termFactory.makeAppl(transform._consElemValPair_2, new IStrategoTerm[]{cool.constId16, termFactory.makeAppl(transform._consLit_1, new IStrategoTerm[]{termFactory.makeAppl(transform._consString_1, new IStrategoTerm[]{(IStrategoTerm)termFactory.makeListCons(termFactory.makeAppl(transform._consChars_1, new IStrategoTerm[]{term}), (IStrategoList)cool.constNil0)})})}), (IStrategoList)cool.constNil0)}), (IStrategoList)cool.constCons11);
      y_38 = term;
      term = (IStrategoTerm)termFactory.makeListCons(z_38, (IStrategoList)cool.constCons3);
      term = concat_strings_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail185;
      term = termFactory.makeAppl(transform._consClassDecHead_5, new IStrategoTerm[]{y_38, termFactory.makeAppl(transform._consId_1, new IStrategoTerm[]{term}), cool.constNone0, cool.constNone0, cool.constNone0});
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}