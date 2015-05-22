package ejp;

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

@SuppressWarnings("all") public class scoped_ejp_to_java_0_4 extends Strategy 
{ 
  public static scoped_ejp_to_java_0_4 instance = new scoped_ejp_to_java_0_4();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm b_23, IStrategoTerm ref_c_23, IStrategoTerm ref_d_23, IStrategoTerm ref_e_23)
  { 
    ITermFactory termFactory = context.getFactory();
    TermReference c_23 = new TermReference(ref_c_23);
    TermReference d_23 = new TermReference(ref_d_23);
    TermReference e_23 = new TermReference(ref_e_23);
    context.push("scoped_ejp_to_java_0_4");
    Fail38:
    { 
      IStrategoTerm f_23 = null;
      IStrategoTerm h_23 = null;
      IStrategoTerm i_23 = null;
      IStrategoTerm j_23 = null;
      TermReference k_23 = new TermReference();
      IStrategoTerm m_23 = null;
      IStrategoTerm n_23 = null;
      IStrategoTerm o_23 = null;
      IStrategoTerm p_23 = null;
      IStrategoTerm q_23 = null;
      IStrategoTerm r_23 = null;
      TermReference s_23 = new TermReference();
      IStrategoTerm t_23 = null;
      IStrategoTerm u_23 = null;
      TermReference v_23 = new TermReference();
      IStrategoTerm w_23 = null;
      IStrategoTerm x_23 = null;
      IStrategoTerm c_25 = null;
      IStrategoTerm d_25 = null;
      IStrategoTerm e_25 = null;
      IStrategoTerm f_25 = null;
      if(term.getTermType() != IStrategoTerm.APPL || transform._consScopedEJPCall_3 != ((IStrategoAppl)term).getConstructor())
        break Fail38;
      if(v_23.value == null)
        v_23.value = term.getSubterm(0);
      else
        if(v_23.value != term.getSubterm(0) && !v_23.value.match(term.getSubterm(0)))
          break Fail38;
      f_23 = term.getSubterm(1);
      IStrategoTerm arg59 = term.getSubterm(2);
      if(arg59.getTermType() != IStrategoTerm.APPL || transform._consBlock_1 != ((IStrategoAppl)arg59).getConstructor())
        break Fail38;
      i_23 = arg59.getSubterm(0);
      x_23 = term;
      IStrategoTerm term20 = term;
      Success20:
      { 
        Fail39:
        { 
          IStrategoTerm d_24 = null;
          IStrategoTerm e_24 = null;
          IStrategoTerm h_24 = null;
          IStrategoTerm j_24 = null;
          IStrategoTerm m_24 = null;
          IStrategoTerm o_24 = null;
          IStrategoTerm p_24 = null;
          IStrategoTerm x_24 = null;
          term = random_string_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail39;
          if(k_23.value == null)
            k_23.value = term;
          else
            if(k_23.value != term && !k_23.value.match(term))
              break Fail39;
          term = f_23;
          lifted43 lifted430 = new lifted43();
          lifted430.c_23 = c_23;
          lifted430.d_23 = d_23;
          lifted430.k_23 = k_23;
          term = topdown_1_0.instance.invoke(context, term, lifted430);
          if(term == null)
            break Fail39;
          lifted45 lifted450 = new lifted45();
          lifted450.e_23 = e_23;
          lifted450.v_23 = v_23;
          term = try_1_0.instance.invoke(context, term, lifted450);
          if(term == null)
            break Fail39;
          term = get_vars_in_block_0_0.instance.invoke(context, i_23);
          if(term == null)
            break Fail39;
          h_23 = term;
          term = get_inner_scoped_vars_0_0.instance.invoke(context, i_23);
          if(term == null)
            break Fail39;
          if(s_23.value == null)
            s_23.value = term;
          else
            if(s_23.value != term && !s_23.value.match(term))
              break Fail39;
          term = new_iset_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail39;
          d_24 = term;
          term = hashtable_keys_0_0.instance.invoke(context, b_23);
          if(term == null)
            break Fail39;
          term = iset_addlist_0_1.instance.invoke(context, d_24, term);
          if(term == null)
            break Fail39;
          term = iset_isect_0_1.instance.invoke(context, term, h_23);
          if(term == null)
            break Fail39;
          r_23 = term;
          term = new_iset_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail39;
          e_24 = term;
          j_23 = term;
          h_24 = e_24;
          term = iset_elements_0_0.instance.invoke(context, r_23);
          if(term == null)
            break Fail39;
          term = iset_addlist_0_1.instance.invoke(context, h_24, term);
          if(term == null)
            break Fail39;
          term = j_23;
          j_24 = j_23;
          if(s_23.value == null)
            break Fail39;
          term = hashtable_keys_0_0.instance.invoke(context, s_23.value);
          if(term == null)
            break Fail39;
          term = iset_addlist_0_1.instance.invoke(context, j_24, term);
          if(term == null)
            break Fail39;
          term = gen_auxilary_class_name_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail39;
          n_23 = term;
          term = my_hashtable_union_0_1.instance.invoke(context, b_23, s_23.value);
          if(term == null)
            break Fail39;
          p_24 = term;
          term = remove_scoped_ejp_var_decs_0_0.instance.invoke(context, i_23);
          if(term == null)
            break Fail39;
          o_24 = term;
          term = p_24;
          lifted46 lifted460 = new lifted46();
          lifted460.s_23 = s_23;
          lifted460.c_23 = c_23;
          lifted460.d_23 = d_23;
          lifted460.e_23 = e_23;
          term = allow_extends_1_1.instance.invoke(context, term, lifted460, o_24);
          if(term == null)
            break Fail39;
          m_24 = term;
          term = gen_auxilery_class_0_5.instance.invoke(context, m_24, j_23, b_23, v_23.value, n_23, k_23.value);
          if(term == null)
            break Fail39;
          m_23 = term;
          term = (IStrategoTerm)termFactory.makeListCons(n_23, (IStrategoList)ejp.constCons0);
          term = concat_strings_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail39;
          u_23 = term;
          term = termFactory.makeAppl(transform._consLocalVarDecStm_1, new IStrategoTerm[]{termFactory.makeAppl(transform._consLocalVarDec_3, new IStrategoTerm[]{ejp.constCons1, termFactory.makeAppl(transform._consClassOrInterfaceType_2, new IStrategoTerm[]{termFactory.makeAppl(transform._consTypeName_1, new IStrategoTerm[]{termFactory.makeAppl(transform._consId_1, new IStrategoTerm[]{n_23})}), ejp.constNone0}), (IStrategoTerm)termFactory.makeListCons(termFactory.makeAppl(transform._consVarDec_2, new IStrategoTerm[]{termFactory.makeAppl(transform._consId_1, new IStrategoTerm[]{term}), termFactory.makeAppl(transform._consNewInstance_4, new IStrategoTerm[]{ejp.constNone0, termFactory.makeAppl(transform._consClassOrInterfaceType_2, new IStrategoTerm[]{termFactory.makeAppl(transform._consTypeName_1, new IStrategoTerm[]{termFactory.makeAppl(transform._consId_1, new IStrategoTerm[]{n_23})}), ejp.constNone0}), ejp.constNil0, ejp.constNone0})}), (IStrategoList)ejp.constNil0)})});
          o_23 = term;
          term = gen_before_call_assignments_0_2.instance.invoke(context, term, r_23, u_23);
          if(term == null)
            break Fail39;
          p_23 = term;
          term = gen_after_call_simple_assignments_0_2.instance.invoke(context, term, r_23, u_23);
          if(term == null)
            break Fail39;
          q_23 = term;
          x_24 = term;
          if(s_23.value == null)
            break Fail39;
          term = my_hashtable_remove_0_1.instance.invoke(context, s_23.value, r_23);
          if(term == null)
            break Fail39;
          term = gen_after_call_assignments_with_declarations_0_2.instance.invoke(context, x_24, term, u_23);
          if(term == null)
            break Fail39;
          t_23 = term;
          term = create_method_invokation_0_2.instance.invoke(context, term, u_23, v_23.value);
          if(term == null)
            break Fail39;
          w_23 = term;
          if(true)
            break Success20;
        }
        term = term20;
        IStrategoTerm b_25 = null;
        b_25 = term;
        term = report_with_failure_0_1.instance.invoke(context, b_25, ejp.const9);
        if(term == null)
          break Fail38;
      }
      term = x_23;
      d_25 = x_23;
      f_25 = term;
      if(q_23 == null || t_23 == null)
        break Fail38;
      term = termFactory.makeTuple(q_23, termFactory.annotateTerm(t_23, checkListAnnos(termFactory, ejp.constNil0)));
      term = make$Conc_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail38;
      e_25 = term;
      term = f_25;
      if(p_23 == null || w_23 == null)
        break Fail38;
      IStrategoList list0;
      list0 = checkListTail(e_25);
      if(list0 == null)
        break Fail38;
      term = termFactory.makeTuple(p_23, (IStrategoTerm)termFactory.makeListCons(termFactory.makeAppl(transform._consExprStm_1, new IStrategoTerm[]{w_23}), list0));
      term = make$Conc_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail38;
      c_25 = term;
      term = d_25;
      if(m_23 == null || o_23 == null)
        break Fail38;
      IStrategoList list1;
      list1 = checkListTail(c_25);
      if(list1 == null)
        break Fail38;
      term = (IStrategoTerm)termFactory.makeListCons(termFactory.makeAppl(transform._consClassDecStm_1, new IStrategoTerm[]{m_23}), termFactory.makeListCons(o_23, list1));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}