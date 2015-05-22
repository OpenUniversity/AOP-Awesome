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
    Fail342:
    { 
      IStrategoTerm term58 = term;
      Success196:
      { 
        Fail343:
        { 
          IStrategoTerm b_13 = null;
          b_13 = term;
          if(j_11.value == null)
            break Fail343;
          term = j_11.value;
          if(term.getTermType() != IStrategoTerm.APPL || transform._consAssignAnd_2 != ((IStrategoAppl)term).getConstructor())
            break Fail343;
          if(u_10.value == null)
            u_10.value = term.getSubterm(0);
          else
            if(u_10.value != term.getSubterm(0) && !u_10.value.match(term.getSubterm(0)))
              break Fail343;
          if(h_11.value == null)
            h_11.value = term.getSubterm(1);
          else
            if(h_11.value != term.getSubterm(1) && !h_11.value.match(term.getSubterm(1)))
              break Fail343;
          term = b_13;
          { 
            IStrategoTerm c_17 = null;
            IStrategoTerm d_17 = null;
            IStrategoTerm f_17 = null;
            if(u_10.value == null)
              break Fail342;
            term = get_$L$H$S_type_0_3.instance.invoke(context, u_10.value, i_10.value, c_10.value, d_10.value);
            if(term == null)
              break Fail342;
            if(v_10.value == null)
              v_10.value = term;
            else
              if(v_10.value != term && !v_10.value.match(term))
                break Fail342;
            d_17 = term;
            if(h_11.value == null)
              break Fail342;
            term = h_11.value;
            f_17 = h_11.value;
            if(v_10.value == null)
              break Fail342;
            term = cast_bounded_conditional_type_0_0.instance.invoke(context, v_10.value);
            if(term == null)
              break Fail342;
            term = add_external_impl_0_9.instance.invokeDynamic(context, f_17, NO_STRATEGIES, new IStrategoTerm[]{c_10.value, d_10.value, e_10.value, f_10.value, g_10.value, h_10.value, term, j_10.value, k_10.value});
            if(term == null)
              break Fail342;
            c_17 = term;
            term = d_17;
            if(u_10.value == null)
              break Fail342;
            term = termFactory.makeAppl(transform._consAssignAnd_2, new IStrategoTerm[]{u_10.value, c_17});
            if(true)
              break Success196;
          }
        }
        term = term58;
        IStrategoTerm term59 = term;
        Success197:
        { 
          Fail344:
          { 
            IStrategoTerm c_13 = null;
            c_13 = term;
            if(j_11.value == null)
              break Fail344;
            term = j_11.value;
            if(term.getTermType() != IStrategoTerm.APPL || transform._consAssignExcOr_2 != ((IStrategoAppl)term).getConstructor())
              break Fail344;
            if(u_10.value == null)
              u_10.value = term.getSubterm(0);
            else
              if(u_10.value != term.getSubterm(0) && !u_10.value.match(term.getSubterm(0)))
                break Fail344;
            if(h_11.value == null)
              h_11.value = term.getSubterm(1);
            else
              if(h_11.value != term.getSubterm(1) && !h_11.value.match(term.getSubterm(1)))
                break Fail344;
            term = c_13;
            { 
              IStrategoTerm g_17 = null;
              IStrategoTerm h_17 = null;
              IStrategoTerm j_17 = null;
              if(u_10.value == null)
                break Fail342;
              term = get_$L$H$S_type_0_3.instance.invoke(context, u_10.value, i_10.value, c_10.value, d_10.value);
              if(term == null)
                break Fail342;
              if(v_10.value == null)
                v_10.value = term;
              else
                if(v_10.value != term && !v_10.value.match(term))
                  break Fail342;
              h_17 = term;
              if(h_11.value == null)
                break Fail342;
              term = h_11.value;
              j_17 = h_11.value;
              if(v_10.value == null)
                break Fail342;
              term = cast_bounded_conditional_type_0_0.instance.invoke(context, v_10.value);
              if(term == null)
                break Fail342;
              term = add_external_impl_0_9.instance.invokeDynamic(context, j_17, NO_STRATEGIES, new IStrategoTerm[]{c_10.value, d_10.value, e_10.value, f_10.value, g_10.value, h_10.value, term, j_10.value, k_10.value});
              if(term == null)
                break Fail342;
              g_17 = term;
              term = h_17;
              if(u_10.value == null)
                break Fail342;
              term = termFactory.makeAppl(transform._consAssignExcOr_2, new IStrategoTerm[]{u_10.value, g_17});
              if(true)
                break Success197;
            }
          }
          term = term59;
          IStrategoTerm term60 = term;
          Success198:
          { 
            Fail345:
            { 
              IStrategoTerm d_13 = null;
              d_13 = term;
              if(j_11.value == null)
                break Fail345;
              term = j_11.value;
              if(term.getTermType() != IStrategoTerm.APPL || transform._consAssignOr_2 != ((IStrategoAppl)term).getConstructor())
                break Fail345;
              if(u_10.value == null)
                u_10.value = term.getSubterm(0);
              else
                if(u_10.value != term.getSubterm(0) && !u_10.value.match(term.getSubterm(0)))
                  break Fail345;
              if(h_11.value == null)
                h_11.value = term.getSubterm(1);
              else
                if(h_11.value != term.getSubterm(1) && !h_11.value.match(term.getSubterm(1)))
                  break Fail345;
              term = d_13;
              { 
                IStrategoTerm k_17 = null;
                IStrategoTerm l_17 = null;
                IStrategoTerm n_17 = null;
                if(u_10.value == null)
                  break Fail342;
                term = get_$L$H$S_type_0_3.instance.invoke(context, u_10.value, i_10.value, c_10.value, d_10.value);
                if(term == null)
                  break Fail342;
                if(v_10.value == null)
                  v_10.value = term;
                else
                  if(v_10.value != term && !v_10.value.match(term))
                    break Fail342;
                l_17 = term;
                if(h_11.value == null)
                  break Fail342;
                term = h_11.value;
                n_17 = h_11.value;
                if(v_10.value == null)
                  break Fail342;
                term = cast_bounded_conditional_type_0_0.instance.invoke(context, v_10.value);
                if(term == null)
                  break Fail342;
                term = add_external_impl_0_9.instance.invokeDynamic(context, n_17, NO_STRATEGIES, new IStrategoTerm[]{c_10.value, d_10.value, e_10.value, f_10.value, g_10.value, h_10.value, term, j_10.value, k_10.value});
                if(term == null)
                  break Fail342;
                k_17 = term;
                term = l_17;
                if(u_10.value == null)
                  break Fail342;
                term = termFactory.makeAppl(transform._consAssignOr_2, new IStrategoTerm[]{u_10.value, k_17});
                if(true)
                  break Success198;
              }
            }
            term = term60;
            IStrategoTerm term61 = term;
            Success199:
            { 
              Fail346:
              { 
                IStrategoTerm e_13 = null;
                e_13 = term;
                if(j_11.value == null)
                  break Fail346;
                term = or_2_0.instance.invoke(context, j_11.value, lifted46.instance, lifted47.instance);
                if(term == null)
                  break Fail346;
                term = e_13;
                { 
                  if(i_11.value == null)
                    break Fail342;
                  term = i_11.value;
                  lifted48 lifted480 = new lifted48();
                  lifted480.c_10 = c_10;
                  lifted480.d_10 = d_10;
                  lifted480.e_10 = e_10;
                  lifted480.f_10 = f_10;
                  lifted480.g_10 = g_10;
                  lifted480.h_10 = h_10;
                  lifted480.j_10 = j_10;
                  lifted480.k_10 = k_10;
                  term = SRTS_all.instance.invoke(context, term, lifted480);
                  if(term == null)
                    break Fail342;
                  if(true)
                    break Success199;
                }
              }
              term = term61;
              IStrategoTerm term62 = term;
              Success200:
              { 
                Fail347:
                { 
                  IStrategoTerm f_13 = null;
                  f_13 = term;
                  if(j_11.value == null)
                    break Fail347;
                  term = j_11.value;
                  if(term.getTermType() != IStrategoTerm.APPL || transform._consIf_2 != ((IStrategoAppl)term).getConstructor())
                    break Fail347;
                  if(h_11.value == null)
                    h_11.value = term.getSubterm(0);
                  else
                    if(h_11.value != term.getSubterm(0) && !h_11.value.match(term.getSubterm(0)))
                      break Fail347;
                  if(w_10.value == null)
                    w_10.value = term.getSubterm(1);
                  else
                    if(w_10.value != term.getSubterm(1) && !w_10.value.match(term.getSubterm(1)))
                      break Fail347;
                  term = f_13;
                  { 
                    IStrategoTerm q_17 = null;
                    IStrategoTerm s_17 = null;
                    IStrategoTerm u_17 = null;
                    IStrategoTerm x_17 = null;
                    s_17 = term;
                    if(h_11.value == null)
                      break Fail342;
                    u_17 = h_11.value;
                    term = add_external_impl_0_9.instance.invokeDynamic(context, u_17, NO_STRATEGIES, new IStrategoTerm[]{c_10.value, d_10.value, e_10.value, f_10.value, g_10.value, h_10.value, cool.constBoolean0, j_10.value, k_10.value});
                    if(term == null)
                      break Fail342;
                    q_17 = term;
                    term = s_17;
                    if(w_10.value == null)
                      break Fail342;
                    x_17 = w_10.value;
                    term = add_external_impl_0_9.instance.invokeDynamic(context, x_17, NO_STRATEGIES, new IStrategoTerm[]{c_10.value, d_10.value, e_10.value, f_10.value, g_10.value, h_10.value, cool.constNone0, j_10.value, k_10.value});
                    if(term == null)
                      break Fail342;
                    term = termFactory.makeAppl(transform._consIf_2, new IStrategoTerm[]{q_17, term});
                    if(true)
                      break Success200;
                  }
                }
                term = term62;
                IStrategoTerm term63 = term;
                Success201:
                { 
                  Fail348:
                  { 
                    IStrategoTerm g_13 = null;
                    g_13 = term;
                    if(j_11.value == null)
                      break Fail348;
                    term = j_11.value;
                    if(term.getTermType() != IStrategoTerm.APPL || transform._consIf_3 != ((IStrategoAppl)term).getConstructor())
                      break Fail348;
                    if(h_11.value == null)
                      h_11.value = term.getSubterm(0);
                    else
                      if(h_11.value != term.getSubterm(0) && !h_11.value.match(term.getSubterm(0)))
                        break Fail348;
                    if(w_10.value == null)
                      w_10.value = term.getSubterm(1);
                    else
                      if(w_10.value != term.getSubterm(1) && !w_10.value.match(term.getSubterm(1)))
                        break Fail348;
                    if(x_10.value == null)
                      x_10.value = term.getSubterm(2);
                    else
                      if(x_10.value != term.getSubterm(2) && !x_10.value.match(term.getSubterm(2)))
                        break Fail348;
                    term = g_13;
                    { 
                      IStrategoTerm y_17 = null;
                      IStrategoTerm b_18 = null;
                      IStrategoTerm d_18 = null;
                      IStrategoTerm z_17 = null;
                      IStrategoTerm e_18 = null;
                      IStrategoTerm g_18 = null;
                      IStrategoTerm j_18 = null;
                      b_18 = term;
                      if(h_11.value == null)
                        break Fail342;
                      d_18 = h_11.value;
                      term = add_external_impl_0_9.instance.invokeDynamic(context, d_18, NO_STRATEGIES, new IStrategoTerm[]{c_10.value, d_10.value, e_10.value, f_10.value, g_10.value, h_10.value, cool.constBoolean0, j_10.value, k_10.value});
                      if(term == null)
                        break Fail342;
                      y_17 = term;
                      term = b_18;
                      e_18 = b_18;
                      if(w_10.value == null)
                        break Fail342;
                      g_18 = w_10.value;
                      term = add_external_impl_0_9.instance.invokeDynamic(context, g_18, NO_STRATEGIES, new IStrategoTerm[]{c_10.value, d_10.value, e_10.value, f_10.value, g_10.value, h_10.value, cool.constNone0, j_10.value, k_10.value});
                      if(term == null)
                        break Fail342;
                      z_17 = term;
                      term = e_18;
                      if(x_10.value == null)
                        break Fail342;
                      j_18 = x_10.value;
                      term = add_external_impl_0_9.instance.invokeDynamic(context, j_18, NO_STRATEGIES, new IStrategoTerm[]{c_10.value, d_10.value, e_10.value, f_10.value, g_10.value, h_10.value, cool.constNone0, j_10.value, k_10.value});
                      if(term == null)
                        break Fail342;
                      term = termFactory.makeAppl(transform._consIf_3, new IStrategoTerm[]{y_17, z_17, term});
                      if(true)
                        break Success201;
                    }
                  }
                  term = term63;
                  IStrategoTerm term64 = term;
                  Success202:
                  { 
                    Fail349:
                    { 
                      IStrategoTerm h_13 = null;
                      h_13 = term;
                      if(j_11.value == null)
                        break Fail349;
                      term = j_11.value;
                      if(term.getTermType() != IStrategoTerm.APPL || transform._consAssertStm_1 != ((IStrategoAppl)term).getConstructor())
                        break Fail349;
                      if(h_11.value == null)
                        h_11.value = term.getSubterm(0);
                      else
                        if(h_11.value != term.getSubterm(0) && !h_11.value.match(term.getSubterm(0)))
                          break Fail349;
                      term = h_13;
                      { 
                        IStrategoTerm n_18 = null;
                        if(h_11.value == null)
                          break Fail342;
                        n_18 = h_11.value;
                        term = add_external_impl_0_9.instance.invokeDynamic(context, n_18, NO_STRATEGIES, new IStrategoTerm[]{c_10.value, d_10.value, e_10.value, f_10.value, g_10.value, h_10.value, cool.constBoolean0, j_10.value, k_10.value});
                        if(term == null)
                          break Fail342;
                        term = termFactory.makeAppl(transform._consAssertStm_1, new IStrategoTerm[]{term});
                        if(true)
                          break Success202;
                      }
                    }
                    term = term64;
                    IStrategoTerm term65 = term;
                    Success203:
                    { 
                      Fail350:
                      { 
                        IStrategoTerm i_13 = null;
                        i_13 = term;
                        if(j_11.value == null)
                          break Fail350;
                        term = j_11.value;
                        if(term.getTermType() != IStrategoTerm.APPL || transform._consAssertStm_2 != ((IStrategoAppl)term).getConstructor())
                          break Fail350;
                        if(y_10.value == null)
                          y_10.value = term.getSubterm(0);
                        else
                          if(y_10.value != term.getSubterm(0) && !y_10.value.match(term.getSubterm(0)))
                            break Fail350;
                        if(z_10.value == null)
                          z_10.value = term.getSubterm(1);
                        else
                          if(z_10.value != term.getSubterm(1) && !z_10.value.match(term.getSubterm(1)))
                            break Fail350;
                        term = i_13;
                        { 
                          IStrategoTerm o_18 = null;
                          IStrategoTerm q_18 = null;
                          IStrategoTerm s_18 = null;
                          IStrategoTerm v_18 = null;
                          q_18 = term;
                          if(y_10.value == null)
                            break Fail342;
                          s_18 = y_10.value;
                          term = add_external_impl_0_9.instance.invokeDynamic(context, s_18, NO_STRATEGIES, new IStrategoTerm[]{c_10.value, d_10.value, e_10.value, f_10.value, g_10.value, h_10.value, cool.constBoolean0, j_10.value, k_10.value});
                          if(term == null)
                            break Fail342;
                          o_18 = term;
                          term = q_18;
                          if(z_10.value == null)
                            break Fail342;
                          v_18 = z_10.value;
                          term = add_external_impl_0_9.instance.invokeDynamic(context, v_18, NO_STRATEGIES, new IStrategoTerm[]{c_10.value, d_10.value, e_10.value, f_10.value, g_10.value, h_10.value, cool.constBoolean0, j_10.value, k_10.value});
                          if(term == null)
                            break Fail342;
                          term = termFactory.makeAppl(transform._consAssertStm_2, new IStrategoTerm[]{o_18, term});
                          if(true)
                            break Success203;
                        }
                      }
                      term = term65;
                      IStrategoTerm term66 = term;
                      Success204:
                      { 
                        Fail351:
                        { 
                          IStrategoTerm j_13 = null;
                          j_13 = term;
                          if(j_11.value == null)
                            break Fail351;
                          term = j_11.value;
                          if(term.getTermType() != IStrategoTerm.APPL || transform._consWhile_2 != ((IStrategoAppl)term).getConstructor())
                            break Fail351;
                          if(h_11.value == null)
                            h_11.value = term.getSubterm(0);
                          else
                            if(h_11.value != term.getSubterm(0) && !h_11.value.match(term.getSubterm(0)))
                              break Fail351;
                          if(f_11.value == null)
                            f_11.value = term.getSubterm(1);
                          else
                            if(f_11.value != term.getSubterm(1) && !f_11.value.match(term.getSubterm(1)))
                              break Fail351;
                          term = j_13;
                          { 
                            IStrategoTerm w_18 = null;
                            IStrategoTerm y_18 = null;
                            IStrategoTerm a_19 = null;
                            IStrategoTerm d_19 = null;
                            y_18 = term;
                            if(h_11.value == null)
                              break Fail342;
                            a_19 = h_11.value;
                            term = add_external_impl_0_9.instance.invokeDynamic(context, a_19, NO_STRATEGIES, new IStrategoTerm[]{c_10.value, d_10.value, e_10.value, f_10.value, g_10.value, h_10.value, cool.constBoolean0, j_10.value, k_10.value});
                            if(term == null)
                              break Fail342;
                            w_18 = term;
                            term = y_18;
                            if(f_11.value == null)
                              break Fail342;
                            d_19 = f_11.value;
                            term = add_external_impl_0_9.instance.invokeDynamic(context, d_19, NO_STRATEGIES, new IStrategoTerm[]{c_10.value, d_10.value, e_10.value, f_10.value, g_10.value, h_10.value, cool.constNone0, j_10.value, k_10.value});
                            if(term == null)
                              break Fail342;
                            term = termFactory.makeAppl(transform._consWhile_2, new IStrategoTerm[]{w_18, term});
                            if(true)
                              break Success204;
                          }
                        }
                        term = term66;
                        IStrategoTerm term67 = term;
                        Success205:
                        { 
                          Fail352:
                          { 
                            IStrategoTerm k_13 = null;
                            k_13 = term;
                            if(j_11.value == null)
                              break Fail352;
                            term = j_11.value;
                            if(term.getTermType() != IStrategoTerm.APPL || transform._consDoWhile_2 != ((IStrategoAppl)term).getConstructor())
                              break Fail352;
                            if(f_11.value == null)
                              f_11.value = term.getSubterm(0);
                            else
                              if(f_11.value != term.getSubterm(0) && !f_11.value.match(term.getSubterm(0)))
                                break Fail352;
                            if(h_11.value == null)
                              h_11.value = term.getSubterm(1);
                            else
                              if(h_11.value != term.getSubterm(1) && !h_11.value.match(term.getSubterm(1)))
                                break Fail352;
                            term = k_13;
                            { 
                              IStrategoTerm e_19 = null;
                              IStrategoTerm g_19 = null;
                              IStrategoTerm i_19 = null;
                              IStrategoTerm l_19 = null;
                              g_19 = term;
                              if(f_11.value == null)
                                break Fail342;
                              i_19 = f_11.value;
                              term = add_external_impl_0_9.instance.invokeDynamic(context, i_19, NO_STRATEGIES, new IStrategoTerm[]{c_10.value, d_10.value, e_10.value, f_10.value, g_10.value, h_10.value, cool.constNone0, j_10.value, k_10.value});
                              if(term == null)
                                break Fail342;
                              e_19 = term;
                              term = g_19;
                              if(h_11.value == null)
                                break Fail342;
                              l_19 = h_11.value;
                              term = add_external_impl_0_9.instance.invokeDynamic(context, l_19, NO_STRATEGIES, new IStrategoTerm[]{c_10.value, d_10.value, e_10.value, f_10.value, g_10.value, h_10.value, cool.constBoolean0, j_10.value, k_10.value});
                              if(term == null)
                                break Fail342;
                              term = termFactory.makeAppl(transform._consDoWhile_2, new IStrategoTerm[]{e_19, term});
                              if(true)
                                break Success205;
                            }
                          }
                          term = term67;
                          IStrategoTerm term68 = term;
                          Success206:
                          { 
                            Fail353:
                            { 
                              IStrategoTerm l_13 = null;
                              l_13 = term;
                              if(j_11.value == null)
                                break Fail353;
                              term = j_11.value;
                              if(term.getTermType() != IStrategoTerm.APPL || transform._consFor_4 != ((IStrategoAppl)term).getConstructor())
                                break Fail353;
                              if(a_11.value == null)
                                a_11.value = term.getSubterm(0);
                              else
                                if(a_11.value != term.getSubterm(0) && !a_11.value.match(term.getSubterm(0)))
                                  break Fail353;
                              if(h_11.value == null)
                                h_11.value = term.getSubterm(1);
                              else
                                if(h_11.value != term.getSubterm(1) && !h_11.value.match(term.getSubterm(1)))
                                  break Fail353;
                              if(b_11.value == null)
                                b_11.value = term.getSubterm(2);
                              else
                                if(b_11.value != term.getSubterm(2) && !b_11.value.match(term.getSubterm(2)))
                                  break Fail353;
                              if(f_11.value == null)
                                f_11.value = term.getSubterm(3);
                              else
                                if(f_11.value != term.getSubterm(3) && !f_11.value.match(term.getSubterm(3)))
                                  break Fail353;
                              term = l_13;
                              { 
                                IStrategoTerm m_19 = null;
                                IStrategoTerm q_19 = null;
                                IStrategoTerm s_19 = null;
                                IStrategoTerm n_19 = null;
                                IStrategoTerm t_19 = null;
                                IStrategoTerm v_19 = null;
                                IStrategoTerm o_19 = null;
                                IStrategoTerm w_19 = null;
                                IStrategoTerm y_19 = null;
                                IStrategoTerm b_20 = null;
                                q_19 = term;
                                if(a_11.value == null)
                                  break Fail342;
                                s_19 = a_11.value;
                                term = add_external_impl_0_9.instance.invokeDynamic(context, s_19, NO_STRATEGIES, new IStrategoTerm[]{c_10.value, d_10.value, e_10.value, f_10.value, g_10.value, h_10.value, cool.constNone0, j_10.value, k_10.value});
                                if(term == null)
                                  break Fail342;
                                m_19 = term;
                                term = q_19;
                                t_19 = q_19;
                                if(h_11.value == null)
                                  break Fail342;
                                v_19 = h_11.value;
                                term = add_external_impl_0_9.instance.invokeDynamic(context, v_19, NO_STRATEGIES, new IStrategoTerm[]{c_10.value, d_10.value, e_10.value, f_10.value, g_10.value, h_10.value, cool.constBoolean0, j_10.value, k_10.value});
                                if(term == null)
                                  break Fail342;
                                n_19 = term;
                                term = t_19;
                                w_19 = t_19;
                                if(b_11.value == null)
                                  break Fail342;
                                y_19 = b_11.value;
                                term = add_external_impl_0_9.instance.invokeDynamic(context, y_19, NO_STRATEGIES, new IStrategoTerm[]{c_10.value, d_10.value, e_10.value, f_10.value, g_10.value, h_10.value, cool.constNone0, j_10.value, k_10.value});
                                if(term == null)
                                  break Fail342;
                                o_19 = term;
                                term = w_19;
                                if(f_11.value == null)
                                  break Fail342;
                                b_20 = f_11.value;
                                term = add_external_impl_0_9.instance.invokeDynamic(context, b_20, NO_STRATEGIES, new IStrategoTerm[]{c_10.value, d_10.value, e_10.value, f_10.value, g_10.value, h_10.value, cool.constNone0, j_10.value, k_10.value});
                                if(term == null)
                                  break Fail342;
                                term = termFactory.makeAppl(transform._consFor_4, new IStrategoTerm[]{m_19, n_19, o_19, term});
                                if(true)
                                  break Success206;
                              }
                            }
                            term = term68;
                            IStrategoTerm term69 = term;
                            Success207:
                            { 
                              Fail354:
                              { 
                                IStrategoTerm m_13 = null;
                                m_13 = term;
                                if(j_11.value == null)
                                  break Fail354;
                                term = j_11.value;
                                if(term.getTermType() != IStrategoTerm.APPL || transform._consFor_4 != ((IStrategoAppl)term).getConstructor())
                                  break Fail354;
                                if(c_11.value == null)
                                  c_11.value = term.getSubterm(0);
                                else
                                  if(c_11.value != term.getSubterm(0) && !c_11.value.match(term.getSubterm(0)))
                                    break Fail354;
                                if(h_11.value == null)
                                  h_11.value = term.getSubterm(1);
                                else
                                  if(h_11.value != term.getSubterm(1) && !h_11.value.match(term.getSubterm(1)))
                                    break Fail354;
                                if(d_11.value == null)
                                  d_11.value = term.getSubterm(2);
                                else
                                  if(d_11.value != term.getSubterm(2) && !d_11.value.match(term.getSubterm(2)))
                                    break Fail354;
                                if(f_11.value == null)
                                  f_11.value = term.getSubterm(3);
                                else
                                  if(f_11.value != term.getSubterm(3) && !f_11.value.match(term.getSubterm(3)))
                                    break Fail354;
                                term = m_13;
                                { 
                                  IStrategoTerm c_20 = null;
                                  IStrategoTerm g_20 = null;
                                  IStrategoTerm i_20 = null;
                                  IStrategoTerm d_20 = null;
                                  IStrategoTerm j_20 = null;
                                  IStrategoTerm l_20 = null;
                                  IStrategoTerm e_20 = null;
                                  IStrategoTerm m_20 = null;
                                  IStrategoTerm o_20 = null;
                                  IStrategoTerm r_20 = null;
                                  g_20 = term;
                                  if(c_11.value == null)
                                    break Fail342;
                                  i_20 = c_11.value;
                                  term = add_external_impl_0_9.instance.invokeDynamic(context, i_20, NO_STRATEGIES, new IStrategoTerm[]{c_10.value, d_10.value, e_10.value, f_10.value, g_10.value, h_10.value, cool.constNone0, j_10.value, k_10.value});
                                  if(term == null)
                                    break Fail342;
                                  c_20 = term;
                                  term = g_20;
                                  j_20 = g_20;
                                  if(h_11.value == null)
                                    break Fail342;
                                  l_20 = h_11.value;
                                  term = add_external_impl_0_9.instance.invokeDynamic(context, l_20, NO_STRATEGIES, new IStrategoTerm[]{c_10.value, d_10.value, e_10.value, f_10.value, g_10.value, h_10.value, cool.constBoolean0, j_10.value, k_10.value});
                                  if(term == null)
                                    break Fail342;
                                  d_20 = term;
                                  term = j_20;
                                  m_20 = j_20;
                                  if(d_11.value == null)
                                    break Fail342;
                                  o_20 = d_11.value;
                                  term = add_external_impl_0_9.instance.invokeDynamic(context, o_20, NO_STRATEGIES, new IStrategoTerm[]{c_10.value, d_10.value, e_10.value, f_10.value, g_10.value, h_10.value, cool.constNone0, j_10.value, k_10.value});
                                  if(term == null)
                                    break Fail342;
                                  e_20 = term;
                                  term = m_20;
                                  if(f_11.value == null)
                                    break Fail342;
                                  r_20 = f_11.value;
                                  term = add_external_impl_0_9.instance.invokeDynamic(context, r_20, NO_STRATEGIES, new IStrategoTerm[]{c_10.value, d_10.value, e_10.value, f_10.value, g_10.value, h_10.value, cool.constNone0, j_10.value, k_10.value});
                                  if(term == null)
                                    break Fail342;
                                  term = termFactory.makeAppl(transform._consFor_4, new IStrategoTerm[]{c_20, d_20, e_20, term});
                                  if(true)
                                    break Success207;
                                }
                              }
                              term = term69;
                              IStrategoTerm term70 = term;
                              Success208:
                              { 
                                Fail355:
                                { 
                                  IStrategoTerm n_13 = null;
                                  n_13 = term;
                                  if(j_11.value == null)
                                    break Fail355;
                                  term = j_11.value;
                                  if(term.getTermType() != IStrategoTerm.APPL || transform._consForEach_3 != ((IStrategoAppl)term).getConstructor())
                                    break Fail355;
                                  if(e_11.value == null)
                                    e_11.value = term.getSubterm(0);
                                  else
                                    if(e_11.value != term.getSubterm(0) && !e_11.value.match(term.getSubterm(0)))
                                      break Fail355;
                                  if(h_11.value == null)
                                    h_11.value = term.getSubterm(1);
                                  else
                                    if(h_11.value != term.getSubterm(1) && !h_11.value.match(term.getSubterm(1)))
                                      break Fail355;
                                  if(f_11.value == null)
                                    f_11.value = term.getSubterm(2);
                                  else
                                    if(f_11.value != term.getSubterm(2) && !f_11.value.match(term.getSubterm(2)))
                                      break Fail355;
                                  term = n_13;
                                  { 
                                    IStrategoTerm s_20 = null;
                                    IStrategoTerm v_20 = null;
                                    IStrategoTerm x_20 = null;
                                    IStrategoTerm t_20 = null;
                                    IStrategoTerm y_20 = null;
                                    IStrategoTerm a_21 = null;
                                    IStrategoTerm d_21 = null;
                                    v_20 = term;
                                    if(e_11.value == null)
                                      break Fail342;
                                    x_20 = e_11.value;
                                    term = add_external_impl_0_9.instance.invokeDynamic(context, x_20, NO_STRATEGIES, new IStrategoTerm[]{c_10.value, d_10.value, e_10.value, f_10.value, g_10.value, h_10.value, cool.constNone0, j_10.value, k_10.value});
                                    if(term == null)
                                      break Fail342;
                                    s_20 = term;
                                    term = v_20;
                                    y_20 = v_20;
                                    if(h_11.value == null)
                                      break Fail342;
                                    a_21 = h_11.value;
                                    term = add_external_impl_0_9.instance.invokeDynamic(context, a_21, NO_STRATEGIES, new IStrategoTerm[]{c_10.value, d_10.value, e_10.value, f_10.value, g_10.value, h_10.value, cool.constNone0, j_10.value, k_10.value});
                                    if(term == null)
                                      break Fail342;
                                    t_20 = term;
                                    term = y_20;
                                    if(f_11.value == null)
                                      break Fail342;
                                    d_21 = f_11.value;
                                    term = add_external_impl_0_9.instance.invokeDynamic(context, d_21, NO_STRATEGIES, new IStrategoTerm[]{c_10.value, d_10.value, e_10.value, f_10.value, g_10.value, h_10.value, cool.constNone0, j_10.value, k_10.value});
                                    if(term == null)
                                      break Fail342;
                                    term = termFactory.makeAppl(transform._consForEach_3, new IStrategoTerm[]{s_20, t_20, term});
                                    if(true)
                                      break Success208;
                                  }
                                }
                                term = term70;
                                IStrategoTerm term71 = term;
                                Success209:
                                { 
                                  Fail356:
                                  { 
                                    IStrategoTerm o_13 = null;
                                    o_13 = term;
                                    if(j_11.value == null)
                                      break Fail356;
                                    term = j_11.value;
                                    if(term.getTermType() != IStrategoTerm.APPL || transform._consCastPrim_2 != ((IStrategoAppl)term).getConstructor())
                                      break Fail356;
                                    if(g_11.value == null)
                                      g_11.value = term.getSubterm(0);
                                    else
                                      if(g_11.value != term.getSubterm(0) && !g_11.value.match(term.getSubterm(0)))
                                        break Fail356;
                                    if(h_11.value == null)
                                      h_11.value = term.getSubterm(1);
                                    else
                                      if(h_11.value != term.getSubterm(1) && !h_11.value.match(term.getSubterm(1)))
                                        break Fail356;
                                    term = o_13;
                                    { 
                                      IStrategoTerm e_21 = null;
                                      IStrategoTerm f_21 = null;
                                      IStrategoTerm h_21 = null;
                                      f_21 = term;
                                      if(h_11.value == null)
                                        break Fail342;
                                      h_21 = h_11.value;
                                      term = add_external_impl_0_9.instance.invokeDynamic(context, h_21, NO_STRATEGIES, new IStrategoTerm[]{c_10.value, d_10.value, e_10.value, f_10.value, g_10.value, h_10.value, cool.constNone0, j_10.value, k_10.value});
                                      if(term == null)
                                        break Fail342;
                                      e_21 = term;
                                      term = f_21;
                                      if(g_11.value == null)
                                        break Fail342;
                                      term = termFactory.makeAppl(transform._consCastPrim_2, new IStrategoTerm[]{g_11.value, e_21});
                                      if(true)
                                        break Success209;
                                    }
                                  }
                                  term = term71;
                                  IStrategoTerm term72 = term;
                                  Success210:
                                  { 
                                    Fail357:
                                    { 
                                      IStrategoTerm p_13 = null;
                                      p_13 = term;
                                      if(j_11.value == null)
                                        break Fail357;
                                      term = j_11.value;
                                      if(term.getTermType() != IStrategoTerm.APPL || transform._consCastRef_2 != ((IStrategoAppl)term).getConstructor())
                                        break Fail357;
                                      if(g_11.value == null)
                                        g_11.value = term.getSubterm(0);
                                      else
                                        if(g_11.value != term.getSubterm(0) && !g_11.value.match(term.getSubterm(0)))
                                          break Fail357;
                                      if(h_11.value == null)
                                        h_11.value = term.getSubterm(1);
                                      else
                                        if(h_11.value != term.getSubterm(1) && !h_11.value.match(term.getSubterm(1)))
                                          break Fail357;
                                      term = p_13;
                                      { 
                                        IStrategoTerm i_21 = null;
                                        IStrategoTerm j_21 = null;
                                        IStrategoTerm l_21 = null;
                                        j_21 = term;
                                        if(h_11.value == null)
                                          break Fail342;
                                        l_21 = h_11.value;
                                        term = add_external_impl_0_9.instance.invokeDynamic(context, l_21, NO_STRATEGIES, new IStrategoTerm[]{c_10.value, d_10.value, e_10.value, f_10.value, g_10.value, h_10.value, cool.constNone0, j_10.value, k_10.value});
                                        if(term == null)
                                          break Fail342;
                                        i_21 = term;
                                        term = j_21;
                                        if(g_11.value == null)
                                          break Fail342;
                                        term = termFactory.makeAppl(transform._consCastRef_2, new IStrategoTerm[]{g_11.value, i_21});
                                        if(true)
                                          break Success210;
                                      }
                                    }
                                    term = term72;
                                    if(i_11.value == null)
                                      break Fail342;
                                    term = i_11.value;
                                    lifted49 lifted490 = new lifted49();
                                    lifted490.c_10 = c_10;
                                    lifted490.d_10 = d_10;
                                    lifted490.e_10 = e_10;
                                    lifted490.f_10 = f_10;
                                    lifted490.g_10 = g_10;
                                    lifted490.h_10 = h_10;
                                    lifted490.i_10 = i_10;
                                    lifted490.j_10 = j_10;
                                    lifted490.k_10 = k_10;
                                    term = SRTS_all.instance.invoke(context, term, lifted490);
                                    if(term == null)
                                      break Fail342;
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