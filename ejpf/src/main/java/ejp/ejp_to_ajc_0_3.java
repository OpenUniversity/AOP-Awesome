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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm ref_f_78, IStrategoTerm g_78, IStrategoTerm h_78)
  { 
    ITermFactory termFactory = context.getFactory();
    TermReference f_78 = new TermReference(ref_f_78);
    context.push("ejp_to_ajc_0_3");
    Fail88:
    { 
      IStrategoTerm term45 = term;
      Success45:
      { 
        Fail89:
        { 
          IStrategoTerm o_38 = null;
          IStrategoTerm p_38 = null;
          IStrategoTerm q_38 = null;
          IStrategoTerm r_38 = null;
          IStrategoTerm s_38 = null;
          IStrategoTerm t_38 = null;
          IStrategoTerm u_38 = null;
          if(term.getTermType() != IStrategoTerm.APPL || transform._consExplicitJoinPointPattern_1 != ((IStrategoAppl)term).getConstructor())
            break Fail89;
          IStrategoTerm arg81 = term.getSubterm(0);
          if(arg81.getTermType() != IStrategoTerm.APPL || transform._consMethodPattern_6 != ((IStrategoAppl)arg81).getConstructor())
            break Fail89;
          IStrategoTerm arg82 = arg81.getSubterm(0);
          if(arg82.getTermType() != IStrategoTerm.APPL || transform._consAnnoPattern_1 != ((IStrategoAppl)arg82).getConstructor())
            break Fail89;
          o_38 = arg82.getSubterm(0);
          IStrategoTerm arg83 = arg81.getSubterm(1);
          if(arg83.getTermType() != IStrategoTerm.APPL || transform._consModPattern_1 != ((IStrategoAppl)arg83).getConstructor())
            break Fail89;
          p_38 = arg83.getSubterm(0);
          q_38 = arg81.getSubterm(2);
          r_38 = arg81.getSubterm(3);
          s_38 = arg81.getSubterm(4);
          t_38 = arg81.getSubterm(5);
          term = termFactory.makeTuple(o_38, ejp.constCons6);
          term = conc_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail89;
          u_38 = term;
          term = termFactory.makeTuple(p_38, ejp.constCons7);
          term = conc_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail89;
          term = termFactory.makeAppl(transform._consMethodPattern_6, new IStrategoTerm[]{termFactory.makeAppl(transform._consAnnoPattern_1, new IStrategoTerm[]{u_38}), termFactory.makeAppl(transform._consModPattern_1, new IStrategoTerm[]{term}), q_38, r_38, s_38, t_38});
          if(true)
            break Success45;
        }
        term = term45;
        IStrategoTerm term46 = term;
        Success46:
        { 
          Fail90:
          { 
            IStrategoTerm f_38 = null;
            IStrategoTerm g_38 = null;
            IStrategoTerm h_38 = null;
            h_38 = term;
            f_38 = term;
            term = or_2_0.instance.invoke(context, h_38, lifted59.instance, lifted60.instance);
            if(term == null)
              break Fail90;
            term = f_38;
            if(term.getTermType() != IStrategoTerm.APPL || transform._consExplicitJoinPointPattern_1 != ((IStrategoAppl)term).getConstructor())
              break Fail90;
            g_38 = term.getSubterm(0);
            term = gen__ejp__name_0_0.instance.invoke(context, g_38);
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
              IStrategoTerm s_37 = null;
              IStrategoTerm t_37 = null;
              IStrategoTerm u_37 = null;
              IStrategoTerm v_37 = null;
              IStrategoTerm w_37 = null;
              IStrategoTerm x_37 = null;
              IStrategoTerm y_37 = null;
              if(term.getTermType() != IStrategoTerm.APPL || transform._consNotExplicitJoinPointPattern_1 != ((IStrategoAppl)term).getConstructor())
                break Fail91;
              IStrategoTerm arg89 = term.getSubterm(0);
              if(arg89.getTermType() != IStrategoTerm.APPL || transform._consMethodPattern_6 != ((IStrategoAppl)arg89).getConstructor())
                break Fail91;
              IStrategoTerm arg90 = arg89.getSubterm(0);
              if(arg90.getTermType() != IStrategoTerm.APPL || transform._consAnnoPattern_1 != ((IStrategoAppl)arg90).getConstructor())
                break Fail91;
              s_37 = arg90.getSubterm(0);
              IStrategoTerm arg91 = arg89.getSubterm(1);
              if(arg91.getTermType() != IStrategoTerm.APPL || transform._consModPattern_1 != ((IStrategoAppl)arg91).getConstructor())
                break Fail91;
              t_37 = arg91.getSubterm(0);
              u_37 = arg89.getSubterm(2);
              v_37 = arg89.getSubterm(3);
              w_37 = arg89.getSubterm(4);
              x_37 = arg89.getSubterm(5);
              term = termFactory.makeTuple(s_37, ejp.constCons8);
              term = conc_0_0.instance.invoke(context, term);
              if(term == null)
                break Fail91;
              y_37 = term;
              term = termFactory.makeTuple(t_37, ejp.constCons7);
              term = conc_0_0.instance.invoke(context, term);
              if(term == null)
                break Fail91;
              term = termFactory.makeAppl(transform._consMethodPattern_6, new IStrategoTerm[]{termFactory.makeAppl(transform._consAnnoPattern_1, new IStrategoTerm[]{y_37}), termFactory.makeAppl(transform._consModPattern_1, new IStrategoTerm[]{term}), u_37, v_37, w_37, x_37});
              if(true)
                break Success47;
            }
            term = term47;
            IStrategoTerm term48 = term;
            Success48:
            { 
              Fail92:
              { 
                IStrategoTerm j_37 = null;
                IStrategoTerm k_37 = null;
                IStrategoTerm l_37 = null;
                l_37 = term;
                j_37 = term;
                term = or_2_0.instance.invoke(context, l_37, lifted61.instance, lifted62.instance);
                if(term == null)
                  break Fail92;
                term = j_37;
                if(term.getTermType() != IStrategoTerm.APPL || transform._consNotExplicitJoinPointPattern_1 != ((IStrategoAppl)term).getConstructor())
                  break Fail92;
                k_37 = term.getSubterm(0);
                term = gen__ejp__name_0_0.instance.invoke(context, k_37);
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
                  IStrategoTerm w_36 = null;
                  IStrategoTerm x_36 = null;
                  IStrategoTerm y_36 = null;
                  IStrategoTerm z_36 = null;
                  IStrategoTerm a_37 = null;
                  IStrategoTerm b_37 = null;
                  IStrategoTerm c_37 = null;
                  if(term.getTermType() != IStrategoTerm.APPL || transform._consExplicitJoinPointScopePattern_1 != ((IStrategoAppl)term).getConstructor())
                    break Fail93;
                  IStrategoTerm arg97 = term.getSubterm(0);
                  if(arg97.getTermType() != IStrategoTerm.APPL || transform._consMethodPattern_6 != ((IStrategoAppl)arg97).getConstructor())
                    break Fail93;
                  IStrategoTerm arg98 = arg97.getSubterm(0);
                  if(arg98.getTermType() != IStrategoTerm.APPL || transform._consAnnoPattern_1 != ((IStrategoAppl)arg98).getConstructor())
                    break Fail93;
                  w_36 = arg98.getSubterm(0);
                  x_36 = arg97.getSubterm(1);
                  y_36 = arg97.getSubterm(2);
                  z_36 = arg97.getSubterm(3);
                  a_37 = arg97.getSubterm(4);
                  b_37 = arg97.getSubterm(5);
                  term = termFactory.makeTuple(w_36, ejp.constCons9);
                  term = conc_0_0.instance.invoke(context, term);
                  if(term == null)
                    break Fail93;
                  c_37 = term;
                  term = gen__ejpscope__method__name_0_2.instance.invoke(context, z_36, g_78, h_78);
                  if(term == null)
                    break Fail93;
                  term = termFactory.makeAppl(transform._consMethodPattern_6, new IStrategoTerm[]{termFactory.makeAppl(transform._consAnnoPattern_1, new IStrategoTerm[]{c_37}), x_36, y_36, term, a_37, b_37});
                  if(true)
                    break Success49;
                }
                term = term49;
                IStrategoTerm term50 = term;
                Success50:
                { 
                  Fail94:
                  { 
                    IStrategoTerm n_36 = null;
                    IStrategoTerm o_36 = null;
                    IStrategoTerm p_36 = null;
                    p_36 = term;
                    n_36 = term;
                    term = or_2_0.instance.invoke(context, p_36, lifted63.instance, lifted64.instance);
                    if(term == null)
                      break Fail94;
                    term = n_36;
                    if(term.getTermType() != IStrategoTerm.APPL || transform._consExplicitJoinPointScopePattern_1 != ((IStrategoAppl)term).getConstructor())
                      break Fail94;
                    o_36 = term.getSubterm(0);
                    term = gen__ejpscope__method__name_0_2.instance.invoke(context, o_36, g_78, h_78);
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
                      IStrategoTerm a_36 = null;
                      IStrategoTerm b_36 = null;
                      IStrategoTerm c_36 = null;
                      IStrategoTerm d_36 = null;
                      IStrategoTerm e_36 = null;
                      IStrategoTerm f_36 = null;
                      IStrategoTerm g_36 = null;
                      if(term.getTermType() != IStrategoTerm.APPL || transform._consNotExplicitJoinPointScopePattern_1 != ((IStrategoAppl)term).getConstructor())
                        break Fail95;
                      IStrategoTerm arg104 = term.getSubterm(0);
                      if(arg104.getTermType() != IStrategoTerm.APPL || transform._consMethodPattern_6 != ((IStrategoAppl)arg104).getConstructor())
                        break Fail95;
                      IStrategoTerm arg105 = arg104.getSubterm(0);
                      if(arg105.getTermType() != IStrategoTerm.APPL || transform._consAnnoPattern_1 != ((IStrategoAppl)arg105).getConstructor())
                        break Fail95;
                      a_36 = arg105.getSubterm(0);
                      b_36 = arg104.getSubterm(1);
                      c_36 = arg104.getSubterm(2);
                      d_36 = arg104.getSubterm(3);
                      e_36 = arg104.getSubterm(4);
                      f_36 = arg104.getSubterm(5);
                      term = termFactory.makeTuple(a_36, ejp.constCons10);
                      term = conc_0_0.instance.invoke(context, term);
                      if(term == null)
                        break Fail95;
                      g_36 = term;
                      term = gen__ejpscope__method__name_0_2.instance.invoke(context, d_36, g_78, h_78);
                      if(term == null)
                        break Fail95;
                      term = termFactory.makeAppl(transform._consMethodPattern_6, new IStrategoTerm[]{termFactory.makeAppl(transform._consAnnoPattern_1, new IStrategoTerm[]{g_36}), b_36, c_36, term, e_36, f_36});
                      if(true)
                        break Success51;
                    }
                    term = term51;
                    IStrategoTerm term52 = term;
                    Success52:
                    { 
                      Fail96:
                      { 
                        IStrategoTerm r_35 = null;
                        IStrategoTerm s_35 = null;
                        IStrategoTerm t_35 = null;
                        t_35 = term;
                        r_35 = term;
                        term = or_2_0.instance.invoke(context, t_35, lifted65.instance, lifted66.instance);
                        if(term == null)
                          break Fail96;
                        term = r_35;
                        if(term.getTermType() != IStrategoTerm.APPL || transform._consNotExplicitJoinPointScopePattern_1 != ((IStrategoAppl)term).getConstructor())
                          break Fail96;
                        s_35 = term.getSubterm(0);
                        term = gen__ejpscope__method__name_0_2.instance.invoke(context, s_35, g_78, h_78);
                        if(term == null)
                          break Fail96;
                        term = termFactory.makeAppl(transform._consMethodPattern_6, new IStrategoTerm[]{ejp.constAnnoPattern3, ejp.constModPattern0, ejp.constRefTypePattern0, term, ejp.constCons2, ejp.constNone0});
                        if(true)
                          break Success52;
                      }
                      term = term52;
                      ejp_to_ajc_0_3_fragment_0 ejp_to_ajc_0_3_fragment_00 = new ejp_to_ajc_0_3_fragment_0();
                      ejp_to_ajc_0_3_fragment_00.f_78 = f_78;
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