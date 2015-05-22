package ejp;

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

@SuppressWarnings("all") final class ejp_to_ajc_0_3_fragment_0 extends Strategy 
{ 
  TermReference t_77;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    Fail277:
    { 
      IStrategoTerm term53 = term;
      IStrategoConstructor cons27 = term.getTermType() == IStrategoTerm.APPL ? ((IStrategoAppl)term).getConstructor() : null;
      Success185:
      { 
        if(cons27 == transform._consDecNoMatch_4)
        { 
          Fail278:
          { 
            IStrategoTerm t_34 = null;
            IStrategoTerm u_34 = null;
            IStrategoTerm v_34 = null;
            IStrategoTerm w_34 = null;
            IStrategoTerm z_34 = null;
            IStrategoTerm x_34 = null;
            IStrategoTerm a_35 = null;
            IStrategoTerm arg111 = term.getSubterm(0);
            if(arg111.getTermType() != IStrategoTerm.APPL || transform._consByPackageGranularity_0 != ((IStrategoAppl)arg111).getConstructor())
              break Fail278;
            v_34 = term.getSubterm(1);
            t_34 = term.getSubterm(2);
            u_34 = term.getSubterm(3);
            z_34 = term;
            term = pp_aspectj_string_0_0.instance.invoke(context, t_34);
            if(term == null)
              break Fail278;
            w_34 = term;
            a_35 = z_34;
            term = pp_aspectj_string_0_0.instance.invoke(context, v_34);
            if(term == null)
              break Fail278;
            term = (IStrategoTerm)termFactory.makeListCons(ejp.const24, termFactory.makeListCons(term, (IStrategoList)ejp.constNil0));
            term = concat_strings_0_0.instance.invoke(context, term);
            if(term == null)
              break Fail278;
            x_34 = term;
            term = a_35;
            term = gen__nomatch__pointcut__name_0_0.instance.invoke(context, term);
            if(term == null)
              break Fail278;
            term = termFactory.makeAppl(transform._consMethodDec_2, new IStrategoTerm[]{termFactory.makeAppl(transform._consMethodDecHead_6, new IStrategoTerm[]{(IStrategoTerm)termFactory.makeListCons(termFactory.makeAppl(transform._consAnno_2, new IStrategoTerm[]{ejp.constTypeName9, (IStrategoTerm)termFactory.makeListCons(termFactory.makeAppl(transform._consElemValPair_2, new IStrategoTerm[]{ejp.constId7, termFactory.makeAppl(transform._consLit_1, new IStrategoTerm[]{termFactory.makeAppl(transform._consString_1, new IStrategoTerm[]{(IStrategoTerm)termFactory.makeListCons(termFactory.makeAppl(transform._consChars_1, new IStrategoTerm[]{w_34}), (IStrategoList)ejp.constNil0)})})}), termFactory.makeListCons(termFactory.makeAppl(transform._consElemValPair_2, new IStrategoTerm[]{ejp.constId20, termFactory.makeAppl(transform._consLit_1, new IStrategoTerm[]{u_34})}), (IStrategoList)ejp.constCons13))}), termFactory.makeListCons(termFactory.makeAppl(transform._consSingleElemAnno_2, new IStrategoTerm[]{ejp.constTypeName8, termFactory.makeAppl(transform._consLit_1, new IStrategoTerm[]{termFactory.makeAppl(transform._consString_1, new IStrategoTerm[]{(IStrategoTerm)termFactory.makeListCons(termFactory.makeAppl(transform._consChars_1, new IStrategoTerm[]{x_34}), (IStrategoList)ejp.constNil0)})})}), (IStrategoList)ejp.constCons11)), ejp.constNone0, ejp.constVoid0, termFactory.makeAppl(transform._consId_1, new IStrategoTerm[]{term}), ejp.constCons14, ejp.constNone0}), ejp.constBlock0});
            if(true)
              break Success185;
          }
          term = term53;
        }
        Success186:
        { 
          if(cons27 == transform._consDecNoMatch_4)
          { 
            Fail279:
            { 
              IStrategoTerm f_34 = null;
              IStrategoTerm g_34 = null;
              IStrategoTerm h_34 = null;
              IStrategoTerm i_34 = null;
              IStrategoTerm l_34 = null;
              IStrategoTerm j_34 = null;
              IStrategoTerm m_34 = null;
              IStrategoTerm arg112 = term.getSubterm(0);
              if(arg112.getTermType() != IStrategoTerm.APPL || transform._consByClassGranularity_0 != ((IStrategoAppl)arg112).getConstructor())
                break Fail279;
              h_34 = term.getSubterm(1);
              f_34 = term.getSubterm(2);
              g_34 = term.getSubterm(3);
              l_34 = term;
              term = pp_aspectj_string_0_0.instance.invoke(context, f_34);
              if(term == null)
                break Fail279;
              i_34 = term;
              m_34 = l_34;
              term = pp_aspectj_string_0_0.instance.invoke(context, h_34);
              if(term == null)
                break Fail279;
              term = (IStrategoTerm)termFactory.makeListCons(ejp.const24, termFactory.makeListCons(term, (IStrategoList)ejp.constNil0));
              term = concat_strings_0_0.instance.invoke(context, term);
              if(term == null)
                break Fail279;
              j_34 = term;
              term = m_34;
              term = gen__nomatch__pointcut__name_0_0.instance.invoke(context, term);
              if(term == null)
                break Fail279;
              term = termFactory.makeAppl(transform._consMethodDec_2, new IStrategoTerm[]{termFactory.makeAppl(transform._consMethodDecHead_6, new IStrategoTerm[]{(IStrategoTerm)termFactory.makeListCons(termFactory.makeAppl(transform._consAnno_2, new IStrategoTerm[]{ejp.constTypeName9, (IStrategoTerm)termFactory.makeListCons(termFactory.makeAppl(transform._consElemValPair_2, new IStrategoTerm[]{ejp.constId7, termFactory.makeAppl(transform._consLit_1, new IStrategoTerm[]{termFactory.makeAppl(transform._consString_1, new IStrategoTerm[]{(IStrategoTerm)termFactory.makeListCons(termFactory.makeAppl(transform._consChars_1, new IStrategoTerm[]{i_34}), (IStrategoList)ejp.constNil0)})})}), termFactory.makeListCons(termFactory.makeAppl(transform._consElemValPair_2, new IStrategoTerm[]{ejp.constId20, termFactory.makeAppl(transform._consLit_1, new IStrategoTerm[]{g_34})}), (IStrategoList)ejp.constCons16))}), termFactory.makeListCons(termFactory.makeAppl(transform._consSingleElemAnno_2, new IStrategoTerm[]{ejp.constTypeName8, termFactory.makeAppl(transform._consLit_1, new IStrategoTerm[]{termFactory.makeAppl(transform._consString_1, new IStrategoTerm[]{(IStrategoTerm)termFactory.makeListCons(termFactory.makeAppl(transform._consChars_1, new IStrategoTerm[]{j_34}), (IStrategoList)ejp.constNil0)})})}), (IStrategoList)ejp.constCons11)), ejp.constNone0, ejp.constVoid0, termFactory.makeAppl(transform._consId_1, new IStrategoTerm[]{term}), ejp.constCons14, ejp.constNone0}), ejp.constBlock0});
              if(true)
                break Success186;
            }
            term = term53;
          }
          Success187:
          { 
            if(cons27 == transform._consDecNoMatch_4)
            { 
              Fail280:
              { 
                IStrategoTerm r_33 = null;
                IStrategoTerm s_33 = null;
                IStrategoTerm t_33 = null;
                IStrategoTerm u_33 = null;
                IStrategoTerm x_33 = null;
                IStrategoTerm v_33 = null;
                IStrategoTerm y_33 = null;
                IStrategoTerm arg113 = term.getSubterm(0);
                if(arg113.getTermType() != IStrategoTerm.APPL || transform._consByEjpGranularity_0 != ((IStrategoAppl)arg113).getConstructor())
                  break Fail280;
                t_33 = term.getSubterm(1);
                r_33 = term.getSubterm(2);
                s_33 = term.getSubterm(3);
                x_33 = term;
                term = pp_aspectj_string_0_0.instance.invoke(context, r_33);
                if(term == null)
                  break Fail280;
                u_33 = term;
                y_33 = x_33;
                term = pp_aspectj_string_0_0.instance.invoke(context, t_33);
                if(term == null)
                  break Fail280;
                term = (IStrategoTerm)termFactory.makeListCons(ejp.const37, termFactory.makeListCons(term, (IStrategoList)ejp.constNil0));
                term = concat_strings_0_0.instance.invoke(context, term);
                if(term == null)
                  break Fail280;
                v_33 = term;
                term = y_33;
                term = gen__nomatch__pointcut__name_0_0.instance.invoke(context, term);
                if(term == null)
                  break Fail280;
                term = termFactory.makeAppl(transform._consMethodDec_2, new IStrategoTerm[]{termFactory.makeAppl(transform._consMethodDecHead_6, new IStrategoTerm[]{(IStrategoTerm)termFactory.makeListCons(termFactory.makeAppl(transform._consAnno_2, new IStrategoTerm[]{ejp.constTypeName9, (IStrategoTerm)termFactory.makeListCons(termFactory.makeAppl(transform._consElemValPair_2, new IStrategoTerm[]{ejp.constId7, termFactory.makeAppl(transform._consLit_1, new IStrategoTerm[]{termFactory.makeAppl(transform._consString_1, new IStrategoTerm[]{(IStrategoTerm)termFactory.makeListCons(termFactory.makeAppl(transform._consChars_1, new IStrategoTerm[]{u_33}), (IStrategoList)ejp.constNil0)})})}), termFactory.makeListCons(termFactory.makeAppl(transform._consElemValPair_2, new IStrategoTerm[]{ejp.constId20, termFactory.makeAppl(transform._consLit_1, new IStrategoTerm[]{s_33})}), (IStrategoList)ejp.constCons18))}), termFactory.makeListCons(termFactory.makeAppl(transform._consSingleElemAnno_2, new IStrategoTerm[]{ejp.constTypeName8, termFactory.makeAppl(transform._consLit_1, new IStrategoTerm[]{termFactory.makeAppl(transform._consString_1, new IStrategoTerm[]{(IStrategoTerm)termFactory.makeListCons(termFactory.makeAppl(transform._consChars_1, new IStrategoTerm[]{v_33}), (IStrategoList)ejp.constNil0)})})}), (IStrategoList)ejp.constCons11)), ejp.constNone0, ejp.constVoid0, termFactory.makeAppl(transform._consId_1, new IStrategoTerm[]{term}), ejp.constCons19, ejp.constNone0}), ejp.constBlock0});
                if(true)
                  break Success187;
              }
              term = term53;
            }
            Success188:
            { 
              if(cons27 == transform._consDecNoMatch_4)
              { 
                Fail281:
                { 
                  IStrategoTerm d_33 = null;
                  IStrategoTerm e_33 = null;
                  IStrategoTerm f_33 = null;
                  IStrategoTerm g_33 = null;
                  IStrategoTerm j_33 = null;
                  IStrategoTerm h_33 = null;
                  IStrategoTerm k_33 = null;
                  IStrategoTerm arg114 = term.getSubterm(0);
                  if(arg114.getTermType() != IStrategoTerm.APPL || transform._consByMethodGranularity_0 != ((IStrategoAppl)arg114).getConstructor())
                    break Fail281;
                  f_33 = term.getSubterm(1);
                  d_33 = term.getSubterm(2);
                  e_33 = term.getSubterm(3);
                  j_33 = term;
                  term = pp_aspectj_string_0_0.instance.invoke(context, d_33);
                  if(term == null)
                    break Fail281;
                  g_33 = term;
                  k_33 = j_33;
                  term = pp_aspectj_string_0_0.instance.invoke(context, f_33);
                  if(term == null)
                    break Fail281;
                  term = (IStrategoTerm)termFactory.makeListCons(ejp.const40, termFactory.makeListCons(term, (IStrategoList)ejp.constNil0));
                  term = concat_strings_0_0.instance.invoke(context, term);
                  if(term == null)
                    break Fail281;
                  h_33 = term;
                  term = k_33;
                  term = gen__nomatch__pointcut__name_0_0.instance.invoke(context, term);
                  if(term == null)
                    break Fail281;
                  term = termFactory.makeAppl(transform._consMethodDec_2, new IStrategoTerm[]{termFactory.makeAppl(transform._consMethodDecHead_6, new IStrategoTerm[]{(IStrategoTerm)termFactory.makeListCons(termFactory.makeAppl(transform._consAnno_2, new IStrategoTerm[]{ejp.constTypeName9, (IStrategoTerm)termFactory.makeListCons(termFactory.makeAppl(transform._consElemValPair_2, new IStrategoTerm[]{ejp.constId7, termFactory.makeAppl(transform._consLit_1, new IStrategoTerm[]{termFactory.makeAppl(transform._consString_1, new IStrategoTerm[]{(IStrategoTerm)termFactory.makeListCons(termFactory.makeAppl(transform._consChars_1, new IStrategoTerm[]{g_33}), (IStrategoList)ejp.constNil0)})})}), termFactory.makeListCons(termFactory.makeAppl(transform._consElemValPair_2, new IStrategoTerm[]{ejp.constId20, termFactory.makeAppl(transform._consLit_1, new IStrategoTerm[]{e_33})}), (IStrategoList)ejp.constCons21))}), termFactory.makeListCons(termFactory.makeAppl(transform._consSingleElemAnno_2, new IStrategoTerm[]{ejp.constTypeName8, termFactory.makeAppl(transform._consLit_1, new IStrategoTerm[]{termFactory.makeAppl(transform._consString_1, new IStrategoTerm[]{(IStrategoTerm)termFactory.makeListCons(termFactory.makeAppl(transform._consChars_1, new IStrategoTerm[]{h_33}), (IStrategoList)ejp.constNil0)})})}), (IStrategoList)ejp.constCons11)), ejp.constNone0, ejp.constVoid0, termFactory.makeAppl(transform._consId_1, new IStrategoTerm[]{term}), ejp.constCons19, ejp.constNone0}), ejp.constBlock0});
                  if(true)
                    break Success188;
                }
                term = term53;
              }
              if(cons27 == transform._consExplicitJoinPointDeclaration_5)
              { 
                IStrategoTerm l_32 = null;
                IStrategoTerm m_32 = null;
                IStrategoTerm n_32 = null;
                IStrategoTerm o_32 = null;
                IStrategoTerm p_32 = null;
                IStrategoTerm q_32 = null;
                IStrategoTerm r_32 = null;
                IStrategoTerm s_32 = null;
                IStrategoTerm t_32 = null;
                m_32 = term.getSubterm(0);
                l_32 = term.getSubterm(1);
                n_32 = term.getSubterm(2);
                o_32 = term.getSubterm(3);
                q_32 = term.getSubterm(4);
                t_32 = term;
                IStrategoTerm term57 = term;
                Success189:
                { 
                  Fail282:
                  { 
                    IStrategoTerm u_32 = null;
                    term = termFactory.makeTuple(l_32, m_32);
                    term = gen_pointcutargs_pointcuts_0_1.instance.invoke(context, term, t_77.value);
                    if(term == null)
                      break Fail282;
                    term = gen_method_head_0_3.instance.invoke(context, term, m_32, n_32, o_32);
                    if(term == null)
                      break Fail282;
                    u_32 = term;
                    p_32 = term;
                    term = u_32;
                    if(term.getTermType() != IStrategoTerm.APPL || transform._consMethodDecHead_6 != ((IStrategoAppl)term).getConstructor())
                      break Fail282;
                    r_32 = term.getSubterm(2);
                    term = gen_method_body_0_2.instance.invoke(context, term, q_32, r_32);
                    if(term == null)
                      break Fail282;
                    s_32 = term;
                    if(true)
                      break Success189;
                  }
                  term = term57;
                  IStrategoTerm z_32 = null;
                  z_32 = term;
                  term = report_with_failure_0_1.instance.invoke(context, z_32, ejp.const42);
                  if(term == null)
                    break Fail277;
                }
                term = t_32;
                if(p_32 == null || s_32 == null)
                  break Fail277;
                term = termFactory.makeAppl(transform._consMethodDec_2, new IStrategoTerm[]{p_32, s_32});
              }
              else
              { 
                break Fail277;
              }
            }
          }
        }
      }
      if(true)
        return term;
    }
    return null;
  }
}