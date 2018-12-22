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

@SuppressWarnings("all") public class make_on_exit_method_0_4 extends Strategy 
{ 
  public static make_on_exit_method_0_4 instance = new make_on_exit_method_0_4();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm l_40, IStrategoTerm m_40, IStrategoTerm n_40, IStrategoTerm o_40)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("make_on_exit_method_0_4");
    Fail189:
    { 
      IStrategoTerm p_40 = null;
      IStrategoTerm q_40 = null;
      IStrategoTerm r_40 = null;
      IStrategoTerm s_40 = null;
      IStrategoTerm t_40 = null;
      IStrategoTerm a_41 = null;
      if(term.getTermType() != IStrategoTerm.APPL || transform._consMethodSignature_2 != ((IStrategoAppl)term).getConstructor())
        break Fail189;
      IStrategoTerm arg144 = term.getSubterm(0);
      if(arg144.getTermType() != IStrategoTerm.APPL || transform._consId_1 != ((IStrategoAppl)arg144).getConstructor())
        break Fail189;
      p_40 = arg144.getSubterm(0);
      q_40 = term.getSubterm(1);
      t_40 = term;
      term = map_1_0.instance.invoke(context, q_40, pp_type_0_0.instance);
      if(term == null)
        break Fail189;
      term = map_1_0.instance.invoke(context, term, lifted109.instance);
      if(term == null)
        break Fail189;
      term = (IStrategoTerm)termFactory.makeListCons(termFactory.makeAppl(transform._consAnno_2, new IStrategoTerm[]{cool.constTypeName7, (IStrategoTerm)termFactory.makeListCons(termFactory.makeAppl(transform._consElemValPair_2, new IStrategoTerm[]{cool.constId19, termFactory.makeAppl(transform._consLit_1, new IStrategoTerm[]{termFactory.makeAppl(transform._consString_1, new IStrategoTerm[]{(IStrategoTerm)termFactory.makeListCons(termFactory.makeAppl(transform._consChars_1, new IStrategoTerm[]{p_40}), (IStrategoList)cool.constNil0)})})}), termFactory.makeListCons(cool.constElemValPair0, termFactory.makeListCons(termFactory.makeAppl(transform._consElemValPair_2, new IStrategoTerm[]{cool.constId18, termFactory.makeAppl(transform._consElemValArrayInit_1, new IStrategoTerm[]{term})}), (IStrategoList)cool.constNil0)))}), (IStrategoList)cool.constCons2);
      r_40 = term;
      term = gen_on_exit_method_name_0_1.instance.invoke(context, t_40, o_40);
      if(term == null)
        break Fail189;
      s_40 = term;
      a_41 = n_40;
      term = strip_annos_0_0.instance.invoke(context, t_40);
      if(term == null)
        break Fail189;
      term = hashtable_put_0_2.instance.invoke(context, a_41, term, s_40);
      if(term == null)
        break Fail189;
      term = hashtable_get_0_1.instance.invoke(context, l_40, t_40);
      if(term == null)
        break Fail189;
      term = termFactory.makeAppl(transform._consMethodDec_2, new IStrategoTerm[]{termFactory.makeAppl(transform._consMethodDecHead_6, new IStrategoTerm[]{r_40, cool.constNone0, cool.constVoid0, termFactory.makeAppl(transform._consId_1, new IStrategoTerm[]{s_40}), (IStrategoTerm)termFactory.makeListCons(termFactory.makeAppl(transform._consParam_3, new IStrategoTerm[]{cool.constNil0, termFactory.makeAppl(transform._consTypeName_1, new IStrategoTerm[]{termFactory.makeAppl(transform._consId_1, new IStrategoTerm[]{m_40})}), cool.constId0}), (IStrategoList)cool.constNil0), cool.constNone0}), term});
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}