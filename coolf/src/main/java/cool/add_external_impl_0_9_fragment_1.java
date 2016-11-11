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

@SuppressWarnings("all") final class add_external_impl_0_9_fragment_1 extends Strategy 
{ 
  TermReference r_26;

  TermReference s_26;

  TermReference u_26;

  TermReference t_26;

  TermReference v_26;

  TermReference w_26;

  TermReference x_26;

  TermReference y_26;

  TermReference z_26;

  TermReference a_27;

  TermReference b_27;

  TermReference c_27;

  TermReference d_27;

  TermReference e_27;

  TermReference i_27;

  TermReference g_27;

  TermReference f_27;

  TermReference b_26;

  TermReference c_26;

  TermReference d_26;

  TermReference e_26;

  TermReference f_26;

  TermReference g_26;

  TermReference h_26;

  TermReference i_26;

  TermReference j_26;

  TermReference h_27;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    Fail418:
    { 
      IStrategoTerm term137 = term;
      Success270:
      { 
        Fail419:
        { 
          IStrategoTerm z_27 = null;
          z_27 = term;
          if(i_27.value == null)
            break Fail419;
          term = i_27.value;
          if(term.getTermType() != IStrategoTerm.APPL || transform._consRightShift_2 != ((IStrategoAppl)term).getConstructor())
            break Fail419;
          if(x_26.value == null)
            x_26.value = term.getSubterm(0);
          else
            if(x_26.value != term.getSubterm(0) && !x_26.value.match(term.getSubterm(0)))
              break Fail419;
          if(y_26.value == null)
            y_26.value = term.getSubterm(1);
          else
            if(y_26.value != term.getSubterm(1) && !y_26.value.match(term.getSubterm(1)))
              break Fail419;
          term = z_27;
          { 
            IStrategoTerm v_30 = null;
            IStrategoTerm x_30 = null;
            IStrategoTerm a_31 = null;
            IStrategoTerm term138 = term;
            Success271:
            { 
              Fail420:
              { 
                IStrategoTerm a_28 = null;
                a_28 = term;
                if(h_26.value == null)
                  break Fail420;
                term = termFactory.makeTuple(h_26.value, cool.constNone0);
                term = equal_0_0.instance.invoke(context, term);
                if(term == null)
                  break Fail420;
                term = a_28;
                { 
                  if(x_26.value == null)
                    break Fail418;
                  term = get_type_of_0_3.instance.invoke(context, x_26.value, h_26.value, b_26.value, c_26.value);
                  if(term == null)
                    break Fail418;
                  term = cast_shift_type_0_0.instance.invoke(context, term);
                  if(term == null)
                    break Fail418;
                  if(s_26.value == null)
                    s_26.value = term;
                  else
                    if(s_26.value != term && !s_26.value.match(term))
                      break Fail418;
                  if(true)
                    break Success271;
                }
              }
              term = term138;
              if(h_26.value == null)
                break Fail418;
              term = cast_shift_type_0_0.instance.invoke(context, h_26.value);
              if(term == null)
                break Fail418;
              if(s_26.value == null)
                s_26.value = term;
              else
                if(s_26.value != term && !s_26.value.match(term))
                  break Fail418;
            }
            x_30 = term;
            if(x_26.value == null)
              break Fail418;
            term = add_external_impl_0_9.instance.invokeDynamic(context, x_26.value, NO_STRATEGIES, new IStrategoTerm[]{b_26.value, c_26.value, d_26.value, e_26.value, f_26.value, g_26.value, s_26.value, i_26.value, j_26.value});
            if(term == null)
              break Fail418;
            v_30 = term;
            term = x_30;
            if(y_26.value == null)
              break Fail418;
            a_31 = y_26.value;
            term = add_external_impl_0_9.instance.invokeDynamic(context, a_31, NO_STRATEGIES, new IStrategoTerm[]{b_26.value, c_26.value, d_26.value, e_26.value, f_26.value, g_26.value, cool.constLong0, i_26.value, j_26.value});
            if(term == null)
              break Fail418;
            term = termFactory.makeAppl(transform._consRightShift_2, new IStrategoTerm[]{v_30, term});
            if(true)
              break Success270;
          }
        }
        term = term137;
        IStrategoTerm term139 = term;
        Success272:
        { 
          Fail421:
          { 
            IStrategoTerm b_28 = null;
            b_28 = term;
            if(i_27.value == null)
              break Fail421;
            term = i_27.value;
            if(term.getTermType() != IStrategoTerm.APPL || transform._consURightShift_2 != ((IStrategoAppl)term).getConstructor())
              break Fail421;
            if(x_26.value == null)
              x_26.value = term.getSubterm(0);
            else
              if(x_26.value != term.getSubterm(0) && !x_26.value.match(term.getSubterm(0)))
                break Fail421;
            if(y_26.value == null)
              y_26.value = term.getSubterm(1);
            else
              if(y_26.value != term.getSubterm(1) && !y_26.value.match(term.getSubterm(1)))
                break Fail421;
            term = b_28;
            { 
              IStrategoTerm b_31 = null;
              IStrategoTerm d_31 = null;
              IStrategoTerm g_31 = null;
              IStrategoTerm term140 = term;
              Success273:
              { 
                Fail422:
                { 
                  IStrategoTerm c_28 = null;
                  c_28 = term;
                  if(h_26.value == null)
                    break Fail422;
                  term = termFactory.makeTuple(h_26.value, cool.constNone0);
                  term = equal_0_0.instance.invoke(context, term);
                  if(term == null)
                    break Fail422;
                  term = c_28;
                  { 
                    if(x_26.value == null)
                      break Fail418;
                    term = get_type_of_0_3.instance.invoke(context, x_26.value, h_26.value, b_26.value, c_26.value);
                    if(term == null)
                      break Fail418;
                    term = cast_shift_type_0_0.instance.invoke(context, term);
                    if(term == null)
                      break Fail418;
                    if(s_26.value == null)
                      s_26.value = term;
                    else
                      if(s_26.value != term && !s_26.value.match(term))
                        break Fail418;
                    if(true)
                      break Success273;
                  }
                }
                term = term140;
                if(h_26.value == null)
                  break Fail418;
                term = cast_shift_type_0_0.instance.invoke(context, h_26.value);
                if(term == null)
                  break Fail418;
                if(s_26.value == null)
                  s_26.value = term;
                else
                  if(s_26.value != term && !s_26.value.match(term))
                    break Fail418;
              }
              d_31 = term;
              if(x_26.value == null)
                break Fail418;
              term = add_external_impl_0_9.instance.invokeDynamic(context, x_26.value, NO_STRATEGIES, new IStrategoTerm[]{b_26.value, c_26.value, d_26.value, e_26.value, f_26.value, g_26.value, s_26.value, i_26.value, j_26.value});
              if(term == null)
                break Fail418;
              b_31 = term;
              term = d_31;
              if(y_26.value == null)
                break Fail418;
              g_31 = y_26.value;
              term = add_external_impl_0_9.instance.invokeDynamic(context, g_31, NO_STRATEGIES, new IStrategoTerm[]{b_26.value, c_26.value, d_26.value, e_26.value, f_26.value, g_26.value, cool.constLong0, i_26.value, j_26.value});
              if(term == null)
                break Fail418;
              term = termFactory.makeAppl(transform._consURightShift_2, new IStrategoTerm[]{b_31, term});
              if(true)
                break Success272;
            }
          }
          term = term139;
          IStrategoTerm term141 = term;
          Success274:
          { 
            Fail423:
            { 
              IStrategoTerm d_28 = null;
              d_28 = term;
              if(i_27.value == null)
                break Fail423;
              term = i_27.value;
              if(term.getTermType() != IStrategoTerm.APPL || transform._consPreIncr_1 != ((IStrategoAppl)term).getConstructor())
                break Fail423;
              if(g_27.value == null)
                g_27.value = term.getSubterm(0);
              else
                if(g_27.value != term.getSubterm(0) && !g_27.value.match(term.getSubterm(0)))
                  break Fail423;
              term = d_28;
              { 
                if(g_27.value == null)
                  break Fail418;
                term = get_type_of_0_3.instance.invoke(context, g_27.value, h_26.value, b_26.value, c_26.value);
                if(term == null)
                  break Fail418;
                if(r_26.value == null)
                  r_26.value = term;
                else
                  if(r_26.value != term && !r_26.value.match(term))
                    break Fail418;
                IStrategoTerm term142 = term;
                Success275:
                { 
                  Fail424:
                  { 
                    IStrategoTerm e_28 = null;
                    e_28 = term;
                    if(r_26.value == null)
                      break Fail424;
                    term = termFactory.makeTuple(r_26.value, cool.constNone0);
                    term = equal_0_0.instance.invoke(context, term);
                    if(term == null)
                      break Fail424;
                    term = e_28;
                    { 
                      IStrategoTerm term143 = term;
                      Success276:
                      { 
                        Fail425:
                        { 
                          IStrategoTerm f_28 = null;
                          f_28 = term;
                          if(h_26.value == null)
                            break Fail425;
                          term = termFactory.makeTuple(h_26.value, cool.constNone0);
                          term = equal_0_0.instance.invoke(context, term);
                          if(term == null)
                            break Fail425;
                          term = f_28;
                          { 
                            term = cool.constDouble0;
                            if(s_26.value == null)
                              s_26.value = term;
                            else
                              if(s_26.value != term && !s_26.value.match(term))
                                break Fail418;
                            if(true)
                              break Success276;
                          }
                        }
                        term = term143;
                        if(h_26.value == null)
                          break Fail418;
                        term = ensure__number_0_0.instance.invoke(context, h_26.value);
                        if(term == null)
                          break Fail418;
                        if(s_26.value == null)
                          s_26.value = term;
                        else
                          if(s_26.value != term && !s_26.value.match(term))
                            break Fail418;
                      }
                      if(true)
                        break Success275;
                    }
                  }
                  term = term142;
                  if(r_26.value == null)
                    break Fail418;
                  term = ensure__number_0_0.instance.invoke(context, r_26.value);
                  if(term == null)
                    break Fail418;
                  if(s_26.value == null)
                    s_26.value = term;
                  else
                    if(s_26.value != term && !s_26.value.match(term))
                      break Fail418;
                }
                if(g_27.value == null)
                  break Fail418;
                term = add_external_impl_0_9.instance.invokeDynamic(context, g_27.value, NO_STRATEGIES, new IStrategoTerm[]{b_26.value, c_26.value, d_26.value, e_26.value, f_26.value, g_26.value, s_26.value, i_26.value, j_26.value});
                if(term == null)
                  break Fail418;
                term = termFactory.makeAppl(transform._consPreIncr_1, new IStrategoTerm[]{term});
                if(true)
                  break Success274;
              }
            }
            term = term141;
            IStrategoTerm term144 = term;
            Success277:
            { 
              Fail426:
              { 
                IStrategoTerm g_28 = null;
                g_28 = term;
                if(i_27.value == null)
                  break Fail426;
                term = i_27.value;
                if(term.getTermType() != IStrategoTerm.APPL || transform._consPostIncr_1 != ((IStrategoAppl)term).getConstructor())
                  break Fail426;
                if(g_27.value == null)
                  g_27.value = term.getSubterm(0);
                else
                  if(g_27.value != term.getSubterm(0) && !g_27.value.match(term.getSubterm(0)))
                    break Fail426;
                term = g_28;
                { 
                  if(g_27.value == null)
                    break Fail418;
                  term = get_type_of_0_3.instance.invoke(context, g_27.value, h_26.value, b_26.value, c_26.value);
                  if(term == null)
                    break Fail418;
                  if(r_26.value == null)
                    r_26.value = term;
                  else
                    if(r_26.value != term && !r_26.value.match(term))
                      break Fail418;
                  IStrategoTerm term145 = term;
                  Success278:
                  { 
                    Fail427:
                    { 
                      IStrategoTerm h_28 = null;
                      h_28 = term;
                      if(r_26.value == null)
                        break Fail427;
                      term = termFactory.makeTuple(r_26.value, cool.constNone0);
                      term = equal_0_0.instance.invoke(context, term);
                      if(term == null)
                        break Fail427;
                      term = h_28;
                      { 
                        IStrategoTerm term146 = term;
                        Success279:
                        { 
                          Fail428:
                          { 
                            IStrategoTerm i_28 = null;
                            i_28 = term;
                            if(h_26.value == null)
                              break Fail428;
                            term = termFactory.makeTuple(h_26.value, cool.constNone0);
                            term = equal_0_0.instance.invoke(context, term);
                            if(term == null)
                              break Fail428;
                            term = i_28;
                            { 
                              term = cool.constDouble0;
                              if(s_26.value == null)
                                s_26.value = term;
                              else
                                if(s_26.value != term && !s_26.value.match(term))
                                  break Fail418;
                              if(true)
                                break Success279;
                            }
                          }
                          term = term146;
                          if(h_26.value == null)
                            break Fail418;
                          term = ensure__number_0_0.instance.invoke(context, h_26.value);
                          if(term == null)
                            break Fail418;
                          if(s_26.value == null)
                            s_26.value = term;
                          else
                            if(s_26.value != term && !s_26.value.match(term))
                              break Fail418;
                        }
                        if(true)
                          break Success278;
                      }
                    }
                    term = term145;
                    if(r_26.value == null)
                      break Fail418;
                    term = ensure__number_0_0.instance.invoke(context, r_26.value);
                    if(term == null)
                      break Fail418;
                    if(s_26.value == null)
                      s_26.value = term;
                    else
                      if(s_26.value != term && !s_26.value.match(term))
                        break Fail418;
                  }
                  if(g_27.value == null)
                    break Fail418;
                  term = add_external_impl_0_9.instance.invokeDynamic(context, g_27.value, NO_STRATEGIES, new IStrategoTerm[]{b_26.value, c_26.value, d_26.value, e_26.value, f_26.value, g_26.value, s_26.value, i_26.value, j_26.value});
                  if(term == null)
                    break Fail418;
                  term = termFactory.makeAppl(transform._consPostIncr_1, new IStrategoTerm[]{term});
                  if(true)
                    break Success277;
                }
              }
              term = term144;
              IStrategoTerm term147 = term;
              Success280:
              { 
                Fail429:
                { 
                  IStrategoTerm j_28 = null;
                  j_28 = term;
                  if(i_27.value == null)
                    break Fail429;
                  term = i_27.value;
                  if(term.getTermType() != IStrategoTerm.APPL || transform._consPreDecr_1 != ((IStrategoAppl)term).getConstructor())
                    break Fail429;
                  if(g_27.value == null)
                    g_27.value = term.getSubterm(0);
                  else
                    if(g_27.value != term.getSubterm(0) && !g_27.value.match(term.getSubterm(0)))
                      break Fail429;
                  term = j_28;
                  { 
                    if(g_27.value == null)
                      break Fail418;
                    term = get_type_of_0_3.instance.invoke(context, g_27.value, h_26.value, b_26.value, c_26.value);
                    if(term == null)
                      break Fail418;
                    if(r_26.value == null)
                      r_26.value = term;
                    else
                      if(r_26.value != term && !r_26.value.match(term))
                        break Fail418;
                    IStrategoTerm term148 = term;
                    Success281:
                    { 
                      Fail430:
                      { 
                        IStrategoTerm k_28 = null;
                        k_28 = term;
                        if(r_26.value == null)
                          break Fail430;
                        term = termFactory.makeTuple(r_26.value, cool.constNone0);
                        term = equal_0_0.instance.invoke(context, term);
                        if(term == null)
                          break Fail430;
                        term = k_28;
                        { 
                          IStrategoTerm term149 = term;
                          Success282:
                          { 
                            Fail431:
                            { 
                              IStrategoTerm l_28 = null;
                              l_28 = term;
                              if(h_26.value == null)
                                break Fail431;
                              term = termFactory.makeTuple(h_26.value, cool.constNone0);
                              term = equal_0_0.instance.invoke(context, term);
                              if(term == null)
                                break Fail431;
                              term = l_28;
                              { 
                                term = cool.constDouble0;
                                if(s_26.value == null)
                                  s_26.value = term;
                                else
                                  if(s_26.value != term && !s_26.value.match(term))
                                    break Fail418;
                                if(true)
                                  break Success282;
                              }
                            }
                            term = term149;
                            if(h_26.value == null)
                              break Fail418;
                            term = ensure__number_0_0.instance.invoke(context, h_26.value);
                            if(term == null)
                              break Fail418;
                            if(s_26.value == null)
                              s_26.value = term;
                            else
                              if(s_26.value != term && !s_26.value.match(term))
                                break Fail418;
                          }
                          if(true)
                            break Success281;
                        }
                      }
                      term = term148;
                      if(r_26.value == null)
                        break Fail418;
                      term = ensure__number_0_0.instance.invoke(context, r_26.value);
                      if(term == null)
                        break Fail418;
                      if(s_26.value == null)
                        s_26.value = term;
                      else
                        if(s_26.value != term && !s_26.value.match(term))
                          break Fail418;
                    }
                    if(g_27.value == null)
                      break Fail418;
                    term = add_external_impl_0_9.instance.invokeDynamic(context, g_27.value, NO_STRATEGIES, new IStrategoTerm[]{b_26.value, c_26.value, d_26.value, e_26.value, f_26.value, g_26.value, s_26.value, i_26.value, j_26.value});
                    if(term == null)
                      break Fail418;
                    term = termFactory.makeAppl(transform._consPreDecr_1, new IStrategoTerm[]{term});
                    if(true)
                      break Success280;
                  }
                }
                term = term147;
                IStrategoTerm term150 = term;
                Success283:
                { 
                  Fail432:
                  { 
                    IStrategoTerm m_28 = null;
                    m_28 = term;
                    if(i_27.value == null)
                      break Fail432;
                    term = i_27.value;
                    if(term.getTermType() != IStrategoTerm.APPL || transform._consPostDecr_1 != ((IStrategoAppl)term).getConstructor())
                      break Fail432;
                    if(g_27.value == null)
                      g_27.value = term.getSubterm(0);
                    else
                      if(g_27.value != term.getSubterm(0) && !g_27.value.match(term.getSubterm(0)))
                        break Fail432;
                    term = m_28;
                    { 
                      if(g_27.value == null)
                        break Fail418;
                      term = get_type_of_0_3.instance.invoke(context, g_27.value, h_26.value, b_26.value, c_26.value);
                      if(term == null)
                        break Fail418;
                      if(r_26.value == null)
                        r_26.value = term;
                      else
                        if(r_26.value != term && !r_26.value.match(term))
                          break Fail418;
                      IStrategoTerm term151 = term;
                      Success284:
                      { 
                        Fail433:
                        { 
                          IStrategoTerm n_28 = null;
                          n_28 = term;
                          if(r_26.value == null)
                            break Fail433;
                          term = termFactory.makeTuple(r_26.value, cool.constNone0);
                          term = equal_0_0.instance.invoke(context, term);
                          if(term == null)
                            break Fail433;
                          term = n_28;
                          { 
                            IStrategoTerm term152 = term;
                            Success285:
                            { 
                              Fail434:
                              { 
                                IStrategoTerm o_28 = null;
                                o_28 = term;
                                if(h_26.value == null)
                                  break Fail434;
                                term = termFactory.makeTuple(h_26.value, cool.constNone0);
                                term = equal_0_0.instance.invoke(context, term);
                                if(term == null)
                                  break Fail434;
                                term = o_28;
                                { 
                                  term = cool.constDouble0;
                                  if(s_26.value == null)
                                    s_26.value = term;
                                  else
                                    if(s_26.value != term && !s_26.value.match(term))
                                      break Fail418;
                                  if(true)
                                    break Success285;
                                }
                              }
                              term = term152;
                              if(h_26.value == null)
                                break Fail418;
                              term = ensure__number_0_0.instance.invoke(context, h_26.value);
                              if(term == null)
                                break Fail418;
                              if(s_26.value == null)
                                s_26.value = term;
                              else
                                if(s_26.value != term && !s_26.value.match(term))
                                  break Fail418;
                            }
                            if(true)
                              break Success284;
                          }
                        }
                        term = term151;
                        if(r_26.value == null)
                          break Fail418;
                        term = ensure__number_0_0.instance.invoke(context, r_26.value);
                        if(term == null)
                          break Fail418;
                        if(s_26.value == null)
                          s_26.value = term;
                        else
                          if(s_26.value != term && !s_26.value.match(term))
                            break Fail418;
                      }
                      if(g_27.value == null)
                        break Fail418;
                      term = add_external_impl_0_9.instance.invokeDynamic(context, g_27.value, NO_STRATEGIES, new IStrategoTerm[]{b_26.value, c_26.value, d_26.value, e_26.value, f_26.value, g_26.value, s_26.value, i_26.value, j_26.value});
                      if(term == null)
                        break Fail418;
                      term = termFactory.makeAppl(transform._consPostDecr_1, new IStrategoTerm[]{term});
                      if(true)
                        break Success283;
                    }
                  }
                  term = term150;
                  IStrategoTerm term153 = term;
                  Success286:
                  { 
                    Fail435:
                    { 
                      IStrategoTerm p_28 = null;
                      p_28 = term;
                      if(i_27.value == null)
                        break Fail435;
                      term = i_27.value;
                      if(term.getTermType() != IStrategoTerm.APPL || transform._consNot_1 != ((IStrategoAppl)term).getConstructor())
                        break Fail435;
                      term = p_28;
                      { 
                        if(h_27.value == null)
                          break Fail418;
                        term = h_27.value;
                        lifted44 lifted440 = new lifted44();
                        lifted440.b_26 = b_26;
                        lifted440.c_26 = c_26;
                        lifted440.d_26 = d_26;
                        lifted440.e_26 = e_26;
                        lifted440.f_26 = f_26;
                        lifted440.g_26 = g_26;
                        lifted440.i_26 = i_26;
                        lifted440.j_26 = j_26;
                        term = SRTS_all.instance.invoke(context, term, lifted440);
                        if(term == null)
                          break Fail418;
                        if(true)
                          break Success286;
                      }
                    }
                    term = term153;
                    IStrategoTerm term154 = term;
                    Success287:
                    { 
                      Fail436:
                      { 
                        IStrategoTerm q_28 = null;
                        q_28 = term;
                        if(i_27.value == null)
                          break Fail436;
                        term = or_2_0.instance.invoke(context, i_27.value, lifted45.instance, lifted48.instance);
                        if(term == null)
                          break Fail436;
                        term = q_28;
                        { 
                          if(h_27.value == null)
                            break Fail418;
                          term = h_27.value;
                          lifted49 lifted490 = new lifted49();
                          lifted490.h_27 = h_27;
                          lifted490.h_26 = h_26;
                          lifted490.b_26 = b_26;
                          lifted490.c_26 = c_26;
                          lifted490.d_26 = d_26;
                          lifted490.e_26 = e_26;
                          lifted490.f_26 = f_26;
                          lifted490.g_26 = g_26;
                          lifted490.i_26 = i_26;
                          lifted490.j_26 = j_26;
                          term = SRTS_all.instance.invoke(context, term, lifted490);
                          if(term == null)
                            break Fail418;
                          if(true)
                            break Success287;
                        }
                      }
                      term = term154;
                      IStrategoTerm term155 = term;
                      Success288:
                      { 
                        Fail437:
                        { 
                          IStrategoTerm r_28 = null;
                          r_28 = term;
                          if(i_27.value == null)
                            break Fail437;
                          term = i_27.value;
                          if(term.getTermType() != IStrategoTerm.APPL || transform._consAssign_2 != ((IStrategoAppl)term).getConstructor())
                            break Fail437;
                          if(t_26.value == null)
                            t_26.value = term.getSubterm(0);
                          else
                            if(t_26.value != term.getSubterm(0) && !t_26.value.match(term.getSubterm(0)))
                              break Fail437;
                          if(g_27.value == null)
                            g_27.value = term.getSubterm(1);
                          else
                            if(g_27.value != term.getSubterm(1) && !g_27.value.match(term.getSubterm(1)))
                              break Fail437;
                          term = r_28;
                          { 
                            IStrategoTerm t_31 = null;
                            IStrategoTerm u_31 = null;
                            if(t_26.value == null)
                              break Fail418;
                            term = get_$L$H$S_type_0_3.instance.invoke(context, t_26.value, h_26.value, b_26.value, c_26.value);
                            if(term == null)
                              break Fail418;
                            if(u_26.value == null)
                              u_26.value = term;
                            else
                              if(u_26.value != term && !u_26.value.match(term))
                                break Fail418;
                            u_31 = term;
                            if(g_27.value == null)
                              break Fail418;
                            term = add_external_impl_0_9.instance.invokeDynamic(context, g_27.value, NO_STRATEGIES, new IStrategoTerm[]{b_26.value, c_26.value, d_26.value, e_26.value, f_26.value, g_26.value, u_26.value, i_26.value, j_26.value});
                            if(term == null)
                              break Fail418;
                            t_31 = term;
                            term = u_31;
                            if(t_26.value == null)
                              break Fail418;
                            term = termFactory.makeAppl(transform._consAssign_2, new IStrategoTerm[]{t_26.value, t_31});
                            if(true)
                              break Success288;
                          }
                        }
                        term = term155;
                        IStrategoTerm term156 = term;
                        Success289:
                        { 
                          Fail438:
                          { 
                            IStrategoTerm s_28 = null;
                            s_28 = term;
                            if(i_27.value == null)
                              break Fail438;
                            term = i_27.value;
                            if(term.getTermType() != IStrategoTerm.APPL || transform._consAssignMul_2 != ((IStrategoAppl)term).getConstructor())
                              break Fail438;
                            if(t_26.value == null)
                              t_26.value = term.getSubterm(0);
                            else
                              if(t_26.value != term.getSubterm(0) && !t_26.value.match(term.getSubterm(0)))
                                break Fail438;
                            if(g_27.value == null)
                              g_27.value = term.getSubterm(1);
                            else
                              if(g_27.value != term.getSubterm(1) && !g_27.value.match(term.getSubterm(1)))
                                break Fail438;
                            term = s_28;
                            { 
                              IStrategoTerm v_31 = null;
                              IStrategoTerm w_31 = null;
                              IStrategoTerm y_31 = null;
                              if(t_26.value == null)
                                break Fail418;
                              term = get_$L$H$S_type_0_3.instance.invoke(context, t_26.value, h_26.value, b_26.value, c_26.value);
                              if(term == null)
                                break Fail418;
                              w_31 = term;
                              if(g_27.value == null)
                                break Fail418;
                              y_31 = g_27.value;
                              term = add_external_impl_0_9.instance.invokeDynamic(context, y_31, NO_STRATEGIES, new IStrategoTerm[]{b_26.value, c_26.value, d_26.value, e_26.value, f_26.value, g_26.value, cool.constDouble0, i_26.value, j_26.value});
                              if(term == null)
                                break Fail418;
                              v_31 = term;
                              term = w_31;
                              if(t_26.value == null)
                                break Fail418;
                              term = termFactory.makeAppl(transform._consAssignMul_2, new IStrategoTerm[]{t_26.value, v_31});
                              if(true)
                                break Success289;
                            }
                          }
                          term = term156;
                          IStrategoTerm term157 = term;
                          Success290:
                          { 
                            Fail439:
                            { 
                              IStrategoTerm t_28 = null;
                              t_28 = term;
                              if(i_27.value == null)
                                break Fail439;
                              term = i_27.value;
                              if(term.getTermType() != IStrategoTerm.APPL || transform._consAssignDiv_2 != ((IStrategoAppl)term).getConstructor())
                                break Fail439;
                              if(t_26.value == null)
                                t_26.value = term.getSubterm(0);
                              else
                                if(t_26.value != term.getSubterm(0) && !t_26.value.match(term.getSubterm(0)))
                                  break Fail439;
                              if(g_27.value == null)
                                g_27.value = term.getSubterm(1);
                              else
                                if(g_27.value != term.getSubterm(1) && !g_27.value.match(term.getSubterm(1)))
                                  break Fail439;
                              term = t_28;
                              { 
                                IStrategoTerm z_31 = null;
                                IStrategoTerm a_32 = null;
                                IStrategoTerm c_32 = null;
                                if(t_26.value == null)
                                  break Fail418;
                                term = get_$L$H$S_type_0_3.instance.invoke(context, t_26.value, h_26.value, b_26.value, c_26.value);
                                if(term == null)
                                  break Fail418;
                                a_32 = term;
                                if(g_27.value == null)
                                  break Fail418;
                                c_32 = g_27.value;
                                term = add_external_impl_0_9.instance.invokeDynamic(context, c_32, NO_STRATEGIES, new IStrategoTerm[]{b_26.value, c_26.value, d_26.value, e_26.value, f_26.value, g_26.value, cool.constDouble0, i_26.value, j_26.value});
                                if(term == null)
                                  break Fail418;
                                z_31 = term;
                                term = a_32;
                                if(t_26.value == null)
                                  break Fail418;
                                term = termFactory.makeAppl(transform._consAssignDiv_2, new IStrategoTerm[]{t_26.value, z_31});
                                if(true)
                                  break Success290;
                              }
                            }
                            term = term157;
                            IStrategoTerm term158 = term;
                            Success291:
                            { 
                              Fail440:
                              { 
                                IStrategoTerm u_28 = null;
                                u_28 = term;
                                if(i_27.value == null)
                                  break Fail440;
                                term = i_27.value;
                                if(term.getTermType() != IStrategoTerm.APPL || transform._consAssignRemain_2 != ((IStrategoAppl)term).getConstructor())
                                  break Fail440;
                                if(t_26.value == null)
                                  t_26.value = term.getSubterm(0);
                                else
                                  if(t_26.value != term.getSubterm(0) && !t_26.value.match(term.getSubterm(0)))
                                    break Fail440;
                                if(g_27.value == null)
                                  g_27.value = term.getSubterm(1);
                                else
                                  if(g_27.value != term.getSubterm(1) && !g_27.value.match(term.getSubterm(1)))
                                    break Fail440;
                                term = u_28;
                                { 
                                  IStrategoTerm d_32 = null;
                                  IStrategoTerm e_32 = null;
                                  IStrategoTerm g_32 = null;
                                  if(t_26.value == null)
                                    break Fail418;
                                  term = get_$L$H$S_type_0_3.instance.invoke(context, t_26.value, h_26.value, b_26.value, c_26.value);
                                  if(term == null)
                                    break Fail418;
                                  e_32 = term;
                                  if(g_27.value == null)
                                    break Fail418;
                                  g_32 = g_27.value;
                                  term = add_external_impl_0_9.instance.invokeDynamic(context, g_32, NO_STRATEGIES, new IStrategoTerm[]{b_26.value, c_26.value, d_26.value, e_26.value, f_26.value, g_26.value, cool.constDouble0, i_26.value, j_26.value});
                                  if(term == null)
                                    break Fail418;
                                  d_32 = term;
                                  term = e_32;
                                  if(t_26.value == null)
                                    break Fail418;
                                  term = termFactory.makeAppl(transform._consAssignRemain_2, new IStrategoTerm[]{t_26.value, d_32});
                                  if(true)
                                    break Success291;
                                }
                              }
                              term = term158;
                              IStrategoTerm term159 = term;
                              Success292:
                              { 
                                Fail441:
                                { 
                                  IStrategoTerm v_28 = null;
                                  v_28 = term;
                                  if(i_27.value == null)
                                    break Fail441;
                                  term = i_27.value;
                                  if(term.getTermType() != IStrategoTerm.APPL || transform._consAssignPlus_2 != ((IStrategoAppl)term).getConstructor())
                                    break Fail441;
                                  if(t_26.value == null)
                                    t_26.value = term.getSubterm(0);
                                  else
                                    if(t_26.value != term.getSubterm(0) && !t_26.value.match(term.getSubterm(0)))
                                      break Fail441;
                                  if(g_27.value == null)
                                    g_27.value = term.getSubterm(1);
                                  else
                                    if(g_27.value != term.getSubterm(1) && !g_27.value.match(term.getSubterm(1)))
                                      break Fail441;
                                  term = v_28;
                                  { 
                                    IStrategoTerm h_32 = null;
                                    IStrategoTerm i_32 = null;
                                    IStrategoTerm k_32 = null;
                                    if(t_26.value == null)
                                      break Fail418;
                                    term = get_$L$H$S_type_0_3.instance.invoke(context, t_26.value, h_26.value, b_26.value, c_26.value);
                                    if(term == null)
                                      break Fail418;
                                    i_32 = term;
                                    if(g_27.value == null)
                                      break Fail418;
                                    k_32 = g_27.value;
                                    term = add_external_impl_0_9.instance.invokeDynamic(context, k_32, NO_STRATEGIES, new IStrategoTerm[]{b_26.value, c_26.value, d_26.value, e_26.value, f_26.value, g_26.value, cool.constDouble0, i_26.value, j_26.value});
                                    if(term == null)
                                      break Fail418;
                                    h_32 = term;
                                    term = i_32;
                                    if(t_26.value == null)
                                      break Fail418;
                                    term = termFactory.makeAppl(transform._consAssignPlus_2, new IStrategoTerm[]{t_26.value, h_32});
                                    if(true)
                                      break Success292;
                                  }
                                }
                                term = term159;
                                IStrategoTerm term160 = term;
                                Success293:
                                { 
                                  Fail442:
                                  { 
                                    IStrategoTerm w_28 = null;
                                    w_28 = term;
                                    if(i_27.value == null)
                                      break Fail442;
                                    term = i_27.value;
                                    if(term.getTermType() != IStrategoTerm.APPL || transform._consAssignMinus_2 != ((IStrategoAppl)term).getConstructor())
                                      break Fail442;
                                    if(t_26.value == null)
                                      t_26.value = term.getSubterm(0);
                                    else
                                      if(t_26.value != term.getSubterm(0) && !t_26.value.match(term.getSubterm(0)))
                                        break Fail442;
                                    if(g_27.value == null)
                                      g_27.value = term.getSubterm(1);
                                    else
                                      if(g_27.value != term.getSubterm(1) && !g_27.value.match(term.getSubterm(1)))
                                        break Fail442;
                                    term = w_28;
                                    { 
                                      IStrategoTerm l_32 = null;
                                      IStrategoTerm m_32 = null;
                                      IStrategoTerm o_32 = null;
                                      if(t_26.value == null)
                                        break Fail418;
                                      term = get_$L$H$S_type_0_3.instance.invoke(context, t_26.value, h_26.value, b_26.value, c_26.value);
                                      if(term == null)
                                        break Fail418;
                                      m_32 = term;
                                      if(g_27.value == null)
                                        break Fail418;
                                      o_32 = g_27.value;
                                      term = add_external_impl_0_9.instance.invokeDynamic(context, o_32, NO_STRATEGIES, new IStrategoTerm[]{b_26.value, c_26.value, d_26.value, e_26.value, f_26.value, g_26.value, cool.constDouble0, i_26.value, j_26.value});
                                      if(term == null)
                                        break Fail418;
                                      l_32 = term;
                                      term = m_32;
                                      if(t_26.value == null)
                                        break Fail418;
                                      term = termFactory.makeAppl(transform._consAssignMinus_2, new IStrategoTerm[]{t_26.value, l_32});
                                      if(true)
                                        break Success293;
                                    }
                                  }
                                  term = term160;
                                  IStrategoTerm term161 = term;
                                  Success294:
                                  { 
                                    Fail443:
                                    { 
                                      IStrategoTerm x_28 = null;
                                      x_28 = term;
                                      if(i_27.value == null)
                                        break Fail443;
                                      term = i_27.value;
                                      if(term.getTermType() != IStrategoTerm.APPL || transform._consAssignLeftShift_2 != ((IStrategoAppl)term).getConstructor())
                                        break Fail443;
                                      if(t_26.value == null)
                                        t_26.value = term.getSubterm(0);
                                      else
                                        if(t_26.value != term.getSubterm(0) && !t_26.value.match(term.getSubterm(0)))
                                          break Fail443;
                                      if(g_27.value == null)
                                        g_27.value = term.getSubterm(1);
                                      else
                                        if(g_27.value != term.getSubterm(1) && !g_27.value.match(term.getSubterm(1)))
                                          break Fail443;
                                      term = x_28;
                                      { 
                                        IStrategoTerm p_32 = null;
                                        IStrategoTerm q_32 = null;
                                        IStrategoTerm s_32 = null;
                                        if(t_26.value == null)
                                          break Fail418;
                                        term = get_$L$H$S_type_0_3.instance.invoke(context, t_26.value, h_26.value, b_26.value, c_26.value);
                                        if(term == null)
                                          break Fail418;
                                        q_32 = term;
                                        if(g_27.value == null)
                                          break Fail418;
                                        s_32 = g_27.value;
                                        term = add_external_impl_0_9.instance.invokeDynamic(context, s_32, NO_STRATEGIES, new IStrategoTerm[]{b_26.value, c_26.value, d_26.value, e_26.value, f_26.value, g_26.value, cool.constLong0, i_26.value, j_26.value});
                                        if(term == null)
                                          break Fail418;
                                        p_32 = term;
                                        term = q_32;
                                        if(t_26.value == null)
                                          break Fail418;
                                        term = termFactory.makeAppl(transform._consAssignLeftShift_2, new IStrategoTerm[]{t_26.value, p_32});
                                        if(true)
                                          break Success294;
                                      }
                                    }
                                    term = term161;
                                    IStrategoTerm term162 = term;
                                    Success295:
                                    { 
                                      Fail444:
                                      { 
                                        IStrategoTerm y_28 = null;
                                        y_28 = term;
                                        if(i_27.value == null)
                                          break Fail444;
                                        term = i_27.value;
                                        if(term.getTermType() != IStrategoTerm.APPL || transform._consAssignRightShift_2 != ((IStrategoAppl)term).getConstructor())
                                          break Fail444;
                                        if(t_26.value == null)
                                          t_26.value = term.getSubterm(0);
                                        else
                                          if(t_26.value != term.getSubterm(0) && !t_26.value.match(term.getSubterm(0)))
                                            break Fail444;
                                        if(g_27.value == null)
                                          g_27.value = term.getSubterm(1);
                                        else
                                          if(g_27.value != term.getSubterm(1) && !g_27.value.match(term.getSubterm(1)))
                                            break Fail444;
                                        term = y_28;
                                        { 
                                          IStrategoTerm t_32 = null;
                                          IStrategoTerm u_32 = null;
                                          IStrategoTerm w_32 = null;
                                          if(t_26.value == null)
                                            break Fail418;
                                          term = get_$L$H$S_type_0_3.instance.invoke(context, t_26.value, h_26.value, b_26.value, c_26.value);
                                          if(term == null)
                                            break Fail418;
                                          u_32 = term;
                                          if(g_27.value == null)
                                            break Fail418;
                                          w_32 = g_27.value;
                                          term = add_external_impl_0_9.instance.invokeDynamic(context, w_32, NO_STRATEGIES, new IStrategoTerm[]{b_26.value, c_26.value, d_26.value, e_26.value, f_26.value, g_26.value, cool.constLong0, i_26.value, j_26.value});
                                          if(term == null)
                                            break Fail418;
                                          t_32 = term;
                                          term = u_32;
                                          if(t_26.value == null)
                                            break Fail418;
                                          term = termFactory.makeAppl(transform._consAssignRightShift_2, new IStrategoTerm[]{t_26.value, t_32});
                                          if(true)
                                            break Success295;
                                        }
                                      }
                                      term = term162;
                                      IStrategoTerm term163 = term;
                                      Success296:
                                      { 
                                        Fail445:
                                        { 
                                          IStrategoTerm z_28 = null;
                                          z_28 = term;
                                          if(i_27.value == null)
                                            break Fail445;
                                          term = i_27.value;
                                          if(term.getTermType() != IStrategoTerm.APPL || transform._consAssignURightShift_2 != ((IStrategoAppl)term).getConstructor())
                                            break Fail445;
                                          if(t_26.value == null)
                                            t_26.value = term.getSubterm(0);
                                          else
                                            if(t_26.value != term.getSubterm(0) && !t_26.value.match(term.getSubterm(0)))
                                              break Fail445;
                                          if(g_27.value == null)
                                            g_27.value = term.getSubterm(1);
                                          else
                                            if(g_27.value != term.getSubterm(1) && !g_27.value.match(term.getSubterm(1)))
                                              break Fail445;
                                          term = z_28;
                                          { 
                                            IStrategoTerm x_32 = null;
                                            IStrategoTerm y_32 = null;
                                            IStrategoTerm a_33 = null;
                                            if(t_26.value == null)
                                              break Fail418;
                                            term = get_$L$H$S_type_0_3.instance.invoke(context, t_26.value, h_26.value, b_26.value, c_26.value);
                                            if(term == null)
                                              break Fail418;
                                            y_32 = term;
                                            if(g_27.value == null)
                                              break Fail418;
                                            a_33 = g_27.value;
                                            term = add_external_impl_0_9.instance.invokeDynamic(context, a_33, NO_STRATEGIES, new IStrategoTerm[]{b_26.value, c_26.value, d_26.value, e_26.value, f_26.value, g_26.value, cool.constLong0, i_26.value, j_26.value});
                                            if(term == null)
                                              break Fail418;
                                            x_32 = term;
                                            term = y_32;
                                            if(t_26.value == null)
                                              break Fail418;
                                            term = termFactory.makeAppl(transform._consAssignURightShift_2, new IStrategoTerm[]{t_26.value, x_32});
                                            if(true)
                                              break Success296;
                                          }
                                        }
                                        term = term163;
                                        add_external_impl_0_9_fragment_0 add_external_impl_0_9_fragment_00 = new add_external_impl_0_9_fragment_0();
                                        add_external_impl_0_9_fragment_00.u_26 = u_26;
                                        add_external_impl_0_9_fragment_00.t_26 = t_26;
                                        add_external_impl_0_9_fragment_00.v_26 = v_26;
                                        add_external_impl_0_9_fragment_00.w_26 = w_26;
                                        add_external_impl_0_9_fragment_00.x_26 = x_26;
                                        add_external_impl_0_9_fragment_00.y_26 = y_26;
                                        add_external_impl_0_9_fragment_00.z_26 = z_26;
                                        add_external_impl_0_9_fragment_00.a_27 = a_27;
                                        add_external_impl_0_9_fragment_00.b_27 = b_27;
                                        add_external_impl_0_9_fragment_00.c_27 = c_27;
                                        add_external_impl_0_9_fragment_00.d_27 = d_27;
                                        add_external_impl_0_9_fragment_00.e_27 = e_27;
                                        add_external_impl_0_9_fragment_00.i_27 = i_27;
                                        add_external_impl_0_9_fragment_00.g_27 = g_27;
                                        add_external_impl_0_9_fragment_00.f_27 = f_27;
                                        add_external_impl_0_9_fragment_00.b_26 = b_26;
                                        add_external_impl_0_9_fragment_00.c_26 = c_26;
                                        add_external_impl_0_9_fragment_00.d_26 = d_26;
                                        add_external_impl_0_9_fragment_00.e_26 = e_26;
                                        add_external_impl_0_9_fragment_00.f_26 = f_26;
                                        add_external_impl_0_9_fragment_00.g_26 = g_26;
                                        add_external_impl_0_9_fragment_00.h_26 = h_26;
                                        add_external_impl_0_9_fragment_00.i_26 = i_26;
                                        add_external_impl_0_9_fragment_00.j_26 = j_26;
                                        add_external_impl_0_9_fragment_00.h_27 = h_27;
                                        term = add_external_impl_0_9_fragment_00.invoke(context, term);
                                        if(term == null)
                                          break Fail418;
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
      if(true)
        return term;
    }
    return null;
  }
}