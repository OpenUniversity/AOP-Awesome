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

@SuppressWarnings("all") public class gen_coordinator_body_0_1 extends Strategy 
{ 
  public static gen_coordinator_body_0_1 instance = new gen_coordinator_body_0_1();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm ref_n_42)
  { 
    ITermFactory termFactory = context.getFactory();
    TermReference n_42 = new TermReference(ref_n_42);
    context.push("gen_coordinator_body_0_1");
    Fail198:
    { 
      TermReference o_42 = new TermReference();
      TermReference p_42 = new TermReference();
      TermReference q_42 = new TermReference();
      IStrategoTerm r_42 = null;
      TermReference s_42 = new TermReference();
      TermReference t_42 = new TermReference();
      IStrategoTerm u_42 = null;
      IStrategoTerm v_42 = null;
      TermReference w_42 = new TermReference();
      TermReference x_42 = new TermReference();
      IStrategoTerm y_42 = null;
      IStrategoTerm z_42 = null;
      TermReference a_43 = new TermReference();
      IStrategoTerm b_43 = null;
      TermReference c_43 = new TermReference();
      TermReference d_43 = new TermReference();
      TermReference e_43 = new TermReference();
      TermReference f_43 = new TermReference();
      IStrategoTerm m_43 = null;
      IStrategoTerm r_44 = null;
      IStrategoTerm z_44 = null;
      IStrategoTerm s_44 = null;
      IStrategoTerm a_45 = null;
      IStrategoTerm t_44 = null;
      IStrategoTerm b_45 = null;
      IStrategoTerm u_44 = null;
      IStrategoTerm c_45 = null;
      IStrategoTerm v_44 = null;
      IStrategoTerm d_45 = null;
      IStrategoTerm w_44 = null;
      IStrategoTerm e_45 = null;
      IStrategoTerm x_44 = null;
      IStrategoTerm f_45 = null;
      if(term.getTermType() != IStrategoTerm.APPL || transform._consCoordinatorBody_1 != ((IStrategoAppl)term).getConstructor())
        break Fail198;
      z_42 = term.getSubterm(0);
      m_43 = term;
      IStrategoTerm term191 = term;
      Success149:
      { 
        Fail199:
        { 
          term = new_hashtable_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail199;
          if(c_43.value == null)
            c_43.value = term;
          else
            if(c_43.value != term && !c_43.value.match(term))
              break Fail199;
          term = new_hashtable_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail199;
          if(d_43.value == null)
            d_43.value = term;
          else
            if(d_43.value != term && !d_43.value.match(term))
              break Fail199;
          term = new_hashtable_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail199;
          if(e_43.value == null)
            e_43.value = term;
          else
            if(e_43.value != term && !e_43.value.match(term))
              break Fail199;
          term = new_hashtable_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail199;
          if(o_42.value == null)
            o_42.value = term;
          else
            if(o_42.value != term && !o_42.value.match(term))
              break Fail199;
          term = new_hashtable_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail199;
          if(p_42.value == null)
            p_42.value = term;
          else
            if(p_42.value != term && !p_42.value.match(term))
              break Fail199;
          term = new_hashtable_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail199;
          if(q_42.value == null)
            q_42.value = term;
          else
            if(q_42.value != term && !q_42.value.match(term))
              break Fail199;
          term = new_hashtable_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail199;
          if(f_43.value == null)
            f_43.value = term;
          else
            if(f_43.value != term && !f_43.value.match(term))
              break Fail199;
          term = new_hashtable_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail199;
          if(a_43.value == null)
            a_43.value = term;
          else
            if(a_43.value != term && !a_43.value.match(term))
              break Fail199;
          term = new_hashtable_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail199;
          if(s_42.value == null)
            s_42.value = term;
          else
            if(s_42.value != term && !s_42.value.match(term))
              break Fail199;
          term = new_hashtable_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail199;
          if(t_42.value == null)
            t_42.value = term;
          else
            if(t_42.value != term && !t_42.value.match(term))
              break Fail199;
          term = getfirst_1_0.instance.invoke(context, z_42, lifted112.instance);
          if(term == null)
            break Fail199;
          r_42 = term;
          term = getfirst_1_0.instance.invoke(context, z_42, lifted113.instance);
          if(term == null)
            break Fail199;
          term = get_methods_list_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail199;
          u_42 = term;
          term = getfirst_1_0.instance.invoke(context, z_42, lifted114.instance);
          if(term == null)
            break Fail199;
          term = get_methods_list_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail199;
          v_42 = term;
          term = u_42;
          lifted115 lifted1150 = new lifted115();
          lifted1150.s_42 = s_42;
          term = map_1_0.instance.invoke(context, term, lifted1150);
          if(term == null)
            break Fail199;
          term = v_42;
          lifted116 lifted1160 = new lifted116();
          lifted1160.t_42 = t_42;
          term = map_1_0.instance.invoke(context, term, lifted1160);
          if(term == null)
            break Fail199;
          term = map_1_0.instance.invoke(context, u_42, lifted117.instance);
          if(term == null)
            break Fail199;
          if(w_42.value == null)
            w_42.value = term;
          else
            if(w_42.value != term && !w_42.value.match(term))
              break Fail199;
          term = map_1_0.instance.invoke(context, v_42, lifted118.instance);
          if(term == null)
            break Fail199;
          if(x_42.value == null)
            x_42.value = term;
          else
            if(x_42.value != term && !x_42.value.match(term))
              break Fail199;
          if(w_42.value == null || x_42.value == null)
            break Fail199;
          term = termFactory.makeTuple(w_42.value, x_42.value);
          term = union_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail199;
          y_42 = term;
          lifted119 lifted1190 = new lifted119();
          lifted1190.f_43 = f_43;
          term = map_1_0.instance.invoke(context, term, lifted1190);
          if(term == null)
            break Fail199;
          term = retain_all_1_0.instance.invoke(context, z_42, lifted120.instance);
          if(term == null)
            break Fail199;
          b_43 = term;
          lifted121 lifted1211 = new lifted121();
          lifted1211.a_43 = a_43;
          term = map_1_0.instance.invoke(context, term, lifted1211);
          if(term == null)
            break Fail199;
          term = b_43;
          lifted122 lifted1220 = new lifted122();
          lifted1220.c_43 = c_43;
          lifted1220.d_43 = d_43;
          lifted1220.e_43 = e_43;
          lifted1220.f_43 = f_43;
          term = map_1_0.instance.invoke(context, term, lifted1220);
          if(term == null)
            break Fail199;
          if(true)
            break Success149;
        }
        term = term191;
        IStrategoTerm o_44 = null;
        o_44 = term;
        term = report_with_failure_0_1.instance.invoke(context, o_44, cool.const58);
        if(term == null)
          break Fail198;
      }
      term = m_43;
      z_44 = term;
      if(r_42 == null)
        break Fail198;
      term = add_condition_fields_0_0.instance.invoke(context, r_42);
      if(term == null)
        break Fail198;
      r_44 = term;
      a_45 = z_44;
      term = add_coordinator_fields_0_0.instance.invoke(context, z_42);
      if(term == null)
        break Fail198;
      s_44 = term;
      term = a_45;
      b_45 = a_45;
      if(y_42 == null)
        break Fail198;
      term = y_42;
      lifted123 lifted1230 = new lifted123();
      lifted1230.f_43 = f_43;
      term = map_1_0.instance.invoke(context, term, lifted1230);
      if(term == null)
        break Fail198;
      t_44 = term;
      term = b_45;
      c_45 = b_45;
      term = gen_is$Run$By$Others_method_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail198;
      u_44 = term;
      term = c_45;
      d_45 = c_45;
      if(c_43.value == null)
        break Fail198;
      term = hashtable_keys_0_0.instance.invoke(context, c_43.value);
      if(term == null)
        break Fail198;
      lifted124 lifted1240 = new lifted124();
      lifted1240.c_43 = c_43;
      lifted1240.o_42 = o_42;
      lifted1240.f_43 = f_43;
      term = map_1_0.instance.invoke(context, term, lifted1240);
      if(term == null)
        break Fail198;
      v_44 = term;
      term = d_45;
      e_45 = d_45;
      if(e_43.value == null)
        break Fail198;
      term = hashtable_keys_0_0.instance.invoke(context, e_43.value);
      if(term == null)
        break Fail198;
      lifted125 lifted1250 = new lifted125();
      lifted1250.e_43 = e_43;
      lifted1250.n_42 = n_42;
      lifted1250.q_42 = q_42;
      lifted1250.f_43 = f_43;
      term = map_1_0.instance.invoke(context, term, lifted1250);
      if(term == null)
        break Fail198;
      w_44 = term;
      term = e_45;
      f_45 = e_45;
      if(d_43.value == null)
        break Fail198;
      term = hashtable_keys_0_0.instance.invoke(context, d_43.value);
      if(term == null)
        break Fail198;
      lifted126 lifted1260 = new lifted126();
      lifted1260.d_43 = d_43;
      lifted1260.n_42 = n_42;
      lifted1260.p_42 = p_42;
      lifted1260.f_43 = f_43;
      term = map_1_0.instance.invoke(context, term, lifted1260);
      if(term == null)
        break Fail198;
      x_44 = term;
      term = f_45;
      if(y_42 == null)
        break Fail198;
      term = y_42;
      lifted127 lifted1270 = new lifted127();
      lifted1270.n_42 = n_42;
      lifted1270.p_42 = p_42;
      lifted1270.o_42 = o_42;
      lifted1270.q_42 = q_42;
      lifted1270.w_42 = w_42;
      lifted1270.x_42 = x_42;
      lifted1270.f_43 = f_43;
      lifted1270.s_42 = s_42;
      lifted1270.t_42 = t_42;
      lifted1270.a_43 = a_43;
      term = map_1_0.instance.invoke(context, term, lifted1270);
      if(term == null)
        break Fail198;
      term = concat_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail198;
      term = termFactory.makeTuple(r_44, s_44, t_44, (IStrategoTerm)termFactory.makeListCons(u_44, (IStrategoList)cool.constNil0), v_44, w_44, x_44, term);
      term = conc_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail198;
      term = termFactory.makeAppl(transform._consClassBody_1, new IStrategoTerm[]{term});
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}