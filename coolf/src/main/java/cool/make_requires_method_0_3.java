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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm t_53, IStrategoTerm u_53, IStrategoTerm v_53)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("make_requires_method_0_3");
    Fail296:
    { 
      IStrategoTerm w_53 = null;
      IStrategoTerm x_53 = null;
      IStrategoTerm y_53 = null;
      IStrategoTerm z_53 = null;
      IStrategoTerm a_54 = null;
      IStrategoTerm h_54 = null;
      if(term.getTermType() != IStrategoTerm.APPL || transform._consMethodSignature_2 != ((IStrategoAppl)term).getConstructor())
        break Fail296;
      IStrategoTerm arg153 = term.getSubterm(0);
      if(arg153.getTermType() != IStrategoTerm.APPL || transform._consId_1 != ((IStrategoAppl)arg153).getConstructor())
        break Fail296;
      w_53 = arg153.getSubterm(0);
      x_53 = term.getSubterm(1);
      a_54 = term;
      term = map_1_0.instance.invoke(context, x_53, pp_type_0_0.instance);
      if(term == null)
        break Fail296;
      term = map_1_0.instance.invoke(context, term, lifted107.instance);
      if(term == null)
        break Fail296;
      term = (IStrategoTerm)termFactory.makeListCons(termFactory.makeAppl(transform._consAnno_2, new IStrategoTerm[]{cool.constTypeName5, (IStrategoTerm)termFactory.makeListCons(termFactory.makeAppl(transform._consElemValPair_2, new IStrategoTerm[]{cool.constId19, termFactory.makeAppl(transform._consLit_1, new IStrategoTerm[]{termFactory.makeAppl(transform._consString_1, new IStrategoTerm[]{(IStrategoTerm)termFactory.makeListCons(termFactory.makeAppl(transform._consChars_1, new IStrategoTerm[]{w_53}), (IStrategoList)cool.constNil0)})})}), termFactory.makeListCons(cool.constElemValPair0, termFactory.makeListCons(termFactory.makeAppl(transform._consElemValPair_2, new IStrategoTerm[]{cool.constId18, termFactory.makeAppl(transform._consElemValArrayInit_1, new IStrategoTerm[]{term})}), (IStrategoList)cool.constNil0)))}), (IStrategoList)cool.constCons20);
      y_53 = term;
      term = gen_requires_method_name_0_1.instance.invoke(context, a_54, v_53);
      if(term == null)
        break Fail296;
      z_53 = term;
      h_54 = u_53;
      term = strip_annos_0_0.instance.invoke(context, a_54);
      if(term == null)
        break Fail296;
      term = hashtable_put_0_2.instance.invoke(context, h_54, term, z_53);
      if(term == null)
        break Fail296;
      term = hashtable_get_0_1.instance.invoke(context, t_53, a_54);
      if(term == null)
        break Fail296;
      term = termFactory.makeAppl(transform._consMethodDec_2, new IStrategoTerm[]{termFactory.makeAppl(transform._consMethodDecHead_6, new IStrategoTerm[]{y_53, cool.constNone0, cool.constBoolean0, termFactory.makeAppl(transform._consId_1, new IStrategoTerm[]{z_53}), cool.constNil0, cool.constNone0}), termFactory.makeAppl(transform._consBlock_1, new IStrategoTerm[]{(IStrategoTerm)termFactory.makeListCons(termFactory.makeAppl(transform._consReturn_1, new IStrategoTerm[]{termFactory.makeAppl(transform._consSome_1, new IStrategoTerm[]{term})}), (IStrategoList)cool.constNil0)})});
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}