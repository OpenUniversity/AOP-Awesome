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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm i_43)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("convert_coordinator_declaration_0_1");
    Fail202:
    { 
      IStrategoTerm k_43 = null;
      IStrategoTerm l_43 = null;
      IStrategoTerm m_43 = null;
      IStrategoTerm p_43 = null;
      if(term.getTermType() != IStrategoTerm.APPL || transform._consCoordinatorDec_2 != ((IStrategoAppl)term).getConstructor())
        break Fail202;
      k_43 = term.getSubterm(1);
      m_43 = term;
      IStrategoTerm term189 = term;
      Success147:
      { 
        Fail203:
        { 
          term = i_43;
          IStrategoTerm term190 = term;
          IStrategoConstructor cons7 = term.getTermType() == IStrategoTerm.APPL ? ((IStrategoAppl)term).getConstructor() : null;
          Success148:
          { 
            if(cons7 == transform._consTypeName_2)
            { 
              Fail204:
              { 
                IStrategoTerm b_172 = null;
                IStrategoTerm arg168 = term.getSubterm(1);
                if(arg168.getTermType() != IStrategoTerm.APPL || transform._consId_1 != ((IStrategoAppl)arg168).getConstructor())
                  break Fail204;
                b_172 = arg168.getSubterm(0);
                term = b_172;
                if(true)
                  break Success148;
              }
              term = term190;
            }
            if(cons7 == transform._consTypeName_1)
            { 
              IStrategoTerm c_172 = null;
              IStrategoTerm arg169 = term.getSubterm(0);
              if(arg169.getTermType() != IStrategoTerm.APPL || transform._consId_1 != ((IStrategoAppl)arg169).getConstructor())
                break Fail203;
              c_172 = arg169.getSubterm(0);
              term = c_172;
            }
            else
            { 
              break Fail203;
            }
          }
          l_43 = term;
          if(true)
            break Success147;
        }
        term = term189;
        IStrategoTerm o_43 = null;
        o_43 = term;
        term = report_with_failure_0_1.instance.invoke(context, o_43, cool.const58);
        if(term == null)
          break Fail202;
      }
      term = m_43;
      term = gen_class_head_0_1.instance.invoke(context, term, i_43);
      if(term == null)
        break Fail202;
      p_43 = term;
      term = gen_coordinator_body_0_1.instance.invoke(context, k_43, l_43);
      if(term == null)
        break Fail202;
      term = termFactory.makeAppl(transform._consClassDec_2, new IStrategoTerm[]{p_43, term});
      term = add__externals_0_1.instance.invoke(context, term, l_43);
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