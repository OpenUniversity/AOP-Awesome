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

  public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm p_48, IStrategoTerm q_48, IStrategoTerm r_48, IStrategoTerm s_48, IStrategoTerm t_48, IStrategoTerm ref_u_48, IStrategoTerm v_48, IStrategoTerm w_48, IStrategoTerm x_48)
  { 
    ITermFactory termFactory = context.getFactory();
    TermReference u_48 = new TermReference(ref_u_48);
    context.push("make_lock_method_0_9");
    Fail212:
    { 
      IStrategoTerm y_48 = null;
      IStrategoTerm z_48 = null;
      IStrategoTerm a_49 = null;
      IStrategoTerm b_49 = null;
      IStrategoTerm c_49 = null;
      IStrategoTerm d_49 = null;
      IStrategoTerm e_49 = null;
      IStrategoTerm f_49 = null;
      IStrategoTerm g_49 = null;
      TermReference h_49 = new TermReference();
      IStrategoTerm i_49 = null;
      IStrategoTerm j_49 = null;
      IStrategoTerm k_49 = null;
      IStrategoTerm l_49 = null;
      IStrategoTerm m_49 = null;
      IStrategoTerm x_49 = null;
      IStrategoTerm f_51 = null;
      IStrategoTerm g_51 = null;
      if(term.getTermType() != IStrategoTerm.APPL || transform._consMethodSignature_2 != ((IStrategoAppl)term).getConstructor())
        break Fail212;
      IStrategoTerm arg181 = term.getSubterm(0);
      if(arg181.getTermType() != IStrategoTerm.APPL || transform._consId_1 != ((IStrategoAppl)arg181).getConstructor())
        break Fail212;
      j_49 = arg181.getSubterm(0);
      k_49 = term.getSubterm(1);
      x_49 = term;
      IStrategoTerm term195 = term;
      Success153:
      { 
        Fail213:
        { 
          IStrategoTerm n_50 = null;
          IStrategoTerm u_50 = null;
          IStrategoTerm w_50 = null;
          IStrategoTerm x_50 = null;
          IStrategoTerm p_172 = null;
          term = strip_annos_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail213;
          if(h_49.value == null)
            h_49.value = term;
          else
            if(h_49.value != term && !h_49.value.match(term))
              break Fail213;
          Success154:
          { 
            Fail214:
            { 
              IStrategoTerm n_49 = null;
              n_49 = term;
              if(h_49.value == null)
                break Fail214;
              term = termFactory.makeTuple(h_49.value, t_48);
              term = elem_0_0.instance.invoke(context, term);
              if(term == null)
                break Fail214;
              term = n_49;
              { 
                IStrategoTerm g_172 = null;
                term = t_48;
                lifted130 lifted1300 = new lifted130();
                lifted1300.h_49 = h_49;
                term = remove_all_1_0.instance.invoke(context, term, lifted1300);
                if(term == null)
                  break Fail213;
                y_48 = term;
                term = hashtable_get_0_1.instance.invoke(context, w_48, h_49.value);
                if(term == null)
                  break Fail213;
                g_172 = term;
                term = gen_source_location_ann_0_1.instance.invoke(context, g_172, cool.const66);
                if(term == null)
                  break Fail213;
                term = (IStrategoTerm)termFactory.makeListCons(term, (IStrategoList)cool.constNil0);
                z_48 = term;
                if(true)
                  break Success154;
              }
            }
            y_48 = cool.constNil0;
            term = cool.constNil0;
            z_48 = cool.constNil0;
          }
          Success155:
          { 
            Fail215:
            { 
              IStrategoTerm o_49 = null;
              o_49 = term;
              if(h_49.value == null)
                break Fail215;
              term = termFactory.makeTuple(h_49.value, s_48);
              term = elem_0_0.instance.invoke(context, term);
              if(term == null)
                break Fail215;
              term = o_49;
              { 
                IStrategoTerm k_172 = null;
                if(h_49.value == null)
                  break Fail213;
                term = termFactory.makeTuple((IStrategoTerm)termFactory.makeListCons(h_49.value, (IStrategoList)cool.constNil0), y_48);
                term = conc_0_0.instance.invoke(context, term);
                if(term == null)
                  break Fail213;
                a_49 = term;
                term = hashtable_get_0_1.instance.invoke(context, v_48, h_49.value);
                if(term == null)
                  break Fail213;
                k_172 = term;
                term = gen_source_location_ann_0_1.instance.invoke(context, k_172, cool.const67);
                if(term == null)
                  break Fail213;
                term = termFactory.makeTuple((IStrategoTerm)termFactory.makeListCons(term, (IStrategoList)cool.constNil0), z_48);
                term = conc_0_0.instance.invoke(context, term);
                if(term == null)
                  break Fail213;
                e_49 = term;
                if(true)
                  break Success155;
              }
            }
            a_49 = y_48;
            term = z_48;
            e_49 = z_48;
          }
          term = a_49;
          lifted131 lifted1310 = new lifted131();
          lifted1310.u_48 = u_48;
          term = map_1_0.instance.invoke(context, term, lifted1310);
          if(term == null)
            break Fail213;
          c_49 = term;
          Success156:
          { 
            Fail216:
            { 
              IStrategoTerm q_49 = null;
              IStrategoTerm h_50 = null;
              IStrategoTerm i_50 = null;
              q_49 = term;
              i_50 = term;
              term = hashtable_keys_0_0.instance.invoke(context, q_48);
              if(term == null)
                break Fail216;
              h_50 = term;
              term = i_50;
              if(h_49.value == null)
                break Fail216;
              term = termFactory.makeTuple(h_49.value, h_50);
              term = elem_0_0.instance.invoke(context, term);
              if(term == null)
                break Fail216;
              term = q_49;
              { 
                term = hashtable_get_0_1.instance.invoke(context, q_48, h_49.value);
                if(term == null)
                  break Fail213;
                term = termFactory.makeAppl(transform._consInvoke_2, new IStrategoTerm[]{termFactory.makeAppl(transform._consMethod_1, new IStrategoTerm[]{termFactory.makeAppl(transform._consMethodName_1, new IStrategoTerm[]{termFactory.makeAppl(transform._consId_1, new IStrategoTerm[]{term})})}), cool.constNil0});
                term = termFactory.makeAppl(transform._consNot_1, new IStrategoTerm[]{term});
                b_49 = term;
                IStrategoList list0;
                list0 = checkListTail(c_49);
                if(list0 == null)
                  break Fail213;
                term = (IStrategoTerm)termFactory.makeListCons(b_49, list0);
                d_49 = term;
                if(true)
                  break Success156;
              }
            }
            term = c_49;
            d_49 = c_49;
          }
          n_50 = term;
          term = reverse_0_0.instance.invoke(context, d_49);
          if(term == null)
            break Fail213;
          term = make_while_condition_0_1.instance.invoke(context, n_50, term);
          if(term == null)
            break Fail213;
          f_49 = term;
          Success157:
          { 
            Fail217:
            { 
              IStrategoTerm t_49 = null;
              IStrategoTerm o_50 = null;
              IStrategoTerm p_50 = null;
              t_49 = term;
              p_50 = term;
              term = hashtable_keys_0_0.instance.invoke(context, r_48);
              if(term == null)
                break Fail217;
              o_50 = term;
              term = p_50;
              if(h_49.value == null)
                break Fail217;
              term = termFactory.makeTuple(h_49.value, o_50);
              term = elem_0_0.instance.invoke(context, term);
              if(term == null)
                break Fail217;
              term = t_49;
              { 
                term = hashtable_get_0_1.instance.invoke(context, r_48, h_49.value);
                if(term == null)
                  break Fail213;
                term = termFactory.makeAppl(transform._consExprStm_1, new IStrategoTerm[]{termFactory.makeAppl(transform._consInvoke_2, new IStrategoTerm[]{termFactory.makeAppl(transform._consMethod_1, new IStrategoTerm[]{termFactory.makeAppl(transform._consMethodName_1, new IStrategoTerm[]{termFactory.makeAppl(transform._consId_1, new IStrategoTerm[]{term})})}), cool.constCons1})});
                g_49 = term;
                if(true)
                  break Success157;
              }
            }
            term = cool.constNone0;
            g_49 = cool.constNone0;
          }
          Success158:
          { 
            Fail218:
            { 
              IStrategoTerm v_49 = null;
              IStrategoTerm q_50 = null;
              IStrategoTerm r_50 = null;
              v_49 = term;
              r_50 = term;
              term = hashtable_keys_0_0.instance.invoke(context, x_48);
              if(term == null)
                break Fail218;
              q_50 = term;
              term = r_50;
              if(h_49.value == null)
                break Fail218;
              term = termFactory.makeTuple(h_49.value, q_50);
              term = elem_0_0.instance.invoke(context, term);
              if(term == null)
                break Fail218;
              term = v_49;
              { 
                IStrategoTerm o_172 = null;
                term = hashtable_get_0_1.instance.invoke(context, x_48, h_49.value);
                if(term == null)
                  break Fail213;
                o_172 = term;
                term = gen_source_location_ann_0_1.instance.invoke(context, o_172, cool.const68);
                if(term == null)
                  break Fail213;
                term = termFactory.makeTuple((IStrategoTerm)termFactory.makeListCons(term, (IStrategoList)cool.constNil0), e_49);
                term = conc_0_0.instance.invoke(context, term);
                if(term == null)
                  break Fail213;
                l_49 = term;
                if(true)
                  break Success158;
              }
            }
            term = e_49;
            l_49 = e_49;
          }
          w_50 = term;
          x_50 = cool.constCons24;
          p_172 = f_49;
          term = termFactory.makeAppl(transform._consWhile_2, new IStrategoTerm[]{p_172, termFactory.makeAppl(transform._consBlock_1, new IStrategoTerm[]{x_50})});
          u_50 = term;
          term = w_50;
          if(h_49.value == null)
            break Fail213;
          term = gen_method_state_name_0_1.instance.invoke(context, h_49.value, u_48.value);
          if(term == null)
            break Fail213;
          term = termFactory.makeTuple((IStrategoTerm)termFactory.makeListCons(u_50, (IStrategoList)cool.constNil0), (IStrategoTerm)termFactory.makeListCons(g_49, (IStrategoList)cool.constNil0), (IStrategoTerm)termFactory.makeListCons(termFactory.makeAppl(transform._consExprStm_1, new IStrategoTerm[]{termFactory.makeAppl(transform._consInvoke_2, new IStrategoTerm[]{termFactory.makeAppl(transform._consMethod_1, new IStrategoTerm[]{termFactory.makeAppl(transform._consMethodName_2, new IStrategoTerm[]{termFactory.makeAppl(transform._consAmbName_1, new IStrategoTerm[]{termFactory.makeAppl(transform._consId_1, new IStrategoTerm[]{term})}), cool.constId38})}), cool.constCons7})}), (IStrategoList)cool.constNil0));
          term = conc_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail213;
          i_49 = term;
          term = map_1_0.instance.invoke(context, k_49, pp_type_0_0.instance);
          if(term == null)
            break Fail213;
          term = map_1_0.instance.invoke(context, term, lifted133.instance);
          if(term == null)
            break Fail213;
          term = termFactory.makeTuple((IStrategoTerm)termFactory.makeListCons(termFactory.makeAppl(transform._consAnno_2, new IStrategoTerm[]{cool.constTypeName11, (IStrategoTerm)termFactory.makeListCons(termFactory.makeAppl(transform._consElemValPair_2, new IStrategoTerm[]{cool.constId19, termFactory.makeAppl(transform._consLit_1, new IStrategoTerm[]{termFactory.makeAppl(transform._consString_1, new IStrategoTerm[]{(IStrategoTerm)termFactory.makeListCons(termFactory.makeAppl(transform._consChars_1, new IStrategoTerm[]{j_49}), (IStrategoList)cool.constNil0)})})}), termFactory.makeListCons(cool.constElemValPair0, termFactory.makeListCons(termFactory.makeAppl(transform._consElemValPair_2, new IStrategoTerm[]{cool.constId18, termFactory.makeAppl(transform._consElemValArrayInit_1, new IStrategoTerm[]{term})}), (IStrategoList)cool.constNil0)))}), (IStrategoList)cool.constCons19), l_49);
          term = conc_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail213;
          m_49 = term;
          if(true)
            break Success153;
        }
        term = term195;
        IStrategoTerm e_51 = null;
        e_51 = term;
        term = report_with_failure_0_1.instance.invoke(context, e_51, cool.const75);
        if(term == null)
          break Fail212;
      }
      g_51 = x_49;
      term = (IStrategoTerm)termFactory.makeListCons(cool.const76, termFactory.makeListCons(j_49, (IStrategoList)cool.constNil0));
      term = concat_strings_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail212;
      f_51 = term;
      term = g_51;
      if(m_49 == null || i_49 == null)
        break Fail212;
      term = termFactory.makeAppl(transform._consMethodDec_2, new IStrategoTerm[]{termFactory.makeAppl(transform._consMethodDecHead_6, new IStrategoTerm[]{m_49, cool.constNone0, cool.constVoid0, termFactory.makeAppl(transform._consId_1, new IStrategoTerm[]{f_51}), (IStrategoTerm)termFactory.makeListCons(termFactory.makeAppl(transform._consParam_3, new IStrategoTerm[]{cool.constNil0, termFactory.makeAppl(transform._consTypeName_1, new IStrategoTerm[]{termFactory.makeAppl(transform._consId_1, new IStrategoTerm[]{p_48})}), cool.constId0}), (IStrategoList)cool.constNil0), cool.constNone0}), termFactory.makeAppl(transform._consBlock_1, new IStrategoTerm[]{i_49})});
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