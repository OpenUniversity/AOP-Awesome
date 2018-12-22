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

@SuppressWarnings("all") public class get_file_0_0 extends Strategy 
{ 
  public static get_file_0_0 instance = new get_file_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail229:
    { 
      IStrategoTerm f_52 = null;
      IStrategoList annos1 = term.getAnnotations();
      if(annos1.getTermType() != IStrategoTerm.LIST || ((IStrategoList)annos1).isEmpty())
        break Fail229;
      IStrategoTerm arg173 = ((IStrategoList)annos1).head();
      if(arg173.getTermType() != IStrategoTerm.LIST || ((IStrategoList)arg173).isEmpty())
        break Fail229;
      IStrategoTerm arg174 = ((IStrategoList)arg173).tail();
      if(arg174.getTermType() != IStrategoTerm.LIST || ((IStrategoList)arg174).isEmpty())
        break Fail229;
      f_52 = ((IStrategoList)arg174).head();
      IStrategoTerm arg175 = ((IStrategoList)arg174).tail();
      if(arg175.getTermType() != IStrategoTerm.LIST || !((IStrategoList)arg175).isEmpty())
        break Fail229;
      IStrategoTerm arg176 = ((IStrategoList)annos1).tail();
      if(arg176.getTermType() != IStrategoTerm.LIST || !((IStrategoList)arg176).isEmpty())
        break Fail229;
      term = f_52;
      if(true)
        return term;
    }
    context.push("get_file_0_0");
    context.popOnFailure();
    return null;
  }
}