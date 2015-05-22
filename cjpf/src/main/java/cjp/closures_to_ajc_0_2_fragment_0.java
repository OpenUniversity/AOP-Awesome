package cjp;

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

@SuppressWarnings("all") public class closures_to_ajc_0_2_fragment_0 extends Strategy 
{ 
  public static closures_to_ajc_0_2_fragment_0 instance = new closures_to_ajc_0_2_fragment_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("closures_to_ajc_0_2_fragment_0");
    Fail116:
    { 
      IStrategoTerm term108 = term;
      IStrategoConstructor cons8 = term.getTermType() == IStrategoTerm.APPL ? ((IStrategoAppl)term).getConstructor() : null;
      Success105:
      { 
        if(cons8 == transform._consCJPAdvice_4)
        { 
          Fail117:
          { 
            IStrategoTerm h_21 = null;
            IStrategoTerm i_21 = null;
            IStrategoTerm j_21 = null;
            IStrategoTerm k_21 = null;
            IStrategoTerm o_21 = null;
            IStrategoTerm t_21 = null;
            IStrategoTerm p_21 = null;
            IStrategoTerm q_21 = null;
            IStrategoTerm arg35 = term.getSubterm(1);
            if(arg35.getTermType() != IStrategoTerm.APPL || transform._consCJPAfter_2 != ((IStrategoAppl)arg35).getConstructor())
              break Fail117;
            IStrategoTerm arg36 = arg35.getSubterm(0);
            if(arg36.getTermType() != IStrategoTerm.APPL || transform._consId_1 != ((IStrategoAppl)arg36).getConstructor())
              break Fail117;
            h_21 = arg36.getSubterm(0);
            i_21 = arg35.getSubterm(1);
            j_21 = term.getSubterm(2);
            k_21 = term.getSubterm(3);
            term = map_1_0.instance.invoke(context, i_21, lifted8.instance);
            if(term == null)
              break Fail117;
            t_21 = term;
            term = map_1_0.instance.invoke(context, i_21, lifted9.instance);
            if(term == null)
              break Fail117;
            term = termFactory.makeAppl(transform._consAndComp_2, new IStrategoTerm[]{termFactory.makeAppl(transform._consCall_1, new IStrategoTerm[]{termFactory.makeAppl(transform._consMethodPattern_6, new IStrategoTerm[]{cjp.constAnnoPattern0, cjp.constModPattern0, cjp.constRefTypePattern0, termFactory.makeAppl(transform._consMemberName_1, new IStrategoTerm[]{h_21}), t_21, cjp.constNone0})}), termFactory.makeAppl(transform._consArgs_1, new IStrategoTerm[]{term})});
            term = pp_aspectj_string_0_0.instance.invoke(context, term);
            if(term == null)
              break Fail117;
            o_21 = term;
            term = map_1_0.instance.invoke(context, i_21, lifted10.instance);
            if(term == null)
              break Fail117;
            p_21 = term;
            term = gen_synthetic_method_name_0_0.instance.invoke(context, h_21);
            if(term == null)
              break Fail117;
            q_21 = term;
            term = termFactory.makeTuple(i_21, cjp.constCons19);
            term = conc_0_0.instance.invoke(context, term);
            if(term == null)
              break Fail117;
            term = termFactory.makeAppl(transform._consMethodDec_2, new IStrategoTerm[]{termFactory.makeAppl(transform._consMethodDecHead_6, new IStrategoTerm[]{(IStrategoTerm)termFactory.makeListCons(termFactory.makeAppl(transform._consSingleElemAnno_2, new IStrategoTerm[]{cjp.constTypeName3, termFactory.makeAppl(transform._consLit_1, new IStrategoTerm[]{termFactory.makeAppl(transform._consString_1, new IStrategoTerm[]{(IStrategoTerm)termFactory.makeListCons(termFactory.makeAppl(transform._consChars_1, new IStrategoTerm[]{o_21}), (IStrategoList)cjp.constNil0)})})}), termFactory.makeListCons(termFactory.makeAppl(transform._consAnno_2, new IStrategoTerm[]{cjp.constTypeName2, (IStrategoTerm)termFactory.makeListCons(termFactory.makeAppl(transform._consElemValPair_2, new IStrategoTerm[]{cjp.constId5, termFactory.makeAppl(transform._consElemValArrayInit_1, new IStrategoTerm[]{p_21})}), termFactory.makeListCons(termFactory.makeAppl(transform._consElemValPair_2, new IStrategoTerm[]{cjp.constId4, termFactory.makeAppl(transform._consLit_1, new IStrategoTerm[]{termFactory.makeAppl(transform._consString_1, new IStrategoTerm[]{(IStrategoTerm)termFactory.makeListCons(termFactory.makeAppl(transform._consChars_1, new IStrategoTerm[]{h_21}), (IStrategoList)cjp.constNil0)})})}), (IStrategoList)cjp.constNil0))}), (IStrategoList)cjp.constCons20)), cjp.constNone0, cjp.constVoid0, termFactory.makeAppl(transform._consId_1, new IStrategoTerm[]{q_21}), term, j_21}), k_21});
            if(true)
              break Success105;
          }
          term = term108;
        }
        Success106:
        { 
          if(cons8 == transform._consCJPAdvice_4)
          { 
            Fail118:
            { 
              IStrategoTerm g_20 = null;
              IStrategoTerm h_20 = null;
              IStrategoTerm i_20 = null;
              IStrategoTerm j_20 = null;
              IStrategoTerm k_20 = null;
              IStrategoTerm o_20 = null;
              IStrategoTerm p_20 = null;
              IStrategoTerm m_20 = null;
              IStrategoTerm q_20 = null;
              IStrategoTerm arg43 = term.getSubterm(1);
              if(arg43.getTermType() != IStrategoTerm.APPL || transform._consCJPAfterReturning_3 != ((IStrategoAppl)arg43).getConstructor())
                break Fail118;
              IStrategoTerm arg44 = arg43.getSubterm(0);
              if(arg44.getTermType() != IStrategoTerm.APPL || transform._consId_1 != ((IStrategoAppl)arg44).getConstructor())
                break Fail118;
              h_20 = arg44.getSubterm(0);
              g_20 = arg43.getSubterm(1);
              IStrategoTerm arg45 = arg43.getSubterm(2);
              if(arg45.getTermType() != IStrategoTerm.APPL || transform._consSome_1 != ((IStrategoAppl)arg45).getConstructor())
                break Fail118;
              IStrategoTerm arg46 = arg45.getSubterm(0);
              if(arg46.getTermType() != IStrategoTerm.APPL || transform._consCJPSingleParam_1 != ((IStrategoAppl)arg46).getConstructor())
                break Fail118;
              IStrategoTerm arg47 = arg46.getSubterm(0);
              if(arg47.getTermType() != IStrategoTerm.APPL || transform._consSome_1 != ((IStrategoAppl)arg47).getConstructor())
                break Fail118;
              i_20 = arg47.getSubterm(0);
              j_20 = term.getSubterm(2);
              k_20 = term.getSubterm(3);
              term = map_1_0.instance.invoke(context, g_20, lifted11.instance);
              if(term == null)
                break Fail118;
              term = termFactory.makeAppl(transform._consCall_1, new IStrategoTerm[]{termFactory.makeAppl(transform._consMethodPattern_6, new IStrategoTerm[]{cjp.constAnnoPattern0, cjp.constModPattern0, cjp.constRefTypePattern0, termFactory.makeAppl(transform._consMemberName_1, new IStrategoTerm[]{h_20}), term, cjp.constNone0})});
              term = pp_aspectj_string_0_0.instance.invoke(context, term);
              if(term == null)
                break Fail118;
              o_20 = term;
              term = i_20;
              if(term.getTermType() != IStrategoTerm.APPL || transform._consParam_3 != ((IStrategoAppl)term).getConstructor())
                break Fail118;
              m_20 = term.getSubterm(2);
              term = pp_java_string_0_0.instance.invoke(context, m_20);
              if(term == null)
                break Fail118;
              term = termFactory.makeAppl(transform._consLit_1, new IStrategoTerm[]{termFactory.makeAppl(transform._consString_1, new IStrategoTerm[]{(IStrategoTerm)termFactory.makeListCons(termFactory.makeAppl(transform._consChars_1, new IStrategoTerm[]{term}), (IStrategoList)cjp.constNil0)})});
              p_20 = term;
              term = map_1_0.instance.invoke(context, g_20, lifted12.instance);
              if(term == null)
                break Fail118;
              q_20 = term;
              term = gen_synthetic_method_name_0_0.instance.invoke(context, h_20);
              if(term == null)
                break Fail118;
              term = termFactory.makeAppl(transform._consMethodDec_2, new IStrategoTerm[]{termFactory.makeAppl(transform._consMethodDecHead_6, new IStrategoTerm[]{(IStrategoTerm)termFactory.makeListCons(termFactory.makeAppl(transform._consAnno_2, new IStrategoTerm[]{cjp.constTypeName4, (IStrategoTerm)termFactory.makeListCons(termFactory.makeAppl(transform._consElemValPair_2, new IStrategoTerm[]{cjp.constId9, termFactory.makeAppl(transform._consLit_1, new IStrategoTerm[]{termFactory.makeAppl(transform._consString_1, new IStrategoTerm[]{(IStrategoTerm)termFactory.makeListCons(termFactory.makeAppl(transform._consChars_1, new IStrategoTerm[]{o_20}), (IStrategoList)cjp.constNil0)})})}), termFactory.makeListCons(termFactory.makeAppl(transform._consElemValPair_2, new IStrategoTerm[]{cjp.constId8, p_20}), (IStrategoList)cjp.constNil0))}), termFactory.makeListCons(termFactory.makeAppl(transform._consAnno_2, new IStrategoTerm[]{cjp.constTypeName2, (IStrategoTerm)termFactory.makeListCons(termFactory.makeAppl(transform._consElemValPair_2, new IStrategoTerm[]{cjp.constId5, termFactory.makeAppl(transform._consElemValArrayInit_1, new IStrategoTerm[]{q_20})}), termFactory.makeListCons(termFactory.makeAppl(transform._consElemValPair_2, new IStrategoTerm[]{cjp.constId4, termFactory.makeAppl(transform._consLit_1, new IStrategoTerm[]{termFactory.makeAppl(transform._consString_1, new IStrategoTerm[]{(IStrategoTerm)termFactory.makeListCons(termFactory.makeAppl(transform._consChars_1, new IStrategoTerm[]{h_20}), (IStrategoList)cjp.constNil0)})})}), (IStrategoList)cjp.constNil0))}), (IStrategoList)cjp.constCons20)), cjp.constNone0, cjp.constVoid0, termFactory.makeAppl(transform._consId_1, new IStrategoTerm[]{term}), (IStrategoTerm)termFactory.makeListCons(i_20, (IStrategoList)cjp.constNil0), j_20}), k_20});
              if(true)
                break Success106;
            }
            term = term108;
          }
          if(cons8 == transform._consCJPAdvice_4)
          { 
            IStrategoTerm f_19 = null;
            IStrategoTerm g_19 = null;
            IStrategoTerm h_19 = null;
            IStrategoTerm i_19 = null;
            IStrategoTerm j_19 = null;
            IStrategoTerm n_19 = null;
            IStrategoTerm o_19 = null;
            IStrategoTerm l_19 = null;
            IStrategoTerm p_19 = null;
            IStrategoTerm arg54 = term.getSubterm(1);
            if(arg54.getTermType() != IStrategoTerm.APPL || transform._consCJPAfterThrowing_3 != ((IStrategoAppl)arg54).getConstructor())
              break Fail116;
            IStrategoTerm arg55 = arg54.getSubterm(0);
            if(arg55.getTermType() != IStrategoTerm.APPL || transform._consId_1 != ((IStrategoAppl)arg55).getConstructor())
              break Fail116;
            g_19 = arg55.getSubterm(0);
            f_19 = arg54.getSubterm(1);
            IStrategoTerm arg56 = arg54.getSubterm(2);
            if(arg56.getTermType() != IStrategoTerm.APPL || transform._consSome_1 != ((IStrategoAppl)arg56).getConstructor())
              break Fail116;
            IStrategoTerm arg57 = arg56.getSubterm(0);
            if(arg57.getTermType() != IStrategoTerm.APPL || transform._consCJPSingleParam_1 != ((IStrategoAppl)arg57).getConstructor())
              break Fail116;
            IStrategoTerm arg58 = arg57.getSubterm(0);
            if(arg58.getTermType() != IStrategoTerm.APPL || transform._consSome_1 != ((IStrategoAppl)arg58).getConstructor())
              break Fail116;
            h_19 = arg58.getSubterm(0);
            i_19 = term.getSubterm(2);
            j_19 = term.getSubterm(3);
            term = map_1_0.instance.invoke(context, f_19, lifted13.instance);
            if(term == null)
              break Fail116;
            term = termFactory.makeAppl(transform._consCall_1, new IStrategoTerm[]{termFactory.makeAppl(transform._consMethodPattern_6, new IStrategoTerm[]{cjp.constAnnoPattern0, cjp.constModPattern0, cjp.constRefTypePattern0, termFactory.makeAppl(transform._consMemberName_1, new IStrategoTerm[]{g_19}), term, cjp.constNone0})});
            term = pp_aspectj_string_0_0.instance.invoke(context, term);
            if(term == null)
              break Fail116;
            n_19 = term;
            term = h_19;
            if(term.getTermType() != IStrategoTerm.APPL || transform._consParam_3 != ((IStrategoAppl)term).getConstructor())
              break Fail116;
            l_19 = term.getSubterm(2);
            term = pp_java_string_0_0.instance.invoke(context, l_19);
            if(term == null)
              break Fail116;
            term = termFactory.makeAppl(transform._consLit_1, new IStrategoTerm[]{termFactory.makeAppl(transform._consString_1, new IStrategoTerm[]{(IStrategoTerm)termFactory.makeListCons(termFactory.makeAppl(transform._consChars_1, new IStrategoTerm[]{term}), (IStrategoList)cjp.constNil0)})});
            o_19 = term;
            term = map_1_0.instance.invoke(context, f_19, lifted14.instance);
            if(term == null)
              break Fail116;
            p_19 = term;
            term = gen_synthetic_method_name_0_0.instance.invoke(context, g_19);
            if(term == null)
              break Fail116;
            term = termFactory.makeAppl(transform._consMethodDec_2, new IStrategoTerm[]{termFactory.makeAppl(transform._consMethodDecHead_6, new IStrategoTerm[]{(IStrategoTerm)termFactory.makeListCons(termFactory.makeAppl(transform._consAnno_2, new IStrategoTerm[]{cjp.constTypeName5, (IStrategoTerm)termFactory.makeListCons(termFactory.makeAppl(transform._consElemValPair_2, new IStrategoTerm[]{cjp.constId9, termFactory.makeAppl(transform._consLit_1, new IStrategoTerm[]{termFactory.makeAppl(transform._consString_1, new IStrategoTerm[]{(IStrategoTerm)termFactory.makeListCons(termFactory.makeAppl(transform._consChars_1, new IStrategoTerm[]{n_19}), (IStrategoList)cjp.constNil0)})})}), termFactory.makeListCons(termFactory.makeAppl(transform._consElemValPair_2, new IStrategoTerm[]{cjp.constId11, o_19}), (IStrategoList)cjp.constNil0))}), termFactory.makeListCons(termFactory.makeAppl(transform._consAnno_2, new IStrategoTerm[]{cjp.constTypeName2, (IStrategoTerm)termFactory.makeListCons(termFactory.makeAppl(transform._consElemValPair_2, new IStrategoTerm[]{cjp.constId5, termFactory.makeAppl(transform._consElemValArrayInit_1, new IStrategoTerm[]{p_19})}), termFactory.makeListCons(termFactory.makeAppl(transform._consElemValPair_2, new IStrategoTerm[]{cjp.constId4, termFactory.makeAppl(transform._consLit_1, new IStrategoTerm[]{termFactory.makeAppl(transform._consString_1, new IStrategoTerm[]{(IStrategoTerm)termFactory.makeListCons(termFactory.makeAppl(transform._consChars_1, new IStrategoTerm[]{g_19}), (IStrategoList)cjp.constNil0)})})}), (IStrategoList)cjp.constNil0))}), (IStrategoList)cjp.constCons20)), cjp.constNone0, cjp.constVoid0, termFactory.makeAppl(transform._consId_1, new IStrategoTerm[]{term}), (IStrategoTerm)termFactory.makeListCons(h_19, (IStrategoList)cjp.constNil0), i_19}), j_19});
          }
          else
          { 
            break Fail116;
          }
        }
      }
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}