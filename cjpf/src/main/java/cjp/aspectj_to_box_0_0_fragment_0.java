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

@SuppressWarnings("all") public class aspectj_to_box_0_0_fragment_0 extends Strategy 
{ 
  public static aspectj_to_box_0_0_fragment_0 instance = new aspectj_to_box_0_0_fragment_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("aspectj_to_box_0_0_fragment_0");
    Fail85:
    { 
      IStrategoTerm term81 = term;
      IStrategoConstructor cons4 = term.getTermType() == IStrategoTerm.APPL ? ((IStrategoAppl)term).getConstructor() : null;
      Success81:
      { 
        if(cons4 == transform._consDecError_2)
        { 
          Fail86:
          { 
            IStrategoTerm s_10 = null;
            IStrategoTerm t_10 = null;
            s_10 = term.getSubterm(0);
            t_10 = term.getSubterm(1);
            term = termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{cjp.constCons4, (IStrategoTerm)termFactory.makeListCons(cjp.constFBOX30, termFactory.makeListCons(cjp.constFBOX32, termFactory.makeListCons(cjp.constFBOX21, termFactory.makeListCons(s_10, termFactory.makeListCons(cjp.constFBOX21, termFactory.makeListCons(t_10, (IStrategoList)cjp.constCons13))))))});
            if(true)
              break Success81;
          }
          term = term81;
        }
        Success82:
        { 
          if(cons4 == transform._consDecSoft_2)
          { 
            Fail87:
            { 
              IStrategoTerm q_10 = null;
              IStrategoTerm r_10 = null;
              q_10 = term.getSubterm(0);
              r_10 = term.getSubterm(1);
              term = termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{cjp.constCons4, (IStrategoTerm)termFactory.makeListCons(cjp.constFBOX30, termFactory.makeListCons(cjp.constFBOX33, termFactory.makeListCons(cjp.constFBOX21, termFactory.makeListCons(q_10, termFactory.makeListCons(cjp.constFBOX21, termFactory.makeListCons(r_10, (IStrategoList)cjp.constCons13))))))});
              if(true)
                break Success82;
            }
            term = term81;
          }
          Success83:
          { 
            if(cons4 == transform._consDecPrecedence_2)
            { 
              Fail88:
              { 
                IStrategoTerm k_10 = null;
                IStrategoTerm l_10 = null;
                IStrategoTerm m_10 = null;
                k_10 = term.getSubterm(0);
                l_10 = term.getSubterm(1);
                term = separate_by_comma_0_0.instance.invoke(context, l_10);
                if(term == null)
                  break Fail88;
                m_10 = term;
                term = termFactory.makeTuple(k_10, (IStrategoTerm)termFactory.makeListCons(cjp.constFBOX30, termFactory.makeListCons(cjp.constFBOX34, termFactory.makeListCons(cjp.constFBOX21, termFactory.makeListCons(m_10, (IStrategoList)cjp.constCons13)))));
                term = make$Conc_0_0.instance.invoke(context, term);
                if(term == null)
                  break Fail88;
                term = termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{cjp.constCons4, term});
                if(true)
                  break Success83;
              }
              term = term81;
            }
            Success84:
            { 
              if(cons4 == transform._consDecAnno_4)
              { 
                Fail89:
                { 
                  IStrategoTerm e_10 = null;
                  IStrategoTerm f_10 = null;
                  IStrategoTerm g_10 = null;
                  IStrategoTerm h_10 = null;
                  e_10 = term.getSubterm(0);
                  f_10 = term.getSubterm(1);
                  g_10 = term.getSubterm(2);
                  h_10 = term.getSubterm(3);
                  term = termFactory.makeTuple(e_10, (IStrategoTerm)termFactory.makeListCons(cjp.constFBOX30, termFactory.makeListCons(f_10, termFactory.makeListCons(cjp.constS26, termFactory.makeListCons(g_10, termFactory.makeListCons(cjp.constS26, termFactory.makeListCons(h_10, (IStrategoList)cjp.constCons5)))))));
                  term = make$Conc_0_0.instance.invoke(context, term);
                  if(term == null)
                    break Fail89;
                  term = termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{cjp.constCons4, term});
                  if(true)
                    break Success84;
                }
                term = term81;
              }
              Success85:
              { 
                if(cons4 == transform._consDecAnnoType_0)
                { 
                  Fail90:
                  { 
                    term = cjp.constS48;
                    if(true)
                      break Success85;
                  }
                  term = term81;
                }
                Success86:
                { 
                  if(cons4 == transform._consDecAnnoConstructor_0)
                  { 
                    Fail91:
                    { 
                      term = cjp.constS49;
                      if(true)
                        break Success86;
                    }
                    term = term81;
                  }
                  Success87:
                  { 
                    if(cons4 == transform._consDecAnnoMethod_0)
                    { 
                      Fail92:
                      { 
                        term = cjp.constS50;
                        if(true)
                          break Success87;
                      }
                      term = term81;
                    }
                    Success88:
                    { 
                      if(cons4 == transform._consDecAnnoField_0)
                      { 
                        Fail93:
                        { 
                          term = cjp.constS51;
                          if(true)
                            break Success88;
                        }
                        term = term81;
                      }
                      Success89:
                      { 
                        if(cons4 == transform._consAspectDec_2)
                        { 
                          Fail94:
                          { 
                            IStrategoTerm c_10 = null;
                            IStrategoTerm d_10 = null;
                            c_10 = term.getSubterm(0);
                            d_10 = term.getSubterm(1);
                            term = termFactory.makeAppl(transform._consV_2, new IStrategoTerm[]{cjp.constCons11, (IStrategoTerm)termFactory.makeListCons(c_10, termFactory.makeListCons(d_10, (IStrategoList)cjp.constNil0))});
                            if(true)
                              break Success89;
                          }
                          term = term81;
                        }
                        Success90:
                        { 
                          if(cons4 == transform._consAspectDecHead_6)
                          { 
                            Fail95:
                            { 
                              IStrategoTerm j_9 = null;
                              IStrategoTerm k_9 = null;
                              IStrategoTerm l_9 = null;
                              IStrategoTerm m_9 = null;
                              IStrategoTerm n_9 = null;
                              IStrategoTerm o_9 = null;
                              IStrategoTerm p_9 = null;
                              IStrategoTerm q_9 = null;
                              IStrategoTerm r_9 = null;
                              IStrategoTerm s_9 = null;
                              IStrategoTerm t_9 = null;
                              IStrategoTerm w_9 = null;
                              IStrategoTerm x_9 = null;
                              j_9 = term.getSubterm(0);
                              k_9 = term.getSubterm(1);
                              l_9 = term.getSubterm(2);
                              n_9 = term.getSubterm(3);
                              p_9 = term.getSubterm(4);
                              r_9 = term.getSubterm(5);
                              t_9 = term;
                              term = option_to_boxes_0_0.instance.invoke(context, l_9);
                              if(term == null)
                                break Fail95;
                              m_9 = term;
                              term = option_to_boxes_0_0.instance.invoke(context, n_9);
                              if(term == null)
                                break Fail95;
                              o_9 = term;
                              term = option_to_boxes_0_0.instance.invoke(context, p_9);
                              if(term == null)
                                break Fail95;
                              q_9 = term;
                              term = option_to_boxes_0_0.instance.invoke(context, r_9);
                              if(term == null)
                                break Fail95;
                              s_9 = term;
                              term = t_9;
                              x_9 = term;
                              term = termFactory.makeTuple(q_9, s_9);
                              term = make$Conc_0_0.instance.invoke(context, term);
                              if(term == null)
                                break Fail95;
                              term = termFactory.makeTuple(o_9, term);
                              term = make$Conc_0_0.instance.invoke(context, term);
                              if(term == null)
                                break Fail95;
                              term = termFactory.makeTuple(m_9, term);
                              term = make$Conc_0_0.instance.invoke(context, term);
                              if(term == null)
                                break Fail95;
                              w_9 = term;
                              term = x_9;
                              IStrategoList list7;
                              list7 = checkListTail(w_9);
                              if(list7 == null)
                                break Fail95;
                              term = termFactory.makeTuple(j_9, (IStrategoTerm)termFactory.makeListCons(cjp.constFBOX35, termFactory.makeListCons(k_9, list7)));
                              term = make$Conc_0_0.instance.invoke(context, term);
                              if(term == null)
                                break Fail95;
                              term = termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{cjp.constCons4, term});
                              if(true)
                                break Success90;
                            }
                            term = term81;
                          }
                          Success91:
                          { 
                            if(cons4 == transform._consPerTarget_1)
                            { 
                              Fail96:
                              { 
                                IStrategoTerm i_9 = null;
                                i_9 = term.getSubterm(0);
                                term = termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{cjp.constCons0, (IStrategoTerm)termFactory.makeListCons(cjp.constFBOX36, termFactory.makeListCons(cjp.constS1, termFactory.makeListCons(i_9, (IStrategoList)cjp.constCons1)))});
                                if(true)
                                  break Success91;
                              }
                              term = term81;
                            }
                            Success92:
                            { 
                              if(cons4 == transform._consPerThis_1)
                              { 
                                Fail97:
                                { 
                                  IStrategoTerm h_9 = null;
                                  h_9 = term.getSubterm(0);
                                  term = termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{cjp.constCons0, (IStrategoTerm)termFactory.makeListCons(cjp.constFBOX37, termFactory.makeListCons(cjp.constS1, termFactory.makeListCons(h_9, (IStrategoList)cjp.constCons1)))});
                                  if(true)
                                    break Success92;
                                }
                                term = term81;
                              }
                              Success93:
                              { 
                                if(cons4 == transform._consPerCFlow_1)
                                { 
                                  Fail98:
                                  { 
                                    IStrategoTerm g_9 = null;
                                    g_9 = term.getSubterm(0);
                                    term = termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{cjp.constCons0, (IStrategoTerm)termFactory.makeListCons(cjp.constFBOX38, termFactory.makeListCons(cjp.constS1, termFactory.makeListCons(g_9, (IStrategoList)cjp.constCons1)))});
                                    if(true)
                                      break Success93;
                                  }
                                  term = term81;
                                }
                                Success94:
                                { 
                                  if(cons4 == transform._consPerCFlowBelow_1)
                                  { 
                                    Fail99:
                                    { 
                                      IStrategoTerm f_9 = null;
                                      f_9 = term.getSubterm(0);
                                      term = termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{cjp.constCons0, (IStrategoTerm)termFactory.makeListCons(cjp.constFBOX39, termFactory.makeListCons(cjp.constS1, termFactory.makeListCons(f_9, (IStrategoList)cjp.constCons1)))});
                                      if(true)
                                        break Success94;
                                    }
                                    term = term81;
                                  }
                                  Success95:
                                  { 
                                    if(cons4 == transform._consPerTypeWithin_1)
                                    { 
                                      Fail100:
                                      { 
                                        IStrategoTerm e_9 = null;
                                        e_9 = term.getSubterm(0);
                                        term = termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{cjp.constCons0, (IStrategoTerm)termFactory.makeListCons(cjp.constFBOX40, termFactory.makeListCons(cjp.constS1, termFactory.makeListCons(e_9, (IStrategoList)cjp.constCons1)))});
                                        if(true)
                                          break Success95;
                                      }
                                      term = term81;
                                    }
                                    Success96:
                                    { 
                                      if(cons4 == transform._consIsSingleton_0)
                                      { 
                                        Fail101:
                                        { 
                                          term = cjp.constFBOX41;
                                          if(true)
                                            break Success96;
                                        }
                                        term = term81;
                                      }
                                      Success97:
                                      { 
                                        if(cons4 == transform._consAspectBody_1)
                                        { 
                                          Fail102:
                                          { 
                                            IStrategoTerm d_9 = null;
                                            d_9 = term.getSubterm(0);
                                            term = termFactory.makeAppl(transform._consV_2, new IStrategoTerm[]{cjp.constNil0, (IStrategoTerm)termFactory.makeListCons(termFactory.makeAppl(transform._consV_2, new IStrategoTerm[]{cjp.constCons16, (IStrategoTerm)termFactory.makeListCons(cjp.constFBOX43, termFactory.makeListCons(termFactory.makeAppl(transform._consV_2, new IStrategoTerm[]{cjp.constCons17, d_9}), (IStrategoList)cjp.constNil0))}), (IStrategoList)cjp.constCons14)});
                                            if(true)
                                              break Success97;
                                          }
                                          term = term81;
                                        }
                                        Success98:
                                        { 
                                          if(cons4 == transform._consPrivileged_0)
                                          { 
                                            Fail103:
                                            { 
                                              term = cjp.constFBOX44;
                                              if(true)
                                                break Success98;
                                            }
                                            term = term81;
                                          }
                                          if(cons4 == transform._consProceed_0)
                                          { 
                                            term = cjp.constFBOX45;
                                          }
                                          else
                                          { 
                                            break Fail85;
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