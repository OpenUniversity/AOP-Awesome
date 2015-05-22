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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm s_26, IStrategoTerm t_26)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("generate_ref_method__name_0_2");
    Fail103:
    { 
      IStrategoTerm u_26 = null;
      IStrategoTerm term126 = term;
      Success84:
      { 
        Fail104:
        { 
          IStrategoTerm w_26 = null;
          w_26 = term;
          IStrategoTerm term127 = term;
          Success85:
          { 
            Fail105:
            { 
              term = hashtable_keys_0_0.instance.invoke(context, t_26);
              if(term == null)
                break Fail105;
              term = termFactory.makeTuple(s_26, term);
              term = elem_0_0.instance.invoke(context, term);
              if(term == null)
                break Fail105;
              { 
                if(true)
                  break Fail104;
                if(true)
                  break Success85;
              }
            }
            term = term127;
          }
          term = w_26;
          { 
            term = hashtable_keys_0_0.instance.invoke(context, t_26);
            if(term == null)
              break Fail103;
            term = length_0_0.instance.invoke(context, term);
            if(term == null)
              break Fail103;
            term = termFactory.makeTuple(term, cool.const16);
            term = add_0_0.instance.invoke(context, term);
            if(term == null)
              break Fail103;
            u_26 = term;
            term = int_to_string_0_0.instance.invoke(context, u_26);
            if(term == null)
              break Fail103;
            term = (IStrategoTerm)termFactory.makeListCons(cool.const17, termFactory.makeListCons(term, (IStrategoList)cool.constNil0));
            term = concat_strings_0_0.instance.invoke(context, term);
            if(term == null)
              break Fail103;
            term = hashtable_put_0_2.instance.invoke(context, t_26, s_26, term);
            if(term == null)
              break Fail103;
            if(true)
              break Success84;
          }
        }
        term = term126;
      }
      term = hashtable_get_0_1.instance.invoke(context, t_26, s_26);
      if(term == null)
        break Fail103;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}