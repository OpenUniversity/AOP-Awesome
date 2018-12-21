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

@SuppressWarnings("all") public class is__on__entry__or__on__exit__method_0_0 extends Strategy 
{ 
  public static is__on__entry__or__on__exit__method_0_0 instance = new is__on__entry__or__on__exit__method_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    context.push("is__on__entry__or__on__exit__method_0_0");
    Fail36:
    { 
      TermReference m_21 = new TermReference();
      lifted51 lifted511 = new lifted51();
      lifted50 lifted500 = new lifted50();
      lifted511.m_21 = m_21;
      lifted500.m_21 = m_21;
      term = or_2_0.instance.invoke(context, term, lifted500, lifted511);
      if(term == null)
        break Fail36;
      IStrategoTerm term73 = term;
      Success31:
      { 
        Fail37:
        { 
          IStrategoTerm n_21 = null;
          n_21 = term;
          lifted54 lifted540 = new lifted54();
          lifted52 lifted520 = new lifted52();
          lifted540.m_21 = m_21;
          lifted520.m_21 = m_21;
          term = or_2_0.instance.invoke(context, term, lifted520, lifted540);
          if(term == null)
            break Fail37;
          term = n_21;
          { 
            term = true_0_0.instance.invoke(context, term);
            if(term == null)
              break Fail36;
            if(true)
              break Success31;
          }
        }
        term = false_0_0.instance.invoke(context, term73);
        if(term == null)
          break Fail36;
      }
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}