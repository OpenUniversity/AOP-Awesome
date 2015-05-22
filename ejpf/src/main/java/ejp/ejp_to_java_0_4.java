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

@SuppressWarnings("all") public class ejp_to_java_0_4 extends Strategy 
{ 
  public static ejp_to_java_0_4 instance = new ejp_to_java_0_4();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm ref_p_77, IStrategoTerm ref_q_77, IStrategoTerm ref_r_77, IStrategoTerm ref_s_77)
  { 
    ITermFactory termFactory = context.getFactory();
    TermReference p_77 = new TermReference(ref_p_77);
    TermReference q_77 = new TermReference(ref_q_77);
    TermReference r_77 = new TermReference(ref_r_77);
    TermReference s_77 = new TermReference(ref_s_77);
    context.push("ejp_to_java_0_4");
    Fail7:
    { 
      IStrategoTerm term5 = term;
      Success5:
      { 
        Fail8:
        { 
          IStrategoTerm k_16 = null;
          IStrategoTerm m_16 = null;
          IStrategoTerm n_16 = null;
          IStrategoTerm o_16 = null;
          IStrategoTerm p_16 = null;
          TermReference q_16 = new TermReference();
          IStrategoTerm r_16 = null;
          IStrategoTerm s_16 = null;
          IStrategoTerm t_16 = null;
          if(term.getTermType() != IStrategoTerm.APPL || transform._consClassDec_2 != ((IStrategoAppl)term).getConstructor())
            break Fail8;
          IStrategoTerm arg4 = term.getSubterm(0);
          if(arg4.getTermType() != IStrategoTerm.APPL || transform._consClassDecHead_5 != ((IStrategoAppl)arg4).getConstructor())
            break Fail8;
          k_16 = arg4.getSubterm(0);
          m_16 = arg4.getSubterm(1);
          n_16 = arg4.getSubterm(2);
          o_16 = arg4.getSubterm(3);
          p_16 = arg4.getSubterm(4);
          IStrategoTerm arg5 = term.getSubterm(1);
          if(arg5.getTermType() != IStrategoTerm.APPL || transform._consClassBody_1 != ((IStrategoAppl)arg5).getConstructor())
            break Fail8;
          r_16 = arg5.getSubterm(0);
          IStrategoTerm term6 = term;
          Success6:
          { 
            Fail9:
            { 
              IStrategoTerm u_16 = null;
              IStrategoTerm v_16 = null;
              IStrategoTerm x_16 = null;
              u_16 = term;
              term = m_16;
              if(term.getTermType() != IStrategoTerm.APPL || transform._consId_1 != ((IStrategoAppl)term).getConstructor())
                break Fail9;
              v_16 = term.getSubterm(0);
              x_16 = v_16;
              term = string_starts_with_0_1.instance.invoke(context, x_16, ejp.const1);
              if(term == null)
                break Fail9;
              term = u_16;
              { 
                term = termFactory.makeAppl(transform._consClassDecHead_5, new IStrategoTerm[]{k_16, m_16, n_16, o_16, p_16});
                s_16 = term;
                term = r_16;
                lifted2 lifted210 = new lifted2();
                lifted210.p_77 = p_77;
                lifted210.q_77 = q_77;
                lifted210.r_77 = r_77;
                lifted210.s_77 = s_77;
                term = SRTS_all.instance.invoke(context, term, lifted210);
                if(term == null)
                  break Fail8;
                term = termFactory.makeAppl(transform._consClassBody_1, new IStrategoTerm[]{term});
                t_16 = term;
                if(true)
                  break Success6;
              }
            }
            term = term6;
            term = random_string_0_0.instance.invoke(context, term);
            if(term == null)
              break Fail8;
            if(q_16.value == null)
              q_16.value = term;
            else
              if(q_16.value != term && !q_16.value.match(term))
                break Fail8;
            if(q_16.value == null)
              break Fail8;
            term = termFactory.makeTuple((IStrategoTerm)termFactory.makeListCons(termFactory.makeAppl(transform._consSingleElemAnno_2, new IStrategoTerm[]{ejp.constTypeName0, termFactory.makeAppl(transform._consLit_1, new IStrategoTerm[]{termFactory.makeAppl(transform._consDeci_1, new IStrategoTerm[]{q_16.value})})}), (IStrategoList)ejp.constNil0), k_16);
            term = conc_0_0.instance.invoke(context, term);
            if(term == null)
              break Fail8;
            term = termFactory.makeAppl(transform._consClassDecHead_5, new IStrategoTerm[]{term, m_16, n_16, o_16, p_16});
            s_16 = term;
            term = r_16;
            lifted4 lifted410 = new lifted4();
            lifted410.p_77 = p_77;
            lifted410.q_16 = q_16;
            lifted410.r_77 = r_77;
            lifted410.s_77 = s_77;
            term = SRTS_all.instance.invoke(context, term, lifted410);
            if(term == null)
              break Fail8;
            term = termFactory.makeAppl(transform._consClassBody_1, new IStrategoTerm[]{term});
            t_16 = term;
          }
          term = termFactory.makeAppl(transform._consClassDec_2, new IStrategoTerm[]{s_16, t_16});
          if(true)
            break Success5;
        }
        term = term5;
        IStrategoTerm term7 = term;
        Success7:
        { 
          Fail10:
          { 
            IStrategoTerm o_15 = null;
            IStrategoTerm q_15 = null;
            IStrategoTerm r_15 = null;
            IStrategoTerm s_15 = null;
            IStrategoTerm t_15 = null;
            IStrategoTerm u_15 = null;
            TermReference v_15 = new TermReference();
            IStrategoTerm w_15 = null;
            IStrategoTerm x_15 = null;
            IStrategoTerm y_15 = null;
            if(term.getTermType() != IStrategoTerm.APPL || transform._consMethodDec_2 != ((IStrategoAppl)term).getConstructor())
              break Fail10;
            IStrategoTerm arg6 = term.getSubterm(0);
            if(arg6.getTermType() != IStrategoTerm.APPL || transform._consMethodDecHead_6 != ((IStrategoAppl)arg6).getConstructor())
              break Fail10;
            o_15 = arg6.getSubterm(0);
            q_15 = arg6.getSubterm(1);
            r_15 = arg6.getSubterm(2);
            s_15 = arg6.getSubterm(3);
            t_15 = arg6.getSubterm(4);
            u_15 = arg6.getSubterm(5);
            IStrategoTerm arg7 = term.getSubterm(1);
            if(arg7.getTermType() != IStrategoTerm.APPL || transform._consBlock_1 != ((IStrategoAppl)arg7).getConstructor())
              break Fail10;
            w_15 = arg7.getSubterm(0);
            term = t_15;
            lifted6 lifted610 = new lifted6();
            lifted610.p_77 = p_77;
            term = SRTS_all.instance.invoke(context, term, lifted610);
            if(term == null)
              break Fail10;
            IStrategoTerm term8 = term;
            Success8:
            { 
              Fail11:
              { 
                IStrategoTerm z_15 = null;
                z_15 = term;
                term = fetch_1_0.instance.invoke(context, o_15, lifted8.instance);
                if(term == null)
                  break Fail11;
                term = z_15;
                { 
                  term = termFactory.makeAppl(transform._consMethodDecHead_6, new IStrategoTerm[]{o_15, q_15, r_15, s_15, t_15, u_15});
                  x_15 = term;
                  lifted9 lifted90 = new lifted9();
                  lifted90.p_77 = p_77;
                  lifted90.q_77 = q_77;
                  lifted90.r_77 = r_77;
                  lifted90.s_77 = s_77;
                  term = allow_extends_1_1.instance.invoke(context, term, lifted90, w_15);
                  if(term == null)
                    break Fail10;
                  term = termFactory.makeAppl(transform._consBlock_1, new IStrategoTerm[]{term});
                  y_15 = term;
                  if(true)
                    break Success8;
                }
              }
              term = term8;
              term = random_string_0_0.instance.invoke(context, term);
              if(term == null)
                break Fail10;
              if(v_15.value == null)
                v_15.value = term;
              else
                if(v_15.value != term && !v_15.value.match(term))
                  break Fail10;
              if(v_15.value == null)
                break Fail10;
              term = termFactory.makeTuple((IStrategoTerm)termFactory.makeListCons(termFactory.makeAppl(transform._consSingleElemAnno_2, new IStrategoTerm[]{ejp.constTypeName1, termFactory.makeAppl(transform._consLit_1, new IStrategoTerm[]{termFactory.makeAppl(transform._consDeci_1, new IStrategoTerm[]{v_15.value})})}), (IStrategoList)ejp.constNil0), o_15);
              term = conc_0_0.instance.invoke(context, term);
              if(term == null)
                break Fail10;
              term = termFactory.makeAppl(transform._consMethodDecHead_6, new IStrategoTerm[]{term, q_15, r_15, s_15, t_15, u_15});
              x_15 = term;
              lifted10 lifted100 = new lifted10();
              lifted100.p_77 = p_77;
              lifted100.q_77 = q_77;
              lifted100.v_15 = v_15;
              lifted100.s_77 = s_77;
              term = allow_extends_1_1.instance.invoke(context, term, lifted100, w_15);
              if(term == null)
                break Fail10;
              term = termFactory.makeAppl(transform._consBlock_1, new IStrategoTerm[]{term});
              y_15 = term;
            }
            term = termFactory.makeAppl(transform._consMethodDec_2, new IStrategoTerm[]{x_15, y_15});
            if(true)
              break Success7;
          }
          term = term7;
          IStrategoTerm term9 = term;
          Success9:
          { 
            Fail12:
            { 
              IStrategoTerm h_15 = null;
              if(term.getTermType() != IStrategoTerm.APPL || transform._consBlock_1 != ((IStrategoAppl)term).getConstructor())
                break Fail12;
              h_15 = term.getSubterm(0);
              term = h_15;
              lifted11 lifted111 = new lifted11();
              lifted111.p_77 = p_77;
              lifted111.q_77 = q_77;
              lifted111.r_77 = r_77;
              lifted111.s_77 = s_77;
              term = SRTS_all.instance.invoke(context, term, lifted111);
              if(term == null)
                break Fail12;
              if(true)
                break Success9;
            }
            term = term9;
            IStrategoTerm term10 = term;
            Success10:
            { 
              Fail13:
              { 
                TermReference z_14 = new TermReference();
                TermReference a_15 = new TermReference();
                IStrategoTerm b_15 = null;
                if(term.getTermType() != IStrategoTerm.APPL || transform._consLocalVarDecStm_1 != ((IStrategoAppl)term).getConstructor())
                  break Fail13;
                IStrategoTerm arg12 = term.getSubterm(0);
                if(arg12.getTermType() != IStrategoTerm.APPL || transform._consLocalVarDec_3 != ((IStrategoAppl)arg12).getConstructor())
                  break Fail13;
                if(z_14.value == null)
                  z_14.value = arg12.getSubterm(0);
                else
                  if(z_14.value != arg12.getSubterm(0) && !z_14.value.match(arg12.getSubterm(0)))
                    break Fail13;
                if(a_15.value == null)
                  a_15.value = arg12.getSubterm(1);
                else
                  if(a_15.value != arg12.getSubterm(1) && !a_15.value.match(arg12.getSubterm(1)))
                    break Fail13;
                b_15 = arg12.getSubterm(2);
                term = b_15;
                lifted13 lifted130 = new lifted13();
                lifted130.p_77 = p_77;
                lifted130.z_14 = z_14;
                lifted130.a_15 = a_15;
                lifted130.q_77 = q_77;
                lifted130.r_77 = r_77;
                lifted130.s_77 = s_77;
                term = map_1_0.instance.invoke(context, term, lifted130);
                if(term == null)
                  break Fail13;
                term = concat_0_0.instance.invoke(context, term);
                if(term == null)
                  break Fail13;
                if(true)
                  break Success10;
              }
              term = term10;
              IStrategoTerm term11 = term;
              Success11:
              { 
                Fail14:
                { 
                  TermReference l_14 = new TermReference();
                  IStrategoTerm m_14 = null;
                  if(term.getTermType() != IStrategoTerm.APPL || transform._consInstanceInit_1 != ((IStrategoAppl)term).getConstructor())
                    break Fail14;
                  IStrategoTerm arg13 = term.getSubterm(0);
                  if(arg13.getTermType() != IStrategoTerm.APPL || transform._consBlock_1 != ((IStrategoAppl)arg13).getConstructor())
                    break Fail14;
                  m_14 = arg13.getSubterm(0);
                  term = new_hashtable_0_0.instance.invoke(context, term);
                  if(term == null)
                    break Fail14;
                  if(l_14.value == null)
                    l_14.value = term;
                  else
                    if(l_14.value != term && !l_14.value.match(term))
                      break Fail14;
                  term = m_14;
                  lifted14 lifted140 = new lifted14();
                  lifted140.l_14 = l_14;
                  lifted140.s_77 = s_77;
                  term = SRTS_all.instance.invoke(context, term, lifted140);
                  if(term == null)
                    break Fail14;
                  term = termFactory.makeAppl(transform._consInstanceInit_1, new IStrategoTerm[]{termFactory.makeAppl(transform._consBlock_1, new IStrategoTerm[]{term})});
                  if(true)
                    break Success11;
                }
                term = term11;
                IStrategoTerm term12 = term;
                Success12:
                { 
                  Fail15:
                  { 
                    TermReference x_13 = new TermReference();
                    IStrategoTerm y_13 = null;
                    if(term.getTermType() != IStrategoTerm.APPL || transform._consStaticInit_1 != ((IStrategoAppl)term).getConstructor())
                      break Fail15;
                    IStrategoTerm arg14 = term.getSubterm(0);
                    if(arg14.getTermType() != IStrategoTerm.APPL || transform._consBlock_1 != ((IStrategoAppl)arg14).getConstructor())
                      break Fail15;
                    y_13 = arg14.getSubterm(0);
                    term = new_hashtable_0_0.instance.invoke(context, term);
                    if(term == null)
                      break Fail15;
                    if(x_13.value == null)
                      x_13.value = term;
                    else
                      if(x_13.value != term && !x_13.value.match(term))
                        break Fail15;
                    term = y_13;
                    lifted16 lifted160 = new lifted16();
                    lifted160.x_13 = x_13;
                    lifted160.s_77 = s_77;
                    term = SRTS_all.instance.invoke(context, term, lifted160);
                    if(term == null)
                      break Fail15;
                    term = termFactory.makeAppl(transform._consStaticInit_1, new IStrategoTerm[]{termFactory.makeAppl(transform._consBlock_1, new IStrategoTerm[]{term})});
                    if(true)
                      break Success12;
                  }
                  term = term12;
                  IStrategoTerm term13 = term;
                  IStrategoConstructor cons2 = term.getTermType() == IStrategoTerm.APPL ? ((IStrategoAppl)term).getConstructor() : null;
                  Success13:
                  { 
                    if(cons2 == transform._consExprStm_1)
                    { 
                      Fail16:
                      { 
                        IStrategoTerm o_13 = null;
                        IStrategoTerm p_13 = null;
                        IStrategoTerm q_13 = null;
                        IStrategoTerm arg15 = term.getSubterm(0);
                        if(arg15.getTermType() != IStrategoTerm.APPL || transform._consAssign_2 != ((IStrategoAppl)arg15).getConstructor())
                          break Fail16;
                        o_13 = arg15.getSubterm(0);
                        IStrategoTerm arg16 = arg15.getSubterm(1);
                        if(arg16.getTermType() != IStrategoTerm.APPL || transform._consEJPCall_2 != ((IStrategoAppl)arg16).getConstructor())
                          break Fail16;
                        p_13 = arg16.getSubterm(0);
                        q_13 = arg16.getSubterm(1);
                        term = termFactory.makeAppl(transform._consEJPCall_2, new IStrategoTerm[]{p_13, q_13});
                        term = ejp_call_to_method_invokation_0_4.instance.invoke(context, term, p_77.value, q_77.value, r_77.value, s_77.value);
                        if(term == null)
                          break Fail16;
                        term = termFactory.makeAppl(transform._consExprStm_1, new IStrategoTerm[]{termFactory.makeAppl(transform._consAssign_2, new IStrategoTerm[]{o_13, term})});
                        if(true)
                          break Success13;
                      }
                      term = term13;
                    }
                    Success14:
                    { 
                      if(cons2 == transform._consExprStm_1)
                      { 
                        Fail17:
                        { 
                          IStrategoTerm g_13 = null;
                          IStrategoTerm h_13 = null;
                          IStrategoTerm arg17 = term.getSubterm(0);
                          if(arg17.getTermType() != IStrategoTerm.APPL || transform._consEJPCall_2 != ((IStrategoAppl)arg17).getConstructor())
                            break Fail17;
                          g_13 = arg17.getSubterm(0);
                          h_13 = arg17.getSubterm(1);
                          term = termFactory.makeAppl(transform._consEJPCall_2, new IStrategoTerm[]{g_13, h_13});
                          term = ejp_call_to_method_invokation_0_4.instance.invoke(context, term, p_77.value, q_77.value, r_77.value, s_77.value);
                          if(term == null)
                            break Fail17;
                          term = termFactory.makeAppl(transform._consExprStm_1, new IStrategoTerm[]{term});
                          if(true)
                            break Success14;
                        }
                        term = term13;
                      }
                      Success15:
                      { 
                        if(cons2 == transform._consExprStm_1)
                        { 
                          Fail18:
                          { 
                            IStrategoTerm v_12 = null;
                            IStrategoTerm w_12 = null;
                            IStrategoTerm x_12 = null;
                            IStrategoTerm y_12 = null;
                            IStrategoTerm arg18 = term.getSubterm(0);
                            if(arg18.getTermType() != IStrategoTerm.APPL || transform._consScopedEJPCall_3 != ((IStrategoAppl)arg18).getConstructor())
                              break Fail18;
                            v_12 = arg18.getSubterm(0);
                            w_12 = arg18.getSubterm(1);
                            IStrategoTerm arg19 = arg18.getSubterm(2);
                            if(arg19.getTermType() != IStrategoTerm.APPL || transform._consBlock_1 != ((IStrategoAppl)arg19).getConstructor())
                              break Fail18;
                            x_12 = arg19.getSubterm(0);
                            term = create_method_invokation_0_1.instance.invoke(context, term, v_12);
                            if(term == null)
                              break Fail18;
                            y_12 = term;
                            term = termFactory.makeAppl(transform._consScopedEJPCall_3, new IStrategoTerm[]{v_12, w_12, termFactory.makeAppl(transform._consBlock_1, new IStrategoTerm[]{x_12})});
                            term = scoped_ejp_to_java_0_4.instance.invoke(context, term, p_77.value, q_77.value, r_77.value, s_77.value);
                            if(term == null)
                              break Fail18;
                            term = termFactory.makeTuple((IStrategoTerm)termFactory.makeListCons(termFactory.makeAppl(transform._consExprStm_1, new IStrategoTerm[]{y_12}), (IStrategoList)ejp.constNil0), term);
                            term = conc_0_0.instance.invoke(context, term);
                            if(term == null)
                              break Fail18;
                            if(true)
                              break Success15;
                          }
                          term = term13;
                        }
                        if(cons2 == transform._consExprStm_1)
                        { 
                          IStrategoTerm j_12 = null;
                          IStrategoTerm k_12 = null;
                          IStrategoTerm l_12 = null;
                          IStrategoTerm m_12 = null;
                          IStrategoTerm n_12 = null;
                          IStrategoTerm arg20 = term.getSubterm(0);
                          if(arg20.getTermType() != IStrategoTerm.APPL || transform._consAssign_2 != ((IStrategoAppl)arg20).getConstructor())
                            break Fail7;
                          j_12 = arg20.getSubterm(0);
                          IStrategoTerm arg21 = arg20.getSubterm(1);
                          if(arg21.getTermType() != IStrategoTerm.APPL || transform._consScopedEJPCall_3 != ((IStrategoAppl)arg21).getConstructor())
                            break Fail7;
                          k_12 = arg21.getSubterm(0);
                          l_12 = arg21.getSubterm(1);
                          IStrategoTerm arg22 = arg21.getSubterm(2);
                          if(arg22.getTermType() != IStrategoTerm.APPL || transform._consBlock_1 != ((IStrategoAppl)arg22).getConstructor())
                            break Fail7;
                          m_12 = arg22.getSubterm(0);
                          term = create_method_invokation_0_1.instance.invoke(context, term, k_12);
                          if(term == null)
                            break Fail7;
                          n_12 = term;
                          term = termFactory.makeAppl(transform._consScopedEJPCall_3, new IStrategoTerm[]{k_12, l_12, termFactory.makeAppl(transform._consBlock_1, new IStrategoTerm[]{m_12})});
                          term = scoped_ejp_to_java_0_4.instance.invoke(context, term, p_77.value, q_77.value, r_77.value, s_77.value);
                          if(term == null)
                            break Fail7;
                          term = termFactory.makeTuple((IStrategoTerm)termFactory.makeListCons(termFactory.makeAppl(transform._consExprStm_1, new IStrategoTerm[]{termFactory.makeAppl(transform._consAssign_2, new IStrategoTerm[]{j_12, n_12})}), (IStrategoList)ejp.constNil0), term);
                          term = conc_0_0.instance.invoke(context, term);
                          if(term == null)
                            break Fail7;
                        }
                        else
                        { 
                          break Fail7;
                        }
                      }
                    }
                  }
                }
              }
            }
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