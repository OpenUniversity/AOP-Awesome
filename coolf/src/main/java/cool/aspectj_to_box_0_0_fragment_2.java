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

@SuppressWarnings("all") public class aspectj_to_box_0_0_fragment_2 extends Strategy 
{ 
  public static aspectj_to_box_0_0_fragment_2 instance = new aspectj_to_box_0_0_fragment_2();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("aspectj_to_box_0_0_fragment_2");
    Fail47:
    { 
      IStrategoTerm term45 = term;
      IStrategoConstructor cons2 = term.getTermType() == IStrategoTerm.APPL ? ((IStrategoAppl)term).getConstructor() : null;
      Success45:
      { 
        if(cons2 == transform._consFieldPattern_4)
        { 
          Fail48:
          { 
            IStrategoTerm f_19 = null;
            IStrategoTerm g_19 = null;
            IStrategoTerm h_19 = null;
            IStrategoTerm i_19 = null;
            IStrategoTerm j_19 = null;
            IStrategoTerm arg5 = term.getSubterm(0);
            if(arg5.getTermType() != IStrategoTerm.APPL || transform._consAnnoPattern_1 != ((IStrategoAppl)arg5).getConstructor())
              break Fail48;
            h_19 = arg5.getSubterm(0);
            IStrategoTerm arg6 = term.getSubterm(1);
            if(arg6.getTermType() != IStrategoTerm.APPL || transform._consModPattern_1 != ((IStrategoAppl)arg6).getConstructor())
              break Fail48;
            i_19 = arg6.getSubterm(0);
            f_19 = term.getSubterm(2);
            g_19 = term.getSubterm(3);
            term = termFactory.makeTuple(h_19, i_19);
            term = conc_0_0.instance.invoke(context, term);
            if(term == null)
              break Fail48;
            j_19 = term;
            term = termFactory.makeTuple(j_19, (IStrategoTerm)termFactory.makeListCons(f_19, termFactory.makeListCons(g_19, (IStrategoList)cool.constNil0)));
            term = make$Conc_0_0.instance.invoke(context, term);
            if(term == null)
              break Fail48;
            term = termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{cool.constCons4, term});
            if(true)
              break Success45;
          }
          term = term45;
        }
        Success46:
        { 
          if(cons2 == transform._consMemberName_1)
          { 
            Fail49:
            { 
              IStrategoTerm e_19 = null;
              e_19 = term.getSubterm(0);
              term = termFactory.makeAppl(transform._consS_1, new IStrategoTerm[]{e_19});
              if(true)
                break Success46;
            }
            term = term45;
          }
          Success47:
          { 
            if(cons2 == transform._consMemberName_2)
            { 
              Fail50:
              { 
                IStrategoTerm c_19 = null;
                IStrategoTerm d_19 = null;
                c_19 = term.getSubterm(0);
                d_19 = term.getSubterm(1);
                term = termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{cool.constCons0, (IStrategoTerm)termFactory.makeListCons(c_19, termFactory.makeListCons(cool.constS23, termFactory.makeListCons(termFactory.makeAppl(transform._consS_1, new IStrategoTerm[]{d_19}), (IStrategoList)cool.constNil0)))});
                if(true)
                  break Success47;
              }
              term = term45;
            }
            Success48:
            { 
              if(cons2 == transform._consWildcardMemberName_2)
              { 
                Fail51:
                { 
                  IStrategoTerm a_19 = null;
                  IStrategoTerm b_19 = null;
                  a_19 = term.getSubterm(0);
                  b_19 = term.getSubterm(1);
                  term = termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{cool.constCons0, (IStrategoTerm)termFactory.makeListCons(a_19, termFactory.makeListCons(cool.constS28, termFactory.makeListCons(termFactory.makeAppl(transform._consS_1, new IStrategoTerm[]{b_19}), (IStrategoList)cool.constNil0)))});
                  if(true)
                    break Success48;
                }
                term = term45;
              }
              Success49:
              { 
                if(cons2 == transform._consConstrName_0)
                { 
                  Fail52:
                  { 
                    term = cool.constFBOX19;
                    if(true)
                      break Success49;
                  }
                  term = term45;
                }
                Success50:
                { 
                  if(cons2 == transform._consConstrName_1)
                  { 
                    Fail53:
                    { 
                      IStrategoTerm z_18 = null;
                      z_18 = term.getSubterm(0);
                      term = termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{cool.constCons0, (IStrategoTerm)termFactory.makeListCons(z_18, (IStrategoList)cool.constCons9)});
                      if(true)
                        break Success50;
                    }
                    term = term45;
                  }
                  Success51:
                  { 
                    if(cons2 == transform._consWildcardConstrName_1)
                    { 
                      Fail54:
                      { 
                        IStrategoTerm y_18 = null;
                        y_18 = term.getSubterm(0);
                        term = termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{cool.constCons0, (IStrategoTerm)termFactory.makeListCons(y_18, (IStrategoList)cool.constCons10)});
                        if(true)
                          break Success51;
                      }
                      term = term45;
                    }
                    Success52:
                    { 
                      if(cons2 == transform._consNot_1)
                      { 
                        Fail55:
                        { 
                          IStrategoTerm x_18 = null;
                          x_18 = term.getSubterm(0);
                          term = termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{cool.constCons0, (IStrategoTerm)termFactory.makeListCons(cool.constS32, termFactory.makeListCons(x_18, (IStrategoList)cool.constNil0))});
                          if(true)
                            break Success52;
                        }
                        term = term45;
                      }
                      Success53:
                      { 
                        if(cons2 == transform._consModPattern_1)
                        { 
                          Fail56:
                          { 
                            IStrategoTerm w_18 = null;
                            w_18 = term.getSubterm(0);
                            term = termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{cool.constCons4, w_18});
                            if(true)
                              break Success53;
                          }
                          term = term45;
                        }
                        Success54:
                        { 
                          if(cons2 == transform._consThrowsPattern_1)
                          { 
                            Fail57:
                            { 
                              IStrategoTerm t_18 = null;
                              t_18 = term.getSubterm(0);
                              term = separate_by_comma_0_0.instance.invoke(context, t_18);
                              if(term == null)
                                break Fail57;
                              term = termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{cool.constCons4, (IStrategoTerm)termFactory.makeListCons(cool.constFBOX20, termFactory.makeListCons(term, (IStrategoList)cool.constNil0))});
                              if(true)
                                break Success54;
                            }
                            term = term45;
                          }
                          Success55:
                          { 
                            if(cons2 == transform._consNotThrowsCondition_1)
                            { 
                              Fail58:
                              { 
                                IStrategoTerm s_18 = null;
                                s_18 = term.getSubterm(0);
                                term = termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{cool.constCons0, (IStrategoTerm)termFactory.makeListCons(cool.constS32, termFactory.makeListCons(s_18, (IStrategoList)cool.constNil0))});
                                if(true)
                                  break Success55;
                              }
                              term = term45;
                            }
                            Success56:
                            { 
                              if(cons2 == transform._consThrowsCondition_1)
                              { 
                                Fail59:
                                { 
                                  IStrategoTerm q_18 = null;
                                  q_18 = term.getSubterm(0);
                                  term = has_leftmost_not_0_0.instance.invoke(context, q_18);
                                  if(term == null)
                                    break Fail59;
                                  term = termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{cool.constCons0, (IStrategoTerm)termFactory.makeListCons(cool.constS1, termFactory.makeListCons(q_18, (IStrategoList)cool.constCons1))});
                                  if(true)
                                    break Success56;
                                }
                                term = term45;
                              }
                              Success57:
                              { 
                                if(cons2 == transform._consThrowsCondition_1)
                                { 
                                  Fail60:
                                  { 
                                    IStrategoTerm o_18 = null;
                                    o_18 = term.getSubterm(0);
                                    term = o_18;
                                    IStrategoTerm term58 = term;
                                    Success58:
                                    { 
                                      Fail61:
                                      { 
                                        term = has_leftmost_not_0_0.instance.invoke(context, term);
                                        if(term == null)
                                          break Fail61;
                                        { 
                                          if(true)
                                            break Fail60;
                                          if(true)
                                            break Success58;
                                        }
                                      }
                                      term = term58;
                                    }
                                    term = o_18;
                                    if(true)
                                      break Success57;
                                  }
                                  term = term45;
                                }
                                Success59:
                                { 
                                  if(cons2 == transform._consSimpleAnnoPatternExact_1)
                                  { 
                                    Fail62:
                                    { 
                                      IStrategoTerm n_18 = null;
                                      n_18 = term.getSubterm(0);
                                      term = termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{cool.constCons0, (IStrategoTerm)termFactory.makeListCons(cool.constS34, termFactory.makeListCons(n_18, (IStrategoList)cool.constNil0))});
                                      if(true)
                                        break Success59;
                                    }
                                    term = term45;
                                  }
                                  Success60:
                                  { 
                                    if(cons2 == transform._consSimpleAnnoPattern_1)
                                    { 
                                      Fail63:
                                      { 
                                        IStrategoTerm m_18 = null;
                                        m_18 = term.getSubterm(0);
                                        term = termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{cool.constCons0, (IStrategoTerm)termFactory.makeListCons(cool.constS34, termFactory.makeListCons(cool.constS1, termFactory.makeListCons(m_18, (IStrategoList)cool.constCons1)))});
                                        if(true)
                                          break Success60;
                                      }
                                      term = term45;
                                    }
                                    Success61:
                                    { 
                                      if(cons2 == transform._consSimpleAnnoPatternValue_2)
                                      { 
                                        Fail64:
                                        { 
                                          IStrategoTerm k_18 = null;
                                          IStrategoTerm l_18 = null;
                                          k_18 = term.getSubterm(0);
                                          l_18 = term.getSubterm(1);
                                          term = termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{cool.constCons0, (IStrategoTerm)termFactory.makeListCons(cool.constS34, termFactory.makeListCons(k_18, termFactory.makeListCons(cool.constS1, termFactory.makeListCons(l_18, (IStrategoList)cool.constCons1))))});
                                          if(true)
                                            break Success61;
                                        }
                                        term = term45;
                                      }
                                      Success62:
                                      { 
                                        if(cons2 == transform._consNotComp_1)
                                        { 
                                          Fail65:
                                          { 
                                            IStrategoTerm j_18 = null;
                                            j_18 = term.getSubterm(0);
                                            term = termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{cool.constCons0, (IStrategoTerm)termFactory.makeListCons(cool.constS32, termFactory.makeListCons(j_18, (IStrategoList)cool.constNil0))});
                                            if(true)
                                              break Success62;
                                          }
                                          term = term45;
                                        }
                                        Success63:
                                        { 
                                          if(cons2 == transform._consAndComp_2)
                                          { 
                                            Fail66:
                                            { 
                                              IStrategoTerm h_18 = null;
                                              IStrategoTerm i_18 = null;
                                              h_18 = term.getSubterm(0);
                                              i_18 = term.getSubterm(1);
                                              term = termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{cool.constCons4, (IStrategoTerm)termFactory.makeListCons(h_18, termFactory.makeListCons(cool.constS35, termFactory.makeListCons(i_18, (IStrategoList)cool.constNil0)))});
                                              if(true)
                                                break Success63;
                                            }
                                            term = term45;
                                          }
                                          Success64:
                                          { 
                                            if(cons2 == transform._consOrComp_2)
                                            { 
                                              Fail67:
                                              { 
                                                IStrategoTerm f_18 = null;
                                                IStrategoTerm g_18 = null;
                                                f_18 = term.getSubterm(0);
                                                g_18 = term.getSubterm(1);
                                                term = termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{cool.constCons4, (IStrategoTerm)termFactory.makeListCons(f_18, termFactory.makeListCons(cool.constS36, termFactory.makeListCons(g_18, (IStrategoList)cool.constNil0)))});
                                                if(true)
                                                  break Success64;
                                              }
                                              term = term45;
                                            }
                                            Success65:
                                            { 
                                              if(cons2 == transform._consIntertypeMethodDec_2)
                                              { 
                                                Fail68:
                                                { 
                                                  IStrategoTerm d_18 = null;
                                                  IStrategoTerm e_18 = null;
                                                  d_18 = term.getSubterm(0);
                                                  IStrategoTerm arg7 = term.getSubterm(1);
                                                  e_18 = arg7;
                                                  if(arg7.getTermType() != IStrategoTerm.APPL || transform._consBlock_1 != ((IStrategoAppl)arg7).getConstructor())
                                                    break Fail68;
                                                  term = termFactory.makeAppl(transform._consV_2, new IStrategoTerm[]{cool.constCons11, (IStrategoTerm)termFactory.makeListCons(d_18, termFactory.makeListCons(e_18, (IStrategoList)cool.constNil0))});
                                                  if(true)
                                                    break Success65;
                                                }
                                                term = term45;
                                              }
                                              Success66:
                                              { 
                                                if(cons2 == transform._consIntertypeMethodDec_2)
                                                { 
                                                  Fail69:
                                                  { 
                                                    IStrategoTerm c_18 = null;
                                                    c_18 = term.getSubterm(0);
                                                    IStrategoTerm arg9 = term.getSubterm(1);
                                                    if(arg9.getTermType() != IStrategoTerm.APPL || transform._consNoMethodBody_0 != ((IStrategoAppl)arg9).getConstructor())
                                                      break Fail69;
                                                    term = termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{cool.constCons0, (IStrategoTerm)termFactory.makeListCons(c_18, (IStrategoList)cool.constCons5)});
                                                    if(true)
                                                      break Success66;
                                                  }
                                                  term = term45;
                                                }
                                                Success67:
                                                { 
                                                  if(cons2 == transform._consIntertypeMethodDecHead_8)
                                                  { 
                                                    Fail70:
                                                    { 
                                                      IStrategoTerm k_17 = null;
                                                      IStrategoTerm l_17 = null;
                                                      IStrategoTerm m_17 = null;
                                                      IStrategoTerm n_17 = null;
                                                      IStrategoTerm o_17 = null;
                                                      IStrategoTerm p_17 = null;
                                                      IStrategoTerm q_17 = null;
                                                      IStrategoTerm r_17 = null;
                                                      IStrategoTerm s_17 = null;
                                                      IStrategoTerm t_17 = null;
                                                      IStrategoTerm u_17 = null;
                                                      IStrategoTerm v_17 = null;
                                                      IStrategoTerm w_17 = null;
                                                      IStrategoTerm x_17 = null;
                                                      IStrategoTerm a_18 = null;
                                                      IStrategoTerm b_18 = null;
                                                      u_17 = term.getSubterm(0);
                                                      p_17 = term.getSubterm(1);
                                                      k_17 = term.getSubterm(2);
                                                      l_17 = term.getSubterm(3);
                                                      q_17 = term.getSubterm(4);
                                                      IStrategoTerm arg10 = term.getSubterm(5);
                                                      if(arg10.getTermType() != IStrategoTerm.APPL || transform._consId_1 != ((IStrategoAppl)arg10).getConstructor())
                                                        break Fail70;
                                                      m_17 = arg10.getSubterm(0);
                                                      n_17 = term.getSubterm(6);
                                                      s_17 = term.getSubterm(7);
                                                      x_17 = term;
                                                      term = list_to_args_0_0.instance.invoke(context, n_17);
                                                      if(term == null)
                                                        break Fail70;
                                                      o_17 = term;
                                                      term = type_params_to_boxes_0_0.instance.invoke(context, p_17);
                                                      if(term == null)
                                                        break Fail70;
                                                      v_17 = term;
                                                      term = type_params_to_boxes_0_0.instance.invoke(context, q_17);
                                                      if(term == null)
                                                        break Fail70;
                                                      r_17 = term;
                                                      term = option_to_boxes_0_0.instance.invoke(context, s_17);
                                                      if(term == null)
                                                        break Fail70;
                                                      t_17 = term;
                                                      term = termFactory.makeTuple(u_17, v_17);
                                                      term = conc_0_0.instance.invoke(context, term);
                                                      if(term == null)
                                                        break Fail70;
                                                      w_17 = term;
                                                      term = x_17;
                                                      b_18 = term;
                                                      term = termFactory.makeTuple(r_17, (IStrategoTerm)termFactory.makeListCons(cool.constS23, termFactory.makeListCons(termFactory.makeAppl(transform._consS_1, new IStrategoTerm[]{m_17}), termFactory.makeListCons(o_17, (IStrategoList)cool.constNil0))));
                                                      term = make$Conc_0_0.instance.invoke(context, term);
                                                      if(term == null)
                                                        break Fail70;
                                                      a_18 = term;
                                                      term = b_18;
                                                      IStrategoList list2;
                                                      IStrategoList list1;
                                                      list1 = checkListTail(t_17);
                                                      if(list1 == null)
                                                        break Fail70;
                                                      list2 = checkListTail(a_18);
                                                      if(list2 == null)
                                                        break Fail70;
                                                      term = termFactory.makeTuple(w_17, (IStrategoTerm)termFactory.makeListCons(k_17, termFactory.makeListCons(termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{cool.constCons0, (IStrategoTerm)termFactory.makeListCons(l_17, list2)}), list1)));
                                                      term = make$Conc_0_0.instance.invoke(context, term);
                                                      if(term == null)
                                                        break Fail70;
                                                      term = termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{cool.constCons4, term});
                                                      if(true)
                                                        break Success67;
                                                    }
                                                    term = term45;
                                                  }
                                                  Success68:
                                                  { 
                                                    if(cons2 == transform._consIntertypeConstrDec_2)
                                                    { 
                                                      Fail71:
                                                      { 
                                                        IStrategoTerm i_17 = null;
                                                        IStrategoTerm j_17 = null;
                                                        i_17 = term.getSubterm(0);
                                                        j_17 = term.getSubterm(1);
                                                        term = termFactory.makeAppl(transform._consV_2, new IStrategoTerm[]{cool.constCons11, (IStrategoTerm)termFactory.makeListCons(i_17, termFactory.makeListCons(j_17, (IStrategoList)cool.constNil0))});
                                                        if(true)
                                                          break Success68;
                                                      }
                                                      term = term45;
                                                    }
                                                    term = aspectj_to_box_0_0_fragment_1.instance.invoke(context, term);
                                                    if(term == null)
                                                      break Fail47;
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