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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm o_47, IStrategoTerm p_47, IStrategoTerm q_47)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("make_unlock_method_0_3");
    Fail209:
    { 
      IStrategoTerm r_47 = null;
      IStrategoTerm s_47 = null;
      IStrategoTerm t_47 = null;
      IStrategoTerm u_47 = null;
      IStrategoTerm v_47 = null;
      IStrategoTerm w_47 = null;
      IStrategoTerm a_48 = null;
      IStrategoTerm l_48 = null;
      IStrategoTerm m_48 = null;
      if(term.getTermType() != IStrategoTerm.APPL || transform._consMethodSignature_2 != ((IStrategoAppl)term).getConstructor())
        break Fail209;
      IStrategoTerm arg180 = term.getSubterm(0);
      if(arg180.getTermType() != IStrategoTerm.APPL || transform._consId_1 != ((IStrategoAppl)arg180).getConstructor())
        break Fail209;
      r_47 = arg180.getSubterm(0);
      s_47 = term.getSubterm(1);
      a_48 = term;
      IStrategoTerm term193 = term;
      Success151:
      { 
        Fail210:
        { 
          u_47 = term;
          term = map_1_0.instance.invoke(context, s_47, pp_type_0_0.instance);
          if(term == null)
            break Fail210;
          term = map_1_0.instance.invoke(context, term, lifted129.instance);
          if(term == null)
            break Fail210;
          term = (IStrategoTerm)termFactory.makeListCons(termFactory.makeAppl(transform._consAnno_2, new IStrategoTerm[]{cool.constTypeName8, (IStrategoTerm)termFactory.makeListCons(termFactory.makeAppl(transform._consElemValPair_2, new IStrategoTerm[]{cool.constId19, termFactory.makeAppl(transform._consLit_1, new IStrategoTerm[]{termFactory.makeAppl(transform._consString_1, new IStrategoTerm[]{(IStrategoTerm)termFactory.makeListCons(termFactory.makeAppl(transform._consChars_1, new IStrategoTerm[]{r_47}), (IStrategoList)cool.constNil0)})})}), termFactory.makeListCons(cool.constElemValPair0, termFactory.makeListCons(termFactory.makeAppl(transform._consElemValPair_2, new IStrategoTerm[]{cool.constId18, termFactory.makeAppl(transform._consElemValArrayInit_1, new IStrategoTerm[]{term})}), (IStrategoList)cool.constNil0)))}), (IStrategoList)cool.constCons19);
          t_47 = term;
          Success152:
          { 
            Fail211:
            { 
              IStrategoTerm y_47 = null;
              y_47 = term;
              term = hashtable_keys_0_0.instance.invoke(context, p_47);
              if(term == null)
                break Fail211;
              term = termFactory.makeTuple(u_47, term);
              term = elem_0_0.instance.invoke(context, term);
              if(term == null)
                break Fail211;
              term = y_47;
              { 
                term = hashtable_get_0_1.instance.invoke(context, p_47, u_47);
                if(term == null)
                  break Fail210;
                term = termFactory.makeAppl(transform._consExprStm_1, new IStrategoTerm[]{termFactory.makeAppl(transform._consInvoke_2, new IStrategoTerm[]{termFactory.makeAppl(transform._consMethod_1, new IStrategoTerm[]{termFactory.makeAppl(transform._consMethodName_1, new IStrategoTerm[]{termFactory.makeAppl(transform._consId_1, new IStrategoTerm[]{term})})}), cool.constCons1})});
                v_47 = term;
                if(true)
                  break Success152;
              }
            }
            term = cool.constNone0;
            v_47 = cool.constNone0;
          }
          term = gen_method_state_name_0_1.instance.invoke(context, u_47, q_47);
          if(term == null)
            break Fail210;
          term = termFactory.makeTuple((IStrategoTerm)termFactory.makeListCons(termFactory.makeAppl(transform._consExprStm_1, new IStrategoTerm[]{termFactory.makeAppl(transform._consInvoke_2, new IStrategoTerm[]{termFactory.makeAppl(transform._consMethod_1, new IStrategoTerm[]{termFactory.makeAppl(transform._consMethodName_2, new IStrategoTerm[]{termFactory.makeAppl(transform._consAmbName_1, new IStrategoTerm[]{termFactory.makeAppl(transform._consId_1, new IStrategoTerm[]{term})}), cool.constId32})}), cool.constCons7})}), (IStrategoList)cool.constNil0), (IStrategoTerm)termFactory.makeListCons(v_47, (IStrategoList)cool.constNil0), cool.constCons20);
          term = conc_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail210;
          w_47 = term;
          if(true)
            break Success151;
        }
        term = term193;
        IStrategoTerm k_48 = null;
        k_48 = term;
        term = report_with_failure_0_1.instance.invoke(context, k_48, cool.const64);
        if(term == null)
          break Fail209;
      }
      m_48 = a_48;
      term = (IStrategoTerm)termFactory.makeListCons(cool.const65, termFactory.makeListCons(r_47, (IStrategoList)cool.constNil0));
      term = concat_strings_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail209;
      l_48 = term;
      term = m_48;
      if(t_47 == null || w_47 == null)
        break Fail209;
      term = termFactory.makeAppl(transform._consMethodDec_2, new IStrategoTerm[]{termFactory.makeAppl(transform._consMethodDecHead_6, new IStrategoTerm[]{t_47, cool.constNone0, cool.constVoid0, termFactory.makeAppl(transform._consId_1, new IStrategoTerm[]{l_48}), (IStrategoTerm)termFactory.makeListCons(termFactory.makeAppl(transform._consParam_3, new IStrategoTerm[]{cool.constNil0, termFactory.makeAppl(transform._consTypeName_1, new IStrategoTerm[]{termFactory.makeAppl(transform._consId_1, new IStrategoTerm[]{o_47})}), cool.constId0}), (IStrategoList)cool.constNil0), cool.constNone0}), termFactory.makeAppl(transform._consBlock_1, new IStrategoTerm[]{w_47})});
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}