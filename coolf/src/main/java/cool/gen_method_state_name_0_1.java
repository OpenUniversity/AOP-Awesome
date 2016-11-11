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

@SuppressWarnings("all") public class gen_method_state_name_0_1 extends Strategy 
{ 
  public static gen_method_state_name_0_1 instance = new gen_method_state_name_0_1();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm v_51)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("gen_method_state_name_0_1");
    Fail287:
    { 
      IStrategoTerm w_51 = null;
      IStrategoTerm x_51 = null;
      if(term.getTermType() != IStrategoTerm.APPL || transform._consMethodSignature_2 != ((IStrategoAppl)term).getConstructor())
        break Fail287;
      IStrategoTerm arg144 = term.getSubterm(0);
      if(arg144.getTermType() != IStrategoTerm.APPL || transform._consId_1 != ((IStrategoAppl)arg144).getConstructor())
        break Fail287;
      w_51 = arg144.getSubterm(0);
      term = strip_annos_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail287;
      x_51 = term;
      term = hashtable_get_0_1.instance.invoke(context, v_51, x_51);
      if(term == null)
        break Fail287;
      term = int_to_string_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail287;
      term = (IStrategoTerm)termFactory.makeListCons(w_51, termFactory.makeListCons(term, (IStrategoList)cool.constCons27));
      term = concat_strings_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail287;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}