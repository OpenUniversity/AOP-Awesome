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

@SuppressWarnings("all") public class pp_type_0_0 extends Strategy 
{ 
  public static pp_type_0_0 instance = new pp_type_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("pp_type_0_0");
    Fail118:
    { 
      IStrategoTerm term109 = term;
      Success106:
      { 
        Fail119:
        { 
          IStrategoTerm b_24 = null;
          IStrategoTerm c_24 = null;
          IStrategoTerm d_24 = null;
          b_24 = term;
          d_24 = term;
          c_24 = b_24;
          term = d_24;
          IStrategoTerm term110 = term;
          Success107:
          { 
            Fail120:
            { 
              IStrategoTerm e_24 = null;
              e_24 = term;
              term = c_24;
              if(term.getTermType() != IStrategoTerm.APPL || transform._consByte_0 != ((IStrategoAppl)term).getConstructor())
                break Fail120;
              term = e_24;
              { 
                term = cool.const69;
                if(true)
                  break Success107;
              }
            }
            term = term110;
            IStrategoTerm term111 = term;
            Success108:
            { 
              Fail121:
              { 
                IStrategoTerm f_24 = null;
                f_24 = term;
                term = c_24;
                if(term.getTermType() != IStrategoTerm.APPL || transform._consChar_0 != ((IStrategoAppl)term).getConstructor())
                  break Fail121;
                term = f_24;
                { 
                  term = cool.const70;
                  if(true)
                    break Success108;
                }
              }
              term = term111;
              IStrategoTerm term112 = term;
              Success109:
              { 
                Fail122:
                { 
                  IStrategoTerm g_24 = null;
                  g_24 = term;
                  term = c_24;
                  if(term.getTermType() != IStrategoTerm.APPL || transform._consBoolean_0 != ((IStrategoAppl)term).getConstructor())
                    break Fail122;
                  term = g_24;
                  { 
                    term = cool.const71;
                    if(true)
                      break Success109;
                  }
                }
                term = term112;
                IStrategoTerm term113 = term;
                Success110:
                { 
                  Fail123:
                  { 
                    IStrategoTerm h_24 = null;
                    h_24 = term;
                    term = c_24;
                    if(term.getTermType() != IStrategoTerm.APPL || transform._consShort_0 != ((IStrategoAppl)term).getConstructor())
                      break Fail123;
                    term = h_24;
                    { 
                      term = cool.const72;
                      if(true)
                        break Success110;
                    }
                  }
                  term = term113;
                  IStrategoTerm term114 = term;
                  Success111:
                  { 
                    Fail124:
                    { 
                      IStrategoTerm i_24 = null;
                      i_24 = term;
                      term = c_24;
                      if(term.getTermType() != IStrategoTerm.APPL || transform._consInt_0 != ((IStrategoAppl)term).getConstructor())
                        break Fail124;
                      term = i_24;
                      { 
                        term = cool.const73;
                        if(true)
                          break Success111;
                      }
                    }
                    term = term114;
                    IStrategoTerm term115 = term;
                    Success112:
                    { 
                      Fail125:
                      { 
                        IStrategoTerm j_24 = null;
                        j_24 = term;
                        term = c_24;
                        if(term.getTermType() != IStrategoTerm.APPL || transform._consLong_0 != ((IStrategoAppl)term).getConstructor())
                          break Fail125;
                        term = j_24;
                        { 
                          term = cool.const74;
                          if(true)
                            break Success112;
                        }
                      }
                      term = term115;
                      IStrategoTerm term116 = term;
                      Success113:
                      { 
                        Fail126:
                        { 
                          IStrategoTerm k_24 = null;
                          k_24 = term;
                          term = c_24;
                          if(term.getTermType() != IStrategoTerm.APPL || transform._consFloat_0 != ((IStrategoAppl)term).getConstructor())
                            break Fail126;
                          term = k_24;
                          { 
                            term = cool.const75;
                            if(true)
                              break Success113;
                          }
                        }
                        term = term116;
                        Success114:
                        { 
                          Fail127:
                          { 
                            IStrategoTerm l_24 = null;
                            l_24 = term;
                            term = c_24;
                            if(term.getTermType() != IStrategoTerm.APPL || transform._consDouble_0 != ((IStrategoAppl)term).getConstructor())
                              break Fail127;
                            term = l_24;
                            { 
                              term = cool.const76;
                              if(true)
                                break Success114;
                            }
                          }
                          term = cool.const77;
                          if(true)
                            break Fail119;
                        }
                      }
                    }
                  }
                }
              }
            }
          }
          if(true)
            break Success106;
        }
        term = term109;
        IStrategoTerm term118 = term;
        IStrategoConstructor cons9 = term.getTermType() == IStrategoTerm.APPL ? ((IStrategoAppl)term).getConstructor() : null;
        Success115:
        { 
          if(cons9 == transform._consArrayType_1)
          { 
            Fail128:
            { 
              IStrategoTerm y_23 = null;
              y_23 = term.getSubterm(0);
              term = this.invoke(context, y_23);
              if(term == null)
                break Fail128;
              term = (IStrategoTerm)termFactory.makeListCons(term, (IStrategoList)cool.constCons18);
              term = concat_strings_0_0.instance.invoke(context, term);
              if(term == null)
                break Fail128;
              if(true)
                break Success115;
            }
            term = term118;
          }
          Success116:
          { 
            if(cons9 == transform._consClassOrInterfaceType_2)
            { 
              Fail129:
              { 
                IStrategoTerm x_23 = null;
                IStrategoTerm arg18 = term.getSubterm(0);
                if(arg18.getTermType() != IStrategoTerm.APPL || transform._consTypeName_1 != ((IStrategoAppl)arg18).getConstructor())
                  break Fail129;
                IStrategoTerm arg19 = arg18.getSubterm(0);
                if(arg19.getTermType() != IStrategoTerm.APPL || transform._consId_1 != ((IStrategoAppl)arg19).getConstructor())
                  break Fail129;
                x_23 = arg19.getSubterm(0);
                term = x_23;
                if(true)
                  break Success116;
              }
              term = term118;
            }
            Success117:
            { 
              if(cons9 == transform._consClassOrInterfaceType_2)
              { 
                Fail130:
                { 
                  IStrategoTerm t_23 = null;
                  IStrategoTerm u_23 = null;
                  IStrategoTerm arg21 = term.getSubterm(0);
                  if(arg21.getTermType() != IStrategoTerm.APPL || transform._consTypeName_2 != ((IStrategoAppl)arg21).getConstructor())
                    break Fail130;
                  t_23 = arg21.getSubterm(0);
                  IStrategoTerm arg22 = arg21.getSubterm(1);
                  if(arg22.getTermType() != IStrategoTerm.APPL || transform._consId_1 != ((IStrategoAppl)arg22).getConstructor())
                    break Fail130;
                  u_23 = arg22.getSubterm(0);
                  term = this.invoke(context, t_23);
                  if(term == null)
                    break Fail130;
                  term = (IStrategoTerm)termFactory.makeListCons(term, termFactory.makeListCons(cool.const24, termFactory.makeListCons(u_23, (IStrategoList)cool.constNil0)));
                  term = concat_strings_0_0.instance.invoke(context, term);
                  if(term == null)
                    break Fail130;
                  if(true)
                    break Success117;
                }
                term = term118;
              }
              Success118:
              { 
                if(cons9 == transform._consPackageOrTypeName_1)
                { 
                  Fail131:
                  { 
                    IStrategoTerm s_23 = null;
                    IStrategoTerm arg24 = term.getSubterm(0);
                    if(arg24.getTermType() != IStrategoTerm.APPL || transform._consId_1 != ((IStrategoAppl)arg24).getConstructor())
                      break Fail131;
                    s_23 = arg24.getSubterm(0);
                    term = s_23;
                    if(true)
                      break Success118;
                  }
                  term = term118;
                }
                if(cons9 == transform._consPackageOrTypeName_2)
                { 
                  IStrategoTerm o_23 = null;
                  IStrategoTerm p_23 = null;
                  o_23 = term.getSubterm(0);
                  IStrategoTerm arg25 = term.getSubterm(1);
                  if(arg25.getTermType() != IStrategoTerm.APPL || transform._consId_1 != ((IStrategoAppl)arg25).getConstructor())
                    break Fail118;
                  p_23 = arg25.getSubterm(0);
                  term = this.invoke(context, o_23);
                  if(term == null)
                    break Fail118;
                  term = (IStrategoTerm)termFactory.makeListCons(term, termFactory.makeListCons(cool.const24, termFactory.makeListCons(p_23, (IStrategoList)cool.constNil0)));
                  term = concat_strings_0_0.instance.invoke(context, term);
                  if(term == null)
                    break Fail118;
                }
                else
                { 
                  break Fail118;
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