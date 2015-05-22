package cjp;

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

@SuppressWarnings("all") final class lifted23 extends Strategy 
{ 
  public static final lifted23 instance = new lifted23();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    Fail172:
    { 
      IStrategoTerm v_24 = null;
      if(term.getTermType() != IStrategoTerm.APPL || transform._consParam_3 != ((IStrategoAppl)term).getConstructor())
        break Fail172;
      v_24 = term.getSubterm(1);
      term = pp_java5_to_string_0_0.instance.invoke(context, v_24);
      if(term == null)
        break Fail172;
      term = termFactory.makeTuple(cjp.const83, term);
      term = conc_strings_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail172;
      if(true)
        return term;
    }
    return null;
  }
}