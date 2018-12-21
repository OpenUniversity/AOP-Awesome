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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm l_37)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("gen_requires_method_name_0_1");
    Fail179:
    { 
      IStrategoTerm m_37 = null;
      IStrategoTerm n_37 = null;
      if(term.getTermType() != IStrategoTerm.APPL || transform._consMethodSignature_2 != ((IStrategoAppl)term).getConstructor())
        break Fail179;
      IStrategoTerm arg132 = term.getSubterm(0);
      if(arg132.getTermType() != IStrategoTerm.APPL || transform._consId_1 != ((IStrategoAppl)arg132).getConstructor())
        break Fail179;
      m_37 = arg132.getSubterm(0);
      term = strip_annos_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail179;
      n_37 = term;
      term = hashtable_get_0_1.instance.invoke(context, l_37, n_37);
      if(term == null)
        break Fail179;
      term = int_to_string_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail179;
      term = (IStrategoTerm)termFactory.makeListCons(cool.const40, termFactory.makeListCons(m_37, termFactory.makeListCons(term, (IStrategoList)cool.constNil0)));
      term = concat_strings_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail179;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}