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

@SuppressWarnings("all") public class make_unlock_method_0_3 extends Strategy 
{ 
  public static make_unlock_method_0_3 instance = new make_unlock_method_0_3();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm n_75, IStrategoTerm o_75, IStrategoTerm p_75)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("make_unlock_method_0_3");
    Fail310:
    { 
      IStrategoTerm q_75 = null;
      IStrategoTerm r_75 = null;
      IStrategoTerm s_75 = null;
      IStrategoTerm t_75 = null;
      IStrategoTerm u_75 = null;
      IStrategoTerm v_75 = null;
      IStrategoTerm b_76 = null;
      IStrategoTerm r_76 = null;
      IStrategoTerm s_76 = null;
      if(term.getTermType() != IStrategoTerm.APPL || transform._consMethodSignature_2 != ((IStrategoAppl)term).getConstructor())
        break Fail310;
      IStrategoTerm arg170 = term.getSubterm(0);
      if(arg170.getTermType() != IStrategoTerm.APPL || transform._consId_1 != ((IStrategoAppl)arg170).getConstructor())
        break Fail310;
      q_75 = arg170.getSubterm(0);
      r_75 = term.getSubterm(1);
      b_76 = term;
      IStrategoTerm term297 = term;
      Success252:
      { 
        Fail311:
        { 
          t_75 = term;
          term = map_1_0.instance.invoke(context, r_75, pp_type_0_0.instance);
          if(term == null)
            break Fail311;
          term = map_1_0.instance.invoke(context, term, lifted131.instance);
          if(term == null)
            break Fail311;
          term = (IStrategoTerm)termFactory.makeListCons(termFactory.makeAppl(transform._consAnno_2, new IStrategoTerm[]{cool.constTypeName8, (IStrategoTerm)termFactory.makeListCons(termFactory.makeAppl(transform._consElemValPair_2, new IStrategoTerm[]{cool.constId19, termFactory.makeAppl(transform._consLit_1, new IStrategoTerm[]{termFactory.makeAppl(transform._consString_1, new IStrategoTerm[]{(IStrategoTerm)termFactory.makeListCons(termFactory.makeAppl(transform._consChars_1, new IStrategoTerm[]{q_75}), (IStrategoList)cool.constNil0)})})}), termFactory.makeListCons(cool.constElemValPair0, termFactory.makeListCons(termFactory.makeAppl(transform._consElemValPair_2, new IStrategoTerm[]{cool.constId18, termFactory.makeAppl(transform._consElemValArrayInit_1, new IStrategoTerm[]{term})}), (IStrategoList)cool.constNil0)))}), (IStrategoList)cool.constCons37);
          s_75 = term;
          Success253:
          { 
            Fail312:
            { 
              IStrategoTerm y_75 = null;
              y_75 = term;
              term = hashtable_keys_0_0.instance.invoke(context, o_75);
              if(term == null)
                break Fail312;
              term = termFactory.makeTuple(t_75, term);
              term = elem_0_0.instance.invoke(context, term);
              if(term == null)
                break Fail312;
              term = y_75;
              { 
                term = hashtable_get_0_1.instance.invoke(context, o_75, t_75);
                if(term == null)
                  break Fail311;
                term = termFactory.makeAppl(transform._consExprStm_1, new IStrategoTerm[]{termFactory.makeAppl(transform._consInvoke_2, new IStrategoTerm[]{termFactory.makeAppl(transform._consMethod_1, new IStrategoTerm[]{termFactory.makeAppl(transform._consMethodName_1, new IStrategoTerm[]{termFactory.makeAppl(transform._consId_1, new IStrategoTerm[]{term})})}), cool.constCons19})});
                u_75 = term;
                if(true)
                  break Success253;
              }
            }
            term = cool.constNone0;
            u_75 = cool.constNone0;
          }
          term = gen_method_state_name_0_1.instance.invoke(context, t_75, p_75);
          if(term == null)
            break Fail311;
          term = termFactory.makeTuple((IStrategoTerm)termFactory.makeListCons(termFactory.makeAppl(transform._consExprStm_1, new IStrategoTerm[]{termFactory.makeAppl(transform._consInvoke_2, new IStrategoTerm[]{termFactory.makeAppl(transform._consMethod_1, new IStrategoTerm[]{termFactory.makeAppl(transform._consMethodName_2, new IStrategoTerm[]{termFactory.makeAppl(transform._consAmbName_1, new IStrategoTerm[]{termFactory.makeAppl(transform._consId_1, new IStrategoTerm[]{term})}), cool.constId27})}), cool.constCons24})}), (IStrategoList)cool.constNil0), (IStrategoTerm)termFactory.makeListCons(u_75, (IStrategoList)cool.constNil0), cool.constCons38);
          term = conc_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail311;
          v_75 = term;
          if(true)
            break Success252;
        }
        term = term297;
        IStrategoTerm q_76 = null;
        q_76 = term;
        term = report_with_failure_0_1.instance.invoke(context, q_76, cool.const123);
        if(term == null)
          break Fail310;
      }
      s_76 = b_76;
      term = (IStrategoTerm)termFactory.makeListCons(cool.const124, termFactory.makeListCons(q_75, (IStrategoList)cool.constNil0));
      term = concat_strings_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail310;
      r_76 = term;
      term = s_76;
      if(s_75 == null || v_75 == null)
        break Fail310;
      term = termFactory.makeAppl(transform._consMethodDec_2, new IStrategoTerm[]{termFactory.makeAppl(transform._consMethodDecHead_6, new IStrategoTerm[]{s_75, cool.constNone0, cool.constVoid0, termFactory.makeAppl(transform._consId_1, new IStrategoTerm[]{r_76}), (IStrategoTerm)termFactory.makeListCons(termFactory.makeAppl(transform._consParam_3, new IStrategoTerm[]{cool.constNil0, termFactory.makeAppl(transform._consTypeName_1, new IStrategoTerm[]{termFactory.makeAppl(transform._consId_1, new IStrategoTerm[]{n_75})}), cool.constId0}), (IStrategoList)cool.constNil0), cool.constNone0}), termFactory.makeAppl(transform._consBlock_1, new IStrategoTerm[]{v_75})});
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}