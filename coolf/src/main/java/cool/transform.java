package cool;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.java_front.*;
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

  protected static IStrategoTerm const86;

  protected static IStrategoTerm constMarkerAnno1;

  protected static IStrategoTerm constTypeName12;

  protected static IStrategoTerm constId39;

  protected static IStrategoTerm const85;

  protected static IStrategoTerm const84;

  protected static IStrategoTerm constCons27;

  protected static IStrategoTerm constCons26;

  protected static IStrategoTerm constMarkerAnno0;

  protected static IStrategoTerm constTypeName11;

  protected static IStrategoTerm constId38;

  protected static IStrategoTerm const83;

  protected static IStrategoTerm const82;

  protected static IStrategoTerm const81;

  protected static IStrategoTerm const80;

  protected static IStrategoTerm constTypeName10;

  protected static IStrategoTerm constId37;

  protected static IStrategoTerm const79;

  protected static IStrategoTerm const78;

  protected static IStrategoTerm constCons25;

  protected static IStrategoTerm constExprStm2;

  protected static IStrategoTerm constInvoke5;

  protected static IStrategoTerm constMethod6;

  protected static IStrategoTerm constMethodName6;

  protected static IStrategoTerm constId36;

  protected static IStrategoTerm const77;

  protected static IStrategoTerm constAmbName3;

  protected static IStrategoTerm constId35;

  protected static IStrategoTerm const76;

  protected static IStrategoTerm constCons24;

  protected static IStrategoTerm constTry0;

  protected static IStrategoTerm constCons23;

  protected static IStrategoTerm constCatch0;

  protected static IStrategoTerm constBlock2;

  protected static IStrategoTerm constCons22;

  protected static IStrategoTerm constReturn1;

  protected static IStrategoTerm constParam1;

  protected static IStrategoTerm constId34;

  protected static IStrategoTerm const75;

  protected static IStrategoTerm constClassOrInterfaceType3;

  protected static IStrategoTerm constTypeName9;

  protected static IStrategoTerm constId33;

  protected static IStrategoTerm const74;

  protected static IStrategoTerm constBlock1;

  protected static IStrategoTerm constCons21;

  protected static IStrategoTerm constExprStm1;

  protected static IStrategoTerm constInvoke4;

  protected static IStrategoTerm constMethod5;

  protected static IStrategoTerm constMethodName5;

  protected static IStrategoTerm constId32;

  protected static IStrategoTerm const73;

  protected static IStrategoTerm const72;

  protected static IStrategoTerm const71;

  protected static IStrategoTerm const70;

  protected static IStrategoTerm const69;

  protected static IStrategoTerm constMethod4;

  protected static IStrategoTerm constMethodName4;

  protected static IStrategoTerm const68;

  protected static IStrategoTerm const67;

  protected static IStrategoTerm const66;

  protected static IStrategoTerm const65;

  protected static IStrategoTerm const64;

  protected static IStrategoTerm const63;

  protected static IStrategoTerm const62;

  protected static IStrategoTerm constCons20;

  protected static IStrategoTerm constExprStm0;

  protected static IStrategoTerm constInvoke3;

  protected static IStrategoTerm constMethod3;

  protected static IStrategoTerm constMethodName3;

  protected static IStrategoTerm constId31;

  protected static IStrategoTerm const61;

  protected static IStrategoTerm constId30;

  protected static IStrategoTerm const60;

  protected static IStrategoTerm constTypeName8;

  protected static IStrategoTerm constId29;

  protected static IStrategoTerm const59;

  protected static IStrategoTerm constCons19;

  protected static IStrategoTerm constCons18;

  protected static IStrategoTerm constSynchronized0;

  protected static IStrategoTerm const58;

  protected static IStrategoTerm const57;

  protected static IStrategoTerm constCons17;

  protected static IStrategoTerm constTypeImportOnDemandDec1;

  protected static IStrategoTerm constPackageName1;

  protected static IStrategoTerm constCons16;

  protected static IStrategoTerm constId28;

  protected static IStrategoTerm const56;

  protected static IStrategoTerm constCons15;

  protected static IStrategoTerm constId27;

  protected static IStrategoTerm const55;

  protected static IStrategoTerm constCons14;

  protected static IStrategoTerm constTypeImportOnDemandDec0;

  protected static IStrategoTerm constPackageName0;

  protected static IStrategoTerm constCons13;

  protected static IStrategoTerm constId26;

  protected static IStrategoTerm constCons12;

  protected static IStrategoTerm constId25;

  protected static IStrategoTerm const54;

  protected static IStrategoTerm constTypeName7;

  protected static IStrategoTerm constId24;

  protected static IStrategoTerm const53;

  protected static IStrategoTerm constVoid0;

  protected static IStrategoTerm constTypeName6;

  protected static IStrategoTerm constId23;

  protected static IStrategoTerm const52;

  protected static IStrategoTerm constId22;

  protected static IStrategoTerm const51;

  protected static IStrategoTerm constId21;

  protected static IStrategoTerm const50;

  protected static IStrategoTerm constId20;

  protected static IStrategoTerm const49;

  protected static IStrategoTerm constId19;

  protected static IStrategoTerm const48;

  protected static IStrategoTerm constId18;

  protected static IStrategoTerm const47;

  protected static IStrategoTerm constElemValPair0;

  protected static IStrategoTerm constLit4;

  protected static IStrategoTerm constString0;

  protected static IStrategoTerm constId17;

  protected static IStrategoTerm const46;

  protected static IStrategoTerm constTypeName5;

  protected static IStrategoTerm constId16;

  protected static IStrategoTerm const45;

  protected static IStrategoTerm constId15;

  protected static IStrategoTerm const44;

  protected static IStrategoTerm constTypeName4;

  protected static IStrategoTerm constId14;

  protected static IStrategoTerm const43;

  protected static IStrategoTerm constCons11;

  protected static IStrategoTerm constPublic0;

  protected static IStrategoTerm const42;

  protected static IStrategoTerm const41;

  protected static IStrategoTerm const40;

  protected static IStrategoTerm constCons10;

  protected static IStrategoTerm const39;

  protected static IStrategoTerm const38;

  protected static IStrategoTerm constInvoke2;

  protected static IStrategoTerm constCons9;

  protected static IStrategoTerm constNewInstance0;

  protected static IStrategoTerm constClassOrInterfaceType2;

  protected static IStrategoTerm constTypeName3;

  protected static IStrategoTerm constId13;

  protected static IStrategoTerm const37;

  protected static IStrategoTerm constMethod2;

  protected static IStrategoTerm constMethodName2;

  protected static IStrategoTerm constId12;

  protected static IStrategoTerm const36;

  protected static IStrategoTerm constAmbName2;

  protected static IStrategoTerm constId11;

  protected static IStrategoTerm const35;

  protected static IStrategoTerm constClassOrInterfaceType1;

  protected static IStrategoTerm constMethodDec0;

  protected static IStrategoTerm constBlock0;

  protected static IStrategoTerm constCons8;

  protected static IStrategoTerm constReturn0;

  protected static IStrategoTerm constSome0;

  protected static IStrategoTerm constNot0;

  protected static IStrategoTerm constInvoke1;

  protected static IStrategoTerm constCons7;

  protected static IStrategoTerm constInvoke0;

  protected static IStrategoTerm constMethod1;

  protected static IStrategoTerm constMethodName1;

  protected static IStrategoTerm constId10;

  protected static IStrategoTerm const34;

  protected static IStrategoTerm constAmbName1;

  protected static IStrategoTerm constId9;

  protected static IStrategoTerm const33;

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

  public static IStrategoConstructor _consMethodSignature_2;

  public static IStrategoConstructor _consSelfex_1;

  public static IStrategoConstructor _consMutex_1;

  public static IStrategoConstructor _consConditionDec_1;

  public static IStrategoConstructor _consMethodAdditions_4;

  public static IStrategoConstructor _consRequires_1;

  public static IStrategoConstructor _consOnEntry_1;

  public static IStrategoConstructor _consOnExit_1;

  public static IStrategoConstructor _consCoordinatorDec_2;

  public static IStrategoConstructor _consCoordinatorDecHead_1;

  public static IStrategoConstructor _consCoordinatorBody_1;

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
          context.registerComponent("transform");
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
    _consMethodSignature_2 = termFactory.makeConstructor("MethodSignature", 2);
    _consSelfex_1 = termFactory.makeConstructor("Selfex", 1);
    _consMutex_1 = termFactory.makeConstructor("Mutex", 1);
    _consConditionDec_1 = termFactory.makeConstructor("ConditionDec", 1);
    _consMethodAdditions_4 = termFactory.makeConstructor("MethodAdditions", 4);
    _consRequires_1 = termFactory.makeConstructor("Requires", 1);
    _consOnEntry_1 = termFactory.makeConstructor("OnEntry", 1);
    _consOnExit_1 = termFactory.makeConstructor("OnExit", 1);
    _consCoordinatorDec_2 = termFactory.makeConstructor("CoordinatorDec", 2);
    _consCoordinatorDecHead_1 = termFactory.makeConstructor("CoordinatorDecHead", 1);
    _consCoordinatorBody_1 = termFactory.makeConstructor("CoordinatorBody", 1);
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
    constCons0 = (IStrategoTerm)termFactory.makeListCons(transform.const10, (IStrategoList)transform.constNil0);
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
    constId0 = termFactory.makeAppl(transform._consId_1, new IStrategoTerm[]{transform.const15});
    constExprName0 = termFactory.makeAppl(transform._consExprName_1, new IStrategoTerm[]{transform.constId0});
    constCons1 = (IStrategoTerm)termFactory.makeListCons(transform.constExprName0, (IStrategoList)transform.constNil0);
    const16 = termFactory.makeInt(1);
    const17 = termFactory.makeString("_ref");
    const18 = termFactory.makeInt(0);
    const19 = termFactory.makeString("0");
    constDeci0 = termFactory.makeAppl(transform._consDeci_1, new IStrategoTerm[]{transform.const19});
    constLit0 = termFactory.makeAppl(transform._consLit_1, new IStrategoTerm[]{transform.constDeci0});
    constBool0 = termFactory.makeAppl(transform._consBool_1, new IStrategoTerm[]{transform.constFalse0});
    constLit1 = termFactory.makeAppl(transform._consLit_1, new IStrategoTerm[]{transform.constBool0});
    const20 = termFactory.makeString("0.0");
    constDeci1 = termFactory.makeAppl(transform._consDeci_1, new IStrategoTerm[]{transform.const20});
    constLit2 = termFactory.makeAppl(transform._consLit_1, new IStrategoTerm[]{transform.constDeci1});
    const21 = termFactory.makeString("Object");
    constId1 = termFactory.makeAppl(transform._consId_1, new IStrategoTerm[]{transform.const21});
    constTypeName0 = termFactory.makeAppl(transform._consTypeName_1, new IStrategoTerm[]{transform.constId1});
    constClassOrInterfaceType0 = termFactory.makeAppl(transform._consClassOrInterfaceType_2, new IStrategoTerm[]{transform.constTypeName0, transform.constNone0});
    constNull0 = termFactory.makeAppl(transform._consNull_0, NO_TERMS);
    constLit3 = termFactory.makeAppl(transform._consLit_1, new IStrategoTerm[]{transform.constNull0});
    constPrivate0 = termFactory.makeAppl(transform._consPrivate_0, NO_TERMS);
    constCons2 = (IStrategoTerm)termFactory.makeListCons(transform.constPrivate0, (IStrategoList)transform.constNil0);
    const22 = termFactory.makeString("COOLExternalRef");
    constId2 = termFactory.makeAppl(transform._consId_1, new IStrategoTerm[]{transform.const22});
    constTypeName1 = termFactory.makeAppl(transform._consTypeName_1, new IStrategoTerm[]{transform.constId2});
    const23 = termFactory.makeString("expr");
    constId3 = termFactory.makeAppl(transform._consId_1, new IStrategoTerm[]{transform.const23});
    const24 = termFactory.makeString("thiz");
    constId4 = termFactory.makeAppl(transform._consId_1, new IStrategoTerm[]{transform.const24});
    const25 = termFactory.makeString("arguments:");
    const26 = termFactory.makeString("Coord");
    constCons3 = (IStrategoTerm)termFactory.makeListCons(transform.const26, (IStrategoList)transform.constNil0);
    const27 = termFactory.makeString("java");
    const28 = termFactory.makeString("w");
    constStatic0 = termFactory.makeAppl(transform._consStatic_0, NO_TERMS);
    constCons4 = (IStrategoTerm)termFactory.makeListCons(transform.constStatic0, (IStrategoList)transform.constNil0);
    constCons5 = (IStrategoTerm)termFactory.makeListCons(transform.constPrivate0, (IStrategoList)transform.constCons4);
    const29 = termFactory.makeString("isRunByOthers");
    constId5 = termFactory.makeAppl(transform._consId_1, new IStrategoTerm[]{transform.const29});
    const30 = termFactory.makeString("List");
    constId6 = termFactory.makeAppl(transform._consId_1, new IStrategoTerm[]{transform.const30});
    constTypeName2 = termFactory.makeAppl(transform._consTypeName_1, new IStrategoTerm[]{transform.constId6});
    const31 = termFactory.makeString("methState");
    constId7 = termFactory.makeAppl(transform._consId_1, new IStrategoTerm[]{transform.const31});
    constParam0 = termFactory.makeAppl(transform._consParam_3, new IStrategoTerm[]{transform.constNil0, transform.constTypeName2, transform.constId7});
    constCons6 = (IStrategoTerm)termFactory.makeListCons(transform.constParam0, (IStrategoList)transform.constNil0);
    constMethodDecHead0 = termFactory.makeAppl(transform._consMethodDecHead_6, new IStrategoTerm[]{transform.constCons5, transform.constNone0, transform.constBoolean0, transform.constId5, transform.constCons6, transform.constNone0});
    constAmbName0 = termFactory.makeAppl(transform._consAmbName_1, new IStrategoTerm[]{transform.constId7});
    const32 = termFactory.makeString("contains");
    constId8 = termFactory.makeAppl(transform._consId_1, new IStrategoTerm[]{transform.const32});
    constMethodName0 = termFactory.makeAppl(transform._consMethodName_2, new IStrategoTerm[]{transform.constAmbName0, transform.constId8});
    constMethod0 = termFactory.makeAppl(transform._consMethod_1, new IStrategoTerm[]{transform.constMethodName0});
    const33 = termFactory.makeString("Thread");
    constId9 = termFactory.makeAppl(transform._consId_1, new IStrategoTerm[]{transform.const33});
    constAmbName1 = termFactory.makeAppl(transform._consAmbName_1, new IStrategoTerm[]{transform.constId9});
    const34 = termFactory.makeString("currentThread");
    constId10 = termFactory.makeAppl(transform._consId_1, new IStrategoTerm[]{transform.const34});
    constMethodName1 = termFactory.makeAppl(transform._consMethodName_2, new IStrategoTerm[]{transform.constAmbName1, transform.constId10});
    constMethod1 = termFactory.makeAppl(transform._consMethod_1, new IStrategoTerm[]{transform.constMethodName1});
    constInvoke0 = termFactory.makeAppl(transform._consInvoke_2, new IStrategoTerm[]{transform.constMethod1, transform.constNil0});
    constCons7 = (IStrategoTerm)termFactory.makeListCons(transform.constInvoke0, (IStrategoList)transform.constNil0);
    constInvoke1 = termFactory.makeAppl(transform._consInvoke_2, new IStrategoTerm[]{transform.constMethod0, transform.constCons7});
    constNot0 = termFactory.makeAppl(transform._consNot_1, new IStrategoTerm[]{transform.constInvoke1});
    constSome0 = termFactory.makeAppl(transform._consSome_1, new IStrategoTerm[]{transform.constNot0});
    constReturn0 = termFactory.makeAppl(transform._consReturn_1, new IStrategoTerm[]{transform.constSome0});
    constCons8 = (IStrategoTerm)termFactory.makeListCons(transform.constReturn0, (IStrategoList)transform.constNil0);
    constBlock0 = termFactory.makeAppl(transform._consBlock_1, new IStrategoTerm[]{transform.constCons8});
    constMethodDec0 = termFactory.makeAppl(transform._consMethodDec_2, new IStrategoTerm[]{transform.constMethodDecHead0, transform.constBlock0});
    constClassOrInterfaceType1 = termFactory.makeAppl(transform._consClassOrInterfaceType_2, new IStrategoTerm[]{transform.constTypeName2, transform.constNone0});
    const35 = termFactory.makeString("Collections");
    constId11 = termFactory.makeAppl(transform._consId_1, new IStrategoTerm[]{transform.const35});
    constAmbName2 = termFactory.makeAppl(transform._consAmbName_1, new IStrategoTerm[]{transform.constId11});
    const36 = termFactory.makeString("synchronizedList");
    constId12 = termFactory.makeAppl(transform._consId_1, new IStrategoTerm[]{transform.const36});
    constMethodName2 = termFactory.makeAppl(transform._consMethodName_2, new IStrategoTerm[]{transform.constAmbName2, transform.constId12});
    constMethod2 = termFactory.makeAppl(transform._consMethod_1, new IStrategoTerm[]{transform.constMethodName2});
    const37 = termFactory.makeString("Vector");
    constId13 = termFactory.makeAppl(transform._consId_1, new IStrategoTerm[]{transform.const37});
    constTypeName3 = termFactory.makeAppl(transform._consTypeName_1, new IStrategoTerm[]{transform.constId13});
    constClassOrInterfaceType2 = termFactory.makeAppl(transform._consClassOrInterfaceType_2, new IStrategoTerm[]{transform.constTypeName3, transform.constNone0});
    constNewInstance0 = termFactory.makeAppl(transform._consNewInstance_4, new IStrategoTerm[]{transform.constNone0, transform.constClassOrInterfaceType2, transform.constNil0, transform.constNone0});
    constCons9 = (IStrategoTerm)termFactory.makeListCons(transform.constNewInstance0, (IStrategoList)transform.constNil0);
    constInvoke2 = termFactory.makeAppl(transform._consInvoke_2, new IStrategoTerm[]{transform.constMethod2, transform.constCons9});
    const38 = termFactory.makeString("debug12");
    const39 = termFactory.makeString("State");
    constCons10 = (IStrategoTerm)termFactory.makeListCons(transform.const39, (IStrategoList)transform.constNil0);
    const40 = termFactory.makeString("requires_");
    const41 = termFactory.makeString("on_entry_");
    const42 = termFactory.makeString("on_exit_");
    constPublic0 = termFactory.makeAppl(transform._consPublic_0, NO_TERMS);
    constCons11 = (IStrategoTerm)termFactory.makeListCons(transform.constPublic0, (IStrategoList)transform.constNil0);
    const43 = termFactory.makeString("COOLAspect");
    constId14 = termFactory.makeAppl(transform._consId_1, new IStrategoTerm[]{transform.const43});
    constTypeName4 = termFactory.makeAppl(transform._consTypeName_1, new IStrategoTerm[]{transform.constId14});
    const44 = termFactory.makeString("className");
    constId15 = termFactory.makeAppl(transform._consId_1, new IStrategoTerm[]{transform.const44});
    const45 = termFactory.makeString("COOLRequires");
    constId16 = termFactory.makeAppl(transform._consId_1, new IStrategoTerm[]{transform.const45});
    constTypeName5 = termFactory.makeAppl(transform._consTypeName_1, new IStrategoTerm[]{transform.constId16});
    const46 = termFactory.makeString("parameterTypes");
    constId17 = termFactory.makeAppl(transform._consId_1, new IStrategoTerm[]{transform.const46});
    constString0 = termFactory.makeAppl(transform._consString_1, new IStrategoTerm[]{transform.constNil0});
    constLit4 = termFactory.makeAppl(transform._consLit_1, new IStrategoTerm[]{transform.constString0});
    constElemValPair0 = termFactory.makeAppl(transform._consElemValPair_2, new IStrategoTerm[]{transform.constId15, transform.constLit4});
    const47 = termFactory.makeString("methodName");
    constId18 = termFactory.makeAppl(transform._consId_1, new IStrategoTerm[]{transform.const47});
    const48 = termFactory.makeString("offset");
    constId19 = termFactory.makeAppl(transform._consId_1, new IStrategoTerm[]{transform.const48});
    const49 = termFactory.makeString("column");
    constId20 = termFactory.makeAppl(transform._consId_1, new IStrategoTerm[]{transform.const49});
    const50 = termFactory.makeString("endLine");
    constId21 = termFactory.makeAppl(transform._consId_1, new IStrategoTerm[]{transform.const50});
    const51 = termFactory.makeString("startLine");
    constId22 = termFactory.makeAppl(transform._consId_1, new IStrategoTerm[]{transform.const51});
    const52 = termFactory.makeString("COOLOnEntry");
    constId23 = termFactory.makeAppl(transform._consId_1, new IStrategoTerm[]{transform.const52});
    constTypeName6 = termFactory.makeAppl(transform._consTypeName_1, new IStrategoTerm[]{transform.constId23});
    constVoid0 = termFactory.makeAppl(transform._consVoid_0, NO_TERMS);
    const53 = termFactory.makeString("COOLOnExit");
    constId24 = termFactory.makeAppl(transform._consId_1, new IStrategoTerm[]{transform.const53});
    constTypeName7 = termFactory.makeAppl(transform._consTypeName_1, new IStrategoTerm[]{transform.constId24});
    const54 = termFactory.makeString("util");
    constId25 = termFactory.makeAppl(transform._consId_1, new IStrategoTerm[]{transform.const54});
    constCons12 = (IStrategoTerm)termFactory.makeListCons(transform.constId25, (IStrategoList)transform.constNil0);
    constId26 = termFactory.makeAppl(transform._consId_1, new IStrategoTerm[]{transform.const27});
    constCons13 = (IStrategoTerm)termFactory.makeListCons(transform.constId26, (IStrategoList)transform.constCons12);
    constPackageName0 = termFactory.makeAppl(transform._consPackageName_1, new IStrategoTerm[]{transform.constCons13});
    constTypeImportOnDemandDec0 = termFactory.makeAppl(transform._consTypeImportOnDemandDec_1, new IStrategoTerm[]{transform.constPackageName0});
    constCons14 = (IStrategoTerm)termFactory.makeListCons(transform.constTypeImportOnDemandDec0, (IStrategoList)transform.constNil0);
    const55 = termFactory.makeString("runtime");
    constId27 = termFactory.makeAppl(transform._consId_1, new IStrategoTerm[]{transform.const55});
    constCons15 = (IStrategoTerm)termFactory.makeListCons(transform.constId27, (IStrategoList)transform.constNil0);
    const56 = termFactory.makeString("cool");
    constId28 = termFactory.makeAppl(transform._consId_1, new IStrategoTerm[]{transform.const56});
    constCons16 = (IStrategoTerm)termFactory.makeListCons(transform.constId28, (IStrategoList)transform.constCons15);
    constPackageName1 = termFactory.makeAppl(transform._consPackageName_1, new IStrategoTerm[]{transform.constCons16});
    constTypeImportOnDemandDec1 = termFactory.makeAppl(transform._consTypeImportOnDemandDec_1, new IStrategoTerm[]{transform.constPackageName1});
    constCons17 = (IStrategoTerm)termFactory.makeListCons(transform.constTypeImportOnDemandDec1, (IStrategoList)transform.constNil0);
    const57 = termFactory.makeString("Internal error: with clause failed unexpectedly in rule 'convert-coordinator-declaration'");
    const58 = termFactory.makeString("Internal error: with clause failed unexpectedly in rule 'gen-coordinator-body'");
    constSynchronized0 = termFactory.makeAppl(transform._consSynchronized_0, NO_TERMS);
    constCons18 = (IStrategoTerm)termFactory.makeListCons(transform.constSynchronized0, (IStrategoList)transform.constNil0);
    constCons19 = (IStrategoTerm)termFactory.makeListCons(transform.constPublic0, (IStrategoList)transform.constCons18);
    const59 = termFactory.makeString("COOLUnlock");
    constId29 = termFactory.makeAppl(transform._consId_1, new IStrategoTerm[]{transform.const59});
    constTypeName8 = termFactory.makeAppl(transform._consTypeName_1, new IStrategoTerm[]{transform.constId29});
    const60 = termFactory.makeString("remove");
    constId30 = termFactory.makeAppl(transform._consId_1, new IStrategoTerm[]{transform.const60});
    const61 = termFactory.makeString("notifyAll");
    constId31 = termFactory.makeAppl(transform._consId_1, new IStrategoTerm[]{transform.const61});
    constMethodName3 = termFactory.makeAppl(transform._consMethodName_1, new IStrategoTerm[]{transform.constId31});
    constMethod3 = termFactory.makeAppl(transform._consMethod_1, new IStrategoTerm[]{transform.constMethodName3});
    constInvoke3 = termFactory.makeAppl(transform._consInvoke_2, new IStrategoTerm[]{transform.constMethod3, transform.constNil0});
    constExprStm0 = termFactory.makeAppl(transform._consExprStm_1, new IStrategoTerm[]{transform.constInvoke3});
    constCons20 = (IStrategoTerm)termFactory.makeListCons(transform.constExprStm0, (IStrategoList)transform.constNil0);
    const62 = termFactory.makeString("Internal error: with clause failed unexpectedly in rule 'make-unlock-method'");
    const63 = termFactory.makeString("unlock_");
    const64 = termFactory.makeString("debug1");
    const65 = termFactory.makeString("COOLMutexLocation");
    const66 = termFactory.makeString("debug2");
    const67 = termFactory.makeString("COOLSelfexLocation");
    const68 = termFactory.makeString("debug3");
    constMethodName4 = termFactory.makeAppl(transform._consMethodName_1, new IStrategoTerm[]{transform.constId5});
    constMethod4 = termFactory.makeAppl(transform._consMethod_1, new IStrategoTerm[]{transform.constMethodName4});
    const69 = termFactory.makeString("debug4");
    const70 = termFactory.makeString("debug5");
    const71 = termFactory.makeString("COOLAdditionsLocation");
    const72 = termFactory.makeString("debug6");
    const73 = termFactory.makeString("wait");
    constId32 = termFactory.makeAppl(transform._consId_1, new IStrategoTerm[]{transform.const73});
    constMethodName5 = termFactory.makeAppl(transform._consMethodName_1, new IStrategoTerm[]{transform.constId32});
    constMethod5 = termFactory.makeAppl(transform._consMethod_1, new IStrategoTerm[]{transform.constMethodName5});
    constInvoke4 = termFactory.makeAppl(transform._consInvoke_2, new IStrategoTerm[]{transform.constMethod5, transform.constNil0});
    constExprStm1 = termFactory.makeAppl(transform._consExprStm_1, new IStrategoTerm[]{transform.constInvoke4});
    constCons21 = (IStrategoTerm)termFactory.makeListCons(transform.constExprStm1, (IStrategoList)transform.constNil0);
    constBlock1 = termFactory.makeAppl(transform._consBlock_1, new IStrategoTerm[]{transform.constCons21});
    const74 = termFactory.makeString("InterruptedException");
    constId33 = termFactory.makeAppl(transform._consId_1, new IStrategoTerm[]{transform.const74});
    constTypeName9 = termFactory.makeAppl(transform._consTypeName_1, new IStrategoTerm[]{transform.constId33});
    constClassOrInterfaceType3 = termFactory.makeAppl(transform._consClassOrInterfaceType_2, new IStrategoTerm[]{transform.constTypeName9, transform.constNone0});
    const75 = termFactory.makeString("e");
    constId34 = termFactory.makeAppl(transform._consId_1, new IStrategoTerm[]{transform.const75});
    constParam1 = termFactory.makeAppl(transform._consParam_3, new IStrategoTerm[]{transform.constNil0, transform.constClassOrInterfaceType3, transform.constId34});
    constReturn1 = termFactory.makeAppl(transform._consReturn_1, new IStrategoTerm[]{transform.constNone0});
    constCons22 = (IStrategoTerm)termFactory.makeListCons(transform.constReturn1, (IStrategoList)transform.constNil0);
    constBlock2 = termFactory.makeAppl(transform._consBlock_1, new IStrategoTerm[]{transform.constCons22});
    constCatch0 = termFactory.makeAppl(transform._consCatch_2, new IStrategoTerm[]{transform.constParam1, transform.constBlock2});
    constCons23 = (IStrategoTerm)termFactory.makeListCons(transform.constCatch0, (IStrategoList)transform.constNil0);
    constTry0 = termFactory.makeAppl(transform._consTry_2, new IStrategoTerm[]{transform.constBlock1, transform.constCons23});
    constCons24 = (IStrategoTerm)termFactory.makeListCons(transform.constTry0, (IStrategoList)transform.constNil0);
    const76 = termFactory.makeString("arik");
    constId35 = termFactory.makeAppl(transform._consId_1, new IStrategoTerm[]{transform.const76});
    constAmbName3 = termFactory.makeAppl(transform._consAmbName_1, new IStrategoTerm[]{transform.constId35});
    const77 = termFactory.makeString("add");
    constId36 = termFactory.makeAppl(transform._consId_1, new IStrategoTerm[]{transform.const77});
    constMethodName6 = termFactory.makeAppl(transform._consMethodName_2, new IStrategoTerm[]{transform.constAmbName3, transform.constId36});
    constMethod6 = termFactory.makeAppl(transform._consMethod_1, new IStrategoTerm[]{transform.constMethodName6});
    constInvoke5 = termFactory.makeAppl(transform._consInvoke_2, new IStrategoTerm[]{transform.constMethod6, transform.constCons7});
    constExprStm2 = termFactory.makeAppl(transform._consExprStm_1, new IStrategoTerm[]{transform.constInvoke5});
    constCons25 = (IStrategoTerm)termFactory.makeListCons(transform.constExprStm2, (IStrategoList)transform.constNil0);
    const78 = termFactory.makeString("debug7");
    const79 = termFactory.makeString("COOLLock");
    constId37 = termFactory.makeAppl(transform._consId_1, new IStrategoTerm[]{transform.const79});
    constTypeName10 = termFactory.makeAppl(transform._consTypeName_1, new IStrategoTerm[]{transform.constId37});
    const80 = termFactory.makeString("Internal error: with clause failed unexpectedly in rule 'make-lock-method'");
    const81 = termFactory.makeString("lock_");
    const82 = termFactory.makeString("Internal error: with clause failed unexpectedly in rule 'fillMethodMaps'");
    const83 = termFactory.makeString("COOLConditionField");
    constId38 = termFactory.makeAppl(transform._consId_1, new IStrategoTerm[]{transform.const83});
    constTypeName11 = termFactory.makeAppl(transform._consTypeName_1, new IStrategoTerm[]{transform.constId38});
    constMarkerAnno0 = termFactory.makeAppl(transform._consMarkerAnno_1, new IStrategoTerm[]{transform.constTypeName11});
    constCons26 = (IStrategoTerm)termFactory.makeListCons(transform.constMarkerAnno0, (IStrategoList)transform.constNil0);
    constCons27 = (IStrategoTerm)termFactory.makeListCons(transform.constPrivate0, (IStrategoList)transform.constCons26);
    const84 = termFactory.makeString("Internal error: with clause failed unexpectedly in rule 'add-condition-fields'");
    const85 = termFactory.makeString("COOLCoordinatorField");
    constId39 = termFactory.makeAppl(transform._consId_1, new IStrategoTerm[]{transform.const85});
    constTypeName12 = termFactory.makeAppl(transform._consTypeName_1, new IStrategoTerm[]{transform.constId39});
    constMarkerAnno1 = termFactory.makeAppl(transform._consMarkerAnno_1, new IStrategoTerm[]{transform.constTypeName12});
    const86 = termFactory.makeString("Internal error: with clause failed unexpectedly in rule 'add-coordinator-fields'");
  }

  @SuppressWarnings("all") public static class fetch__full__class__name_0_0 extends Strategy 
  { 
    public static fetch__full__class__name_0_0 instance = new fetch__full__class__name_0_0();

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      ITermFactory termFactory = context.getFactory();
      context.push("fetch__full__class__name_0_0");
      Fail0:
      { 
        IStrategoTerm term0 = term;
        IStrategoConstructor cons0 = term.getTermType() == IStrategoTerm.APPL ? ((IStrategoAppl)term).getConstructor() : null;
        Success0:
        { 
          if(cons0 == transform._consTypeName_2)
          { 
            Fail1:
            { 
              IStrategoTerm s_7 = null;
              IStrategoTerm t_7 = null;
              s_7 = term.getSubterm(0);
              IStrategoTerm arg0 = term.getSubterm(1);
              if(arg0.getTermType() != IStrategoTerm.APPL || transform._consId_1 != ((IStrategoAppl)arg0).getConstructor())
                break Fail1;
              t_7 = arg0.getSubterm(0);
              term = this.invoke(context, s_7);
              if(term == null)
                break Fail1;
              term = (IStrategoTerm)termFactory.makeListCons(term, termFactory.makeListCons(transform.const0, termFactory.makeListCons(t_7, (IStrategoList)transform.constNil0)));
              term = concat_strings_0_0.instance.invoke(context, term);
              if(term == null)
                break Fail1;
              if(true)
                break Success0;
            }
            term = term0;
          }
          Success1:
          { 
            if(cons0 == transform._consTypeName_1)
            { 
              Fail2:
              { 
                IStrategoTerm r_7 = null;
                IStrategoTerm arg1 = term.getSubterm(0);
                if(arg1.getTermType() != IStrategoTerm.APPL || transform._consId_1 != ((IStrategoAppl)arg1).getConstructor())
                  break Fail2;
                r_7 = arg1.getSubterm(0);
                term = r_7;
                if(true)
                  break Success1;
              }
              term = term0;
            }
            Success2:
            { 
              if(cons0 == transform._consPackageOrTypeName_1)
              { 
                Fail3:
                { 
                  IStrategoTerm q_7 = null;
                  IStrategoTerm arg2 = term.getSubterm(0);
                  if(arg2.getTermType() != IStrategoTerm.APPL || transform._consId_1 != ((IStrategoAppl)arg2).getConstructor())
                    break Fail3;
                  q_7 = arg2.getSubterm(0);
                  term = q_7;
                  if(true)
                    break Success2;
                }
                term = term0;
              }
              if(cons0 == transform._consPackageOrTypeName_2)
              { 
                IStrategoTerm m_7 = null;
                IStrategoTerm n_7 = null;
                m_7 = term.getSubterm(0);
                IStrategoTerm arg3 = term.getSubterm(1);
                if(arg3.getTermType() != IStrategoTerm.APPL || transform._consId_1 != ((IStrategoAppl)arg3).getConstructor())
                  break Fail0;
                n_7 = arg3.getSubterm(0);
                term = this.invoke(context, m_7);
                if(term == null)
                  break Fail0;
                term = (IStrategoTerm)termFactory.makeListCons(term, termFactory.makeListCons(transform.const0, termFactory.makeListCons(n_7, (IStrategoList)transform.constNil0)));
                term = concat_strings_0_0.instance.invoke(context, term);
                if(term == null)
                  break Fail0;
              }
              else
              { 
                break Fail0;
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

  @SuppressWarnings("all") public static class pp_type_0_0 extends Strategy 
  { 
    public static pp_type_0_0 instance = new pp_type_0_0();

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      ITermFactory termFactory = context.getFactory();
      context.push("pp_type_0_0");
      Fail4:
      { 
        IStrategoTerm term3 = term;
        Success3:
        { 
          Fail5:
          { 
            IStrategoTerm l_8 = null;
            IStrategoTerm m_8 = null;
            IStrategoTerm n_8 = null;
            l_8 = term;
            n_8 = term;
            m_8 = l_8;
            term = n_8;
            IStrategoTerm term4 = term;
            Success4:
            { 
              Fail6:
              { 
                IStrategoTerm o_8 = null;
                o_8 = term;
                term = m_8;
                if(term.getTermType() != IStrategoTerm.APPL || transform._consByte_0 != ((IStrategoAppl)term).getConstructor())
                  break Fail6;
                term = o_8;
                { 
                  term = transform.const1;
                  if(true)
                    break Success4;
                }
              }
              term = term4;
              IStrategoTerm term5 = term;
              Success5:
              { 
                Fail7:
                { 
                  IStrategoTerm p_8 = null;
                  p_8 = term;
                  term = m_8;
                  if(term.getTermType() != IStrategoTerm.APPL || transform._consChar_0 != ((IStrategoAppl)term).getConstructor())
                    break Fail7;
                  term = p_8;
                  { 
                    term = transform.const2;
                    if(true)
                      break Success5;
                  }
                }
                term = term5;
                IStrategoTerm term6 = term;
                Success6:
                { 
                  Fail8:
                  { 
                    IStrategoTerm q_8 = null;
                    q_8 = term;
                    term = m_8;
                    if(term.getTermType() != IStrategoTerm.APPL || transform._consBoolean_0 != ((IStrategoAppl)term).getConstructor())
                      break Fail8;
                    term = q_8;
                    { 
                      term = transform.const3;
                      if(true)
                        break Success6;
                    }
                  }
                  term = term6;
                  IStrategoTerm term7 = term;
                  Success7:
                  { 
                    Fail9:
                    { 
                      IStrategoTerm r_8 = null;
                      r_8 = term;
                      term = m_8;
                      if(term.getTermType() != IStrategoTerm.APPL || transform._consShort_0 != ((IStrategoAppl)term).getConstructor())
                        break Fail9;
                      term = r_8;
                      { 
                        term = transform.const4;
                        if(true)
                          break Success7;
                      }
                    }
                    term = term7;
                    IStrategoTerm term8 = term;
                    Success8:
                    { 
                      Fail10:
                      { 
                        IStrategoTerm s_8 = null;
                        s_8 = term;
                        term = m_8;
                        if(term.getTermType() != IStrategoTerm.APPL || transform._consInt_0 != ((IStrategoAppl)term).getConstructor())
                          break Fail10;
                        term = s_8;
                        { 
                          term = transform.const5;
                          if(true)
                            break Success8;
                        }
                      }
                      term = term8;
                      IStrategoTerm term9 = term;
                      Success9:
                      { 
                        Fail11:
                        { 
                          IStrategoTerm t_8 = null;
                          t_8 = term;
                          term = m_8;
                          if(term.getTermType() != IStrategoTerm.APPL || transform._consLong_0 != ((IStrategoAppl)term).getConstructor())
                            break Fail11;
                          term = t_8;
                          { 
                            term = transform.const6;
                            if(true)
                              break Success9;
                          }
                        }
                        term = term9;
                        IStrategoTerm term10 = term;
                        Success10:
                        { 
                          Fail12:
                          { 
                            IStrategoTerm u_8 = null;
                            u_8 = term;
                            term = m_8;
                            if(term.getTermType() != IStrategoTerm.APPL || transform._consFloat_0 != ((IStrategoAppl)term).getConstructor())
                              break Fail12;
                            term = u_8;
                            { 
                              term = transform.const7;
                              if(true)
                                break Success10;
                            }
                          }
                          term = term10;
                          Success11:
                          { 
                            Fail13:
                            { 
                              IStrategoTerm w_8 = null;
                              w_8 = term;
                              term = m_8;
                              if(term.getTermType() != IStrategoTerm.APPL || transform._consDouble_0 != ((IStrategoAppl)term).getConstructor())
                                break Fail13;
                              term = w_8;
                              { 
                                term = transform.const8;
                                if(true)
                                  break Success11;
                              }
                            }
                            term = transform.const9;
                            if(true)
                              break Fail5;
                          }
                        }
                      }
                    }
                  }
                }
              }
            }
            if(true)
              break Success3;
          }
          term = term3;
          IStrategoTerm term12 = term;
          IStrategoConstructor cons1 = term.getTermType() == IStrategoTerm.APPL ? ((IStrategoAppl)term).getConstructor() : null;
          Success12:
          { 
            if(cons1 == transform._consArrayType_1)
            { 
              Fail14:
              { 
                IStrategoTerm h_8 = null;
                h_8 = term.getSubterm(0);
                term = this.invoke(context, h_8);
                if(term == null)
                  break Fail14;
                term = (IStrategoTerm)termFactory.makeListCons(term, (IStrategoList)transform.constCons0);
                term = concat_strings_0_0.instance.invoke(context, term);
                if(term == null)
                  break Fail14;
                if(true)
                  break Success12;
              }
              term = term12;
            }
            Success13:
            { 
              if(cons1 == transform._consClassOrInterfaceType_2)
              { 
                Fail15:
                { 
                  IStrategoTerm g_8 = null;
                  IStrategoTerm arg4 = term.getSubterm(0);
                  if(arg4.getTermType() != IStrategoTerm.APPL || transform._consTypeName_1 != ((IStrategoAppl)arg4).getConstructor())
                    break Fail15;
                  IStrategoTerm arg5 = arg4.getSubterm(0);
                  if(arg5.getTermType() != IStrategoTerm.APPL || transform._consId_1 != ((IStrategoAppl)arg5).getConstructor())
                    break Fail15;
                  g_8 = arg5.getSubterm(0);
                  term = g_8;
                  if(true)
                    break Success13;
                }
                term = term12;
              }
              Success14:
              { 
                if(cons1 == transform._consClassOrInterfaceType_2)
                { 
                  Fail16:
                  { 
                    IStrategoTerm c_8 = null;
                    IStrategoTerm d_8 = null;
                    IStrategoTerm arg7 = term.getSubterm(0);
                    if(arg7.getTermType() != IStrategoTerm.APPL || transform._consTypeName_2 != ((IStrategoAppl)arg7).getConstructor())
                      break Fail16;
                    c_8 = arg7.getSubterm(0);
                    IStrategoTerm arg8 = arg7.getSubterm(1);
                    if(arg8.getTermType() != IStrategoTerm.APPL || transform._consId_1 != ((IStrategoAppl)arg8).getConstructor())
                      break Fail16;
                    d_8 = arg8.getSubterm(0);
                    term = this.invoke(context, c_8);
                    if(term == null)
                      break Fail16;
                    term = (IStrategoTerm)termFactory.makeListCons(term, termFactory.makeListCons(transform.const0, termFactory.makeListCons(d_8, (IStrategoList)transform.constNil0)));
                    term = concat_strings_0_0.instance.invoke(context, term);
                    if(term == null)
                      break Fail16;
                    if(true)
                      break Success14;
                  }
                  term = term12;
                }
                Success15:
                { 
                  if(cons1 == transform._consPackageOrTypeName_1)
                  { 
                    Fail17:
                    { 
                      IStrategoTerm b_8 = null;
                      IStrategoTerm arg10 = term.getSubterm(0);
                      if(arg10.getTermType() != IStrategoTerm.APPL || transform._consId_1 != ((IStrategoAppl)arg10).getConstructor())
                        break Fail17;
                      b_8 = arg10.getSubterm(0);
                      term = b_8;
                      if(true)
                        break Success15;
                    }
                    term = term12;
                  }
                  if(cons1 == transform._consPackageOrTypeName_2)
                  { 
                    IStrategoTerm w_7 = null;
                    IStrategoTerm x_7 = null;
                    w_7 = term.getSubterm(0);
                    IStrategoTerm arg11 = term.getSubterm(1);
                    if(arg11.getTermType() != IStrategoTerm.APPL || transform._consId_1 != ((IStrategoAppl)arg11).getConstructor())
                      break Fail4;
                    x_7 = arg11.getSubterm(0);
                    term = this.invoke(context, w_7);
                    if(term == null)
                      break Fail4;
                    term = (IStrategoTerm)termFactory.makeListCons(term, termFactory.makeListCons(transform.const0, termFactory.makeListCons(x_7, (IStrategoList)transform.constNil0)));
                    term = concat_strings_0_0.instance.invoke(context, term);
                    if(term == null)
                      break Fail4;
                  }
                  else
                  { 
                    break Fail4;
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

  @SuppressWarnings("all") public static class add__externals_0_1 extends Strategy 
  { 
    public static add__externals_0_1 instance = new add__externals_0_1();

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm z_8)
    { 
      context.push("add__externals_0_1");
      Fail18:
      { 
        IStrategoTerm a_9 = null;
        TermReference e_9 = new TermReference();
        a_9 = term;
        term = new_iset_0_0.instance.invoke(context, term);
        if(term == null)
          break Fail18;
        if(e_9.value == null)
          e_9.value = term;
        else
          if(e_9.value != term && !e_9.value.match(term))
            break Fail18;
        term = add_external_impl_0_2.instance.invoke(context, a_9, e_9.value, z_8);
        if(term == null)
          break Fail18;
        lifted0 lifted00 = new lifted0();
        lifted00.e_9 = e_9;
        term = topdown_1_0.instance.invoke(context, term, lifted00);
        if(term == null)
          break Fail18;
        context.popOnSuccess();
        if(true)
          return term;
      }
      context.popOnFailure();
      return null;
    }
  }

  @SuppressWarnings("all") public static class add_external_impl_0_2 extends Strategy 
  { 
    public static add_external_impl_0_2 instance = new add_external_impl_0_2();

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm r_9, IStrategoTerm s_9)
    { 
      context.push("add_external_impl_0_2");
      Fail19:
      { 
        IStrategoTerm v_9 = null;
        IStrategoTerm w_9 = null;
        IStrategoTerm x_9 = null;
        IStrategoTerm y_9 = null;
        IStrategoTerm z_9 = null;
        IStrategoTerm n_10 = null;
        IStrategoTerm o_10 = null;
        IStrategoTerm u_10 = null;
        IStrategoTerm x_10 = null;
        IStrategoTerm y_10 = null;
        v_9 = term;
        term = new_hashtable_0_0.instance.invoke(context, term);
        if(term == null)
          break Fail19;
        w_9 = term;
        term = new_hashtable_0_0.instance.invoke(context, term);
        if(term == null)
          break Fail19;
        y_9 = term;
        term = new_hashtable_0_0.instance.invoke(context, term);
        if(term == null)
          break Fail19;
        z_9 = term;
        term = new_iset_0_0.instance.invoke(context, term);
        if(term == null)
          break Fail19;
        x_9 = term;
        term = v_9;
        u_10 = v_9;
        term = new_hashtable_0_0.instance.invoke(context, term);
        if(term == null)
          break Fail19;
        n_10 = term;
        x_10 = u_10;
        o_10 = transform.constNone0;
        y_10 = x_10;
        term = add_external_impl_0_9.instance.invokeDynamic(context, y_10, NO_STRATEGIES, new IStrategoTerm[]{w_9, n_10, x_9, y_9, r_9, z_9, o_10, transform.constFalse0, s_9});
        if(term == null)
          break Fail19;
        context.popOnSuccess();
        if(true)
          return term;
      }
      context.popOnFailure();
      return null;
    }
  }

  @SuppressWarnings("all") public static class add_external_impl_0_9 extends Strategy 
  { 
    public static add_external_impl_0_9 instance = new add_external_impl_0_9();

    public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm ref_z_10, IStrategoTerm ref_a_11, IStrategoTerm ref_b_11, IStrategoTerm ref_c_11, IStrategoTerm ref_d_11, IStrategoTerm ref_e_11, IStrategoTerm ref_f_11, IStrategoTerm ref_g_11, IStrategoTerm ref_h_11)
    { 
      ITermFactory termFactory = context.getFactory();
      TermReference z_10 = new TermReference(ref_z_10);
      TermReference a_11 = new TermReference(ref_a_11);
      TermReference b_11 = new TermReference(ref_b_11);
      TermReference c_11 = new TermReference(ref_c_11);
      TermReference d_11 = new TermReference(ref_d_11);
      TermReference e_11 = new TermReference(ref_e_11);
      TermReference f_11 = new TermReference(ref_f_11);
      TermReference g_11 = new TermReference(ref_g_11);
      TermReference h_11 = new TermReference(ref_h_11);
      context.push("add_external_impl_0_9");
      Fail20:
      { 
        IStrategoTerm i_11 = null;
        TermReference j_11 = new TermReference();
        IStrategoTerm k_11 = null;
        TermReference l_11 = new TermReference();
        IStrategoTerm m_11 = null;
        IStrategoTerm n_11 = null;
        TermReference o_11 = new TermReference();
        TermReference p_11 = new TermReference();
        TermReference q_11 = new TermReference();
        TermReference r_11 = new TermReference();
        TermReference s_11 = new TermReference();
        TermReference t_11 = new TermReference();
        TermReference u_11 = new TermReference();
        TermReference v_11 = new TermReference();
        TermReference w_11 = new TermReference();
        TermReference x_11 = new TermReference();
        TermReference y_11 = new TermReference();
        TermReference z_11 = new TermReference();
        TermReference a_12 = new TermReference();
        TermReference b_12 = new TermReference();
        TermReference c_12 = new TermReference();
        TermReference d_12 = new TermReference();
        TermReference e_12 = new TermReference();
        TermReference f_12 = new TermReference();
        TermReference g_12 = new TermReference();
        IStrategoTerm h_12 = null;
        if(f_12.value == null)
          f_12.value = term;
        else
          if(f_12.value != term && !f_12.value.match(term))
            break Fail20;
        h_12 = term;
        if(g_12.value == null)
          g_12.value = term;
        else
          if(g_12.value != term && !g_12.value.match(term))
            break Fail20;
        term = h_12;
        IStrategoTerm term16 = term;
        Success16:
        { 
          Fail21:
          { 
            IStrategoTerm i_12 = null;
            i_12 = term;
            if(g_12.value == null)
              break Fail21;
            term = g_12.value;
            if(term.getTermType() != IStrategoTerm.APPL || transform._consBlock_1 != ((IStrategoAppl)term).getConstructor())
              break Fail21;
            term = i_12;
            { 
              term = new_hashtable_0_0.instance.invoke(context, term);
              if(term == null)
                break Fail20;
              if(l_11.value == null)
                l_11.value = term;
              else
                if(l_11.value != term && !l_11.value.match(term))
                  break Fail20;
              if(f_12.value == null)
                break Fail20;
              term = f_12.value;
              lifted2 lifted210 = new lifted2();
              lifted210.z_10 = z_10;
              lifted210.a_11 = a_11;
              lifted210.b_11 = b_11;
              lifted210.l_11 = l_11;
              lifted210.d_11 = d_11;
              lifted210.e_11 = e_11;
              lifted210.f_11 = f_11;
              lifted210.g_11 = g_11;
              lifted210.h_11 = h_11;
              term = SRTS_all.instance.invoke(context, term, lifted210);
              if(term == null)
                break Fail20;
              m_11 = term;
              if(l_11.value == null)
                break Fail20;
              term = hashtable_keys_0_0.instance.invoke(context, l_11.value);
              if(term == null)
                break Fail20;
              lifted3 lifted310 = new lifted3();
              lifted310.z_10 = z_10;
              lifted310.l_11 = l_11;
              term = map_1_0.instance.invoke(context, term, lifted310);
              if(term == null)
                break Fail20;
              term = m_11;
              if(true)
                break Success16;
            }
          }
          term = term16;
          IStrategoTerm term17 = term;
          Success17:
          { 
            Fail22:
            { 
              IStrategoTerm j_12 = null;
              j_12 = term;
              if(g_12.value == null)
                break Fail22;
              term = g_12.value;
              if(term.getTermType() != IStrategoTerm.APPL || transform._consMethodDec_2 != ((IStrategoAppl)term).getConstructor())
                break Fail22;
              i_11 = term.getSubterm(0);
              k_11 = term.getSubterm(1);
              term = j_12;
              { 
                term = new_hashtable_0_0.instance.invoke(context, term);
                if(term == null)
                  break Fail20;
                if(l_11.value == null)
                  l_11.value = term;
                else
                  if(l_11.value != term && !l_11.value.match(term))
                    break Fail20;
                Success18:
                { 
                  Fail23:
                  { 
                    IStrategoTerm k_12 = null;
                    k_12 = term;
                    term = is__on__entry__or__on__exit__method_0_0.instance.invoke(context, i_11);
                    if(term == null)
                      break Fail23;
                    term = k_12;
                    { 
                      term = transform.constTrue0;
                      if(j_11.value == null)
                        j_11.value = term;
                      else
                        if(j_11.value != term && !j_11.value.match(term))
                          break Fail20;
                      if(true)
                        break Success18;
                    }
                  }
                  term = transform.constFalse0;
                  if(j_11.value == null)
                    j_11.value = term;
                  else
                    if(j_11.value != term && !j_11.value.match(term))
                      break Fail20;
                }
                term = i_11;
                lifted4 lifted410 = new lifted4();
                lifted410.z_10 = z_10;
                lifted410.l_11 = l_11;
                lifted410.a_11 = a_11;
                lifted410.f_11 = f_11;
                term = topdown_1_0.instance.invoke(context, term, lifted410);
                if(term == null)
                  break Fail20;
                term = k_11;
                lifted6 lifted610 = new lifted6();
                lifted610.z_10 = z_10;
                lifted610.a_11 = a_11;
                lifted610.b_11 = b_11;
                lifted610.l_11 = l_11;
                lifted610.d_11 = d_11;
                lifted610.e_11 = e_11;
                lifted610.f_11 = f_11;
                lifted610.j_11 = j_11;
                lifted610.h_11 = h_11;
                term = SRTS_all.instance.invoke(context, term, lifted610);
                if(term == null)
                  break Fail20;
                term = termFactory.makeAppl(transform._consMethodDec_2, new IStrategoTerm[]{i_11, term});
                m_11 = term;
                if(l_11.value == null)
                  break Fail20;
                term = hashtable_keys_0_0.instance.invoke(context, l_11.value);
                if(term == null)
                  break Fail20;
                lifted7 lifted710 = new lifted7();
                lifted710.z_10 = z_10;
                lifted710.l_11 = l_11;
                term = map_1_0.instance.invoke(context, term, lifted710);
                if(term == null)
                  break Fail20;
                term = m_11;
                if(true)
                  break Success17;
              }
            }
            term = term17;
            IStrategoTerm term19 = term;
            Success19:
            { 
              Fail24:
              { 
                IStrategoTerm l_12 = null;
                l_12 = term;
                if(g_12.value == null)
                  break Fail24;
                term = or_2_0.instance.invoke(context, g_12.value, lifted8.instance, lifted9.instance);
                if(term == null)
                  break Fail24;
                term = l_12;
                { 
                  if(f_12.value == null)
                    break Fail20;
                  term = handle_expr_0_7.instance.invokeDynamic(context, f_12.value, NO_STRATEGIES, new IStrategoTerm[]{z_10.value, d_11.value, b_11.value, e_11.value, f_11.value, g_11.value, h_11.value});
                  if(term == null)
                    break Fail20;
                  if(true)
                    break Success19;
                }
              }
              term = term19;
              IStrategoTerm term20 = term;
              Success20:
              { 
                Fail25:
                { 
                  IStrategoTerm m_12 = null;
                  m_12 = term;
                  if(g_12.value == null)
                    break Fail25;
                  term = g_12.value;
                  if(term.getTermType() != IStrategoTerm.APPL || transform._consVarDec_1 != ((IStrategoAppl)term).getConstructor())
                    break Fail25;
                  IStrategoTerm arg16 = term.getSubterm(0);
                  if(arg16.getTermType() != IStrategoTerm.APPL || transform._consId_1 != ((IStrategoAppl)arg16).getConstructor())
                    break Fail25;
                  n_11 = arg16.getSubterm(0);
                  term = m_12;
                  { 
                    term = add__var_0_5.instance.invoke(context, term, n_11, z_10.value, c_11.value, a_11.value, f_11.value);
                    if(term == null)
                      break Fail20;
                    if(true)
                      break Success20;
                  }
                }
                term = term20;
                IStrategoTerm term21 = term;
                Success21:
                { 
                  Fail26:
                  { 
                    IStrategoTerm n_12 = null;
                    n_12 = term;
                    if(g_12.value == null)
                      break Fail26;
                    term = g_12.value;
                    if(term.getTermType() != IStrategoTerm.APPL || transform._consVarDec_2 != ((IStrategoAppl)term).getConstructor())
                      break Fail26;
                    IStrategoTerm arg17 = term.getSubterm(0);
                    if(arg17.getTermType() != IStrategoTerm.APPL || transform._consId_1 != ((IStrategoAppl)arg17).getConstructor())
                      break Fail26;
                    n_11 = arg17.getSubterm(0);
                    if(e_12.value == null)
                      e_12.value = term.getSubterm(1);
                    else
                      if(e_12.value != term.getSubterm(1) && !e_12.value.match(term.getSubterm(1)))
                        break Fail26;
                    term = n_12;
                    { 
                      term = add__var_0_5.instance.invoke(context, term, n_11, z_10.value, c_11.value, a_11.value, f_11.value);
                      if(term == null)
                        break Fail20;
                      if(f_12.value == null)
                        break Fail20;
                      term = f_12.value;
                      lifted10 lifted1010 = new lifted10();
                      lifted1010.z_10 = z_10;
                      lifted1010.a_11 = a_11;
                      lifted1010.b_11 = b_11;
                      lifted1010.c_11 = c_11;
                      lifted1010.d_11 = d_11;
                      lifted1010.e_11 = e_11;
                      lifted1010.f_11 = f_11;
                      lifted1010.g_11 = g_11;
                      lifted1010.h_11 = h_11;
                      term = SRTS_all.instance.invoke(context, term, lifted1010);
                      if(term == null)
                        break Fail20;
                      if(true)
                        break Success21;
                    }
                  }
                  term = term21;
                  IStrategoTerm term22 = term;
                  Success22:
                  { 
                    Fail27:
                    { 
                      IStrategoTerm o_12 = null;
                      o_12 = term;
                      if(g_12.value == null)
                        break Fail27;
                      term = g_12.value;
                      lifted12 lifted1210 = new lifted12();
                      lifted11 lifted1110 = new lifted11();
                      lifted1210.d_12 = d_12;
                      lifted1210.o_11 = o_11;
                      lifted1110.d_12 = d_12;
                      lifted1110.o_11 = o_11;
                      term = or_2_0.instance.invoke(context, term, lifted1110, lifted1210);
                      if(term == null)
                        break Fail27;
                      term = o_12;
                      { 
                        if(f_12.value == null)
                          break Fail20;
                        term = f_12.value;
                        lifted13 lifted134 = new lifted13();
                        lifted134.z_10 = z_10;
                        lifted134.a_11 = a_11;
                        lifted134.b_11 = b_11;
                        lifted134.c_11 = c_11;
                        lifted134.d_11 = d_11;
                        lifted134.e_11 = e_11;
                        lifted134.d_12 = d_12;
                        lifted134.g_11 = g_11;
                        lifted134.h_11 = h_11;
                        term = SRTS_all.instance.invoke(context, term, lifted134);
                        if(term == null)
                          break Fail20;
                        if(true)
                          break Success22;
                      }
                    }
                    term = term22;
                    IStrategoTerm term23 = term;
                    Success23:
                    { 
                      Fail28:
                      { 
                        IStrategoTerm p_12 = null;
                        p_12 = term;
                        if(g_12.value == null)
                          break Fail28;
                        term = g_12.value;
                        lifted15 lifted150 = new lifted15();
                        lifted14 lifted140 = new lifted14();
                        lifted150.v_11 = v_11;
                        lifted150.w_11 = w_11;
                        lifted140.v_11 = v_11;
                        lifted140.w_11 = w_11;
                        term = or_2_0.instance.invoke(context, term, lifted140, lifted150);
                        if(term == null)
                          break Fail28;
                        term = p_12;
                        { 
                          if(f_12.value == null)
                            break Fail20;
                          term = f_12.value;
                          lifted16 lifted160 = new lifted16();
                          lifted160.v_11 = v_11;
                          lifted160.w_11 = w_11;
                          lifted160.z_10 = z_10;
                          lifted160.a_11 = a_11;
                          lifted160.b_11 = b_11;
                          lifted160.c_11 = c_11;
                          lifted160.d_11 = d_11;
                          lifted160.e_11 = e_11;
                          lifted160.g_11 = g_11;
                          lifted160.h_11 = h_11;
                          term = SRTS_all.instance.invoke(context, term, lifted160);
                          if(term == null)
                            break Fail20;
                          if(true)
                            break Success23;
                        }
                      }
                      term = term23;
                      IStrategoTerm term24 = term;
                      Success24:
                      { 
                        Fail29:
                        { 
                          IStrategoTerm q_12 = null;
                          q_12 = term;
                          if(g_12.value == null)
                            break Fail29;
                          term = g_12.value;
                          lifted20 lifted200 = new lifted20();
                          lifted17 lifted170 = new lifted17();
                          lifted200.v_11 = v_11;
                          lifted200.w_11 = w_11;
                          lifted170.v_11 = v_11;
                          lifted170.w_11 = w_11;
                          term = or_2_0.instance.invoke(context, term, lifted170, lifted200);
                          if(term == null)
                            break Fail29;
                          term = q_12;
                          { 
                            IStrategoTerm term25 = term;
                            Success25:
                            { 
                              Fail30:
                              { 
                                IStrategoTerm r_12 = null;
                                r_12 = term;
                                if(f_11.value == null)
                                  break Fail30;
                                term = termFactory.makeTuple(f_11.value, transform.constNone0);
                                term = equal_0_0.instance.invoke(context, term);
                                if(term == null)
                                  break Fail30;
                                term = r_12;
                                { 
                                  if(f_12.value == null)
                                    break Fail20;
                                  term = f_12.value;
                                  lifted21 lifted211 = new lifted21();
                                  lifted211.v_11 = v_11;
                                  lifted211.w_11 = w_11;
                                  lifted211.f_11 = f_11;
                                  lifted211.z_10 = z_10;
                                  lifted211.a_11 = a_11;
                                  lifted211.b_11 = b_11;
                                  lifted211.c_11 = c_11;
                                  lifted211.d_11 = d_11;
                                  lifted211.e_11 = e_11;
                                  lifted211.g_11 = g_11;
                                  lifted211.h_11 = h_11;
                                  term = SRTS_all.instance.invoke(context, term, lifted211);
                                  if(term == null)
                                    break Fail20;
                                  if(true)
                                    break Success25;
                                }
                              }
                              term = term25;
                              if(f_12.value == null)
                                break Fail20;
                              term = f_12.value;
                              lifted22 lifted220 = new lifted22();
                              lifted220.f_11 = f_11;
                              lifted220.z_10 = z_10;
                              lifted220.a_11 = a_11;
                              lifted220.b_11 = b_11;
                              lifted220.c_11 = c_11;
                              lifted220.d_11 = d_11;
                              lifted220.e_11 = e_11;
                              lifted220.g_11 = g_11;
                              lifted220.h_11 = h_11;
                              term = SRTS_all.instance.invoke(context, term, lifted220);
                              if(term == null)
                                break Fail20;
                            }
                            if(true)
                              break Success24;
                          }
                        }
                        term = term24;
                        IStrategoTerm term26 = term;
                        Success26:
                        { 
                          Fail31:
                          { 
                            IStrategoTerm s_12 = null;
                            s_12 = term;
                            if(g_12.value == null)
                              break Fail31;
                            term = or_2_0.instance.invoke(context, g_12.value, lifted23.instance, lifted26.instance);
                            if(term == null)
                              break Fail31;
                            term = s_12;
                            { 
                              if(f_12.value == null)
                                break Fail20;
                              term = f_12.value;
                              lifted29 lifted290 = new lifted29();
                              lifted290.z_10 = z_10;
                              lifted290.a_11 = a_11;
                              lifted290.b_11 = b_11;
                              lifted290.c_11 = c_11;
                              lifted290.d_11 = d_11;
                              lifted290.e_11 = e_11;
                              lifted290.g_11 = g_11;
                              lifted290.h_11 = h_11;
                              term = SRTS_all.instance.invoke(context, term, lifted290);
                              if(term == null)
                                break Fail20;
                              if(true)
                                break Success26;
                            }
                          }
                          term = term26;
                          IStrategoTerm term27 = term;
                          Success27:
                          { 
                            Fail32:
                            { 
                              IStrategoTerm t_12 = null;
                              t_12 = term;
                              if(g_12.value == null)
                                break Fail32;
                              term = g_12.value;
                              lifted37 lifted370 = new lifted37();
                              lifted30 lifted300 = new lifted30();
                              lifted370.v_11 = v_11;
                              lifted370.w_11 = w_11;
                              lifted300.v_11 = v_11;
                              lifted300.w_11 = w_11;
                              term = or_2_0.instance.invoke(context, term, lifted300, lifted370);
                              if(term == null)
                                break Fail32;
                              term = t_12;
                              { 
                                IStrategoTerm term28 = term;
                                Success28:
                                { 
                                  Fail33:
                                  { 
                                    IStrategoTerm u_12 = null;
                                    u_12 = term;
                                    if(f_11.value == null)
                                      break Fail33;
                                    term = termFactory.makeTuple(f_11.value, transform.constNone0);
                                    term = equal_0_0.instance.invoke(context, term);
                                    if(term == null)
                                      break Fail33;
                                    term = u_12;
                                    { 
                                      if(f_12.value == null)
                                        break Fail20;
                                      term = f_12.value;
                                      lifted38 lifted380 = new lifted38();
                                      lifted380.z_10 = z_10;
                                      lifted380.a_11 = a_11;
                                      lifted380.b_11 = b_11;
                                      lifted380.c_11 = c_11;
                                      lifted380.d_11 = d_11;
                                      lifted380.e_11 = e_11;
                                      lifted380.g_11 = g_11;
                                      lifted380.h_11 = h_11;
                                      term = SRTS_all.instance.invoke(context, term, lifted380);
                                      if(term == null)
                                        break Fail20;
                                      if(true)
                                        break Success28;
                                    }
                                  }
                                  term = term28;
                                  if(f_12.value == null)
                                    break Fail20;
                                  term = f_12.value;
                                  lifted39 lifted390 = new lifted39();
                                  lifted390.f_11 = f_11;
                                  lifted390.z_10 = z_10;
                                  lifted390.a_11 = a_11;
                                  lifted390.b_11 = b_11;
                                  lifted390.c_11 = c_11;
                                  lifted390.d_11 = d_11;
                                  lifted390.e_11 = e_11;
                                  lifted390.g_11 = g_11;
                                  lifted390.h_11 = h_11;
                                  term = SRTS_all.instance.invoke(context, term, lifted390);
                                  if(term == null)
                                    break Fail20;
                                }
                                if(true)
                                  break Success27;
                              }
                            }
                            term = term27;
                            IStrategoTerm term29 = term;
                            Success29:
                            { 
                              Fail34:
                              { 
                                IStrategoTerm v_12 = null;
                                v_12 = term;
                                if(g_12.value == null)
                                  break Fail34;
                                term = g_12.value;
                                if(term.getTermType() != IStrategoTerm.APPL || transform._consLeftShift_2 != ((IStrategoAppl)term).getConstructor())
                                  break Fail34;
                                if(v_11.value == null)
                                  v_11.value = term.getSubterm(0);
                                else
                                  if(v_11.value != term.getSubterm(0) && !v_11.value.match(term.getSubterm(0)))
                                    break Fail34;
                                if(w_11.value == null)
                                  w_11.value = term.getSubterm(1);
                                else
                                  if(w_11.value != term.getSubterm(1) && !w_11.value.match(term.getSubterm(1)))
                                    break Fail34;
                                term = v_12;
                                { 
                                  IStrategoTerm h_16 = null;
                                  IStrategoTerm k_16 = null;
                                  IStrategoTerm q_16 = null;
                                  IStrategoTerm term30 = term;
                                  Success30:
                                  { 
                                    Fail35:
                                    { 
                                      IStrategoTerm w_12 = null;
                                      w_12 = term;
                                      if(f_11.value == null)
                                        break Fail35;
                                      term = termFactory.makeTuple(f_11.value, transform.constNone0);
                                      term = equal_0_0.instance.invoke(context, term);
                                      if(term == null)
                                        break Fail35;
                                      term = w_12;
                                      { 
                                        if(v_11.value == null)
                                          break Fail20;
                                        term = get_type_of_0_3.instance.invoke(context, v_11.value, f_11.value, z_10.value, a_11.value);
                                        if(term == null)
                                          break Fail20;
                                        term = cast_shift_type_0_0.instance.invoke(context, term);
                                        if(term == null)
                                          break Fail20;
                                        if(q_11.value == null)
                                          q_11.value = term;
                                        else
                                          if(q_11.value != term && !q_11.value.match(term))
                                            break Fail20;
                                        if(true)
                                          break Success30;
                                      }
                                    }
                                    term = term30;
                                    if(f_11.value == null)
                                      break Fail20;
                                    term = cast_shift_type_0_0.instance.invoke(context, f_11.value);
                                    if(term == null)
                                      break Fail20;
                                    if(q_11.value == null)
                                      q_11.value = term;
                                    else
                                      if(q_11.value != term && !q_11.value.match(term))
                                        break Fail20;
                                  }
                                  k_16 = term;
                                  if(v_11.value == null)
                                    break Fail20;
                                  term = this.invokeDynamic(context, v_11.value, NO_STRATEGIES, new IStrategoTerm[]{z_10.value, a_11.value, b_11.value, c_11.value, d_11.value, e_11.value, q_11.value, g_11.value, h_11.value});
                                  if(term == null)
                                    break Fail20;
                                  h_16 = term;
                                  term = k_16;
                                  if(w_11.value == null)
                                    break Fail20;
                                  q_16 = w_11.value;
                                  term = this.invokeDynamic(context, q_16, NO_STRATEGIES, new IStrategoTerm[]{z_10.value, a_11.value, b_11.value, c_11.value, d_11.value, e_11.value, transform.constLong0, g_11.value, h_11.value});
                                  if(term == null)
                                    break Fail20;
                                  term = termFactory.makeAppl(transform._consLeftShift_2, new IStrategoTerm[]{h_16, term});
                                  if(true)
                                    break Success29;
                                }
                              }
                              term = term29;
                              add_external_impl_0_9_fragment_1 add_external_impl_0_9_fragment_10 = new add_external_impl_0_9_fragment_1();
                              add_external_impl_0_9_fragment_10.p_11 = p_11;
                              add_external_impl_0_9_fragment_10.q_11 = q_11;
                              add_external_impl_0_9_fragment_10.s_11 = s_11;
                              add_external_impl_0_9_fragment_10.r_11 = r_11;
                              add_external_impl_0_9_fragment_10.t_11 = t_11;
                              add_external_impl_0_9_fragment_10.u_11 = u_11;
                              add_external_impl_0_9_fragment_10.v_11 = v_11;
                              add_external_impl_0_9_fragment_10.w_11 = w_11;
                              add_external_impl_0_9_fragment_10.x_11 = x_11;
                              add_external_impl_0_9_fragment_10.y_11 = y_11;
                              add_external_impl_0_9_fragment_10.z_11 = z_11;
                              add_external_impl_0_9_fragment_10.a_12 = a_12;
                              add_external_impl_0_9_fragment_10.b_12 = b_12;
                              add_external_impl_0_9_fragment_10.c_12 = c_12;
                              add_external_impl_0_9_fragment_10.g_12 = g_12;
                              add_external_impl_0_9_fragment_10.e_12 = e_12;
                              add_external_impl_0_9_fragment_10.d_12 = d_12;
                              add_external_impl_0_9_fragment_10.z_10 = z_10;
                              add_external_impl_0_9_fragment_10.a_11 = a_11;
                              add_external_impl_0_9_fragment_10.b_11 = b_11;
                              add_external_impl_0_9_fragment_10.c_11 = c_11;
                              add_external_impl_0_9_fragment_10.d_11 = d_11;
                              add_external_impl_0_9_fragment_10.e_11 = e_11;
                              add_external_impl_0_9_fragment_10.f_11 = f_11;
                              add_external_impl_0_9_fragment_10.g_11 = g_11;
                              add_external_impl_0_9_fragment_10.h_11 = h_11;
                              add_external_impl_0_9_fragment_10.f_12 = f_12;
                              term = add_external_impl_0_9_fragment_10.invoke(context, term);
                              if(term == null)
                                break Fail20;
                            }
                          }
                        }
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

    @Override public IStrategoTerm invokeDynamic(Context context, IStrategoTerm term, Strategy[] sargs, IStrategoTerm[] targs)
    { 
      if(sargs == null || targs == null || sargs.length != 0 || targs.length != 9)
        throw new IllegalArgumentException("Illegal arguments for " + getName());
      return invoke(context, term, targs[0], targs[1], targs[2], targs[3], targs[4], targs[5], targs[6], targs[7], targs[8]);
    }
  }

  @SuppressWarnings("all") public static class is__on__entry__or__on__exit__method_0_0 extends Strategy 
  { 
    public static is__on__entry__or__on__exit__method_0_0 instance = new is__on__entry__or__on__exit__method_0_0();

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      context.push("is__on__entry__or__on__exit__method_0_0");
      Fail36:
      { 
        TermReference r_23 = new TermReference();
        lifted51 lifted511 = new lifted51();
        lifted50 lifted500 = new lifted50();
        lifted511.r_23 = r_23;
        lifted500.r_23 = r_23;
        term = or_2_0.instance.invoke(context, term, lifted500, lifted511);
        if(term == null)
          break Fail36;
        IStrategoTerm term73 = term;
        Success31:
        { 
          Fail37:
          { 
            IStrategoTerm s_23 = null;
            s_23 = term;
            lifted54 lifted540 = new lifted54();
            lifted52 lifted520 = new lifted52();
            lifted540.r_23 = r_23;
            lifted520.r_23 = r_23;
            term = or_2_0.instance.invoke(context, term, lifted520, lifted540);
            if(term == null)
              break Fail37;
            term = s_23;
            { 
              term = true_0_0.instance.invoke(context, term);
              if(term == null)
                break Fail36;
              if(true)
                break Success31;
            }
          }
          term = false_0_0.instance.invoke(context, term73);
          if(term == null)
            break Fail36;
        }
        context.popOnSuccess();
        if(true)
          return term;
      }
      context.popOnFailure();
      return null;
    }
  }

  @SuppressWarnings("all") public static class add__params_0_4 extends Strategy 
  { 
    public static add__params_0_4 instance = new add__params_0_4();

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm t_23, IStrategoTerm u_23, IStrategoTerm v_23, IStrategoTerm w_23)
    { 
      context.push("add__params_0_4");
      Fail38:
      { 
        TermReference x_23 = new TermReference();
        lifted57 lifted570 = new lifted57();
        lifted56 lifted560 = new lifted56();
        lifted570.x_23 = x_23;
        lifted560.x_23 = x_23;
        term = or_2_0.instance.invoke(context, term, lifted560, lifted570);
        if(term == null)
          break Fail38;
        term = add__var_0_5.instance.invoke(context, term, x_23.value, t_23, u_23, v_23, w_23);
        if(term == null)
          break Fail38;
        context.popOnSuccess();
        if(true)
          return term;
      }
      context.popOnFailure();
      return null;
    }
  }

  @SuppressWarnings("all") public static class add__var_0_5 extends Strategy 
  { 
    public static add__var_0_5 instance = new add__var_0_5();

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm a_24, IStrategoTerm b_24, IStrategoTerm c_24, IStrategoTerm d_24, IStrategoTerm e_24)
    { 
      context.push("add__var_0_5");
      Fail39:
      { 
        term = hashtable_put_0_2.instance.invoke(context, d_24, a_24, e_24);
        if(term == null)
          break Fail39;
        term = increament_0_2.instance.invoke(context, b_24, a_24, b_24);
        if(term == null)
          break Fail39;
        term = increament_0_2.instance.invoke(context, c_24, a_24, c_24);
        if(term == null)
          break Fail39;
        context.popOnSuccess();
        if(true)
          return term;
      }
      context.popOnFailure();
      return null;
    }
  }

  @SuppressWarnings("all") public static class try_to_get_type_0_3 extends Strategy 
  { 
    public static try_to_get_type_0_3 instance = new try_to_get_type_0_3();

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm f_24, IStrategoTerm g_24, IStrategoTerm h_24)
    { 
      ITermFactory termFactory = context.getFactory();
      context.push("try_to_get_type_0_3");
      Fail40:
      { 
        IStrategoTerm i_24 = null;
        IStrategoTerm j_24 = null;
        IStrategoTerm l_24 = null;
        IStrategoTerm m_24 = null;
        if(term.getTermType() != IStrategoTerm.TUPLE || term.getSubtermCount() != 2)
          break Fail40;
        i_24 = term.getSubterm(0);
        l_24 = term.getSubterm(1);
        term = get_type_of_0_3.instance.invoke(context, i_24, f_24, g_24, h_24);
        if(term == null)
          break Fail40;
        j_24 = term;
        Success32:
        { 
          Fail41:
          { 
            IStrategoTerm n_24 = null;
            n_24 = term;
            IStrategoTerm term75 = term;
            Success33:
            { 
              Fail42:
              { 
                term = termFactory.makeTuple(j_24, transform.constNone0);
                term = equal_0_0.instance.invoke(context, term);
                if(term == null)
                  break Fail42;
                { 
                  if(true)
                    break Fail41;
                  if(true)
                    break Success33;
                }
              }
              term = term75;
            }
            term = n_24;
            { 
              term = j_24;
              if(true)
                break Success32;
            }
          }
          term = get_type_of_0_3.instance.invoke(context, l_24, f_24, g_24, h_24);
          if(term == null)
            break Fail40;
          m_24 = term;
          Success34:
          { 
            Fail43:
            { 
              IStrategoTerm o_24 = null;
              o_24 = term;
              IStrategoTerm term77 = term;
              Success35:
              { 
                Fail44:
                { 
                  term = termFactory.makeTuple(m_24, transform.constNone0);
                  term = equal_0_0.instance.invoke(context, term);
                  if(term == null)
                    break Fail44;
                  { 
                    if(true)
                      break Fail43;
                    if(true)
                      break Success35;
                  }
                }
                term = term77;
              }
              term = o_24;
              { 
                term = m_24;
                if(true)
                  break Success34;
              }
            }
            term = debug_0_0.instance.invoke(context, transform.const11);
            if(term == null)
              break Fail40;
            term = transform.const9;
            if(true)
              break Fail40;
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

  @SuppressWarnings("all") public static class cast_equality_type_0_0 extends Strategy 
  { 
    public static cast_equality_type_0_0 instance = new cast_equality_type_0_0();

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      context.push("cast_equality_type_0_0");
      Fail45:
      { 
        IStrategoTerm r_24 = null;
        IStrategoTerm s_24 = null;
        IStrategoTerm t_24 = null;
        r_24 = term;
        t_24 = term;
        s_24 = r_24;
        term = t_24;
        IStrategoTerm term78 = term;
        Success36:
        { 
          Fail46:
          { 
            IStrategoTerm u_24 = null;
            u_24 = term;
            term = s_24;
            if(term.getTermType() != IStrategoTerm.APPL || transform._consByte_0 != ((IStrategoAppl)term).getConstructor())
              break Fail46;
            term = u_24;
            { 
              term = transform.constDouble0;
              if(true)
                break Success36;
            }
          }
          term = term78;
          IStrategoTerm term79 = term;
          Success37:
          { 
            Fail47:
            { 
              IStrategoTerm v_24 = null;
              v_24 = term;
              term = s_24;
              if(term.getTermType() != IStrategoTerm.APPL || transform._consInt_0 != ((IStrategoAppl)term).getConstructor())
                break Fail47;
              term = v_24;
              { 
                term = transform.constDouble0;
                if(true)
                  break Success37;
              }
            }
            term = term79;
            IStrategoTerm term80 = term;
            Success38:
            { 
              Fail48:
              { 
                IStrategoTerm w_24 = null;
                w_24 = term;
                term = s_24;
                if(term.getTermType() != IStrategoTerm.APPL || transform._consShort_0 != ((IStrategoAppl)term).getConstructor())
                  break Fail48;
                term = w_24;
                { 
                  term = transform.constDouble0;
                  if(true)
                    break Success38;
                }
              }
              term = term80;
              IStrategoTerm term81 = term;
              Success39:
              { 
                Fail49:
                { 
                  IStrategoTerm x_24 = null;
                  x_24 = term;
                  term = or_2_0.instance.invoke(context, s_24, lifted58.instance, lifted59.instance);
                  if(term == null)
                    break Fail49;
                  term = x_24;
                  { 
                    term = transform.constDouble0;
                    if(true)
                      break Success39;
                  }
                }
                term = term81;
                IStrategoTerm term82 = term;
                Success40:
                { 
                  Fail50:
                  { 
                    IStrategoTerm y_24 = null;
                    y_24 = term;
                    term = or_2_0.instance.invoke(context, s_24, lifted60.instance, lifted61.instance);
                    if(term == null)
                      break Fail50;
                    term = y_24;
                    { 
                      term = transform.constDouble0;
                      if(true)
                        break Success40;
                    }
                  }
                  term = term82;
                  IStrategoTerm term83 = term;
                  Success41:
                  { 
                    Fail51:
                    { 
                      IStrategoTerm z_24 = null;
                      z_24 = term;
                      term = s_24;
                      if(term.getTermType() != IStrategoTerm.APPL || transform._consLong_0 != ((IStrategoAppl)term).getConstructor())
                        break Fail51;
                      term = z_24;
                      { 
                        term = transform.constDouble0;
                        if(true)
                          break Success41;
                      }
                    }
                    term = term83;
                    IStrategoTerm term84 = term;
                    Success42:
                    { 
                      Fail52:
                      { 
                        IStrategoTerm a_25 = null;
                        a_25 = term;
                        term = s_24;
                        if(term.getTermType() != IStrategoTerm.APPL || transform._consDouble_0 != ((IStrategoAppl)term).getConstructor())
                          break Fail52;
                        term = a_25;
                        { 
                          term = transform.constDouble0;
                          if(true)
                            break Success42;
                        }
                      }
                      term = term84;
                      IStrategoTerm term85 = term;
                      Success43:
                      { 
                        Fail53:
                        { 
                          IStrategoTerm b_25 = null;
                          b_25 = term;
                          term = s_24;
                          if(term.getTermType() != IStrategoTerm.APPL || transform._consDeci_1 != ((IStrategoAppl)term).getConstructor())
                            break Fail53;
                          term = b_25;
                          { 
                            term = transform.constDouble0;
                            if(true)
                              break Success43;
                          }
                        }
                        term = term85;
                        Success44:
                        { 
                          Fail54:
                          { 
                            IStrategoTerm c_25 = null;
                            c_25 = term;
                            term = or_2_0.instance.invoke(context, s_24, lifted62.instance, lifted63.instance);
                            if(term == null)
                              break Fail54;
                            term = c_25;
                            { 
                              term = transform.constBoolean0;
                              if(true)
                                break Success44;
                            }
                          }
                          term = debug_0_0.instance.invoke(context, transform.const12);
                          if(term == null)
                            break Fail45;
                          term = debug_0_0.instance.invoke(context, r_24);
                          if(term == null)
                            break Fail45;
                          term = transform.const9;
                          if(true)
                            break Fail45;
                        }
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

  @SuppressWarnings("all") public static class cast_bounded_conditional_type_0_0 extends Strategy 
  { 
    public static cast_bounded_conditional_type_0_0 instance = new cast_bounded_conditional_type_0_0();

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      context.push("cast_bounded_conditional_type_0_0");
      Fail55:
      { 
        IStrategoTerm f_25 = null;
        IStrategoTerm g_25 = null;
        IStrategoTerm h_25 = null;
        f_25 = term;
        h_25 = term;
        g_25 = f_25;
        term = h_25;
        IStrategoTerm term87 = term;
        Success45:
        { 
          Fail56:
          { 
            IStrategoTerm i_25 = null;
            i_25 = term;
            term = g_25;
            if(term.getTermType() != IStrategoTerm.APPL || transform._consInt_0 != ((IStrategoAppl)term).getConstructor())
              break Fail56;
            term = i_25;
            { 
              term = transform.constInt0;
              if(true)
                break Success45;
            }
          }
          term = term87;
          IStrategoTerm term88 = term;
          Success46:
          { 
            Fail57:
            { 
              IStrategoTerm j_25 = null;
              j_25 = term;
              term = g_25;
              if(term.getTermType() != IStrategoTerm.APPL || transform._consLong_0 != ((IStrategoAppl)term).getConstructor())
                break Fail57;
              term = j_25;
              { 
                term = transform.constLong0;
                if(true)
                  break Success46;
              }
            }
            term = term88;
            IStrategoTerm term89 = term;
            Success47:
            { 
              Fail58:
              { 
                IStrategoTerm k_25 = null;
                k_25 = term;
                term = g_25;
                if(term.getTermType() != IStrategoTerm.APPL || transform._consDeci_1 != ((IStrategoAppl)term).getConstructor())
                  break Fail58;
                term = k_25;
                { 
                  term = transform.constLong0;
                  if(true)
                    break Success47;
                }
              }
              term = term89;
              IStrategoTerm term90 = term;
              Success48:
              { 
                Fail59:
                { 
                  IStrategoTerm l_25 = null;
                  l_25 = term;
                  term = g_25;
                  if(term.getTermType() != IStrategoTerm.APPL || transform._consDouble_0 != ((IStrategoAppl)term).getConstructor())
                    break Fail59;
                  term = l_25;
                  { 
                    term = transform.constLong0;
                    if(true)
                      break Success48;
                  }
                }
                term = term90;
                Success49:
                { 
                  Fail60:
                  { 
                    IStrategoTerm m_25 = null;
                    m_25 = term;
                    term = or_2_0.instance.invoke(context, g_25, lifted64.instance, lifted65.instance);
                    if(term == null)
                      break Fail60;
                    term = m_25;
                    { 
                      term = transform.constBoolean0;
                      if(true)
                        break Success49;
                    }
                  }
                  term = debug_0_0.instance.invoke(context, transform.const12);
                  if(term == null)
                    break Fail55;
                  term = debug_0_0.instance.invoke(context, f_25);
                  if(term == null)
                    break Fail55;
                  term = transform.const9;
                  if(true)
                    break Fail55;
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

  @SuppressWarnings("all") public static class cast_shift_type_0_0 extends Strategy 
  { 
    public static cast_shift_type_0_0 instance = new cast_shift_type_0_0();

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      context.push("cast_shift_type_0_0");
      Fail61:
      { 
        IStrategoTerm r_25 = null;
        IStrategoTerm s_25 = null;
        IStrategoTerm t_25 = null;
        r_25 = term;
        t_25 = term;
        s_25 = r_25;
        term = t_25;
        IStrategoTerm term92 = term;
        Success50:
        { 
          Fail62:
          { 
            IStrategoTerm u_25 = null;
            u_25 = term;
            term = s_25;
            if(term.getTermType() != IStrategoTerm.APPL || transform._consByte_0 != ((IStrategoAppl)term).getConstructor())
              break Fail62;
            term = u_25;
            { 
              term = transform.constInt0;
              if(true)
                break Success50;
            }
          }
          term = term92;
          IStrategoTerm term93 = term;
          Success51:
          { 
            Fail63:
            { 
              IStrategoTerm v_25 = null;
              v_25 = term;
              term = s_25;
              if(term.getTermType() != IStrategoTerm.APPL || transform._consShort_0 != ((IStrategoAppl)term).getConstructor())
                break Fail63;
              term = v_25;
              { 
                term = transform.constInt0;
                if(true)
                  break Success51;
              }
            }
            term = term93;
            IStrategoTerm term94 = term;
            Success52:
            { 
              Fail64:
              { 
                IStrategoTerm w_25 = null;
                w_25 = term;
                term = s_25;
                if(term.getTermType() != IStrategoTerm.APPL || transform._consInt_0 != ((IStrategoAppl)term).getConstructor())
                  break Fail64;
                term = w_25;
                { 
                  term = transform.constInt0;
                  if(true)
                    break Success52;
                }
              }
              term = term94;
              IStrategoTerm term95 = term;
              Success53:
              { 
                Fail65:
                { 
                  IStrategoTerm x_25 = null;
                  x_25 = term;
                  term = s_25;
                  if(term.getTermType() != IStrategoTerm.APPL || transform._consLong_0 != ((IStrategoAppl)term).getConstructor())
                    break Fail65;
                  term = x_25;
                  { 
                    term = transform.constLong0;
                    if(true)
                      break Success53;
                  }
                }
                term = term95;
                IStrategoTerm term96 = term;
                Success54:
                { 
                  Fail66:
                  { 
                    IStrategoTerm y_25 = null;
                    y_25 = term;
                    term = or_2_0.instance.invoke(context, s_25, lifted66.instance, lifted67.instance);
                    if(term == null)
                      break Fail66;
                    term = y_25;
                    { 
                      term = transform.constLong0;
                      if(true)
                        break Success54;
                    }
                  }
                  term = term96;
                  IStrategoTerm term97 = term;
                  Success55:
                  { 
                    Fail67:
                    { 
                      IStrategoTerm z_25 = null;
                      z_25 = term;
                      term = s_25;
                      if(term.getTermType() != IStrategoTerm.APPL || transform._consDouble_0 != ((IStrategoAppl)term).getConstructor())
                        break Fail67;
                      term = z_25;
                      { 
                        term = transform.constLong0;
                        if(true)
                          break Success55;
                      }
                    }
                    term = term97;
                    Success56:
                    { 
                      Fail68:
                      { 
                        IStrategoTerm a_26 = null;
                        a_26 = term;
                        term = s_25;
                        if(term.getTermType() != IStrategoTerm.APPL || transform._consDeci_1 != ((IStrategoAppl)term).getConstructor())
                          break Fail68;
                        term = a_26;
                        { 
                          term = transform.constLong0;
                          if(true)
                            break Success56;
                        }
                      }
                      term = debug_0_0.instance.invoke(context, transform.const12);
                      if(term == null)
                        break Fail61;
                      term = debug_0_0.instance.invoke(context, r_25);
                      if(term == null)
                        break Fail61;
                      term = transform.const9;
                      if(true)
                        break Fail61;
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

  @SuppressWarnings("all") public static class cast_bounded_arithmetic_type_0_0 extends Strategy 
  { 
    public static cast_bounded_arithmetic_type_0_0 instance = new cast_bounded_arithmetic_type_0_0();

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      context.push("cast_bounded_arithmetic_type_0_0");
      Fail69:
      { 
        IStrategoTerm d_26 = null;
        IStrategoTerm e_26 = null;
        IStrategoTerm f_26 = null;
        d_26 = term;
        f_26 = term;
        e_26 = d_26;
        term = f_26;
        IStrategoTerm term99 = term;
        Success57:
        { 
          Fail70:
          { 
            IStrategoTerm g_26 = null;
            g_26 = term;
            term = e_26;
            if(term.getTermType() != IStrategoTerm.APPL || transform._consByte_0 != ((IStrategoAppl)term).getConstructor())
              break Fail70;
            term = g_26;
            { 
              term = transform.constInt0;
              if(true)
                break Success57;
            }
          }
          term = term99;
          IStrategoTerm term100 = term;
          Success58:
          { 
            Fail71:
            { 
              IStrategoTerm h_26 = null;
              h_26 = term;
              term = e_26;
              if(term.getTermType() != IStrategoTerm.APPL || transform._consShort_0 != ((IStrategoAppl)term).getConstructor())
                break Fail71;
              term = h_26;
              { 
                term = transform.constInt0;
                if(true)
                  break Success58;
              }
            }
            term = term100;
            IStrategoTerm term101 = term;
            Success59:
            { 
              Fail72:
              { 
                IStrategoTerm i_26 = null;
                i_26 = term;
                term = e_26;
                if(term.getTermType() != IStrategoTerm.APPL || transform._consInt_0 != ((IStrategoAppl)term).getConstructor())
                  break Fail72;
                term = i_26;
                { 
                  term = transform.constInt0;
                  if(true)
                    break Success59;
                }
              }
              term = term101;
              IStrategoTerm term102 = term;
              Success60:
              { 
                Fail73:
                { 
                  IStrategoTerm j_26 = null;
                  j_26 = term;
                  term = e_26;
                  if(term.getTermType() != IStrategoTerm.APPL || transform._consLong_0 != ((IStrategoAppl)term).getConstructor())
                    break Fail73;
                  term = j_26;
                  { 
                    term = transform.constLong0;
                    if(true)
                      break Success60;
                  }
                }
                term = term102;
                IStrategoTerm term103 = term;
                Success61:
                { 
                  Fail74:
                  { 
                    IStrategoTerm k_26 = null;
                    k_26 = term;
                    term = or_2_0.instance.invoke(context, e_26, lifted68.instance, lifted69.instance);
                    if(term == null)
                      break Fail74;
                    term = k_26;
                    { 
                      term = transform.constFloat0;
                      if(true)
                        break Success61;
                    }
                  }
                  term = term103;
                  IStrategoTerm term104 = term;
                  Success62:
                  { 
                    Fail75:
                    { 
                      IStrategoTerm l_26 = null;
                      l_26 = term;
                      term = e_26;
                      if(term.getTermType() != IStrategoTerm.APPL || transform._consDouble_0 != ((IStrategoAppl)term).getConstructor())
                        break Fail75;
                      term = l_26;
                      { 
                        term = transform.constDouble0;
                        if(true)
                          break Success62;
                      }
                    }
                    term = term104;
                    Success63:
                    { 
                      Fail76:
                      { 
                        IStrategoTerm m_26 = null;
                        m_26 = term;
                        term = e_26;
                        if(term.getTermType() != IStrategoTerm.APPL || transform._consDeci_1 != ((IStrategoAppl)term).getConstructor())
                          break Fail76;
                        term = m_26;
                        { 
                          term = transform.constLong0;
                          if(true)
                            break Success63;
                        }
                      }
                      term = debug_0_0.instance.invoke(context, transform.const12);
                      if(term == null)
                        break Fail69;
                      term = debug_0_0.instance.invoke(context, d_26);
                      if(term == null)
                        break Fail69;
                      term = transform.const9;
                      if(true)
                        break Fail69;
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

  @SuppressWarnings("all") public static class cast_conditional_type_0_0 extends Strategy 
  { 
    public static cast_conditional_type_0_0 instance = new cast_conditional_type_0_0();

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      context.push("cast_conditional_type_0_0");
      Fail77:
      { 
        IStrategoTerm p_26 = null;
        IStrategoTerm s_26 = null;
        IStrategoTerm u_26 = null;
        p_26 = term;
        u_26 = term;
        s_26 = p_26;
        term = u_26;
        IStrategoTerm term106 = term;
        Success64:
        { 
          Fail78:
          { 
            IStrategoTerm v_26 = null;
            v_26 = term;
            term = s_26;
            if(term.getTermType() != IStrategoTerm.APPL || transform._consByte_0 != ((IStrategoAppl)term).getConstructor())
              break Fail78;
            term = v_26;
            { 
              term = transform.constLong0;
              if(true)
                break Success64;
            }
          }
          term = term106;
          IStrategoTerm term107 = term;
          Success65:
          { 
            Fail79:
            { 
              IStrategoTerm w_26 = null;
              w_26 = term;
              term = or_2_0.instance.invoke(context, s_26, lifted70.instance, lifted71.instance);
              if(term == null)
                break Fail79;
              term = w_26;
              { 
                term = transform.constLong0;
                if(true)
                  break Success65;
              }
            }
            term = term107;
            IStrategoTerm term108 = term;
            Success66:
            { 
              Fail80:
              { 
                IStrategoTerm x_26 = null;
                x_26 = term;
                term = s_26;
                if(term.getTermType() != IStrategoTerm.APPL || transform._consShort_0 != ((IStrategoAppl)term).getConstructor())
                  break Fail80;
                term = x_26;
                { 
                  term = transform.constLong0;
                  if(true)
                    break Success66;
                }
              }
              term = term108;
              IStrategoTerm term109 = term;
              Success67:
              { 
                Fail81:
                { 
                  IStrategoTerm z_26 = null;
                  z_26 = term;
                  term = s_26;
                  if(term.getTermType() != IStrategoTerm.APPL || transform._consInt_0 != ((IStrategoAppl)term).getConstructor())
                    break Fail81;
                  term = z_26;
                  { 
                    term = transform.constLong0;
                    if(true)
                      break Success67;
                  }
                }
                term = term109;
                IStrategoTerm term110 = term;
                Success68:
                { 
                  Fail82:
                  { 
                    IStrategoTerm b_27 = null;
                    b_27 = term;
                    term = s_26;
                    if(term.getTermType() != IStrategoTerm.APPL || transform._consLong_0 != ((IStrategoAppl)term).getConstructor())
                      break Fail82;
                    term = b_27;
                    { 
                      term = transform.constLong0;
                      if(true)
                        break Success68;
                    }
                  }
                  term = term110;
                  IStrategoTerm term111 = term;
                  Success69:
                  { 
                    Fail83:
                    { 
                      IStrategoTerm c_27 = null;
                      c_27 = term;
                      term = s_26;
                      if(term.getTermType() != IStrategoTerm.APPL || transform._consDeci_1 != ((IStrategoAppl)term).getConstructor())
                        break Fail83;
                      term = c_27;
                      { 
                        term = transform.constLong0;
                        if(true)
                          break Success69;
                      }
                    }
                    term = term111;
                    Success70:
                    { 
                      Fail84:
                      { 
                        IStrategoTerm e_27 = null;
                        e_27 = term;
                        term = or_2_0.instance.invoke(context, s_26, lifted72.instance, lifted73.instance);
                        if(term == null)
                          break Fail84;
                        term = e_27;
                        { 
                          term = transform.constBoolean0;
                          if(true)
                            break Success70;
                        }
                      }
                      term = debug_0_0.instance.invoke(context, transform.const12);
                      if(term == null)
                        break Fail77;
                      term = debug_0_0.instance.invoke(context, p_26);
                      if(term == null)
                        break Fail77;
                      term = transform.const9;
                      if(true)
                        break Fail77;
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

  @SuppressWarnings("all") public static class ensure__number_0_0 extends Strategy 
  { 
    public static ensure__number_0_0 instance = new ensure__number_0_0();

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      context.push("ensure__number_0_0");
      Fail85:
      { 
        IStrategoTerm m_27 = null;
        IStrategoTerm n_27 = null;
        IStrategoTerm o_27 = null;
        m_27 = term;
        o_27 = term;
        n_27 = m_27;
        term = o_27;
        IStrategoTerm term113 = term;
        Success71:
        { 
          Fail86:
          { 
            IStrategoTerm p_27 = null;
            p_27 = term;
            term = n_27;
            if(term.getTermType() != IStrategoTerm.APPL || transform._consByte_0 != ((IStrategoAppl)term).getConstructor())
              break Fail86;
            term = p_27;
            { 
              term = transform.constByte0;
              if(true)
                break Success71;
            }
          }
          term = term113;
          IStrategoTerm term114 = term;
          Success72:
          { 
            Fail87:
            { 
              IStrategoTerm q_27 = null;
              q_27 = term;
              term = or_2_0.instance.invoke(context, n_27, lifted74.instance, lifted75.instance);
              if(term == null)
                break Fail87;
              term = q_27;
              { 
                term = transform.constChar0;
                if(true)
                  break Success72;
              }
            }
            term = term114;
            IStrategoTerm term115 = term;
            Success73:
            { 
              Fail88:
              { 
                IStrategoTerm r_27 = null;
                r_27 = term;
                term = n_27;
                if(term.getTermType() != IStrategoTerm.APPL || transform._consShort_0 != ((IStrategoAppl)term).getConstructor())
                  break Fail88;
                term = r_27;
                { 
                  term = transform.constShort0;
                  if(true)
                    break Success73;
                }
              }
              term = term115;
              IStrategoTerm term116 = term;
              Success74:
              { 
                Fail89:
                { 
                  IStrategoTerm t_27 = null;
                  t_27 = term;
                  term = n_27;
                  if(term.getTermType() != IStrategoTerm.APPL || transform._consInt_0 != ((IStrategoAppl)term).getConstructor())
                    break Fail89;
                  term = t_27;
                  { 
                    term = transform.constInt0;
                    if(true)
                      break Success74;
                  }
                }
                term = term116;
                IStrategoTerm term117 = term;
                Success75:
                { 
                  Fail90:
                  { 
                    IStrategoTerm u_27 = null;
                    u_27 = term;
                    term = n_27;
                    if(term.getTermType() != IStrategoTerm.APPL || transform._consLong_0 != ((IStrategoAppl)term).getConstructor())
                      break Fail90;
                    term = u_27;
                    { 
                      term = transform.constLong0;
                      if(true)
                        break Success75;
                    }
                  }
                  term = term117;
                  IStrategoTerm term118 = term;
                  Success76:
                  { 
                    Fail91:
                    { 
                      IStrategoTerm v_27 = null;
                      v_27 = term;
                      term = n_27;
                      if(term.getTermType() != IStrategoTerm.APPL || transform._consDeci_1 != ((IStrategoAppl)term).getConstructor())
                        break Fail91;
                      term = v_27;
                      { 
                        term = transform.constLong0;
                        if(true)
                          break Success76;
                      }
                    }
                    term = term118;
                    IStrategoTerm term119 = term;
                    Success77:
                    { 
                      Fail92:
                      { 
                        IStrategoTerm w_27 = null;
                        w_27 = term;
                        term = or_2_0.instance.invoke(context, n_27, lifted76.instance, lifted77.instance);
                        if(term == null)
                          break Fail92;
                        term = w_27;
                        { 
                          term = transform.constFloat0;
                          if(true)
                            break Success77;
                        }
                      }
                      term = term119;
                      Success78:
                      { 
                        Fail93:
                        { 
                          IStrategoTerm x_27 = null;
                          x_27 = term;
                          term = n_27;
                          if(term.getTermType() != IStrategoTerm.APPL || transform._consDouble_0 != ((IStrategoAppl)term).getConstructor())
                            break Fail93;
                          term = x_27;
                          { 
                            term = transform.constDouble0;
                            if(true)
                              break Success78;
                          }
                        }
                        term = debug_0_0.instance.invoke(context, transform.const12);
                        if(term == null)
                          break Fail85;
                        term = debug_0_0.instance.invoke(context, m_27);
                        if(term == null)
                          break Fail85;
                        term = transform.const9;
                        if(true)
                          break Fail85;
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

  @SuppressWarnings("all") public static class get_$L$H$S_type_0_3 extends Strategy 
  { 
    public static get_$L$H$S_type_0_3 instance = new get_$L$H$S_type_0_3();

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm a_28, IStrategoTerm b_28, IStrategoTerm c_28)
    { 
      ITermFactory termFactory = context.getFactory();
      context.push("get_LHS_type_0_3");
      Fail94:
      { 
        IStrategoTerm d_28 = null;
        IStrategoTerm e_28 = null;
        IStrategoTerm g_28 = null;
        g_28 = term;
        d_28 = term;
        term = get_type_of_0_3.instance.invoke(context, g_28, a_28, b_28, c_28);
        if(term == null)
          break Fail94;
        e_28 = term;
        Success79:
        { 
          Fail95:
          { 
            IStrategoTerm f_28 = null;
            f_28 = term;
            term = termFactory.makeTuple(e_28, transform.constNone0);
            term = equal_0_0.instance.invoke(context, term);
            if(term == null)
              break Fail95;
            term = f_28;
            { 
              term = debug_0_0.instance.invoke(context, transform.const13);
              if(term == null)
                break Fail94;
              term = debug_0_0.instance.invoke(context, d_28);
              if(term == null)
                break Fail94;
              term = transform.const9;
              if(true)
                break Fail94;
              if(true)
                break Success79;
            }
          }
          term = e_28;
        }
        context.popOnSuccess();
        if(true)
          return term;
      }
      context.popOnFailure();
      return null;
    }
  }

  @SuppressWarnings("all") public static class get_type_of_0_3 extends Strategy 
  { 
    public static get_type_of_0_3 instance = new get_type_of_0_3();

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm j_28, IStrategoTerm k_28, IStrategoTerm l_28)
    { 
      context.push("get_type_of_0_3");
      Fail96:
      { 
        IStrategoTerm m_28 = null;
        IStrategoTerm term122 = term;
        Success80:
        { 
          Fail97:
          { 
            IStrategoTerm n_28 = null;
            n_28 = term;
            IStrategoTerm term123 = term;
            Success81:
            { 
              Fail98:
              { 
                term = type_of_0_3.instance.invoke(context, term, j_28, k_28, l_28);
                if(term == null)
                  break Fail98;
                m_28 = term;
                { 
                  if(true)
                    break Fail97;
                  if(true)
                    break Success81;
                }
              }
              term = term123;
            }
            term = n_28;
            { 
              term = transform.constNone0;
              if(m_28 == null)
                m_28 = term;
              else
                if(m_28 != term && !m_28.match(term))
                  break Fail96;
              if(true)
                break Success80;
            }
          }
          term = term122;
        }
        if(m_28 == null)
          break Fail96;
        term = m_28;
        context.popOnSuccess();
        if(true)
          return term;
      }
      context.popOnFailure();
      return null;
    }
  }

  @SuppressWarnings("all") public static class handle_expr_0_7 extends Strategy 
  { 
    public static handle_expr_0_7 instance = new handle_expr_0_7();

    public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm s_28, IStrategoTerm t_28, IStrategoTerm u_28, IStrategoTerm x_28, IStrategoTerm y_28, IStrategoTerm z_28, IStrategoTerm a_29)
    { 
      ITermFactory termFactory = context.getFactory();
      context.push("handle_expr_0_7");
      Fail99:
      { 
        IStrategoTerm c_29 = null;
        IStrategoTerm e_29 = null;
        IStrategoTerm f_29 = null;
        IStrategoTerm i_29 = null;
        i_29 = term;
        c_29 = term;
        term = fetch_0_0.instance.invoke(context, i_29);
        if(term == null)
          break Fail99;
        e_29 = term;
        IStrategoTerm term124 = term;
        Success82:
        { 
          Fail100:
          { 
            IStrategoTerm g_29 = null;
            g_29 = term;
            term = hashtable_keys_0_0.instance.invoke(context, s_28);
            if(term == null)
              break Fail100;
            term = termFactory.makeTuple(e_29, term);
            term = elem_0_0.instance.invoke(context, term);
            if(term == null)
              break Fail100;
            term = g_29;
            { 
              term = c_29;
              if(true)
                break Success82;
            }
          }
          term = term124;
          IStrategoTerm term125 = term;
          Success83:
          { 
            Fail101:
            { 
              IStrategoTerm h_29 = null;
              h_29 = term;
              term = termFactory.makeTuple(z_28, transform.constFalse0);
              term = equal_0_0.instance.invoke(context, term);
              if(term == null)
                break Fail101;
              term = h_29;
              { 
                term = debug_0_0.instance.invoke(context, transform.const14);
                if(term == null)
                  break Fail99;
                term = debug_0_0.instance.invoke(context, c_29);
                if(term == null)
                  break Fail99;
                term = transform.const9;
                if(true)
                  break Fail99;
                if(true)
                  break Success83;
              }
            }
            term = term125;
            IStrategoTerm p_29 = null;
            term = generate_ref_method__name_0_2.instance.invoke(context, term, e_29, x_28);
            if(term == null)
              break Fail99;
            f_29 = term;
            term = t_28;
            p_29 = t_28;
            term = create_ref_method_0_4.instance.invoke(context, term, e_29, f_29, y_28, a_29);
            if(term == null)
              break Fail99;
            term = iset_add_0_1.instance.invoke(context, p_29, term);
            if(term == null)
              break Fail99;
            term = iset_add_0_1.instance.invoke(context, u_28, e_29);
            if(term == null)
              break Fail99;
            term = generate_invoke_ref_0_1.instance.invoke(context, transform.const9, f_29);
            if(term == null)
              break Fail99;
          }
        }
        context.popOnSuccess();
        if(true)
          return term;
      }
      context.popOnFailure();
      return null;
    }

    @Override public IStrategoTerm invokeDynamic(Context context, IStrategoTerm term, Strategy[] sargs, IStrategoTerm[] targs)
    { 
      if(sargs == null || targs == null || sargs.length != 0 || targs.length != 7)
        throw new IllegalArgumentException("Illegal arguments for " + getName());
      return invoke(context, term, targs[0], targs[1], targs[2], targs[3], targs[4], targs[5], targs[6]);
    }
  }

  @SuppressWarnings("all") public static class generate_invoke_ref_0_1 extends Strategy 
  { 
    public static generate_invoke_ref_0_1 instance = new generate_invoke_ref_0_1();

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm s_29)
    { 
      ITermFactory termFactory = context.getFactory();
      Fail102:
      { 
        term = termFactory.makeAppl(transform._consInvoke_2, new IStrategoTerm[]{termFactory.makeAppl(transform._consMethod_1, new IStrategoTerm[]{termFactory.makeAppl(transform._consMethodName_1, new IStrategoTerm[]{termFactory.makeAppl(transform._consId_1, new IStrategoTerm[]{s_29})})}), transform.constCons1});
        if(true)
          return term;
      }
      context.push("generate_invoke_ref_0_1");
      context.popOnFailure();
      return null;
    }
  }

  @SuppressWarnings("all") public static class generate_ref_method__name_0_2 extends Strategy 
  { 
    public static generate_ref_method__name_0_2 instance = new generate_ref_method__name_0_2();

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm t_29, IStrategoTerm u_29)
    { 
      ITermFactory termFactory = context.getFactory();
      context.push("generate_ref_method__name_0_2");
      Fail103:
      { 
        IStrategoTerm v_29 = null;
        IStrategoTerm term126 = term;
        Success84:
        { 
          Fail104:
          { 
            IStrategoTerm y_29 = null;
            y_29 = term;
            IStrategoTerm term127 = term;
            Success85:
            { 
              Fail105:
              { 
                term = hashtable_keys_0_0.instance.invoke(context, u_29);
                if(term == null)
                  break Fail105;
                term = termFactory.makeTuple(t_29, term);
                term = elem_0_0.instance.invoke(context, term);
                if(term == null)
                  break Fail105;
                { 
                  if(true)
                    break Fail104;
                  if(true)
                    break Success85;
                }
              }
              term = term127;
            }
            term = y_29;
            { 
              term = hashtable_keys_0_0.instance.invoke(context, u_29);
              if(term == null)
                break Fail103;
              term = length_0_0.instance.invoke(context, term);
              if(term == null)
                break Fail103;
              term = termFactory.makeTuple(term, transform.const16);
              term = add_0_0.instance.invoke(context, term);
              if(term == null)
                break Fail103;
              v_29 = term;
              term = int_to_string_0_0.instance.invoke(context, v_29);
              if(term == null)
                break Fail103;
              term = (IStrategoTerm)termFactory.makeListCons(transform.const17, termFactory.makeListCons(term, (IStrategoList)transform.constNil0));
              term = concat_strings_0_0.instance.invoke(context, term);
              if(term == null)
                break Fail103;
              term = hashtable_put_0_2.instance.invoke(context, u_29, t_29, term);
              if(term == null)
                break Fail103;
              if(true)
                break Success84;
            }
          }
          term = term126;
        }
        term = hashtable_get_0_1.instance.invoke(context, u_29, t_29);
        if(term == null)
          break Fail103;
        context.popOnSuccess();
        if(true)
          return term;
      }
      context.popOnFailure();
      return null;
    }
  }

  @SuppressWarnings("all") public static class increament_0_2 extends Strategy 
  { 
    public static increament_0_2 instance = new increament_0_2();

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm j_30, IStrategoTerm k_30)
    { 
      ITermFactory termFactory = context.getFactory();
      context.push("increament_0_2");
      Fail106:
      { 
        IStrategoTerm l_30 = null;
        Success86:
        { 
          Fail107:
          { 
            IStrategoTerm m_30 = null;
            m_30 = term;
            term = hashtable_keys_0_0.instance.invoke(context, k_30);
            if(term == null)
              break Fail107;
            term = termFactory.makeTuple(j_30, term);
            term = elem_0_0.instance.invoke(context, term);
            if(term == null)
              break Fail107;
            term = m_30;
            { 
              IStrategoTerm n_31 = null;
              term = hashtable_get_0_1.instance.invoke(context, k_30, j_30);
              if(term == null)
                break Fail106;
              l_30 = term;
              term = hashtable_remove_0_1.instance.invoke(context, k_30, j_30);
              if(term == null)
                break Fail106;
              n_31 = k_30;
              term = termFactory.makeTuple(transform.const16, l_30);
              term = add_0_0.instance.invoke(context, term);
              if(term == null)
                break Fail106;
              term = hashtable_put_0_2.instance.invoke(context, n_31, j_30, term);
              if(term == null)
                break Fail106;
              if(true)
                break Success86;
            }
          }
          IStrategoTerm f_32 = null;
          f_32 = k_30;
          term = hashtable_put_0_2.instance.invoke(context, f_32, j_30, transform.const16);
          if(term == null)
            break Fail106;
        }
        context.popOnSuccess();
        if(true)
          return term;
      }
      context.popOnFailure();
      return null;
    }
  }

  @SuppressWarnings("all") public static class decreament_0_2 extends Strategy 
  { 
    public static decreament_0_2 instance = new decreament_0_2();

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm d_33, IStrategoTerm e_33)
    { 
      ITermFactory termFactory = context.getFactory();
      context.push("decreament_0_2");
      Fail108:
      { 
        IStrategoTerm f_33 = null;
        IStrategoTerm k_33 = null;
        k_33 = term;
        IStrategoTerm term129 = term;
        Success87:
        { 
          Fail109:
          { 
            IStrategoTerm l_33 = null;
            l_33 = term;
            term = hashtable_keys_0_0.instance.invoke(context, d_33);
            if(term == null)
              break Fail109;
            term = termFactory.makeTuple(k_33, term);
            term = elem_0_0.instance.invoke(context, term);
            if(term == null)
              break Fail109;
            term = l_33;
            { 
              IStrategoTerm w_33 = null;
              term = hashtable_get_0_1.instance.invoke(context, d_33, k_33);
              if(term == null)
                break Fail108;
              f_33 = term;
              term = hashtable_remove_0_1.instance.invoke(context, d_33, k_33);
              if(term == null)
                break Fail108;
              w_33 = d_33;
              term = hashtable_get_0_1.instance.invoke(context, e_33, k_33);
              if(term == null)
                break Fail108;
              term = termFactory.makeTuple(f_33, term);
              term = subti_0_0.instance.invoke(context, term);
              if(term == null)
                break Fail108;
              term = hashtable_put_0_2.instance.invoke(context, w_33, k_33, term);
              if(term == null)
                break Fail108;
              IStrategoTerm term130 = term;
              Success88:
              { 
                Fail110:
                { 
                  IStrategoTerm m_33 = null;
                  m_33 = term;
                  term = hashtable_get_0_1.instance.invoke(context, d_33, k_33);
                  if(term == null)
                    break Fail110;
                  term = termFactory.makeTuple(term, transform.const18);
                  term = equal_0_0.instance.invoke(context, term);
                  if(term == null)
                    break Fail110;
                  term = m_33;
                  { 
                    term = hashtable_remove_0_1.instance.invoke(context, d_33, k_33);
                    if(term == null)
                      break Fail108;
                    if(true)
                      break Success88;
                  }
                }
                term = term130;
              }
              if(true)
                break Success87;
            }
          }
          term = term129;
        }
        context.popOnSuccess();
        if(true)
          return term;
      }
      context.popOnFailure();
      return null;
    }
  }

  @SuppressWarnings("all") public static class create_ref_method_0_4 extends Strategy 
  { 
    public static create_ref_method_0_4 instance = new create_ref_method_0_4();

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm b_34, IStrategoTerm c_34, IStrategoTerm d_34, IStrategoTerm e_34)
    { 
      ITermFactory termFactory = context.getFactory();
      context.push("create_ref_method_0_4");
      Fail111:
      { 
        IStrategoTerm f_34 = null;
        IStrategoTerm g_34 = null;
        IStrategoTerm h_34 = null;
        IStrategoTerm i_34 = null;
        i_34 = term;
        h_34 = d_34;
        term = i_34;
        IStrategoTerm term131 = term;
        Success89:
        { 
          Fail112:
          { 
            IStrategoTerm j_34 = null;
            j_34 = term;
            term = h_34;
            if(term.getTermType() != IStrategoTerm.APPL || transform._consByte_0 != ((IStrategoAppl)term).getConstructor())
              break Fail112;
            term = j_34;
            { 
              f_34 = transform.constByte0;
              term = transform.constLit0;
              g_34 = transform.constLit0;
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
              IStrategoTerm k_34 = null;
              k_34 = term;
              term = h_34;
              if(term.getTermType() != IStrategoTerm.APPL || transform._consInt_0 != ((IStrategoAppl)term).getConstructor())
                break Fail113;
              term = k_34;
              { 
                f_34 = transform.constInt0;
                term = transform.constLit0;
                g_34 = transform.constLit0;
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
                IStrategoTerm l_34 = null;
                l_34 = term;
                term = or_2_0.instance.invoke(context, h_34, lifted78.instance, lifted79.instance);
                if(term == null)
                  break Fail114;
                term = l_34;
                { 
                  f_34 = transform.constBoolean0;
                  term = transform.constLit1;
                  g_34 = transform.constLit1;
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
                  IStrategoTerm m_34 = null;
                  m_34 = term;
                  term = or_2_0.instance.invoke(context, h_34, lifted80.instance, lifted81.instance);
                  if(term == null)
                    break Fail115;
                  term = m_34;
                  { 
                    f_34 = transform.constFloat0;
                    term = transform.constLit2;
                    g_34 = transform.constLit2;
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
                    IStrategoTerm n_34 = null;
                    n_34 = term;
                    term = h_34;
                    if(term.getTermType() != IStrategoTerm.APPL || transform._consDouble_0 != ((IStrategoAppl)term).getConstructor())
                      break Fail116;
                    term = n_34;
                    { 
                      f_34 = transform.constDouble0;
                      term = transform.constLit2;
                      g_34 = transform.constLit2;
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
                      IStrategoTerm o_34 = null;
                      o_34 = term;
                      term = h_34;
                      if(term.getTermType() != IStrategoTerm.APPL || transform._consLong_0 != ((IStrategoAppl)term).getConstructor())
                        break Fail117;
                      term = o_34;
                      { 
                        f_34 = transform.constLong0;
                        term = transform.constLit0;
                        g_34 = transform.constLit0;
                        if(true)
                          break Success94;
                      }
                    }
                    term = term136;
                    Success95:
                    { 
                      Fail118:
                      { 
                        IStrategoTerm p_34 = null;
                        p_34 = term;
                        term = h_34;
                        if(term.getTermType() != IStrategoTerm.APPL || transform._consDeci_1 != ((IStrategoAppl)term).getConstructor())
                          break Fail118;
                        term = p_34;
                        { 
                          f_34 = transform.constDouble0;
                          term = transform.constLit2;
                          g_34 = transform.constLit2;
                          if(true)
                            break Success95;
                        }
                      }
                      f_34 = transform.constClassOrInterfaceType0;
                      term = transform.constLit3;
                      g_34 = transform.constLit3;
                    }
                  }
                }
              }
            }
          }
        }
        term = termFactory.makeAppl(transform._consMethodDec_2, new IStrategoTerm[]{termFactory.makeAppl(transform._consMethodDecHead_6, new IStrategoTerm[]{(IStrategoTerm)termFactory.makeListCons(termFactory.makeAppl(transform._consAnno_2, new IStrategoTerm[]{transform.constTypeName1, (IStrategoTerm)termFactory.makeListCons(termFactory.makeAppl(transform._consElemValPair_2, new IStrategoTerm[]{transform.constId3, termFactory.makeAppl(transform._consLit_1, new IStrategoTerm[]{termFactory.makeAppl(transform._consString_1, new IStrategoTerm[]{(IStrategoTerm)termFactory.makeListCons(termFactory.makeAppl(transform._consChars_1, new IStrategoTerm[]{b_34}), (IStrategoList)transform.constNil0)})})}), (IStrategoList)transform.constNil0)}), (IStrategoList)transform.constCons2), transform.constNone0, f_34, termFactory.makeAppl(transform._consId_1, new IStrategoTerm[]{c_34}), (IStrategoTerm)termFactory.makeListCons(termFactory.makeAppl(transform._consParam_3, new IStrategoTerm[]{transform.constNil0, termFactory.makeAppl(transform._consClassOrInterfaceType_2, new IStrategoTerm[]{termFactory.makeAppl(transform._consTypeName_1, new IStrategoTerm[]{termFactory.makeAppl(transform._consId_1, new IStrategoTerm[]{e_34})}), transform.constNone0}), transform.constId4}), (IStrategoList)transform.constNil0), transform.constNone0}), termFactory.makeAppl(transform._consBlock_1, new IStrategoTerm[]{(IStrategoTerm)termFactory.makeListCons(termFactory.makeAppl(transform._consReturn_1, new IStrategoTerm[]{termFactory.makeAppl(transform._consSome_1, new IStrategoTerm[]{g_34})}), (IStrategoList)transform.constNil0)})});
        context.popOnSuccess();
        if(true)
          return term;
      }
      context.popOnFailure();
      return null;
    }
  }

  @SuppressWarnings("all") public static class get_expr_type_0_3 extends Strategy 
  { 
    public static get_expr_type_0_3 instance = new get_expr_type_0_3();

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm q_34, IStrategoTerm r_34, IStrategoTerm s_34)
    { 
      ITermFactory termFactory = context.getFactory();
      context.push("get_expr_type_0_3");
      Fail119:
      { 
        Success96:
        { 
          Fail120:
          { 
            IStrategoTerm t_34 = null;
            t_34 = term;
            term = hashtable_keys_0_0.instance.invoke(context, r_34);
            if(term == null)
              break Fail120;
            term = termFactory.makeTuple(q_34, term);
            term = elem_0_0.instance.invoke(context, term);
            if(term == null)
              break Fail120;
            term = t_34;
            { 
              term = hashtable_get_0_1.instance.invoke(context, s_34, q_34);
              if(term == null)
                break Fail119;
              if(true)
                break Success96;
            }
          }
          term = transform.constNone0;
        }
        context.popOnSuccess();
        if(true)
          return term;
      }
      context.popOnFailure();
      return null;
    }
  }

  @SuppressWarnings("all") public static class type_of_0_3 extends Strategy 
  { 
    public static type_of_0_3 instance = new type_of_0_3();

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm r_59, IStrategoTerm s_59, IStrategoTerm t_59)
    { 
      ITermFactory termFactory = context.getFactory();
      context.push("type_of_0_3");
      Fail121:
      { 
        IStrategoTerm term139 = term;
        Success97:
        { 
          Fail122:
          { 
            if(term.getTermType() != IStrategoTerm.APPL || transform._consComplement_1 != ((IStrategoAppl)term).getConstructor())
              break Fail122;
            Success98:
            { 
              Fail123:
              { 
                IStrategoTerm p_40 = null;
                p_40 = term;
                term = termFactory.makeTuple(r_59, transform.constNone0);
                term = equal_0_0.instance.invoke(context, term);
                if(term == null)
                  break Fail123;
                term = p_40;
                { 
                  term = transform.constLong0;
                  if(true)
                    break Success98;
                }
              }
              term = r_59;
            }
            if(true)
              break Success97;
          }
          term = term139;
          IStrategoTerm term141 = term;
          Success99:
          { 
            Fail124:
            { 
              term = or_2_0.instance.invoke(context, term, lifted82.instance, lifted83.instance);
              if(term == null)
                break Fail124;
              Success100:
              { 
                Fail125:
                { 
                  IStrategoTerm l_40 = null;
                  l_40 = term;
                  term = termFactory.makeTuple(r_59, transform.constNone0);
                  term = equal_0_0.instance.invoke(context, term);
                  if(term == null)
                    break Fail125;
                  term = l_40;
                  { 
                    term = transform.constDouble0;
                    if(true)
                      break Success100;
                  }
                }
                term = r_59;
              }
              if(true)
                break Success99;
            }
            term = term141;
            IStrategoTerm term143 = term;
            Success101:
            { 
              Fail126:
              { 
                term = or_2_0.instance.invoke(context, term, lifted84.instance, lifted91.instance);
                if(term == null)
                  break Fail126;
                Success102:
                { 
                  Fail127:
                  { 
                    IStrategoTerm h_40 = null;
                    h_40 = term;
                    term = termFactory.makeTuple(r_59, transform.constNone0);
                    term = equal_0_0.instance.invoke(context, term);
                    if(term == null)
                      break Fail127;
                    term = h_40;
                    { 
                      term = transform.constDouble0;
                      if(true)
                        break Success102;
                    }
                  }
                  term = cast_bounded_arithmetic_type_0_0.instance.invoke(context, r_59);
                  if(term == null)
                    break Fail126;
                }
                if(true)
                  break Success101;
              }
              term = term143;
              IStrategoTerm term145 = term;
              Success103:
              { 
                Fail128:
                { 
                  TermReference c_40 = new TermReference();
                  lifted95 lifted950 = new lifted95();
                  lifted92 lifted920 = new lifted92();
                  lifted950.c_40 = c_40;
                  lifted920.c_40 = c_40;
                  term = or_2_0.instance.invoke(context, term, lifted920, lifted950);
                  if(term == null)
                    break Fail128;
                  Success104:
                  { 
                    Fail129:
                    { 
                      IStrategoTerm d_40 = null;
                      d_40 = term;
                      term = termFactory.makeTuple(r_59, transform.constNone0);
                      term = equal_0_0.instance.invoke(context, term);
                      if(term == null)
                        break Fail129;
                      term = d_40;
                      { 
                        if(c_40.value == null)
                          break Fail128;
                        term = get_type_of_0_3.instance.invoke(context, c_40.value, r_59, s_59, t_59);
                        if(term == null)
                          break Fail128;
                        term = cast_shift_type_0_0.instance.invoke(context, term);
                        if(term == null)
                          break Fail128;
                        if(true)
                          break Success104;
                      }
                    }
                    term = cast_shift_type_0_0.instance.invoke(context, r_59);
                    if(term == null)
                      break Fail128;
                  }
                  if(true)
                    break Success103;
                }
                term = term145;
                IStrategoTerm term147 = term;
                IStrategoConstructor cons3 = term.getTermType() == IStrategoTerm.APPL ? ((IStrategoAppl)term).getConstructor() : null;
                Success105:
                { 
                  if(cons3 == transform._consAnd_2)
                  { 
                    Fail130:
                    { 
                      IStrategoTerm w_39 = null;
                      IStrategoTerm x_39 = null;
                      w_39 = term.getSubterm(0);
                      x_39 = term.getSubterm(1);
                      Success106:
                      { 
                        Fail131:
                        { 
                          IStrategoTerm y_39 = null;
                          y_39 = term;
                          term = termFactory.makeTuple(r_59, transform.constNone0);
                          term = equal_0_0.instance.invoke(context, term);
                          if(term == null)
                            break Fail131;
                          term = y_39;
                          { 
                            term = termFactory.makeTuple(w_39, x_39);
                            term = try_to_get_type_0_3.instance.invoke(context, term, r_59, s_59, t_59);
                            if(term == null)
                              break Fail130;
                            term = cast_conditional_type_0_0.instance.invoke(context, term);
                            if(term == null)
                              break Fail130;
                            if(true)
                              break Success106;
                          }
                        }
                        term = cast_bounded_conditional_type_0_0.instance.invoke(context, r_59);
                        if(term == null)
                          break Fail130;
                      }
                      if(true)
                        break Success105;
                    }
                    term = term147;
                  }
                  Success107:
                  { 
                    if(cons3 == transform._consExcOr_2)
                    { 
                      Fail132:
                      { 
                        IStrategoTerm q_39 = null;
                        IStrategoTerm r_39 = null;
                        q_39 = term.getSubterm(0);
                        r_39 = term.getSubterm(1);
                        Success108:
                        { 
                          Fail133:
                          { 
                            IStrategoTerm s_39 = null;
                            s_39 = term;
                            term = termFactory.makeTuple(r_59, transform.constNone0);
                            term = equal_0_0.instance.invoke(context, term);
                            if(term == null)
                              break Fail133;
                            term = s_39;
                            { 
                              term = termFactory.makeTuple(q_39, r_39);
                              term = try_to_get_type_0_3.instance.invoke(context, term, r_59, s_59, t_59);
                              if(term == null)
                                break Fail132;
                              term = cast_conditional_type_0_0.instance.invoke(context, term);
                              if(term == null)
                                break Fail132;
                              if(true)
                                break Success108;
                            }
                          }
                          term = cast_bounded_conditional_type_0_0.instance.invoke(context, r_59);
                          if(term == null)
                            break Fail132;
                        }
                        if(true)
                          break Success107;
                      }
                      term = term147;
                    }
                    Success109:
                    { 
                      if(cons3 == transform._consOr_2)
                      { 
                        Fail134:
                        { 
                          IStrategoTerm k_39 = null;
                          IStrategoTerm l_39 = null;
                          k_39 = term.getSubterm(0);
                          l_39 = term.getSubterm(1);
                          Success110:
                          { 
                            Fail135:
                            { 
                              IStrategoTerm m_39 = null;
                              m_39 = term;
                              term = termFactory.makeTuple(r_59, transform.constNone0);
                              term = equal_0_0.instance.invoke(context, term);
                              if(term == null)
                                break Fail135;
                              term = m_39;
                              { 
                                term = termFactory.makeTuple(k_39, l_39);
                                term = try_to_get_type_0_3.instance.invoke(context, term, r_59, s_59, t_59);
                                if(term == null)
                                  break Fail134;
                                term = cast_conditional_type_0_0.instance.invoke(context, term);
                                if(term == null)
                                  break Fail134;
                                if(true)
                                  break Success110;
                              }
                            }
                            term = cast_bounded_conditional_type_0_0.instance.invoke(context, r_59);
                            if(term == null)
                              break Fail134;
                          }
                          if(true)
                            break Success109;
                        }
                        term = term147;
                      }
                      IStrategoTerm term153 = term;
                      Success111:
                      { 
                        Fail136:
                        { 
                          TermReference d_39 = new TermReference();
                          IStrategoTerm e_39 = null;
                          lifted99 lifted990 = new lifted99();
                          lifted96 lifted960 = new lifted96();
                          lifted990.d_39 = d_39;
                          lifted960.d_39 = d_39;
                          term = or_2_0.instance.invoke(context, term, lifted960, lifted990);
                          if(term == null)
                            break Fail136;
                          if(d_39.value == null)
                            break Fail136;
                          term = get_type_of_0_3.instance.invoke(context, d_39.value, r_59, s_59, t_59);
                          if(term == null)
                            break Fail136;
                          e_39 = term;
                          Success112:
                          { 
                            Fail137:
                            { 
                              IStrategoTerm f_39 = null;
                              f_39 = term;
                              term = termFactory.makeTuple(e_39, transform.constNone0);
                              term = equal_0_0.instance.invoke(context, term);
                              if(term == null)
                                break Fail137;
                              term = f_39;
                              { 
                                Success113:
                                { 
                                  Fail138:
                                  { 
                                    IStrategoTerm g_39 = null;
                                    g_39 = term;
                                    term = termFactory.makeTuple(r_59, transform.constNone0);
                                    term = equal_0_0.instance.invoke(context, term);
                                    if(term == null)
                                      break Fail138;
                                    term = g_39;
                                    { 
                                      term = transform.constDouble0;
                                      if(true)
                                        break Success113;
                                    }
                                  }
                                  term = ensure__number_0_0.instance.invoke(context, r_59);
                                  if(term == null)
                                    break Fail136;
                                }
                                if(true)
                                  break Success112;
                              }
                            }
                            term = ensure__number_0_0.instance.invoke(context, e_39);
                            if(term == null)
                              break Fail136;
                          }
                          if(true)
                            break Success111;
                        }
                        term = term153;
                        IStrategoTerm term156 = term;
                        IStrategoConstructor cons4 = term.getTermType() == IStrategoTerm.APPL ? ((IStrategoAppl)term).getConstructor() : null;
                        Success114:
                        { 
                          if(cons4 == transform._consExprName_1)
                          { 
                            Fail139:
                            { 
                              IStrategoTerm x_38 = null;
                              x_38 = term;
                              term = fetch_0_0.instance.invoke(context, term);
                              if(term == null)
                                break Fail139;
                              term = get_expr_type_0_3.instance.invoke(context, x_38, term, s_59, t_59);
                              if(term == null)
                                break Fail139;
                              if(true)
                                break Success114;
                            }
                            term = term156;
                          }
                          Success115:
                          { 
                            if(cons4 == transform._consExprName_2)
                            { 
                              Fail140:
                              { 
                                IStrategoTerm n_38 = null;
                                n_38 = term;
                                term = fetch_0_0.instance.invoke(context, term);
                                if(term == null)
                                  break Fail140;
                                term = get_expr_type_0_3.instance.invoke(context, n_38, term, s_59, t_59);
                                if(term == null)
                                  break Fail140;
                                if(true)
                                  break Success115;
                              }
                              term = term156;
                            }
                            Success116:
                            { 
                              if(cons4 == transform._consLit_1)
                              { 
                                Fail141:
                                { 
                                  IStrategoTerm e_38 = null;
                                  e_38 = term.getSubterm(0);
                                  term = e_38;
                                  if(true)
                                    break Success116;
                                }
                                term = term156;
                              }
                              Success117:
                              { 
                                if(cons4 == transform._consNot_1)
                                { 
                                  Fail142:
                                  { 
                                    term = transform.constBoolean0;
                                    if(true)
                                      break Success117;
                                  }
                                  term = term156;
                                }
                                Success118:
                                { 
                                  if(cons4 == transform._consLt_2)
                                  { 
                                    Fail143:
                                    { 
                                      term = transform.constBoolean0;
                                      if(true)
                                        break Success118;
                                    }
                                    term = term156;
                                  }
                                  Success119:
                                  { 
                                    if(cons4 == transform._consGt_2)
                                    { 
                                      Fail144:
                                      { 
                                        term = transform.constBoolean0;
                                        if(true)
                                          break Success119;
                                      }
                                      term = term156;
                                    }
                                    Success120:
                                    { 
                                      if(cons4 == transform._consLtEq_2)
                                      { 
                                        Fail145:
                                        { 
                                          term = transform.constBoolean0;
                                          if(true)
                                            break Success120;
                                        }
                                        term = term156;
                                      }
                                      Success121:
                                      { 
                                        if(cons4 == transform._consGtEq_2)
                                        { 
                                          Fail146:
                                          { 
                                            term = transform.constBoolean0;
                                            if(true)
                                              break Success121;
                                          }
                                          term = term156;
                                        }
                                        Success122:
                                        { 
                                          if(cons4 == transform._consEq_2)
                                          { 
                                            Fail147:
                                            { 
                                              term = transform.constBoolean0;
                                              if(true)
                                                break Success122;
                                            }
                                            term = term156;
                                          }
                                          Success123:
                                          { 
                                            if(cons4 == transform._consNotEq_2)
                                            { 
                                              Fail148:
                                              { 
                                                term = transform.constBoolean0;
                                                if(true)
                                                  break Success123;
                                              }
                                              term = term156;
                                            }
                                            Success124:
                                            { 
                                              if(cons4 == transform._consLazyAnd_2)
                                              { 
                                                Fail149:
                                                { 
                                                  term = transform.constBoolean0;
                                                  if(true)
                                                    break Success124;
                                                }
                                                term = term156;
                                              }
                                              Success125:
                                              { 
                                                if(cons4 == transform._consLazyOr_2)
                                                { 
                                                  Fail150:
                                                  { 
                                                    term = transform.constBoolean0;
                                                    if(true)
                                                      break Success125;
                                                  }
                                                  term = term156;
                                                }
                                                Success126:
                                                { 
                                                  if(cons4 == transform._consAssign_2)
                                                  { 
                                                    Fail151:
                                                    { 
                                                      IStrategoTerm z_36 = null;
                                                      z_36 = term.getSubterm(0);
                                                      term = this.invoke(context, z_36, r_59, s_59, t_59);
                                                      if(term == null)
                                                        break Fail151;
                                                      if(true)
                                                        break Success126;
                                                    }
                                                    term = term156;
                                                  }
                                                  Success127:
                                                  { 
                                                    if(cons4 == transform._consAssignMul_2)
                                                    { 
                                                      Fail152:
                                                      { 
                                                        IStrategoTerm v_36 = null;
                                                        v_36 = term.getSubterm(0);
                                                        term = this.invoke(context, v_36, r_59, s_59, t_59);
                                                        if(term == null)
                                                          break Fail152;
                                                        if(true)
                                                          break Success127;
                                                      }
                                                      term = term156;
                                                    }
                                                    Success128:
                                                    { 
                                                      if(cons4 == transform._consAssignDiv_2)
                                                      { 
                                                        Fail153:
                                                        { 
                                                          IStrategoTerm r_36 = null;
                                                          r_36 = term.getSubterm(0);
                                                          term = this.invoke(context, r_36, r_59, s_59, t_59);
                                                          if(term == null)
                                                            break Fail153;
                                                          if(true)
                                                            break Success128;
                                                        }
                                                        term = term156;
                                                      }
                                                      Success129:
                                                      { 
                                                        if(cons4 == transform._consAssignRemain_2)
                                                        { 
                                                          Fail154:
                                                          { 
                                                            IStrategoTerm n_36 = null;
                                                            n_36 = term.getSubterm(0);
                                                            term = this.invoke(context, n_36, r_59, s_59, t_59);
                                                            if(term == null)
                                                              break Fail154;
                                                            if(true)
                                                              break Success129;
                                                          }
                                                          term = term156;
                                                        }
                                                        Success130:
                                                        { 
                                                          if(cons4 == transform._consAssignPlus_2)
                                                          { 
                                                            Fail155:
                                                            { 
                                                              IStrategoTerm j_36 = null;
                                                              j_36 = term.getSubterm(0);
                                                              term = this.invoke(context, j_36, r_59, s_59, t_59);
                                                              if(term == null)
                                                                break Fail155;
                                                              if(true)
                                                                break Success130;
                                                            }
                                                            term = term156;
                                                          }
                                                          Success131:
                                                          { 
                                                            if(cons4 == transform._consAssignMinus_2)
                                                            { 
                                                              Fail156:
                                                              { 
                                                                IStrategoTerm f_36 = null;
                                                                f_36 = term.getSubterm(0);
                                                                term = this.invoke(context, f_36, r_59, s_59, t_59);
                                                                if(term == null)
                                                                  break Fail156;
                                                                if(true)
                                                                  break Success131;
                                                              }
                                                              term = term156;
                                                            }
                                                            Success132:
                                                            { 
                                                              if(cons4 == transform._consAssignLeftShift_2)
                                                              { 
                                                                Fail157:
                                                                { 
                                                                  IStrategoTerm b_36 = null;
                                                                  b_36 = term.getSubterm(0);
                                                                  term = this.invoke(context, b_36, r_59, s_59, t_59);
                                                                  if(term == null)
                                                                    break Fail157;
                                                                  if(true)
                                                                    break Success132;
                                                                }
                                                                term = term156;
                                                              }
                                                              Success133:
                                                              { 
                                                                if(cons4 == transform._consAssignRightShift_2)
                                                                { 
                                                                  Fail158:
                                                                  { 
                                                                    IStrategoTerm x_35 = null;
                                                                    x_35 = term.getSubterm(0);
                                                                    term = this.invoke(context, x_35, r_59, s_59, t_59);
                                                                    if(term == null)
                                                                      break Fail158;
                                                                    if(true)
                                                                      break Success133;
                                                                  }
                                                                  term = term156;
                                                                }
                                                                Success134:
                                                                { 
                                                                  if(cons4 == transform._consAssignURightShift_2)
                                                                  { 
                                                                    Fail159:
                                                                    { 
                                                                      IStrategoTerm t_35 = null;
                                                                      t_35 = term.getSubterm(0);
                                                                      term = this.invoke(context, t_35, r_59, s_59, t_59);
                                                                      if(term == null)
                                                                        break Fail159;
                                                                      if(true)
                                                                        break Success134;
                                                                    }
                                                                    term = term156;
                                                                  }
                                                                  Success135:
                                                                  { 
                                                                    if(cons4 == transform._consAssignAnd_2)
                                                                    { 
                                                                      Fail160:
                                                                      { 
                                                                        IStrategoTerm p_35 = null;
                                                                        p_35 = term.getSubterm(0);
                                                                        term = this.invoke(context, p_35, r_59, s_59, t_59);
                                                                        if(term == null)
                                                                          break Fail160;
                                                                        if(true)
                                                                          break Success135;
                                                                      }
                                                                      term = term156;
                                                                    }
                                                                    Success136:
                                                                    { 
                                                                      if(cons4 == transform._consAssignExcOr_2)
                                                                      { 
                                                                        Fail161:
                                                                        { 
                                                                          IStrategoTerm l_35 = null;
                                                                          l_35 = term.getSubterm(0);
                                                                          term = this.invoke(context, l_35, r_59, s_59, t_59);
                                                                          if(term == null)
                                                                            break Fail161;
                                                                          if(true)
                                                                            break Success136;
                                                                        }
                                                                        term = term156;
                                                                      }
                                                                      Success137:
                                                                      { 
                                                                        if(cons4 == transform._consAssignOr_2)
                                                                        { 
                                                                          Fail162:
                                                                          { 
                                                                            IStrategoTerm h_35 = null;
                                                                            h_35 = term.getSubterm(0);
                                                                            term = this.invoke(context, h_35, r_59, s_59, t_59);
                                                                            if(term == null)
                                                                              break Fail162;
                                                                            if(true)
                                                                              break Success137;
                                                                          }
                                                                          term = term156;
                                                                        }
                                                                        Success138:
                                                                        { 
                                                                          if(cons4 == transform._consCastPrim_2)
                                                                          { 
                                                                            Fail163:
                                                                            { 
                                                                              IStrategoTerm d_35 = null;
                                                                              d_35 = term.getSubterm(0);
                                                                              term = d_35;
                                                                              if(true)
                                                                                break Success138;
                                                                            }
                                                                            term = term156;
                                                                          }
                                                                          if(cons4 == transform._consCastRef_2)
                                                                          { 
                                                                            IStrategoTerm z_34 = null;
                                                                            z_34 = term.getSubterm(0);
                                                                            term = z_34;
                                                                          }
                                                                          else
                                                                          { 
                                                                            break Fail121;
                                                                          }
                                                                        }
                                                                      }
                                                                    }
                                                                  }
                                                                }
                                                              }
                                                            }
                                                          }
                                                        }
                                                      }
                                                    }
                                                  }
                                                }
                                              }
                                            }
                                          }
                                        }
                                      }
                                    }
                                  }
                                }
                              }
                            }
                          }
                        }
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

  @SuppressWarnings("all") public static class fetch_0_0 extends Strategy 
  { 
    public static fetch_0_0 instance = new fetch_0_0();

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      ITermFactory termFactory = context.getFactory();
      context.push("fetch_0_0");
      Fail164:
      { 
        IStrategoTerm term181 = term;
        IStrategoConstructor cons5 = term.getTermType() == IStrategoTerm.APPL ? ((IStrategoAppl)term).getConstructor() : null;
        Success139:
        { 
          if(cons5 == transform._consExprName_1)
          { 
            Fail165:
            { 
              IStrategoTerm y_40 = null;
              y_40 = term.getSubterm(0);
              term = this.invoke(context, y_40);
              if(term == null)
                break Fail165;
              if(true)
                break Success139;
            }
            term = term181;
          }
          Success140:
          { 
            if(cons5 == transform._consExprName_2)
            { 
              Fail166:
              { 
                IStrategoTerm w_40 = null;
                IStrategoTerm x_40 = null;
                w_40 = term.getSubterm(0);
                x_40 = term.getSubterm(1);
                term = termFactory.makeAppl(transform._consAmbName_2, new IStrategoTerm[]{w_40, x_40});
                term = this.invoke(context, term);
                if(term == null)
                  break Fail166;
                if(true)
                  break Success140;
              }
              term = term181;
            }
            Success141:
            { 
              if(cons5 == transform._consAmbName_2)
              { 
                Fail167:
                { 
                  IStrategoTerm s_40 = null;
                  IStrategoTerm t_40 = null;
                  s_40 = term.getSubterm(0);
                  IStrategoTerm arg127 = term.getSubterm(1);
                  if(arg127.getTermType() != IStrategoTerm.APPL || transform._consId_1 != ((IStrategoAppl)arg127).getConstructor())
                    break Fail167;
                  t_40 = arg127.getSubterm(0);
                  term = this.invoke(context, s_40);
                  if(term == null)
                    break Fail167;
                  term = (IStrategoTerm)termFactory.makeListCons(term, termFactory.makeListCons(transform.const0, termFactory.makeListCons(t_40, (IStrategoList)transform.constNil0)));
                  term = concat_strings_0_0.instance.invoke(context, term);
                  if(term == null)
                    break Fail167;
                  if(true)
                    break Success141;
                }
                term = term181;
              }
              Success142:
              { 
                if(cons5 == transform._consAmbName_1)
                { 
                  Fail168:
                  { 
                    IStrategoTerm r_40 = null;
                    r_40 = term.getSubterm(0);
                    term = this.invoke(context, r_40);
                    if(term == null)
                      break Fail168;
                    if(true)
                      break Success142;
                  }
                  term = term181;
                }
                if(cons5 == transform._consId_1)
                { 
                  IStrategoTerm q_40 = null;
                  q_40 = term.getSubterm(0);
                  term = q_40;
                }
                else
                { 
                  break Fail164;
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

  @SuppressWarnings("all") public static class main_0_0 extends Strategy 
  { 
    public static main_0_0 instance = new main_0_0();

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      context.push("main_0_0");
      Fail169:
      { 
        term = handle_io_0_0.instance.invoke(context, term);
        if(term == null)
          break Fail169;
        context.popOnSuccess();
        if(true)
          return term;
      }
      context.popOnFailure();
      return null;
    }
  }

  @SuppressWarnings("all") public static class handle_io_0_0 extends Strategy 
  { 
    public static handle_io_0_0 instance = new handle_io_0_0();

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      ITermFactory termFactory = context.getFactory();
      context.push("handle_io_0_0");
      Fail170:
      { 
        IStrategoTerm a_41 = null;
        IStrategoTerm b_41 = null;
        IStrategoTerm d_41 = null;
        IStrategoTerm i_41 = null;
        IStrategoTerm j_41 = null;
        IStrategoTerm l_41 = null;
        IStrategoTerm q_41 = null;
        IStrategoTerm n_41 = null;
        if(term.getTermType() != IStrategoTerm.LIST || ((IStrategoList)term).isEmpty())
          break Fail170;
        a_41 = ((IStrategoList)term).tail();
        term = debug_0_0.instance.invoke(context, transform.const25);
        if(term == null)
          break Fail170;
        term = debug_0_0.instance.invoke(context, a_41);
        if(term == null)
          break Fail170;
        term = a_41;
        if(term.getTermType() != IStrategoTerm.LIST || ((IStrategoList)term).isEmpty())
          break Fail170;
        l_41 = ((IStrategoList)term).head();
        term = l_41;
        d_41 = l_41;
        term = $Read$From$File_0_0.instance.invoke(context, term);
        if(term == null)
          break Fail170;
        b_41 = term;
        term = a_41;
        if(term.getTermType() != IStrategoTerm.LIST || ((IStrategoList)term).isEmpty())
          break Fail170;
        q_41 = ((IStrategoList)term).tail();
        term = q_41;
        if(term.getTermType() != IStrategoTerm.LIST || ((IStrategoList)term).isEmpty())
          break Fail170;
        n_41 = ((IStrategoList)term).head();
        i_41 = n_41;
        term = transform_0_0.instance.invoke(context, b_41);
        if(term == null)
          break Fail170;
        j_41 = term;
        term = dirname_0_0.instance.invoke(context, d_41);
        if(term == null)
          break Fail170;
        term = base_filename_0_0.instance.invoke(context, d_41);
        if(term == null)
          break Fail170;
        term = remove_extension_0_0.instance.invoke(context, term);
        if(term == null)
          break Fail170;
        term = (IStrategoTerm)termFactory.makeListCons(term, (IStrategoList)transform.constCons3);
        term = concat_strings_0_0.instance.invoke(context, term);
        if(term == null)
          break Fail170;
        term = termFactory.makeTuple(term, transform.const27);
        term = add_extension_0_0.instance.invoke(context, term);
        if(term == null)
          break Fail170;
        term = termFactory.makeTuple(i_41, transform.const28);
        term = fopen_0_0.instance.invoke(context, term);
        if(term == null)
          break Fail170;
        term = termFactory.makeTuple(j_41, term);
        term = fputs_0_0.instance.invoke(context, term);
        if(term == null)
          break Fail170;
        term = fclose_0_0.instance.invoke(context, term);
        if(term == null)
          break Fail170;
        context.popOnSuccess();
        if(true)
          return term;
      }
      context.popOnFailure();
      return null;
    }
  }

  @SuppressWarnings("all") public static class transform_0_0 extends Strategy 
  { 
    public static transform_0_0 instance = new transform_0_0();

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      context.push("transform_0_0");
      Fail171:
      { 
        term = convert_0_0.instance.invoke(context, term);
        if(term == null)
          break Fail171;
        term = pp_java5_to_string_0_0.instance.invoke(context, term);
        if(term == null)
          break Fail171;
        context.popOnSuccess();
        if(true)
          return term;
      }
      context.popOnFailure();
      return null;
    }
  }

  @SuppressWarnings("all") public static class gen_is$Run$By$Others_method_0_0 extends Strategy 
  { 
    public static gen_is$Run$By$Others_method_0_0 instance = new gen_is$Run$By$Others_method_0_0();

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      Fail172:
      { 
        term = transform.constMethodDec0;
        if(true)
          return term;
      }
      context.push("gen_isRunByOthers_method_0_0");
      context.popOnFailure();
      return null;
    }
  }

  @SuppressWarnings("all") public static class gen_method_state_0_1 extends Strategy 
  { 
    public static gen_method_state_0_1 instance = new gen_method_state_0_1();

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm v_41)
    { 
      ITermFactory termFactory = context.getFactory();
      context.push("gen_method_state_0_1");
      Fail173:
      { 
        IStrategoTerm x_41 = null;
        if(term.getTermType() != IStrategoTerm.APPL || transform._consMethodSignature_2 != ((IStrategoAppl)term).getConstructor())
          break Fail173;
        IStrategoTerm arg128 = term.getSubterm(0);
        if(arg128.getTermType() != IStrategoTerm.APPL || transform._consId_1 != ((IStrategoAppl)arg128).getConstructor())
          break Fail173;
        x_41 = term;
        term = gen_method_state_name_0_1.instance.invoke(context, x_41, v_41);
        if(term == null)
          break Fail173;
        term = termFactory.makeAppl(transform._consFieldDec_3, new IStrategoTerm[]{transform.constCons2, transform.constClassOrInterfaceType1, (IStrategoTerm)termFactory.makeListCons(termFactory.makeAppl(transform._consVarDec_2, new IStrategoTerm[]{termFactory.makeAppl(transform._consId_1, new IStrategoTerm[]{term}), transform.constInvoke2}), (IStrategoList)transform.constNil0)});
        context.popOnSuccess();
        if(true)
          return term;
      }
      context.popOnFailure();
      return null;
    }
  }

  @SuppressWarnings("all") public static class gen_method_state_name_0_1 extends Strategy 
  { 
    public static gen_method_state_name_0_1 instance = new gen_method_state_name_0_1();

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm c_42)
    { 
      ITermFactory termFactory = context.getFactory();
      context.push("gen_method_state_name_0_1");
      Fail174:
      { 
        IStrategoTerm d_42 = null;
        IStrategoTerm e_42 = null;
        if(term.getTermType() != IStrategoTerm.APPL || transform._consMethodSignature_2 != ((IStrategoAppl)term).getConstructor())
          break Fail174;
        IStrategoTerm arg130 = term.getSubterm(0);
        if(arg130.getTermType() != IStrategoTerm.APPL || transform._consId_1 != ((IStrategoAppl)arg130).getConstructor())
          break Fail174;
        d_42 = arg130.getSubterm(0);
        e_42 = term;
        term = debug_0_0.instance.invoke(context, transform.const38);
        if(term == null)
          break Fail174;
        term = hashtable_get_0_1.instance.invoke(context, c_42, e_42);
        if(term == null)
          break Fail174;
        term = int_to_string_0_0.instance.invoke(context, term);
        if(term == null)
          break Fail174;
        term = (IStrategoTerm)termFactory.makeListCons(d_42, termFactory.makeListCons(term, (IStrategoList)transform.constCons10));
        term = concat_strings_0_0.instance.invoke(context, term);
        if(term == null)
          break Fail174;
        context.popOnSuccess();
        if(true)
          return term;
      }
      context.popOnFailure();
      return null;
    }
  }

  @SuppressWarnings("all") public static class gen_requires_method_name_0_1 extends Strategy 
  { 
    public static gen_requires_method_name_0_1 instance = new gen_requires_method_name_0_1();

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm j_42)
    { 
      ITermFactory termFactory = context.getFactory();
      context.push("gen_requires_method_name_0_1");
      Fail175:
      { 
        IStrategoTerm k_42 = null;
        IStrategoTerm l_42 = null;
        if(term.getTermType() != IStrategoTerm.APPL || transform._consMethodSignature_2 != ((IStrategoAppl)term).getConstructor())
          break Fail175;
        IStrategoTerm arg132 = term.getSubterm(0);
        if(arg132.getTermType() != IStrategoTerm.APPL || transform._consId_1 != ((IStrategoAppl)arg132).getConstructor())
          break Fail175;
        k_42 = arg132.getSubterm(0);
        l_42 = term;
        term = hashtable_get_0_1.instance.invoke(context, j_42, l_42);
        if(term == null)
          break Fail175;
        term = int_to_string_0_0.instance.invoke(context, term);
        if(term == null)
          break Fail175;
        term = (IStrategoTerm)termFactory.makeListCons(transform.const40, termFactory.makeListCons(k_42, termFactory.makeListCons(term, (IStrategoList)transform.constNil0)));
        term = concat_strings_0_0.instance.invoke(context, term);
        if(term == null)
          break Fail175;
        context.popOnSuccess();
        if(true)
          return term;
      }
      context.popOnFailure();
      return null;
    }
  }

  @SuppressWarnings("all") public static class gen_on_entry_method_name_0_1 extends Strategy 
  { 
    public static gen_on_entry_method_name_0_1 instance = new gen_on_entry_method_name_0_1();

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm q_42)
    { 
      ITermFactory termFactory = context.getFactory();
      context.push("gen_on_entry_method_name_0_1");
      Fail176:
      { 
        IStrategoTerm r_42 = null;
        IStrategoTerm s_42 = null;
        if(term.getTermType() != IStrategoTerm.APPL || transform._consMethodSignature_2 != ((IStrategoAppl)term).getConstructor())
          break Fail176;
        IStrategoTerm arg134 = term.getSubterm(0);
        if(arg134.getTermType() != IStrategoTerm.APPL || transform._consId_1 != ((IStrategoAppl)arg134).getConstructor())
          break Fail176;
        r_42 = arg134.getSubterm(0);
        s_42 = term;
        term = hashtable_get_0_1.instance.invoke(context, q_42, s_42);
        if(term == null)
          break Fail176;
        term = int_to_string_0_0.instance.invoke(context, term);
        if(term == null)
          break Fail176;
        term = (IStrategoTerm)termFactory.makeListCons(transform.const41, termFactory.makeListCons(r_42, termFactory.makeListCons(term, (IStrategoList)transform.constNil0)));
        term = concat_strings_0_0.instance.invoke(context, term);
        if(term == null)
          break Fail176;
        context.popOnSuccess();
        if(true)
          return term;
      }
      context.popOnFailure();
      return null;
    }
  }

  @SuppressWarnings("all") public static class gen_on_exit_method_name_0_1 extends Strategy 
  { 
    public static gen_on_exit_method_name_0_1 instance = new gen_on_exit_method_name_0_1();

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm x_42)
    { 
      ITermFactory termFactory = context.getFactory();
      context.push("gen_on_exit_method_name_0_1");
      Fail177:
      { 
        IStrategoTerm y_42 = null;
        IStrategoTerm z_42 = null;
        if(term.getTermType() != IStrategoTerm.APPL || transform._consMethodSignature_2 != ((IStrategoAppl)term).getConstructor())
          break Fail177;
        IStrategoTerm arg136 = term.getSubterm(0);
        if(arg136.getTermType() != IStrategoTerm.APPL || transform._consId_1 != ((IStrategoAppl)arg136).getConstructor())
          break Fail177;
        y_42 = arg136.getSubterm(0);
        z_42 = term;
        term = hashtable_get_0_1.instance.invoke(context, x_42, z_42);
        if(term == null)
          break Fail177;
        term = int_to_string_0_0.instance.invoke(context, term);
        if(term == null)
          break Fail177;
        term = (IStrategoTerm)termFactory.makeListCons(transform.const42, termFactory.makeListCons(y_42, termFactory.makeListCons(term, (IStrategoList)transform.constNil0)));
        term = concat_strings_0_0.instance.invoke(context, term);
        if(term == null)
          break Fail177;
        context.popOnSuccess();
        if(true)
          return term;
      }
      context.popOnFailure();
      return null;
    }
  }

  @SuppressWarnings("all") public static class make_while_condition_0_1 extends Strategy 
  { 
    public static make_while_condition_0_1 instance = new make_while_condition_0_1();

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm g_43)
    { 
      ITermFactory termFactory = context.getFactory();
      context.push("make_while_condition_0_1");
      Fail178:
      { 
        IStrategoTerm h_43 = null;
        IStrategoTerm i_43 = null;
        IStrategoTerm j_43 = null;
        IStrategoTerm k_43 = null;
        k_43 = term;
        term = length_0_0.instance.invoke(context, g_43);
        if(term == null)
          break Fail178;
        j_43 = term;
        term = k_43;
        IStrategoTerm term185 = term;
        Success143:
        { 
          Fail179:
          { 
            IStrategoTerm l_43 = null;
            IStrategoTerm p_43 = null;
            l_43 = term;
            p_43 = j_43;
            term = equal_0_1.instance.invoke(context, p_43, transform.const18);
            if(term == null)
              break Fail179;
            term = l_43;
            { 
              term = transform.constFalse0;
              if(true)
                break Success143;
            }
          }
          term = term185;
          Success144:
          { 
            Fail180:
            { 
              IStrategoTerm m_43 = null;
              IStrategoTerm r_43 = null;
              m_43 = term;
              r_43 = j_43;
              term = equal_0_1.instance.invoke(context, r_43, transform.const16);
              if(term == null)
                break Fail180;
              term = m_43;
              { 
                IStrategoTerm n_43 = null;
                term = g_43;
                if(term.getTermType() != IStrategoTerm.LIST || ((IStrategoList)term).isEmpty())
                  break Fail178;
                n_43 = ((IStrategoList)term).head();
                IStrategoTerm arg138 = ((IStrategoList)term).tail();
                if(arg138.getTermType() != IStrategoTerm.LIST || !((IStrategoList)arg138).isEmpty())
                  break Fail178;
                term = n_43;
                if(true)
                  break Success144;
              }
            }
            term = g_43;
            if(term.getTermType() != IStrategoTerm.LIST || ((IStrategoList)term).isEmpty())
              break Fail178;
            i_43 = ((IStrategoList)term).head();
            h_43 = ((IStrategoList)term).tail();
            term = this.invoke(context, term, h_43);
            if(term == null)
              break Fail178;
            term = termFactory.makeAppl(transform._consLazyOr_2, new IStrategoTerm[]{term, i_43});
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

  @SuppressWarnings("all") public static class gen_class_head_0_1 extends Strategy 
  { 
    public static gen_class_head_0_1 instance = new gen_class_head_0_1();

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm u_43)
    { 
      ITermFactory termFactory = context.getFactory();
      context.push("gen_class_head_0_1");
      Fail181:
      { 
        IStrategoTerm w_43 = null;
        IStrategoTerm x_43 = null;
        term = u_43;
        IStrategoTerm term187 = term;
        IStrategoConstructor cons6 = term.getTermType() == IStrategoTerm.APPL ? ((IStrategoAppl)term).getConstructor() : null;
        Success145:
        { 
          if(cons6 == transform._consTypeName_2)
          { 
            Fail182:
            { 
              IStrategoTerm w_187 = null;
              IStrategoTerm arg140 = term.getSubterm(1);
              if(arg140.getTermType() != IStrategoTerm.APPL || transform._consId_1 != ((IStrategoAppl)arg140).getConstructor())
                break Fail182;
              w_187 = arg140.getSubterm(0);
              term = w_187;
              if(true)
                break Success145;
            }
            term = term187;
          }
          if(cons6 == transform._consTypeName_1)
          { 
            IStrategoTerm x_187 = null;
            IStrategoTerm arg141 = term.getSubterm(0);
            if(arg141.getTermType() != IStrategoTerm.APPL || transform._consId_1 != ((IStrategoAppl)arg141).getConstructor())
              break Fail181;
            x_187 = arg141.getSubterm(0);
            term = x_187;
          }
          else
          { 
            break Fail181;
          }
        }
        x_43 = term;
        term = fetch__full__class__name_0_0.instance.invoke(context, u_43);
        if(term == null)
          break Fail181;
        term = (IStrategoTerm)termFactory.makeListCons(termFactory.makeAppl(transform._consAnno_2, new IStrategoTerm[]{transform.constTypeName4, (IStrategoTerm)termFactory.makeListCons(termFactory.makeAppl(transform._consElemValPair_2, new IStrategoTerm[]{transform.constId15, termFactory.makeAppl(transform._consLit_1, new IStrategoTerm[]{termFactory.makeAppl(transform._consString_1, new IStrategoTerm[]{(IStrategoTerm)termFactory.makeListCons(termFactory.makeAppl(transform._consChars_1, new IStrategoTerm[]{term}), (IStrategoList)transform.constNil0)})})}), (IStrategoList)transform.constNil0)}), (IStrategoList)transform.constCons11);
        w_43 = term;
        term = (IStrategoTerm)termFactory.makeListCons(x_43, (IStrategoList)transform.constCons3);
        term = concat_strings_0_0.instance.invoke(context, term);
        if(term == null)
          break Fail181;
        term = termFactory.makeAppl(transform._consClassDecHead_5, new IStrategoTerm[]{w_43, termFactory.makeAppl(transform._consId_1, new IStrategoTerm[]{term}), transform.constNone0, transform.constNone0, transform.constNone0});
        context.popOnSuccess();
        if(true)
          return term;
      }
      context.popOnFailure();
      return null;
    }
  }

  @SuppressWarnings("all") public static class make_requires_method_0_3 extends Strategy 
  { 
    public static make_requires_method_0_3 instance = new make_requires_method_0_3();

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm a_44, IStrategoTerm b_44, IStrategoTerm c_44)
    { 
      ITermFactory termFactory = context.getFactory();
      context.push("make_requires_method_0_3");
      Fail183:
      { 
        IStrategoTerm d_44 = null;
        IStrategoTerm e_44 = null;
        IStrategoTerm f_44 = null;
        IStrategoTerm g_44 = null;
        IStrategoTerm h_44 = null;
        if(term.getTermType() != IStrategoTerm.APPL || transform._consMethodSignature_2 != ((IStrategoAppl)term).getConstructor())
          break Fail183;
        IStrategoTerm arg142 = term.getSubterm(0);
        if(arg142.getTermType() != IStrategoTerm.APPL || transform._consId_1 != ((IStrategoAppl)arg142).getConstructor())
          break Fail183;
        d_44 = arg142.getSubterm(0);
        e_44 = term.getSubterm(1);
        h_44 = term;
        term = map_1_0.instance.invoke(context, e_44, pp_type_0_0.instance);
        if(term == null)
          break Fail183;
        term = map_1_0.instance.invoke(context, term, lifted103.instance);
        if(term == null)
          break Fail183;
        term = (IStrategoTerm)termFactory.makeListCons(termFactory.makeAppl(transform._consAnno_2, new IStrategoTerm[]{transform.constTypeName5, (IStrategoTerm)termFactory.makeListCons(termFactory.makeAppl(transform._consElemValPair_2, new IStrategoTerm[]{transform.constId18, termFactory.makeAppl(transform._consLit_1, new IStrategoTerm[]{termFactory.makeAppl(transform._consString_1, new IStrategoTerm[]{(IStrategoTerm)termFactory.makeListCons(termFactory.makeAppl(transform._consChars_1, new IStrategoTerm[]{d_44}), (IStrategoList)transform.constNil0)})})}), termFactory.makeListCons(transform.constElemValPair0, termFactory.makeListCons(termFactory.makeAppl(transform._consElemValPair_2, new IStrategoTerm[]{transform.constId17, termFactory.makeAppl(transform._consElemValArrayInit_1, new IStrategoTerm[]{term})}), (IStrategoList)transform.constNil0)))}), (IStrategoList)transform.constCons2);
        f_44 = term;
        term = gen_requires_method_name_0_1.instance.invoke(context, h_44, c_44);
        if(term == null)
          break Fail183;
        g_44 = term;
        term = hashtable_put_0_2.instance.invoke(context, b_44, h_44, term);
        if(term == null)
          break Fail183;
        term = hashtable_get_0_1.instance.invoke(context, a_44, h_44);
        if(term == null)
          break Fail183;
        term = termFactory.makeAppl(transform._consMethodDec_2, new IStrategoTerm[]{termFactory.makeAppl(transform._consMethodDecHead_6, new IStrategoTerm[]{f_44, transform.constNone0, transform.constBoolean0, termFactory.makeAppl(transform._consId_1, new IStrategoTerm[]{g_44}), transform.constNil0, transform.constNone0}), termFactory.makeAppl(transform._consBlock_1, new IStrategoTerm[]{(IStrategoTerm)termFactory.makeListCons(termFactory.makeAppl(transform._consReturn_1, new IStrategoTerm[]{termFactory.makeAppl(transform._consSome_1, new IStrategoTerm[]{term})}), (IStrategoList)transform.constNil0)})});
        context.popOnSuccess();
        if(true)
          return term;
      }
      context.popOnFailure();
      return null;
    }
  }

  @SuppressWarnings("all") public static class gen_source_location_ann_0_1 extends Strategy 
  { 
    public static gen_source_location_ann_0_1 instance = new gen_source_location_ann_0_1();

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm b_45)
    { 
      ITermFactory termFactory = context.getFactory();
      context.push("gen_source_location_ann_0_1");
      Fail184:
      { 
        IStrategoTerm c_45 = null;
        IStrategoTerm e_45 = null;
        IStrategoTerm f_45 = null;
        IStrategoTerm g_45 = null;
        IStrategoTerm d_45 = null;
        c_45 = term;
        term = original_location_0_0.instance.invoke(context, c_45);
        if(term == null)
          break Fail184;
        term = original_start_line_0_0.instance.invoke(context, term);
        if(term == null)
          break Fail184;
        term = int_to_string_0_0.instance.invoke(context, term);
        if(term == null)
          break Fail184;
        e_45 = term;
        term = original_location_0_0.instance.invoke(context, c_45);
        if(term == null)
          break Fail184;
        term = original_end_line_0_0.instance.invoke(context, term);
        if(term == null)
          break Fail184;
        term = int_to_string_0_0.instance.invoke(context, term);
        if(term == null)
          break Fail184;
        f_45 = term;
        term = original_location_0_0.instance.invoke(context, c_45);
        if(term == null)
          break Fail184;
        term = original_column_0_0.instance.invoke(context, term);
        if(term == null)
          break Fail184;
        term = int_to_string_0_0.instance.invoke(context, term);
        if(term == null)
          break Fail184;
        g_45 = term;
        term = original_offset_0_0.instance.invoke(context, c_45);
        if(term == null)
          break Fail184;
        if(term.getTermType() != IStrategoTerm.TUPLE || term.getSubtermCount() != 2)
          break Fail184;
        d_45 = term.getSubterm(0);
        term = int_to_string_0_0.instance.invoke(context, d_45);
        if(term == null)
          break Fail184;
        term = termFactory.makeAppl(transform._consAnno_2, new IStrategoTerm[]{termFactory.makeAppl(transform._consTypeName_1, new IStrategoTerm[]{termFactory.makeAppl(transform._consId_1, new IStrategoTerm[]{b_45})}), (IStrategoTerm)termFactory.makeListCons(termFactory.makeAppl(transform._consElemValPair_2, new IStrategoTerm[]{transform.constId22, termFactory.makeAppl(transform._consLit_1, new IStrategoTerm[]{termFactory.makeAppl(transform._consDeci_1, new IStrategoTerm[]{e_45})})}), termFactory.makeListCons(termFactory.makeAppl(transform._consElemValPair_2, new IStrategoTerm[]{transform.constId21, termFactory.makeAppl(transform._consLit_1, new IStrategoTerm[]{termFactory.makeAppl(transform._consDeci_1, new IStrategoTerm[]{f_45})})}), termFactory.makeListCons(termFactory.makeAppl(transform._consElemValPair_2, new IStrategoTerm[]{transform.constId20, termFactory.makeAppl(transform._consLit_1, new IStrategoTerm[]{termFactory.makeAppl(transform._consDeci_1, new IStrategoTerm[]{g_45})})}), termFactory.makeListCons(termFactory.makeAppl(transform._consElemValPair_2, new IStrategoTerm[]{transform.constId19, termFactory.makeAppl(transform._consLit_1, new IStrategoTerm[]{termFactory.makeAppl(transform._consDeci_1, new IStrategoTerm[]{term})})}), (IStrategoList)transform.constNil0))))});
        context.popOnSuccess();
        if(true)
          return term;
      }
      context.popOnFailure();
      return null;
    }
  }

  @SuppressWarnings("all") public static class original_location_0_0 extends Strategy 
  { 
    public static original_location_0_0 instance = new original_location_0_0();

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      Fail185:
      { 
        IStrategoTerm r_45 = null;
        r_45 = term;
        term = context.invokePrimitive("SSL_EXT_origin_location", r_45, NO_STRATEGIES, new IStrategoTerm[]{term});
        if(term == null)
          break Fail185;
        if(true)
          return term;
      }
      context.push("original_location_0_0");
      context.popOnFailure();
      return null;
    }
  }

  @SuppressWarnings("all") public static class original_start_line_0_0 extends Strategy 
  { 
    public static original_start_line_0_0 instance = new original_start_line_0_0();

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      Fail186:
      { 
        IStrategoTerm u_45 = null;
        if(term.getTermType() != IStrategoTerm.TUPLE || term.getSubtermCount() != 4)
          break Fail186;
        u_45 = term.getSubterm(0);
        term = u_45;
        if(true)
          return term;
      }
      context.push("original_start_line_0_0");
      context.popOnFailure();
      return null;
    }
  }

  @SuppressWarnings("all") public static class original_column_0_0 extends Strategy 
  { 
    public static original_column_0_0 instance = new original_column_0_0();

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      Fail187:
      { 
        IStrategoTerm v_45 = null;
        if(term.getTermType() != IStrategoTerm.TUPLE || term.getSubtermCount() != 4)
          break Fail187;
        v_45 = term.getSubterm(1);
        term = v_45;
        if(true)
          return term;
      }
      context.push("original_column_0_0");
      context.popOnFailure();
      return null;
    }
  }

  @SuppressWarnings("all") public static class original_end_line_0_0 extends Strategy 
  { 
    public static original_end_line_0_0 instance = new original_end_line_0_0();

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      Fail188:
      { 
        IStrategoTerm w_45 = null;
        if(term.getTermType() != IStrategoTerm.TUPLE || term.getSubtermCount() != 4)
          break Fail188;
        w_45 = term.getSubterm(2);
        term = w_45;
        if(true)
          return term;
      }
      context.push("original_end_line_0_0");
      context.popOnFailure();
      return null;
    }
  }

  @SuppressWarnings("all") public static class original_offset_0_0 extends Strategy 
  { 
    public static original_offset_0_0 instance = new original_offset_0_0();

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      Fail189:
      { 
        IStrategoTerm y_45 = null;
        y_45 = term;
        term = context.invokePrimitive("SSL_EXT_origin_offset", y_45, NO_STRATEGIES, new IStrategoTerm[]{term});
        if(term == null)
          break Fail189;
        if(true)
          return term;
      }
      context.push("original_offset_0_0");
      context.popOnFailure();
      return null;
    }
  }

  @SuppressWarnings("all") public static class make_on_entry_method_0_4 extends Strategy 
  { 
    public static make_on_entry_method_0_4 instance = new make_on_entry_method_0_4();

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm b_46, IStrategoTerm c_46, IStrategoTerm d_46, IStrategoTerm e_46)
    { 
      ITermFactory termFactory = context.getFactory();
      context.push("make_on_entry_method_0_4");
      Fail190:
      { 
        IStrategoTerm f_46 = null;
        IStrategoTerm g_46 = null;
        IStrategoTerm h_46 = null;
        IStrategoTerm i_46 = null;
        IStrategoTerm j_46 = null;
        if(term.getTermType() != IStrategoTerm.APPL || transform._consMethodSignature_2 != ((IStrategoAppl)term).getConstructor())
          break Fail190;
        IStrategoTerm arg153 = term.getSubterm(0);
        if(arg153.getTermType() != IStrategoTerm.APPL || transform._consId_1 != ((IStrategoAppl)arg153).getConstructor())
          break Fail190;
        f_46 = arg153.getSubterm(0);
        g_46 = term.getSubterm(1);
        j_46 = term;
        term = map_1_0.instance.invoke(context, g_46, pp_type_0_0.instance);
        if(term == null)
          break Fail190;
        term = map_1_0.instance.invoke(context, term, lifted105.instance);
        if(term == null)
          break Fail190;
        term = (IStrategoTerm)termFactory.makeListCons(termFactory.makeAppl(transform._consAnno_2, new IStrategoTerm[]{transform.constTypeName6, (IStrategoTerm)termFactory.makeListCons(termFactory.makeAppl(transform._consElemValPair_2, new IStrategoTerm[]{transform.constId18, termFactory.makeAppl(transform._consLit_1, new IStrategoTerm[]{termFactory.makeAppl(transform._consString_1, new IStrategoTerm[]{(IStrategoTerm)termFactory.makeListCons(termFactory.makeAppl(transform._consChars_1, new IStrategoTerm[]{f_46}), (IStrategoList)transform.constNil0)})})}), termFactory.makeListCons(transform.constElemValPair0, termFactory.makeListCons(termFactory.makeAppl(transform._consElemValPair_2, new IStrategoTerm[]{transform.constId17, termFactory.makeAppl(transform._consElemValArrayInit_1, new IStrategoTerm[]{term})}), (IStrategoList)transform.constNil0)))}), (IStrategoList)transform.constCons2);
        h_46 = term;
        term = gen_on_entry_method_name_0_1.instance.invoke(context, j_46, e_46);
        if(term == null)
          break Fail190;
        i_46 = term;
        term = hashtable_put_0_2.instance.invoke(context, d_46, j_46, term);
        if(term == null)
          break Fail190;
        term = hashtable_get_0_1.instance.invoke(context, b_46, j_46);
        if(term == null)
          break Fail190;
        term = termFactory.makeAppl(transform._consMethodDec_2, new IStrategoTerm[]{termFactory.makeAppl(transform._consMethodDecHead_6, new IStrategoTerm[]{h_46, transform.constNone0, transform.constVoid0, termFactory.makeAppl(transform._consId_1, new IStrategoTerm[]{i_46}), (IStrategoTerm)termFactory.makeListCons(termFactory.makeAppl(transform._consParam_3, new IStrategoTerm[]{transform.constNil0, termFactory.makeAppl(transform._consTypeName_1, new IStrategoTerm[]{termFactory.makeAppl(transform._consId_1, new IStrategoTerm[]{c_46})}), transform.constId0}), (IStrategoList)transform.constNil0), transform.constNone0}), term});
        context.popOnSuccess();
        if(true)
          return term;
      }
      context.popOnFailure();
      return null;
    }
  }

  @SuppressWarnings("all") public static class make_on_exit_method_0_4 extends Strategy 
  { 
    public static make_on_exit_method_0_4 instance = new make_on_exit_method_0_4();

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm r_46, IStrategoTerm s_46, IStrategoTerm t_46, IStrategoTerm u_46)
    { 
      ITermFactory termFactory = context.getFactory();
      context.push("make_on_exit_method_0_4");
      Fail191:
      { 
        IStrategoTerm v_46 = null;
        IStrategoTerm w_46 = null;
        IStrategoTerm x_46 = null;
        IStrategoTerm y_46 = null;
        IStrategoTerm z_46 = null;
        if(term.getTermType() != IStrategoTerm.APPL || transform._consMethodSignature_2 != ((IStrategoAppl)term).getConstructor())
          break Fail191;
        IStrategoTerm arg154 = term.getSubterm(0);
        if(arg154.getTermType() != IStrategoTerm.APPL || transform._consId_1 != ((IStrategoAppl)arg154).getConstructor())
          break Fail191;
        v_46 = arg154.getSubterm(0);
        w_46 = term.getSubterm(1);
        z_46 = term;
        term = map_1_0.instance.invoke(context, w_46, pp_type_0_0.instance);
        if(term == null)
          break Fail191;
        term = map_1_0.instance.invoke(context, term, lifted107.instance);
        if(term == null)
          break Fail191;
        term = (IStrategoTerm)termFactory.makeListCons(termFactory.makeAppl(transform._consAnno_2, new IStrategoTerm[]{transform.constTypeName7, (IStrategoTerm)termFactory.makeListCons(termFactory.makeAppl(transform._consElemValPair_2, new IStrategoTerm[]{transform.constId18, termFactory.makeAppl(transform._consLit_1, new IStrategoTerm[]{termFactory.makeAppl(transform._consString_1, new IStrategoTerm[]{(IStrategoTerm)termFactory.makeListCons(termFactory.makeAppl(transform._consChars_1, new IStrategoTerm[]{v_46}), (IStrategoList)transform.constNil0)})})}), termFactory.makeListCons(transform.constElemValPair0, termFactory.makeListCons(termFactory.makeAppl(transform._consElemValPair_2, new IStrategoTerm[]{transform.constId17, termFactory.makeAppl(transform._consElemValArrayInit_1, new IStrategoTerm[]{term})}), (IStrategoList)transform.constNil0)))}), (IStrategoList)transform.constCons2);
        x_46 = term;
        term = gen_on_exit_method_name_0_1.instance.invoke(context, z_46, u_46);
        if(term == null)
          break Fail191;
        y_46 = term;
        term = hashtable_put_0_2.instance.invoke(context, t_46, z_46, term);
        if(term == null)
          break Fail191;
        term = hashtable_get_0_1.instance.invoke(context, r_46, z_46);
        if(term == null)
          break Fail191;
        term = termFactory.makeAppl(transform._consMethodDec_2, new IStrategoTerm[]{termFactory.makeAppl(transform._consMethodDecHead_6, new IStrategoTerm[]{x_46, transform.constNone0, transform.constVoid0, termFactory.makeAppl(transform._consId_1, new IStrategoTerm[]{y_46}), (IStrategoTerm)termFactory.makeListCons(termFactory.makeAppl(transform._consParam_3, new IStrategoTerm[]{transform.constNil0, termFactory.makeAppl(transform._consTypeName_1, new IStrategoTerm[]{termFactory.makeAppl(transform._consId_1, new IStrategoTerm[]{s_46})}), transform.constId0}), (IStrategoList)transform.constNil0), transform.constNone0}), term});
        context.popOnSuccess();
        if(true)
          return term;
      }
      context.popOnFailure();
      return null;
    }
  }

  @SuppressWarnings("all") public static class convert_0_0 extends Strategy 
  { 
    public static convert_0_0 instance = new convert_0_0();

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      ITermFactory termFactory = context.getFactory();
      context.push("convert_0_0");
      Fail192:
      { 
        IStrategoTerm h_47 = null;
        IStrategoTerm i_47 = null;
        IStrategoTerm j_47 = null;
        IStrategoTerm k_47 = null;
        IStrategoTerm l_47 = null;
        IStrategoTerm m_47 = null;
        IStrategoTerm n_47 = null;
        IStrategoTerm o_47 = null;
        if(term.getTermType() != IStrategoTerm.APPL || transform._consCompilationUnit_3 != ((IStrategoAppl)term).getConstructor())
          break Fail192;
        j_47 = term.getSubterm(0);
        k_47 = term.getSubterm(1);
        i_47 = term.getSubterm(2);
        o_47 = term;
        Success146:
        { 
          Fail193:
          { 
            IStrategoTerm p_47 = null;
            p_47 = term;
            term = get_coordinator_0_1.instance.invoke(context, o_47, i_47);
            if(term == null)
              break Fail193;
            h_47 = term;
            term = p_47;
            { 
              IStrategoTerm s_47 = null;
              term = fetch_coordinator_type_0_0.instance.invoke(context, h_47);
              if(term == null)
                break Fail192;
              l_47 = term;
              term = convert_coordinator_declaration_0_1.instance.invoke(context, h_47, term);
              if(term == null)
                break Fail192;
              m_47 = term;
              term = remove_all_1_0.instance.invoke(context, i_47, lifted108.instance);
              if(term == null)
                break Fail192;
              n_47 = term;
              term = generate_imports_0_2.instance.invoke(context, term, k_47, l_47);
              if(term == null)
                break Fail192;
              s_47 = term;
              term = termFactory.makeTuple((IStrategoTerm)termFactory.makeListCons(m_47, (IStrategoList)transform.constNil0), n_47);
              term = conc_0_0.instance.invoke(context, term);
              if(term == null)
                break Fail192;
              term = termFactory.makeAppl(transform._consCompilationUnit_3, new IStrategoTerm[]{j_47, s_47, term});
              if(true)
                break Success146;
            }
          }
          term = o_47;
        }
        context.popOnSuccess();
        if(true)
          return term;
      }
      context.popOnFailure();
      return null;
    }
  }

  @SuppressWarnings("all") public static class generate_imports_0_2 extends Strategy 
  { 
    public static generate_imports_0_2 instance = new generate_imports_0_2();

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm w_47, IStrategoTerm x_47)
    { 
      ITermFactory termFactory = context.getFactory();
      context.push("generate_imports_0_2");
      Fail194:
      { 
        term = termFactory.makeTuple(w_47, (IStrategoTerm)termFactory.makeListCons(termFactory.makeAppl(transform._consTypeImportDec_1, new IStrategoTerm[]{x_47}), (IStrategoList)transform.constNil0), transform.constCons14, transform.constCons17);
        term = conc_0_0.instance.invoke(context, term);
        if(term == null)
          break Fail194;
        context.popOnSuccess();
        if(true)
          return term;
      }
      context.popOnFailure();
      return null;
    }
  }

  @SuppressWarnings("all") public static class get_coordinator_0_1 extends Strategy 
  { 
    public static get_coordinator_0_1 instance = new get_coordinator_0_1();

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm y_47)
    { 
      context.push("get_coordinator_0_1");
      Fail195:
      { 
        term = getfirst_1_0.instance.invoke(context, y_47, lifted109.instance);
        if(term == null)
          break Fail195;
        context.popOnSuccess();
        if(true)
          return term;
      }
      context.popOnFailure();
      return null;
    }
  }

  @SuppressWarnings("all") public static class fetch_coordinator_type_0_0 extends Strategy 
  { 
    public static fetch_coordinator_type_0_0 instance = new fetch_coordinator_type_0_0();

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      Fail196:
      { 
        IStrategoTerm a_48 = null;
        IStrategoTerm b_48 = null;
        if(term.getTermType() != IStrategoTerm.APPL || transform._consCoordinatorDec_2 != ((IStrategoAppl)term).getConstructor())
          break Fail196;
        a_48 = term.getSubterm(0);
        term = a_48;
        if(term.getTermType() != IStrategoTerm.APPL || transform._consCoordinatorDecHead_1 != ((IStrategoAppl)term).getConstructor())
          break Fail196;
        b_48 = term.getSubterm(0);
        term = b_48;
        if(true)
          return term;
      }
      context.push("fetch_coordinator_type_0_0");
      context.popOnFailure();
      return null;
    }
  }

  @SuppressWarnings("all") public static class convert_coordinator_declaration_0_1 extends Strategy 
  { 
    public static convert_coordinator_declaration_0_1 instance = new convert_coordinator_declaration_0_1();

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm e_48)
    { 
      ITermFactory termFactory = context.getFactory();
      context.push("convert_coordinator_declaration_0_1");
      Fail197:
      { 
        IStrategoTerm g_48 = null;
        IStrategoTerm h_48 = null;
        IStrategoTerm k_48 = null;
        IStrategoTerm n_48 = null;
        if(term.getTermType() != IStrategoTerm.APPL || transform._consCoordinatorDec_2 != ((IStrategoAppl)term).getConstructor())
          break Fail197;
        g_48 = term.getSubterm(1);
        k_48 = term;
        IStrategoTerm term189 = term;
        Success147:
        { 
          Fail198:
          { 
            term = e_48;
            IStrategoTerm term190 = term;
            IStrategoConstructor cons7 = term.getTermType() == IStrategoTerm.APPL ? ((IStrategoAppl)term).getConstructor() : null;
            Success148:
            { 
              if(cons7 == transform._consTypeName_2)
              { 
                Fail199:
                { 
                  IStrategoTerm y_187 = null;
                  IStrategoTerm arg160 = term.getSubterm(1);
                  if(arg160.getTermType() != IStrategoTerm.APPL || transform._consId_1 != ((IStrategoAppl)arg160).getConstructor())
                    break Fail199;
                  y_187 = arg160.getSubterm(0);
                  term = y_187;
                  if(true)
                    break Success148;
                }
                term = term190;
              }
              if(cons7 == transform._consTypeName_1)
              { 
                IStrategoTerm z_187 = null;
                IStrategoTerm arg161 = term.getSubterm(0);
                if(arg161.getTermType() != IStrategoTerm.APPL || transform._consId_1 != ((IStrategoAppl)arg161).getConstructor())
                  break Fail198;
                z_187 = arg161.getSubterm(0);
                term = z_187;
              }
              else
              { 
                break Fail198;
              }
            }
            h_48 = term;
            if(true)
              break Success147;
          }
          term = term189;
          IStrategoTerm i_48 = null;
          IStrategoTerm j_48 = null;
          IStrategoTerm m_48 = null;
          i_48 = term;
          term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
          if(term == null)
            break Fail197;
          j_48 = term;
          m_48 = i_48;
          term = report_with_failure_0_2.instance.invoke(context, m_48, transform.const57, j_48);
          if(term == null)
            break Fail197;
        }
        term = k_48;
        term = gen_class_head_0_1.instance.invoke(context, term, e_48);
        if(term == null)
          break Fail197;
        n_48 = term;
        term = gen_coordinator_body_0_1.instance.invoke(context, g_48, h_48);
        if(term == null)
          break Fail197;
        term = termFactory.makeAppl(transform._consClassDec_2, new IStrategoTerm[]{n_48, term});
        term = add__externals_0_1.instance.invoke(context, term, h_48);
        if(term == null)
          break Fail197;
        context.popOnSuccess();
        if(true)
          return term;
      }
      context.popOnFailure();
      return null;
    }
  }

  @SuppressWarnings("all") public static class gen_coordinator_body_0_1 extends Strategy 
  { 
    public static gen_coordinator_body_0_1 instance = new gen_coordinator_body_0_1();

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm ref_t_48)
    { 
      ITermFactory termFactory = context.getFactory();
      TermReference t_48 = new TermReference(ref_t_48);
      context.push("gen_coordinator_body_0_1");
      Fail200:
      { 
        TermReference u_48 = new TermReference();
        TermReference v_48 = new TermReference();
        TermReference w_48 = new TermReference();
        IStrategoTerm x_48 = null;
        TermReference y_48 = new TermReference();
        TermReference z_48 = new TermReference();
        TermReference a_49 = new TermReference();
        TermReference b_49 = new TermReference();
        IStrategoTerm c_49 = null;
        IStrategoTerm d_49 = null;
        TermReference e_49 = new TermReference();
        IStrategoTerm f_49 = null;
        TermReference g_49 = new TermReference();
        TermReference h_49 = new TermReference();
        TermReference i_49 = new TermReference();
        TermReference j_49 = new TermReference();
        IStrategoTerm q_49 = null;
        IStrategoTerm r_50 = null;
        IStrategoTerm z_50 = null;
        IStrategoTerm s_50 = null;
        IStrategoTerm a_51 = null;
        IStrategoTerm t_50 = null;
        IStrategoTerm b_51 = null;
        IStrategoTerm u_50 = null;
        IStrategoTerm c_51 = null;
        IStrategoTerm v_50 = null;
        IStrategoTerm d_51 = null;
        IStrategoTerm w_50 = null;
        IStrategoTerm e_51 = null;
        IStrategoTerm x_50 = null;
        IStrategoTerm f_51 = null;
        if(term.getTermType() != IStrategoTerm.APPL || transform._consCoordinatorBody_1 != ((IStrategoAppl)term).getConstructor())
          break Fail200;
        d_49 = term.getSubterm(0);
        q_49 = term;
        IStrategoTerm term191 = term;
        Success149:
        { 
          Fail201:
          { 
            term = new_hashtable_0_0.instance.invoke(context, term);
            if(term == null)
              break Fail201;
            if(g_49.value == null)
              g_49.value = term;
            else
              if(g_49.value != term && !g_49.value.match(term))
                break Fail201;
            term = new_hashtable_0_0.instance.invoke(context, term);
            if(term == null)
              break Fail201;
            if(h_49.value == null)
              h_49.value = term;
            else
              if(h_49.value != term && !h_49.value.match(term))
                break Fail201;
            term = new_hashtable_0_0.instance.invoke(context, term);
            if(term == null)
              break Fail201;
            if(i_49.value == null)
              i_49.value = term;
            else
              if(i_49.value != term && !i_49.value.match(term))
                break Fail201;
            term = new_hashtable_0_0.instance.invoke(context, term);
            if(term == null)
              break Fail201;
            if(u_48.value == null)
              u_48.value = term;
            else
              if(u_48.value != term && !u_48.value.match(term))
                break Fail201;
            term = new_hashtable_0_0.instance.invoke(context, term);
            if(term == null)
              break Fail201;
            if(v_48.value == null)
              v_48.value = term;
            else
              if(v_48.value != term && !v_48.value.match(term))
                break Fail201;
            term = new_hashtable_0_0.instance.invoke(context, term);
            if(term == null)
              break Fail201;
            if(w_48.value == null)
              w_48.value = term;
            else
              if(w_48.value != term && !w_48.value.match(term))
                break Fail201;
            term = new_hashtable_0_0.instance.invoke(context, term);
            if(term == null)
              break Fail201;
            if(j_49.value == null)
              j_49.value = term;
            else
              if(j_49.value != term && !j_49.value.match(term))
                break Fail201;
            term = new_hashtable_0_0.instance.invoke(context, term);
            if(term == null)
              break Fail201;
            if(e_49.value == null)
              e_49.value = term;
            else
              if(e_49.value != term && !e_49.value.match(term))
                break Fail201;
            term = new_hashtable_0_0.instance.invoke(context, term);
            if(term == null)
              break Fail201;
            if(y_48.value == null)
              y_48.value = term;
            else
              if(y_48.value != term && !y_48.value.match(term))
                break Fail201;
            term = new_hashtable_0_0.instance.invoke(context, term);
            if(term == null)
              break Fail201;
            if(z_48.value == null)
              z_48.value = term;
            else
              if(z_48.value != term && !z_48.value.match(term))
                break Fail201;
            term = getfirst_1_0.instance.invoke(context, d_49, lifted110.instance);
            if(term == null)
              break Fail201;
            x_48 = term;
            term = getfirst_1_0.instance.invoke(context, d_49, lifted111.instance);
            if(term == null)
              break Fail201;
            term = get_methods_list_0_0.instance.invoke(context, term);
            if(term == null)
              break Fail201;
            if(a_49.value == null)
              a_49.value = term;
            else
              if(a_49.value != term && !a_49.value.match(term))
                break Fail201;
            term = getfirst_1_0.instance.invoke(context, d_49, lifted112.instance);
            if(term == null)
              break Fail201;
            term = get_methods_list_0_0.instance.invoke(context, term);
            if(term == null)
              break Fail201;
            if(b_49.value == null)
              b_49.value = term;
            else
              if(b_49.value != term && !b_49.value.match(term))
                break Fail201;
            if(a_49.value == null)
              break Fail201;
            term = a_49.value;
            lifted113 lifted1130 = new lifted113();
            lifted1130.y_48 = y_48;
            term = map_1_0.instance.invoke(context, term, lifted1130);
            if(term == null)
              break Fail201;
            if(b_49.value == null)
              break Fail201;
            term = b_49.value;
            lifted114 lifted1140 = new lifted114();
            lifted1140.z_48 = z_48;
            term = map_1_0.instance.invoke(context, term, lifted1140);
            if(term == null)
              break Fail201;
            if(a_49.value == null || b_49.value == null)
              break Fail201;
            term = termFactory.makeTuple(a_49.value, b_49.value);
            term = union_0_0.instance.invoke(context, term);
            if(term == null)
              break Fail201;
            c_49 = term;
            lifted115 lifted1150 = new lifted115();
            lifted1150.j_49 = j_49;
            term = map_1_0.instance.invoke(context, term, lifted1150);
            if(term == null)
              break Fail201;
            term = retain_all_1_0.instance.invoke(context, d_49, lifted116.instance);
            if(term == null)
              break Fail201;
            f_49 = term;
            lifted117 lifted1170 = new lifted117();
            lifted1170.e_49 = e_49;
            term = map_1_0.instance.invoke(context, term, lifted1170);
            if(term == null)
              break Fail201;
            term = f_49;
            lifted118 lifted1180 = new lifted118();
            lifted1180.g_49 = g_49;
            lifted1180.h_49 = h_49;
            lifted1180.i_49 = i_49;
            lifted1180.j_49 = j_49;
            term = map_1_0.instance.invoke(context, term, lifted1180);
            if(term == null)
              break Fail201;
            if(true)
              break Success149;
          }
          term = term191;
          IStrategoTerm o_49 = null;
          IStrategoTerm p_49 = null;
          IStrategoTerm o_50 = null;
          o_49 = term;
          term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
          if(term == null)
            break Fail200;
          p_49 = term;
          o_50 = o_49;
          term = report_with_failure_0_2.instance.invoke(context, o_50, transform.const58, p_49);
          if(term == null)
            break Fail200;
        }
        term = q_49;
        z_50 = term;
        if(x_48 == null)
          break Fail200;
        term = add_condition_fields_0_0.instance.invoke(context, x_48);
        if(term == null)
          break Fail200;
        r_50 = term;
        a_51 = z_50;
        term = add_coordinator_fields_0_0.instance.invoke(context, d_49);
        if(term == null)
          break Fail200;
        s_50 = term;
        term = a_51;
        b_51 = a_51;
        if(c_49 == null)
          break Fail200;
        term = c_49;
        lifted119 lifted1190 = new lifted119();
        lifted1190.j_49 = j_49;
        term = map_1_0.instance.invoke(context, term, lifted1190);
        if(term == null)
          break Fail200;
        t_50 = term;
        term = b_51;
        c_51 = b_51;
        term = gen_is$Run$By$Others_method_0_0.instance.invoke(context, term);
        if(term == null)
          break Fail200;
        u_50 = term;
        term = c_51;
        d_51 = c_51;
        if(g_49.value == null)
          break Fail200;
        term = hashtable_keys_0_0.instance.invoke(context, g_49.value);
        if(term == null)
          break Fail200;
        lifted120 lifted1200 = new lifted120();
        lifted1200.g_49 = g_49;
        lifted1200.u_48 = u_48;
        lifted1200.j_49 = j_49;
        term = map_1_0.instance.invoke(context, term, lifted1200);
        if(term == null)
          break Fail200;
        v_50 = term;
        term = d_51;
        e_51 = d_51;
        if(i_49.value == null)
          break Fail200;
        term = hashtable_keys_0_0.instance.invoke(context, i_49.value);
        if(term == null)
          break Fail200;
        lifted121 lifted1211 = new lifted121();
        lifted1211.i_49 = i_49;
        lifted1211.t_48 = t_48;
        lifted1211.w_48 = w_48;
        lifted1211.j_49 = j_49;
        term = map_1_0.instance.invoke(context, term, lifted1211);
        if(term == null)
          break Fail200;
        w_50 = term;
        term = e_51;
        f_51 = e_51;
        if(h_49.value == null)
          break Fail200;
        term = hashtable_keys_0_0.instance.invoke(context, h_49.value);
        if(term == null)
          break Fail200;
        lifted122 lifted1220 = new lifted122();
        lifted1220.h_49 = h_49;
        lifted1220.t_48 = t_48;
        lifted1220.v_48 = v_48;
        lifted1220.j_49 = j_49;
        term = map_1_0.instance.invoke(context, term, lifted1220);
        if(term == null)
          break Fail200;
        x_50 = term;
        term = f_51;
        if(c_49 == null)
          break Fail200;
        term = c_49;
        lifted123 lifted1230 = new lifted123();
        lifted1230.t_48 = t_48;
        lifted1230.v_48 = v_48;
        lifted1230.u_48 = u_48;
        lifted1230.w_48 = w_48;
        lifted1230.a_49 = a_49;
        lifted1230.b_49 = b_49;
        lifted1230.j_49 = j_49;
        lifted1230.y_48 = y_48;
        lifted1230.z_48 = z_48;
        lifted1230.e_49 = e_49;
        term = map_1_0.instance.invoke(context, term, lifted1230);
        if(term == null)
          break Fail200;
        term = concat_0_0.instance.invoke(context, term);
        if(term == null)
          break Fail200;
        term = termFactory.makeTuple(r_50, s_50, t_50, (IStrategoTerm)termFactory.makeListCons(u_50, (IStrategoList)transform.constNil0), v_50, w_50, x_50, term);
        term = conc_0_0.instance.invoke(context, term);
        if(term == null)
          break Fail200;
        term = termFactory.makeAppl(transform._consClassBody_1, new IStrategoTerm[]{term});
        context.popOnSuccess();
        if(true)
          return term;
      }
      context.popOnFailure();
      return null;
    }
  }

  @SuppressWarnings("all") public static class make_lock_and_unlock_methods_0_10 extends Strategy 
  { 
    public static make_lock_and_unlock_methods_0_10 instance = new make_lock_and_unlock_methods_0_10();

    public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm i_51, IStrategoTerm l_51, IStrategoTerm n_51, IStrategoTerm o_51, IStrategoTerm p_51, IStrategoTerm r_51, IStrategoTerm s_51, IStrategoTerm t_51, IStrategoTerm u_51, IStrategoTerm v_51)
    { 
      ITermFactory termFactory = context.getFactory();
      context.push("make_lock_and_unlock_methods_0_10");
      Fail202:
      { 
        IStrategoTerm w_51 = null;
        IStrategoTerm x_51 = null;
        w_51 = term;
        term = make_lock_method_0_9.instance.invokeDynamic(context, w_51, NO_STRATEGIES, new IStrategoTerm[]{i_51, n_51, o_51, p_51, r_51, s_51, t_51, u_51, v_51});
        if(term == null)
          break Fail202;
        x_51 = term;
        term = make_unlock_method_0_3.instance.invoke(context, w_51, i_51, l_51, s_51);
        if(term == null)
          break Fail202;
        term = (IStrategoTerm)termFactory.makeListCons(x_51, termFactory.makeListCons(term, (IStrategoList)transform.constNil0));
        context.popOnSuccess();
        if(true)
          return term;
      }
      context.popOnFailure();
      return null;
    }

    @Override public IStrategoTerm invokeDynamic(Context context, IStrategoTerm term, Strategy[] sargs, IStrategoTerm[] targs)
    { 
      if(sargs == null || targs == null || sargs.length != 0 || targs.length != 10)
        throw new IllegalArgumentException("Illegal arguments for " + getName());
      return invoke(context, term, targs[0], targs[1], targs[2], targs[3], targs[4], targs[5], targs[6], targs[7], targs[8], targs[9]);
    }
  }

  @SuppressWarnings("all") public static class make_unlock_method_0_3 extends Strategy 
  { 
    public static make_unlock_method_0_3 instance = new make_unlock_method_0_3();

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm d_52, IStrategoTerm e_52, IStrategoTerm f_52)
    { 
      ITermFactory termFactory = context.getFactory();
      context.push("make_unlock_method_0_3");
      Fail203:
      { 
        IStrategoTerm g_52 = null;
        IStrategoTerm k_52 = null;
        IStrategoTerm l_52 = null;
        IStrategoTerm m_52 = null;
        IStrategoTerm n_52 = null;
        IStrategoTerm o_52 = null;
        IStrategoTerm u_52 = null;
        IStrategoTerm f_53 = null;
        IStrategoTerm g_53 = null;
        if(term.getTermType() != IStrategoTerm.APPL || transform._consMethodSignature_2 != ((IStrategoAppl)term).getConstructor())
          break Fail203;
        IStrategoTerm arg172 = term.getSubterm(0);
        if(arg172.getTermType() != IStrategoTerm.APPL || transform._consId_1 != ((IStrategoAppl)arg172).getConstructor())
          break Fail203;
        g_52 = arg172.getSubterm(0);
        k_52 = term.getSubterm(1);
        u_52 = term;
        IStrategoTerm term192 = term;
        Success150:
        { 
          Fail204:
          { 
            m_52 = term;
            term = map_1_0.instance.invoke(context, k_52, pp_type_0_0.instance);
            if(term == null)
              break Fail204;
            term = map_1_0.instance.invoke(context, term, lifted125.instance);
            if(term == null)
              break Fail204;
            term = (IStrategoTerm)termFactory.makeListCons(termFactory.makeAppl(transform._consAnno_2, new IStrategoTerm[]{transform.constTypeName8, (IStrategoTerm)termFactory.makeListCons(termFactory.makeAppl(transform._consElemValPair_2, new IStrategoTerm[]{transform.constId18, termFactory.makeAppl(transform._consLit_1, new IStrategoTerm[]{termFactory.makeAppl(transform._consString_1, new IStrategoTerm[]{(IStrategoTerm)termFactory.makeListCons(termFactory.makeAppl(transform._consChars_1, new IStrategoTerm[]{g_52}), (IStrategoList)transform.constNil0)})})}), termFactory.makeListCons(transform.constElemValPair0, termFactory.makeListCons(termFactory.makeAppl(transform._consElemValPair_2, new IStrategoTerm[]{transform.constId17, termFactory.makeAppl(transform._consElemValArrayInit_1, new IStrategoTerm[]{term})}), (IStrategoList)transform.constNil0)))}), (IStrategoList)transform.constCons19);
            l_52 = term;
            Success151:
            { 
              Fail205:
              { 
                IStrategoTerm q_52 = null;
                q_52 = term;
                term = hashtable_keys_0_0.instance.invoke(context, e_52);
                if(term == null)
                  break Fail205;
                term = termFactory.makeTuple(m_52, term);
                term = elem_0_0.instance.invoke(context, term);
                if(term == null)
                  break Fail205;
                term = q_52;
                { 
                  term = hashtable_get_0_1.instance.invoke(context, e_52, m_52);
                  if(term == null)
                    break Fail204;
                  term = termFactory.makeAppl(transform._consExprStm_1, new IStrategoTerm[]{termFactory.makeAppl(transform._consInvoke_2, new IStrategoTerm[]{termFactory.makeAppl(transform._consMethod_1, new IStrategoTerm[]{termFactory.makeAppl(transform._consMethodName_1, new IStrategoTerm[]{termFactory.makeAppl(transform._consId_1, new IStrategoTerm[]{term})})}), transform.constCons1})});
                  n_52 = term;
                  if(true)
                    break Success151;
                }
              }
              term = transform.constNone0;
              n_52 = transform.constNone0;
            }
            term = gen_method_state_name_0_1.instance.invoke(context, m_52, f_52);
            if(term == null)
              break Fail204;
            term = termFactory.makeTuple((IStrategoTerm)termFactory.makeListCons(termFactory.makeAppl(transform._consExprStm_1, new IStrategoTerm[]{termFactory.makeAppl(transform._consInvoke_2, new IStrategoTerm[]{termFactory.makeAppl(transform._consMethod_1, new IStrategoTerm[]{termFactory.makeAppl(transform._consMethodName_2, new IStrategoTerm[]{termFactory.makeAppl(transform._consAmbName_1, new IStrategoTerm[]{termFactory.makeAppl(transform._consId_1, new IStrategoTerm[]{term})}), transform.constId30})}), transform.constCons7})}), (IStrategoList)transform.constNil0), (IStrategoTerm)termFactory.makeListCons(n_52, (IStrategoList)transform.constNil0), transform.constCons20);
            term = conc_0_0.instance.invoke(context, term);
            if(term == null)
              break Fail204;
            o_52 = term;
            if(true)
              break Success150;
          }
          term = term192;
          IStrategoTerm s_52 = null;
          IStrategoTerm t_52 = null;
          IStrategoTerm e_53 = null;
          s_52 = term;
          term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
          if(term == null)
            break Fail203;
          t_52 = term;
          e_53 = s_52;
          term = report_with_failure_0_2.instance.invoke(context, e_53, transform.const62, t_52);
          if(term == null)
            break Fail203;
        }
        g_53 = u_52;
        term = (IStrategoTerm)termFactory.makeListCons(transform.const63, termFactory.makeListCons(g_52, (IStrategoList)transform.constNil0));
        term = concat_strings_0_0.instance.invoke(context, term);
        if(term == null)
          break Fail203;
        f_53 = term;
        term = g_53;
        if(l_52 == null || o_52 == null)
          break Fail203;
        term = termFactory.makeAppl(transform._consMethodDec_2, new IStrategoTerm[]{termFactory.makeAppl(transform._consMethodDecHead_6, new IStrategoTerm[]{l_52, transform.constNone0, transform.constVoid0, termFactory.makeAppl(transform._consId_1, new IStrategoTerm[]{f_53}), (IStrategoTerm)termFactory.makeListCons(termFactory.makeAppl(transform._consParam_3, new IStrategoTerm[]{transform.constNil0, termFactory.makeAppl(transform._consTypeName_1, new IStrategoTerm[]{termFactory.makeAppl(transform._consId_1, new IStrategoTerm[]{d_52})}), transform.constId0}), (IStrategoList)transform.constNil0), transform.constNone0}), termFactory.makeAppl(transform._consBlock_1, new IStrategoTerm[]{o_52})});
        context.popOnSuccess();
        if(true)
          return term;
      }
      context.popOnFailure();
      return null;
    }
  }

  @SuppressWarnings("all") public static class make_lock_method_0_9 extends Strategy 
  { 
    public static make_lock_method_0_9 instance = new make_lock_method_0_9();

    public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm j_53, IStrategoTerm k_53, IStrategoTerm l_53, IStrategoTerm m_53, IStrategoTerm n_53, IStrategoTerm ref_o_53, IStrategoTerm p_53, IStrategoTerm q_53, IStrategoTerm r_53)
    { 
      ITermFactory termFactory = context.getFactory();
      TermReference o_53 = new TermReference(ref_o_53);
      context.push("make_lock_method_0_9");
      Fail206:
      { 
        IStrategoTerm s_53 = null;
        IStrategoTerm t_53 = null;
        IStrategoTerm u_53 = null;
        IStrategoTerm v_53 = null;
        IStrategoTerm w_53 = null;
        IStrategoTerm x_53 = null;
        TermReference y_53 = new TermReference();
        IStrategoTerm z_53 = null;
        IStrategoTerm a_54 = null;
        IStrategoTerm b_54 = null;
        IStrategoTerm c_54 = null;
        IStrategoTerm d_54 = null;
        IStrategoTerm e_54 = null;
        IStrategoTerm f_54 = null;
        IStrategoTerm i_54 = null;
        IStrategoTerm x_54 = null;
        IStrategoTerm j_56 = null;
        IStrategoTerm k_56 = null;
        if(term.getTermType() != IStrategoTerm.APPL || transform._consMethodSignature_2 != ((IStrategoAppl)term).getConstructor())
          break Fail206;
        IStrategoTerm arg173 = term.getSubterm(0);
        if(arg173.getTermType() != IStrategoTerm.APPL || transform._consId_1 != ((IStrategoAppl)arg173).getConstructor())
          break Fail206;
        d_54 = arg173.getSubterm(0);
        e_54 = term.getSubterm(1);
        x_54 = term;
        IStrategoTerm term194 = term;
        Success152:
        { 
          Fail207:
          { 
            IStrategoTerm p_55 = null;
            IStrategoTerm b_56 = null;
            IStrategoTerm m_188 = null;
            if(y_53.value == null)
              y_53.value = term;
            else
              if(y_53.value != term && !y_53.value.match(term))
                break Fail207;
            term = debug_0_0.instance.invoke(context, transform.const64);
            if(term == null)
              break Fail207;
            Success153:
            { 
              Fail208:
              { 
                IStrategoTerm j_54 = null;
                j_54 = term;
                if(y_53.value == null)
                  break Fail208;
                term = termFactory.makeTuple(y_53.value, n_53);
                term = elem_0_0.instance.invoke(context, term);
                if(term == null)
                  break Fail208;
                term = j_54;
                { 
                  IStrategoTerm d_188 = null;
                  term = n_53;
                  lifted126 lifted1260 = new lifted126();
                  lifted1260.y_53 = y_53;
                  term = remove_all_1_0.instance.invoke(context, term, lifted1260);
                  if(term == null)
                    break Fail207;
                  s_53 = term;
                  term = hashtable_get_0_1.instance.invoke(context, q_53, y_53.value);
                  if(term == null)
                    break Fail207;
                  term = debug_0_0.instance.invoke(context, term);
                  if(term == null)
                    break Fail207;
                  d_188 = term;
                  term = gen_source_location_ann_0_1.instance.invoke(context, d_188, transform.const65);
                  if(term == null)
                    break Fail207;
                  term = debug_0_0.instance.invoke(context, term);
                  if(term == null)
                    break Fail207;
                  term = (IStrategoTerm)termFactory.makeListCons(term, (IStrategoList)transform.constNil0);
                  t_53 = term;
                  if(true)
                    break Success153;
                }
              }
              s_53 = transform.constNil0;
              term = transform.constNil0;
              t_53 = transform.constNil0;
            }
            term = debug_0_0.instance.invoke(context, transform.const66);
            if(term == null)
              break Fail207;
            Success154:
            { 
              Fail209:
              { 
                IStrategoTerm k_54 = null;
                k_54 = term;
                if(y_53.value == null)
                  break Fail209;
                term = termFactory.makeTuple(y_53.value, m_53);
                term = elem_0_0.instance.invoke(context, term);
                if(term == null)
                  break Fail209;
                term = k_54;
                { 
                  IStrategoTerm h_188 = null;
                  if(y_53.value == null)
                    break Fail207;
                  term = termFactory.makeTuple((IStrategoTerm)termFactory.makeListCons(y_53.value, (IStrategoList)transform.constNil0), s_53);
                  term = conc_0_0.instance.invoke(context, term);
                  if(term == null)
                    break Fail207;
                  u_53 = term;
                  term = hashtable_get_0_1.instance.invoke(context, p_53, y_53.value);
                  if(term == null)
                    break Fail207;
                  h_188 = term;
                  term = gen_source_location_ann_0_1.instance.invoke(context, h_188, transform.const67);
                  if(term == null)
                    break Fail207;
                  term = termFactory.makeTuple((IStrategoTerm)termFactory.makeListCons(term, (IStrategoList)transform.constNil0), t_53);
                  term = conc_0_0.instance.invoke(context, term);
                  if(term == null)
                    break Fail207;
                  z_53 = term;
                  if(true)
                    break Success154;
                }
              }
              u_53 = s_53;
              term = t_53;
              z_53 = t_53;
            }
            term = debug_0_0.instance.invoke(context, transform.const68);
            if(term == null)
              break Fail207;
            term = u_53;
            lifted127 lifted1270 = new lifted127();
            lifted1270.o_53 = o_53;
            term = map_1_0.instance.invoke(context, term, lifted1270);
            if(term == null)
              break Fail207;
            w_53 = term;
            Success155:
            { 
              Fail210:
              { 
                IStrategoTerm m_54 = null;
                IStrategoTerm i_55 = null;
                IStrategoTerm j_55 = null;
                m_54 = term;
                j_55 = term;
                term = hashtable_keys_0_0.instance.invoke(context, k_53);
                if(term == null)
                  break Fail210;
                i_55 = term;
                term = j_55;
                if(y_53.value == null)
                  break Fail210;
                term = termFactory.makeTuple(y_53.value, i_55);
                term = elem_0_0.instance.invoke(context, term);
                if(term == null)
                  break Fail210;
                term = m_54;
                { 
                  term = hashtable_get_0_1.instance.invoke(context, k_53, y_53.value);
                  if(term == null)
                    break Fail207;
                  term = termFactory.makeAppl(transform._consInvoke_2, new IStrategoTerm[]{termFactory.makeAppl(transform._consMethod_1, new IStrategoTerm[]{termFactory.makeAppl(transform._consMethodName_1, new IStrategoTerm[]{termFactory.makeAppl(transform._consId_1, new IStrategoTerm[]{term})})}), transform.constNil0});
                  term = termFactory.makeAppl(transform._consNot_1, new IStrategoTerm[]{term});
                  v_53 = term;
                  IStrategoList list0;
                  list0 = checkListTail(w_53);
                  if(list0 == null)
                    break Fail207;
                  term = (IStrategoTerm)termFactory.makeListCons(v_53, list0);
                  x_53 = term;
                  if(true)
                    break Success155;
                }
              }
              term = w_53;
              x_53 = w_53;
            }
            term = debug_0_0.instance.invoke(context, transform.const69);
            if(term == null)
              break Fail207;
            p_55 = term;
            term = reverse_0_0.instance.invoke(context, x_53);
            if(term == null)
              break Fail207;
            term = make_while_condition_0_1.instance.invoke(context, p_55, term);
            if(term == null)
              break Fail207;
            a_54 = term;
            Success156:
            { 
              Fail211:
              { 
                IStrategoTerm p_54 = null;
                IStrategoTerm q_55 = null;
                IStrategoTerm r_55 = null;
                p_54 = term;
                r_55 = term;
                term = hashtable_keys_0_0.instance.invoke(context, l_53);
                if(term == null)
                  break Fail211;
                q_55 = term;
                term = r_55;
                if(y_53.value == null)
                  break Fail211;
                term = termFactory.makeTuple(y_53.value, q_55);
                term = elem_0_0.instance.invoke(context, term);
                if(term == null)
                  break Fail211;
                term = p_54;
                { 
                  term = hashtable_get_0_1.instance.invoke(context, l_53, y_53.value);
                  if(term == null)
                    break Fail207;
                  term = termFactory.makeAppl(transform._consExprStm_1, new IStrategoTerm[]{termFactory.makeAppl(transform._consInvoke_2, new IStrategoTerm[]{termFactory.makeAppl(transform._consMethod_1, new IStrategoTerm[]{termFactory.makeAppl(transform._consMethodName_1, new IStrategoTerm[]{termFactory.makeAppl(transform._consId_1, new IStrategoTerm[]{term})})}), transform.constCons1})});
                  b_54 = term;
                  if(true)
                    break Success156;
                }
              }
              term = transform.constNone0;
              b_54 = transform.constNone0;
            }
            term = debug_0_0.instance.invoke(context, transform.const70);
            if(term == null)
              break Fail207;
            Success157:
            { 
              Fail212:
              { 
                IStrategoTerm t_54 = null;
                IStrategoTerm s_55 = null;
                IStrategoTerm t_55 = null;
                t_54 = term;
                t_55 = term;
                term = hashtable_keys_0_0.instance.invoke(context, r_53);
                if(term == null)
                  break Fail212;
                s_55 = term;
                term = t_55;
                if(y_53.value == null)
                  break Fail212;
                term = termFactory.makeTuple(y_53.value, s_55);
                term = elem_0_0.instance.invoke(context, term);
                if(term == null)
                  break Fail212;
                term = t_54;
                { 
                  IStrategoTerm l_188 = null;
                  term = hashtable_get_0_1.instance.invoke(context, r_53, y_53.value);
                  if(term == null)
                    break Fail207;
                  l_188 = term;
                  term = gen_source_location_ann_0_1.instance.invoke(context, l_188, transform.const71);
                  if(term == null)
                    break Fail207;
                  term = termFactory.makeTuple((IStrategoTerm)termFactory.makeListCons(term, (IStrategoList)transform.constNil0), z_53);
                  term = conc_0_0.instance.invoke(context, term);
                  if(term == null)
                    break Fail207;
                  f_54 = term;
                  if(true)
                    break Success157;
                }
              }
              term = z_53;
              f_54 = z_53;
            }
            term = debug_0_0.instance.invoke(context, transform.const72);
            if(term == null)
              break Fail207;
            b_56 = transform.constCons24;
            m_188 = a_54;
            term = termFactory.makeAppl(transform._consWhile_2, new IStrategoTerm[]{m_188, termFactory.makeAppl(transform._consBlock_1, new IStrategoTerm[]{b_56})});
            term = termFactory.makeTuple((IStrategoTerm)termFactory.makeListCons(term, (IStrategoList)transform.constNil0), (IStrategoTerm)termFactory.makeListCons(b_54, (IStrategoList)transform.constNil0), transform.constCons25);
            term = conc_0_0.instance.invoke(context, term);
            if(term == null)
              break Fail207;
            c_54 = term;
            term = debug_0_0.instance.invoke(context, transform.const78);
            if(term == null)
              break Fail207;
            term = debug_0_0.instance.invoke(context, f_54);
            if(term == null)
              break Fail207;
            term = map_1_0.instance.invoke(context, e_54, pp_type_0_0.instance);
            if(term == null)
              break Fail207;
            term = map_1_0.instance.invoke(context, term, lifted129.instance);
            if(term == null)
              break Fail207;
            term = termFactory.makeTuple((IStrategoTerm)termFactory.makeListCons(termFactory.makeAppl(transform._consAnno_2, new IStrategoTerm[]{transform.constTypeName10, (IStrategoTerm)termFactory.makeListCons(termFactory.makeAppl(transform._consElemValPair_2, new IStrategoTerm[]{transform.constId18, termFactory.makeAppl(transform._consLit_1, new IStrategoTerm[]{termFactory.makeAppl(transform._consString_1, new IStrategoTerm[]{(IStrategoTerm)termFactory.makeListCons(termFactory.makeAppl(transform._consChars_1, new IStrategoTerm[]{d_54}), (IStrategoList)transform.constNil0)})})}), termFactory.makeListCons(transform.constElemValPair0, termFactory.makeListCons(termFactory.makeAppl(transform._consElemValPair_2, new IStrategoTerm[]{transform.constId17, termFactory.makeAppl(transform._consElemValArrayInit_1, new IStrategoTerm[]{term})}), (IStrategoList)transform.constNil0)))}), (IStrategoList)transform.constCons19), f_54);
            term = conc_0_0.instance.invoke(context, term);
            if(term == null)
              break Fail207;
            i_54 = term;
            if(true)
              break Success152;
          }
          term = term194;
          IStrategoTerm v_54 = null;
          IStrategoTerm w_54 = null;
          IStrategoTerm i_56 = null;
          v_54 = term;
          term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
          if(term == null)
            break Fail206;
          w_54 = term;
          i_56 = v_54;
          term = report_with_failure_0_2.instance.invoke(context, i_56, transform.const80, w_54);
          if(term == null)
            break Fail206;
        }
        k_56 = x_54;
        term = (IStrategoTerm)termFactory.makeListCons(transform.const81, termFactory.makeListCons(d_54, (IStrategoList)transform.constNil0));
        term = concat_strings_0_0.instance.invoke(context, term);
        if(term == null)
          break Fail206;
        j_56 = term;
        term = k_56;
        if(i_54 == null || c_54 == null)
          break Fail206;
        term = termFactory.makeAppl(transform._consMethodDec_2, new IStrategoTerm[]{termFactory.makeAppl(transform._consMethodDecHead_6, new IStrategoTerm[]{i_54, transform.constNone0, transform.constVoid0, termFactory.makeAppl(transform._consId_1, new IStrategoTerm[]{j_56}), (IStrategoTerm)termFactory.makeListCons(termFactory.makeAppl(transform._consParam_3, new IStrategoTerm[]{transform.constNil0, termFactory.makeAppl(transform._consTypeName_1, new IStrategoTerm[]{termFactory.makeAppl(transform._consId_1, new IStrategoTerm[]{j_53})}), transform.constId0}), (IStrategoList)transform.constNil0), transform.constNone0}), termFactory.makeAppl(transform._consBlock_1, new IStrategoTerm[]{c_54})});
        context.popOnSuccess();
        if(true)
          return term;
      }
      context.popOnFailure();
      return null;
    }

    @Override public IStrategoTerm invokeDynamic(Context context, IStrategoTerm term, Strategy[] sargs, IStrategoTerm[] targs)
    { 
      if(sargs == null || targs == null || sargs.length != 0 || targs.length != 9)
        throw new IllegalArgumentException("Illegal arguments for " + getName());
      return invoke(context, term, targs[0], targs[1], targs[2], targs[3], targs[4], targs[5], targs[6], targs[7], targs[8]);
    }
  }

  @SuppressWarnings("all") public static class fill$Method$Maps_0_4 extends Strategy 
  { 
    public static fill$Method$Maps_0_4 instance = new fill$Method$Maps_0_4();

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm n_56, IStrategoTerm o_56, IStrategoTerm p_56, IStrategoTerm q_56)
    { 
      ITermFactory termFactory = context.getFactory();
      context.push("fillMethodMaps_0_4");
      Fail213:
      { 
        IStrategoTerm s_56 = null;
        IStrategoTerm t_56 = null;
        IStrategoTerm u_56 = null;
        IStrategoTerm v_56 = null;
        if(term.getTermType() != IStrategoTerm.APPL || transform._consMethodAdditions_4 != ((IStrategoAppl)term).getConstructor())
          break Fail213;
        u_56 = term.getSubterm(0);
        s_56 = term.getSubterm(1);
        t_56 = term.getSubterm(2);
        v_56 = term.getSubterm(3);
        IStrategoTerm term200 = term;
        Success158:
        { 
          Fail214:
          { 
            IStrategoTerm term201 = term;
            Success159:
            { 
              Fail215:
              { 
                IStrategoTerm x_56 = null;
                x_56 = term;
                IStrategoTerm term202 = term;
                Success160:
                { 
                  Fail216:
                  { 
                    term = termFactory.makeTuple(s_56, transform.constNone0);
                    term = equal_0_0.instance.invoke(context, term);
                    if(term == null)
                      break Fail216;
                    { 
                      if(true)
                        break Fail215;
                      if(true)
                        break Success160;
                    }
                  }
                  term = term202;
                }
                term = x_56;
                { 
                  IStrategoTerm j_57 = null;
                  IStrategoTerm y_56 = null;
                  j_57 = n_56;
                  term = s_56;
                  if(term.getTermType() != IStrategoTerm.APPL || transform._consSome_1 != ((IStrategoAppl)term).getConstructor())
                    break Fail214;
                  IStrategoTerm arg174 = term.getSubterm(0);
                  if(arg174.getTermType() != IStrategoTerm.APPL || transform._consRequires_1 != ((IStrategoAppl)arg174).getConstructor())
                    break Fail214;
                  y_56 = arg174.getSubterm(0);
                  term = hashtable_put_0_2.instance.invoke(context, j_57, u_56, y_56);
                  if(term == null)
                    break Fail214;
                  if(true)
                    break Success159;
                }
              }
              term = term201;
            }
            IStrategoTerm term203 = term;
            Success161:
            { 
              Fail217:
              { 
                IStrategoTerm z_56 = null;
                z_56 = term;
                IStrategoTerm term204 = term;
                Success162:
                { 
                  Fail218:
                  { 
                    term = termFactory.makeTuple(t_56, transform.constNone0);
                    term = equal_0_0.instance.invoke(context, term);
                    if(term == null)
                      break Fail218;
                    { 
                      if(true)
                        break Fail217;
                      if(true)
                        break Success162;
                    }
                  }
                  term = term204;
                }
                term = z_56;
                { 
                  IStrategoTerm l_57 = null;
                  IStrategoTerm a_57 = null;
                  l_57 = p_56;
                  term = t_56;
                  if(term.getTermType() != IStrategoTerm.APPL || transform._consSome_1 != ((IStrategoAppl)term).getConstructor())
                    break Fail214;
                  IStrategoTerm arg175 = term.getSubterm(0);
                  if(arg175.getTermType() != IStrategoTerm.APPL || transform._consOnEntry_1 != ((IStrategoAppl)arg175).getConstructor())
                    break Fail214;
                  a_57 = arg175.getSubterm(0);
                  term = hashtable_put_0_2.instance.invoke(context, l_57, u_56, a_57);
                  if(term == null)
                    break Fail214;
                  if(true)
                    break Success161;
                }
              }
              term = term203;
            }
            IStrategoTerm term205 = term;
            Success163:
            { 
              Fail219:
              { 
                IStrategoTerm b_57 = null;
                b_57 = term;
                IStrategoTerm term206 = term;
                Success164:
                { 
                  Fail220:
                  { 
                    term = termFactory.makeTuple(v_56, transform.constNone0);
                    term = equal_0_0.instance.invoke(context, term);
                    if(term == null)
                      break Fail220;
                    { 
                      if(true)
                        break Fail219;
                      if(true)
                        break Success164;
                    }
                  }
                  term = term206;
                }
                term = b_57;
                { 
                  IStrategoTerm n_57 = null;
                  IStrategoTerm c_57 = null;
                  n_57 = o_56;
                  term = v_56;
                  if(term.getTermType() != IStrategoTerm.APPL || transform._consSome_1 != ((IStrategoAppl)term).getConstructor())
                    break Fail214;
                  IStrategoTerm arg176 = term.getSubterm(0);
                  if(arg176.getTermType() != IStrategoTerm.APPL || transform._consOnExit_1 != ((IStrategoAppl)arg176).getConstructor())
                    break Fail214;
                  c_57 = arg176.getSubterm(0);
                  term = hashtable_put_0_2.instance.invoke(context, n_57, u_56, c_57);
                  if(term == null)
                    break Fail214;
                  if(true)
                    break Success163;
                }
              }
              term = term205;
            }
            if(true)
              break Success158;
          }
          term = term200;
          IStrategoTerm f_57 = null;
          IStrategoTerm g_57 = null;
          IStrategoTerm p_57 = null;
          f_57 = term;
          term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
          if(term == null)
            break Fail213;
          g_57 = term;
          p_57 = f_57;
          term = report_with_failure_0_2.instance.invoke(context, p_57, transform.const82, g_57);
          if(term == null)
            break Fail213;
        }
        term = transform.constNone0;
        context.popOnSuccess();
        if(true)
          return term;
      }
      context.popOnFailure();
      return null;
    }
  }

  @SuppressWarnings("all") public static class add_condition_fields_0_0 extends Strategy 
  { 
    public static add_condition_fields_0_0 instance = new add_condition_fields_0_0();

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      context.push("add_condition_fields_0_0");
      Fail221:
      { 
        IStrategoTerm s_57 = null;
        IStrategoTerm t_57 = null;
        IStrategoTerm y_57 = null;
        if(term.getTermType() != IStrategoTerm.APPL || transform._consConditionDec_1 != ((IStrategoAppl)term).getConstructor())
          break Fail221;
        s_57 = term.getSubterm(0);
        y_57 = term;
        IStrategoTerm term207 = term;
        Success165:
        { 
          Fail222:
          { 
            term = map_1_0.instance.invoke(context, s_57, lifted130.instance);
            if(term == null)
              break Fail222;
            t_57 = term;
            if(true)
              break Success165;
          }
          term = term207;
          IStrategoTerm w_57 = null;
          IStrategoTerm x_57 = null;
          IStrategoTerm b_58 = null;
          w_57 = term;
          term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
          if(term == null)
            break Fail221;
          x_57 = term;
          b_58 = w_57;
          term = report_with_failure_0_2.instance.invoke(context, b_58, transform.const84, x_57);
          if(term == null)
            break Fail221;
        }
        term = y_57;
        if(t_57 == null)
          break Fail221;
        term = t_57;
        context.popOnSuccess();
        if(true)
          return term;
      }
      context.popOnFailure();
      return null;
    }
  }

  @SuppressWarnings("all") public static class add_coordinator_fields_0_0 extends Strategy 
  { 
    public static add_coordinator_fields_0_0 instance = new add_coordinator_fields_0_0();

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      context.push("add_coordinator_fields_0_0");
      Fail223:
      { 
        IStrategoTerm j_58 = null;
        IStrategoTerm k_58 = null;
        IStrategoTerm u_58 = null;
        j_58 = term;
        u_58 = term;
        IStrategoTerm term208 = term;
        Success166:
        { 
          Fail224:
          { 
            term = retain_all_1_0.instance.invoke(context, j_58, lifted131.instance);
            if(term == null)
              break Fail224;
            k_58 = term;
            if(true)
              break Success166;
          }
          term = term208;
          IStrategoTerm l_58 = null;
          IStrategoTerm m_58 = null;
          IStrategoTerm w_58 = null;
          l_58 = term;
          term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
          if(term == null)
            break Fail223;
          m_58 = term;
          w_58 = l_58;
          term = report_with_failure_0_2.instance.invoke(context, w_58, transform.const86, m_58);
          if(term == null)
            break Fail223;
        }
        term = u_58;
        if(k_58 == null)
          break Fail223;
        term = map_1_0.instance.invoke(context, k_58, lifted132.instance);
        if(term == null)
          break Fail223;
        context.popOnSuccess();
        if(true)
          return term;
      }
      context.popOnFailure();
      return null;
    }
  }

  @SuppressWarnings("all") public static class get_methods_list_0_0 extends Strategy 
  { 
    public static get_methods_list_0_0 instance = new get_methods_list_0_0();

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      Fail225:
      { 
        IStrategoTerm term209 = term;
        IStrategoConstructor cons8 = term.getTermType() == IStrategoTerm.APPL ? ((IStrategoAppl)term).getConstructor() : null;
        Success167:
        { 
          if(cons8 == transform._consSelfex_1)
          { 
            Fail226:
            { 
              IStrategoTerm a_59 = null;
              a_59 = term.getSubterm(0);
              term = a_59;
              if(true)
                break Success167;
            }
            term = term209;
          }
          Success168:
          { 
            if(cons8 == transform._consMutex_1)
            { 
              Fail227:
              { 
                IStrategoTerm z_58 = null;
                z_58 = term.getSubterm(0);
                term = z_58;
                if(true)
                  break Success168;
              }
              term = term209;
            }
            if(cons8 == transform._consNone_0)
            { 
              term = transform.constNil0;
            }
            else
            { 
              break Fail225;
            }
          }
        }
        if(true)
          return term;
      }
      context.push("get_methods_list_0_0");
      context.popOnFailure();
      return null;
    }
  }

  @SuppressWarnings("all") private static final class lifted131 extends Strategy 
  { 
    public static final lifted131 instance = new lifted131();

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      Fail228:
      { 
        if(term.getTermType() != IStrategoTerm.APPL || transform._consFieldDec_3 != ((IStrategoAppl)term).getConstructor())
          break Fail228;
        if(true)
          return term;
      }
      return null;
    }
  }

  @SuppressWarnings("all") private static final class lifted132 extends Strategy 
  { 
    public static final lifted132 instance = new lifted132();

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      ITermFactory termFactory = context.getFactory();
      Fail229:
      { 
        IStrategoTerm q_58 = null;
        IStrategoTerm r_58 = null;
        IStrategoTerm t_58 = null;
        if(term.getTermType() != IStrategoTerm.APPL || transform._consFieldDec_3 != ((IStrategoAppl)term).getConstructor())
          break Fail229;
        q_58 = term.getSubterm(0);
        r_58 = term.getSubterm(1);
        t_58 = term.getSubterm(2);
        IStrategoList list1;
        list1 = checkListTail(q_58);
        if(list1 == null)
          break Fail229;
        term = termFactory.makeAppl(transform._consFieldDec_3, new IStrategoTerm[]{(IStrategoTerm)termFactory.makeListCons(transform.constPrivate0, termFactory.makeListCons(transform.constMarkerAnno1, list1)), r_58, t_58});
        if(true)
          return term;
      }
      return null;
    }
  }

  @SuppressWarnings("all") private static final class lifted130 extends Strategy 
  { 
    public static final lifted130 instance = new lifted130();

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      ITermFactory termFactory = context.getFactory();
      Fail230:
      { 
        IStrategoTerm u_57 = null;
        IStrategoTerm v_57 = null;
        if(term.getTermType() != IStrategoTerm.APPL || transform._consAssign_2 != ((IStrategoAppl)term).getConstructor())
          break Fail230;
        IStrategoTerm arg177 = term.getSubterm(0);
        if(arg177.getTermType() != IStrategoTerm.APPL || transform._consExprName_1 != ((IStrategoAppl)arg177).getConstructor())
          break Fail230;
        u_57 = arg177.getSubterm(0);
        v_57 = term.getSubterm(1);
        term = termFactory.makeAppl(transform._consFieldDec_3, new IStrategoTerm[]{transform.constCons27, transform.constBoolean0, (IStrategoTerm)termFactory.makeListCons(termFactory.makeAppl(transform._consVarDec_2, new IStrategoTerm[]{u_57, v_57}), (IStrategoList)transform.constNil0)});
        if(true)
          return term;
      }
      return null;
    }
  }

  @SuppressWarnings("all") private static final class lifted129 extends Strategy 
  { 
    public static final lifted129 instance = new lifted129();

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      ITermFactory termFactory = context.getFactory();
      Fail231:
      { 
        term = termFactory.makeAppl(transform._consLit_1, new IStrategoTerm[]{termFactory.makeAppl(transform._consString_1, new IStrategoTerm[]{(IStrategoTerm)termFactory.makeListCons(termFactory.makeAppl(transform._consChars_1, new IStrategoTerm[]{term}), (IStrategoList)transform.constNil0)})});
        if(true)
          return term;
      }
      return null;
    }
  }

  @SuppressWarnings("all") private static final class lifted127 extends Strategy 
  { 
    TermReference o_53;

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      ITermFactory termFactory = context.getFactory();
      Fail232:
      { 
        IStrategoTerm l_54 = null;
        l_54 = term;
        term = gen_method_state_name_0_1.instance.invoke(context, l_54, o_53.value);
        if(term == null)
          break Fail232;
        term = termFactory.makeAppl(transform._consInvoke_2, new IStrategoTerm[]{transform.constMethod4, (IStrategoTerm)termFactory.makeListCons(termFactory.makeAppl(transform._consExprName_1, new IStrategoTerm[]{termFactory.makeAppl(transform._consId_1, new IStrategoTerm[]{term})}), (IStrategoList)transform.constNil0)});
        if(true)
          return term;
      }
      return null;
    }
  }

  @SuppressWarnings("all") private static final class lifted126 extends Strategy 
  { 
    TermReference y_53;

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      Fail233:
      { 
        term = equal_0_1.instance.invoke(context, term, y_53.value);
        if(term == null)
          break Fail233;
        if(true)
          return term;
      }
      return null;
    }
  }

  @SuppressWarnings("all") private static final class lifted125 extends Strategy 
  { 
    public static final lifted125 instance = new lifted125();

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      ITermFactory termFactory = context.getFactory();
      Fail234:
      { 
        term = termFactory.makeAppl(transform._consLit_1, new IStrategoTerm[]{termFactory.makeAppl(transform._consString_1, new IStrategoTerm[]{(IStrategoTerm)termFactory.makeListCons(termFactory.makeAppl(transform._consChars_1, new IStrategoTerm[]{term}), (IStrategoList)transform.constNil0)})});
        if(true)
          return term;
      }
      return null;
    }
  }

  @SuppressWarnings("all") private static final class lifted123 extends Strategy 
  { 
    TermReference t_48;

    TermReference v_48;

    TermReference u_48;

    TermReference w_48;

    TermReference a_49;

    TermReference b_49;

    TermReference j_49;

    TermReference y_48;

    TermReference z_48;

    TermReference e_49;

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      Fail235:
      { 
        term = make_lock_and_unlock_methods_0_10.instance.invokeDynamic(context, term, NO_STRATEGIES, new IStrategoTerm[]{t_48.value, v_48.value, u_48.value, w_48.value, a_49.value, b_49.value, j_49.value, y_48.value, z_48.value, e_49.value});
        if(term == null)
          break Fail235;
        if(true)
          return term;
      }
      return null;
    }
  }

  @SuppressWarnings("all") private static final class lifted122 extends Strategy 
  { 
    TermReference h_49;

    TermReference t_48;

    TermReference v_48;

    TermReference j_49;

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      Fail236:
      { 
        term = make_on_exit_method_0_4.instance.invoke(context, term, h_49.value, t_48.value, v_48.value, j_49.value);
        if(term == null)
          break Fail236;
        if(true)
          return term;
      }
      return null;
    }
  }

  @SuppressWarnings("all") private static final class lifted121 extends Strategy 
  { 
    TermReference i_49;

    TermReference t_48;

    TermReference w_48;

    TermReference j_49;

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      Fail237:
      { 
        term = make_on_entry_method_0_4.instance.invoke(context, term, i_49.value, t_48.value, w_48.value, j_49.value);
        if(term == null)
          break Fail237;
        if(true)
          return term;
      }
      return null;
    }
  }

  @SuppressWarnings("all") private static final class lifted120 extends Strategy 
  { 
    TermReference g_49;

    TermReference u_48;

    TermReference j_49;

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      Fail238:
      { 
        term = make_requires_method_0_3.instance.invoke(context, term, g_49.value, u_48.value, j_49.value);
        if(term == null)
          break Fail238;
        if(true)
          return term;
      }
      return null;
    }
  }

  @SuppressWarnings("all") private static final class lifted119 extends Strategy 
  { 
    TermReference j_49;

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      Fail239:
      { 
        term = gen_method_state_0_1.instance.invoke(context, term, j_49.value);
        if(term == null)
          break Fail239;
        if(true)
          return term;
      }
      return null;
    }
  }

  @SuppressWarnings("all") private static final class lifted117 extends Strategy 
  { 
    TermReference e_49;

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      Fail240:
      { 
        IStrategoTerm n_49 = null;
        if(term.getTermType() != IStrategoTerm.APPL || transform._consMethodAdditions_4 != ((IStrategoAppl)term).getConstructor())
          break Fail240;
        n_49 = term.getSubterm(0);
        if(e_49.value == null)
          break Fail240;
        term = hashtable_put_0_2.instance.invoke(context, e_49.value, n_49, n_49);
        if(term == null)
          break Fail240;
        if(true)
          return term;
      }
      return null;
    }
  }

  @SuppressWarnings("all") private static final class lifted116 extends Strategy 
  { 
    public static final lifted116 instance = new lifted116();

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      Fail241:
      { 
        if(term.getTermType() != IStrategoTerm.APPL || transform._consMethodAdditions_4 != ((IStrategoAppl)term).getConstructor())
          break Fail241;
        if(true)
          return term;
      }
      return null;
    }
  }

  @SuppressWarnings("all") private static final class lifted115 extends Strategy 
  { 
    TermReference j_49;

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      Fail242:
      { 
        IStrategoTerm m_49 = null;
        IStrategoTerm m_50 = null;
        m_49 = term;
        if(j_49.value == null)
          break Fail242;
        term = j_49.value;
        m_50 = j_49.value;
        if(j_49.value == null)
          break Fail242;
        term = hashtable_keys_0_0.instance.invoke(context, j_49.value);
        if(term == null)
          break Fail242;
        term = length_0_0.instance.invoke(context, term);
        if(term == null)
          break Fail242;
        term = hashtable_put_0_2.instance.invoke(context, m_50, m_49, term);
        if(term == null)
          break Fail242;
        if(true)
          return term;
      }
      return null;
    }
  }

  @SuppressWarnings("all") private static final class lifted114 extends Strategy 
  { 
    TermReference z_48;

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      Fail243:
      { 
        IStrategoTerm l_49 = null;
        l_49 = term;
        if(z_48.value == null)
          break Fail243;
        term = hashtable_put_0_2.instance.invoke(context, z_48.value, l_49, l_49);
        if(term == null)
          break Fail243;
        if(true)
          return term;
      }
      return null;
    }
  }

  @SuppressWarnings("all") private static final class lifted113 extends Strategy 
  { 
    TermReference y_48;

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      Fail244:
      { 
        IStrategoTerm k_49 = null;
        k_49 = term;
        if(y_48.value == null)
          break Fail244;
        term = hashtable_put_0_2.instance.invoke(context, y_48.value, k_49, k_49);
        if(term == null)
          break Fail244;
        if(true)
          return term;
      }
      return null;
    }
  }

  @SuppressWarnings("all") private static final class lifted112 extends Strategy 
  { 
    public static final lifted112 instance = new lifted112();

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      Fail245:
      { 
        if(term.getTermType() != IStrategoTerm.APPL || transform._consMutex_1 != ((IStrategoAppl)term).getConstructor())
          break Fail245;
        if(true)
          return term;
      }
      return null;
    }
  }

  @SuppressWarnings("all") private static final class lifted111 extends Strategy 
  { 
    public static final lifted111 instance = new lifted111();

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      Fail246:
      { 
        if(term.getTermType() != IStrategoTerm.APPL || transform._consSelfex_1 != ((IStrategoAppl)term).getConstructor())
          break Fail246;
        if(true)
          return term;
      }
      return null;
    }
  }

  @SuppressWarnings("all") private static final class lifted110 extends Strategy 
  { 
    public static final lifted110 instance = new lifted110();

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      Fail247:
      { 
        if(term.getTermType() != IStrategoTerm.APPL || transform._consConditionDec_1 != ((IStrategoAppl)term).getConstructor())
          break Fail247;
        if(true)
          return term;
      }
      return null;
    }
  }

  @SuppressWarnings("all") private static final class lifted118 extends Strategy 
  { 
    TermReference g_49;

    TermReference h_49;

    TermReference i_49;

    TermReference j_49;

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      Fail248:
      { 
        term = fill$Method$Maps_0_4.instance.invoke(context, term, g_49.value, h_49.value, i_49.value, j_49.value);
        if(term == null)
          break Fail248;
        if(true)
          return term;
      }
      return null;
    }
  }

  @SuppressWarnings("all") private static final class lifted109 extends Strategy 
  { 
    public static final lifted109 instance = new lifted109();

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      Fail249:
      { 
        if(term.getTermType() != IStrategoTerm.APPL || transform._consCoordinatorDec_2 != ((IStrategoAppl)term).getConstructor())
          break Fail249;
        if(true)
          return term;
      }
      return null;
    }
  }

  @SuppressWarnings("all") private static final class lifted108 extends Strategy 
  { 
    public static final lifted108 instance = new lifted108();

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      Fail250:
      { 
        if(term.getTermType() != IStrategoTerm.APPL || transform._consCoordinatorDec_2 != ((IStrategoAppl)term).getConstructor())
          break Fail250;
        if(true)
          return term;
      }
      return null;
    }
  }

  @SuppressWarnings("all") private static final class lifted107 extends Strategy 
  { 
    public static final lifted107 instance = new lifted107();

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      ITermFactory termFactory = context.getFactory();
      Fail251:
      { 
        term = termFactory.makeAppl(transform._consLit_1, new IStrategoTerm[]{termFactory.makeAppl(transform._consString_1, new IStrategoTerm[]{(IStrategoTerm)termFactory.makeListCons(termFactory.makeAppl(transform._consChars_1, new IStrategoTerm[]{term}), (IStrategoList)transform.constNil0)})});
        if(true)
          return term;
      }
      return null;
    }
  }

  @SuppressWarnings("all") private static final class lifted105 extends Strategy 
  { 
    public static final lifted105 instance = new lifted105();

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      ITermFactory termFactory = context.getFactory();
      Fail252:
      { 
        term = termFactory.makeAppl(transform._consLit_1, new IStrategoTerm[]{termFactory.makeAppl(transform._consString_1, new IStrategoTerm[]{(IStrategoTerm)termFactory.makeListCons(termFactory.makeAppl(transform._consChars_1, new IStrategoTerm[]{term}), (IStrategoList)transform.constNil0)})});
        if(true)
          return term;
      }
      return null;
    }
  }

  @SuppressWarnings("all") private static final class lifted103 extends Strategy 
  { 
    public static final lifted103 instance = new lifted103();

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      ITermFactory termFactory = context.getFactory();
      Fail253:
      { 
        term = termFactory.makeAppl(transform._consLit_1, new IStrategoTerm[]{termFactory.makeAppl(transform._consString_1, new IStrategoTerm[]{(IStrategoTerm)termFactory.makeListCons(termFactory.makeAppl(transform._consChars_1, new IStrategoTerm[]{term}), (IStrategoList)transform.constNil0)})});
        if(true)
          return term;
      }
      return null;
    }
  }

  @SuppressWarnings("all") private static final class lifted99 extends Strategy 
  { 
    TermReference d_39;

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      Fail254:
      { 
        lifted101 lifted1011 = new lifted101();
        lifted100 lifted1000 = new lifted100();
        lifted1011.d_39 = d_39;
        lifted1000.d_39 = d_39;
        term = or_2_0.instance.invoke(context, term, lifted1000, lifted1011);
        if(term == null)
          break Fail254;
        if(true)
          return term;
      }
      return null;
    }
  }

  @SuppressWarnings("all") private static final class lifted101 extends Strategy 
  { 
    TermReference d_39;

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      Fail255:
      { 
        if(term.getTermType() != IStrategoTerm.APPL || transform._consPostDecr_1 != ((IStrategoAppl)term).getConstructor())
          break Fail255;
        if(d_39.value == null)
          d_39.value = term.getSubterm(0);
        else
          if(d_39.value != term.getSubterm(0) && !d_39.value.match(term.getSubterm(0)))
            break Fail255;
        if(true)
          return term;
      }
      return null;
    }
  }

  @SuppressWarnings("all") private static final class lifted100 extends Strategy 
  { 
    TermReference d_39;

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      Fail256:
      { 
        if(term.getTermType() != IStrategoTerm.APPL || transform._consPostIncr_1 != ((IStrategoAppl)term).getConstructor())
          break Fail256;
        if(d_39.value == null)
          d_39.value = term.getSubterm(0);
        else
          if(d_39.value != term.getSubterm(0) && !d_39.value.match(term.getSubterm(0)))
            break Fail256;
        if(true)
          return term;
      }
      return null;
    }
  }

  @SuppressWarnings("all") private static final class lifted96 extends Strategy 
  { 
    TermReference d_39;

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      Fail257:
      { 
        lifted98 lifted980 = new lifted98();
        lifted97 lifted970 = new lifted97();
        lifted980.d_39 = d_39;
        lifted970.d_39 = d_39;
        term = or_2_0.instance.invoke(context, term, lifted970, lifted980);
        if(term == null)
          break Fail257;
        if(true)
          return term;
      }
      return null;
    }
  }

  @SuppressWarnings("all") private static final class lifted98 extends Strategy 
  { 
    TermReference d_39;

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      Fail258:
      { 
        if(term.getTermType() != IStrategoTerm.APPL || transform._consPreDecr_1 != ((IStrategoAppl)term).getConstructor())
          break Fail258;
        if(d_39.value == null)
          d_39.value = term.getSubterm(0);
        else
          if(d_39.value != term.getSubterm(0) && !d_39.value.match(term.getSubterm(0)))
            break Fail258;
        if(true)
          return term;
      }
      return null;
    }
  }

  @SuppressWarnings("all") private static final class lifted97 extends Strategy 
  { 
    TermReference d_39;

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      Fail259:
      { 
        if(term.getTermType() != IStrategoTerm.APPL || transform._consPreIncr_1 != ((IStrategoAppl)term).getConstructor())
          break Fail259;
        if(d_39.value == null)
          d_39.value = term.getSubterm(0);
        else
          if(d_39.value != term.getSubterm(0) && !d_39.value.match(term.getSubterm(0)))
            break Fail259;
        if(true)
          return term;
      }
      return null;
    }
  }

  @SuppressWarnings("all") private static final class lifted95 extends Strategy 
  { 
    TermReference c_40;

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      Fail260:
      { 
        if(term.getTermType() != IStrategoTerm.APPL || transform._consURightShift_2 != ((IStrategoAppl)term).getConstructor())
          break Fail260;
        if(c_40.value == null)
          c_40.value = term.getSubterm(0);
        else
          if(c_40.value != term.getSubterm(0) && !c_40.value.match(term.getSubterm(0)))
            break Fail260;
        if(true)
          return term;
      }
      return null;
    }
  }

  @SuppressWarnings("all") private static final class lifted92 extends Strategy 
  { 
    TermReference c_40;

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      Fail261:
      { 
        lifted94 lifted940 = new lifted94();
        lifted93 lifted930 = new lifted93();
        lifted940.c_40 = c_40;
        lifted930.c_40 = c_40;
        term = or_2_0.instance.invoke(context, term, lifted930, lifted940);
        if(term == null)
          break Fail261;
        if(true)
          return term;
      }
      return null;
    }
  }

  @SuppressWarnings("all") private static final class lifted94 extends Strategy 
  { 
    TermReference c_40;

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      Fail262:
      { 
        if(term.getTermType() != IStrategoTerm.APPL || transform._consRightShift_2 != ((IStrategoAppl)term).getConstructor())
          break Fail262;
        if(c_40.value == null)
          c_40.value = term.getSubterm(0);
        else
          if(c_40.value != term.getSubterm(0) && !c_40.value.match(term.getSubterm(0)))
            break Fail262;
        if(true)
          return term;
      }
      return null;
    }
  }

  @SuppressWarnings("all") private static final class lifted93 extends Strategy 
  { 
    TermReference c_40;

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      Fail263:
      { 
        if(term.getTermType() != IStrategoTerm.APPL || transform._consLeftShift_2 != ((IStrategoAppl)term).getConstructor())
          break Fail263;
        if(c_40.value == null)
          c_40.value = term.getSubterm(0);
        else
          if(c_40.value != term.getSubterm(0) && !c_40.value.match(term.getSubterm(0)))
            break Fail263;
        if(true)
          return term;
      }
      return null;
    }
  }

  @SuppressWarnings("all") private static final class lifted91 extends Strategy 
  { 
    public static final lifted91 instance = new lifted91();

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      Fail264:
      { 
        if(term.getTermType() != IStrategoTerm.APPL || transform._consRemain_2 != ((IStrategoAppl)term).getConstructor())
          break Fail264;
        if(true)
          return term;
      }
      return null;
    }
  }

  @SuppressWarnings("all") private static final class lifted84 extends Strategy 
  { 
    public static final lifted84 instance = new lifted84();

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      Fail265:
      { 
        term = or_2_0.instance.invoke(context, term, lifted85.instance, lifted88.instance);
        if(term == null)
          break Fail265;
        if(true)
          return term;
      }
      return null;
    }
  }

  @SuppressWarnings("all") private static final class lifted88 extends Strategy 
  { 
    public static final lifted88 instance = new lifted88();

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      Fail266:
      { 
        term = or_2_0.instance.invoke(context, term, lifted89.instance, lifted90.instance);
        if(term == null)
          break Fail266;
        if(true)
          return term;
      }
      return null;
    }
  }

  @SuppressWarnings("all") private static final class lifted90 extends Strategy 
  { 
    public static final lifted90 instance = new lifted90();

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      Fail267:
      { 
        if(term.getTermType() != IStrategoTerm.APPL || transform._consDiv_2 != ((IStrategoAppl)term).getConstructor())
          break Fail267;
        if(true)
          return term;
      }
      return null;
    }
  }

  @SuppressWarnings("all") private static final class lifted89 extends Strategy 
  { 
    public static final lifted89 instance = new lifted89();

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      Fail268:
      { 
        if(term.getTermType() != IStrategoTerm.APPL || transform._consMul_2 != ((IStrategoAppl)term).getConstructor())
          break Fail268;
        if(true)
          return term;
      }
      return null;
    }
  }

  @SuppressWarnings("all") private static final class lifted85 extends Strategy 
  { 
    public static final lifted85 instance = new lifted85();

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      Fail269:
      { 
        term = or_2_0.instance.invoke(context, term, lifted86.instance, lifted87.instance);
        if(term == null)
          break Fail269;
        if(true)
          return term;
      }
      return null;
    }
  }

  @SuppressWarnings("all") private static final class lifted87 extends Strategy 
  { 
    public static final lifted87 instance = new lifted87();

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      Fail270:
      { 
        if(term.getTermType() != IStrategoTerm.APPL || transform._consMinus_2 != ((IStrategoAppl)term).getConstructor())
          break Fail270;
        if(true)
          return term;
      }
      return null;
    }
  }

  @SuppressWarnings("all") private static final class lifted86 extends Strategy 
  { 
    public static final lifted86 instance = new lifted86();

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      Fail271:
      { 
        if(term.getTermType() != IStrategoTerm.APPL || transform._consPlus_2 != ((IStrategoAppl)term).getConstructor())
          break Fail271;
        if(true)
          return term;
      }
      return null;
    }
  }

  @SuppressWarnings("all") private static final class lifted83 extends Strategy 
  { 
    public static final lifted83 instance = new lifted83();

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      Fail272:
      { 
        if(term.getTermType() != IStrategoTerm.APPL || transform._consMinus_1 != ((IStrategoAppl)term).getConstructor())
          break Fail272;
        if(true)
          return term;
      }
      return null;
    }
  }

  @SuppressWarnings("all") private static final class lifted82 extends Strategy 
  { 
    public static final lifted82 instance = new lifted82();

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      Fail273:
      { 
        if(term.getTermType() != IStrategoTerm.APPL || transform._consPlus_1 != ((IStrategoAppl)term).getConstructor())
          break Fail273;
        if(true)
          return term;
      }
      return null;
    }
  }

  @SuppressWarnings("all") private static final class lifted81 extends Strategy 
  { 
    public static final lifted81 instance = new lifted81();

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      Fail274:
      { 
        if(term.getTermType() != IStrategoTerm.APPL || transform._consFloat_0 != ((IStrategoAppl)term).getConstructor())
          break Fail274;
        if(true)
          return term;
      }
      return null;
    }
  }

  @SuppressWarnings("all") private static final class lifted80 extends Strategy 
  { 
    public static final lifted80 instance = new lifted80();

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      Fail275:
      { 
        if(term.getTermType() != IStrategoTerm.APPL || transform._consFloat_1 != ((IStrategoAppl)term).getConstructor())
          break Fail275;
        if(true)
          return term;
      }
      return null;
    }
  }

  @SuppressWarnings("all") private static final class lifted79 extends Strategy 
  { 
    public static final lifted79 instance = new lifted79();

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      Fail276:
      { 
        if(term.getTermType() != IStrategoTerm.APPL || transform._consBool_1 != ((IStrategoAppl)term).getConstructor())
          break Fail276;
        if(true)
          return term;
      }
      return null;
    }
  }

  @SuppressWarnings("all") private static final class lifted78 extends Strategy 
  { 
    public static final lifted78 instance = new lifted78();

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      Fail277:
      { 
        if(term.getTermType() != IStrategoTerm.APPL || transform._consBoolean_0 != ((IStrategoAppl)term).getConstructor())
          break Fail277;
        if(true)
          return term;
      }
      return null;
    }
  }

  @SuppressWarnings("all") private static final class lifted77 extends Strategy 
  { 
    public static final lifted77 instance = new lifted77();

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      Fail278:
      { 
        if(term.getTermType() != IStrategoTerm.APPL || transform._consFloat_1 != ((IStrategoAppl)term).getConstructor())
          break Fail278;
        if(true)
          return term;
      }
      return null;
    }
  }

  @SuppressWarnings("all") private static final class lifted76 extends Strategy 
  { 
    public static final lifted76 instance = new lifted76();

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      Fail279:
      { 
        if(term.getTermType() != IStrategoTerm.APPL || transform._consFloat_0 != ((IStrategoAppl)term).getConstructor())
          break Fail279;
        if(true)
          return term;
      }
      return null;
    }
  }

  @SuppressWarnings("all") private static final class lifted75 extends Strategy 
  { 
    public static final lifted75 instance = new lifted75();

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      Fail280:
      { 
        if(term.getTermType() != IStrategoTerm.APPL || transform._consChar_1 != ((IStrategoAppl)term).getConstructor())
          break Fail280;
        if(true)
          return term;
      }
      return null;
    }
  }

  @SuppressWarnings("all") private static final class lifted74 extends Strategy 
  { 
    public static final lifted74 instance = new lifted74();

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      Fail281:
      { 
        if(term.getTermType() != IStrategoTerm.APPL || transform._consChar_0 != ((IStrategoAppl)term).getConstructor())
          break Fail281;
        if(true)
          return term;
      }
      return null;
    }
  }

  @SuppressWarnings("all") private static final class lifted73 extends Strategy 
  { 
    public static final lifted73 instance = new lifted73();

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      Fail282:
      { 
        if(term.getTermType() != IStrategoTerm.APPL || transform._consBool_1 != ((IStrategoAppl)term).getConstructor())
          break Fail282;
        if(true)
          return term;
      }
      return null;
    }
  }

  @SuppressWarnings("all") private static final class lifted72 extends Strategy 
  { 
    public static final lifted72 instance = new lifted72();

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      Fail283:
      { 
        if(term.getTermType() != IStrategoTerm.APPL || transform._consBoolean_0 != ((IStrategoAppl)term).getConstructor())
          break Fail283;
        if(true)
          return term;
      }
      return null;
    }
  }

  @SuppressWarnings("all") private static final class lifted71 extends Strategy 
  { 
    public static final lifted71 instance = new lifted71();

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      Fail284:
      { 
        if(term.getTermType() != IStrategoTerm.APPL || transform._consChar_1 != ((IStrategoAppl)term).getConstructor())
          break Fail284;
        if(true)
          return term;
      }
      return null;
    }
  }

  @SuppressWarnings("all") private static final class lifted70 extends Strategy 
  { 
    public static final lifted70 instance = new lifted70();

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      Fail285:
      { 
        if(term.getTermType() != IStrategoTerm.APPL || transform._consChar_0 != ((IStrategoAppl)term).getConstructor())
          break Fail285;
        if(true)
          return term;
      }
      return null;
    }
  }

  @SuppressWarnings("all") private static final class lifted69 extends Strategy 
  { 
    public static final lifted69 instance = new lifted69();

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      Fail286:
      { 
        if(term.getTermType() != IStrategoTerm.APPL || transform._consFloat_1 != ((IStrategoAppl)term).getConstructor())
          break Fail286;
        if(true)
          return term;
      }
      return null;
    }
  }

  @SuppressWarnings("all") private static final class lifted68 extends Strategy 
  { 
    public static final lifted68 instance = new lifted68();

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      Fail287:
      { 
        if(term.getTermType() != IStrategoTerm.APPL || transform._consFloat_0 != ((IStrategoAppl)term).getConstructor())
          break Fail287;
        if(true)
          return term;
      }
      return null;
    }
  }

  @SuppressWarnings("all") private static final class lifted67 extends Strategy 
  { 
    public static final lifted67 instance = new lifted67();

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      Fail288:
      { 
        if(term.getTermType() != IStrategoTerm.APPL || transform._consFloat_1 != ((IStrategoAppl)term).getConstructor())
          break Fail288;
        if(true)
          return term;
      }
      return null;
    }
  }

  @SuppressWarnings("all") private static final class lifted66 extends Strategy 
  { 
    public static final lifted66 instance = new lifted66();

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      Fail289:
      { 
        if(term.getTermType() != IStrategoTerm.APPL || transform._consFloat_0 != ((IStrategoAppl)term).getConstructor())
          break Fail289;
        if(true)
          return term;
      }
      return null;
    }
  }

  @SuppressWarnings("all") private static final class lifted65 extends Strategy 
  { 
    public static final lifted65 instance = new lifted65();

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      Fail290:
      { 
        if(term.getTermType() != IStrategoTerm.APPL || transform._consBool_1 != ((IStrategoAppl)term).getConstructor())
          break Fail290;
        if(true)
          return term;
      }
      return null;
    }
  }

  @SuppressWarnings("all") private static final class lifted64 extends Strategy 
  { 
    public static final lifted64 instance = new lifted64();

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      Fail291:
      { 
        if(term.getTermType() != IStrategoTerm.APPL || transform._consBoolean_0 != ((IStrategoAppl)term).getConstructor())
          break Fail291;
        if(true)
          return term;
      }
      return null;
    }
  }

  @SuppressWarnings("all") private static final class lifted63 extends Strategy 
  { 
    public static final lifted63 instance = new lifted63();

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      Fail292:
      { 
        if(term.getTermType() != IStrategoTerm.APPL || transform._consBool_1 != ((IStrategoAppl)term).getConstructor())
          break Fail292;
        if(true)
          return term;
      }
      return null;
    }
  }

  @SuppressWarnings("all") private static final class lifted62 extends Strategy 
  { 
    public static final lifted62 instance = new lifted62();

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      Fail293:
      { 
        if(term.getTermType() != IStrategoTerm.APPL || transform._consBoolean_0 != ((IStrategoAppl)term).getConstructor())
          break Fail293;
        if(true)
          return term;
      }
      return null;
    }
  }

  @SuppressWarnings("all") private static final class lifted61 extends Strategy 
  { 
    public static final lifted61 instance = new lifted61();

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      Fail294:
      { 
        if(term.getTermType() != IStrategoTerm.APPL || transform._consFloat_1 != ((IStrategoAppl)term).getConstructor())
          break Fail294;
        if(true)
          return term;
      }
      return null;
    }
  }

  @SuppressWarnings("all") private static final class lifted60 extends Strategy 
  { 
    public static final lifted60 instance = new lifted60();

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      Fail295:
      { 
        if(term.getTermType() != IStrategoTerm.APPL || transform._consFloat_0 != ((IStrategoAppl)term).getConstructor())
          break Fail295;
        if(true)
          return term;
      }
      return null;
    }
  }

  @SuppressWarnings("all") private static final class lifted59 extends Strategy 
  { 
    public static final lifted59 instance = new lifted59();

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      Fail296:
      { 
        if(term.getTermType() != IStrategoTerm.APPL || transform._consChar_1 != ((IStrategoAppl)term).getConstructor())
          break Fail296;
        if(true)
          return term;
      }
      return null;
    }
  }

  @SuppressWarnings("all") private static final class lifted58 extends Strategy 
  { 
    public static final lifted58 instance = new lifted58();

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      Fail297:
      { 
        if(term.getTermType() != IStrategoTerm.APPL || transform._consChar_0 != ((IStrategoAppl)term).getConstructor())
          break Fail297;
        if(true)
          return term;
      }
      return null;
    }
  }

  @SuppressWarnings("all") private static final class lifted57 extends Strategy 
  { 
    TermReference x_23;

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      Fail298:
      { 
        if(term.getTermType() != IStrategoTerm.APPL || transform._consVarArityParam_3 != ((IStrategoAppl)term).getConstructor())
          break Fail298;
        IStrategoTerm arg60 = term.getSubterm(2);
        if(arg60.getTermType() != IStrategoTerm.APPL || transform._consId_1 != ((IStrategoAppl)arg60).getConstructor())
          break Fail298;
        if(x_23.value == null)
          x_23.value = arg60.getSubterm(0);
        else
          if(x_23.value != arg60.getSubterm(0) && !x_23.value.match(arg60.getSubterm(0)))
            break Fail298;
        if(true)
          return term;
      }
      return null;
    }
  }

  @SuppressWarnings("all") private static final class lifted56 extends Strategy 
  { 
    TermReference x_23;

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      Fail299:
      { 
        if(term.getTermType() != IStrategoTerm.APPL || transform._consParam_3 != ((IStrategoAppl)term).getConstructor())
          break Fail299;
        IStrategoTerm arg57 = term.getSubterm(2);
        if(arg57.getTermType() != IStrategoTerm.APPL || transform._consId_1 != ((IStrategoAppl)arg57).getConstructor())
          break Fail299;
        if(x_23.value == null)
          x_23.value = arg57.getSubterm(0);
        else
          if(x_23.value != arg57.getSubterm(0) && !x_23.value.match(arg57.getSubterm(0)))
            break Fail299;
        if(true)
          return term;
      }
      return null;
    }
  }

  @SuppressWarnings("all") private static final class lifted54 extends Strategy 
  { 
    TermReference r_23;

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      Fail300:
      { 
        if(r_23.value == null)
          break Fail300;
        term = fetch_1_0.instance.invoke(context, r_23.value, lifted55.instance);
        if(term == null)
          break Fail300;
        if(true)
          return term;
      }
      return null;
    }
  }

  @SuppressWarnings("all") private static final class lifted55 extends Strategy 
  { 
    public static final lifted55 instance = new lifted55();

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      Fail301:
      { 
        if(term.getTermType() != IStrategoTerm.APPL || transform._consAnno_2 != ((IStrategoAppl)term).getConstructor())
          break Fail301;
        IStrategoTerm arg51 = term.getSubterm(0);
        if(arg51.getTermType() != IStrategoTerm.APPL || transform._consTypeName_1 != ((IStrategoAppl)arg51).getConstructor())
          break Fail301;
        IStrategoTerm arg52 = arg51.getSubterm(0);
        if(arg52.getTermType() != IStrategoTerm.APPL || transform._consId_1 != ((IStrategoAppl)arg52).getConstructor())
          break Fail301;
        IStrategoTerm arg53 = arg52.getSubterm(0);
        if(arg53.getTermType() != IStrategoTerm.STRING || !"COOLOnExit".equals(((IStrategoString)arg53).stringValue()))
          break Fail301;
        if(true)
          return term;
      }
      return null;
    }
  }

  @SuppressWarnings("all") private static final class lifted52 extends Strategy 
  { 
    TermReference r_23;

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      Fail302:
      { 
        if(r_23.value == null)
          break Fail302;
        term = fetch_1_0.instance.invoke(context, r_23.value, lifted53.instance);
        if(term == null)
          break Fail302;
        if(true)
          return term;
      }
      return null;
    }
  }

  @SuppressWarnings("all") private static final class lifted53 extends Strategy 
  { 
    public static final lifted53 instance = new lifted53();

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      Fail303:
      { 
        if(term.getTermType() != IStrategoTerm.APPL || transform._consAnno_2 != ((IStrategoAppl)term).getConstructor())
          break Fail303;
        IStrategoTerm arg47 = term.getSubterm(0);
        if(arg47.getTermType() != IStrategoTerm.APPL || transform._consTypeName_1 != ((IStrategoAppl)arg47).getConstructor())
          break Fail303;
        IStrategoTerm arg48 = arg47.getSubterm(0);
        if(arg48.getTermType() != IStrategoTerm.APPL || transform._consId_1 != ((IStrategoAppl)arg48).getConstructor())
          break Fail303;
        IStrategoTerm arg49 = arg48.getSubterm(0);
        if(arg49.getTermType() != IStrategoTerm.STRING || !"COOLOnEntry".equals(((IStrategoString)arg49).stringValue()))
          break Fail303;
        if(true)
          return term;
      }
      return null;
    }
  }

  @SuppressWarnings("all") private static final class lifted51 extends Strategy 
  { 
    TermReference r_23;

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      Fail304:
      { 
        if(term.getTermType() != IStrategoTerm.APPL || transform._consDeprMethodDecHead_7 != ((IStrategoAppl)term).getConstructor())
          break Fail304;
        if(r_23.value == null)
          r_23.value = term.getSubterm(0);
        else
          if(r_23.value != term.getSubterm(0) && !r_23.value.match(term.getSubterm(0)))
            break Fail304;
        if(true)
          return term;
      }
      return null;
    }
  }

  @SuppressWarnings("all") private static final class lifted50 extends Strategy 
  { 
    TermReference r_23;

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      Fail305:
      { 
        if(term.getTermType() != IStrategoTerm.APPL || transform._consMethodDecHead_6 != ((IStrategoAppl)term).getConstructor())
          break Fail305;
        if(r_23.value == null)
          r_23.value = term.getSubterm(0);
        else
          if(r_23.value != term.getSubterm(0) && !r_23.value.match(term.getSubterm(0)))
            break Fail305;
        if(true)
          return term;
      }
      return null;
    }
  }

  @SuppressWarnings("all") private static final class add_external_impl_0_9_fragment_1 extends Strategy 
  { 
    TermReference p_11;

    TermReference q_11;

    TermReference s_11;

    TermReference r_11;

    TermReference t_11;

    TermReference u_11;

    TermReference v_11;

    TermReference w_11;

    TermReference x_11;

    TermReference y_11;

    TermReference z_11;

    TermReference a_12;

    TermReference b_12;

    TermReference c_12;

    TermReference g_12;

    TermReference e_12;

    TermReference d_12;

    TermReference z_10;

    TermReference a_11;

    TermReference b_11;

    TermReference c_11;

    TermReference d_11;

    TermReference e_11;

    TermReference f_11;

    TermReference g_11;

    TermReference h_11;

    TermReference f_12;

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      ITermFactory termFactory = context.getFactory();
      Fail306:
      { 
        IStrategoTerm term31 = term;
        Success169:
        { 
          Fail307:
          { 
            IStrategoTerm x_12 = null;
            x_12 = term;
            if(g_12.value == null)
              break Fail307;
            term = g_12.value;
            if(term.getTermType() != IStrategoTerm.APPL || transform._consRightShift_2 != ((IStrategoAppl)term).getConstructor())
              break Fail307;
            if(v_11.value == null)
              v_11.value = term.getSubterm(0);
            else
              if(v_11.value != term.getSubterm(0) && !v_11.value.match(term.getSubterm(0)))
                break Fail307;
            if(w_11.value == null)
              w_11.value = term.getSubterm(1);
            else
              if(w_11.value != term.getSubterm(1) && !w_11.value.match(term.getSubterm(1)))
                break Fail307;
            term = x_12;
            { 
              IStrategoTerm r_16 = null;
              IStrategoTerm u_16 = null;
              IStrategoTerm z_16 = null;
              IStrategoTerm term32 = term;
              Success170:
              { 
                Fail308:
                { 
                  IStrategoTerm y_12 = null;
                  y_12 = term;
                  if(f_11.value == null)
                    break Fail308;
                  term = termFactory.makeTuple(f_11.value, transform.constNone0);
                  term = equal_0_0.instance.invoke(context, term);
                  if(term == null)
                    break Fail308;
                  term = y_12;
                  { 
                    if(v_11.value == null)
                      break Fail306;
                    term = get_type_of_0_3.instance.invoke(context, v_11.value, f_11.value, z_10.value, a_11.value);
                    if(term == null)
                      break Fail306;
                    term = cast_shift_type_0_0.instance.invoke(context, term);
                    if(term == null)
                      break Fail306;
                    if(q_11.value == null)
                      q_11.value = term;
                    else
                      if(q_11.value != term && !q_11.value.match(term))
                        break Fail306;
                    if(true)
                      break Success170;
                  }
                }
                term = term32;
                if(f_11.value == null)
                  break Fail306;
                term = cast_shift_type_0_0.instance.invoke(context, f_11.value);
                if(term == null)
                  break Fail306;
                if(q_11.value == null)
                  q_11.value = term;
                else
                  if(q_11.value != term && !q_11.value.match(term))
                    break Fail306;
              }
              u_16 = term;
              if(v_11.value == null)
                break Fail306;
              term = add_external_impl_0_9.instance.invokeDynamic(context, v_11.value, NO_STRATEGIES, new IStrategoTerm[]{z_10.value, a_11.value, b_11.value, c_11.value, d_11.value, e_11.value, q_11.value, g_11.value, h_11.value});
              if(term == null)
                break Fail306;
              r_16 = term;
              term = u_16;
              if(w_11.value == null)
                break Fail306;
              z_16 = w_11.value;
              term = add_external_impl_0_9.instance.invokeDynamic(context, z_16, NO_STRATEGIES, new IStrategoTerm[]{z_10.value, a_11.value, b_11.value, c_11.value, d_11.value, e_11.value, transform.constLong0, g_11.value, h_11.value});
              if(term == null)
                break Fail306;
              term = termFactory.makeAppl(transform._consRightShift_2, new IStrategoTerm[]{r_16, term});
              if(true)
                break Success169;
            }
          }
          term = term31;
          IStrategoTerm term33 = term;
          Success171:
          { 
            Fail309:
            { 
              IStrategoTerm z_12 = null;
              z_12 = term;
              if(g_12.value == null)
                break Fail309;
              term = g_12.value;
              if(term.getTermType() != IStrategoTerm.APPL || transform._consURightShift_2 != ((IStrategoAppl)term).getConstructor())
                break Fail309;
              if(v_11.value == null)
                v_11.value = term.getSubterm(0);
              else
                if(v_11.value != term.getSubterm(0) && !v_11.value.match(term.getSubterm(0)))
                  break Fail309;
              if(w_11.value == null)
                w_11.value = term.getSubterm(1);
              else
                if(w_11.value != term.getSubterm(1) && !w_11.value.match(term.getSubterm(1)))
                  break Fail309;
              term = z_12;
              { 
                IStrategoTerm a_17 = null;
                IStrategoTerm c_17 = null;
                IStrategoTerm g_17 = null;
                IStrategoTerm term34 = term;
                Success172:
                { 
                  Fail310:
                  { 
                    IStrategoTerm a_13 = null;
                    a_13 = term;
                    if(f_11.value == null)
                      break Fail310;
                    term = termFactory.makeTuple(f_11.value, transform.constNone0);
                    term = equal_0_0.instance.invoke(context, term);
                    if(term == null)
                      break Fail310;
                    term = a_13;
                    { 
                      if(v_11.value == null)
                        break Fail306;
                      term = get_type_of_0_3.instance.invoke(context, v_11.value, f_11.value, z_10.value, a_11.value);
                      if(term == null)
                        break Fail306;
                      term = cast_shift_type_0_0.instance.invoke(context, term);
                      if(term == null)
                        break Fail306;
                      if(q_11.value == null)
                        q_11.value = term;
                      else
                        if(q_11.value != term && !q_11.value.match(term))
                          break Fail306;
                      if(true)
                        break Success172;
                    }
                  }
                  term = term34;
                  if(f_11.value == null)
                    break Fail306;
                  term = cast_shift_type_0_0.instance.invoke(context, f_11.value);
                  if(term == null)
                    break Fail306;
                  if(q_11.value == null)
                    q_11.value = term;
                  else
                    if(q_11.value != term && !q_11.value.match(term))
                      break Fail306;
                }
                c_17 = term;
                if(v_11.value == null)
                  break Fail306;
                term = add_external_impl_0_9.instance.invokeDynamic(context, v_11.value, NO_STRATEGIES, new IStrategoTerm[]{z_10.value, a_11.value, b_11.value, c_11.value, d_11.value, e_11.value, q_11.value, g_11.value, h_11.value});
                if(term == null)
                  break Fail306;
                a_17 = term;
                term = c_17;
                if(w_11.value == null)
                  break Fail306;
                g_17 = w_11.value;
                term = add_external_impl_0_9.instance.invokeDynamic(context, g_17, NO_STRATEGIES, new IStrategoTerm[]{z_10.value, a_11.value, b_11.value, c_11.value, d_11.value, e_11.value, transform.constLong0, g_11.value, h_11.value});
                if(term == null)
                  break Fail306;
                term = termFactory.makeAppl(transform._consURightShift_2, new IStrategoTerm[]{a_17, term});
                if(true)
                  break Success171;
              }
            }
            term = term33;
            IStrategoTerm term35 = term;
            Success173:
            { 
              Fail311:
              { 
                IStrategoTerm e_13 = null;
                e_13 = term;
                if(g_12.value == null)
                  break Fail311;
                term = g_12.value;
                if(term.getTermType() != IStrategoTerm.APPL || transform._consPreIncr_1 != ((IStrategoAppl)term).getConstructor())
                  break Fail311;
                if(e_12.value == null)
                  e_12.value = term.getSubterm(0);
                else
                  if(e_12.value != term.getSubterm(0) && !e_12.value.match(term.getSubterm(0)))
                    break Fail311;
                term = e_13;
                { 
                  if(e_12.value == null)
                    break Fail306;
                  term = get_type_of_0_3.instance.invoke(context, e_12.value, f_11.value, z_10.value, a_11.value);
                  if(term == null)
                    break Fail306;
                  if(p_11.value == null)
                    p_11.value = term;
                  else
                    if(p_11.value != term && !p_11.value.match(term))
                      break Fail306;
                  IStrategoTerm term36 = term;
                  Success174:
                  { 
                    Fail312:
                    { 
                      IStrategoTerm f_13 = null;
                      f_13 = term;
                      if(p_11.value == null)
                        break Fail312;
                      term = termFactory.makeTuple(p_11.value, transform.constNone0);
                      term = equal_0_0.instance.invoke(context, term);
                      if(term == null)
                        break Fail312;
                      term = f_13;
                      { 
                        IStrategoTerm term37 = term;
                        Success175:
                        { 
                          Fail313:
                          { 
                            IStrategoTerm g_13 = null;
                            g_13 = term;
                            if(f_11.value == null)
                              break Fail313;
                            term = termFactory.makeTuple(f_11.value, transform.constNone0);
                            term = equal_0_0.instance.invoke(context, term);
                            if(term == null)
                              break Fail313;
                            term = g_13;
                            { 
                              term = transform.constDouble0;
                              if(q_11.value == null)
                                q_11.value = term;
                              else
                                if(q_11.value != term && !q_11.value.match(term))
                                  break Fail306;
                              if(true)
                                break Success175;
                            }
                          }
                          term = term37;
                          if(f_11.value == null)
                            break Fail306;
                          term = ensure__number_0_0.instance.invoke(context, f_11.value);
                          if(term == null)
                            break Fail306;
                          if(q_11.value == null)
                            q_11.value = term;
                          else
                            if(q_11.value != term && !q_11.value.match(term))
                              break Fail306;
                        }
                        if(true)
                          break Success174;
                      }
                    }
                    term = term36;
                    if(p_11.value == null)
                      break Fail306;
                    term = ensure__number_0_0.instance.invoke(context, p_11.value);
                    if(term == null)
                      break Fail306;
                    if(q_11.value == null)
                      q_11.value = term;
                    else
                      if(q_11.value != term && !q_11.value.match(term))
                        break Fail306;
                  }
                  if(e_12.value == null)
                    break Fail306;
                  term = add_external_impl_0_9.instance.invokeDynamic(context, e_12.value, NO_STRATEGIES, new IStrategoTerm[]{z_10.value, a_11.value, b_11.value, c_11.value, d_11.value, e_11.value, q_11.value, g_11.value, h_11.value});
                  if(term == null)
                    break Fail306;
                  term = termFactory.makeAppl(transform._consPreIncr_1, new IStrategoTerm[]{term});
                  if(true)
                    break Success173;
                }
              }
              term = term35;
              IStrategoTerm term38 = term;
              Success176:
              { 
                Fail314:
                { 
                  IStrategoTerm h_13 = null;
                  h_13 = term;
                  if(g_12.value == null)
                    break Fail314;
                  term = g_12.value;
                  if(term.getTermType() != IStrategoTerm.APPL || transform._consPostIncr_1 != ((IStrategoAppl)term).getConstructor())
                    break Fail314;
                  if(e_12.value == null)
                    e_12.value = term.getSubterm(0);
                  else
                    if(e_12.value != term.getSubterm(0) && !e_12.value.match(term.getSubterm(0)))
                      break Fail314;
                  term = h_13;
                  { 
                    if(e_12.value == null)
                      break Fail306;
                    term = get_type_of_0_3.instance.invoke(context, e_12.value, f_11.value, z_10.value, a_11.value);
                    if(term == null)
                      break Fail306;
                    if(p_11.value == null)
                      p_11.value = term;
                    else
                      if(p_11.value != term && !p_11.value.match(term))
                        break Fail306;
                    IStrategoTerm term39 = term;
                    Success177:
                    { 
                      Fail315:
                      { 
                        IStrategoTerm i_13 = null;
                        i_13 = term;
                        if(p_11.value == null)
                          break Fail315;
                        term = termFactory.makeTuple(p_11.value, transform.constNone0);
                        term = equal_0_0.instance.invoke(context, term);
                        if(term == null)
                          break Fail315;
                        term = i_13;
                        { 
                          IStrategoTerm term40 = term;
                          Success178:
                          { 
                            Fail316:
                            { 
                              IStrategoTerm m_13 = null;
                              m_13 = term;
                              if(f_11.value == null)
                                break Fail316;
                              term = termFactory.makeTuple(f_11.value, transform.constNone0);
                              term = equal_0_0.instance.invoke(context, term);
                              if(term == null)
                                break Fail316;
                              term = m_13;
                              { 
                                term = transform.constDouble0;
                                if(q_11.value == null)
                                  q_11.value = term;
                                else
                                  if(q_11.value != term && !q_11.value.match(term))
                                    break Fail306;
                                if(true)
                                  break Success178;
                              }
                            }
                            term = term40;
                            if(f_11.value == null)
                              break Fail306;
                            term = ensure__number_0_0.instance.invoke(context, f_11.value);
                            if(term == null)
                              break Fail306;
                            if(q_11.value == null)
                              q_11.value = term;
                            else
                              if(q_11.value != term && !q_11.value.match(term))
                                break Fail306;
                          }
                          if(true)
                            break Success177;
                        }
                      }
                      term = term39;
                      if(p_11.value == null)
                        break Fail306;
                      term = ensure__number_0_0.instance.invoke(context, p_11.value);
                      if(term == null)
                        break Fail306;
                      if(q_11.value == null)
                        q_11.value = term;
                      else
                        if(q_11.value != term && !q_11.value.match(term))
                          break Fail306;
                    }
                    if(e_12.value == null)
                      break Fail306;
                    term = add_external_impl_0_9.instance.invokeDynamic(context, e_12.value, NO_STRATEGIES, new IStrategoTerm[]{z_10.value, a_11.value, b_11.value, c_11.value, d_11.value, e_11.value, q_11.value, g_11.value, h_11.value});
                    if(term == null)
                      break Fail306;
                    term = termFactory.makeAppl(transform._consPostIncr_1, new IStrategoTerm[]{term});
                    if(true)
                      break Success176;
                  }
                }
                term = term38;
                IStrategoTerm term41 = term;
                Success179:
                { 
                  Fail317:
                  { 
                    IStrategoTerm n_13 = null;
                    n_13 = term;
                    if(g_12.value == null)
                      break Fail317;
                    term = g_12.value;
                    if(term.getTermType() != IStrategoTerm.APPL || transform._consPreDecr_1 != ((IStrategoAppl)term).getConstructor())
                      break Fail317;
                    if(e_12.value == null)
                      e_12.value = term.getSubterm(0);
                    else
                      if(e_12.value != term.getSubterm(0) && !e_12.value.match(term.getSubterm(0)))
                        break Fail317;
                    term = n_13;
                    { 
                      if(e_12.value == null)
                        break Fail306;
                      term = get_type_of_0_3.instance.invoke(context, e_12.value, f_11.value, z_10.value, a_11.value);
                      if(term == null)
                        break Fail306;
                      if(p_11.value == null)
                        p_11.value = term;
                      else
                        if(p_11.value != term && !p_11.value.match(term))
                          break Fail306;
                      IStrategoTerm term42 = term;
                      Success180:
                      { 
                        Fail318:
                        { 
                          IStrategoTerm o_13 = null;
                          o_13 = term;
                          if(p_11.value == null)
                            break Fail318;
                          term = termFactory.makeTuple(p_11.value, transform.constNone0);
                          term = equal_0_0.instance.invoke(context, term);
                          if(term == null)
                            break Fail318;
                          term = o_13;
                          { 
                            IStrategoTerm term43 = term;
                            Success181:
                            { 
                              Fail319:
                              { 
                                IStrategoTerm p_13 = null;
                                p_13 = term;
                                if(f_11.value == null)
                                  break Fail319;
                                term = termFactory.makeTuple(f_11.value, transform.constNone0);
                                term = equal_0_0.instance.invoke(context, term);
                                if(term == null)
                                  break Fail319;
                                term = p_13;
                                { 
                                  term = transform.constDouble0;
                                  if(q_11.value == null)
                                    q_11.value = term;
                                  else
                                    if(q_11.value != term && !q_11.value.match(term))
                                      break Fail306;
                                  if(true)
                                    break Success181;
                                }
                              }
                              term = term43;
                              if(f_11.value == null)
                                break Fail306;
                              term = ensure__number_0_0.instance.invoke(context, f_11.value);
                              if(term == null)
                                break Fail306;
                              if(q_11.value == null)
                                q_11.value = term;
                              else
                                if(q_11.value != term && !q_11.value.match(term))
                                  break Fail306;
                            }
                            if(true)
                              break Success180;
                          }
                        }
                        term = term42;
                        if(p_11.value == null)
                          break Fail306;
                        term = ensure__number_0_0.instance.invoke(context, p_11.value);
                        if(term == null)
                          break Fail306;
                        if(q_11.value == null)
                          q_11.value = term;
                        else
                          if(q_11.value != term && !q_11.value.match(term))
                            break Fail306;
                      }
                      if(e_12.value == null)
                        break Fail306;
                      term = add_external_impl_0_9.instance.invokeDynamic(context, e_12.value, NO_STRATEGIES, new IStrategoTerm[]{z_10.value, a_11.value, b_11.value, c_11.value, d_11.value, e_11.value, q_11.value, g_11.value, h_11.value});
                      if(term == null)
                        break Fail306;
                      term = termFactory.makeAppl(transform._consPreDecr_1, new IStrategoTerm[]{term});
                      if(true)
                        break Success179;
                    }
                  }
                  term = term41;
                  IStrategoTerm term44 = term;
                  Success182:
                  { 
                    Fail320:
                    { 
                      IStrategoTerm q_13 = null;
                      q_13 = term;
                      if(g_12.value == null)
                        break Fail320;
                      term = g_12.value;
                      if(term.getTermType() != IStrategoTerm.APPL || transform._consPostDecr_1 != ((IStrategoAppl)term).getConstructor())
                        break Fail320;
                      if(e_12.value == null)
                        e_12.value = term.getSubterm(0);
                      else
                        if(e_12.value != term.getSubterm(0) && !e_12.value.match(term.getSubterm(0)))
                          break Fail320;
                      term = q_13;
                      { 
                        if(e_12.value == null)
                          break Fail306;
                        term = get_type_of_0_3.instance.invoke(context, e_12.value, f_11.value, z_10.value, a_11.value);
                        if(term == null)
                          break Fail306;
                        if(p_11.value == null)
                          p_11.value = term;
                        else
                          if(p_11.value != term && !p_11.value.match(term))
                            break Fail306;
                        IStrategoTerm term45 = term;
                        Success183:
                        { 
                          Fail321:
                          { 
                            IStrategoTerm r_13 = null;
                            r_13 = term;
                            if(p_11.value == null)
                              break Fail321;
                            term = termFactory.makeTuple(p_11.value, transform.constNone0);
                            term = equal_0_0.instance.invoke(context, term);
                            if(term == null)
                              break Fail321;
                            term = r_13;
                            { 
                              IStrategoTerm term46 = term;
                              Success184:
                              { 
                                Fail322:
                                { 
                                  IStrategoTerm s_13 = null;
                                  s_13 = term;
                                  if(f_11.value == null)
                                    break Fail322;
                                  term = termFactory.makeTuple(f_11.value, transform.constNone0);
                                  term = equal_0_0.instance.invoke(context, term);
                                  if(term == null)
                                    break Fail322;
                                  term = s_13;
                                  { 
                                    term = transform.constDouble0;
                                    if(q_11.value == null)
                                      q_11.value = term;
                                    else
                                      if(q_11.value != term && !q_11.value.match(term))
                                        break Fail306;
                                    if(true)
                                      break Success184;
                                  }
                                }
                                term = term46;
                                if(f_11.value == null)
                                  break Fail306;
                                term = ensure__number_0_0.instance.invoke(context, f_11.value);
                                if(term == null)
                                  break Fail306;
                                if(q_11.value == null)
                                  q_11.value = term;
                                else
                                  if(q_11.value != term && !q_11.value.match(term))
                                    break Fail306;
                              }
                              if(true)
                                break Success183;
                            }
                          }
                          term = term45;
                          if(p_11.value == null)
                            break Fail306;
                          term = ensure__number_0_0.instance.invoke(context, p_11.value);
                          if(term == null)
                            break Fail306;
                          if(q_11.value == null)
                            q_11.value = term;
                          else
                            if(q_11.value != term && !q_11.value.match(term))
                              break Fail306;
                        }
                        if(e_12.value == null)
                          break Fail306;
                        term = add_external_impl_0_9.instance.invokeDynamic(context, e_12.value, NO_STRATEGIES, new IStrategoTerm[]{z_10.value, a_11.value, b_11.value, c_11.value, d_11.value, e_11.value, q_11.value, g_11.value, h_11.value});
                        if(term == null)
                          break Fail306;
                        term = termFactory.makeAppl(transform._consPostDecr_1, new IStrategoTerm[]{term});
                        if(true)
                          break Success182;
                      }
                    }
                    term = term44;
                    IStrategoTerm term47 = term;
                    Success185:
                    { 
                      Fail323:
                      { 
                        IStrategoTerm t_13 = null;
                        t_13 = term;
                        if(g_12.value == null)
                          break Fail323;
                        term = g_12.value;
                        if(term.getTermType() != IStrategoTerm.APPL || transform._consNot_1 != ((IStrategoAppl)term).getConstructor())
                          break Fail323;
                        term = t_13;
                        { 
                          if(f_12.value == null)
                            break Fail306;
                          term = f_12.value;
                          lifted40 lifted400 = new lifted40();
                          lifted400.z_10 = z_10;
                          lifted400.a_11 = a_11;
                          lifted400.b_11 = b_11;
                          lifted400.c_11 = c_11;
                          lifted400.d_11 = d_11;
                          lifted400.e_11 = e_11;
                          lifted400.g_11 = g_11;
                          lifted400.h_11 = h_11;
                          term = SRTS_all.instance.invoke(context, term, lifted400);
                          if(term == null)
                            break Fail306;
                          if(true)
                            break Success185;
                        }
                      }
                      term = term47;
                      IStrategoTerm term48 = term;
                      Success186:
                      { 
                        Fail324:
                        { 
                          IStrategoTerm u_13 = null;
                          u_13 = term;
                          if(g_12.value == null)
                            break Fail324;
                          term = or_2_0.instance.invoke(context, g_12.value, lifted41.instance, lifted44.instance);
                          if(term == null)
                            break Fail324;
                          term = u_13;
                          { 
                            if(f_12.value == null)
                              break Fail306;
                            term = f_12.value;
                            lifted45 lifted450 = new lifted45();
                            lifted450.f_12 = f_12;
                            lifted450.f_11 = f_11;
                            lifted450.z_10 = z_10;
                            lifted450.a_11 = a_11;
                            lifted450.b_11 = b_11;
                            lifted450.c_11 = c_11;
                            lifted450.d_11 = d_11;
                            lifted450.e_11 = e_11;
                            lifted450.g_11 = g_11;
                            lifted450.h_11 = h_11;
                            term = SRTS_all.instance.invoke(context, term, lifted450);
                            if(term == null)
                              break Fail306;
                            if(true)
                              break Success186;
                          }
                        }
                        term = term48;
                        IStrategoTerm term49 = term;
                        Success187:
                        { 
                          Fail325:
                          { 
                            IStrategoTerm y_13 = null;
                            y_13 = term;
                            if(g_12.value == null)
                              break Fail325;
                            term = g_12.value;
                            if(term.getTermType() != IStrategoTerm.APPL || transform._consAssign_2 != ((IStrategoAppl)term).getConstructor())
                              break Fail325;
                            if(r_11.value == null)
                              r_11.value = term.getSubterm(0);
                            else
                              if(r_11.value != term.getSubterm(0) && !r_11.value.match(term.getSubterm(0)))
                                break Fail325;
                            if(e_12.value == null)
                              e_12.value = term.getSubterm(1);
                            else
                              if(e_12.value != term.getSubterm(1) && !e_12.value.match(term.getSubterm(1)))
                                break Fail325;
                            term = y_13;
                            { 
                              IStrategoTerm t_17 = null;
                              IStrategoTerm u_17 = null;
                              if(r_11.value == null)
                                break Fail306;
                              term = get_$L$H$S_type_0_3.instance.invoke(context, r_11.value, f_11.value, z_10.value, a_11.value);
                              if(term == null)
                                break Fail306;
                              if(s_11.value == null)
                                s_11.value = term;
                              else
                                if(s_11.value != term && !s_11.value.match(term))
                                  break Fail306;
                              u_17 = term;
                              if(e_12.value == null)
                                break Fail306;
                              term = add_external_impl_0_9.instance.invokeDynamic(context, e_12.value, NO_STRATEGIES, new IStrategoTerm[]{z_10.value, a_11.value, b_11.value, c_11.value, d_11.value, e_11.value, s_11.value, g_11.value, h_11.value});
                              if(term == null)
                                break Fail306;
                              t_17 = term;
                              term = u_17;
                              if(r_11.value == null)
                                break Fail306;
                              term = termFactory.makeAppl(transform._consAssign_2, new IStrategoTerm[]{r_11.value, t_17});
                              if(true)
                                break Success187;
                            }
                          }
                          term = term49;
                          IStrategoTerm term50 = term;
                          Success188:
                          { 
                            Fail326:
                            { 
                              IStrategoTerm z_13 = null;
                              z_13 = term;
                              if(g_12.value == null)
                                break Fail326;
                              term = g_12.value;
                              if(term.getTermType() != IStrategoTerm.APPL || transform._consAssignMul_2 != ((IStrategoAppl)term).getConstructor())
                                break Fail326;
                              if(r_11.value == null)
                                r_11.value = term.getSubterm(0);
                              else
                                if(r_11.value != term.getSubterm(0) && !r_11.value.match(term.getSubterm(0)))
                                  break Fail326;
                              if(e_12.value == null)
                                e_12.value = term.getSubterm(1);
                              else
                                if(e_12.value != term.getSubterm(1) && !e_12.value.match(term.getSubterm(1)))
                                  break Fail326;
                              term = z_13;
                              { 
                                IStrategoTerm v_17 = null;
                                IStrategoTerm w_17 = null;
                                IStrategoTerm y_17 = null;
                                if(r_11.value == null)
                                  break Fail306;
                                term = get_$L$H$S_type_0_3.instance.invoke(context, r_11.value, f_11.value, z_10.value, a_11.value);
                                if(term == null)
                                  break Fail306;
                                w_17 = term;
                                if(e_12.value == null)
                                  break Fail306;
                                y_17 = e_12.value;
                                term = add_external_impl_0_9.instance.invokeDynamic(context, y_17, NO_STRATEGIES, new IStrategoTerm[]{z_10.value, a_11.value, b_11.value, c_11.value, d_11.value, e_11.value, transform.constDouble0, g_11.value, h_11.value});
                                if(term == null)
                                  break Fail306;
                                v_17 = term;
                                term = w_17;
                                if(r_11.value == null)
                                  break Fail306;
                                term = termFactory.makeAppl(transform._consAssignMul_2, new IStrategoTerm[]{r_11.value, v_17});
                                if(true)
                                  break Success188;
                              }
                            }
                            term = term50;
                            IStrategoTerm term51 = term;
                            Success189:
                            { 
                              Fail327:
                              { 
                                IStrategoTerm a_14 = null;
                                a_14 = term;
                                if(g_12.value == null)
                                  break Fail327;
                                term = g_12.value;
                                if(term.getTermType() != IStrategoTerm.APPL || transform._consAssignDiv_2 != ((IStrategoAppl)term).getConstructor())
                                  break Fail327;
                                if(r_11.value == null)
                                  r_11.value = term.getSubterm(0);
                                else
                                  if(r_11.value != term.getSubterm(0) && !r_11.value.match(term.getSubterm(0)))
                                    break Fail327;
                                if(e_12.value == null)
                                  e_12.value = term.getSubterm(1);
                                else
                                  if(e_12.value != term.getSubterm(1) && !e_12.value.match(term.getSubterm(1)))
                                    break Fail327;
                                term = a_14;
                                { 
                                  IStrategoTerm z_17 = null;
                                  IStrategoTerm a_18 = null;
                                  IStrategoTerm c_18 = null;
                                  if(r_11.value == null)
                                    break Fail306;
                                  term = get_$L$H$S_type_0_3.instance.invoke(context, r_11.value, f_11.value, z_10.value, a_11.value);
                                  if(term == null)
                                    break Fail306;
                                  a_18 = term;
                                  if(e_12.value == null)
                                    break Fail306;
                                  c_18 = e_12.value;
                                  term = add_external_impl_0_9.instance.invokeDynamic(context, c_18, NO_STRATEGIES, new IStrategoTerm[]{z_10.value, a_11.value, b_11.value, c_11.value, d_11.value, e_11.value, transform.constDouble0, g_11.value, h_11.value});
                                  if(term == null)
                                    break Fail306;
                                  z_17 = term;
                                  term = a_18;
                                  if(r_11.value == null)
                                    break Fail306;
                                  term = termFactory.makeAppl(transform._consAssignDiv_2, new IStrategoTerm[]{r_11.value, z_17});
                                  if(true)
                                    break Success189;
                                }
                              }
                              term = term51;
                              IStrategoTerm term52 = term;
                              Success190:
                              { 
                                Fail328:
                                { 
                                  IStrategoTerm b_14 = null;
                                  b_14 = term;
                                  if(g_12.value == null)
                                    break Fail328;
                                  term = g_12.value;
                                  if(term.getTermType() != IStrategoTerm.APPL || transform._consAssignRemain_2 != ((IStrategoAppl)term).getConstructor())
                                    break Fail328;
                                  if(r_11.value == null)
                                    r_11.value = term.getSubterm(0);
                                  else
                                    if(r_11.value != term.getSubterm(0) && !r_11.value.match(term.getSubterm(0)))
                                      break Fail328;
                                  if(e_12.value == null)
                                    e_12.value = term.getSubterm(1);
                                  else
                                    if(e_12.value != term.getSubterm(1) && !e_12.value.match(term.getSubterm(1)))
                                      break Fail328;
                                  term = b_14;
                                  { 
                                    IStrategoTerm d_18 = null;
                                    IStrategoTerm e_18 = null;
                                    IStrategoTerm g_18 = null;
                                    if(r_11.value == null)
                                      break Fail306;
                                    term = get_$L$H$S_type_0_3.instance.invoke(context, r_11.value, f_11.value, z_10.value, a_11.value);
                                    if(term == null)
                                      break Fail306;
                                    e_18 = term;
                                    if(e_12.value == null)
                                      break Fail306;
                                    g_18 = e_12.value;
                                    term = add_external_impl_0_9.instance.invokeDynamic(context, g_18, NO_STRATEGIES, new IStrategoTerm[]{z_10.value, a_11.value, b_11.value, c_11.value, d_11.value, e_11.value, transform.constDouble0, g_11.value, h_11.value});
                                    if(term == null)
                                      break Fail306;
                                    d_18 = term;
                                    term = e_18;
                                    if(r_11.value == null)
                                      break Fail306;
                                    term = termFactory.makeAppl(transform._consAssignRemain_2, new IStrategoTerm[]{r_11.value, d_18});
                                    if(true)
                                      break Success190;
                                  }
                                }
                                term = term52;
                                IStrategoTerm term53 = term;
                                Success191:
                                { 
                                  Fail329:
                                  { 
                                    IStrategoTerm c_14 = null;
                                    c_14 = term;
                                    if(g_12.value == null)
                                      break Fail329;
                                    term = g_12.value;
                                    if(term.getTermType() != IStrategoTerm.APPL || transform._consAssignPlus_2 != ((IStrategoAppl)term).getConstructor())
                                      break Fail329;
                                    if(r_11.value == null)
                                      r_11.value = term.getSubterm(0);
                                    else
                                      if(r_11.value != term.getSubterm(0) && !r_11.value.match(term.getSubterm(0)))
                                        break Fail329;
                                    if(e_12.value == null)
                                      e_12.value = term.getSubterm(1);
                                    else
                                      if(e_12.value != term.getSubterm(1) && !e_12.value.match(term.getSubterm(1)))
                                        break Fail329;
                                    term = c_14;
                                    { 
                                      IStrategoTerm j_18 = null;
                                      IStrategoTerm k_18 = null;
                                      IStrategoTerm m_18 = null;
                                      if(r_11.value == null)
                                        break Fail306;
                                      term = get_$L$H$S_type_0_3.instance.invoke(context, r_11.value, f_11.value, z_10.value, a_11.value);
                                      if(term == null)
                                        break Fail306;
                                      k_18 = term;
                                      if(e_12.value == null)
                                        break Fail306;
                                      m_18 = e_12.value;
                                      term = add_external_impl_0_9.instance.invokeDynamic(context, m_18, NO_STRATEGIES, new IStrategoTerm[]{z_10.value, a_11.value, b_11.value, c_11.value, d_11.value, e_11.value, transform.constDouble0, g_11.value, h_11.value});
                                      if(term == null)
                                        break Fail306;
                                      j_18 = term;
                                      term = k_18;
                                      if(r_11.value == null)
                                        break Fail306;
                                      term = termFactory.makeAppl(transform._consAssignPlus_2, new IStrategoTerm[]{r_11.value, j_18});
                                      if(true)
                                        break Success191;
                                    }
                                  }
                                  term = term53;
                                  IStrategoTerm term54 = term;
                                  Success192:
                                  { 
                                    Fail330:
                                    { 
                                      IStrategoTerm d_14 = null;
                                      d_14 = term;
                                      if(g_12.value == null)
                                        break Fail330;
                                      term = g_12.value;
                                      if(term.getTermType() != IStrategoTerm.APPL || transform._consAssignMinus_2 != ((IStrategoAppl)term).getConstructor())
                                        break Fail330;
                                      if(r_11.value == null)
                                        r_11.value = term.getSubterm(0);
                                      else
                                        if(r_11.value != term.getSubterm(0) && !r_11.value.match(term.getSubterm(0)))
                                          break Fail330;
                                      if(e_12.value == null)
                                        e_12.value = term.getSubterm(1);
                                      else
                                        if(e_12.value != term.getSubterm(1) && !e_12.value.match(term.getSubterm(1)))
                                          break Fail330;
                                      term = d_14;
                                      { 
                                        IStrategoTerm n_18 = null;
                                        IStrategoTerm o_18 = null;
                                        IStrategoTerm q_18 = null;
                                        if(r_11.value == null)
                                          break Fail306;
                                        term = get_$L$H$S_type_0_3.instance.invoke(context, r_11.value, f_11.value, z_10.value, a_11.value);
                                        if(term == null)
                                          break Fail306;
                                        o_18 = term;
                                        if(e_12.value == null)
                                          break Fail306;
                                        q_18 = e_12.value;
                                        term = add_external_impl_0_9.instance.invokeDynamic(context, q_18, NO_STRATEGIES, new IStrategoTerm[]{z_10.value, a_11.value, b_11.value, c_11.value, d_11.value, e_11.value, transform.constDouble0, g_11.value, h_11.value});
                                        if(term == null)
                                          break Fail306;
                                        n_18 = term;
                                        term = o_18;
                                        if(r_11.value == null)
                                          break Fail306;
                                        term = termFactory.makeAppl(transform._consAssignMinus_2, new IStrategoTerm[]{r_11.value, n_18});
                                        if(true)
                                          break Success192;
                                      }
                                    }
                                    term = term54;
                                    IStrategoTerm term55 = term;
                                    Success193:
                                    { 
                                      Fail331:
                                      { 
                                        IStrategoTerm e_14 = null;
                                        e_14 = term;
                                        if(g_12.value == null)
                                          break Fail331;
                                        term = g_12.value;
                                        if(term.getTermType() != IStrategoTerm.APPL || transform._consAssignLeftShift_2 != ((IStrategoAppl)term).getConstructor())
                                          break Fail331;
                                        if(r_11.value == null)
                                          r_11.value = term.getSubterm(0);
                                        else
                                          if(r_11.value != term.getSubterm(0) && !r_11.value.match(term.getSubterm(0)))
                                            break Fail331;
                                        if(e_12.value == null)
                                          e_12.value = term.getSubterm(1);
                                        else
                                          if(e_12.value != term.getSubterm(1) && !e_12.value.match(term.getSubterm(1)))
                                            break Fail331;
                                        term = e_14;
                                        { 
                                          IStrategoTerm r_18 = null;
                                          IStrategoTerm s_18 = null;
                                          IStrategoTerm u_18 = null;
                                          if(r_11.value == null)
                                            break Fail306;
                                          term = get_$L$H$S_type_0_3.instance.invoke(context, r_11.value, f_11.value, z_10.value, a_11.value);
                                          if(term == null)
                                            break Fail306;
                                          s_18 = term;
                                          if(e_12.value == null)
                                            break Fail306;
                                          u_18 = e_12.value;
                                          term = add_external_impl_0_9.instance.invokeDynamic(context, u_18, NO_STRATEGIES, new IStrategoTerm[]{z_10.value, a_11.value, b_11.value, c_11.value, d_11.value, e_11.value, transform.constLong0, g_11.value, h_11.value});
                                          if(term == null)
                                            break Fail306;
                                          r_18 = term;
                                          term = s_18;
                                          if(r_11.value == null)
                                            break Fail306;
                                          term = termFactory.makeAppl(transform._consAssignLeftShift_2, new IStrategoTerm[]{r_11.value, r_18});
                                          if(true)
                                            break Success193;
                                        }
                                      }
                                      term = term55;
                                      IStrategoTerm term56 = term;
                                      Success194:
                                      { 
                                        Fail332:
                                        { 
                                          IStrategoTerm f_14 = null;
                                          f_14 = term;
                                          if(g_12.value == null)
                                            break Fail332;
                                          term = g_12.value;
                                          if(term.getTermType() != IStrategoTerm.APPL || transform._consAssignRightShift_2 != ((IStrategoAppl)term).getConstructor())
                                            break Fail332;
                                          if(r_11.value == null)
                                            r_11.value = term.getSubterm(0);
                                          else
                                            if(r_11.value != term.getSubterm(0) && !r_11.value.match(term.getSubterm(0)))
                                              break Fail332;
                                          if(e_12.value == null)
                                            e_12.value = term.getSubterm(1);
                                          else
                                            if(e_12.value != term.getSubterm(1) && !e_12.value.match(term.getSubterm(1)))
                                              break Fail332;
                                          term = f_14;
                                          { 
                                            IStrategoTerm v_18 = null;
                                            IStrategoTerm w_18 = null;
                                            IStrategoTerm y_18 = null;
                                            if(r_11.value == null)
                                              break Fail306;
                                            term = get_$L$H$S_type_0_3.instance.invoke(context, r_11.value, f_11.value, z_10.value, a_11.value);
                                            if(term == null)
                                              break Fail306;
                                            w_18 = term;
                                            if(e_12.value == null)
                                              break Fail306;
                                            y_18 = e_12.value;
                                            term = add_external_impl_0_9.instance.invokeDynamic(context, y_18, NO_STRATEGIES, new IStrategoTerm[]{z_10.value, a_11.value, b_11.value, c_11.value, d_11.value, e_11.value, transform.constLong0, g_11.value, h_11.value});
                                            if(term == null)
                                              break Fail306;
                                            v_18 = term;
                                            term = w_18;
                                            if(r_11.value == null)
                                              break Fail306;
                                            term = termFactory.makeAppl(transform._consAssignRightShift_2, new IStrategoTerm[]{r_11.value, v_18});
                                            if(true)
                                              break Success194;
                                          }
                                        }
                                        term = term56;
                                        IStrategoTerm term57 = term;
                                        Success195:
                                        { 
                                          Fail333:
                                          { 
                                            IStrategoTerm g_14 = null;
                                            g_14 = term;
                                            if(g_12.value == null)
                                              break Fail333;
                                            term = g_12.value;
                                            if(term.getTermType() != IStrategoTerm.APPL || transform._consAssignURightShift_2 != ((IStrategoAppl)term).getConstructor())
                                              break Fail333;
                                            if(r_11.value == null)
                                              r_11.value = term.getSubterm(0);
                                            else
                                              if(r_11.value != term.getSubterm(0) && !r_11.value.match(term.getSubterm(0)))
                                                break Fail333;
                                            if(e_12.value == null)
                                              e_12.value = term.getSubterm(1);
                                            else
                                              if(e_12.value != term.getSubterm(1) && !e_12.value.match(term.getSubterm(1)))
                                                break Fail333;
                                            term = g_14;
                                            { 
                                              IStrategoTerm z_18 = null;
                                              IStrategoTerm a_19 = null;
                                              IStrategoTerm d_19 = null;
                                              if(r_11.value == null)
                                                break Fail306;
                                              term = get_$L$H$S_type_0_3.instance.invoke(context, r_11.value, f_11.value, z_10.value, a_11.value);
                                              if(term == null)
                                                break Fail306;
                                              a_19 = term;
                                              if(e_12.value == null)
                                                break Fail306;
                                              d_19 = e_12.value;
                                              term = add_external_impl_0_9.instance.invokeDynamic(context, d_19, NO_STRATEGIES, new IStrategoTerm[]{z_10.value, a_11.value, b_11.value, c_11.value, d_11.value, e_11.value, transform.constLong0, g_11.value, h_11.value});
                                              if(term == null)
                                                break Fail306;
                                              z_18 = term;
                                              term = a_19;
                                              if(r_11.value == null)
                                                break Fail306;
                                              term = termFactory.makeAppl(transform._consAssignURightShift_2, new IStrategoTerm[]{r_11.value, z_18});
                                              if(true)
                                                break Success195;
                                            }
                                          }
                                          term = term57;
                                          add_external_impl_0_9_fragment_0 add_external_impl_0_9_fragment_00 = new add_external_impl_0_9_fragment_0();
                                          add_external_impl_0_9_fragment_00.s_11 = s_11;
                                          add_external_impl_0_9_fragment_00.r_11 = r_11;
                                          add_external_impl_0_9_fragment_00.t_11 = t_11;
                                          add_external_impl_0_9_fragment_00.u_11 = u_11;
                                          add_external_impl_0_9_fragment_00.v_11 = v_11;
                                          add_external_impl_0_9_fragment_00.w_11 = w_11;
                                          add_external_impl_0_9_fragment_00.x_11 = x_11;
                                          add_external_impl_0_9_fragment_00.y_11 = y_11;
                                          add_external_impl_0_9_fragment_00.z_11 = z_11;
                                          add_external_impl_0_9_fragment_00.a_12 = a_12;
                                          add_external_impl_0_9_fragment_00.b_12 = b_12;
                                          add_external_impl_0_9_fragment_00.c_12 = c_12;
                                          add_external_impl_0_9_fragment_00.g_12 = g_12;
                                          add_external_impl_0_9_fragment_00.e_12 = e_12;
                                          add_external_impl_0_9_fragment_00.d_12 = d_12;
                                          add_external_impl_0_9_fragment_00.z_10 = z_10;
                                          add_external_impl_0_9_fragment_00.a_11 = a_11;
                                          add_external_impl_0_9_fragment_00.b_11 = b_11;
                                          add_external_impl_0_9_fragment_00.c_11 = c_11;
                                          add_external_impl_0_9_fragment_00.d_11 = d_11;
                                          add_external_impl_0_9_fragment_00.e_11 = e_11;
                                          add_external_impl_0_9_fragment_00.f_11 = f_11;
                                          add_external_impl_0_9_fragment_00.g_11 = g_11;
                                          add_external_impl_0_9_fragment_00.h_11 = h_11;
                                          add_external_impl_0_9_fragment_00.f_12 = f_12;
                                          term = add_external_impl_0_9_fragment_00.invoke(context, term);
                                          if(term == null)
                                            break Fail306;
                                        }
                                      }
                                    }
                                  }
                                }
                              }
                            }
                          }
                        }
                      }
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
      return null;
    }
  }

  @SuppressWarnings("all") private static final class add_external_impl_0_9_fragment_0 extends Strategy 
  { 
    TermReference s_11;

    TermReference r_11;

    TermReference t_11;

    TermReference u_11;

    TermReference v_11;

    TermReference w_11;

    TermReference x_11;

    TermReference y_11;

    TermReference z_11;

    TermReference a_12;

    TermReference b_12;

    TermReference c_12;

    TermReference g_12;

    TermReference e_12;

    TermReference d_12;

    TermReference z_10;

    TermReference a_11;

    TermReference b_11;

    TermReference c_11;

    TermReference d_11;

    TermReference e_11;

    TermReference f_11;

    TermReference g_11;

    TermReference h_11;

    TermReference f_12;

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      ITermFactory termFactory = context.getFactory();
      Fail334:
      { 
        IStrategoTerm term58 = term;
        Success196:
        { 
          Fail335:
          { 
            IStrategoTerm h_14 = null;
            h_14 = term;
            if(g_12.value == null)
              break Fail335;
            term = g_12.value;
            if(term.getTermType() != IStrategoTerm.APPL || transform._consAssignAnd_2 != ((IStrategoAppl)term).getConstructor())
              break Fail335;
            if(r_11.value == null)
              r_11.value = term.getSubterm(0);
            else
              if(r_11.value != term.getSubterm(0) && !r_11.value.match(term.getSubterm(0)))
                break Fail335;
            if(e_12.value == null)
              e_12.value = term.getSubterm(1);
            else
              if(e_12.value != term.getSubterm(1) && !e_12.value.match(term.getSubterm(1)))
                break Fail335;
            term = h_14;
            { 
              IStrategoTerm e_19 = null;
              IStrategoTerm f_19 = null;
              IStrategoTerm h_19 = null;
              if(r_11.value == null)
                break Fail334;
              term = get_$L$H$S_type_0_3.instance.invoke(context, r_11.value, f_11.value, z_10.value, a_11.value);
              if(term == null)
                break Fail334;
              if(s_11.value == null)
                s_11.value = term;
              else
                if(s_11.value != term && !s_11.value.match(term))
                  break Fail334;
              f_19 = term;
              if(e_12.value == null)
                break Fail334;
              term = e_12.value;
              h_19 = e_12.value;
              if(s_11.value == null)
                break Fail334;
              term = cast_bounded_conditional_type_0_0.instance.invoke(context, s_11.value);
              if(term == null)
                break Fail334;
              term = add_external_impl_0_9.instance.invokeDynamic(context, h_19, NO_STRATEGIES, new IStrategoTerm[]{z_10.value, a_11.value, b_11.value, c_11.value, d_11.value, e_11.value, term, g_11.value, h_11.value});
              if(term == null)
                break Fail334;
              e_19 = term;
              term = f_19;
              if(r_11.value == null)
                break Fail334;
              term = termFactory.makeAppl(transform._consAssignAnd_2, new IStrategoTerm[]{r_11.value, e_19});
              if(true)
                break Success196;
            }
          }
          term = term58;
          IStrategoTerm term59 = term;
          Success197:
          { 
            Fail336:
            { 
              IStrategoTerm i_14 = null;
              i_14 = term;
              if(g_12.value == null)
                break Fail336;
              term = g_12.value;
              if(term.getTermType() != IStrategoTerm.APPL || transform._consAssignExcOr_2 != ((IStrategoAppl)term).getConstructor())
                break Fail336;
              if(r_11.value == null)
                r_11.value = term.getSubterm(0);
              else
                if(r_11.value != term.getSubterm(0) && !r_11.value.match(term.getSubterm(0)))
                  break Fail336;
              if(e_12.value == null)
                e_12.value = term.getSubterm(1);
              else
                if(e_12.value != term.getSubterm(1) && !e_12.value.match(term.getSubterm(1)))
                  break Fail336;
              term = i_14;
              { 
                IStrategoTerm k_19 = null;
                IStrategoTerm l_19 = null;
                IStrategoTerm n_19 = null;
                if(r_11.value == null)
                  break Fail334;
                term = get_$L$H$S_type_0_3.instance.invoke(context, r_11.value, f_11.value, z_10.value, a_11.value);
                if(term == null)
                  break Fail334;
                if(s_11.value == null)
                  s_11.value = term;
                else
                  if(s_11.value != term && !s_11.value.match(term))
                    break Fail334;
                l_19 = term;
                if(e_12.value == null)
                  break Fail334;
                term = e_12.value;
                n_19 = e_12.value;
                if(s_11.value == null)
                  break Fail334;
                term = cast_bounded_conditional_type_0_0.instance.invoke(context, s_11.value);
                if(term == null)
                  break Fail334;
                term = add_external_impl_0_9.instance.invokeDynamic(context, n_19, NO_STRATEGIES, new IStrategoTerm[]{z_10.value, a_11.value, b_11.value, c_11.value, d_11.value, e_11.value, term, g_11.value, h_11.value});
                if(term == null)
                  break Fail334;
                k_19 = term;
                term = l_19;
                if(r_11.value == null)
                  break Fail334;
                term = termFactory.makeAppl(transform._consAssignExcOr_2, new IStrategoTerm[]{r_11.value, k_19});
                if(true)
                  break Success197;
              }
            }
            term = term59;
            IStrategoTerm term60 = term;
            Success198:
            { 
              Fail337:
              { 
                IStrategoTerm j_14 = null;
                j_14 = term;
                if(g_12.value == null)
                  break Fail337;
                term = g_12.value;
                if(term.getTermType() != IStrategoTerm.APPL || transform._consAssignOr_2 != ((IStrategoAppl)term).getConstructor())
                  break Fail337;
                if(r_11.value == null)
                  r_11.value = term.getSubterm(0);
                else
                  if(r_11.value != term.getSubterm(0) && !r_11.value.match(term.getSubterm(0)))
                    break Fail337;
                if(e_12.value == null)
                  e_12.value = term.getSubterm(1);
                else
                  if(e_12.value != term.getSubterm(1) && !e_12.value.match(term.getSubterm(1)))
                    break Fail337;
                term = j_14;
                { 
                  IStrategoTerm o_19 = null;
                  IStrategoTerm p_19 = null;
                  IStrategoTerm r_19 = null;
                  if(r_11.value == null)
                    break Fail334;
                  term = get_$L$H$S_type_0_3.instance.invoke(context, r_11.value, f_11.value, z_10.value, a_11.value);
                  if(term == null)
                    break Fail334;
                  if(s_11.value == null)
                    s_11.value = term;
                  else
                    if(s_11.value != term && !s_11.value.match(term))
                      break Fail334;
                  p_19 = term;
                  if(e_12.value == null)
                    break Fail334;
                  term = e_12.value;
                  r_19 = e_12.value;
                  if(s_11.value == null)
                    break Fail334;
                  term = cast_bounded_conditional_type_0_0.instance.invoke(context, s_11.value);
                  if(term == null)
                    break Fail334;
                  term = add_external_impl_0_9.instance.invokeDynamic(context, r_19, NO_STRATEGIES, new IStrategoTerm[]{z_10.value, a_11.value, b_11.value, c_11.value, d_11.value, e_11.value, term, g_11.value, h_11.value});
                  if(term == null)
                    break Fail334;
                  o_19 = term;
                  term = p_19;
                  if(r_11.value == null)
                    break Fail334;
                  term = termFactory.makeAppl(transform._consAssignOr_2, new IStrategoTerm[]{r_11.value, o_19});
                  if(true)
                    break Success198;
                }
              }
              term = term60;
              IStrategoTerm term61 = term;
              Success199:
              { 
                Fail338:
                { 
                  IStrategoTerm k_14 = null;
                  k_14 = term;
                  if(g_12.value == null)
                    break Fail338;
                  term = or_2_0.instance.invoke(context, g_12.value, lifted46.instance, lifted47.instance);
                  if(term == null)
                    break Fail338;
                  term = k_14;
                  { 
                    if(f_12.value == null)
                      break Fail334;
                    term = f_12.value;
                    lifted48 lifted480 = new lifted48();
                    lifted480.z_10 = z_10;
                    lifted480.a_11 = a_11;
                    lifted480.b_11 = b_11;
                    lifted480.c_11 = c_11;
                    lifted480.d_11 = d_11;
                    lifted480.e_11 = e_11;
                    lifted480.g_11 = g_11;
                    lifted480.h_11 = h_11;
                    term = SRTS_all.instance.invoke(context, term, lifted480);
                    if(term == null)
                      break Fail334;
                    if(true)
                      break Success199;
                  }
                }
                term = term61;
                IStrategoTerm term62 = term;
                Success200:
                { 
                  Fail339:
                  { 
                    IStrategoTerm l_14 = null;
                    l_14 = term;
                    if(g_12.value == null)
                      break Fail339;
                    term = g_12.value;
                    if(term.getTermType() != IStrategoTerm.APPL || transform._consIf_2 != ((IStrategoAppl)term).getConstructor())
                      break Fail339;
                    if(e_12.value == null)
                      e_12.value = term.getSubterm(0);
                    else
                      if(e_12.value != term.getSubterm(0) && !e_12.value.match(term.getSubterm(0)))
                        break Fail339;
                    if(t_11.value == null)
                      t_11.value = term.getSubterm(1);
                    else
                      if(t_11.value != term.getSubterm(1) && !t_11.value.match(term.getSubterm(1)))
                        break Fail339;
                    term = l_14;
                    { 
                      IStrategoTerm u_19 = null;
                      IStrategoTerm x_19 = null;
                      IStrategoTerm z_19 = null;
                      IStrategoTerm c_20 = null;
                      x_19 = term;
                      if(e_12.value == null)
                        break Fail334;
                      z_19 = e_12.value;
                      term = add_external_impl_0_9.instance.invokeDynamic(context, z_19, NO_STRATEGIES, new IStrategoTerm[]{z_10.value, a_11.value, b_11.value, c_11.value, d_11.value, e_11.value, transform.constBoolean0, g_11.value, h_11.value});
                      if(term == null)
                        break Fail334;
                      u_19 = term;
                      term = x_19;
                      if(t_11.value == null)
                        break Fail334;
                      c_20 = t_11.value;
                      term = add_external_impl_0_9.instance.invokeDynamic(context, c_20, NO_STRATEGIES, new IStrategoTerm[]{z_10.value, a_11.value, b_11.value, c_11.value, d_11.value, e_11.value, transform.constNone0, g_11.value, h_11.value});
                      if(term == null)
                        break Fail334;
                      term = termFactory.makeAppl(transform._consIf_2, new IStrategoTerm[]{u_19, term});
                      if(true)
                        break Success200;
                    }
                  }
                  term = term62;
                  IStrategoTerm term63 = term;
                  Success201:
                  { 
                    Fail340:
                    { 
                      IStrategoTerm m_14 = null;
                      m_14 = term;
                      if(g_12.value == null)
                        break Fail340;
                      term = g_12.value;
                      if(term.getTermType() != IStrategoTerm.APPL || transform._consIf_3 != ((IStrategoAppl)term).getConstructor())
                        break Fail340;
                      if(e_12.value == null)
                        e_12.value = term.getSubterm(0);
                      else
                        if(e_12.value != term.getSubterm(0) && !e_12.value.match(term.getSubterm(0)))
                          break Fail340;
                      if(t_11.value == null)
                        t_11.value = term.getSubterm(1);
                      else
                        if(t_11.value != term.getSubterm(1) && !t_11.value.match(term.getSubterm(1)))
                          break Fail340;
                      if(u_11.value == null)
                        u_11.value = term.getSubterm(2);
                      else
                        if(u_11.value != term.getSubterm(2) && !u_11.value.match(term.getSubterm(2)))
                          break Fail340;
                      term = m_14;
                      { 
                        IStrategoTerm d_20 = null;
                        IStrategoTerm g_20 = null;
                        IStrategoTerm i_20 = null;
                        IStrategoTerm e_20 = null;
                        IStrategoTerm j_20 = null;
                        IStrategoTerm l_20 = null;
                        IStrategoTerm o_20 = null;
                        g_20 = term;
                        if(e_12.value == null)
                          break Fail334;
                        i_20 = e_12.value;
                        term = add_external_impl_0_9.instance.invokeDynamic(context, i_20, NO_STRATEGIES, new IStrategoTerm[]{z_10.value, a_11.value, b_11.value, c_11.value, d_11.value, e_11.value, transform.constBoolean0, g_11.value, h_11.value});
                        if(term == null)
                          break Fail334;
                        d_20 = term;
                        term = g_20;
                        j_20 = g_20;
                        if(t_11.value == null)
                          break Fail334;
                        l_20 = t_11.value;
                        term = add_external_impl_0_9.instance.invokeDynamic(context, l_20, NO_STRATEGIES, new IStrategoTerm[]{z_10.value, a_11.value, b_11.value, c_11.value, d_11.value, e_11.value, transform.constNone0, g_11.value, h_11.value});
                        if(term == null)
                          break Fail334;
                        e_20 = term;
                        term = j_20;
                        if(u_11.value == null)
                          break Fail334;
                        o_20 = u_11.value;
                        term = add_external_impl_0_9.instance.invokeDynamic(context, o_20, NO_STRATEGIES, new IStrategoTerm[]{z_10.value, a_11.value, b_11.value, c_11.value, d_11.value, e_11.value, transform.constNone0, g_11.value, h_11.value});
                        if(term == null)
                          break Fail334;
                        term = termFactory.makeAppl(transform._consIf_3, new IStrategoTerm[]{d_20, e_20, term});
                        if(true)
                          break Success201;
                      }
                    }
                    term = term63;
                    IStrategoTerm term64 = term;
                    Success202:
                    { 
                      Fail341:
                      { 
                        IStrategoTerm n_14 = null;
                        n_14 = term;
                        if(g_12.value == null)
                          break Fail341;
                        term = g_12.value;
                        if(term.getTermType() != IStrategoTerm.APPL || transform._consAssertStm_1 != ((IStrategoAppl)term).getConstructor())
                          break Fail341;
                        if(e_12.value == null)
                          e_12.value = term.getSubterm(0);
                        else
                          if(e_12.value != term.getSubterm(0) && !e_12.value.match(term.getSubterm(0)))
                            break Fail341;
                        term = n_14;
                        { 
                          IStrategoTerm s_20 = null;
                          if(e_12.value == null)
                            break Fail334;
                          s_20 = e_12.value;
                          term = add_external_impl_0_9.instance.invokeDynamic(context, s_20, NO_STRATEGIES, new IStrategoTerm[]{z_10.value, a_11.value, b_11.value, c_11.value, d_11.value, e_11.value, transform.constBoolean0, g_11.value, h_11.value});
                          if(term == null)
                            break Fail334;
                          term = termFactory.makeAppl(transform._consAssertStm_1, new IStrategoTerm[]{term});
                          if(true)
                            break Success202;
                        }
                      }
                      term = term64;
                      IStrategoTerm term65 = term;
                      Success203:
                      { 
                        Fail342:
                        { 
                          IStrategoTerm o_14 = null;
                          o_14 = term;
                          if(g_12.value == null)
                            break Fail342;
                          term = g_12.value;
                          if(term.getTermType() != IStrategoTerm.APPL || transform._consAssertStm_2 != ((IStrategoAppl)term).getConstructor())
                            break Fail342;
                          if(v_11.value == null)
                            v_11.value = term.getSubterm(0);
                          else
                            if(v_11.value != term.getSubterm(0) && !v_11.value.match(term.getSubterm(0)))
                              break Fail342;
                          if(w_11.value == null)
                            w_11.value = term.getSubterm(1);
                          else
                            if(w_11.value != term.getSubterm(1) && !w_11.value.match(term.getSubterm(1)))
                              break Fail342;
                          term = o_14;
                          { 
                            IStrategoTerm t_20 = null;
                            IStrategoTerm v_20 = null;
                            IStrategoTerm x_20 = null;
                            IStrategoTerm a_21 = null;
                            v_20 = term;
                            if(v_11.value == null)
                              break Fail334;
                            x_20 = v_11.value;
                            term = add_external_impl_0_9.instance.invokeDynamic(context, x_20, NO_STRATEGIES, new IStrategoTerm[]{z_10.value, a_11.value, b_11.value, c_11.value, d_11.value, e_11.value, transform.constBoolean0, g_11.value, h_11.value});
                            if(term == null)
                              break Fail334;
                            t_20 = term;
                            term = v_20;
                            if(w_11.value == null)
                              break Fail334;
                            a_21 = w_11.value;
                            term = add_external_impl_0_9.instance.invokeDynamic(context, a_21, NO_STRATEGIES, new IStrategoTerm[]{z_10.value, a_11.value, b_11.value, c_11.value, d_11.value, e_11.value, transform.constBoolean0, g_11.value, h_11.value});
                            if(term == null)
                              break Fail334;
                            term = termFactory.makeAppl(transform._consAssertStm_2, new IStrategoTerm[]{t_20, term});
                            if(true)
                              break Success203;
                          }
                        }
                        term = term65;
                        IStrategoTerm term66 = term;
                        Success204:
                        { 
                          Fail343:
                          { 
                            IStrategoTerm p_14 = null;
                            p_14 = term;
                            if(g_12.value == null)
                              break Fail343;
                            term = g_12.value;
                            if(term.getTermType() != IStrategoTerm.APPL || transform._consWhile_2 != ((IStrategoAppl)term).getConstructor())
                              break Fail343;
                            if(e_12.value == null)
                              e_12.value = term.getSubterm(0);
                            else
                              if(e_12.value != term.getSubterm(0) && !e_12.value.match(term.getSubterm(0)))
                                break Fail343;
                            if(c_12.value == null)
                              c_12.value = term.getSubterm(1);
                            else
                              if(c_12.value != term.getSubterm(1) && !c_12.value.match(term.getSubterm(1)))
                                break Fail343;
                            term = p_14;
                            { 
                              IStrategoTerm b_21 = null;
                              IStrategoTerm d_21 = null;
                              IStrategoTerm f_21 = null;
                              IStrategoTerm i_21 = null;
                              d_21 = term;
                              if(e_12.value == null)
                                break Fail334;
                              f_21 = e_12.value;
                              term = add_external_impl_0_9.instance.invokeDynamic(context, f_21, NO_STRATEGIES, new IStrategoTerm[]{z_10.value, a_11.value, b_11.value, c_11.value, d_11.value, e_11.value, transform.constBoolean0, g_11.value, h_11.value});
                              if(term == null)
                                break Fail334;
                              b_21 = term;
                              term = d_21;
                              if(c_12.value == null)
                                break Fail334;
                              i_21 = c_12.value;
                              term = add_external_impl_0_9.instance.invokeDynamic(context, i_21, NO_STRATEGIES, new IStrategoTerm[]{z_10.value, a_11.value, b_11.value, c_11.value, d_11.value, e_11.value, transform.constNone0, g_11.value, h_11.value});
                              if(term == null)
                                break Fail334;
                              term = termFactory.makeAppl(transform._consWhile_2, new IStrategoTerm[]{b_21, term});
                              if(true)
                                break Success204;
                            }
                          }
                          term = term66;
                          IStrategoTerm term67 = term;
                          Success205:
                          { 
                            Fail344:
                            { 
                              IStrategoTerm s_14 = null;
                              s_14 = term;
                              if(g_12.value == null)
                                break Fail344;
                              term = g_12.value;
                              if(term.getTermType() != IStrategoTerm.APPL || transform._consDoWhile_2 != ((IStrategoAppl)term).getConstructor())
                                break Fail344;
                              if(c_12.value == null)
                                c_12.value = term.getSubterm(0);
                              else
                                if(c_12.value != term.getSubterm(0) && !c_12.value.match(term.getSubterm(0)))
                                  break Fail344;
                              if(e_12.value == null)
                                e_12.value = term.getSubterm(1);
                              else
                                if(e_12.value != term.getSubterm(1) && !e_12.value.match(term.getSubterm(1)))
                                  break Fail344;
                              term = s_14;
                              { 
                                IStrategoTerm j_21 = null;
                                IStrategoTerm l_21 = null;
                                IStrategoTerm n_21 = null;
                                IStrategoTerm q_21 = null;
                                l_21 = term;
                                if(c_12.value == null)
                                  break Fail334;
                                n_21 = c_12.value;
                                term = add_external_impl_0_9.instance.invokeDynamic(context, n_21, NO_STRATEGIES, new IStrategoTerm[]{z_10.value, a_11.value, b_11.value, c_11.value, d_11.value, e_11.value, transform.constNone0, g_11.value, h_11.value});
                                if(term == null)
                                  break Fail334;
                                j_21 = term;
                                term = l_21;
                                if(e_12.value == null)
                                  break Fail334;
                                q_21 = e_12.value;
                                term = add_external_impl_0_9.instance.invokeDynamic(context, q_21, NO_STRATEGIES, new IStrategoTerm[]{z_10.value, a_11.value, b_11.value, c_11.value, d_11.value, e_11.value, transform.constBoolean0, g_11.value, h_11.value});
                                if(term == null)
                                  break Fail334;
                                term = termFactory.makeAppl(transform._consDoWhile_2, new IStrategoTerm[]{j_21, term});
                                if(true)
                                  break Success205;
                              }
                            }
                            term = term67;
                            IStrategoTerm term68 = term;
                            Success206:
                            { 
                              Fail345:
                              { 
                                IStrategoTerm t_14 = null;
                                t_14 = term;
                                if(g_12.value == null)
                                  break Fail345;
                                term = g_12.value;
                                if(term.getTermType() != IStrategoTerm.APPL || transform._consFor_4 != ((IStrategoAppl)term).getConstructor())
                                  break Fail345;
                                if(x_11.value == null)
                                  x_11.value = term.getSubterm(0);
                                else
                                  if(x_11.value != term.getSubterm(0) && !x_11.value.match(term.getSubterm(0)))
                                    break Fail345;
                                if(e_12.value == null)
                                  e_12.value = term.getSubterm(1);
                                else
                                  if(e_12.value != term.getSubterm(1) && !e_12.value.match(term.getSubterm(1)))
                                    break Fail345;
                                if(y_11.value == null)
                                  y_11.value = term.getSubterm(2);
                                else
                                  if(y_11.value != term.getSubterm(2) && !y_11.value.match(term.getSubterm(2)))
                                    break Fail345;
                                if(c_12.value == null)
                                  c_12.value = term.getSubterm(3);
                                else
                                  if(c_12.value != term.getSubterm(3) && !c_12.value.match(term.getSubterm(3)))
                                    break Fail345;
                                term = t_14;
                                { 
                                  IStrategoTerm r_21 = null;
                                  IStrategoTerm v_21 = null;
                                  IStrategoTerm x_21 = null;
                                  IStrategoTerm s_21 = null;
                                  IStrategoTerm y_21 = null;
                                  IStrategoTerm a_22 = null;
                                  IStrategoTerm t_21 = null;
                                  IStrategoTerm b_22 = null;
                                  IStrategoTerm d_22 = null;
                                  IStrategoTerm g_22 = null;
                                  v_21 = term;
                                  if(x_11.value == null)
                                    break Fail334;
                                  x_21 = x_11.value;
                                  term = add_external_impl_0_9.instance.invokeDynamic(context, x_21, NO_STRATEGIES, new IStrategoTerm[]{z_10.value, a_11.value, b_11.value, c_11.value, d_11.value, e_11.value, transform.constNone0, g_11.value, h_11.value});
                                  if(term == null)
                                    break Fail334;
                                  r_21 = term;
                                  term = v_21;
                                  y_21 = v_21;
                                  if(e_12.value == null)
                                    break Fail334;
                                  a_22 = e_12.value;
                                  term = add_external_impl_0_9.instance.invokeDynamic(context, a_22, NO_STRATEGIES, new IStrategoTerm[]{z_10.value, a_11.value, b_11.value, c_11.value, d_11.value, e_11.value, transform.constBoolean0, g_11.value, h_11.value});
                                  if(term == null)
                                    break Fail334;
                                  s_21 = term;
                                  term = y_21;
                                  b_22 = y_21;
                                  if(y_11.value == null)
                                    break Fail334;
                                  d_22 = y_11.value;
                                  term = add_external_impl_0_9.instance.invokeDynamic(context, d_22, NO_STRATEGIES, new IStrategoTerm[]{z_10.value, a_11.value, b_11.value, c_11.value, d_11.value, e_11.value, transform.constNone0, g_11.value, h_11.value});
                                  if(term == null)
                                    break Fail334;
                                  t_21 = term;
                                  term = b_22;
                                  if(c_12.value == null)
                                    break Fail334;
                                  g_22 = c_12.value;
                                  term = add_external_impl_0_9.instance.invokeDynamic(context, g_22, NO_STRATEGIES, new IStrategoTerm[]{z_10.value, a_11.value, b_11.value, c_11.value, d_11.value, e_11.value, transform.constNone0, g_11.value, h_11.value});
                                  if(term == null)
                                    break Fail334;
                                  term = termFactory.makeAppl(transform._consFor_4, new IStrategoTerm[]{r_21, s_21, t_21, term});
                                  if(true)
                                    break Success206;
                                }
                              }
                              term = term68;
                              IStrategoTerm term69 = term;
                              Success207:
                              { 
                                Fail346:
                                { 
                                  IStrategoTerm u_14 = null;
                                  u_14 = term;
                                  if(g_12.value == null)
                                    break Fail346;
                                  term = g_12.value;
                                  if(term.getTermType() != IStrategoTerm.APPL || transform._consFor_4 != ((IStrategoAppl)term).getConstructor())
                                    break Fail346;
                                  if(z_11.value == null)
                                    z_11.value = term.getSubterm(0);
                                  else
                                    if(z_11.value != term.getSubterm(0) && !z_11.value.match(term.getSubterm(0)))
                                      break Fail346;
                                  if(e_12.value == null)
                                    e_12.value = term.getSubterm(1);
                                  else
                                    if(e_12.value != term.getSubterm(1) && !e_12.value.match(term.getSubterm(1)))
                                      break Fail346;
                                  if(a_12.value == null)
                                    a_12.value = term.getSubterm(2);
                                  else
                                    if(a_12.value != term.getSubterm(2) && !a_12.value.match(term.getSubterm(2)))
                                      break Fail346;
                                  if(c_12.value == null)
                                    c_12.value = term.getSubterm(3);
                                  else
                                    if(c_12.value != term.getSubterm(3) && !c_12.value.match(term.getSubterm(3)))
                                      break Fail346;
                                  term = u_14;
                                  { 
                                    IStrategoTerm h_22 = null;
                                    IStrategoTerm l_22 = null;
                                    IStrategoTerm n_22 = null;
                                    IStrategoTerm i_22 = null;
                                    IStrategoTerm o_22 = null;
                                    IStrategoTerm q_22 = null;
                                    IStrategoTerm j_22 = null;
                                    IStrategoTerm r_22 = null;
                                    IStrategoTerm t_22 = null;
                                    IStrategoTerm w_22 = null;
                                    l_22 = term;
                                    if(z_11.value == null)
                                      break Fail334;
                                    n_22 = z_11.value;
                                    term = add_external_impl_0_9.instance.invokeDynamic(context, n_22, NO_STRATEGIES, new IStrategoTerm[]{z_10.value, a_11.value, b_11.value, c_11.value, d_11.value, e_11.value, transform.constNone0, g_11.value, h_11.value});
                                    if(term == null)
                                      break Fail334;
                                    h_22 = term;
                                    term = l_22;
                                    o_22 = l_22;
                                    if(e_12.value == null)
                                      break Fail334;
                                    q_22 = e_12.value;
                                    term = add_external_impl_0_9.instance.invokeDynamic(context, q_22, NO_STRATEGIES, new IStrategoTerm[]{z_10.value, a_11.value, b_11.value, c_11.value, d_11.value, e_11.value, transform.constBoolean0, g_11.value, h_11.value});
                                    if(term == null)
                                      break Fail334;
                                    i_22 = term;
                                    term = o_22;
                                    r_22 = o_22;
                                    if(a_12.value == null)
                                      break Fail334;
                                    t_22 = a_12.value;
                                    term = add_external_impl_0_9.instance.invokeDynamic(context, t_22, NO_STRATEGIES, new IStrategoTerm[]{z_10.value, a_11.value, b_11.value, c_11.value, d_11.value, e_11.value, transform.constNone0, g_11.value, h_11.value});
                                    if(term == null)
                                      break Fail334;
                                    j_22 = term;
                                    term = r_22;
                                    if(c_12.value == null)
                                      break Fail334;
                                    w_22 = c_12.value;
                                    term = add_external_impl_0_9.instance.invokeDynamic(context, w_22, NO_STRATEGIES, new IStrategoTerm[]{z_10.value, a_11.value, b_11.value, c_11.value, d_11.value, e_11.value, transform.constNone0, g_11.value, h_11.value});
                                    if(term == null)
                                      break Fail334;
                                    term = termFactory.makeAppl(transform._consFor_4, new IStrategoTerm[]{h_22, i_22, j_22, term});
                                    if(true)
                                      break Success207;
                                  }
                                }
                                term = term69;
                                IStrategoTerm term70 = term;
                                Success208:
                                { 
                                  Fail347:
                                  { 
                                    IStrategoTerm v_14 = null;
                                    v_14 = term;
                                    if(g_12.value == null)
                                      break Fail347;
                                    term = g_12.value;
                                    if(term.getTermType() != IStrategoTerm.APPL || transform._consForEach_3 != ((IStrategoAppl)term).getConstructor())
                                      break Fail347;
                                    if(b_12.value == null)
                                      b_12.value = term.getSubterm(0);
                                    else
                                      if(b_12.value != term.getSubterm(0) && !b_12.value.match(term.getSubterm(0)))
                                        break Fail347;
                                    if(e_12.value == null)
                                      e_12.value = term.getSubterm(1);
                                    else
                                      if(e_12.value != term.getSubterm(1) && !e_12.value.match(term.getSubterm(1)))
                                        break Fail347;
                                    if(c_12.value == null)
                                      c_12.value = term.getSubterm(2);
                                    else
                                      if(c_12.value != term.getSubterm(2) && !c_12.value.match(term.getSubterm(2)))
                                        break Fail347;
                                    term = v_14;
                                    { 
                                      IStrategoTerm x_22 = null;
                                      IStrategoTerm a_23 = null;
                                      IStrategoTerm c_23 = null;
                                      IStrategoTerm y_22 = null;
                                      IStrategoTerm d_23 = null;
                                      IStrategoTerm f_23 = null;
                                      IStrategoTerm i_23 = null;
                                      a_23 = term;
                                      if(b_12.value == null)
                                        break Fail334;
                                      c_23 = b_12.value;
                                      term = add_external_impl_0_9.instance.invokeDynamic(context, c_23, NO_STRATEGIES, new IStrategoTerm[]{z_10.value, a_11.value, b_11.value, c_11.value, d_11.value, e_11.value, transform.constNone0, g_11.value, h_11.value});
                                      if(term == null)
                                        break Fail334;
                                      x_22 = term;
                                      term = a_23;
                                      d_23 = a_23;
                                      if(e_12.value == null)
                                        break Fail334;
                                      f_23 = e_12.value;
                                      term = add_external_impl_0_9.instance.invokeDynamic(context, f_23, NO_STRATEGIES, new IStrategoTerm[]{z_10.value, a_11.value, b_11.value, c_11.value, d_11.value, e_11.value, transform.constNone0, g_11.value, h_11.value});
                                      if(term == null)
                                        break Fail334;
                                      y_22 = term;
                                      term = d_23;
                                      if(c_12.value == null)
                                        break Fail334;
                                      i_23 = c_12.value;
                                      term = add_external_impl_0_9.instance.invokeDynamic(context, i_23, NO_STRATEGIES, new IStrategoTerm[]{z_10.value, a_11.value, b_11.value, c_11.value, d_11.value, e_11.value, transform.constNone0, g_11.value, h_11.value});
                                      if(term == null)
                                        break Fail334;
                                      term = termFactory.makeAppl(transform._consForEach_3, new IStrategoTerm[]{x_22, y_22, term});
                                      if(true)
                                        break Success208;
                                    }
                                  }
                                  term = term70;
                                  IStrategoTerm term71 = term;
                                  Success209:
                                  { 
                                    Fail348:
                                    { 
                                      IStrategoTerm w_14 = null;
                                      w_14 = term;
                                      if(g_12.value == null)
                                        break Fail348;
                                      term = g_12.value;
                                      if(term.getTermType() != IStrategoTerm.APPL || transform._consCastPrim_2 != ((IStrategoAppl)term).getConstructor())
                                        break Fail348;
                                      if(d_12.value == null)
                                        d_12.value = term.getSubterm(0);
                                      else
                                        if(d_12.value != term.getSubterm(0) && !d_12.value.match(term.getSubterm(0)))
                                          break Fail348;
                                      if(e_12.value == null)
                                        e_12.value = term.getSubterm(1);
                                      else
                                        if(e_12.value != term.getSubterm(1) && !e_12.value.match(term.getSubterm(1)))
                                          break Fail348;
                                      term = w_14;
                                      { 
                                        IStrategoTerm j_23 = null;
                                        IStrategoTerm k_23 = null;
                                        IStrategoTerm m_23 = null;
                                        k_23 = term;
                                        if(e_12.value == null)
                                          break Fail334;
                                        m_23 = e_12.value;
                                        term = add_external_impl_0_9.instance.invokeDynamic(context, m_23, NO_STRATEGIES, new IStrategoTerm[]{z_10.value, a_11.value, b_11.value, c_11.value, d_11.value, e_11.value, transform.constNone0, g_11.value, h_11.value});
                                        if(term == null)
                                          break Fail334;
                                        j_23 = term;
                                        term = k_23;
                                        if(d_12.value == null)
                                          break Fail334;
                                        term = termFactory.makeAppl(transform._consCastPrim_2, new IStrategoTerm[]{d_12.value, j_23});
                                        if(true)
                                          break Success209;
                                      }
                                    }
                                    term = term71;
                                    IStrategoTerm term72 = term;
                                    Success210:
                                    { 
                                      Fail349:
                                      { 
                                        IStrategoTerm x_14 = null;
                                        x_14 = term;
                                        if(g_12.value == null)
                                          break Fail349;
                                        term = g_12.value;
                                        if(term.getTermType() != IStrategoTerm.APPL || transform._consCastRef_2 != ((IStrategoAppl)term).getConstructor())
                                          break Fail349;
                                        if(d_12.value == null)
                                          d_12.value = term.getSubterm(0);
                                        else
                                          if(d_12.value != term.getSubterm(0) && !d_12.value.match(term.getSubterm(0)))
                                            break Fail349;
                                        if(e_12.value == null)
                                          e_12.value = term.getSubterm(1);
                                        else
                                          if(e_12.value != term.getSubterm(1) && !e_12.value.match(term.getSubterm(1)))
                                            break Fail349;
                                        term = x_14;
                                        { 
                                          IStrategoTerm n_23 = null;
                                          IStrategoTerm o_23 = null;
                                          IStrategoTerm q_23 = null;
                                          o_23 = term;
                                          if(e_12.value == null)
                                            break Fail334;
                                          q_23 = e_12.value;
                                          term = add_external_impl_0_9.instance.invokeDynamic(context, q_23, NO_STRATEGIES, new IStrategoTerm[]{z_10.value, a_11.value, b_11.value, c_11.value, d_11.value, e_11.value, transform.constNone0, g_11.value, h_11.value});
                                          if(term == null)
                                            break Fail334;
                                          n_23 = term;
                                          term = o_23;
                                          if(d_12.value == null)
                                            break Fail334;
                                          term = termFactory.makeAppl(transform._consCastRef_2, new IStrategoTerm[]{d_12.value, n_23});
                                          if(true)
                                            break Success210;
                                        }
                                      }
                                      term = term72;
                                      if(f_12.value == null)
                                        break Fail334;
                                      term = f_12.value;
                                      lifted49 lifted490 = new lifted49();
                                      lifted490.z_10 = z_10;
                                      lifted490.a_11 = a_11;
                                      lifted490.b_11 = b_11;
                                      lifted490.c_11 = c_11;
                                      lifted490.d_11 = d_11;
                                      lifted490.e_11 = e_11;
                                      lifted490.f_11 = f_11;
                                      lifted490.g_11 = g_11;
                                      lifted490.h_11 = h_11;
                                      term = SRTS_all.instance.invoke(context, term, lifted490);
                                      if(term == null)
                                        break Fail334;
                                    }
                                  }
                                }
                              }
                            }
                          }
                        }
                      }
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
      return null;
    }
  }

  @SuppressWarnings("all") private static final class lifted49 extends Strategy 
  { 
    TermReference z_10;

    TermReference a_11;

    TermReference b_11;

    TermReference c_11;

    TermReference d_11;

    TermReference e_11;

    TermReference f_11;

    TermReference g_11;

    TermReference h_11;

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      Fail350:
      { 
        term = add_external_impl_0_9.instance.invokeDynamic(context, term, NO_STRATEGIES, new IStrategoTerm[]{z_10.value, a_11.value, b_11.value, c_11.value, d_11.value, e_11.value, f_11.value, g_11.value, h_11.value});
        if(term == null)
          break Fail350;
        if(true)
          return term;
      }
      return null;
    }
  }

  @SuppressWarnings("all") private static final class lifted48 extends Strategy 
  { 
    TermReference z_10;

    TermReference a_11;

    TermReference b_11;

    TermReference c_11;

    TermReference d_11;

    TermReference e_11;

    TermReference g_11;

    TermReference h_11;

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      Fail351:
      { 
        IStrategoTerm t_19 = null;
        t_19 = term;
        term = add_external_impl_0_9.instance.invokeDynamic(context, t_19, NO_STRATEGIES, new IStrategoTerm[]{z_10.value, a_11.value, b_11.value, c_11.value, d_11.value, e_11.value, transform.constBoolean0, g_11.value, h_11.value});
        if(term == null)
          break Fail351;
        if(true)
          return term;
      }
      return null;
    }
  }

  @SuppressWarnings("all") private static final class lifted47 extends Strategy 
  { 
    public static final lifted47 instance = new lifted47();

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      Fail352:
      { 
        if(term.getTermType() != IStrategoTerm.APPL || transform._consLazyOr_2 != ((IStrategoAppl)term).getConstructor())
          break Fail352;
        if(true)
          return term;
      }
      return null;
    }
  }

  @SuppressWarnings("all") private static final class lifted46 extends Strategy 
  { 
    public static final lifted46 instance = new lifted46();

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      Fail353:
      { 
        if(term.getTermType() != IStrategoTerm.APPL || transform._consLazyAnd_2 != ((IStrategoAppl)term).getConstructor())
          break Fail353;
        if(true)
          return term;
      }
      return null;
    }
  }

  @SuppressWarnings("all") private static final class lifted45 extends Strategy 
  { 
    TermReference f_12;

    TermReference f_11;

    TermReference z_10;

    TermReference a_11;

    TermReference b_11;

    TermReference c_11;

    TermReference d_11;

    TermReference e_11;

    TermReference g_11;

    TermReference h_11;

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      Fail354:
      { 
        IStrategoTerm s_17 = null;
        s_17 = term;
        if(f_12.value == null)
          break Fail354;
        term = type_of_0_3.instance.invoke(context, f_12.value, f_11.value, z_10.value, a_11.value);
        if(term == null)
          break Fail354;
        term = add_external_impl_0_9.instance.invokeDynamic(context, s_17, NO_STRATEGIES, new IStrategoTerm[]{z_10.value, a_11.value, b_11.value, c_11.value, d_11.value, e_11.value, term, g_11.value, h_11.value});
        if(term == null)
          break Fail354;
        if(true)
          return term;
      }
      return null;
    }
  }

  @SuppressWarnings("all") private static final class lifted44 extends Strategy 
  { 
    public static final lifted44 instance = new lifted44();

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      Fail355:
      { 
        if(term.getTermType() != IStrategoTerm.APPL || transform._consComplement_1 != ((IStrategoAppl)term).getConstructor())
          break Fail355;
        if(true)
          return term;
      }
      return null;
    }
  }

  @SuppressWarnings("all") private static final class lifted41 extends Strategy 
  { 
    public static final lifted41 instance = new lifted41();

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      Fail356:
      { 
        term = or_2_0.instance.invoke(context, term, lifted42.instance, lifted43.instance);
        if(term == null)
          break Fail356;
        if(true)
          return term;
      }
      return null;
    }
  }

  @SuppressWarnings("all") private static final class lifted43 extends Strategy 
  { 
    public static final lifted43 instance = new lifted43();

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      Fail357:
      { 
        if(term.getTermType() != IStrategoTerm.APPL || transform._consPlus_1 != ((IStrategoAppl)term).getConstructor())
          break Fail357;
        if(true)
          return term;
      }
      return null;
    }
  }

  @SuppressWarnings("all") private static final class lifted42 extends Strategy 
  { 
    public static final lifted42 instance = new lifted42();

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      Fail358:
      { 
        if(term.getTermType() != IStrategoTerm.APPL || transform._consMinus_1 != ((IStrategoAppl)term).getConstructor())
          break Fail358;
        if(true)
          return term;
      }
      return null;
    }
  }

  @SuppressWarnings("all") private static final class lifted40 extends Strategy 
  { 
    TermReference z_10;

    TermReference a_11;

    TermReference b_11;

    TermReference c_11;

    TermReference d_11;

    TermReference e_11;

    TermReference g_11;

    TermReference h_11;

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      Fail359:
      { 
        IStrategoTerm q_17 = null;
        q_17 = term;
        term = add_external_impl_0_9.instance.invokeDynamic(context, q_17, NO_STRATEGIES, new IStrategoTerm[]{z_10.value, a_11.value, b_11.value, c_11.value, d_11.value, e_11.value, transform.constBoolean0, g_11.value, h_11.value});
        if(term == null)
          break Fail359;
        if(true)
          return term;
      }
      return null;
    }
  }

  @SuppressWarnings("all") private static final class lifted39 extends Strategy 
  { 
    TermReference f_11;

    TermReference z_10;

    TermReference a_11;

    TermReference b_11;

    TermReference c_11;

    TermReference d_11;

    TermReference e_11;

    TermReference g_11;

    TermReference h_11;

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      Fail360:
      { 
        IStrategoTerm g_16 = null;
        g_16 = term;
        if(f_11.value == null)
          break Fail360;
        term = cast_bounded_arithmetic_type_0_0.instance.invoke(context, f_11.value);
        if(term == null)
          break Fail360;
        term = add_external_impl_0_9.instance.invokeDynamic(context, g_16, NO_STRATEGIES, new IStrategoTerm[]{z_10.value, a_11.value, b_11.value, c_11.value, d_11.value, e_11.value, term, g_11.value, h_11.value});
        if(term == null)
          break Fail360;
        if(true)
          return term;
      }
      return null;
    }
  }

  @SuppressWarnings("all") private static final class lifted38 extends Strategy 
  { 
    TermReference z_10;

    TermReference a_11;

    TermReference b_11;

    TermReference c_11;

    TermReference d_11;

    TermReference e_11;

    TermReference g_11;

    TermReference h_11;

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      Fail361:
      { 
        IStrategoTerm e_16 = null;
        e_16 = term;
        term = add_external_impl_0_9.instance.invokeDynamic(context, e_16, NO_STRATEGIES, new IStrategoTerm[]{z_10.value, a_11.value, b_11.value, c_11.value, d_11.value, e_11.value, transform.constDouble0, g_11.value, h_11.value});
        if(term == null)
          break Fail361;
        if(true)
          return term;
      }
      return null;
    }
  }

  @SuppressWarnings("all") private static final class lifted37 extends Strategy 
  { 
    TermReference v_11;

    TermReference w_11;

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      Fail362:
      { 
        if(term.getTermType() != IStrategoTerm.APPL || transform._consRemain_2 != ((IStrategoAppl)term).getConstructor())
          break Fail362;
        if(v_11.value == null)
          v_11.value = term.getSubterm(0);
        else
          if(v_11.value != term.getSubterm(0) && !v_11.value.match(term.getSubterm(0)))
            break Fail362;
        if(w_11.value == null)
          w_11.value = term.getSubterm(1);
        else
          if(w_11.value != term.getSubterm(1) && !w_11.value.match(term.getSubterm(1)))
            break Fail362;
        if(true)
          return term;
      }
      return null;
    }
  }

  @SuppressWarnings("all") private static final class lifted30 extends Strategy 
  { 
    TermReference v_11;

    TermReference w_11;

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      Fail363:
      { 
        lifted34 lifted340 = new lifted34();
        lifted31 lifted311 = new lifted31();
        lifted340.v_11 = v_11;
        lifted340.w_11 = w_11;
        lifted311.v_11 = v_11;
        lifted311.w_11 = w_11;
        term = or_2_0.instance.invoke(context, term, lifted311, lifted340);
        if(term == null)
          break Fail363;
        if(true)
          return term;
      }
      return null;
    }
  }

  @SuppressWarnings("all") private static final class lifted34 extends Strategy 
  { 
    TermReference v_11;

    TermReference w_11;

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      Fail364:
      { 
        lifted36 lifted360 = new lifted36();
        lifted35 lifted350 = new lifted35();
        lifted360.v_11 = v_11;
        lifted360.w_11 = w_11;
        lifted350.v_11 = v_11;
        lifted350.w_11 = w_11;
        term = or_2_0.instance.invoke(context, term, lifted350, lifted360);
        if(term == null)
          break Fail364;
        if(true)
          return term;
      }
      return null;
    }
  }

  @SuppressWarnings("all") private static final class lifted36 extends Strategy 
  { 
    TermReference v_11;

    TermReference w_11;

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      Fail365:
      { 
        if(term.getTermType() != IStrategoTerm.APPL || transform._consDiv_2 != ((IStrategoAppl)term).getConstructor())
          break Fail365;
        if(v_11.value == null)
          v_11.value = term.getSubterm(0);
        else
          if(v_11.value != term.getSubterm(0) && !v_11.value.match(term.getSubterm(0)))
            break Fail365;
        if(w_11.value == null)
          w_11.value = term.getSubterm(1);
        else
          if(w_11.value != term.getSubterm(1) && !w_11.value.match(term.getSubterm(1)))
            break Fail365;
        if(true)
          return term;
      }
      return null;
    }
  }

  @SuppressWarnings("all") private static final class lifted35 extends Strategy 
  { 
    TermReference v_11;

    TermReference w_11;

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      Fail366:
      { 
        if(term.getTermType() != IStrategoTerm.APPL || transform._consMul_2 != ((IStrategoAppl)term).getConstructor())
          break Fail366;
        if(v_11.value == null)
          v_11.value = term.getSubterm(0);
        else
          if(v_11.value != term.getSubterm(0) && !v_11.value.match(term.getSubterm(0)))
            break Fail366;
        if(w_11.value == null)
          w_11.value = term.getSubterm(1);
        else
          if(w_11.value != term.getSubterm(1) && !w_11.value.match(term.getSubterm(1)))
            break Fail366;
        if(true)
          return term;
      }
      return null;
    }
  }

  @SuppressWarnings("all") private static final class lifted31 extends Strategy 
  { 
    TermReference v_11;

    TermReference w_11;

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      Fail367:
      { 
        lifted33 lifted330 = new lifted33();
        lifted32 lifted320 = new lifted32();
        lifted330.v_11 = v_11;
        lifted330.w_11 = w_11;
        lifted320.v_11 = v_11;
        lifted320.w_11 = w_11;
        term = or_2_0.instance.invoke(context, term, lifted320, lifted330);
        if(term == null)
          break Fail367;
        if(true)
          return term;
      }
      return null;
    }
  }

  @SuppressWarnings("all") private static final class lifted33 extends Strategy 
  { 
    TermReference v_11;

    TermReference w_11;

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      Fail368:
      { 
        if(term.getTermType() != IStrategoTerm.APPL || transform._consMinus_2 != ((IStrategoAppl)term).getConstructor())
          break Fail368;
        if(v_11.value == null)
          v_11.value = term.getSubterm(0);
        else
          if(v_11.value != term.getSubterm(0) && !v_11.value.match(term.getSubterm(0)))
            break Fail368;
        if(w_11.value == null)
          w_11.value = term.getSubterm(1);
        else
          if(w_11.value != term.getSubterm(1) && !w_11.value.match(term.getSubterm(1)))
            break Fail368;
        if(true)
          return term;
      }
      return null;
    }
  }

  @SuppressWarnings("all") private static final class lifted32 extends Strategy 
  { 
    TermReference v_11;

    TermReference w_11;

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      Fail369:
      { 
        if(term.getTermType() != IStrategoTerm.APPL || transform._consPlus_2 != ((IStrategoAppl)term).getConstructor())
          break Fail369;
        if(v_11.value == null)
          v_11.value = term.getSubterm(0);
        else
          if(v_11.value != term.getSubterm(0) && !v_11.value.match(term.getSubterm(0)))
            break Fail369;
        if(w_11.value == null)
          w_11.value = term.getSubterm(1);
        else
          if(w_11.value != term.getSubterm(1) && !w_11.value.match(term.getSubterm(1)))
            break Fail369;
        if(true)
          return term;
      }
      return null;
    }
  }

  @SuppressWarnings("all") private static final class lifted29 extends Strategy 
  { 
    TermReference z_10;

    TermReference a_11;

    TermReference b_11;

    TermReference c_11;

    TermReference d_11;

    TermReference e_11;

    TermReference g_11;

    TermReference h_11;

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      Fail370:
      { 
        IStrategoTerm c_16 = null;
        c_16 = term;
        term = add_external_impl_0_9.instance.invokeDynamic(context, c_16, NO_STRATEGIES, new IStrategoTerm[]{z_10.value, a_11.value, b_11.value, c_11.value, d_11.value, e_11.value, transform.constDouble0, g_11.value, h_11.value});
        if(term == null)
          break Fail370;
        if(true)
          return term;
      }
      return null;
    }
  }

  @SuppressWarnings("all") private static final class lifted26 extends Strategy 
  { 
    public static final lifted26 instance = new lifted26();

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      Fail371:
      { 
        term = or_2_0.instance.invoke(context, term, lifted27.instance, lifted28.instance);
        if(term == null)
          break Fail371;
        if(true)
          return term;
      }
      return null;
    }
  }

  @SuppressWarnings("all") private static final class lifted28 extends Strategy 
  { 
    public static final lifted28 instance = new lifted28();

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      Fail372:
      { 
        if(term.getTermType() != IStrategoTerm.APPL || transform._consGtEq_2 != ((IStrategoAppl)term).getConstructor())
          break Fail372;
        if(true)
          return term;
      }
      return null;
    }
  }

  @SuppressWarnings("all") private static final class lifted27 extends Strategy 
  { 
    public static final lifted27 instance = new lifted27();

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      Fail373:
      { 
        if(term.getTermType() != IStrategoTerm.APPL || transform._consGt_2 != ((IStrategoAppl)term).getConstructor())
          break Fail373;
        if(true)
          return term;
      }
      return null;
    }
  }

  @SuppressWarnings("all") private static final class lifted23 extends Strategy 
  { 
    public static final lifted23 instance = new lifted23();

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      Fail374:
      { 
        term = or_2_0.instance.invoke(context, term, lifted24.instance, lifted25.instance);
        if(term == null)
          break Fail374;
        if(true)
          return term;
      }
      return null;
    }
  }

  @SuppressWarnings("all") private static final class lifted25 extends Strategy 
  { 
    public static final lifted25 instance = new lifted25();

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      Fail375:
      { 
        if(term.getTermType() != IStrategoTerm.APPL || transform._consLtEq_2 != ((IStrategoAppl)term).getConstructor())
          break Fail375;
        if(true)
          return term;
      }
      return null;
    }
  }

  @SuppressWarnings("all") private static final class lifted24 extends Strategy 
  { 
    public static final lifted24 instance = new lifted24();

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      Fail376:
      { 
        if(term.getTermType() != IStrategoTerm.APPL || transform._consLt_2 != ((IStrategoAppl)term).getConstructor())
          break Fail376;
        if(true)
          return term;
      }
      return null;
    }
  }

  @SuppressWarnings("all") private static final class lifted22 extends Strategy 
  { 
    TermReference f_11;

    TermReference z_10;

    TermReference a_11;

    TermReference b_11;

    TermReference c_11;

    TermReference d_11;

    TermReference e_11;

    TermReference g_11;

    TermReference h_11;

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      Fail377:
      { 
        IStrategoTerm y_15 = null;
        y_15 = term;
        if(f_11.value == null)
          break Fail377;
        term = cast_bounded_conditional_type_0_0.instance.invoke(context, f_11.value);
        if(term == null)
          break Fail377;
        term = add_external_impl_0_9.instance.invokeDynamic(context, y_15, NO_STRATEGIES, new IStrategoTerm[]{z_10.value, a_11.value, b_11.value, c_11.value, d_11.value, e_11.value, term, g_11.value, h_11.value});
        if(term == null)
          break Fail377;
        if(true)
          return term;
      }
      return null;
    }
  }

  @SuppressWarnings("all") private static final class lifted21 extends Strategy 
  { 
    TermReference v_11;

    TermReference w_11;

    TermReference f_11;

    TermReference z_10;

    TermReference a_11;

    TermReference b_11;

    TermReference c_11;

    TermReference d_11;

    TermReference e_11;

    TermReference g_11;

    TermReference h_11;

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      ITermFactory termFactory = context.getFactory();
      Fail378:
      { 
        IStrategoTerm w_15 = null;
        w_15 = term;
        if(v_11.value == null || w_11.value == null)
          break Fail378;
        term = termFactory.makeTuple(v_11.value, w_11.value);
        term = try_to_get_type_0_3.instance.invoke(context, term, f_11.value, z_10.value, a_11.value);
        if(term == null)
          break Fail378;
        term = cast_conditional_type_0_0.instance.invoke(context, term);
        if(term == null)
          break Fail378;
        term = add_external_impl_0_9.instance.invokeDynamic(context, w_15, NO_STRATEGIES, new IStrategoTerm[]{z_10.value, a_11.value, b_11.value, c_11.value, d_11.value, e_11.value, term, g_11.value, h_11.value});
        if(term == null)
          break Fail378;
        if(true)
          return term;
      }
      return null;
    }
  }

  @SuppressWarnings("all") private static final class lifted20 extends Strategy 
  { 
    TermReference v_11;

    TermReference w_11;

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      Fail379:
      { 
        if(term.getTermType() != IStrategoTerm.APPL || transform._consAnd_2 != ((IStrategoAppl)term).getConstructor())
          break Fail379;
        if(v_11.value == null)
          v_11.value = term.getSubterm(0);
        else
          if(v_11.value != term.getSubterm(0) && !v_11.value.match(term.getSubterm(0)))
            break Fail379;
        if(w_11.value == null)
          w_11.value = term.getSubterm(1);
        else
          if(w_11.value != term.getSubterm(1) && !w_11.value.match(term.getSubterm(1)))
            break Fail379;
        if(true)
          return term;
      }
      return null;
    }
  }

  @SuppressWarnings("all") private static final class lifted17 extends Strategy 
  { 
    TermReference v_11;

    TermReference w_11;

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      Fail380:
      { 
        lifted19 lifted190 = new lifted19();
        lifted18 lifted180 = new lifted18();
        lifted190.v_11 = v_11;
        lifted190.w_11 = w_11;
        lifted180.v_11 = v_11;
        lifted180.w_11 = w_11;
        term = or_2_0.instance.invoke(context, term, lifted180, lifted190);
        if(term == null)
          break Fail380;
        if(true)
          return term;
      }
      return null;
    }
  }

  @SuppressWarnings("all") private static final class lifted19 extends Strategy 
  { 
    TermReference v_11;

    TermReference w_11;

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      Fail381:
      { 
        if(term.getTermType() != IStrategoTerm.APPL || transform._consExcOr_2 != ((IStrategoAppl)term).getConstructor())
          break Fail381;
        if(v_11.value == null)
          v_11.value = term.getSubterm(0);
        else
          if(v_11.value != term.getSubterm(0) && !v_11.value.match(term.getSubterm(0)))
            break Fail381;
        if(w_11.value == null)
          w_11.value = term.getSubterm(1);
        else
          if(w_11.value != term.getSubterm(1) && !w_11.value.match(term.getSubterm(1)))
            break Fail381;
        if(true)
          return term;
      }
      return null;
    }
  }

  @SuppressWarnings("all") private static final class lifted18 extends Strategy 
  { 
    TermReference v_11;

    TermReference w_11;

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      Fail382:
      { 
        if(term.getTermType() != IStrategoTerm.APPL || transform._consOr_2 != ((IStrategoAppl)term).getConstructor())
          break Fail382;
        if(v_11.value == null)
          v_11.value = term.getSubterm(0);
        else
          if(v_11.value != term.getSubterm(0) && !v_11.value.match(term.getSubterm(0)))
            break Fail382;
        if(w_11.value == null)
          w_11.value = term.getSubterm(1);
        else
          if(w_11.value != term.getSubterm(1) && !w_11.value.match(term.getSubterm(1)))
            break Fail382;
        if(true)
          return term;
      }
      return null;
    }
  }

  @SuppressWarnings("all") private static final class lifted16 extends Strategy 
  { 
    TermReference v_11;

    TermReference w_11;

    TermReference z_10;

    TermReference a_11;

    TermReference b_11;

    TermReference c_11;

    TermReference d_11;

    TermReference e_11;

    TermReference g_11;

    TermReference h_11;

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      ITermFactory termFactory = context.getFactory();
      Fail383:
      { 
        IStrategoTerm r_15 = null;
        IStrategoTerm t_15 = null;
        r_15 = term;
        if(v_11.value == null || w_11.value == null)
          break Fail383;
        term = termFactory.makeTuple(v_11.value, w_11.value);
        t_15 = term;
        term = try_to_get_type_0_3.instance.invoke(context, t_15, transform.constNone0, z_10.value, a_11.value);
        if(term == null)
          break Fail383;
        term = cast_equality_type_0_0.instance.invoke(context, term);
        if(term == null)
          break Fail383;
        term = add_external_impl_0_9.instance.invokeDynamic(context, r_15, NO_STRATEGIES, new IStrategoTerm[]{z_10.value, a_11.value, b_11.value, c_11.value, d_11.value, e_11.value, term, g_11.value, h_11.value});
        if(term == null)
          break Fail383;
        if(true)
          return term;
      }
      return null;
    }
  }

  @SuppressWarnings("all") private static final class lifted15 extends Strategy 
  { 
    TermReference v_11;

    TermReference w_11;

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      Fail384:
      { 
        if(term.getTermType() != IStrategoTerm.APPL || transform._consNotEq_2 != ((IStrategoAppl)term).getConstructor())
          break Fail384;
        if(v_11.value == null)
          v_11.value = term.getSubterm(0);
        else
          if(v_11.value != term.getSubterm(0) && !v_11.value.match(term.getSubterm(0)))
            break Fail384;
        if(w_11.value == null)
          w_11.value = term.getSubterm(1);
        else
          if(w_11.value != term.getSubterm(1) && !w_11.value.match(term.getSubterm(1)))
            break Fail384;
        if(true)
          return term;
      }
      return null;
    }
  }

  @SuppressWarnings("all") private static final class lifted14 extends Strategy 
  { 
    TermReference v_11;

    TermReference w_11;

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      Fail385:
      { 
        if(term.getTermType() != IStrategoTerm.APPL || transform._consEq_2 != ((IStrategoAppl)term).getConstructor())
          break Fail385;
        if(v_11.value == null)
          v_11.value = term.getSubterm(0);
        else
          if(v_11.value != term.getSubterm(0) && !v_11.value.match(term.getSubterm(0)))
            break Fail385;
        if(w_11.value == null)
          w_11.value = term.getSubterm(1);
        else
          if(w_11.value != term.getSubterm(1) && !w_11.value.match(term.getSubterm(1)))
            break Fail385;
        if(true)
          return term;
      }
      return null;
    }
  }

  @SuppressWarnings("all") private static final class lifted13 extends Strategy 
  { 
    TermReference z_10;

    TermReference a_11;

    TermReference b_11;

    TermReference c_11;

    TermReference d_11;

    TermReference e_11;

    TermReference d_12;

    TermReference g_11;

    TermReference h_11;

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      Fail386:
      { 
        term = add_external_impl_0_9.instance.invokeDynamic(context, term, NO_STRATEGIES, new IStrategoTerm[]{z_10.value, a_11.value, b_11.value, c_11.value, d_11.value, e_11.value, d_12.value, g_11.value, h_11.value});
        if(term == null)
          break Fail386;
        if(true)
          return term;
      }
      return null;
    }
  }

  @SuppressWarnings("all") private static final class lifted12 extends Strategy 
  { 
    TermReference d_12;

    TermReference o_11;

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      Fail387:
      { 
        if(term.getTermType() != IStrategoTerm.APPL || transform._consLocalVarDec_3 != ((IStrategoAppl)term).getConstructor())
          break Fail387;
        if(d_12.value == null)
          d_12.value = term.getSubterm(1);
        else
          if(d_12.value != term.getSubterm(1) && !d_12.value.match(term.getSubterm(1)))
            break Fail387;
        if(o_11.value == null)
          o_11.value = term.getSubterm(2);
        else
          if(o_11.value != term.getSubterm(2) && !o_11.value.match(term.getSubterm(2)))
            break Fail387;
        if(true)
          return term;
      }
      return null;
    }
  }

  @SuppressWarnings("all") private static final class lifted11 extends Strategy 
  { 
    TermReference d_12;

    TermReference o_11;

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      Fail388:
      { 
        if(term.getTermType() != IStrategoTerm.APPL || transform._consFieldDec_3 != ((IStrategoAppl)term).getConstructor())
          break Fail388;
        if(d_12.value == null)
          d_12.value = term.getSubterm(1);
        else
          if(d_12.value != term.getSubterm(1) && !d_12.value.match(term.getSubterm(1)))
            break Fail388;
        if(o_11.value == null)
          o_11.value = term.getSubterm(2);
        else
          if(o_11.value != term.getSubterm(2) && !o_11.value.match(term.getSubterm(2)))
            break Fail388;
        if(true)
          return term;
      }
      return null;
    }
  }

  @SuppressWarnings("all") private static final class lifted10 extends Strategy 
  { 
    TermReference z_10;

    TermReference a_11;

    TermReference b_11;

    TermReference c_11;

    TermReference d_11;

    TermReference e_11;

    TermReference f_11;

    TermReference g_11;

    TermReference h_11;

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      Fail389:
      { 
        term = add_external_impl_0_9.instance.invokeDynamic(context, term, NO_STRATEGIES, new IStrategoTerm[]{z_10.value, a_11.value, b_11.value, c_11.value, d_11.value, e_11.value, f_11.value, g_11.value, h_11.value});
        if(term == null)
          break Fail389;
        if(true)
          return term;
      }
      return null;
    }
  }

  @SuppressWarnings("all") private static final class lifted9 extends Strategy 
  { 
    public static final lifted9 instance = new lifted9();

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      Fail390:
      { 
        if(term.getTermType() != IStrategoTerm.APPL || transform._consExprName_2 != ((IStrategoAppl)term).getConstructor())
          break Fail390;
        if(true)
          return term;
      }
      return null;
    }
  }

  @SuppressWarnings("all") private static final class lifted8 extends Strategy 
  { 
    public static final lifted8 instance = new lifted8();

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      Fail391:
      { 
        if(term.getTermType() != IStrategoTerm.APPL || transform._consExprName_1 != ((IStrategoAppl)term).getConstructor())
          break Fail391;
        if(true)
          return term;
      }
      return null;
    }
  }

  @SuppressWarnings("all") private static final class lifted7 extends Strategy 
  { 
    TermReference z_10;

    TermReference l_11;

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      Fail392:
      { 
        term = decreament_0_2.instance.invoke(context, term, z_10.value, l_11.value);
        if(term == null)
          break Fail392;
        if(true)
          return term;
      }
      return null;
    }
  }

  @SuppressWarnings("all") private static final class lifted6 extends Strategy 
  { 
    TermReference z_10;

    TermReference a_11;

    TermReference b_11;

    TermReference l_11;

    TermReference d_11;

    TermReference e_11;

    TermReference f_11;

    TermReference j_11;

    TermReference h_11;

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      Fail393:
      { 
        term = add_external_impl_0_9.instance.invokeDynamic(context, term, NO_STRATEGIES, new IStrategoTerm[]{z_10.value, a_11.value, b_11.value, l_11.value, d_11.value, e_11.value, f_11.value, j_11.value, h_11.value});
        if(term == null)
          break Fail393;
        if(true)
          return term;
      }
      return null;
    }
  }

  @SuppressWarnings("all") private static final class lifted4 extends Strategy 
  { 
    TermReference z_10;

    TermReference l_11;

    TermReference a_11;

    TermReference f_11;

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      Fail394:
      { 
        lifted5 lifted510 = new lifted5();
        lifted510.z_10 = z_10;
        lifted510.l_11 = l_11;
        lifted510.a_11 = a_11;
        lifted510.f_11 = f_11;
        term = try_1_0.instance.invoke(context, term, lifted510);
        if(term == null)
          break Fail394;
        if(true)
          return term;
      }
      return null;
    }
  }

  @SuppressWarnings("all") private static final class lifted5 extends Strategy 
  { 
    TermReference z_10;

    TermReference l_11;

    TermReference a_11;

    TermReference f_11;

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      Fail395:
      { 
        term = add__params_0_4.instance.invoke(context, term, z_10.value, l_11.value, a_11.value, f_11.value);
        if(term == null)
          break Fail395;
        if(true)
          return term;
      }
      return null;
    }
  }

  @SuppressWarnings("all") private static final class lifted3 extends Strategy 
  { 
    TermReference z_10;

    TermReference l_11;

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      Fail396:
      { 
        term = decreament_0_2.instance.invoke(context, term, z_10.value, l_11.value);
        if(term == null)
          break Fail396;
        if(true)
          return term;
      }
      return null;
    }
  }

  @SuppressWarnings("all") private static final class lifted2 extends Strategy 
  { 
    TermReference z_10;

    TermReference a_11;

    TermReference b_11;

    TermReference l_11;

    TermReference d_11;

    TermReference e_11;

    TermReference f_11;

    TermReference g_11;

    TermReference h_11;

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      Fail397:
      { 
        term = add_external_impl_0_9.instance.invokeDynamic(context, term, NO_STRATEGIES, new IStrategoTerm[]{z_10.value, a_11.value, b_11.value, l_11.value, d_11.value, e_11.value, f_11.value, g_11.value, h_11.value});
        if(term == null)
          break Fail397;
        if(true)
          return term;
      }
      return null;
    }
  }

  @SuppressWarnings("all") private static final class lifted0 extends Strategy 
  { 
    TermReference e_9;

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      Fail398:
      { 
        lifted1 lifted133 = new lifted1();
        lifted133.e_9 = e_9;
        term = try_1_0.instance.invoke(context, term, lifted133);
        if(term == null)
          break Fail398;
        if(true)
          return term;
      }
      return null;
    }
  }

  @SuppressWarnings("all") private static final class lifted1 extends Strategy 
  { 
    TermReference e_9;

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      ITermFactory termFactory = context.getFactory();
      Fail399:
      { 
        IStrategoTerm f_9 = null;
        if(term.getTermType() != IStrategoTerm.APPL || transform._consClassBody_1 != ((IStrategoAppl)term).getConstructor())
          break Fail399;
        f_9 = term.getSubterm(0);
        if(e_9.value == null)
          break Fail399;
        term = iset_elements_0_0.instance.invoke(context, e_9.value);
        if(term == null)
          break Fail399;
        term = termFactory.makeTuple(f_9, term);
        term = conc_0_0.instance.invoke(context, term);
        if(term == null)
          break Fail399;
        term = termFactory.makeAppl(transform._consClassBody_1, new IStrategoTerm[]{term});
        if(true)
          return term;
      }
      return null;
    }
  }

  public static void registerInterop(org.spoofax.interpreter.core.IContext context, Context compiledContext)
  { 
    new InteropRegisterer().registerLazy(context, compiledContext, InteropRegisterer.class.getClassLoader());
  }

  @SuppressWarnings("unused") public static class InteropRegisterer extends org.strategoxt.lang.InteropRegisterer 
  { 
    @Override public void register(org.spoofax.interpreter.core.IContext context, Context compiledContext)
    { 
      register(context, compiledContext, context.getVarScope());
    }

    @Override public void registerLazy(org.spoofax.interpreter.core.IContext context, Context compiledContext, ClassLoader classLoader)
    { 
      registerLazy(context, compiledContext, classLoader, context.getVarScope());
    }

    private void register(org.spoofax.interpreter.core.IContext context, Context compiledContext, org.spoofax.interpreter.core.VarScope varScope)
    { 
      compiledContext.registerComponent("transform");
      transform.init(compiledContext);
      varScope.addSVar("fetch__full__class__name_0_0", new InteropSDefT(fetch__full__class__name_0_0.instance, context));
      varScope.addSVar("pp_type_0_0", new InteropSDefT(pp_type_0_0.instance, context));
      varScope.addSVar("add__externals_0_1", new InteropSDefT(add__externals_0_1.instance, context));
      varScope.addSVar("add_external_impl_0_2", new InteropSDefT(add_external_impl_0_2.instance, context));
      varScope.addSVar("add_external_impl_0_9", new InteropSDefT(add_external_impl_0_9.instance, context));
      varScope.addSVar("is__on__entry__or__on__exit__method_0_0", new InteropSDefT(is__on__entry__or__on__exit__method_0_0.instance, context));
      varScope.addSVar("add__params_0_4", new InteropSDefT(add__params_0_4.instance, context));
      varScope.addSVar("add__var_0_5", new InteropSDefT(add__var_0_5.instance, context));
      varScope.addSVar("try_to_get_type_0_3", new InteropSDefT(try_to_get_type_0_3.instance, context));
      varScope.addSVar("cast_equality_type_0_0", new InteropSDefT(cast_equality_type_0_0.instance, context));
      varScope.addSVar("cast_bounded_conditional_type_0_0", new InteropSDefT(cast_bounded_conditional_type_0_0.instance, context));
      varScope.addSVar("cast_shift_type_0_0", new InteropSDefT(cast_shift_type_0_0.instance, context));
      varScope.addSVar("cast_bounded_arithmetic_type_0_0", new InteropSDefT(cast_bounded_arithmetic_type_0_0.instance, context));
      varScope.addSVar("cast_conditional_type_0_0", new InteropSDefT(cast_conditional_type_0_0.instance, context));
      varScope.addSVar("ensure__number_0_0", new InteropSDefT(ensure__number_0_0.instance, context));
      varScope.addSVar("get_LHS_type_0_3", new InteropSDefT(get_$L$H$S_type_0_3.instance, context));
      varScope.addSVar("get_type_of_0_3", new InteropSDefT(get_type_of_0_3.instance, context));
      varScope.addSVar("handle_expr_0_7", new InteropSDefT(handle_expr_0_7.instance, context));
      varScope.addSVar("generate_invoke_ref_0_1", new InteropSDefT(generate_invoke_ref_0_1.instance, context));
      varScope.addSVar("generate_ref_method__name_0_2", new InteropSDefT(generate_ref_method__name_0_2.instance, context));
      varScope.addSVar("increament_0_2", new InteropSDefT(increament_0_2.instance, context));
      varScope.addSVar("decreament_0_2", new InteropSDefT(decreament_0_2.instance, context));
      varScope.addSVar("create_ref_method_0_4", new InteropSDefT(create_ref_method_0_4.instance, context));
      varScope.addSVar("get_expr_type_0_3", new InteropSDefT(get_expr_type_0_3.instance, context));
      varScope.addSVar("type_of_0_3", new InteropSDefT(type_of_0_3.instance, context));
      varScope.addSVar("fetch_0_0", new InteropSDefT(fetch_0_0.instance, context));
      varScope.addSVar("main_0_0", new InteropSDefT(main_0_0.instance, context));
      varScope.addSVar("handle_io_0_0", new InteropSDefT(handle_io_0_0.instance, context));
      varScope.addSVar("transform_0_0", new InteropSDefT(transform_0_0.instance, context));
      varScope.addSVar("gen_isRunByOthers_method_0_0", new InteropSDefT(gen_is$Run$By$Others_method_0_0.instance, context));
      varScope.addSVar("gen_method_state_0_1", new InteropSDefT(gen_method_state_0_1.instance, context));
      varScope.addSVar("gen_method_state_name_0_1", new InteropSDefT(gen_method_state_name_0_1.instance, context));
      varScope.addSVar("gen_requires_method_name_0_1", new InteropSDefT(gen_requires_method_name_0_1.instance, context));
      varScope.addSVar("gen_on_entry_method_name_0_1", new InteropSDefT(gen_on_entry_method_name_0_1.instance, context));
      varScope.addSVar("gen_on_exit_method_name_0_1", new InteropSDefT(gen_on_exit_method_name_0_1.instance, context));
      varScope.addSVar("make_while_condition_0_1", new InteropSDefT(make_while_condition_0_1.instance, context));
      varScope.addSVar("gen_class_head_0_1", new InteropSDefT(gen_class_head_0_1.instance, context));
      varScope.addSVar("make_requires_method_0_3", new InteropSDefT(make_requires_method_0_3.instance, context));
      varScope.addSVar("gen_source_location_ann_0_1", new InteropSDefT(gen_source_location_ann_0_1.instance, context));
      varScope.addSVar("original_location_0_0", new InteropSDefT(original_location_0_0.instance, context));
      varScope.addSVar("original_start_line_0_0", new InteropSDefT(original_start_line_0_0.instance, context));
      varScope.addSVar("original_column_0_0", new InteropSDefT(original_column_0_0.instance, context));
      varScope.addSVar("original_end_line_0_0", new InteropSDefT(original_end_line_0_0.instance, context));
      varScope.addSVar("original_offset_0_0", new InteropSDefT(original_offset_0_0.instance, context));
      varScope.addSVar("make_on_entry_method_0_4", new InteropSDefT(make_on_entry_method_0_4.instance, context));
      varScope.addSVar("make_on_exit_method_0_4", new InteropSDefT(make_on_exit_method_0_4.instance, context));
      varScope.addSVar("convert_0_0", new InteropSDefT(convert_0_0.instance, context));
      varScope.addSVar("generate_imports_0_2", new InteropSDefT(generate_imports_0_2.instance, context));
      varScope.addSVar("get_coordinator_0_1", new InteropSDefT(get_coordinator_0_1.instance, context));
      varScope.addSVar("fetch_coordinator_type_0_0", new InteropSDefT(fetch_coordinator_type_0_0.instance, context));
      varScope.addSVar("convert_coordinator_declaration_0_1", new InteropSDefT(convert_coordinator_declaration_0_1.instance, context));
      varScope.addSVar("gen_coordinator_body_0_1", new InteropSDefT(gen_coordinator_body_0_1.instance, context));
      varScope.addSVar("make_lock_and_unlock_methods_0_10", new InteropSDefT(make_lock_and_unlock_methods_0_10.instance, context));
      varScope.addSVar("make_unlock_method_0_3", new InteropSDefT(make_unlock_method_0_3.instance, context));
      varScope.addSVar("make_lock_method_0_9", new InteropSDefT(make_lock_method_0_9.instance, context));
      varScope.addSVar("fillMethodMaps_0_4", new InteropSDefT(fill$Method$Maps_0_4.instance, context));
      varScope.addSVar("add_condition_fields_0_0", new InteropSDefT(add_condition_fields_0_0.instance, context));
      varScope.addSVar("add_coordinator_fields_0_0", new InteropSDefT(add_coordinator_fields_0_0.instance, context));
      varScope.addSVar("get_methods_list_0_0", new InteropSDefT(get_methods_list_0_0.instance, context));
    }

    private void registerLazy(org.spoofax.interpreter.core.IContext context, Context compiledContext, ClassLoader classLoader, org.spoofax.interpreter.core.VarScope varScope)
    { 
      compiledContext.registerComponent("transform");
      transform.init(compiledContext);
      varScope.addSVar("fetch__full__class__name_0_0", new InteropSDefT(classLoader, "transform$fetch__full__class__name_0_0", context));
      varScope.addSVar("pp_type_0_0", new InteropSDefT(classLoader, "transform$pp_type_0_0", context));
      varScope.addSVar("add__externals_0_1", new InteropSDefT(classLoader, "transform$add__externals_0_1", context));
      varScope.addSVar("add_external_impl_0_2", new InteropSDefT(classLoader, "transform$add_external_impl_0_2", context));
      varScope.addSVar("add_external_impl_0_9", new InteropSDefT(classLoader, "transform$add_external_impl_0_9", context));
      varScope.addSVar("is__on__entry__or__on__exit__method_0_0", new InteropSDefT(classLoader, "transform$is__on__entry__or__on__exit__method_0_0", context));
      varScope.addSVar("add__params_0_4", new InteropSDefT(classLoader, "transform$add__params_0_4", context));
      varScope.addSVar("add__var_0_5", new InteropSDefT(classLoader, "transform$add__var_0_5", context));
      varScope.addSVar("try_to_get_type_0_3", new InteropSDefT(classLoader, "transform$try_to_get_type_0_3", context));
      varScope.addSVar("cast_equality_type_0_0", new InteropSDefT(classLoader, "transform$cast_equality_type_0_0", context));
      varScope.addSVar("cast_bounded_conditional_type_0_0", new InteropSDefT(classLoader, "transform$cast_bounded_conditional_type_0_0", context));
      varScope.addSVar("cast_shift_type_0_0", new InteropSDefT(classLoader, "transform$cast_shift_type_0_0", context));
      varScope.addSVar("cast_bounded_arithmetic_type_0_0", new InteropSDefT(classLoader, "transform$cast_bounded_arithmetic_type_0_0", context));
      varScope.addSVar("cast_conditional_type_0_0", new InteropSDefT(classLoader, "transform$cast_conditional_type_0_0", context));
      varScope.addSVar("ensure__number_0_0", new InteropSDefT(classLoader, "transform$ensure__number_0_0", context));
      varScope.addSVar("get_LHS_type_0_3", new InteropSDefT(classLoader, "transform$get_$L$H$S_type_0_3", context));
      varScope.addSVar("get_type_of_0_3", new InteropSDefT(classLoader, "transform$get_type_of_0_3", context));
      varScope.addSVar("handle_expr_0_7", new InteropSDefT(classLoader, "transform$handle_expr_0_7", context));
      varScope.addSVar("generate_invoke_ref_0_1", new InteropSDefT(classLoader, "transform$generate_invoke_ref_0_1", context));
      varScope.addSVar("generate_ref_method__name_0_2", new InteropSDefT(classLoader, "transform$generate_ref_method__name_0_2", context));
      varScope.addSVar("increament_0_2", new InteropSDefT(classLoader, "transform$increament_0_2", context));
      varScope.addSVar("decreament_0_2", new InteropSDefT(classLoader, "transform$decreament_0_2", context));
      varScope.addSVar("create_ref_method_0_4", new InteropSDefT(classLoader, "transform$create_ref_method_0_4", context));
      varScope.addSVar("get_expr_type_0_3", new InteropSDefT(classLoader, "transform$get_expr_type_0_3", context));
      varScope.addSVar("type_of_0_3", new InteropSDefT(classLoader, "transform$type_of_0_3", context));
      varScope.addSVar("fetch_0_0", new InteropSDefT(classLoader, "transform$fetch_0_0", context));
      varScope.addSVar("main_0_0", new InteropSDefT(classLoader, "transform$main_0_0", context));
      varScope.addSVar("handle_io_0_0", new InteropSDefT(classLoader, "transform$handle_io_0_0", context));
      varScope.addSVar("transform_0_0", new InteropSDefT(classLoader, "transform$transform_0_0", context));
      varScope.addSVar("gen_isRunByOthers_method_0_0", new InteropSDefT(classLoader, "transform$gen_is$Run$By$Others_method_0_0", context));
      varScope.addSVar("gen_method_state_0_1", new InteropSDefT(classLoader, "transform$gen_method_state_0_1", context));
      varScope.addSVar("gen_method_state_name_0_1", new InteropSDefT(classLoader, "transform$gen_method_state_name_0_1", context));
      varScope.addSVar("gen_requires_method_name_0_1", new InteropSDefT(classLoader, "transform$gen_requires_method_name_0_1", context));
      varScope.addSVar("gen_on_entry_method_name_0_1", new InteropSDefT(classLoader, "transform$gen_on_entry_method_name_0_1", context));
      varScope.addSVar("gen_on_exit_method_name_0_1", new InteropSDefT(classLoader, "transform$gen_on_exit_method_name_0_1", context));
      varScope.addSVar("make_while_condition_0_1", new InteropSDefT(classLoader, "transform$make_while_condition_0_1", context));
      varScope.addSVar("gen_class_head_0_1", new InteropSDefT(classLoader, "transform$gen_class_head_0_1", context));
      varScope.addSVar("make_requires_method_0_3", new InteropSDefT(classLoader, "transform$make_requires_method_0_3", context));
      varScope.addSVar("gen_source_location_ann_0_1", new InteropSDefT(classLoader, "transform$gen_source_location_ann_0_1", context));
      varScope.addSVar("original_location_0_0", new InteropSDefT(classLoader, "transform$original_location_0_0", context));
      varScope.addSVar("original_start_line_0_0", new InteropSDefT(classLoader, "transform$original_start_line_0_0", context));
      varScope.addSVar("original_column_0_0", new InteropSDefT(classLoader, "transform$original_column_0_0", context));
      varScope.addSVar("original_end_line_0_0", new InteropSDefT(classLoader, "transform$original_end_line_0_0", context));
      varScope.addSVar("original_offset_0_0", new InteropSDefT(classLoader, "transform$original_offset_0_0", context));
      varScope.addSVar("make_on_entry_method_0_4", new InteropSDefT(classLoader, "transform$make_on_entry_method_0_4", context));
      varScope.addSVar("make_on_exit_method_0_4", new InteropSDefT(classLoader, "transform$make_on_exit_method_0_4", context));
      varScope.addSVar("convert_0_0", new InteropSDefT(classLoader, "transform$convert_0_0", context));
      varScope.addSVar("generate_imports_0_2", new InteropSDefT(classLoader, "transform$generate_imports_0_2", context));
      varScope.addSVar("get_coordinator_0_1", new InteropSDefT(classLoader, "transform$get_coordinator_0_1", context));
      varScope.addSVar("fetch_coordinator_type_0_0", new InteropSDefT(classLoader, "transform$fetch_coordinator_type_0_0", context));
      varScope.addSVar("convert_coordinator_declaration_0_1", new InteropSDefT(classLoader, "transform$convert_coordinator_declaration_0_1", context));
      varScope.addSVar("gen_coordinator_body_0_1", new InteropSDefT(classLoader, "transform$gen_coordinator_body_0_1", context));
      varScope.addSVar("make_lock_and_unlock_methods_0_10", new InteropSDefT(classLoader, "transform$make_lock_and_unlock_methods_0_10", context));
      varScope.addSVar("make_unlock_method_0_3", new InteropSDefT(classLoader, "transform$make_unlock_method_0_3", context));
      varScope.addSVar("make_lock_method_0_9", new InteropSDefT(classLoader, "transform$make_lock_method_0_9", context));
      varScope.addSVar("fillMethodMaps_0_4", new InteropSDefT(classLoader, "transform$fill$Method$Maps_0_4", context));
      varScope.addSVar("add_condition_fields_0_0", new InteropSDefT(classLoader, "transform$add_condition_fields_0_0", context));
      varScope.addSVar("add_coordinator_fields_0_0", new InteropSDefT(classLoader, "transform$add_coordinator_fields_0_0", context));
      varScope.addSVar("get_methods_list_0_0", new InteropSDefT(classLoader, "transform$get_methods_list_0_0", context));
    }
  }
}
