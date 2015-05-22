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

@SuppressWarnings("all") public class ejp_to_java2_0_0 extends Strategy 
{ 
  public static ejp_to_java2_0_0 instance = new ejp_to_java2_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("ejp_to_java2_0_0");
    Fail6:
    { 
      IStrategoTerm f_11 = null;
      IStrategoTerm h_11 = null;
      IStrategoTerm i_11 = null;
      IStrategoTerm j_11 = null;
      IStrategoTerm k_11 = null;
      TermReference l_11 = new TermReference();
      IStrategoTerm m_11 = null;
      IStrategoTerm n_11 = null;
      TermReference o_11 = new TermReference();
      IStrategoTerm p_11 = null;
      if(term.getTermType() != IStrategoTerm.APPL || transform._consClassDec_2 != ((IStrategoAppl)term).getConstructor())
        break Fail6;
      IStrategoTerm arg2 = term.getSubterm(0);
      if(arg2.getTermType() != IStrategoTerm.APPL || transform._consClassDecHead_5 != ((IStrategoAppl)arg2).getConstructor())
        break Fail6;
      f_11 = arg2.getSubterm(0);
      h_11 = arg2.getSubterm(1);
      i_11 = arg2.getSubterm(2);
      j_11 = arg2.getSubterm(3);
      k_11 = arg2.getSubterm(4);
      IStrategoTerm arg3 = term.getSubterm(1);
      if(arg3.getTermType() != IStrategoTerm.APPL || transform._consClassBody_1 != ((IStrategoAppl)arg3).getConstructor())
        break Fail6;
      m_11 = arg3.getSubterm(0);
      term = random_string_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail6;
      if(l_11.value == null)
        l_11.value = term;
      else
        if(l_11.value != term && !l_11.value.match(term))
          break Fail6;
      if(l_11.value == null)
        break Fail6;
      term = termFactory.makeTuple((IStrategoTerm)termFactory.makeListCons(termFactory.makeAppl(transform._consSingleElemAnno_2, new IStrategoTerm[]{ejp.constTypeName0, termFactory.makeAppl(transform._consLit_1, new IStrategoTerm[]{termFactory.makeAppl(transform._consDeci_1, new IStrategoTerm[]{l_11.value})})}), (IStrategoList)ejp.constNil0), f_11);
      term = conc_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail6;
      term = termFactory.makeAppl(transform._consClassDecHead_5, new IStrategoTerm[]{term, h_11, i_11, j_11, k_11});
      p_11 = term;
      term = new_iset_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail6;
      if(o_11.value == null)
        o_11.value = term;
      else
        if(o_11.value != term && !o_11.value.match(term))
          break Fail6;
      term = m_11;
      lifted0 lifted00 = new lifted0();
      lifted00.l_11 = l_11;
      lifted00.o_11 = o_11;
      term = SRTS_all.instance.invoke(context, term, lifted00);
      if(term == null)
        break Fail6;
      n_11 = term;
      if(o_11.value == null)
        break Fail6;
      term = iset_elements_0_0.instance.invoke(context, o_11.value);
      if(term == null)
        break Fail6;
      term = termFactory.makeTuple(n_11, term);
      term = conc_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail6;
      term = termFactory.makeAppl(transform._consClassBody_1, new IStrategoTerm[]{term});
      term = termFactory.makeAppl(transform._consClassDec_2, new IStrategoTerm[]{p_11, term});
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}