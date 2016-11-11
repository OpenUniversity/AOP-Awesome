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

@SuppressWarnings("all") public class make_on_entry_method_0_4 extends Strategy 
{ 
  public static make_on_entry_method_0_4 instance = new make_on_entry_method_0_4();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm k_54, IStrategoTerm l_54, IStrategoTerm m_54, IStrategoTerm n_54)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("make_on_entry_method_0_4");
    Fail297:
    { 
      IStrategoTerm o_54 = null;
      IStrategoTerm p_54 = null;
      IStrategoTerm q_54 = null;
      IStrategoTerm r_54 = null;
      IStrategoTerm s_54 = null;
      IStrategoTerm z_54 = null;
      if(term.getTermType() != IStrategoTerm.APPL || transform._consMethodSignature_2 != ((IStrategoAppl)term).getConstructor())
        break Fail297;
      IStrategoTerm arg154 = term.getSubterm(0);
      if(arg154.getTermType() != IStrategoTerm.APPL || transform._consId_1 != ((IStrategoAppl)arg154).getConstructor())
        break Fail297;
      o_54 = arg154.getSubterm(0);
      p_54 = term.getSubterm(1);
      s_54 = term;
      term = map_1_0.instance.invoke(context, p_54, pp_type_0_0.instance);
      if(term == null)
        break Fail297;
      term = map_1_0.instance.invoke(context, term, lifted109.instance);
      if(term == null)
        break Fail297;
      term = (IStrategoTerm)termFactory.makeListCons(termFactory.makeAppl(transform._consAnno_2, new IStrategoTerm[]{cool.constTypeName6, (IStrategoTerm)termFactory.makeListCons(termFactory.makeAppl(transform._consElemValPair_2, new IStrategoTerm[]{cool.constId19, termFactory.makeAppl(transform._consLit_1, new IStrategoTerm[]{termFactory.makeAppl(transform._consString_1, new IStrategoTerm[]{(IStrategoTerm)termFactory.makeListCons(termFactory.makeAppl(transform._consChars_1, new IStrategoTerm[]{o_54}), (IStrategoList)cool.constNil0)})})}), termFactory.makeListCons(cool.constElemValPair0, termFactory.makeListCons(termFactory.makeAppl(transform._consElemValPair_2, new IStrategoTerm[]{cool.constId18, termFactory.makeAppl(transform._consElemValArrayInit_1, new IStrategoTerm[]{term})}), (IStrategoList)cool.constNil0)))}), (IStrategoList)cool.constCons20);
      q_54 = term;
      term = gen_on_entry_method_name_0_1.instance.invoke(context, s_54, n_54);
      if(term == null)
        break Fail297;
      r_54 = term;
      z_54 = m_54;
      term = strip_annos_0_0.instance.invoke(context, s_54);
      if(term == null)
        break Fail297;
      term = hashtable_put_0_2.instance.invoke(context, z_54, term, r_54);
      if(term == null)
        break Fail297;
      term = hashtable_get_0_1.instance.invoke(context, k_54, s_54);
      if(term == null)
        break Fail297;
      term = termFactory.makeAppl(transform._consMethodDec_2, new IStrategoTerm[]{termFactory.makeAppl(transform._consMethodDecHead_6, new IStrategoTerm[]{q_54, cool.constNone0, cool.constVoid0, termFactory.makeAppl(transform._consId_1, new IStrategoTerm[]{r_54}), (IStrategoTerm)termFactory.makeListCons(termFactory.makeAppl(transform._consParam_3, new IStrategoTerm[]{cool.constNil0, termFactory.makeAppl(transform._consTypeName_1, new IStrategoTerm[]{termFactory.makeAppl(transform._consId_1, new IStrategoTerm[]{l_54})}), cool.constId0}), (IStrategoList)cool.constNil0), cool.constNone0}), term});
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}