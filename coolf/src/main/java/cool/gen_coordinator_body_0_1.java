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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm ref_v_43)
  { 
    ITermFactory termFactory = context.getFactory();
    TermReference v_43 = new TermReference(ref_v_43);
    context.push("gen_coordinator_body_0_1");
    Fail205:
    { 
      TermReference w_43 = new TermReference();
      TermReference x_43 = new TermReference();
      TermReference y_43 = new TermReference();
      IStrategoTerm z_43 = null;
      TermReference a_44 = new TermReference();
      TermReference b_44 = new TermReference();
      IStrategoTerm c_44 = null;
      IStrategoTerm d_44 = null;
      TermReference e_44 = new TermReference();
      TermReference f_44 = new TermReference();
      IStrategoTerm g_44 = null;
      IStrategoTerm h_44 = null;
      TermReference i_44 = new TermReference();
      IStrategoTerm j_44 = null;
      TermReference k_44 = new TermReference();
      TermReference l_44 = new TermReference();
      TermReference m_44 = new TermReference();
      TermReference n_44 = new TermReference();
      IStrategoTerm u_44 = null;
      IStrategoTerm z_45 = null;
      IStrategoTerm h_46 = null;
      IStrategoTerm a_46 = null;
      IStrategoTerm i_46 = null;
      IStrategoTerm b_46 = null;
      IStrategoTerm j_46 = null;
      IStrategoTerm c_46 = null;
      IStrategoTerm k_46 = null;
      IStrategoTerm d_46 = null;
      IStrategoTerm l_46 = null;
      IStrategoTerm e_46 = null;
      IStrategoTerm m_46 = null;
      IStrategoTerm f_46 = null;
      IStrategoTerm n_46 = null;
      if(term.getTermType() != IStrategoTerm.APPL || transform._consCoordinatorBody_1 != ((IStrategoAppl)term).getConstructor())
        break Fail205;
      h_44 = term.getSubterm(0);
      u_44 = term;
      IStrategoTerm term191 = term;
      Success149:
      { 
        Fail206:
        { 
          term = new_hashtable_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail206;
          if(k_44.value == null)
            k_44.value = term;
          else
            if(k_44.value != term && !k_44.value.match(term))
              break Fail206;
          term = new_hashtable_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail206;
          if(l_44.value == null)
            l_44.value = term;
          else
            if(l_44.value != term && !l_44.value.match(term))
              break Fail206;
          term = new_hashtable_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail206;
          if(m_44.value == null)
            m_44.value = term;
          else
            if(m_44.value != term && !m_44.value.match(term))
              break Fail206;
          term = new_hashtable_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail206;
          if(w_43.value == null)
            w_43.value = term;
          else
            if(w_43.value != term && !w_43.value.match(term))
              break Fail206;
          term = new_hashtable_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail206;
          if(x_43.value == null)
            x_43.value = term;
          else
            if(x_43.value != term && !x_43.value.match(term))
              break Fail206;
          term = new_hashtable_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail206;
          if(y_43.value == null)
            y_43.value = term;
          else
            if(y_43.value != term && !y_43.value.match(term))
              break Fail206;
          term = new_hashtable_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail206;
          if(n_44.value == null)
            n_44.value = term;
          else
            if(n_44.value != term && !n_44.value.match(term))
              break Fail206;
          term = new_hashtable_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail206;
          if(i_44.value == null)
            i_44.value = term;
          else
            if(i_44.value != term && !i_44.value.match(term))
              break Fail206;
          term = new_hashtable_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail206;
          if(a_44.value == null)
            a_44.value = term;
          else
            if(a_44.value != term && !a_44.value.match(term))
              break Fail206;
          term = new_hashtable_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail206;
          if(b_44.value == null)
            b_44.value = term;
          else
            if(b_44.value != term && !b_44.value.match(term))
              break Fail206;
          term = getfirst_1_0.instance.invoke(context, h_44, lifted112.instance);
          if(term == null)
            break Fail206;
          z_43 = term;
          term = getfirst_1_0.instance.invoke(context, h_44, lifted113.instance);
          if(term == null)
            break Fail206;
          term = get_methods_list_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail206;
          c_44 = term;
          term = getfirst_1_0.instance.invoke(context, h_44, lifted114.instance);
          if(term == null)
            break Fail206;
          term = get_methods_list_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail206;
          d_44 = term;
          term = c_44;
          lifted115 lifted1150 = new lifted115();
          lifted1150.a_44 = a_44;
          term = map_1_0.instance.invoke(context, term, lifted1150);
          if(term == null)
            break Fail206;
          term = d_44;
          lifted116 lifted1160 = new lifted116();
          lifted1160.b_44 = b_44;
          term = map_1_0.instance.invoke(context, term, lifted1160);
          if(term == null)
            break Fail206;
          term = map_1_0.instance.invoke(context, c_44, lifted117.instance);
          if(term == null)
            break Fail206;
          if(e_44.value == null)
            e_44.value = term;
          else
            if(e_44.value != term && !e_44.value.match(term))
              break Fail206;
          term = map_1_0.instance.invoke(context, d_44, lifted118.instance);
          if(term == null)
            break Fail206;
          if(f_44.value == null)
            f_44.value = term;
          else
            if(f_44.value != term && !f_44.value.match(term))
              break Fail206;
          if(e_44.value == null || f_44.value == null)
            break Fail206;
          term = termFactory.makeTuple(e_44.value, f_44.value);
          term = union_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail206;
          g_44 = term;
          lifted119 lifted1190 = new lifted119();
          lifted1190.n_44 = n_44;
          term = map_1_0.instance.invoke(context, term, lifted1190);
          if(term == null)
            break Fail206;
          term = retain_all_1_0.instance.invoke(context, h_44, lifted120.instance);
          if(term == null)
            break Fail206;
          j_44 = term;
          lifted121 lifted1211 = new lifted121();
          lifted1211.i_44 = i_44;
          term = map_1_0.instance.invoke(context, term, lifted1211);
          if(term == null)
            break Fail206;
          term = j_44;
          lifted122 lifted1220 = new lifted122();
          lifted1220.k_44 = k_44;
          lifted1220.l_44 = l_44;
          lifted1220.m_44 = m_44;
          lifted1220.n_44 = n_44;
          term = map_1_0.instance.invoke(context, term, lifted1220);
          if(term == null)
            break Fail206;
          if(true)
            break Success149;
        }
        term = term191;
        IStrategoTerm w_45 = null;
        w_45 = term;
        term = report_with_failure_0_1.instance.invoke(context, w_45, cool.const59);
        if(term == null)
          break Fail205;
      }
      term = u_44;
      h_46 = term;
      if(z_43 == null)
        break Fail205;
      term = add_condition_fields_0_0.instance.invoke(context, z_43);
      if(term == null)
        break Fail205;
      z_45 = term;
      i_46 = h_46;
      term = add_coordinator_fields_0_0.instance.invoke(context, h_44);
      if(term == null)
        break Fail205;
      a_46 = term;
      term = i_46;
      j_46 = i_46;
      if(g_44 == null)
        break Fail205;
      term = g_44;
      lifted123 lifted1230 = new lifted123();
      lifted1230.n_44 = n_44;
      term = map_1_0.instance.invoke(context, term, lifted1230);
      if(term == null)
        break Fail205;
      b_46 = term;
      term = j_46;
      k_46 = j_46;
      term = gen_is$Run$By$Others_method_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail205;
      c_46 = term;
      term = k_46;
      l_46 = k_46;
      if(k_44.value == null)
        break Fail205;
      term = hashtable_keys_0_0.instance.invoke(context, k_44.value);
      if(term == null)
        break Fail205;
      lifted124 lifted1240 = new lifted124();
      lifted1240.k_44 = k_44;
      lifted1240.w_43 = w_43;
      lifted1240.n_44 = n_44;
      term = map_1_0.instance.invoke(context, term, lifted1240);
      if(term == null)
        break Fail205;
      d_46 = term;
      term = l_46;
      m_46 = l_46;
      if(m_44.value == null)
        break Fail205;
      term = hashtable_keys_0_0.instance.invoke(context, m_44.value);
      if(term == null)
        break Fail205;
      lifted125 lifted1250 = new lifted125();
      lifted1250.m_44 = m_44;
      lifted1250.v_43 = v_43;
      lifted1250.y_43 = y_43;
      lifted1250.n_44 = n_44;
      term = map_1_0.instance.invoke(context, term, lifted1250);
      if(term == null)
        break Fail205;
      e_46 = term;
      term = m_46;
      n_46 = m_46;
      if(l_44.value == null)
        break Fail205;
      term = hashtable_keys_0_0.instance.invoke(context, l_44.value);
      if(term == null)
        break Fail205;
      lifted126 lifted1260 = new lifted126();
      lifted1260.l_44 = l_44;
      lifted1260.v_43 = v_43;
      lifted1260.x_43 = x_43;
      lifted1260.n_44 = n_44;
      term = map_1_0.instance.invoke(context, term, lifted1260);
      if(term == null)
        break Fail205;
      f_46 = term;
      term = n_46;
      if(g_44 == null)
        break Fail205;
      term = g_44;
      lifted127 lifted1270 = new lifted127();
      lifted1270.v_43 = v_43;
      lifted1270.x_43 = x_43;
      lifted1270.w_43 = w_43;
      lifted1270.y_43 = y_43;
      lifted1270.e_44 = e_44;
      lifted1270.f_44 = f_44;
      lifted1270.n_44 = n_44;
      lifted1270.a_44 = a_44;
      lifted1270.b_44 = b_44;
      lifted1270.i_44 = i_44;
      term = map_1_0.instance.invoke(context, term, lifted1270);
      if(term == null)
        break Fail205;
      term = concat_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail205;
      term = termFactory.makeTuple(z_45, a_46, b_46, (IStrategoTerm)termFactory.makeListCons(c_46, (IStrategoList)cool.constNil0), d_46, e_46, f_46, term);
      term = conc_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail205;
      term = termFactory.makeAppl(transform._consClassBody_1, new IStrategoTerm[]{term});
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}