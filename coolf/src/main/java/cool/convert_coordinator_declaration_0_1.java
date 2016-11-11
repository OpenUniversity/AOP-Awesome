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

@SuppressWarnings("all") public class convert_coordinator_declaration_0_1 extends Strategy 
{ 
  public static convert_coordinator_declaration_0_1 instance = new convert_coordinator_declaration_0_1();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm k_57)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("convert_coordinator_declaration_0_1");
    Fail304:
    { 
      IStrategoTerm n_57 = null;
      IStrategoTerm o_57 = null;
      IStrategoTerm p_57 = null;
      IStrategoTerm s_57 = null;
      if(term.getTermType() != IStrategoTerm.APPL || transform._consCoordinatorDec_2 != ((IStrategoAppl)term).getConstructor())
        break Fail304;
      n_57 = term.getSubterm(1);
      p_57 = term;
      IStrategoTerm term294 = term;
      Success249:
      { 
        Fail305:
        { 
          term = fetch__class__name_0_0.instance.invoke(context, k_57);
          if(term == null)
            break Fail305;
          o_57 = term;
          if(true)
            break Success249;
        }
        term = term294;
        IStrategoTerm r_57 = null;
        r_57 = term;
        term = report_with_failure_0_1.instance.invoke(context, r_57, cool.const117);
        if(term == null)
          break Fail304;
      }
      term = p_57;
      term = gen_class_head_0_1.instance.invoke(context, term, k_57);
      if(term == null)
        break Fail304;
      s_57 = term;
      term = gen_coordinator_body_0_1.instance.invoke(context, n_57, o_57);
      if(term == null)
        break Fail304;
      term = termFactory.makeAppl(transform._consClassDec_2, new IStrategoTerm[]{s_57, term});
      term = add__externals_0_1.instance.invoke(context, term, o_57);
      if(term == null)
        break Fail304;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}