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

@SuppressWarnings("all") public class make_lock_and_unlock_methods_0_10 extends Strategy 
{ 
  public static make_lock_and_unlock_methods_0_10 instance = new make_lock_and_unlock_methods_0_10();

  public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm j_45, IStrategoTerm k_45, IStrategoTerm l_45, IStrategoTerm m_45, IStrategoTerm n_45, IStrategoTerm o_45, IStrategoTerm p_45, IStrategoTerm q_45, IStrategoTerm r_45, IStrategoTerm s_45)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("make_lock_and_unlock_methods_0_10");
    Fail200:
    { 
      IStrategoTerm u_45 = null;
      IStrategoTerm v_45 = null;
      IStrategoTerm a_46 = null;
      IStrategoTerm c_46 = null;
      v_45 = term;
      IStrategoTerm term192 = term;
      Success150:
      { 
        Fail201:
        { 
          term = strip_annos_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail201;
          u_45 = term;
          if(true)
            break Success150;
        }
        term = term192;
        IStrategoTerm z_45 = null;
        z_45 = term;
        term = report_with_failure_0_1.instance.invoke(context, z_45, cool.const59);
        if(term == null)
          break Fail200;
      }
      term = v_45;
      c_46 = v_45;
      if(u_45 == null)
        break Fail200;
      term = make_lock_method_0_9.instance.invokeDynamic(context, u_45, NO_STRATEGIES, new IStrategoTerm[]{j_45, l_45, m_45, n_45, o_45, p_45, q_45, r_45, s_45});
      if(term == null)
        break Fail200;
      a_46 = term;
      term = c_46;
      if(u_45 == null)
        break Fail200;
      term = make_unlock_method_0_3.instance.invoke(context, u_45, j_45, k_45, p_45);
      if(term == null)
        break Fail200;
      term = (IStrategoTerm)termFactory.makeListCons(a_46, termFactory.makeListCons(term, (IStrategoList)cool.constNil0));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }

  @Override public IStrategoTerm invokeDynamic(Context context, IStrategoTerm term, Strategy[] sargs, IStrategoTerm[] targs)
  { 
    if(sargs == null || targs == null || sargs.length != 0 || targs.length != 10)
      throw new IllegalArgumentException("Illegal arguments for " + getName());
    return invoke(context, term, targs[0], targs[1], targs[2], targs[3], targs[4], targs[5], targs[6], targs[7], targs[8], targs[9]);
  }
}