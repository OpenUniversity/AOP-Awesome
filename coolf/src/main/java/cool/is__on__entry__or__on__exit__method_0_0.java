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
    Fail150:
    { 
      TermReference l_37 = new TermReference();
      lifted55 lifted550 = new lifted55();
      lifted54 lifted540 = new lifted54();
      lifted550.l_37 = l_37;
      lifted540.l_37 = l_37;
      term = or_2_0.instance.invoke(context, term, lifted540, lifted550);
      if(term == null)
        break Fail150;
      IStrategoTerm term179 = term;
      Success134:
      { 
        Fail151:
        { 
          IStrategoTerm m_37 = null;
          m_37 = term;
          lifted58 lifted580 = new lifted58();
          lifted56 lifted560 = new lifted56();
          lifted580.l_37 = l_37;
          lifted560.l_37 = l_37;
          term = or_2_0.instance.invoke(context, term, lifted560, lifted580);
          if(term == null)
            break Fail151;
          term = m_37;
          { 
            term = true_0_0.instance.invoke(context, term);
            if(term == null)
              break Fail150;
            if(true)
              break Success134;
          }
        }
        term = false_0_0.instance.invoke(context, term179);
        if(term == null)
          break Fail150;
      }
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}