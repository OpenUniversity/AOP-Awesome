package ejp;

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

@SuppressWarnings("all") public class ejp_to_ajc_0_3 extends Strategy 
{ 
  public static ejp_to_ajc_0_3 instance = new ejp_to_ajc_0_3();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm ref_t_77, IStrategoTerm u_77, IStrategoTerm v_77)
  { 
    ITermFactory termFactory = context.getFactory();
    TermReference t_77 = new TermReference(ref_t_77);
    context.push("ejp_to_ajc_0_3");
    Fail88:
    { 
      IStrategoTerm term45 = term;
      Success45:
      { 
        Fail89:
        { 
          IStrategoTerm e_38 = null;
          IStrategoTerm f_38 = null;
          IStrategoTerm g_38 = null;
          IStrategoTerm h_38 = null;
          IStrategoTerm i_38 = null;
          IStrategoTerm j_38 = null;
          IStrategoTerm k_38 = null;
          if(term.getTermType() != IStrategoTerm.APPL || transform._consExplicitJoinPointPattern_1 != ((IStrategoAppl)term).getConstructor())
            break Fail89;
          IStrategoTerm arg81 = term.getSubterm(0);
          if(arg81.getTermType() != IStrategoTerm.APPL || transform._consMethodPattern_6 != ((IStrategoAppl)arg81).getConstructor())
            break Fail89;
          IStrategoTerm arg82 = arg81.getSubterm(0);
          if(arg82.getTermType() != IStrategoTerm.APPL || transform._consAnnoPattern_1 != ((IStrategoAppl)arg82).getConstructor())
            break Fail89;
          e_38 = arg82.getSubterm(0);
          IStrategoTerm arg83 = arg81.getSubterm(1);
          if(arg83.getTermType() != IStrategoTerm.APPL || transform._consModPattern_1 != ((IStrategoAppl)arg83).getConstructor())
            break Fail89;
          f_38 = arg83.getSubterm(0);
          g_38 = arg81.getSubterm(2);
          h_38 = arg81.getSubterm(3);
          i_38 = arg81.getSubterm(4);
          j_38 = arg81.getSubterm(5);
          term = termFactory.makeTuple(e_38, ejp.constCons6);
          term = conc_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail89;
          k_38 = term;
          term = termFactory.makeTuple(f_38, ejp.constCons7);
          term = conc_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail89;
          term = termFactory.makeAppl(transform._consMethodPattern_6, new IStrategoTerm[]{termFactory.makeAppl(transform._consAnnoPattern_1, new IStrategoTerm[]{k_38}), termFactory.makeAppl(transform._consModPattern_1, new IStrategoTerm[]{term}), g_38, h_38, i_38, j_38});
          if(true)
            break Success45;
        }
        term = term45;
        IStrategoTerm term46 = term;
        Success46:
        { 
          Fail90:
          { 
            IStrategoTerm v_37 = null;
            IStrategoTerm w_37 = null;
            IStrategoTerm x_37 = null;
            x_37 = term;
            v_37 = term;
            term = or_2_0.instance.invoke(context, x_37, lifted59.instance, lifted60.instance);
            if(term == null)
              break Fail90;
            term = v_37;
            if(term.getTermType() != IStrategoTerm.APPL || transform._consExplicitJoinPointPattern_1 != ((IStrategoAppl)term).getConstructor())
              break Fail90;
            w_37 = term.getSubterm(0);
            term = gen__ejp__name_0_0.instance.invoke(context, w_37);
            if(term == null)
              break Fail90;
            term = termFactory.makeAppl(transform._consMethodPattern_6, new IStrategoTerm[]{ejp.constAnnoPattern0, ejp.constModPattern0, ejp.constRefTypePattern0, term, ejp.constCons2, ejp.constNone0});
            if(true)
              break Success46;
          }
          term = term46;
          IStrategoTerm term47 = term;
          Success47:
          { 
            Fail91:
            { 
              IStrategoTerm i_37 = null;
              IStrategoTerm j_37 = null;
              IStrategoTerm k_37 = null;
              IStrategoTerm l_37 = null;
              IStrategoTerm m_37 = null;
              IStrategoTerm n_37 = null;
              IStrategoTerm o_37 = null;
              if(term.getTermType() != IStrategoTerm.APPL || transform._consNotExplicitJoinPointPattern_1 != ((IStrategoAppl)term).getConstructor())
                break Fail91;
              IStrategoTerm arg89 = term.getSubterm(0);
              if(arg89.getTermType() != IStrategoTerm.APPL || transform._consMethodPattern_6 != ((IStrategoAppl)arg89).getConstructor())
                break Fail91;
              IStrategoTerm arg90 = arg89.getSubterm(0);
              if(arg90.getTermType() != IStrategoTerm.APPL || transform._consAnnoPattern_1 != ((IStrategoAppl)arg90).getConstructor())
                break Fail91;
              i_37 = arg90.getSubterm(0);
              IStrategoTerm arg91 = arg89.getSubterm(1);
              if(arg91.getTermType() != IStrategoTerm.APPL || transform._consModPattern_1 != ((IStrategoAppl)arg91).getConstructor())
                break Fail91;
              j_37 = arg91.getSubterm(0);
              k_37 = arg89.getSubterm(2);
              l_37 = arg89.getSubterm(3);
              m_37 = arg89.getSubterm(4);
              n_37 = arg89.getSubterm(5);
              term = termFactory.makeTuple(i_37, ejp.constCons8);
              term = conc_0_0.instance.invoke(context, term);
              if(term == null)
                break Fail91;
              o_37 = term;
              term = termFactory.makeTuple(j_37, ejp.constCons7);
              term = conc_0_0.instance.invoke(context, term);
              if(term == null)
                break Fail91;
              term = termFactory.makeAppl(transform._consMethodPattern_6, new IStrategoTerm[]{termFactory.makeAppl(transform._consAnnoPattern_1, new IStrategoTerm[]{o_37}), termFactory.makeAppl(transform._consModPattern_1, new IStrategoTerm[]{term}), k_37, l_37, m_37, n_37});
              if(true)
                break Success47;
            }
            term = term47;
            IStrategoTerm term48 = term;
            Success48:
            { 
              Fail92:
              { 
                IStrategoTerm z_36 = null;
                IStrategoTerm a_37 = null;
                IStrategoTerm b_37 = null;
                b_37 = term;
                z_36 = term;
                term = or_2_0.instance.invoke(context, b_37, lifted61.instance, lifted62.instance);
                if(term == null)
                  break Fail92;
                term = z_36;
                if(term.getTermType() != IStrategoTerm.APPL || transform._consNotExplicitJoinPointPattern_1 != ((IStrategoAppl)term).getConstructor())
                  break Fail92;
                a_37 = term.getSubterm(0);
                term = gen__ejp__name_0_0.instance.invoke(context, a_37);
                if(term == null)
                  break Fail92;
                term = termFactory.makeAppl(transform._consMethodPattern_6, new IStrategoTerm[]{ejp.constAnnoPattern1, ejp.constModPattern0, ejp.constRefTypePattern0, term, ejp.constCons2, ejp.constNone0});
                if(true)
                  break Success48;
              }
              term = term48;
              IStrategoTerm term49 = term;
              Success49:
              { 
                Fail93:
                { 
                  IStrategoTerm m_36 = null;
                  IStrategoTerm n_36 = null;
                  IStrategoTerm o_36 = null;
                  IStrategoTerm p_36 = null;
                  IStrategoTerm q_36 = null;
                  IStrategoTerm r_36 = null;
                  IStrategoTerm s_36 = null;
                  if(term.getTermType() != IStrategoTerm.APPL || transform._consExplicitJoinPointScopePattern_1 != ((IStrategoAppl)term).getConstructor())
                    break Fail93;
                  IStrategoTerm arg97 = term.getSubterm(0);
                  if(arg97.getTermType() != IStrategoTerm.APPL || transform._consMethodPattern_6 != ((IStrategoAppl)arg97).getConstructor())
                    break Fail93;
                  IStrategoTerm arg98 = arg97.getSubterm(0);
                  if(arg98.getTermType() != IStrategoTerm.APPL || transform._consAnnoPattern_1 != ((IStrategoAppl)arg98).getConstructor())
                    break Fail93;
                  m_36 = arg98.getSubterm(0);
                  n_36 = arg97.getSubterm(1);
                  o_36 = arg97.getSubterm(2);
                  p_36 = arg97.getSubterm(3);
                  q_36 = arg97.getSubterm(4);
                  r_36 = arg97.getSubterm(5);
                  term = termFactory.makeTuple(m_36, ejp.constCons9);
                  term = conc_0_0.instance.invoke(context, term);
                  if(term == null)
                    break Fail93;
                  s_36 = term;
                  term = gen__ejpscope__method__name_0_2.instance.invoke(context, p_36, u_77, v_77);
                  if(term == null)
                    break Fail93;
                  term = termFactory.makeAppl(transform._consMethodPattern_6, new IStrategoTerm[]{termFactory.makeAppl(transform._consAnnoPattern_1, new IStrategoTerm[]{s_36}), n_36, o_36, term, q_36, r_36});
                  if(true)
                    break Success49;
                }
                term = term49;
                IStrategoTerm term50 = term;
                Success50:
                { 
                  Fail94:
                  { 
                    IStrategoTerm d_36 = null;
                    IStrategoTerm e_36 = null;
                    IStrategoTerm f_36 = null;
                    f_36 = term;
                    d_36 = term;
                    term = or_2_0.instance.invoke(context, f_36, lifted63.instance, lifted64.instance);
                    if(term == null)
                      break Fail94;
                    term = d_36;
                    if(term.getTermType() != IStrategoTerm.APPL || transform._consExplicitJoinPointScopePattern_1 != ((IStrategoAppl)term).getConstructor())
                      break Fail94;
                    e_36 = term.getSubterm(0);
                    term = gen__ejpscope__method__name_0_2.instance.invoke(context, e_36, u_77, v_77);
                    if(term == null)
                      break Fail94;
                    term = termFactory.makeAppl(transform._consMethodPattern_6, new IStrategoTerm[]{ejp.constAnnoPattern2, ejp.constModPattern0, ejp.constRefTypePattern0, term, ejp.constCons2, ejp.constNone0});
                    if(true)
                      break Success50;
                  }
                  term = term50;
                  IStrategoTerm term51 = term;
                  Success51:
                  { 
                    Fail95:
                    { 
                      IStrategoTerm q_35 = null;
                      IStrategoTerm r_35 = null;
                      IStrategoTerm s_35 = null;
                      IStrategoTerm t_35 = null;
                      IStrategoTerm u_35 = null;
                      IStrategoTerm v_35 = null;
                      IStrategoTerm w_35 = null;
                      if(term.getTermType() != IStrategoTerm.APPL || transform._consNotExplicitJoinPointScopePattern_1 != ((IStrategoAppl)term).getConstructor())
                        break Fail95;
                      IStrategoTerm arg104 = term.getSubterm(0);
                      if(arg104.getTermType() != IStrategoTerm.APPL || transform._consMethodPattern_6 != ((IStrategoAppl)arg104).getConstructor())
                        break Fail95;
                      IStrategoTerm arg105 = arg104.getSubterm(0);
                      if(arg105.getTermType() != IStrategoTerm.APPL || transform._consAnnoPattern_1 != ((IStrategoAppl)arg105).getConstructor())
                        break Fail95;
                      q_35 = arg105.getSubterm(0);
                      r_35 = arg104.getSubterm(1);
                      s_35 = arg104.getSubterm(2);
                      t_35 = arg104.getSubterm(3);
                      u_35 = arg104.getSubterm(4);
                      v_35 = arg104.getSubterm(5);
                      term = termFactory.makeTuple(q_35, ejp.constCons10);
                      term = conc_0_0.instance.invoke(context, term);
                      if(term == null)
                        break Fail95;
                      w_35 = term;
                      term = gen__ejpscope__method__name_0_2.instance.invoke(context, t_35, u_77, v_77);
                      if(term == null)
                        break Fail95;
                      term = termFactory.makeAppl(transform._consMethodPattern_6, new IStrategoTerm[]{termFactory.makeAppl(transform._consAnnoPattern_1, new IStrategoTerm[]{w_35}), r_35, s_35, term, u_35, v_35});
                      if(true)
                        break Success51;
                    }
                    term = term51;
                    IStrategoTerm term52 = term;
                    Success52:
                    { 
                      Fail96:
                      { 
                        IStrategoTerm h_35 = null;
                        IStrategoTerm i_35 = null;
                        IStrategoTerm j_35 = null;
                        j_35 = term;
                        h_35 = term;
                        term = or_2_0.instance.invoke(context, j_35, lifted65.instance, lifted66.instance);
                        if(term == null)
                          break Fail96;
                        term = h_35;
                        if(term.getTermType() != IStrategoTerm.APPL || transform._consNotExplicitJoinPointScopePattern_1 != ((IStrategoAppl)term).getConstructor())
                          break Fail96;
                        i_35 = term.getSubterm(0);
                        term = gen__ejpscope__method__name_0_2.instance.invoke(context, i_35, u_77, v_77);
                        if(term == null)
                          break Fail96;
                        term = termFactory.makeAppl(transform._consMethodPattern_6, new IStrategoTerm[]{ejp.constAnnoPattern3, ejp.constModPattern0, ejp.constRefTypePattern0, term, ejp.constCons2, ejp.constNone0});
                        if(true)
                          break Success52;
                      }
                      term = term52;
                      ejp_to_ajc_0_3_fragment_0 ejp_to_ajc_0_3_fragment_00 = new ejp_to_ajc_0_3_fragment_0();
                      ejp_to_ajc_0_3_fragment_00.t_77 = t_77;
                      term = ejp_to_ajc_0_3_fragment_00.invoke(context, term);
                      if(term == null)
                        break Fail88;
                    }
                  }
                }
              }
            }
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