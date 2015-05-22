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
    Fail197:
    { 
      IStrategoTerm f_42 = null;
      IStrategoTerm g_42 = null;
      IStrategoTerm h_42 = null;
      IStrategoTerm i_42 = null;
      IStrategoTerm j_42 = null;
      IStrategoTerm k_42 = null;
      IStrategoTerm l_42 = null;
      IStrategoTerm m_42 = null;
      if(term.getTermType() != IStrategoTerm.APPL || transform._consCompilationUnit_3 != ((IStrategoAppl)term).getConstructor())
        break Fail197;
      h_42 = term.getSubterm(0);
      i_42 = term.getSubterm(1);
      g_42 = term.getSubterm(2);
      m_42 = term;
      Success146:
      { 
        Fail198:
        { 
          IStrategoTerm n_42 = null;
          n_42 = term;
          term = get_coordinator_0_1.instance.invoke(context, m_42, g_42);
          if(term == null)
            break Fail198;
          f_42 = term;
          term = n_42;
          { 
            IStrategoTerm q_42 = null;
            term = fetch_coordinator_type_0_0.instance.invoke(context, f_42);
            if(term == null)
              break Fail197;
            j_42 = term;
            term = convert_coordinator_declaration_0_1.instance.invoke(context, f_42, term);
            if(term == null)
              break Fail197;
            k_42 = term;
            term = remove_all_1_0.instance.invoke(context, g_42, lifted110.instance);
            if(term == null)
              break Fail197;
            l_42 = term;
            term = generate_imports_0_2.instance.invoke(context, term, i_42, j_42);
            if(term == null)
              break Fail197;
            q_42 = term;
            term = termFactory.makeTuple((IStrategoTerm)termFactory.makeListCons(k_42, (IStrategoList)cool.constNil0), l_42);
            term = conc_0_0.instance.invoke(context, term);
            if(term == null)
              break Fail197;
            term = termFactory.makeAppl(transform._consCompilationUnit_3, new IStrategoTerm[]{h_42, q_42, term});
            if(true)
              break Success146;
          }
        }
        term = m_42;
      }
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}