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

@SuppressWarnings("all") final class add_external_impl_0_9_fragment_0 extends Strategy 
{ 
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
    Fail446:
    { 
      IStrategoTerm term164 = term;
      Success297:
      { 
        Fail447:
        { 
          IStrategoTerm a_29 = null;
          a_29 = term;
          if(i_27.value == null)
            break Fail447;
          term = i_27.value;
          if(term.getTermType() != IStrategoTerm.APPL || transform._consAssignAnd_2 != ((IStrategoAppl)term).getConstructor())
            break Fail447;
          if(t_26.value == null)
            t_26.value = term.getSubterm(0);
          else
            if(t_26.value != term.getSubterm(0) && !t_26.value.match(term.getSubterm(0)))
              break Fail447;
          if(g_27.value == null)
            g_27.value = term.getSubterm(1);
          else
            if(g_27.value != term.getSubterm(1) && !g_27.value.match(term.getSubterm(1)))
              break Fail447;
          term = a_29;
          { 
            IStrategoTerm b_33 = null;
            IStrategoTerm c_33 = null;
            IStrategoTerm e_33 = null;
            if(t_26.value == null)
              break Fail446;
            term = get_$L$H$S_type_0_3.instance.invoke(context, t_26.value, h_26.value, b_26.value, c_26.value);
            if(term == null)
              break Fail446;
            if(u_26.value == null)
              u_26.value = term;
            else
              if(u_26.value != term && !u_26.value.match(term))
                break Fail446;
            c_33 = term;
            if(g_27.value == null)
              break Fail446;
            term = g_27.value;
            e_33 = g_27.value;
            if(u_26.value == null)
              break Fail446;
            term = cast_bounded_conditional_type_0_0.instance.invoke(context, u_26.value);
            if(term == null)
              break Fail446;
            term = add_external_impl_0_9.instance.invokeDynamic(context, e_33, NO_STRATEGIES, new IStrategoTerm[]{b_26.value, c_26.value, d_26.value, e_26.value, f_26.value, g_26.value, term, i_26.value, j_26.value});
            if(term == null)
              break Fail446;
            b_33 = term;
            term = c_33;
            if(t_26.value == null)
              break Fail446;
            term = termFactory.makeAppl(transform._consAssignAnd_2, new IStrategoTerm[]{t_26.value, b_33});
            if(true)
              break Success297;
          }
        }
        term = term164;
        IStrategoTerm term165 = term;
        Success298:
        { 
          Fail448:
          { 
            IStrategoTerm b_29 = null;
            b_29 = term;
            if(i_27.value == null)
              break Fail448;
            term = i_27.value;
            if(term.getTermType() != IStrategoTerm.APPL || transform._consAssignExcOr_2 != ((IStrategoAppl)term).getConstructor())
              break Fail448;
            if(t_26.value == null)
              t_26.value = term.getSubterm(0);
            else
              if(t_26.value != term.getSubterm(0) && !t_26.value.match(term.getSubterm(0)))
                break Fail448;
            if(g_27.value == null)
              g_27.value = term.getSubterm(1);
            else
              if(g_27.value != term.getSubterm(1) && !g_27.value.match(term.getSubterm(1)))
                break Fail448;
            term = b_29;
            { 
              IStrategoTerm f_33 = null;
              IStrategoTerm g_33 = null;
              IStrategoTerm i_33 = null;
              if(t_26.value == null)
                break Fail446;
              term = get_$L$H$S_type_0_3.instance.invoke(context, t_26.value, h_26.value, b_26.value, c_26.value);
              if(term == null)
                break Fail446;
              if(u_26.value == null)
                u_26.value = term;
              else
                if(u_26.value != term && !u_26.value.match(term))
                  break Fail446;
              g_33 = term;
              if(g_27.value == null)
                break Fail446;
              term = g_27.value;
              i_33 = g_27.value;
              if(u_26.value == null)
                break Fail446;
              term = cast_bounded_conditional_type_0_0.instance.invoke(context, u_26.value);
              if(term == null)
                break Fail446;
              term = add_external_impl_0_9.instance.invokeDynamic(context, i_33, NO_STRATEGIES, new IStrategoTerm[]{b_26.value, c_26.value, d_26.value, e_26.value, f_26.value, g_26.value, term, i_26.value, j_26.value});
              if(term == null)
                break Fail446;
              f_33 = term;
              term = g_33;
              if(t_26.value == null)
                break Fail446;
              term = termFactory.makeAppl(transform._consAssignExcOr_2, new IStrategoTerm[]{t_26.value, f_33});
              if(true)
                break Success298;
            }
          }
          term = term165;
          IStrategoTerm term166 = term;
          Success299:
          { 
            Fail449:
            { 
              IStrategoTerm c_29 = null;
              c_29 = term;
              if(i_27.value == null)
                break Fail449;
              term = i_27.value;
              if(term.getTermType() != IStrategoTerm.APPL || transform._consAssignOr_2 != ((IStrategoAppl)term).getConstructor())
                break Fail449;
              if(t_26.value == null)
                t_26.value = term.getSubterm(0);
              else
                if(t_26.value != term.getSubterm(0) && !t_26.value.match(term.getSubterm(0)))
                  break Fail449;
              if(g_27.value == null)
                g_27.value = term.getSubterm(1);
              else
                if(g_27.value != term.getSubterm(1) && !g_27.value.match(term.getSubterm(1)))
                  break Fail449;
              term = c_29;
              { 
                IStrategoTerm j_33 = null;
                IStrategoTerm k_33 = null;
                IStrategoTerm m_33 = null;
                if(t_26.value == null)
                  break Fail446;
                term = get_$L$H$S_type_0_3.instance.invoke(context, t_26.value, h_26.value, b_26.value, c_26.value);
                if(term == null)
                  break Fail446;
                if(u_26.value == null)
                  u_26.value = term;
                else
                  if(u_26.value != term && !u_26.value.match(term))
                    break Fail446;
                k_33 = term;
                if(g_27.value == null)
                  break Fail446;
                term = g_27.value;
                m_33 = g_27.value;
                if(u_26.value == null)
                  break Fail446;
                term = cast_bounded_conditional_type_0_0.instance.invoke(context, u_26.value);
                if(term == null)
                  break Fail446;
                term = add_external_impl_0_9.instance.invokeDynamic(context, m_33, NO_STRATEGIES, new IStrategoTerm[]{b_26.value, c_26.value, d_26.value, e_26.value, f_26.value, g_26.value, term, i_26.value, j_26.value});
                if(term == null)
                  break Fail446;
                j_33 = term;
                term = k_33;
                if(t_26.value == null)
                  break Fail446;
                term = termFactory.makeAppl(transform._consAssignOr_2, new IStrategoTerm[]{t_26.value, j_33});
                if(true)
                  break Success299;
              }
            }
            term = term166;
            IStrategoTerm term167 = term;
            Success300:
            { 
              Fail450:
              { 
                IStrategoTerm d_29 = null;
                d_29 = term;
                if(i_27.value == null)
                  break Fail450;
                term = or_2_0.instance.invoke(context, i_27.value, lifted50.instance, lifted51.instance);
                if(term == null)
                  break Fail450;
                term = d_29;
                { 
                  if(h_27.value == null)
                    break Fail446;
                  term = h_27.value;
                  lifted52 lifted520 = new lifted52();
                  lifted520.b_26 = b_26;
                  lifted520.c_26 = c_26;
                  lifted520.d_26 = d_26;
                  lifted520.e_26 = e_26;
                  lifted520.f_26 = f_26;
                  lifted520.g_26 = g_26;
                  lifted520.i_26 = i_26;
                  lifted520.j_26 = j_26;
                  term = SRTS_all.instance.invoke(context, term, lifted520);
                  if(term == null)
                    break Fail446;
                  if(true)
                    break Success300;
                }
              }
              term = term167;
              IStrategoTerm term168 = term;
              Success301:
              { 
                Fail451:
                { 
                  IStrategoTerm e_29 = null;
                  e_29 = term;
                  if(i_27.value == null)
                    break Fail451;
                  term = i_27.value;
                  if(term.getTermType() != IStrategoTerm.APPL || transform._consIf_2 != ((IStrategoAppl)term).getConstructor())
                    break Fail451;
                  if(g_27.value == null)
                    g_27.value = term.getSubterm(0);
                  else
                    if(g_27.value != term.getSubterm(0) && !g_27.value.match(term.getSubterm(0)))
                      break Fail451;
                  if(v_26.value == null)
                    v_26.value = term.getSubterm(1);
                  else
                    if(v_26.value != term.getSubterm(1) && !v_26.value.match(term.getSubterm(1)))
                      break Fail451;
                  term = e_29;
                  { 
                    IStrategoTerm p_33 = null;
                    IStrategoTerm r_33 = null;
                    IStrategoTerm t_33 = null;
                    IStrategoTerm w_33 = null;
                    r_33 = term;
                    if(g_27.value == null)
                      break Fail446;
                    t_33 = g_27.value;
                    term = add_external_impl_0_9.instance.invokeDynamic(context, t_33, NO_STRATEGIES, new IStrategoTerm[]{b_26.value, c_26.value, d_26.value, e_26.value, f_26.value, g_26.value, cool.constBoolean0, i_26.value, j_26.value});
                    if(term == null)
                      break Fail446;
                    p_33 = term;
                    term = r_33;
                    if(v_26.value == null)
                      break Fail446;
                    w_33 = v_26.value;
                    term = add_external_impl_0_9.instance.invokeDynamic(context, w_33, NO_STRATEGIES, new IStrategoTerm[]{b_26.value, c_26.value, d_26.value, e_26.value, f_26.value, g_26.value, cool.constNone0, i_26.value, j_26.value});
                    if(term == null)
                      break Fail446;
                    term = termFactory.makeAppl(transform._consIf_2, new IStrategoTerm[]{p_33, term});
                    if(true)
                      break Success301;
                  }
                }
                term = term168;
                IStrategoTerm term169 = term;
                Success302:
                { 
                  Fail452:
                  { 
                    IStrategoTerm f_29 = null;
                    f_29 = term;
                    if(i_27.value == null)
                      break Fail452;
                    term = i_27.value;
                    if(term.getTermType() != IStrategoTerm.APPL || transform._consIf_3 != ((IStrategoAppl)term).getConstructor())
                      break Fail452;
                    if(g_27.value == null)
                      g_27.value = term.getSubterm(0);
                    else
                      if(g_27.value != term.getSubterm(0) && !g_27.value.match(term.getSubterm(0)))
                        break Fail452;
                    if(v_26.value == null)
                      v_26.value = term.getSubterm(1);
                    else
                      if(v_26.value != term.getSubterm(1) && !v_26.value.match(term.getSubterm(1)))
                        break Fail452;
                    if(w_26.value == null)
                      w_26.value = term.getSubterm(2);
                    else
                      if(w_26.value != term.getSubterm(2) && !w_26.value.match(term.getSubterm(2)))
                        break Fail452;
                    term = f_29;
                    { 
                      IStrategoTerm x_33 = null;
                      IStrategoTerm a_34 = null;
                      IStrategoTerm c_34 = null;
                      IStrategoTerm y_33 = null;
                      IStrategoTerm d_34 = null;
                      IStrategoTerm f_34 = null;
                      IStrategoTerm i_34 = null;
                      a_34 = term;
                      if(g_27.value == null)
                        break Fail446;
                      c_34 = g_27.value;
                      term = add_external_impl_0_9.instance.invokeDynamic(context, c_34, NO_STRATEGIES, new IStrategoTerm[]{b_26.value, c_26.value, d_26.value, e_26.value, f_26.value, g_26.value, cool.constBoolean0, i_26.value, j_26.value});
                      if(term == null)
                        break Fail446;
                      x_33 = term;
                      term = a_34;
                      d_34 = a_34;
                      if(v_26.value == null)
                        break Fail446;
                      f_34 = v_26.value;
                      term = add_external_impl_0_9.instance.invokeDynamic(context, f_34, NO_STRATEGIES, new IStrategoTerm[]{b_26.value, c_26.value, d_26.value, e_26.value, f_26.value, g_26.value, cool.constNone0, i_26.value, j_26.value});
                      if(term == null)
                        break Fail446;
                      y_33 = term;
                      term = d_34;
                      if(w_26.value == null)
                        break Fail446;
                      i_34 = w_26.value;
                      term = add_external_impl_0_9.instance.invokeDynamic(context, i_34, NO_STRATEGIES, new IStrategoTerm[]{b_26.value, c_26.value, d_26.value, e_26.value, f_26.value, g_26.value, cool.constNone0, i_26.value, j_26.value});
                      if(term == null)
                        break Fail446;
                      term = termFactory.makeAppl(transform._consIf_3, new IStrategoTerm[]{x_33, y_33, term});
                      if(true)
                        break Success302;
                    }
                  }
                  term = term169;
                  IStrategoTerm term170 = term;
                  Success303:
                  { 
                    Fail453:
                    { 
                      IStrategoTerm g_29 = null;
                      g_29 = term;
                      if(i_27.value == null)
                        break Fail453;
                      term = i_27.value;
                      if(term.getTermType() != IStrategoTerm.APPL || transform._consAssertStm_1 != ((IStrategoAppl)term).getConstructor())
                        break Fail453;
                      if(g_27.value == null)
                        g_27.value = term.getSubterm(0);
                      else
                        if(g_27.value != term.getSubterm(0) && !g_27.value.match(term.getSubterm(0)))
                          break Fail453;
                      term = g_29;
                      { 
                        IStrategoTerm m_34 = null;
                        if(g_27.value == null)
                          break Fail446;
                        m_34 = g_27.value;
                        term = add_external_impl_0_9.instance.invokeDynamic(context, m_34, NO_STRATEGIES, new IStrategoTerm[]{b_26.value, c_26.value, d_26.value, e_26.value, f_26.value, g_26.value, cool.constBoolean0, i_26.value, j_26.value});
                        if(term == null)
                          break Fail446;
                        term = termFactory.makeAppl(transform._consAssertStm_1, new IStrategoTerm[]{term});
                        if(true)
                          break Success303;
                      }
                    }
                    term = term170;
                    IStrategoTerm term171 = term;
                    Success304:
                    { 
                      Fail454:
                      { 
                        IStrategoTerm h_29 = null;
                        h_29 = term;
                        if(i_27.value == null)
                          break Fail454;
                        term = i_27.value;
                        if(term.getTermType() != IStrategoTerm.APPL || transform._consAssertStm_2 != ((IStrategoAppl)term).getConstructor())
                          break Fail454;
                        if(x_26.value == null)
                          x_26.value = term.getSubterm(0);
                        else
                          if(x_26.value != term.getSubterm(0) && !x_26.value.match(term.getSubterm(0)))
                            break Fail454;
                        if(y_26.value == null)
                          y_26.value = term.getSubterm(1);
                        else
                          if(y_26.value != term.getSubterm(1) && !y_26.value.match(term.getSubterm(1)))
                            break Fail454;
                        term = h_29;
                        { 
                          IStrategoTerm n_34 = null;
                          IStrategoTerm p_34 = null;
                          IStrategoTerm r_34 = null;
                          IStrategoTerm u_34 = null;
                          p_34 = term;
                          if(x_26.value == null)
                            break Fail446;
                          r_34 = x_26.value;
                          term = add_external_impl_0_9.instance.invokeDynamic(context, r_34, NO_STRATEGIES, new IStrategoTerm[]{b_26.value, c_26.value, d_26.value, e_26.value, f_26.value, g_26.value, cool.constBoolean0, i_26.value, j_26.value});
                          if(term == null)
                            break Fail446;
                          n_34 = term;
                          term = p_34;
                          if(y_26.value == null)
                            break Fail446;
                          u_34 = y_26.value;
                          term = add_external_impl_0_9.instance.invokeDynamic(context, u_34, NO_STRATEGIES, new IStrategoTerm[]{b_26.value, c_26.value, d_26.value, e_26.value, f_26.value, g_26.value, cool.constBoolean0, i_26.value, j_26.value});
                          if(term == null)
                            break Fail446;
                          term = termFactory.makeAppl(transform._consAssertStm_2, new IStrategoTerm[]{n_34, term});
                          if(true)
                            break Success304;
                        }
                      }
                      term = term171;
                      IStrategoTerm term172 = term;
                      Success305:
                      { 
                        Fail455:
                        { 
                          IStrategoTerm i_29 = null;
                          i_29 = term;
                          if(i_27.value == null)
                            break Fail455;
                          term = i_27.value;
                          if(term.getTermType() != IStrategoTerm.APPL || transform._consWhile_2 != ((IStrategoAppl)term).getConstructor())
                            break Fail455;
                          if(g_27.value == null)
                            g_27.value = term.getSubterm(0);
                          else
                            if(g_27.value != term.getSubterm(0) && !g_27.value.match(term.getSubterm(0)))
                              break Fail455;
                          if(e_27.value == null)
                            e_27.value = term.getSubterm(1);
                          else
                            if(e_27.value != term.getSubterm(1) && !e_27.value.match(term.getSubterm(1)))
                              break Fail455;
                          term = i_29;
                          { 
                            IStrategoTerm v_34 = null;
                            IStrategoTerm x_34 = null;
                            IStrategoTerm z_34 = null;
                            IStrategoTerm c_35 = null;
                            x_34 = term;
                            if(g_27.value == null)
                              break Fail446;
                            z_34 = g_27.value;
                            term = add_external_impl_0_9.instance.invokeDynamic(context, z_34, NO_STRATEGIES, new IStrategoTerm[]{b_26.value, c_26.value, d_26.value, e_26.value, f_26.value, g_26.value, cool.constBoolean0, i_26.value, j_26.value});
                            if(term == null)
                              break Fail446;
                            v_34 = term;
                            term = x_34;
                            if(e_27.value == null)
                              break Fail446;
                            c_35 = e_27.value;
                            term = add_external_impl_0_9.instance.invokeDynamic(context, c_35, NO_STRATEGIES, new IStrategoTerm[]{b_26.value, c_26.value, d_26.value, e_26.value, f_26.value, g_26.value, cool.constNone0, i_26.value, j_26.value});
                            if(term == null)
                              break Fail446;
                            term = termFactory.makeAppl(transform._consWhile_2, new IStrategoTerm[]{v_34, term});
                            if(true)
                              break Success305;
                          }
                        }
                        term = term172;
                        IStrategoTerm term173 = term;
                        Success306:
                        { 
                          Fail456:
                          { 
                            IStrategoTerm j_29 = null;
                            j_29 = term;
                            if(i_27.value == null)
                              break Fail456;
                            term = i_27.value;
                            if(term.getTermType() != IStrategoTerm.APPL || transform._consDoWhile_2 != ((IStrategoAppl)term).getConstructor())
                              break Fail456;
                            if(e_27.value == null)
                              e_27.value = term.getSubterm(0);
                            else
                              if(e_27.value != term.getSubterm(0) && !e_27.value.match(term.getSubterm(0)))
                                break Fail456;
                            if(g_27.value == null)
                              g_27.value = term.getSubterm(1);
                            else
                              if(g_27.value != term.getSubterm(1) && !g_27.value.match(term.getSubterm(1)))
                                break Fail456;
                            term = j_29;
                            { 
                              IStrategoTerm d_35 = null;
                              IStrategoTerm f_35 = null;
                              IStrategoTerm h_35 = null;
                              IStrategoTerm k_35 = null;
                              f_35 = term;
                              if(e_27.value == null)
                                break Fail446;
                              h_35 = e_27.value;
                              term = add_external_impl_0_9.instance.invokeDynamic(context, h_35, NO_STRATEGIES, new IStrategoTerm[]{b_26.value, c_26.value, d_26.value, e_26.value, f_26.value, g_26.value, cool.constNone0, i_26.value, j_26.value});
                              if(term == null)
                                break Fail446;
                              d_35 = term;
                              term = f_35;
                              if(g_27.value == null)
                                break Fail446;
                              k_35 = g_27.value;
                              term = add_external_impl_0_9.instance.invokeDynamic(context, k_35, NO_STRATEGIES, new IStrategoTerm[]{b_26.value, c_26.value, d_26.value, e_26.value, f_26.value, g_26.value, cool.constBoolean0, i_26.value, j_26.value});
                              if(term == null)
                                break Fail446;
                              term = termFactory.makeAppl(transform._consDoWhile_2, new IStrategoTerm[]{d_35, term});
                              if(true)
                                break Success306;
                            }
                          }
                          term = term173;
                          IStrategoTerm term174 = term;
                          Success307:
                          { 
                            Fail457:
                            { 
                              IStrategoTerm k_29 = null;
                              k_29 = term;
                              if(i_27.value == null)
                                break Fail457;
                              term = i_27.value;
                              if(term.getTermType() != IStrategoTerm.APPL || transform._consFor_4 != ((IStrategoAppl)term).getConstructor())
                                break Fail457;
                              if(z_26.value == null)
                                z_26.value = term.getSubterm(0);
                              else
                                if(z_26.value != term.getSubterm(0) && !z_26.value.match(term.getSubterm(0)))
                                  break Fail457;
                              if(g_27.value == null)
                                g_27.value = term.getSubterm(1);
                              else
                                if(g_27.value != term.getSubterm(1) && !g_27.value.match(term.getSubterm(1)))
                                  break Fail457;
                              if(a_27.value == null)
                                a_27.value = term.getSubterm(2);
                              else
                                if(a_27.value != term.getSubterm(2) && !a_27.value.match(term.getSubterm(2)))
                                  break Fail457;
                              if(e_27.value == null)
                                e_27.value = term.getSubterm(3);
                              else
                                if(e_27.value != term.getSubterm(3) && !e_27.value.match(term.getSubterm(3)))
                                  break Fail457;
                              term = k_29;
                              { 
                                IStrategoTerm l_35 = null;
                                IStrategoTerm p_35 = null;
                                IStrategoTerm r_35 = null;
                                IStrategoTerm m_35 = null;
                                IStrategoTerm s_35 = null;
                                IStrategoTerm u_35 = null;
                                IStrategoTerm n_35 = null;
                                IStrategoTerm v_35 = null;
                                IStrategoTerm x_35 = null;
                                IStrategoTerm a_36 = null;
                                p_35 = term;
                                if(z_26.value == null)
                                  break Fail446;
                                r_35 = z_26.value;
                                term = add_external_impl_0_9.instance.invokeDynamic(context, r_35, NO_STRATEGIES, new IStrategoTerm[]{b_26.value, c_26.value, d_26.value, e_26.value, f_26.value, g_26.value, cool.constNone0, i_26.value, j_26.value});
                                if(term == null)
                                  break Fail446;
                                l_35 = term;
                                term = p_35;
                                s_35 = p_35;
                                if(g_27.value == null)
                                  break Fail446;
                                u_35 = g_27.value;
                                term = add_external_impl_0_9.instance.invokeDynamic(context, u_35, NO_STRATEGIES, new IStrategoTerm[]{b_26.value, c_26.value, d_26.value, e_26.value, f_26.value, g_26.value, cool.constBoolean0, i_26.value, j_26.value});
                                if(term == null)
                                  break Fail446;
                                m_35 = term;
                                term = s_35;
                                v_35 = s_35;
                                if(a_27.value == null)
                                  break Fail446;
                                x_35 = a_27.value;
                                term = add_external_impl_0_9.instance.invokeDynamic(context, x_35, NO_STRATEGIES, new IStrategoTerm[]{b_26.value, c_26.value, d_26.value, e_26.value, f_26.value, g_26.value, cool.constNone0, i_26.value, j_26.value});
                                if(term == null)
                                  break Fail446;
                                n_35 = term;
                                term = v_35;
                                if(e_27.value == null)
                                  break Fail446;
                                a_36 = e_27.value;
                                term = add_external_impl_0_9.instance.invokeDynamic(context, a_36, NO_STRATEGIES, new IStrategoTerm[]{b_26.value, c_26.value, d_26.value, e_26.value, f_26.value, g_26.value, cool.constNone0, i_26.value, j_26.value});
                                if(term == null)
                                  break Fail446;
                                term = termFactory.makeAppl(transform._consFor_4, new IStrategoTerm[]{l_35, m_35, n_35, term});
                                if(true)
                                  break Success307;
                              }
                            }
                            term = term174;
                            IStrategoTerm term175 = term;
                            Success308:
                            { 
                              Fail458:
                              { 
                                IStrategoTerm l_29 = null;
                                l_29 = term;
                                if(i_27.value == null)
                                  break Fail458;
                                term = i_27.value;
                                if(term.getTermType() != IStrategoTerm.APPL || transform._consFor_4 != ((IStrategoAppl)term).getConstructor())
                                  break Fail458;
                                if(b_27.value == null)
                                  b_27.value = term.getSubterm(0);
                                else
                                  if(b_27.value != term.getSubterm(0) && !b_27.value.match(term.getSubterm(0)))
                                    break Fail458;
                                if(g_27.value == null)
                                  g_27.value = term.getSubterm(1);
                                else
                                  if(g_27.value != term.getSubterm(1) && !g_27.value.match(term.getSubterm(1)))
                                    break Fail458;
                                if(c_27.value == null)
                                  c_27.value = term.getSubterm(2);
                                else
                                  if(c_27.value != term.getSubterm(2) && !c_27.value.match(term.getSubterm(2)))
                                    break Fail458;
                                if(e_27.value == null)
                                  e_27.value = term.getSubterm(3);
                                else
                                  if(e_27.value != term.getSubterm(3) && !e_27.value.match(term.getSubterm(3)))
                                    break Fail458;
                                term = l_29;
                                { 
                                  IStrategoTerm b_36 = null;
                                  IStrategoTerm f_36 = null;
                                  IStrategoTerm h_36 = null;
                                  IStrategoTerm c_36 = null;
                                  IStrategoTerm i_36 = null;
                                  IStrategoTerm k_36 = null;
                                  IStrategoTerm d_36 = null;
                                  IStrategoTerm l_36 = null;
                                  IStrategoTerm n_36 = null;
                                  IStrategoTerm q_36 = null;
                                  f_36 = term;
                                  if(b_27.value == null)
                                    break Fail446;
                                  h_36 = b_27.value;
                                  term = add_external_impl_0_9.instance.invokeDynamic(context, h_36, NO_STRATEGIES, new IStrategoTerm[]{b_26.value, c_26.value, d_26.value, e_26.value, f_26.value, g_26.value, cool.constNone0, i_26.value, j_26.value});
                                  if(term == null)
                                    break Fail446;
                                  b_36 = term;
                                  term = f_36;
                                  i_36 = f_36;
                                  if(g_27.value == null)
                                    break Fail446;
                                  k_36 = g_27.value;
                                  term = add_external_impl_0_9.instance.invokeDynamic(context, k_36, NO_STRATEGIES, new IStrategoTerm[]{b_26.value, c_26.value, d_26.value, e_26.value, f_26.value, g_26.value, cool.constBoolean0, i_26.value, j_26.value});
                                  if(term == null)
                                    break Fail446;
                                  c_36 = term;
                                  term = i_36;
                                  l_36 = i_36;
                                  if(c_27.value == null)
                                    break Fail446;
                                  n_36 = c_27.value;
                                  term = add_external_impl_0_9.instance.invokeDynamic(context, n_36, NO_STRATEGIES, new IStrategoTerm[]{b_26.value, c_26.value, d_26.value, e_26.value, f_26.value, g_26.value, cool.constNone0, i_26.value, j_26.value});
                                  if(term == null)
                                    break Fail446;
                                  d_36 = term;
                                  term = l_36;
                                  if(e_27.value == null)
                                    break Fail446;
                                  q_36 = e_27.value;
                                  term = add_external_impl_0_9.instance.invokeDynamic(context, q_36, NO_STRATEGIES, new IStrategoTerm[]{b_26.value, c_26.value, d_26.value, e_26.value, f_26.value, g_26.value, cool.constNone0, i_26.value, j_26.value});
                                  if(term == null)
                                    break Fail446;
                                  term = termFactory.makeAppl(transform._consFor_4, new IStrategoTerm[]{b_36, c_36, d_36, term});
                                  if(true)
                                    break Success308;
                                }
                              }
                              term = term175;
                              IStrategoTerm term176 = term;
                              Success309:
                              { 
                                Fail459:
                                { 
                                  IStrategoTerm m_29 = null;
                                  m_29 = term;
                                  if(i_27.value == null)
                                    break Fail459;
                                  term = i_27.value;
                                  if(term.getTermType() != IStrategoTerm.APPL || transform._consForEach_3 != ((IStrategoAppl)term).getConstructor())
                                    break Fail459;
                                  if(d_27.value == null)
                                    d_27.value = term.getSubterm(0);
                                  else
                                    if(d_27.value != term.getSubterm(0) && !d_27.value.match(term.getSubterm(0)))
                                      break Fail459;
                                  if(g_27.value == null)
                                    g_27.value = term.getSubterm(1);
                                  else
                                    if(g_27.value != term.getSubterm(1) && !g_27.value.match(term.getSubterm(1)))
                                      break Fail459;
                                  if(e_27.value == null)
                                    e_27.value = term.getSubterm(2);
                                  else
                                    if(e_27.value != term.getSubterm(2) && !e_27.value.match(term.getSubterm(2)))
                                      break Fail459;
                                  term = m_29;
                                  { 
                                    IStrategoTerm r_36 = null;
                                    IStrategoTerm u_36 = null;
                                    IStrategoTerm w_36 = null;
                                    IStrategoTerm s_36 = null;
                                    IStrategoTerm x_36 = null;
                                    IStrategoTerm z_36 = null;
                                    IStrategoTerm c_37 = null;
                                    u_36 = term;
                                    if(d_27.value == null)
                                      break Fail446;
                                    w_36 = d_27.value;
                                    term = add_external_impl_0_9.instance.invokeDynamic(context, w_36, NO_STRATEGIES, new IStrategoTerm[]{b_26.value, c_26.value, d_26.value, e_26.value, f_26.value, g_26.value, cool.constNone0, i_26.value, j_26.value});
                                    if(term == null)
                                      break Fail446;
                                    r_36 = term;
                                    term = u_36;
                                    x_36 = u_36;
                                    if(g_27.value == null)
                                      break Fail446;
                                    z_36 = g_27.value;
                                    term = add_external_impl_0_9.instance.invokeDynamic(context, z_36, NO_STRATEGIES, new IStrategoTerm[]{b_26.value, c_26.value, d_26.value, e_26.value, f_26.value, g_26.value, cool.constNone0, i_26.value, j_26.value});
                                    if(term == null)
                                      break Fail446;
                                    s_36 = term;
                                    term = x_36;
                                    if(e_27.value == null)
                                      break Fail446;
                                    c_37 = e_27.value;
                                    term = add_external_impl_0_9.instance.invokeDynamic(context, c_37, NO_STRATEGIES, new IStrategoTerm[]{b_26.value, c_26.value, d_26.value, e_26.value, f_26.value, g_26.value, cool.constNone0, i_26.value, j_26.value});
                                    if(term == null)
                                      break Fail446;
                                    term = termFactory.makeAppl(transform._consForEach_3, new IStrategoTerm[]{r_36, s_36, term});
                                    if(true)
                                      break Success309;
                                  }
                                }
                                term = term176;
                                IStrategoTerm term177 = term;
                                Success310:
                                { 
                                  Fail460:
                                  { 
                                    IStrategoTerm n_29 = null;
                                    n_29 = term;
                                    if(i_27.value == null)
                                      break Fail460;
                                    term = i_27.value;
                                    if(term.getTermType() != IStrategoTerm.APPL || transform._consCastPrim_2 != ((IStrategoAppl)term).getConstructor())
                                      break Fail460;
                                    if(f_27.value == null)
                                      f_27.value = term.getSubterm(0);
                                    else
                                      if(f_27.value != term.getSubterm(0) && !f_27.value.match(term.getSubterm(0)))
                                        break Fail460;
                                    if(g_27.value == null)
                                      g_27.value = term.getSubterm(1);
                                    else
                                      if(g_27.value != term.getSubterm(1) && !g_27.value.match(term.getSubterm(1)))
                                        break Fail460;
                                    term = n_29;
                                    { 
                                      IStrategoTerm d_37 = null;
                                      IStrategoTerm e_37 = null;
                                      IStrategoTerm g_37 = null;
                                      e_37 = term;
                                      if(g_27.value == null)
                                        break Fail446;
                                      g_37 = g_27.value;
                                      term = add_external_impl_0_9.instance.invokeDynamic(context, g_37, NO_STRATEGIES, new IStrategoTerm[]{b_26.value, c_26.value, d_26.value, e_26.value, f_26.value, g_26.value, cool.constNone0, i_26.value, j_26.value});
                                      if(term == null)
                                        break Fail446;
                                      d_37 = term;
                                      term = e_37;
                                      if(f_27.value == null)
                                        break Fail446;
                                      term = termFactory.makeAppl(transform._consCastPrim_2, new IStrategoTerm[]{f_27.value, d_37});
                                      if(true)
                                        break Success310;
                                    }
                                  }
                                  term = term177;
                                  IStrategoTerm term178 = term;
                                  Success311:
                                  { 
                                    Fail461:
                                    { 
                                      IStrategoTerm o_29 = null;
                                      o_29 = term;
                                      if(i_27.value == null)
                                        break Fail461;
                                      term = i_27.value;
                                      if(term.getTermType() != IStrategoTerm.APPL || transform._consCastRef_2 != ((IStrategoAppl)term).getConstructor())
                                        break Fail461;
                                      if(f_27.value == null)
                                        f_27.value = term.getSubterm(0);
                                      else
                                        if(f_27.value != term.getSubterm(0) && !f_27.value.match(term.getSubterm(0)))
                                          break Fail461;
                                      if(g_27.value == null)
                                        g_27.value = term.getSubterm(1);
                                      else
                                        if(g_27.value != term.getSubterm(1) && !g_27.value.match(term.getSubterm(1)))
                                          break Fail461;
                                      term = o_29;
                                      { 
                                        IStrategoTerm h_37 = null;
                                        IStrategoTerm i_37 = null;
                                        IStrategoTerm k_37 = null;
                                        i_37 = term;
                                        if(g_27.value == null)
                                          break Fail446;
                                        k_37 = g_27.value;
                                        term = add_external_impl_0_9.instance.invokeDynamic(context, k_37, NO_STRATEGIES, new IStrategoTerm[]{b_26.value, c_26.value, d_26.value, e_26.value, f_26.value, g_26.value, cool.constNone0, i_26.value, j_26.value});
                                        if(term == null)
                                          break Fail446;
                                        h_37 = term;
                                        term = i_37;
                                        if(f_27.value == null)
                                          break Fail446;
                                        term = termFactory.makeAppl(transform._consCastRef_2, new IStrategoTerm[]{f_27.value, h_37});
                                        if(true)
                                          break Success311;
                                      }
                                    }
                                    term = term178;
                                    if(h_27.value == null)
                                      break Fail446;
                                    term = h_27.value;
                                    lifted53 lifted530 = new lifted53();
                                    lifted530.b_26 = b_26;
                                    lifted530.c_26 = c_26;
                                    lifted530.d_26 = d_26;
                                    lifted530.e_26 = e_26;
                                    lifted530.f_26 = f_26;
                                    lifted530.g_26 = g_26;
                                    lifted530.h_26 = h_26;
                                    lifted530.i_26 = i_26;
                                    lifted530.j_26 = j_26;
                                    term = SRTS_all.instance.invoke(context, term, lifted530);
                                    if(term == null)
                                      break Fail446;
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