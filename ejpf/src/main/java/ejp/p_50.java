package ejp;

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

@SuppressWarnings("all") final class p_50 extends Strategy 
{ 
  public static final p_50 instance = new p_50();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail268:
    { 
      IStrategoTerm term176 = term;
      Success183:
      { 
        Fail269:
        { 
          term = $Not$Comp_1_0.instance.invoke(context, term, _Id.instance);
          if(term == null)
            break Fail269;
          if(true)
            break Success183;
        }
        term = term176;
        IStrategoTerm term177 = term;
        Success184:
        { 
          Fail270:
          { 
            term = $And$Comp_2_0.instance.invoke(context, term, this, _Id.instance);
            if(term == null)
              break Fail270;
            if(true)
              break Success184;
          }
          term = $Or$Comp_2_0.instance.invoke(context, term177, this, _Id.instance);
          if(term == null)
            break Fail268;
        }
      }
      if(true)
        return term;
    }
    return null;
  }
}