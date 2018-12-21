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

  public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm v_25, IStrategoTerm w_25, IStrategoTerm x_25, IStrategoTerm y_25, IStrategoTerm z_25, IStrategoTerm a_26, IStrategoTerm b_26)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("handle_expr_0_7");
    Fail99:
    { 
      IStrategoTerm c_26 = null;
      IStrategoTerm d_26 = null;
      IStrategoTerm e_26 = null;
      IStrategoTerm h_26 = null;
      h_26 = term;
      c_26 = term;
      term = fetch_0_0.instance.invoke(context, h_26);
      if(term == null)
        break Fail99;
      d_26 = term;
      IStrategoTerm term124 = term;
      Success82:
      { 
        Fail100:
        { 
          IStrategoTerm f_26 = null;
          f_26 = term;
          term = hashtable_keys_0_0.instance.invoke(context, v_25);
          if(term == null)
            break Fail100;
          term = termFactory.makeTuple(d_26, term);
          term = elem_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail100;
          term = f_26;
          { 
            term = c_26;
            if(true)
              break Success82;
          }
        }
        term = term124;
        IStrategoTerm term125 = term;
        Success83:
        { 
          Fail101:
          { 
            IStrategoTerm g_26 = null;
            g_26 = term;
            term = termFactory.makeTuple(a_26, cool.constFalse0);
            term = equal_0_0.instance.invoke(context, term);
            if(term == null)
              break Fail101;
            term = g_26;
            { 
              term = debug_0_0.instance.invoke(context, cool.const14);
              if(term == null)
                break Fail99;
              term = debug_0_0.instance.invoke(context, c_26);
              if(term == null)
                break Fail99;
              term = cool.const9;
              if(true)
                break Fail99;
              if(true)
                break Success83;
            }
          }
          term = term125;
          IStrategoTerm o_26 = null;
          term = generate_ref_method__name_0_2.instance.invoke(context, term, d_26, y_25);
          if(term == null)
            break Fail99;
          e_26 = term;
          term = w_25;
          o_26 = w_25;
          term = create_ref_method_0_4.instance.invoke(context, term, d_26, e_26, z_25, b_26);
          if(term == null)
            break Fail99;
          term = iset_add_0_1.instance.invoke(context, o_26, term);
          if(term == null)
            break Fail99;
          term = iset_add_0_1.instance.invoke(context, x_25, d_26);
          if(term == null)
            break Fail99;
          term = generate_invoke_ref_0_1.instance.invoke(context, cool.const9, e_26);
          if(term == null)
            break Fail99;
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