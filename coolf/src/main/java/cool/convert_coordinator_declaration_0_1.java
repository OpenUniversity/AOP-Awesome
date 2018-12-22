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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm a_42)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("convert_coordinator_declaration_0_1");
    Fail195:
    { 
      IStrategoTerm c_42 = null;
      IStrategoTerm d_42 = null;
      IStrategoTerm e_42 = null;
      IStrategoTerm h_42 = null;
      if(term.getTermType() != IStrategoTerm.APPL || transform._consCoordinatorDec_2 != ((IStrategoAppl)term).getConstructor())
        break Fail195;
      c_42 = term.getSubterm(1);
      e_42 = term;
      IStrategoTerm term189 = term;
      Success147:
      { 
        Fail196:
        { 
          term = a_42;
          IStrategoTerm term190 = term;
          IStrategoConstructor cons7 = term.getTermType() == IStrategoTerm.APPL ? ((IStrategoAppl)term).getConstructor() : null;
          Success148:
          { 
            if(cons7 == transform._consTypeName_2)
            { 
              Fail197:
              { 
                IStrategoTerm f_171 = null;
                IStrategoTerm arg150 = term.getSubterm(1);
                if(arg150.getTermType() != IStrategoTerm.APPL || transform._consId_1 != ((IStrategoAppl)arg150).getConstructor())
                  break Fail197;
                f_171 = arg150.getSubterm(0);
                term = f_171;
                if(true)
                  break Success148;
              }
              term = term190;
            }
            if(cons7 == transform._consTypeName_1)
            { 
              IStrategoTerm g_171 = null;
              IStrategoTerm arg151 = term.getSubterm(0);
              if(arg151.getTermType() != IStrategoTerm.APPL || transform._consId_1 != ((IStrategoAppl)arg151).getConstructor())
                break Fail196;
              g_171 = arg151.getSubterm(0);
              term = g_171;
            }
            else
            { 
              break Fail196;
            }
          }
          d_42 = term;
          if(true)
            break Success147;
        }
        term = term189;
        IStrategoTerm g_42 = null;
        g_42 = term;
        term = report_with_failure_0_1.instance.invoke(context, g_42, cool.const57);
        if(term == null)
          break Fail195;
      }
      term = e_42;
      term = gen_class_head_0_1.instance.invoke(context, term, a_42);
      if(term == null)
        break Fail195;
      h_42 = term;
      term = gen_coordinator_body_0_1.instance.invoke(context, c_42, d_42);
      if(term == null)
        break Fail195;
      term = termFactory.makeAppl(transform._consClassDec_2, new IStrategoTerm[]{h_42, term});
      term = add__externals_0_1.instance.invoke(context, term, d_42);
      if(term == null)
        break Fail195;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}