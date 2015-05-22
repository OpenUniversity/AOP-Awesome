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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm c_43)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("convert_coordinator_declaration_0_1");
    Fail202:
    { 
      IStrategoTerm e_43 = null;
      IStrategoTerm f_43 = null;
      IStrategoTerm g_43 = null;
      IStrategoTerm j_43 = null;
      if(term.getTermType() != IStrategoTerm.APPL || transform._consCoordinatorDec_2 != ((IStrategoAppl)term).getConstructor())
        break Fail202;
      e_43 = term.getSubterm(1);
      g_43 = term;
      IStrategoTerm term189 = term;
      Success147:
      { 
        Fail203:
        { 
          term = c_43;
          IStrategoTerm term190 = term;
          IStrategoConstructor cons7 = term.getTermType() == IStrategoTerm.APPL ? ((IStrategoAppl)term).getConstructor() : null;
          Success148:
          { 
            if(cons7 == transform._consTypeName_2)
            { 
              Fail204:
              { 
                IStrategoTerm n_171 = null;
                IStrategoTerm arg168 = term.getSubterm(1);
                if(arg168.getTermType() != IStrategoTerm.APPL || transform._consId_1 != ((IStrategoAppl)arg168).getConstructor())
                  break Fail204;
                n_171 = arg168.getSubterm(0);
                term = n_171;
                if(true)
                  break Success148;
              }
              term = term190;
            }
            if(cons7 == transform._consTypeName_1)
            { 
              IStrategoTerm o_171 = null;
              IStrategoTerm arg169 = term.getSubterm(0);
              if(arg169.getTermType() != IStrategoTerm.APPL || transform._consId_1 != ((IStrategoAppl)arg169).getConstructor())
                break Fail203;
              o_171 = arg169.getSubterm(0);
              term = o_171;
            }
            else
            { 
              break Fail203;
            }
          }
          f_43 = term;
          if(true)
            break Success147;
        }
        term = term189;
        IStrategoTerm i_43 = null;
        i_43 = term;
        term = report_with_failure_0_1.instance.invoke(context, i_43, cool.const57);
        if(term == null)
          break Fail202;
      }
      term = g_43;
      term = gen_class_head_0_1.instance.invoke(context, term, c_43);
      if(term == null)
        break Fail202;
      j_43 = term;
      term = gen_coordinator_body_0_1.instance.invoke(context, e_43, f_43);
      if(term == null)
        break Fail202;
      term = termFactory.makeAppl(transform._consClassDec_2, new IStrategoTerm[]{j_43, term});
      term = add__externals_0_1.instance.invoke(context, term, f_43);
      if(term == null)
        break Fail202;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}