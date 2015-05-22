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

@SuppressWarnings("all") public class gen_auxilery_class_0_5 extends Strategy 
{ 
  public static gen_auxilery_class_0_5 instance = new gen_auxilery_class_0_5();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm l_19, IStrategoTerm m_19, IStrategoTerm n_19, IStrategoTerm o_19, IStrategoTerm p_19)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("gen_auxilery_class_0_5");
    Fail27:
    { 
      IStrategoTerm t_19 = null;
      IStrategoTerm y_19 = null;
      IStrategoTerm z_19 = null;
      t_19 = term;
      term = n_19;
      if(term.getTermType() != IStrategoTerm.APPL || transform._consExplicitJoinPoint_3 != ((IStrategoAppl)term).getConstructor())
        break Fail27;
      term = gen_compact_var_declaration_0_2.instance.invoke(context, term, l_19, m_19);
      if(term == null)
        break Fail27;
      y_19 = term;
      term = gen_method_annotation_0_0.instance.invoke(context, n_19);
      if(term == null)
        break Fail27;
      z_19 = term;
      term = gen__ejpscope__method__name_0_0.instance.invoke(context, n_19);
      if(term == null)
        break Fail27;
      term = (IStrategoTerm)termFactory.makeListCons(y_19, termFactory.makeListCons((IStrategoTerm)termFactory.makeListCons(termFactory.makeAppl(transform._consMethodDec_2, new IStrategoTerm[]{termFactory.makeAppl(transform._consMethodDecHead_6, new IStrategoTerm[]{(IStrategoTerm)termFactory.makeListCons(termFactory.makeAppl(transform._consSingleElemAnno_2, new IStrategoTerm[]{ejp.constTypeName1, termFactory.makeAppl(transform._consLit_1, new IStrategoTerm[]{termFactory.makeAppl(transform._consDeci_1, new IStrategoTerm[]{p_19})})}), termFactory.makeListCons(z_19, (IStrategoList)ejp.constNil0)), ejp.constNone0, ejp.constVoid0, termFactory.makeAppl(transform._consId_1, new IStrategoTerm[]{term}), ejp.constNil0, ejp.constNone0}), termFactory.makeAppl(transform._consBlock_1, new IStrategoTerm[]{t_19})}), (IStrategoList)ejp.constNil0), (IStrategoList)ejp.constNil0));
      term = concat_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail27;
      term = termFactory.makeAppl(transform._consClassDec_2, new IStrategoTerm[]{termFactory.makeAppl(transform._consClassDecHead_5, new IStrategoTerm[]{ejp.constNil0, termFactory.makeAppl(transform._consId_1, new IStrategoTerm[]{o_19}), ejp.constNone0, ejp.constNone0, ejp.constNone0}), termFactory.makeAppl(transform._consClassBody_1, new IStrategoTerm[]{term})});
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}