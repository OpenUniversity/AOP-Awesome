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

@SuppressWarnings("all") public class handle_pointcutarg_helper_0_1 extends Strategy 
{ 
  public static handle_pointcutarg_helper_0_1 instance = new handle_pointcutarg_helper_0_1();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm m_25)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("handle_pointcutarg_helper_0_1");
    Fail43:
    { 
      IStrategoTerm o_25 = null;
      IStrategoTerm p_25 = null;
      IStrategoTerm q_25 = null;
      IStrategoTerm r_25 = null;
      IStrategoTerm s_25 = null;
      IStrategoTerm t_25 = null;
      IStrategoTerm w_25 = null;
      IStrategoTerm u_25 = null;
      IStrategoTerm x_25 = null;
      if(term.getTermType() != IStrategoTerm.APPL || transform._consPointcutarg_3 != ((IStrategoAppl)term).getConstructor())
        break Fail43;
      IStrategoTerm arg61 = term.getSubterm(0);
      if(arg61.getTermType() != IStrategoTerm.APPL || transform._consId_1 != ((IStrategoAppl)arg61).getConstructor())
        break Fail43;
      q_25 = arg61.getSubterm(0);
      s_25 = term.getSubterm(1);
      r_25 = term.getSubterm(2);
      term = m_25;
      if(term.getTermType() != IStrategoTerm.APPL || transform._consExplicitJoinPoint_3 != ((IStrategoAppl)term).getConstructor())
        break Fail43;
      o_25 = term.getSubterm(0);
      IStrategoTerm arg62 = term.getSubterm(1);
      if(arg62.getTermType() != IStrategoTerm.APPL || transform._consId_1 != ((IStrategoAppl)arg62).getConstructor())
        break Fail43;
      p_25 = arg62.getSubterm(0);
      w_25 = term;
      term = pp_aspectj_string_0_0.instance.invoke(context, o_25);
      if(term == null)
        break Fail43;
      t_25 = term;
      x_25 = w_25;
      term = pp_aspectj_string_0_0.instance.invoke(context, r_25);
      if(term == null)
        break Fail43;
      u_25 = term;
      term = x_25;
      term = random_string_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail43;
      term = (IStrategoTerm)termFactory.makeListCons(ejp.const10, termFactory.makeListCons(term, (IStrategoList)ejp.constNil0));
      term = concat_strings_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail43;
      term = termFactory.makeAppl(transform._consMethodDec_2, new IStrategoTerm[]{termFactory.makeAppl(transform._consMethodDecHead_6, new IStrategoTerm[]{(IStrategoTerm)termFactory.makeListCons(termFactory.makeAppl(transform._consAnno_2, new IStrategoTerm[]{ejp.constTypeName3, (IStrategoTerm)termFactory.makeListCons(termFactory.makeAppl(transform._consElemValPair_2, new IStrategoTerm[]{ejp.constId4, termFactory.makeAppl(transform._consLit_1, new IStrategoTerm[]{termFactory.makeAppl(transform._consString_1, new IStrategoTerm[]{(IStrategoTerm)termFactory.makeListCons(termFactory.makeAppl(transform._consChars_1, new IStrategoTerm[]{t_25}), (IStrategoList)ejp.constNil0)})})}), termFactory.makeListCons(termFactory.makeAppl(transform._consElemValPair_2, new IStrategoTerm[]{ejp.constId3, termFactory.makeAppl(transform._consLit_1, new IStrategoTerm[]{termFactory.makeAppl(transform._consString_1, new IStrategoTerm[]{(IStrategoTerm)termFactory.makeListCons(termFactory.makeAppl(transform._consChars_1, new IStrategoTerm[]{p_25}), (IStrategoList)ejp.constNil0)})})}), termFactory.makeListCons(termFactory.makeAppl(transform._consElemValPair_2, new IStrategoTerm[]{ejp.constId8, termFactory.makeAppl(transform._consLit_1, new IStrategoTerm[]{termFactory.makeAppl(transform._consString_1, new IStrategoTerm[]{(IStrategoTerm)termFactory.makeListCons(termFactory.makeAppl(transform._consChars_1, new IStrategoTerm[]{q_25}), (IStrategoList)ejp.constNil0)})})}), termFactory.makeListCons(termFactory.makeAppl(transform._consElemValPair_2, new IStrategoTerm[]{ejp.constId7, termFactory.makeAppl(transform._consLit_1, new IStrategoTerm[]{termFactory.makeAppl(transform._consString_1, new IStrategoTerm[]{(IStrategoTerm)termFactory.makeListCons(termFactory.makeAppl(transform._consChars_1, new IStrategoTerm[]{u_25}), (IStrategoList)ejp.constNil0)})})}), (IStrategoList)ejp.constNil0))))}), (IStrategoList)ejp.constNil0), ejp.constNone0, ejp.constVoid0, termFactory.makeAppl(transform._consId_1, new IStrategoTerm[]{term}), s_25, ejp.constNone0}), ejp.constBlock0});
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}