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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm g_25, IStrategoTerm h_25, IStrategoTerm i_25)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("get_LHS_type_0_3");
    Fail94:
    { 
      IStrategoTerm j_25 = null;
      IStrategoTerm k_25 = null;
      IStrategoTerm m_25 = null;
      m_25 = term;
      j_25 = term;
      term = get_type_of_0_3.instance.invoke(context, m_25, g_25, h_25, i_25);
      if(term == null)
        break Fail94;
      k_25 = term;
      Success79:
      { 
        Fail95:
        { 
          IStrategoTerm l_25 = null;
          l_25 = term;
          term = termFactory.makeTuple(k_25, cool.constNone0);
          term = equal_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail95;
          term = l_25;
          { 
            term = debug_0_0.instance.invoke(context, cool.const13);
            if(term == null)
              break Fail94;
            term = debug_0_0.instance.invoke(context, j_25);
            if(term == null)
              break Fail94;
            term = cool.const9;
            if(true)
              break Fail94;
            if(true)
              break Success79;
          }
        }
        term = k_25;
      }
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}