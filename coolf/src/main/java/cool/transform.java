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

@SuppressWarnings("all") public class transform  
{ 
  protected static final boolean TRACES_ENABLED = true;

  protected static ITermFactory constantFactory;

  private static WeakReference<Context> initedContext;

  private static boolean isIniting;

  protected static IStrategoTerm const81;

  protected static IStrategoTerm constMarkerAnno1;

  protected static IStrategoTerm constTypeName13;

  protected static IStrategoTerm constId41;

  protected static IStrategoTerm const80;

  protected static IStrategoTerm const79;

  protected static IStrategoTerm constCons26;

  protected static IStrategoTerm constCons25;

  protected static IStrategoTerm constMarkerAnno0;

  protected static IStrategoTerm constTypeName12;

  protected static IStrategoTerm constId40;

  protected static IStrategoTerm const78;

  protected static IStrategoTerm const77;

  protected static IStrategoTerm const76;

  protected static IStrategoTerm const75;

  protected static IStrategoTerm constTypeName11;

  protected static IStrategoTerm constId39;

  protected static IStrategoTerm const74;

  protected static IStrategoTerm constId38;

  protected static IStrategoTerm const73;

  protected static IStrategoTerm constCons24;

  protected static IStrategoTerm constTry0;

  protected static IStrategoTerm constCons23;

  protected static IStrategoTerm constCatch0;

  protected static IStrategoTerm constBlock2;

  protected static IStrategoTerm constCons22;

  protected static IStrategoTerm constThrow0;

  protected static IStrategoTerm constNewInstance1;

  protected static IStrategoTerm constClassOrInterfaceType4;

  protected static IStrategoTerm constTypeName10;

  protected static IStrategoTerm constId37;

  protected static IStrategoTerm const72;

  protected static IStrategoTerm constParam1;

  protected static IStrategoTerm constId36;

  protected static IStrategoTerm const71;

  protected static IStrategoTerm constClassOrInterfaceType3;

  protected static IStrategoTerm constTypeName9;

  protected static IStrategoTerm constId35;

  protected static IStrategoTerm const70;

  protected static IStrategoTerm constBlock1;

  protected static IStrategoTerm constCons21;

  protected static IStrategoTerm constExprStm1;

  protected static IStrategoTerm constInvoke5;

  protected static IStrategoTerm constMethod6;

  protected static IStrategoTerm constMethodName6;

  protected static IStrategoTerm constId34;

  protected static IStrategoTerm const69;

  protected static IStrategoTerm const68;

  protected static IStrategoTerm constMethod5;

  protected static IStrategoTerm constMethodName5;

  protected static IStrategoTerm const67;

  protected static IStrategoTerm const66;

  protected static IStrategoTerm const65;

  protected static IStrategoTerm const64;

  protected static IStrategoTerm constCons20;

  protected static IStrategoTerm constExprStm0;

  protected static IStrategoTerm constInvoke4;

  protected static IStrategoTerm constMethod4;

  protected static IStrategoTerm constMethodName4;

  protected static IStrategoTerm constId33;

  protected static IStrategoTerm const63;

  protected static IStrategoTerm constId32;

  protected static IStrategoTerm const62;

  protected static IStrategoTerm constTypeName8;

  protected static IStrategoTerm constId31;

  protected static IStrategoTerm const61;

  protected static IStrategoTerm constCons19;

  protected static IStrategoTerm constCons18;

  protected static IStrategoTerm constSynchronized0;

  protected static IStrategoTerm const60;

  protected static IStrategoTerm const59;

  protected static IStrategoTerm const58;

  protected static IStrategoTerm constCons17;

  protected static IStrategoTerm constTypeImportOnDemandDec1;

  protected static IStrategoTerm constPackageName1;

  protected static IStrategoTerm constCons16;

  protected static IStrategoTerm constId30;

  protected static IStrategoTerm const57;

  protected static IStrategoTerm constCons15;

  protected static IStrategoTerm constId29;

  protected static IStrategoTerm const56;

  protected static IStrategoTerm constCons14;

  protected static IStrategoTerm constTypeImportOnDemandDec0;

  protected static IStrategoTerm constPackageName0;

  protected static IStrategoTerm constCons13;

  protected static IStrategoTerm constId28;

  protected static IStrategoTerm constCons12;

  protected static IStrategoTerm constId27;

  protected static IStrategoTerm const55;

  protected static IStrategoTerm constTypeName7;

  protected static IStrategoTerm constId26;

  protected static IStrategoTerm const54;

  protected static IStrategoTerm constVoid0;

  protected static IStrategoTerm constTypeName6;

  protected static IStrategoTerm constId25;

  protected static IStrategoTerm const53;

  protected static IStrategoTerm constId24;

  protected static IStrategoTerm const52;

  protected static IStrategoTerm constId23;

  protected static IStrategoTerm const51;

  protected static IStrategoTerm constId22;

  protected static IStrategoTerm const50;

  protected static IStrategoTerm constId21;

  protected static IStrategoTerm const49;

  protected static IStrategoTerm constId20;

  protected static IStrategoTerm const48;

  protected static IStrategoTerm constId19;

  protected static IStrategoTerm const47;

  protected static IStrategoTerm constElemValPair0;

  protected static IStrategoTerm constLit4;

  protected static IStrategoTerm constString0;

  protected static IStrategoTerm constId18;

  protected static IStrategoTerm const46;

  protected static IStrategoTerm constTypeName5;

  protected static IStrategoTerm constId17;

  protected static IStrategoTerm const45;

  protected static IStrategoTerm constId16;

  protected static IStrategoTerm const44;

  protected static IStrategoTerm constTypeName4;

  protected static IStrategoTerm constId15;

  protected static IStrategoTerm const43;

  protected static IStrategoTerm constCons11;

  protected static IStrategoTerm constPublic0;

  protected static IStrategoTerm const42;

  protected static IStrategoTerm const41;

  protected static IStrategoTerm const40;

  protected static IStrategoTerm constCons10;

  protected static IStrategoTerm const39;

  protected static IStrategoTerm constInvoke3;

  protected static IStrategoTerm constCons9;

  protected static IStrategoTerm constNewInstance0;

  protected static IStrategoTerm constClassOrInterfaceType2;

  protected static IStrategoTerm constTypeName3;

  protected static IStrategoTerm constId14;

  protected static IStrategoTerm const38;

  protected static IStrategoTerm constMethod3;

  protected static IStrategoTerm constMethodName3;

  protected static IStrategoTerm constId13;

  protected static IStrategoTerm const37;

  protected static IStrategoTerm constAmbName2;

  protected static IStrategoTerm constId12;

  protected static IStrategoTerm const36;

  protected static IStrategoTerm constClassOrInterfaceType1;

  protected static IStrategoTerm constMethodDec0;

  protected static IStrategoTerm constBlock0;

  protected static IStrategoTerm constCons8;

  protected static IStrategoTerm constReturn0;

  protected static IStrategoTerm constSome0;

  protected static IStrategoTerm constLazyAnd0;

  protected static IStrategoTerm constNot1;

  protected static IStrategoTerm constInvoke2;

  protected static IStrategoTerm constCons7;

  protected static IStrategoTerm constInvoke1;

  protected static IStrategoTerm constMethod2;

  protected static IStrategoTerm constMethodName2;

  protected static IStrategoTerm constId11;

  protected static IStrategoTerm const35;

  protected static IStrategoTerm constAmbName1;

  protected static IStrategoTerm constId10;

  protected static IStrategoTerm const34;

  protected static IStrategoTerm constMethod1;

  protected static IStrategoTerm constMethodName1;

  protected static IStrategoTerm constId9;

  protected static IStrategoTerm const33;

  protected static IStrategoTerm constNot0;

  protected static IStrategoTerm constInvoke0;

  protected static IStrategoTerm constMethod0;

  protected static IStrategoTerm constMethodName0;

  protected static IStrategoTerm constId8;

  protected static IStrategoTerm const32;

  protected static IStrategoTerm constAmbName0;

  protected static IStrategoTerm constMethodDecHead0;

  protected static IStrategoTerm constCons6;

  protected static IStrategoTerm constParam0;

  protected static IStrategoTerm constId7;

  protected static IStrategoTerm const31;

  protected static IStrategoTerm constTypeName2;

  protected static IStrategoTerm constId6;

  protected static IStrategoTerm const30;

  protected static IStrategoTerm constId5;

  protected static IStrategoTerm const29;

  protected static IStrategoTerm constCons5;

  protected static IStrategoTerm constCons4;

  protected static IStrategoTerm constStatic0;

  public static IStrategoTerm getCoolTbl()
  { 
    return constCoolTbl;
  }

  protected static ImportTerm constCoolTbl;

  protected static IStrategoTerm const28;

  protected static IStrategoTerm const27;

  protected static IStrategoTerm constCons3;

  protected static IStrategoTerm const26;

  protected static IStrategoTerm const25;

  protected static IStrategoTerm constId4;

  protected static IStrategoTerm const24;

  protected static IStrategoTerm constId3;

  protected static IStrategoTerm const23;

  protected static IStrategoTerm constTypeName1;

  protected static IStrategoTerm constId2;

  protected static IStrategoTerm const22;

  protected static IStrategoTerm constCons2;

  protected static IStrategoTerm constPrivate0;

  protected static IStrategoTerm constLit3;

  protected static IStrategoTerm constNull0;

  protected static IStrategoTerm constClassOrInterfaceType0;

  protected static IStrategoTerm constTypeName0;

  protected static IStrategoTerm constId1;

  protected static IStrategoTerm const21;

  protected static IStrategoTerm constLit2;

  protected static IStrategoTerm constDeci1;

  protected static IStrategoTerm const20;

  protected static IStrategoTerm constLit1;

  protected static IStrategoTerm constBool0;

  protected static IStrategoTerm constLit0;

  protected static IStrategoTerm constDeci0;

  protected static IStrategoTerm const19;

  protected static IStrategoTerm const18;

  protected static IStrategoTerm const17;

  protected static IStrategoTerm const16;

  protected static IStrategoTerm constCons1;

  protected static IStrategoTerm constExprName0;

  protected static IStrategoTerm constId0;

  protected static IStrategoTerm const15;

  protected static IStrategoTerm const14;

  protected static IStrategoTerm const13;

  protected static IStrategoTerm constShort0;

  protected static IStrategoTerm constChar0;

  protected static IStrategoTerm constByte0;

  protected static IStrategoTerm constFloat0;

  protected static IStrategoTerm constInt0;

  protected static IStrategoTerm const12;

  protected static IStrategoTerm const11;

  protected static IStrategoTerm constBoolean0;

  protected static IStrategoTerm constLong0;

  protected static IStrategoTerm constDouble0;

  protected static IStrategoTerm constTrue0;

  protected static IStrategoTerm constFalse0;

  protected static IStrategoTerm constNone0;

  protected static IStrategoTerm constCons0;

  protected static IStrategoTerm const10;

  protected static IStrategoTerm const9;

  protected static IStrategoTerm const8;

  protected static IStrategoTerm const7;

  protected static IStrategoTerm const6;

  protected static IStrategoTerm const5;

  protected static IStrategoTerm const4;

  protected static IStrategoTerm const3;

  protected static IStrategoTerm const2;

  protected static IStrategoTerm const1;

  protected static IStrategoTerm const0;

  protected static IStrategoTerm constNil0;

  public static IStrategoConstructor _consConc_2;

  protected static IStrategoConstructor _consMarkerAnno_1;

  protected static IStrategoConstructor _consThrow_1;

  protected static IStrategoConstructor _consCatch_2;

  protected static IStrategoConstructor _consTry_2;

  protected static IStrategoConstructor _consExprStm_1;

  protected static IStrategoConstructor _consSynchronized_0;

  protected static IStrategoConstructor _consClassDec_2;

  protected static IStrategoConstructor _consPackageName_1;

  protected static IStrategoConstructor _consTypeImportOnDemandDec_1;

  protected static IStrategoConstructor _consTypeImportDec_1;

  protected static IStrategoConstructor _consCompilationUnit_3;

  protected static IStrategoConstructor _consVoid_0;

  protected static IStrategoConstructor _consElemValArrayInit_1;

  protected static IStrategoConstructor _consClassDecHead_5;

  protected static IStrategoConstructor _consPublic_0;

  protected static IStrategoConstructor _consNewInstance_4;

  protected static IStrategoConstructor _consMethodName_2;

  protected static IStrategoConstructor _consStatic_0;

  protected static IStrategoConstructor _consAmbName_1;

  protected static IStrategoConstructor _consAmbName_2;

  protected static IStrategoConstructor _consSome_1;

  protected static IStrategoConstructor _consReturn_1;

  protected static IStrategoConstructor _consChars_1;

  protected static IStrategoConstructor _consString_1;

  protected static IStrategoConstructor _consElemValPair_2;

  protected static IStrategoConstructor _consPrivate_0;

  protected static IStrategoConstructor _consNull_0;

  protected static IStrategoConstructor _consLit_1;

  protected static IStrategoConstructor _consMethodName_1;

  protected static IStrategoConstructor _consMethod_1;

  protected static IStrategoConstructor _consInvoke_2;

  protected static IStrategoConstructor _consBool_1;

  protected static IStrategoConstructor _consDeci_1;

  protected static IStrategoConstructor _consFloat_1;

  protected static IStrategoConstructor _consChar_1;

  protected static IStrategoConstructor _consVarArityParam_3;

  protected static IStrategoConstructor _consParam_3;

  protected static IStrategoConstructor _consAnno_2;

  protected static IStrategoConstructor _consDeprMethodDecHead_7;

  protected static IStrategoConstructor _consMethodDecHead_6;

  protected static IStrategoConstructor _consCastRef_2;

  protected static IStrategoConstructor _consCastPrim_2;

  protected static IStrategoConstructor _consForEach_3;

  protected static IStrategoConstructor _consFor_4;

  protected static IStrategoConstructor _consDoWhile_2;

  protected static IStrategoConstructor _consWhile_2;

  protected static IStrategoConstructor _consAssertStm_2;

  protected static IStrategoConstructor _consAssertStm_1;

  protected static IStrategoConstructor _consIf_3;

  protected static IStrategoConstructor _consIf_2;

  protected static IStrategoConstructor _consLazyOr_2;

  protected static IStrategoConstructor _consLazyAnd_2;

  protected static IStrategoConstructor _consAssignOr_2;

  protected static IStrategoConstructor _consAssignExcOr_2;

  protected static IStrategoConstructor _consAssignAnd_2;

  protected static IStrategoConstructor _consAssignURightShift_2;

  protected static IStrategoConstructor _consAssignRightShift_2;

  protected static IStrategoConstructor _consAssignLeftShift_2;

  protected static IStrategoConstructor _consAssignMinus_2;

  protected static IStrategoConstructor _consAssignPlus_2;

  protected static IStrategoConstructor _consAssignRemain_2;

  protected static IStrategoConstructor _consAssignDiv_2;

  protected static IStrategoConstructor _consAssignMul_2;

  protected static IStrategoConstructor _consAssign_2;

  protected static IStrategoConstructor _consComplement_1;

  protected static IStrategoConstructor _consPlus_1;

  protected static IStrategoConstructor _consMinus_1;

  protected static IStrategoConstructor _consNot_1;

  protected static IStrategoConstructor _consPostDecr_1;

  protected static IStrategoConstructor _consPreDecr_1;

  protected static IStrategoConstructor _consPostIncr_1;

  protected static IStrategoConstructor _consPreIncr_1;

  protected static IStrategoConstructor _consURightShift_2;

  protected static IStrategoConstructor _consRightShift_2;

  protected static IStrategoConstructor _consLeftShift_2;

  protected static IStrategoConstructor _consRemain_2;

  protected static IStrategoConstructor _consDiv_2;

  protected static IStrategoConstructor _consMul_2;

  protected static IStrategoConstructor _consMinus_2;

  protected static IStrategoConstructor _consPlus_2;

  protected static IStrategoConstructor _consGtEq_2;

  protected static IStrategoConstructor _consGt_2;

  protected static IStrategoConstructor _consLtEq_2;

  protected static IStrategoConstructor _consLt_2;

  protected static IStrategoConstructor _consAnd_2;

  protected static IStrategoConstructor _consExcOr_2;

  protected static IStrategoConstructor _consOr_2;

  protected static IStrategoConstructor _consNotEq_2;

  protected static IStrategoConstructor _consEq_2;

  protected static IStrategoConstructor _consLocalVarDec_3;

  protected static IStrategoConstructor _consFieldDec_3;

  protected static IStrategoConstructor _consVarDec_2;

  protected static IStrategoConstructor _consVarDec_1;

  protected static IStrategoConstructor _consExprName_2;

  protected static IStrategoConstructor _consExprName_1;

  protected static IStrategoConstructor _consTrue_0;

  protected static IStrategoConstructor _consMethodDec_2;

  protected static IStrategoConstructor _consBlock_1;

  protected static IStrategoConstructor _consFalse_0;

  protected static IStrategoConstructor _consNone_0;

  protected static IStrategoConstructor _consClassBody_1;

  protected static IStrategoConstructor _consClassOrInterfaceType_2;

  protected static IStrategoConstructor _consArrayType_1;

  protected static IStrategoConstructor _consDouble_0;

  protected static IStrategoConstructor _consFloat_0;

  protected static IStrategoConstructor _consLong_0;

  protected static IStrategoConstructor _consInt_0;

  protected static IStrategoConstructor _consShort_0;

  protected static IStrategoConstructor _consBoolean_0;

  protected static IStrategoConstructor _consChar_0;

  protected static IStrategoConstructor _consByte_0;

  protected static IStrategoConstructor _consPackageOrTypeName_2;

  protected static IStrategoConstructor _consPackageOrTypeName_1;

  protected static IStrategoConstructor _consTypeName_1;

  protected static IStrategoConstructor _consId_1;

  protected static IStrategoConstructor _consTypeName_2;

  public static IStrategoConstructor _consCoordinatorDec_2;

  public static IStrategoConstructor _consCoordinatorDecHead_1;

  public static IStrategoConstructor _consCoordinatorBody_1;

  public static IStrategoConstructor _consSelfex_1;

  public static IStrategoConstructor _consMutex_1;

  public static IStrategoConstructor _consConditionDec_1;

  public static IStrategoConstructor _consMethodAdditions_4;

  public static IStrategoConstructor _consMethodSignature_2;

  public static IStrategoConstructor _consRequires_1;

  public static IStrategoConstructor _consOnEntry_1;

  public static IStrategoConstructor _consOnExit_1;

  public static Context init(Context context)
  { 
    synchronized(transform.class)
    { 
      if(isIniting)
        return null;
      try
      { 
        isIniting = true;
        ITermFactory termFactory = context.getFactory();
        if(constantFactory == null)
        { 
          initConstructors(termFactory);
          initConstants(termFactory);
        }
        if(initedContext == null || initedContext.get() != context)
        { 
          org.strategoxt.stratego_lib.Main.init(context);
          org.strategoxt.java_front.Main.init(context);
          org.strategoxt.stratego_gpp.Main.init(context);
          org.strategoxt.stratego_sglr.Main.init(context);
          context.registerComponent("cool");
        }
        initedContext = new WeakReference<Context>(context);
        constantFactory = termFactory;
      }
      finally
      { 
        isIniting = false;
      }
      return context;
    }
  }

  public static Context init()
  { 
    return init(new Context());
  }

  public static void main(String args[])
  { 
    Context context = init();
    context.setStandAlone(true);
    try
    { 
      IStrategoTerm result;
      try
      { 
        result = context.invokeStrategyCLI(main_0_0.instance, "transform", args);
      }
      finally
      { 
        context.getIOAgent().closeAllFiles();
      }
      if(result == null)
      { 
        System.err.println("transform" + (TRACES_ENABLED ? ": rewriting failed, trace:" : ": rewriting failed"));
        context.printStackTrace();
        context.setStandAlone(false);
        System.exit(1);
      }
      else
      { 
        System.out.println(result);
        context.setStandAlone(false);
        System.exit(0);
      }
    }
    catch(StrategoErrorExit exit)
    { 
      context.setStandAlone(false);
      System.err.println(exit.getLocalizedMessage());
      System.exit(exit.getValue());
    }
    catch(StrategoExit exit)
    { 
      context.setStandAlone(false);
      System.exit(exit.getValue());
    }
  }

  public static IStrategoTerm mainNoExit(String ... args) throws StrategoExit
  { 
    return mainNoExit(new Context(), args);
  }

  public static IStrategoTerm mainNoExit(Context context, String ... args) throws StrategoExit
  { 
    try
    { 
      init(context);
      return context.invokeStrategyCLI(main_0_0.instance, "transform", args);
    }
    finally
    { 
      context.getIOAgent().closeAllFiles();
    }
  }

  public static Strategy getMainStrategy()
  { 
    return main_0_0.instance;
  }

  public static void initConstructors(ITermFactory termFactory)
  { 
    _consConc_2 = termFactory.makeConstructor("Conc", 2);
    _consMarkerAnno_1 = termFactory.makeConstructor("MarkerAnno", 1);
    _consThrow_1 = termFactory.makeConstructor("Throw", 1);
    _consCatch_2 = termFactory.makeConstructor("Catch", 2);
    _consTry_2 = termFactory.makeConstructor("Try", 2);
    _consExprStm_1 = termFactory.makeConstructor("ExprStm", 1);
    _consSynchronized_0 = termFactory.makeConstructor("Synchronized", 0);
    _consClassDec_2 = termFactory.makeConstructor("ClassDec", 2);
    _consPackageName_1 = termFactory.makeConstructor("PackageName", 1);
    _consTypeImportOnDemandDec_1 = termFactory.makeConstructor("TypeImportOnDemandDec", 1);
    _consTypeImportDec_1 = termFactory.makeConstructor("TypeImportDec", 1);
    _consCompilationUnit_3 = termFactory.makeConstructor("CompilationUnit", 3);
    _consVoid_0 = termFactory.makeConstructor("Void", 0);
    _consElemValArrayInit_1 = termFactory.makeConstructor("ElemValArrayInit", 1);
    _consClassDecHead_5 = termFactory.makeConstructor("ClassDecHead", 5);
    _consPublic_0 = termFactory.makeConstructor("Public", 0);
    _consNewInstance_4 = termFactory.makeConstructor("NewInstance", 4);
    _consMethodName_2 = termFactory.makeConstructor("MethodName", 2);
    _consStatic_0 = termFactory.makeConstructor("Static", 0);
    _consAmbName_1 = termFactory.makeConstructor("AmbName", 1);
    _consAmbName_2 = termFactory.makeConstructor("AmbName", 2);
    _consSome_1 = termFactory.makeConstructor("Some", 1);
    _consReturn_1 = termFactory.makeConstructor("Return", 1);
    _consChars_1 = termFactory.makeConstructor("Chars", 1);
    _consString_1 = termFactory.makeConstructor("String", 1);
    _consElemValPair_2 = termFactory.makeConstructor("ElemValPair", 2);
    _consPrivate_0 = termFactory.makeConstructor("Private", 0);
    _consNull_0 = termFactory.makeConstructor("Null", 0);
    _consLit_1 = termFactory.makeConstructor("Lit", 1);
    _consMethodName_1 = termFactory.makeConstructor("MethodName", 1);
    _consMethod_1 = termFactory.makeConstructor("Method", 1);
    _consInvoke_2 = termFactory.makeConstructor("Invoke", 2);
    _consBool_1 = termFactory.makeConstructor("Bool", 1);
    _consDeci_1 = termFactory.makeConstructor("Deci", 1);
    _consFloat_1 = termFactory.makeConstructor("Float", 1);
    _consChar_1 = termFactory.makeConstructor("Char", 1);
    _consVarArityParam_3 = termFactory.makeConstructor("VarArityParam", 3);
    _consParam_3 = termFactory.makeConstructor("Param", 3);
    _consAnno_2 = termFactory.makeConstructor("Anno", 2);
    _consDeprMethodDecHead_7 = termFactory.makeConstructor("DeprMethodDecHead", 7);
    _consMethodDecHead_6 = termFactory.makeConstructor("MethodDecHead", 6);
    _consCastRef_2 = termFactory.makeConstructor("CastRef", 2);
    _consCastPrim_2 = termFactory.makeConstructor("CastPrim", 2);
    _consForEach_3 = termFactory.makeConstructor("ForEach", 3);
    _consFor_4 = termFactory.makeConstructor("For", 4);
    _consDoWhile_2 = termFactory.makeConstructor("DoWhile", 2);
    _consWhile_2 = termFactory.makeConstructor("While", 2);
    _consAssertStm_2 = termFactory.makeConstructor("AssertStm", 2);
    _consAssertStm_1 = termFactory.makeConstructor("AssertStm", 1);
    _consIf_3 = termFactory.makeConstructor("If", 3);
    _consIf_2 = termFactory.makeConstructor("If", 2);
    _consLazyOr_2 = termFactory.makeConstructor("LazyOr", 2);
    _consLazyAnd_2 = termFactory.makeConstructor("LazyAnd", 2);
    _consAssignOr_2 = termFactory.makeConstructor("AssignOr", 2);
    _consAssignExcOr_2 = termFactory.makeConstructor("AssignExcOr", 2);
    _consAssignAnd_2 = termFactory.makeConstructor("AssignAnd", 2);
    _consAssignURightShift_2 = termFactory.makeConstructor("AssignURightShift", 2);
    _consAssignRightShift_2 = termFactory.makeConstructor("AssignRightShift", 2);
    _consAssignLeftShift_2 = termFactory.makeConstructor("AssignLeftShift", 2);
    _consAssignMinus_2 = termFactory.makeConstructor("AssignMinus", 2);
    _consAssignPlus_2 = termFactory.makeConstructor("AssignPlus", 2);
    _consAssignRemain_2 = termFactory.makeConstructor("AssignRemain", 2);
    _consAssignDiv_2 = termFactory.makeConstructor("AssignDiv", 2);
    _consAssignMul_2 = termFactory.makeConstructor("AssignMul", 2);
    _consAssign_2 = termFactory.makeConstructor("Assign", 2);
    _consComplement_1 = termFactory.makeConstructor("Complement", 1);
    _consPlus_1 = termFactory.makeConstructor("Plus", 1);
    _consMinus_1 = termFactory.makeConstructor("Minus", 1);
    _consNot_1 = termFactory.makeConstructor("Not", 1);
    _consPostDecr_1 = termFactory.makeConstructor("PostDecr", 1);
    _consPreDecr_1 = termFactory.makeConstructor("PreDecr", 1);
    _consPostIncr_1 = termFactory.makeConstructor("PostIncr", 1);
    _consPreIncr_1 = termFactory.makeConstructor("PreIncr", 1);
    _consURightShift_2 = termFactory.makeConstructor("URightShift", 2);
    _consRightShift_2 = termFactory.makeConstructor("RightShift", 2);
    _consLeftShift_2 = termFactory.makeConstructor("LeftShift", 2);
    _consRemain_2 = termFactory.makeConstructor("Remain", 2);
    _consDiv_2 = termFactory.makeConstructor("Div", 2);
    _consMul_2 = termFactory.makeConstructor("Mul", 2);
    _consMinus_2 = termFactory.makeConstructor("Minus", 2);
    _consPlus_2 = termFactory.makeConstructor("Plus", 2);
    _consGtEq_2 = termFactory.makeConstructor("GtEq", 2);
    _consGt_2 = termFactory.makeConstructor("Gt", 2);
    _consLtEq_2 = termFactory.makeConstructor("LtEq", 2);
    _consLt_2 = termFactory.makeConstructor("Lt", 2);
    _consAnd_2 = termFactory.makeConstructor("And", 2);
    _consExcOr_2 = termFactory.makeConstructor("ExcOr", 2);
    _consOr_2 = termFactory.makeConstructor("Or", 2);
    _consNotEq_2 = termFactory.makeConstructor("NotEq", 2);
    _consEq_2 = termFactory.makeConstructor("Eq", 2);
    _consLocalVarDec_3 = termFactory.makeConstructor("LocalVarDec", 3);
    _consFieldDec_3 = termFactory.makeConstructor("FieldDec", 3);
    _consVarDec_2 = termFactory.makeConstructor("VarDec", 2);
    _consVarDec_1 = termFactory.makeConstructor("VarDec", 1);
    _consExprName_2 = termFactory.makeConstructor("ExprName", 2);
    _consExprName_1 = termFactory.makeConstructor("ExprName", 1);
    _consTrue_0 = termFactory.makeConstructor("True", 0);
    _consMethodDec_2 = termFactory.makeConstructor("MethodDec", 2);
    _consBlock_1 = termFactory.makeConstructor("Block", 1);
    _consFalse_0 = termFactory.makeConstructor("False", 0);
    _consNone_0 = termFactory.makeConstructor("None", 0);
    _consClassBody_1 = termFactory.makeConstructor("ClassBody", 1);
    _consClassOrInterfaceType_2 = termFactory.makeConstructor("ClassOrInterfaceType", 2);
    _consArrayType_1 = termFactory.makeConstructor("ArrayType", 1);
    _consDouble_0 = termFactory.makeConstructor("Double", 0);
    _consFloat_0 = termFactory.makeConstructor("Float", 0);
    _consLong_0 = termFactory.makeConstructor("Long", 0);
    _consInt_0 = termFactory.makeConstructor("Int", 0);
    _consShort_0 = termFactory.makeConstructor("Short", 0);
    _consBoolean_0 = termFactory.makeConstructor("Boolean", 0);
    _consChar_0 = termFactory.makeConstructor("Char", 0);
    _consByte_0 = termFactory.makeConstructor("Byte", 0);
    _consPackageOrTypeName_2 = termFactory.makeConstructor("PackageOrTypeName", 2);
    _consPackageOrTypeName_1 = termFactory.makeConstructor("PackageOrTypeName", 1);
    _consTypeName_1 = termFactory.makeConstructor("TypeName", 1);
    _consId_1 = termFactory.makeConstructor("Id", 1);
    _consTypeName_2 = termFactory.makeConstructor("TypeName", 2);
    _consCoordinatorDec_2 = termFactory.makeConstructor("CoordinatorDec", 2);
    _consCoordinatorDecHead_1 = termFactory.makeConstructor("CoordinatorDecHead", 1);
    _consCoordinatorBody_1 = termFactory.makeConstructor("CoordinatorBody", 1);
    _consSelfex_1 = termFactory.makeConstructor("Selfex", 1);
    _consMutex_1 = termFactory.makeConstructor("Mutex", 1);
    _consConditionDec_1 = termFactory.makeConstructor("ConditionDec", 1);
    _consMethodAdditions_4 = termFactory.makeConstructor("MethodAdditions", 4);
    _consMethodSignature_2 = termFactory.makeConstructor("MethodSignature", 2);
    _consRequires_1 = termFactory.makeConstructor("Requires", 1);
    _consOnEntry_1 = termFactory.makeConstructor("OnEntry", 1);
    _consOnExit_1 = termFactory.makeConstructor("OnExit", 1);
  }

  public static void initConstants(ITermFactory termFactory)
  { 
    constNil0 = (IStrategoTerm)termFactory.makeList(Term.NO_TERMS);
    const0 = termFactory.makeString(".");
    const1 = termFactory.makeString("byte");
    const2 = termFactory.makeString("char");
    const3 = termFactory.makeString("boolean");
    const4 = termFactory.makeString("short");
    const5 = termFactory.makeString("int");
    const6 = termFactory.makeString("long");
    const7 = termFactory.makeString("float");
    const8 = termFactory.makeString("double");
    const9 = termFactory.makeString("");
    const10 = termFactory.makeString("[]");
    constCons0 = (IStrategoTerm)termFactory.makeListCons(cool.const10, (IStrategoList)cool.constNil0);
    constNone0 = termFactory.makeAppl(transform._consNone_0, NO_TERMS);
    constFalse0 = termFactory.makeAppl(transform._consFalse_0, NO_TERMS);
    constTrue0 = termFactory.makeAppl(transform._consTrue_0, NO_TERMS);
    constDouble0 = termFactory.makeAppl(transform._consDouble_0, NO_TERMS);
    constLong0 = termFactory.makeAppl(transform._consLong_0, NO_TERMS);
    constBoolean0 = termFactory.makeAppl(transform._consBoolean_0, NO_TERMS);
    const11 = termFactory.makeString("Didn't find any type..");
    const12 = termFactory.makeString("Got:");
    constInt0 = termFactory.makeAppl(transform._consInt_0, NO_TERMS);
    constFloat0 = termFactory.makeAppl(transform._consFloat_0, NO_TERMS);
    constByte0 = termFactory.makeAppl(transform._consByte_0, NO_TERMS);
    constChar0 = termFactory.makeAppl(transform._consChar_0, NO_TERMS);
    constShort0 = termFactory.makeAppl(transform._consShort_0, NO_TERMS);
    const13 = termFactory.makeString("LHS can't be:");
    const14 = termFactory.makeString("Unknown variable:");
    const15 = termFactory.makeString("target");
    constId0 = termFactory.makeAppl(transform._consId_1, new IStrategoTerm[]{cool.const15});
    constExprName0 = termFactory.makeAppl(transform._consExprName_1, new IStrategoTerm[]{cool.constId0});
    constCons1 = (IStrategoTerm)termFactory.makeListCons(cool.constExprName0, (IStrategoList)cool.constNil0);
    const16 = termFactory.makeInt(1);
    const17 = termFactory.makeString("_ref");
    const18 = termFactory.makeInt(0);
    const19 = termFactory.makeString("0");
    constDeci0 = termFactory.makeAppl(transform._consDeci_1, new IStrategoTerm[]{cool.const19});
    constLit0 = termFactory.makeAppl(transform._consLit_1, new IStrategoTerm[]{cool.constDeci0});
    constBool0 = termFactory.makeAppl(transform._consBool_1, new IStrategoTerm[]{cool.constFalse0});
    constLit1 = termFactory.makeAppl(transform._consLit_1, new IStrategoTerm[]{cool.constBool0});
    const20 = termFactory.makeString("0.0");
    constDeci1 = termFactory.makeAppl(transform._consDeci_1, new IStrategoTerm[]{cool.const20});
    constLit2 = termFactory.makeAppl(transform._consLit_1, new IStrategoTerm[]{cool.constDeci1});
    const21 = termFactory.makeString("Object");
    constId1 = termFactory.makeAppl(transform._consId_1, new IStrategoTerm[]{cool.const21});
    constTypeName0 = termFactory.makeAppl(transform._consTypeName_1, new IStrategoTerm[]{cool.constId1});
    constClassOrInterfaceType0 = termFactory.makeAppl(transform._consClassOrInterfaceType_2, new IStrategoTerm[]{cool.constTypeName0, cool.constNone0});
    constNull0 = termFactory.makeAppl(transform._consNull_0, NO_TERMS);
    constLit3 = termFactory.makeAppl(transform._consLit_1, new IStrategoTerm[]{cool.constNull0});
    constPrivate0 = termFactory.makeAppl(transform._consPrivate_0, NO_TERMS);
    constCons2 = (IStrategoTerm)termFactory.makeListCons(cool.constPrivate0, (IStrategoList)cool.constNil0);
    const22 = termFactory.makeString("COOLExternalRef");
    constId2 = termFactory.makeAppl(transform._consId_1, new IStrategoTerm[]{cool.const22});
    constTypeName1 = termFactory.makeAppl(transform._consTypeName_1, new IStrategoTerm[]{cool.constId2});
    const23 = termFactory.makeString("expr");
    constId3 = termFactory.makeAppl(transform._consId_1, new IStrategoTerm[]{cool.const23});
    const24 = termFactory.makeString("thiz");
    constId4 = termFactory.makeAppl(transform._consId_1, new IStrategoTerm[]{cool.const24});
    const25 = termFactory.makeString("arguments:");
    const26 = termFactory.makeString("Coord");
    constCons3 = (IStrategoTerm)termFactory.makeListCons(cool.const26, (IStrategoList)cool.constNil0);
    const27 = termFactory.makeString("java");
    const28 = termFactory.makeString("w");
    constCoolTbl = new ImportTerm(termFactory, cool.class, "/cool/", "cool.tbl");
    constStatic0 = termFactory.makeAppl(transform._consStatic_0, NO_TERMS);
    constCons4 = (IStrategoTerm)termFactory.makeListCons(cool.constStatic0, (IStrategoList)cool.constNil0);
    constCons5 = (IStrategoTerm)termFactory.makeListCons(cool.constPrivate0, (IStrategoList)cool.constCons4);
    const29 = termFactory.makeString("isRunByOthers");
    constId5 = termFactory.makeAppl(transform._consId_1, new IStrategoTerm[]{cool.const29});
    const30 = termFactory.makeString("List");
    constId6 = termFactory.makeAppl(transform._consId_1, new IStrategoTerm[]{cool.const30});
    constTypeName2 = termFactory.makeAppl(transform._consTypeName_1, new IStrategoTerm[]{cool.constId6});
    const31 = termFactory.makeString("methState");
    constId7 = termFactory.makeAppl(transform._consId_1, new IStrategoTerm[]{cool.const31});
    constParam0 = termFactory.makeAppl(transform._consParam_3, new IStrategoTerm[]{cool.constNil0, cool.constTypeName2, cool.constId7});
    constCons6 = (IStrategoTerm)termFactory.makeListCons(cool.constParam0, (IStrategoList)cool.constNil0);
    constMethodDecHead0 = termFactory.makeAppl(transform._consMethodDecHead_6, new IStrategoTerm[]{cool.constCons5, cool.constNone0, cool.constBoolean0, cool.constId5, cool.constCons6, cool.constNone0});
    constAmbName0 = termFactory.makeAppl(transform._consAmbName_1, new IStrategoTerm[]{cool.constId7});
    const32 = termFactory.makeString("isEmpty");
    constId8 = termFactory.makeAppl(transform._consId_1, new IStrategoTerm[]{cool.const32});
    constMethodName0 = termFactory.makeAppl(transform._consMethodName_2, new IStrategoTerm[]{cool.constAmbName0, cool.constId8});
    constMethod0 = termFactory.makeAppl(transform._consMethod_1, new IStrategoTerm[]{cool.constMethodName0});
    constInvoke0 = termFactory.makeAppl(transform._consInvoke_2, new IStrategoTerm[]{cool.constMethod0, cool.constNil0});
    constNot0 = termFactory.makeAppl(transform._consNot_1, new IStrategoTerm[]{cool.constInvoke0});
    const33 = termFactory.makeString("contains");
    constId9 = termFactory.makeAppl(transform._consId_1, new IStrategoTerm[]{cool.const33});
    constMethodName1 = termFactory.makeAppl(transform._consMethodName_2, new IStrategoTerm[]{cool.constAmbName0, cool.constId9});
    constMethod1 = termFactory.makeAppl(transform._consMethod_1, new IStrategoTerm[]{cool.constMethodName1});
    const34 = termFactory.makeString("Thread");
    constId10 = termFactory.makeAppl(transform._consId_1, new IStrategoTerm[]{cool.const34});
    constAmbName1 = termFactory.makeAppl(transform._consAmbName_1, new IStrategoTerm[]{cool.constId10});
    const35 = termFactory.makeString("currentThread");
    constId11 = termFactory.makeAppl(transform._consId_1, new IStrategoTerm[]{cool.const35});
    constMethodName2 = termFactory.makeAppl(transform._consMethodName_2, new IStrategoTerm[]{cool.constAmbName1, cool.constId11});
    constMethod2 = termFactory.makeAppl(transform._consMethod_1, new IStrategoTerm[]{cool.constMethodName2});
    constInvoke1 = termFactory.makeAppl(transform._consInvoke_2, new IStrategoTerm[]{cool.constMethod2, cool.constNil0});
    constCons7 = (IStrategoTerm)termFactory.makeListCons(cool.constInvoke1, (IStrategoList)cool.constNil0);
    constInvoke2 = termFactory.makeAppl(transform._consInvoke_2, new IStrategoTerm[]{cool.constMethod1, cool.constCons7});
    constNot1 = termFactory.makeAppl(transform._consNot_1, new IStrategoTerm[]{cool.constInvoke2});
    constLazyAnd0 = termFactory.makeAppl(transform._consLazyAnd_2, new IStrategoTerm[]{cool.constNot0, cool.constNot1});
    constSome0 = termFactory.makeAppl(transform._consSome_1, new IStrategoTerm[]{cool.constLazyAnd0});
    constReturn0 = termFactory.makeAppl(transform._consReturn_1, new IStrategoTerm[]{cool.constSome0});
    constCons8 = (IStrategoTerm)termFactory.makeListCons(cool.constReturn0, (IStrategoList)cool.constNil0);
    constBlock0 = termFactory.makeAppl(transform._consBlock_1, new IStrategoTerm[]{cool.constCons8});
    constMethodDec0 = termFactory.makeAppl(transform._consMethodDec_2, new IStrategoTerm[]{cool.constMethodDecHead0, cool.constBlock0});
    constClassOrInterfaceType1 = termFactory.makeAppl(transform._consClassOrInterfaceType_2, new IStrategoTerm[]{cool.constTypeName2, cool.constNone0});
    const36 = termFactory.makeString("Collections");
    constId12 = termFactory.makeAppl(transform._consId_1, new IStrategoTerm[]{cool.const36});
    constAmbName2 = termFactory.makeAppl(transform._consAmbName_1, new IStrategoTerm[]{cool.constId12});
    const37 = termFactory.makeString("synchronizedList");
    constId13 = termFactory.makeAppl(transform._consId_1, new IStrategoTerm[]{cool.const37});
    constMethodName3 = termFactory.makeAppl(transform._consMethodName_2, new IStrategoTerm[]{cool.constAmbName2, cool.constId13});
    constMethod3 = termFactory.makeAppl(transform._consMethod_1, new IStrategoTerm[]{cool.constMethodName3});
    const38 = termFactory.makeString("Vector");
    constId14 = termFactory.makeAppl(transform._consId_1, new IStrategoTerm[]{cool.const38});
    constTypeName3 = termFactory.makeAppl(transform._consTypeName_1, new IStrategoTerm[]{cool.constId14});
    constClassOrInterfaceType2 = termFactory.makeAppl(transform._consClassOrInterfaceType_2, new IStrategoTerm[]{cool.constTypeName3, cool.constNone0});
    constNewInstance0 = termFactory.makeAppl(transform._consNewInstance_4, new IStrategoTerm[]{cool.constNone0, cool.constClassOrInterfaceType2, cool.constNil0, cool.constNone0});
    constCons9 = (IStrategoTerm)termFactory.makeListCons(cool.constNewInstance0, (IStrategoList)cool.constNil0);
    constInvoke3 = termFactory.makeAppl(transform._consInvoke_2, new IStrategoTerm[]{cool.constMethod3, cool.constCons9});
    const39 = termFactory.makeString("State");
    constCons10 = (IStrategoTerm)termFactory.makeListCons(cool.const39, (IStrategoList)cool.constNil0);
    const40 = termFactory.makeString("requires_");
    const41 = termFactory.makeString("on_entry_");
    const42 = termFactory.makeString("on_exit_");
    constPublic0 = termFactory.makeAppl(transform._consPublic_0, NO_TERMS);
    constCons11 = (IStrategoTerm)termFactory.makeListCons(cool.constPublic0, (IStrategoList)cool.constNil0);
    const43 = termFactory.makeString("COOLAspect");
    constId15 = termFactory.makeAppl(transform._consId_1, new IStrategoTerm[]{cool.const43});
    constTypeName4 = termFactory.makeAppl(transform._consTypeName_1, new IStrategoTerm[]{cool.constId15});
    const44 = termFactory.makeString("className");
    constId16 = termFactory.makeAppl(transform._consId_1, new IStrategoTerm[]{cool.const44});
    const45 = termFactory.makeString("COOLRequires");
    constId17 = termFactory.makeAppl(transform._consId_1, new IStrategoTerm[]{cool.const45});
    constTypeName5 = termFactory.makeAppl(transform._consTypeName_1, new IStrategoTerm[]{cool.constId17});
    const46 = termFactory.makeString("parameterTypes");
    constId18 = termFactory.makeAppl(transform._consId_1, new IStrategoTerm[]{cool.const46});
    constString0 = termFactory.makeAppl(transform._consString_1, new IStrategoTerm[]{cool.constNil0});
    constLit4 = termFactory.makeAppl(transform._consLit_1, new IStrategoTerm[]{cool.constString0});
    constElemValPair0 = termFactory.makeAppl(transform._consElemValPair_2, new IStrategoTerm[]{cool.constId16, cool.constLit4});
    const47 = termFactory.makeString("methodName");
    constId19 = termFactory.makeAppl(transform._consId_1, new IStrategoTerm[]{cool.const47});
    const48 = termFactory.makeString("offset");
    constId20 = termFactory.makeAppl(transform._consId_1, new IStrategoTerm[]{cool.const48});
    const49 = termFactory.makeString("column");
    constId21 = termFactory.makeAppl(transform._consId_1, new IStrategoTerm[]{cool.const49});
    const50 = termFactory.makeString("endLine");
    constId22 = termFactory.makeAppl(transform._consId_1, new IStrategoTerm[]{cool.const50});
    const51 = termFactory.makeString("startLine");
    constId23 = termFactory.makeAppl(transform._consId_1, new IStrategoTerm[]{cool.const51});
    const52 = termFactory.makeString("file");
    constId24 = termFactory.makeAppl(transform._consId_1, new IStrategoTerm[]{cool.const52});
    const53 = termFactory.makeString("COOLOnEntry");
    constId25 = termFactory.makeAppl(transform._consId_1, new IStrategoTerm[]{cool.const53});
    constTypeName6 = termFactory.makeAppl(transform._consTypeName_1, new IStrategoTerm[]{cool.constId25});
    constVoid0 = termFactory.makeAppl(transform._consVoid_0, NO_TERMS);
    const54 = termFactory.makeString("COOLOnExit");
    constId26 = termFactory.makeAppl(transform._consId_1, new IStrategoTerm[]{cool.const54});
    constTypeName7 = termFactory.makeAppl(transform._consTypeName_1, new IStrategoTerm[]{cool.constId26});
    const55 = termFactory.makeString("util");
    constId27 = termFactory.makeAppl(transform._consId_1, new IStrategoTerm[]{cool.const55});
    constCons12 = (IStrategoTerm)termFactory.makeListCons(cool.constId27, (IStrategoList)cool.constNil0);
    constId28 = termFactory.makeAppl(transform._consId_1, new IStrategoTerm[]{cool.const27});
    constCons13 = (IStrategoTerm)termFactory.makeListCons(cool.constId28, (IStrategoList)cool.constCons12);
    constPackageName0 = termFactory.makeAppl(transform._consPackageName_1, new IStrategoTerm[]{cool.constCons13});
    constTypeImportOnDemandDec0 = termFactory.makeAppl(transform._consTypeImportOnDemandDec_1, new IStrategoTerm[]{cool.constPackageName0});
    constCons14 = (IStrategoTerm)termFactory.makeListCons(cool.constTypeImportOnDemandDec0, (IStrategoList)cool.constNil0);
    const56 = termFactory.makeString("runtime");
    constId29 = termFactory.makeAppl(transform._consId_1, new IStrategoTerm[]{cool.const56});
    constCons15 = (IStrategoTerm)termFactory.makeListCons(cool.constId29, (IStrategoList)cool.constNil0);
    const57 = termFactory.makeString("cool");
    constId30 = termFactory.makeAppl(transform._consId_1, new IStrategoTerm[]{cool.const57});
    constCons16 = (IStrategoTerm)termFactory.makeListCons(cool.constId30, (IStrategoList)cool.constCons15);
    constPackageName1 = termFactory.makeAppl(transform._consPackageName_1, new IStrategoTerm[]{cool.constCons16});
    constTypeImportOnDemandDec1 = termFactory.makeAppl(transform._consTypeImportOnDemandDec_1, new IStrategoTerm[]{cool.constPackageName1});
    constCons17 = (IStrategoTerm)termFactory.makeListCons(cool.constTypeImportOnDemandDec1, (IStrategoList)cool.constNil0);
    const58 = termFactory.makeString("'convert-coordinator-declaration'");
    const59 = termFactory.makeString("'gen-coordinator-body'");
    const60 = termFactory.makeString("'make-lock-and-unlock-methods'");
    constSynchronized0 = termFactory.makeAppl(transform._consSynchronized_0, NO_TERMS);
    constCons18 = (IStrategoTerm)termFactory.makeListCons(cool.constSynchronized0, (IStrategoList)cool.constNil0);
    constCons19 = (IStrategoTerm)termFactory.makeListCons(cool.constPublic0, (IStrategoList)cool.constCons18);
    const61 = termFactory.makeString("COOLUnlock");
    constId31 = termFactory.makeAppl(transform._consId_1, new IStrategoTerm[]{cool.const61});
    constTypeName8 = termFactory.makeAppl(transform._consTypeName_1, new IStrategoTerm[]{cool.constId31});
    const62 = termFactory.makeString("remove");
    constId32 = termFactory.makeAppl(transform._consId_1, new IStrategoTerm[]{cool.const62});
    const63 = termFactory.makeString("notifyAll");
    constId33 = termFactory.makeAppl(transform._consId_1, new IStrategoTerm[]{cool.const63});
    constMethodName4 = termFactory.makeAppl(transform._consMethodName_1, new IStrategoTerm[]{cool.constId33});
    constMethod4 = termFactory.makeAppl(transform._consMethod_1, new IStrategoTerm[]{cool.constMethodName4});
    constInvoke4 = termFactory.makeAppl(transform._consInvoke_2, new IStrategoTerm[]{cool.constMethod4, cool.constNil0});
    constExprStm0 = termFactory.makeAppl(transform._consExprStm_1, new IStrategoTerm[]{cool.constInvoke4});
    constCons20 = (IStrategoTerm)termFactory.makeListCons(cool.constExprStm0, (IStrategoList)cool.constNil0);
    const64 = termFactory.makeString("'make-unlock-method'");
    const65 = termFactory.makeString("unlock_");
    const66 = termFactory.makeString("COOLMutexLocation");
    const67 = termFactory.makeString("COOLSelfexLocation");
    constMethodName5 = termFactory.makeAppl(transform._consMethodName_1, new IStrategoTerm[]{cool.constId5});
    constMethod5 = termFactory.makeAppl(transform._consMethod_1, new IStrategoTerm[]{cool.constMethodName5});
    const68 = termFactory.makeString("COOLAdditionsLocation");
    const69 = termFactory.makeString("wait");
    constId34 = termFactory.makeAppl(transform._consId_1, new IStrategoTerm[]{cool.const69});
    constMethodName6 = termFactory.makeAppl(transform._consMethodName_1, new IStrategoTerm[]{cool.constId34});
    constMethod6 = termFactory.makeAppl(transform._consMethod_1, new IStrategoTerm[]{cool.constMethodName6});
    constInvoke5 = termFactory.makeAppl(transform._consInvoke_2, new IStrategoTerm[]{cool.constMethod6, cool.constNil0});
    constExprStm1 = termFactory.makeAppl(transform._consExprStm_1, new IStrategoTerm[]{cool.constInvoke5});
    constCons21 = (IStrategoTerm)termFactory.makeListCons(cool.constExprStm1, (IStrategoList)cool.constNil0);
    constBlock1 = termFactory.makeAppl(transform._consBlock_1, new IStrategoTerm[]{cool.constCons21});
    const70 = termFactory.makeString("InterruptedException");
    constId35 = termFactory.makeAppl(transform._consId_1, new IStrategoTerm[]{cool.const70});
    constTypeName9 = termFactory.makeAppl(transform._consTypeName_1, new IStrategoTerm[]{cool.constId35});
    constClassOrInterfaceType3 = termFactory.makeAppl(transform._consClassOrInterfaceType_2, new IStrategoTerm[]{cool.constTypeName9, cool.constNone0});
    const71 = termFactory.makeString("e");
    constId36 = termFactory.makeAppl(transform._consId_1, new IStrategoTerm[]{cool.const71});
    constParam1 = termFactory.makeAppl(transform._consParam_3, new IStrategoTerm[]{cool.constNil0, cool.constClassOrInterfaceType3, cool.constId36});
    const72 = termFactory.makeString("RuntimeException");
    constId37 = termFactory.makeAppl(transform._consId_1, new IStrategoTerm[]{cool.const72});
    constTypeName10 = termFactory.makeAppl(transform._consTypeName_1, new IStrategoTerm[]{cool.constId37});
    constClassOrInterfaceType4 = termFactory.makeAppl(transform._consClassOrInterfaceType_2, new IStrategoTerm[]{cool.constTypeName10, cool.constNone0});
    constNewInstance1 = termFactory.makeAppl(transform._consNewInstance_4, new IStrategoTerm[]{cool.constNone0, cool.constClassOrInterfaceType4, cool.constNil0, cool.constNone0});
    constThrow0 = termFactory.makeAppl(transform._consThrow_1, new IStrategoTerm[]{cool.constNewInstance1});
    constCons22 = (IStrategoTerm)termFactory.makeListCons(cool.constThrow0, (IStrategoList)cool.constNil0);
    constBlock2 = termFactory.makeAppl(transform._consBlock_1, new IStrategoTerm[]{cool.constCons22});
    constCatch0 = termFactory.makeAppl(transform._consCatch_2, new IStrategoTerm[]{cool.constParam1, cool.constBlock2});
    constCons23 = (IStrategoTerm)termFactory.makeListCons(cool.constCatch0, (IStrategoList)cool.constNil0);
    constTry0 = termFactory.makeAppl(transform._consTry_2, new IStrategoTerm[]{cool.constBlock1, cool.constCons23});
    constCons24 = (IStrategoTerm)termFactory.makeListCons(cool.constTry0, (IStrategoList)cool.constNil0);
    const73 = termFactory.makeString("add");
    constId38 = termFactory.makeAppl(transform._consId_1, new IStrategoTerm[]{cool.const73});
    const74 = termFactory.makeString("COOLLock");
    constId39 = termFactory.makeAppl(transform._consId_1, new IStrategoTerm[]{cool.const74});
    constTypeName11 = termFactory.makeAppl(transform._consTypeName_1, new IStrategoTerm[]{cool.constId39});
    const75 = termFactory.makeString("'make-lock-method'");
    const76 = termFactory.makeString("lock_");
    const77 = termFactory.makeString("'fillMethodMaps'");
    const78 = termFactory.makeString("COOLConditionField");
    constId40 = termFactory.makeAppl(transform._consId_1, new IStrategoTerm[]{cool.const78});
    constTypeName12 = termFactory.makeAppl(transform._consTypeName_1, new IStrategoTerm[]{cool.constId40});
    constMarkerAnno0 = termFactory.makeAppl(transform._consMarkerAnno_1, new IStrategoTerm[]{cool.constTypeName12});
    constCons25 = (IStrategoTerm)termFactory.makeListCons(cool.constMarkerAnno0, (IStrategoList)cool.constNil0);
    constCons26 = (IStrategoTerm)termFactory.makeListCons(cool.constPrivate0, (IStrategoList)cool.constCons25);
    const79 = termFactory.makeString("'add-condition-fields'");
    const80 = termFactory.makeString("COOLCoordinatorField");
    constId41 = termFactory.makeAppl(transform._consId_1, new IStrategoTerm[]{cool.const80});
    constTypeName13 = termFactory.makeAppl(transform._consTypeName_1, new IStrategoTerm[]{cool.constId41});
    constMarkerAnno1 = termFactory.makeAppl(transform._consMarkerAnno_1, new IStrategoTerm[]{cool.constTypeName13});
    const81 = termFactory.makeString("'add-coordinator-fields'");
  }

  public static void registerInterop(org.spoofax.interpreter.core.IContext context, Context compiledContext)
  { 
    new InteropRegisterer().registerLazy(context, compiledContext, InteropRegisterer.class.getClassLoader());
  }
}