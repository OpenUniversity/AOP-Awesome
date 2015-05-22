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

@SuppressWarnings("all") public class aspectj_to_box_0_0_fragment_0 extends Strategy 
{ 
  public static aspectj_to_box_0_0_fragment_0 instance = new aspectj_to_box_0_0_fragment_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("aspectj_to_box_0_0_fragment_0");
    Fail208:
    { 
      IStrategoTerm term156 = term;
      IStrategoConstructor cons22 = term.getTermType() == IStrategoTerm.APPL ? ((IStrategoAppl)term).getConstructor() : null;
      Success151:
      { 
        if(cons22 == transform._consDecError_2)
        { 
          Fail209:
          { 
            IStrategoTerm f_42 = null;
            IStrategoTerm g_42 = null;
            f_42 = term.getSubterm(0);
            g_42 = term.getSubterm(1);
            term = termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{ejp.constCons29, (IStrategoTerm)termFactory.makeListCons(ejp.constFBOX30, termFactory.makeListCons(ejp.constFBOX32, termFactory.makeListCons(ejp.constFBOX21, termFactory.makeListCons(f_42, termFactory.makeListCons(ejp.constFBOX21, termFactory.makeListCons(g_42, (IStrategoList)ejp.constCons38))))))});
            if(true)
              break Success151;
          }
          term = term156;
        }
        Success152:
        { 
          if(cons22 == transform._consDecSoft_2)
          { 
            Fail210:
            { 
              IStrategoTerm d_42 = null;
              IStrategoTerm e_42 = null;
              d_42 = term.getSubterm(0);
              e_42 = term.getSubterm(1);
              term = termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{ejp.constCons29, (IStrategoTerm)termFactory.makeListCons(ejp.constFBOX30, termFactory.makeListCons(ejp.constFBOX33, termFactory.makeListCons(ejp.constFBOX21, termFactory.makeListCons(d_42, termFactory.makeListCons(ejp.constFBOX21, termFactory.makeListCons(e_42, (IStrategoList)ejp.constCons38))))))});
              if(true)
                break Success152;
            }
            term = term156;
          }
          Success153:
          { 
            if(cons22 == transform._consDecPrecedence_2)
            { 
              Fail211:
              { 
                IStrategoTerm x_41 = null;
                IStrategoTerm y_41 = null;
                IStrategoTerm z_41 = null;
                x_41 = term.getSubterm(0);
                y_41 = term.getSubterm(1);
                term = separate_by_comma_0_0.instance.invoke(context, y_41);
                if(term == null)
                  break Fail211;
                z_41 = term;
                term = termFactory.makeTuple(x_41, (IStrategoTerm)termFactory.makeListCons(ejp.constFBOX30, termFactory.makeListCons(ejp.constFBOX34, termFactory.makeListCons(ejp.constFBOX21, termFactory.makeListCons(z_41, (IStrategoList)ejp.constCons38)))));
                term = make$Conc_0_0.instance.invoke(context, term);
                if(term == null)
                  break Fail211;
                term = termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{ejp.constCons29, term});
                if(true)
                  break Success153;
              }
              term = term156;
            }
            Success154:
            { 
              if(cons22 == transform._consDecAnno_4)
              { 
                Fail212:
                { 
                  IStrategoTerm r_41 = null;
                  IStrategoTerm s_41 = null;
                  IStrategoTerm t_41 = null;
                  IStrategoTerm u_41 = null;
                  r_41 = term.getSubterm(0);
                  s_41 = term.getSubterm(1);
                  t_41 = term.getSubterm(2);
                  u_41 = term.getSubterm(3);
                  term = termFactory.makeTuple(r_41, (IStrategoTerm)termFactory.makeListCons(ejp.constFBOX30, termFactory.makeListCons(s_41, termFactory.makeListCons(ejp.constS26, termFactory.makeListCons(t_41, termFactory.makeListCons(ejp.constS26, termFactory.makeListCons(u_41, (IStrategoList)ejp.constCons30)))))));
                  term = make$Conc_0_0.instance.invoke(context, term);
                  if(term == null)
                    break Fail212;
                  term = termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{ejp.constCons29, term});
                  if(true)
                    break Success154;
                }
                term = term156;
              }
              Success155:
              { 
                if(cons22 == transform._consDecAnnoType_0)
                { 
                  Fail213:
                  { 
                    term = ejp.constS48;
                    if(true)
                      break Success155;
                  }
                  term = term156;
                }
                Success156:
                { 
                  if(cons22 == transform._consDecAnnoConstructor_0)
                  { 
                    Fail214:
                    { 
                      term = ejp.constS49;
                      if(true)
                        break Success156;
                    }
                    term = term156;
                  }
                  Success157:
                  { 
                    if(cons22 == transform._consDecAnnoMethod_0)
                    { 
                      Fail215:
                      { 
                        term = ejp.constS50;
                        if(true)
                          break Success157;
                      }
                      term = term156;
                    }
                    Success158:
                    { 
                      if(cons22 == transform._consDecAnnoField_0)
                      { 
                        Fail216:
                        { 
                          term = ejp.constS51;
                          if(true)
                            break Success158;
                        }
                        term = term156;
                      }
                      Success159:
                      { 
                        if(cons22 == transform._consAspectDec_2)
                        { 
                          Fail217:
                          { 
                            IStrategoTerm p_41 = null;
                            IStrategoTerm q_41 = null;
                            p_41 = term.getSubterm(0);
                            q_41 = term.getSubterm(1);
                            term = termFactory.makeAppl(transform._consV_2, new IStrategoTerm[]{ejp.constCons36, (IStrategoTerm)termFactory.makeListCons(p_41, termFactory.makeListCons(q_41, (IStrategoList)ejp.constNil0))});
                            if(true)
                              break Success159;
                          }
                          term = term156;
                        }
                        Success160:
                        { 
                          if(cons22 == transform._consAspectDecHead_6)
                          { 
                            Fail218:
                            { 
                              IStrategoTerm w_40 = null;
                              IStrategoTerm x_40 = null;
                              IStrategoTerm y_40 = null;
                              IStrategoTerm z_40 = null;
                              IStrategoTerm a_41 = null;
                              IStrategoTerm b_41 = null;
                              IStrategoTerm c_41 = null;
                              IStrategoTerm d_41 = null;
                              IStrategoTerm e_41 = null;
                              IStrategoTerm f_41 = null;
                              IStrategoTerm g_41 = null;
                              IStrategoTerm j_41 = null;
                              IStrategoTerm k_41 = null;
                              w_40 = term.getSubterm(0);
                              x_40 = term.getSubterm(1);
                              y_40 = term.getSubterm(2);
                              a_41 = term.getSubterm(3);
                              c_41 = term.getSubterm(4);
                              e_41 = term.getSubterm(5);
                              g_41 = term;
                              term = option_to_boxes_0_0.instance.invoke(context, y_40);
                              if(term == null)
                                break Fail218;
                              z_40 = term;
                              term = option_to_boxes_0_0.instance.invoke(context, a_41);
                              if(term == null)
                                break Fail218;
                              b_41 = term;
                              term = option_to_boxes_0_0.instance.invoke(context, c_41);
                              if(term == null)
                                break Fail218;
                              d_41 = term;
                              term = option_to_boxes_0_0.instance.invoke(context, e_41);
                              if(term == null)
                                break Fail218;
                              f_41 = term;
                              term = g_41;
                              k_41 = term;
                              term = termFactory.makeTuple(d_41, f_41);
                              term = make$Conc_0_0.instance.invoke(context, term);
                              if(term == null)
                                break Fail218;
                              term = termFactory.makeTuple(b_41, term);
                              term = make$Conc_0_0.instance.invoke(context, term);
                              if(term == null)
                                break Fail218;
                              term = termFactory.makeTuple(z_40, term);
                              term = make$Conc_0_0.instance.invoke(context, term);
                              if(term == null)
                                break Fail218;
                              j_41 = term;
                              term = k_41;
                              IStrategoList list9;
                              list9 = checkListTail(j_41);
                              if(list9 == null)
                                break Fail218;
                              term = termFactory.makeTuple(w_40, (IStrategoTerm)termFactory.makeListCons(ejp.constFBOX35, termFactory.makeListCons(x_40, list9)));
                              term = make$Conc_0_0.instance.invoke(context, term);
                              if(term == null)
                                break Fail218;
                              term = termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{ejp.constCons29, term});
                              if(true)
                                break Success160;
                            }
                            term = term156;
                          }
                          Success161:
                          { 
                            if(cons22 == transform._consPerTarget_1)
                            { 
                              Fail219:
                              { 
                                IStrategoTerm v_40 = null;
                                v_40 = term.getSubterm(0);
                                term = termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{ejp.constCons25, (IStrategoTerm)termFactory.makeListCons(ejp.constFBOX36, termFactory.makeListCons(ejp.constS1, termFactory.makeListCons(v_40, (IStrategoList)ejp.constCons26)))});
                                if(true)
                                  break Success161;
                              }
                              term = term156;
                            }
                            Success162:
                            { 
                              if(cons22 == transform._consPerThis_1)
                              { 
                                Fail220:
                                { 
                                  IStrategoTerm u_40 = null;
                                  u_40 = term.getSubterm(0);
                                  term = termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{ejp.constCons25, (IStrategoTerm)termFactory.makeListCons(ejp.constFBOX37, termFactory.makeListCons(ejp.constS1, termFactory.makeListCons(u_40, (IStrategoList)ejp.constCons26)))});
                                  if(true)
                                    break Success162;
                                }
                                term = term156;
                              }
                              Success163:
                              { 
                                if(cons22 == transform._consPerCFlow_1)
                                { 
                                  Fail221:
                                  { 
                                    IStrategoTerm t_40 = null;
                                    t_40 = term.getSubterm(0);
                                    term = termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{ejp.constCons25, (IStrategoTerm)termFactory.makeListCons(ejp.constFBOX38, termFactory.makeListCons(ejp.constS1, termFactory.makeListCons(t_40, (IStrategoList)ejp.constCons26)))});
                                    if(true)
                                      break Success163;
                                  }
                                  term = term156;
                                }
                                Success164:
                                { 
                                  if(cons22 == transform._consPerCFlowBelow_1)
                                  { 
                                    Fail222:
                                    { 
                                      IStrategoTerm s_40 = null;
                                      s_40 = term.getSubterm(0);
                                      term = termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{ejp.constCons25, (IStrategoTerm)termFactory.makeListCons(ejp.constFBOX39, termFactory.makeListCons(ejp.constS1, termFactory.makeListCons(s_40, (IStrategoList)ejp.constCons26)))});
                                      if(true)
                                        break Success164;
                                    }
                                    term = term156;
                                  }
                                  Success165:
                                  { 
                                    if(cons22 == transform._consPerTypeWithin_1)
                                    { 
                                      Fail223:
                                      { 
                                        IStrategoTerm r_40 = null;
                                        r_40 = term.getSubterm(0);
                                        term = termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{ejp.constCons25, (IStrategoTerm)termFactory.makeListCons(ejp.constFBOX40, termFactory.makeListCons(ejp.constS1, termFactory.makeListCons(r_40, (IStrategoList)ejp.constCons26)))});
                                        if(true)
                                          break Success165;
                                      }
                                      term = term156;
                                    }
                                    Success166:
                                    { 
                                      if(cons22 == transform._consIsSingleton_0)
                                      { 
                                        Fail224:
                                        { 
                                          term = ejp.constFBOX41;
                                          if(true)
                                            break Success166;
                                        }
                                        term = term156;
                                      }
                                      Success167:
                                      { 
                                        if(cons22 == transform._consAspectBody_1)
                                        { 
                                          Fail225:
                                          { 
                                            IStrategoTerm q_40 = null;
                                            q_40 = term.getSubterm(0);
                                            term = termFactory.makeAppl(transform._consV_2, new IStrategoTerm[]{ejp.constNil0, (IStrategoTerm)termFactory.makeListCons(termFactory.makeAppl(transform._consV_2, new IStrategoTerm[]{ejp.constCons41, (IStrategoTerm)termFactory.makeListCons(ejp.constFBOX43, termFactory.makeListCons(termFactory.makeAppl(transform._consV_2, new IStrategoTerm[]{ejp.constCons42, q_40}), (IStrategoList)ejp.constNil0))}), (IStrategoList)ejp.constCons39)});
                                            if(true)
                                              break Success167;
                                          }
                                          term = term156;
                                        }
                                        Success168:
                                        { 
                                          if(cons22 == transform._consPrivileged_0)
                                          { 
                                            Fail226:
                                            { 
                                              term = ejp.constFBOX44;
                                              if(true)
                                                break Success168;
                                            }
                                            term = term156;
                                          }
                                          if(cons22 == transform._consProceed_0)
                                          { 
                                            term = ejp.constFBOX45;
                                          }
                                          else
                                          { 
                                            break Fail208;
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