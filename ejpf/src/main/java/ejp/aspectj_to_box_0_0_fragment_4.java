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

@SuppressWarnings("all") public class aspectj_to_box_0_0_fragment_4 extends Strategy 
{ 
  public static aspectj_to_box_0_0_fragment_4 instance = new aspectj_to_box_0_0_fragment_4();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("aspectj_to_box_0_0_fragment_4");
    Fail123:
    { 
      IStrategoTerm term75 = term;
      IStrategoConstructor cons18 = term.getTermType() == IStrategoTerm.APPL ? ((IStrategoAppl)term).getConstructor() : null;
      Success70:
      { 
        if(cons18 == transform._consInitExec_1)
        { 
          Fail124:
          { 
            IStrategoTerm y_49 = null;
            y_49 = term.getSubterm(0);
            term = termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{ejp.constCons25, (IStrategoTerm)termFactory.makeListCons(ejp.constFBOX0, termFactory.makeListCons(ejp.constS1, termFactory.makeListCons(y_49, (IStrategoList)ejp.constCons26)))});
            if(true)
              break Success70;
          }
          term = term75;
        }
        Success71:
        { 
          if(cons18 == transform._consPreInitExec_1)
          { 
            Fail125:
            { 
              IStrategoTerm x_49 = null;
              x_49 = term.getSubterm(0);
              term = termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{ejp.constCons25, (IStrategoTerm)termFactory.makeListCons(ejp.constFBOX1, termFactory.makeListCons(ejp.constS1, termFactory.makeListCons(x_49, (IStrategoList)ejp.constCons26)))});
              if(true)
                break Success71;
            }
            term = term75;
          }
          Success72:
          { 
            if(cons18 == transform._consStaticInitExec_1)
            { 
              Fail126:
              { 
                IStrategoTerm w_49 = null;
                w_49 = term.getSubterm(0);
                term = termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{ejp.constCons25, (IStrategoTerm)termFactory.makeListCons(ejp.constFBOX2, termFactory.makeListCons(ejp.constS1, termFactory.makeListCons(w_49, (IStrategoList)ejp.constCons26)))});
                if(true)
                  break Success72;
              }
              term = term75;
            }
            Success73:
            { 
              if(cons18 == transform._consGetField_1)
              { 
                Fail127:
                { 
                  IStrategoTerm v_49 = null;
                  v_49 = term.getSubterm(0);
                  term = termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{ejp.constCons25, (IStrategoTerm)termFactory.makeListCons(ejp.constFBOX3, termFactory.makeListCons(ejp.constS1, termFactory.makeListCons(v_49, (IStrategoList)ejp.constCons26)))});
                  if(true)
                    break Success73;
                }
                term = term75;
              }
              Success74:
              { 
                if(cons18 == transform._consSetField_1)
                { 
                  Fail128:
                  { 
                    IStrategoTerm u_49 = null;
                    u_49 = term.getSubterm(0);
                    term = termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{ejp.constCons25, (IStrategoTerm)termFactory.makeListCons(ejp.constFBOX4, termFactory.makeListCons(ejp.constS1, termFactory.makeListCons(u_49, (IStrategoList)ejp.constCons26)))});
                    if(true)
                      break Success74;
                  }
                  term = term75;
                }
                Success75:
                { 
                  if(cons18 == transform._consHandler_1)
                  { 
                    Fail129:
                    { 
                      IStrategoTerm t_49 = null;
                      t_49 = term.getSubterm(0);
                      term = termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{ejp.constCons25, (IStrategoTerm)termFactory.makeListCons(ejp.constFBOX5, termFactory.makeListCons(ejp.constS1, termFactory.makeListCons(t_49, (IStrategoList)ejp.constCons26)))});
                      if(true)
                        break Success75;
                    }
                    term = term75;
                  }
                  Success76:
                  { 
                    if(cons18 == transform._consAdviceExec_0)
                    { 
                      Fail130:
                      { 
                        term = ejp.constH0;
                        if(true)
                          break Success76;
                      }
                      term = term75;
                    }
                    Success77:
                    { 
                      if(cons18 == transform._consWithin_1)
                      { 
                        Fail131:
                        { 
                          IStrategoTerm s_49 = null;
                          s_49 = term.getSubterm(0);
                          term = termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{ejp.constCons25, (IStrategoTerm)termFactory.makeListCons(ejp.constFBOX7, termFactory.makeListCons(ejp.constS1, termFactory.makeListCons(s_49, (IStrategoList)ejp.constCons26)))});
                          if(true)
                            break Success77;
                        }
                        term = term75;
                      }
                      Success78:
                      { 
                        if(cons18 == transform._consWithinCode_1)
                        { 
                          Fail132:
                          { 
                            IStrategoTerm r_49 = null;
                            r_49 = term.getSubterm(0);
                            term = termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{ejp.constCons25, (IStrategoTerm)termFactory.makeListCons(ejp.constFBOX8, termFactory.makeListCons(ejp.constS1, termFactory.makeListCons(r_49, (IStrategoList)ejp.constCons26)))});
                            if(true)
                              break Success78;
                          }
                          term = term75;
                        }
                        Success79:
                        { 
                          if(cons18 == transform._consCFlow_1)
                          { 
                            Fail133:
                            { 
                              IStrategoTerm q_49 = null;
                              q_49 = term.getSubterm(0);
                              term = termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{ejp.constCons25, (IStrategoTerm)termFactory.makeListCons(ejp.constFBOX9, termFactory.makeListCons(ejp.constS1, termFactory.makeListCons(q_49, (IStrategoList)ejp.constCons26)))});
                              if(true)
                                break Success79;
                            }
                            term = term75;
                          }
                          Success80:
                          { 
                            if(cons18 == transform._consCFlowBelow_1)
                            { 
                              Fail134:
                              { 
                                IStrategoTerm p_49 = null;
                                p_49 = term.getSubterm(0);
                                term = termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{ejp.constCons25, (IStrategoTerm)termFactory.makeListCons(ejp.constFBOX10, termFactory.makeListCons(ejp.constS1, termFactory.makeListCons(p_49, (IStrategoList)ejp.constCons26)))});
                                if(true)
                                  break Success80;
                              }
                              term = term75;
                            }
                            Success81:
                            { 
                              if(cons18 == transform._consIf_1)
                              { 
                                Fail135:
                                { 
                                  IStrategoTerm o_49 = null;
                                  o_49 = term.getSubterm(0);
                                  term = termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{ejp.constCons25, (IStrategoTerm)termFactory.makeListCons(ejp.constFBOX11, termFactory.makeListCons(ejp.constS1, termFactory.makeListCons(o_49, (IStrategoList)ejp.constCons26)))});
                                  if(true)
                                    break Success81;
                                }
                                term = term75;
                              }
                              Success82:
                              { 
                                if(cons18 == transform._consThis_1)
                                { 
                                  Fail136:
                                  { 
                                    IStrategoTerm n_49 = null;
                                    n_49 = term.getSubterm(0);
                                    term = termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{ejp.constCons25, (IStrategoTerm)termFactory.makeListCons(ejp.constFBOX12, termFactory.makeListCons(ejp.constS1, termFactory.makeListCons(n_49, (IStrategoList)ejp.constCons26)))});
                                    if(true)
                                      break Success82;
                                  }
                                  term = term75;
                                }
                                Success83:
                                { 
                                  if(cons18 == transform._consTarget_1)
                                  { 
                                    Fail137:
                                    { 
                                      IStrategoTerm m_49 = null;
                                      m_49 = term.getSubterm(0);
                                      term = termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{ejp.constCons25, (IStrategoTerm)termFactory.makeListCons(ejp.constFBOX13, termFactory.makeListCons(ejp.constS1, termFactory.makeListCons(m_49, (IStrategoList)ejp.constCons26)))});
                                      if(true)
                                        break Success83;
                                    }
                                    term = term75;
                                  }
                                  Success84:
                                  { 
                                    if(cons18 == transform._consArgs_1)
                                    { 
                                      Fail138:
                                      { 
                                        IStrategoTerm j_49 = null;
                                        j_49 = term.getSubterm(0);
                                        term = list_to_args_0_0.instance.invoke(context, j_49);
                                        if(term == null)
                                          break Fail138;
                                        term = termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{ejp.constCons25, (IStrategoTerm)termFactory.makeListCons(ejp.constFBOX14, termFactory.makeListCons(term, (IStrategoList)ejp.constNil0))});
                                        if(true)
                                          break Success84;
                                      }
                                      term = term75;
                                    }
                                    Success85:
                                    { 
                                      if(cons18 == transform._consNamedPointcut_2)
                                      { 
                                        Fail139:
                                        { 
                                          IStrategoTerm f_49 = null;
                                          IStrategoTerm g_49 = null;
                                          f_49 = term.getSubterm(0);
                                          g_49 = term.getSubterm(1);
                                          term = list_to_args_0_0.instance.invoke(context, g_49);
                                          if(term == null)
                                            break Fail139;
                                          term = termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{ejp.constCons25, (IStrategoTerm)termFactory.makeListCons(f_49, termFactory.makeListCons(term, (IStrategoList)ejp.constNil0))});
                                          if(true)
                                            break Success85;
                                        }
                                        term = term75;
                                      }
                                      Success86:
                                      { 
                                        if(cons18 == transform._consAtThis_1)
                                        { 
                                          Fail140:
                                          { 
                                            IStrategoTerm e_49 = null;
                                            e_49 = term.getSubterm(0);
                                            term = termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{ejp.constCons25, (IStrategoTerm)termFactory.makeListCons(ejp.constS17, termFactory.makeListCons(ejp.constS1, termFactory.makeListCons(e_49, (IStrategoList)ejp.constCons26)))});
                                            if(true)
                                              break Success86;
                                          }
                                          term = term75;
                                        }
                                        Success87:
                                        { 
                                          if(cons18 == transform._consAtTarget_1)
                                          { 
                                            Fail141:
                                            { 
                                              IStrategoTerm d_49 = null;
                                              d_49 = term.getSubterm(0);
                                              term = termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{ejp.constCons25, (IStrategoTerm)termFactory.makeListCons(ejp.constS18, termFactory.makeListCons(ejp.constS1, termFactory.makeListCons(d_49, (IStrategoList)ejp.constCons26)))});
                                              if(true)
                                                break Success87;
                                            }
                                            term = term75;
                                          }
                                          term = aspectj_to_box_0_0_fragment_3.instance.invoke(context, term);
                                          if(term == null)
                                            break Fail123;
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