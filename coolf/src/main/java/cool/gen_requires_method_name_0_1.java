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

@SuppressWarnings("all") public class gen_requires_method_name_0_1 extends Strategy 
{ 
  public static gen_requires_method_name_0_1 instance = new gen_requires_method_name_0_1();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm c_52)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("gen_requires_method_name_0_1");
    Fail288:
    { 
      IStrategoTerm d_52 = null;
      IStrategoTerm e_52 = null;
      if(term.getTermType() != IStrategoTerm.APPL || transform._consMethodSignature_2 != ((IStrategoAppl)term).getConstructor())
        break Fail288;
      IStrategoTerm arg146 = term.getSubterm(0);
      if(arg146.getTermType() != IStrategoTerm.APPL || transform._consId_1 != ((IStrategoAppl)arg146).getConstructor())
        break Fail288;
      d_52 = arg146.getSubterm(0);
      term = strip_annos_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail288;
      e_52 = term;
      term = hashtable_get_0_1.instance.invoke(context, c_52, e_52);
      if(term == null)
        break Fail288;
      term = int_to_string_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail288;
      term = (IStrategoTerm)termFactory.makeListCons(cool.const102, termFactory.makeListCons(d_52, termFactory.makeListCons(term, (IStrategoList)cool.constNil0)));
      term = concat_strings_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail288;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}