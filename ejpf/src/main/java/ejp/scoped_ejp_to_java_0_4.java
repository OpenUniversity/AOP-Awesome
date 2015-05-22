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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm r_22, IStrategoTerm ref_s_22, IStrategoTerm ref_t_22, IStrategoTerm ref_u_22)
  { 
    ITermFactory termFactory = context.getFactory();
    TermReference s_22 = new TermReference(ref_s_22);
    TermReference t_22 = new TermReference(ref_t_22);
    TermReference u_22 = new TermReference(ref_u_22);
    context.push("scoped_ejp_to_java_0_4");
    Fail38:
    { 
      IStrategoTerm v_22 = null;
      IStrategoTerm x_22 = null;
      IStrategoTerm y_22 = null;
      IStrategoTerm z_22 = null;
      TermReference a_23 = new TermReference();
      IStrategoTerm c_23 = null;
      IStrategoTerm d_23 = null;
      IStrategoTerm e_23 = null;
      IStrategoTerm f_23 = null;
      IStrategoTerm g_23 = null;
      IStrategoTerm h_23 = null;
      TermReference i_23 = new TermReference();
      IStrategoTerm j_23 = null;
      IStrategoTerm k_23 = null;
      TermReference l_23 = new TermReference();
      IStrategoTerm m_23 = null;
      IStrategoTerm n_23 = null;
      IStrategoTerm s_24 = null;
      IStrategoTerm t_24 = null;
      IStrategoTerm u_24 = null;
      IStrategoTerm v_24 = null;
      if(term.getTermType() != IStrategoTerm.APPL || transform._consScopedEJPCall_3 != ((IStrategoAppl)term).getConstructor())
        break Fail38;
      if(l_23.value == null)
        l_23.value = term.getSubterm(0);
      else
        if(l_23.value != term.getSubterm(0) && !l_23.value.match(term.getSubterm(0)))
          break Fail38;
      v_22 = term.getSubterm(1);
      IStrategoTerm arg59 = term.getSubterm(2);
      if(arg59.getTermType() != IStrategoTerm.APPL || transform._consBlock_1 != ((IStrategoAppl)arg59).getConstructor())
        break Fail38;
      y_22 = arg59.getSubterm(0);
      n_23 = term;
      IStrategoTerm term20 = term;
      Success20:
      { 
        Fail39:
        { 
          IStrategoTerm t_23 = null;
          IStrategoTerm u_23 = null;
          IStrategoTerm x_23 = null;
          IStrategoTerm z_23 = null;
          IStrategoTerm c_24 = null;
          IStrategoTerm e_24 = null;
          IStrategoTerm f_24 = null;
          IStrategoTerm n_24 = null;
          term = random_string_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail39;
          if(a_23.value == null)
            a_23.value = term;
          else
            if(a_23.value != term && !a_23.value.match(term))
              break Fail39;
          term = v_22;
          lifted43 lifted430 = new lifted43();
          lifted430.s_22 = s_22;
          lifted430.t_22 = t_22;
          lifted430.a_23 = a_23;
          term = topdown_1_0.instance.invoke(context, term, lifted430);
          if(term == null)
            break Fail39;
          lifted45 lifted450 = new lifted45();
          lifted450.u_22 = u_22;
          lifted450.l_23 = l_23;
          term = try_1_0.instance.invoke(context, term, lifted450);
          if(term == null)
            break Fail39;
          term = get_vars_in_block_0_0.instance.invoke(context, y_22);
          if(term == null)
            break Fail39;
          x_22 = term;
          term = get_inner_scoped_vars_0_0.instance.invoke(context, y_22);
          if(term == null)
            break Fail39;
          if(i_23.value == null)
            i_23.value = term;
          else
            if(i_23.value != term && !i_23.value.match(term))
              break Fail39;
          term = new_iset_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail39;
          t_23 = term;
          term = hashtable_keys_0_0.instance.invoke(context, r_22);
          if(term == null)
            break Fail39;
          term = iset_addlist_0_1.instance.invoke(context, t_23, term);
          if(term == null)
            break Fail39;
          term = iset_isect_0_1.instance.invoke(context, term, x_22);
          if(term == null)
            break Fail39;
          h_23 = term;
          term = new_iset_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail39;
          u_23 = term;
          z_22 = term;
          x_23 = u_23;
          term = iset_elements_0_0.instance.invoke(context, h_23);
          if(term == null)
            break Fail39;
          term = iset_addlist_0_1.instance.invoke(context, x_23, term);
          if(term == null)
            break Fail39;
          term = z_22;
          z_23 = z_22;
          if(i_23.value == null)
            break Fail39;
          term = hashtable_keys_0_0.instance.invoke(context, i_23.value);
          if(term == null)
            break Fail39;
          term = iset_addlist_0_1.instance.invoke(context, z_23, term);
          if(term == null)
            break Fail39;
          term = gen_auxilary_class_name_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail39;
          d_23 = term;
          term = my_hashtable_union_0_1.instance.invoke(context, r_22, i_23.value);
          if(term == null)
            break Fail39;
          f_24 = term;
          term = remove_scoped_ejp_var_decs_0_0.instance.invoke(context, y_22);
          if(term == null)
            break Fail39;
          e_24 = term;
          term = f_24;
          lifted46 lifted460 = new lifted46();
          lifted460.i_23 = i_23;
          lifted460.s_22 = s_22;
          lifted460.t_22 = t_22;
          lifted460.u_22 = u_22;
          term = allow_extends_1_1.instance.invoke(context, term, lifted460, e_24);
          if(term == null)
            break Fail39;
          c_24 = term;
          term = gen_auxilery_class_0_5.instance.invoke(context, c_24, z_22, r_22, l_23.value, d_23, a_23.value);
          if(term == null)
            break Fail39;
          c_23 = term;
          term = (IStrategoTerm)termFactory.makeListCons(d_23, (IStrategoList)ejp.constCons0);
          term = concat_strings_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail39;
          k_23 = term;
          term = termFactory.makeAppl(transform._consLocalVarDecStm_1, new IStrategoTerm[]{termFactory.makeAppl(transform._consLocalVarDec_3, new IStrategoTerm[]{ejp.constCons1, termFactory.makeAppl(transform._consClassOrInterfaceType_2, new IStrategoTerm[]{termFactory.makeAppl(transform._consTypeName_1, new IStrategoTerm[]{termFactory.makeAppl(transform._consId_1, new IStrategoTerm[]{d_23})}), ejp.constNone0}), (IStrategoTerm)termFactory.makeListCons(termFactory.makeAppl(transform._consVarDec_2, new IStrategoTerm[]{termFactory.makeAppl(transform._consId_1, new IStrategoTerm[]{term}), termFactory.makeAppl(transform._consNewInstance_4, new IStrategoTerm[]{ejp.constNone0, termFactory.makeAppl(transform._consClassOrInterfaceType_2, new IStrategoTerm[]{termFactory.makeAppl(transform._consTypeName_1, new IStrategoTerm[]{termFactory.makeAppl(transform._consId_1, new IStrategoTerm[]{d_23})}), ejp.constNone0}), ejp.constNil0, ejp.constNone0})}), (IStrategoList)ejp.constNil0)})});
          e_23 = term;
          term = gen_before_call_assignments_0_2.instance.invoke(context, term, h_23, k_23);
          if(term == null)
            break Fail39;
          f_23 = term;
          term = gen_after_call_simple_assignments_0_2.instance.invoke(context, term, h_23, k_23);
          if(term == null)
            break Fail39;
          g_23 = term;
          n_24 = term;
          if(i_23.value == null)
            break Fail39;
          term = my_hashtable_remove_0_1.instance.invoke(context, i_23.value, h_23);
          if(term == null)
            break Fail39;
          term = gen_after_call_assignments_with_declarations_0_2.instance.invoke(context, n_24, term, k_23);
          if(term == null)
            break Fail39;
          j_23 = term;
          term = create_method_invokation_0_2.instance.invoke(context, term, k_23, l_23.value);
          if(term == null)
            break Fail39;
          m_23 = term;
          if(true)
            break Success20;
        }
        term = term20;
        IStrategoTerm r_24 = null;
        r_24 = term;
        term = report_with_failure_0_1.instance.invoke(context, r_24, ejp.const9);
        if(term == null)
          break Fail38;
      }
      term = n_23;
      t_24 = n_23;
      v_24 = term;
      if(g_23 == null || j_23 == null)
        break Fail38;
      term = termFactory.makeTuple(g_23, termFactory.annotateTerm(j_23, checkListAnnos(termFactory, ejp.constNil0)));
      term = make$Conc_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail38;
      u_24 = term;
      term = v_24;
      if(f_23 == null || m_23 == null)
        break Fail38;
      IStrategoList list0;
      list0 = checkListTail(u_24);
      if(list0 == null)
        break Fail38;
      term = termFactory.makeTuple(f_23, (IStrategoTerm)termFactory.makeListCons(termFactory.makeAppl(transform._consExprStm_1, new IStrategoTerm[]{m_23}), list0));
      term = make$Conc_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail38;
      s_24 = term;
      term = t_24;
      if(c_23 == null || e_23 == null)
        break Fail38;
      IStrategoList list1;
      list1 = checkListTail(s_24);
      if(list1 == null)
        break Fail38;
      term = (IStrategoTerm)termFactory.makeListCons(termFactory.makeAppl(transform._consClassDecStm_1, new IStrategoTerm[]{c_23}), termFactory.makeListCons(e_23, list1));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}