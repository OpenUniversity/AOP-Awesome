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

@SuppressWarnings("all") public class create_ref_method_0_4 extends Strategy 
{ 
  public static create_ref_method_0_4 instance = new create_ref_method_0_4();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm c_44, IStrategoTerm d_44, IStrategoTerm e_44, IStrategoTerm f_44)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("create_ref_method_0_4");
    Fail225:
    { 
      IStrategoTerm g_44 = null;
      IStrategoTerm h_44 = null;
      IStrategoTerm i_44 = null;
      IStrategoTerm j_44 = null;
      j_44 = term;
      i_44 = e_44;
      term = j_44;
      IStrategoTerm term237 = term;
      Success192:
      { 
        Fail226:
        { 
          IStrategoTerm k_44 = null;
          k_44 = term;
          term = i_44;
          if(term.getTermType() != IStrategoTerm.APPL || transform._consByte_0 != ((IStrategoAppl)term).getConstructor())
            break Fail226;
          term = k_44;
          { 
            g_44 = cool.constByte0;
            term = cool.constLit0;
            h_44 = cool.constLit0;
            if(true)
              break Success192;
          }
        }
        term = term237;
        IStrategoTerm term238 = term;
        Success193:
        { 
          Fail227:
          { 
            IStrategoTerm l_44 = null;
            l_44 = term;
            term = i_44;
            if(term.getTermType() != IStrategoTerm.APPL || transform._consInt_0 != ((IStrategoAppl)term).getConstructor())
              break Fail227;
            term = l_44;
            { 
              g_44 = cool.constInt0;
              term = cool.constLit0;
              h_44 = cool.constLit0;
              if(true)
                break Success193;
            }
          }
          term = term238;
          IStrategoTerm term239 = term;
          Success194:
          { 
            Fail228:
            { 
              IStrategoTerm m_44 = null;
              m_44 = term;
              term = or_2_0.instance.invoke(context, i_44, lifted82.instance, lifted83.instance);
              if(term == null)
                break Fail228;
              term = m_44;
              { 
                g_44 = cool.constBoolean0;
                term = cool.constLit1;
                h_44 = cool.constLit1;
                if(true)
                  break Success194;
              }
            }
            term = term239;
            IStrategoTerm term240 = term;
            Success195:
            { 
              Fail229:
              { 
                IStrategoTerm n_44 = null;
                n_44 = term;
                term = or_2_0.instance.invoke(context, i_44, lifted84.instance, lifted85.instance);
                if(term == null)
                  break Fail229;
                term = n_44;
                { 
                  g_44 = cool.constFloat0;
                  term = cool.constLit2;
                  h_44 = cool.constLit2;
                  if(true)
                    break Success195;
                }
              }
              term = term240;
              IStrategoTerm term241 = term;
              Success196:
              { 
                Fail230:
                { 
                  IStrategoTerm o_44 = null;
                  o_44 = term;
                  term = i_44;
                  if(term.getTermType() != IStrategoTerm.APPL || transform._consDouble_0 != ((IStrategoAppl)term).getConstructor())
                    break Fail230;
                  term = o_44;
                  { 
                    g_44 = cool.constDouble0;
                    term = cool.constLit2;
                    h_44 = cool.constLit2;
                    if(true)
                      break Success196;
                  }
                }
                term = term241;
                IStrategoTerm term242 = term;
                Success197:
                { 
                  Fail231:
                  { 
                    IStrategoTerm p_44 = null;
                    p_44 = term;
                    term = i_44;
                    if(term.getTermType() != IStrategoTerm.APPL || transform._consLong_0 != ((IStrategoAppl)term).getConstructor())
                      break Fail231;
                    term = p_44;
                    { 
                      g_44 = cool.constLong0;
                      term = cool.constLit0;
                      h_44 = cool.constLit0;
                      if(true)
                        break Success197;
                    }
                  }
                  term = term242;
                  Success198:
                  { 
                    Fail232:
                    { 
                      IStrategoTerm q_44 = null;
                      q_44 = term;
                      term = i_44;
                      if(term.getTermType() != IStrategoTerm.APPL || transform._consDeci_1 != ((IStrategoAppl)term).getConstructor())
                        break Fail232;
                      term = q_44;
                      { 
                        g_44 = cool.constDouble0;
                        term = cool.constLit2;
                        h_44 = cool.constLit2;
                        if(true)
                          break Success198;
                      }
                    }
                    g_44 = cool.constClassOrInterfaceType0;
                    term = cool.constLit3;
                    h_44 = cool.constLit3;
                  }
                }
              }
            }
          }
        }
      }
      term = termFactory.makeAppl(transform._consMethodDec_2, new IStrategoTerm[]{termFactory.makeAppl(transform._consMethodDecHead_6, new IStrategoTerm[]{(IStrategoTerm)termFactory.makeListCons(termFactory.makeAppl(transform._consAnno_2, new IStrategoTerm[]{cool.constTypeName1, (IStrategoTerm)termFactory.makeListCons(termFactory.makeAppl(transform._consElemValPair_2, new IStrategoTerm[]{cool.constId3, termFactory.makeAppl(transform._consLit_1, new IStrategoTerm[]{termFactory.makeAppl(transform._consString_1, new IStrategoTerm[]{(IStrategoTerm)termFactory.makeListCons(termFactory.makeAppl(transform._consChars_1, new IStrategoTerm[]{c_44}), (IStrategoList)cool.constNil0)})})}), (IStrategoList)cool.constNil0)}), (IStrategoList)cool.constCons20), cool.constNone0, g_44, termFactory.makeAppl(transform._consId_1, new IStrategoTerm[]{d_44}), (IStrategoTerm)termFactory.makeListCons(termFactory.makeAppl(transform._consParam_3, new IStrategoTerm[]{cool.constNil0, termFactory.makeAppl(transform._consClassOrInterfaceType_2, new IStrategoTerm[]{termFactory.makeAppl(transform._consTypeName_1, new IStrategoTerm[]{termFactory.makeAppl(transform._consId_1, new IStrategoTerm[]{f_44})}), cool.constNone0}), cool.constId4}), (IStrategoList)cool.constNil0), cool.constNone0}), termFactory.makeAppl(transform._consBlock_1, new IStrategoTerm[]{(IStrategoTerm)termFactory.makeListCons(termFactory.makeAppl(transform._consReturn_1, new IStrategoTerm[]{termFactory.makeAppl(transform._consSome_1, new IStrategoTerm[]{h_44})}), (IStrategoList)cool.constNil0)})});
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}