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

  public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm r_46, IStrategoTerm s_46, IStrategoTerm t_46, IStrategoTerm u_46, IStrategoTerm v_46, IStrategoTerm w_46, IStrategoTerm x_46, IStrategoTerm y_46, IStrategoTerm z_46, IStrategoTerm a_47)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("make_lock_and_unlock_methods_0_10");
    Fail207:
    { 
      IStrategoTerm c_47 = null;
      IStrategoTerm d_47 = null;
      IStrategoTerm i_47 = null;
      IStrategoTerm k_47 = null;
      d_47 = term;
      IStrategoTerm term192 = term;
      Success150:
      { 
        Fail208:
        { 
          term = strip_annos_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail208;
          c_47 = term;
          if(true)
            break Success150;
        }
        term = term192;
        IStrategoTerm h_47 = null;
        h_47 = term;
        term = report_with_failure_0_1.instance.invoke(context, h_47, cool.const60);
        if(term == null)
          break Fail207;
      }
      term = d_47;
      k_47 = d_47;
      if(c_47 == null)
        break Fail207;
      term = make_lock_method_0_9.instance.invokeDynamic(context, c_47, NO_STRATEGIES, new IStrategoTerm[]{r_46, t_46, u_46, v_46, w_46, x_46, y_46, z_46, a_47});
      if(term == null)
        break Fail207;
      i_47 = term;
      term = k_47;
      if(c_47 == null)
        break Fail207;
      term = make_unlock_method_0_3.instance.invoke(context, c_47, r_46, s_46, x_46);
      if(term == null)
        break Fail207;
      term = (IStrategoTerm)termFactory.makeListCons(i_47, termFactory.makeListCons(term, (IStrategoList)cool.constNil0));
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