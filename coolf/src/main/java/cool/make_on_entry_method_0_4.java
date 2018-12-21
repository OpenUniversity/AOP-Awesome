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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm b_41, IStrategoTerm c_41, IStrategoTerm d_41, IStrategoTerm e_41)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("make_on_entry_method_0_4");
    Fail195:
    { 
      IStrategoTerm f_41 = null;
      IStrategoTerm g_41 = null;
      IStrategoTerm h_41 = null;
      IStrategoTerm i_41 = null;
      IStrategoTerm j_41 = null;
      IStrategoTerm q_41 = null;
      if(term.getTermType() != IStrategoTerm.APPL || transform._consMethodSignature_2 != ((IStrategoAppl)term).getConstructor())
        break Fail195;
      IStrategoTerm arg161 = term.getSubterm(0);
      if(arg161.getTermType() != IStrategoTerm.APPL || transform._consId_1 != ((IStrategoAppl)arg161).getConstructor())
        break Fail195;
      f_41 = arg161.getSubterm(0);
      g_41 = term.getSubterm(1);
      j_41 = term;
      term = map_1_0.instance.invoke(context, g_41, pp_type_0_0.instance);
      if(term == null)
        break Fail195;
      term = map_1_0.instance.invoke(context, term, lifted107.instance);
      if(term == null)
        break Fail195;
      term = (IStrategoTerm)termFactory.makeListCons(termFactory.makeAppl(transform._consAnno_2, new IStrategoTerm[]{cool.constTypeName6, (IStrategoTerm)termFactory.makeListCons(termFactory.makeAppl(transform._consElemValPair_2, new IStrategoTerm[]{cool.constId19, termFactory.makeAppl(transform._consLit_1, new IStrategoTerm[]{termFactory.makeAppl(transform._consString_1, new IStrategoTerm[]{(IStrategoTerm)termFactory.makeListCons(termFactory.makeAppl(transform._consChars_1, new IStrategoTerm[]{f_41}), (IStrategoList)cool.constNil0)})})}), termFactory.makeListCons(cool.constElemValPair0, termFactory.makeListCons(termFactory.makeAppl(transform._consElemValPair_2, new IStrategoTerm[]{cool.constId18, termFactory.makeAppl(transform._consElemValArrayInit_1, new IStrategoTerm[]{term})}), (IStrategoList)cool.constNil0)))}), (IStrategoList)cool.constCons2);
      h_41 = term;
      term = gen_on_entry_method_name_0_1.instance.invoke(context, j_41, e_41);
      if(term == null)
        break Fail195;
      i_41 = term;
      q_41 = d_41;
      term = strip_annos_0_0.instance.invoke(context, j_41);
      if(term == null)
        break Fail195;
      term = hashtable_put_0_2.instance.invoke(context, q_41, term, i_41);
      if(term == null)
        break Fail195;
      term = hashtable_get_0_1.instance.invoke(context, b_41, j_41);
      if(term == null)
        break Fail195;
      term = termFactory.makeAppl(transform._consMethodDec_2, new IStrategoTerm[]{termFactory.makeAppl(transform._consMethodDecHead_6, new IStrategoTerm[]{h_41, cool.constNone0, cool.constVoid0, termFactory.makeAppl(transform._consId_1, new IStrategoTerm[]{i_41}), (IStrategoTerm)termFactory.makeListCons(termFactory.makeAppl(transform._consParam_3, new IStrategoTerm[]{cool.constNil0, termFactory.makeAppl(transform._consTypeName_1, new IStrategoTerm[]{termFactory.makeAppl(transform._consId_1, new IStrategoTerm[]{c_41})}), cool.constId0}), (IStrategoList)cool.constNil0), cool.constNone0}), term});
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}