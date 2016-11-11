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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm f_88, IStrategoTerm g_88, IStrategoTerm h_88)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("type_of_0_3");
    Fail235:
    { 
      IStrategoTerm term245 = term;
      Success200:
      { 
        Fail236:
        { 
          if(term.getTermType() != IStrategoTerm.APPL || transform._consComplement_1 != ((IStrategoAppl)term).getConstructor())
            break Fail236;
          Success201:
          { 
            Fail237:
            { 
              IStrategoTerm s_50 = null;
              s_50 = term;
              term = termFactory.makeTuple(f_88, cool.constNone0);
              term = equal_0_0.instance.invoke(context, term);
              if(term == null)
                break Fail237;
              term = s_50;
              { 
                term = cool.constLong0;
                if(true)
                  break Success201;
              }
            }
            term = f_88;
          }
          if(true)
            break Success200;
        }
        term = term245;
        IStrategoTerm term247 = term;
        Success202:
        { 
          Fail238:
          { 
            term = or_2_0.instance.invoke(context, term, lifted86.instance, lifted87.instance);
            if(term == null)
              break Fail238;
            Success203:
            { 
              Fail239:
              { 
                IStrategoTerm o_50 = null;
                o_50 = term;
                term = termFactory.makeTuple(f_88, cool.constNone0);
                term = equal_0_0.instance.invoke(context, term);
                if(term == null)
                  break Fail239;
                term = o_50;
                { 
                  term = cool.constDouble0;
                  if(true)
                    break Success203;
                }
              }
              term = f_88;
            }
            if(true)
              break Success202;
          }
          term = term247;
          IStrategoTerm term249 = term;
          Success204:
          { 
            Fail240:
            { 
              term = or_2_0.instance.invoke(context, term, lifted88.instance, lifted95.instance);
              if(term == null)
                break Fail240;
              Success205:
              { 
                Fail241:
                { 
                  IStrategoTerm j_50 = null;
                  j_50 = term;
                  term = termFactory.makeTuple(f_88, cool.constNone0);
                  term = equal_0_0.instance.invoke(context, term);
                  if(term == null)
                    break Fail241;
                  term = j_50;
                  { 
                    term = cool.constDouble0;
                    if(true)
                      break Success205;
                  }
                }
                term = cast_bounded_arithmetic_type_0_0.instance.invoke(context, f_88);
                if(term == null)
                  break Fail240;
              }
              if(true)
                break Success204;
            }
            term = term249;
            IStrategoTerm term251 = term;
            Success206:
            { 
              Fail242:
              { 
                TermReference e_50 = new TermReference();
                lifted99 lifted990 = new lifted99();
                lifted96 lifted960 = new lifted96();
                lifted990.e_50 = e_50;
                lifted960.e_50 = e_50;
                term = or_2_0.instance.invoke(context, term, lifted960, lifted990);
                if(term == null)
                  break Fail242;
                Success207:
                { 
                  Fail243:
                  { 
                    IStrategoTerm f_50 = null;
                    f_50 = term;
                    term = termFactory.makeTuple(f_88, cool.constNone0);
                    term = equal_0_0.instance.invoke(context, term);
                    if(term == null)
                      break Fail243;
                    term = f_50;
                    { 
                      if(e_50.value == null)
                        break Fail242;
                      term = get_type_of_0_3.instance.invoke(context, e_50.value, f_88, g_88, h_88);
                      if(term == null)
                        break Fail242;
                      term = cast_shift_type_0_0.instance.invoke(context, term);
                      if(term == null)
                        break Fail242;
                      if(true)
                        break Success207;
                    }
                  }
                  term = cast_shift_type_0_0.instance.invoke(context, f_88);
                  if(term == null)
                    break Fail242;
                }
                if(true)
                  break Success206;
              }
              term = term251;
              IStrategoTerm term253 = term;
              IStrategoConstructor cons11 = term.getTermType() == IStrategoTerm.APPL ? ((IStrategoAppl)term).getConstructor() : null;
              Success208:
              { 
                if(cons11 == transform._consAnd_2)
                { 
                  Fail244:
                  { 
                    IStrategoTerm x_49 = null;
                    IStrategoTerm y_49 = null;
                    x_49 = term.getSubterm(0);
                    y_49 = term.getSubterm(1);
                    Success209:
                    { 
                      Fail245:
                      { 
                        IStrategoTerm z_49 = null;
                        z_49 = term;
                        term = termFactory.makeTuple(f_88, cool.constNone0);
                        term = equal_0_0.instance.invoke(context, term);
                        if(term == null)
                          break Fail245;
                        term = z_49;
                        { 
                          term = termFactory.makeTuple(x_49, y_49);
                          term = try_to_get_type_0_3.instance.invoke(context, term, f_88, g_88, h_88);
                          if(term == null)
                            break Fail244;
                          term = cast_conditional_type_0_0.instance.invoke(context, term);
                          if(term == null)
                            break Fail244;
                          if(true)
                            break Success209;
                        }
                      }
                      term = cast_bounded_conditional_type_0_0.instance.invoke(context, f_88);
                      if(term == null)
                        break Fail244;
                    }
                    if(true)
                      break Success208;
                  }
                  term = term253;
                }
                Success210:
                { 
                  if(cons11 == transform._consExcOr_2)
                  { 
                    Fail246:
                    { 
                      IStrategoTerm r_49 = null;
                      IStrategoTerm s_49 = null;
                      r_49 = term.getSubterm(0);
                      s_49 = term.getSubterm(1);
                      Success211:
                      { 
                        Fail247:
                        { 
                          IStrategoTerm t_49 = null;
                          t_49 = term;
                          term = termFactory.makeTuple(f_88, cool.constNone0);
                          term = equal_0_0.instance.invoke(context, term);
                          if(term == null)
                            break Fail247;
                          term = t_49;
                          { 
                            term = termFactory.makeTuple(r_49, s_49);
                            term = try_to_get_type_0_3.instance.invoke(context, term, f_88, g_88, h_88);
                            if(term == null)
                              break Fail246;
                            term = cast_conditional_type_0_0.instance.invoke(context, term);
                            if(term == null)
                              break Fail246;
                            if(true)
                              break Success211;
                          }
                        }
                        term = cast_bounded_conditional_type_0_0.instance.invoke(context, f_88);
                        if(term == null)
                          break Fail246;
                      }
                      if(true)
                        break Success210;
                    }
                    term = term253;
                  }
                  Success212:
                  { 
                    if(cons11 == transform._consOr_2)
                    { 
                      Fail248:
                      { 
                        IStrategoTerm l_49 = null;
                        IStrategoTerm m_49 = null;
                        l_49 = term.getSubterm(0);
                        m_49 = term.getSubterm(1);
                        Success213:
                        { 
                          Fail249:
                          { 
                            IStrategoTerm n_49 = null;
                            n_49 = term;
                            term = termFactory.makeTuple(f_88, cool.constNone0);
                            term = equal_0_0.instance.invoke(context, term);
                            if(term == null)
                              break Fail249;
                            term = n_49;
                            { 
                              term = termFactory.makeTuple(l_49, m_49);
                              term = try_to_get_type_0_3.instance.invoke(context, term, f_88, g_88, h_88);
                              if(term == null)
                                break Fail248;
                              term = cast_conditional_type_0_0.instance.invoke(context, term);
                              if(term == null)
                                break Fail248;
                              if(true)
                                break Success213;
                            }
                          }
                          term = cast_bounded_conditional_type_0_0.instance.invoke(context, f_88);
                          if(term == null)
                            break Fail248;
                        }
                        if(true)
                          break Success212;
                      }
                      term = term253;
                    }
                    IStrategoTerm term259 = term;
                    Success214:
                    { 
                      Fail250:
                      { 
                        TermReference e_49 = new TermReference();
                        IStrategoTerm f_49 = null;
                        lifted103 lifted1030 = new lifted103();
                        lifted100 lifted1000 = new lifted100();
                        lifted1030.e_49 = e_49;
                        lifted1000.e_49 = e_49;
                        term = or_2_0.instance.invoke(context, term, lifted1000, lifted1030);
                        if(term == null)
                          break Fail250;
                        if(e_49.value == null)
                          break Fail250;
                        term = get_type_of_0_3.instance.invoke(context, e_49.value, f_88, g_88, h_88);
                        if(term == null)
                          break Fail250;
                        f_49 = term;
                        Success215:
                        { 
                          Fail251:
                          { 
                            IStrategoTerm g_49 = null;
                            g_49 = term;
                            term = termFactory.makeTuple(f_49, cool.constNone0);
                            term = equal_0_0.instance.invoke(context, term);
                            if(term == null)
                              break Fail251;
                            term = g_49;
                            { 
                              Success216:
                              { 
                                Fail252:
                                { 
                                  IStrategoTerm h_49 = null;
                                  h_49 = term;
                                  term = termFactory.makeTuple(f_88, cool.constNone0);
                                  term = equal_0_0.instance.invoke(context, term);
                                  if(term == null)
                                    break Fail252;
                                  term = h_49;
                                  { 
                                    term = cool.constDouble0;
                                    if(true)
                                      break Success216;
                                  }
                                }
                                term = ensure__number_0_0.instance.invoke(context, f_88);
                                if(term == null)
                                  break Fail250;
                              }
                              if(true)
                                break Success215;
                            }
                          }
                          term = ensure__number_0_0.instance.invoke(context, f_49);
                          if(term == null)
                            break Fail250;
                        }
                        if(true)
                          break Success214;
                      }
                      term = term259;
                      IStrategoTerm term262 = term;
                      IStrategoConstructor cons12 = term.getTermType() == IStrategoTerm.APPL ? ((IStrategoAppl)term).getConstructor() : null;
                      Success217:
                      { 
                        if(cons12 == transform._consExprName_1)
                        { 
                          Fail253:
                          { 
                            IStrategoTerm y_48 = null;
                            y_48 = term;
                            term = fetch_0_0.instance.invoke(context, term);
                            if(term == null)
                              break Fail253;
                            term = get_expr_type_0_3.instance.invoke(context, y_48, term, g_88, h_88);
                            if(term == null)
                              break Fail253;
                            if(true)
                              break Success217;
                          }
                          term = term262;
                        }
                        Success218:
                        { 
                          if(cons12 == transform._consExprName_2)
                          { 
                            Fail254:
                            { 
                              IStrategoTerm o_48 = null;
                              o_48 = term;
                              term = fetch_0_0.instance.invoke(context, term);
                              if(term == null)
                                break Fail254;
                              term = get_expr_type_0_3.instance.invoke(context, o_48, term, g_88, h_88);
                              if(term == null)
                                break Fail254;
                              if(true)
                                break Success218;
                            }
                            term = term262;
                          }
                          Success219:
                          { 
                            if(cons12 == transform._consLit_1)
                            { 
                              Fail255:
                              { 
                                IStrategoTerm f_48 = null;
                                f_48 = term.getSubterm(0);
                                term = f_48;
                                if(true)
                                  break Success219;
                              }
                              term = term262;
                            }
                            Success220:
                            { 
                              if(cons12 == transform._consNot_1)
                              { 
                                Fail256:
                                { 
                                  term = cool.constBoolean0;
                                  if(true)
                                    break Success220;
                                }
                                term = term262;
                              }
                              Success221:
                              { 
                                if(cons12 == transform._consLt_2)
                                { 
                                  Fail257:
                                  { 
                                    term = cool.constBoolean0;
                                    if(true)
                                      break Success221;
                                  }
                                  term = term262;
                                }
                                Success222:
                                { 
                                  if(cons12 == transform._consGt_2)
                                  { 
                                    Fail258:
                                    { 
                                      term = cool.constBoolean0;
                                      if(true)
                                        break Success222;
                                    }
                                    term = term262;
                                  }
                                  Success223:
                                  { 
                                    if(cons12 == transform._consLtEq_2)
                                    { 
                                      Fail259:
                                      { 
                                        term = cool.constBoolean0;
                                        if(true)
                                          break Success223;
                                      }
                                      term = term262;
                                    }
                                    Success224:
                                    { 
                                      if(cons12 == transform._consGtEq_2)
                                      { 
                                        Fail260:
                                        { 
                                          term = cool.constBoolean0;
                                          if(true)
                                            break Success224;
                                        }
                                        term = term262;
                                      }
                                      Success225:
                                      { 
                                        if(cons12 == transform._consEq_2)
                                        { 
                                          Fail261:
                                          { 
                                            term = cool.constBoolean0;
                                            if(true)
                                              break Success225;
                                          }
                                          term = term262;
                                        }
                                        Success226:
                                        { 
                                          if(cons12 == transform._consNotEq_2)
                                          { 
                                            Fail262:
                                            { 
                                              term = cool.constBoolean0;
                                              if(true)
                                                break Success226;
                                            }
                                            term = term262;
                                          }
                                          Success227:
                                          { 
                                            if(cons12 == transform._consLazyAnd_2)
                                            { 
                                              Fail263:
                                              { 
                                                term = cool.constBoolean0;
                                                if(true)
                                                  break Success227;
                                              }
                                              term = term262;
                                            }
                                            Success228:
                                            { 
                                              if(cons12 == transform._consLazyOr_2)
                                              { 
                                                Fail264:
                                                { 
                                                  term = cool.constBoolean0;
                                                  if(true)
                                                    break Success228;
                                                }
                                                term = term262;
                                              }
                                              Success229:
                                              { 
                                                if(cons12 == transform._consAssign_2)
                                                { 
                                                  Fail265:
                                                  { 
                                                    IStrategoTerm a_47 = null;
                                                    a_47 = term.getSubterm(0);
                                                    term = this.invoke(context, a_47, f_88, g_88, h_88);
                                                    if(term == null)
                                                      break Fail265;
                                                    if(true)
                                                      break Success229;
                                                  }
                                                  term = term262;
                                                }
                                                Success230:
                                                { 
                                                  if(cons12 == transform._consAssignMul_2)
                                                  { 
                                                    Fail266:
                                                    { 
                                                      IStrategoTerm w_46 = null;
                                                      w_46 = term.getSubterm(0);
                                                      term = this.invoke(context, w_46, f_88, g_88, h_88);
                                                      if(term == null)
                                                        break Fail266;
                                                      if(true)
                                                        break Success230;
                                                    }
                                                    term = term262;
                                                  }
                                                  Success231:
                                                  { 
                                                    if(cons12 == transform._consAssignDiv_2)
                                                    { 
                                                      Fail267:
                                                      { 
                                                        IStrategoTerm s_46 = null;
                                                        s_46 = term.getSubterm(0);
                                                        term = this.invoke(context, s_46, f_88, g_88, h_88);
                                                        if(term == null)
                                                          break Fail267;
                                                        if(true)
                                                          break Success231;
                                                      }
                                                      term = term262;
                                                    }
                                                    Success232:
                                                    { 
                                                      if(cons12 == transform._consAssignRemain_2)
                                                      { 
                                                        Fail268:
                                                        { 
                                                          IStrategoTerm o_46 = null;
                                                          o_46 = term.getSubterm(0);
                                                          term = this.invoke(context, o_46, f_88, g_88, h_88);
                                                          if(term == null)
                                                            break Fail268;
                                                          if(true)
                                                            break Success232;
                                                        }
                                                        term = term262;
                                                      }
                                                      Success233:
                                                      { 
                                                        if(cons12 == transform._consAssignPlus_2)
                                                        { 
                                                          Fail269:
                                                          { 
                                                            IStrategoTerm k_46 = null;
                                                            k_46 = term.getSubterm(0);
                                                            term = this.invoke(context, k_46, f_88, g_88, h_88);
                                                            if(term == null)
                                                              break Fail269;
                                                            if(true)
                                                              break Success233;
                                                          }
                                                          term = term262;
                                                        }
                                                        Success234:
                                                        { 
                                                          if(cons12 == transform._consAssignMinus_2)
                                                          { 
                                                            Fail270:
                                                            { 
                                                              IStrategoTerm g_46 = null;
                                                              g_46 = term.getSubterm(0);
                                                              term = this.invoke(context, g_46, f_88, g_88, h_88);
                                                              if(term == null)
                                                                break Fail270;
                                                              if(true)
                                                                break Success234;
                                                            }
                                                            term = term262;
                                                          }
                                                          Success235:
                                                          { 
                                                            if(cons12 == transform._consAssignLeftShift_2)
                                                            { 
                                                              Fail271:
                                                              { 
                                                                IStrategoTerm c_46 = null;
                                                                c_46 = term.getSubterm(0);
                                                                term = this.invoke(context, c_46, f_88, g_88, h_88);
                                                                if(term == null)
                                                                  break Fail271;
                                                                if(true)
                                                                  break Success235;
                                                              }
                                                              term = term262;
                                                            }
                                                            Success236:
                                                            { 
                                                              if(cons12 == transform._consAssignRightShift_2)
                                                              { 
                                                                Fail272:
                                                                { 
                                                                  IStrategoTerm y_45 = null;
                                                                  y_45 = term.getSubterm(0);
                                                                  term = this.invoke(context, y_45, f_88, g_88, h_88);
                                                                  if(term == null)
                                                                    break Fail272;
                                                                  if(true)
                                                                    break Success236;
                                                                }
                                                                term = term262;
                                                              }
                                                              Success237:
                                                              { 
                                                                if(cons12 == transform._consAssignURightShift_2)
                                                                { 
                                                                  Fail273:
                                                                  { 
                                                                    IStrategoTerm u_45 = null;
                                                                    u_45 = term.getSubterm(0);
                                                                    term = this.invoke(context, u_45, f_88, g_88, h_88);
                                                                    if(term == null)
                                                                      break Fail273;
                                                                    if(true)
                                                                      break Success237;
                                                                  }
                                                                  term = term262;
                                                                }
                                                                Success238:
                                                                { 
                                                                  if(cons12 == transform._consAssignAnd_2)
                                                                  { 
                                                                    Fail274:
                                                                    { 
                                                                      IStrategoTerm q_45 = null;
                                                                      q_45 = term.getSubterm(0);
                                                                      term = this.invoke(context, q_45, f_88, g_88, h_88);
                                                                      if(term == null)
                                                                        break Fail274;
                                                                      if(true)
                                                                        break Success238;
                                                                    }
                                                                    term = term262;
                                                                  }
                                                                  Success239:
                                                                  { 
                                                                    if(cons12 == transform._consAssignExcOr_2)
                                                                    { 
                                                                      Fail275:
                                                                      { 
                                                                        IStrategoTerm m_45 = null;
                                                                        m_45 = term.getSubterm(0);
                                                                        term = this.invoke(context, m_45, f_88, g_88, h_88);
                                                                        if(term == null)
                                                                          break Fail275;
                                                                        if(true)
                                                                          break Success239;
                                                                      }
                                                                      term = term262;
                                                                    }
                                                                    Success240:
                                                                    { 
                                                                      if(cons12 == transform._consAssignOr_2)
                                                                      { 
                                                                        Fail276:
                                                                        { 
                                                                          IStrategoTerm i_45 = null;
                                                                          i_45 = term.getSubterm(0);
                                                                          term = this.invoke(context, i_45, f_88, g_88, h_88);
                                                                          if(term == null)
                                                                            break Fail276;
                                                                          if(true)
                                                                            break Success240;
                                                                        }
                                                                        term = term262;
                                                                      }
                                                                      Success241:
                                                                      { 
                                                                        if(cons12 == transform._consCastPrim_2)
                                                                        { 
                                                                          Fail277:
                                                                          { 
                                                                            IStrategoTerm e_45 = null;
                                                                            e_45 = term.getSubterm(0);
                                                                            term = e_45;
                                                                            if(true)
                                                                              break Success241;
                                                                          }
                                                                          term = term262;
                                                                        }
                                                                        if(cons12 == transform._consCastRef_2)
                                                                        { 
                                                                          IStrategoTerm a_45 = null;
                                                                          a_45 = term.getSubterm(0);
                                                                          term = a_45;
                                                                        }
                                                                        else
                                                                        { 
                                                                          break Fail235;
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