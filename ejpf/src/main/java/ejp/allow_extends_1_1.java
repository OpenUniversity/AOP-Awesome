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

@SuppressWarnings("all") public class allow_extends_1_1 extends Strategy 
{ 
  public static allow_extends_1_1 instance = new allow_extends_1_1();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy j_31, IStrategoTerm i_31)
  { 
    context.push("allow_extends_1_1");
    Fail80:
    { 
      term = allow_extends_2_1.instance.invoke(context, term, j_31, _Id.instance, i_31);
      if(term == null)
        break Fail80;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}