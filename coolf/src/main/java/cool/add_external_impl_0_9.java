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

@SuppressWarnings("all") public class add_external_impl_0_9 extends Strategy 
{ 
  public static add_external_impl_0_9 instance = new add_external_impl_0_9();

  public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm ref_c_10, IStrategoTerm ref_d_10, IStrategoTerm ref_e_10, IStrategoTerm ref_f_10, IStrategoTerm ref_g_10, IStrategoTerm ref_h_10, IStrategoTerm ref_i_10, IStrategoTerm ref_j_10, IStrategoTerm ref_k_10)
  { 
    ITermFactory termFactory = context.getFactory();
    TermReference c_10 = new TermReference(ref_c_10);
    TermReference d_10 = new TermReference(ref_d_10);
    TermReference e_10 = new TermReference(ref_e_10);
    TermReference f_10 = new TermReference(ref_f_10);
    TermReference g_10 = new TermReference(ref_g_10);
    TermReference h_10 = new TermReference(ref_h_10);
    TermReference i_10 = new TermReference(ref_i_10);
    TermReference j_10 = new TermReference(ref_j_10);
    TermReference k_10 = new TermReference(ref_k_10);
    context.push("add_external_impl_0_9");
    Fail20:
    { 
      IStrategoTerm l_10 = null;
      TermReference m_10 = new TermReference();
      IStrategoTerm n_10 = null;
      TermReference o_10 = new TermReference();
      IStrategoTerm p_10 = null;
      IStrategoTerm q_10 = null;
      TermReference r_10 = new TermReference();
      TermReference s_10 = new TermReference();
      TermReference t_10 = new TermReference();
      TermReference u_10 = new TermReference();
      TermReference v_10 = new TermReference();
      TermReference w_10 = new TermReference();
      TermReference x_10 = new TermReference();
      TermReference y_10 = new TermReference();
      TermReference z_10 = new TermReference();
      TermReference a_11 = new TermReference();
      TermReference b_11 = new TermReference();
      TermReference c_11 = new TermReference();
      TermReference d_11 = new TermReference();
      TermReference e_11 = new TermReference();
      TermReference f_11 = new TermReference();
      TermReference g_11 = new TermReference();
      TermReference h_11 = new TermReference();
      TermReference i_11 = new TermReference();
      TermReference j_11 = new TermReference();
      IStrategoTerm k_11 = null;
      if(i_11.value == null)
        i_11.value = term;
      else
        if(i_11.value != term && !i_11.value.match(term))
          break Fail20;
      k_11 = term;
      if(j_11.value == null)
        j_11.value = term;
      else
        if(j_11.value != term && !j_11.value.match(term))
          break Fail20;
      term = k_11;
      IStrategoTerm term16 = term;
      Success16:
      { 
        Fail21:
        { 
          IStrategoTerm l_11 = null;
          l_11 = term;
          if(j_11.value == null)
            break Fail21;
          term = j_11.value;
          if(term.getTermType() != IStrategoTerm.APPL || transform._consBlock_1 != ((IStrategoAppl)term).getConstructor())
            break Fail21;
          term = l_11;
          { 
            term = new_hashtable_0_0.instance.invoke(context, term);
            if(term == null)
              break Fail20;
            if(o_10.value == null)
              o_10.value = term;
            else
              if(o_10.value != term && !o_10.value.match(term))
                break Fail20;
            if(i_11.value == null)
              break Fail20;
            term = i_11.value;
            lifted2 lifted210 = new lifted2();
            lifted210.c_10 = c_10;
            lifted210.d_10 = d_10;
            lifted210.e_10 = e_10;
            lifted210.o_10 = o_10;
            lifted210.g_10 = g_10;
            lifted210.h_10 = h_10;
            lifted210.i_10 = i_10;
            lifted210.j_10 = j_10;
            lifted210.k_10 = k_10;
            term = SRTS_all.instance.invoke(context, term, lifted210);
            if(term == null)
              break Fail20;
            p_10 = term;
            if(o_10.value == null)
              break Fail20;
            term = hashtable_keys_0_0.instance.invoke(context, o_10.value);
            if(term == null)
              break Fail20;
            lifted3 lifted310 = new lifted3();
            lifted310.c_10 = c_10;
            lifted310.o_10 = o_10;
            term = map_1_0.instance.invoke(context, term, lifted310);
            if(term == null)
              break Fail20;
            term = p_10;
            if(true)
              break Success16;
          }
        }
        term = term16;
        IStrategoTerm term17 = term;
        Success17:
        { 
          Fail22:
          { 
            IStrategoTerm m_11 = null;
            m_11 = term;
            if(j_11.value == null)
              break Fail22;
            term = j_11.value;
            if(term.getTermType() != IStrategoTerm.APPL || transform._consMethodDec_2 != ((IStrategoAppl)term).getConstructor())
              break Fail22;
            l_10 = term.getSubterm(0);
            n_10 = term.getSubterm(1);
            term = m_11;
            { 
              term = new_hashtable_0_0.instance.invoke(context, term);
              if(term == null)
                break Fail20;
              if(o_10.value == null)
                o_10.value = term;
              else
                if(o_10.value != term && !o_10.value.match(term))
                  break Fail20;
              Success18:
              { 
                Fail23:
                { 
                  IStrategoTerm n_11 = null;
                  n_11 = term;
                  term = is__on__entry__or__on__exit__method_0_0.instance.invoke(context, l_10);
                  if(term == null)
                    break Fail23;
                  term = n_11;
                  { 
                    term = cool.constTrue0;
                    if(m_10.value == null)
                      m_10.value = term;
                    else
                      if(m_10.value != term && !m_10.value.match(term))
                        break Fail20;
                    if(true)
                      break Success18;
                  }
                }
                term = cool.constFalse0;
                if(m_10.value == null)
                  m_10.value = term;
                else
                  if(m_10.value != term && !m_10.value.match(term))
                    break Fail20;
              }
              term = l_10;
              lifted4 lifted410 = new lifted4();
              lifted410.c_10 = c_10;
              lifted410.o_10 = o_10;
              lifted410.d_10 = d_10;
              lifted410.i_10 = i_10;
              term = topdown_1_0.instance.invoke(context, term, lifted410);
              if(term == null)
                break Fail20;
              term = n_10;
              lifted6 lifted610 = new lifted6();
              lifted610.c_10 = c_10;
              lifted610.d_10 = d_10;
              lifted610.e_10 = e_10;
              lifted610.o_10 = o_10;
              lifted610.g_10 = g_10;
              lifted610.h_10 = h_10;
              lifted610.i_10 = i_10;
              lifted610.m_10 = m_10;
              lifted610.k_10 = k_10;
              term = SRTS_all.instance.invoke(context, term, lifted610);
              if(term == null)
                break Fail20;
              term = termFactory.makeAppl(transform._consMethodDec_2, new IStrategoTerm[]{l_10, term});
              p_10 = term;
              if(o_10.value == null)
                break Fail20;
              term = hashtable_keys_0_0.instance.invoke(context, o_10.value);
              if(term == null)
                break Fail20;
              lifted7 lifted710 = new lifted7();
              lifted710.c_10 = c_10;
              lifted710.o_10 = o_10;
              term = map_1_0.instance.invoke(context, term, lifted710);
              if(term == null)
                break Fail20;
              term = p_10;
              if(true)
                break Success17;
            }
          }
          term = term17;
          IStrategoTerm term19 = term;
          Success19:
          { 
            Fail24:
            { 
              IStrategoTerm o_11 = null;
              o_11 = term;
              if(j_11.value == null)
                break Fail24;
              term = or_2_0.instance.invoke(context, j_11.value, lifted8.instance, lifted9.instance);
              if(term == null)
                break Fail24;
              term = o_11;
              { 
                if(i_11.value == null)
                  break Fail20;
                term = handle_expr_0_7.instance.invokeDynamic(context, i_11.value, NO_STRATEGIES, new IStrategoTerm[]{c_10.value, g_10.value, e_10.value, h_10.value, i_10.value, j_10.value, k_10.value});
                if(term == null)
                  break Fail20;
                if(true)
                  break Success19;
              }
            }
            term = term19;
            IStrategoTerm term20 = term;
            Success20:
            { 
              Fail25:
              { 
                IStrategoTerm p_11 = null;
                p_11 = term;
                if(j_11.value == null)
                  break Fail25;
                term = j_11.value;
                if(term.getTermType() != IStrategoTerm.APPL || transform._consVarDec_1 != ((IStrategoAppl)term).getConstructor())
                  break Fail25;
                IStrategoTerm arg16 = term.getSubterm(0);
                if(arg16.getTermType() != IStrategoTerm.APPL || transform._consId_1 != ((IStrategoAppl)arg16).getConstructor())
                  break Fail25;
                q_10 = arg16.getSubterm(0);
                term = p_11;
                { 
                  term = add__var_0_5.instance.invoke(context, term, q_10, c_10.value, f_10.value, d_10.value, i_10.value);
                  if(term == null)
                    break Fail20;
                  if(true)
                    break Success20;
                }
              }
              term = term20;
              IStrategoTerm term21 = term;
              Success21:
              { 
                Fail26:
                { 
                  IStrategoTerm q_11 = null;
                  q_11 = term;
                  if(j_11.value == null)
                    break Fail26;
                  term = j_11.value;
                  if(term.getTermType() != IStrategoTerm.APPL || transform._consVarDec_2 != ((IStrategoAppl)term).getConstructor())
                    break Fail26;
                  IStrategoTerm arg17 = term.getSubterm(0);
                  if(arg17.getTermType() != IStrategoTerm.APPL || transform._consId_1 != ((IStrategoAppl)arg17).getConstructor())
                    break Fail26;
                  q_10 = arg17.getSubterm(0);
                  if(h_11.value == null)
                    h_11.value = term.getSubterm(1);
                  else
                    if(h_11.value != term.getSubterm(1) && !h_11.value.match(term.getSubterm(1)))
                      break Fail26;
                  term = q_11;
                  { 
                    term = add__var_0_5.instance.invoke(context, term, q_10, c_10.value, f_10.value, d_10.value, i_10.value);
                    if(term == null)
                      break Fail20;
                    if(i_11.value == null)
                      break Fail20;
                    term = i_11.value;
                    lifted10 lifted1010 = new lifted10();
                    lifted1010.c_10 = c_10;
                    lifted1010.d_10 = d_10;
                    lifted1010.e_10 = e_10;
                    lifted1010.f_10 = f_10;
                    lifted1010.g_10 = g_10;
                    lifted1010.h_10 = h_10;
                    lifted1010.i_10 = i_10;
                    lifted1010.j_10 = j_10;
                    lifted1010.k_10 = k_10;
                    term = SRTS_all.instance.invoke(context, term, lifted1010);
                    if(term == null)
                      break Fail20;
                    if(true)
                      break Success21;
                  }
                }
                term = term21;
                IStrategoTerm term22 = term;
                Success22:
                { 
                  Fail27:
                  { 
                    IStrategoTerm r_11 = null;
                    r_11 = term;
                    if(j_11.value == null)
                      break Fail27;
                    term = j_11.value;
                    lifted12 lifted1210 = new lifted12();
                    lifted11 lifted1110 = new lifted11();
                    lifted1210.g_11 = g_11;
                    lifted1210.r_10 = r_10;
                    lifted1110.g_11 = g_11;
                    lifted1110.r_10 = r_10;
                    term = or_2_0.instance.invoke(context, term, lifted1110, lifted1210);
                    if(term == null)
                      break Fail27;
                    term = r_11;
                    { 
                      if(i_11.value == null)
                        break Fail20;
                      term = i_11.value;
                      lifted13 lifted138 = new lifted13();
                      lifted138.c_10 = c_10;
                      lifted138.d_10 = d_10;
                      lifted138.e_10 = e_10;
                      lifted138.f_10 = f_10;
                      lifted138.g_10 = g_10;
                      lifted138.h_10 = h_10;
                      lifted138.g_11 = g_11;
                      lifted138.j_10 = j_10;
                      lifted138.k_10 = k_10;
                      term = SRTS_all.instance.invoke(context, term, lifted138);
                      if(term == null)
                        break Fail20;
                      if(true)
                        break Success22;
                    }
                  }
                  term = term22;
                  IStrategoTerm term23 = term;
                  Success23:
                  { 
                    Fail28:
                    { 
                      IStrategoTerm s_11 = null;
                      s_11 = term;
                      if(j_11.value == null)
                        break Fail28;
                      term = j_11.value;
                      lifted15 lifted150 = new lifted15();
                      lifted14 lifted140 = new lifted14();
                      lifted150.y_10 = y_10;
                      lifted150.z_10 = z_10;
                      lifted140.y_10 = y_10;
                      lifted140.z_10 = z_10;
                      term = or_2_0.instance.invoke(context, term, lifted140, lifted150);
                      if(term == null)
                        break Fail28;
                      term = s_11;
                      { 
                        if(i_11.value == null)
                          break Fail20;
                        term = i_11.value;
                        lifted16 lifted160 = new lifted16();
                        lifted160.y_10 = y_10;
                        lifted160.z_10 = z_10;
                        lifted160.c_10 = c_10;
                        lifted160.d_10 = d_10;
                        lifted160.e_10 = e_10;
                        lifted160.f_10 = f_10;
                        lifted160.g_10 = g_10;
                        lifted160.h_10 = h_10;
                        lifted160.j_10 = j_10;
                        lifted160.k_10 = k_10;
                        term = SRTS_all.instance.invoke(context, term, lifted160);
                        if(term == null)
                          break Fail20;
                        if(true)
                          break Success23;
                      }
                    }
                    term = term23;
                    IStrategoTerm term24 = term;
                    Success24:
                    { 
                      Fail29:
                      { 
                        IStrategoTerm t_11 = null;
                        t_11 = term;
                        if(j_11.value == null)
                          break Fail29;
                        term = j_11.value;
                        lifted20 lifted200 = new lifted20();
                        lifted17 lifted170 = new lifted17();
                        lifted200.y_10 = y_10;
                        lifted200.z_10 = z_10;
                        lifted170.y_10 = y_10;
                        lifted170.z_10 = z_10;
                        term = or_2_0.instance.invoke(context, term, lifted170, lifted200);
                        if(term == null)
                          break Fail29;
                        term = t_11;
                        { 
                          IStrategoTerm term25 = term;
                          Success25:
                          { 
                            Fail30:
                            { 
                              IStrategoTerm u_11 = null;
                              u_11 = term;
                              if(i_10.value == null)
                                break Fail30;
                              term = termFactory.makeTuple(i_10.value, cool.constNone0);
                              term = equal_0_0.instance.invoke(context, term);
                              if(term == null)
                                break Fail30;
                              term = u_11;
                              { 
                                if(i_11.value == null)
                                  break Fail20;
                                term = i_11.value;
                                lifted21 lifted211 = new lifted21();
                                lifted211.y_10 = y_10;
                                lifted211.z_10 = z_10;
                                lifted211.i_10 = i_10;
                                lifted211.c_10 = c_10;
                                lifted211.d_10 = d_10;
                                lifted211.e_10 = e_10;
                                lifted211.f_10 = f_10;
                                lifted211.g_10 = g_10;
                                lifted211.h_10 = h_10;
                                lifted211.j_10 = j_10;
                                lifted211.k_10 = k_10;
                                term = SRTS_all.instance.invoke(context, term, lifted211);
                                if(term == null)
                                  break Fail20;
                                if(true)
                                  break Success25;
                              }
                            }
                            term = term25;
                            if(i_11.value == null)
                              break Fail20;
                            term = i_11.value;
                            lifted22 lifted220 = new lifted22();
                            lifted220.i_10 = i_10;
                            lifted220.c_10 = c_10;
                            lifted220.d_10 = d_10;
                            lifted220.e_10 = e_10;
                            lifted220.f_10 = f_10;
                            lifted220.g_10 = g_10;
                            lifted220.h_10 = h_10;
                            lifted220.j_10 = j_10;
                            lifted220.k_10 = k_10;
                            term = SRTS_all.instance.invoke(context, term, lifted220);
                            if(term == null)
                              break Fail20;
                          }
                          if(true)
                            break Success24;
                        }
                      }
                      term = term24;
                      IStrategoTerm term26 = term;
                      Success26:
                      { 
                        Fail31:
                        { 
                          IStrategoTerm v_11 = null;
                          v_11 = term;
                          if(j_11.value == null)
                            break Fail31;
                          term = or_2_0.instance.invoke(context, j_11.value, lifted23.instance, lifted26.instance);
                          if(term == null)
                            break Fail31;
                          term = v_11;
                          { 
                            if(i_11.value == null)
                              break Fail20;
                            term = i_11.value;
                            lifted29 lifted290 = new lifted29();
                            lifted290.c_10 = c_10;
                            lifted290.d_10 = d_10;
                            lifted290.e_10 = e_10;
                            lifted290.f_10 = f_10;
                            lifted290.g_10 = g_10;
                            lifted290.h_10 = h_10;
                            lifted290.j_10 = j_10;
                            lifted290.k_10 = k_10;
                            term = SRTS_all.instance.invoke(context, term, lifted290);
                            if(term == null)
                              break Fail20;
                            if(true)
                              break Success26;
                          }
                        }
                        term = term26;
                        IStrategoTerm term27 = term;
                        Success27:
                        { 
                          Fail32:
                          { 
                            IStrategoTerm w_11 = null;
                            w_11 = term;
                            if(j_11.value == null)
                              break Fail32;
                            term = j_11.value;
                            lifted37 lifted370 = new lifted37();
                            lifted30 lifted300 = new lifted30();
                            lifted370.y_10 = y_10;
                            lifted370.z_10 = z_10;
                            lifted300.y_10 = y_10;
                            lifted300.z_10 = z_10;
                            term = or_2_0.instance.invoke(context, term, lifted300, lifted370);
                            if(term == null)
                              break Fail32;
                            term = w_11;
                            { 
                              IStrategoTerm term28 = term;
                              Success28:
                              { 
                                Fail33:
                                { 
                                  IStrategoTerm x_11 = null;
                                  x_11 = term;
                                  if(i_10.value == null)
                                    break Fail33;
                                  term = termFactory.makeTuple(i_10.value, cool.constNone0);
                                  term = equal_0_0.instance.invoke(context, term);
                                  if(term == null)
                                    break Fail33;
                                  term = x_11;
                                  { 
                                    if(i_11.value == null)
                                      break Fail20;
                                    term = i_11.value;
                                    lifted38 lifted380 = new lifted38();
                                    lifted380.c_10 = c_10;
                                    lifted380.d_10 = d_10;
                                    lifted380.e_10 = e_10;
                                    lifted380.f_10 = f_10;
                                    lifted380.g_10 = g_10;
                                    lifted380.h_10 = h_10;
                                    lifted380.j_10 = j_10;
                                    lifted380.k_10 = k_10;
                                    term = SRTS_all.instance.invoke(context, term, lifted380);
                                    if(term == null)
                                      break Fail20;
                                    if(true)
                                      break Success28;
                                  }
                                }
                                term = term28;
                                if(i_11.value == null)
                                  break Fail20;
                                term = i_11.value;
                                lifted39 lifted390 = new lifted39();
                                lifted390.i_10 = i_10;
                                lifted390.c_10 = c_10;
                                lifted390.d_10 = d_10;
                                lifted390.e_10 = e_10;
                                lifted390.f_10 = f_10;
                                lifted390.g_10 = g_10;
                                lifted390.h_10 = h_10;
                                lifted390.j_10 = j_10;
                                lifted390.k_10 = k_10;
                                term = SRTS_all.instance.invoke(context, term, lifted390);
                                if(term == null)
                                  break Fail20;
                              }
                              if(true)
                                break Success27;
                            }
                          }
                          term = term27;
                          IStrategoTerm term29 = term;
                          Success29:
                          { 
                            Fail34:
                            { 
                              IStrategoTerm y_11 = null;
                              y_11 = term;
                              if(j_11.value == null)
                                break Fail34;
                              term = j_11.value;
                              if(term.getTermType() != IStrategoTerm.APPL || transform._consLeftShift_2 != ((IStrategoAppl)term).getConstructor())
                                break Fail34;
                              if(y_10.value == null)
                                y_10.value = term.getSubterm(0);
                              else
                                if(y_10.value != term.getSubterm(0) && !y_10.value.match(term.getSubterm(0)))
                                  break Fail34;
                              if(z_10.value == null)
                                z_10.value = term.getSubterm(1);
                              else
                                if(z_10.value != term.getSubterm(1) && !z_10.value.match(term.getSubterm(1)))
                                  break Fail34;
                              term = y_11;
                              { 
                                IStrategoTerm q_14 = null;
                                IStrategoTerm s_14 = null;
                                IStrategoTerm v_14 = null;
                                IStrategoTerm term30 = term;
                                Success30:
                                { 
                                  Fail35:
                                  { 
                                    IStrategoTerm z_11 = null;
                                    z_11 = term;
                                    if(i_10.value == null)
                                      break Fail35;
                                    term = termFactory.makeTuple(i_10.value, cool.constNone0);
                                    term = equal_0_0.instance.invoke(context, term);
                                    if(term == null)
                                      break Fail35;
                                    term = z_11;
                                    { 
                                      if(y_10.value == null)
                                        break Fail20;
                                      term = get_type_of_0_3.instance.invoke(context, y_10.value, i_10.value, c_10.value, d_10.value);
                                      if(term == null)
                                        break Fail20;
                                      term = cast_shift_type_0_0.instance.invoke(context, term);
                                      if(term == null)
                                        break Fail20;
                                      if(t_10.value == null)
                                        t_10.value = term;
                                      else
                                        if(t_10.value != term && !t_10.value.match(term))
                                          break Fail20;
                                      if(true)
                                        break Success30;
                                    }
                                  }
                                  term = term30;
                                  if(i_10.value == null)
                                    break Fail20;
                                  term = cast_shift_type_0_0.instance.invoke(context, i_10.value);
                                  if(term == null)
                                    break Fail20;
                                  if(t_10.value == null)
                                    t_10.value = term;
                                  else
                                    if(t_10.value != term && !t_10.value.match(term))
                                      break Fail20;
                                }
                                s_14 = term;
                                if(y_10.value == null)
                                  break Fail20;
                                term = this.invokeDynamic(context, y_10.value, NO_STRATEGIES, new IStrategoTerm[]{c_10.value, d_10.value, e_10.value, f_10.value, g_10.value, h_10.value, t_10.value, j_10.value, k_10.value});
                                if(term == null)
                                  break Fail20;
                                q_14 = term;
                                term = s_14;
                                if(z_10.value == null)
                                  break Fail20;
                                v_14 = z_10.value;
                                term = this.invokeDynamic(context, v_14, NO_STRATEGIES, new IStrategoTerm[]{c_10.value, d_10.value, e_10.value, f_10.value, g_10.value, h_10.value, cool.constLong0, j_10.value, k_10.value});
                                if(term == null)
                                  break Fail20;
                                term = termFactory.makeAppl(transform._consLeftShift_2, new IStrategoTerm[]{q_14, term});
                                if(true)
                                  break Success29;
                              }
                            }
                            term = term29;
                            add_external_impl_0_9_fragment_1 add_external_impl_0_9_fragment_10 = new add_external_impl_0_9_fragment_1();
                            add_external_impl_0_9_fragment_10.s_10 = s_10;
                            add_external_impl_0_9_fragment_10.t_10 = t_10;
                            add_external_impl_0_9_fragment_10.v_10 = v_10;
                            add_external_impl_0_9_fragment_10.u_10 = u_10;
                            add_external_impl_0_9_fragment_10.w_10 = w_10;
                            add_external_impl_0_9_fragment_10.x_10 = x_10;
                            add_external_impl_0_9_fragment_10.y_10 = y_10;
                            add_external_impl_0_9_fragment_10.z_10 = z_10;
                            add_external_impl_0_9_fragment_10.a_11 = a_11;
                            add_external_impl_0_9_fragment_10.b_11 = b_11;
                            add_external_impl_0_9_fragment_10.c_11 = c_11;
                            add_external_impl_0_9_fragment_10.d_11 = d_11;
                            add_external_impl_0_9_fragment_10.e_11 = e_11;
                            add_external_impl_0_9_fragment_10.f_11 = f_11;
                            add_external_impl_0_9_fragment_10.j_11 = j_11;
                            add_external_impl_0_9_fragment_10.h_11 = h_11;
                            add_external_impl_0_9_fragment_10.g_11 = g_11;
                            add_external_impl_0_9_fragment_10.c_10 = c_10;
                            add_external_impl_0_9_fragment_10.d_10 = d_10;
                            add_external_impl_0_9_fragment_10.e_10 = e_10;
                            add_external_impl_0_9_fragment_10.f_10 = f_10;
                            add_external_impl_0_9_fragment_10.g_10 = g_10;
                            add_external_impl_0_9_fragment_10.h_10 = h_10;
                            add_external_impl_0_9_fragment_10.i_10 = i_10;
                            add_external_impl_0_9_fragment_10.j_10 = j_10;
                            add_external_impl_0_9_fragment_10.k_10 = k_10;
                            add_external_impl_0_9_fragment_10.i_11 = i_11;
                            term = add_external_impl_0_9_fragment_10.invoke(context, term);
                            if(term == null)
                              break Fail20;
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

  @Override public IStrategoTerm invokeDynamic(Context context, IStrategoTerm term, Strategy[] sargs, IStrategoTerm[] targs)
  { 
    if(sargs == null || targs == null || sargs.length != 0 || targs.length != 9)
      throw new IllegalArgumentException("Illegal arguments for " + getName());
    return invoke(context, term, targs[0], targs[1], targs[2], targs[3], targs[4], targs[5], targs[6], targs[7], targs[8]);
  }
}