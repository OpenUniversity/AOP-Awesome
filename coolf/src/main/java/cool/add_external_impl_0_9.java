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

  public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm ref_b_26, IStrategoTerm ref_c_26, IStrategoTerm ref_d_26, IStrategoTerm ref_e_26, IStrategoTerm ref_f_26, IStrategoTerm ref_g_26, IStrategoTerm ref_h_26, IStrategoTerm ref_i_26, IStrategoTerm ref_j_26)
  { 
    ITermFactory termFactory = context.getFactory();
    TermReference b_26 = new TermReference(ref_b_26);
    TermReference c_26 = new TermReference(ref_c_26);
    TermReference d_26 = new TermReference(ref_d_26);
    TermReference e_26 = new TermReference(ref_e_26);
    TermReference f_26 = new TermReference(ref_f_26);
    TermReference g_26 = new TermReference(ref_g_26);
    TermReference h_26 = new TermReference(ref_h_26);
    TermReference i_26 = new TermReference(ref_i_26);
    TermReference j_26 = new TermReference(ref_j_26);
    context.push("add_external_impl_0_9");
    Fail134:
    { 
      IStrategoTerm k_26 = null;
      TermReference l_26 = new TermReference();
      IStrategoTerm m_26 = null;
      TermReference n_26 = new TermReference();
      IStrategoTerm o_26 = null;
      IStrategoTerm p_26 = null;
      TermReference q_26 = new TermReference();
      TermReference r_26 = new TermReference();
      TermReference s_26 = new TermReference();
      TermReference t_26 = new TermReference();
      TermReference u_26 = new TermReference();
      TermReference v_26 = new TermReference();
      TermReference w_26 = new TermReference();
      TermReference x_26 = new TermReference();
      TermReference y_26 = new TermReference();
      TermReference z_26 = new TermReference();
      TermReference a_27 = new TermReference();
      TermReference b_27 = new TermReference();
      TermReference c_27 = new TermReference();
      TermReference d_27 = new TermReference();
      TermReference e_27 = new TermReference();
      TermReference f_27 = new TermReference();
      TermReference g_27 = new TermReference();
      TermReference h_27 = new TermReference();
      TermReference i_27 = new TermReference();
      IStrategoTerm j_27 = null;
      if(h_27.value == null)
        h_27.value = term;
      else
        if(h_27.value != term && !h_27.value.match(term))
          break Fail134;
      j_27 = term;
      if(i_27.value == null)
        i_27.value = term;
      else
        if(i_27.value != term && !i_27.value.match(term))
          break Fail134;
      term = j_27;
      IStrategoTerm term122 = term;
      Success119:
      { 
        Fail135:
        { 
          IStrategoTerm k_27 = null;
          k_27 = term;
          if(i_27.value == null)
            break Fail135;
          term = i_27.value;
          if(term.getTermType() != IStrategoTerm.APPL || transform._consBlock_1 != ((IStrategoAppl)term).getConstructor())
            break Fail135;
          term = k_27;
          { 
            term = new_hashtable_0_0.instance.invoke(context, term);
            if(term == null)
              break Fail134;
            if(n_26.value == null)
              n_26.value = term;
            else
              if(n_26.value != term && !n_26.value.match(term))
                break Fail134;
            if(h_27.value == null)
              break Fail134;
            term = h_27.value;
            lifted6 lifted610 = new lifted6();
            lifted610.b_26 = b_26;
            lifted610.c_26 = c_26;
            lifted610.d_26 = d_26;
            lifted610.n_26 = n_26;
            lifted610.f_26 = f_26;
            lifted610.g_26 = g_26;
            lifted610.h_26 = h_26;
            lifted610.i_26 = i_26;
            lifted610.j_26 = j_26;
            term = SRTS_all.instance.invoke(context, term, lifted610);
            if(term == null)
              break Fail134;
            o_26 = term;
            if(n_26.value == null)
              break Fail134;
            term = hashtable_keys_0_0.instance.invoke(context, n_26.value);
            if(term == null)
              break Fail134;
            lifted7 lifted710 = new lifted7();
            lifted710.b_26 = b_26;
            lifted710.n_26 = n_26;
            term = map_1_0.instance.invoke(context, term, lifted710);
            if(term == null)
              break Fail134;
            term = o_26;
            if(true)
              break Success119;
          }
        }
        term = term122;
        IStrategoTerm term123 = term;
        Success120:
        { 
          Fail136:
          { 
            IStrategoTerm l_27 = null;
            l_27 = term;
            if(i_27.value == null)
              break Fail136;
            term = i_27.value;
            if(term.getTermType() != IStrategoTerm.APPL || transform._consMethodDec_2 != ((IStrategoAppl)term).getConstructor())
              break Fail136;
            k_26 = term.getSubterm(0);
            m_26 = term.getSubterm(1);
            term = l_27;
            { 
              term = new_hashtable_0_0.instance.invoke(context, term);
              if(term == null)
                break Fail134;
              if(n_26.value == null)
                n_26.value = term;
              else
                if(n_26.value != term && !n_26.value.match(term))
                  break Fail134;
              Success121:
              { 
                Fail137:
                { 
                  IStrategoTerm m_27 = null;
                  m_27 = term;
                  term = is__on__entry__or__on__exit__method_0_0.instance.invoke(context, k_26);
                  if(term == null)
                    break Fail137;
                  term = m_27;
                  { 
                    term = cool.constTrue0;
                    if(l_26.value == null)
                      l_26.value = term;
                    else
                      if(l_26.value != term && !l_26.value.match(term))
                        break Fail134;
                    if(true)
                      break Success121;
                  }
                }
                term = cool.constFalse0;
                if(l_26.value == null)
                  l_26.value = term;
                else
                  if(l_26.value != term && !l_26.value.match(term))
                    break Fail134;
              }
              term = k_26;
              lifted8 lifted810 = new lifted8();
              lifted810.b_26 = b_26;
              lifted810.n_26 = n_26;
              lifted810.c_26 = c_26;
              lifted810.h_26 = h_26;
              term = topdown_1_0.instance.invoke(context, term, lifted810);
              if(term == null)
                break Fail134;
              term = m_26;
              lifted10 lifted1010 = new lifted10();
              lifted1010.b_26 = b_26;
              lifted1010.c_26 = c_26;
              lifted1010.d_26 = d_26;
              lifted1010.n_26 = n_26;
              lifted1010.f_26 = f_26;
              lifted1010.g_26 = g_26;
              lifted1010.h_26 = h_26;
              lifted1010.l_26 = l_26;
              lifted1010.j_26 = j_26;
              term = SRTS_all.instance.invoke(context, term, lifted1010);
              if(term == null)
                break Fail134;
              term = termFactory.makeAppl(transform._consMethodDec_2, new IStrategoTerm[]{k_26, term});
              o_26 = term;
              if(n_26.value == null)
                break Fail134;
              term = hashtable_keys_0_0.instance.invoke(context, n_26.value);
              if(term == null)
                break Fail134;
              lifted11 lifted1110 = new lifted11();
              lifted1110.b_26 = b_26;
              lifted1110.n_26 = n_26;
              term = map_1_0.instance.invoke(context, term, lifted1110);
              if(term == null)
                break Fail134;
              term = o_26;
              if(true)
                break Success120;
            }
          }
          term = term123;
          IStrategoTerm term125 = term;
          Success122:
          { 
            Fail138:
            { 
              IStrategoTerm n_27 = null;
              n_27 = term;
              if(i_27.value == null)
                break Fail138;
              term = or_2_0.instance.invoke(context, i_27.value, lifted12.instance, lifted13.instance);
              if(term == null)
                break Fail138;
              term = n_27;
              { 
                if(h_27.value == null)
                  break Fail134;
                term = handle_expr_0_7.instance.invokeDynamic(context, h_27.value, NO_STRATEGIES, new IStrategoTerm[]{b_26.value, f_26.value, d_26.value, g_26.value, h_26.value, i_26.value, j_26.value});
                if(term == null)
                  break Fail134;
                if(true)
                  break Success122;
              }
            }
            term = term125;
            IStrategoTerm term126 = term;
            Success123:
            { 
              Fail139:
              { 
                IStrategoTerm o_27 = null;
                o_27 = term;
                if(i_27.value == null)
                  break Fail139;
                term = i_27.value;
                if(term.getTermType() != IStrategoTerm.APPL || transform._consVarDec_1 != ((IStrategoAppl)term).getConstructor())
                  break Fail139;
                IStrategoTerm arg30 = term.getSubterm(0);
                if(arg30.getTermType() != IStrategoTerm.APPL || transform._consId_1 != ((IStrategoAppl)arg30).getConstructor())
                  break Fail139;
                p_26 = arg30.getSubterm(0);
                term = o_27;
                { 
                  term = add__var_0_5.instance.invoke(context, term, p_26, b_26.value, e_26.value, c_26.value, h_26.value);
                  if(term == null)
                    break Fail134;
                  if(true)
                    break Success123;
                }
              }
              term = term126;
              IStrategoTerm term127 = term;
              Success124:
              { 
                Fail140:
                { 
                  IStrategoTerm p_27 = null;
                  p_27 = term;
                  if(i_27.value == null)
                    break Fail140;
                  term = i_27.value;
                  if(term.getTermType() != IStrategoTerm.APPL || transform._consVarDec_2 != ((IStrategoAppl)term).getConstructor())
                    break Fail140;
                  IStrategoTerm arg31 = term.getSubterm(0);
                  if(arg31.getTermType() != IStrategoTerm.APPL || transform._consId_1 != ((IStrategoAppl)arg31).getConstructor())
                    break Fail140;
                  p_26 = arg31.getSubterm(0);
                  if(g_27.value == null)
                    g_27.value = term.getSubterm(1);
                  else
                    if(g_27.value != term.getSubterm(1) && !g_27.value.match(term.getSubterm(1)))
                      break Fail140;
                  term = p_27;
                  { 
                    term = add__var_0_5.instance.invoke(context, term, p_26, b_26.value, e_26.value, c_26.value, h_26.value);
                    if(term == null)
                      break Fail134;
                    if(h_27.value == null)
                      break Fail134;
                    term = h_27.value;
                    lifted14 lifted140 = new lifted14();
                    lifted140.b_26 = b_26;
                    lifted140.c_26 = c_26;
                    lifted140.d_26 = d_26;
                    lifted140.e_26 = e_26;
                    lifted140.f_26 = f_26;
                    lifted140.g_26 = g_26;
                    lifted140.h_26 = h_26;
                    lifted140.i_26 = i_26;
                    lifted140.j_26 = j_26;
                    term = SRTS_all.instance.invoke(context, term, lifted140);
                    if(term == null)
                      break Fail134;
                    if(true)
                      break Success124;
                  }
                }
                term = term127;
                IStrategoTerm term128 = term;
                Success125:
                { 
                  Fail141:
                  { 
                    IStrategoTerm q_27 = null;
                    q_27 = term;
                    if(i_27.value == null)
                      break Fail141;
                    term = i_27.value;
                    lifted16 lifted160 = new lifted16();
                    lifted15 lifted150 = new lifted15();
                    lifted160.f_27 = f_27;
                    lifted160.q_26 = q_26;
                    lifted150.f_27 = f_27;
                    lifted150.q_26 = q_26;
                    term = or_2_0.instance.invoke(context, term, lifted150, lifted160);
                    if(term == null)
                      break Fail141;
                    term = q_27;
                    { 
                      if(h_27.value == null)
                        break Fail134;
                      term = h_27.value;
                      lifted17 lifted170 = new lifted17();
                      lifted170.b_26 = b_26;
                      lifted170.c_26 = c_26;
                      lifted170.d_26 = d_26;
                      lifted170.e_26 = e_26;
                      lifted170.f_26 = f_26;
                      lifted170.g_26 = g_26;
                      lifted170.f_27 = f_27;
                      lifted170.i_26 = i_26;
                      lifted170.j_26 = j_26;
                      term = SRTS_all.instance.invoke(context, term, lifted170);
                      if(term == null)
                        break Fail134;
                      if(true)
                        break Success125;
                    }
                  }
                  term = term128;
                  IStrategoTerm term129 = term;
                  Success126:
                  { 
                    Fail142:
                    { 
                      IStrategoTerm r_27 = null;
                      r_27 = term;
                      if(i_27.value == null)
                        break Fail142;
                      term = i_27.value;
                      lifted19 lifted190 = new lifted19();
                      lifted18 lifted180 = new lifted18();
                      lifted190.x_26 = x_26;
                      lifted190.y_26 = y_26;
                      lifted180.x_26 = x_26;
                      lifted180.y_26 = y_26;
                      term = or_2_0.instance.invoke(context, term, lifted180, lifted190);
                      if(term == null)
                        break Fail142;
                      term = r_27;
                      { 
                        if(h_27.value == null)
                          break Fail134;
                        term = h_27.value;
                        lifted20 lifted200 = new lifted20();
                        lifted200.x_26 = x_26;
                        lifted200.y_26 = y_26;
                        lifted200.b_26 = b_26;
                        lifted200.c_26 = c_26;
                        lifted200.d_26 = d_26;
                        lifted200.e_26 = e_26;
                        lifted200.f_26 = f_26;
                        lifted200.g_26 = g_26;
                        lifted200.i_26 = i_26;
                        lifted200.j_26 = j_26;
                        term = SRTS_all.instance.invoke(context, term, lifted200);
                        if(term == null)
                          break Fail134;
                        if(true)
                          break Success126;
                      }
                    }
                    term = term129;
                    IStrategoTerm term130 = term;
                    Success127:
                    { 
                      Fail143:
                      { 
                        IStrategoTerm s_27 = null;
                        s_27 = term;
                        if(i_27.value == null)
                          break Fail143;
                        term = i_27.value;
                        lifted24 lifted240 = new lifted24();
                        lifted21 lifted210 = new lifted21();
                        lifted240.x_26 = x_26;
                        lifted240.y_26 = y_26;
                        lifted210.x_26 = x_26;
                        lifted210.y_26 = y_26;
                        term = or_2_0.instance.invoke(context, term, lifted210, lifted240);
                        if(term == null)
                          break Fail143;
                        term = s_27;
                        { 
                          IStrategoTerm term131 = term;
                          Success128:
                          { 
                            Fail144:
                            { 
                              IStrategoTerm t_27 = null;
                              t_27 = term;
                              if(h_26.value == null)
                                break Fail144;
                              term = termFactory.makeTuple(h_26.value, cool.constNone0);
                              term = equal_0_0.instance.invoke(context, term);
                              if(term == null)
                                break Fail144;
                              term = t_27;
                              { 
                                if(h_27.value == null)
                                  break Fail134;
                                term = h_27.value;
                                lifted25 lifted250 = new lifted25();
                                lifted250.x_26 = x_26;
                                lifted250.y_26 = y_26;
                                lifted250.h_26 = h_26;
                                lifted250.b_26 = b_26;
                                lifted250.c_26 = c_26;
                                lifted250.d_26 = d_26;
                                lifted250.e_26 = e_26;
                                lifted250.f_26 = f_26;
                                lifted250.g_26 = g_26;
                                lifted250.i_26 = i_26;
                                lifted250.j_26 = j_26;
                                term = SRTS_all.instance.invoke(context, term, lifted250);
                                if(term == null)
                                  break Fail134;
                                if(true)
                                  break Success128;
                              }
                            }
                            term = term131;
                            if(h_27.value == null)
                              break Fail134;
                            term = h_27.value;
                            lifted26 lifted260 = new lifted26();
                            lifted260.h_26 = h_26;
                            lifted260.b_26 = b_26;
                            lifted260.c_26 = c_26;
                            lifted260.d_26 = d_26;
                            lifted260.e_26 = e_26;
                            lifted260.f_26 = f_26;
                            lifted260.g_26 = g_26;
                            lifted260.i_26 = i_26;
                            lifted260.j_26 = j_26;
                            term = SRTS_all.instance.invoke(context, term, lifted260);
                            if(term == null)
                              break Fail134;
                          }
                          if(true)
                            break Success127;
                        }
                      }
                      term = term130;
                      IStrategoTerm term132 = term;
                      Success129:
                      { 
                        Fail145:
                        { 
                          IStrategoTerm u_27 = null;
                          u_27 = term;
                          if(i_27.value == null)
                            break Fail145;
                          term = or_2_0.instance.invoke(context, i_27.value, lifted27.instance, lifted30.instance);
                          if(term == null)
                            break Fail145;
                          term = u_27;
                          { 
                            if(h_27.value == null)
                              break Fail134;
                            term = h_27.value;
                            lifted33 lifted330 = new lifted33();
                            lifted330.b_26 = b_26;
                            lifted330.c_26 = c_26;
                            lifted330.d_26 = d_26;
                            lifted330.e_26 = e_26;
                            lifted330.f_26 = f_26;
                            lifted330.g_26 = g_26;
                            lifted330.i_26 = i_26;
                            lifted330.j_26 = j_26;
                            term = SRTS_all.instance.invoke(context, term, lifted330);
                            if(term == null)
                              break Fail134;
                            if(true)
                              break Success129;
                          }
                        }
                        term = term132;
                        IStrategoTerm term133 = term;
                        Success130:
                        { 
                          Fail146:
                          { 
                            IStrategoTerm v_27 = null;
                            v_27 = term;
                            if(i_27.value == null)
                              break Fail146;
                            term = i_27.value;
                            lifted41 lifted411 = new lifted41();
                            lifted34 lifted340 = new lifted34();
                            lifted411.x_26 = x_26;
                            lifted411.y_26 = y_26;
                            lifted340.x_26 = x_26;
                            lifted340.y_26 = y_26;
                            term = or_2_0.instance.invoke(context, term, lifted340, lifted411);
                            if(term == null)
                              break Fail146;
                            term = v_27;
                            { 
                              IStrategoTerm term134 = term;
                              Success131:
                              { 
                                Fail147:
                                { 
                                  IStrategoTerm w_27 = null;
                                  w_27 = term;
                                  if(h_26.value == null)
                                    break Fail147;
                                  term = termFactory.makeTuple(h_26.value, cool.constNone0);
                                  term = equal_0_0.instance.invoke(context, term);
                                  if(term == null)
                                    break Fail147;
                                  term = w_27;
                                  { 
                                    if(h_27.value == null)
                                      break Fail134;
                                    term = h_27.value;
                                    lifted42 lifted420 = new lifted42();
                                    lifted420.b_26 = b_26;
                                    lifted420.c_26 = c_26;
                                    lifted420.d_26 = d_26;
                                    lifted420.e_26 = e_26;
                                    lifted420.f_26 = f_26;
                                    lifted420.g_26 = g_26;
                                    lifted420.i_26 = i_26;
                                    lifted420.j_26 = j_26;
                                    term = SRTS_all.instance.invoke(context, term, lifted420);
                                    if(term == null)
                                      break Fail134;
                                    if(true)
                                      break Success131;
                                  }
                                }
                                term = term134;
                                if(h_27.value == null)
                                  break Fail134;
                                term = h_27.value;
                                lifted43 lifted430 = new lifted43();
                                lifted430.h_26 = h_26;
                                lifted430.b_26 = b_26;
                                lifted430.c_26 = c_26;
                                lifted430.d_26 = d_26;
                                lifted430.e_26 = e_26;
                                lifted430.f_26 = f_26;
                                lifted430.g_26 = g_26;
                                lifted430.i_26 = i_26;
                                lifted430.j_26 = j_26;
                                term = SRTS_all.instance.invoke(context, term, lifted430);
                                if(term == null)
                                  break Fail134;
                              }
                              if(true)
                                break Success130;
                            }
                          }
                          term = term133;
                          IStrategoTerm term135 = term;
                          Success132:
                          { 
                            Fail148:
                            { 
                              IStrategoTerm x_27 = null;
                              x_27 = term;
                              if(i_27.value == null)
                                break Fail148;
                              term = i_27.value;
                              if(term.getTermType() != IStrategoTerm.APPL || transform._consLeftShift_2 != ((IStrategoAppl)term).getConstructor())
                                break Fail148;
                              if(x_26.value == null)
                                x_26.value = term.getSubterm(0);
                              else
                                if(x_26.value != term.getSubterm(0) && !x_26.value.match(term.getSubterm(0)))
                                  break Fail148;
                              if(y_26.value == null)
                                y_26.value = term.getSubterm(1);
                              else
                                if(y_26.value != term.getSubterm(1) && !y_26.value.match(term.getSubterm(1)))
                                  break Fail148;
                              term = x_27;
                              { 
                                IStrategoTerm p_30 = null;
                                IStrategoTerm r_30 = null;
                                IStrategoTerm u_30 = null;
                                IStrategoTerm term136 = term;
                                Success133:
                                { 
                                  Fail149:
                                  { 
                                    IStrategoTerm y_27 = null;
                                    y_27 = term;
                                    if(h_26.value == null)
                                      break Fail149;
                                    term = termFactory.makeTuple(h_26.value, cool.constNone0);
                                    term = equal_0_0.instance.invoke(context, term);
                                    if(term == null)
                                      break Fail149;
                                    term = y_27;
                                    { 
                                      if(x_26.value == null)
                                        break Fail134;
                                      term = get_type_of_0_3.instance.invoke(context, x_26.value, h_26.value, b_26.value, c_26.value);
                                      if(term == null)
                                        break Fail134;
                                      term = cast_shift_type_0_0.instance.invoke(context, term);
                                      if(term == null)
                                        break Fail134;
                                      if(s_26.value == null)
                                        s_26.value = term;
                                      else
                                        if(s_26.value != term && !s_26.value.match(term))
                                          break Fail134;
                                      if(true)
                                        break Success133;
                                    }
                                  }
                                  term = term136;
                                  if(h_26.value == null)
                                    break Fail134;
                                  term = cast_shift_type_0_0.instance.invoke(context, h_26.value);
                                  if(term == null)
                                    break Fail134;
                                  if(s_26.value == null)
                                    s_26.value = term;
                                  else
                                    if(s_26.value != term && !s_26.value.match(term))
                                      break Fail134;
                                }
                                r_30 = term;
                                if(x_26.value == null)
                                  break Fail134;
                                term = this.invokeDynamic(context, x_26.value, NO_STRATEGIES, new IStrategoTerm[]{b_26.value, c_26.value, d_26.value, e_26.value, f_26.value, g_26.value, s_26.value, i_26.value, j_26.value});
                                if(term == null)
                                  break Fail134;
                                p_30 = term;
                                term = r_30;
                                if(y_26.value == null)
                                  break Fail134;
                                u_30 = y_26.value;
                                term = this.invokeDynamic(context, u_30, NO_STRATEGIES, new IStrategoTerm[]{b_26.value, c_26.value, d_26.value, e_26.value, f_26.value, g_26.value, cool.constLong0, i_26.value, j_26.value});
                                if(term == null)
                                  break Fail134;
                                term = termFactory.makeAppl(transform._consLeftShift_2, new IStrategoTerm[]{p_30, term});
                                if(true)
                                  break Success132;
                              }
                            }
                            term = term135;
                            add_external_impl_0_9_fragment_1 add_external_impl_0_9_fragment_10 = new add_external_impl_0_9_fragment_1();
                            add_external_impl_0_9_fragment_10.r_26 = r_26;
                            add_external_impl_0_9_fragment_10.s_26 = s_26;
                            add_external_impl_0_9_fragment_10.u_26 = u_26;
                            add_external_impl_0_9_fragment_10.t_26 = t_26;
                            add_external_impl_0_9_fragment_10.v_26 = v_26;
                            add_external_impl_0_9_fragment_10.w_26 = w_26;
                            add_external_impl_0_9_fragment_10.x_26 = x_26;
                            add_external_impl_0_9_fragment_10.y_26 = y_26;
                            add_external_impl_0_9_fragment_10.z_26 = z_26;
                            add_external_impl_0_9_fragment_10.a_27 = a_27;
                            add_external_impl_0_9_fragment_10.b_27 = b_27;
                            add_external_impl_0_9_fragment_10.c_27 = c_27;
                            add_external_impl_0_9_fragment_10.d_27 = d_27;
                            add_external_impl_0_9_fragment_10.e_27 = e_27;
                            add_external_impl_0_9_fragment_10.i_27 = i_27;
                            add_external_impl_0_9_fragment_10.g_27 = g_27;
                            add_external_impl_0_9_fragment_10.f_27 = f_27;
                            add_external_impl_0_9_fragment_10.b_26 = b_26;
                            add_external_impl_0_9_fragment_10.c_26 = c_26;
                            add_external_impl_0_9_fragment_10.d_26 = d_26;
                            add_external_impl_0_9_fragment_10.e_26 = e_26;
                            add_external_impl_0_9_fragment_10.f_26 = f_26;
                            add_external_impl_0_9_fragment_10.g_26 = g_26;
                            add_external_impl_0_9_fragment_10.h_26 = h_26;
                            add_external_impl_0_9_fragment_10.i_26 = i_26;
                            add_external_impl_0_9_fragment_10.j_26 = j_26;
                            add_external_impl_0_9_fragment_10.h_27 = h_27;
                            term = add_external_impl_0_9_fragment_10.invoke(context, term);
                            if(term == null)
                              break Fail134;
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