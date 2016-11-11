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

  public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm p_74, IStrategoTerm q_74, IStrategoTerm r_74, IStrategoTerm s_74, IStrategoTerm t_74, IStrategoTerm u_74, IStrategoTerm v_74, IStrategoTerm w_74, IStrategoTerm x_74, IStrategoTerm y_74)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("make_lock_and_unlock_methods_0_10");
    Fail308:
    { 
      IStrategoTerm a_75 = null;
      IStrategoTerm b_75 = null;
      IStrategoTerm h_75 = null;
      IStrategoTerm j_75 = null;
      b_75 = term;
      IStrategoTerm term296 = term;
      Success251:
      { 
        Fail309:
        { 
          term = strip_annos_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail309;
          a_75 = term;
          if(true)
            break Success251;
        }
        term = term296;
        IStrategoTerm g_75 = null;
        g_75 = term;
        term = report_with_failure_0_1.instance.invoke(context, g_75, cool.const119);
        if(term == null)
          break Fail308;
      }
      term = b_75;
      j_75 = b_75;
      if(a_75 == null)
        break Fail308;
      term = make_lock_method_0_9.instance.invokeDynamic(context, a_75, NO_STRATEGIES, new IStrategoTerm[]{p_74, r_74, s_74, t_74, u_74, v_74, w_74, x_74, y_74});
      if(term == null)
        break Fail308;
      h_75 = term;
      term = j_75;
      if(a_75 == null)
        break Fail308;
      term = make_unlock_method_0_3.instance.invoke(context, a_75, p_74, q_74, v_74);
      if(term == null)
        break Fail308;
      term = (IStrategoTerm)termFactory.makeListCons(h_75, termFactory.makeListCons(term, (IStrategoList)cool.constNil0));
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