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
            IStrategoTerm a_15 = null;
            IStrategoTerm b_15 = null;
            IStrategoTerm c_15 = null;
            IStrategoTerm d_15 = null;
            IStrategoTerm e_15 = null;
            IStrategoTerm arg8 = term.getSubterm(0);
            if(arg8.getTermType() != IStrategoTerm.APPL || transform._consAnnoPattern_1 != ((IStrategoAppl)arg8).getConstructor())
              break Fail48;
            c_15 = arg8.getSubterm(0);
            IStrategoTerm arg9 = term.getSubterm(1);
            if(arg9.getTermType() != IStrategoTerm.APPL || transform._consModPattern_1 != ((IStrategoAppl)arg9).getConstructor())
              break Fail48;
            d_15 = arg9.getSubterm(0);
            a_15 = term.getSubterm(2);
            b_15 = term.getSubterm(3);
            term = termFactory.makeTuple(c_15, d_15);
            term = conc_0_0.instance.invoke(context, term);
            if(term == null)
              break Fail48;
            e_15 = term;
            term = termFactory.makeTuple(e_15, (IStrategoTerm)termFactory.makeListCons(a_15, termFactory.makeListCons(b_15, (IStrategoList)cjp.constNil0)));
            term = make$Conc_0_0.instance.invoke(context, term);
            if(term == null)
              break Fail48;
            term = termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{cjp.constCons4, term});
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
              IStrategoTerm z_14 = null;
              z_14 = term.getSubterm(0);
              term = termFactory.makeAppl(transform._consS_1, new IStrategoTerm[]{z_14});
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
                IStrategoTerm x_14 = null;
                IStrategoTerm y_14 = null;
                x_14 = term.getSubterm(0);
                y_14 = term.getSubterm(1);
                term = termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{cjp.constCons0, (IStrategoTerm)termFactory.makeListCons(x_14, termFactory.makeListCons(cjp.constS23, termFactory.makeListCons(termFactory.makeAppl(transform._consS_1, new IStrategoTerm[]{y_14}), (IStrategoList)cjp.constNil0)))});
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
                  IStrategoTerm v_14 = null;
                  IStrategoTerm w_14 = null;
                  v_14 = term.getSubterm(0);
                  w_14 = term.getSubterm(1);
                  term = termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{cjp.constCons0, (IStrategoTerm)termFactory.makeListCons(v_14, termFactory.makeListCons(cjp.constS28, termFactory.makeListCons(termFactory.makeAppl(transform._consS_1, new IStrategoTerm[]{w_14}), (IStrategoList)cjp.constNil0)))});
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
                    term = cjp.constFBOX19;
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
                      IStrategoTerm u_14 = null;
                      u_14 = term.getSubterm(0);
                      term = termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{cjp.constCons0, (IStrategoTerm)termFactory.makeListCons(u_14, (IStrategoList)cjp.constCons9)});
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
                        IStrategoTerm t_14 = null;
                        t_14 = term.getSubterm(0);
                        term = termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{cjp.constCons0, (IStrategoTerm)termFactory.makeListCons(t_14, (IStrategoList)cjp.constCons10)});
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
                          IStrategoTerm s_14 = null;
                          s_14 = term.getSubterm(0);
                          term = termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{cjp.constCons0, (IStrategoTerm)termFactory.makeListCons(cjp.constS32, termFactory.makeListCons(s_14, (IStrategoList)cjp.constNil0))});
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
                            IStrategoTerm r_14 = null;
                            r_14 = term.getSubterm(0);
                            term = termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{cjp.constCons4, r_14});
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
                              IStrategoTerm o_14 = null;
                              o_14 = term.getSubterm(0);
                              term = separate_by_comma_0_0.instance.invoke(context, o_14);
                              if(term == null)
                                break Fail57;
                              term = termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{cjp.constCons4, (IStrategoTerm)termFactory.makeListCons(cjp.constFBOX20, termFactory.makeListCons(term, (IStrategoList)cjp.constNil0))});
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
                                IStrategoTerm n_14 = null;
                                n_14 = term.getSubterm(0);
                                term = termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{cjp.constCons0, (IStrategoTerm)termFactory.makeListCons(cjp.constS32, termFactory.makeListCons(n_14, (IStrategoList)cjp.constNil0))});
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
                                  IStrategoTerm l_14 = null;
                                  l_14 = term.getSubterm(0);
                                  term = has_leftmost_not_0_0.instance.invoke(context, l_14);
                                  if(term == null)
                                    break Fail59;
                                  term = termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{cjp.constCons0, (IStrategoTerm)termFactory.makeListCons(cjp.constS1, termFactory.makeListCons(l_14, (IStrategoList)cjp.constCons1))});
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
                                    IStrategoTerm j_14 = null;
                                    j_14 = term.getSubterm(0);
                                    term = j_14;
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
                                    term = j_14;
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
                                      IStrategoTerm i_14 = null;
                                      i_14 = term.getSubterm(0);
                                      term = termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{cjp.constCons0, (IStrategoTerm)termFactory.makeListCons(cjp.constS34, termFactory.makeListCons(i_14, (IStrategoList)cjp.constNil0))});
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
                                        IStrategoTerm h_14 = null;
                                        h_14 = term.getSubterm(0);
                                        term = termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{cjp.constCons0, (IStrategoTerm)termFactory.makeListCons(cjp.constS34, termFactory.makeListCons(cjp.constS1, termFactory.makeListCons(h_14, (IStrategoList)cjp.constCons1)))});
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
                                          IStrategoTerm f_14 = null;
                                          IStrategoTerm g_14 = null;
                                          f_14 = term.getSubterm(0);
                                          g_14 = term.getSubterm(1);
                                          term = termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{cjp.constCons0, (IStrategoTerm)termFactory.makeListCons(cjp.constS34, termFactory.makeListCons(f_14, termFactory.makeListCons(cjp.constS1, termFactory.makeListCons(g_14, (IStrategoList)cjp.constCons1))))});
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
                                            IStrategoTerm e_14 = null;
                                            e_14 = term.getSubterm(0);
                                            term = termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{cjp.constCons0, (IStrategoTerm)termFactory.makeListCons(cjp.constS32, termFactory.makeListCons(e_14, (IStrategoList)cjp.constNil0))});
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
                                              IStrategoTerm c_14 = null;
                                              IStrategoTerm d_14 = null;
                                              c_14 = term.getSubterm(0);
                                              d_14 = term.getSubterm(1);
                                              term = termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{cjp.constCons4, (IStrategoTerm)termFactory.makeListCons(c_14, termFactory.makeListCons(cjp.constS35, termFactory.makeListCons(d_14, (IStrategoList)cjp.constNil0)))});
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
                                                IStrategoTerm a_14 = null;
                                                IStrategoTerm b_14 = null;
                                                a_14 = term.getSubterm(0);
                                                b_14 = term.getSubterm(1);
                                                term = termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{cjp.constCons4, (IStrategoTerm)termFactory.makeListCons(a_14, termFactory.makeListCons(cjp.constS36, termFactory.makeListCons(b_14, (IStrategoList)cjp.constNil0)))});
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
                                                  IStrategoTerm y_13 = null;
                                                  IStrategoTerm z_13 = null;
                                                  y_13 = term.getSubterm(0);
                                                  IStrategoTerm arg10 = term.getSubterm(1);
                                                  z_13 = arg10;
                                                  if(arg10.getTermType() != IStrategoTerm.APPL || transform._consBlock_1 != ((IStrategoAppl)arg10).getConstructor())
                                                    break Fail68;
                                                  term = termFactory.makeAppl(transform._consV_2, new IStrategoTerm[]{cjp.constCons11, (IStrategoTerm)termFactory.makeListCons(y_13, termFactory.makeListCons(z_13, (IStrategoList)cjp.constNil0))});
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
                                                    IStrategoTerm x_13 = null;
                                                    x_13 = term.getSubterm(0);
                                                    IStrategoTerm arg12 = term.getSubterm(1);
                                                    if(arg12.getTermType() != IStrategoTerm.APPL || transform._consNoMethodBody_0 != ((IStrategoAppl)arg12).getConstructor())
                                                      break Fail69;
                                                    term = termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{cjp.constCons0, (IStrategoTerm)termFactory.makeListCons(x_13, (IStrategoList)cjp.constCons5)});
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
                                                      IStrategoTerm f_13 = null;
                                                      IStrategoTerm g_13 = null;
                                                      IStrategoTerm h_13 = null;
                                                      IStrategoTerm i_13 = null;
                                                      IStrategoTerm j_13 = null;
                                                      IStrategoTerm k_13 = null;
                                                      IStrategoTerm l_13 = null;
                                                      IStrategoTerm m_13 = null;
                                                      IStrategoTerm n_13 = null;
                                                      IStrategoTerm o_13 = null;
                                                      IStrategoTerm p_13 = null;
                                                      IStrategoTerm q_13 = null;
                                                      IStrategoTerm r_13 = null;
                                                      IStrategoTerm s_13 = null;
                                                      IStrategoTerm v_13 = null;
                                                      IStrategoTerm w_13 = null;
                                                      p_13 = term.getSubterm(0);
                                                      k_13 = term.getSubterm(1);
                                                      f_13 = term.getSubterm(2);
                                                      g_13 = term.getSubterm(3);
                                                      l_13 = term.getSubterm(4);
                                                      IStrategoTerm arg13 = term.getSubterm(5);
                                                      if(arg13.getTermType() != IStrategoTerm.APPL || transform._consId_1 != ((IStrategoAppl)arg13).getConstructor())
                                                        break Fail70;
                                                      h_13 = arg13.getSubterm(0);
                                                      i_13 = term.getSubterm(6);
                                                      n_13 = term.getSubterm(7);
                                                      s_13 = term;
                                                      term = list_to_args_0_0.instance.invoke(context, i_13);
                                                      if(term == null)
                                                        break Fail70;
                                                      j_13 = term;
                                                      term = type_params_to_boxes_0_0.instance.invoke(context, k_13);
                                                      if(term == null)
                                                        break Fail70;
                                                      q_13 = term;
                                                      term = type_params_to_boxes_0_0.instance.invoke(context, l_13);
                                                      if(term == null)
                                                        break Fail70;
                                                      m_13 = term;
                                                      term = option_to_boxes_0_0.instance.invoke(context, n_13);
                                                      if(term == null)
                                                        break Fail70;
                                                      o_13 = term;
                                                      term = termFactory.makeTuple(p_13, q_13);
                                                      term = conc_0_0.instance.invoke(context, term);
                                                      if(term == null)
                                                        break Fail70;
                                                      r_13 = term;
                                                      term = s_13;
                                                      w_13 = term;
                                                      term = termFactory.makeTuple(m_13, (IStrategoTerm)termFactory.makeListCons(cjp.constS23, termFactory.makeListCons(termFactory.makeAppl(transform._consS_1, new IStrategoTerm[]{h_13}), termFactory.makeListCons(j_13, (IStrategoList)cjp.constNil0))));
                                                      term = make$Conc_0_0.instance.invoke(context, term);
                                                      if(term == null)
                                                        break Fail70;
                                                      v_13 = term;
                                                      term = w_13;
                                                      IStrategoList list2;
                                                      IStrategoList list1;
                                                      list1 = checkListTail(o_13);
                                                      if(list1 == null)
                                                        break Fail70;
                                                      list2 = checkListTail(v_13);
                                                      if(list2 == null)
                                                        break Fail70;
                                                      term = termFactory.makeTuple(r_13, (IStrategoTerm)termFactory.makeListCons(f_13, termFactory.makeListCons(termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{cjp.constCons0, (IStrategoTerm)termFactory.makeListCons(g_13, list2)}), list1)));
                                                      term = make$Conc_0_0.instance.invoke(context, term);
                                                      if(term == null)
                                                        break Fail70;
                                                      term = termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{cjp.constCons4, term});
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
                                                        IStrategoTerm d_13 = null;
                                                        IStrategoTerm e_13 = null;
                                                        d_13 = term.getSubterm(0);
                                                        e_13 = term.getSubterm(1);
                                                        term = termFactory.makeAppl(transform._consV_2, new IStrategoTerm[]{cjp.constCons11, (IStrategoTerm)termFactory.makeListCons(d_13, termFactory.makeListCons(e_13, (IStrategoList)cjp.constNil0))});
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