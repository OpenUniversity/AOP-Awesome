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

@SuppressWarnings("all") public class make_unlock_method_0_3 extends Strategy 
{ 
  public static make_unlock_method_0_3 instance = new make_unlock_method_0_3();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm a_47, IStrategoTerm b_47, IStrategoTerm c_47)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("make_unlock_method_0_3");
    Fail208:
    { 
      IStrategoTerm d_47 = null;
      IStrategoTerm e_47 = null;
      IStrategoTerm f_47 = null;
      IStrategoTerm g_47 = null;
      IStrategoTerm h_47 = null;
      IStrategoTerm i_47 = null;
      IStrategoTerm m_47 = null;
      IStrategoTerm x_47 = null;
      IStrategoTerm y_47 = null;
      if(term.getTermType() != IStrategoTerm.APPL || transform._consMethodSignature_2 != ((IStrategoAppl)term).getConstructor())
        break Fail208;
      IStrategoTerm arg180 = term.getSubterm(0);
      if(arg180.getTermType() != IStrategoTerm.APPL || transform._consId_1 != ((IStrategoAppl)arg180).getConstructor())
        break Fail208;
      d_47 = arg180.getSubterm(0);
      e_47 = term.getSubterm(1);
      m_47 = term;
      IStrategoTerm term192 = term;
      Success150:
      { 
        Fail209:
        { 
          g_47 = term;
          term = map_1_0.instance.invoke(context, e_47, pp_type_0_0.instance);
          if(term == null)
            break Fail209;
          term = map_1_0.instance.invoke(context, term, lifted129.instance);
          if(term == null)
            break Fail209;
          term = (IStrategoTerm)termFactory.makeListCons(termFactory.makeAppl(transform._consAnno_2, new IStrategoTerm[]{cool.constTypeName8, (IStrategoTerm)termFactory.makeListCons(termFactory.makeAppl(transform._consElemValPair_2, new IStrategoTerm[]{cool.constId18, termFactory.makeAppl(transform._consLit_1, new IStrategoTerm[]{termFactory.makeAppl(transform._consString_1, new IStrategoTerm[]{(IStrategoTerm)termFactory.makeListCons(termFactory.makeAppl(transform._consChars_1, new IStrategoTerm[]{d_47}), (IStrategoList)cool.constNil0)})})}), termFactory.makeListCons(cool.constElemValPair0, termFactory.makeListCons(termFactory.makeAppl(transform._consElemValPair_2, new IStrategoTerm[]{cool.constId17, termFactory.makeAppl(transform._consElemValArrayInit_1, new IStrategoTerm[]{term})}), (IStrategoList)cool.constNil0)))}), (IStrategoList)cool.constCons19);
          f_47 = term;
          Success151:
          { 
            Fail210:
            { 
              IStrategoTerm k_47 = null;
              k_47 = term;
              term = hashtable_keys_0_0.instance.invoke(context, b_47);
              if(term == null)
                break Fail210;
              term = termFactory.makeTuple(g_47, term);
              term = elem_0_0.instance.invoke(context, term);
              if(term == null)
                break Fail210;
              term = k_47;
              { 
                term = hashtable_get_0_1.instance.invoke(context, b_47, g_47);
                if(term == null)
                  break Fail209;
                term = termFactory.makeAppl(transform._consExprStm_1, new IStrategoTerm[]{termFactory.makeAppl(transform._consInvoke_2, new IStrategoTerm[]{termFactory.makeAppl(transform._consMethod_1, new IStrategoTerm[]{termFactory.makeAppl(transform._consMethodName_1, new IStrategoTerm[]{termFactory.makeAppl(transform._consId_1, new IStrategoTerm[]{term})})}), cool.constCons1})});
                h_47 = term;
                if(true)
                  break Success151;
              }
            }
            term = cool.constNone0;
            h_47 = cool.constNone0;
          }
          term = gen_method_state_name_0_1.instance.invoke(context, g_47, c_47);
          if(term == null)
            break Fail209;
          term = termFactory.makeTuple((IStrategoTerm)termFactory.makeListCons(termFactory.makeAppl(transform._consExprStm_1, new IStrategoTerm[]{termFactory.makeAppl(transform._consInvoke_2, new IStrategoTerm[]{termFactory.makeAppl(transform._consMethod_1, new IStrategoTerm[]{termFactory.makeAppl(transform._consMethodName_2, new IStrategoTerm[]{termFactory.makeAppl(transform._consAmbName_1, new IStrategoTerm[]{termFactory.makeAppl(transform._consId_1, new IStrategoTerm[]{term})}), cool.constId31})}), cool.constCons7})}), (IStrategoList)cool.constNil0), (IStrategoTerm)termFactory.makeListCons(h_47, (IStrategoList)cool.constNil0), cool.constCons20);
          term = conc_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail209;
          i_47 = term;
          if(true)
            break Success150;
        }
        term = term192;
        IStrategoTerm w_47 = null;
        w_47 = term;
        term = report_with_failure_0_1.instance.invoke(context, w_47, cool.const62);
        if(term == null)
          break Fail208;
      }
      y_47 = m_47;
      term = (IStrategoTerm)termFactory.makeListCons(cool.const63, termFactory.makeListCons(d_47, (IStrategoList)cool.constNil0));
      term = concat_strings_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail208;
      x_47 = term;
      term = y_47;
      if(f_47 == null || i_47 == null)
        break Fail208;
      term = termFactory.makeAppl(transform._consMethodDec_2, new IStrategoTerm[]{termFactory.makeAppl(transform._consMethodDecHead_6, new IStrategoTerm[]{f_47, cool.constNone0, cool.constVoid0, termFactory.makeAppl(transform._consId_1, new IStrategoTerm[]{x_47}), (IStrategoTerm)termFactory.makeListCons(termFactory.makeAppl(transform._consParam_3, new IStrategoTerm[]{cool.constNil0, termFactory.makeAppl(transform._consTypeName_1, new IStrategoTerm[]{termFactory.makeAppl(transform._consId_1, new IStrategoTerm[]{a_47})}), cool.constId0}), (IStrategoList)cool.constNil0), cool.constNone0}), termFactory.makeAppl(transform._consBlock_1, new IStrategoTerm[]{i_47})});
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}