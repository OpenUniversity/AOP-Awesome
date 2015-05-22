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

  public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm j_46, IStrategoTerm k_46, IStrategoTerm l_46, IStrategoTerm m_46, IStrategoTerm n_46, IStrategoTerm o_46, IStrategoTerm p_46, IStrategoTerm q_46, IStrategoTerm r_46, IStrategoTerm s_46)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("make_lock_and_unlock_methods_0_10");
    Fail207:
    { 
      IStrategoTerm t_46 = null;
      IStrategoTerm u_46 = null;
      t_46 = term;
      term = make_lock_method_0_9.instance.invokeDynamic(context, t_46, NO_STRATEGIES, new IStrategoTerm[]{j_46, l_46, m_46, n_46, o_46, p_46, q_46, r_46, s_46});
      if(term == null)
        break Fail207;
      u_46 = term;
      term = make_unlock_method_0_3.instance.invoke(context, t_46, j_46, k_46, p_46);
      if(term == null)
        break Fail207;
      term = (IStrategoTerm)termFactory.makeListCons(u_46, termFactory.makeListCons(term, (IStrategoList)cool.constNil0));
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