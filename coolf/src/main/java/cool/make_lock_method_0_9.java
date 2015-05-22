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

  public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm b_48, IStrategoTerm c_48, IStrategoTerm d_48, IStrategoTerm e_48, IStrategoTerm f_48, IStrategoTerm ref_g_48, IStrategoTerm h_48, IStrategoTerm i_48, IStrategoTerm j_48)
  { 
    ITermFactory termFactory = context.getFactory();
    TermReference g_48 = new TermReference(ref_g_48);
    context.push("make_lock_method_0_9");
    Fail211:
    { 
      IStrategoTerm k_48 = null;
      IStrategoTerm l_48 = null;
      IStrategoTerm m_48 = null;
      IStrategoTerm n_48 = null;
      IStrategoTerm o_48 = null;
      IStrategoTerm p_48 = null;
      IStrategoTerm q_48 = null;
      IStrategoTerm r_48 = null;
      IStrategoTerm s_48 = null;
      TermReference t_48 = new TermReference();
      IStrategoTerm u_48 = null;
      IStrategoTerm v_48 = null;
      IStrategoTerm w_48 = null;
      IStrategoTerm x_48 = null;
      IStrategoTerm y_48 = null;
      IStrategoTerm j_49 = null;
      IStrategoTerm q_50 = null;
      IStrategoTerm r_50 = null;
      if(term.getTermType() != IStrategoTerm.APPL || transform._consMethodSignature_2 != ((IStrategoAppl)term).getConstructor())
        break Fail211;
      IStrategoTerm arg181 = term.getSubterm(0);
      if(arg181.getTermType() != IStrategoTerm.APPL || transform._consId_1 != ((IStrategoAppl)arg181).getConstructor())
        break Fail211;
      v_48 = arg181.getSubterm(0);
      w_48 = term.getSubterm(1);
      j_49 = term;
      IStrategoTerm term194 = term;
      Success152:
      { 
        Fail212:
        { 
          IStrategoTerm x_49 = null;
          IStrategoTerm f_50 = null;
          IStrategoTerm h_50 = null;
          IStrategoTerm i_50 = null;
          IStrategoTerm b_172 = null;
          term = strip_annos_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail212;
          if(t_48.value == null)
            t_48.value = term;
          else
            if(t_48.value != term && !t_48.value.match(term))
              break Fail212;
          Success153:
          { 
            Fail213:
            { 
              IStrategoTerm z_48 = null;
              z_48 = term;
              if(t_48.value == null)
                break Fail213;
              term = termFactory.makeTuple(t_48.value, f_48);
              term = elem_0_0.instance.invoke(context, term);
              if(term == null)
                break Fail213;
              term = z_48;
              { 
                IStrategoTerm s_171 = null;
                term = f_48;
                lifted130 lifted1300 = new lifted130();
                lifted1300.t_48 = t_48;
                term = remove_all_1_0.instance.invoke(context, term, lifted1300);
                if(term == null)
                  break Fail212;
                k_48 = term;
                term = hashtable_get_0_1.instance.invoke(context, i_48, t_48.value);
                if(term == null)
                  break Fail212;
                s_171 = term;
                term = gen_source_location_ann_0_1.instance.invoke(context, s_171, cool.const64);
                if(term == null)
                  break Fail212;
                term = (IStrategoTerm)termFactory.makeListCons(term, (IStrategoList)cool.constNil0);
                l_48 = term;
                if(true)
                  break Success153;
              }
            }
            k_48 = cool.constNil0;
            term = cool.constNil0;
            l_48 = cool.constNil0;
          }
          Success154:
          { 
            Fail214:
            { 
              IStrategoTerm a_49 = null;
              a_49 = term;
              if(t_48.value == null)
                break Fail214;
              term = termFactory.makeTuple(t_48.value, e_48);
              term = elem_0_0.instance.invoke(context, term);
              if(term == null)
                break Fail214;
              term = a_49;
              { 
                IStrategoTerm w_171 = null;
                if(t_48.value == null)
                  break Fail212;
                term = termFactory.makeTuple((IStrategoTerm)termFactory.makeListCons(t_48.value, (IStrategoList)cool.constNil0), k_48);
                term = conc_0_0.instance.invoke(context, term);
                if(term == null)
                  break Fail212;
                m_48 = term;
                term = hashtable_get_0_1.instance.invoke(context, h_48, t_48.value);
                if(term == null)
                  break Fail212;
                w_171 = term;
                term = gen_source_location_ann_0_1.instance.invoke(context, w_171, cool.const65);
                if(term == null)
                  break Fail212;
                term = termFactory.makeTuple((IStrategoTerm)termFactory.makeListCons(term, (IStrategoList)cool.constNil0), l_48);
                term = conc_0_0.instance.invoke(context, term);
                if(term == null)
                  break Fail212;
                q_48 = term;
                if(true)
                  break Success154;
              }
            }
            m_48 = k_48;
            term = l_48;
            q_48 = l_48;
          }
          term = m_48;
          lifted131 lifted1310 = new lifted131();
          lifted1310.g_48 = g_48;
          term = map_1_0.instance.invoke(context, term, lifted1310);
          if(term == null)
            break Fail212;
          o_48 = term;
          Success155:
          { 
            Fail215:
            { 
              IStrategoTerm c_49 = null;
              IStrategoTerm s_49 = null;
              IStrategoTerm t_49 = null;
              c_49 = term;
              t_49 = term;
              term = hashtable_keys_0_0.instance.invoke(context, c_48);
              if(term == null)
                break Fail215;
              s_49 = term;
              term = t_49;
              if(t_48.value == null)
                break Fail215;
              term = termFactory.makeTuple(t_48.value, s_49);
              term = elem_0_0.instance.invoke(context, term);
              if(term == null)
                break Fail215;
              term = c_49;
              { 
                term = hashtable_get_0_1.instance.invoke(context, c_48, t_48.value);
                if(term == null)
                  break Fail212;
                term = termFactory.makeAppl(transform._consInvoke_2, new IStrategoTerm[]{termFactory.makeAppl(transform._consMethod_1, new IStrategoTerm[]{termFactory.makeAppl(transform._consMethodName_1, new IStrategoTerm[]{termFactory.makeAppl(transform._consId_1, new IStrategoTerm[]{term})})}), cool.constNil0});
                term = termFactory.makeAppl(transform._consNot_1, new IStrategoTerm[]{term});
                n_48 = term;
                IStrategoList list0;
                list0 = checkListTail(o_48);
                if(list0 == null)
                  break Fail212;
                term = (IStrategoTerm)termFactory.makeListCons(n_48, list0);
                p_48 = term;
                if(true)
                  break Success155;
              }
            }
            term = o_48;
            p_48 = o_48;
          }
          x_49 = term;
          term = reverse_0_0.instance.invoke(context, p_48);
          if(term == null)
            break Fail212;
          term = make_while_condition_0_1.instance.invoke(context, x_49, term);
          if(term == null)
            break Fail212;
          r_48 = term;
          Success156:
          { 
            Fail216:
            { 
              IStrategoTerm f_49 = null;
              IStrategoTerm y_49 = null;
              IStrategoTerm z_49 = null;
              f_49 = term;
              z_49 = term;
              term = hashtable_keys_0_0.instance.invoke(context, d_48);
              if(term == null)
                break Fail216;
              y_49 = term;
              term = z_49;
              if(t_48.value == null)
                break Fail216;
              term = termFactory.makeTuple(t_48.value, y_49);
              term = elem_0_0.instance.invoke(context, term);
              if(term == null)
                break Fail216;
              term = f_49;
              { 
                term = hashtable_get_0_1.instance.invoke(context, d_48, t_48.value);
                if(term == null)
                  break Fail212;
                term = termFactory.makeAppl(transform._consExprStm_1, new IStrategoTerm[]{termFactory.makeAppl(transform._consInvoke_2, new IStrategoTerm[]{termFactory.makeAppl(transform._consMethod_1, new IStrategoTerm[]{termFactory.makeAppl(transform._consMethodName_1, new IStrategoTerm[]{termFactory.makeAppl(transform._consId_1, new IStrategoTerm[]{term})})}), cool.constCons1})});
                s_48 = term;
                if(true)
                  break Success156;
              }
            }
            term = cool.constNone0;
            s_48 = cool.constNone0;
          }
          Success157:
          { 
            Fail217:
            { 
              IStrategoTerm h_49 = null;
              IStrategoTerm a_50 = null;
              IStrategoTerm b_50 = null;
              h_49 = term;
              b_50 = term;
              term = hashtable_keys_0_0.instance.invoke(context, j_48);
              if(term == null)
                break Fail217;
              a_50 = term;
              term = b_50;
              if(t_48.value == null)
                break Fail217;
              term = termFactory.makeTuple(t_48.value, a_50);
              term = elem_0_0.instance.invoke(context, term);
              if(term == null)
                break Fail217;
              term = h_49;
              { 
                IStrategoTerm a_172 = null;
                term = hashtable_get_0_1.instance.invoke(context, j_48, t_48.value);
                if(term == null)
                  break Fail212;
                a_172 = term;
                term = gen_source_location_ann_0_1.instance.invoke(context, a_172, cool.const66);
                if(term == null)
                  break Fail212;
                term = termFactory.makeTuple((IStrategoTerm)termFactory.makeListCons(term, (IStrategoList)cool.constNil0), q_48);
                term = conc_0_0.instance.invoke(context, term);
                if(term == null)
                  break Fail212;
                x_48 = term;
                if(true)
                  break Success157;
              }
            }
            term = q_48;
            x_48 = q_48;
          }
          h_50 = term;
          i_50 = cool.constCons24;
          b_172 = r_48;
          term = termFactory.makeAppl(transform._consWhile_2, new IStrategoTerm[]{b_172, termFactory.makeAppl(transform._consBlock_1, new IStrategoTerm[]{i_50})});
          f_50 = term;
          term = h_50;
          if(t_48.value == null)
            break Fail212;
          term = gen_method_state_name_0_1.instance.invoke(context, t_48.value, g_48.value);
          if(term == null)
            break Fail212;
          term = termFactory.makeTuple((IStrategoTerm)termFactory.makeListCons(f_50, (IStrategoList)cool.constNil0), (IStrategoTerm)termFactory.makeListCons(s_48, (IStrategoList)cool.constNil0), (IStrategoTerm)termFactory.makeListCons(termFactory.makeAppl(transform._consExprStm_1, new IStrategoTerm[]{termFactory.makeAppl(transform._consInvoke_2, new IStrategoTerm[]{termFactory.makeAppl(transform._consMethod_1, new IStrategoTerm[]{termFactory.makeAppl(transform._consMethodName_2, new IStrategoTerm[]{termFactory.makeAppl(transform._consAmbName_1, new IStrategoTerm[]{termFactory.makeAppl(transform._consId_1, new IStrategoTerm[]{term})}), cool.constId36})}), cool.constCons7})}), (IStrategoList)cool.constNil0));
          term = conc_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail212;
          u_48 = term;
          term = map_1_0.instance.invoke(context, w_48, pp_type_0_0.instance);
          if(term == null)
            break Fail212;
          term = map_1_0.instance.invoke(context, term, lifted133.instance);
          if(term == null)
            break Fail212;
          term = termFactory.makeTuple((IStrategoTerm)termFactory.makeListCons(termFactory.makeAppl(transform._consAnno_2, new IStrategoTerm[]{cool.constTypeName10, (IStrategoTerm)termFactory.makeListCons(termFactory.makeAppl(transform._consElemValPair_2, new IStrategoTerm[]{cool.constId18, termFactory.makeAppl(transform._consLit_1, new IStrategoTerm[]{termFactory.makeAppl(transform._consString_1, new IStrategoTerm[]{(IStrategoTerm)termFactory.makeListCons(termFactory.makeAppl(transform._consChars_1, new IStrategoTerm[]{v_48}), (IStrategoList)cool.constNil0)})})}), termFactory.makeListCons(cool.constElemValPair0, termFactory.makeListCons(termFactory.makeAppl(transform._consElemValPair_2, new IStrategoTerm[]{cool.constId17, termFactory.makeAppl(transform._consElemValArrayInit_1, new IStrategoTerm[]{term})}), (IStrategoList)cool.constNil0)))}), (IStrategoList)cool.constCons19), x_48);
          term = conc_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail212;
          y_48 = term;
          if(true)
            break Success152;
        }
        term = term194;
        IStrategoTerm p_50 = null;
        p_50 = term;
        term = report_with_failure_0_1.instance.invoke(context, p_50, cool.const72);
        if(term == null)
          break Fail211;
      }
      r_50 = j_49;
      term = (IStrategoTerm)termFactory.makeListCons(cool.const73, termFactory.makeListCons(v_48, (IStrategoList)cool.constNil0));
      term = concat_strings_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail211;
      q_50 = term;
      term = r_50;
      if(y_48 == null || u_48 == null)
        break Fail211;
      term = termFactory.makeAppl(transform._consMethodDec_2, new IStrategoTerm[]{termFactory.makeAppl(transform._consMethodDecHead_6, new IStrategoTerm[]{y_48, cool.constNone0, cool.constVoid0, termFactory.makeAppl(transform._consId_1, new IStrategoTerm[]{q_50}), (IStrategoTerm)termFactory.makeListCons(termFactory.makeAppl(transform._consParam_3, new IStrategoTerm[]{cool.constNil0, termFactory.makeAppl(transform._consTypeName_1, new IStrategoTerm[]{termFactory.makeAppl(transform._consId_1, new IStrategoTerm[]{b_48})}), cool.constId0}), (IStrategoList)cool.constNil0), cool.constNone0}), termFactory.makeAppl(transform._consBlock_1, new IStrategoTerm[]{u_48})});
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