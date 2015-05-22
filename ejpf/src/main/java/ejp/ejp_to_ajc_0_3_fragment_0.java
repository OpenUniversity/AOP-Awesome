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
  TermReference f_78;

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
            IStrategoTerm d_35 = null;
            IStrategoTerm e_35 = null;
            IStrategoTerm f_35 = null;
            IStrategoTerm g_35 = null;
            IStrategoTerm j_35 = null;
            IStrategoTerm h_35 = null;
            IStrategoTerm k_35 = null;
            IStrategoTerm arg111 = term.getSubterm(0);
            if(arg111.getTermType() != IStrategoTerm.APPL || transform._consByPackageGranularity_0 != ((IStrategoAppl)arg111).getConstructor())
              break Fail278;
            f_35 = term.getSubterm(1);
            d_35 = term.getSubterm(2);
            e_35 = term.getSubterm(3);
            j_35 = term;
            term = pp_aspectj_string_0_0.instance.invoke(context, d_35);
            if(term == null)
              break Fail278;
            g_35 = term;
            k_35 = j_35;
            term = pp_aspectj_string_0_0.instance.invoke(context, f_35);
            if(term == null)
              break Fail278;
            term = (IStrategoTerm)termFactory.makeListCons(ejp.const24, termFactory.makeListCons(term, (IStrategoList)ejp.constNil0));
            term = concat_strings_0_0.instance.invoke(context, term);
            if(term == null)
              break Fail278;
            h_35 = term;
            term = k_35;
            term = gen__nomatch__pointcut__name_0_0.instance.invoke(context, term);
            if(term == null)
              break Fail278;
            term = termFactory.makeAppl(transform._consMethodDec_2, new IStrategoTerm[]{termFactory.makeAppl(transform._consMethodDecHead_6, new IStrategoTerm[]{(IStrategoTerm)termFactory.makeListCons(termFactory.makeAppl(transform._consAnno_2, new IStrategoTerm[]{ejp.constTypeName9, (IStrategoTerm)termFactory.makeListCons(termFactory.makeAppl(transform._consElemValPair_2, new IStrategoTerm[]{ejp.constId7, termFactory.makeAppl(transform._consLit_1, new IStrategoTerm[]{termFactory.makeAppl(transform._consString_1, new IStrategoTerm[]{(IStrategoTerm)termFactory.makeListCons(termFactory.makeAppl(transform._consChars_1, new IStrategoTerm[]{g_35}), (IStrategoList)ejp.constNil0)})})}), termFactory.makeListCons(termFactory.makeAppl(transform._consElemValPair_2, new IStrategoTerm[]{ejp.constId20, termFactory.makeAppl(transform._consLit_1, new IStrategoTerm[]{e_35})}), (IStrategoList)ejp.constCons13))}), termFactory.makeListCons(termFactory.makeAppl(transform._consSingleElemAnno_2, new IStrategoTerm[]{ejp.constTypeName8, termFactory.makeAppl(transform._consLit_1, new IStrategoTerm[]{termFactory.makeAppl(transform._consString_1, new IStrategoTerm[]{(IStrategoTerm)termFactory.makeListCons(termFactory.makeAppl(transform._consChars_1, new IStrategoTerm[]{h_35}), (IStrategoList)ejp.constNil0)})})}), (IStrategoList)ejp.constCons11)), ejp.constNone0, ejp.constVoid0, termFactory.makeAppl(transform._consId_1, new IStrategoTerm[]{term}), ejp.constCons14, ejp.constNone0}), ejp.constBlock0});
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
              IStrategoTerm p_34 = null;
              IStrategoTerm q_34 = null;
              IStrategoTerm r_34 = null;
              IStrategoTerm s_34 = null;
              IStrategoTerm v_34 = null;
              IStrategoTerm t_34 = null;
              IStrategoTerm w_34 = null;
              IStrategoTerm arg112 = term.getSubterm(0);
              if(arg112.getTermType() != IStrategoTerm.APPL || transform._consByClassGranularity_0 != ((IStrategoAppl)arg112).getConstructor())
                break Fail279;
              r_34 = term.getSubterm(1);
              p_34 = term.getSubterm(2);
              q_34 = term.getSubterm(3);
              v_34 = term;
              term = pp_aspectj_string_0_0.instance.invoke(context, p_34);
              if(term == null)
                break Fail279;
              s_34 = term;
              w_34 = v_34;
              term = pp_aspectj_string_0_0.instance.invoke(context, r_34);
              if(term == null)
                break Fail279;
              term = (IStrategoTerm)termFactory.makeListCons(ejp.const24, termFactory.makeListCons(term, (IStrategoList)ejp.constNil0));
              term = concat_strings_0_0.instance.invoke(context, term);
              if(term == null)
                break Fail279;
              t_34 = term;
              term = w_34;
              term = gen__nomatch__pointcut__name_0_0.instance.invoke(context, term);
              if(term == null)
                break Fail279;
              term = termFactory.makeAppl(transform._consMethodDec_2, new IStrategoTerm[]{termFactory.makeAppl(transform._consMethodDecHead_6, new IStrategoTerm[]{(IStrategoTerm)termFactory.makeListCons(termFactory.makeAppl(transform._consAnno_2, new IStrategoTerm[]{ejp.constTypeName9, (IStrategoTerm)termFactory.makeListCons(termFactory.makeAppl(transform._consElemValPair_2, new IStrategoTerm[]{ejp.constId7, termFactory.makeAppl(transform._consLit_1, new IStrategoTerm[]{termFactory.makeAppl(transform._consString_1, new IStrategoTerm[]{(IStrategoTerm)termFactory.makeListCons(termFactory.makeAppl(transform._consChars_1, new IStrategoTerm[]{s_34}), (IStrategoList)ejp.constNil0)})})}), termFactory.makeListCons(termFactory.makeAppl(transform._consElemValPair_2, new IStrategoTerm[]{ejp.constId20, termFactory.makeAppl(transform._consLit_1, new IStrategoTerm[]{q_34})}), (IStrategoList)ejp.constCons16))}), termFactory.makeListCons(termFactory.makeAppl(transform._consSingleElemAnno_2, new IStrategoTerm[]{ejp.constTypeName8, termFactory.makeAppl(transform._consLit_1, new IStrategoTerm[]{termFactory.makeAppl(transform._consString_1, new IStrategoTerm[]{(IStrategoTerm)termFactory.makeListCons(termFactory.makeAppl(transform._consChars_1, new IStrategoTerm[]{t_34}), (IStrategoList)ejp.constNil0)})})}), (IStrategoList)ejp.constCons11)), ejp.constNone0, ejp.constVoid0, termFactory.makeAppl(transform._consId_1, new IStrategoTerm[]{term}), ejp.constCons14, ejp.constNone0}), ejp.constBlock0});
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
                IStrategoTerm b_34 = null;
                IStrategoTerm c_34 = null;
                IStrategoTerm d_34 = null;
                IStrategoTerm e_34 = null;
                IStrategoTerm h_34 = null;
                IStrategoTerm f_34 = null;
                IStrategoTerm i_34 = null;
                IStrategoTerm arg113 = term.getSubterm(0);
                if(arg113.getTermType() != IStrategoTerm.APPL || transform._consByEjpGranularity_0 != ((IStrategoAppl)arg113).getConstructor())
                  break Fail280;
                d_34 = term.getSubterm(1);
                b_34 = term.getSubterm(2);
                c_34 = term.getSubterm(3);
                h_34 = term;
                term = pp_aspectj_string_0_0.instance.invoke(context, b_34);
                if(term == null)
                  break Fail280;
                e_34 = term;
                i_34 = h_34;
                term = pp_aspectj_string_0_0.instance.invoke(context, d_34);
                if(term == null)
                  break Fail280;
                term = (IStrategoTerm)termFactory.makeListCons(ejp.const37, termFactory.makeListCons(term, (IStrategoList)ejp.constNil0));
                term = concat_strings_0_0.instance.invoke(context, term);
                if(term == null)
                  break Fail280;
                f_34 = term;
                term = i_34;
                term = gen__nomatch__pointcut__name_0_0.instance.invoke(context, term);
                if(term == null)
                  break Fail280;
                term = termFactory.makeAppl(transform._consMethodDec_2, new IStrategoTerm[]{termFactory.makeAppl(transform._consMethodDecHead_6, new IStrategoTerm[]{(IStrategoTerm)termFactory.makeListCons(termFactory.makeAppl(transform._consAnno_2, new IStrategoTerm[]{ejp.constTypeName9, (IStrategoTerm)termFactory.makeListCons(termFactory.makeAppl(transform._consElemValPair_2, new IStrategoTerm[]{ejp.constId7, termFactory.makeAppl(transform._consLit_1, new IStrategoTerm[]{termFactory.makeAppl(transform._consString_1, new IStrategoTerm[]{(IStrategoTerm)termFactory.makeListCons(termFactory.makeAppl(transform._consChars_1, new IStrategoTerm[]{e_34}), (IStrategoList)ejp.constNil0)})})}), termFactory.makeListCons(termFactory.makeAppl(transform._consElemValPair_2, new IStrategoTerm[]{ejp.constId20, termFactory.makeAppl(transform._consLit_1, new IStrategoTerm[]{c_34})}), (IStrategoList)ejp.constCons18))}), termFactory.makeListCons(termFactory.makeAppl(transform._consSingleElemAnno_2, new IStrategoTerm[]{ejp.constTypeName8, termFactory.makeAppl(transform._consLit_1, new IStrategoTerm[]{termFactory.makeAppl(transform._consString_1, new IStrategoTerm[]{(IStrategoTerm)termFactory.makeListCons(termFactory.makeAppl(transform._consChars_1, new IStrategoTerm[]{f_34}), (IStrategoList)ejp.constNil0)})})}), (IStrategoList)ejp.constCons11)), ejp.constNone0, ejp.constVoid0, termFactory.makeAppl(transform._consId_1, new IStrategoTerm[]{term}), ejp.constCons19, ejp.constNone0}), ejp.constBlock0});
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
                  IStrategoTerm n_33 = null;
                  IStrategoTerm o_33 = null;
                  IStrategoTerm p_33 = null;
                  IStrategoTerm q_33 = null;
                  IStrategoTerm t_33 = null;
                  IStrategoTerm r_33 = null;
                  IStrategoTerm u_33 = null;
                  IStrategoTerm arg114 = term.getSubterm(0);
                  if(arg114.getTermType() != IStrategoTerm.APPL || transform._consByMethodGranularity_0 != ((IStrategoAppl)arg114).getConstructor())
                    break Fail281;
                  p_33 = term.getSubterm(1);
                  n_33 = term.getSubterm(2);
                  o_33 = term.getSubterm(3);
                  t_33 = term;
                  term = pp_aspectj_string_0_0.instance.invoke(context, n_33);
                  if(term == null)
                    break Fail281;
                  q_33 = term;
                  u_33 = t_33;
                  term = pp_aspectj_string_0_0.instance.invoke(context, p_33);
                  if(term == null)
                    break Fail281;
                  term = (IStrategoTerm)termFactory.makeListCons(ejp.const40, termFactory.makeListCons(term, (IStrategoList)ejp.constNil0));
                  term = concat_strings_0_0.instance.invoke(context, term);
                  if(term == null)
                    break Fail281;
                  r_33 = term;
                  term = u_33;
                  term = gen__nomatch__pointcut__name_0_0.instance.invoke(context, term);
                  if(term == null)
                    break Fail281;
                  term = termFactory.makeAppl(transform._consMethodDec_2, new IStrategoTerm[]{termFactory.makeAppl(transform._consMethodDecHead_6, new IStrategoTerm[]{(IStrategoTerm)termFactory.makeListCons(termFactory.makeAppl(transform._consAnno_2, new IStrategoTerm[]{ejp.constTypeName9, (IStrategoTerm)termFactory.makeListCons(termFactory.makeAppl(transform._consElemValPair_2, new IStrategoTerm[]{ejp.constId7, termFactory.makeAppl(transform._consLit_1, new IStrategoTerm[]{termFactory.makeAppl(transform._consString_1, new IStrategoTerm[]{(IStrategoTerm)termFactory.makeListCons(termFactory.makeAppl(transform._consChars_1, new IStrategoTerm[]{q_33}), (IStrategoList)ejp.constNil0)})})}), termFactory.makeListCons(termFactory.makeAppl(transform._consElemValPair_2, new IStrategoTerm[]{ejp.constId20, termFactory.makeAppl(transform._consLit_1, new IStrategoTerm[]{o_33})}), (IStrategoList)ejp.constCons21))}), termFactory.makeListCons(termFactory.makeAppl(transform._consSingleElemAnno_2, new IStrategoTerm[]{ejp.constTypeName8, termFactory.makeAppl(transform._consLit_1, new IStrategoTerm[]{termFactory.makeAppl(transform._consString_1, new IStrategoTerm[]{(IStrategoTerm)termFactory.makeListCons(termFactory.makeAppl(transform._consChars_1, new IStrategoTerm[]{r_33}), (IStrategoList)ejp.constNil0)})})}), (IStrategoList)ejp.constCons11)), ejp.constNone0, ejp.constVoid0, termFactory.makeAppl(transform._consId_1, new IStrategoTerm[]{term}), ejp.constCons19, ejp.constNone0}), ejp.constBlock0});
                  if(true)
                    break Success188;
                }
                term = term53;
              }
              if(cons27 == transform._consExplicitJoinPointDeclaration_5)
              { 
                IStrategoTerm v_32 = null;
                IStrategoTerm w_32 = null;
                IStrategoTerm x_32 = null;
                IStrategoTerm y_32 = null;
                IStrategoTerm z_32 = null;
                IStrategoTerm a_33 = null;
                IStrategoTerm b_33 = null;
                IStrategoTerm c_33 = null;
                IStrategoTerm d_33 = null;
                w_32 = term.getSubterm(0);
                v_32 = term.getSubterm(1);
                x_32 = term.getSubterm(2);
                y_32 = term.getSubterm(3);
                a_33 = term.getSubterm(4);
                d_33 = term;
                IStrategoTerm term57 = term;
                Success189:
                { 
                  Fail282:
                  { 
                    IStrategoTerm e_33 = null;
                    term = termFactory.makeTuple(v_32, w_32);
                    term = gen_pointcutargs_pointcuts_0_1.instance.invoke(context, term, f_78.value);
                    if(term == null)
                      break Fail282;
                    term = gen_method_head_0_3.instance.invoke(context, term, w_32, x_32, y_32);
                    if(term == null)
                      break Fail282;
                    e_33 = term;
                    z_32 = term;
                    term = e_33;
                    if(term.getTermType() != IStrategoTerm.APPL || transform._consMethodDecHead_6 != ((IStrategoAppl)term).getConstructor())
                      break Fail282;
                    b_33 = term.getSubterm(2);
                    term = gen_method_body_0_2.instance.invoke(context, term, a_33, b_33);
                    if(term == null)
                      break Fail282;
                    c_33 = term;
                    if(true)
                      break Success189;
                  }
                  term = term57;
                  IStrategoTerm j_33 = null;
                  j_33 = term;
                  term = report_with_failure_0_1.instance.invoke(context, j_33, ejp.const42);
                  if(term == null)
                    break Fail277;
                }
                term = d_33;
                if(z_32 == null || c_33 == null)
                  break Fail277;
                term = termFactory.makeAppl(transform._consMethodDec_2, new IStrategoTerm[]{z_32, c_33});
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