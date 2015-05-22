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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm ref_c_77, IStrategoTerm ref_d_77, IStrategoTerm ref_e_77, IStrategoTerm ref_f_77)
  { 
    ITermFactory termFactory = context.getFactory();
    TermReference c_77 = new TermReference(ref_c_77);
    TermReference d_77 = new TermReference(ref_d_77);
    TermReference e_77 = new TermReference(ref_e_77);
    TermReference f_77 = new TermReference(ref_f_77);
    context.push("ejp_to_java_0_4");
    Fail7:
    { 
      IStrategoTerm term5 = term;
      Success5:
      { 
        Fail8:
        { 
          IStrategoTerm i_16 = null;
          IStrategoTerm k_16 = null;
          IStrategoTerm l_16 = null;
          IStrategoTerm m_16 = null;
          IStrategoTerm n_16 = null;
          TermReference o_16 = new TermReference();
          IStrategoTerm p_16 = null;
          IStrategoTerm q_16 = null;
          IStrategoTerm r_16 = null;
          if(term.getTermType() != IStrategoTerm.APPL || transform._consClassDec_2 != ((IStrategoAppl)term).getConstructor())
            break Fail8;
          IStrategoTerm arg4 = term.getSubterm(0);
          if(arg4.getTermType() != IStrategoTerm.APPL || transform._consClassDecHead_5 != ((IStrategoAppl)arg4).getConstructor())
            break Fail8;
          i_16 = arg4.getSubterm(0);
          k_16 = arg4.getSubterm(1);
          l_16 = arg4.getSubterm(2);
          m_16 = arg4.getSubterm(3);
          n_16 = arg4.getSubterm(4);
          IStrategoTerm arg5 = term.getSubterm(1);
          if(arg5.getTermType() != IStrategoTerm.APPL || transform._consClassBody_1 != ((IStrategoAppl)arg5).getConstructor())
            break Fail8;
          p_16 = arg5.getSubterm(0);
          IStrategoTerm term6 = term;
          Success6:
          { 
            Fail9:
            { 
              IStrategoTerm s_16 = null;
              IStrategoTerm t_16 = null;
              IStrategoTerm v_16 = null;
              s_16 = term;
              term = k_16;
              if(term.getTermType() != IStrategoTerm.APPL || transform._consId_1 != ((IStrategoAppl)term).getConstructor())
                break Fail9;
              t_16 = term.getSubterm(0);
              v_16 = t_16;
              term = string_starts_with_0_1.instance.invoke(context, v_16, ejp.const1);
              if(term == null)
                break Fail9;
              term = s_16;
              { 
                term = termFactory.makeAppl(transform._consClassDecHead_5, new IStrategoTerm[]{i_16, k_16, l_16, m_16, n_16});
                q_16 = term;
                term = p_16;
                lifted2 lifted210 = new lifted2();
                lifted210.c_77 = c_77;
                lifted210.d_77 = d_77;
                lifted210.e_77 = e_77;
                lifted210.f_77 = f_77;
                term = SRTS_all.instance.invoke(context, term, lifted210);
                if(term == null)
                  break Fail8;
                term = termFactory.makeAppl(transform._consClassBody_1, new IStrategoTerm[]{term});
                r_16 = term;
                if(true)
                  break Success6;
              }
            }
            term = term6;
            term = random_string_0_0.instance.invoke(context, term);
            if(term == null)
              break Fail8;
            if(o_16.value == null)
              o_16.value = term;
            else
              if(o_16.value != term && !o_16.value.match(term))
                break Fail8;
            if(o_16.value == null)
              break Fail8;
            term = termFactory.makeTuple((IStrategoTerm)termFactory.makeListCons(termFactory.makeAppl(transform._consSingleElemAnno_2, new IStrategoTerm[]{ejp.constTypeName0, termFactory.makeAppl(transform._consLit_1, new IStrategoTerm[]{termFactory.makeAppl(transform._consDeci_1, new IStrategoTerm[]{o_16.value})})}), (IStrategoList)ejp.constNil0), i_16);
            term = conc_0_0.instance.invoke(context, term);
            if(term == null)
              break Fail8;
            term = termFactory.makeAppl(transform._consClassDecHead_5, new IStrategoTerm[]{term, k_16, l_16, m_16, n_16});
            q_16 = term;
            term = p_16;
            lifted4 lifted410 = new lifted4();
            lifted410.c_77 = c_77;
            lifted410.o_16 = o_16;
            lifted410.e_77 = e_77;
            lifted410.f_77 = f_77;
            term = SRTS_all.instance.invoke(context, term, lifted410);
            if(term == null)
              break Fail8;
            term = termFactory.makeAppl(transform._consClassBody_1, new IStrategoTerm[]{term});
            r_16 = term;
          }
          term = termFactory.makeAppl(transform._consClassDec_2, new IStrategoTerm[]{q_16, r_16});
          if(true)
            break Success5;
        }
        term = term5;
        IStrategoTerm term7 = term;
        Success7:
        { 
          Fail10:
          { 
            IStrategoTerm m_15 = null;
            IStrategoTerm o_15 = null;
            IStrategoTerm p_15 = null;
            IStrategoTerm q_15 = null;
            IStrategoTerm r_15 = null;
            IStrategoTerm s_15 = null;
            TermReference t_15 = new TermReference();
            IStrategoTerm u_15 = null;
            IStrategoTerm v_15 = null;
            IStrategoTerm w_15 = null;
            if(term.getTermType() != IStrategoTerm.APPL || transform._consMethodDec_2 != ((IStrategoAppl)term).getConstructor())
              break Fail10;
            IStrategoTerm arg6 = term.getSubterm(0);
            if(arg6.getTermType() != IStrategoTerm.APPL || transform._consMethodDecHead_6 != ((IStrategoAppl)arg6).getConstructor())
              break Fail10;
            m_15 = arg6.getSubterm(0);
            o_15 = arg6.getSubterm(1);
            p_15 = arg6.getSubterm(2);
            q_15 = arg6.getSubterm(3);
            r_15 = arg6.getSubterm(4);
            s_15 = arg6.getSubterm(5);
            IStrategoTerm arg7 = term.getSubterm(1);
            if(arg7.getTermType() != IStrategoTerm.APPL || transform._consBlock_1 != ((IStrategoAppl)arg7).getConstructor())
              break Fail10;
            u_15 = arg7.getSubterm(0);
            term = r_15;
            lifted6 lifted610 = new lifted6();
            lifted610.c_77 = c_77;
            term = SRTS_all.instance.invoke(context, term, lifted610);
            if(term == null)
              break Fail10;
            IStrategoTerm term8 = term;
            Success8:
            { 
              Fail11:
              { 
                IStrategoTerm x_15 = null;
                x_15 = term;
                term = fetch_1_0.instance.invoke(context, m_15, lifted8.instance);
                if(term == null)
                  break Fail11;
                term = x_15;
                { 
                  term = termFactory.makeAppl(transform._consMethodDecHead_6, new IStrategoTerm[]{m_15, o_15, p_15, q_15, r_15, s_15});
                  v_15 = term;
                  lifted9 lifted90 = new lifted9();
                  lifted90.c_77 = c_77;
                  lifted90.d_77 = d_77;
                  lifted90.e_77 = e_77;
                  lifted90.f_77 = f_77;
                  term = allow_extends_1_1.instance.invoke(context, term, lifted90, u_15);
                  if(term == null)
                    break Fail10;
                  term = termFactory.makeAppl(transform._consBlock_1, new IStrategoTerm[]{term});
                  w_15 = term;
                  if(true)
                    break Success8;
                }
              }
              term = term8;
              term = random_string_0_0.instance.invoke(context, term);
              if(term == null)
                break Fail10;
              if(t_15.value == null)
                t_15.value = term;
              else
                if(t_15.value != term && !t_15.value.match(term))
                  break Fail10;
              if(t_15.value == null)
                break Fail10;
              term = termFactory.makeTuple((IStrategoTerm)termFactory.makeListCons(termFactory.makeAppl(transform._consSingleElemAnno_2, new IStrategoTerm[]{ejp.constTypeName1, termFactory.makeAppl(transform._consLit_1, new IStrategoTerm[]{termFactory.makeAppl(transform._consDeci_1, new IStrategoTerm[]{t_15.value})})}), (IStrategoList)ejp.constNil0), m_15);
              term = conc_0_0.instance.invoke(context, term);
              if(term == null)
                break Fail10;
              term = termFactory.makeAppl(transform._consMethodDecHead_6, new IStrategoTerm[]{term, o_15, p_15, q_15, r_15, s_15});
              v_15 = term;
              lifted10 lifted100 = new lifted10();
              lifted100.c_77 = c_77;
              lifted100.d_77 = d_77;
              lifted100.t_15 = t_15;
              lifted100.f_77 = f_77;
              term = allow_extends_1_1.instance.invoke(context, term, lifted100, u_15);
              if(term == null)
                break Fail10;
              term = termFactory.makeAppl(transform._consBlock_1, new IStrategoTerm[]{term});
              w_15 = term;
            }
            term = termFactory.makeAppl(transform._consMethodDec_2, new IStrategoTerm[]{v_15, w_15});
            if(true)
              break Success7;
          }
          term = term7;
          IStrategoTerm term9 = term;
          Success9:
          { 
            Fail12:
            { 
              IStrategoTerm f_15 = null;
              if(term.getTermType() != IStrategoTerm.APPL || transform._consBlock_1 != ((IStrategoAppl)term).getConstructor())
                break Fail12;
              f_15 = term.getSubterm(0);
              term = f_15;
              lifted11 lifted111 = new lifted11();
              lifted111.c_77 = c_77;
              lifted111.d_77 = d_77;
              lifted111.e_77 = e_77;
              lifted111.f_77 = f_77;
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
                TermReference x_14 = new TermReference();
                TermReference y_14 = new TermReference();
                IStrategoTerm z_14 = null;
                if(term.getTermType() != IStrategoTerm.APPL || transform._consLocalVarDecStm_1 != ((IStrategoAppl)term).getConstructor())
                  break Fail13;
                IStrategoTerm arg12 = term.getSubterm(0);
                if(arg12.getTermType() != IStrategoTerm.APPL || transform._consLocalVarDec_3 != ((IStrategoAppl)arg12).getConstructor())
                  break Fail13;
                if(x_14.value == null)
                  x_14.value = arg12.getSubterm(0);
                else
                  if(x_14.value != arg12.getSubterm(0) && !x_14.value.match(arg12.getSubterm(0)))
                    break Fail13;
                if(y_14.value == null)
                  y_14.value = arg12.getSubterm(1);
                else
                  if(y_14.value != arg12.getSubterm(1) && !y_14.value.match(arg12.getSubterm(1)))
                    break Fail13;
                z_14 = arg12.getSubterm(2);
                term = z_14;
                lifted13 lifted130 = new lifted13();
                lifted130.c_77 = c_77;
                lifted130.x_14 = x_14;
                lifted130.y_14 = y_14;
                lifted130.d_77 = d_77;
                lifted130.e_77 = e_77;
                lifted130.f_77 = f_77;
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
                  TermReference j_14 = new TermReference();
                  IStrategoTerm k_14 = null;
                  if(term.getTermType() != IStrategoTerm.APPL || transform._consInstanceInit_1 != ((IStrategoAppl)term).getConstructor())
                    break Fail14;
                  IStrategoTerm arg13 = term.getSubterm(0);
                  if(arg13.getTermType() != IStrategoTerm.APPL || transform._consBlock_1 != ((IStrategoAppl)arg13).getConstructor())
                    break Fail14;
                  k_14 = arg13.getSubterm(0);
                  term = new_hashtable_0_0.instance.invoke(context, term);
                  if(term == null)
                    break Fail14;
                  if(j_14.value == null)
                    j_14.value = term;
                  else
                    if(j_14.value != term && !j_14.value.match(term))
                      break Fail14;
                  term = k_14;
                  lifted14 lifted140 = new lifted14();
                  lifted140.j_14 = j_14;
                  lifted140.f_77 = f_77;
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
                    TermReference v_13 = new TermReference();
                    IStrategoTerm w_13 = null;
                    if(term.getTermType() != IStrategoTerm.APPL || transform._consStaticInit_1 != ((IStrategoAppl)term).getConstructor())
                      break Fail15;
                    IStrategoTerm arg14 = term.getSubterm(0);
                    if(arg14.getTermType() != IStrategoTerm.APPL || transform._consBlock_1 != ((IStrategoAppl)arg14).getConstructor())
                      break Fail15;
                    w_13 = arg14.getSubterm(0);
                    term = new_hashtable_0_0.instance.invoke(context, term);
                    if(term == null)
                      break Fail15;
                    if(v_13.value == null)
                      v_13.value = term;
                    else
                      if(v_13.value != term && !v_13.value.match(term))
                        break Fail15;
                    term = w_13;
                    lifted16 lifted160 = new lifted16();
                    lifted160.v_13 = v_13;
                    lifted160.f_77 = f_77;
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
                        IStrategoTerm m_13 = null;
                        IStrategoTerm n_13 = null;
                        IStrategoTerm o_13 = null;
                        IStrategoTerm arg15 = term.getSubterm(0);
                        if(arg15.getTermType() != IStrategoTerm.APPL || transform._consAssign_2 != ((IStrategoAppl)arg15).getConstructor())
                          break Fail16;
                        m_13 = arg15.getSubterm(0);
                        IStrategoTerm arg16 = arg15.getSubterm(1);
                        if(arg16.getTermType() != IStrategoTerm.APPL || transform._consEJPCall_2 != ((IStrategoAppl)arg16).getConstructor())
                          break Fail16;
                        n_13 = arg16.getSubterm(0);
                        o_13 = arg16.getSubterm(1);
                        term = termFactory.makeAppl(transform._consEJPCall_2, new IStrategoTerm[]{n_13, o_13});
                        term = ejp_call_to_method_invokation_0_4.instance.invoke(context, term, c_77.value, d_77.value, e_77.value, f_77.value);
                        if(term == null)
                          break Fail16;
                        term = termFactory.makeAppl(transform._consExprStm_1, new IStrategoTerm[]{termFactory.makeAppl(transform._consAssign_2, new IStrategoTerm[]{m_13, term})});
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
                          IStrategoTerm e_13 = null;
                          IStrategoTerm f_13 = null;
                          IStrategoTerm arg17 = term.getSubterm(0);
                          if(arg17.getTermType() != IStrategoTerm.APPL || transform._consEJPCall_2 != ((IStrategoAppl)arg17).getConstructor())
                            break Fail17;
                          e_13 = arg17.getSubterm(0);
                          f_13 = arg17.getSubterm(1);
                          term = termFactory.makeAppl(transform._consEJPCall_2, new IStrategoTerm[]{e_13, f_13});
                          term = ejp_call_to_method_invokation_0_4.instance.invoke(context, term, c_77.value, d_77.value, e_77.value, f_77.value);
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
                            IStrategoTerm t_12 = null;
                            IStrategoTerm u_12 = null;
                            IStrategoTerm v_12 = null;
                            IStrategoTerm w_12 = null;
                            IStrategoTerm arg18 = term.getSubterm(0);
                            if(arg18.getTermType() != IStrategoTerm.APPL || transform._consScopedEJPCall_3 != ((IStrategoAppl)arg18).getConstructor())
                              break Fail18;
                            t_12 = arg18.getSubterm(0);
                            u_12 = arg18.getSubterm(1);
                            IStrategoTerm arg19 = arg18.getSubterm(2);
                            if(arg19.getTermType() != IStrategoTerm.APPL || transform._consBlock_1 != ((IStrategoAppl)arg19).getConstructor())
                              break Fail18;
                            v_12 = arg19.getSubterm(0);
                            term = create_method_invokation_0_1.instance.invoke(context, term, t_12);
                            if(term == null)
                              break Fail18;
                            w_12 = term;
                            term = termFactory.makeAppl(transform._consScopedEJPCall_3, new IStrategoTerm[]{t_12, u_12, termFactory.makeAppl(transform._consBlock_1, new IStrategoTerm[]{v_12})});
                            term = scoped_ejp_to_java_0_4.instance.invoke(context, term, c_77.value, d_77.value, e_77.value, f_77.value);
                            if(term == null)
                              break Fail18;
                            term = termFactory.makeTuple((IStrategoTerm)termFactory.makeListCons(termFactory.makeAppl(transform._consExprStm_1, new IStrategoTerm[]{w_12}), (IStrategoList)ejp.constNil0), term);
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
                          IStrategoTerm h_12 = null;
                          IStrategoTerm i_12 = null;
                          IStrategoTerm j_12 = null;
                          IStrategoTerm k_12 = null;
                          IStrategoTerm l_12 = null;
                          IStrategoTerm arg20 = term.getSubterm(0);
                          if(arg20.getTermType() != IStrategoTerm.APPL || transform._consAssign_2 != ((IStrategoAppl)arg20).getConstructor())
                            break Fail7;
                          h_12 = arg20.getSubterm(0);
                          IStrategoTerm arg21 = arg20.getSubterm(1);
                          if(arg21.getTermType() != IStrategoTerm.APPL || transform._consScopedEJPCall_3 != ((IStrategoAppl)arg21).getConstructor())
                            break Fail7;
                          i_12 = arg21.getSubterm(0);
                          j_12 = arg21.getSubterm(1);
                          IStrategoTerm arg22 = arg21.getSubterm(2);
                          if(arg22.getTermType() != IStrategoTerm.APPL || transform._consBlock_1 != ((IStrategoAppl)arg22).getConstructor())
                            break Fail7;
                          k_12 = arg22.getSubterm(0);
                          term = create_method_invokation_0_1.instance.invoke(context, term, i_12);
                          if(term == null)
                            break Fail7;
                          l_12 = term;
                          term = termFactory.makeAppl(transform._consScopedEJPCall_3, new IStrategoTerm[]{i_12, j_12, termFactory.makeAppl(transform._consBlock_1, new IStrategoTerm[]{k_12})});
                          term = scoped_ejp_to_java_0_4.instance.invoke(context, term, c_77.value, d_77.value, e_77.value, f_77.value);
                          if(term == null)
                            break Fail7;
                          term = termFactory.makeTuple((IStrategoTerm)termFactory.makeListCons(termFactory.makeAppl(transform._consExprStm_1, new IStrategoTerm[]{termFactory.makeAppl(transform._consAssign_2, new IStrategoTerm[]{h_12, l_12})}), (IStrategoList)ejp.constNil0), term);
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