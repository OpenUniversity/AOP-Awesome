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

@SuppressWarnings("all") public class gen__nomatch__pointcut__name_0_0 extends Strategy 
{ 
  public static gen__nomatch__pointcut__name_0_0 instance = new gen__nomatch__pointcut__name_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("gen__nomatch__pointcut__name_0_0");
    Fail58:
    { 
      term = random_string_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail58;
      term = (IStrategoTerm)termFactory.makeListCons(ejp.const18, termFactory.makeListCons(term, (IStrategoList)ejp.constNil0));
      term = concat_strings_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail58;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}