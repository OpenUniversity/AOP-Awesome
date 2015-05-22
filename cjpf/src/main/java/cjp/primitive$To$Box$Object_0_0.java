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

@SuppressWarnings("all") public class primitive$To$Box$Object_0_0 extends Strategy 
{ 
  public static primitive$To$Box$Object_0_0 instance = new primitive$To$Box$Object_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail125:
    { 
      IStrategoTerm e_25 = null;
      IStrategoTerm f_25 = null;
      IStrategoTerm g_25 = null;
      e_25 = term;
      g_25 = term;
      f_25 = e_25;
      term = g_25;
      IStrategoTerm term113 = term;
      Success110:
      { 
        Fail126:
        { 
          IStrategoTerm h_25 = null;
          h_25 = term;
          term = f_25;
          if(term.getTermType() != IStrategoTerm.APPL || transform._consInt_0 != ((IStrategoAppl)term).getConstructor())
            break Fail126;
          term = h_25;
          { 
            term = cjp.constClassOrInterfaceType3;
            if(true)
              break Success110;
          }
        }
        term = term113;
        IStrategoTerm term114 = term;
        Success111:
        { 
          Fail127:
          { 
            IStrategoTerm i_25 = null;
            i_25 = term;
            term = f_25;
            if(term.getTermType() != IStrategoTerm.APPL || transform._consLong_0 != ((IStrategoAppl)term).getConstructor())
              break Fail127;
            term = i_25;
            { 
              term = cjp.constClassOrInterfaceType4;
              if(true)
                break Success111;
            }
          }
          term = term114;
          IStrategoTerm term115 = term;
          Success112:
          { 
            Fail128:
            { 
              IStrategoTerm j_25 = null;
              j_25 = term;
              term = f_25;
              if(term.getTermType() != IStrategoTerm.APPL || transform._consShort_0 != ((IStrategoAppl)term).getConstructor())
                break Fail128;
              term = j_25;
              { 
                term = cjp.constClassOrInterfaceType5;
                if(true)
                  break Success112;
              }
            }
            term = term115;
            IStrategoTerm term116 = term;
            Success113:
            { 
              Fail129:
              { 
                IStrategoTerm k_25 = null;
                k_25 = term;
                term = f_25;
                if(term.getTermType() != IStrategoTerm.APPL || transform._consByte_0 != ((IStrategoAppl)term).getConstructor())
                  break Fail129;
                term = k_25;
                { 
                  term = cjp.constClassOrInterfaceType6;
                  if(true)
                    break Success113;
                }
              }
              term = term116;
              IStrategoTerm term117 = term;
              Success114:
              { 
                Fail130:
                { 
                  IStrategoTerm l_25 = null;
                  l_25 = term;
                  term = f_25;
                  if(term.getTermType() != IStrategoTerm.APPL || transform._consDouble_0 != ((IStrategoAppl)term).getConstructor())
                    break Fail130;
                  term = l_25;
                  { 
                    term = cjp.constClassOrInterfaceType7;
                    if(true)
                      break Success114;
                  }
                }
                term = term117;
                IStrategoTerm term118 = term;
                Success115:
                { 
                  Fail131:
                  { 
                    IStrategoTerm m_25 = null;
                    m_25 = term;
                    term = f_25;
                    if(term.getTermType() != IStrategoTerm.APPL || transform._consFloat_0 != ((IStrategoAppl)term).getConstructor())
                      break Fail131;
                    term = m_25;
                    { 
                      term = cjp.constClassOrInterfaceType8;
                      if(true)
                        break Success115;
                    }
                  }
                  term = term118;
                  Success116:
                  { 
                    Fail132:
                    { 
                      IStrategoTerm n_25 = null;
                      n_25 = term;
                      term = f_25;
                      if(term.getTermType() != IStrategoTerm.APPL || transform._consBoolean_0 != ((IStrategoAppl)term).getConstructor())
                        break Fail132;
                      term = n_25;
                      { 
                        term = cjp.constClassOrInterfaceType9;
                        if(true)
                          break Success116;
                      }
                    }
                    term = e_25;
                  }
                }
              }
            }
          }
        }
      }
      if(true)
        return term;
    }
    context.push("primitiveToBoxObject_0_0");
    context.popOnFailure();
    return null;
  }
}