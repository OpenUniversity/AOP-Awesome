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

@SuppressWarnings("all") public class aspectj_to_box_0_0_fragment_2 extends Strategy 
{ 
  public static aspectj_to_box_0_0_fragment_2 instance = new aspectj_to_box_0_0_fragment_2();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("aspectj_to_box_0_0_fragment_2");
    Fail170:
    { 
      IStrategoTerm term120 = term;
      IStrategoConstructor cons20 = term.getTermType() == IStrategoTerm.APPL ? ((IStrategoAppl)term).getConstructor() : null;
      Success115:
      { 
        if(cons20 == transform._consFieldPattern_4)
        { 
          Fail171:
          { 
            IStrategoTerm n_46 = null;
            IStrategoTerm o_46 = null;
            IStrategoTerm p_46 = null;
            IStrategoTerm q_46 = null;
            IStrategoTerm r_46 = null;
            IStrategoTerm arg150 = term.getSubterm(0);
            if(arg150.getTermType() != IStrategoTerm.APPL || transform._consAnnoPattern_1 != ((IStrategoAppl)arg150).getConstructor())
              break Fail171;
            p_46 = arg150.getSubterm(0);
            IStrategoTerm arg151 = term.getSubterm(1);
            if(arg151.getTermType() != IStrategoTerm.APPL || transform._consModPattern_1 != ((IStrategoAppl)arg151).getConstructor())
              break Fail171;
            q_46 = arg151.getSubterm(0);
            n_46 = term.getSubterm(2);
            o_46 = term.getSubterm(3);
            term = termFactory.makeTuple(p_46, q_46);
            term = conc_0_0.instance.invoke(context, term);
            if(term == null)
              break Fail171;
            r_46 = term;
            term = termFactory.makeTuple(r_46, (IStrategoTerm)termFactory.makeListCons(n_46, termFactory.makeListCons(o_46, (IStrategoList)ejp.constNil0)));
            term = make$Conc_0_0.instance.invoke(context, term);
            if(term == null)
              break Fail171;
            term = termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{ejp.constCons29, term});
            if(true)
              break Success115;
          }
          term = term120;
        }
        Success116:
        { 
          if(cons20 == transform._consMemberName_1)
          { 
            Fail172:
            { 
              IStrategoTerm m_46 = null;
              m_46 = term.getSubterm(0);
              term = termFactory.makeAppl(transform._consS_1, new IStrategoTerm[]{m_46});
              if(true)
                break Success116;
            }
            term = term120;
          }
          Success117:
          { 
            if(cons20 == transform._consMemberName_2)
            { 
              Fail173:
              { 
                IStrategoTerm k_46 = null;
                IStrategoTerm l_46 = null;
                k_46 = term.getSubterm(0);
                l_46 = term.getSubterm(1);
                term = termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{ejp.constCons25, (IStrategoTerm)termFactory.makeListCons(k_46, termFactory.makeListCons(ejp.constS23, termFactory.makeListCons(termFactory.makeAppl(transform._consS_1, new IStrategoTerm[]{l_46}), (IStrategoList)ejp.constNil0)))});
                if(true)
                  break Success117;
              }
              term = term120;
            }
            Success118:
            { 
              if(cons20 == transform._consWildcardMemberName_2)
              { 
                Fail174:
                { 
                  IStrategoTerm i_46 = null;
                  IStrategoTerm j_46 = null;
                  i_46 = term.getSubterm(0);
                  j_46 = term.getSubterm(1);
                  term = termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{ejp.constCons25, (IStrategoTerm)termFactory.makeListCons(i_46, termFactory.makeListCons(ejp.constS28, termFactory.makeListCons(termFactory.makeAppl(transform._consS_1, new IStrategoTerm[]{j_46}), (IStrategoList)ejp.constNil0)))});
                  if(true)
                    break Success118;
                }
                term = term120;
              }
              Success119:
              { 
                if(cons20 == transform._consConstrName_0)
                { 
                  Fail175:
                  { 
                    term = ejp.constFBOX19;
                    if(true)
                      break Success119;
                  }
                  term = term120;
                }
                Success120:
                { 
                  if(cons20 == transform._consConstrName_1)
                  { 
                    Fail176:
                    { 
                      IStrategoTerm h_46 = null;
                      h_46 = term.getSubterm(0);
                      term = termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{ejp.constCons25, (IStrategoTerm)termFactory.makeListCons(h_46, (IStrategoList)ejp.constCons34)});
                      if(true)
                        break Success120;
                    }
                    term = term120;
                  }
                  Success121:
                  { 
                    if(cons20 == transform._consWildcardConstrName_1)
                    { 
                      Fail177:
                      { 
                        IStrategoTerm g_46 = null;
                        g_46 = term.getSubterm(0);
                        term = termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{ejp.constCons25, (IStrategoTerm)termFactory.makeListCons(g_46, (IStrategoList)ejp.constCons35)});
                        if(true)
                          break Success121;
                      }
                      term = term120;
                    }
                    Success122:
                    { 
                      if(cons20 == transform._consNot_1)
                      { 
                        Fail178:
                        { 
                          IStrategoTerm f_46 = null;
                          f_46 = term.getSubterm(0);
                          term = termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{ejp.constCons25, (IStrategoTerm)termFactory.makeListCons(ejp.constS32, termFactory.makeListCons(f_46, (IStrategoList)ejp.constNil0))});
                          if(true)
                            break Success122;
                        }
                        term = term120;
                      }
                      Success123:
                      { 
                        if(cons20 == transform._consModPattern_1)
                        { 
                          Fail179:
                          { 
                            IStrategoTerm e_46 = null;
                            e_46 = term.getSubterm(0);
                            term = termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{ejp.constCons29, e_46});
                            if(true)
                              break Success123;
                          }
                          term = term120;
                        }
                        Success124:
                        { 
                          if(cons20 == transform._consThrowsPattern_1)
                          { 
                            Fail180:
                            { 
                              IStrategoTerm b_46 = null;
                              b_46 = term.getSubterm(0);
                              term = separate_by_comma_0_0.instance.invoke(context, b_46);
                              if(term == null)
                                break Fail180;
                              term = termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{ejp.constCons29, (IStrategoTerm)termFactory.makeListCons(ejp.constFBOX20, termFactory.makeListCons(term, (IStrategoList)ejp.constNil0))});
                              if(true)
                                break Success124;
                            }
                            term = term120;
                          }
                          Success125:
                          { 
                            if(cons20 == transform._consNotThrowsCondition_1)
                            { 
                              Fail181:
                              { 
                                IStrategoTerm a_46 = null;
                                a_46 = term.getSubterm(0);
                                term = termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{ejp.constCons25, (IStrategoTerm)termFactory.makeListCons(ejp.constS32, termFactory.makeListCons(a_46, (IStrategoList)ejp.constNil0))});
                                if(true)
                                  break Success125;
                              }
                              term = term120;
                            }
                            Success126:
                            { 
                              if(cons20 == transform._consThrowsCondition_1)
                              { 
                                Fail182:
                                { 
                                  IStrategoTerm y_45 = null;
                                  y_45 = term.getSubterm(0);
                                  term = has_leftmost_not_0_0.instance.invoke(context, y_45);
                                  if(term == null)
                                    break Fail182;
                                  term = termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{ejp.constCons25, (IStrategoTerm)termFactory.makeListCons(ejp.constS1, termFactory.makeListCons(y_45, (IStrategoList)ejp.constCons26))});
                                  if(true)
                                    break Success126;
                                }
                                term = term120;
                              }
                              Success127:
                              { 
                                if(cons20 == transform._consThrowsCondition_1)
                                { 
                                  Fail183:
                                  { 
                                    IStrategoTerm w_45 = null;
                                    w_45 = term.getSubterm(0);
                                    term = w_45;
                                    IStrategoTerm term133 = term;
                                    Success128:
                                    { 
                                      Fail184:
                                      { 
                                        term = has_leftmost_not_0_0.instance.invoke(context, term);
                                        if(term == null)
                                          break Fail184;
                                        { 
                                          if(true)
                                            break Fail183;
                                          if(true)
                                            break Success128;
                                        }
                                      }
                                      term = term133;
                                    }
                                    term = w_45;
                                    if(true)
                                      break Success127;
                                  }
                                  term = term120;
                                }
                                Success129:
                                { 
                                  if(cons20 == transform._consSimpleAnnoPatternExact_1)
                                  { 
                                    Fail185:
                                    { 
                                      IStrategoTerm v_45 = null;
                                      v_45 = term.getSubterm(0);
                                      term = termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{ejp.constCons25, (IStrategoTerm)termFactory.makeListCons(ejp.constS34, termFactory.makeListCons(v_45, (IStrategoList)ejp.constNil0))});
                                      if(true)
                                        break Success129;
                                    }
                                    term = term120;
                                  }
                                  Success130:
                                  { 
                                    if(cons20 == transform._consSimpleAnnoPattern_1)
                                    { 
                                      Fail186:
                                      { 
                                        IStrategoTerm u_45 = null;
                                        u_45 = term.getSubterm(0);
                                        term = termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{ejp.constCons25, (IStrategoTerm)termFactory.makeListCons(ejp.constS34, termFactory.makeListCons(ejp.constS1, termFactory.makeListCons(u_45, (IStrategoList)ejp.constCons26)))});
                                        if(true)
                                          break Success130;
                                      }
                                      term = term120;
                                    }
                                    Success131:
                                    { 
                                      if(cons20 == transform._consSimpleAnnoPatternValue_2)
                                      { 
                                        Fail187:
                                        { 
                                          IStrategoTerm s_45 = null;
                                          IStrategoTerm t_45 = null;
                                          s_45 = term.getSubterm(0);
                                          t_45 = term.getSubterm(1);
                                          term = termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{ejp.constCons25, (IStrategoTerm)termFactory.makeListCons(ejp.constS34, termFactory.makeListCons(s_45, termFactory.makeListCons(ejp.constS1, termFactory.makeListCons(t_45, (IStrategoList)ejp.constCons26))))});
                                          if(true)
                                            break Success131;
                                        }
                                        term = term120;
                                      }
                                      Success132:
                                      { 
                                        if(cons20 == transform._consNotComp_1)
                                        { 
                                          Fail188:
                                          { 
                                            IStrategoTerm r_45 = null;
                                            r_45 = term.getSubterm(0);
                                            term = termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{ejp.constCons25, (IStrategoTerm)termFactory.makeListCons(ejp.constS32, termFactory.makeListCons(r_45, (IStrategoList)ejp.constNil0))});
                                            if(true)
                                              break Success132;
                                          }
                                          term = term120;
                                        }
                                        Success133:
                                        { 
                                          if(cons20 == transform._consAndComp_2)
                                          { 
                                            Fail189:
                                            { 
                                              IStrategoTerm p_45 = null;
                                              IStrategoTerm q_45 = null;
                                              p_45 = term.getSubterm(0);
                                              q_45 = term.getSubterm(1);
                                              term = termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{ejp.constCons29, (IStrategoTerm)termFactory.makeListCons(p_45, termFactory.makeListCons(ejp.constS35, termFactory.makeListCons(q_45, (IStrategoList)ejp.constNil0)))});
                                              if(true)
                                                break Success133;
                                            }
                                            term = term120;
                                          }
                                          Success134:
                                          { 
                                            if(cons20 == transform._consOrComp_2)
                                            { 
                                              Fail190:
                                              { 
                                                IStrategoTerm n_45 = null;
                                                IStrategoTerm o_45 = null;
                                                n_45 = term.getSubterm(0);
                                                o_45 = term.getSubterm(1);
                                                term = termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{ejp.constCons29, (IStrategoTerm)termFactory.makeListCons(n_45, termFactory.makeListCons(ejp.constS36, termFactory.makeListCons(o_45, (IStrategoList)ejp.constNil0)))});
                                                if(true)
                                                  break Success134;
                                              }
                                              term = term120;
                                            }
                                            Success135:
                                            { 
                                              if(cons20 == transform._consIntertypeMethodDec_2)
                                              { 
                                                Fail191:
                                                { 
                                                  IStrategoTerm l_45 = null;
                                                  IStrategoTerm m_45 = null;
                                                  l_45 = term.getSubterm(0);
                                                  IStrategoTerm arg152 = term.getSubterm(1);
                                                  m_45 = arg152;
                                                  if(arg152.getTermType() != IStrategoTerm.APPL || transform._consBlock_1 != ((IStrategoAppl)arg152).getConstructor())
                                                    break Fail191;
                                                  term = termFactory.makeAppl(transform._consV_2, new IStrategoTerm[]{ejp.constCons36, (IStrategoTerm)termFactory.makeListCons(l_45, termFactory.makeListCons(m_45, (IStrategoList)ejp.constNil0))});
                                                  if(true)
                                                    break Success135;
                                                }
                                                term = term120;
                                              }
                                              Success136:
                                              { 
                                                if(cons20 == transform._consIntertypeMethodDec_2)
                                                { 
                                                  Fail192:
                                                  { 
                                                    IStrategoTerm k_45 = null;
                                                    k_45 = term.getSubterm(0);
                                                    IStrategoTerm arg154 = term.getSubterm(1);
                                                    if(arg154.getTermType() != IStrategoTerm.APPL || transform._consNoMethodBody_0 != ((IStrategoAppl)arg154).getConstructor())
                                                      break Fail192;
                                                    term = termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{ejp.constCons25, (IStrategoTerm)termFactory.makeListCons(k_45, (IStrategoList)ejp.constCons30)});
                                                    if(true)
                                                      break Success136;
                                                  }
                                                  term = term120;
                                                }
                                                Success137:
                                                { 
                                                  if(cons20 == transform._consIntertypeMethodDecHead_8)
                                                  { 
                                                    Fail193:
                                                    { 
                                                      IStrategoTerm s_44 = null;
                                                      IStrategoTerm t_44 = null;
                                                      IStrategoTerm u_44 = null;
                                                      IStrategoTerm v_44 = null;
                                                      IStrategoTerm w_44 = null;
                                                      IStrategoTerm x_44 = null;
                                                      IStrategoTerm y_44 = null;
                                                      IStrategoTerm z_44 = null;
                                                      IStrategoTerm a_45 = null;
                                                      IStrategoTerm b_45 = null;
                                                      IStrategoTerm c_45 = null;
                                                      IStrategoTerm d_45 = null;
                                                      IStrategoTerm e_45 = null;
                                                      IStrategoTerm f_45 = null;
                                                      IStrategoTerm i_45 = null;
                                                      IStrategoTerm j_45 = null;
                                                      c_45 = term.getSubterm(0);
                                                      x_44 = term.getSubterm(1);
                                                      s_44 = term.getSubterm(2);
                                                      t_44 = term.getSubterm(3);
                                                      y_44 = term.getSubterm(4);
                                                      IStrategoTerm arg155 = term.getSubterm(5);
                                                      if(arg155.getTermType() != IStrategoTerm.APPL || transform._consId_1 != ((IStrategoAppl)arg155).getConstructor())
                                                        break Fail193;
                                                      u_44 = arg155.getSubterm(0);
                                                      v_44 = term.getSubterm(6);
                                                      a_45 = term.getSubterm(7);
                                                      f_45 = term;
                                                      term = list_to_args_0_0.instance.invoke(context, v_44);
                                                      if(term == null)
                                                        break Fail193;
                                                      w_44 = term;
                                                      term = type_params_to_boxes_0_0.instance.invoke(context, x_44);
                                                      if(term == null)
                                                        break Fail193;
                                                      d_45 = term;
                                                      term = type_params_to_boxes_0_0.instance.invoke(context, y_44);
                                                      if(term == null)
                                                        break Fail193;
                                                      z_44 = term;
                                                      term = option_to_boxes_0_0.instance.invoke(context, a_45);
                                                      if(term == null)
                                                        break Fail193;
                                                      b_45 = term;
                                                      term = termFactory.makeTuple(c_45, d_45);
                                                      term = conc_0_0.instance.invoke(context, term);
                                                      if(term == null)
                                                        break Fail193;
                                                      e_45 = term;
                                                      term = f_45;
                                                      j_45 = term;
                                                      term = termFactory.makeTuple(z_44, (IStrategoTerm)termFactory.makeListCons(ejp.constS23, termFactory.makeListCons(termFactory.makeAppl(transform._consS_1, new IStrategoTerm[]{u_44}), termFactory.makeListCons(w_44, (IStrategoList)ejp.constNil0))));
                                                      term = make$Conc_0_0.instance.invoke(context, term);
                                                      if(term == null)
                                                        break Fail193;
                                                      i_45 = term;
                                                      term = j_45;
                                                      IStrategoList list4;
                                                      IStrategoList list3;
                                                      list3 = checkListTail(b_45);
                                                      if(list3 == null)
                                                        break Fail193;
                                                      list4 = checkListTail(i_45);
                                                      if(list4 == null)
                                                        break Fail193;
                                                      term = termFactory.makeTuple(e_45, (IStrategoTerm)termFactory.makeListCons(s_44, termFactory.makeListCons(termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{ejp.constCons25, (IStrategoTerm)termFactory.makeListCons(t_44, list4)}), list3)));
                                                      term = make$Conc_0_0.instance.invoke(context, term);
                                                      if(term == null)
                                                        break Fail193;
                                                      term = termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{ejp.constCons29, term});
                                                      if(true)
                                                        break Success137;
                                                    }
                                                    term = term120;
                                                  }
                                                  Success138:
                                                  { 
                                                    if(cons20 == transform._consIntertypeConstrDec_2)
                                                    { 
                                                      Fail194:
                                                      { 
                                                        IStrategoTerm q_44 = null;
                                                        IStrategoTerm r_44 = null;
                                                        q_44 = term.getSubterm(0);
                                                        r_44 = term.getSubterm(1);
                                                        term = termFactory.makeAppl(transform._consV_2, new IStrategoTerm[]{ejp.constCons36, (IStrategoTerm)termFactory.makeListCons(q_44, termFactory.makeListCons(r_44, (IStrategoList)ejp.constNil0))});
                                                        if(true)
                                                          break Success138;
                                                      }
                                                      term = term120;
                                                    }
                                                    term = aspectj_to_box_0_0_fragment_1.instance.invoke(context, term);
                                                    if(term == null)
                                                      break Fail170;
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