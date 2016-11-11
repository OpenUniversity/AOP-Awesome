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

@SuppressWarnings("all") public class generate_ref_method__name_0_2 extends Strategy 
{ 
  public static generate_ref_method__name_0_2 instance = new generate_ref_method__name_0_2();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm r_42, IStrategoTerm s_42)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("generate_ref_method__name_0_2");
    Fail217:
    { 
      IStrategoTerm t_42 = null;
      IStrategoTerm term232 = term;
      Success187:
      { 
        Fail218:
        { 
          IStrategoTerm v_42 = null;
          v_42 = term;
          IStrategoTerm term233 = term;
          Success188:
          { 
            Fail219:
            { 
              term = hashtable_keys_0_0.instance.invoke(context, s_42);
              if(term == null)
                break Fail219;
              term = termFactory.makeTuple(r_42, term);
              term = elem_0_0.instance.invoke(context, term);
              if(term == null)
                break Fail219;
              { 
                if(true)
                  break Fail218;
                if(true)
                  break Success188;
              }
            }
            term = term233;
          }
          term = v_42;
          { 
            term = hashtable_keys_0_0.instance.invoke(context, s_42);
            if(term == null)
              break Fail217;
            term = length_0_0.instance.invoke(context, term);
            if(term == null)
              break Fail217;
            term = termFactory.makeTuple(term, cool.const83);
            term = add_0_0.instance.invoke(context, term);
            if(term == null)
              break Fail217;
            t_42 = term;
            term = int_to_string_0_0.instance.invoke(context, t_42);
            if(term == null)
              break Fail217;
            term = (IStrategoTerm)termFactory.makeListCons(cool.const84, termFactory.makeListCons(term, (IStrategoList)cool.constNil0));
            term = concat_strings_0_0.instance.invoke(context, term);
            if(term == null)
              break Fail217;
            term = hashtable_put_0_2.instance.invoke(context, s_42, r_42, term);
            if(term == null)
              break Fail217;
            if(true)
              break Success187;
          }
        }
        term = term232;
      }
      term = hashtable_get_0_1.instance.invoke(context, s_42, r_42);
      if(term == null)
        break Fail217;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}