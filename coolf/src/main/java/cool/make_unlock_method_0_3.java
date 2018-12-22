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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm g_46, IStrategoTerm h_46, IStrategoTerm i_46)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("make_unlock_method_0_3");
    Fail202:
    { 
      IStrategoTerm j_46 = null;
      IStrategoTerm k_46 = null;
      IStrategoTerm l_46 = null;
      IStrategoTerm m_46 = null;
      IStrategoTerm n_46 = null;
      IStrategoTerm o_46 = null;
      IStrategoTerm s_46 = null;
      IStrategoTerm d_47 = null;
      IStrategoTerm e_47 = null;
      if(term.getTermType() != IStrategoTerm.APPL || transform._consMethodSignature_2 != ((IStrategoAppl)term).getConstructor())
        break Fail202;
      IStrategoTerm arg162 = term.getSubterm(0);
      if(arg162.getTermType() != IStrategoTerm.APPL || transform._consId_1 != ((IStrategoAppl)arg162).getConstructor())
        break Fail202;
      j_46 = arg162.getSubterm(0);
      k_46 = term.getSubterm(1);
      s_46 = term;
      IStrategoTerm term193 = term;
      Success151:
      { 
        Fail203:
        { 
          m_46 = term;
          term = map_1_0.instance.invoke(context, k_46, pp_type_0_0.instance);
          if(term == null)
            break Fail203;
          term = map_1_0.instance.invoke(context, term, lifted129.instance);
          if(term == null)
            break Fail203;
          term = (IStrategoTerm)termFactory.makeListCons(termFactory.makeAppl(transform._consAnno_2, new IStrategoTerm[]{cool.constTypeName8, (IStrategoTerm)termFactory.makeListCons(termFactory.makeAppl(transform._consElemValPair_2, new IStrategoTerm[]{cool.constId19, termFactory.makeAppl(transform._consLit_1, new IStrategoTerm[]{termFactory.makeAppl(transform._consString_1, new IStrategoTerm[]{(IStrategoTerm)termFactory.makeListCons(termFactory.makeAppl(transform._consChars_1, new IStrategoTerm[]{j_46}), (IStrategoList)cool.constNil0)})})}), termFactory.makeListCons(cool.constElemValPair0, termFactory.makeListCons(termFactory.makeAppl(transform._consElemValPair_2, new IStrategoTerm[]{cool.constId18, termFactory.makeAppl(transform._consElemValArrayInit_1, new IStrategoTerm[]{term})}), (IStrategoList)cool.constNil0)))}), (IStrategoList)cool.constCons24);
          l_46 = term;
          Success152:
          { 
            Fail204:
            { 
              IStrategoTerm q_46 = null;
              q_46 = term;
              term = hashtable_keys_0_0.instance.invoke(context, h_46);
              if(term == null)
                break Fail204;
              term = termFactory.makeTuple(m_46, term);
              term = elem_0_0.instance.invoke(context, term);
              if(term == null)
                break Fail204;
              term = q_46;
              { 
                term = hashtable_get_0_1.instance.invoke(context, h_46, m_46);
                if(term == null)
                  break Fail203;
                term = termFactory.makeAppl(transform._consExprStm_1, new IStrategoTerm[]{termFactory.makeAppl(transform._consInvoke_2, new IStrategoTerm[]{termFactory.makeAppl(transform._consMethod_1, new IStrategoTerm[]{termFactory.makeAppl(transform._consMethodName_1, new IStrategoTerm[]{termFactory.makeAppl(transform._consId_1, new IStrategoTerm[]{term})})}), cool.constCons1})});
                n_46 = term;
                if(true)
                  break Success152;
              }
            }
            term = cool.constNone0;
            n_46 = cool.constNone0;
          }
          term = gen_method_state_name_0_1.instance.invoke(context, m_46, i_46);
          if(term == null)
            break Fail203;
          term = termFactory.makeTuple((IStrategoTerm)termFactory.makeListCons(termFactory.makeAppl(transform._consExprStm_1, new IStrategoTerm[]{termFactory.makeAppl(transform._consInvoke_2, new IStrategoTerm[]{termFactory.makeAppl(transform._consMethod_1, new IStrategoTerm[]{termFactory.makeAppl(transform._consMethodName_2, new IStrategoTerm[]{termFactory.makeAppl(transform._consAmbName_1, new IStrategoTerm[]{termFactory.makeAppl(transform._consId_1, new IStrategoTerm[]{term})}), cool.constId31})}), cool.constCons7})}), (IStrategoList)cool.constNil0), (IStrategoTerm)termFactory.makeListCons(n_46, (IStrategoList)cool.constNil0), cool.constCons25);
          term = conc_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail203;
          o_46 = term;
          if(true)
            break Success151;
        }
        term = term193;
        IStrategoTerm c_47 = null;
        c_47 = term;
        term = report_with_failure_0_1.instance.invoke(context, c_47, cool.const63);
        if(term == null)
          break Fail202;
      }
      e_47 = s_46;
      term = (IStrategoTerm)termFactory.makeListCons(cool.const64, termFactory.makeListCons(j_46, (IStrategoList)cool.constNil0));
      term = concat_strings_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail202;
      d_47 = term;
      term = e_47;
      if(l_46 == null || o_46 == null)
        break Fail202;
      term = termFactory.makeAppl(transform._consMethodDec_2, new IStrategoTerm[]{termFactory.makeAppl(transform._consMethodDecHead_6, new IStrategoTerm[]{l_46, cool.constNone0, cool.constVoid0, termFactory.makeAppl(transform._consId_1, new IStrategoTerm[]{d_47}), (IStrategoTerm)termFactory.makeListCons(termFactory.makeAppl(transform._consParam_3, new IStrategoTerm[]{cool.constNil0, termFactory.makeAppl(transform._consTypeName_1, new IStrategoTerm[]{termFactory.makeAppl(transform._consId_1, new IStrategoTerm[]{g_46})}), cool.constId0}), (IStrategoList)cool.constNil0), cool.constNone0}), termFactory.makeAppl(transform._consBlock_1, new IStrategoTerm[]{o_46})});
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}