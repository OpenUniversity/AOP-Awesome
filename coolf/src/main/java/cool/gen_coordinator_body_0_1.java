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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm ref_p_43)
  { 
    ITermFactory termFactory = context.getFactory();
    TermReference p_43 = new TermReference(ref_p_43);
    context.push("gen_coordinator_body_0_1");
    Fail205:
    { 
      TermReference q_43 = new TermReference();
      TermReference r_43 = new TermReference();
      TermReference s_43 = new TermReference();
      IStrategoTerm t_43 = null;
      TermReference u_43 = new TermReference();
      TermReference v_43 = new TermReference();
      IStrategoTerm w_43 = null;
      IStrategoTerm x_43 = null;
      TermReference y_43 = new TermReference();
      TermReference z_43 = new TermReference();
      IStrategoTerm a_44 = null;
      IStrategoTerm b_44 = null;
      TermReference c_44 = new TermReference();
      IStrategoTerm d_44 = null;
      TermReference e_44 = new TermReference();
      TermReference f_44 = new TermReference();
      TermReference g_44 = new TermReference();
      TermReference h_44 = new TermReference();
      IStrategoTerm o_44 = null;
      IStrategoTerm t_45 = null;
      IStrategoTerm b_46 = null;
      IStrategoTerm u_45 = null;
      IStrategoTerm c_46 = null;
      IStrategoTerm v_45 = null;
      IStrategoTerm d_46 = null;
      IStrategoTerm w_45 = null;
      IStrategoTerm e_46 = null;
      IStrategoTerm x_45 = null;
      IStrategoTerm f_46 = null;
      IStrategoTerm y_45 = null;
      IStrategoTerm g_46 = null;
      IStrategoTerm z_45 = null;
      IStrategoTerm h_46 = null;
      if(term.getTermType() != IStrategoTerm.APPL || transform._consCoordinatorBody_1 != ((IStrategoAppl)term).getConstructor())
        break Fail205;
      b_44 = term.getSubterm(0);
      o_44 = term;
      IStrategoTerm term191 = term;
      Success149:
      { 
        Fail206:
        { 
          term = new_hashtable_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail206;
          if(e_44.value == null)
            e_44.value = term;
          else
            if(e_44.value != term && !e_44.value.match(term))
              break Fail206;
          term = new_hashtable_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail206;
          if(f_44.value == null)
            f_44.value = term;
          else
            if(f_44.value != term && !f_44.value.match(term))
              break Fail206;
          term = new_hashtable_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail206;
          if(g_44.value == null)
            g_44.value = term;
          else
            if(g_44.value != term && !g_44.value.match(term))
              break Fail206;
          term = new_hashtable_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail206;
          if(q_43.value == null)
            q_43.value = term;
          else
            if(q_43.value != term && !q_43.value.match(term))
              break Fail206;
          term = new_hashtable_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail206;
          if(r_43.value == null)
            r_43.value = term;
          else
            if(r_43.value != term && !r_43.value.match(term))
              break Fail206;
          term = new_hashtable_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail206;
          if(s_43.value == null)
            s_43.value = term;
          else
            if(s_43.value != term && !s_43.value.match(term))
              break Fail206;
          term = new_hashtable_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail206;
          if(h_44.value == null)
            h_44.value = term;
          else
            if(h_44.value != term && !h_44.value.match(term))
              break Fail206;
          term = new_hashtable_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail206;
          if(c_44.value == null)
            c_44.value = term;
          else
            if(c_44.value != term && !c_44.value.match(term))
              break Fail206;
          term = new_hashtable_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail206;
          if(u_43.value == null)
            u_43.value = term;
          else
            if(u_43.value != term && !u_43.value.match(term))
              break Fail206;
          term = new_hashtable_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail206;
          if(v_43.value == null)
            v_43.value = term;
          else
            if(v_43.value != term && !v_43.value.match(term))
              break Fail206;
          term = getfirst_1_0.instance.invoke(context, b_44, lifted112.instance);
          if(term == null)
            break Fail206;
          t_43 = term;
          term = getfirst_1_0.instance.invoke(context, b_44, lifted113.instance);
          if(term == null)
            break Fail206;
          term = get_methods_list_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail206;
          w_43 = term;
          term = getfirst_1_0.instance.invoke(context, b_44, lifted114.instance);
          if(term == null)
            break Fail206;
          term = get_methods_list_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail206;
          x_43 = term;
          term = w_43;
          lifted115 lifted1150 = new lifted115();
          lifted1150.u_43 = u_43;
          term = map_1_0.instance.invoke(context, term, lifted1150);
          if(term == null)
            break Fail206;
          term = x_43;
          lifted116 lifted1160 = new lifted116();
          lifted1160.v_43 = v_43;
          term = map_1_0.instance.invoke(context, term, lifted1160);
          if(term == null)
            break Fail206;
          term = map_1_0.instance.invoke(context, w_43, lifted117.instance);
          if(term == null)
            break Fail206;
          if(y_43.value == null)
            y_43.value = term;
          else
            if(y_43.value != term && !y_43.value.match(term))
              break Fail206;
          term = map_1_0.instance.invoke(context, x_43, lifted118.instance);
          if(term == null)
            break Fail206;
          if(z_43.value == null)
            z_43.value = term;
          else
            if(z_43.value != term && !z_43.value.match(term))
              break Fail206;
          if(y_43.value == null || z_43.value == null)
            break Fail206;
          term = termFactory.makeTuple(y_43.value, z_43.value);
          term = union_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail206;
          a_44 = term;
          lifted119 lifted1190 = new lifted119();
          lifted1190.h_44 = h_44;
          term = map_1_0.instance.invoke(context, term, lifted1190);
          if(term == null)
            break Fail206;
          term = retain_all_1_0.instance.invoke(context, b_44, lifted120.instance);
          if(term == null)
            break Fail206;
          d_44 = term;
          lifted121 lifted1211 = new lifted121();
          lifted1211.c_44 = c_44;
          term = map_1_0.instance.invoke(context, term, lifted1211);
          if(term == null)
            break Fail206;
          term = d_44;
          lifted122 lifted1220 = new lifted122();
          lifted1220.e_44 = e_44;
          lifted1220.f_44 = f_44;
          lifted1220.g_44 = g_44;
          lifted1220.h_44 = h_44;
          term = map_1_0.instance.invoke(context, term, lifted1220);
          if(term == null)
            break Fail206;
          if(true)
            break Success149;
        }
        term = term191;
        IStrategoTerm q_45 = null;
        q_45 = term;
        term = report_with_failure_0_1.instance.invoke(context, q_45, cool.const58);
        if(term == null)
          break Fail205;
      }
      term = o_44;
      b_46 = term;
      if(t_43 == null)
        break Fail205;
      term = add_condition_fields_0_0.instance.invoke(context, t_43);
      if(term == null)
        break Fail205;
      t_45 = term;
      c_46 = b_46;
      term = add_coordinator_fields_0_0.instance.invoke(context, b_44);
      if(term == null)
        break Fail205;
      u_45 = term;
      term = c_46;
      d_46 = c_46;
      if(a_44 == null)
        break Fail205;
      term = a_44;
      lifted123 lifted1230 = new lifted123();
      lifted1230.h_44 = h_44;
      term = map_1_0.instance.invoke(context, term, lifted1230);
      if(term == null)
        break Fail205;
      v_45 = term;
      term = d_46;
      e_46 = d_46;
      term = gen_is$Run$By$Others_method_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail205;
      w_45 = term;
      term = e_46;
      f_46 = e_46;
      if(e_44.value == null)
        break Fail205;
      term = hashtable_keys_0_0.instance.invoke(context, e_44.value);
      if(term == null)
        break Fail205;
      lifted124 lifted1240 = new lifted124();
      lifted1240.e_44 = e_44;
      lifted1240.q_43 = q_43;
      lifted1240.h_44 = h_44;
      term = map_1_0.instance.invoke(context, term, lifted1240);
      if(term == null)
        break Fail205;
      x_45 = term;
      term = f_46;
      g_46 = f_46;
      if(g_44.value == null)
        break Fail205;
      term = hashtable_keys_0_0.instance.invoke(context, g_44.value);
      if(term == null)
        break Fail205;
      lifted125 lifted1250 = new lifted125();
      lifted1250.g_44 = g_44;
      lifted1250.p_43 = p_43;
      lifted1250.s_43 = s_43;
      lifted1250.h_44 = h_44;
      term = map_1_0.instance.invoke(context, term, lifted1250);
      if(term == null)
        break Fail205;
      y_45 = term;
      term = g_46;
      h_46 = g_46;
      if(f_44.value == null)
        break Fail205;
      term = hashtable_keys_0_0.instance.invoke(context, f_44.value);
      if(term == null)
        break Fail205;
      lifted126 lifted1260 = new lifted126();
      lifted1260.f_44 = f_44;
      lifted1260.p_43 = p_43;
      lifted1260.r_43 = r_43;
      lifted1260.h_44 = h_44;
      term = map_1_0.instance.invoke(context, term, lifted1260);
      if(term == null)
        break Fail205;
      z_45 = term;
      term = h_46;
      if(a_44 == null)
        break Fail205;
      term = a_44;
      lifted127 lifted1270 = new lifted127();
      lifted1270.p_43 = p_43;
      lifted1270.r_43 = r_43;
      lifted1270.q_43 = q_43;
      lifted1270.s_43 = s_43;
      lifted1270.y_43 = y_43;
      lifted1270.z_43 = z_43;
      lifted1270.h_44 = h_44;
      lifted1270.u_43 = u_43;
      lifted1270.v_43 = v_43;
      lifted1270.c_44 = c_44;
      term = map_1_0.instance.invoke(context, term, lifted1270);
      if(term == null)
        break Fail205;
      term = concat_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail205;
      term = termFactory.makeTuple(t_45, u_45, v_45, (IStrategoTerm)termFactory.makeListCons(w_45, (IStrategoList)cool.constNil0), x_45, y_45, z_45, term);
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