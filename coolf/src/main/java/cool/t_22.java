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

@SuppressWarnings("all") final class t_22 extends Strategy 
{ 
  public static final t_22 instance = new t_22();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail514:
    { 
      IStrategoTerm term101 = term;
      Success313:
      { 
        Fail515:
        { 
          term = $Not$Comp_1_0.instance.invoke(context, term, _Id.instance);
          if(term == null)
            break Fail515;
          if(true)
            break Success313;
        }
        term = term101;
        IStrategoTerm term102 = term;
        Success314:
        { 
          Fail516:
          { 
            term = $And$Comp_2_0.instance.invoke(context, term, this, _Id.instance);
            if(term == null)
              break Fail516;
            if(true)
              break Success314;
          }
          term = $Or$Comp_2_0.instance.invoke(context, term102, this, _Id.instance);
          if(term == null)
            break Fail514;
        }
      }
      if(true)
        return term;
    }
    return null;
  }
}