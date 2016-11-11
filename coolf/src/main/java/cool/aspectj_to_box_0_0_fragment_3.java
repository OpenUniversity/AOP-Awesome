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
            IStrategoTerm u_21 = null;
            u_21 = term.getSubterm(0);
            term = termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{cool.constCons0, (IStrategoTerm)termFactory.makeListCons(cool.constS19, termFactory.makeListCons(cool.constS1, termFactory.makeListCons(u_21, (IStrategoList)cool.constCons1)))});
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
              IStrategoTerm t_21 = null;
              t_21 = term.getSubterm(0);
              term = termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{cool.constCons0, (IStrategoTerm)termFactory.makeListCons(cool.constS20, termFactory.makeListCons(cool.constS1, termFactory.makeListCons(t_21, (IStrategoList)cool.constCons1)))});
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
                IStrategoTerm s_21 = null;
                s_21 = term.getSubterm(0);
                term = termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{cool.constCons0, (IStrategoTerm)termFactory.makeListCons(cool.constS21, termFactory.makeListCons(cool.constS1, termFactory.makeListCons(s_21, (IStrategoList)cool.constCons1)))});
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
                  IStrategoTerm p_21 = null;
                  p_21 = term.getSubterm(0);
                  term = list_to_args_0_0.instance.invoke(context, p_21);
                  if(term == null)
                    break Fail23;
                  term = termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{cool.constCons0, (IStrategoTerm)termFactory.makeListCons(cool.constS22, termFactory.makeListCons(term, (IStrategoList)cool.constNil0))});
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
                    IStrategoTerm o_21 = null;
                    o_21 = term.getSubterm(0);
                    term = o_21;
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
                      IStrategoTerm m_21 = null;
                      IStrategoTerm n_21 = null;
                      m_21 = term.getSubterm(0);
                      n_21 = term.getSubterm(1);
                      term = termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{cool.constCons0, (IStrategoTerm)termFactory.makeListCons(m_21, termFactory.makeListCons(cool.constS23, termFactory.makeListCons(n_21, (IStrategoList)cool.constNil0)))});
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
                        IStrategoTerm k_21 = null;
                        IStrategoTerm l_21 = null;
                        k_21 = term.getSubterm(0);
                        l_21 = term.getSubterm(1);
                        term = termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{cool.constCons4, (IStrategoTerm)termFactory.makeListCons(k_21, termFactory.makeListCons(l_21, (IStrategoList)cool.constNil0))});
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
                          IStrategoTerm d_21 = null;
                          IStrategoTerm e_21 = null;
                          IStrategoTerm f_21 = null;
                          IStrategoTerm g_21 = null;
                          d_21 = term.getSubterm(0);
                          e_21 = term.getSubterm(1);
                          f_21 = term.getSubterm(2);
                          term = list_to_args_0_0.instance.invoke(context, f_21);
                          if(term == null)
                            break Fail27;
                          g_21 = term;
                          term = termFactory.makeTuple(d_21, (IStrategoTerm)termFactory.makeListCons(cool.constFBOX15, termFactory.makeListCons(e_21, termFactory.makeListCons(g_21, (IStrategoList)cool.constNil0))));
                          term = make$Conc_0_0.instance.invoke(context, term);
                          if(term == null)
                            break Fail27;
                          term = termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{cool.constCons4, term});
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
                            IStrategoTerm c_21 = null;
                            c_21 = term.getSubterm(0);
                            term = termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{cool.constCons0, (IStrategoTerm)termFactory.makeListCons(cool.constS26, termFactory.makeListCons(c_21, (IStrategoList)cool.constCons5))});
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
                              term = cool.constFBOX16;
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
                                IStrategoTerm b_21 = null;
                                b_21 = term.getSubterm(0);
                                term = b_21;
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
                                  IStrategoTerm a_21 = null;
                                  a_21 = term.getSubterm(0);
                                  term = a_21;
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
                                    IStrategoTerm z_20 = null;
                                    z_20 = term.getSubterm(0);
                                    term = termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{cool.constCons0, (IStrategoTerm)termFactory.makeListCons(z_20, (IStrategoList)cool.constCons6)});
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
                                      IStrategoTerm x_20 = null;
                                      IStrategoTerm y_20 = null;
                                      x_20 = term.getSubterm(0);
                                      y_20 = term.getSubterm(1);
                                      term = termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{cool.constCons0, (IStrategoTerm)termFactory.makeListCons(x_20, termFactory.makeListCons(y_20, (IStrategoList)cool.constNil0))});
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
                                        IStrategoTerm v_20 = null;
                                        IStrategoTerm w_20 = null;
                                        v_20 = term.getSubterm(0);
                                        w_20 = term.getSubterm(1);
                                        term = termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{cool.constCons0, (IStrategoTerm)termFactory.makeListCons(v_20, termFactory.makeListCons(w_20, (IStrategoList)cool.constCons6))});
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
                                          IStrategoTerm r_20 = null;
                                          IStrategoTerm s_20 = null;
                                          IStrategoTerm arg0 = term.getSubterm(0);
                                          if(arg0.getTermType() != IStrategoTerm.APPL || transform._consAnnoPattern_1 != ((IStrategoAppl)arg0).getConstructor())
                                            break Fail35;
                                          r_20 = arg0.getSubterm(0);
                                          s_20 = term.getSubterm(1);
                                          term = termFactory.makeTuple(r_20, (IStrategoTerm)termFactory.makeListCons(s_20, (IStrategoList)cool.constNil0));
                                          term = make$Conc_0_0.instance.invoke(context, term);
                                          if(term == null)
                                            break Fail35;
                                          term = termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{cool.constCons0, (IStrategoTerm)termFactory.makeListCons(termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{cool.constCons4, term}), (IStrategoList)cool.constNil0)});
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
                                            IStrategoTerm q_20 = null;
                                            q_20 = term.getSubterm(0);
                                            term = termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{cool.constCons0, (IStrategoTerm)termFactory.makeListCons(termFactory.makeAppl(transform._consS_1, new IStrategoTerm[]{q_20}), (IStrategoList)cool.constNil0)});
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
                                              IStrategoTerm o_20 = null;
                                              IStrategoTerm p_20 = null;
                                              o_20 = term.getSubterm(0);
                                              p_20 = term.getSubterm(1);
                                              term = termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{cool.constCons0, (IStrategoTerm)termFactory.makeListCons(o_20, termFactory.makeListCons(cool.constFBOX17, termFactory.makeListCons(termFactory.makeAppl(transform._consS_1, new IStrategoTerm[]{p_20}), (IStrategoList)cool.constNil0)))});
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
                                                IStrategoTerm m_20 = null;
                                                IStrategoTerm n_20 = null;
                                                m_20 = term.getSubterm(0);
                                                n_20 = term.getSubterm(1);
                                                term = termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{cool.constCons0, (IStrategoTerm)termFactory.makeListCons(m_20, termFactory.makeListCons(cool.constFBOX18, termFactory.makeListCons(termFactory.makeAppl(transform._consS_1, new IStrategoTerm[]{n_20}), (IStrategoList)cool.constNil0)))});
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
                                                  term = cool.constS28;
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
                                                    IStrategoTerm l_20 = null;
                                                    l_20 = term.getSubterm(0);
                                                    term = termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{cool.constCons4, (IStrategoTerm)termFactory.makeListCons(l_20, (IStrategoList)cool.constCons7)});
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
                                                      IStrategoTerm k_20 = null;
                                                      k_20 = term.getSubterm(0);
                                                      term = termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{cool.constCons0, (IStrategoTerm)termFactory.makeListCons(k_20, (IStrategoList)cool.constNil0)});
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
                                                        term = cool.constS30;
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
                                                          term = cool.constS28;
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
                                                            IStrategoTerm j_20 = null;
                                                            j_20 = term.getSubterm(0);
                                                            term = j_20;
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
                                                              IStrategoTerm x_19 = null;
                                                              IStrategoTerm y_19 = null;
                                                              IStrategoTerm z_19 = null;
                                                              IStrategoTerm a_20 = null;
                                                              IStrategoTerm b_20 = null;
                                                              IStrategoTerm c_20 = null;
                                                              IStrategoTerm d_20 = null;
                                                              IStrategoTerm e_20 = null;
                                                              IStrategoTerm f_20 = null;
                                                              IStrategoTerm g_20 = null;
                                                              IStrategoTerm arg1 = term.getSubterm(0);
                                                              if(arg1.getTermType() != IStrategoTerm.APPL || transform._consAnnoPattern_1 != ((IStrategoAppl)arg1).getConstructor())
                                                                break Fail45;
                                                              z_19 = arg1.getSubterm(0);
                                                              IStrategoTerm arg2 = term.getSubterm(1);
                                                              if(arg2.getTermType() != IStrategoTerm.APPL || transform._consModPattern_1 != ((IStrategoAppl)arg2).getConstructor())
                                                                break Fail45;
                                                              a_20 = arg2.getSubterm(0);
                                                              x_19 = term.getSubterm(2);
                                                              y_19 = term.getSubterm(3);
                                                              c_20 = term.getSubterm(4);
                                                              e_20 = term.getSubterm(5);
                                                              g_20 = term;
                                                              term = termFactory.makeTuple(z_19, a_20);
                                                              term = conc_0_0.instance.invoke(context, term);
                                                              if(term == null)
                                                                break Fail45;
                                                              b_20 = term;
                                                              term = list_to_args_0_0.instance.invoke(context, c_20);
                                                              if(term == null)
                                                                break Fail45;
                                                              d_20 = term;
                                                              term = option_to_boxes_0_0.instance.invoke(context, e_20);
                                                              if(term == null)
                                                                break Fail45;
                                                              f_20 = term;
                                                              term = g_20;
                                                              IStrategoList list0;
                                                              list0 = checkListTail(f_20);
                                                              if(list0 == null)
                                                                break Fail45;
                                                              term = termFactory.makeTuple(b_20, (IStrategoTerm)termFactory.makeListCons(x_19, termFactory.makeListCons(termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{cool.constCons0, (IStrategoTerm)termFactory.makeListCons(y_19, termFactory.makeListCons(d_20, (IStrategoList)cool.constNil0))}), list0)));
                                                              term = make$Conc_0_0.instance.invoke(context, term);
                                                              if(term == null)
                                                                break Fail45;
                                                              term = termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{cool.constCons4, term});
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
                                                                IStrategoTerm n_19 = null;
                                                                IStrategoTerm o_19 = null;
                                                                IStrategoTerm p_19 = null;
                                                                IStrategoTerm q_19 = null;
                                                                IStrategoTerm r_19 = null;
                                                                IStrategoTerm s_19 = null;
                                                                IStrategoTerm t_19 = null;
                                                                IStrategoTerm arg3 = term.getSubterm(0);
                                                                if(arg3.getTermType() != IStrategoTerm.APPL || transform._consAnnoPattern_1 != ((IStrategoAppl)arg3).getConstructor())
                                                                  break Fail46;
                                                                p_19 = arg3.getSubterm(0);
                                                                IStrategoTerm arg4 = term.getSubterm(1);
                                                                if(arg4.getTermType() != IStrategoTerm.APPL || transform._consModPattern_1 != ((IStrategoAppl)arg4).getConstructor())
                                                                  break Fail46;
                                                                q_19 = arg4.getSubterm(0);
                                                                n_19 = term.getSubterm(2);
                                                                s_19 = term.getSubterm(3);
                                                                o_19 = term.getSubterm(4);
                                                                term = termFactory.makeTuple(p_19, q_19);
                                                                term = conc_0_0.instance.invoke(context, term);
                                                                if(term == null)
                                                                  break Fail46;
                                                                r_19 = term;
                                                                term = list_to_args_0_0.instance.invoke(context, s_19);
                                                                if(term == null)
                                                                  break Fail46;
                                                                t_19 = term;
                                                                term = termFactory.makeTuple(r_19, (IStrategoTerm)termFactory.makeListCons(termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{cool.constCons0, (IStrategoTerm)termFactory.makeListCons(n_19, termFactory.makeListCons(t_19, (IStrategoList)cool.constNil0))}), termFactory.makeListCons(o_19, (IStrategoList)cool.constNil0)));
                                                                term = make$Conc_0_0.instance.invoke(context, term);
                                                                if(term == null)
                                                                  break Fail46;
                                                                term = termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{cool.constCons4, term});
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