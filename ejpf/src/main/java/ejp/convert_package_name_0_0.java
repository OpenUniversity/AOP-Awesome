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

@SuppressWarnings("all") public class convert_package_name_0_0 extends Strategy 
{ 
  public static convert_package_name_0_0 instance = new convert_package_name_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    context.push("convert_package_name_0_0");
    Fail62:
    { 
      IStrategoTerm f_28 = null;
      if(term.getTermType() != IStrategoTerm.APPL || transform._consPackageName_1 != ((IStrategoAppl)term).getConstructor())
        break Fail62;
      f_28 = term.getSubterm(0);
      term = map_1_0.instance.invoke(context, f_28, lifted54.instance);
      if(term == null)
        break Fail62;
      term = concat_strings_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail62;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}