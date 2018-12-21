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
  TermReference s_10;

  TermReference t_10;

  TermReference v_10;

  TermReference u_10;

  TermReference w_10;

  TermReference x_10;

  TermReference y_10;

  TermReference z_10;

  TermReference a_11;

  TermReference b_11;

  TermReference c_11;

  TermReference d_11;

  TermReference e_11;

  TermReference f_11;

  TermReference j_11;

  TermReference h_11;

  TermReference g_11;

  TermReference c_10;

  TermReference d_10;

  TermReference e_10;

  TermReference f_10;

  TermReference g_10;

  TermReference h_10;

  TermReference i_10;

  TermReference j_10;

  TermReference k_10;

  TermReference i_11;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    Fail315:
    { 
      IStrategoTerm term31 = term;
      Success170:
      { 
        Fail316:
        { 
          IStrategoTerm a_12 = null;
          a_12 = term;
          if(j_11.value == null)
            break Fail316;
          term = j_11.value;
          if(term.getTermType() != IStrategoTerm.APPL || transform._consRightShift_2 != ((IStrategoAppl)term).getConstructor())
            break Fail316;
          if(y_10.value == null)
            y_10.value = term.getSubterm(0);
          else
            if(y_10.value != term.getSubterm(0) && !y_10.value.match(term.getSubterm(0)))
              break Fail316;
          if(z_10.value == null)
            z_10.value = term.getSubterm(1);
          else
            if(z_10.value != term.getSubterm(1) && !z_10.value.match(term.getSubterm(1)))
              break Fail316;
          term = a_12;
          { 
            IStrategoTerm w_14 = null;
            IStrategoTerm y_14 = null;
            IStrategoTerm b_15 = null;
            IStrategoTerm term32 = term;
            Success171:
            { 
              Fail317:
              { 
                IStrategoTerm b_12 = null;
                b_12 = term;
                if(i_10.value == null)
                  break Fail317;
                term = termFactory.makeTuple(i_10.value, cool.constNone0);
                term = equal_0_0.instance.invoke(context, term);
                if(term == null)
                  break Fail317;
                term = b_12;
                { 
                  if(y_10.value == null)
                    break Fail315;
                  term = get_type_of_0_3.instance.invoke(context, y_10.value, i_10.value, c_10.value, d_10.value);
                  if(term == null)
                    break Fail315;
                  term = cast_shift_type_0_0.instance.invoke(context, term);
                  if(term == null)
                    break Fail315;
                  if(t_10.value == null)
                    t_10.value = term;
                  else
                    if(t_10.value != term && !t_10.value.match(term))
                      break Fail315;
                  if(true)
                    break Success171;
                }
              }
              term = term32;
              if(i_10.value == null)
                break Fail315;
              term = cast_shift_type_0_0.instance.invoke(context, i_10.value);
              if(term == null)
                break Fail315;
              if(t_10.value == null)
                t_10.value = term;
              else
                if(t_10.value != term && !t_10.value.match(term))
                  break Fail315;
            }
            y_14 = term;
            if(y_10.value == null)
              break Fail315;
            term = add_external_impl_0_9.instance.invokeDynamic(context, y_10.value, NO_STRATEGIES, new IStrategoTerm[]{c_10.value, d_10.value, e_10.value, f_10.value, g_10.value, h_10.value, t_10.value, j_10.value, k_10.value});
            if(term == null)
              break Fail315;
            w_14 = term;
            term = y_14;
            if(z_10.value == null)
              break Fail315;
            b_15 = z_10.value;
            term = add_external_impl_0_9.instance.invokeDynamic(context, b_15, NO_STRATEGIES, new IStrategoTerm[]{c_10.value, d_10.value, e_10.value, f_10.value, g_10.value, h_10.value, cool.constLong0, j_10.value, k_10.value});
            if(term == null)
              break Fail315;
            term = termFactory.makeAppl(transform._consRightShift_2, new IStrategoTerm[]{w_14, term});
            if(true)
              break Success170;
          }
        }
        term = term31;
        IStrategoTerm term33 = term;
        Success172:
        { 
          Fail318:
          { 
            IStrategoTerm c_12 = null;
            c_12 = term;
            if(j_11.value == null)
              break Fail318;
            term = j_11.value;
            if(term.getTermType() != IStrategoTerm.APPL || transform._consURightShift_2 != ((IStrategoAppl)term).getConstructor())
              break Fail318;
            if(y_10.value == null)
              y_10.value = term.getSubterm(0);
            else
              if(y_10.value != term.getSubterm(0) && !y_10.value.match(term.getSubterm(0)))
                break Fail318;
            if(z_10.value == null)
              z_10.value = term.getSubterm(1);
            else
              if(z_10.value != term.getSubterm(1) && !z_10.value.match(term.getSubterm(1)))
                break Fail318;
            term = c_12;
            { 
              IStrategoTerm c_15 = null;
              IStrategoTerm e_15 = null;
              IStrategoTerm h_15 = null;
              IStrategoTerm term34 = term;
              Success173:
              { 
                Fail319:
                { 
                  IStrategoTerm d_12 = null;
                  d_12 = term;
                  if(i_10.value == null)
                    break Fail319;
                  term = termFactory.makeTuple(i_10.value, cool.constNone0);
                  term = equal_0_0.instance.invoke(context, term);
                  if(term == null)
                    break Fail319;
                  term = d_12;
                  { 
                    if(y_10.value == null)
                      break Fail315;
                    term = get_type_of_0_3.instance.invoke(context, y_10.value, i_10.value, c_10.value, d_10.value);
                    if(term == null)
                      break Fail315;
                    term = cast_shift_type_0_0.instance.invoke(context, term);
                    if(term == null)
                      break Fail315;
                    if(t_10.value == null)
                      t_10.value = term;
                    else
                      if(t_10.value != term && !t_10.value.match(term))
                        break Fail315;
                    if(true)
                      break Success173;
                  }
                }
                term = term34;
                if(i_10.value == null)
                  break Fail315;
                term = cast_shift_type_0_0.instance.invoke(context, i_10.value);
                if(term == null)
                  break Fail315;
                if(t_10.value == null)
                  t_10.value = term;
                else
                  if(t_10.value != term && !t_10.value.match(term))
                    break Fail315;
              }
              e_15 = term;
              if(y_10.value == null)
                break Fail315;
              term = add_external_impl_0_9.instance.invokeDynamic(context, y_10.value, NO_STRATEGIES, new IStrategoTerm[]{c_10.value, d_10.value, e_10.value, f_10.value, g_10.value, h_10.value, t_10.value, j_10.value, k_10.value});
              if(term == null)
                break Fail315;
              c_15 = term;
              term = e_15;
              if(z_10.value == null)
                break Fail315;
              h_15 = z_10.value;
              term = add_external_impl_0_9.instance.invokeDynamic(context, h_15, NO_STRATEGIES, new IStrategoTerm[]{c_10.value, d_10.value, e_10.value, f_10.value, g_10.value, h_10.value, cool.constLong0, j_10.value, k_10.value});
              if(term == null)
                break Fail315;
              term = termFactory.makeAppl(transform._consURightShift_2, new IStrategoTerm[]{c_15, term});
              if(true)
                break Success172;
            }
          }
          term = term33;
          IStrategoTerm term35 = term;
          Success174:
          { 
            Fail320:
            { 
              IStrategoTerm e_12 = null;
              e_12 = term;
              if(j_11.value == null)
                break Fail320;
              term = j_11.value;
              if(term.getTermType() != IStrategoTerm.APPL || transform._consPreIncr_1 != ((IStrategoAppl)term).getConstructor())
                break Fail320;
              if(h_11.value == null)
                h_11.value = term.getSubterm(0);
              else
                if(h_11.value != term.getSubterm(0) && !h_11.value.match(term.getSubterm(0)))
                  break Fail320;
              term = e_12;
              { 
                if(h_11.value == null)
                  break Fail315;
                term = get_type_of_0_3.instance.invoke(context, h_11.value, i_10.value, c_10.value, d_10.value);
                if(term == null)
                  break Fail315;
                if(s_10.value == null)
                  s_10.value = term;
                else
                  if(s_10.value != term && !s_10.value.match(term))
                    break Fail315;
                IStrategoTerm term36 = term;
                Success175:
                { 
                  Fail321:
                  { 
                    IStrategoTerm f_12 = null;
                    f_12 = term;
                    if(s_10.value == null)
                      break Fail321;
                    term = termFactory.makeTuple(s_10.value, cool.constNone0);
                    term = equal_0_0.instance.invoke(context, term);
                    if(term == null)
                      break Fail321;
                    term = f_12;
                    { 
                      IStrategoTerm term37 = term;
                      Success176:
                      { 
                        Fail322:
                        { 
                          IStrategoTerm g_12 = null;
                          g_12 = term;
                          if(i_10.value == null)
                            break Fail322;
                          term = termFactory.makeTuple(i_10.value, cool.constNone0);
                          term = equal_0_0.instance.invoke(context, term);
                          if(term == null)
                            break Fail322;
                          term = g_12;
                          { 
                            term = cool.constDouble0;
                            if(t_10.value == null)
                              t_10.value = term;
                            else
                              if(t_10.value != term && !t_10.value.match(term))
                                break Fail315;
                            if(true)
                              break Success176;
                          }
                        }
                        term = term37;
                        if(i_10.value == null)
                          break Fail315;
                        term = ensure__number_0_0.instance.invoke(context, i_10.value);
                        if(term == null)
                          break Fail315;
                        if(t_10.value == null)
                          t_10.value = term;
                        else
                          if(t_10.value != term && !t_10.value.match(term))
                            break Fail315;
                      }
                      if(true)
                        break Success175;
                    }
                  }
                  term = term36;
                  if(s_10.value == null)
                    break Fail315;
                  term = ensure__number_0_0.instance.invoke(context, s_10.value);
                  if(term == null)
                    break Fail315;
                  if(t_10.value == null)
                    t_10.value = term;
                  else
                    if(t_10.value != term && !t_10.value.match(term))
                      break Fail315;
                }
                if(h_11.value == null)
                  break Fail315;
                term = add_external_impl_0_9.instance.invokeDynamic(context, h_11.value, NO_STRATEGIES, new IStrategoTerm[]{c_10.value, d_10.value, e_10.value, f_10.value, g_10.value, h_10.value, t_10.value, j_10.value, k_10.value});
                if(term == null)
                  break Fail315;
                term = termFactory.makeAppl(transform._consPreIncr_1, new IStrategoTerm[]{term});
                if(true)
                  break Success174;
              }
            }
            term = term35;
            IStrategoTerm term38 = term;
            Success177:
            { 
              Fail323:
              { 
                IStrategoTerm h_12 = null;
                h_12 = term;
                if(j_11.value == null)
                  break Fail323;
                term = j_11.value;
                if(term.getTermType() != IStrategoTerm.APPL || transform._consPostIncr_1 != ((IStrategoAppl)term).getConstructor())
                  break Fail323;
                if(h_11.value == null)
                  h_11.value = term.getSubterm(0);
                else
                  if(h_11.value != term.getSubterm(0) && !h_11.value.match(term.getSubterm(0)))
                    break Fail323;
                term = h_12;
                { 
                  if(h_11.value == null)
                    break Fail315;
                  term = get_type_of_0_3.instance.invoke(context, h_11.value, i_10.value, c_10.value, d_10.value);
                  if(term == null)
                    break Fail315;
                  if(s_10.value == null)
                    s_10.value = term;
                  else
                    if(s_10.value != term && !s_10.value.match(term))
                      break Fail315;
                  IStrategoTerm term39 = term;
                  Success178:
                  { 
                    Fail324:
                    { 
                      IStrategoTerm i_12 = null;
                      i_12 = term;
                      if(s_10.value == null)
                        break Fail324;
                      term = termFactory.makeTuple(s_10.value, cool.constNone0);
                      term = equal_0_0.instance.invoke(context, term);
                      if(term == null)
                        break Fail324;
                      term = i_12;
                      { 
                        IStrategoTerm term40 = term;
                        Success179:
                        { 
                          Fail325:
                          { 
                            IStrategoTerm j_12 = null;
                            j_12 = term;
                            if(i_10.value == null)
                              break Fail325;
                            term = termFactory.makeTuple(i_10.value, cool.constNone0);
                            term = equal_0_0.instance.invoke(context, term);
                            if(term == null)
                              break Fail325;
                            term = j_12;
                            { 
                              term = cool.constDouble0;
                              if(t_10.value == null)
                                t_10.value = term;
                              else
                                if(t_10.value != term && !t_10.value.match(term))
                                  break Fail315;
                              if(true)
                                break Success179;
                            }
                          }
                          term = term40;
                          if(i_10.value == null)
                            break Fail315;
                          term = ensure__number_0_0.instance.invoke(context, i_10.value);
                          if(term == null)
                            break Fail315;
                          if(t_10.value == null)
                            t_10.value = term;
                          else
                            if(t_10.value != term && !t_10.value.match(term))
                              break Fail315;
                        }
                        if(true)
                          break Success178;
                      }
                    }
                    term = term39;
                    if(s_10.value == null)
                      break Fail315;
                    term = ensure__number_0_0.instance.invoke(context, s_10.value);
                    if(term == null)
                      break Fail315;
                    if(t_10.value == null)
                      t_10.value = term;
                    else
                      if(t_10.value != term && !t_10.value.match(term))
                        break Fail315;
                  }
                  if(h_11.value == null)
                    break Fail315;
                  term = add_external_impl_0_9.instance.invokeDynamic(context, h_11.value, NO_STRATEGIES, new IStrategoTerm[]{c_10.value, d_10.value, e_10.value, f_10.value, g_10.value, h_10.value, t_10.value, j_10.value, k_10.value});
                  if(term == null)
                    break Fail315;
                  term = termFactory.makeAppl(transform._consPostIncr_1, new IStrategoTerm[]{term});
                  if(true)
                    break Success177;
                }
              }
              term = term38;
              IStrategoTerm term41 = term;
              Success180:
              { 
                Fail326:
                { 
                  IStrategoTerm k_12 = null;
                  k_12 = term;
                  if(j_11.value == null)
                    break Fail326;
                  term = j_11.value;
                  if(term.getTermType() != IStrategoTerm.APPL || transform._consPreDecr_1 != ((IStrategoAppl)term).getConstructor())
                    break Fail326;
                  if(h_11.value == null)
                    h_11.value = term.getSubterm(0);
                  else
                    if(h_11.value != term.getSubterm(0) && !h_11.value.match(term.getSubterm(0)))
                      break Fail326;
                  term = k_12;
                  { 
                    if(h_11.value == null)
                      break Fail315;
                    term = get_type_of_0_3.instance.invoke(context, h_11.value, i_10.value, c_10.value, d_10.value);
                    if(term == null)
                      break Fail315;
                    if(s_10.value == null)
                      s_10.value = term;
                    else
                      if(s_10.value != term && !s_10.value.match(term))
                        break Fail315;
                    IStrategoTerm term42 = term;
                    Success181:
                    { 
                      Fail327:
                      { 
                        IStrategoTerm l_12 = null;
                        l_12 = term;
                        if(s_10.value == null)
                          break Fail327;
                        term = termFactory.makeTuple(s_10.value, cool.constNone0);
                        term = equal_0_0.instance.invoke(context, term);
                        if(term == null)
                          break Fail327;
                        term = l_12;
                        { 
                          IStrategoTerm term43 = term;
                          Success182:
                          { 
                            Fail328:
                            { 
                              IStrategoTerm m_12 = null;
                              m_12 = term;
                              if(i_10.value == null)
                                break Fail328;
                              term = termFactory.makeTuple(i_10.value, cool.constNone0);
                              term = equal_0_0.instance.invoke(context, term);
                              if(term == null)
                                break Fail328;
                              term = m_12;
                              { 
                                term = cool.constDouble0;
                                if(t_10.value == null)
                                  t_10.value = term;
                                else
                                  if(t_10.value != term && !t_10.value.match(term))
                                    break Fail315;
                                if(true)
                                  break Success182;
                              }
                            }
                            term = term43;
                            if(i_10.value == null)
                              break Fail315;
                            term = ensure__number_0_0.instance.invoke(context, i_10.value);
                            if(term == null)
                              break Fail315;
                            if(t_10.value == null)
                              t_10.value = term;
                            else
                              if(t_10.value != term && !t_10.value.match(term))
                                break Fail315;
                          }
                          if(true)
                            break Success181;
                        }
                      }
                      term = term42;
                      if(s_10.value == null)
                        break Fail315;
                      term = ensure__number_0_0.instance.invoke(context, s_10.value);
                      if(term == null)
                        break Fail315;
                      if(t_10.value == null)
                        t_10.value = term;
                      else
                        if(t_10.value != term && !t_10.value.match(term))
                          break Fail315;
                    }
                    if(h_11.value == null)
                      break Fail315;
                    term = add_external_impl_0_9.instance.invokeDynamic(context, h_11.value, NO_STRATEGIES, new IStrategoTerm[]{c_10.value, d_10.value, e_10.value, f_10.value, g_10.value, h_10.value, t_10.value, j_10.value, k_10.value});
                    if(term == null)
                      break Fail315;
                    term = termFactory.makeAppl(transform._consPreDecr_1, new IStrategoTerm[]{term});
                    if(true)
                      break Success180;
                  }
                }
                term = term41;
                IStrategoTerm term44 = term;
                Success183:
                { 
                  Fail329:
                  { 
                    IStrategoTerm n_12 = null;
                    n_12 = term;
                    if(j_11.value == null)
                      break Fail329;
                    term = j_11.value;
                    if(term.getTermType() != IStrategoTerm.APPL || transform._consPostDecr_1 != ((IStrategoAppl)term).getConstructor())
                      break Fail329;
                    if(h_11.value == null)
                      h_11.value = term.getSubterm(0);
                    else
                      if(h_11.value != term.getSubterm(0) && !h_11.value.match(term.getSubterm(0)))
                        break Fail329;
                    term = n_12;
                    { 
                      if(h_11.value == null)
                        break Fail315;
                      term = get_type_of_0_3.instance.invoke(context, h_11.value, i_10.value, c_10.value, d_10.value);
                      if(term == null)
                        break Fail315;
                      if(s_10.value == null)
                        s_10.value = term;
                      else
                        if(s_10.value != term && !s_10.value.match(term))
                          break Fail315;
                      IStrategoTerm term45 = term;
                      Success184:
                      { 
                        Fail330:
                        { 
                          IStrategoTerm o_12 = null;
                          o_12 = term;
                          if(s_10.value == null)
                            break Fail330;
                          term = termFactory.makeTuple(s_10.value, cool.constNone0);
                          term = equal_0_0.instance.invoke(context, term);
                          if(term == null)
                            break Fail330;
                          term = o_12;
                          { 
                            IStrategoTerm term46 = term;
                            Success185:
                            { 
                              Fail331:
                              { 
                                IStrategoTerm p_12 = null;
                                p_12 = term;
                                if(i_10.value == null)
                                  break Fail331;
                                term = termFactory.makeTuple(i_10.value, cool.constNone0);
                                term = equal_0_0.instance.invoke(context, term);
                                if(term == null)
                                  break Fail331;
                                term = p_12;
                                { 
                                  term = cool.constDouble0;
                                  if(t_10.value == null)
                                    t_10.value = term;
                                  else
                                    if(t_10.value != term && !t_10.value.match(term))
                                      break Fail315;
                                  if(true)
                                    break Success185;
                                }
                              }
                              term = term46;
                              if(i_10.value == null)
                                break Fail315;
                              term = ensure__number_0_0.instance.invoke(context, i_10.value);
                              if(term == null)
                                break Fail315;
                              if(t_10.value == null)
                                t_10.value = term;
                              else
                                if(t_10.value != term && !t_10.value.match(term))
                                  break Fail315;
                            }
                            if(true)
                              break Success184;
                          }
                        }
                        term = term45;
                        if(s_10.value == null)
                          break Fail315;
                        term = ensure__number_0_0.instance.invoke(context, s_10.value);
                        if(term == null)
                          break Fail315;
                        if(t_10.value == null)
                          t_10.value = term;
                        else
                          if(t_10.value != term && !t_10.value.match(term))
                            break Fail315;
                      }
                      if(h_11.value == null)
                        break Fail315;
                      term = add_external_impl_0_9.instance.invokeDynamic(context, h_11.value, NO_STRATEGIES, new IStrategoTerm[]{c_10.value, d_10.value, e_10.value, f_10.value, g_10.value, h_10.value, t_10.value, j_10.value, k_10.value});
                      if(term == null)
                        break Fail315;
                      term = termFactory.makeAppl(transform._consPostDecr_1, new IStrategoTerm[]{term});
                      if(true)
                        break Success183;
                    }
                  }
                  term = term44;
                  IStrategoTerm term47 = term;
                  Success186:
                  { 
                    Fail332:
                    { 
                      IStrategoTerm q_12 = null;
                      q_12 = term;
                      if(j_11.value == null)
                        break Fail332;
                      term = j_11.value;
                      if(term.getTermType() != IStrategoTerm.APPL || transform._consNot_1 != ((IStrategoAppl)term).getConstructor())
                        break Fail332;
                      term = q_12;
                      { 
                        if(i_11.value == null)
                          break Fail315;
                        term = i_11.value;
                        lifted40 lifted400 = new lifted40();
                        lifted400.c_10 = c_10;
                        lifted400.d_10 = d_10;
                        lifted400.e_10 = e_10;
                        lifted400.f_10 = f_10;
                        lifted400.g_10 = g_10;
                        lifted400.h_10 = h_10;
                        lifted400.j_10 = j_10;
                        lifted400.k_10 = k_10;
                        term = SRTS_all.instance.invoke(context, term, lifted400);
                        if(term == null)
                          break Fail315;
                        if(true)
                          break Success186;
                      }
                    }
                    term = term47;
                    IStrategoTerm term48 = term;
                    Success187:
                    { 
                      Fail333:
                      { 
                        IStrategoTerm r_12 = null;
                        r_12 = term;
                        if(j_11.value == null)
                          break Fail333;
                        term = or_2_0.instance.invoke(context, j_11.value, lifted41.instance, lifted44.instance);
                        if(term == null)
                          break Fail333;
                        term = r_12;
                        { 
                          if(i_11.value == null)
                            break Fail315;
                          term = i_11.value;
                          lifted45 lifted450 = new lifted45();
                          lifted450.i_11 = i_11;
                          lifted450.i_10 = i_10;
                          lifted450.c_10 = c_10;
                          lifted450.d_10 = d_10;
                          lifted450.e_10 = e_10;
                          lifted450.f_10 = f_10;
                          lifted450.g_10 = g_10;
                          lifted450.h_10 = h_10;
                          lifted450.j_10 = j_10;
                          lifted450.k_10 = k_10;
                          term = SRTS_all.instance.invoke(context, term, lifted450);
                          if(term == null)
                            break Fail315;
                          if(true)
                            break Success187;
                        }
                      }
                      term = term48;
                      IStrategoTerm term49 = term;
                      Success188:
                      { 
                        Fail334:
                        { 
                          IStrategoTerm s_12 = null;
                          s_12 = term;
                          if(j_11.value == null)
                            break Fail334;
                          term = j_11.value;
                          if(term.getTermType() != IStrategoTerm.APPL || transform._consAssign_2 != ((IStrategoAppl)term).getConstructor())
                            break Fail334;
                          if(u_10.value == null)
                            u_10.value = term.getSubterm(0);
                          else
                            if(u_10.value != term.getSubterm(0) && !u_10.value.match(term.getSubterm(0)))
                              break Fail334;
                          if(h_11.value == null)
                            h_11.value = term.getSubterm(1);
                          else
                            if(h_11.value != term.getSubterm(1) && !h_11.value.match(term.getSubterm(1)))
                              break Fail334;
                          term = s_12;
                          { 
                            IStrategoTerm u_15 = null;
                            IStrategoTerm v_15 = null;
                            if(u_10.value == null)
                              break Fail315;
                            term = get_$L$H$S_type_0_3.instance.invoke(context, u_10.value, i_10.value, c_10.value, d_10.value);
                            if(term == null)
                              break Fail315;
                            if(v_10.value == null)
                              v_10.value = term;
                            else
                              if(v_10.value != term && !v_10.value.match(term))
                                break Fail315;
                            v_15 = term;
                            if(h_11.value == null)
                              break Fail315;
                            term = add_external_impl_0_9.instance.invokeDynamic(context, h_11.value, NO_STRATEGIES, new IStrategoTerm[]{c_10.value, d_10.value, e_10.value, f_10.value, g_10.value, h_10.value, v_10.value, j_10.value, k_10.value});
                            if(term == null)
                              break Fail315;
                            u_15 = term;
                            term = v_15;
                            if(u_10.value == null)
                              break Fail315;
                            term = termFactory.makeAppl(transform._consAssign_2, new IStrategoTerm[]{u_10.value, u_15});
                            if(true)
                              break Success188;
                          }
                        }
                        term = term49;
                        IStrategoTerm term50 = term;
                        Success189:
                        { 
                          Fail335:
                          { 
                            IStrategoTerm t_12 = null;
                            t_12 = term;
                            if(j_11.value == null)
                              break Fail335;
                            term = j_11.value;
                            if(term.getTermType() != IStrategoTerm.APPL || transform._consAssignMul_2 != ((IStrategoAppl)term).getConstructor())
                              break Fail335;
                            if(u_10.value == null)
                              u_10.value = term.getSubterm(0);
                            else
                              if(u_10.value != term.getSubterm(0) && !u_10.value.match(term.getSubterm(0)))
                                break Fail335;
                            if(h_11.value == null)
                              h_11.value = term.getSubterm(1);
                            else
                              if(h_11.value != term.getSubterm(1) && !h_11.value.match(term.getSubterm(1)))
                                break Fail335;
                            term = t_12;
                            { 
                              IStrategoTerm w_15 = null;
                              IStrategoTerm x_15 = null;
                              IStrategoTerm z_15 = null;
                              if(u_10.value == null)
                                break Fail315;
                              term = get_$L$H$S_type_0_3.instance.invoke(context, u_10.value, i_10.value, c_10.value, d_10.value);
                              if(term == null)
                                break Fail315;
                              x_15 = term;
                              if(h_11.value == null)
                                break Fail315;
                              z_15 = h_11.value;
                              term = add_external_impl_0_9.instance.invokeDynamic(context, z_15, NO_STRATEGIES, new IStrategoTerm[]{c_10.value, d_10.value, e_10.value, f_10.value, g_10.value, h_10.value, cool.constDouble0, j_10.value, k_10.value});
                              if(term == null)
                                break Fail315;
                              w_15 = term;
                              term = x_15;
                              if(u_10.value == null)
                                break Fail315;
                              term = termFactory.makeAppl(transform._consAssignMul_2, new IStrategoTerm[]{u_10.value, w_15});
                              if(true)
                                break Success189;
                            }
                          }
                          term = term50;
                          IStrategoTerm term51 = term;
                          Success190:
                          { 
                            Fail336:
                            { 
                              IStrategoTerm u_12 = null;
                              u_12 = term;
                              if(j_11.value == null)
                                break Fail336;
                              term = j_11.value;
                              if(term.getTermType() != IStrategoTerm.APPL || transform._consAssignDiv_2 != ((IStrategoAppl)term).getConstructor())
                                break Fail336;
                              if(u_10.value == null)
                                u_10.value = term.getSubterm(0);
                              else
                                if(u_10.value != term.getSubterm(0) && !u_10.value.match(term.getSubterm(0)))
                                  break Fail336;
                              if(h_11.value == null)
                                h_11.value = term.getSubterm(1);
                              else
                                if(h_11.value != term.getSubterm(1) && !h_11.value.match(term.getSubterm(1)))
                                  break Fail336;
                              term = u_12;
                              { 
                                IStrategoTerm a_16 = null;
                                IStrategoTerm b_16 = null;
                                IStrategoTerm d_16 = null;
                                if(u_10.value == null)
                                  break Fail315;
                                term = get_$L$H$S_type_0_3.instance.invoke(context, u_10.value, i_10.value, c_10.value, d_10.value);
                                if(term == null)
                                  break Fail315;
                                b_16 = term;
                                if(h_11.value == null)
                                  break Fail315;
                                d_16 = h_11.value;
                                term = add_external_impl_0_9.instance.invokeDynamic(context, d_16, NO_STRATEGIES, new IStrategoTerm[]{c_10.value, d_10.value, e_10.value, f_10.value, g_10.value, h_10.value, cool.constDouble0, j_10.value, k_10.value});
                                if(term == null)
                                  break Fail315;
                                a_16 = term;
                                term = b_16;
                                if(u_10.value == null)
                                  break Fail315;
                                term = termFactory.makeAppl(transform._consAssignDiv_2, new IStrategoTerm[]{u_10.value, a_16});
                                if(true)
                                  break Success190;
                              }
                            }
                            term = term51;
                            IStrategoTerm term52 = term;
                            Success191:
                            { 
                              Fail337:
                              { 
                                IStrategoTerm v_12 = null;
                                v_12 = term;
                                if(j_11.value == null)
                                  break Fail337;
                                term = j_11.value;
                                if(term.getTermType() != IStrategoTerm.APPL || transform._consAssignRemain_2 != ((IStrategoAppl)term).getConstructor())
                                  break Fail337;
                                if(u_10.value == null)
                                  u_10.value = term.getSubterm(0);
                                else
                                  if(u_10.value != term.getSubterm(0) && !u_10.value.match(term.getSubterm(0)))
                                    break Fail337;
                                if(h_11.value == null)
                                  h_11.value = term.getSubterm(1);
                                else
                                  if(h_11.value != term.getSubterm(1) && !h_11.value.match(term.getSubterm(1)))
                                    break Fail337;
                                term = v_12;
                                { 
                                  IStrategoTerm e_16 = null;
                                  IStrategoTerm f_16 = null;
                                  IStrategoTerm h_16 = null;
                                  if(u_10.value == null)
                                    break Fail315;
                                  term = get_$L$H$S_type_0_3.instance.invoke(context, u_10.value, i_10.value, c_10.value, d_10.value);
                                  if(term == null)
                                    break Fail315;
                                  f_16 = term;
                                  if(h_11.value == null)
                                    break Fail315;
                                  h_16 = h_11.value;
                                  term = add_external_impl_0_9.instance.invokeDynamic(context, h_16, NO_STRATEGIES, new IStrategoTerm[]{c_10.value, d_10.value, e_10.value, f_10.value, g_10.value, h_10.value, cool.constDouble0, j_10.value, k_10.value});
                                  if(term == null)
                                    break Fail315;
                                  e_16 = term;
                                  term = f_16;
                                  if(u_10.value == null)
                                    break Fail315;
                                  term = termFactory.makeAppl(transform._consAssignRemain_2, new IStrategoTerm[]{u_10.value, e_16});
                                  if(true)
                                    break Success191;
                                }
                              }
                              term = term52;
                              IStrategoTerm term53 = term;
                              Success192:
                              { 
                                Fail338:
                                { 
                                  IStrategoTerm w_12 = null;
                                  w_12 = term;
                                  if(j_11.value == null)
                                    break Fail338;
                                  term = j_11.value;
                                  if(term.getTermType() != IStrategoTerm.APPL || transform._consAssignPlus_2 != ((IStrategoAppl)term).getConstructor())
                                    break Fail338;
                                  if(u_10.value == null)
                                    u_10.value = term.getSubterm(0);
                                  else
                                    if(u_10.value != term.getSubterm(0) && !u_10.value.match(term.getSubterm(0)))
                                      break Fail338;
                                  if(h_11.value == null)
                                    h_11.value = term.getSubterm(1);
                                  else
                                    if(h_11.value != term.getSubterm(1) && !h_11.value.match(term.getSubterm(1)))
                                      break Fail338;
                                  term = w_12;
                                  { 
                                    IStrategoTerm i_16 = null;
                                    IStrategoTerm j_16 = null;
                                    IStrategoTerm l_16 = null;
                                    if(u_10.value == null)
                                      break Fail315;
                                    term = get_$L$H$S_type_0_3.instance.invoke(context, u_10.value, i_10.value, c_10.value, d_10.value);
                                    if(term == null)
                                      break Fail315;
                                    j_16 = term;
                                    if(h_11.value == null)
                                      break Fail315;
                                    l_16 = h_11.value;
                                    term = add_external_impl_0_9.instance.invokeDynamic(context, l_16, NO_STRATEGIES, new IStrategoTerm[]{c_10.value, d_10.value, e_10.value, f_10.value, g_10.value, h_10.value, cool.constDouble0, j_10.value, k_10.value});
                                    if(term == null)
                                      break Fail315;
                                    i_16 = term;
                                    term = j_16;
                                    if(u_10.value == null)
                                      break Fail315;
                                    term = termFactory.makeAppl(transform._consAssignPlus_2, new IStrategoTerm[]{u_10.value, i_16});
                                    if(true)
                                      break Success192;
                                  }
                                }
                                term = term53;
                                IStrategoTerm term54 = term;
                                Success193:
                                { 
                                  Fail339:
                                  { 
                                    IStrategoTerm x_12 = null;
                                    x_12 = term;
                                    if(j_11.value == null)
                                      break Fail339;
                                    term = j_11.value;
                                    if(term.getTermType() != IStrategoTerm.APPL || transform._consAssignMinus_2 != ((IStrategoAppl)term).getConstructor())
                                      break Fail339;
                                    if(u_10.value == null)
                                      u_10.value = term.getSubterm(0);
                                    else
                                      if(u_10.value != term.getSubterm(0) && !u_10.value.match(term.getSubterm(0)))
                                        break Fail339;
                                    if(h_11.value == null)
                                      h_11.value = term.getSubterm(1);
                                    else
                                      if(h_11.value != term.getSubterm(1) && !h_11.value.match(term.getSubterm(1)))
                                        break Fail339;
                                    term = x_12;
                                    { 
                                      IStrategoTerm m_16 = null;
                                      IStrategoTerm n_16 = null;
                                      IStrategoTerm p_16 = null;
                                      if(u_10.value == null)
                                        break Fail315;
                                      term = get_$L$H$S_type_0_3.instance.invoke(context, u_10.value, i_10.value, c_10.value, d_10.value);
                                      if(term == null)
                                        break Fail315;
                                      n_16 = term;
                                      if(h_11.value == null)
                                        break Fail315;
                                      p_16 = h_11.value;
                                      term = add_external_impl_0_9.instance.invokeDynamic(context, p_16, NO_STRATEGIES, new IStrategoTerm[]{c_10.value, d_10.value, e_10.value, f_10.value, g_10.value, h_10.value, cool.constDouble0, j_10.value, k_10.value});
                                      if(term == null)
                                        break Fail315;
                                      m_16 = term;
                                      term = n_16;
                                      if(u_10.value == null)
                                        break Fail315;
                                      term = termFactory.makeAppl(transform._consAssignMinus_2, new IStrategoTerm[]{u_10.value, m_16});
                                      if(true)
                                        break Success193;
                                    }
                                  }
                                  term = term54;
                                  IStrategoTerm term55 = term;
                                  Success194:
                                  { 
                                    Fail340:
                                    { 
                                      IStrategoTerm y_12 = null;
                                      y_12 = term;
                                      if(j_11.value == null)
                                        break Fail340;
                                      term = j_11.value;
                                      if(term.getTermType() != IStrategoTerm.APPL || transform._consAssignLeftShift_2 != ((IStrategoAppl)term).getConstructor())
                                        break Fail340;
                                      if(u_10.value == null)
                                        u_10.value = term.getSubterm(0);
                                      else
                                        if(u_10.value != term.getSubterm(0) && !u_10.value.match(term.getSubterm(0)))
                                          break Fail340;
                                      if(h_11.value == null)
                                        h_11.value = term.getSubterm(1);
                                      else
                                        if(h_11.value != term.getSubterm(1) && !h_11.value.match(term.getSubterm(1)))
                                          break Fail340;
                                      term = y_12;
                                      { 
                                        IStrategoTerm q_16 = null;
                                        IStrategoTerm r_16 = null;
                                        IStrategoTerm t_16 = null;
                                        if(u_10.value == null)
                                          break Fail315;
                                        term = get_$L$H$S_type_0_3.instance.invoke(context, u_10.value, i_10.value, c_10.value, d_10.value);
                                        if(term == null)
                                          break Fail315;
                                        r_16 = term;
                                        if(h_11.value == null)
                                          break Fail315;
                                        t_16 = h_11.value;
                                        term = add_external_impl_0_9.instance.invokeDynamic(context, t_16, NO_STRATEGIES, new IStrategoTerm[]{c_10.value, d_10.value, e_10.value, f_10.value, g_10.value, h_10.value, cool.constLong0, j_10.value, k_10.value});
                                        if(term == null)
                                          break Fail315;
                                        q_16 = term;
                                        term = r_16;
                                        if(u_10.value == null)
                                          break Fail315;
                                        term = termFactory.makeAppl(transform._consAssignLeftShift_2, new IStrategoTerm[]{u_10.value, q_16});
                                        if(true)
                                          break Success194;
                                      }
                                    }
                                    term = term55;
                                    IStrategoTerm term56 = term;
                                    Success195:
                                    { 
                                      Fail341:
                                      { 
                                        IStrategoTerm z_12 = null;
                                        z_12 = term;
                                        if(j_11.value == null)
                                          break Fail341;
                                        term = j_11.value;
                                        if(term.getTermType() != IStrategoTerm.APPL || transform._consAssignRightShift_2 != ((IStrategoAppl)term).getConstructor())
                                          break Fail341;
                                        if(u_10.value == null)
                                          u_10.value = term.getSubterm(0);
                                        else
                                          if(u_10.value != term.getSubterm(0) && !u_10.value.match(term.getSubterm(0)))
                                            break Fail341;
                                        if(h_11.value == null)
                                          h_11.value = term.getSubterm(1);
                                        else
                                          if(h_11.value != term.getSubterm(1) && !h_11.value.match(term.getSubterm(1)))
                                            break Fail341;
                                        term = z_12;
                                        { 
                                          IStrategoTerm u_16 = null;
                                          IStrategoTerm v_16 = null;
                                          IStrategoTerm x_16 = null;
                                          if(u_10.value == null)
                                            break Fail315;
                                          term = get_$L$H$S_type_0_3.instance.invoke(context, u_10.value, i_10.value, c_10.value, d_10.value);
                                          if(term == null)
                                            break Fail315;
                                          v_16 = term;
                                          if(h_11.value == null)
                                            break Fail315;
                                          x_16 = h_11.value;
                                          term = add_external_impl_0_9.instance.invokeDynamic(context, x_16, NO_STRATEGIES, new IStrategoTerm[]{c_10.value, d_10.value, e_10.value, f_10.value, g_10.value, h_10.value, cool.constLong0, j_10.value, k_10.value});
                                          if(term == null)
                                            break Fail315;
                                          u_16 = term;
                                          term = v_16;
                                          if(u_10.value == null)
                                            break Fail315;
                                          term = termFactory.makeAppl(transform._consAssignRightShift_2, new IStrategoTerm[]{u_10.value, u_16});
                                          if(true)
                                            break Success195;
                                        }
                                      }
                                      term = term56;
                                      IStrategoTerm term57 = term;
                                      Success196:
                                      { 
                                        Fail342:
                                        { 
                                          IStrategoTerm a_13 = null;
                                          a_13 = term;
                                          if(j_11.value == null)
                                            break Fail342;
                                          term = j_11.value;
                                          if(term.getTermType() != IStrategoTerm.APPL || transform._consAssignURightShift_2 != ((IStrategoAppl)term).getConstructor())
                                            break Fail342;
                                          if(u_10.value == null)
                                            u_10.value = term.getSubterm(0);
                                          else
                                            if(u_10.value != term.getSubterm(0) && !u_10.value.match(term.getSubterm(0)))
                                              break Fail342;
                                          if(h_11.value == null)
                                            h_11.value = term.getSubterm(1);
                                          else
                                            if(h_11.value != term.getSubterm(1) && !h_11.value.match(term.getSubterm(1)))
                                              break Fail342;
                                          term = a_13;
                                          { 
                                            IStrategoTerm y_16 = null;
                                            IStrategoTerm z_16 = null;
                                            IStrategoTerm b_17 = null;
                                            if(u_10.value == null)
                                              break Fail315;
                                            term = get_$L$H$S_type_0_3.instance.invoke(context, u_10.value, i_10.value, c_10.value, d_10.value);
                                            if(term == null)
                                              break Fail315;
                                            z_16 = term;
                                            if(h_11.value == null)
                                              break Fail315;
                                            b_17 = h_11.value;
                                            term = add_external_impl_0_9.instance.invokeDynamic(context, b_17, NO_STRATEGIES, new IStrategoTerm[]{c_10.value, d_10.value, e_10.value, f_10.value, g_10.value, h_10.value, cool.constLong0, j_10.value, k_10.value});
                                            if(term == null)
                                              break Fail315;
                                            y_16 = term;
                                            term = z_16;
                                            if(u_10.value == null)
                                              break Fail315;
                                            term = termFactory.makeAppl(transform._consAssignURightShift_2, new IStrategoTerm[]{u_10.value, y_16});
                                            if(true)
                                              break Success196;
                                          }
                                        }
                                        term = term57;
                                        add_external_impl_0_9_fragment_0 add_external_impl_0_9_fragment_00 = new add_external_impl_0_9_fragment_0();
                                        add_external_impl_0_9_fragment_00.v_10 = v_10;
                                        add_external_impl_0_9_fragment_00.u_10 = u_10;
                                        add_external_impl_0_9_fragment_00.w_10 = w_10;
                                        add_external_impl_0_9_fragment_00.x_10 = x_10;
                                        add_external_impl_0_9_fragment_00.y_10 = y_10;
                                        add_external_impl_0_9_fragment_00.z_10 = z_10;
                                        add_external_impl_0_9_fragment_00.a_11 = a_11;
                                        add_external_impl_0_9_fragment_00.b_11 = b_11;
                                        add_external_impl_0_9_fragment_00.c_11 = c_11;
                                        add_external_impl_0_9_fragment_00.d_11 = d_11;
                                        add_external_impl_0_9_fragment_00.e_11 = e_11;
                                        add_external_impl_0_9_fragment_00.f_11 = f_11;
                                        add_external_impl_0_9_fragment_00.j_11 = j_11;
                                        add_external_impl_0_9_fragment_00.h_11 = h_11;
                                        add_external_impl_0_9_fragment_00.g_11 = g_11;
                                        add_external_impl_0_9_fragment_00.c_10 = c_10;
                                        add_external_impl_0_9_fragment_00.d_10 = d_10;
                                        add_external_impl_0_9_fragment_00.e_10 = e_10;
                                        add_external_impl_0_9_fragment_00.f_10 = f_10;
                                        add_external_impl_0_9_fragment_00.g_10 = g_10;
                                        add_external_impl_0_9_fragment_00.h_10 = h_10;
                                        add_external_impl_0_9_fragment_00.i_10 = i_10;
                                        add_external_impl_0_9_fragment_00.j_10 = j_10;
                                        add_external_impl_0_9_fragment_00.k_10 = k_10;
                                        add_external_impl_0_9_fragment_00.i_11 = i_11;
                                        term = add_external_impl_0_9_fragment_00.invoke(context, term);
                                        if(term == null)
                                          break Fail315;
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