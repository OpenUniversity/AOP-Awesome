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
            IStrategoTerm x_14 = null;
            IStrategoTerm y_14 = null;
            x_14 = term.getSubterm(0);
            y_14 = term.getSubterm(1);
            term = termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{cool.constCons4, (IStrategoTerm)termFactory.makeListCons(cool.constFBOX30, termFactory.makeListCons(cool.constFBOX32, termFactory.makeListCons(cool.constFBOX21, termFactory.makeListCons(x_14, termFactory.makeListCons(cool.constFBOX21, termFactory.makeListCons(y_14, (IStrategoList)cool.constCons13))))))});
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
              IStrategoTerm v_14 = null;
              IStrategoTerm w_14 = null;
              v_14 = term.getSubterm(0);
              w_14 = term.getSubterm(1);
              term = termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{cool.constCons4, (IStrategoTerm)termFactory.makeListCons(cool.constFBOX30, termFactory.makeListCons(cool.constFBOX33, termFactory.makeListCons(cool.constFBOX21, termFactory.makeListCons(v_14, termFactory.makeListCons(cool.constFBOX21, termFactory.makeListCons(w_14, (IStrategoList)cool.constCons13))))))});
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
                IStrategoTerm p_14 = null;
                IStrategoTerm q_14 = null;
                IStrategoTerm r_14 = null;
                p_14 = term.getSubterm(0);
                q_14 = term.getSubterm(1);
                term = separate_by_comma_0_0.instance.invoke(context, q_14);
                if(term == null)
                  break Fail88;
                r_14 = term;
                term = termFactory.makeTuple(p_14, (IStrategoTerm)termFactory.makeListCons(cool.constFBOX30, termFactory.makeListCons(cool.constFBOX34, termFactory.makeListCons(cool.constFBOX21, termFactory.makeListCons(r_14, (IStrategoList)cool.constCons13)))));
                term = make$Conc_0_0.instance.invoke(context, term);
                if(term == null)
                  break Fail88;
                term = termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{cool.constCons4, term});
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
                  IStrategoTerm j_14 = null;
                  IStrategoTerm k_14 = null;
                  IStrategoTerm l_14 = null;
                  IStrategoTerm m_14 = null;
                  j_14 = term.getSubterm(0);
                  k_14 = term.getSubterm(1);
                  l_14 = term.getSubterm(2);
                  m_14 = term.getSubterm(3);
                  term = termFactory.makeTuple(j_14, (IStrategoTerm)termFactory.makeListCons(cool.constFBOX30, termFactory.makeListCons(k_14, termFactory.makeListCons(cool.constS26, termFactory.makeListCons(l_14, termFactory.makeListCons(cool.constS26, termFactory.makeListCons(m_14, (IStrategoList)cool.constCons5)))))));
                  term = make$Conc_0_0.instance.invoke(context, term);
                  if(term == null)
                    break Fail89;
                  term = termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{cool.constCons4, term});
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
                    term = cool.constS48;
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
                      term = cool.constS49;
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
                        term = cool.constS50;
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
                          term = cool.constS51;
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
                            IStrategoTerm h_14 = null;
                            IStrategoTerm i_14 = null;
                            h_14 = term.getSubterm(0);
                            i_14 = term.getSubterm(1);
                            term = termFactory.makeAppl(transform._consV_2, new IStrategoTerm[]{cool.constCons11, (IStrategoTerm)termFactory.makeListCons(h_14, termFactory.makeListCons(i_14, (IStrategoList)cool.constNil0))});
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
                              IStrategoTerm o_13 = null;
                              IStrategoTerm p_13 = null;
                              IStrategoTerm q_13 = null;
                              IStrategoTerm r_13 = null;
                              IStrategoTerm s_13 = null;
                              IStrategoTerm t_13 = null;
                              IStrategoTerm u_13 = null;
                              IStrategoTerm v_13 = null;
                              IStrategoTerm w_13 = null;
                              IStrategoTerm x_13 = null;
                              IStrategoTerm y_13 = null;
                              IStrategoTerm b_14 = null;
                              IStrategoTerm c_14 = null;
                              o_13 = term.getSubterm(0);
                              p_13 = term.getSubterm(1);
                              q_13 = term.getSubterm(2);
                              s_13 = term.getSubterm(3);
                              u_13 = term.getSubterm(4);
                              w_13 = term.getSubterm(5);
                              y_13 = term;
                              term = option_to_boxes_0_0.instance.invoke(context, q_13);
                              if(term == null)
                                break Fail95;
                              r_13 = term;
                              term = option_to_boxes_0_0.instance.invoke(context, s_13);
                              if(term == null)
                                break Fail95;
                              t_13 = term;
                              term = option_to_boxes_0_0.instance.invoke(context, u_13);
                              if(term == null)
                                break Fail95;
                              v_13 = term;
                              term = option_to_boxes_0_0.instance.invoke(context, w_13);
                              if(term == null)
                                break Fail95;
                              x_13 = term;
                              term = y_13;
                              c_14 = term;
                              term = termFactory.makeTuple(v_13, x_13);
                              term = make$Conc_0_0.instance.invoke(context, term);
                              if(term == null)
                                break Fail95;
                              term = termFactory.makeTuple(t_13, term);
                              term = make$Conc_0_0.instance.invoke(context, term);
                              if(term == null)
                                break Fail95;
                              term = termFactory.makeTuple(r_13, term);
                              term = make$Conc_0_0.instance.invoke(context, term);
                              if(term == null)
                                break Fail95;
                              b_14 = term;
                              term = c_14;
                              IStrategoList list7;
                              list7 = checkListTail(b_14);
                              if(list7 == null)
                                break Fail95;
                              term = termFactory.makeTuple(o_13, (IStrategoTerm)termFactory.makeListCons(cool.constFBOX35, termFactory.makeListCons(p_13, list7)));
                              term = make$Conc_0_0.instance.invoke(context, term);
                              if(term == null)
                                break Fail95;
                              term = termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{cool.constCons4, term});
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
                                IStrategoTerm n_13 = null;
                                n_13 = term.getSubterm(0);
                                term = termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{cool.constCons0, (IStrategoTerm)termFactory.makeListCons(cool.constFBOX36, termFactory.makeListCons(cool.constS1, termFactory.makeListCons(n_13, (IStrategoList)cool.constCons1)))});
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
                                  IStrategoTerm m_13 = null;
                                  m_13 = term.getSubterm(0);
                                  term = termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{cool.constCons0, (IStrategoTerm)termFactory.makeListCons(cool.constFBOX37, termFactory.makeListCons(cool.constS1, termFactory.makeListCons(m_13, (IStrategoList)cool.constCons1)))});
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
                                    IStrategoTerm l_13 = null;
                                    l_13 = term.getSubterm(0);
                                    term = termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{cool.constCons0, (IStrategoTerm)termFactory.makeListCons(cool.constFBOX38, termFactory.makeListCons(cool.constS1, termFactory.makeListCons(l_13, (IStrategoList)cool.constCons1)))});
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
                                      IStrategoTerm k_13 = null;
                                      k_13 = term.getSubterm(0);
                                      term = termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{cool.constCons0, (IStrategoTerm)termFactory.makeListCons(cool.constFBOX39, termFactory.makeListCons(cool.constS1, termFactory.makeListCons(k_13, (IStrategoList)cool.constCons1)))});
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
                                        IStrategoTerm j_13 = null;
                                        j_13 = term.getSubterm(0);
                                        term = termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{cool.constCons0, (IStrategoTerm)termFactory.makeListCons(cool.constFBOX40, termFactory.makeListCons(cool.constS1, termFactory.makeListCons(j_13, (IStrategoList)cool.constCons1)))});
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
                                          term = cool.constFBOX41;
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
                                            IStrategoTerm i_13 = null;
                                            i_13 = term.getSubterm(0);
                                            term = termFactory.makeAppl(transform._consV_2, new IStrategoTerm[]{cool.constNil0, (IStrategoTerm)termFactory.makeListCons(termFactory.makeAppl(transform._consV_2, new IStrategoTerm[]{cool.constCons16, (IStrategoTerm)termFactory.makeListCons(cool.constFBOX43, termFactory.makeListCons(termFactory.makeAppl(transform._consV_2, new IStrategoTerm[]{cool.constCons17, i_13}), (IStrategoList)cool.constNil0))}), (IStrategoList)cool.constCons14)});
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
                                              term = cool.constFBOX44;
                                              if(true)
                                                break Success98;
                                            }
                                            term = term81;
                                          }
                                          if(cons4 == transform._consProceed_0)
                                          { 
                                            term = cool.constFBOX45;
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