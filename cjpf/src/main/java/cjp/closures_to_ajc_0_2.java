package cjp;

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

@SuppressWarnings("all") public class closures_to_ajc_0_2 extends Strategy 
{ 
  public static closures_to_ajc_0_2 instance = new closures_to_ajc_0_2();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm r_40, IStrategoTerm s_40)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("closures_to_ajc_0_2");
    Fail119:
    { 
      IStrategoTerm term110 = term;
      Success107:
      { 
        Fail120:
        { 
          IStrategoTerm p_24 = null;
          IStrategoTerm q_24 = null;
          IStrategoTerm r_24 = null;
          IStrategoTerm s_24 = null;
          IStrategoTerm u_24 = null;
          if(term.getTermType() != IStrategoTerm.APPL || transform._consJoinpointDeclaration_4 != ((IStrategoAppl)term).getConstructor())
            break Fail120;
          p_24 = term.getSubterm(0);
          q_24 = term.getSubterm(1);
          r_24 = term.getSubterm(2);
          s_24 = term.getSubterm(3);
          term = strip_annos_0_0.instance.invoke(context, q_24);
          if(term == null)
            break Fail120;
          u_24 = term;
          term = joinpoint_params_to_string_0_0.instance.invoke(context, r_24);
          if(term == null)
            break Fail120;
          term = joinpoint_0_3.instance.invoke(context, u_24, term, p_24, s_24);
          if(term == null)
            break Fail120;
          term = termFactory.makeAppl(transform._consMethodDec_2, new IStrategoTerm[]{termFactory.makeAppl(transform._consMethodDecHead_6, new IStrategoTerm[]{cjp.constCons23, cjp.constNone0, p_24, q_24, r_24, s_24}), cjp.constBlock0});
          if(true)
            break Success107;
        }
        term = term110;
        IStrategoTerm term111 = term;
        Success108:
        { 
          Fail121:
          { 
            IStrategoTerm l_23 = null;
            IStrategoTerm m_23 = null;
            IStrategoTerm n_23 = null;
            TermReference o_23 = new TermReference();
            IStrategoTerm p_23 = null;
            IStrategoTerm t_23 = null;
            IStrategoTerm y_23 = null;
            IStrategoTerm z_23 = null;
            IStrategoTerm u_23 = null;
            IStrategoTerm h_24 = null;
            IStrategoTerm v_23 = null;
            IStrategoTerm k_24 = null;
            IStrategoTerm w_23 = null;
            IStrategoTerm l_24 = null;
            IStrategoTerm x_23 = null;
            IStrategoTerm m_24 = null;
            if(term.getTermType() != IStrategoTerm.APPL || transform._consCJPAdvice_4 != ((IStrategoAppl)term).getConstructor())
              break Fail121;
            IStrategoTerm arg65 = term.getSubterm(1);
            if(arg65.getTermType() != IStrategoTerm.APPL || transform._consCJPAround_3 != ((IStrategoAppl)arg65).getConstructor())
              break Fail121;
            if(o_23.value == null)
              o_23.value = arg65.getSubterm(0);
            else
              if(o_23.value != arg65.getSubterm(0) && !o_23.value.match(arg65.getSubterm(0)))
                break Fail121;
            IStrategoTerm arg66 = arg65.getSubterm(1);
            if(arg66.getTermType() != IStrategoTerm.APPL || transform._consId_1 != ((IStrategoAppl)arg66).getConstructor())
              break Fail121;
            l_23 = arg66.getSubterm(0);
            m_23 = arg65.getSubterm(2);
            n_23 = term.getSubterm(2);
            p_23 = term.getSubterm(3);
            y_23 = term;
            term = map_1_0.instance.invoke(context, m_23, lifted15.instance);
            if(term == null)
              break Fail121;
            z_23 = term;
            term = map_1_0.instance.invoke(context, m_23, lifted16.instance);
            if(term == null)
              break Fail121;
            term = termFactory.makeAppl(transform._consAndComp_2, new IStrategoTerm[]{termFactory.makeAppl(transform._consCall_1, new IStrategoTerm[]{termFactory.makeAppl(transform._consMethodPattern_6, new IStrategoTerm[]{cjp.constAnnoPattern0, cjp.constModPattern0, cjp.constRefTypePattern0, termFactory.makeAppl(transform._consMemberName_1, new IStrategoTerm[]{l_23}), z_23, cjp.constNone0})}), termFactory.makeAppl(transform._consArgs_1, new IStrategoTerm[]{term})});
            term = pp_aspectj_string_0_0.instance.invoke(context, term);
            if(term == null)
              break Fail121;
            t_23 = term;
            h_24 = y_23;
            term = map_1_0.instance.invoke(context, m_23, lifted17.instance);
            if(term == null)
              break Fail121;
            u_23 = term;
            k_24 = h_24;
            term = gen_synthetic_method_name_0_0.instance.invoke(context, l_23);
            if(term == null)
              break Fail121;
            v_23 = term;
            l_24 = k_24;
            term = termFactory.makeTuple(m_23, cjp.constCons25);
            term = conc_0_0.instance.invoke(context, term);
            if(term == null)
              break Fail121;
            w_23 = term;
            m_24 = l_24;
            term = p_23;
            lifted18 lifted180 = new lifted18();
            lifted180.o_23 = o_23;
            term = topdown_1_0.instance.invoke(context, term, lifted180);
            if(term == null)
              break Fail121;
            x_23 = term;
            term = m_24;
            if(o_23.value == null)
              break Fail121;
            term = termFactory.makeAppl(transform._consMethodDec_2, new IStrategoTerm[]{termFactory.makeAppl(transform._consMethodDecHead_6, new IStrategoTerm[]{(IStrategoTerm)termFactory.makeListCons(termFactory.makeAppl(transform._consSingleElemAnno_2, new IStrategoTerm[]{cjp.constTypeName9, termFactory.makeAppl(transform._consLit_1, new IStrategoTerm[]{termFactory.makeAppl(transform._consString_1, new IStrategoTerm[]{(IStrategoTerm)termFactory.makeListCons(termFactory.makeAppl(transform._consChars_1, new IStrategoTerm[]{t_23}), (IStrategoList)cjp.constNil0)})})}), termFactory.makeListCons(termFactory.makeAppl(transform._consAnno_2, new IStrategoTerm[]{cjp.constTypeName2, (IStrategoTerm)termFactory.makeListCons(termFactory.makeAppl(transform._consElemValPair_2, new IStrategoTerm[]{cjp.constId5, termFactory.makeAppl(transform._consElemValArrayInit_1, new IStrategoTerm[]{u_23})}), termFactory.makeListCons(termFactory.makeAppl(transform._consElemValPair_2, new IStrategoTerm[]{cjp.constId4, termFactory.makeAppl(transform._consLit_1, new IStrategoTerm[]{termFactory.makeAppl(transform._consString_1, new IStrategoTerm[]{(IStrategoTerm)termFactory.makeListCons(termFactory.makeAppl(transform._consChars_1, new IStrategoTerm[]{l_23}), (IStrategoList)cjp.constNil0)})})}), (IStrategoList)cjp.constNil0))}), (IStrategoList)cjp.constCons20)), cjp.constNone0, o_23.value, termFactory.makeAppl(transform._consId_1, new IStrategoTerm[]{v_23}), w_23, n_23}), x_23});
            if(true)
              break Success108;
          }
          term = term111;
          IStrategoTerm term112 = term;
          Success109:
          { 
            Fail122:
            { 
              IStrategoTerm j_22 = null;
              IStrategoTerm k_22 = null;
              IStrategoTerm l_22 = null;
              IStrategoTerm m_22 = null;
              IStrategoTerm q_22 = null;
              IStrategoTerm v_22 = null;
              IStrategoTerm r_22 = null;
              IStrategoTerm s_22 = null;
              if(term.getTermType() != IStrategoTerm.APPL || transform._consCJPAdvice_4 != ((IStrategoAppl)term).getConstructor())
                break Fail122;
              IStrategoTerm arg73 = term.getSubterm(1);
              if(arg73.getTermType() != IStrategoTerm.APPL || transform._consCJPBefore_2 != ((IStrategoAppl)arg73).getConstructor())
                break Fail122;
              IStrategoTerm arg74 = arg73.getSubterm(0);
              if(arg74.getTermType() != IStrategoTerm.APPL || transform._consId_1 != ((IStrategoAppl)arg74).getConstructor())
                break Fail122;
              j_22 = arg74.getSubterm(0);
              k_22 = arg73.getSubterm(1);
              l_22 = term.getSubterm(2);
              m_22 = term.getSubterm(3);
              term = map_1_0.instance.invoke(context, k_22, lifted20.instance);
              if(term == null)
                break Fail122;
              v_22 = term;
              term = map_1_0.instance.invoke(context, k_22, lifted21.instance);
              if(term == null)
                break Fail122;
              term = termFactory.makeAppl(transform._consAndComp_2, new IStrategoTerm[]{termFactory.makeAppl(transform._consCall_1, new IStrategoTerm[]{termFactory.makeAppl(transform._consMethodPattern_6, new IStrategoTerm[]{cjp.constAnnoPattern0, cjp.constModPattern0, cjp.constRefTypePattern0, termFactory.makeAppl(transform._consMemberName_1, new IStrategoTerm[]{j_22}), v_22, cjp.constNone0})}), termFactory.makeAppl(transform._consArgs_1, new IStrategoTerm[]{term})});
              term = pp_aspectj_string_0_0.instance.invoke(context, term);
              if(term == null)
                break Fail122;
              q_22 = term;
              term = map_1_0.instance.invoke(context, k_22, lifted22.instance);
              if(term == null)
                break Fail122;
              r_22 = term;
              term = gen_synthetic_method_name_0_0.instance.invoke(context, j_22);
              if(term == null)
                break Fail122;
              s_22 = term;
              term = termFactory.makeTuple(k_22, cjp.constCons19);
              term = conc_0_0.instance.invoke(context, term);
              if(term == null)
                break Fail122;
              term = termFactory.makeAppl(transform._consMethodDec_2, new IStrategoTerm[]{termFactory.makeAppl(transform._consMethodDecHead_6, new IStrategoTerm[]{(IStrategoTerm)termFactory.makeListCons(termFactory.makeAppl(transform._consSingleElemAnno_2, new IStrategoTerm[]{cjp.constTypeName10, termFactory.makeAppl(transform._consLit_1, new IStrategoTerm[]{termFactory.makeAppl(transform._consString_1, new IStrategoTerm[]{(IStrategoTerm)termFactory.makeListCons(termFactory.makeAppl(transform._consChars_1, new IStrategoTerm[]{q_22}), (IStrategoList)cjp.constNil0)})})}), termFactory.makeListCons(termFactory.makeAppl(transform._consAnno_2, new IStrategoTerm[]{cjp.constTypeName2, (IStrategoTerm)termFactory.makeListCons(termFactory.makeAppl(transform._consElemValPair_2, new IStrategoTerm[]{cjp.constId5, termFactory.makeAppl(transform._consElemValArrayInit_1, new IStrategoTerm[]{r_22})}), termFactory.makeListCons(termFactory.makeAppl(transform._consElemValPair_2, new IStrategoTerm[]{cjp.constId4, termFactory.makeAppl(transform._consLit_1, new IStrategoTerm[]{termFactory.makeAppl(transform._consString_1, new IStrategoTerm[]{(IStrategoTerm)termFactory.makeListCons(termFactory.makeAppl(transform._consChars_1, new IStrategoTerm[]{j_22}), (IStrategoList)cjp.constNil0)})})}), (IStrategoList)cjp.constNil0))}), (IStrategoList)cjp.constCons20)), cjp.constNone0, cjp.constVoid0, termFactory.makeAppl(transform._consId_1, new IStrategoTerm[]{s_22}), term, l_22}), m_22});
              if(true)
                break Success109;
            }
            term = term112;
            term = closures_to_ajc_0_2_fragment_0.instance.invoke(context, term);
            if(term == null)
              break Fail119;
          }
        }
      }
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}