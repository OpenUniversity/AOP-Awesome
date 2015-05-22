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

@SuppressWarnings("all") public class gen_pointcutargs_pointcuts_0_1 extends Strategy 
{ 
  public static gen_pointcutargs_pointcuts_0_1 instance = new gen_pointcutargs_pointcuts_0_1();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm i_78)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("gen_pointcutargs_pointcuts_0_1");
    Fail97:
    { 
      IStrategoTerm term58 = term;
      Success53:
      { 
        Fail98:
        { 
          TermReference a_39 = new TermReference();
          IStrategoTerm b_39 = null;
          IStrategoTerm e_39 = null;
          IStrategoTerm g_39 = null;
          IStrategoTerm h_39 = null;
          IStrategoTerm c_39 = null;
          if(term.getTermType() != IStrategoTerm.TUPLE || term.getSubtermCount() != 2)
            break Fail98;
          IStrategoTerm arg120 = term.getSubterm(0);
          if(arg120.getTermType() != IStrategoTerm.APPL || transform._consSome_1 != ((IStrategoAppl)arg120).getConstructor())
            break Fail98;
          IStrategoTerm arg121 = arg120.getSubterm(0);
          if(arg121.getTermType() != IStrategoTerm.APPL || transform._consPointcutargsDec_1 != ((IStrategoAppl)arg121).getConstructor())
            break Fail98;
          b_39 = arg121.getSubterm(0);
          e_39 = term.getSubterm(1);
          term = e_39;
          lifted68 lifted680 = new lifted68();
          lifted67 lifted670 = new lifted67();
          lifted680.a_39 = a_39;
          lifted670.a_39 = a_39;
          term = or_2_0.instance.invoke(context, term, lifted670, lifted680);
          if(term == null)
            break Fail98;
          term = i_78;
          g_39 = i_78;
          if(a_39.value == null)
            break Fail98;
          term = a_39.value;
          if(term.getTermType() != IStrategoTerm.APPL || transform._consExplicitJoinPointDeclarator_3 != ((IStrategoAppl)term).getConstructor())
            break Fail98;
          IStrategoTerm arg125 = term.getSubterm(1);
          if(arg125.getTermType() != IStrategoTerm.APPL || transform._consId_1 != ((IStrategoAppl)arg125).getConstructor())
            break Fail98;
          c_39 = arg125.getSubterm(0);
          h_39 = c_39;
          term = map_1_0.instance.invoke(context, b_39, lifted69.instance);
          if(term == null)
            break Fail98;
          term = termFactory.makeAppl(transform._consAspectDec_2, new IStrategoTerm[]{termFactory.makeAppl(transform._consAspectDecHead_6, new IStrategoTerm[]{ejp.constCons23, termFactory.makeAppl(transform._consId_1, new IStrategoTerm[]{h_39}), ejp.constNone0, ejp.constNone0, ejp.constNone0, ejp.constNone0}), termFactory.makeAppl(transform._consAspectBody_1, new IStrategoTerm[]{term})});
          term = iset_add_0_1.instance.invoke(context, g_39, term);
          if(term == null)
            break Fail98;
          if(true)
            break Success53;
        }
        term = term58;
        if(term.getTermType() != IStrategoTerm.TUPLE || term.getSubtermCount() != 2)
          break Fail97;
        IStrategoTerm arg127 = term.getSubterm(0);
        if(arg127.getTermType() != IStrategoTerm.APPL || transform._consNone_0 != ((IStrategoAppl)arg127).getConstructor())
          break Fail97;
      }
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}