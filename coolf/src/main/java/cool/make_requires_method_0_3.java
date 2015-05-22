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

@SuppressWarnings("all") public class make_requires_method_0_3 extends Strategy 
{ 
  public static make_requires_method_0_3 instance = new make_requires_method_0_3();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm c_39, IStrategoTerm d_39, IStrategoTerm e_39)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("make_requires_method_0_3");
    Fail187:
    { 
      IStrategoTerm f_39 = null;
      IStrategoTerm g_39 = null;
      IStrategoTerm h_39 = null;
      IStrategoTerm i_39 = null;
      IStrategoTerm j_39 = null;
      if(term.getTermType() != IStrategoTerm.APPL || transform._consMethodSignature_2 != ((IStrategoAppl)term).getConstructor())
        break Fail187;
      IStrategoTerm arg142 = term.getSubterm(0);
      if(arg142.getTermType() != IStrategoTerm.APPL || transform._consId_1 != ((IStrategoAppl)arg142).getConstructor())
        break Fail187;
      f_39 = arg142.getSubterm(0);
      g_39 = term.getSubterm(1);
      j_39 = term;
      term = map_1_0.instance.invoke(context, g_39, pp_type_0_0.instance);
      if(term == null)
        break Fail187;
      term = map_1_0.instance.invoke(context, term, lifted105.instance);
      if(term == null)
        break Fail187;
      term = (IStrategoTerm)termFactory.makeListCons(termFactory.makeAppl(transform._consAnno_2, new IStrategoTerm[]{cool.constTypeName5, (IStrategoTerm)termFactory.makeListCons(termFactory.makeAppl(transform._consElemValPair_2, new IStrategoTerm[]{cool.constId18, termFactory.makeAppl(transform._consLit_1, new IStrategoTerm[]{termFactory.makeAppl(transform._consString_1, new IStrategoTerm[]{(IStrategoTerm)termFactory.makeListCons(termFactory.makeAppl(transform._consChars_1, new IStrategoTerm[]{f_39}), (IStrategoList)cool.constNil0)})})}), termFactory.makeListCons(cool.constElemValPair0, termFactory.makeListCons(termFactory.makeAppl(transform._consElemValPair_2, new IStrategoTerm[]{cool.constId17, termFactory.makeAppl(transform._consElemValArrayInit_1, new IStrategoTerm[]{term})}), (IStrategoList)cool.constNil0)))}), (IStrategoList)cool.constCons2);
      h_39 = term;
      term = gen_requires_method_name_0_1.instance.invoke(context, j_39, e_39);
      if(term == null)
        break Fail187;
      i_39 = term;
      term = hashtable_put_0_2.instance.invoke(context, d_39, j_39, term);
      if(term == null)
        break Fail187;
      term = hashtable_get_0_1.instance.invoke(context, c_39, j_39);
      if(term == null)
        break Fail187;
      term = termFactory.makeAppl(transform._consMethodDec_2, new IStrategoTerm[]{termFactory.makeAppl(transform._consMethodDecHead_6, new IStrategoTerm[]{h_39, cool.constNone0, cool.constBoolean0, termFactory.makeAppl(transform._consId_1, new IStrategoTerm[]{i_39}), cool.constNil0, cool.constNone0}), termFactory.makeAppl(transform._consBlock_1, new IStrategoTerm[]{(IStrategoTerm)termFactory.makeListCons(termFactory.makeAppl(transform._consReturn_1, new IStrategoTerm[]{termFactory.makeAppl(transform._consSome_1, new IStrategoTerm[]{term})}), (IStrategoList)cool.constNil0)})});
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}