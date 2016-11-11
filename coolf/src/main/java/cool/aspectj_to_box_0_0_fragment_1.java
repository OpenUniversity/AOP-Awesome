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

@SuppressWarnings("all") public class aspectj_to_box_0_0_fragment_1 extends Strategy 
{ 
  public static aspectj_to_box_0_0_fragment_1 instance = new aspectj_to_box_0_0_fragment_1();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("aspectj_to_box_0_0_fragment_1");
    Fail72:
    { 
      IStrategoTerm term69 = term;
      IStrategoConstructor cons3 = term.getTermType() == IStrategoTerm.APPL ? ((IStrategoAppl)term).getConstructor() : null;
      Success69:
      { 
        if(cons3 == transform._consIntertypeConstrDecHead_6)
        { 
          Fail73:
          { 
            IStrategoTerm s_16 = null;
            IStrategoTerm t_16 = null;
            IStrategoTerm u_16 = null;
            IStrategoTerm v_16 = null;
            IStrategoTerm w_16 = null;
            IStrategoTerm x_16 = null;
            IStrategoTerm y_16 = null;
            IStrategoTerm z_16 = null;
            IStrategoTerm a_17 = null;
            IStrategoTerm b_17 = null;
            IStrategoTerm c_17 = null;
            IStrategoTerm d_17 = null;
            IStrategoTerm g_17 = null;
            IStrategoTerm h_17 = null;
            a_17 = term.getSubterm(0);
            v_16 = term.getSubterm(1);
            s_16 = term.getSubterm(2);
            w_16 = term.getSubterm(3);
            t_16 = term.getSubterm(4);
            y_16 = term.getSubterm(5);
            d_17 = term;
            term = list_to_args_0_0.instance.invoke(context, t_16);
            if(term == null)
              break Fail73;
            u_16 = term;
            term = type_params_to_boxes_0_0.instance.invoke(context, v_16);
            if(term == null)
              break Fail73;
            b_17 = term;
            term = type_params_to_boxes_0_0.instance.invoke(context, w_16);
            if(term == null)
              break Fail73;
            x_16 = term;
            term = option_to_boxes_0_0.instance.invoke(context, y_16);
            if(term == null)
              break Fail73;
            z_16 = term;
            term = termFactory.makeTuple(a_17, b_17);
            term = conc_0_0.instance.invoke(context, term);
            if(term == null)
              break Fail73;
            c_17 = term;
            term = d_17;
            h_17 = term;
            term = termFactory.makeTuple(x_16, (IStrategoTerm)termFactory.makeListCons(cool.constS23, termFactory.makeListCons(cool.constFBOX19, termFactory.makeListCons(u_16, (IStrategoList)cool.constNil0))));
            term = make$Conc_0_0.instance.invoke(context, term);
            if(term == null)
              break Fail73;
            g_17 = term;
            term = h_17;
            IStrategoList list4;
            IStrategoList list3;
            list3 = checkListTail(z_16);
            if(list3 == null)
              break Fail73;
            list4 = checkListTail(g_17);
            if(list4 == null)
              break Fail73;
            term = termFactory.makeTuple(c_17, (IStrategoTerm)termFactory.makeListCons(termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{cool.constCons0, (IStrategoTerm)termFactory.makeListCons(s_16, list4)}), list3));
            term = make$Conc_0_0.instance.invoke(context, term);
            if(term == null)
              break Fail73;
            term = termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{cool.constCons4, term});
            if(true)
              break Success69;
          }
          term = term69;
        }
        Success70:
        { 
          if(cons3 == transform._consIntertypeFieldDec_5)
          { 
            Fail74:
            { 
              IStrategoTerm h_16 = null;
              IStrategoTerm i_16 = null;
              IStrategoTerm j_16 = null;
              IStrategoTerm k_16 = null;
              IStrategoTerm l_16 = null;
              IStrategoTerm m_16 = null;
              IStrategoTerm n_16 = null;
              IStrategoTerm q_16 = null;
              IStrategoTerm r_16 = null;
              h_16 = term.getSubterm(0);
              i_16 = term.getSubterm(1);
              j_16 = term.getSubterm(2);
              l_16 = term.getSubterm(3);
              k_16 = term.getSubterm(4);
              n_16 = term;
              term = option_to_boxes_0_0.instance.invoke(context, l_16);
              if(term == null)
                break Fail74;
              m_16 = term;
              term = n_16;
              r_16 = term;
              term = termFactory.makeTuple(m_16, (IStrategoTerm)termFactory.makeListCons(cool.constS23, termFactory.makeListCons(k_16, (IStrategoList)cool.constCons5)));
              term = make$Conc_0_0.instance.invoke(context, term);
              if(term == null)
                break Fail74;
              q_16 = term;
              term = r_16;
              IStrategoList list5;
              list5 = checkListTail(q_16);
              if(list5 == null)
                break Fail74;
              term = termFactory.makeTuple(h_16, (IStrategoTerm)termFactory.makeListCons(i_16, termFactory.makeListCons(termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{cool.constCons0, (IStrategoTerm)termFactory.makeListCons(j_16, list5)}), (IStrategoList)cool.constNil0)));
              term = make$Conc_0_0.instance.invoke(context, term);
              if(term == null)
                break Fail74;
              term = termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{cool.constCons4, term});
              if(true)
                break Success70;
            }
            term = term69;
          }
          Success71:
          { 
            if(cons3 == transform._consAdviceDec_5)
            { 
              Fail75:
              { 
                IStrategoTerm w_15 = null;
                IStrategoTerm x_15 = null;
                IStrategoTerm y_15 = null;
                IStrategoTerm z_15 = null;
                IStrategoTerm a_16 = null;
                IStrategoTerm b_16 = null;
                IStrategoTerm c_16 = null;
                IStrategoTerm f_16 = null;
                IStrategoTerm g_16 = null;
                w_15 = term.getSubterm(0);
                x_15 = term.getSubterm(1);
                a_16 = term.getSubterm(2);
                y_15 = term.getSubterm(3);
                z_15 = term.getSubterm(4);
                c_16 = term;
                term = option_to_boxes_0_0.instance.invoke(context, a_16);
                if(term == null)
                  break Fail75;
                b_16 = term;
                term = c_16;
                g_16 = term;
                term = termFactory.makeTuple(b_16, (IStrategoTerm)termFactory.makeListCons(cool.constFBOX21, termFactory.makeListCons(y_15, (IStrategoList)cool.constNil0)));
                term = make$Conc_0_0.instance.invoke(context, term);
                if(term == null)
                  break Fail75;
                f_16 = term;
                term = g_16;
                IStrategoList list6;
                list6 = checkListTail(f_16);
                if(list6 == null)
                  break Fail75;
                term = termFactory.makeTuple(w_15, (IStrategoTerm)termFactory.makeListCons(x_15, list6));
                term = make$Conc_0_0.instance.invoke(context, term);
                if(term == null)
                  break Fail75;
                term = termFactory.makeAppl(transform._consV_2, new IStrategoTerm[]{cool.constCons11, (IStrategoTerm)termFactory.makeListCons(termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{cool.constCons4, term}), termFactory.makeListCons(z_15, (IStrategoList)cool.constNil0))});
                if(true)
                  break Success71;
              }
              term = term69;
            }
            Success72:
            { 
              if(cons3 == transform._consBefore_1)
              { 
                Fail76:
                { 
                  IStrategoTerm t_15 = null;
                  t_15 = term.getSubterm(0);
                  term = separate_by_comma_0_0.instance.invoke(context, t_15);
                  if(term == null)
                    break Fail76;
                  term = termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{cool.constCons0, (IStrategoTerm)termFactory.makeListCons(cool.constFBOX24, termFactory.makeListCons(cool.constFBOX23, termFactory.makeListCons(term, (IStrategoList)cool.constCons12)))});
                  if(true)
                    break Success72;
                }
                term = term69;
              }
              Success73:
              { 
                if(cons3 == transform._consAfter_2)
                { 
                  Fail77:
                  { 
                    IStrategoTerm p_15 = null;
                    IStrategoTerm q_15 = null;
                    q_15 = term.getSubterm(0);
                    p_15 = term.getSubterm(1);
                    term = separate_by_comma_0_0.instance.invoke(context, q_15);
                    if(term == null)
                      break Fail77;
                    term = termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{cool.constCons4, (IStrategoTerm)termFactory.makeListCons(termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{cool.constCons0, (IStrategoTerm)termFactory.makeListCons(cool.constFBOX25, termFactory.makeListCons(cool.constFBOX23, termFactory.makeListCons(term, (IStrategoList)cool.constCons12)))}), termFactory.makeListCons(p_15, (IStrategoList)cool.constNil0))});
                    if(true)
                      break Success73;
                  }
                  term = term69;
                }
                Success74:
                { 
                  if(cons3 == transform._consAround_2)
                  { 
                    Fail78:
                    { 
                      IStrategoTerm l_15 = null;
                      IStrategoTerm m_15 = null;
                      l_15 = term.getSubterm(0);
                      m_15 = term.getSubterm(1);
                      term = separate_by_comma_0_0.instance.invoke(context, m_15);
                      if(term == null)
                        break Fail78;
                      term = termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{cool.constCons4, (IStrategoTerm)termFactory.makeListCons(l_15, termFactory.makeListCons(termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{cool.constCons0, (IStrategoTerm)termFactory.makeListCons(cool.constFBOX26, termFactory.makeListCons(cool.constFBOX23, termFactory.makeListCons(term, (IStrategoList)cool.constCons12)))}), (IStrategoList)cool.constNil0))});
                      if(true)
                        break Success74;
                    }
                    term = term69;
                  }
                  Success75:
                  { 
                    if(cons3 == transform._consReturning_0)
                    { 
                      Fail79:
                      { 
                        term = cool.constFBOX27;
                        if(true)
                          break Success75;
                      }
                      term = term69;
                    }
                    Success76:
                    { 
                      if(cons3 == transform._consReturning_1)
                      { 
                        Fail80:
                        { 
                          IStrategoTerm k_15 = null;
                          k_15 = term.getSubterm(0);
                          term = termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{cool.constCons0, (IStrategoTerm)termFactory.makeListCons(cool.constFBOX27, termFactory.makeListCons(cool.constFBOX23, termFactory.makeListCons(k_15, (IStrategoList)cool.constCons12)))});
                          if(true)
                            break Success76;
                        }
                        term = term69;
                      }
                      Success77:
                      { 
                        if(cons3 == transform._consThrowing_0)
                        { 
                          Fail81:
                          { 
                            term = cool.constFBOX28;
                            if(true)
                              break Success77;
                          }
                          term = term69;
                        }
                        Success78:
                        { 
                          if(cons3 == transform._consThrowing_1)
                          { 
                            Fail82:
                            { 
                              IStrategoTerm j_15 = null;
                              j_15 = term.getSubterm(0);
                              term = termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{cool.constCons0, (IStrategoTerm)termFactory.makeListCons(cool.constFBOX28, termFactory.makeListCons(cool.constFBOX23, termFactory.makeListCons(j_15, (IStrategoList)cool.constCons12)))});
                              if(true)
                                break Success78;
                            }
                            term = term69;
                          }
                          Success79:
                          { 
                            if(cons3 == transform._consDecParent_3)
                            { 
                              Fail83:
                              { 
                                IStrategoTerm e_15 = null;
                                IStrategoTerm f_15 = null;
                                IStrategoTerm g_15 = null;
                                e_15 = term.getSubterm(0);
                                f_15 = term.getSubterm(1);
                                g_15 = term.getSubterm(2);
                                term = termFactory.makeTuple(e_15, (IStrategoTerm)termFactory.makeListCons(cool.constFBOX30, termFactory.makeListCons(cool.constFBOX29, termFactory.makeListCons(cool.constFBOX21, termFactory.makeListCons(f_15, termFactory.makeListCons(g_15, (IStrategoList)cool.constCons13))))));
                                term = make$Conc_0_0.instance.invoke(context, term);
                                if(term == null)
                                  break Fail83;
                                term = termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{cool.constCons4, term});
                                if(true)
                                  break Success79;
                              }
                              term = term69;
                            }
                            Success80:
                            { 
                              if(cons3 == transform._consDecWarning_3)
                              { 
                                Fail84:
                                { 
                                  IStrategoTerm z_14 = null;
                                  IStrategoTerm a_15 = null;
                                  IStrategoTerm b_15 = null;
                                  z_14 = term.getSubterm(0);
                                  a_15 = term.getSubterm(1);
                                  b_15 = term.getSubterm(2);
                                  term = termFactory.makeTuple(z_14, (IStrategoTerm)termFactory.makeListCons(cool.constFBOX30, termFactory.makeListCons(cool.constFBOX31, termFactory.makeListCons(cool.constFBOX21, termFactory.makeListCons(a_15, termFactory.makeListCons(cool.constFBOX21, termFactory.makeListCons(b_15, (IStrategoList)cool.constCons13)))))));
                                  term = make$Conc_0_0.instance.invoke(context, term);
                                  if(term == null)
                                    break Fail84;
                                  term = termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{cool.constCons4, term});
                                  if(true)
                                    break Success80;
                                }
                                term = term69;
                              }
                              term = aspectj_to_box_0_0_fragment_0.instance.invoke(context, term);
                              if(term == null)
                                break Fail72;
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