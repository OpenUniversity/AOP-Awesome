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

@SuppressWarnings("all") public class convert_0_0 extends Strategy 
{ 
  public static convert_0_0 instance = new convert_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("convert_0_0");
    Fail299:
    { 
      IStrategoTerm u_55 = null;
      IStrategoTerm v_55 = null;
      IStrategoTerm w_55 = null;
      IStrategoTerm x_55 = null;
      IStrategoTerm y_55 = null;
      IStrategoTerm z_55 = null;
      IStrategoTerm a_56 = null;
      IStrategoTerm b_56 = null;
      if(term.getTermType() != IStrategoTerm.APPL || transform._consCompilationUnit_3 != ((IStrategoAppl)term).getConstructor())
        break Fail299;
      w_55 = term.getSubterm(0);
      x_55 = term.getSubterm(1);
      v_55 = term.getSubterm(2);
      b_56 = term;
      Success248:
      { 
        Fail300:
        { 
          IStrategoTerm c_56 = null;
          c_56 = term;
          term = get_coordinator_0_1.instance.invoke(context, b_56, v_55);
          if(term == null)
            break Fail300;
          u_55 = term;
          term = c_56;
          { 
            IStrategoTerm i_56 = null;
            term = fetch_coordinator_type_0_0.instance.invoke(context, u_55);
            if(term == null)
              break Fail299;
            y_55 = term;
            term = convert_coordinator_declaration_0_1.instance.invoke(context, u_55, term);
            if(term == null)
              break Fail299;
            z_55 = term;
            term = remove_all_1_0.instance.invoke(context, v_55, lifted112.instance);
            if(term == null)
              break Fail299;
            a_56 = term;
            term = generate_imports_0_2.instance.invoke(context, term, x_55, y_55);
            if(term == null)
              break Fail299;
            i_56 = term;
            term = termFactory.makeTuple((IStrategoTerm)termFactory.makeListCons(z_55, (IStrategoList)cool.constNil0), a_56);
            term = conc_0_0.instance.invoke(context, term);
            if(term == null)
              break Fail299;
            term = termFactory.makeAppl(transform._consCompilationUnit_3, new IStrategoTerm[]{w_55, i_56, term});
            if(true)
              break Success248;
          }
        }
        term = b_56;
      }
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}