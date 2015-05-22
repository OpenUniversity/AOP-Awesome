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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm d_28, IStrategoTerm e_28, IStrategoTerm f_28, IStrategoTerm g_28)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("create_ref_method_0_4");
    Fail111:
    { 
      IStrategoTerm h_28 = null;
      IStrategoTerm i_28 = null;
      IStrategoTerm j_28 = null;
      IStrategoTerm k_28 = null;
      k_28 = term;
      j_28 = f_28;
      term = k_28;
      IStrategoTerm term131 = term;
      Success89:
      { 
        Fail112:
        { 
          IStrategoTerm l_28 = null;
          l_28 = term;
          term = j_28;
          if(term.getTermType() != IStrategoTerm.APPL || transform._consByte_0 != ((IStrategoAppl)term).getConstructor())
            break Fail112;
          term = l_28;
          { 
            h_28 = cool.constByte0;
            term = cool.constLit0;
            i_28 = cool.constLit0;
            if(true)
              break Success89;
          }
        }
        term = term131;
        IStrategoTerm term132 = term;
        Success90:
        { 
          Fail113:
          { 
            IStrategoTerm m_28 = null;
            m_28 = term;
            term = j_28;
            if(term.getTermType() != IStrategoTerm.APPL || transform._consInt_0 != ((IStrategoAppl)term).getConstructor())
              break Fail113;
            term = m_28;
            { 
              h_28 = cool.constInt0;
              term = cool.constLit0;
              i_28 = cool.constLit0;
              if(true)
                break Success90;
            }
          }
          term = term132;
          IStrategoTerm term133 = term;
          Success91:
          { 
            Fail114:
            { 
              IStrategoTerm n_28 = null;
              n_28 = term;
              term = or_2_0.instance.invoke(context, j_28, lifted78.instance, lifted79.instance);
              if(term == null)
                break Fail114;
              term = n_28;
              { 
                h_28 = cool.constBoolean0;
                term = cool.constLit1;
                i_28 = cool.constLit1;
                if(true)
                  break Success91;
              }
            }
            term = term133;
            IStrategoTerm term134 = term;
            Success92:
            { 
              Fail115:
              { 
                IStrategoTerm o_28 = null;
                o_28 = term;
                term = or_2_0.instance.invoke(context, j_28, lifted80.instance, lifted81.instance);
                if(term == null)
                  break Fail115;
                term = o_28;
                { 
                  h_28 = cool.constFloat0;
                  term = cool.constLit2;
                  i_28 = cool.constLit2;
                  if(true)
                    break Success92;
                }
              }
              term = term134;
              IStrategoTerm term135 = term;
              Success93:
              { 
                Fail116:
                { 
                  IStrategoTerm p_28 = null;
                  p_28 = term;
                  term = j_28;
                  if(term.getTermType() != IStrategoTerm.APPL || transform._consDouble_0 != ((IStrategoAppl)term).getConstructor())
                    break Fail116;
                  term = p_28;
                  { 
                    h_28 = cool.constDouble0;
                    term = cool.constLit2;
                    i_28 = cool.constLit2;
                    if(true)
                      break Success93;
                  }
                }
                term = term135;
                IStrategoTerm term136 = term;
                Success94:
                { 
                  Fail117:
                  { 
                    IStrategoTerm q_28 = null;
                    q_28 = term;
                    term = j_28;
                    if(term.getTermType() != IStrategoTerm.APPL || transform._consLong_0 != ((IStrategoAppl)term).getConstructor())
                      break Fail117;
                    term = q_28;
                    { 
                      h_28 = cool.constLong0;
                      term = cool.constLit0;
                      i_28 = cool.constLit0;
                      if(true)
                        break Success94;
                    }
                  }
                  term = term136;
                  Success95:
                  { 
                    Fail118:
                    { 
                      IStrategoTerm r_28 = null;
                      r_28 = term;
                      term = j_28;
                      if(term.getTermType() != IStrategoTerm.APPL || transform._consDeci_1 != ((IStrategoAppl)term).getConstructor())
                        break Fail118;
                      term = r_28;
                      { 
                        h_28 = cool.constDouble0;
                        term = cool.constLit2;
                        i_28 = cool.constLit2;
                        if(true)
                          break Success95;
                      }
                    }
                    h_28 = cool.constClassOrInterfaceType0;
                    term = cool.constLit3;
                    i_28 = cool.constLit3;
                  }
                }
              }
            }
          }
        }
      }
      term = termFactory.makeAppl(transform._consMethodDec_2, new IStrategoTerm[]{termFactory.makeAppl(transform._consMethodDecHead_6, new IStrategoTerm[]{(IStrategoTerm)termFactory.makeListCons(termFactory.makeAppl(transform._consAnno_2, new IStrategoTerm[]{cool.constTypeName1, (IStrategoTerm)termFactory.makeListCons(termFactory.makeAppl(transform._consElemValPair_2, new IStrategoTerm[]{cool.constId3, termFactory.makeAppl(transform._consLit_1, new IStrategoTerm[]{termFactory.makeAppl(transform._consString_1, new IStrategoTerm[]{(IStrategoTerm)termFactory.makeListCons(termFactory.makeAppl(transform._consChars_1, new IStrategoTerm[]{d_28}), (IStrategoList)cool.constNil0)})})}), (IStrategoList)cool.constNil0)}), (IStrategoList)cool.constCons2), cool.constNone0, h_28, termFactory.makeAppl(transform._consId_1, new IStrategoTerm[]{e_28}), (IStrategoTerm)termFactory.makeListCons(termFactory.makeAppl(transform._consParam_3, new IStrategoTerm[]{cool.constNil0, termFactory.makeAppl(transform._consClassOrInterfaceType_2, new IStrategoTerm[]{termFactory.makeAppl(transform._consTypeName_1, new IStrategoTerm[]{termFactory.makeAppl(transform._consId_1, new IStrategoTerm[]{g_28})}), cool.constNone0}), cool.constId4}), (IStrategoList)cool.constNil0), cool.constNone0}), termFactory.makeAppl(transform._consBlock_1, new IStrategoTerm[]{(IStrategoTerm)termFactory.makeListCons(termFactory.makeAppl(transform._consReturn_1, new IStrategoTerm[]{termFactory.makeAppl(transform._consSome_1, new IStrategoTerm[]{i_28})}), (IStrategoList)cool.constNil0)})});
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}