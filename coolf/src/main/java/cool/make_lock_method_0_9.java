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

  public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm v_76, IStrategoTerm w_76, IStrategoTerm x_76, IStrategoTerm z_76, IStrategoTerm a_77, IStrategoTerm ref_b_77, IStrategoTerm c_77, IStrategoTerm d_77, IStrategoTerm e_77)
  { 
    ITermFactory termFactory = context.getFactory();
    TermReference b_77 = new TermReference(ref_b_77);
    context.push("make_lock_method_0_9");
    Fail313:
    { 
      IStrategoTerm f_77 = null;
      IStrategoTerm g_77 = null;
      IStrategoTerm h_77 = null;
      IStrategoTerm i_77 = null;
      IStrategoTerm j_77 = null;
      IStrategoTerm l_77 = null;
      IStrategoTerm m_77 = null;
      TermReference n_77 = new TermReference();
      IStrategoTerm o_77 = null;
      IStrategoTerm p_77 = null;
      IStrategoTerm q_77 = null;
      IStrategoTerm r_77 = null;
      IStrategoTerm b_78 = null;
      IStrategoTerm y_78 = null;
      IStrategoTerm z_78 = null;
      if(term.getTermType() != IStrategoTerm.APPL || transform._consMethodSignature_2 != ((IStrategoAppl)term).getConstructor())
        break Fail313;
      IStrategoTerm arg171 = term.getSubterm(0);
      if(arg171.getTermType() != IStrategoTerm.APPL || transform._consId_1 != ((IStrategoAppl)arg171).getConstructor())
        break Fail313;
      p_77 = arg171.getSubterm(0);
      q_77 = term.getSubterm(1);
      b_78 = term;
      IStrategoTerm term299 = term;
      Success254:
      { 
        Fail314:
        { 
          IStrategoTerm l_78 = null;
          IStrategoTerm o_78 = null;
          IStrategoTerm q_78 = null;
          IStrategoTerm s_78 = null;
          term = strip_annos_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail314;
          if(n_77.value == null)
            n_77.value = term;
          else
            if(n_77.value != term && !n_77.value.match(term))
              break Fail314;
          Success255:
          { 
            Fail315:
            { 
              IStrategoTerm s_77 = null;
              s_77 = term;
              if(n_77.value == null)
                break Fail315;
              term = termFactory.makeTuple(n_77.value, a_77);
              term = elem_0_0.instance.invoke(context, term);
              if(term == null)
                break Fail315;
              term = s_77;
              { 
                term = a_77;
                lifted132 lifted1320 = new lifted132();
                lifted1320.n_77 = n_77;
                term = remove_all_1_0.instance.invoke(context, term, lifted1320);
                if(term == null)
                  break Fail314;
                f_77 = term;
                if(true)
                  break Success255;
              }
            }
            term = cool.constNil0;
            f_77 = cool.constNil0;
          }
          Success256:
          { 
            Fail316:
            { 
              IStrategoTerm t_77 = null;
              t_77 = term;
              if(n_77.value == null)
                break Fail316;
              term = termFactory.makeTuple(n_77.value, z_76);
              term = elem_0_0.instance.invoke(context, term);
              if(term == null)
                break Fail316;
              term = t_77;
              { 
                if(n_77.value == null)
                  break Fail314;
                term = termFactory.makeTuple((IStrategoTerm)termFactory.makeListCons(n_77.value, (IStrategoList)cool.constNil0), f_77);
                term = conc_0_0.instance.invoke(context, term);
                if(term == null)
                  break Fail314;
                g_77 = term;
                if(true)
                  break Success256;
              }
            }
            term = f_77;
            g_77 = f_77;
          }
          term = g_77;
          lifted133 lifted1330 = new lifted133();
          lifted1330.b_77 = b_77;
          term = map_1_0.instance.invoke(context, term, lifted1330);
          if(term == null)
            break Fail314;
          i_77 = term;
          Success257:
          { 
            Fail317:
            { 
              IStrategoTerm v_77 = null;
              IStrategoTerm g_78 = null;
              IStrategoTerm h_78 = null;
              v_77 = term;
              h_78 = term;
              term = hashtable_keys_0_0.instance.invoke(context, w_76);
              if(term == null)
                break Fail317;
              g_78 = term;
              term = h_78;
              if(n_77.value == null)
                break Fail317;
              term = termFactory.makeTuple(n_77.value, g_78);
              term = elem_0_0.instance.invoke(context, term);
              if(term == null)
                break Fail317;
              term = v_77;
              { 
                term = hashtable_get_0_1.instance.invoke(context, w_76, n_77.value);
                if(term == null)
                  break Fail314;
                term = termFactory.makeAppl(transform._consInvoke_2, new IStrategoTerm[]{termFactory.makeAppl(transform._consMethod_1, new IStrategoTerm[]{termFactory.makeAppl(transform._consMethodName_1, new IStrategoTerm[]{termFactory.makeAppl(transform._consId_1, new IStrategoTerm[]{term})})}), cool.constNil0});
                term = termFactory.makeAppl(transform._consNot_1, new IStrategoTerm[]{term});
                h_77 = term;
                IStrategoList list8;
                list8 = checkListTail(i_77);
                if(list8 == null)
                  break Fail314;
                term = (IStrategoTerm)termFactory.makeListCons(h_77, list8);
                j_77 = term;
                if(true)
                  break Success257;
              }
            }
            term = i_77;
            j_77 = i_77;
          }
          l_78 = term;
          term = reverse_0_0.instance.invoke(context, j_77);
          if(term == null)
            break Fail314;
          term = make_while_condition_0_1.instance.invoke(context, l_78, term);
          if(term == null)
            break Fail314;
          l_77 = term;
          Success258:
          { 
            Fail318:
            { 
              IStrategoTerm y_77 = null;
              IStrategoTerm m_78 = null;
              IStrategoTerm n_78 = null;
              y_77 = term;
              n_78 = term;
              term = hashtable_keys_0_0.instance.invoke(context, x_76);
              if(term == null)
                break Fail318;
              m_78 = term;
              term = n_78;
              if(n_77.value == null)
                break Fail318;
              term = termFactory.makeTuple(n_77.value, m_78);
              term = elem_0_0.instance.invoke(context, term);
              if(term == null)
                break Fail318;
              term = y_77;
              { 
                term = hashtable_get_0_1.instance.invoke(context, x_76, n_77.value);
                if(term == null)
                  break Fail314;
                term = termFactory.makeAppl(transform._consExprStm_1, new IStrategoTerm[]{termFactory.makeAppl(transform._consInvoke_2, new IStrategoTerm[]{termFactory.makeAppl(transform._consMethod_1, new IStrategoTerm[]{termFactory.makeAppl(transform._consMethodName_1, new IStrategoTerm[]{termFactory.makeAppl(transform._consId_1, new IStrategoTerm[]{term})})}), cool.constCons19})});
                m_77 = term;
                if(true)
                  break Success258;
              }
            }
            term = cool.constNone0;
            m_77 = cool.constNone0;
          }
          q_78 = term;
          s_78 = term;
          term = make_while_statement_0_2.instance.invoke(context, s_78, l_77, cool.constCons42);
          if(term == null)
            break Fail314;
          o_78 = term;
          term = q_78;
          if(n_77.value == null)
            break Fail314;
          term = gen_method_state_name_0_1.instance.invoke(context, n_77.value, b_77.value);
          if(term == null)
            break Fail314;
          term = termFactory.makeTuple((IStrategoTerm)termFactory.makeListCons(o_78, (IStrategoList)cool.constNil0), (IStrategoTerm)termFactory.makeListCons(m_77, (IStrategoList)cool.constNil0), (IStrategoTerm)termFactory.makeListCons(termFactory.makeAppl(transform._consExprStm_1, new IStrategoTerm[]{termFactory.makeAppl(transform._consInvoke_2, new IStrategoTerm[]{termFactory.makeAppl(transform._consMethod_1, new IStrategoTerm[]{termFactory.makeAppl(transform._consMethodName_2, new IStrategoTerm[]{termFactory.makeAppl(transform._consAmbName_1, new IStrategoTerm[]{termFactory.makeAppl(transform._consId_1, new IStrategoTerm[]{term})}), cool.constId33})}), cool.constCons24})}), (IStrategoList)cool.constNil0));
          term = conc_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail314;
          o_77 = term;
          term = map_1_0.instance.invoke(context, q_77, pp_type_0_0.instance);
          if(term == null)
            break Fail314;
          term = map_1_0.instance.invoke(context, term, lifted135.instance);
          if(term == null)
            break Fail314;
          term = (IStrategoTerm)termFactory.makeListCons(termFactory.makeAppl(transform._consAnno_2, new IStrategoTerm[]{cool.constTypeName11, (IStrategoTerm)termFactory.makeListCons(termFactory.makeAppl(transform._consElemValPair_2, new IStrategoTerm[]{cool.constId19, termFactory.makeAppl(transform._consLit_1, new IStrategoTerm[]{termFactory.makeAppl(transform._consString_1, new IStrategoTerm[]{(IStrategoTerm)termFactory.makeListCons(termFactory.makeAppl(transform._consChars_1, new IStrategoTerm[]{p_77}), (IStrategoList)cool.constNil0)})})}), termFactory.makeListCons(cool.constElemValPair0, termFactory.makeListCons(termFactory.makeAppl(transform._consElemValPair_2, new IStrategoTerm[]{cool.constId18, termFactory.makeAppl(transform._consElemValArrayInit_1, new IStrategoTerm[]{term})}), (IStrategoList)cool.constNil0)))}), (IStrategoList)cool.constCons37);
          term = conc_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail314;
          r_77 = term;
          if(true)
            break Success254;
        }
        term = term299;
        IStrategoTerm x_78 = null;
        x_78 = term;
        term = report_with_failure_0_1.instance.invoke(context, x_78, cool.const131);
        if(term == null)
          break Fail313;
      }
      z_78 = b_78;
      term = (IStrategoTerm)termFactory.makeListCons(cool.const132, termFactory.makeListCons(p_77, (IStrategoList)cool.constNil0));
      term = concat_strings_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail313;
      y_78 = term;
      term = z_78;
      if(r_77 == null || o_77 == null)
        break Fail313;
      term = termFactory.makeAppl(transform._consMethodDec_2, new IStrategoTerm[]{termFactory.makeAppl(transform._consMethodDecHead_6, new IStrategoTerm[]{r_77, cool.constNone0, cool.constVoid0, termFactory.makeAppl(transform._consId_1, new IStrategoTerm[]{y_78}), (IStrategoTerm)termFactory.makeListCons(termFactory.makeAppl(transform._consParam_3, new IStrategoTerm[]{cool.constNil0, termFactory.makeAppl(transform._consTypeName_1, new IStrategoTerm[]{termFactory.makeAppl(transform._consId_1, new IStrategoTerm[]{v_76})}), cool.constId0}), (IStrategoList)cool.constNil0), cool.constNone0}), termFactory.makeAppl(transform._consBlock_1, new IStrategoTerm[]{o_77})});
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