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
            IStrategoTerm o_49 = null;
            o_49 = term.getSubterm(0);
            term = termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{ejp.constCons25, (IStrategoTerm)termFactory.makeListCons(ejp.constS19, termFactory.makeListCons(ejp.constS1, termFactory.makeListCons(o_49, (IStrategoList)ejp.constCons26)))});
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
              IStrategoTerm n_49 = null;
              n_49 = term.getSubterm(0);
              term = termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{ejp.constCons25, (IStrategoTerm)termFactory.makeListCons(ejp.constS20, termFactory.makeListCons(ejp.constS1, termFactory.makeListCons(n_49, (IStrategoList)ejp.constCons26)))});
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
                IStrategoTerm m_49 = null;
                m_49 = term.getSubterm(0);
                term = termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{ejp.constCons25, (IStrategoTerm)termFactory.makeListCons(ejp.constS21, termFactory.makeListCons(ejp.constS1, termFactory.makeListCons(m_49, (IStrategoList)ejp.constCons26)))});
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
                  IStrategoTerm j_49 = null;
                  j_49 = term.getSubterm(0);
                  term = list_to_args_0_0.instance.invoke(context, j_49);
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
                    IStrategoTerm i_49 = null;
                    i_49 = term.getSubterm(0);
                    term = i_49;
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
                      IStrategoTerm g_49 = null;
                      IStrategoTerm h_49 = null;
                      g_49 = term.getSubterm(0);
                      h_49 = term.getSubterm(1);
                      term = termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{ejp.constCons25, (IStrategoTerm)termFactory.makeListCons(g_49, termFactory.makeListCons(ejp.constS23, termFactory.makeListCons(h_49, (IStrategoList)ejp.constNil0)))});
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
                        IStrategoTerm e_49 = null;
                        IStrategoTerm f_49 = null;
                        e_49 = term.getSubterm(0);
                        f_49 = term.getSubterm(1);
                        term = termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{ejp.constCons29, (IStrategoTerm)termFactory.makeListCons(e_49, termFactory.makeListCons(f_49, (IStrategoList)ejp.constNil0))});
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
                          IStrategoTerm x_48 = null;
                          IStrategoTerm y_48 = null;
                          IStrategoTerm z_48 = null;
                          IStrategoTerm a_49 = null;
                          x_48 = term.getSubterm(0);
                          y_48 = term.getSubterm(1);
                          z_48 = term.getSubterm(2);
                          term = list_to_args_0_0.instance.invoke(context, z_48);
                          if(term == null)
                            break Fail150;
                          a_49 = term;
                          term = termFactory.makeTuple(x_48, (IStrategoTerm)termFactory.makeListCons(ejp.constFBOX15, termFactory.makeListCons(y_48, termFactory.makeListCons(a_49, (IStrategoList)ejp.constNil0))));
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
                            IStrategoTerm w_48 = null;
                            w_48 = term.getSubterm(0);
                            term = termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{ejp.constCons25, (IStrategoTerm)termFactory.makeListCons(ejp.constS26, termFactory.makeListCons(w_48, (IStrategoList)ejp.constCons30))});
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
                                IStrategoTerm v_48 = null;
                                v_48 = term.getSubterm(0);
                                term = v_48;
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
                                  IStrategoTerm u_48 = null;
                                  u_48 = term.getSubterm(0);
                                  term = u_48;
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
                                    IStrategoTerm t_48 = null;
                                    t_48 = term.getSubterm(0);
                                    term = termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{ejp.constCons25, (IStrategoTerm)termFactory.makeListCons(t_48, (IStrategoList)ejp.constCons31)});
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
                                      IStrategoTerm r_48 = null;
                                      IStrategoTerm s_48 = null;
                                      r_48 = term.getSubterm(0);
                                      s_48 = term.getSubterm(1);
                                      term = termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{ejp.constCons25, (IStrategoTerm)termFactory.makeListCons(r_48, termFactory.makeListCons(s_48, (IStrategoList)ejp.constNil0))});
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
                                        IStrategoTerm p_48 = null;
                                        IStrategoTerm q_48 = null;
                                        p_48 = term.getSubterm(0);
                                        q_48 = term.getSubterm(1);
                                        term = termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{ejp.constCons25, (IStrategoTerm)termFactory.makeListCons(p_48, termFactory.makeListCons(q_48, (IStrategoList)ejp.constCons31))});
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
                                          IStrategoTerm l_48 = null;
                                          IStrategoTerm m_48 = null;
                                          IStrategoTerm arg145 = term.getSubterm(0);
                                          if(arg145.getTermType() != IStrategoTerm.APPL || transform._consAnnoPattern_1 != ((IStrategoAppl)arg145).getConstructor())
                                            break Fail158;
                                          l_48 = arg145.getSubterm(0);
                                          m_48 = term.getSubterm(1);
                                          term = termFactory.makeTuple(l_48, (IStrategoTerm)termFactory.makeListCons(m_48, (IStrategoList)ejp.constNil0));
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
                                            IStrategoTerm k_48 = null;
                                            k_48 = term.getSubterm(0);
                                            term = termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{ejp.constCons25, (IStrategoTerm)termFactory.makeListCons(termFactory.makeAppl(transform._consS_1, new IStrategoTerm[]{k_48}), (IStrategoList)ejp.constNil0)});
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
                                              IStrategoTerm i_48 = null;
                                              IStrategoTerm j_48 = null;
                                              i_48 = term.getSubterm(0);
                                              j_48 = term.getSubterm(1);
                                              term = termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{ejp.constCons25, (IStrategoTerm)termFactory.makeListCons(i_48, termFactory.makeListCons(ejp.constFBOX17, termFactory.makeListCons(termFactory.makeAppl(transform._consS_1, new IStrategoTerm[]{j_48}), (IStrategoList)ejp.constNil0)))});
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
                                                IStrategoTerm g_48 = null;
                                                IStrategoTerm h_48 = null;
                                                g_48 = term.getSubterm(0);
                                                h_48 = term.getSubterm(1);
                                                term = termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{ejp.constCons25, (IStrategoTerm)termFactory.makeListCons(g_48, termFactory.makeListCons(ejp.constFBOX18, termFactory.makeListCons(termFactory.makeAppl(transform._consS_1, new IStrategoTerm[]{h_48}), (IStrategoList)ejp.constNil0)))});
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
                                                    IStrategoTerm f_48 = null;
                                                    f_48 = term.getSubterm(0);
                                                    term = termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{ejp.constCons29, (IStrategoTerm)termFactory.makeListCons(f_48, (IStrategoList)ejp.constCons32)});
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
                                                      IStrategoTerm e_48 = null;
                                                      e_48 = term.getSubterm(0);
                                                      term = termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{ejp.constCons25, (IStrategoTerm)termFactory.makeListCons(e_48, (IStrategoList)ejp.constNil0)});
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
                                                            IStrategoTerm d_48 = null;
                                                            d_48 = term.getSubterm(0);
                                                            term = d_48;
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
                                                              IStrategoTerm r_47 = null;
                                                              IStrategoTerm s_47 = null;
                                                              IStrategoTerm t_47 = null;
                                                              IStrategoTerm u_47 = null;
                                                              IStrategoTerm v_47 = null;
                                                              IStrategoTerm w_47 = null;
                                                              IStrategoTerm x_47 = null;
                                                              IStrategoTerm y_47 = null;
                                                              IStrategoTerm z_47 = null;
                                                              IStrategoTerm a_48 = null;
                                                              IStrategoTerm arg146 = term.getSubterm(0);
                                                              if(arg146.getTermType() != IStrategoTerm.APPL || transform._consAnnoPattern_1 != ((IStrategoAppl)arg146).getConstructor())
                                                                break Fail168;
                                                              t_47 = arg146.getSubterm(0);
                                                              IStrategoTerm arg147 = term.getSubterm(1);
                                                              if(arg147.getTermType() != IStrategoTerm.APPL || transform._consModPattern_1 != ((IStrategoAppl)arg147).getConstructor())
                                                                break Fail168;
                                                              u_47 = arg147.getSubterm(0);
                                                              r_47 = term.getSubterm(2);
                                                              s_47 = term.getSubterm(3);
                                                              w_47 = term.getSubterm(4);
                                                              y_47 = term.getSubterm(5);
                                                              a_48 = term;
                                                              term = termFactory.makeTuple(t_47, u_47);
                                                              term = conc_0_0.instance.invoke(context, term);
                                                              if(term == null)
                                                                break Fail168;
                                                              v_47 = term;
                                                              term = list_to_args_0_0.instance.invoke(context, w_47);
                                                              if(term == null)
                                                                break Fail168;
                                                              x_47 = term;
                                                              term = option_to_boxes_0_0.instance.invoke(context, y_47);
                                                              if(term == null)
                                                                break Fail168;
                                                              z_47 = term;
                                                              term = a_48;
                                                              IStrategoList list2;
                                                              list2 = checkListTail(z_47);
                                                              if(list2 == null)
                                                                break Fail168;
                                                              term = termFactory.makeTuple(v_47, (IStrategoTerm)termFactory.makeListCons(r_47, termFactory.makeListCons(termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{ejp.constCons25, (IStrategoTerm)termFactory.makeListCons(s_47, termFactory.makeListCons(x_47, (IStrategoList)ejp.constNil0))}), list2)));
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
                                                                IStrategoTerm h_47 = null;
                                                                IStrategoTerm i_47 = null;
                                                                IStrategoTerm j_47 = null;
                                                                IStrategoTerm k_47 = null;
                                                                IStrategoTerm l_47 = null;
                                                                IStrategoTerm m_47 = null;
                                                                IStrategoTerm n_47 = null;
                                                                IStrategoTerm arg148 = term.getSubterm(0);
                                                                if(arg148.getTermType() != IStrategoTerm.APPL || transform._consAnnoPattern_1 != ((IStrategoAppl)arg148).getConstructor())
                                                                  break Fail169;
                                                                j_47 = arg148.getSubterm(0);
                                                                IStrategoTerm arg149 = term.getSubterm(1);
                                                                if(arg149.getTermType() != IStrategoTerm.APPL || transform._consModPattern_1 != ((IStrategoAppl)arg149).getConstructor())
                                                                  break Fail169;
                                                                k_47 = arg149.getSubterm(0);
                                                                h_47 = term.getSubterm(2);
                                                                m_47 = term.getSubterm(3);
                                                                i_47 = term.getSubterm(4);
                                                                term = termFactory.makeTuple(j_47, k_47);
                                                                term = conc_0_0.instance.invoke(context, term);
                                                                if(term == null)
                                                                  break Fail169;
                                                                l_47 = term;
                                                                term = list_to_args_0_0.instance.invoke(context, m_47);
                                                                if(term == null)
                                                                  break Fail169;
                                                                n_47 = term;
                                                                term = termFactory.makeTuple(l_47, (IStrategoTerm)termFactory.makeListCons(termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{ejp.constCons25, (IStrategoTerm)termFactory.makeListCons(h_47, termFactory.makeListCons(n_47, (IStrategoList)ejp.constNil0))}), termFactory.makeListCons(i_47, (IStrategoList)ejp.constNil0)));
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