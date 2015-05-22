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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm v_19, IStrategoTerm w_19, IStrategoTerm x_19, IStrategoTerm y_19, IStrategoTerm z_19)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("gen_auxilery_class_0_5");
    Fail27:
    { 
      IStrategoTerm d_20 = null;
      IStrategoTerm i_20 = null;
      IStrategoTerm j_20 = null;
      d_20 = term;
      term = x_19;
      if(term.getTermType() != IStrategoTerm.APPL || transform._consExplicitJoinPoint_3 != ((IStrategoAppl)term).getConstructor())
        break Fail27;
      term = gen_compact_var_declaration_0_2.instance.invoke(context, term, v_19, w_19);
      if(term == null)
        break Fail27;
      i_20 = term;
      term = gen_method_annotation_0_0.instance.invoke(context, x_19);
      if(term == null)
        break Fail27;
      j_20 = term;
      term = gen__ejpscope__method__name_0_0.instance.invoke(context, x_19);
      if(term == null)
        break Fail27;
      term = (IStrategoTerm)termFactory.makeListCons(i_20, termFactory.makeListCons((IStrategoTerm)termFactory.makeListCons(termFactory.makeAppl(transform._consMethodDec_2, new IStrategoTerm[]{termFactory.makeAppl(transform._consMethodDecHead_6, new IStrategoTerm[]{(IStrategoTerm)termFactory.makeListCons(termFactory.makeAppl(transform._consSingleElemAnno_2, new IStrategoTerm[]{ejp.constTypeName1, termFactory.makeAppl(transform._consLit_1, new IStrategoTerm[]{termFactory.makeAppl(transform._consDeci_1, new IStrategoTerm[]{z_19})})}), termFactory.makeListCons(j_20, (IStrategoList)ejp.constNil0)), ejp.constNone0, ejp.constVoid0, termFactory.makeAppl(transform._consId_1, new IStrategoTerm[]{term}), ejp.constNil0, ejp.constNone0}), termFactory.makeAppl(transform._consBlock_1, new IStrategoTerm[]{d_20})}), (IStrategoList)ejp.constNil0), (IStrategoList)ejp.constNil0));
      term = concat_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail27;
      term = termFactory.makeAppl(transform._consClassDec_2, new IStrategoTerm[]{termFactory.makeAppl(transform._consClassDecHead_5, new IStrategoTerm[]{ejp.constNil0, termFactory.makeAppl(transform._consId_1, new IStrategoTerm[]{y_19}), ejp.constNone0, ejp.constNone0, ejp.constNone0}), termFactory.makeAppl(transform._consClassBody_1, new IStrategoTerm[]{term})});
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}