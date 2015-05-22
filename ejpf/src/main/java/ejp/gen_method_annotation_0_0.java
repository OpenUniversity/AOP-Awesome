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

@SuppressWarnings("all") public class gen_method_annotation_0_0 extends Strategy 
{ 
  public static gen_method_annotation_0_0 instance = new gen_method_annotation_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("gen_method_annotation_0_0");
    Fail28:
    { 
      IStrategoTerm o_20 = null;
      IStrategoTerm p_20 = null;
      IStrategoTerm q_20 = null;
      IStrategoTerm r_20 = null;
      if(term.getTermType() != IStrategoTerm.APPL || transform._consExplicitJoinPoint_3 != ((IStrategoAppl)term).getConstructor())
        break Fail28;
      p_20 = term.getSubterm(0);
      IStrategoTerm arg55 = term.getSubterm(1);
      if(arg55.getTermType() != IStrategoTerm.APPL || transform._consId_1 != ((IStrategoAppl)arg55).getConstructor())
        break Fail28;
      q_20 = arg55.getSubterm(0);
      o_20 = term.getSubterm(2);
      term = map_1_0.instance.invoke(context, o_20, fetch_type_0_0.instance);
      if(term == null)
        break Fail28;
      r_20 = term;
      term = pp_aspectj_string_0_0.instance.invoke(context, p_20);
      if(term == null)
        break Fail28;
      term = termFactory.makeAppl(transform._consAnno_2, new IStrategoTerm[]{ejp.constTypeName2, (IStrategoTerm)termFactory.makeListCons(termFactory.makeAppl(transform._consElemValPair_2, new IStrategoTerm[]{ejp.constId5, termFactory.makeAppl(transform._consElemValArrayInit_1, new IStrategoTerm[]{r_20})}), termFactory.makeListCons(termFactory.makeAppl(transform._consElemValPair_2, new IStrategoTerm[]{ejp.constId4, termFactory.makeAppl(transform._consLit_1, new IStrategoTerm[]{termFactory.makeAppl(transform._consString_1, new IStrategoTerm[]{(IStrategoTerm)termFactory.makeListCons(termFactory.makeAppl(transform._consChars_1, new IStrategoTerm[]{term}), (IStrategoList)ejp.constNil0)})})}), termFactory.makeListCons(termFactory.makeAppl(transform._consElemValPair_2, new IStrategoTerm[]{ejp.constId3, termFactory.makeAppl(transform._consLit_1, new IStrategoTerm[]{termFactory.makeAppl(transform._consString_1, new IStrategoTerm[]{(IStrategoTerm)termFactory.makeListCons(termFactory.makeAppl(transform._consChars_1, new IStrategoTerm[]{q_20}), (IStrategoList)ejp.constNil0)})})}), (IStrategoList)ejp.constNil0)))});
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}