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
    Fail190:
    { 
      IStrategoTerm w_40 = null;
      IStrategoList annos1 = term.getAnnotations();
      if(annos1.getTermType() != IStrategoTerm.LIST || ((IStrategoList)annos1).isEmpty())
        break Fail190;
      IStrategoTerm arg145 = ((IStrategoList)annos1).head();
      if(arg145.getTermType() != IStrategoTerm.LIST || ((IStrategoList)arg145).isEmpty())
        break Fail190;
      IStrategoTerm arg146 = ((IStrategoList)arg145).tail();
      if(arg146.getTermType() != IStrategoTerm.LIST || ((IStrategoList)arg146).isEmpty())
        break Fail190;
      w_40 = ((IStrategoList)arg146).head();
      IStrategoTerm arg147 = ((IStrategoList)arg146).tail();
      if(arg147.getTermType() != IStrategoTerm.LIST || !((IStrategoList)arg147).isEmpty())
        break Fail190;
      IStrategoTerm arg148 = ((IStrategoList)annos1).tail();
      if(arg148.getTermType() != IStrategoTerm.LIST || !((IStrategoList)arg148).isEmpty())
        break Fail190;
      term = w_40;
      if(true)
        return term;
    }
    context.push("get_file_0_0");
    context.popOnFailure();
    return null;
  }
}