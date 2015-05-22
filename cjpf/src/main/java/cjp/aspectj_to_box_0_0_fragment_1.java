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
            IStrategoTerm n_12 = null;
            IStrategoTerm o_12 = null;
            IStrategoTerm p_12 = null;
            IStrategoTerm q_12 = null;
            IStrategoTerm r_12 = null;
            IStrategoTerm s_12 = null;
            IStrategoTerm t_12 = null;
            IStrategoTerm u_12 = null;
            IStrategoTerm v_12 = null;
            IStrategoTerm w_12 = null;
            IStrategoTerm x_12 = null;
            IStrategoTerm y_12 = null;
            IStrategoTerm b_13 = null;
            IStrategoTerm c_13 = null;
            v_12 = term.getSubterm(0);
            q_12 = term.getSubterm(1);
            n_12 = term.getSubterm(2);
            r_12 = term.getSubterm(3);
            o_12 = term.getSubterm(4);
            t_12 = term.getSubterm(5);
            y_12 = term;
            term = list_to_args_0_0.instance.invoke(context, o_12);
            if(term == null)
              break Fail73;
            p_12 = term;
            term = type_params_to_boxes_0_0.instance.invoke(context, q_12);
            if(term == null)
              break Fail73;
            w_12 = term;
            term = type_params_to_boxes_0_0.instance.invoke(context, r_12);
            if(term == null)
              break Fail73;
            s_12 = term;
            term = option_to_boxes_0_0.instance.invoke(context, t_12);
            if(term == null)
              break Fail73;
            u_12 = term;
            term = termFactory.makeTuple(v_12, w_12);
            term = conc_0_0.instance.invoke(context, term);
            if(term == null)
              break Fail73;
            x_12 = term;
            term = y_12;
            c_13 = term;
            term = termFactory.makeTuple(s_12, (IStrategoTerm)termFactory.makeListCons(cjp.constS23, termFactory.makeListCons(cjp.constFBOX19, termFactory.makeListCons(p_12, (IStrategoList)cjp.constNil0))));
            term = make$Conc_0_0.instance.invoke(context, term);
            if(term == null)
              break Fail73;
            b_13 = term;
            term = c_13;
            IStrategoList list4;
            IStrategoList list3;
            list3 = checkListTail(u_12);
            if(list3 == null)
              break Fail73;
            list4 = checkListTail(b_13);
            if(list4 == null)
              break Fail73;
            term = termFactory.makeTuple(x_12, (IStrategoTerm)termFactory.makeListCons(termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{cjp.constCons0, (IStrategoTerm)termFactory.makeListCons(n_12, list4)}), list3));
            term = make$Conc_0_0.instance.invoke(context, term);
            if(term == null)
              break Fail73;
            term = termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{cjp.constCons4, term});
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
              IStrategoTerm c_12 = null;
              IStrategoTerm d_12 = null;
              IStrategoTerm e_12 = null;
              IStrategoTerm f_12 = null;
              IStrategoTerm g_12 = null;
              IStrategoTerm h_12 = null;
              IStrategoTerm i_12 = null;
              IStrategoTerm l_12 = null;
              IStrategoTerm m_12 = null;
              c_12 = term.getSubterm(0);
              d_12 = term.getSubterm(1);
              e_12 = term.getSubterm(2);
              g_12 = term.getSubterm(3);
              f_12 = term.getSubterm(4);
              i_12 = term;
              term = option_to_boxes_0_0.instance.invoke(context, g_12);
              if(term == null)
                break Fail74;
              h_12 = term;
              term = i_12;
              m_12 = term;
              term = termFactory.makeTuple(h_12, (IStrategoTerm)termFactory.makeListCons(cjp.constS23, termFactory.makeListCons(f_12, (IStrategoList)cjp.constCons5)));
              term = make$Conc_0_0.instance.invoke(context, term);
              if(term == null)
                break Fail74;
              l_12 = term;
              term = m_12;
              IStrategoList list5;
              list5 = checkListTail(l_12);
              if(list5 == null)
                break Fail74;
              term = termFactory.makeTuple(c_12, (IStrategoTerm)termFactory.makeListCons(d_12, termFactory.makeListCons(termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{cjp.constCons0, (IStrategoTerm)termFactory.makeListCons(e_12, list5)}), (IStrategoList)cjp.constNil0)));
              term = make$Conc_0_0.instance.invoke(context, term);
              if(term == null)
                break Fail74;
              term = termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{cjp.constCons4, term});
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
                IStrategoTerm r_11 = null;
                IStrategoTerm s_11 = null;
                IStrategoTerm t_11 = null;
                IStrategoTerm u_11 = null;
                IStrategoTerm v_11 = null;
                IStrategoTerm w_11 = null;
                IStrategoTerm x_11 = null;
                IStrategoTerm a_12 = null;
                IStrategoTerm b_12 = null;
                r_11 = term.getSubterm(0);
                s_11 = term.getSubterm(1);
                v_11 = term.getSubterm(2);
                t_11 = term.getSubterm(3);
                u_11 = term.getSubterm(4);
                x_11 = term;
                term = option_to_boxes_0_0.instance.invoke(context, v_11);
                if(term == null)
                  break Fail75;
                w_11 = term;
                term = x_11;
                b_12 = term;
                term = termFactory.makeTuple(w_11, (IStrategoTerm)termFactory.makeListCons(cjp.constFBOX21, termFactory.makeListCons(t_11, (IStrategoList)cjp.constNil0)));
                term = make$Conc_0_0.instance.invoke(context, term);
                if(term == null)
                  break Fail75;
                a_12 = term;
                term = b_12;
                IStrategoList list6;
                list6 = checkListTail(a_12);
                if(list6 == null)
                  break Fail75;
                term = termFactory.makeTuple(r_11, (IStrategoTerm)termFactory.makeListCons(s_11, list6));
                term = make$Conc_0_0.instance.invoke(context, term);
                if(term == null)
                  break Fail75;
                term = termFactory.makeAppl(transform._consV_2, new IStrategoTerm[]{cjp.constCons11, (IStrategoTerm)termFactory.makeListCons(termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{cjp.constCons4, term}), termFactory.makeListCons(u_11, (IStrategoList)cjp.constNil0))});
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
                  IStrategoTerm o_11 = null;
                  o_11 = term.getSubterm(0);
                  term = separate_by_comma_0_0.instance.invoke(context, o_11);
                  if(term == null)
                    break Fail76;
                  term = termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{cjp.constCons0, (IStrategoTerm)termFactory.makeListCons(cjp.constFBOX24, termFactory.makeListCons(cjp.constFBOX23, termFactory.makeListCons(term, (IStrategoList)cjp.constCons12)))});
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
                    IStrategoTerm k_11 = null;
                    IStrategoTerm l_11 = null;
                    l_11 = term.getSubterm(0);
                    k_11 = term.getSubterm(1);
                    term = separate_by_comma_0_0.instance.invoke(context, l_11);
                    if(term == null)
                      break Fail77;
                    term = termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{cjp.constCons4, (IStrategoTerm)termFactory.makeListCons(termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{cjp.constCons0, (IStrategoTerm)termFactory.makeListCons(cjp.constFBOX25, termFactory.makeListCons(cjp.constFBOX23, termFactory.makeListCons(term, (IStrategoList)cjp.constCons12)))}), termFactory.makeListCons(k_11, (IStrategoList)cjp.constNil0))});
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
                      IStrategoTerm g_11 = null;
                      IStrategoTerm h_11 = null;
                      g_11 = term.getSubterm(0);
                      h_11 = term.getSubterm(1);
                      term = separate_by_comma_0_0.instance.invoke(context, h_11);
                      if(term == null)
                        break Fail78;
                      term = termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{cjp.constCons4, (IStrategoTerm)termFactory.makeListCons(g_11, termFactory.makeListCons(termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{cjp.constCons0, (IStrategoTerm)termFactory.makeListCons(cjp.constFBOX26, termFactory.makeListCons(cjp.constFBOX23, termFactory.makeListCons(term, (IStrategoList)cjp.constCons12)))}), (IStrategoList)cjp.constNil0))});
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
                        term = cjp.constFBOX27;
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
                          IStrategoTerm f_11 = null;
                          f_11 = term.getSubterm(0);
                          term = termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{cjp.constCons0, (IStrategoTerm)termFactory.makeListCons(cjp.constFBOX27, termFactory.makeListCons(cjp.constFBOX23, termFactory.makeListCons(f_11, (IStrategoList)cjp.constCons12)))});
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
                            term = cjp.constFBOX28;
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
                              IStrategoTerm e_11 = null;
                              e_11 = term.getSubterm(0);
                              term = termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{cjp.constCons0, (IStrategoTerm)termFactory.makeListCons(cjp.constFBOX28, termFactory.makeListCons(cjp.constFBOX23, termFactory.makeListCons(e_11, (IStrategoList)cjp.constCons12)))});
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
                                IStrategoTerm z_10 = null;
                                IStrategoTerm a_11 = null;
                                IStrategoTerm b_11 = null;
                                z_10 = term.getSubterm(0);
                                a_11 = term.getSubterm(1);
                                b_11 = term.getSubterm(2);
                                term = termFactory.makeTuple(z_10, (IStrategoTerm)termFactory.makeListCons(cjp.constFBOX30, termFactory.makeListCons(cjp.constFBOX29, termFactory.makeListCons(cjp.constFBOX21, termFactory.makeListCons(a_11, termFactory.makeListCons(b_11, (IStrategoList)cjp.constCons13))))));
                                term = make$Conc_0_0.instance.invoke(context, term);
                                if(term == null)
                                  break Fail83;
                                term = termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{cjp.constCons4, term});
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
                                  IStrategoTerm u_10 = null;
                                  IStrategoTerm v_10 = null;
                                  IStrategoTerm w_10 = null;
                                  u_10 = term.getSubterm(0);
                                  v_10 = term.getSubterm(1);
                                  w_10 = term.getSubterm(2);
                                  term = termFactory.makeTuple(u_10, (IStrategoTerm)termFactory.makeListCons(cjp.constFBOX30, termFactory.makeListCons(cjp.constFBOX31, termFactory.makeListCons(cjp.constFBOX21, termFactory.makeListCons(v_10, termFactory.makeListCons(cjp.constFBOX21, termFactory.makeListCons(w_10, (IStrategoList)cjp.constCons13)))))));
                                  term = make$Conc_0_0.instance.invoke(context, term);
                                  if(term == null)
                                    break Fail84;
                                  term = termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{cjp.constCons4, term});
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