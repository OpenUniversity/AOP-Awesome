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

@SuppressWarnings("all") public class type_of_0_3 extends Strategy 
{ 
  public static type_of_0_3 instance = new type_of_0_3();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm f_53, IStrategoTerm g_53, IStrategoTerm h_53)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("type_of_0_3");
    Fail121:
    { 
      IStrategoTerm term139 = term;
      Success97:
      { 
        Fail122:
        { 
          if(term.getTermType() != IStrategoTerm.APPL || transform._consComplement_1 != ((IStrategoAppl)term).getConstructor())
            break Fail122;
          Success98:
          { 
            Fail123:
            { 
              IStrategoTerm r_34 = null;
              r_34 = term;
              term = termFactory.makeTuple(f_53, cool.constNone0);
              term = equal_0_0.instance.invoke(context, term);
              if(term == null)
                break Fail123;
              term = r_34;
              { 
                term = cool.constLong0;
                if(true)
                  break Success98;
              }
            }
            term = f_53;
          }
          if(true)
            break Success97;
        }
        term = term139;
        IStrategoTerm term141 = term;
        Success99:
        { 
          Fail124:
          { 
            term = or_2_0.instance.invoke(context, term, lifted82.instance, lifted83.instance);
            if(term == null)
              break Fail124;
            Success100:
            { 
              Fail125:
              { 
                IStrategoTerm n_34 = null;
                n_34 = term;
                term = termFactory.makeTuple(f_53, cool.constNone0);
                term = equal_0_0.instance.invoke(context, term);
                if(term == null)
                  break Fail125;
                term = n_34;
                { 
                  term = cool.constDouble0;
                  if(true)
                    break Success100;
                }
              }
              term = f_53;
            }
            if(true)
              break Success99;
          }
          term = term141;
          IStrategoTerm term143 = term;
          Success101:
          { 
            Fail126:
            { 
              term = or_2_0.instance.invoke(context, term, lifted84.instance, lifted91.instance);
              if(term == null)
                break Fail126;
              Success102:
              { 
                Fail127:
                { 
                  IStrategoTerm j_34 = null;
                  j_34 = term;
                  term = termFactory.makeTuple(f_53, cool.constNone0);
                  term = equal_0_0.instance.invoke(context, term);
                  if(term == null)
                    break Fail127;
                  term = j_34;
                  { 
                    term = cool.constDouble0;
                    if(true)
                      break Success102;
                  }
                }
                term = cast_bounded_arithmetic_type_0_0.instance.invoke(context, f_53);
                if(term == null)
                  break Fail126;
              }
              if(true)
                break Success101;
            }
            term = term143;
            IStrategoTerm term145 = term;
            Success103:
            { 
              Fail128:
              { 
                TermReference e_34 = new TermReference();
                lifted95 lifted950 = new lifted95();
                lifted92 lifted920 = new lifted92();
                lifted950.e_34 = e_34;
                lifted920.e_34 = e_34;
                term = or_2_0.instance.invoke(context, term, lifted920, lifted950);
                if(term == null)
                  break Fail128;
                Success104:
                { 
                  Fail129:
                  { 
                    IStrategoTerm f_34 = null;
                    f_34 = term;
                    term = termFactory.makeTuple(f_53, cool.constNone0);
                    term = equal_0_0.instance.invoke(context, term);
                    if(term == null)
                      break Fail129;
                    term = f_34;
                    { 
                      if(e_34.value == null)
                        break Fail128;
                      term = get_type_of_0_3.instance.invoke(context, e_34.value, f_53, g_53, h_53);
                      if(term == null)
                        break Fail128;
                      term = cast_shift_type_0_0.instance.invoke(context, term);
                      if(term == null)
                        break Fail128;
                      if(true)
                        break Success104;
                    }
                  }
                  term = cast_shift_type_0_0.instance.invoke(context, f_53);
                  if(term == null)
                    break Fail128;
                }
                if(true)
                  break Success103;
              }
              term = term145;
              IStrategoTerm term147 = term;
              IStrategoConstructor cons3 = term.getTermType() == IStrategoTerm.APPL ? ((IStrategoAppl)term).getConstructor() : null;
              Success105:
              { 
                if(cons3 == transform._consAnd_2)
                { 
                  Fail130:
                  { 
                    IStrategoTerm y_33 = null;
                    IStrategoTerm z_33 = null;
                    y_33 = term.getSubterm(0);
                    z_33 = term.getSubterm(1);
                    Success106:
                    { 
                      Fail131:
                      { 
                        IStrategoTerm a_34 = null;
                        a_34 = term;
                        term = termFactory.makeTuple(f_53, cool.constNone0);
                        term = equal_0_0.instance.invoke(context, term);
                        if(term == null)
                          break Fail131;
                        term = a_34;
                        { 
                          term = termFactory.makeTuple(y_33, z_33);
                          term = try_to_get_type_0_3.instance.invoke(context, term, f_53, g_53, h_53);
                          if(term == null)
                            break Fail130;
                          term = cast_conditional_type_0_0.instance.invoke(context, term);
                          if(term == null)
                            break Fail130;
                          if(true)
                            break Success106;
                        }
                      }
                      term = cast_bounded_conditional_type_0_0.instance.invoke(context, f_53);
                      if(term == null)
                        break Fail130;
                    }
                    if(true)
                      break Success105;
                  }
                  term = term147;
                }
                Success107:
                { 
                  if(cons3 == transform._consExcOr_2)
                  { 
                    Fail132:
                    { 
                      IStrategoTerm s_33 = null;
                      IStrategoTerm t_33 = null;
                      s_33 = term.getSubterm(0);
                      t_33 = term.getSubterm(1);
                      Success108:
                      { 
                        Fail133:
                        { 
                          IStrategoTerm u_33 = null;
                          u_33 = term;
                          term = termFactory.makeTuple(f_53, cool.constNone0);
                          term = equal_0_0.instance.invoke(context, term);
                          if(term == null)
                            break Fail133;
                          term = u_33;
                          { 
                            term = termFactory.makeTuple(s_33, t_33);
                            term = try_to_get_type_0_3.instance.invoke(context, term, f_53, g_53, h_53);
                            if(term == null)
                              break Fail132;
                            term = cast_conditional_type_0_0.instance.invoke(context, term);
                            if(term == null)
                              break Fail132;
                            if(true)
                              break Success108;
                          }
                        }
                        term = cast_bounded_conditional_type_0_0.instance.invoke(context, f_53);
                        if(term == null)
                          break Fail132;
                      }
                      if(true)
                        break Success107;
                    }
                    term = term147;
                  }
                  Success109:
                  { 
                    if(cons3 == transform._consOr_2)
                    { 
                      Fail134:
                      { 
                        IStrategoTerm m_33 = null;
                        IStrategoTerm n_33 = null;
                        m_33 = term.getSubterm(0);
                        n_33 = term.getSubterm(1);
                        Success110:
                        { 
                          Fail135:
                          { 
                            IStrategoTerm o_33 = null;
                            o_33 = term;
                            term = termFactory.makeTuple(f_53, cool.constNone0);
                            term = equal_0_0.instance.invoke(context, term);
                            if(term == null)
                              break Fail135;
                            term = o_33;
                            { 
                              term = termFactory.makeTuple(m_33, n_33);
                              term = try_to_get_type_0_3.instance.invoke(context, term, f_53, g_53, h_53);
                              if(term == null)
                                break Fail134;
                              term = cast_conditional_type_0_0.instance.invoke(context, term);
                              if(term == null)
                                break Fail134;
                              if(true)
                                break Success110;
                            }
                          }
                          term = cast_bounded_conditional_type_0_0.instance.invoke(context, f_53);
                          if(term == null)
                            break Fail134;
                        }
                        if(true)
                          break Success109;
                      }
                      term = term147;
                    }
                    IStrategoTerm term153 = term;
                    Success111:
                    { 
                      Fail136:
                      { 
                        TermReference f_33 = new TermReference();
                        IStrategoTerm g_33 = null;
                        lifted99 lifted990 = new lifted99();
                        lifted96 lifted960 = new lifted96();
                        lifted990.f_33 = f_33;
                        lifted960.f_33 = f_33;
                        term = or_2_0.instance.invoke(context, term, lifted960, lifted990);
                        if(term == null)
                          break Fail136;
                        if(f_33.value == null)
                          break Fail136;
                        term = get_type_of_0_3.instance.invoke(context, f_33.value, f_53, g_53, h_53);
                        if(term == null)
                          break Fail136;
                        g_33 = term;
                        Success112:
                        { 
                          Fail137:
                          { 
                            IStrategoTerm h_33 = null;
                            h_33 = term;
                            term = termFactory.makeTuple(g_33, cool.constNone0);
                            term = equal_0_0.instance.invoke(context, term);
                            if(term == null)
                              break Fail137;
                            term = h_33;
                            { 
                              Success113:
                              { 
                                Fail138:
                                { 
                                  IStrategoTerm i_33 = null;
                                  i_33 = term;
                                  term = termFactory.makeTuple(f_53, cool.constNone0);
                                  term = equal_0_0.instance.invoke(context, term);
                                  if(term == null)
                                    break Fail138;
                                  term = i_33;
                                  { 
                                    term = cool.constDouble0;
                                    if(true)
                                      break Success113;
                                  }
                                }
                                term = ensure__number_0_0.instance.invoke(context, f_53);
                                if(term == null)
                                  break Fail136;
                              }
                              if(true)
                                break Success112;
                            }
                          }
                          term = ensure__number_0_0.instance.invoke(context, g_33);
                          if(term == null)
                            break Fail136;
                        }
                        if(true)
                          break Success111;
                      }
                      term = term153;
                      IStrategoTerm term156 = term;
                      IStrategoConstructor cons4 = term.getTermType() == IStrategoTerm.APPL ? ((IStrategoAppl)term).getConstructor() : null;
                      Success114:
                      { 
                        if(cons4 == transform._consExprName_1)
                        { 
                          Fail139:
                          { 
                            IStrategoTerm z_32 = null;
                            z_32 = term;
                            term = fetch_0_0.instance.invoke(context, term);
                            if(term == null)
                              break Fail139;
                            term = get_expr_type_0_3.instance.invoke(context, z_32, term, g_53, h_53);
                            if(term == null)
                              break Fail139;
                            if(true)
                              break Success114;
                          }
                          term = term156;
                        }
                        Success115:
                        { 
                          if(cons4 == transform._consExprName_2)
                          { 
                            Fail140:
                            { 
                              IStrategoTerm p_32 = null;
                              p_32 = term;
                              term = fetch_0_0.instance.invoke(context, term);
                              if(term == null)
                                break Fail140;
                              term = get_expr_type_0_3.instance.invoke(context, p_32, term, g_53, h_53);
                              if(term == null)
                                break Fail140;
                              if(true)
                                break Success115;
                            }
                            term = term156;
                          }
                          Success116:
                          { 
                            if(cons4 == transform._consLit_1)
                            { 
                              Fail141:
                              { 
                                IStrategoTerm g_32 = null;
                                g_32 = term.getSubterm(0);
                                term = g_32;
                                if(true)
                                  break Success116;
                              }
                              term = term156;
                            }
                            Success117:
                            { 
                              if(cons4 == transform._consNot_1)
                              { 
                                Fail142:
                                { 
                                  term = cool.constBoolean0;
                                  if(true)
                                    break Success117;
                                }
                                term = term156;
                              }
                              Success118:
                              { 
                                if(cons4 == transform._consLt_2)
                                { 
                                  Fail143:
                                  { 
                                    term = cool.constBoolean0;
                                    if(true)
                                      break Success118;
                                  }
                                  term = term156;
                                }
                                Success119:
                                { 
                                  if(cons4 == transform._consGt_2)
                                  { 
                                    Fail144:
                                    { 
                                      term = cool.constBoolean0;
                                      if(true)
                                        break Success119;
                                    }
                                    term = term156;
                                  }
                                  Success120:
                                  { 
                                    if(cons4 == transform._consLtEq_2)
                                    { 
                                      Fail145:
                                      { 
                                        term = cool.constBoolean0;
                                        if(true)
                                          break Success120;
                                      }
                                      term = term156;
                                    }
                                    Success121:
                                    { 
                                      if(cons4 == transform._consGtEq_2)
                                      { 
                                        Fail146:
                                        { 
                                          term = cool.constBoolean0;
                                          if(true)
                                            break Success121;
                                        }
                                        term = term156;
                                      }
                                      Success122:
                                      { 
                                        if(cons4 == transform._consEq_2)
                                        { 
                                          Fail147:
                                          { 
                                            term = cool.constBoolean0;
                                            if(true)
                                              break Success122;
                                          }
                                          term = term156;
                                        }
                                        Success123:
                                        { 
                                          if(cons4 == transform._consNotEq_2)
                                          { 
                                            Fail148:
                                            { 
                                              term = cool.constBoolean0;
                                              if(true)
                                                break Success123;
                                            }
                                            term = term156;
                                          }
                                          Success124:
                                          { 
                                            if(cons4 == transform._consLazyAnd_2)
                                            { 
                                              Fail149:
                                              { 
                                                term = cool.constBoolean0;
                                                if(true)
                                                  break Success124;
                                              }
                                              term = term156;
                                            }
                                            Success125:
                                            { 
                                              if(cons4 == transform._consLazyOr_2)
                                              { 
                                                Fail150:
                                                { 
                                                  term = cool.constBoolean0;
                                                  if(true)
                                                    break Success125;
                                                }
                                                term = term156;
                                              }
                                              Success126:
                                              { 
                                                if(cons4 == transform._consAssign_2)
                                                { 
                                                  Fail151:
                                                  { 
                                                    IStrategoTerm b_31 = null;
                                                    b_31 = term.getSubterm(0);
                                                    term = this.invoke(context, b_31, f_53, g_53, h_53);
                                                    if(term == null)
                                                      break Fail151;
                                                    if(true)
                                                      break Success126;
                                                  }
                                                  term = term156;
                                                }
                                                Success127:
                                                { 
                                                  if(cons4 == transform._consAssignMul_2)
                                                  { 
                                                    Fail152:
                                                    { 
                                                      IStrategoTerm x_30 = null;
                                                      x_30 = term.getSubterm(0);
                                                      term = this.invoke(context, x_30, f_53, g_53, h_53);
                                                      if(term == null)
                                                        break Fail152;
                                                      if(true)
                                                        break Success127;
                                                    }
                                                    term = term156;
                                                  }
                                                  Success128:
                                                  { 
                                                    if(cons4 == transform._consAssignDiv_2)
                                                    { 
                                                      Fail153:
                                                      { 
                                                        IStrategoTerm t_30 = null;
                                                        t_30 = term.getSubterm(0);
                                                        term = this.invoke(context, t_30, f_53, g_53, h_53);
                                                        if(term == null)
                                                          break Fail153;
                                                        if(true)
                                                          break Success128;
                                                      }
                                                      term = term156;
                                                    }
                                                    Success129:
                                                    { 
                                                      if(cons4 == transform._consAssignRemain_2)
                                                      { 
                                                        Fail154:
                                                        { 
                                                          IStrategoTerm p_30 = null;
                                                          p_30 = term.getSubterm(0);
                                                          term = this.invoke(context, p_30, f_53, g_53, h_53);
                                                          if(term == null)
                                                            break Fail154;
                                                          if(true)
                                                            break Success129;
                                                        }
                                                        term = term156;
                                                      }
                                                      Success130:
                                                      { 
                                                        if(cons4 == transform._consAssignPlus_2)
                                                        { 
                                                          Fail155:
                                                          { 
                                                            IStrategoTerm l_30 = null;
                                                            l_30 = term.getSubterm(0);
                                                            term = this.invoke(context, l_30, f_53, g_53, h_53);
                                                            if(term == null)
                                                              break Fail155;
                                                            if(true)
                                                              break Success130;
                                                          }
                                                          term = term156;
                                                        }
                                                        Success131:
                                                        { 
                                                          if(cons4 == transform._consAssignMinus_2)
                                                          { 
                                                            Fail156:
                                                            { 
                                                              IStrategoTerm h_30 = null;
                                                              h_30 = term.getSubterm(0);
                                                              term = this.invoke(context, h_30, f_53, g_53, h_53);
                                                              if(term == null)
                                                                break Fail156;
                                                              if(true)
                                                                break Success131;
                                                            }
                                                            term = term156;
                                                          }
                                                          Success132:
                                                          { 
                                                            if(cons4 == transform._consAssignLeftShift_2)
                                                            { 
                                                              Fail157:
                                                              { 
                                                                IStrategoTerm d_30 = null;
                                                                d_30 = term.getSubterm(0);
                                                                term = this.invoke(context, d_30, f_53, g_53, h_53);
                                                                if(term == null)
                                                                  break Fail157;
                                                                if(true)
                                                                  break Success132;
                                                              }
                                                              term = term156;
                                                            }
                                                            Success133:
                                                            { 
                                                              if(cons4 == transform._consAssignRightShift_2)
                                                              { 
                                                                Fail158:
                                                                { 
                                                                  IStrategoTerm z_29 = null;
                                                                  z_29 = term.getSubterm(0);
                                                                  term = this.invoke(context, z_29, f_53, g_53, h_53);
                                                                  if(term == null)
                                                                    break Fail158;
                                                                  if(true)
                                                                    break Success133;
                                                                }
                                                                term = term156;
                                                              }
                                                              Success134:
                                                              { 
                                                                if(cons4 == transform._consAssignURightShift_2)
                                                                { 
                                                                  Fail159:
                                                                  { 
                                                                    IStrategoTerm v_29 = null;
                                                                    v_29 = term.getSubterm(0);
                                                                    term = this.invoke(context, v_29, f_53, g_53, h_53);
                                                                    if(term == null)
                                                                      break Fail159;
                                                                    if(true)
                                                                      break Success134;
                                                                  }
                                                                  term = term156;
                                                                }
                                                                Success135:
                                                                { 
                                                                  if(cons4 == transform._consAssignAnd_2)
                                                                  { 
                                                                    Fail160:
                                                                    { 
                                                                      IStrategoTerm r_29 = null;
                                                                      r_29 = term.getSubterm(0);
                                                                      term = this.invoke(context, r_29, f_53, g_53, h_53);
                                                                      if(term == null)
                                                                        break Fail160;
                                                                      if(true)
                                                                        break Success135;
                                                                    }
                                                                    term = term156;
                                                                  }
                                                                  Success136:
                                                                  { 
                                                                    if(cons4 == transform._consAssignExcOr_2)
                                                                    { 
                                                                      Fail161:
                                                                      { 
                                                                        IStrategoTerm n_29 = null;
                                                                        n_29 = term.getSubterm(0);
                                                                        term = this.invoke(context, n_29, f_53, g_53, h_53);
                                                                        if(term == null)
                                                                          break Fail161;
                                                                        if(true)
                                                                          break Success136;
                                                                      }
                                                                      term = term156;
                                                                    }
                                                                    Success137:
                                                                    { 
                                                                      if(cons4 == transform._consAssignOr_2)
                                                                      { 
                                                                        Fail162:
                                                                        { 
                                                                          IStrategoTerm j_29 = null;
                                                                          j_29 = term.getSubterm(0);
                                                                          term = this.invoke(context, j_29, f_53, g_53, h_53);
                                                                          if(term == null)
                                                                            break Fail162;
                                                                          if(true)
                                                                            break Success137;
                                                                        }
                                                                        term = term156;
                                                                      }
                                                                      Success138:
                                                                      { 
                                                                        if(cons4 == transform._consCastPrim_2)
                                                                        { 
                                                                          Fail163:
                                                                          { 
                                                                            IStrategoTerm f_29 = null;
                                                                            f_29 = term.getSubterm(0);
                                                                            term = f_29;
                                                                            if(true)
                                                                              break Success138;
                                                                          }
                                                                          term = term156;
                                                                        }
                                                                        if(cons4 == transform._consCastRef_2)
                                                                        { 
                                                                          IStrategoTerm b_29 = null;
                                                                          b_29 = term.getSubterm(0);
                                                                          term = b_29;
                                                                        }
                                                                        else
                                                                        { 
                                                                          break Fail121;
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