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

@SuppressWarnings("all") public class handle_expr_0_7 extends Strategy 
{ 
  public static handle_expr_0_7 instance = new handle_expr_0_7();

  public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm u_41, IStrategoTerm v_41, IStrategoTerm w_41, IStrategoTerm x_41, IStrategoTerm y_41, IStrategoTerm z_41, IStrategoTerm a_42)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("handle_expr_0_7");
    Fail213:
    { 
      IStrategoTerm b_42 = null;
      IStrategoTerm c_42 = null;
      IStrategoTerm d_42 = null;
      IStrategoTerm g_42 = null;
      g_42 = term;
      b_42 = term;
      term = fetch_0_0.instance.invoke(context, g_42);
      if(term == null)
        break Fail213;
      c_42 = term;
      IStrategoTerm term230 = term;
      Success185:
      { 
        Fail214:
        { 
          IStrategoTerm e_42 = null;
          e_42 = term;
          term = hashtable_keys_0_0.instance.invoke(context, u_41);
          if(term == null)
            break Fail214;
          term = termFactory.makeTuple(c_42, term);
          term = elem_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail214;
          term = e_42;
          { 
            term = b_42;
            if(true)
              break Success185;
          }
        }
        term = term230;
        IStrategoTerm term231 = term;
        Success186:
        { 
          Fail215:
          { 
            IStrategoTerm f_42 = null;
            f_42 = term;
            term = termFactory.makeTuple(z_41, cool.constFalse0);
            term = equal_0_0.instance.invoke(context, term);
            if(term == null)
              break Fail215;
            term = f_42;
            { 
              term = debug_0_0.instance.invoke(context, cool.const82);
              if(term == null)
                break Fail213;
              term = debug_0_0.instance.invoke(context, b_42);
              if(term == null)
                break Fail213;
              term = cool.const77;
              if(true)
                break Fail213;
              if(true)
                break Success186;
            }
          }
          term = term231;
          IStrategoTerm n_42 = null;
          term = generate_ref_method__name_0_2.instance.invoke(context, term, c_42, x_41);
          if(term == null)
            break Fail213;
          d_42 = term;
          term = v_41;
          n_42 = v_41;
          term = create_ref_method_0_4.instance.invoke(context, term, c_42, d_42, y_41, a_42);
          if(term == null)
            break Fail213;
          term = iset_add_0_1.instance.invoke(context, n_42, term);
          if(term == null)
            break Fail213;
          term = iset_add_0_1.instance.invoke(context, w_41, c_42);
          if(term == null)
            break Fail213;
          term = generate_invoke_ref_0_1.instance.invoke(context, cool.const77, d_42);
          if(term == null)
            break Fail213;
        }
      }
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }

  @Override public IStrategoTerm invokeDynamic(Context context, IStrategoTerm term, Strategy[] sargs, IStrategoTerm[] targs)
  { 
    if(sargs == null || targs == null || sargs.length != 0 || targs.length != 7)
      throw new IllegalArgumentException("Illegal arguments for " + getName());
    return invoke(context, term, targs[0], targs[1], targs[2], targs[3], targs[4], targs[5], targs[6]);
  }
}