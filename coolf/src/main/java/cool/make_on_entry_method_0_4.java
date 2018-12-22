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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm t_39, IStrategoTerm u_39, IStrategoTerm v_39, IStrategoTerm w_39)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("make_on_entry_method_0_4");
    Fail188:
    { 
      IStrategoTerm x_39 = null;
      IStrategoTerm y_39 = null;
      IStrategoTerm z_39 = null;
      IStrategoTerm a_40 = null;
      IStrategoTerm b_40 = null;
      IStrategoTerm i_40 = null;
      if(term.getTermType() != IStrategoTerm.APPL || transform._consMethodSignature_2 != ((IStrategoAppl)term).getConstructor())
        break Fail188;
      IStrategoTerm arg143 = term.getSubterm(0);
      if(arg143.getTermType() != IStrategoTerm.APPL || transform._consId_1 != ((IStrategoAppl)arg143).getConstructor())
        break Fail188;
      x_39 = arg143.getSubterm(0);
      y_39 = term.getSubterm(1);
      b_40 = term;
      term = map_1_0.instance.invoke(context, y_39, pp_type_0_0.instance);
      if(term == null)
        break Fail188;
      term = map_1_0.instance.invoke(context, term, lifted107.instance);
      if(term == null)
        break Fail188;
      term = (IStrategoTerm)termFactory.makeListCons(termFactory.makeAppl(transform._consAnno_2, new IStrategoTerm[]{cool.constTypeName6, (IStrategoTerm)termFactory.makeListCons(termFactory.makeAppl(transform._consElemValPair_2, new IStrategoTerm[]{cool.constId19, termFactory.makeAppl(transform._consLit_1, new IStrategoTerm[]{termFactory.makeAppl(transform._consString_1, new IStrategoTerm[]{(IStrategoTerm)termFactory.makeListCons(termFactory.makeAppl(transform._consChars_1, new IStrategoTerm[]{x_39}), (IStrategoList)cool.constNil0)})})}), termFactory.makeListCons(cool.constElemValPair0, termFactory.makeListCons(termFactory.makeAppl(transform._consElemValPair_2, new IStrategoTerm[]{cool.constId18, termFactory.makeAppl(transform._consElemValArrayInit_1, new IStrategoTerm[]{term})}), (IStrategoList)cool.constNil0)))}), (IStrategoList)cool.constCons2);
      z_39 = term;
      term = gen_on_entry_method_name_0_1.instance.invoke(context, b_40, w_39);
      if(term == null)
        break Fail188;
      a_40 = term;
      i_40 = v_39;
      term = strip_annos_0_0.instance.invoke(context, b_40);
      if(term == null)
        break Fail188;
      term = hashtable_put_0_2.instance.invoke(context, i_40, term, a_40);
      if(term == null)
        break Fail188;
      term = hashtable_get_0_1.instance.invoke(context, t_39, b_40);
      if(term == null)
        break Fail188;
      term = termFactory.makeAppl(transform._consMethodDec_2, new IStrategoTerm[]{termFactory.makeAppl(transform._consMethodDecHead_6, new IStrategoTerm[]{z_39, cool.constNone0, cool.constVoid0, termFactory.makeAppl(transform._consId_1, new IStrategoTerm[]{a_40}), (IStrategoTerm)termFactory.makeListCons(termFactory.makeAppl(transform._consParam_3, new IStrategoTerm[]{cool.constNil0, termFactory.makeAppl(transform._consTypeName_1, new IStrategoTerm[]{termFactory.makeAppl(transform._consId_1, new IStrategoTerm[]{u_39})}), cool.constId0}), (IStrategoList)cool.constNil0), cool.constNone0}), term});
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}