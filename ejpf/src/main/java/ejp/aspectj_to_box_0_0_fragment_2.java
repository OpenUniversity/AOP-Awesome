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
            IStrategoTerm z_46 = null;
            IStrategoTerm a_47 = null;
            IStrategoTerm b_47 = null;
            IStrategoTerm c_47 = null;
            IStrategoTerm d_47 = null;
            IStrategoTerm arg150 = term.getSubterm(0);
            if(arg150.getTermType() != IStrategoTerm.APPL || transform._consAnnoPattern_1 != ((IStrategoAppl)arg150).getConstructor())
              break Fail171;
            b_47 = arg150.getSubterm(0);
            IStrategoTerm arg151 = term.getSubterm(1);
            if(arg151.getTermType() != IStrategoTerm.APPL || transform._consModPattern_1 != ((IStrategoAppl)arg151).getConstructor())
              break Fail171;
            c_47 = arg151.getSubterm(0);
            z_46 = term.getSubterm(2);
            a_47 = term.getSubterm(3);
            term = termFactory.makeTuple(b_47, c_47);
            term = conc_0_0.instance.invoke(context, term);
            if(term == null)
              break Fail171;
            d_47 = term;
            term = termFactory.makeTuple(d_47, (IStrategoTerm)termFactory.makeListCons(z_46, termFactory.makeListCons(a_47, (IStrategoList)ejp.constNil0)));
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
              IStrategoTerm y_46 = null;
              y_46 = term.getSubterm(0);
              term = termFactory.makeAppl(transform._consS_1, new IStrategoTerm[]{y_46});
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
                IStrategoTerm w_46 = null;
                IStrategoTerm x_46 = null;
                w_46 = term.getSubterm(0);
                x_46 = term.getSubterm(1);
                term = termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{ejp.constCons25, (IStrategoTerm)termFactory.makeListCons(w_46, termFactory.makeListCons(ejp.constS23, termFactory.makeListCons(termFactory.makeAppl(transform._consS_1, new IStrategoTerm[]{x_46}), (IStrategoList)ejp.constNil0)))});
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
                  IStrategoTerm u_46 = null;
                  IStrategoTerm v_46 = null;
                  u_46 = term.getSubterm(0);
                  v_46 = term.getSubterm(1);
                  term = termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{ejp.constCons25, (IStrategoTerm)termFactory.makeListCons(u_46, termFactory.makeListCons(ejp.constS28, termFactory.makeListCons(termFactory.makeAppl(transform._consS_1, new IStrategoTerm[]{v_46}), (IStrategoList)ejp.constNil0)))});
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
                      IStrategoTerm t_46 = null;
                      t_46 = term.getSubterm(0);
                      term = termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{ejp.constCons25, (IStrategoTerm)termFactory.makeListCons(t_46, (IStrategoList)ejp.constCons34)});
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
                        IStrategoTerm s_46 = null;
                        s_46 = term.getSubterm(0);
                        term = termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{ejp.constCons25, (IStrategoTerm)termFactory.makeListCons(s_46, (IStrategoList)ejp.constCons35)});
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
                          IStrategoTerm r_46 = null;
                          r_46 = term.getSubterm(0);
                          term = termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{ejp.constCons25, (IStrategoTerm)termFactory.makeListCons(ejp.constS32, termFactory.makeListCons(r_46, (IStrategoList)ejp.constNil0))});
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
                            IStrategoTerm q_46 = null;
                            q_46 = term.getSubterm(0);
                            term = termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{ejp.constCons29, q_46});
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
                              IStrategoTerm n_46 = null;
                              n_46 = term.getSubterm(0);
                              term = separate_by_comma_0_0.instance.invoke(context, n_46);
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
                                IStrategoTerm m_46 = null;
                                m_46 = term.getSubterm(0);
                                term = termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{ejp.constCons25, (IStrategoTerm)termFactory.makeListCons(ejp.constS32, termFactory.makeListCons(m_46, (IStrategoList)ejp.constNil0))});
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
                                  IStrategoTerm k_46 = null;
                                  k_46 = term.getSubterm(0);
                                  term = has_leftmost_not_0_0.instance.invoke(context, k_46);
                                  if(term == null)
                                    break Fail182;
                                  term = termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{ejp.constCons25, (IStrategoTerm)termFactory.makeListCons(ejp.constS1, termFactory.makeListCons(k_46, (IStrategoList)ejp.constCons26))});
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
                                    IStrategoTerm i_46 = null;
                                    i_46 = term.getSubterm(0);
                                    term = i_46;
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
                                    term = i_46;
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
                                      IStrategoTerm h_46 = null;
                                      h_46 = term.getSubterm(0);
                                      term = termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{ejp.constCons25, (IStrategoTerm)termFactory.makeListCons(ejp.constS34, termFactory.makeListCons(h_46, (IStrategoList)ejp.constNil0))});
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
                                        IStrategoTerm g_46 = null;
                                        g_46 = term.getSubterm(0);
                                        term = termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{ejp.constCons25, (IStrategoTerm)termFactory.makeListCons(ejp.constS34, termFactory.makeListCons(ejp.constS1, termFactory.makeListCons(g_46, (IStrategoList)ejp.constCons26)))});
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
                                          IStrategoTerm e_46 = null;
                                          IStrategoTerm f_46 = null;
                                          e_46 = term.getSubterm(0);
                                          f_46 = term.getSubterm(1);
                                          term = termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{ejp.constCons25, (IStrategoTerm)termFactory.makeListCons(ejp.constS34, termFactory.makeListCons(e_46, termFactory.makeListCons(ejp.constS1, termFactory.makeListCons(f_46, (IStrategoList)ejp.constCons26))))});
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
                                            IStrategoTerm d_46 = null;
                                            d_46 = term.getSubterm(0);
                                            term = termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{ejp.constCons25, (IStrategoTerm)termFactory.makeListCons(ejp.constS32, termFactory.makeListCons(d_46, (IStrategoList)ejp.constNil0))});
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
                                              IStrategoTerm b_46 = null;
                                              IStrategoTerm c_46 = null;
                                              b_46 = term.getSubterm(0);
                                              c_46 = term.getSubterm(1);
                                              term = termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{ejp.constCons29, (IStrategoTerm)termFactory.makeListCons(b_46, termFactory.makeListCons(ejp.constS35, termFactory.makeListCons(c_46, (IStrategoList)ejp.constNil0)))});
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
                                                IStrategoTerm z_45 = null;
                                                IStrategoTerm a_46 = null;
                                                z_45 = term.getSubterm(0);
                                                a_46 = term.getSubterm(1);
                                                term = termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{ejp.constCons29, (IStrategoTerm)termFactory.makeListCons(z_45, termFactory.makeListCons(ejp.constS36, termFactory.makeListCons(a_46, (IStrategoList)ejp.constNil0)))});
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
                                                  IStrategoTerm x_45 = null;
                                                  IStrategoTerm y_45 = null;
                                                  x_45 = term.getSubterm(0);
                                                  IStrategoTerm arg152 = term.getSubterm(1);
                                                  y_45 = arg152;
                                                  if(arg152.getTermType() != IStrategoTerm.APPL || transform._consBlock_1 != ((IStrategoAppl)arg152).getConstructor())
                                                    break Fail191;
                                                  term = termFactory.makeAppl(transform._consV_2, new IStrategoTerm[]{ejp.constCons36, (IStrategoTerm)termFactory.makeListCons(x_45, termFactory.makeListCons(y_45, (IStrategoList)ejp.constNil0))});
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
                                                    IStrategoTerm w_45 = null;
                                                    w_45 = term.getSubterm(0);
                                                    IStrategoTerm arg154 = term.getSubterm(1);
                                                    if(arg154.getTermType() != IStrategoTerm.APPL || transform._consNoMethodBody_0 != ((IStrategoAppl)arg154).getConstructor())
                                                      break Fail192;
                                                    term = termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{ejp.constCons25, (IStrategoTerm)termFactory.makeListCons(w_45, (IStrategoList)ejp.constCons30)});
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
                                                      IStrategoTerm e_45 = null;
                                                      IStrategoTerm f_45 = null;
                                                      IStrategoTerm g_45 = null;
                                                      IStrategoTerm h_45 = null;
                                                      IStrategoTerm i_45 = null;
                                                      IStrategoTerm j_45 = null;
                                                      IStrategoTerm k_45 = null;
                                                      IStrategoTerm l_45 = null;
                                                      IStrategoTerm m_45 = null;
                                                      IStrategoTerm n_45 = null;
                                                      IStrategoTerm o_45 = null;
                                                      IStrategoTerm p_45 = null;
                                                      IStrategoTerm q_45 = null;
                                                      IStrategoTerm r_45 = null;
                                                      IStrategoTerm u_45 = null;
                                                      IStrategoTerm v_45 = null;
                                                      o_45 = term.getSubterm(0);
                                                      j_45 = term.getSubterm(1);
                                                      e_45 = term.getSubterm(2);
                                                      f_45 = term.getSubterm(3);
                                                      k_45 = term.getSubterm(4);
                                                      IStrategoTerm arg155 = term.getSubterm(5);
                                                      if(arg155.getTermType() != IStrategoTerm.APPL || transform._consId_1 != ((IStrategoAppl)arg155).getConstructor())
                                                        break Fail193;
                                                      g_45 = arg155.getSubterm(0);
                                                      h_45 = term.getSubterm(6);
                                                      m_45 = term.getSubterm(7);
                                                      r_45 = term;
                                                      term = list_to_args_0_0.instance.invoke(context, h_45);
                                                      if(term == null)
                                                        break Fail193;
                                                      i_45 = term;
                                                      term = type_params_to_boxes_0_0.instance.invoke(context, j_45);
                                                      if(term == null)
                                                        break Fail193;
                                                      p_45 = term;
                                                      term = type_params_to_boxes_0_0.instance.invoke(context, k_45);
                                                      if(term == null)
                                                        break Fail193;
                                                      l_45 = term;
                                                      term = option_to_boxes_0_0.instance.invoke(context, m_45);
                                                      if(term == null)
                                                        break Fail193;
                                                      n_45 = term;
                                                      term = termFactory.makeTuple(o_45, p_45);
                                                      term = conc_0_0.instance.invoke(context, term);
                                                      if(term == null)
                                                        break Fail193;
                                                      q_45 = term;
                                                      term = r_45;
                                                      v_45 = term;
                                                      term = termFactory.makeTuple(l_45, (IStrategoTerm)termFactory.makeListCons(ejp.constS23, termFactory.makeListCons(termFactory.makeAppl(transform._consS_1, new IStrategoTerm[]{g_45}), termFactory.makeListCons(i_45, (IStrategoList)ejp.constNil0))));
                                                      term = make$Conc_0_0.instance.invoke(context, term);
                                                      if(term == null)
                                                        break Fail193;
                                                      u_45 = term;
                                                      term = v_45;
                                                      IStrategoList list4;
                                                      IStrategoList list3;
                                                      list3 = checkListTail(n_45);
                                                      if(list3 == null)
                                                        break Fail193;
                                                      list4 = checkListTail(u_45);
                                                      if(list4 == null)
                                                        break Fail193;
                                                      term = termFactory.makeTuple(q_45, (IStrategoTerm)termFactory.makeListCons(e_45, termFactory.makeListCons(termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{ejp.constCons25, (IStrategoTerm)termFactory.makeListCons(f_45, list4)}), list3)));
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
                                                        IStrategoTerm c_45 = null;
                                                        IStrategoTerm d_45 = null;
                                                        c_45 = term.getSubterm(0);
                                                        d_45 = term.getSubterm(1);
                                                        term = termFactory.makeAppl(transform._consV_2, new IStrategoTerm[]{ejp.constCons36, (IStrategoTerm)termFactory.makeListCons(c_45, termFactory.makeListCons(d_45, (IStrategoList)ejp.constNil0))});
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