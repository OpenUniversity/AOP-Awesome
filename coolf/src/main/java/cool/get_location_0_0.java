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

@SuppressWarnings("all") public class get_location_0_0 extends Strategy 
{ 
  public static get_location_0_0 instance = new get_location_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail189:
    { 
      IStrategoTerm t_40 = null;
      IStrategoList annos0 = term.getAnnotations();
      if(annos0.getTermType() != IStrategoTerm.LIST || ((IStrategoList)annos0).isEmpty())
        break Fail189;
      IStrategoTerm arg143 = ((IStrategoList)annos0).head();
      if(arg143.getTermType() != IStrategoTerm.LIST || ((IStrategoList)arg143).isEmpty())
        break Fail189;
      t_40 = ((IStrategoList)arg143).head();
      IStrategoTerm arg144 = ((IStrategoList)annos0).tail();
      if(arg144.getTermType() != IStrategoTerm.LIST || !((IStrategoList)arg144).isEmpty())
        break Fail189;
      term = t_40;
      if(true)
        return term;
    }
    context.push("get_location_0_0");
    context.popOnFailure();
    return null;
  }
}