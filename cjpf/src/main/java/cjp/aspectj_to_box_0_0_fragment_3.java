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

@SuppressWarnings("all") public class aspectj_to_box_0_0_fragment_3 extends Strategy 
{ 
  public static aspectj_to_box_0_0_fragment_3 instance = new aspectj_to_box_0_0_fragment_3();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("aspectj_to_box_0_0_fragment_3");
    Fail19:
    { 
      IStrategoTerm term18 = term;
      IStrategoConstructor cons1 = term.getTermType() == IStrategoTerm.APPL ? ((IStrategoAppl)term).getConstructor() : null;
      Success18:
      { 
        if(cons1 == transform._consAtWithin_1)
        { 
          Fail20:
          { 
            IStrategoTerm p_17 = null;
            p_17 = term.getSubterm(0);
            term = termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{cjp.constCons0, (IStrategoTerm)termFactory.makeListCons(cjp.constS19, termFactory.makeListCons(cjp.constS1, termFactory.makeListCons(p_17, (IStrategoList)cjp.constCons1)))});
            if(true)
              break Success18;
          }
          term = term18;
        }
        Success19:
        { 
          if(cons1 == transform._consAtWithinCode_1)
          { 
            Fail21:
            { 
              IStrategoTerm o_17 = null;
              o_17 = term.getSubterm(0);
              term = termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{cjp.constCons0, (IStrategoTerm)termFactory.makeListCons(cjp.constS20, termFactory.makeListCons(cjp.constS1, termFactory.makeListCons(o_17, (IStrategoList)cjp.constCons1)))});
              if(true)
                break Success19;
            }
            term = term18;
          }
          Success20:
          { 
            if(cons1 == transform._consAtAnno_1)
            { 
              Fail22:
              { 
                IStrategoTerm n_17 = null;
                n_17 = term.getSubterm(0);
                term = termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{cjp.constCons0, (IStrategoTerm)termFactory.makeListCons(cjp.constS21, termFactory.makeListCons(cjp.constS1, termFactory.makeListCons(n_17, (IStrategoList)cjp.constCons1)))});
                if(true)
                  break Success20;
              }
              term = term18;
            }
            Success21:
            { 
              if(cons1 == transform._consAtArgs_1)
              { 
                Fail23:
                { 
                  IStrategoTerm k_17 = null;
                  k_17 = term.getSubterm(0);
                  term = list_to_args_0_0.instance.invoke(context, k_17);
                  if(term == null)
                    break Fail23;
                  term = termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{cjp.constCons0, (IStrategoTerm)termFactory.makeListCons(cjp.constS22, termFactory.makeListCons(term, (IStrategoList)cjp.constNil0))});
                  if(true)
                    break Success21;
                }
                term = term18;
              }
              Success22:
              { 
                if(cons1 == transform._consPointcutName_1)
                { 
                  Fail24:
                  { 
                    IStrategoTerm j_17 = null;
                    j_17 = term.getSubterm(0);
                    term = j_17;
                    if(true)
                      break Success22;
                  }
                  term = term18;
                }
                Success23:
                { 
                  if(cons1 == transform._consPointcutName_2)
                  { 
                    Fail25:
                    { 
                      IStrategoTerm h_17 = null;
                      IStrategoTerm i_17 = null;
                      h_17 = term.getSubterm(0);
                      i_17 = term.getSubterm(1);
                      term = termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{cjp.constCons0, (IStrategoTerm)termFactory.makeListCons(h_17, termFactory.makeListCons(cjp.constS23, termFactory.makeListCons(i_17, (IStrategoList)cjp.constNil0)))});
                      if(true)
                        break Success23;
                    }
                    term = term18;
                  }
                  Success24:
                  { 
                    if(cons1 == transform._consPointcutDec_2)
                    { 
                      Fail26:
                      { 
                        IStrategoTerm f_17 = null;
                        IStrategoTerm g_17 = null;
                        f_17 = term.getSubterm(0);
                        g_17 = term.getSubterm(1);
                        term = termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{cjp.constCons4, (IStrategoTerm)termFactory.makeListCons(f_17, termFactory.makeListCons(g_17, (IStrategoList)cjp.constNil0))});
                        if(true)
                          break Success24;
                      }
                      term = term18;
                    }
                    Success25:
                    { 
                      if(cons1 == transform._consPointcutDecHead_3)
                      { 
                        Fail27:
                        { 
                          IStrategoTerm y_16 = null;
                          IStrategoTerm z_16 = null;
                          IStrategoTerm a_17 = null;
                          IStrategoTerm b_17 = null;
                          y_16 = term.getSubterm(0);
                          z_16 = term.getSubterm(1);
                          a_17 = term.getSubterm(2);
                          term = list_to_args_0_0.instance.invoke(context, a_17);
                          if(term == null)
                            break Fail27;
                          b_17 = term;
                          term = termFactory.makeTuple(y_16, (IStrategoTerm)termFactory.makeListCons(cjp.constFBOX15, termFactory.makeListCons(z_16, termFactory.makeListCons(b_17, (IStrategoList)cjp.constNil0))));
                          term = make$Conc_0_0.instance.invoke(context, term);
                          if(term == null)
                            break Fail27;
                          term = termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{cjp.constCons4, term});
                          if(true)
                            break Success25;
                        }
                        term = term18;
                      }
                      Success26:
                      { 
                        if(cons1 == transform._consPointcutBody_1)
                        { 
                          Fail28:
                          { 
                            IStrategoTerm x_16 = null;
                            x_16 = term.getSubterm(0);
                            term = termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{cjp.constCons0, (IStrategoTerm)termFactory.makeListCons(cjp.constS26, termFactory.makeListCons(x_16, (IStrategoList)cjp.constCons5))});
                            if(true)
                              break Success26;
                          }
                          term = term18;
                        }
                        Success27:
                        { 
                          if(cons1 == transform._consNoPointcutBody_0)
                          { 
                            Fail29:
                            { 
                              term = cjp.constFBOX16;
                              if(true)
                                break Success27;
                            }
                            term = term18;
                          }
                          Success28:
                          { 
                            if(cons1 == transform._consRefTypePattern_1)
                            { 
                              Fail30:
                              { 
                                IStrategoTerm w_16 = null;
                                w_16 = term.getSubterm(0);
                                term = w_16;
                                if(true)
                                  break Success28;
                              }
                              term = term18;
                            }
                            Success29:
                            { 
                              if(cons1 == transform._consPrimTypePattern_1)
                              { 
                                Fail31:
                                { 
                                  IStrategoTerm v_16 = null;
                                  v_16 = term.getSubterm(0);
                                  term = v_16;
                                  if(true)
                                    break Success29;
                                }
                                term = term18;
                              }
                              Success30:
                              { 
                                if(cons1 == transform._consSubtype_1)
                                { 
                                  Fail32:
                                  { 
                                    IStrategoTerm u_16 = null;
                                    u_16 = term.getSubterm(0);
                                    term = termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{cjp.constCons0, (IStrategoTerm)termFactory.makeListCons(u_16, (IStrategoList)cjp.constCons6)});
                                    if(true)
                                      break Success30;
                                  }
                                  term = term18;
                                }
                                Success31:
                                { 
                                  if(cons1 == transform._consGenericTypePattern_2)
                                  { 
                                    Fail33:
                                    { 
                                      IStrategoTerm s_16 = null;
                                      IStrategoTerm t_16 = null;
                                      s_16 = term.getSubterm(0);
                                      t_16 = term.getSubterm(1);
                                      term = termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{cjp.constCons0, (IStrategoTerm)termFactory.makeListCons(s_16, termFactory.makeListCons(t_16, (IStrategoList)cjp.constNil0))});
                                      if(true)
                                        break Success31;
                                    }
                                    term = term18;
                                  }
                                  Success32:
                                  { 
                                    if(cons1 == transform._consGenericSubtypePattern_2)
                                    { 
                                      Fail34:
                                      { 
                                        IStrategoTerm q_16 = null;
                                        IStrategoTerm r_16 = null;
                                        q_16 = term.getSubterm(0);
                                        r_16 = term.getSubterm(1);
                                        term = termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{cjp.constCons0, (IStrategoTerm)termFactory.makeListCons(q_16, termFactory.makeListCons(r_16, (IStrategoList)cjp.constCons6))});
                                        if(true)
                                          break Success32;
                                      }
                                      term = term18;
                                    }
                                    Success33:
                                    { 
                                      if(cons1 == transform._consAnnoTypePattern_2)
                                      { 
                                        Fail35:
                                        { 
                                          IStrategoTerm m_16 = null;
                                          IStrategoTerm n_16 = null;
                                          IStrategoTerm arg0 = term.getSubterm(0);
                                          if(arg0.getTermType() != IStrategoTerm.APPL || transform._consAnnoPattern_1 != ((IStrategoAppl)arg0).getConstructor())
                                            break Fail35;
                                          m_16 = arg0.getSubterm(0);
                                          n_16 = term.getSubterm(1);
                                          term = termFactory.makeTuple(m_16, (IStrategoTerm)termFactory.makeListCons(n_16, (IStrategoList)cjp.constNil0));
                                          term = make$Conc_0_0.instance.invoke(context, term);
                                          if(term == null)
                                            break Fail35;
                                          term = termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{cjp.constCons0, (IStrategoTerm)termFactory.makeListCons(termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{cjp.constCons4, term}), (IStrategoList)cjp.constNil0)});
                                          if(true)
                                            break Success33;
                                        }
                                        term = term18;
                                      }
                                      Success34:
                                      { 
                                        if(cons1 == transform._consNamePattern_1)
                                        { 
                                          Fail36:
                                          { 
                                            IStrategoTerm l_16 = null;
                                            l_16 = term.getSubterm(0);
                                            term = termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{cjp.constCons0, (IStrategoTerm)termFactory.makeListCons(termFactory.makeAppl(transform._consS_1, new IStrategoTerm[]{l_16}), (IStrategoList)cjp.constNil0)});
                                            if(true)
                                              break Success34;
                                          }
                                          term = term18;
                                        }
                                        Success35:
                                        { 
                                          if(cons1 == transform._consNamePattern_2)
                                          { 
                                            Fail37:
                                            { 
                                              IStrategoTerm j_16 = null;
                                              IStrategoTerm k_16 = null;
                                              j_16 = term.getSubterm(0);
                                              k_16 = term.getSubterm(1);
                                              term = termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{cjp.constCons0, (IStrategoTerm)termFactory.makeListCons(j_16, termFactory.makeListCons(cjp.constFBOX17, termFactory.makeListCons(termFactory.makeAppl(transform._consS_1, new IStrategoTerm[]{k_16}), (IStrategoList)cjp.constNil0)))});
                                              if(true)
                                                break Success35;
                                            }
                                            term = term18;
                                          }
                                          Success36:
                                          { 
                                            if(cons1 == transform._consWildcardNamePattern_2)
                                            { 
                                              Fail38:
                                              { 
                                                IStrategoTerm h_16 = null;
                                                IStrategoTerm i_16 = null;
                                                h_16 = term.getSubterm(0);
                                                i_16 = term.getSubterm(1);
                                                term = termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{cjp.constCons0, (IStrategoTerm)termFactory.makeListCons(h_16, termFactory.makeListCons(cjp.constFBOX18, termFactory.makeListCons(termFactory.makeAppl(transform._consS_1, new IStrategoTerm[]{i_16}), (IStrategoList)cjp.constNil0)))});
                                                if(true)
                                                  break Success36;
                                              }
                                              term = term18;
                                            }
                                            Success37:
                                            { 
                                              if(cons1 == transform._consFormalWildcard_0)
                                              { 
                                                Fail39:
                                                { 
                                                  term = cjp.constS28;
                                                  if(true)
                                                    break Success37;
                                                }
                                                term = term18;
                                              }
                                              Success38:
                                              { 
                                                if(cons1 == transform._consVarArityParamPattern_1)
                                                { 
                                                  Fail40:
                                                  { 
                                                    IStrategoTerm g_16 = null;
                                                    g_16 = term.getSubterm(0);
                                                    term = termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{cjp.constCons4, (IStrategoTerm)termFactory.makeListCons(g_16, (IStrategoList)cjp.constCons7)});
                                                    if(true)
                                                      break Success38;
                                                  }
                                                  term = term18;
                                                }
                                                Success39:
                                                { 
                                                  if(cons1 == transform._consRegularTypePattern_1)
                                                  { 
                                                    Fail41:
                                                    { 
                                                      IStrategoTerm f_16 = null;
                                                      f_16 = term.getSubterm(0);
                                                      term = termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{cjp.constCons0, (IStrategoTerm)termFactory.makeListCons(f_16, (IStrategoList)cjp.constNil0)});
                                                      if(true)
                                                        break Success39;
                                                    }
                                                    term = term18;
                                                  }
                                                  Success40:
                                                  { 
                                                    if(cons1 == transform._consWildcard_0)
                                                    { 
                                                      Fail42:
                                                      { 
                                                        term = cjp.constS30;
                                                        if(true)
                                                          break Success40;
                                                      }
                                                      term = term18;
                                                    }
                                                    Success41:
                                                    { 
                                                      if(cons1 == transform._consDotWildcard_0)
                                                      { 
                                                        Fail43:
                                                        { 
                                                          term = cjp.constS28;
                                                          if(true)
                                                            break Success41;
                                                        }
                                                        term = term18;
                                                      }
                                                      Success42:
                                                      { 
                                                        if(cons1 == transform._consSimpleNamePattern_1)
                                                        { 
                                                          Fail44:
                                                          { 
                                                            IStrategoTerm e_16 = null;
                                                            e_16 = term.getSubterm(0);
                                                            term = e_16;
                                                            if(true)
                                                              break Success42;
                                                          }
                                                          term = term18;
                                                        }
                                                        Success43:
                                                        { 
                                                          if(cons1 == transform._consMethodPattern_6)
                                                          { 
                                                            Fail45:
                                                            { 
                                                              IStrategoTerm s_15 = null;
                                                              IStrategoTerm t_15 = null;
                                                              IStrategoTerm u_15 = null;
                                                              IStrategoTerm v_15 = null;
                                                              IStrategoTerm w_15 = null;
                                                              IStrategoTerm x_15 = null;
                                                              IStrategoTerm y_15 = null;
                                                              IStrategoTerm z_15 = null;
                                                              IStrategoTerm a_16 = null;
                                                              IStrategoTerm b_16 = null;
                                                              IStrategoTerm arg4 = term.getSubterm(0);
                                                              if(arg4.getTermType() != IStrategoTerm.APPL || transform._consAnnoPattern_1 != ((IStrategoAppl)arg4).getConstructor())
                                                                break Fail45;
                                                              u_15 = arg4.getSubterm(0);
                                                              IStrategoTerm arg5 = term.getSubterm(1);
                                                              if(arg5.getTermType() != IStrategoTerm.APPL || transform._consModPattern_1 != ((IStrategoAppl)arg5).getConstructor())
                                                                break Fail45;
                                                              v_15 = arg5.getSubterm(0);
                                                              s_15 = term.getSubterm(2);
                                                              t_15 = term.getSubterm(3);
                                                              x_15 = term.getSubterm(4);
                                                              z_15 = term.getSubterm(5);
                                                              b_16 = term;
                                                              term = termFactory.makeTuple(u_15, v_15);
                                                              term = conc_0_0.instance.invoke(context, term);
                                                              if(term == null)
                                                                break Fail45;
                                                              w_15 = term;
                                                              term = list_to_args_0_0.instance.invoke(context, x_15);
                                                              if(term == null)
                                                                break Fail45;
                                                              y_15 = term;
                                                              term = option_to_boxes_0_0.instance.invoke(context, z_15);
                                                              if(term == null)
                                                                break Fail45;
                                                              a_16 = term;
                                                              term = b_16;
                                                              IStrategoList list0;
                                                              list0 = checkListTail(a_16);
                                                              if(list0 == null)
                                                                break Fail45;
                                                              term = termFactory.makeTuple(w_15, (IStrategoTerm)termFactory.makeListCons(s_15, termFactory.makeListCons(termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{cjp.constCons0, (IStrategoTerm)termFactory.makeListCons(t_15, termFactory.makeListCons(y_15, (IStrategoList)cjp.constNil0))}), list0)));
                                                              term = make$Conc_0_0.instance.invoke(context, term);
                                                              if(term == null)
                                                                break Fail45;
                                                              term = termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{cjp.constCons4, term});
                                                              if(true)
                                                                break Success43;
                                                            }
                                                            term = term18;
                                                          }
                                                          Success44:
                                                          { 
                                                            if(cons1 == transform._consConstrPattern_5)
                                                            { 
                                                              Fail46:
                                                              { 
                                                                IStrategoTerm i_15 = null;
                                                                IStrategoTerm j_15 = null;
                                                                IStrategoTerm k_15 = null;
                                                                IStrategoTerm l_15 = null;
                                                                IStrategoTerm m_15 = null;
                                                                IStrategoTerm n_15 = null;
                                                                IStrategoTerm o_15 = null;
                                                                IStrategoTerm arg6 = term.getSubterm(0);
                                                                if(arg6.getTermType() != IStrategoTerm.APPL || transform._consAnnoPattern_1 != ((IStrategoAppl)arg6).getConstructor())
                                                                  break Fail46;
                                                                k_15 = arg6.getSubterm(0);
                                                                IStrategoTerm arg7 = term.getSubterm(1);
                                                                if(arg7.getTermType() != IStrategoTerm.APPL || transform._consModPattern_1 != ((IStrategoAppl)arg7).getConstructor())
                                                                  break Fail46;
                                                                l_15 = arg7.getSubterm(0);
                                                                i_15 = term.getSubterm(2);
                                                                n_15 = term.getSubterm(3);
                                                                j_15 = term.getSubterm(4);
                                                                term = termFactory.makeTuple(k_15, l_15);
                                                                term = conc_0_0.instance.invoke(context, term);
                                                                if(term == null)
                                                                  break Fail46;
                                                                m_15 = term;
                                                                term = list_to_args_0_0.instance.invoke(context, n_15);
                                                                if(term == null)
                                                                  break Fail46;
                                                                o_15 = term;
                                                                term = termFactory.makeTuple(m_15, (IStrategoTerm)termFactory.makeListCons(termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{cjp.constCons0, (IStrategoTerm)termFactory.makeListCons(i_15, termFactory.makeListCons(o_15, (IStrategoList)cjp.constNil0))}), termFactory.makeListCons(j_15, (IStrategoList)cjp.constNil0)));
                                                                term = make$Conc_0_0.instance.invoke(context, term);
                                                                if(term == null)
                                                                  break Fail46;
                                                                term = termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{cjp.constCons4, term});
                                                                if(true)
                                                                  break Success44;
                                                              }
                                                              term = term18;
                                                            }
                                                            term = aspectj_to_box_0_0_fragment_2.instance.invoke(context, term);
                                                            if(term == null)
                                                              break Fail19;
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