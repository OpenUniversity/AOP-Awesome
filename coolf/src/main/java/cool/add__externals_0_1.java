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

@SuppressWarnings("all") public class add__externals_0_1 extends Strategy 
{ 
  public static add__externals_0_1 instance = new add__externals_0_1();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm o_24)
  { 
    context.push("add__externals_0_1");
    Fail132:
    { 
      IStrategoTerm p_24 = null;
      TermReference s_24 = new TermReference();
      p_24 = term;
      term = new_iset_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail132;
      if(s_24.value == null)
        s_24.value = term;
      else
        if(s_24.value != term && !s_24.value.match(term))
          break Fail132;
      term = add_external_impl_0_2.instance.invoke(context, p_24, s_24.value, o_24);
      if(term == null)
        break Fail132;
      lifted4 lifted410 = new lifted4();
      lifted410.s_24 = s_24;
      term = topdown_1_0.instance.invoke(context, term, lifted410);
      if(term == null)
        break Fail132;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}