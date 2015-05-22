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

@SuppressWarnings("all") public class allow_extends_2_1 extends Strategy 
{ 
  public static allow_extends_2_1 instance = new allow_extends_2_1();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy n_31, Strategy o_31, IStrategoTerm m_31)
  { 
    context.push("allow_extends_2_1");
    Fail81:
    { 
      term = m_31;
      lifted58 lifted580 = new lifted58();
      lifted580.n_31 = n_31;
      lifted580.o_31 = o_31;
      term = SRTS_all.instance.invoke(context, term, lifted580);
      if(term == null)
        break Fail81;
      term = concat_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail81;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}