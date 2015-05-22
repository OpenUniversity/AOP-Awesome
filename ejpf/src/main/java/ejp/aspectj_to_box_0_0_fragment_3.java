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

@SuppressWarnings("all") public class aspectj_to_box_0_0_fragment_3 extends Strategy 
{ 
  public static aspectj_to_box_0_0_fragment_3 instance = new aspectj_to_box_0_0_fragment_3();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("aspectj_to_box_0_0_fragment_3");
    Fail142:
    { 
      IStrategoTerm term93 = term;
      IStrategoConstructor cons19 = term.getTermType() == IStrategoTerm.APPL ? ((IStrategoAppl)term).getConstructor() : null;
      Success88:
      { 
        if(cons19 == transform._consAtWithin_1)
        { 
          Fail143:
          { 
            IStrategoTerm c_49 = null;
            c_49 = term.getSubterm(0);
            term = termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{ejp.constCons25, (IStrategoTerm)termFactory.makeListCons(ejp.constS19, termFactory.makeListCons(ejp.constS1, termFactory.makeListCons(c_49, (IStrategoList)ejp.constCons26)))});
            if(true)
              break Success88;
          }
          term = term93;
        }
        Success89:
        { 
          if(cons19 == transform._consAtWithinCode_1)
          { 
            Fail144:
            { 
              IStrategoTerm b_49 = null;
              b_49 = term.getSubterm(0);
              term = termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{ejp.constCons25, (IStrategoTerm)termFactory.makeListCons(ejp.constS20, termFactory.makeListCons(ejp.constS1, termFactory.makeListCons(b_49, (IStrategoList)ejp.constCons26)))});
              if(true)
                break Success89;
            }
            term = term93;
          }
          Success90:
          { 
            if(cons19 == transform._consAtAnno_1)
            { 
              Fail145:
              { 
                IStrategoTerm a_49 = null;
                a_49 = term.getSubterm(0);
                term = termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{ejp.constCons25, (IStrategoTerm)termFactory.makeListCons(ejp.constS21, termFactory.makeListCons(ejp.constS1, termFactory.makeListCons(a_49, (IStrategoList)ejp.constCons26)))});
                if(true)
                  break Success90;
              }
              term = term93;
            }
            Success91:
            { 
              if(cons19 == transform._consAtArgs_1)
              { 
                Fail146:
                { 
                  IStrategoTerm x_48 = null;
                  x_48 = term.getSubterm(0);
                  term = list_to_args_0_0.instance.invoke(context, x_48);
                  if(term == null)
                    break Fail146;
                  term = termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{ejp.constCons25, (IStrategoTerm)termFactory.makeListCons(ejp.constS22, termFactory.makeListCons(term, (IStrategoList)ejp.constNil0))});
                  if(true)
                    break Success91;
                }
                term = term93;
              }
              Success92:
              { 
                if(cons19 == transform._consPointcutName_1)
                { 
                  Fail147:
                  { 
                    IStrategoTerm w_48 = null;
                    w_48 = term.getSubterm(0);
                    term = w_48;
                    if(true)
                      break Success92;
                  }
                  term = term93;
                }
                Success93:
                { 
                  if(cons19 == transform._consPointcutName_2)
                  { 
                    Fail148:
                    { 
                      IStrategoTerm u_48 = null;
                      IStrategoTerm v_48 = null;
                      u_48 = term.getSubterm(0);
                      v_48 = term.getSubterm(1);
                      term = termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{ejp.constCons25, (IStrategoTerm)termFactory.makeListCons(u_48, termFactory.makeListCons(ejp.constS23, termFactory.makeListCons(v_48, (IStrategoList)ejp.constNil0)))});
                      if(true)
                        break Success93;
                    }
                    term = term93;
                  }
                  Success94:
                  { 
                    if(cons19 == transform._consPointcutDec_2)
                    { 
                      Fail149:
                      { 
                        IStrategoTerm s_48 = null;
                        IStrategoTerm t_48 = null;
                        s_48 = term.getSubterm(0);
                        t_48 = term.getSubterm(1);
                        term = termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{ejp.constCons29, (IStrategoTerm)termFactory.makeListCons(s_48, termFactory.makeListCons(t_48, (IStrategoList)ejp.constNil0))});
                        if(true)
                          break Success94;
                      }
                      term = term93;
                    }
                    Success95:
                    { 
                      if(cons19 == transform._consPointcutDecHead_3)
                      { 
                        Fail150:
                        { 
                          IStrategoTerm l_48 = null;
                          IStrategoTerm m_48 = null;
                          IStrategoTerm n_48 = null;
                          IStrategoTerm o_48 = null;
                          l_48 = term.getSubterm(0);
                          m_48 = term.getSubterm(1);
                          n_48 = term.getSubterm(2);
                          term = list_to_args_0_0.instance.invoke(context, n_48);
                          if(term == null)
                            break Fail150;
                          o_48 = term;
                          term = termFactory.makeTuple(l_48, (IStrategoTerm)termFactory.makeListCons(ejp.constFBOX15, termFactory.makeListCons(m_48, termFactory.makeListCons(o_48, (IStrategoList)ejp.constNil0))));
                          term = make$Conc_0_0.instance.invoke(context, term);
                          if(term == null)
                            break Fail150;
                          term = termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{ejp.constCons29, term});
                          if(true)
                            break Success95;
                        }
                        term = term93;
                      }
                      Success96:
                      { 
                        if(cons19 == transform._consPointcutBody_1)
                        { 
                          Fail151:
                          { 
                            IStrategoTerm k_48 = null;
                            k_48 = term.getSubterm(0);
                            term = termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{ejp.constCons25, (IStrategoTerm)termFactory.makeListCons(ejp.constS26, termFactory.makeListCons(k_48, (IStrategoList)ejp.constCons30))});
                            if(true)
                              break Success96;
                          }
                          term = term93;
                        }
                        Success97:
                        { 
                          if(cons19 == transform._consNoPointcutBody_0)
                          { 
                            Fail152:
                            { 
                              term = ejp.constFBOX16;
                              if(true)
                                break Success97;
                            }
                            term = term93;
                          }
                          Success98:
                          { 
                            if(cons19 == transform._consRefTypePattern_1)
                            { 
                              Fail153:
                              { 
                                IStrategoTerm j_48 = null;
                                j_48 = term.getSubterm(0);
                                term = j_48;
                                if(true)
                                  break Success98;
                              }
                              term = term93;
                            }
                            Success99:
                            { 
                              if(cons19 == transform._consPrimTypePattern_1)
                              { 
                                Fail154:
                                { 
                                  IStrategoTerm i_48 = null;
                                  i_48 = term.getSubterm(0);
                                  term = i_48;
                                  if(true)
                                    break Success99;
                                }
                                term = term93;
                              }
                              Success100:
                              { 
                                if(cons19 == transform._consSubtype_1)
                                { 
                                  Fail155:
                                  { 
                                    IStrategoTerm h_48 = null;
                                    h_48 = term.getSubterm(0);
                                    term = termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{ejp.constCons25, (IStrategoTerm)termFactory.makeListCons(h_48, (IStrategoList)ejp.constCons31)});
                                    if(true)
                                      break Success100;
                                  }
                                  term = term93;
                                }
                                Success101:
                                { 
                                  if(cons19 == transform._consGenericTypePattern_2)
                                  { 
                                    Fail156:
                                    { 
                                      IStrategoTerm f_48 = null;
                                      IStrategoTerm g_48 = null;
                                      f_48 = term.getSubterm(0);
                                      g_48 = term.getSubterm(1);
                                      term = termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{ejp.constCons25, (IStrategoTerm)termFactory.makeListCons(f_48, termFactory.makeListCons(g_48, (IStrategoList)ejp.constNil0))});
                                      if(true)
                                        break Success101;
                                    }
                                    term = term93;
                                  }
                                  Success102:
                                  { 
                                    if(cons19 == transform._consGenericSubtypePattern_2)
                                    { 
                                      Fail157:
                                      { 
                                        IStrategoTerm d_48 = null;
                                        IStrategoTerm e_48 = null;
                                        d_48 = term.getSubterm(0);
                                        e_48 = term.getSubterm(1);
                                        term = termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{ejp.constCons25, (IStrategoTerm)termFactory.makeListCons(d_48, termFactory.makeListCons(e_48, (IStrategoList)ejp.constCons31))});
                                        if(true)
                                          break Success102;
                                      }
                                      term = term93;
                                    }
                                    Success103:
                                    { 
                                      if(cons19 == transform._consAnnoTypePattern_2)
                                      { 
                                        Fail158:
                                        { 
                                          IStrategoTerm z_47 = null;
                                          IStrategoTerm a_48 = null;
                                          IStrategoTerm arg145 = term.getSubterm(0);
                                          if(arg145.getTermType() != IStrategoTerm.APPL || transform._consAnnoPattern_1 != ((IStrategoAppl)arg145).getConstructor())
                                            break Fail158;
                                          z_47 = arg145.getSubterm(0);
                                          a_48 = term.getSubterm(1);
                                          term = termFactory.makeTuple(z_47, (IStrategoTerm)termFactory.makeListCons(a_48, (IStrategoList)ejp.constNil0));
                                          term = make$Conc_0_0.instance.invoke(context, term);
                                          if(term == null)
                                            break Fail158;
                                          term = termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{ejp.constCons25, (IStrategoTerm)termFactory.makeListCons(termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{ejp.constCons29, term}), (IStrategoList)ejp.constNil0)});
                                          if(true)
                                            break Success103;
                                        }
                                        term = term93;
                                      }
                                      Success104:
                                      { 
                                        if(cons19 == transform._consNamePattern_1)
                                        { 
                                          Fail159:
                                          { 
                                            IStrategoTerm y_47 = null;
                                            y_47 = term.getSubterm(0);
                                            term = termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{ejp.constCons25, (IStrategoTerm)termFactory.makeListCons(termFactory.makeAppl(transform._consS_1, new IStrategoTerm[]{y_47}), (IStrategoList)ejp.constNil0)});
                                            if(true)
                                              break Success104;
                                          }
                                          term = term93;
                                        }
                                        Success105:
                                        { 
                                          if(cons19 == transform._consNamePattern_2)
                                          { 
                                            Fail160:
                                            { 
                                              IStrategoTerm w_47 = null;
                                              IStrategoTerm x_47 = null;
                                              w_47 = term.getSubterm(0);
                                              x_47 = term.getSubterm(1);
                                              term = termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{ejp.constCons25, (IStrategoTerm)termFactory.makeListCons(w_47, termFactory.makeListCons(ejp.constFBOX17, termFactory.makeListCons(termFactory.makeAppl(transform._consS_1, new IStrategoTerm[]{x_47}), (IStrategoList)ejp.constNil0)))});
                                              if(true)
                                                break Success105;
                                            }
                                            term = term93;
                                          }
                                          Success106:
                                          { 
                                            if(cons19 == transform._consWildcardNamePattern_2)
                                            { 
                                              Fail161:
                                              { 
                                                IStrategoTerm u_47 = null;
                                                IStrategoTerm v_47 = null;
                                                u_47 = term.getSubterm(0);
                                                v_47 = term.getSubterm(1);
                                                term = termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{ejp.constCons25, (IStrategoTerm)termFactory.makeListCons(u_47, termFactory.makeListCons(ejp.constFBOX18, termFactory.makeListCons(termFactory.makeAppl(transform._consS_1, new IStrategoTerm[]{v_47}), (IStrategoList)ejp.constNil0)))});
                                                if(true)
                                                  break Success106;
                                              }
                                              term = term93;
                                            }
                                            Success107:
                                            { 
                                              if(cons19 == transform._consFormalWildcard_0)
                                              { 
                                                Fail162:
                                                { 
                                                  term = ejp.constS28;
                                                  if(true)
                                                    break Success107;
                                                }
                                                term = term93;
                                              }
                                              Success108:
                                              { 
                                                if(cons19 == transform._consVarArityParamPattern_1)
                                                { 
                                                  Fail163:
                                                  { 
                                                    IStrategoTerm t_47 = null;
                                                    t_47 = term.getSubterm(0);
                                                    term = termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{ejp.constCons29, (IStrategoTerm)termFactory.makeListCons(t_47, (IStrategoList)ejp.constCons32)});
                                                    if(true)
                                                      break Success108;
                                                  }
                                                  term = term93;
                                                }
                                                Success109:
                                                { 
                                                  if(cons19 == transform._consRegularTypePattern_1)
                                                  { 
                                                    Fail164:
                                                    { 
                                                      IStrategoTerm s_47 = null;
                                                      s_47 = term.getSubterm(0);
                                                      term = termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{ejp.constCons25, (IStrategoTerm)termFactory.makeListCons(s_47, (IStrategoList)ejp.constNil0)});
                                                      if(true)
                                                        break Success109;
                                                    }
                                                    term = term93;
                                                  }
                                                  Success110:
                                                  { 
                                                    if(cons19 == transform._consWildcard_0)
                                                    { 
                                                      Fail165:
                                                      { 
                                                        term = ejp.constS30;
                                                        if(true)
                                                          break Success110;
                                                      }
                                                      term = term93;
                                                    }
                                                    Success111:
                                                    { 
                                                      if(cons19 == transform._consDotWildcard_0)
                                                      { 
                                                        Fail166:
                                                        { 
                                                          term = ejp.constS28;
                                                          if(true)
                                                            break Success111;
                                                        }
                                                        term = term93;
                                                      }
                                                      Success112:
                                                      { 
                                                        if(cons19 == transform._consSimpleNamePattern_1)
                                                        { 
                                                          Fail167:
                                                          { 
                                                            IStrategoTerm r_47 = null;
                                                            r_47 = term.getSubterm(0);
                                                            term = r_47;
                                                            if(true)
                                                              break Success112;
                                                          }
                                                          term = term93;
                                                        }
                                                        Success113:
                                                        { 
                                                          if(cons19 == transform._consMethodPattern_6)
                                                          { 
                                                            Fail168:
                                                            { 
                                                              IStrategoTerm f_47 = null;
                                                              IStrategoTerm g_47 = null;
                                                              IStrategoTerm h_47 = null;
                                                              IStrategoTerm i_47 = null;
                                                              IStrategoTerm j_47 = null;
                                                              IStrategoTerm k_47 = null;
                                                              IStrategoTerm l_47 = null;
                                                              IStrategoTerm m_47 = null;
                                                              IStrategoTerm n_47 = null;
                                                              IStrategoTerm o_47 = null;
                                                              IStrategoTerm arg146 = term.getSubterm(0);
                                                              if(arg146.getTermType() != IStrategoTerm.APPL || transform._consAnnoPattern_1 != ((IStrategoAppl)arg146).getConstructor())
                                                                break Fail168;
                                                              h_47 = arg146.getSubterm(0);
                                                              IStrategoTerm arg147 = term.getSubterm(1);
                                                              if(arg147.getTermType() != IStrategoTerm.APPL || transform._consModPattern_1 != ((IStrategoAppl)arg147).getConstructor())
                                                                break Fail168;
                                                              i_47 = arg147.getSubterm(0);
                                                              f_47 = term.getSubterm(2);
                                                              g_47 = term.getSubterm(3);
                                                              k_47 = term.getSubterm(4);
                                                              m_47 = term.getSubterm(5);
                                                              o_47 = term;
                                                              term = termFactory.makeTuple(h_47, i_47);
                                                              term = conc_0_0.instance.invoke(context, term);
                                                              if(term == null)
                                                                break Fail168;
                                                              j_47 = term;
                                                              term = list_to_args_0_0.instance.invoke(context, k_47);
                                                              if(term == null)
                                                                break Fail168;
                                                              l_47 = term;
                                                              term = option_to_boxes_0_0.instance.invoke(context, m_47);
                                                              if(term == null)
                                                                break Fail168;
                                                              n_47 = term;
                                                              term = o_47;
                                                              IStrategoList list2;
                                                              list2 = checkListTail(n_47);
                                                              if(list2 == null)
                                                                break Fail168;
                                                              term = termFactory.makeTuple(j_47, (IStrategoTerm)termFactory.makeListCons(f_47, termFactory.makeListCons(termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{ejp.constCons25, (IStrategoTerm)termFactory.makeListCons(g_47, termFactory.makeListCons(l_47, (IStrategoList)ejp.constNil0))}), list2)));
                                                              term = make$Conc_0_0.instance.invoke(context, term);
                                                              if(term == null)
                                                                break Fail168;
                                                              term = termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{ejp.constCons29, term});
                                                              if(true)
                                                                break Success113;
                                                            }
                                                            term = term93;
                                                          }
                                                          Success114:
                                                          { 
                                                            if(cons19 == transform._consConstrPattern_5)
                                                            { 
                                                              Fail169:
                                                              { 
                                                                IStrategoTerm v_46 = null;
                                                                IStrategoTerm w_46 = null;
                                                                IStrategoTerm x_46 = null;
                                                                IStrategoTerm y_46 = null;
                                                                IStrategoTerm z_46 = null;
                                                                IStrategoTerm a_47 = null;
                                                                IStrategoTerm b_47 = null;
                                                                IStrategoTerm arg148 = term.getSubterm(0);
                                                                if(arg148.getTermType() != IStrategoTerm.APPL || transform._consAnnoPattern_1 != ((IStrategoAppl)arg148).getConstructor())
                                                                  break Fail169;
                                                                x_46 = arg148.getSubterm(0);
                                                                IStrategoTerm arg149 = term.getSubterm(1);
                                                                if(arg149.getTermType() != IStrategoTerm.APPL || transform._consModPattern_1 != ((IStrategoAppl)arg149).getConstructor())
                                                                  break Fail169;
                                                                y_46 = arg149.getSubterm(0);
                                                                v_46 = term.getSubterm(2);
                                                                a_47 = term.getSubterm(3);
                                                                w_46 = term.getSubterm(4);
                                                                term = termFactory.makeTuple(x_46, y_46);
                                                                term = conc_0_0.instance.invoke(context, term);
                                                                if(term == null)
                                                                  break Fail169;
                                                                z_46 = term;
                                                                term = list_to_args_0_0.instance.invoke(context, a_47);
                                                                if(term == null)
                                                                  break Fail169;
                                                                b_47 = term;
                                                                term = termFactory.makeTuple(z_46, (IStrategoTerm)termFactory.makeListCons(termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{ejp.constCons25, (IStrategoTerm)termFactory.makeListCons(v_46, termFactory.makeListCons(b_47, (IStrategoList)ejp.constNil0))}), termFactory.makeListCons(w_46, (IStrategoList)ejp.constNil0)));
                                                                term = make$Conc_0_0.instance.invoke(context, term);
                                                                if(term == null)
                                                                  break Fail169;
                                                                term = termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{ejp.constCons29, term});
                                                                if(true)
                                                                  break Success114;
                                                              }
                                                              term = term93;
                                                            }
                                                            term = aspectj_to_box_0_0_fragment_2.instance.invoke(context, term);
                                                            if(term == null)
                                                              break Fail142;
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