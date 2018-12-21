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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm d_9, IStrategoTerm e_9)
  { 
    context.push("add_external_impl_0_2");
    Fail19:
    { 
      IStrategoTerm f_9 = null;
      IStrategoTerm g_9 = null;
      IStrategoTerm h_9 = null;
      IStrategoTerm i_9 = null;
      IStrategoTerm j_9 = null;
      IStrategoTerm u_9 = null;
      IStrategoTerm v_9 = null;
      IStrategoTerm x_9 = null;
      IStrategoTerm a_10 = null;
      IStrategoTerm b_10 = null;
      term = strip_annos_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail19;
      f_9 = term;
      term = new_hashtable_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail19;
      g_9 = term;
      term = new_hashtable_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail19;
      i_9 = term;
      term = new_hashtable_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail19;
      j_9 = term;
      term = new_iset_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail19;
      h_9 = term;
      term = f_9;
      x_9 = f_9;
      term = new_hashtable_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail19;
      u_9 = term;
      a_10 = x_9;
      v_9 = cool.constNone0;
      b_10 = a_10;
      term = add_external_impl_0_9.instance.invokeDynamic(context, b_10, NO_STRATEGIES, new IStrategoTerm[]{g_9, u_9, h_9, i_9, d_9, j_9, v_9, cool.constFalse0, e_9});
      if(term == null)
        break Fail19;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}