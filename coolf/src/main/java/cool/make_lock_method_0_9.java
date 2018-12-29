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

@SuppressWarnings("all") public class make_lock_method_0_9 extends Strategy 
{ 
  public static make_lock_method_0_9 instance = new make_lock_method_0_9();

  public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm h_47, IStrategoTerm i_47, IStrategoTerm j_47, IStrategoTerm k_47, IStrategoTerm l_47, IStrategoTerm ref_m_47, IStrategoTerm n_47, IStrategoTerm o_47, IStrategoTerm p_47)
  { 
    ITermFactory termFactory = context.getFactory();
    TermReference m_47 = new TermReference(ref_m_47);
    context.push("make_lock_method_0_9");
    Fail205:
    { 
      IStrategoTerm q_47 = null;
      IStrategoTerm r_47 = null;
      IStrategoTerm s_47 = null;
      IStrategoTerm t_47 = null;
      IStrategoTerm u_47 = null;
      IStrategoTerm v_47 = null;
      IStrategoTerm x_47 = null;
      IStrategoTerm y_47 = null;
      TermReference z_47 = new TermReference();
      IStrategoTerm a_48 = null;
      IStrategoTerm b_48 = null;
      IStrategoTerm c_48 = null;
      IStrategoTerm d_48 = null;
      IStrategoTerm e_48 = null;
      IStrategoTerm p_48 = null;
      IStrategoTerm u_49 = null;
      IStrategoTerm v_49 = null;
      if(term.getTermType() != IStrategoTerm.APPL || transform._consMethodSignature_2 != ((IStrategoAppl)term).getConstructor())
        break Fail205;
      IStrategoTerm arg163 = term.getSubterm(0);
      if(arg163.getTermType() != IStrategoTerm.APPL || transform._consId_1 != ((IStrategoAppl)arg163).getConstructor())
        break Fail205;
      b_48 = arg163.getSubterm(0);
      c_48 = term.getSubterm(1);
      p_48 = term;
      IStrategoTerm term195 = term;
      Success153:
      { 
        Fail206:
        { 
          IStrategoTerm d_49 = null;
          IStrategoTerm k_49 = null;
          IStrategoTerm m_49 = null;
          IStrategoTerm n_49 = null;
          IStrategoTerm h_171 = null;
          term = strip_annos_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail206;
          if(z_47.value == null)
            z_47.value = term;
          else
            if(z_47.value != term && !z_47.value.match(term))
              break Fail206;
          Success154:
          { 
            Fail207:
            { 
              IStrategoTerm f_48 = null;
              f_48 = term;
              if(z_47.value == null)
                break Fail207;
              term = termFactory.makeTuple(z_47.value, l_47);
              term = elem_0_0.instance.invoke(context, term);
              if(term == null)
                break Fail207;
              term = f_48;
              { 
                term = l_47;
                lifted130 lifted1300 = new lifted130();
                lifted1300.z_47 = z_47;
                term = remove_all_1_0.instance.invoke(context, term, lifted1300);
                if(term == null)
                  break Fail206;
                q_47 = term;
                term = hashtable_get_0_1.instance.invoke(context, o_47, z_47.value);
                if(term == null)
                  break Fail206;
                term = gen_source_location_ann_0_0.instance.invoke(context, term);
                if(term == null)
                  break Fail206;
                term = (IStrategoTerm)termFactory.makeListCons(term, (IStrategoList)cool.constNil0);
                d_48 = term;
                if(true)
                  break Success154;
              }
            }
            q_47 = cool.constNil0;
            term = cool.constNil0;
            d_48 = cool.constNil0;
          }
          Success155:
          { 
            Fail208:
            { 
              IStrategoTerm g_48 = null;
              g_48 = term;
              if(z_47.value == null)
                break Fail208;
              term = termFactory.makeTuple(z_47.value, k_47);
              term = elem_0_0.instance.invoke(context, term);
              if(term == null)
                break Fail208;
              term = g_48;
              { 
                if(z_47.value == null)
                  break Fail206;
                term = termFactory.makeTuple((IStrategoTerm)termFactory.makeListCons(z_47.value, (IStrategoList)cool.constNil0), q_47);
                term = conc_0_0.instance.invoke(context, term);
                if(term == null)
                  break Fail206;
                r_47 = term;
                term = hashtable_get_0_1.instance.invoke(context, n_47, z_47.value);
                if(term == null)
                  break Fail206;
                term = gen_source_location_ann_0_0.instance.invoke(context, term);
                if(term == null)
                  break Fail206;
                term = termFactory.makeTuple((IStrategoTerm)termFactory.makeListCons(term, (IStrategoList)cool.constNil0), d_48);
                term = conc_0_0.instance.invoke(context, term);
                if(term == null)
                  break Fail206;
                v_47 = term;
                if(true)
                  break Success155;
              }
            }
            r_47 = q_47;
            term = d_48;
            v_47 = d_48;
          }
          term = r_47;
          lifted131 lifted1310 = new lifted131();
          lifted1310.m_47 = m_47;
          term = map_1_0.instance.invoke(context, term, lifted1310);
          if(term == null)
            break Fail206;
          t_47 = term;
          Success156:
          { 
            Fail209:
            { 
              IStrategoTerm i_48 = null;
              IStrategoTerm y_48 = null;
              IStrategoTerm z_48 = null;
              i_48 = term;
              z_48 = term;
              term = hashtable_keys_0_0.instance.invoke(context, i_47);
              if(term == null)
                break Fail209;
              y_48 = term;
              term = z_48;
              if(z_47.value == null)
                break Fail209;
              term = termFactory.makeTuple(z_47.value, y_48);
              term = elem_0_0.instance.invoke(context, term);
              if(term == null)
                break Fail209;
              term = i_48;
              { 
                term = hashtable_get_0_1.instance.invoke(context, i_47, z_47.value);
                if(term == null)
                  break Fail206;
                term = termFactory.makeAppl(transform._consInvoke_2, new IStrategoTerm[]{termFactory.makeAppl(transform._consMethod_1, new IStrategoTerm[]{termFactory.makeAppl(transform._consMethodName_1, new IStrategoTerm[]{termFactory.makeAppl(transform._consId_1, new IStrategoTerm[]{term})})}), cool.constNil0});
                term = termFactory.makeAppl(transform._consNot_1, new IStrategoTerm[]{term});
                s_47 = term;
                IStrategoList list0;
                list0 = checkListTail(t_47);
                if(list0 == null)
                  break Fail206;
                term = (IStrategoTerm)termFactory.makeListCons(s_47, list0);
                u_47 = term;
                if(true)
                  break Success156;
              }
            }
            term = t_47;
            u_47 = t_47;
          }
          d_49 = term;
          term = reverse_0_0.instance.invoke(context, u_47);
          if(term == null)
            break Fail206;
          term = make_while_condition_0_1.instance.invoke(context, d_49, term);
          if(term == null)
            break Fail206;
          x_47 = term;
          Success157:
          { 
            Fail210:
            { 
              IStrategoTerm l_48 = null;
              IStrategoTerm e_49 = null;
              IStrategoTerm f_49 = null;
              l_48 = term;
              f_49 = term;
              term = hashtable_keys_0_0.instance.invoke(context, j_47);
              if(term == null)
                break Fail210;
              e_49 = term;
              term = f_49;
              if(z_47.value == null)
                break Fail210;
              term = termFactory.makeTuple(z_47.value, e_49);
              term = elem_0_0.instance.invoke(context, term);
              if(term == null)
                break Fail210;
              term = l_48;
              { 
                term = hashtable_get_0_1.instance.invoke(context, j_47, z_47.value);
                if(term == null)
                  break Fail206;
                term = termFactory.makeAppl(transform._consExprStm_1, new IStrategoTerm[]{termFactory.makeAppl(transform._consInvoke_2, new IStrategoTerm[]{termFactory.makeAppl(transform._consMethod_1, new IStrategoTerm[]{termFactory.makeAppl(transform._consMethodName_1, new IStrategoTerm[]{termFactory.makeAppl(transform._consId_1, new IStrategoTerm[]{term})})}), cool.constCons1})});
                y_47 = term;
                if(true)
                  break Success157;
              }
            }
            term = cool.constNone0;
            y_47 = cool.constNone0;
          }
          Success158:
          { 
            Fail211:
            { 
              IStrategoTerm n_48 = null;
              IStrategoTerm g_49 = null;
              IStrategoTerm h_49 = null;
              n_48 = term;
              h_49 = term;
              term = hashtable_keys_0_0.instance.invoke(context, p_47);
              if(term == null)
                break Fail211;
              g_49 = term;
              term = h_49;
              if(z_47.value == null)
                break Fail211;
              term = termFactory.makeTuple(z_47.value, g_49);
              term = elem_0_0.instance.invoke(context, term);
              if(term == null)
                break Fail211;
              term = n_48;
              { 
                term = hashtable_get_0_1.instance.invoke(context, p_47, z_47.value);
                if(term == null)
                  break Fail206;
                term = gen_source_location_ann_0_0.instance.invoke(context, term);
                if(term == null)
                  break Fail206;
                term = termFactory.makeTuple((IStrategoTerm)termFactory.makeListCons(term, (IStrategoList)cool.constNil0), v_47);
                term = conc_0_0.instance.invoke(context, term);
                if(term == null)
                  break Fail206;
                if(true)
                  break Success158;
              }
            }
            term = v_47;
          }
          m_49 = term;
          n_49 = cool.constCons29;
          h_171 = x_47;
          term = termFactory.makeAppl(transform._consWhile_2, new IStrategoTerm[]{h_171, termFactory.makeAppl(transform._consBlock_1, new IStrategoTerm[]{n_49})});
          k_49 = term;
          term = m_49;
          if(z_47.value == null)
            break Fail206;
          term = gen_method_state_name_0_1.instance.invoke(context, z_47.value, m_47.value);
          if(term == null)
            break Fail206;
          term = termFactory.makeTuple((IStrategoTerm)termFactory.makeListCons(k_49, (IStrategoList)cool.constNil0), (IStrategoTerm)termFactory.makeListCons(y_47, (IStrategoList)cool.constNil0), (IStrategoTerm)termFactory.makeListCons(termFactory.makeAppl(transform._consExprStm_1, new IStrategoTerm[]{termFactory.makeAppl(transform._consInvoke_2, new IStrategoTerm[]{termFactory.makeAppl(transform._consMethod_1, new IStrategoTerm[]{termFactory.makeAppl(transform._consMethodName_2, new IStrategoTerm[]{termFactory.makeAppl(transform._consAmbName_1, new IStrategoTerm[]{termFactory.makeAppl(transform._consId_1, new IStrategoTerm[]{term})}), cool.constId37})}), cool.constCons7})}), (IStrategoList)cool.constNil0));
          term = conc_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail206;
          a_48 = term;
          term = map_1_0.instance.invoke(context, c_48, pp_type_0_0.instance);
          if(term == null)
            break Fail206;
          term = map_1_0.instance.invoke(context, term, lifted133.instance);
          if(term == null)
            break Fail206;
          term = termFactory.makeTuple((IStrategoTerm)termFactory.makeListCons(termFactory.makeAppl(transform._consAnno_2, new IStrategoTerm[]{cool.constTypeName11, (IStrategoTerm)termFactory.makeListCons(termFactory.makeAppl(transform._consElemValPair_2, new IStrategoTerm[]{cool.constId19, termFactory.makeAppl(transform._consLit_1, new IStrategoTerm[]{termFactory.makeAppl(transform._consString_1, new IStrategoTerm[]{(IStrategoTerm)termFactory.makeListCons(termFactory.makeAppl(transform._consChars_1, new IStrategoTerm[]{b_48}), (IStrategoList)cool.constNil0)})})}), termFactory.makeListCons(cool.constElemValPair0, termFactory.makeListCons(termFactory.makeAppl(transform._consElemValPair_2, new IStrategoTerm[]{cool.constId18, termFactory.makeAppl(transform._consElemValArrayInit_1, new IStrategoTerm[]{term})}), (IStrategoList)cool.constNil0)))}), (IStrategoList)cool.constCons24), d_48);
          term = conc_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail206;
          e_48 = term;
          if(true)
            break Success153;
        }
        term = term195;
        IStrategoTerm t_49 = null;
        t_49 = term;
        term = report_with_failure_0_1.instance.invoke(context, t_49, cool.const71);
        if(term == null)
          break Fail205;
      }
      v_49 = p_48;
      term = (IStrategoTerm)termFactory.makeListCons(cool.const72, termFactory.makeListCons(b_48, (IStrategoList)cool.constNil0));
      term = concat_strings_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail205;
      u_49 = term;
      term = v_49;
      if(e_48 == null || a_48 == null)
        break Fail205;
      term = termFactory.makeAppl(transform._consMethodDec_2, new IStrategoTerm[]{termFactory.makeAppl(transform._consMethodDecHead_6, new IStrategoTerm[]{e_48, cool.constNone0, cool.constVoid0, termFactory.makeAppl(transform._consId_1, new IStrategoTerm[]{u_49}), (IStrategoTerm)termFactory.makeListCons(termFactory.makeAppl(transform._consParam_3, new IStrategoTerm[]{cool.constNil0, termFactory.makeAppl(transform._consTypeName_1, new IStrategoTerm[]{termFactory.makeAppl(transform._consId_1, new IStrategoTerm[]{h_47})}), cool.constId0}), (IStrategoList)cool.constNil0), cool.constNone0}), termFactory.makeAppl(transform._consBlock_1, new IStrategoTerm[]{a_48})});
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