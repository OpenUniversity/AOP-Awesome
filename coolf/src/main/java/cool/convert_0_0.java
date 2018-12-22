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
    Fail190:
    { 
      IStrategoTerm d_41 = null;
      IStrategoTerm e_41 = null;
      IStrategoTerm f_41 = null;
      IStrategoTerm g_41 = null;
      IStrategoTerm h_41 = null;
      IStrategoTerm i_41 = null;
      IStrategoTerm j_41 = null;
      IStrategoTerm k_41 = null;
      if(term.getTermType() != IStrategoTerm.APPL || transform._consCompilationUnit_3 != ((IStrategoAppl)term).getConstructor())
        break Fail190;
      f_41 = term.getSubterm(0);
      g_41 = term.getSubterm(1);
      e_41 = term.getSubterm(2);
      k_41 = term;
      Success146:
      { 
        Fail191:
        { 
          IStrategoTerm l_41 = null;
          l_41 = term;
          term = get_coordinator_0_1.instance.invoke(context, k_41, e_41);
          if(term == null)
            break Fail191;
          d_41 = term;
          term = l_41;
          { 
            IStrategoTerm o_41 = null;
            term = fetch_coordinator_type_0_0.instance.invoke(context, d_41);
            if(term == null)
              break Fail190;
            h_41 = term;
            term = convert_coordinator_declaration_0_1.instance.invoke(context, d_41, term);
            if(term == null)
              break Fail190;
            i_41 = term;
            term = remove_all_1_0.instance.invoke(context, e_41, lifted110.instance);
            if(term == null)
              break Fail190;
            j_41 = term;
            term = generate_imports_0_2.instance.invoke(context, term, g_41, h_41);
            if(term == null)
              break Fail190;
            o_41 = term;
            term = termFactory.makeTuple((IStrategoTerm)termFactory.makeListCons(i_41, (IStrategoList)cool.constNil0), j_41);
            term = conc_0_0.instance.invoke(context, term);
            if(term == null)
              break Fail190;
            term = termFactory.makeAppl(transform._consCompilationUnit_3, new IStrategoTerm[]{f_41, o_41, term});
            if(true)
              break Success146;
          }
        }
        term = k_41;
      }
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}