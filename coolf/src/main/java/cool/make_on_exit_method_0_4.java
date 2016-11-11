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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm c_55, IStrategoTerm d_55, IStrategoTerm e_55, IStrategoTerm f_55)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("make_on_exit_method_0_4");
    Fail298:
    { 
      IStrategoTerm g_55 = null;
      IStrategoTerm h_55 = null;
      IStrategoTerm i_55 = null;
      IStrategoTerm j_55 = null;
      IStrategoTerm k_55 = null;
      IStrategoTerm r_55 = null;
      if(term.getTermType() != IStrategoTerm.APPL || transform._consMethodSignature_2 != ((IStrategoAppl)term).getConstructor())
        break Fail298;
      IStrategoTerm arg155 = term.getSubterm(0);
      if(arg155.getTermType() != IStrategoTerm.APPL || transform._consId_1 != ((IStrategoAppl)arg155).getConstructor())
        break Fail298;
      g_55 = arg155.getSubterm(0);
      h_55 = term.getSubterm(1);
      k_55 = term;
      term = map_1_0.instance.invoke(context, h_55, pp_type_0_0.instance);
      if(term == null)
        break Fail298;
      term = map_1_0.instance.invoke(context, term, lifted111.instance);
      if(term == null)
        break Fail298;
      term = (IStrategoTerm)termFactory.makeListCons(termFactory.makeAppl(transform._consAnno_2, new IStrategoTerm[]{cool.constTypeName7, (IStrategoTerm)termFactory.makeListCons(termFactory.makeAppl(transform._consElemValPair_2, new IStrategoTerm[]{cool.constId19, termFactory.makeAppl(transform._consLit_1, new IStrategoTerm[]{termFactory.makeAppl(transform._consString_1, new IStrategoTerm[]{(IStrategoTerm)termFactory.makeListCons(termFactory.makeAppl(transform._consChars_1, new IStrategoTerm[]{g_55}), (IStrategoList)cool.constNil0)})})}), termFactory.makeListCons(cool.constElemValPair0, termFactory.makeListCons(termFactory.makeAppl(transform._consElemValPair_2, new IStrategoTerm[]{cool.constId18, termFactory.makeAppl(transform._consElemValArrayInit_1, new IStrategoTerm[]{term})}), (IStrategoList)cool.constNil0)))}), (IStrategoList)cool.constCons20);
      i_55 = term;
      term = gen_on_exit_method_name_0_1.instance.invoke(context, k_55, f_55);
      if(term == null)
        break Fail298;
      j_55 = term;
      r_55 = e_55;
      term = strip_annos_0_0.instance.invoke(context, k_55);
      if(term == null)
        break Fail298;
      term = hashtable_put_0_2.instance.invoke(context, r_55, term, j_55);
      if(term == null)
        break Fail298;
      term = hashtable_get_0_1.instance.invoke(context, c_55, k_55);
      if(term == null)
        break Fail298;
      term = termFactory.makeAppl(transform._consMethodDec_2, new IStrategoTerm[]{termFactory.makeAppl(transform._consMethodDecHead_6, new IStrategoTerm[]{i_55, cool.constNone0, cool.constVoid0, termFactory.makeAppl(transform._consId_1, new IStrategoTerm[]{j_55}), (IStrategoTerm)termFactory.makeListCons(termFactory.makeAppl(transform._consParam_3, new IStrategoTerm[]{cool.constNil0, termFactory.makeAppl(transform._consTypeName_1, new IStrategoTerm[]{termFactory.makeAppl(transform._consId_1, new IStrategoTerm[]{d_55})}), cool.constId0}), (IStrategoList)cool.constNil0), cool.constNone0}), term});
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}