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

@SuppressWarnings("all") public class generate_imports_0_2 extends Strategy 
{ 
  public static generate_imports_0_2 instance = new generate_imports_0_2();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm u_42, IStrategoTerm v_42)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("generate_imports_0_2");
    Fail199:
    { 
      term = termFactory.makeTuple(u_42, (IStrategoTerm)termFactory.makeListCons(termFactory.makeAppl(transform._consTypeImportDec_1, new IStrategoTerm[]{v_42}), (IStrategoList)cool.constNil0), cool.constCons14, cool.constCons17);
      term = conc_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail199;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}