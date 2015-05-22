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

@SuppressWarnings("all") public class aspectj_to_box_0_0_fragment_4 extends Strategy 
{ 
  public static aspectj_to_box_0_0_fragment_4 instance = new aspectj_to_box_0_0_fragment_4();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("aspectj_to_box_0_0_fragment_4");
    Fail0:
    { 
      IStrategoTerm term0 = term;
      IStrategoConstructor cons0 = term.getTermType() == IStrategoTerm.APPL ? ((IStrategoAppl)term).getConstructor() : null;
      Success0:
      { 
        if(cons0 == transform._consInitExec_1)
        { 
          Fail1:
          { 
            IStrategoTerm l_18 = null;
            l_18 = term.getSubterm(0);
            term = termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{cjp.constCons0, (IStrategoTerm)termFactory.makeListCons(cjp.constFBOX0, termFactory.makeListCons(cjp.constS1, termFactory.makeListCons(l_18, (IStrategoList)cjp.constCons1)))});
            if(true)
              break Success0;
          }
          term = term0;
        }
        Success1:
        { 
          if(cons0 == transform._consPreInitExec_1)
          { 
            Fail2:
            { 
              IStrategoTerm k_18 = null;
              k_18 = term.getSubterm(0);
              term = termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{cjp.constCons0, (IStrategoTerm)termFactory.makeListCons(cjp.constFBOX1, termFactory.makeListCons(cjp.constS1, termFactory.makeListCons(k_18, (IStrategoList)cjp.constCons1)))});
              if(true)
                break Success1;
            }
            term = term0;
          }
          Success2:
          { 
            if(cons0 == transform._consStaticInitExec_1)
            { 
              Fail3:
              { 
                IStrategoTerm j_18 = null;
                j_18 = term.getSubterm(0);
                term = termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{cjp.constCons0, (IStrategoTerm)termFactory.makeListCons(cjp.constFBOX2, termFactory.makeListCons(cjp.constS1, termFactory.makeListCons(j_18, (IStrategoList)cjp.constCons1)))});
                if(true)
                  break Success2;
              }
              term = term0;
            }
            Success3:
            { 
              if(cons0 == transform._consGetField_1)
              { 
                Fail4:
                { 
                  IStrategoTerm i_18 = null;
                  i_18 = term.getSubterm(0);
                  term = termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{cjp.constCons0, (IStrategoTerm)termFactory.makeListCons(cjp.constFBOX3, termFactory.makeListCons(cjp.constS1, termFactory.makeListCons(i_18, (IStrategoList)cjp.constCons1)))});
                  if(true)
                    break Success3;
                }
                term = term0;
              }
              Success4:
              { 
                if(cons0 == transform._consSetField_1)
                { 
                  Fail5:
                  { 
                    IStrategoTerm h_18 = null;
                    h_18 = term.getSubterm(0);
                    term = termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{cjp.constCons0, (IStrategoTerm)termFactory.makeListCons(cjp.constFBOX4, termFactory.makeListCons(cjp.constS1, termFactory.makeListCons(h_18, (IStrategoList)cjp.constCons1)))});
                    if(true)
                      break Success4;
                  }
                  term = term0;
                }
                Success5:
                { 
                  if(cons0 == transform._consHandler_1)
                  { 
                    Fail6:
                    { 
                      IStrategoTerm g_18 = null;
                      g_18 = term.getSubterm(0);
                      term = termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{cjp.constCons0, (IStrategoTerm)termFactory.makeListCons(cjp.constFBOX5, termFactory.makeListCons(cjp.constS1, termFactory.makeListCons(g_18, (IStrategoList)cjp.constCons1)))});
                      if(true)
                        break Success5;
                    }
                    term = term0;
                  }
                  Success6:
                  { 
                    if(cons0 == transform._consAdviceExec_0)
                    { 
                      Fail7:
                      { 
                        term = cjp.constH0;
                        if(true)
                          break Success6;
                      }
                      term = term0;
                    }
                    Success7:
                    { 
                      if(cons0 == transform._consWithin_1)
                      { 
                        Fail8:
                        { 
                          IStrategoTerm f_18 = null;
                          f_18 = term.getSubterm(0);
                          term = termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{cjp.constCons0, (IStrategoTerm)termFactory.makeListCons(cjp.constFBOX7, termFactory.makeListCons(cjp.constS1, termFactory.makeListCons(f_18, (IStrategoList)cjp.constCons1)))});
                          if(true)
                            break Success7;
                        }
                        term = term0;
                      }
                      Success8:
                      { 
                        if(cons0 == transform._consWithinCode_1)
                        { 
                          Fail9:
                          { 
                            IStrategoTerm e_18 = null;
                            e_18 = term.getSubterm(0);
                            term = termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{cjp.constCons0, (IStrategoTerm)termFactory.makeListCons(cjp.constFBOX8, termFactory.makeListCons(cjp.constS1, termFactory.makeListCons(e_18, (IStrategoList)cjp.constCons1)))});
                            if(true)
                              break Success8;
                          }
                          term = term0;
                        }
                        Success9:
                        { 
                          if(cons0 == transform._consCFlow_1)
                          { 
                            Fail10:
                            { 
                              IStrategoTerm d_18 = null;
                              d_18 = term.getSubterm(0);
                              term = termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{cjp.constCons0, (IStrategoTerm)termFactory.makeListCons(cjp.constFBOX9, termFactory.makeListCons(cjp.constS1, termFactory.makeListCons(d_18, (IStrategoList)cjp.constCons1)))});
                              if(true)
                                break Success9;
                            }
                            term = term0;
                          }
                          Success10:
                          { 
                            if(cons0 == transform._consCFlowBelow_1)
                            { 
                              Fail11:
                              { 
                                IStrategoTerm c_18 = null;
                                c_18 = term.getSubterm(0);
                                term = termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{cjp.constCons0, (IStrategoTerm)termFactory.makeListCons(cjp.constFBOX10, termFactory.makeListCons(cjp.constS1, termFactory.makeListCons(c_18, (IStrategoList)cjp.constCons1)))});
                                if(true)
                                  break Success10;
                              }
                              term = term0;
                            }
                            Success11:
                            { 
                              if(cons0 == transform._consIf_1)
                              { 
                                Fail12:
                                { 
                                  IStrategoTerm b_18 = null;
                                  b_18 = term.getSubterm(0);
                                  term = termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{cjp.constCons0, (IStrategoTerm)termFactory.makeListCons(cjp.constFBOX11, termFactory.makeListCons(cjp.constS1, termFactory.makeListCons(b_18, (IStrategoList)cjp.constCons1)))});
                                  if(true)
                                    break Success11;
                                }
                                term = term0;
                              }
                              Success12:
                              { 
                                if(cons0 == transform._consThis_1)
                                { 
                                  Fail13:
                                  { 
                                    IStrategoTerm a_18 = null;
                                    a_18 = term.getSubterm(0);
                                    term = termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{cjp.constCons0, (IStrategoTerm)termFactory.makeListCons(cjp.constFBOX12, termFactory.makeListCons(cjp.constS1, termFactory.makeListCons(a_18, (IStrategoList)cjp.constCons1)))});
                                    if(true)
                                      break Success12;
                                  }
                                  term = term0;
                                }
                                Success13:
                                { 
                                  if(cons0 == transform._consTarget_1)
                                  { 
                                    Fail14:
                                    { 
                                      IStrategoTerm z_17 = null;
                                      z_17 = term.getSubterm(0);
                                      term = termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{cjp.constCons0, (IStrategoTerm)termFactory.makeListCons(cjp.constFBOX13, termFactory.makeListCons(cjp.constS1, termFactory.makeListCons(z_17, (IStrategoList)cjp.constCons1)))});
                                      if(true)
                                        break Success13;
                                    }
                                    term = term0;
                                  }
                                  Success14:
                                  { 
                                    if(cons0 == transform._consArgs_1)
                                    { 
                                      Fail15:
                                      { 
                                        IStrategoTerm w_17 = null;
                                        w_17 = term.getSubterm(0);
                                        term = list_to_args_0_0.instance.invoke(context, w_17);
                                        if(term == null)
                                          break Fail15;
                                        term = termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{cjp.constCons0, (IStrategoTerm)termFactory.makeListCons(cjp.constFBOX14, termFactory.makeListCons(term, (IStrategoList)cjp.constNil0))});
                                        if(true)
                                          break Success14;
                                      }
                                      term = term0;
                                    }
                                    Success15:
                                    { 
                                      if(cons0 == transform._consNamedPointcut_2)
                                      { 
                                        Fail16:
                                        { 
                                          IStrategoTerm s_17 = null;
                                          IStrategoTerm t_17 = null;
                                          s_17 = term.getSubterm(0);
                                          t_17 = term.getSubterm(1);
                                          term = list_to_args_0_0.instance.invoke(context, t_17);
                                          if(term == null)
                                            break Fail16;
                                          term = termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{cjp.constCons0, (IStrategoTerm)termFactory.makeListCons(s_17, termFactory.makeListCons(term, (IStrategoList)cjp.constNil0))});
                                          if(true)
                                            break Success15;
                                        }
                                        term = term0;
                                      }
                                      Success16:
                                      { 
                                        if(cons0 == transform._consAtThis_1)
                                        { 
                                          Fail17:
                                          { 
                                            IStrategoTerm r_17 = null;
                                            r_17 = term.getSubterm(0);
                                            term = termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{cjp.constCons0, (IStrategoTerm)termFactory.makeListCons(cjp.constS17, termFactory.makeListCons(cjp.constS1, termFactory.makeListCons(r_17, (IStrategoList)cjp.constCons1)))});
                                            if(true)
                                              break Success16;
                                          }
                                          term = term0;
                                        }
                                        Success17:
                                        { 
                                          if(cons0 == transform._consAtTarget_1)
                                          { 
                                            Fail18:
                                            { 
                                              IStrategoTerm q_17 = null;
                                              q_17 = term.getSubterm(0);
                                              term = termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{cjp.constCons0, (IStrategoTerm)termFactory.makeListCons(cjp.constS18, termFactory.makeListCons(cjp.constS1, termFactory.makeListCons(q_17, (IStrategoList)cjp.constCons1)))});
                                              if(true)
                                                break Success17;
                                            }
                                            term = term0;
                                          }
                                          term = aspectj_to_box_0_0_fragment_3.instance.invoke(context, term);
                                          if(term == null)
                                            break Fail0;
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