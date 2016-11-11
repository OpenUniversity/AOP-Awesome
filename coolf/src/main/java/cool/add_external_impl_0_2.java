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

@SuppressWarnings("all") public class add_external_impl_0_2 extends Strategy 
{ 
  public static add_external_impl_0_2 instance = new add_external_impl_0_2();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm c_25, IStrategoTerm d_25)
  { 
    context.push("add_external_impl_0_2");
    Fail133:
    { 
      IStrategoTerm e_25 = null;
      IStrategoTerm f_25 = null;
      IStrategoTerm g_25 = null;
      IStrategoTerm h_25 = null;
      IStrategoTerm i_25 = null;
      IStrategoTerm t_25 = null;
      IStrategoTerm u_25 = null;
      IStrategoTerm w_25 = null;
      IStrategoTerm z_25 = null;
      IStrategoTerm a_26 = null;
      term = strip_annos_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail133;
      e_25 = term;
      term = new_hashtable_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail133;
      f_25 = term;
      term = new_hashtable_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail133;
      h_25 = term;
      term = new_hashtable_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail133;
      i_25 = term;
      term = new_iset_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail133;
      g_25 = term;
      term = e_25;
      w_25 = e_25;
      term = new_hashtable_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail133;
      t_25 = term;
      z_25 = w_25;
      u_25 = cool.constNone0;
      a_26 = z_25;
      term = add_external_impl_0_9.instance.invokeDynamic(context, a_26, NO_STRATEGIES, new IStrategoTerm[]{f_25, t_25, g_25, h_25, c_25, i_25, u_25, cool.constFalse0, d_25});
      if(term == null)
        break Fail133;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}