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
      IStrategoTerm l_42 = null;
      IStrategoTerm m_42 = null;
      IStrategoTerm n_42 = null;
      IStrategoTerm o_42 = null;
      IStrategoTerm p_42 = null;
      IStrategoTerm q_42 = null;
      IStrategoTerm r_42 = null;
      IStrategoTerm s_42 = null;
      if(term.getTermType() != IStrategoTerm.APPL || transform._consCompilationUnit_3 != ((IStrategoAppl)term).getConstructor())
        break Fail197;
      n_42 = term.getSubterm(0);
      o_42 = term.getSubterm(1);
      m_42 = term.getSubterm(2);
      s_42 = term;
      Success146:
      { 
        Fail198:
        { 
          IStrategoTerm t_42 = null;
          t_42 = term;
          term = get_coordinator_0_1.instance.invoke(context, s_42, m_42);
          if(term == null)
            break Fail198;
          l_42 = term;
          term = t_42;
          { 
            IStrategoTerm w_42 = null;
            term = fetch_coordinator_type_0_0.instance.invoke(context, l_42);
            if(term == null)
              break Fail197;
            p_42 = term;
            term = convert_coordinator_declaration_0_1.instance.invoke(context, l_42, term);
            if(term == null)
              break Fail197;
            q_42 = term;
            term = remove_all_1_0.instance.invoke(context, m_42, lifted110.instance);
            if(term == null)
              break Fail197;
            r_42 = term;
            term = generate_imports_0_2.instance.invoke(context, term, o_42, p_42);
            if(term == null)
              break Fail197;
            w_42 = term;
            term = termFactory.makeTuple((IStrategoTerm)termFactory.makeListCons(q_42, (IStrategoList)cool.constNil0), r_42);
            term = conc_0_0.instance.invoke(context, term);
            if(term == null)
              break Fail197;
            term = termFactory.makeAppl(transform._consCompilationUnit_3, new IStrategoTerm[]{n_42, w_42, term});
            if(true)
              break Success146;
          }
        }
        term = s_42;
      }
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}