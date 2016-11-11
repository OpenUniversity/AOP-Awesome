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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm ref_z_57)
  { 
    ITermFactory termFactory = context.getFactory();
    TermReference z_57 = new TermReference(ref_z_57);
    context.push("gen_coordinator_body_0_1");
    Fail306:
    { 
      TermReference a_58 = new TermReference();
      TermReference o_71 = new TermReference();
      TermReference p_71 = new TermReference();
      IStrategoTerm q_71 = null;
      TermReference r_71 = new TermReference();
      TermReference s_71 = new TermReference();
      IStrategoTerm t_71 = null;
      IStrategoTerm u_71 = null;
      TermReference v_71 = new TermReference();
      TermReference z_71 = new TermReference();
      IStrategoTerm a_72 = null;
      IStrategoTerm c_72 = null;
      TermReference d_72 = new TermReference();
      IStrategoTerm e_72 = null;
      TermReference f_72 = new TermReference();
      TermReference g_72 = new TermReference();
      TermReference h_72 = new TermReference();
      TermReference j_72 = new TermReference();
      IStrategoTerm q_72 = null;
      IStrategoTerm x_73 = null;
      IStrategoTerm f_74 = null;
      IStrategoTerm y_73 = null;
      IStrategoTerm g_74 = null;
      IStrategoTerm z_73 = null;
      IStrategoTerm h_74 = null;
      IStrategoTerm a_74 = null;
      IStrategoTerm i_74 = null;
      IStrategoTerm b_74 = null;
      IStrategoTerm j_74 = null;
      IStrategoTerm c_74 = null;
      IStrategoTerm k_74 = null;
      IStrategoTerm d_74 = null;
      IStrategoTerm l_74 = null;
      if(term.getTermType() != IStrategoTerm.APPL || transform._consCoordinatorBody_1 != ((IStrategoAppl)term).getConstructor())
        break Fail306;
      c_72 = term.getSubterm(0);
      q_72 = term;
      IStrategoTerm term295 = term;
      Success250:
      { 
        Fail307:
        { 
          term = new_hashtable_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail307;
          if(f_72.value == null)
            f_72.value = term;
          else
            if(f_72.value != term && !f_72.value.match(term))
              break Fail307;
          term = new_hashtable_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail307;
          if(g_72.value == null)
            g_72.value = term;
          else
            if(g_72.value != term && !g_72.value.match(term))
              break Fail307;
          term = new_hashtable_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail307;
          if(h_72.value == null)
            h_72.value = term;
          else
            if(h_72.value != term && !h_72.value.match(term))
              break Fail307;
          term = new_hashtable_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail307;
          if(a_58.value == null)
            a_58.value = term;
          else
            if(a_58.value != term && !a_58.value.match(term))
              break Fail307;
          term = new_hashtable_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail307;
          if(o_71.value == null)
            o_71.value = term;
          else
            if(o_71.value != term && !o_71.value.match(term))
              break Fail307;
          term = new_hashtable_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail307;
          if(p_71.value == null)
            p_71.value = term;
          else
            if(p_71.value != term && !p_71.value.match(term))
              break Fail307;
          term = new_hashtable_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail307;
          if(j_72.value == null)
            j_72.value = term;
          else
            if(j_72.value != term && !j_72.value.match(term))
              break Fail307;
          term = new_hashtable_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail307;
          if(d_72.value == null)
            d_72.value = term;
          else
            if(d_72.value != term && !d_72.value.match(term))
              break Fail307;
          term = new_hashtable_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail307;
          if(r_71.value == null)
            r_71.value = term;
          else
            if(r_71.value != term && !r_71.value.match(term))
              break Fail307;
          term = new_hashtable_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail307;
          if(s_71.value == null)
            s_71.value = term;
          else
            if(s_71.value != term && !s_71.value.match(term))
              break Fail307;
          term = getfirst_1_0.instance.invoke(context, c_72, lifted114.instance);
          if(term == null)
            break Fail307;
          q_71 = term;
          term = getfirst_1_0.instance.invoke(context, c_72, lifted115.instance);
          if(term == null)
            break Fail307;
          term = get_methods_list_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail307;
          t_71 = term;
          term = getfirst_1_0.instance.invoke(context, c_72, lifted116.instance);
          if(term == null)
            break Fail307;
          term = get_methods_list_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail307;
          u_71 = term;
          term = t_71;
          lifted117 lifted1170 = new lifted117();
          lifted1170.r_71 = r_71;
          term = map_1_0.instance.invoke(context, term, lifted1170);
          if(term == null)
            break Fail307;
          term = u_71;
          lifted118 lifted1180 = new lifted118();
          lifted1180.s_71 = s_71;
          term = map_1_0.instance.invoke(context, term, lifted1180);
          if(term == null)
            break Fail307;
          term = map_1_0.instance.invoke(context, t_71, lifted119.instance);
          if(term == null)
            break Fail307;
          if(v_71.value == null)
            v_71.value = term;
          else
            if(v_71.value != term && !v_71.value.match(term))
              break Fail307;
          term = map_1_0.instance.invoke(context, u_71, lifted120.instance);
          if(term == null)
            break Fail307;
          if(z_71.value == null)
            z_71.value = term;
          else
            if(z_71.value != term && !z_71.value.match(term))
              break Fail307;
          if(v_71.value == null || z_71.value == null)
            break Fail307;
          term = termFactory.makeTuple(v_71.value, z_71.value);
          term = union_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail307;
          a_72 = term;
          lifted121 lifted1210 = new lifted121();
          lifted1210.j_72 = j_72;
          term = map_1_0.instance.invoke(context, term, lifted1210);
          if(term == null)
            break Fail307;
          term = retain_all_1_0.instance.invoke(context, c_72, lifted122.instance);
          if(term == null)
            break Fail307;
          e_72 = term;
          lifted123 lifted1230 = new lifted123();
          lifted1230.d_72 = d_72;
          term = map_1_0.instance.invoke(context, term, lifted1230);
          if(term == null)
            break Fail307;
          term = e_72;
          lifted124 lifted1240 = new lifted124();
          lifted1240.f_72 = f_72;
          lifted1240.g_72 = g_72;
          lifted1240.h_72 = h_72;
          lifted1240.j_72 = j_72;
          term = map_1_0.instance.invoke(context, term, lifted1240);
          if(term == null)
            break Fail307;
          if(true)
            break Success250;
        }
        term = term295;
        IStrategoTerm u_73 = null;
        u_73 = term;
        term = report_with_failure_0_1.instance.invoke(context, u_73, cool.const118);
        if(term == null)
          break Fail306;
      }
      term = q_72;
      f_74 = term;
      if(q_71 == null)
        break Fail306;
      term = add_condition_fields_0_0.instance.invoke(context, q_71);
      if(term == null)
        break Fail306;
      x_73 = term;
      g_74 = f_74;
      term = add_coordinator_fields_0_0.instance.invoke(context, c_72);
      if(term == null)
        break Fail306;
      y_73 = term;
      term = g_74;
      h_74 = g_74;
      if(a_72 == null)
        break Fail306;
      term = a_72;
      lifted125 lifted1250 = new lifted125();
      lifted1250.j_72 = j_72;
      term = map_1_0.instance.invoke(context, term, lifted1250);
      if(term == null)
        break Fail306;
      z_73 = term;
      term = h_74;
      i_74 = h_74;
      term = gen_is$Run$By$Others_method_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail306;
      a_74 = term;
      term = i_74;
      j_74 = i_74;
      if(f_72.value == null)
        break Fail306;
      term = hashtable_keys_0_0.instance.invoke(context, f_72.value);
      if(term == null)
        break Fail306;
      lifted126 lifted1260 = new lifted126();
      lifted1260.f_72 = f_72;
      lifted1260.a_58 = a_58;
      lifted1260.j_72 = j_72;
      term = map_1_0.instance.invoke(context, term, lifted1260);
      if(term == null)
        break Fail306;
      b_74 = term;
      term = j_74;
      k_74 = j_74;
      if(h_72.value == null)
        break Fail306;
      term = hashtable_keys_0_0.instance.invoke(context, h_72.value);
      if(term == null)
        break Fail306;
      lifted127 lifted1270 = new lifted127();
      lifted1270.h_72 = h_72;
      lifted1270.z_57 = z_57;
      lifted1270.p_71 = p_71;
      lifted1270.j_72 = j_72;
      term = map_1_0.instance.invoke(context, term, lifted1270);
      if(term == null)
        break Fail306;
      c_74 = term;
      term = k_74;
      l_74 = k_74;
      if(g_72.value == null)
        break Fail306;
      term = hashtable_keys_0_0.instance.invoke(context, g_72.value);
      if(term == null)
        break Fail306;
      lifted128 lifted1280 = new lifted128();
      lifted1280.g_72 = g_72;
      lifted1280.z_57 = z_57;
      lifted1280.o_71 = o_71;
      lifted1280.j_72 = j_72;
      term = map_1_0.instance.invoke(context, term, lifted1280);
      if(term == null)
        break Fail306;
      d_74 = term;
      term = l_74;
      if(a_72 == null)
        break Fail306;
      term = a_72;
      lifted129 lifted1290 = new lifted129();
      lifted1290.z_57 = z_57;
      lifted1290.o_71 = o_71;
      lifted1290.a_58 = a_58;
      lifted1290.p_71 = p_71;
      lifted1290.v_71 = v_71;
      lifted1290.z_71 = z_71;
      lifted1290.j_72 = j_72;
      lifted1290.r_71 = r_71;
      lifted1290.s_71 = s_71;
      lifted1290.d_72 = d_72;
      term = map_1_0.instance.invoke(context, term, lifted1290);
      if(term == null)
        break Fail306;
      term = concat_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail306;
      term = termFactory.makeTuple(x_73, y_73, z_73, (IStrategoTerm)termFactory.makeListCons(a_74, (IStrategoList)cool.constNil0), b_74, c_74, d_74, term);
      term = conc_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail306;
      term = termFactory.makeAppl(transform._consClassBody_1, new IStrategoTerm[]{term});
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}