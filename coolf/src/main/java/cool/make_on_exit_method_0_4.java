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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm t_41, IStrategoTerm u_41, IStrategoTerm v_41, IStrategoTerm w_41)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("make_on_exit_method_0_4");
    Fail196:
    { 
      IStrategoTerm x_41 = null;
      IStrategoTerm y_41 = null;
      IStrategoTerm z_41 = null;
      IStrategoTerm a_42 = null;
      IStrategoTerm b_42 = null;
      IStrategoTerm i_42 = null;
      if(term.getTermType() != IStrategoTerm.APPL || transform._consMethodSignature_2 != ((IStrategoAppl)term).getConstructor())
        break Fail196;
      IStrategoTerm arg162 = term.getSubterm(0);
      if(arg162.getTermType() != IStrategoTerm.APPL || transform._consId_1 != ((IStrategoAppl)arg162).getConstructor())
        break Fail196;
      x_41 = arg162.getSubterm(0);
      y_41 = term.getSubterm(1);
      b_42 = term;
      term = map_1_0.instance.invoke(context, y_41, pp_type_0_0.instance);
      if(term == null)
        break Fail196;
      term = map_1_0.instance.invoke(context, term, lifted109.instance);
      if(term == null)
        break Fail196;
      term = (IStrategoTerm)termFactory.makeListCons(termFactory.makeAppl(transform._consAnno_2, new IStrategoTerm[]{cool.constTypeName7, (IStrategoTerm)termFactory.makeListCons(termFactory.makeAppl(transform._consElemValPair_2, new IStrategoTerm[]{cool.constId19, termFactory.makeAppl(transform._consLit_1, new IStrategoTerm[]{termFactory.makeAppl(transform._consString_1, new IStrategoTerm[]{(IStrategoTerm)termFactory.makeListCons(termFactory.makeAppl(transform._consChars_1, new IStrategoTerm[]{x_41}), (IStrategoList)cool.constNil0)})})}), termFactory.makeListCons(cool.constElemValPair0, termFactory.makeListCons(termFactory.makeAppl(transform._consElemValPair_2, new IStrategoTerm[]{cool.constId18, termFactory.makeAppl(transform._consElemValArrayInit_1, new IStrategoTerm[]{term})}), (IStrategoList)cool.constNil0)))}), (IStrategoList)cool.constCons2);
      z_41 = term;
      term = gen_on_exit_method_name_0_1.instance.invoke(context, b_42, w_41);
      if(term == null)
        break Fail196;
      a_42 = term;
      i_42 = v_41;
      term = strip_annos_0_0.instance.invoke(context, b_42);
      if(term == null)
        break Fail196;
      term = hashtable_put_0_2.instance.invoke(context, i_42, term, a_42);
      if(term == null)
        break Fail196;
      term = hashtable_get_0_1.instance.invoke(context, t_41, b_42);
      if(term == null)
        break Fail196;
      term = termFactory.makeAppl(transform._consMethodDec_2, new IStrategoTerm[]{termFactory.makeAppl(transform._consMethodDecHead_6, new IStrategoTerm[]{z_41, cool.constNone0, cool.constVoid0, termFactory.makeAppl(transform._consId_1, new IStrategoTerm[]{a_42}), (IStrategoTerm)termFactory.makeListCons(termFactory.makeAppl(transform._consParam_3, new IStrategoTerm[]{cool.constNil0, termFactory.makeAppl(transform._consTypeName_1, new IStrategoTerm[]{termFactory.makeAppl(transform._consId_1, new IStrategoTerm[]{u_41})}), cool.constId0}), (IStrategoList)cool.constNil0), cool.constNone0}), term});
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}