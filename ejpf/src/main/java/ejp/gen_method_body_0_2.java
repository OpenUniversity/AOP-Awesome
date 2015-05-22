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

@SuppressWarnings("all") public class gen_method_body_0_2 extends Strategy 
{ 
  public static gen_method_body_0_2 instance = new gen_method_body_0_2();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm u_39, IStrategoTerm v_39)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("gen_method_body_0_2");
    Fail102:
    { 
      Success54:
      { 
        Fail103:
        { 
          IStrategoTerm w_39 = null;
          w_39 = term;
          term = termFactory.makeTuple(u_39, ejp.constNone0);
          term = equal_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail103;
          term = w_39;
          { 
            term = get_default_return_value_for_return_type_0_0.instance.invoke(context, v_39);
            if(term == null)
              break Fail102;
            term = termFactory.makeAppl(transform._consBlock_1, new IStrategoTerm[]{(IStrategoTerm)termFactory.makeListCons(termFactory.makeAppl(transform._consReturn_1, new IStrategoTerm[]{term}), (IStrategoList)ejp.constNil0)});
            if(true)
              break Success54;
          }
        }
        term = fetch_default_value_0_0.instance.invoke(context, u_39);
        if(term == null)
          break Fail102;
        term = termFactory.makeAppl(transform._consBlock_1, new IStrategoTerm[]{(IStrategoTerm)termFactory.makeListCons(termFactory.makeAppl(transform._consReturn_1, new IStrategoTerm[]{termFactory.makeAppl(transform._consSome_1, new IStrategoTerm[]{term})}), (IStrategoList)ejp.constNil0)});
      }
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}