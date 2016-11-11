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

@SuppressWarnings("all") public class get_$L$H$S_type_0_3 extends Strategy 
{ 
  public static get_$L$H$S_type_0_3 instance = new get_$L$H$S_type_0_3();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm f_41, IStrategoTerm g_41, IStrategoTerm h_41)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("get_LHS_type_0_3");
    Fail208:
    { 
      IStrategoTerm i_41 = null;
      IStrategoTerm j_41 = null;
      IStrategoTerm l_41 = null;
      l_41 = term;
      i_41 = term;
      term = get_type_of_0_3.instance.invoke(context, l_41, f_41, g_41, h_41);
      if(term == null)
        break Fail208;
      j_41 = term;
      Success182:
      { 
        Fail209:
        { 
          IStrategoTerm k_41 = null;
          k_41 = term;
          term = termFactory.makeTuple(j_41, cool.constNone0);
          term = equal_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail209;
          term = k_41;
          { 
            term = debug_0_0.instance.invoke(context, cool.const81);
            if(term == null)
              break Fail208;
            term = debug_0_0.instance.invoke(context, i_41);
            if(term == null)
              break Fail208;
            term = cool.const77;
            if(true)
              break Fail208;
            if(true)
              break Success182;
          }
        }
        term = j_41;
      }
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}