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

  protected static IStrategoTerm const70;

  protected static IStrategoTerm constMarkerAnno1;

  protected static IStrategoTerm constTypeName12;

  protected static IStrategoTerm constId34;

  protected static IStrategoTerm const69;

  protected static IStrategoTerm const68;

  protected static IStrategoTerm constCons26;

  protected static IStrategoTerm constCons25;

  protected static IStrategoTerm constMarkerAnno0;

  protected static IStrategoTerm constTypeName11;

  protected static IStrategoTerm constId33;

  protected static IStrategoTerm const67;

  protected static IStrategoTerm const66;

  protected static IStrategoTerm const65;

  protected static IStrategoTerm const64;

  protected static IStrategoTerm constId32;

  protected static IStrategoTerm const63;

  protected static IStrategoTerm constCons24;

  protected static IStrategoTerm constTry0;

  protected static IStrategoTerm constCons23;

  protected static IStrategoTerm constCatch0;

  protected static IStrategoTerm constBlock2;

  protected static IStrategoTerm constCons22;

  protected static IStrategoTerm constReturn1;

  protected static IStrategoTerm constParam1;

  protected static IStrategoTerm constId31;

  protected static IStrategoTerm const62;

  protected static IStrategoTerm constClassOrInterfaceType3;

  protected static IStrategoTerm constTypeName10;

  protected static IStrategoTerm constId30;

  protected static IStrategoTerm const61;

  protected static IStrategoTerm constBlock1;

  protected static IStrategoTerm constCons21;

  protected static IStrategoTerm constExprStm1;

  protected static IStrategoTerm constInvoke4;

  protected static IStrategoTerm constMethod5;

  protected static IStrategoTerm constMethodName5;

  protected static IStrategoTerm constId29;

  protected static IStrategoTerm const60;

  protected static IStrategoTerm constMethod4;

  protected static IStrategoTerm constMethodName4;

  protected static IStrategoTerm constTypeName9;

  protected static IStrategoTerm constId28;

  protected static IStrategoTerm const59;

  protected static IStrategoTerm const58;

  protected static IStrategoTerm const57;

  protected static IStrategoTerm constCons20;

  protected static IStrategoTerm constExprStm0;

  protected static IStrategoTerm constInvoke3;

  protected static IStrategoTerm constMethod3;

  protected static IStrategoTerm constMethodName3;

  protected static IStrategoTerm constId27;

  protected static IStrategoTerm const56;

  protected static IStrategoTerm constId26;

  protected static IStrategoTerm const55;

  protected static IStrategoTerm constTypeName8;

  protected static IStrategoTerm constId25;

  protected static IStrategoTerm const54;

  protected static IStrategoTerm constCons19;

  protected static IStrategoTerm constCons18;

  protected static IStrategoTerm constSynchronized0;

  protected static IStrategoTerm const53;

  protected static IStrategoTerm const52;

  protected static IStrategoTerm constCons17;

  protected static IStrategoTerm constTypeImportOnDemandDec1;

  protected static IStrategoTerm constPackageName1;

  protected static IStrategoTerm constCons16;

  protected static IStrategoTerm constId24;

  protected static IStrategoTerm const51;

  protected static IStrategoTerm constCons15;

  protected static IStrategoTerm constId23;

  protected static IStrategoTerm const50;

  protected static IStrategoTerm constCons14;

  protected static IStrategoTerm constTypeImportOnDemandDec0;

  protected static IStrategoTerm constPackageName0;

  protected static IStrategoTerm constCons13;

  protected static IStrategoTerm constId22;

  protected static IStrategoTerm constCons12;

  protected static IStrategoTerm constId21;

  protected static IStrategoTerm const49;

  protected static IStrategoTerm constTypeName7;

  protected static IStrategoTerm constId20;

  protected static IStrategoTerm const48;

  protected static IStrategoTerm constVoid0;

  protected static IStrategoTerm constTypeName6;

  protected static IStrategoTerm constId19;

  protected static IStrategoTerm const47;

  protected static IStrategoTerm constId18;

  protected static IStrategoTerm const46;

  protected static IStrategoTerm constElemValPair0;

  protected static IStrategoTerm constLit4;

  protected static IStrategoTerm constString0;

  protected static IStrategoTerm constId17;

  protected static IStrategoTerm const45;

  protected static IStrategoTerm constTypeName5;

  protected static IStrategoTerm constId16;

  protected static IStrategoTerm const44;

  protected static IStrategoTerm constId15;

  protected static IStrategoTerm const43;

  protected static IStrategoTerm constTypeName4;

  protected static IStrategoTerm constId14;

  protected static IStrategoTerm const42;

  protected static IStrategoTerm constCons11;

  protected static IStrategoTerm constPublic0;

  protected static IStrategoTerm const41;

  protected static IStrategoTerm const40;

  protected static IStrategoTerm const39;

  protected static IStrategoTerm constCons10;

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
    const38 = termFactory.makeString("State");
    constCons10 = (IStrategoTerm)termFactory.makeListCons(transform.const38, (IStrategoList)transform.constNil0);
    const39 = termFactory.makeString("requires_");
    const40 = termFactory.makeString("on_entry_");
    const41 = termFactory.makeString("on_exit_");
    constPublic0 = termFactory.makeAppl(transform._consPublic_0, NO_TERMS);
    constCons11 = (IStrategoTerm)termFactory.makeListCons(transform.constPublic0, (IStrategoList)transform.constNil0);
    const42 = termFactory.makeString("COOLAspect");
    constId14 = termFactory.makeAppl(transform._consId_1, new IStrategoTerm[]{transform.const42});
    constTypeName4 = termFactory.makeAppl(transform._consTypeName_1, new IStrategoTerm[]{transform.constId14});
    const43 = termFactory.makeString("className");
    constId15 = termFactory.makeAppl(transform._consId_1, new IStrategoTerm[]{transform.const43});
    const44 = termFactory.makeString("COOLRequires");
    constId16 = termFactory.makeAppl(transform._consId_1, new IStrategoTerm[]{transform.const44});
    constTypeName5 = termFactory.makeAppl(transform._consTypeName_1, new IStrategoTerm[]{transform.constId16});
    const45 = termFactory.makeString("parameterTypes");
    constId17 = termFactory.makeAppl(transform._consId_1, new IStrategoTerm[]{transform.const45});
    constString0 = termFactory.makeAppl(transform._consString_1, new IStrategoTerm[]{transform.constNil0});
    constLit4 = termFactory.makeAppl(transform._consLit_1, new IStrategoTerm[]{transform.constString0});
    constElemValPair0 = termFactory.makeAppl(transform._consElemValPair_2, new IStrategoTerm[]{transform.constId15, transform.constLit4});
    const46 = termFactory.makeString("methodName");
    constId18 = termFactory.makeAppl(transform._consId_1, new IStrategoTerm[]{transform.const46});
    const47 = termFactory.makeString("COOLOnEntry");
    constId19 = termFactory.makeAppl(transform._consId_1, new IStrategoTerm[]{transform.const47});
    constTypeName6 = termFactory.makeAppl(transform._consTypeName_1, new IStrategoTerm[]{transform.constId19});
    constVoid0 = termFactory.makeAppl(transform._consVoid_0, NO_TERMS);
    const48 = termFactory.makeString("COOLOnExit");
    constId20 = termFactory.makeAppl(transform._consId_1, new IStrategoTerm[]{transform.const48});
    constTypeName7 = termFactory.makeAppl(transform._consTypeName_1, new IStrategoTerm[]{transform.constId20});
    const49 = termFactory.makeString("util");
    constId21 = termFactory.makeAppl(transform._consId_1, new IStrategoTerm[]{transform.const49});
    constCons12 = (IStrategoTerm)termFactory.makeListCons(transform.constId21, (IStrategoList)transform.constNil0);
    constId22 = termFactory.makeAppl(transform._consId_1, new IStrategoTerm[]{transform.const27});
    constCons13 = (IStrategoTerm)termFactory.makeListCons(transform.constId22, (IStrategoList)transform.constCons12);
    constPackageName0 = termFactory.makeAppl(transform._consPackageName_1, new IStrategoTerm[]{transform.constCons13});
    constTypeImportOnDemandDec0 = termFactory.makeAppl(transform._consTypeImportOnDemandDec_1, new IStrategoTerm[]{transform.constPackageName0});
    constCons14 = (IStrategoTerm)termFactory.makeListCons(transform.constTypeImportOnDemandDec0, (IStrategoList)transform.constNil0);
    const50 = termFactory.makeString("runtime");
    constId23 = termFactory.makeAppl(transform._consId_1, new IStrategoTerm[]{transform.const50});
    constCons15 = (IStrategoTerm)termFactory.makeListCons(transform.constId23, (IStrategoList)transform.constNil0);
    const51 = termFactory.makeString("cool");
    constId24 = termFactory.makeAppl(transform._consId_1, new IStrategoTerm[]{transform.const51});
    constCons16 = (IStrategoTerm)termFactory.makeListCons(transform.constId24, (IStrategoList)transform.constCons15);
    constPackageName1 = termFactory.makeAppl(transform._consPackageName_1, new IStrategoTerm[]{transform.constCons16});
    constTypeImportOnDemandDec1 = termFactory.makeAppl(transform._consTypeImportOnDemandDec_1, new IStrategoTerm[]{transform.constPackageName1});
    constCons17 = (IStrategoTerm)termFactory.makeListCons(transform.constTypeImportOnDemandDec1, (IStrategoList)transform.constNil0);
    const52 = termFactory.makeString("Internal error: with clause failed unexpectedly in rule 'convert-coordinator-declaration'");
    const53 = termFactory.makeString("Internal error: with clause failed unexpectedly in rule 'gen-coordinator-body'");
    constSynchronized0 = termFactory.makeAppl(transform._consSynchronized_0, NO_TERMS);
    constCons18 = (IStrategoTerm)termFactory.makeListCons(transform.constSynchronized0, (IStrategoList)transform.constNil0);
    constCons19 = (IStrategoTerm)termFactory.makeListCons(transform.constPublic0, (IStrategoList)transform.constCons18);
    const54 = termFactory.makeString("COOLUnlock");
    constId25 = termFactory.makeAppl(transform._consId_1, new IStrategoTerm[]{transform.const54});
    constTypeName8 = termFactory.makeAppl(transform._consTypeName_1, new IStrategoTerm[]{transform.constId25});
    const55 = termFactory.makeString("remove");
    constId26 = termFactory.makeAppl(transform._consId_1, new IStrategoTerm[]{transform.const55});
    const56 = termFactory.makeString("notifyAll");
    constId27 = termFactory.makeAppl(transform._consId_1, new IStrategoTerm[]{transform.const56});
    constMethodName3 = termFactory.makeAppl(transform._consMethodName_1, new IStrategoTerm[]{transform.constId27});
    constMethod3 = termFactory.makeAppl(transform._consMethod_1, new IStrategoTerm[]{transform.constMethodName3});
    constInvoke3 = termFactory.makeAppl(transform._consInvoke_2, new IStrategoTerm[]{transform.constMethod3, transform.constNil0});
    constExprStm0 = termFactory.makeAppl(transform._consExprStm_1, new IStrategoTerm[]{transform.constInvoke3});
    constCons20 = (IStrategoTerm)termFactory.makeListCons(transform.constExprStm0, (IStrategoList)transform.constNil0);
    const57 = termFactory.makeString("Internal error: with clause failed unexpectedly in rule 'make-unlock-method'");
    const58 = termFactory.makeString("unlock_");
    const59 = termFactory.makeString("COOLLock");
    constId28 = termFactory.makeAppl(transform._consId_1, new IStrategoTerm[]{transform.const59});
    constTypeName9 = termFactory.makeAppl(transform._consTypeName_1, new IStrategoTerm[]{transform.constId28});
    constMethodName4 = termFactory.makeAppl(transform._consMethodName_1, new IStrategoTerm[]{transform.constId5});
    constMethod4 = termFactory.makeAppl(transform._consMethod_1, new IStrategoTerm[]{transform.constMethodName4});
    const60 = termFactory.makeString("wait");
    constId29 = termFactory.makeAppl(transform._consId_1, new IStrategoTerm[]{transform.const60});
    constMethodName5 = termFactory.makeAppl(transform._consMethodName_1, new IStrategoTerm[]{transform.constId29});
    constMethod5 = termFactory.makeAppl(transform._consMethod_1, new IStrategoTerm[]{transform.constMethodName5});
    constInvoke4 = termFactory.makeAppl(transform._consInvoke_2, new IStrategoTerm[]{transform.constMethod5, transform.constNil0});
    constExprStm1 = termFactory.makeAppl(transform._consExprStm_1, new IStrategoTerm[]{transform.constInvoke4});
    constCons21 = (IStrategoTerm)termFactory.makeListCons(transform.constExprStm1, (IStrategoList)transform.constNil0);
    constBlock1 = termFactory.makeAppl(transform._consBlock_1, new IStrategoTerm[]{transform.constCons21});
    const61 = termFactory.makeString("InterruptedException");
    constId30 = termFactory.makeAppl(transform._consId_1, new IStrategoTerm[]{transform.const61});
    constTypeName10 = termFactory.makeAppl(transform._consTypeName_1, new IStrategoTerm[]{transform.constId30});
    constClassOrInterfaceType3 = termFactory.makeAppl(transform._consClassOrInterfaceType_2, new IStrategoTerm[]{transform.constTypeName10, transform.constNone0});
    const62 = termFactory.makeString("e");
    constId31 = termFactory.makeAppl(transform._consId_1, new IStrategoTerm[]{transform.const62});
    constParam1 = termFactory.makeAppl(transform._consParam_3, new IStrategoTerm[]{transform.constNil0, transform.constClassOrInterfaceType3, transform.constId31});
    constReturn1 = termFactory.makeAppl(transform._consReturn_1, new IStrategoTerm[]{transform.constNone0});
    constCons22 = (IStrategoTerm)termFactory.makeListCons(transform.constReturn1, (IStrategoList)transform.constNil0);
    constBlock2 = termFactory.makeAppl(transform._consBlock_1, new IStrategoTerm[]{transform.constCons22});
    constCatch0 = termFactory.makeAppl(transform._consCatch_2, new IStrategoTerm[]{transform.constParam1, transform.constBlock2});
    constCons23 = (IStrategoTerm)termFactory.makeListCons(transform.constCatch0, (IStrategoList)transform.constNil0);
    constTry0 = termFactory.makeAppl(transform._consTry_2, new IStrategoTerm[]{transform.constBlock1, transform.constCons23});
    constCons24 = (IStrategoTerm)termFactory.makeListCons(transform.constTry0, (IStrategoList)transform.constNil0);
    const63 = termFactory.makeString("add");
    constId32 = termFactory.makeAppl(transform._consId_1, new IStrategoTerm[]{transform.const63});
    const64 = termFactory.makeString("Internal error: with clause failed unexpectedly in rule 'make-lock-method'");
    const65 = termFactory.makeString("lock_");
    const66 = termFactory.makeString("Internal error: with clause failed unexpectedly in rule 'fillMethodMaps'");
    const67 = termFactory.makeString("COOLConditionField");
    constId33 = termFactory.makeAppl(transform._consId_1, new IStrategoTerm[]{transform.const67});
    constTypeName11 = termFactory.makeAppl(transform._consTypeName_1, new IStrategoTerm[]{transform.constId33});
    constMarkerAnno0 = termFactory.makeAppl(transform._consMarkerAnno_1, new IStrategoTerm[]{transform.constTypeName11});
    constCons25 = (IStrategoTerm)termFactory.makeListCons(transform.constMarkerAnno0, (IStrategoList)transform.constNil0);
    constCons26 = (IStrategoTerm)termFactory.makeListCons(transform.constPrivate0, (IStrategoList)transform.constCons25);
    const68 = termFactory.makeString("Internal error: with clause failed unexpectedly in rule 'add-condition-fields'");
    const69 = termFactory.makeString("COOLCoordinatorField");
    constId34 = termFactory.makeAppl(transform._consId_1, new IStrategoTerm[]{transform.const69});
    constTypeName12 = termFactory.makeAppl(transform._consTypeName_1, new IStrategoTerm[]{transform.constId34});
    constMarkerAnno1 = termFactory.makeAppl(transform._consMarkerAnno_1, new IStrategoTerm[]{transform.constTypeName12});
    const70 = termFactory.makeString("Internal error: with clause failed unexpectedly in rule 'add-coordinator-fields'");
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
              IStrategoTerm r_7 = null;
              IStrategoTerm s_7 = null;
              r_7 = term.getSubterm(0);
              IStrategoTerm arg0 = term.getSubterm(1);
              if(arg0.getTermType() != IStrategoTerm.APPL || transform._consId_1 != ((IStrategoAppl)arg0).getConstructor())
                break Fail1;
              s_7 = arg0.getSubterm(0);
              term = this.invoke(context, r_7);
              if(term == null)
                break Fail1;
              term = (IStrategoTerm)termFactory.makeListCons(term, termFactory.makeListCons(transform.const0, termFactory.makeListCons(s_7, (IStrategoList)transform.constNil0)));
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
                IStrategoTerm q_7 = null;
                IStrategoTerm arg1 = term.getSubterm(0);
                if(arg1.getTermType() != IStrategoTerm.APPL || transform._consId_1 != ((IStrategoAppl)arg1).getConstructor())
                  break Fail2;
                q_7 = arg1.getSubterm(0);
                term = q_7;
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
                  IStrategoTerm p_7 = null;
                  IStrategoTerm arg2 = term.getSubterm(0);
                  if(arg2.getTermType() != IStrategoTerm.APPL || transform._consId_1 != ((IStrategoAppl)arg2).getConstructor())
                    break Fail3;
                  p_7 = arg2.getSubterm(0);
                  term = p_7;
                  if(true)
                    break Success2;
                }
                term = term0;
              }
              if(cons0 == transform._consPackageOrTypeName_2)
              { 
                IStrategoTerm l_7 = null;
                IStrategoTerm m_7 = null;
                l_7 = term.getSubterm(0);
                IStrategoTerm arg3 = term.getSubterm(1);
                if(arg3.getTermType() != IStrategoTerm.APPL || transform._consId_1 != ((IStrategoAppl)arg3).getConstructor())
                  break Fail0;
                m_7 = arg3.getSubterm(0);
                term = this.invoke(context, l_7);
                if(term == null)
                  break Fail0;
                term = (IStrategoTerm)termFactory.makeListCons(term, termFactory.makeListCons(transform.const0, termFactory.makeListCons(m_7, (IStrategoList)transform.constNil0)));
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
            IStrategoTerm k_8 = null;
            IStrategoTerm l_8 = null;
            IStrategoTerm m_8 = null;
            k_8 = term;
            m_8 = term;
            l_8 = k_8;
            term = m_8;
            IStrategoTerm term4 = term;
            Success4:
            { 
              Fail6:
              { 
                IStrategoTerm n_8 = null;
                n_8 = term;
                term = l_8;
                if(term.getTermType() != IStrategoTerm.APPL || transform._consByte_0 != ((IStrategoAppl)term).getConstructor())
                  break Fail6;
                term = n_8;
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
                  IStrategoTerm o_8 = null;
                  o_8 = term;
                  term = l_8;
                  if(term.getTermType() != IStrategoTerm.APPL || transform._consChar_0 != ((IStrategoAppl)term).getConstructor())
                    break Fail7;
                  term = o_8;
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
                    IStrategoTerm p_8 = null;
                    p_8 = term;
                    term = l_8;
                    if(term.getTermType() != IStrategoTerm.APPL || transform._consBoolean_0 != ((IStrategoAppl)term).getConstructor())
                      break Fail8;
                    term = p_8;
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
                      IStrategoTerm q_8 = null;
                      q_8 = term;
                      term = l_8;
                      if(term.getTermType() != IStrategoTerm.APPL || transform._consShort_0 != ((IStrategoAppl)term).getConstructor())
                        break Fail9;
                      term = q_8;
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
                        IStrategoTerm r_8 = null;
                        r_8 = term;
                        term = l_8;
                        if(term.getTermType() != IStrategoTerm.APPL || transform._consInt_0 != ((IStrategoAppl)term).getConstructor())
                          break Fail10;
                        term = r_8;
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
                          IStrategoTerm s_8 = null;
                          s_8 = term;
                          term = l_8;
                          if(term.getTermType() != IStrategoTerm.APPL || transform._consLong_0 != ((IStrategoAppl)term).getConstructor())
                            break Fail11;
                          term = s_8;
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
                            IStrategoTerm t_8 = null;
                            t_8 = term;
                            term = l_8;
                            if(term.getTermType() != IStrategoTerm.APPL || transform._consFloat_0 != ((IStrategoAppl)term).getConstructor())
                              break Fail12;
                            term = t_8;
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
                              IStrategoTerm u_8 = null;
                              u_8 = term;
                              term = l_8;
                              if(term.getTermType() != IStrategoTerm.APPL || transform._consDouble_0 != ((IStrategoAppl)term).getConstructor())
                                break Fail13;
                              term = u_8;
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
                IStrategoTerm g_8 = null;
                g_8 = term.getSubterm(0);
                term = this.invoke(context, g_8);
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
                  IStrategoTerm f_8 = null;
                  IStrategoTerm arg4 = term.getSubterm(0);
                  if(arg4.getTermType() != IStrategoTerm.APPL || transform._consTypeName_1 != ((IStrategoAppl)arg4).getConstructor())
                    break Fail15;
                  IStrategoTerm arg5 = arg4.getSubterm(0);
                  if(arg5.getTermType() != IStrategoTerm.APPL || transform._consId_1 != ((IStrategoAppl)arg5).getConstructor())
                    break Fail15;
                  f_8 = arg5.getSubterm(0);
                  term = f_8;
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
                    IStrategoTerm b_8 = null;
                    IStrategoTerm c_8 = null;
                    IStrategoTerm arg7 = term.getSubterm(0);
                    if(arg7.getTermType() != IStrategoTerm.APPL || transform._consTypeName_2 != ((IStrategoAppl)arg7).getConstructor())
                      break Fail16;
                    b_8 = arg7.getSubterm(0);
                    IStrategoTerm arg8 = arg7.getSubterm(1);
                    if(arg8.getTermType() != IStrategoTerm.APPL || transform._consId_1 != ((IStrategoAppl)arg8).getConstructor())
                      break Fail16;
                    c_8 = arg8.getSubterm(0);
                    term = this.invoke(context, b_8);
                    if(term == null)
                      break Fail16;
                    term = (IStrategoTerm)termFactory.makeListCons(term, termFactory.makeListCons(transform.const0, termFactory.makeListCons(c_8, (IStrategoList)transform.constNil0)));
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
                      IStrategoTerm a_8 = null;
                      IStrategoTerm arg10 = term.getSubterm(0);
                      if(arg10.getTermType() != IStrategoTerm.APPL || transform._consId_1 != ((IStrategoAppl)arg10).getConstructor())
                        break Fail17;
                      a_8 = arg10.getSubterm(0);
                      term = a_8;
                      if(true)
                        break Success15;
                    }
                    term = term12;
                  }
                  if(cons1 == transform._consPackageOrTypeName_2)
                  { 
                    IStrategoTerm v_7 = null;
                    IStrategoTerm w_7 = null;
                    v_7 = term.getSubterm(0);
                    IStrategoTerm arg11 = term.getSubterm(1);
                    if(arg11.getTermType() != IStrategoTerm.APPL || transform._consId_1 != ((IStrategoAppl)arg11).getConstructor())
                      break Fail4;
                    w_7 = arg11.getSubterm(0);
                    term = this.invoke(context, v_7);
                    if(term == null)
                      break Fail4;
                    term = (IStrategoTerm)termFactory.makeListCons(term, termFactory.makeListCons(transform.const0, termFactory.makeListCons(w_7, (IStrategoList)transform.constNil0)));
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

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm y_8)
    { 
      context.push("add__externals_0_1");
      Fail18:
      { 
        IStrategoTerm z_8 = null;
        TermReference d_9 = new TermReference();
        z_8 = term;
        term = new_iset_0_0.instance.invoke(context, term);
        if(term == null)
          break Fail18;
        if(d_9.value == null)
          d_9.value = term;
        else
          if(d_9.value != term && !d_9.value.match(term))
            break Fail18;
        term = add_external_impl_0_2.instance.invoke(context, z_8, d_9.value, y_8);
        if(term == null)
          break Fail18;
        lifted0 lifted00 = new lifted0();
        lifted00.d_9 = d_9;
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

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm p_9, IStrategoTerm r_9)
    { 
      context.push("add_external_impl_0_2");
      Fail19:
      { 
        IStrategoTerm s_9 = null;
        IStrategoTerm v_9 = null;
        IStrategoTerm w_9 = null;
        IStrategoTerm x_9 = null;
        IStrategoTerm y_9 = null;
        IStrategoTerm m_10 = null;
        IStrategoTerm n_10 = null;
        IStrategoTerm t_10 = null;
        IStrategoTerm w_10 = null;
        IStrategoTerm x_10 = null;
        s_9 = term;
        term = new_hashtable_0_0.instance.invoke(context, term);
        if(term == null)
          break Fail19;
        v_9 = term;
        term = new_hashtable_0_0.instance.invoke(context, term);
        if(term == null)
          break Fail19;
        x_9 = term;
        term = new_hashtable_0_0.instance.invoke(context, term);
        if(term == null)
          break Fail19;
        y_9 = term;
        term = new_iset_0_0.instance.invoke(context, term);
        if(term == null)
          break Fail19;
        w_9 = term;
        term = s_9;
        t_10 = s_9;
        term = new_hashtable_0_0.instance.invoke(context, term);
        if(term == null)
          break Fail19;
        m_10 = term;
        w_10 = t_10;
        n_10 = transform.constNone0;
        x_10 = w_10;
        term = add_external_impl_0_9.instance.invokeDynamic(context, x_10, NO_STRATEGIES, new IStrategoTerm[]{v_9, m_10, w_9, x_9, p_9, y_9, n_10, transform.constFalse0, r_9});
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

    public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm ref_y_10, IStrategoTerm ref_z_10, IStrategoTerm ref_a_11, IStrategoTerm ref_b_11, IStrategoTerm ref_c_11, IStrategoTerm ref_d_11, IStrategoTerm ref_e_11, IStrategoTerm ref_f_11, IStrategoTerm ref_g_11)
    { 
      ITermFactory termFactory = context.getFactory();
      TermReference y_10 = new TermReference(ref_y_10);
      TermReference z_10 = new TermReference(ref_z_10);
      TermReference a_11 = new TermReference(ref_a_11);
      TermReference b_11 = new TermReference(ref_b_11);
      TermReference c_11 = new TermReference(ref_c_11);
      TermReference d_11 = new TermReference(ref_d_11);
      TermReference e_11 = new TermReference(ref_e_11);
      TermReference f_11 = new TermReference(ref_f_11);
      TermReference g_11 = new TermReference(ref_g_11);
      context.push("add_external_impl_0_9");
      Fail20:
      { 
        IStrategoTerm h_11 = null;
        TermReference i_11 = new TermReference();
        IStrategoTerm j_11 = null;
        TermReference k_11 = new TermReference();
        IStrategoTerm l_11 = null;
        IStrategoTerm m_11 = null;
        TermReference n_11 = new TermReference();
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
        IStrategoTerm g_12 = null;
        if(e_12.value == null)
          e_12.value = term;
        else
          if(e_12.value != term && !e_12.value.match(term))
            break Fail20;
        g_12 = term;
        if(f_12.value == null)
          f_12.value = term;
        else
          if(f_12.value != term && !f_12.value.match(term))
            break Fail20;
        term = g_12;
        IStrategoTerm term16 = term;
        Success16:
        { 
          Fail21:
          { 
            IStrategoTerm h_12 = null;
            h_12 = term;
            if(f_12.value == null)
              break Fail21;
            term = f_12.value;
            if(term.getTermType() != IStrategoTerm.APPL || transform._consBlock_1 != ((IStrategoAppl)term).getConstructor())
              break Fail21;
            term = h_12;
            { 
              term = new_hashtable_0_0.instance.invoke(context, term);
              if(term == null)
                break Fail20;
              if(k_11.value == null)
                k_11.value = term;
              else
                if(k_11.value != term && !k_11.value.match(term))
                  break Fail20;
              if(e_12.value == null)
                break Fail20;
              term = e_12.value;
              lifted2 lifted210 = new lifted2();
              lifted210.y_10 = y_10;
              lifted210.z_10 = z_10;
              lifted210.a_11 = a_11;
              lifted210.k_11 = k_11;
              lifted210.c_11 = c_11;
              lifted210.d_11 = d_11;
              lifted210.e_11 = e_11;
              lifted210.f_11 = f_11;
              lifted210.g_11 = g_11;
              term = SRTS_all.instance.invoke(context, term, lifted210);
              if(term == null)
                break Fail20;
              l_11 = term;
              if(k_11.value == null)
                break Fail20;
              term = hashtable_keys_0_0.instance.invoke(context, k_11.value);
              if(term == null)
                break Fail20;
              lifted3 lifted310 = new lifted3();
              lifted310.y_10 = y_10;
              lifted310.k_11 = k_11;
              term = map_1_0.instance.invoke(context, term, lifted310);
              if(term == null)
                break Fail20;
              term = l_11;
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
              IStrategoTerm i_12 = null;
              i_12 = term;
              if(f_12.value == null)
                break Fail22;
              term = f_12.value;
              if(term.getTermType() != IStrategoTerm.APPL || transform._consMethodDec_2 != ((IStrategoAppl)term).getConstructor())
                break Fail22;
              h_11 = term.getSubterm(0);
              j_11 = term.getSubterm(1);
              term = i_12;
              { 
                term = new_hashtable_0_0.instance.invoke(context, term);
                if(term == null)
                  break Fail20;
                if(k_11.value == null)
                  k_11.value = term;
                else
                  if(k_11.value != term && !k_11.value.match(term))
                    break Fail20;
                Success18:
                { 
                  Fail23:
                  { 
                    IStrategoTerm j_12 = null;
                    j_12 = term;
                    term = is__on__entry__or__on__exit__method_0_0.instance.invoke(context, h_11);
                    if(term == null)
                      break Fail23;
                    term = j_12;
                    { 
                      term = transform.constTrue0;
                      if(i_11.value == null)
                        i_11.value = term;
                      else
                        if(i_11.value != term && !i_11.value.match(term))
                          break Fail20;
                      if(true)
                        break Success18;
                    }
                  }
                  term = transform.constFalse0;
                  if(i_11.value == null)
                    i_11.value = term;
                  else
                    if(i_11.value != term && !i_11.value.match(term))
                      break Fail20;
                }
                term = h_11;
                lifted4 lifted410 = new lifted4();
                lifted410.y_10 = y_10;
                lifted410.k_11 = k_11;
                lifted410.z_10 = z_10;
                lifted410.e_11 = e_11;
                term = topdown_1_0.instance.invoke(context, term, lifted410);
                if(term == null)
                  break Fail20;
                term = j_11;
                lifted6 lifted610 = new lifted6();
                lifted610.y_10 = y_10;
                lifted610.z_10 = z_10;
                lifted610.a_11 = a_11;
                lifted610.k_11 = k_11;
                lifted610.c_11 = c_11;
                lifted610.d_11 = d_11;
                lifted610.e_11 = e_11;
                lifted610.i_11 = i_11;
                lifted610.g_11 = g_11;
                term = SRTS_all.instance.invoke(context, term, lifted610);
                if(term == null)
                  break Fail20;
                term = termFactory.makeAppl(transform._consMethodDec_2, new IStrategoTerm[]{h_11, term});
                l_11 = term;
                if(k_11.value == null)
                  break Fail20;
                term = hashtable_keys_0_0.instance.invoke(context, k_11.value);
                if(term == null)
                  break Fail20;
                lifted7 lifted710 = new lifted7();
                lifted710.y_10 = y_10;
                lifted710.k_11 = k_11;
                term = map_1_0.instance.invoke(context, term, lifted710);
                if(term == null)
                  break Fail20;
                term = l_11;
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
                IStrategoTerm k_12 = null;
                k_12 = term;
                if(f_12.value == null)
                  break Fail24;
                term = or_2_0.instance.invoke(context, f_12.value, lifted8.instance, lifted9.instance);
                if(term == null)
                  break Fail24;
                term = k_12;
                { 
                  if(e_12.value == null)
                    break Fail20;
                  term = handle_expr_0_7.instance.invokeDynamic(context, e_12.value, NO_STRATEGIES, new IStrategoTerm[]{y_10.value, c_11.value, a_11.value, d_11.value, e_11.value, f_11.value, g_11.value});
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
                  IStrategoTerm l_12 = null;
                  l_12 = term;
                  if(f_12.value == null)
                    break Fail25;
                  term = f_12.value;
                  if(term.getTermType() != IStrategoTerm.APPL || transform._consVarDec_1 != ((IStrategoAppl)term).getConstructor())
                    break Fail25;
                  IStrategoTerm arg16 = term.getSubterm(0);
                  if(arg16.getTermType() != IStrategoTerm.APPL || transform._consId_1 != ((IStrategoAppl)arg16).getConstructor())
                    break Fail25;
                  m_11 = arg16.getSubterm(0);
                  term = l_12;
                  { 
                    term = add__var_0_5.instance.invoke(context, term, m_11, y_10.value, b_11.value, z_10.value, e_11.value);
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
                    IStrategoTerm m_12 = null;
                    m_12 = term;
                    if(f_12.value == null)
                      break Fail26;
                    term = f_12.value;
                    if(term.getTermType() != IStrategoTerm.APPL || transform._consVarDec_2 != ((IStrategoAppl)term).getConstructor())
                      break Fail26;
                    IStrategoTerm arg17 = term.getSubterm(0);
                    if(arg17.getTermType() != IStrategoTerm.APPL || transform._consId_1 != ((IStrategoAppl)arg17).getConstructor())
                      break Fail26;
                    m_11 = arg17.getSubterm(0);
                    if(d_12.value == null)
                      d_12.value = term.getSubterm(1);
                    else
                      if(d_12.value != term.getSubterm(1) && !d_12.value.match(term.getSubterm(1)))
                        break Fail26;
                    term = m_12;
                    { 
                      term = add__var_0_5.instance.invoke(context, term, m_11, y_10.value, b_11.value, z_10.value, e_11.value);
                      if(term == null)
                        break Fail20;
                      if(e_12.value == null)
                        break Fail20;
                      term = e_12.value;
                      lifted10 lifted1010 = new lifted10();
                      lifted1010.y_10 = y_10;
                      lifted1010.z_10 = z_10;
                      lifted1010.a_11 = a_11;
                      lifted1010.b_11 = b_11;
                      lifted1010.c_11 = c_11;
                      lifted1010.d_11 = d_11;
                      lifted1010.e_11 = e_11;
                      lifted1010.f_11 = f_11;
                      lifted1010.g_11 = g_11;
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
                      IStrategoTerm n_12 = null;
                      n_12 = term;
                      if(f_12.value == null)
                        break Fail27;
                      term = f_12.value;
                      lifted12 lifted1210 = new lifted12();
                      lifted11 lifted1110 = new lifted11();
                      lifted1210.c_12 = c_12;
                      lifted1210.n_11 = n_11;
                      lifted1110.c_12 = c_12;
                      lifted1110.n_11 = n_11;
                      term = or_2_0.instance.invoke(context, term, lifted1110, lifted1210);
                      if(term == null)
                        break Fail27;
                      term = n_12;
                      { 
                        if(e_12.value == null)
                          break Fail20;
                        term = e_12.value;
                        lifted13 lifted131 = new lifted13();
                        lifted131.y_10 = y_10;
                        lifted131.z_10 = z_10;
                        lifted131.a_11 = a_11;
                        lifted131.b_11 = b_11;
                        lifted131.c_11 = c_11;
                        lifted131.d_11 = d_11;
                        lifted131.c_12 = c_12;
                        lifted131.f_11 = f_11;
                        lifted131.g_11 = g_11;
                        term = SRTS_all.instance.invoke(context, term, lifted131);
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
                        IStrategoTerm o_12 = null;
                        o_12 = term;
                        if(f_12.value == null)
                          break Fail28;
                        term = f_12.value;
                        lifted15 lifted150 = new lifted15();
                        lifted14 lifted140 = new lifted14();
                        lifted150.u_11 = u_11;
                        lifted150.v_11 = v_11;
                        lifted140.u_11 = u_11;
                        lifted140.v_11 = v_11;
                        term = or_2_0.instance.invoke(context, term, lifted140, lifted150);
                        if(term == null)
                          break Fail28;
                        term = o_12;
                        { 
                          if(e_12.value == null)
                            break Fail20;
                          term = e_12.value;
                          lifted16 lifted160 = new lifted16();
                          lifted160.u_11 = u_11;
                          lifted160.v_11 = v_11;
                          lifted160.y_10 = y_10;
                          lifted160.z_10 = z_10;
                          lifted160.a_11 = a_11;
                          lifted160.b_11 = b_11;
                          lifted160.c_11 = c_11;
                          lifted160.d_11 = d_11;
                          lifted160.f_11 = f_11;
                          lifted160.g_11 = g_11;
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
                          IStrategoTerm p_12 = null;
                          p_12 = term;
                          if(f_12.value == null)
                            break Fail29;
                          term = f_12.value;
                          lifted20 lifted200 = new lifted20();
                          lifted17 lifted170 = new lifted17();
                          lifted200.u_11 = u_11;
                          lifted200.v_11 = v_11;
                          lifted170.u_11 = u_11;
                          lifted170.v_11 = v_11;
                          term = or_2_0.instance.invoke(context, term, lifted170, lifted200);
                          if(term == null)
                            break Fail29;
                          term = p_12;
                          { 
                            IStrategoTerm term25 = term;
                            Success25:
                            { 
                              Fail30:
                              { 
                                IStrategoTerm q_12 = null;
                                q_12 = term;
                                if(e_11.value == null)
                                  break Fail30;
                                term = termFactory.makeTuple(e_11.value, transform.constNone0);
                                term = equal_0_0.instance.invoke(context, term);
                                if(term == null)
                                  break Fail30;
                                term = q_12;
                                { 
                                  if(e_12.value == null)
                                    break Fail20;
                                  term = e_12.value;
                                  lifted21 lifted211 = new lifted21();
                                  lifted211.u_11 = u_11;
                                  lifted211.v_11 = v_11;
                                  lifted211.e_11 = e_11;
                                  lifted211.y_10 = y_10;
                                  lifted211.z_10 = z_10;
                                  lifted211.a_11 = a_11;
                                  lifted211.b_11 = b_11;
                                  lifted211.c_11 = c_11;
                                  lifted211.d_11 = d_11;
                                  lifted211.f_11 = f_11;
                                  lifted211.g_11 = g_11;
                                  term = SRTS_all.instance.invoke(context, term, lifted211);
                                  if(term == null)
                                    break Fail20;
                                  if(true)
                                    break Success25;
                                }
                              }
                              term = term25;
                              if(e_12.value == null)
                                break Fail20;
                              term = e_12.value;
                              lifted22 lifted220 = new lifted22();
                              lifted220.e_11 = e_11;
                              lifted220.y_10 = y_10;
                              lifted220.z_10 = z_10;
                              lifted220.a_11 = a_11;
                              lifted220.b_11 = b_11;
                              lifted220.c_11 = c_11;
                              lifted220.d_11 = d_11;
                              lifted220.f_11 = f_11;
                              lifted220.g_11 = g_11;
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
                            IStrategoTerm r_12 = null;
                            r_12 = term;
                            if(f_12.value == null)
                              break Fail31;
                            term = or_2_0.instance.invoke(context, f_12.value, lifted23.instance, lifted26.instance);
                            if(term == null)
                              break Fail31;
                            term = r_12;
                            { 
                              if(e_12.value == null)
                                break Fail20;
                              term = e_12.value;
                              lifted29 lifted290 = new lifted29();
                              lifted290.y_10 = y_10;
                              lifted290.z_10 = z_10;
                              lifted290.a_11 = a_11;
                              lifted290.b_11 = b_11;
                              lifted290.c_11 = c_11;
                              lifted290.d_11 = d_11;
                              lifted290.f_11 = f_11;
                              lifted290.g_11 = g_11;
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
                              IStrategoTerm s_12 = null;
                              s_12 = term;
                              if(f_12.value == null)
                                break Fail32;
                              term = f_12.value;
                              lifted37 lifted370 = new lifted37();
                              lifted30 lifted300 = new lifted30();
                              lifted370.u_11 = u_11;
                              lifted370.v_11 = v_11;
                              lifted300.u_11 = u_11;
                              lifted300.v_11 = v_11;
                              term = or_2_0.instance.invoke(context, term, lifted300, lifted370);
                              if(term == null)
                                break Fail32;
                              term = s_12;
                              { 
                                IStrategoTerm term28 = term;
                                Success28:
                                { 
                                  Fail33:
                                  { 
                                    IStrategoTerm t_12 = null;
                                    t_12 = term;
                                    if(e_11.value == null)
                                      break Fail33;
                                    term = termFactory.makeTuple(e_11.value, transform.constNone0);
                                    term = equal_0_0.instance.invoke(context, term);
                                    if(term == null)
                                      break Fail33;
                                    term = t_12;
                                    { 
                                      if(e_12.value == null)
                                        break Fail20;
                                      term = e_12.value;
                                      lifted38 lifted380 = new lifted38();
                                      lifted380.y_10 = y_10;
                                      lifted380.z_10 = z_10;
                                      lifted380.a_11 = a_11;
                                      lifted380.b_11 = b_11;
                                      lifted380.c_11 = c_11;
                                      lifted380.d_11 = d_11;
                                      lifted380.f_11 = f_11;
                                      lifted380.g_11 = g_11;
                                      term = SRTS_all.instance.invoke(context, term, lifted380);
                                      if(term == null)
                                        break Fail20;
                                      if(true)
                                        break Success28;
                                    }
                                  }
                                  term = term28;
                                  if(e_12.value == null)
                                    break Fail20;
                                  term = e_12.value;
                                  lifted39 lifted390 = new lifted39();
                                  lifted390.e_11 = e_11;
                                  lifted390.y_10 = y_10;
                                  lifted390.z_10 = z_10;
                                  lifted390.a_11 = a_11;
                                  lifted390.b_11 = b_11;
                                  lifted390.c_11 = c_11;
                                  lifted390.d_11 = d_11;
                                  lifted390.f_11 = f_11;
                                  lifted390.g_11 = g_11;
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
                                IStrategoTerm u_12 = null;
                                u_12 = term;
                                if(f_12.value == null)
                                  break Fail34;
                                term = f_12.value;
                                if(term.getTermType() != IStrategoTerm.APPL || transform._consLeftShift_2 != ((IStrategoAppl)term).getConstructor())
                                  break Fail34;
                                if(u_11.value == null)
                                  u_11.value = term.getSubterm(0);
                                else
                                  if(u_11.value != term.getSubterm(0) && !u_11.value.match(term.getSubterm(0)))
                                    break Fail34;
                                if(v_11.value == null)
                                  v_11.value = term.getSubterm(1);
                                else
                                  if(v_11.value != term.getSubterm(1) && !v_11.value.match(term.getSubterm(1)))
                                    break Fail34;
                                term = u_12;
                                { 
                                  IStrategoTerm g_16 = null;
                                  IStrategoTerm j_16 = null;
                                  IStrategoTerm p_16 = null;
                                  IStrategoTerm term30 = term;
                                  Success30:
                                  { 
                                    Fail35:
                                    { 
                                      IStrategoTerm v_12 = null;
                                      v_12 = term;
                                      if(e_11.value == null)
                                        break Fail35;
                                      term = termFactory.makeTuple(e_11.value, transform.constNone0);
                                      term = equal_0_0.instance.invoke(context, term);
                                      if(term == null)
                                        break Fail35;
                                      term = v_12;
                                      { 
                                        if(u_11.value == null)
                                          break Fail20;
                                        term = get_type_of_0_3.instance.invoke(context, u_11.value, e_11.value, y_10.value, z_10.value);
                                        if(term == null)
                                          break Fail20;
                                        term = cast_shift_type_0_0.instance.invoke(context, term);
                                        if(term == null)
                                          break Fail20;
                                        if(p_11.value == null)
                                          p_11.value = term;
                                        else
                                          if(p_11.value != term && !p_11.value.match(term))
                                            break Fail20;
                                        if(true)
                                          break Success30;
                                      }
                                    }
                                    term = term30;
                                    if(e_11.value == null)
                                      break Fail20;
                                    term = cast_shift_type_0_0.instance.invoke(context, e_11.value);
                                    if(term == null)
                                      break Fail20;
                                    if(p_11.value == null)
                                      p_11.value = term;
                                    else
                                      if(p_11.value != term && !p_11.value.match(term))
                                        break Fail20;
                                  }
                                  j_16 = term;
                                  if(u_11.value == null)
                                    break Fail20;
                                  term = this.invokeDynamic(context, u_11.value, NO_STRATEGIES, new IStrategoTerm[]{y_10.value, z_10.value, a_11.value, b_11.value, c_11.value, d_11.value, p_11.value, f_11.value, g_11.value});
                                  if(term == null)
                                    break Fail20;
                                  g_16 = term;
                                  term = j_16;
                                  if(v_11.value == null)
                                    break Fail20;
                                  p_16 = v_11.value;
                                  term = this.invokeDynamic(context, p_16, NO_STRATEGIES, new IStrategoTerm[]{y_10.value, z_10.value, a_11.value, b_11.value, c_11.value, d_11.value, transform.constLong0, f_11.value, g_11.value});
                                  if(term == null)
                                    break Fail20;
                                  term = termFactory.makeAppl(transform._consLeftShift_2, new IStrategoTerm[]{g_16, term});
                                  if(true)
                                    break Success29;
                                }
                              }
                              term = term29;
                              add_external_impl_0_9_fragment_1 add_external_impl_0_9_fragment_10 = new add_external_impl_0_9_fragment_1();
                              add_external_impl_0_9_fragment_10.o_11 = o_11;
                              add_external_impl_0_9_fragment_10.p_11 = p_11;
                              add_external_impl_0_9_fragment_10.r_11 = r_11;
                              add_external_impl_0_9_fragment_10.q_11 = q_11;
                              add_external_impl_0_9_fragment_10.s_11 = s_11;
                              add_external_impl_0_9_fragment_10.t_11 = t_11;
                              add_external_impl_0_9_fragment_10.u_11 = u_11;
                              add_external_impl_0_9_fragment_10.v_11 = v_11;
                              add_external_impl_0_9_fragment_10.w_11 = w_11;
                              add_external_impl_0_9_fragment_10.x_11 = x_11;
                              add_external_impl_0_9_fragment_10.y_11 = y_11;
                              add_external_impl_0_9_fragment_10.z_11 = z_11;
                              add_external_impl_0_9_fragment_10.a_12 = a_12;
                              add_external_impl_0_9_fragment_10.b_12 = b_12;
                              add_external_impl_0_9_fragment_10.f_12 = f_12;
                              add_external_impl_0_9_fragment_10.d_12 = d_12;
                              add_external_impl_0_9_fragment_10.c_12 = c_12;
                              add_external_impl_0_9_fragment_10.y_10 = y_10;
                              add_external_impl_0_9_fragment_10.z_10 = z_10;
                              add_external_impl_0_9_fragment_10.a_11 = a_11;
                              add_external_impl_0_9_fragment_10.b_11 = b_11;
                              add_external_impl_0_9_fragment_10.c_11 = c_11;
                              add_external_impl_0_9_fragment_10.d_11 = d_11;
                              add_external_impl_0_9_fragment_10.e_11 = e_11;
                              add_external_impl_0_9_fragment_10.f_11 = f_11;
                              add_external_impl_0_9_fragment_10.g_11 = g_11;
                              add_external_impl_0_9_fragment_10.e_12 = e_12;
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
        TermReference q_23 = new TermReference();
        lifted51 lifted511 = new lifted51();
        lifted50 lifted500 = new lifted50();
        lifted511.q_23 = q_23;
        lifted500.q_23 = q_23;
        term = or_2_0.instance.invoke(context, term, lifted500, lifted511);
        if(term == null)
          break Fail36;
        IStrategoTerm term73 = term;
        Success31:
        { 
          Fail37:
          { 
            IStrategoTerm r_23 = null;
            r_23 = term;
            lifted54 lifted540 = new lifted54();
            lifted52 lifted520 = new lifted52();
            lifted540.q_23 = q_23;
            lifted520.q_23 = q_23;
            term = or_2_0.instance.invoke(context, term, lifted520, lifted540);
            if(term == null)
              break Fail37;
            term = r_23;
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

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm s_23, IStrategoTerm t_23, IStrategoTerm u_23, IStrategoTerm v_23)
    { 
      context.push("add__params_0_4");
      Fail38:
      { 
        TermReference w_23 = new TermReference();
        lifted57 lifted570 = new lifted57();
        lifted56 lifted560 = new lifted56();
        lifted570.w_23 = w_23;
        lifted560.w_23 = w_23;
        term = or_2_0.instance.invoke(context, term, lifted560, lifted570);
        if(term == null)
          break Fail38;
        term = add__var_0_5.instance.invoke(context, term, w_23.value, s_23, t_23, u_23, v_23);
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

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm z_23, IStrategoTerm a_24, IStrategoTerm b_24, IStrategoTerm c_24, IStrategoTerm d_24)
    { 
      context.push("add__var_0_5");
      Fail39:
      { 
        term = hashtable_put_0_2.instance.invoke(context, c_24, z_23, d_24);
        if(term == null)
          break Fail39;
        term = increament_0_2.instance.invoke(context, a_24, z_23, a_24);
        if(term == null)
          break Fail39;
        term = increament_0_2.instance.invoke(context, b_24, z_23, b_24);
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

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm e_24, IStrategoTerm f_24, IStrategoTerm g_24)
    { 
      ITermFactory termFactory = context.getFactory();
      context.push("try_to_get_type_0_3");
      Fail40:
      { 
        IStrategoTerm h_24 = null;
        IStrategoTerm i_24 = null;
        IStrategoTerm j_24 = null;
        IStrategoTerm l_24 = null;
        if(term.getTermType() != IStrategoTerm.TUPLE || term.getSubtermCount() != 2)
          break Fail40;
        h_24 = term.getSubterm(0);
        j_24 = term.getSubterm(1);
        term = get_type_of_0_3.instance.invoke(context, h_24, e_24, f_24, g_24);
        if(term == null)
          break Fail40;
        i_24 = term;
        Success32:
        { 
          Fail41:
          { 
            IStrategoTerm m_24 = null;
            m_24 = term;
            IStrategoTerm term75 = term;
            Success33:
            { 
              Fail42:
              { 
                term = termFactory.makeTuple(i_24, transform.constNone0);
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
            term = m_24;
            { 
              term = i_24;
              if(true)
                break Success32;
            }
          }
          term = get_type_of_0_3.instance.invoke(context, j_24, e_24, f_24, g_24);
          if(term == null)
            break Fail40;
          l_24 = term;
          Success34:
          { 
            Fail43:
            { 
              IStrategoTerm n_24 = null;
              n_24 = term;
              IStrategoTerm term77 = term;
              Success35:
              { 
                Fail44:
                { 
                  term = termFactory.makeTuple(l_24, transform.constNone0);
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
              term = n_24;
              { 
                term = l_24;
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
        IStrategoTerm q_24 = null;
        IStrategoTerm r_24 = null;
        IStrategoTerm s_24 = null;
        q_24 = term;
        s_24 = term;
        r_24 = q_24;
        term = s_24;
        IStrategoTerm term78 = term;
        Success36:
        { 
          Fail46:
          { 
            IStrategoTerm t_24 = null;
            t_24 = term;
            term = r_24;
            if(term.getTermType() != IStrategoTerm.APPL || transform._consByte_0 != ((IStrategoAppl)term).getConstructor())
              break Fail46;
            term = t_24;
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
              IStrategoTerm u_24 = null;
              u_24 = term;
              term = r_24;
              if(term.getTermType() != IStrategoTerm.APPL || transform._consInt_0 != ((IStrategoAppl)term).getConstructor())
                break Fail47;
              term = u_24;
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
                IStrategoTerm v_24 = null;
                v_24 = term;
                term = r_24;
                if(term.getTermType() != IStrategoTerm.APPL || transform._consShort_0 != ((IStrategoAppl)term).getConstructor())
                  break Fail48;
                term = v_24;
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
                  IStrategoTerm w_24 = null;
                  w_24 = term;
                  term = or_2_0.instance.invoke(context, r_24, lifted58.instance, lifted59.instance);
                  if(term == null)
                    break Fail49;
                  term = w_24;
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
                    IStrategoTerm x_24 = null;
                    x_24 = term;
                    term = or_2_0.instance.invoke(context, r_24, lifted60.instance, lifted61.instance);
                    if(term == null)
                      break Fail50;
                    term = x_24;
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
                      IStrategoTerm y_24 = null;
                      y_24 = term;
                      term = r_24;
                      if(term.getTermType() != IStrategoTerm.APPL || transform._consLong_0 != ((IStrategoAppl)term).getConstructor())
                        break Fail51;
                      term = y_24;
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
                        IStrategoTerm z_24 = null;
                        z_24 = term;
                        term = r_24;
                        if(term.getTermType() != IStrategoTerm.APPL || transform._consDouble_0 != ((IStrategoAppl)term).getConstructor())
                          break Fail52;
                        term = z_24;
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
                          IStrategoTerm a_25 = null;
                          a_25 = term;
                          term = r_24;
                          if(term.getTermType() != IStrategoTerm.APPL || transform._consDeci_1 != ((IStrategoAppl)term).getConstructor())
                            break Fail53;
                          term = a_25;
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
                            IStrategoTerm b_25 = null;
                            b_25 = term;
                            term = or_2_0.instance.invoke(context, r_24, lifted62.instance, lifted63.instance);
                            if(term == null)
                              break Fail54;
                            term = b_25;
                            { 
                              term = transform.constBoolean0;
                              if(true)
                                break Success44;
                            }
                          }
                          term = debug_0_0.instance.invoke(context, transform.const12);
                          if(term == null)
                            break Fail45;
                          term = debug_0_0.instance.invoke(context, q_24);
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
        IStrategoTerm e_25 = null;
        IStrategoTerm f_25 = null;
        IStrategoTerm g_25 = null;
        e_25 = term;
        g_25 = term;
        f_25 = e_25;
        term = g_25;
        IStrategoTerm term87 = term;
        Success45:
        { 
          Fail56:
          { 
            IStrategoTerm h_25 = null;
            h_25 = term;
            term = f_25;
            if(term.getTermType() != IStrategoTerm.APPL || transform._consInt_0 != ((IStrategoAppl)term).getConstructor())
              break Fail56;
            term = h_25;
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
              IStrategoTerm i_25 = null;
              i_25 = term;
              term = f_25;
              if(term.getTermType() != IStrategoTerm.APPL || transform._consLong_0 != ((IStrategoAppl)term).getConstructor())
                break Fail57;
              term = i_25;
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
                IStrategoTerm j_25 = null;
                j_25 = term;
                term = f_25;
                if(term.getTermType() != IStrategoTerm.APPL || transform._consDeci_1 != ((IStrategoAppl)term).getConstructor())
                  break Fail58;
                term = j_25;
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
                  IStrategoTerm k_25 = null;
                  k_25 = term;
                  term = f_25;
                  if(term.getTermType() != IStrategoTerm.APPL || transform._consDouble_0 != ((IStrategoAppl)term).getConstructor())
                    break Fail59;
                  term = k_25;
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
                    IStrategoTerm l_25 = null;
                    l_25 = term;
                    term = or_2_0.instance.invoke(context, f_25, lifted64.instance, lifted65.instance);
                    if(term == null)
                      break Fail60;
                    term = l_25;
                    { 
                      term = transform.constBoolean0;
                      if(true)
                        break Success49;
                    }
                  }
                  term = debug_0_0.instance.invoke(context, transform.const12);
                  if(term == null)
                    break Fail55;
                  term = debug_0_0.instance.invoke(context, e_25);
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
        IStrategoTerm o_25 = null;
        IStrategoTerm r_25 = null;
        IStrategoTerm s_25 = null;
        o_25 = term;
        s_25 = term;
        r_25 = o_25;
        term = s_25;
        IStrategoTerm term92 = term;
        Success50:
        { 
          Fail62:
          { 
            IStrategoTerm t_25 = null;
            t_25 = term;
            term = r_25;
            if(term.getTermType() != IStrategoTerm.APPL || transform._consByte_0 != ((IStrategoAppl)term).getConstructor())
              break Fail62;
            term = t_25;
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
              IStrategoTerm u_25 = null;
              u_25 = term;
              term = r_25;
              if(term.getTermType() != IStrategoTerm.APPL || transform._consShort_0 != ((IStrategoAppl)term).getConstructor())
                break Fail63;
              term = u_25;
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
                IStrategoTerm v_25 = null;
                v_25 = term;
                term = r_25;
                if(term.getTermType() != IStrategoTerm.APPL || transform._consInt_0 != ((IStrategoAppl)term).getConstructor())
                  break Fail64;
                term = v_25;
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
                  IStrategoTerm w_25 = null;
                  w_25 = term;
                  term = r_25;
                  if(term.getTermType() != IStrategoTerm.APPL || transform._consLong_0 != ((IStrategoAppl)term).getConstructor())
                    break Fail65;
                  term = w_25;
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
                    IStrategoTerm x_25 = null;
                    x_25 = term;
                    term = or_2_0.instance.invoke(context, r_25, lifted66.instance, lifted67.instance);
                    if(term == null)
                      break Fail66;
                    term = x_25;
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
                      IStrategoTerm y_25 = null;
                      y_25 = term;
                      term = r_25;
                      if(term.getTermType() != IStrategoTerm.APPL || transform._consDouble_0 != ((IStrategoAppl)term).getConstructor())
                        break Fail67;
                      term = y_25;
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
                        IStrategoTerm z_25 = null;
                        z_25 = term;
                        term = r_25;
                        if(term.getTermType() != IStrategoTerm.APPL || transform._consDeci_1 != ((IStrategoAppl)term).getConstructor())
                          break Fail68;
                        term = z_25;
                        { 
                          term = transform.constLong0;
                          if(true)
                            break Success56;
                        }
                      }
                      term = debug_0_0.instance.invoke(context, transform.const12);
                      if(term == null)
                        break Fail61;
                      term = debug_0_0.instance.invoke(context, o_25);
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
        IStrategoTerm c_26 = null;
        IStrategoTerm d_26 = null;
        IStrategoTerm e_26 = null;
        c_26 = term;
        e_26 = term;
        d_26 = c_26;
        term = e_26;
        IStrategoTerm term99 = term;
        Success57:
        { 
          Fail70:
          { 
            IStrategoTerm f_26 = null;
            f_26 = term;
            term = d_26;
            if(term.getTermType() != IStrategoTerm.APPL || transform._consByte_0 != ((IStrategoAppl)term).getConstructor())
              break Fail70;
            term = f_26;
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
              IStrategoTerm g_26 = null;
              g_26 = term;
              term = d_26;
              if(term.getTermType() != IStrategoTerm.APPL || transform._consShort_0 != ((IStrategoAppl)term).getConstructor())
                break Fail71;
              term = g_26;
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
                IStrategoTerm h_26 = null;
                h_26 = term;
                term = d_26;
                if(term.getTermType() != IStrategoTerm.APPL || transform._consInt_0 != ((IStrategoAppl)term).getConstructor())
                  break Fail72;
                term = h_26;
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
                  IStrategoTerm i_26 = null;
                  i_26 = term;
                  term = d_26;
                  if(term.getTermType() != IStrategoTerm.APPL || transform._consLong_0 != ((IStrategoAppl)term).getConstructor())
                    break Fail73;
                  term = i_26;
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
                    IStrategoTerm j_26 = null;
                    j_26 = term;
                    term = or_2_0.instance.invoke(context, d_26, lifted68.instance, lifted69.instance);
                    if(term == null)
                      break Fail74;
                    term = j_26;
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
                      IStrategoTerm k_26 = null;
                      k_26 = term;
                      term = d_26;
                      if(term.getTermType() != IStrategoTerm.APPL || transform._consDouble_0 != ((IStrategoAppl)term).getConstructor())
                        break Fail75;
                      term = k_26;
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
                        IStrategoTerm l_26 = null;
                        l_26 = term;
                        term = d_26;
                        if(term.getTermType() != IStrategoTerm.APPL || transform._consDeci_1 != ((IStrategoAppl)term).getConstructor())
                          break Fail76;
                        term = l_26;
                        { 
                          term = transform.constLong0;
                          if(true)
                            break Success63;
                        }
                      }
                      term = debug_0_0.instance.invoke(context, transform.const12);
                      if(term == null)
                        break Fail69;
                      term = debug_0_0.instance.invoke(context, c_26);
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
        IStrategoTerm o_26 = null;
        IStrategoTerm p_26 = null;
        IStrategoTerm s_26 = null;
        o_26 = term;
        s_26 = term;
        p_26 = o_26;
        term = s_26;
        IStrategoTerm term106 = term;
        Success64:
        { 
          Fail78:
          { 
            IStrategoTerm u_26 = null;
            u_26 = term;
            term = p_26;
            if(term.getTermType() != IStrategoTerm.APPL || transform._consByte_0 != ((IStrategoAppl)term).getConstructor())
              break Fail78;
            term = u_26;
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
              IStrategoTerm v_26 = null;
              v_26 = term;
              term = or_2_0.instance.invoke(context, p_26, lifted70.instance, lifted71.instance);
              if(term == null)
                break Fail79;
              term = v_26;
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
                IStrategoTerm w_26 = null;
                w_26 = term;
                term = p_26;
                if(term.getTermType() != IStrategoTerm.APPL || transform._consShort_0 != ((IStrategoAppl)term).getConstructor())
                  break Fail80;
                term = w_26;
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
                  IStrategoTerm x_26 = null;
                  x_26 = term;
                  term = p_26;
                  if(term.getTermType() != IStrategoTerm.APPL || transform._consInt_0 != ((IStrategoAppl)term).getConstructor())
                    break Fail81;
                  term = x_26;
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
                    IStrategoTerm z_26 = null;
                    z_26 = term;
                    term = p_26;
                    if(term.getTermType() != IStrategoTerm.APPL || transform._consLong_0 != ((IStrategoAppl)term).getConstructor())
                      break Fail82;
                    term = z_26;
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
                      IStrategoTerm b_27 = null;
                      b_27 = term;
                      term = p_26;
                      if(term.getTermType() != IStrategoTerm.APPL || transform._consDeci_1 != ((IStrategoAppl)term).getConstructor())
                        break Fail83;
                      term = b_27;
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
                        IStrategoTerm c_27 = null;
                        c_27 = term;
                        term = or_2_0.instance.invoke(context, p_26, lifted72.instance, lifted73.instance);
                        if(term == null)
                          break Fail84;
                        term = c_27;
                        { 
                          term = transform.constBoolean0;
                          if(true)
                            break Success70;
                        }
                      }
                      term = debug_0_0.instance.invoke(context, transform.const12);
                      if(term == null)
                        break Fail77;
                      term = debug_0_0.instance.invoke(context, o_26);
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
        IStrategoTerm l_27 = null;
        IStrategoTerm m_27 = null;
        IStrategoTerm n_27 = null;
        l_27 = term;
        n_27 = term;
        m_27 = l_27;
        term = n_27;
        IStrategoTerm term113 = term;
        Success71:
        { 
          Fail86:
          { 
            IStrategoTerm o_27 = null;
            o_27 = term;
            term = m_27;
            if(term.getTermType() != IStrategoTerm.APPL || transform._consByte_0 != ((IStrategoAppl)term).getConstructor())
              break Fail86;
            term = o_27;
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
              IStrategoTerm p_27 = null;
              p_27 = term;
              term = or_2_0.instance.invoke(context, m_27, lifted74.instance, lifted75.instance);
              if(term == null)
                break Fail87;
              term = p_27;
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
                IStrategoTerm q_27 = null;
                q_27 = term;
                term = m_27;
                if(term.getTermType() != IStrategoTerm.APPL || transform._consShort_0 != ((IStrategoAppl)term).getConstructor())
                  break Fail88;
                term = q_27;
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
                  IStrategoTerm r_27 = null;
                  r_27 = term;
                  term = m_27;
                  if(term.getTermType() != IStrategoTerm.APPL || transform._consInt_0 != ((IStrategoAppl)term).getConstructor())
                    break Fail89;
                  term = r_27;
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
                    IStrategoTerm t_27 = null;
                    t_27 = term;
                    term = m_27;
                    if(term.getTermType() != IStrategoTerm.APPL || transform._consLong_0 != ((IStrategoAppl)term).getConstructor())
                      break Fail90;
                    term = t_27;
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
                      IStrategoTerm u_27 = null;
                      u_27 = term;
                      term = m_27;
                      if(term.getTermType() != IStrategoTerm.APPL || transform._consDeci_1 != ((IStrategoAppl)term).getConstructor())
                        break Fail91;
                      term = u_27;
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
                        IStrategoTerm v_27 = null;
                        v_27 = term;
                        term = or_2_0.instance.invoke(context, m_27, lifted76.instance, lifted77.instance);
                        if(term == null)
                          break Fail92;
                        term = v_27;
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
                          IStrategoTerm w_27 = null;
                          w_27 = term;
                          term = m_27;
                          if(term.getTermType() != IStrategoTerm.APPL || transform._consDouble_0 != ((IStrategoAppl)term).getConstructor())
                            break Fail93;
                          term = w_27;
                          { 
                            term = transform.constDouble0;
                            if(true)
                              break Success78;
                          }
                        }
                        term = debug_0_0.instance.invoke(context, transform.const12);
                        if(term == null)
                          break Fail85;
                        term = debug_0_0.instance.invoke(context, l_27);
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

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm z_27, IStrategoTerm a_28, IStrategoTerm b_28)
    { 
      ITermFactory termFactory = context.getFactory();
      context.push("get_LHS_type_0_3");
      Fail94:
      { 
        IStrategoTerm c_28 = null;
        IStrategoTerm d_28 = null;
        IStrategoTerm f_28 = null;
        f_28 = term;
        c_28 = term;
        term = get_type_of_0_3.instance.invoke(context, f_28, z_27, a_28, b_28);
        if(term == null)
          break Fail94;
        d_28 = term;
        Success79:
        { 
          Fail95:
          { 
            IStrategoTerm e_28 = null;
            e_28 = term;
            term = termFactory.makeTuple(d_28, transform.constNone0);
            term = equal_0_0.instance.invoke(context, term);
            if(term == null)
              break Fail95;
            term = e_28;
            { 
              term = debug_0_0.instance.invoke(context, transform.const13);
              if(term == null)
                break Fail94;
              term = debug_0_0.instance.invoke(context, c_28);
              if(term == null)
                break Fail94;
              term = transform.const9;
              if(true)
                break Fail94;
              if(true)
                break Success79;
            }
          }
          term = d_28;
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

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm i_28, IStrategoTerm j_28, IStrategoTerm k_28)
    { 
      context.push("get_type_of_0_3");
      Fail96:
      { 
        IStrategoTerm l_28 = null;
        IStrategoTerm term122 = term;
        Success80:
        { 
          Fail97:
          { 
            IStrategoTerm m_28 = null;
            m_28 = term;
            IStrategoTerm term123 = term;
            Success81:
            { 
              Fail98:
              { 
                term = type_of_0_3.instance.invoke(context, term, i_28, j_28, k_28);
                if(term == null)
                  break Fail98;
                l_28 = term;
                { 
                  if(true)
                    break Fail97;
                  if(true)
                    break Success81;
                }
              }
              term = term123;
            }
            term = m_28;
            { 
              term = transform.constNone0;
              if(l_28 == null)
                l_28 = term;
              else
                if(l_28 != term && !l_28.match(term))
                  break Fail96;
              if(true)
                break Success80;
            }
          }
          term = term122;
        }
        if(l_28 == null)
          break Fail96;
        term = l_28;
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

    public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm q_28, IStrategoTerm s_28, IStrategoTerm t_28, IStrategoTerm u_28, IStrategoTerm x_28, IStrategoTerm y_28, IStrategoTerm z_28)
    { 
      ITermFactory termFactory = context.getFactory();
      context.push("handle_expr_0_7");
      Fail99:
      { 
        IStrategoTerm a_29 = null;
        IStrategoTerm c_29 = null;
        IStrategoTerm e_29 = null;
        IStrategoTerm h_29 = null;
        h_29 = term;
        a_29 = term;
        term = fetch_0_0.instance.invoke(context, h_29);
        if(term == null)
          break Fail99;
        c_29 = term;
        IStrategoTerm term124 = term;
        Success82:
        { 
          Fail100:
          { 
            IStrategoTerm f_29 = null;
            f_29 = term;
            term = hashtable_keys_0_0.instance.invoke(context, q_28);
            if(term == null)
              break Fail100;
            term = termFactory.makeTuple(c_29, term);
            term = elem_0_0.instance.invoke(context, term);
            if(term == null)
              break Fail100;
            term = f_29;
            { 
              term = a_29;
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
              IStrategoTerm g_29 = null;
              g_29 = term;
              term = termFactory.makeTuple(y_28, transform.constFalse0);
              term = equal_0_0.instance.invoke(context, term);
              if(term == null)
                break Fail101;
              term = g_29;
              { 
                term = debug_0_0.instance.invoke(context, transform.const14);
                if(term == null)
                  break Fail99;
                term = debug_0_0.instance.invoke(context, a_29);
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
            IStrategoTerm o_29 = null;
            term = generate_ref_method__name_0_2.instance.invoke(context, term, c_29, u_28);
            if(term == null)
              break Fail99;
            e_29 = term;
            term = s_28;
            o_29 = s_28;
            term = create_ref_method_0_4.instance.invoke(context, term, c_29, e_29, x_28, z_28);
            if(term == null)
              break Fail99;
            term = iset_add_0_1.instance.invoke(context, o_29, term);
            if(term == null)
              break Fail99;
            term = iset_add_0_1.instance.invoke(context, t_28, c_29);
            if(term == null)
              break Fail99;
            term = generate_invoke_ref_0_1.instance.invoke(context, transform.const9, e_29);
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

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm r_29)
    { 
      ITermFactory termFactory = context.getFactory();
      Fail102:
      { 
        term = termFactory.makeAppl(transform._consInvoke_2, new IStrategoTerm[]{termFactory.makeAppl(transform._consMethod_1, new IStrategoTerm[]{termFactory.makeAppl(transform._consMethodName_1, new IStrategoTerm[]{termFactory.makeAppl(transform._consId_1, new IStrategoTerm[]{r_29})})}), transform.constCons1});
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

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm s_29, IStrategoTerm t_29)
    { 
      ITermFactory termFactory = context.getFactory();
      context.push("generate_ref_method__name_0_2");
      Fail103:
      { 
        IStrategoTerm u_29 = null;
        IStrategoTerm term126 = term;
        Success84:
        { 
          Fail104:
          { 
            IStrategoTerm w_29 = null;
            w_29 = term;
            IStrategoTerm term127 = term;
            Success85:
            { 
              Fail105:
              { 
                term = hashtable_keys_0_0.instance.invoke(context, t_29);
                if(term == null)
                  break Fail105;
                term = termFactory.makeTuple(s_29, term);
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
            term = w_29;
            { 
              term = hashtable_keys_0_0.instance.invoke(context, t_29);
              if(term == null)
                break Fail103;
              term = length_0_0.instance.invoke(context, term);
              if(term == null)
                break Fail103;
              term = termFactory.makeTuple(term, transform.const16);
              term = add_0_0.instance.invoke(context, term);
              if(term == null)
                break Fail103;
              u_29 = term;
              term = int_to_string_0_0.instance.invoke(context, u_29);
              if(term == null)
                break Fail103;
              term = (IStrategoTerm)termFactory.makeListCons(transform.const17, termFactory.makeListCons(term, (IStrategoList)transform.constNil0));
              term = concat_strings_0_0.instance.invoke(context, term);
              if(term == null)
                break Fail103;
              term = hashtable_put_0_2.instance.invoke(context, t_29, s_29, term);
              if(term == null)
                break Fail103;
              if(true)
                break Success84;
            }
          }
          term = term126;
        }
        term = hashtable_get_0_1.instance.invoke(context, t_29, s_29);
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

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm e_30, IStrategoTerm j_30)
    { 
      ITermFactory termFactory = context.getFactory();
      context.push("increament_0_2");
      Fail106:
      { 
        IStrategoTerm k_30 = null;
        Success86:
        { 
          Fail107:
          { 
            IStrategoTerm l_30 = null;
            l_30 = term;
            term = hashtable_keys_0_0.instance.invoke(context, j_30);
            if(term == null)
              break Fail107;
            term = termFactory.makeTuple(e_30, term);
            term = elem_0_0.instance.invoke(context, term);
            if(term == null)
              break Fail107;
            term = l_30;
            { 
              IStrategoTerm m_31 = null;
              term = hashtable_get_0_1.instance.invoke(context, j_30, e_30);
              if(term == null)
                break Fail106;
              k_30 = term;
              term = hashtable_remove_0_1.instance.invoke(context, j_30, e_30);
              if(term == null)
                break Fail106;
              m_31 = j_30;
              term = termFactory.makeTuple(transform.const16, k_30);
              term = add_0_0.instance.invoke(context, term);
              if(term == null)
                break Fail106;
              term = hashtable_put_0_2.instance.invoke(context, m_31, e_30, term);
              if(term == null)
                break Fail106;
              if(true)
                break Success86;
            }
          }
          IStrategoTerm e_32 = null;
          e_32 = j_30;
          term = hashtable_put_0_2.instance.invoke(context, e_32, e_30, transform.const16);
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

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm f_32, IStrategoTerm d_33)
    { 
      ITermFactory termFactory = context.getFactory();
      context.push("decreament_0_2");
      Fail108:
      { 
        IStrategoTerm e_33 = null;
        IStrategoTerm f_33 = null;
        f_33 = term;
        IStrategoTerm term129 = term;
        Success87:
        { 
          Fail109:
          { 
            IStrategoTerm k_33 = null;
            k_33 = term;
            term = hashtable_keys_0_0.instance.invoke(context, f_32);
            if(term == null)
              break Fail109;
            term = termFactory.makeTuple(f_33, term);
            term = elem_0_0.instance.invoke(context, term);
            if(term == null)
              break Fail109;
            term = k_33;
            { 
              IStrategoTerm v_33 = null;
              term = hashtable_get_0_1.instance.invoke(context, f_32, f_33);
              if(term == null)
                break Fail108;
              e_33 = term;
              term = hashtable_remove_0_1.instance.invoke(context, f_32, f_33);
              if(term == null)
                break Fail108;
              v_33 = f_32;
              term = hashtable_get_0_1.instance.invoke(context, d_33, f_33);
              if(term == null)
                break Fail108;
              term = termFactory.makeTuple(e_33, term);
              term = subti_0_0.instance.invoke(context, term);
              if(term == null)
                break Fail108;
              term = hashtable_put_0_2.instance.invoke(context, v_33, f_33, term);
              if(term == null)
                break Fail108;
              IStrategoTerm term130 = term;
              Success88:
              { 
                Fail110:
                { 
                  IStrategoTerm l_33 = null;
                  l_33 = term;
                  term = hashtable_get_0_1.instance.invoke(context, f_32, f_33);
                  if(term == null)
                    break Fail110;
                  term = termFactory.makeTuple(term, transform.const18);
                  term = equal_0_0.instance.invoke(context, term);
                  if(term == null)
                    break Fail110;
                  term = l_33;
                  { 
                    term = hashtable_remove_0_1.instance.invoke(context, f_32, f_33);
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

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm a_34, IStrategoTerm b_34, IStrategoTerm c_34, IStrategoTerm d_34)
    { 
      ITermFactory termFactory = context.getFactory();
      context.push("create_ref_method_0_4");
      Fail111:
      { 
        IStrategoTerm e_34 = null;
        IStrategoTerm f_34 = null;
        IStrategoTerm g_34 = null;
        IStrategoTerm h_34 = null;
        h_34 = term;
        g_34 = c_34;
        term = h_34;
        IStrategoTerm term131 = term;
        Success89:
        { 
          Fail112:
          { 
            IStrategoTerm i_34 = null;
            i_34 = term;
            term = g_34;
            if(term.getTermType() != IStrategoTerm.APPL || transform._consByte_0 != ((IStrategoAppl)term).getConstructor())
              break Fail112;
            term = i_34;
            { 
              e_34 = transform.constByte0;
              term = transform.constLit0;
              f_34 = transform.constLit0;
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
              IStrategoTerm j_34 = null;
              j_34 = term;
              term = g_34;
              if(term.getTermType() != IStrategoTerm.APPL || transform._consInt_0 != ((IStrategoAppl)term).getConstructor())
                break Fail113;
              term = j_34;
              { 
                e_34 = transform.constInt0;
                term = transform.constLit0;
                f_34 = transform.constLit0;
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
                IStrategoTerm k_34 = null;
                k_34 = term;
                term = or_2_0.instance.invoke(context, g_34, lifted78.instance, lifted79.instance);
                if(term == null)
                  break Fail114;
                term = k_34;
                { 
                  e_34 = transform.constBoolean0;
                  term = transform.constLit1;
                  f_34 = transform.constLit1;
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
                  IStrategoTerm l_34 = null;
                  l_34 = term;
                  term = or_2_0.instance.invoke(context, g_34, lifted80.instance, lifted81.instance);
                  if(term == null)
                    break Fail115;
                  term = l_34;
                  { 
                    e_34 = transform.constFloat0;
                    term = transform.constLit2;
                    f_34 = transform.constLit2;
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
                    IStrategoTerm m_34 = null;
                    m_34 = term;
                    term = g_34;
                    if(term.getTermType() != IStrategoTerm.APPL || transform._consDouble_0 != ((IStrategoAppl)term).getConstructor())
                      break Fail116;
                    term = m_34;
                    { 
                      e_34 = transform.constDouble0;
                      term = transform.constLit2;
                      f_34 = transform.constLit2;
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
                      IStrategoTerm n_34 = null;
                      n_34 = term;
                      term = g_34;
                      if(term.getTermType() != IStrategoTerm.APPL || transform._consLong_0 != ((IStrategoAppl)term).getConstructor())
                        break Fail117;
                      term = n_34;
                      { 
                        e_34 = transform.constLong0;
                        term = transform.constLit0;
                        f_34 = transform.constLit0;
                        if(true)
                          break Success94;
                      }
                    }
                    term = term136;
                    Success95:
                    { 
                      Fail118:
                      { 
                        IStrategoTerm o_34 = null;
                        o_34 = term;
                        term = g_34;
                        if(term.getTermType() != IStrategoTerm.APPL || transform._consDeci_1 != ((IStrategoAppl)term).getConstructor())
                          break Fail118;
                        term = o_34;
                        { 
                          e_34 = transform.constDouble0;
                          term = transform.constLit2;
                          f_34 = transform.constLit2;
                          if(true)
                            break Success95;
                        }
                      }
                      e_34 = transform.constClassOrInterfaceType0;
                      term = transform.constLit3;
                      f_34 = transform.constLit3;
                    }
                  }
                }
              }
            }
          }
        }
        term = termFactory.makeAppl(transform._consMethodDec_2, new IStrategoTerm[]{termFactory.makeAppl(transform._consMethodDecHead_6, new IStrategoTerm[]{(IStrategoTerm)termFactory.makeListCons(termFactory.makeAppl(transform._consAnno_2, new IStrategoTerm[]{transform.constTypeName1, (IStrategoTerm)termFactory.makeListCons(termFactory.makeAppl(transform._consElemValPair_2, new IStrategoTerm[]{transform.constId3, termFactory.makeAppl(transform._consLit_1, new IStrategoTerm[]{termFactory.makeAppl(transform._consString_1, new IStrategoTerm[]{(IStrategoTerm)termFactory.makeListCons(termFactory.makeAppl(transform._consChars_1, new IStrategoTerm[]{a_34}), (IStrategoList)transform.constNil0)})})}), (IStrategoList)transform.constNil0)}), (IStrategoList)transform.constCons2), transform.constNone0, e_34, termFactory.makeAppl(transform._consId_1, new IStrategoTerm[]{b_34}), (IStrategoTerm)termFactory.makeListCons(termFactory.makeAppl(transform._consParam_3, new IStrategoTerm[]{transform.constNil0, termFactory.makeAppl(transform._consClassOrInterfaceType_2, new IStrategoTerm[]{termFactory.makeAppl(transform._consTypeName_1, new IStrategoTerm[]{termFactory.makeAppl(transform._consId_1, new IStrategoTerm[]{d_34})}), transform.constNone0}), transform.constId4}), (IStrategoList)transform.constNil0), transform.constNone0}), termFactory.makeAppl(transform._consBlock_1, new IStrategoTerm[]{(IStrategoTerm)termFactory.makeListCons(termFactory.makeAppl(transform._consReturn_1, new IStrategoTerm[]{termFactory.makeAppl(transform._consSome_1, new IStrategoTerm[]{f_34})}), (IStrategoList)transform.constNil0)})});
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

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm p_34, IStrategoTerm q_34, IStrategoTerm r_34)
    { 
      ITermFactory termFactory = context.getFactory();
      context.push("get_expr_type_0_3");
      Fail119:
      { 
        Success96:
        { 
          Fail120:
          { 
            IStrategoTerm s_34 = null;
            s_34 = term;
            term = hashtable_keys_0_0.instance.invoke(context, q_34);
            if(term == null)
              break Fail120;
            term = termFactory.makeTuple(p_34, term);
            term = elem_0_0.instance.invoke(context, term);
            if(term == null)
              break Fail120;
            term = s_34;
            { 
              term = hashtable_get_0_1.instance.invoke(context, r_34, p_34);
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

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm n_56, IStrategoTerm o_56, IStrategoTerm p_56)
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
                IStrategoTerm o_40 = null;
                o_40 = term;
                term = termFactory.makeTuple(n_56, transform.constNone0);
                term = equal_0_0.instance.invoke(context, term);
                if(term == null)
                  break Fail123;
                term = o_40;
                { 
                  term = transform.constLong0;
                  if(true)
                    break Success98;
                }
              }
              term = n_56;
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
                  IStrategoTerm k_40 = null;
                  k_40 = term;
                  term = termFactory.makeTuple(n_56, transform.constNone0);
                  term = equal_0_0.instance.invoke(context, term);
                  if(term == null)
                    break Fail125;
                  term = k_40;
                  { 
                    term = transform.constDouble0;
                    if(true)
                      break Success100;
                  }
                }
                term = n_56;
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
                    IStrategoTerm g_40 = null;
                    g_40 = term;
                    term = termFactory.makeTuple(n_56, transform.constNone0);
                    term = equal_0_0.instance.invoke(context, term);
                    if(term == null)
                      break Fail127;
                    term = g_40;
                    { 
                      term = transform.constDouble0;
                      if(true)
                        break Success102;
                    }
                  }
                  term = cast_bounded_arithmetic_type_0_0.instance.invoke(context, n_56);
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
                  TermReference b_40 = new TermReference();
                  lifted95 lifted950 = new lifted95();
                  lifted92 lifted920 = new lifted92();
                  lifted950.b_40 = b_40;
                  lifted920.b_40 = b_40;
                  term = or_2_0.instance.invoke(context, term, lifted920, lifted950);
                  if(term == null)
                    break Fail128;
                  Success104:
                  { 
                    Fail129:
                    { 
                      IStrategoTerm c_40 = null;
                      c_40 = term;
                      term = termFactory.makeTuple(n_56, transform.constNone0);
                      term = equal_0_0.instance.invoke(context, term);
                      if(term == null)
                        break Fail129;
                      term = c_40;
                      { 
                        if(b_40.value == null)
                          break Fail128;
                        term = get_type_of_0_3.instance.invoke(context, b_40.value, n_56, o_56, p_56);
                        if(term == null)
                          break Fail128;
                        term = cast_shift_type_0_0.instance.invoke(context, term);
                        if(term == null)
                          break Fail128;
                        if(true)
                          break Success104;
                      }
                    }
                    term = cast_shift_type_0_0.instance.invoke(context, n_56);
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
                      IStrategoTerm v_39 = null;
                      IStrategoTerm w_39 = null;
                      v_39 = term.getSubterm(0);
                      w_39 = term.getSubterm(1);
                      Success106:
                      { 
                        Fail131:
                        { 
                          IStrategoTerm x_39 = null;
                          x_39 = term;
                          term = termFactory.makeTuple(n_56, transform.constNone0);
                          term = equal_0_0.instance.invoke(context, term);
                          if(term == null)
                            break Fail131;
                          term = x_39;
                          { 
                            term = termFactory.makeTuple(v_39, w_39);
                            term = try_to_get_type_0_3.instance.invoke(context, term, n_56, o_56, p_56);
                            if(term == null)
                              break Fail130;
                            term = cast_conditional_type_0_0.instance.invoke(context, term);
                            if(term == null)
                              break Fail130;
                            if(true)
                              break Success106;
                          }
                        }
                        term = cast_bounded_conditional_type_0_0.instance.invoke(context, n_56);
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
                        IStrategoTerm p_39 = null;
                        IStrategoTerm q_39 = null;
                        p_39 = term.getSubterm(0);
                        q_39 = term.getSubterm(1);
                        Success108:
                        { 
                          Fail133:
                          { 
                            IStrategoTerm r_39 = null;
                            r_39 = term;
                            term = termFactory.makeTuple(n_56, transform.constNone0);
                            term = equal_0_0.instance.invoke(context, term);
                            if(term == null)
                              break Fail133;
                            term = r_39;
                            { 
                              term = termFactory.makeTuple(p_39, q_39);
                              term = try_to_get_type_0_3.instance.invoke(context, term, n_56, o_56, p_56);
                              if(term == null)
                                break Fail132;
                              term = cast_conditional_type_0_0.instance.invoke(context, term);
                              if(term == null)
                                break Fail132;
                              if(true)
                                break Success108;
                            }
                          }
                          term = cast_bounded_conditional_type_0_0.instance.invoke(context, n_56);
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
                          IStrategoTerm j_39 = null;
                          IStrategoTerm k_39 = null;
                          j_39 = term.getSubterm(0);
                          k_39 = term.getSubterm(1);
                          Success110:
                          { 
                            Fail135:
                            { 
                              IStrategoTerm l_39 = null;
                              l_39 = term;
                              term = termFactory.makeTuple(n_56, transform.constNone0);
                              term = equal_0_0.instance.invoke(context, term);
                              if(term == null)
                                break Fail135;
                              term = l_39;
                              { 
                                term = termFactory.makeTuple(j_39, k_39);
                                term = try_to_get_type_0_3.instance.invoke(context, term, n_56, o_56, p_56);
                                if(term == null)
                                  break Fail134;
                                term = cast_conditional_type_0_0.instance.invoke(context, term);
                                if(term == null)
                                  break Fail134;
                                if(true)
                                  break Success110;
                              }
                            }
                            term = cast_bounded_conditional_type_0_0.instance.invoke(context, n_56);
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
                          TermReference c_39 = new TermReference();
                          IStrategoTerm d_39 = null;
                          lifted99 lifted990 = new lifted99();
                          lifted96 lifted960 = new lifted96();
                          lifted990.c_39 = c_39;
                          lifted960.c_39 = c_39;
                          term = or_2_0.instance.invoke(context, term, lifted960, lifted990);
                          if(term == null)
                            break Fail136;
                          if(c_39.value == null)
                            break Fail136;
                          term = get_type_of_0_3.instance.invoke(context, c_39.value, n_56, o_56, p_56);
                          if(term == null)
                            break Fail136;
                          d_39 = term;
                          Success112:
                          { 
                            Fail137:
                            { 
                              IStrategoTerm e_39 = null;
                              e_39 = term;
                              term = termFactory.makeTuple(d_39, transform.constNone0);
                              term = equal_0_0.instance.invoke(context, term);
                              if(term == null)
                                break Fail137;
                              term = e_39;
                              { 
                                Success113:
                                { 
                                  Fail138:
                                  { 
                                    IStrategoTerm f_39 = null;
                                    f_39 = term;
                                    term = termFactory.makeTuple(n_56, transform.constNone0);
                                    term = equal_0_0.instance.invoke(context, term);
                                    if(term == null)
                                      break Fail138;
                                    term = f_39;
                                    { 
                                      term = transform.constDouble0;
                                      if(true)
                                        break Success113;
                                    }
                                  }
                                  term = ensure__number_0_0.instance.invoke(context, n_56);
                                  if(term == null)
                                    break Fail136;
                                }
                                if(true)
                                  break Success112;
                              }
                            }
                            term = ensure__number_0_0.instance.invoke(context, d_39);
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
                              IStrategoTerm w_38 = null;
                              w_38 = term;
                              term = fetch_0_0.instance.invoke(context, term);
                              if(term == null)
                                break Fail139;
                              term = get_expr_type_0_3.instance.invoke(context, w_38, term, o_56, p_56);
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
                                IStrategoTerm m_38 = null;
                                m_38 = term;
                                term = fetch_0_0.instance.invoke(context, term);
                                if(term == null)
                                  break Fail140;
                                term = get_expr_type_0_3.instance.invoke(context, m_38, term, o_56, p_56);
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
                                  IStrategoTerm d_38 = null;
                                  d_38 = term.getSubterm(0);
                                  term = d_38;
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
                                                      IStrategoTerm y_36 = null;
                                                      y_36 = term.getSubterm(0);
                                                      term = this.invoke(context, y_36, n_56, o_56, p_56);
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
                                                        IStrategoTerm u_36 = null;
                                                        u_36 = term.getSubterm(0);
                                                        term = this.invoke(context, u_36, n_56, o_56, p_56);
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
                                                          IStrategoTerm q_36 = null;
                                                          q_36 = term.getSubterm(0);
                                                          term = this.invoke(context, q_36, n_56, o_56, p_56);
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
                                                            IStrategoTerm m_36 = null;
                                                            m_36 = term.getSubterm(0);
                                                            term = this.invoke(context, m_36, n_56, o_56, p_56);
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
                                                              IStrategoTerm i_36 = null;
                                                              i_36 = term.getSubterm(0);
                                                              term = this.invoke(context, i_36, n_56, o_56, p_56);
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
                                                                IStrategoTerm e_36 = null;
                                                                e_36 = term.getSubterm(0);
                                                                term = this.invoke(context, e_36, n_56, o_56, p_56);
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
                                                                  IStrategoTerm a_36 = null;
                                                                  a_36 = term.getSubterm(0);
                                                                  term = this.invoke(context, a_36, n_56, o_56, p_56);
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
                                                                    IStrategoTerm w_35 = null;
                                                                    w_35 = term.getSubterm(0);
                                                                    term = this.invoke(context, w_35, n_56, o_56, p_56);
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
                                                                      IStrategoTerm s_35 = null;
                                                                      s_35 = term.getSubterm(0);
                                                                      term = this.invoke(context, s_35, n_56, o_56, p_56);
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
                                                                        IStrategoTerm o_35 = null;
                                                                        o_35 = term.getSubterm(0);
                                                                        term = this.invoke(context, o_35, n_56, o_56, p_56);
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
                                                                          IStrategoTerm k_35 = null;
                                                                          k_35 = term.getSubterm(0);
                                                                          term = this.invoke(context, k_35, n_56, o_56, p_56);
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
                                                                            IStrategoTerm g_35 = null;
                                                                            g_35 = term.getSubterm(0);
                                                                            term = this.invoke(context, g_35, n_56, o_56, p_56);
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
                                                                              IStrategoTerm c_35 = null;
                                                                              c_35 = term.getSubterm(0);
                                                                              term = c_35;
                                                                              if(true)
                                                                                break Success138;
                                                                            }
                                                                            term = term156;
                                                                          }
                                                                          if(cons4 == transform._consCastRef_2)
                                                                          { 
                                                                            IStrategoTerm y_34 = null;
                                                                            y_34 = term.getSubterm(0);
                                                                            term = y_34;
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
              IStrategoTerm x_40 = null;
              x_40 = term.getSubterm(0);
              term = this.invoke(context, x_40);
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
                IStrategoTerm v_40 = null;
                IStrategoTerm w_40 = null;
                v_40 = term.getSubterm(0);
                w_40 = term.getSubterm(1);
                term = termFactory.makeAppl(transform._consAmbName_2, new IStrategoTerm[]{v_40, w_40});
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
                  IStrategoTerm r_40 = null;
                  IStrategoTerm s_40 = null;
                  r_40 = term.getSubterm(0);
                  IStrategoTerm arg127 = term.getSubterm(1);
                  if(arg127.getTermType() != IStrategoTerm.APPL || transform._consId_1 != ((IStrategoAppl)arg127).getConstructor())
                    break Fail167;
                  s_40 = arg127.getSubterm(0);
                  term = this.invoke(context, r_40);
                  if(term == null)
                    break Fail167;
                  term = (IStrategoTerm)termFactory.makeListCons(term, termFactory.makeListCons(transform.const0, termFactory.makeListCons(s_40, (IStrategoList)transform.constNil0)));
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
                    IStrategoTerm q_40 = null;
                    q_40 = term.getSubterm(0);
                    term = this.invoke(context, q_40);
                    if(term == null)
                      break Fail168;
                    if(true)
                      break Success142;
                  }
                  term = term181;
                }
                if(cons5 == transform._consId_1)
                { 
                  IStrategoTerm p_40 = null;
                  p_40 = term.getSubterm(0);
                  term = p_40;
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
        IStrategoTerm z_40 = null;
        IStrategoTerm a_41 = null;
        IStrategoTerm c_41 = null;
        IStrategoTerm h_41 = null;
        IStrategoTerm i_41 = null;
        IStrategoTerm k_41 = null;
        IStrategoTerm p_41 = null;
        IStrategoTerm m_41 = null;
        if(term.getTermType() != IStrategoTerm.LIST || ((IStrategoList)term).isEmpty())
          break Fail170;
        z_40 = ((IStrategoList)term).tail();
        term = debug_0_0.instance.invoke(context, transform.const25);
        if(term == null)
          break Fail170;
        term = debug_0_0.instance.invoke(context, z_40);
        if(term == null)
          break Fail170;
        term = z_40;
        if(term.getTermType() != IStrategoTerm.LIST || ((IStrategoList)term).isEmpty())
          break Fail170;
        k_41 = ((IStrategoList)term).head();
        term = k_41;
        c_41 = k_41;
        term = $Read$From$File_0_0.instance.invoke(context, term);
        if(term == null)
          break Fail170;
        a_41 = term;
        term = z_40;
        if(term.getTermType() != IStrategoTerm.LIST || ((IStrategoList)term).isEmpty())
          break Fail170;
        p_41 = ((IStrategoList)term).tail();
        term = p_41;
        if(term.getTermType() != IStrategoTerm.LIST || ((IStrategoList)term).isEmpty())
          break Fail170;
        m_41 = ((IStrategoList)term).head();
        h_41 = m_41;
        term = transform_0_0.instance.invoke(context, a_41);
        if(term == null)
          break Fail170;
        i_41 = term;
        term = dirname_0_0.instance.invoke(context, c_41);
        if(term == null)
          break Fail170;
        term = base_filename_0_0.instance.invoke(context, c_41);
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
        term = termFactory.makeTuple(h_41, transform.const28);
        term = fopen_0_0.instance.invoke(context, term);
        if(term == null)
          break Fail170;
        term = termFactory.makeTuple(i_41, term);
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

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm u_41)
    { 
      ITermFactory termFactory = context.getFactory();
      context.push("gen_method_state_0_1");
      Fail173:
      { 
        IStrategoTerm w_41 = null;
        if(term.getTermType() != IStrategoTerm.APPL || transform._consMethodSignature_2 != ((IStrategoAppl)term).getConstructor())
          break Fail173;
        IStrategoTerm arg128 = term.getSubterm(0);
        if(arg128.getTermType() != IStrategoTerm.APPL || transform._consId_1 != ((IStrategoAppl)arg128).getConstructor())
          break Fail173;
        w_41 = term;
        term = gen_method_state_name_0_1.instance.invoke(context, w_41, u_41);
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

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm b_42)
    { 
      ITermFactory termFactory = context.getFactory();
      context.push("gen_method_state_name_0_1");
      Fail174:
      { 
        IStrategoTerm c_42 = null;
        IStrategoTerm d_42 = null;
        if(term.getTermType() != IStrategoTerm.APPL || transform._consMethodSignature_2 != ((IStrategoAppl)term).getConstructor())
          break Fail174;
        IStrategoTerm arg130 = term.getSubterm(0);
        if(arg130.getTermType() != IStrategoTerm.APPL || transform._consId_1 != ((IStrategoAppl)arg130).getConstructor())
          break Fail174;
        c_42 = arg130.getSubterm(0);
        d_42 = term;
        term = hashtable_get_0_1.instance.invoke(context, b_42, d_42);
        if(term == null)
          break Fail174;
        term = int_to_string_0_0.instance.invoke(context, term);
        if(term == null)
          break Fail174;
        term = (IStrategoTerm)termFactory.makeListCons(c_42, termFactory.makeListCons(term, (IStrategoList)transform.constCons10));
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

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm i_42)
    { 
      ITermFactory termFactory = context.getFactory();
      context.push("gen_requires_method_name_0_1");
      Fail175:
      { 
        IStrategoTerm j_42 = null;
        IStrategoTerm k_42 = null;
        if(term.getTermType() != IStrategoTerm.APPL || transform._consMethodSignature_2 != ((IStrategoAppl)term).getConstructor())
          break Fail175;
        IStrategoTerm arg132 = term.getSubterm(0);
        if(arg132.getTermType() != IStrategoTerm.APPL || transform._consId_1 != ((IStrategoAppl)arg132).getConstructor())
          break Fail175;
        j_42 = arg132.getSubterm(0);
        k_42 = term;
        term = hashtable_get_0_1.instance.invoke(context, i_42, k_42);
        if(term == null)
          break Fail175;
        term = int_to_string_0_0.instance.invoke(context, term);
        if(term == null)
          break Fail175;
        term = (IStrategoTerm)termFactory.makeListCons(transform.const39, termFactory.makeListCons(j_42, termFactory.makeListCons(term, (IStrategoList)transform.constNil0)));
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

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm p_42)
    { 
      ITermFactory termFactory = context.getFactory();
      context.push("gen_on_entry_method_name_0_1");
      Fail176:
      { 
        IStrategoTerm q_42 = null;
        IStrategoTerm r_42 = null;
        if(term.getTermType() != IStrategoTerm.APPL || transform._consMethodSignature_2 != ((IStrategoAppl)term).getConstructor())
          break Fail176;
        IStrategoTerm arg134 = term.getSubterm(0);
        if(arg134.getTermType() != IStrategoTerm.APPL || transform._consId_1 != ((IStrategoAppl)arg134).getConstructor())
          break Fail176;
        q_42 = arg134.getSubterm(0);
        r_42 = term;
        term = hashtable_get_0_1.instance.invoke(context, p_42, r_42);
        if(term == null)
          break Fail176;
        term = int_to_string_0_0.instance.invoke(context, term);
        if(term == null)
          break Fail176;
        term = (IStrategoTerm)termFactory.makeListCons(transform.const40, termFactory.makeListCons(q_42, termFactory.makeListCons(term, (IStrategoList)transform.constNil0)));
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

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm w_42)
    { 
      ITermFactory termFactory = context.getFactory();
      context.push("gen_on_exit_method_name_0_1");
      Fail177:
      { 
        IStrategoTerm x_42 = null;
        IStrategoTerm y_42 = null;
        if(term.getTermType() != IStrategoTerm.APPL || transform._consMethodSignature_2 != ((IStrategoAppl)term).getConstructor())
          break Fail177;
        IStrategoTerm arg136 = term.getSubterm(0);
        if(arg136.getTermType() != IStrategoTerm.APPL || transform._consId_1 != ((IStrategoAppl)arg136).getConstructor())
          break Fail177;
        x_42 = arg136.getSubterm(0);
        y_42 = term;
        term = hashtable_get_0_1.instance.invoke(context, w_42, y_42);
        if(term == null)
          break Fail177;
        term = int_to_string_0_0.instance.invoke(context, term);
        if(term == null)
          break Fail177;
        term = (IStrategoTerm)termFactory.makeListCons(transform.const41, termFactory.makeListCons(x_42, termFactory.makeListCons(term, (IStrategoList)transform.constNil0)));
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

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm f_43)
    { 
      ITermFactory termFactory = context.getFactory();
      context.push("make_while_condition_0_1");
      Fail178:
      { 
        IStrategoTerm g_43 = null;
        IStrategoTerm h_43 = null;
        IStrategoTerm i_43 = null;
        IStrategoTerm j_43 = null;
        j_43 = term;
        term = length_0_0.instance.invoke(context, f_43);
        if(term == null)
          break Fail178;
        i_43 = term;
        term = j_43;
        IStrategoTerm term185 = term;
        Success143:
        { 
          Fail179:
          { 
            IStrategoTerm k_43 = null;
            IStrategoTerm o_43 = null;
            k_43 = term;
            o_43 = i_43;
            term = equal_0_1.instance.invoke(context, o_43, transform.const18);
            if(term == null)
              break Fail179;
            term = k_43;
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
              IStrategoTerm l_43 = null;
              IStrategoTerm q_43 = null;
              l_43 = term;
              q_43 = i_43;
              term = equal_0_1.instance.invoke(context, q_43, transform.const16);
              if(term == null)
                break Fail180;
              term = l_43;
              { 
                IStrategoTerm m_43 = null;
                term = f_43;
                if(term.getTermType() != IStrategoTerm.LIST || ((IStrategoList)term).isEmpty())
                  break Fail178;
                m_43 = ((IStrategoList)term).head();
                IStrategoTerm arg138 = ((IStrategoList)term).tail();
                if(arg138.getTermType() != IStrategoTerm.LIST || !((IStrategoList)arg138).isEmpty())
                  break Fail178;
                term = m_43;
                if(true)
                  break Success144;
              }
            }
            term = f_43;
            if(term.getTermType() != IStrategoTerm.LIST || ((IStrategoList)term).isEmpty())
              break Fail178;
            h_43 = ((IStrategoList)term).head();
            g_43 = ((IStrategoList)term).tail();
            term = this.invoke(context, term, g_43);
            if(term == null)
              break Fail178;
            term = termFactory.makeAppl(transform._consLazyOr_2, new IStrategoTerm[]{term, h_43});
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

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm t_43)
    { 
      ITermFactory termFactory = context.getFactory();
      context.push("gen_class_head_0_1");
      Fail181:
      { 
        IStrategoTerm v_43 = null;
        IStrategoTerm w_43 = null;
        term = t_43;
        IStrategoTerm term187 = term;
        IStrategoConstructor cons6 = term.getTermType() == IStrategoTerm.APPL ? ((IStrategoAppl)term).getConstructor() : null;
        Success145:
        { 
          if(cons6 == transform._consTypeName_2)
          { 
            Fail182:
            { 
              IStrategoTerm a_185 = null;
              IStrategoTerm arg140 = term.getSubterm(1);
              if(arg140.getTermType() != IStrategoTerm.APPL || transform._consId_1 != ((IStrategoAppl)arg140).getConstructor())
                break Fail182;
              a_185 = arg140.getSubterm(0);
              term = a_185;
              if(true)
                break Success145;
            }
            term = term187;
          }
          if(cons6 == transform._consTypeName_1)
          { 
            IStrategoTerm b_185 = null;
            IStrategoTerm arg141 = term.getSubterm(0);
            if(arg141.getTermType() != IStrategoTerm.APPL || transform._consId_1 != ((IStrategoAppl)arg141).getConstructor())
              break Fail181;
            b_185 = arg141.getSubterm(0);
            term = b_185;
          }
          else
          { 
            break Fail181;
          }
        }
        w_43 = term;
        term = fetch__full__class__name_0_0.instance.invoke(context, t_43);
        if(term == null)
          break Fail181;
        term = (IStrategoTerm)termFactory.makeListCons(termFactory.makeAppl(transform._consAnno_2, new IStrategoTerm[]{transform.constTypeName4, (IStrategoTerm)termFactory.makeListCons(termFactory.makeAppl(transform._consElemValPair_2, new IStrategoTerm[]{transform.constId15, termFactory.makeAppl(transform._consLit_1, new IStrategoTerm[]{termFactory.makeAppl(transform._consString_1, new IStrategoTerm[]{(IStrategoTerm)termFactory.makeListCons(termFactory.makeAppl(transform._consChars_1, new IStrategoTerm[]{term}), (IStrategoList)transform.constNil0)})})}), (IStrategoList)transform.constNil0)}), (IStrategoList)transform.constCons11);
        v_43 = term;
        term = (IStrategoTerm)termFactory.makeListCons(w_43, (IStrategoList)transform.constCons3);
        term = concat_strings_0_0.instance.invoke(context, term);
        if(term == null)
          break Fail181;
        term = termFactory.makeAppl(transform._consClassDecHead_5, new IStrategoTerm[]{v_43, termFactory.makeAppl(transform._consId_1, new IStrategoTerm[]{term}), transform.constNone0, transform.constNone0, transform.constNone0});
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

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm z_43, IStrategoTerm a_44, IStrategoTerm b_44)
    { 
      ITermFactory termFactory = context.getFactory();
      context.push("make_requires_method_0_3");
      Fail183:
      { 
        IStrategoTerm c_44 = null;
        IStrategoTerm d_44 = null;
        IStrategoTerm e_44 = null;
        IStrategoTerm f_44 = null;
        IStrategoTerm g_44 = null;
        if(term.getTermType() != IStrategoTerm.APPL || transform._consMethodSignature_2 != ((IStrategoAppl)term).getConstructor())
          break Fail183;
        IStrategoTerm arg142 = term.getSubterm(0);
        if(arg142.getTermType() != IStrategoTerm.APPL || transform._consId_1 != ((IStrategoAppl)arg142).getConstructor())
          break Fail183;
        c_44 = arg142.getSubterm(0);
        d_44 = term.getSubterm(1);
        g_44 = term;
        term = map_1_0.instance.invoke(context, d_44, pp_type_0_0.instance);
        if(term == null)
          break Fail183;
        term = map_1_0.instance.invoke(context, term, lifted103.instance);
        if(term == null)
          break Fail183;
        term = (IStrategoTerm)termFactory.makeListCons(termFactory.makeAppl(transform._consAnno_2, new IStrategoTerm[]{transform.constTypeName5, (IStrategoTerm)termFactory.makeListCons(termFactory.makeAppl(transform._consElemValPair_2, new IStrategoTerm[]{transform.constId18, termFactory.makeAppl(transform._consLit_1, new IStrategoTerm[]{termFactory.makeAppl(transform._consString_1, new IStrategoTerm[]{(IStrategoTerm)termFactory.makeListCons(termFactory.makeAppl(transform._consChars_1, new IStrategoTerm[]{c_44}), (IStrategoList)transform.constNil0)})})}), termFactory.makeListCons(transform.constElemValPair0, termFactory.makeListCons(termFactory.makeAppl(transform._consElemValPair_2, new IStrategoTerm[]{transform.constId17, termFactory.makeAppl(transform._consElemValArrayInit_1, new IStrategoTerm[]{term})}), (IStrategoList)transform.constNil0)))}), (IStrategoList)transform.constCons2);
        e_44 = term;
        term = gen_requires_method_name_0_1.instance.invoke(context, g_44, b_44);
        if(term == null)
          break Fail183;
        f_44 = term;
        term = hashtable_put_0_2.instance.invoke(context, a_44, g_44, term);
        if(term == null)
          break Fail183;
        term = hashtable_get_0_1.instance.invoke(context, z_43, g_44);
        if(term == null)
          break Fail183;
        term = termFactory.makeAppl(transform._consMethodDec_2, new IStrategoTerm[]{termFactory.makeAppl(transform._consMethodDecHead_6, new IStrategoTerm[]{e_44, transform.constNone0, transform.constBoolean0, termFactory.makeAppl(transform._consId_1, new IStrategoTerm[]{f_44}), transform.constNil0, transform.constNone0}), termFactory.makeAppl(transform._consBlock_1, new IStrategoTerm[]{(IStrategoTerm)termFactory.makeListCons(termFactory.makeAppl(transform._consReturn_1, new IStrategoTerm[]{termFactory.makeAppl(transform._consSome_1, new IStrategoTerm[]{term})}), (IStrategoList)transform.constNil0)})});
        context.popOnSuccess();
        if(true)
          return term;
      }
      context.popOnFailure();
      return null;
    }
  }

  @SuppressWarnings("all") public static class make_on_entry_method_0_4 extends Strategy 
  { 
    public static make_on_entry_method_0_4 instance = new make_on_entry_method_0_4();

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm o_44, IStrategoTerm p_44, IStrategoTerm q_44, IStrategoTerm r_44)
    { 
      ITermFactory termFactory = context.getFactory();
      context.push("make_on_entry_method_0_4");
      Fail184:
      { 
        IStrategoTerm s_44 = null;
        IStrategoTerm t_44 = null;
        IStrategoTerm u_44 = null;
        IStrategoTerm v_44 = null;
        IStrategoTerm w_44 = null;
        if(term.getTermType() != IStrategoTerm.APPL || transform._consMethodSignature_2 != ((IStrategoAppl)term).getConstructor())
          break Fail184;
        IStrategoTerm arg143 = term.getSubterm(0);
        if(arg143.getTermType() != IStrategoTerm.APPL || transform._consId_1 != ((IStrategoAppl)arg143).getConstructor())
          break Fail184;
        s_44 = arg143.getSubterm(0);
        t_44 = term.getSubterm(1);
        w_44 = term;
        term = map_1_0.instance.invoke(context, t_44, pp_type_0_0.instance);
        if(term == null)
          break Fail184;
        term = map_1_0.instance.invoke(context, term, lifted105.instance);
        if(term == null)
          break Fail184;
        term = (IStrategoTerm)termFactory.makeListCons(termFactory.makeAppl(transform._consAnno_2, new IStrategoTerm[]{transform.constTypeName6, (IStrategoTerm)termFactory.makeListCons(termFactory.makeAppl(transform._consElemValPair_2, new IStrategoTerm[]{transform.constId18, termFactory.makeAppl(transform._consLit_1, new IStrategoTerm[]{termFactory.makeAppl(transform._consString_1, new IStrategoTerm[]{(IStrategoTerm)termFactory.makeListCons(termFactory.makeAppl(transform._consChars_1, new IStrategoTerm[]{s_44}), (IStrategoList)transform.constNil0)})})}), termFactory.makeListCons(transform.constElemValPair0, termFactory.makeListCons(termFactory.makeAppl(transform._consElemValPair_2, new IStrategoTerm[]{transform.constId17, termFactory.makeAppl(transform._consElemValArrayInit_1, new IStrategoTerm[]{term})}), (IStrategoList)transform.constNil0)))}), (IStrategoList)transform.constCons2);
        u_44 = term;
        term = gen_on_entry_method_name_0_1.instance.invoke(context, w_44, r_44);
        if(term == null)
          break Fail184;
        v_44 = term;
        term = hashtable_put_0_2.instance.invoke(context, q_44, w_44, term);
        if(term == null)
          break Fail184;
        term = hashtable_get_0_1.instance.invoke(context, o_44, w_44);
        if(term == null)
          break Fail184;
        term = termFactory.makeAppl(transform._consMethodDec_2, new IStrategoTerm[]{termFactory.makeAppl(transform._consMethodDecHead_6, new IStrategoTerm[]{u_44, transform.constNone0, transform.constVoid0, termFactory.makeAppl(transform._consId_1, new IStrategoTerm[]{v_44}), (IStrategoTerm)termFactory.makeListCons(termFactory.makeAppl(transform._consParam_3, new IStrategoTerm[]{transform.constNil0, termFactory.makeAppl(transform._consTypeName_1, new IStrategoTerm[]{termFactory.makeAppl(transform._consId_1, new IStrategoTerm[]{p_44})}), transform.constId0}), (IStrategoList)transform.constNil0), transform.constNone0}), term});
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

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm e_45, IStrategoTerm f_45, IStrategoTerm g_45, IStrategoTerm h_45)
    { 
      ITermFactory termFactory = context.getFactory();
      context.push("make_on_exit_method_0_4");
      Fail185:
      { 
        IStrategoTerm i_45 = null;
        IStrategoTerm j_45 = null;
        IStrategoTerm k_45 = null;
        IStrategoTerm l_45 = null;
        IStrategoTerm m_45 = null;
        if(term.getTermType() != IStrategoTerm.APPL || transform._consMethodSignature_2 != ((IStrategoAppl)term).getConstructor())
          break Fail185;
        IStrategoTerm arg144 = term.getSubterm(0);
        if(arg144.getTermType() != IStrategoTerm.APPL || transform._consId_1 != ((IStrategoAppl)arg144).getConstructor())
          break Fail185;
        i_45 = arg144.getSubterm(0);
        j_45 = term.getSubterm(1);
        m_45 = term;
        term = map_1_0.instance.invoke(context, j_45, pp_type_0_0.instance);
        if(term == null)
          break Fail185;
        term = map_1_0.instance.invoke(context, term, lifted107.instance);
        if(term == null)
          break Fail185;
        term = (IStrategoTerm)termFactory.makeListCons(termFactory.makeAppl(transform._consAnno_2, new IStrategoTerm[]{transform.constTypeName7, (IStrategoTerm)termFactory.makeListCons(termFactory.makeAppl(transform._consElemValPair_2, new IStrategoTerm[]{transform.constId18, termFactory.makeAppl(transform._consLit_1, new IStrategoTerm[]{termFactory.makeAppl(transform._consString_1, new IStrategoTerm[]{(IStrategoTerm)termFactory.makeListCons(termFactory.makeAppl(transform._consChars_1, new IStrategoTerm[]{i_45}), (IStrategoList)transform.constNil0)})})}), termFactory.makeListCons(transform.constElemValPair0, termFactory.makeListCons(termFactory.makeAppl(transform._consElemValPair_2, new IStrategoTerm[]{transform.constId17, termFactory.makeAppl(transform._consElemValArrayInit_1, new IStrategoTerm[]{term})}), (IStrategoList)transform.constNil0)))}), (IStrategoList)transform.constCons2);
        k_45 = term;
        term = gen_on_exit_method_name_0_1.instance.invoke(context, m_45, h_45);
        if(term == null)
          break Fail185;
        l_45 = term;
        term = hashtable_put_0_2.instance.invoke(context, g_45, m_45, term);
        if(term == null)
          break Fail185;
        term = hashtable_get_0_1.instance.invoke(context, e_45, m_45);
        if(term == null)
          break Fail185;
        term = termFactory.makeAppl(transform._consMethodDec_2, new IStrategoTerm[]{termFactory.makeAppl(transform._consMethodDecHead_6, new IStrategoTerm[]{k_45, transform.constNone0, transform.constVoid0, termFactory.makeAppl(transform._consId_1, new IStrategoTerm[]{l_45}), (IStrategoTerm)termFactory.makeListCons(termFactory.makeAppl(transform._consParam_3, new IStrategoTerm[]{transform.constNil0, termFactory.makeAppl(transform._consTypeName_1, new IStrategoTerm[]{termFactory.makeAppl(transform._consId_1, new IStrategoTerm[]{f_45})}), transform.constId0}), (IStrategoList)transform.constNil0), transform.constNone0}), term});
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
      Fail186:
      { 
        IStrategoTerm u_45 = null;
        IStrategoTerm v_45 = null;
        IStrategoTerm w_45 = null;
        IStrategoTerm x_45 = null;
        IStrategoTerm y_45 = null;
        IStrategoTerm z_45 = null;
        IStrategoTerm a_46 = null;
        IStrategoTerm b_46 = null;
        if(term.getTermType() != IStrategoTerm.APPL || transform._consCompilationUnit_3 != ((IStrategoAppl)term).getConstructor())
          break Fail186;
        w_45 = term.getSubterm(0);
        x_45 = term.getSubterm(1);
        v_45 = term.getSubterm(2);
        b_46 = term;
        Success146:
        { 
          Fail187:
          { 
            IStrategoTerm c_46 = null;
            c_46 = term;
            term = get_coordinator_0_1.instance.invoke(context, b_46, v_45);
            if(term == null)
              break Fail187;
            u_45 = term;
            term = c_46;
            { 
              IStrategoTerm f_46 = null;
              term = fetch_coordinator_type_0_0.instance.invoke(context, u_45);
              if(term == null)
                break Fail186;
              y_45 = term;
              term = convert_coordinator_declaration_0_1.instance.invoke(context, u_45, term);
              if(term == null)
                break Fail186;
              z_45 = term;
              term = remove_all_1_0.instance.invoke(context, v_45, lifted108.instance);
              if(term == null)
                break Fail186;
              a_46 = term;
              term = generate_imports_0_2.instance.invoke(context, term, x_45, y_45);
              if(term == null)
                break Fail186;
              f_46 = term;
              term = termFactory.makeTuple((IStrategoTerm)termFactory.makeListCons(z_45, (IStrategoList)transform.constNil0), a_46);
              term = conc_0_0.instance.invoke(context, term);
              if(term == null)
                break Fail186;
              term = termFactory.makeAppl(transform._consCompilationUnit_3, new IStrategoTerm[]{w_45, f_46, term});
              if(true)
                break Success146;
            }
          }
          term = b_46;
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

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm j_46, IStrategoTerm k_46)
    { 
      ITermFactory termFactory = context.getFactory();
      context.push("generate_imports_0_2");
      Fail188:
      { 
        term = termFactory.makeTuple(j_46, (IStrategoTerm)termFactory.makeListCons(termFactory.makeAppl(transform._consTypeImportDec_1, new IStrategoTerm[]{k_46}), (IStrategoList)transform.constNil0), transform.constCons14, transform.constCons17);
        term = conc_0_0.instance.invoke(context, term);
        if(term == null)
          break Fail188;
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

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm l_46)
    { 
      context.push("get_coordinator_0_1");
      Fail189:
      { 
        term = getfirst_1_0.instance.invoke(context, l_46, lifted109.instance);
        if(term == null)
          break Fail189;
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
      Fail190:
      { 
        IStrategoTerm n_46 = null;
        IStrategoTerm o_46 = null;
        if(term.getTermType() != IStrategoTerm.APPL || transform._consCoordinatorDec_2 != ((IStrategoAppl)term).getConstructor())
          break Fail190;
        n_46 = term.getSubterm(0);
        term = n_46;
        if(term.getTermType() != IStrategoTerm.APPL || transform._consCoordinatorDecHead_1 != ((IStrategoAppl)term).getConstructor())
          break Fail190;
        o_46 = term.getSubterm(0);
        term = o_46;
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

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm r_46)
    { 
      ITermFactory termFactory = context.getFactory();
      context.push("convert_coordinator_declaration_0_1");
      Fail191:
      { 
        IStrategoTerm t_46 = null;
        IStrategoTerm u_46 = null;
        IStrategoTerm x_46 = null;
        IStrategoTerm a_47 = null;
        if(term.getTermType() != IStrategoTerm.APPL || transform._consCoordinatorDec_2 != ((IStrategoAppl)term).getConstructor())
          break Fail191;
        t_46 = term.getSubterm(1);
        x_46 = term;
        IStrategoTerm term189 = term;
        Success147:
        { 
          Fail192:
          { 
            term = r_46;
            IStrategoTerm term190 = term;
            IStrategoConstructor cons7 = term.getTermType() == IStrategoTerm.APPL ? ((IStrategoAppl)term).getConstructor() : null;
            Success148:
            { 
              if(cons7 == transform._consTypeName_2)
              { 
                Fail193:
                { 
                  IStrategoTerm c_185 = null;
                  IStrategoTerm arg150 = term.getSubterm(1);
                  if(arg150.getTermType() != IStrategoTerm.APPL || transform._consId_1 != ((IStrategoAppl)arg150).getConstructor())
                    break Fail193;
                  c_185 = arg150.getSubterm(0);
                  term = c_185;
                  if(true)
                    break Success148;
                }
                term = term190;
              }
              if(cons7 == transform._consTypeName_1)
              { 
                IStrategoTerm d_185 = null;
                IStrategoTerm arg151 = term.getSubterm(0);
                if(arg151.getTermType() != IStrategoTerm.APPL || transform._consId_1 != ((IStrategoAppl)arg151).getConstructor())
                  break Fail192;
                d_185 = arg151.getSubterm(0);
                term = d_185;
              }
              else
              { 
                break Fail192;
              }
            }
            u_46 = term;
            if(true)
              break Success147;
          }
          term = term189;
          IStrategoTerm v_46 = null;
          IStrategoTerm w_46 = null;
          IStrategoTerm z_46 = null;
          v_46 = term;
          term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
          if(term == null)
            break Fail191;
          w_46 = term;
          z_46 = v_46;
          term = report_with_failure_0_2.instance.invoke(context, z_46, transform.const52, w_46);
          if(term == null)
            break Fail191;
        }
        term = x_46;
        term = gen_class_head_0_1.instance.invoke(context, term, r_46);
        if(term == null)
          break Fail191;
        a_47 = term;
        term = gen_coordinator_body_0_1.instance.invoke(context, t_46, u_46);
        if(term == null)
          break Fail191;
        term = termFactory.makeAppl(transform._consClassDec_2, new IStrategoTerm[]{a_47, term});
        term = add__externals_0_1.instance.invoke(context, term, u_46);
        if(term == null)
          break Fail191;
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

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm ref_g_47)
    { 
      ITermFactory termFactory = context.getFactory();
      TermReference g_47 = new TermReference(ref_g_47);
      context.push("gen_coordinator_body_0_1");
      Fail194:
      { 
        TermReference h_47 = new TermReference();
        TermReference i_47 = new TermReference();
        TermReference j_47 = new TermReference();
        IStrategoTerm k_47 = null;
        TermReference l_47 = new TermReference();
        TermReference m_47 = new TermReference();
        IStrategoTerm n_47 = null;
        IStrategoTerm o_47 = null;
        TermReference p_47 = new TermReference();
        TermReference q_47 = new TermReference();
        TermReference r_47 = new TermReference();
        TermReference s_47 = new TermReference();
        IStrategoTerm w_47 = null;
        IStrategoTerm r_48 = null;
        IStrategoTerm z_48 = null;
        IStrategoTerm s_48 = null;
        IStrategoTerm a_49 = null;
        IStrategoTerm t_48 = null;
        IStrategoTerm b_49 = null;
        IStrategoTerm u_48 = null;
        IStrategoTerm c_49 = null;
        IStrategoTerm v_48 = null;
        IStrategoTerm d_49 = null;
        IStrategoTerm w_48 = null;
        IStrategoTerm e_49 = null;
        IStrategoTerm x_48 = null;
        IStrategoTerm f_49 = null;
        if(term.getTermType() != IStrategoTerm.APPL || transform._consCoordinatorBody_1 != ((IStrategoAppl)term).getConstructor())
          break Fail194;
        o_47 = term.getSubterm(0);
        w_47 = term;
        IStrategoTerm term191 = term;
        Success149:
        { 
          Fail195:
          { 
            term = new_hashtable_0_0.instance.invoke(context, term);
            if(term == null)
              break Fail195;
            if(p_47.value == null)
              p_47.value = term;
            else
              if(p_47.value != term && !p_47.value.match(term))
                break Fail195;
            term = new_hashtable_0_0.instance.invoke(context, term);
            if(term == null)
              break Fail195;
            if(q_47.value == null)
              q_47.value = term;
            else
              if(q_47.value != term && !q_47.value.match(term))
                break Fail195;
            term = new_hashtable_0_0.instance.invoke(context, term);
            if(term == null)
              break Fail195;
            if(r_47.value == null)
              r_47.value = term;
            else
              if(r_47.value != term && !r_47.value.match(term))
                break Fail195;
            term = new_hashtable_0_0.instance.invoke(context, term);
            if(term == null)
              break Fail195;
            if(h_47.value == null)
              h_47.value = term;
            else
              if(h_47.value != term && !h_47.value.match(term))
                break Fail195;
            term = new_hashtable_0_0.instance.invoke(context, term);
            if(term == null)
              break Fail195;
            if(i_47.value == null)
              i_47.value = term;
            else
              if(i_47.value != term && !i_47.value.match(term))
                break Fail195;
            term = new_hashtable_0_0.instance.invoke(context, term);
            if(term == null)
              break Fail195;
            if(j_47.value == null)
              j_47.value = term;
            else
              if(j_47.value != term && !j_47.value.match(term))
                break Fail195;
            term = new_hashtable_0_0.instance.invoke(context, term);
            if(term == null)
              break Fail195;
            if(s_47.value == null)
              s_47.value = term;
            else
              if(s_47.value != term && !s_47.value.match(term))
                break Fail195;
            term = getfirst_1_0.instance.invoke(context, o_47, lifted110.instance);
            if(term == null)
              break Fail195;
            k_47 = term;
            term = getfirst_1_0.instance.invoke(context, o_47, lifted111.instance);
            if(term == null)
              break Fail195;
            term = get_methods_list_0_0.instance.invoke(context, term);
            if(term == null)
              break Fail195;
            if(l_47.value == null)
              l_47.value = term;
            else
              if(l_47.value != term && !l_47.value.match(term))
                break Fail195;
            term = getfirst_1_0.instance.invoke(context, o_47, lifted112.instance);
            if(term == null)
              break Fail195;
            term = get_methods_list_0_0.instance.invoke(context, term);
            if(term == null)
              break Fail195;
            if(m_47.value == null)
              m_47.value = term;
            else
              if(m_47.value != term && !m_47.value.match(term))
                break Fail195;
            if(l_47.value == null || m_47.value == null)
              break Fail195;
            term = termFactory.makeTuple(l_47.value, m_47.value);
            term = union_0_0.instance.invoke(context, term);
            if(term == null)
              break Fail195;
            n_47 = term;
            lifted113 lifted1130 = new lifted113();
            lifted1130.s_47 = s_47;
            term = map_1_0.instance.invoke(context, term, lifted1130);
            if(term == null)
              break Fail195;
            term = retain_all_1_0.instance.invoke(context, o_47, lifted114.instance);
            if(term == null)
              break Fail195;
            lifted115 lifted1150 = new lifted115();
            lifted1150.p_47 = p_47;
            lifted1150.q_47 = q_47;
            lifted1150.r_47 = r_47;
            lifted1150.s_47 = s_47;
            term = map_1_0.instance.invoke(context, term, lifted1150);
            if(term == null)
              break Fail195;
            if(true)
              break Success149;
          }
          term = term191;
          IStrategoTerm u_47 = null;
          IStrategoTerm v_47 = null;
          IStrategoTerm o_48 = null;
          u_47 = term;
          term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
          if(term == null)
            break Fail194;
          v_47 = term;
          o_48 = u_47;
          term = report_with_failure_0_2.instance.invoke(context, o_48, transform.const53, v_47);
          if(term == null)
            break Fail194;
        }
        term = w_47;
        z_48 = term;
        if(k_47 == null)
          break Fail194;
        term = add_condition_fields_0_0.instance.invoke(context, k_47);
        if(term == null)
          break Fail194;
        r_48 = term;
        a_49 = z_48;
        term = add_coordinator_fields_0_0.instance.invoke(context, o_47);
        if(term == null)
          break Fail194;
        s_48 = term;
        term = a_49;
        b_49 = a_49;
        if(n_47 == null)
          break Fail194;
        term = n_47;
        lifted116 lifted1160 = new lifted116();
        lifted1160.s_47 = s_47;
        term = map_1_0.instance.invoke(context, term, lifted1160);
        if(term == null)
          break Fail194;
        t_48 = term;
        term = b_49;
        c_49 = b_49;
        term = gen_is$Run$By$Others_method_0_0.instance.invoke(context, term);
        if(term == null)
          break Fail194;
        u_48 = term;
        term = c_49;
        d_49 = c_49;
        if(p_47.value == null)
          break Fail194;
        term = hashtable_keys_0_0.instance.invoke(context, p_47.value);
        if(term == null)
          break Fail194;
        lifted117 lifted1170 = new lifted117();
        lifted1170.p_47 = p_47;
        lifted1170.h_47 = h_47;
        lifted1170.s_47 = s_47;
        term = map_1_0.instance.invoke(context, term, lifted1170);
        if(term == null)
          break Fail194;
        v_48 = term;
        term = d_49;
        e_49 = d_49;
        if(r_47.value == null)
          break Fail194;
        term = hashtable_keys_0_0.instance.invoke(context, r_47.value);
        if(term == null)
          break Fail194;
        lifted118 lifted1180 = new lifted118();
        lifted1180.r_47 = r_47;
        lifted1180.g_47 = g_47;
        lifted1180.j_47 = j_47;
        lifted1180.s_47 = s_47;
        term = map_1_0.instance.invoke(context, term, lifted1180);
        if(term == null)
          break Fail194;
        w_48 = term;
        term = e_49;
        f_49 = e_49;
        if(q_47.value == null)
          break Fail194;
        term = hashtable_keys_0_0.instance.invoke(context, q_47.value);
        if(term == null)
          break Fail194;
        lifted119 lifted1190 = new lifted119();
        lifted1190.q_47 = q_47;
        lifted1190.g_47 = g_47;
        lifted1190.i_47 = i_47;
        lifted1190.s_47 = s_47;
        term = map_1_0.instance.invoke(context, term, lifted1190);
        if(term == null)
          break Fail194;
        x_48 = term;
        term = f_49;
        if(n_47 == null)
          break Fail194;
        term = n_47;
        lifted120 lifted1200 = new lifted120();
        lifted1200.g_47 = g_47;
        lifted1200.i_47 = i_47;
        lifted1200.h_47 = h_47;
        lifted1200.j_47 = j_47;
        lifted1200.l_47 = l_47;
        lifted1200.m_47 = m_47;
        lifted1200.s_47 = s_47;
        term = map_1_0.instance.invoke(context, term, lifted1200);
        if(term == null)
          break Fail194;
        term = concat_0_0.instance.invoke(context, term);
        if(term == null)
          break Fail194;
        term = termFactory.makeTuple(r_48, s_48, t_48, (IStrategoTerm)termFactory.makeListCons(u_48, (IStrategoList)transform.constNil0), v_48, w_48, x_48, term);
        term = conc_0_0.instance.invoke(context, term);
        if(term == null)
          break Fail194;
        term = termFactory.makeAppl(transform._consClassBody_1, new IStrategoTerm[]{term});
        context.popOnSuccess();
        if(true)
          return term;
      }
      context.popOnFailure();
      return null;
    }
  }

  @SuppressWarnings("all") public static class make_lock_and_unlock_methods_0_7 extends Strategy 
  { 
    public static make_lock_and_unlock_methods_0_7 instance = new make_lock_and_unlock_methods_0_7();

    public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm h_49, IStrategoTerm i_49, IStrategoTerm j_49, IStrategoTerm k_49, IStrategoTerm l_49, IStrategoTerm m_49, IStrategoTerm n_49)
    { 
      ITermFactory termFactory = context.getFactory();
      context.push("make_lock_and_unlock_methods_0_7");
      Fail196:
      { 
        IStrategoTerm o_49 = null;
        IStrategoTerm p_49 = null;
        o_49 = term;
        term = make_lock_method_0_6.instance.invokeDynamic(context, o_49, NO_STRATEGIES, new IStrategoTerm[]{h_49, j_49, k_49, l_49, m_49, n_49});
        if(term == null)
          break Fail196;
        p_49 = term;
        term = make_unlock_method_0_3.instance.invoke(context, o_49, h_49, i_49, n_49);
        if(term == null)
          break Fail196;
        term = (IStrategoTerm)termFactory.makeListCons(p_49, termFactory.makeListCons(term, (IStrategoList)transform.constNil0));
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

  @SuppressWarnings("all") public static class make_unlock_method_0_3 extends Strategy 
  { 
    public static make_unlock_method_0_3 instance = new make_unlock_method_0_3();

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm v_49, IStrategoTerm w_49, IStrategoTerm x_49)
    { 
      ITermFactory termFactory = context.getFactory();
      context.push("make_unlock_method_0_3");
      Fail197:
      { 
        IStrategoTerm y_49 = null;
        IStrategoTerm z_49 = null;
        IStrategoTerm a_50 = null;
        IStrategoTerm b_50 = null;
        IStrategoTerm c_50 = null;
        IStrategoTerm d_50 = null;
        IStrategoTerm j_50 = null;
        IStrategoTerm u_50 = null;
        IStrategoTerm v_50 = null;
        if(term.getTermType() != IStrategoTerm.APPL || transform._consMethodSignature_2 != ((IStrategoAppl)term).getConstructor())
          break Fail197;
        IStrategoTerm arg159 = term.getSubterm(0);
        if(arg159.getTermType() != IStrategoTerm.APPL || transform._consId_1 != ((IStrategoAppl)arg159).getConstructor())
          break Fail197;
        y_49 = arg159.getSubterm(0);
        z_49 = term.getSubterm(1);
        j_50 = term;
        IStrategoTerm term192 = term;
        Success150:
        { 
          Fail198:
          { 
            b_50 = term;
            term = map_1_0.instance.invoke(context, z_49, pp_type_0_0.instance);
            if(term == null)
              break Fail198;
            term = map_1_0.instance.invoke(context, term, lifted122.instance);
            if(term == null)
              break Fail198;
            term = (IStrategoTerm)termFactory.makeListCons(termFactory.makeAppl(transform._consAnno_2, new IStrategoTerm[]{transform.constTypeName8, (IStrategoTerm)termFactory.makeListCons(termFactory.makeAppl(transform._consElemValPair_2, new IStrategoTerm[]{transform.constId18, termFactory.makeAppl(transform._consLit_1, new IStrategoTerm[]{termFactory.makeAppl(transform._consString_1, new IStrategoTerm[]{(IStrategoTerm)termFactory.makeListCons(termFactory.makeAppl(transform._consChars_1, new IStrategoTerm[]{y_49}), (IStrategoList)transform.constNil0)})})}), termFactory.makeListCons(transform.constElemValPair0, termFactory.makeListCons(termFactory.makeAppl(transform._consElemValPair_2, new IStrategoTerm[]{transform.constId17, termFactory.makeAppl(transform._consElemValArrayInit_1, new IStrategoTerm[]{term})}), (IStrategoList)transform.constNil0)))}), (IStrategoList)transform.constCons19);
            a_50 = term;
            Success151:
            { 
              Fail199:
              { 
                IStrategoTerm f_50 = null;
                f_50 = term;
                term = hashtable_keys_0_0.instance.invoke(context, w_49);
                if(term == null)
                  break Fail199;
                term = termFactory.makeTuple(b_50, term);
                term = elem_0_0.instance.invoke(context, term);
                if(term == null)
                  break Fail199;
                term = f_50;
                { 
                  term = hashtable_get_0_1.instance.invoke(context, w_49, b_50);
                  if(term == null)
                    break Fail198;
                  term = termFactory.makeAppl(transform._consExprStm_1, new IStrategoTerm[]{termFactory.makeAppl(transform._consInvoke_2, new IStrategoTerm[]{termFactory.makeAppl(transform._consMethod_1, new IStrategoTerm[]{termFactory.makeAppl(transform._consMethodName_1, new IStrategoTerm[]{termFactory.makeAppl(transform._consId_1, new IStrategoTerm[]{term})})}), transform.constCons1})});
                  c_50 = term;
                  if(true)
                    break Success151;
                }
              }
              term = transform.constNone0;
              c_50 = transform.constNone0;
            }
            term = gen_method_state_name_0_1.instance.invoke(context, b_50, x_49);
            if(term == null)
              break Fail198;
            term = termFactory.makeTuple((IStrategoTerm)termFactory.makeListCons(termFactory.makeAppl(transform._consExprStm_1, new IStrategoTerm[]{termFactory.makeAppl(transform._consInvoke_2, new IStrategoTerm[]{termFactory.makeAppl(transform._consMethod_1, new IStrategoTerm[]{termFactory.makeAppl(transform._consMethodName_2, new IStrategoTerm[]{termFactory.makeAppl(transform._consAmbName_1, new IStrategoTerm[]{termFactory.makeAppl(transform._consId_1, new IStrategoTerm[]{term})}), transform.constId26})}), transform.constCons7})}), (IStrategoList)transform.constNil0), (IStrategoTerm)termFactory.makeListCons(c_50, (IStrategoList)transform.constNil0), transform.constCons20);
            term = conc_0_0.instance.invoke(context, term);
            if(term == null)
              break Fail198;
            d_50 = term;
            if(true)
              break Success150;
          }
          term = term192;
          IStrategoTerm h_50 = null;
          IStrategoTerm i_50 = null;
          IStrategoTerm t_50 = null;
          h_50 = term;
          term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
          if(term == null)
            break Fail197;
          i_50 = term;
          t_50 = h_50;
          term = report_with_failure_0_2.instance.invoke(context, t_50, transform.const57, i_50);
          if(term == null)
            break Fail197;
        }
        v_50 = j_50;
        term = (IStrategoTerm)termFactory.makeListCons(transform.const58, termFactory.makeListCons(y_49, (IStrategoList)transform.constNil0));
        term = concat_strings_0_0.instance.invoke(context, term);
        if(term == null)
          break Fail197;
        u_50 = term;
        term = v_50;
        if(a_50 == null || d_50 == null)
          break Fail197;
        term = termFactory.makeAppl(transform._consMethodDec_2, new IStrategoTerm[]{termFactory.makeAppl(transform._consMethodDecHead_6, new IStrategoTerm[]{a_50, transform.constNone0, transform.constVoid0, termFactory.makeAppl(transform._consId_1, new IStrategoTerm[]{u_50}), (IStrategoTerm)termFactory.makeListCons(termFactory.makeAppl(transform._consParam_3, new IStrategoTerm[]{transform.constNil0, termFactory.makeAppl(transform._consTypeName_1, new IStrategoTerm[]{termFactory.makeAppl(transform._consId_1, new IStrategoTerm[]{v_49})}), transform.constId0}), (IStrategoList)transform.constNil0), transform.constNone0}), termFactory.makeAppl(transform._consBlock_1, new IStrategoTerm[]{d_50})});
        context.popOnSuccess();
        if(true)
          return term;
      }
      context.popOnFailure();
      return null;
    }
  }

  @SuppressWarnings("all") public static class make_lock_method_0_6 extends Strategy 
  { 
    public static make_lock_method_0_6 instance = new make_lock_method_0_6();

    public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm y_50, IStrategoTerm z_50, IStrategoTerm a_51, IStrategoTerm b_51, IStrategoTerm c_51, IStrategoTerm ref_d_51)
    { 
      ITermFactory termFactory = context.getFactory();
      TermReference d_51 = new TermReference(ref_d_51);
      context.push("make_lock_method_0_6");
      Fail200:
      { 
        IStrategoTerm e_51 = null;
        IStrategoTerm f_51 = null;
        IStrategoTerm h_51 = null;
        IStrategoTerm i_51 = null;
        IStrategoTerm l_51 = null;
        IStrategoTerm n_51 = null;
        IStrategoTerm o_51 = null;
        IStrategoTerm p_51 = null;
        IStrategoTerm r_51 = null;
        IStrategoTerm s_51 = null;
        TermReference t_51 = new TermReference();
        IStrategoTerm u_51 = null;
        IStrategoTerm g_52 = null;
        IStrategoTerm g_53 = null;
        IStrategoTerm h_53 = null;
        if(term.getTermType() != IStrategoTerm.APPL || transform._consMethodSignature_2 != ((IStrategoAppl)term).getConstructor())
          break Fail200;
        IStrategoTerm arg160 = term.getSubterm(0);
        if(arg160.getTermType() != IStrategoTerm.APPL || transform._consId_1 != ((IStrategoAppl)arg160).getConstructor())
          break Fail200;
        e_51 = arg160.getSubterm(0);
        f_51 = term.getSubterm(1);
        g_52 = term;
        IStrategoTerm term194 = term;
        Success152:
        { 
          Fail201:
          { 
            IStrategoTerm v_52 = null;
            IStrategoTerm y_52 = null;
            IStrategoTerm a_53 = null;
            IStrategoTerm b_53 = null;
            IStrategoTerm e_185 = null;
            if(t_51.value == null)
              t_51.value = term;
            else
              if(t_51.value != term && !t_51.value.match(term))
                break Fail201;
            term = map_1_0.instance.invoke(context, f_51, pp_type_0_0.instance);
            if(term == null)
              break Fail201;
            term = map_1_0.instance.invoke(context, term, lifted124.instance);
            if(term == null)
              break Fail201;
            term = (IStrategoTerm)termFactory.makeListCons(termFactory.makeAppl(transform._consAnno_2, new IStrategoTerm[]{transform.constTypeName9, (IStrategoTerm)termFactory.makeListCons(termFactory.makeAppl(transform._consElemValPair_2, new IStrategoTerm[]{transform.constId18, termFactory.makeAppl(transform._consLit_1, new IStrategoTerm[]{termFactory.makeAppl(transform._consString_1, new IStrategoTerm[]{(IStrategoTerm)termFactory.makeListCons(termFactory.makeAppl(transform._consChars_1, new IStrategoTerm[]{e_51}), (IStrategoList)transform.constNil0)})})}), termFactory.makeListCons(transform.constElemValPair0, termFactory.makeListCons(termFactory.makeAppl(transform._consElemValPair_2, new IStrategoTerm[]{transform.constId17, termFactory.makeAppl(transform._consElemValArrayInit_1, new IStrategoTerm[]{term})}), (IStrategoList)transform.constNil0)))}), (IStrategoList)transform.constCons19);
            h_51 = term;
            Success153:
            { 
              Fail202:
              { 
                IStrategoTerm w_51 = null;
                w_51 = term;
                if(t_51.value == null)
                  break Fail202;
                term = termFactory.makeTuple(t_51.value, c_51);
                term = elem_0_0.instance.invoke(context, term);
                if(term == null)
                  break Fail202;
                term = w_51;
                { 
                  term = c_51;
                  lifted125 lifted1250 = new lifted125();
                  lifted1250.t_51 = t_51;
                  term = remove_all_1_0.instance.invoke(context, term, lifted1250);
                  if(term == null)
                    break Fail201;
                  i_51 = term;
                  if(true)
                    break Success153;
                }
              }
              term = transform.constNil0;
              i_51 = transform.constNil0;
            }
            Success154:
            { 
              Fail203:
              { 
                IStrategoTerm x_51 = null;
                x_51 = term;
                if(t_51.value == null)
                  break Fail203;
                term = termFactory.makeTuple(t_51.value, b_51);
                term = elem_0_0.instance.invoke(context, term);
                if(term == null)
                  break Fail203;
                term = x_51;
                { 
                  if(t_51.value == null)
                    break Fail201;
                  term = termFactory.makeTuple((IStrategoTerm)termFactory.makeListCons(t_51.value, (IStrategoList)transform.constNil0), i_51);
                  term = conc_0_0.instance.invoke(context, term);
                  if(term == null)
                    break Fail201;
                  l_51 = term;
                  if(true)
                    break Success154;
                }
              }
              term = i_51;
              l_51 = i_51;
            }
            term = l_51;
            lifted126 lifted1260 = new lifted126();
            lifted1260.d_51 = d_51;
            term = map_1_0.instance.invoke(context, term, lifted1260);
            if(term == null)
              break Fail201;
            o_51 = term;
            Success155:
            { 
              Fail204:
              { 
                IStrategoTerm z_51 = null;
                IStrategoTerm q_52 = null;
                IStrategoTerm r_52 = null;
                z_51 = term;
                r_52 = term;
                term = hashtable_keys_0_0.instance.invoke(context, z_50);
                if(term == null)
                  break Fail204;
                q_52 = term;
                term = r_52;
                if(t_51.value == null)
                  break Fail204;
                term = termFactory.makeTuple(t_51.value, q_52);
                term = elem_0_0.instance.invoke(context, term);
                if(term == null)
                  break Fail204;
                term = z_51;
                { 
                  term = hashtable_get_0_1.instance.invoke(context, z_50, t_51.value);
                  if(term == null)
                    break Fail201;
                  term = termFactory.makeAppl(transform._consInvoke_2, new IStrategoTerm[]{termFactory.makeAppl(transform._consMethod_1, new IStrategoTerm[]{termFactory.makeAppl(transform._consMethodName_1, new IStrategoTerm[]{termFactory.makeAppl(transform._consId_1, new IStrategoTerm[]{term})})}), transform.constNil0});
                  term = termFactory.makeAppl(transform._consNot_1, new IStrategoTerm[]{term});
                  n_51 = term;
                  IStrategoList list0;
                  list0 = checkListTail(o_51);
                  if(list0 == null)
                    break Fail201;
                  term = (IStrategoTerm)termFactory.makeListCons(n_51, list0);
                  p_51 = term;
                  if(true)
                    break Success155;
                }
              }
              term = o_51;
              p_51 = o_51;
            }
            v_52 = term;
            term = reverse_0_0.instance.invoke(context, p_51);
            if(term == null)
              break Fail201;
            term = make_while_condition_0_1.instance.invoke(context, v_52, term);
            if(term == null)
              break Fail201;
            r_51 = term;
            Success156:
            { 
              Fail205:
              { 
                IStrategoTerm c_52 = null;
                IStrategoTerm w_52 = null;
                IStrategoTerm x_52 = null;
                c_52 = term;
                x_52 = term;
                term = hashtable_keys_0_0.instance.invoke(context, a_51);
                if(term == null)
                  break Fail205;
                w_52 = term;
                term = x_52;
                if(t_51.value == null)
                  break Fail205;
                term = termFactory.makeTuple(t_51.value, w_52);
                term = elem_0_0.instance.invoke(context, term);
                if(term == null)
                  break Fail205;
                term = c_52;
                { 
                  term = hashtable_get_0_1.instance.invoke(context, a_51, t_51.value);
                  if(term == null)
                    break Fail201;
                  term = termFactory.makeAppl(transform._consExprStm_1, new IStrategoTerm[]{termFactory.makeAppl(transform._consInvoke_2, new IStrategoTerm[]{termFactory.makeAppl(transform._consMethod_1, new IStrategoTerm[]{termFactory.makeAppl(transform._consMethodName_1, new IStrategoTerm[]{termFactory.makeAppl(transform._consId_1, new IStrategoTerm[]{term})})}), transform.constCons1})});
                  s_51 = term;
                  if(true)
                    break Success156;
                }
              }
              term = transform.constNone0;
              s_51 = transform.constNone0;
            }
            a_53 = term;
            b_53 = transform.constCons24;
            e_185 = r_51;
            term = termFactory.makeAppl(transform._consWhile_2, new IStrategoTerm[]{e_185, termFactory.makeAppl(transform._consBlock_1, new IStrategoTerm[]{b_53})});
            y_52 = term;
            term = a_53;
            if(t_51.value == null)
              break Fail201;
            term = gen_method_state_name_0_1.instance.invoke(context, t_51.value, d_51.value);
            if(term == null)
              break Fail201;
            term = termFactory.makeTuple((IStrategoTerm)termFactory.makeListCons(y_52, (IStrategoList)transform.constNil0), (IStrategoTerm)termFactory.makeListCons(s_51, (IStrategoList)transform.constNil0), (IStrategoTerm)termFactory.makeListCons(termFactory.makeAppl(transform._consExprStm_1, new IStrategoTerm[]{termFactory.makeAppl(transform._consInvoke_2, new IStrategoTerm[]{termFactory.makeAppl(transform._consMethod_1, new IStrategoTerm[]{termFactory.makeAppl(transform._consMethodName_2, new IStrategoTerm[]{termFactory.makeAppl(transform._consAmbName_1, new IStrategoTerm[]{termFactory.makeAppl(transform._consId_1, new IStrategoTerm[]{term})}), transform.constId32})}), transform.constCons7})}), (IStrategoList)transform.constNil0));
            term = conc_0_0.instance.invoke(context, term);
            if(term == null)
              break Fail201;
            u_51 = term;
            if(true)
              break Success152;
          }
          term = term194;
          IStrategoTerm e_52 = null;
          IStrategoTerm f_52 = null;
          IStrategoTerm f_53 = null;
          e_52 = term;
          term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
          if(term == null)
            break Fail200;
          f_52 = term;
          f_53 = e_52;
          term = report_with_failure_0_2.instance.invoke(context, f_53, transform.const64, f_52);
          if(term == null)
            break Fail200;
        }
        h_53 = g_52;
        term = (IStrategoTerm)termFactory.makeListCons(transform.const65, termFactory.makeListCons(e_51, (IStrategoList)transform.constNil0));
        term = concat_strings_0_0.instance.invoke(context, term);
        if(term == null)
          break Fail200;
        g_53 = term;
        term = h_53;
        if(h_51 == null || u_51 == null)
          break Fail200;
        term = termFactory.makeAppl(transform._consMethodDec_2, new IStrategoTerm[]{termFactory.makeAppl(transform._consMethodDecHead_6, new IStrategoTerm[]{h_51, transform.constNone0, transform.constVoid0, termFactory.makeAppl(transform._consId_1, new IStrategoTerm[]{g_53}), (IStrategoTerm)termFactory.makeListCons(termFactory.makeAppl(transform._consParam_3, new IStrategoTerm[]{transform.constNil0, termFactory.makeAppl(transform._consTypeName_1, new IStrategoTerm[]{termFactory.makeAppl(transform._consId_1, new IStrategoTerm[]{y_50})}), transform.constId0}), (IStrategoList)transform.constNil0), transform.constNone0}), termFactory.makeAppl(transform._consBlock_1, new IStrategoTerm[]{u_51})});
        context.popOnSuccess();
        if(true)
          return term;
      }
      context.popOnFailure();
      return null;
    }

    @Override public IStrategoTerm invokeDynamic(Context context, IStrategoTerm term, Strategy[] sargs, IStrategoTerm[] targs)
    { 
      if(sargs == null || targs == null || sargs.length != 0 || targs.length != 6)
        throw new IllegalArgumentException("Illegal arguments for " + getName());
      return invoke(context, term, targs[0], targs[1], targs[2], targs[3], targs[4], targs[5]);
    }
  }

  @SuppressWarnings("all") public static class fill$Method$Maps_0_4 extends Strategy 
  { 
    public static fill$Method$Maps_0_4 instance = new fill$Method$Maps_0_4();

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm k_53, IStrategoTerm l_53, IStrategoTerm m_53, IStrategoTerm n_53)
    { 
      ITermFactory termFactory = context.getFactory();
      context.push("fillMethodMaps_0_4");
      Fail206:
      { 
        IStrategoTerm o_53 = null;
        IStrategoTerm p_53 = null;
        IStrategoTerm q_53 = null;
        IStrategoTerm r_53 = null;
        if(term.getTermType() != IStrategoTerm.APPL || transform._consMethodAdditions_4 != ((IStrategoAppl)term).getConstructor())
          break Fail206;
        q_53 = term.getSubterm(0);
        o_53 = term.getSubterm(1);
        p_53 = term.getSubterm(2);
        r_53 = term.getSubterm(3);
        IStrategoTerm term199 = term;
        Success157:
        { 
          Fail207:
          { 
            IStrategoTerm term200 = term;
            Success158:
            { 
              Fail208:
              { 
                IStrategoTerm s_53 = null;
                s_53 = term;
                IStrategoTerm term201 = term;
                Success159:
                { 
                  Fail209:
                  { 
                    term = termFactory.makeTuple(o_53, transform.constNone0);
                    term = equal_0_0.instance.invoke(context, term);
                    if(term == null)
                      break Fail209;
                    { 
                      if(true)
                        break Fail208;
                      if(true)
                        break Success159;
                    }
                  }
                  term = term201;
                }
                term = s_53;
                { 
                  IStrategoTerm c_54 = null;
                  IStrategoTerm t_53 = null;
                  c_54 = k_53;
                  term = o_53;
                  if(term.getTermType() != IStrategoTerm.APPL || transform._consSome_1 != ((IStrategoAppl)term).getConstructor())
                    break Fail207;
                  IStrategoTerm arg161 = term.getSubterm(0);
                  if(arg161.getTermType() != IStrategoTerm.APPL || transform._consRequires_1 != ((IStrategoAppl)arg161).getConstructor())
                    break Fail207;
                  t_53 = arg161.getSubterm(0);
                  term = hashtable_put_0_2.instance.invoke(context, c_54, q_53, t_53);
                  if(term == null)
                    break Fail207;
                  if(true)
                    break Success158;
                }
              }
              term = term200;
            }
            IStrategoTerm term202 = term;
            Success160:
            { 
              Fail210:
              { 
                IStrategoTerm u_53 = null;
                u_53 = term;
                IStrategoTerm term203 = term;
                Success161:
                { 
                  Fail211:
                  { 
                    term = termFactory.makeTuple(p_53, transform.constNone0);
                    term = equal_0_0.instance.invoke(context, term);
                    if(term == null)
                      break Fail211;
                    { 
                      if(true)
                        break Fail210;
                      if(true)
                        break Success161;
                    }
                  }
                  term = term203;
                }
                term = u_53;
                { 
                  IStrategoTerm e_54 = null;
                  IStrategoTerm v_53 = null;
                  e_54 = m_53;
                  term = p_53;
                  if(term.getTermType() != IStrategoTerm.APPL || transform._consSome_1 != ((IStrategoAppl)term).getConstructor())
                    break Fail207;
                  IStrategoTerm arg162 = term.getSubterm(0);
                  if(arg162.getTermType() != IStrategoTerm.APPL || transform._consOnEntry_1 != ((IStrategoAppl)arg162).getConstructor())
                    break Fail207;
                  v_53 = arg162.getSubterm(0);
                  term = hashtable_put_0_2.instance.invoke(context, e_54, q_53, v_53);
                  if(term == null)
                    break Fail207;
                  if(true)
                    break Success160;
                }
              }
              term = term202;
            }
            IStrategoTerm term204 = term;
            Success162:
            { 
              Fail212:
              { 
                IStrategoTerm w_53 = null;
                w_53 = term;
                IStrategoTerm term205 = term;
                Success163:
                { 
                  Fail213:
                  { 
                    term = termFactory.makeTuple(r_53, transform.constNone0);
                    term = equal_0_0.instance.invoke(context, term);
                    if(term == null)
                      break Fail213;
                    { 
                      if(true)
                        break Fail212;
                      if(true)
                        break Success163;
                    }
                  }
                  term = term205;
                }
                term = w_53;
                { 
                  IStrategoTerm i_54 = null;
                  IStrategoTerm x_53 = null;
                  i_54 = l_53;
                  term = r_53;
                  if(term.getTermType() != IStrategoTerm.APPL || transform._consSome_1 != ((IStrategoAppl)term).getConstructor())
                    break Fail207;
                  IStrategoTerm arg163 = term.getSubterm(0);
                  if(arg163.getTermType() != IStrategoTerm.APPL || transform._consOnExit_1 != ((IStrategoAppl)arg163).getConstructor())
                    break Fail207;
                  x_53 = arg163.getSubterm(0);
                  term = hashtable_put_0_2.instance.invoke(context, i_54, q_53, x_53);
                  if(term == null)
                    break Fail207;
                  if(true)
                    break Success162;
                }
              }
              term = term204;
            }
            if(true)
              break Success157;
          }
          term = term199;
          IStrategoTerm y_53 = null;
          IStrategoTerm z_53 = null;
          IStrategoTerm k_54 = null;
          y_53 = term;
          term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
          if(term == null)
            break Fail206;
          z_53 = term;
          k_54 = y_53;
          term = report_with_failure_0_2.instance.invoke(context, k_54, transform.const66, z_53);
          if(term == null)
            break Fail206;
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
      Fail214:
      { 
        IStrategoTerm n_54 = null;
        IStrategoTerm o_54 = null;
        IStrategoTerm v_54 = null;
        if(term.getTermType() != IStrategoTerm.APPL || transform._consConditionDec_1 != ((IStrategoAppl)term).getConstructor())
          break Fail214;
        n_54 = term.getSubterm(0);
        v_54 = term;
        IStrategoTerm term206 = term;
        Success164:
        { 
          Fail215:
          { 
            term = map_1_0.instance.invoke(context, n_54, lifted127.instance);
            if(term == null)
              break Fail215;
            o_54 = term;
            if(true)
              break Success164;
          }
          term = term206;
          IStrategoTerm t_54 = null;
          IStrategoTerm u_54 = null;
          IStrategoTerm x_54 = null;
          t_54 = term;
          term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
          if(term == null)
            break Fail214;
          u_54 = term;
          x_54 = t_54;
          term = report_with_failure_0_2.instance.invoke(context, x_54, transform.const68, u_54);
          if(term == null)
            break Fail214;
        }
        term = v_54;
        if(o_54 == null)
          break Fail214;
        term = o_54;
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
      Fail216:
      { 
        IStrategoTerm e_55 = null;
        IStrategoTerm f_55 = null;
        IStrategoTerm n_55 = null;
        e_55 = term;
        n_55 = term;
        IStrategoTerm term207 = term;
        Success165:
        { 
          Fail217:
          { 
            term = retain_all_1_0.instance.invoke(context, e_55, lifted128.instance);
            if(term == null)
              break Fail217;
            f_55 = term;
            if(true)
              break Success165;
          }
          term = term207;
          IStrategoTerm g_55 = null;
          IStrategoTerm h_55 = null;
          IStrategoTerm p_55 = null;
          g_55 = term;
          term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
          if(term == null)
            break Fail216;
          h_55 = term;
          p_55 = g_55;
          term = report_with_failure_0_2.instance.invoke(context, p_55, transform.const70, h_55);
          if(term == null)
            break Fail216;
        }
        term = n_55;
        if(f_55 == null)
          break Fail216;
        term = map_1_0.instance.invoke(context, f_55, lifted129.instance);
        if(term == null)
          break Fail216;
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
      Fail218:
      { 
        IStrategoTerm term208 = term;
        IStrategoConstructor cons8 = term.getTermType() == IStrategoTerm.APPL ? ((IStrategoAppl)term).getConstructor() : null;
        Success166:
        { 
          if(cons8 == transform._consSelfex_1)
          { 
            Fail219:
            { 
              IStrategoTerm r_55 = null;
              r_55 = term.getSubterm(0);
              term = r_55;
              if(true)
                break Success166;
            }
            term = term208;
          }
          Success167:
          { 
            if(cons8 == transform._consMutex_1)
            { 
              Fail220:
              { 
                IStrategoTerm q_55 = null;
                q_55 = term.getSubterm(0);
                term = q_55;
                if(true)
                  break Success167;
              }
              term = term208;
            }
            if(cons8 == transform._consNone_0)
            { 
              term = transform.constNil0;
            }
            else
            { 
              break Fail218;
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

  @SuppressWarnings("all") private static final class lifted128 extends Strategy 
  { 
    public static final lifted128 instance = new lifted128();

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      Fail221:
      { 
        if(term.getTermType() != IStrategoTerm.APPL || transform._consFieldDec_3 != ((IStrategoAppl)term).getConstructor())
          break Fail221;
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
      Fail222:
      { 
        IStrategoTerm i_55 = null;
        IStrategoTerm j_55 = null;
        IStrategoTerm k_55 = null;
        if(term.getTermType() != IStrategoTerm.APPL || transform._consFieldDec_3 != ((IStrategoAppl)term).getConstructor())
          break Fail222;
        i_55 = term.getSubterm(0);
        j_55 = term.getSubterm(1);
        k_55 = term.getSubterm(2);
        IStrategoList list1;
        list1 = checkListTail(i_55);
        if(list1 == null)
          break Fail222;
        term = termFactory.makeAppl(transform._consFieldDec_3, new IStrategoTerm[]{(IStrategoTerm)termFactory.makeListCons(transform.constPrivate0, termFactory.makeListCons(transform.constMarkerAnno1, list1)), j_55, k_55});
        if(true)
          return term;
      }
      return null;
    }
  }

  @SuppressWarnings("all") private static final class lifted127 extends Strategy 
  { 
    public static final lifted127 instance = new lifted127();

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      ITermFactory termFactory = context.getFactory();
      Fail223:
      { 
        IStrategoTerm p_54 = null;
        IStrategoTerm s_54 = null;
        if(term.getTermType() != IStrategoTerm.APPL || transform._consAssign_2 != ((IStrategoAppl)term).getConstructor())
          break Fail223;
        IStrategoTerm arg164 = term.getSubterm(0);
        if(arg164.getTermType() != IStrategoTerm.APPL || transform._consExprName_1 != ((IStrategoAppl)arg164).getConstructor())
          break Fail223;
        p_54 = arg164.getSubterm(0);
        s_54 = term.getSubterm(1);
        term = termFactory.makeAppl(transform._consFieldDec_3, new IStrategoTerm[]{transform.constCons26, transform.constBoolean0, (IStrategoTerm)termFactory.makeListCons(termFactory.makeAppl(transform._consVarDec_2, new IStrategoTerm[]{p_54, s_54}), (IStrategoList)transform.constNil0)});
        if(true)
          return term;
      }
      return null;
    }
  }

  @SuppressWarnings("all") private static final class lifted126 extends Strategy 
  { 
    TermReference d_51;

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      ITermFactory termFactory = context.getFactory();
      Fail224:
      { 
        IStrategoTerm y_51 = null;
        y_51 = term;
        term = gen_method_state_name_0_1.instance.invoke(context, y_51, d_51.value);
        if(term == null)
          break Fail224;
        term = termFactory.makeAppl(transform._consInvoke_2, new IStrategoTerm[]{transform.constMethod4, (IStrategoTerm)termFactory.makeListCons(termFactory.makeAppl(transform._consExprName_1, new IStrategoTerm[]{termFactory.makeAppl(transform._consId_1, new IStrategoTerm[]{term})}), (IStrategoList)transform.constNil0)});
        if(true)
          return term;
      }
      return null;
    }
  }

  @SuppressWarnings("all") private static final class lifted125 extends Strategy 
  { 
    TermReference t_51;

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      Fail225:
      { 
        term = equal_0_1.instance.invoke(context, term, t_51.value);
        if(term == null)
          break Fail225;
        if(true)
          return term;
      }
      return null;
    }
  }

  @SuppressWarnings("all") private static final class lifted124 extends Strategy 
  { 
    public static final lifted124 instance = new lifted124();

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      ITermFactory termFactory = context.getFactory();
      Fail226:
      { 
        term = termFactory.makeAppl(transform._consLit_1, new IStrategoTerm[]{termFactory.makeAppl(transform._consString_1, new IStrategoTerm[]{(IStrategoTerm)termFactory.makeListCons(termFactory.makeAppl(transform._consChars_1, new IStrategoTerm[]{term}), (IStrategoList)transform.constNil0)})});
        if(true)
          return term;
      }
      return null;
    }
  }

  @SuppressWarnings("all") private static final class lifted122 extends Strategy 
  { 
    public static final lifted122 instance = new lifted122();

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      ITermFactory termFactory = context.getFactory();
      Fail227:
      { 
        term = termFactory.makeAppl(transform._consLit_1, new IStrategoTerm[]{termFactory.makeAppl(transform._consString_1, new IStrategoTerm[]{(IStrategoTerm)termFactory.makeListCons(termFactory.makeAppl(transform._consChars_1, new IStrategoTerm[]{term}), (IStrategoList)transform.constNil0)})});
        if(true)
          return term;
      }
      return null;
    }
  }

  @SuppressWarnings("all") private static final class lifted120 extends Strategy 
  { 
    TermReference g_47;

    TermReference i_47;

    TermReference h_47;

    TermReference j_47;

    TermReference l_47;

    TermReference m_47;

    TermReference s_47;

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      Fail228:
      { 
        term = make_lock_and_unlock_methods_0_7.instance.invokeDynamic(context, term, NO_STRATEGIES, new IStrategoTerm[]{g_47.value, i_47.value, h_47.value, j_47.value, l_47.value, m_47.value, s_47.value});
        if(term == null)
          break Fail228;
        if(true)
          return term;
      }
      return null;
    }
  }

  @SuppressWarnings("all") private static final class lifted119 extends Strategy 
  { 
    TermReference q_47;

    TermReference g_47;

    TermReference i_47;

    TermReference s_47;

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      Fail229:
      { 
        term = make_on_exit_method_0_4.instance.invoke(context, term, q_47.value, g_47.value, i_47.value, s_47.value);
        if(term == null)
          break Fail229;
        if(true)
          return term;
      }
      return null;
    }
  }

  @SuppressWarnings("all") private static final class lifted118 extends Strategy 
  { 
    TermReference r_47;

    TermReference g_47;

    TermReference j_47;

    TermReference s_47;

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      Fail230:
      { 
        term = make_on_entry_method_0_4.instance.invoke(context, term, r_47.value, g_47.value, j_47.value, s_47.value);
        if(term == null)
          break Fail230;
        if(true)
          return term;
      }
      return null;
    }
  }

  @SuppressWarnings("all") private static final class lifted117 extends Strategy 
  { 
    TermReference p_47;

    TermReference h_47;

    TermReference s_47;

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      Fail231:
      { 
        term = make_requires_method_0_3.instance.invoke(context, term, p_47.value, h_47.value, s_47.value);
        if(term == null)
          break Fail231;
        if(true)
          return term;
      }
      return null;
    }
  }

  @SuppressWarnings("all") private static final class lifted116 extends Strategy 
  { 
    TermReference s_47;

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      Fail232:
      { 
        term = gen_method_state_0_1.instance.invoke(context, term, s_47.value);
        if(term == null)
          break Fail232;
        if(true)
          return term;
      }
      return null;
    }
  }

  @SuppressWarnings("all") private static final class lifted114 extends Strategy 
  { 
    public static final lifted114 instance = new lifted114();

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      Fail233:
      { 
        if(term.getTermType() != IStrategoTerm.APPL || transform._consMethodAdditions_4 != ((IStrategoAppl)term).getConstructor())
          break Fail233;
        if(true)
          return term;
      }
      return null;
    }
  }

  @SuppressWarnings("all") private static final class lifted113 extends Strategy 
  { 
    TermReference s_47;

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      Fail234:
      { 
        IStrategoTerm t_47 = null;
        IStrategoTerm m_48 = null;
        t_47 = term;
        if(s_47.value == null)
          break Fail234;
        term = s_47.value;
        m_48 = s_47.value;
        if(s_47.value == null)
          break Fail234;
        term = hashtable_keys_0_0.instance.invoke(context, s_47.value);
        if(term == null)
          break Fail234;
        term = length_0_0.instance.invoke(context, term);
        if(term == null)
          break Fail234;
        term = hashtable_put_0_2.instance.invoke(context, m_48, t_47, term);
        if(term == null)
          break Fail234;
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
      Fail235:
      { 
        if(term.getTermType() != IStrategoTerm.APPL || transform._consMutex_1 != ((IStrategoAppl)term).getConstructor())
          break Fail235;
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
      Fail236:
      { 
        if(term.getTermType() != IStrategoTerm.APPL || transform._consSelfex_1 != ((IStrategoAppl)term).getConstructor())
          break Fail236;
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
      Fail237:
      { 
        if(term.getTermType() != IStrategoTerm.APPL || transform._consConditionDec_1 != ((IStrategoAppl)term).getConstructor())
          break Fail237;
        if(true)
          return term;
      }
      return null;
    }
  }

  @SuppressWarnings("all") private static final class lifted115 extends Strategy 
  { 
    TermReference p_47;

    TermReference q_47;

    TermReference r_47;

    TermReference s_47;

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      Fail238:
      { 
        term = fill$Method$Maps_0_4.instance.invoke(context, term, p_47.value, q_47.value, r_47.value, s_47.value);
        if(term == null)
          break Fail238;
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
      Fail239:
      { 
        if(term.getTermType() != IStrategoTerm.APPL || transform._consCoordinatorDec_2 != ((IStrategoAppl)term).getConstructor())
          break Fail239;
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
      Fail240:
      { 
        if(term.getTermType() != IStrategoTerm.APPL || transform._consCoordinatorDec_2 != ((IStrategoAppl)term).getConstructor())
          break Fail240;
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
      Fail241:
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
      Fail242:
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
      Fail243:
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
    TermReference c_39;

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      Fail244:
      { 
        lifted101 lifted1011 = new lifted101();
        lifted100 lifted1000 = new lifted100();
        lifted1011.c_39 = c_39;
        lifted1000.c_39 = c_39;
        term = or_2_0.instance.invoke(context, term, lifted1000, lifted1011);
        if(term == null)
          break Fail244;
        if(true)
          return term;
      }
      return null;
    }
  }

  @SuppressWarnings("all") private static final class lifted101 extends Strategy 
  { 
    TermReference c_39;

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      Fail245:
      { 
        if(term.getTermType() != IStrategoTerm.APPL || transform._consPostDecr_1 != ((IStrategoAppl)term).getConstructor())
          break Fail245;
        if(c_39.value == null)
          c_39.value = term.getSubterm(0);
        else
          if(c_39.value != term.getSubterm(0) && !c_39.value.match(term.getSubterm(0)))
            break Fail245;
        if(true)
          return term;
      }
      return null;
    }
  }

  @SuppressWarnings("all") private static final class lifted100 extends Strategy 
  { 
    TermReference c_39;

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      Fail246:
      { 
        if(term.getTermType() != IStrategoTerm.APPL || transform._consPostIncr_1 != ((IStrategoAppl)term).getConstructor())
          break Fail246;
        if(c_39.value == null)
          c_39.value = term.getSubterm(0);
        else
          if(c_39.value != term.getSubterm(0) && !c_39.value.match(term.getSubterm(0)))
            break Fail246;
        if(true)
          return term;
      }
      return null;
    }
  }

  @SuppressWarnings("all") private static final class lifted96 extends Strategy 
  { 
    TermReference c_39;

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      Fail247:
      { 
        lifted98 lifted980 = new lifted98();
        lifted97 lifted970 = new lifted97();
        lifted980.c_39 = c_39;
        lifted970.c_39 = c_39;
        term = or_2_0.instance.invoke(context, term, lifted970, lifted980);
        if(term == null)
          break Fail247;
        if(true)
          return term;
      }
      return null;
    }
  }

  @SuppressWarnings("all") private static final class lifted98 extends Strategy 
  { 
    TermReference c_39;

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      Fail248:
      { 
        if(term.getTermType() != IStrategoTerm.APPL || transform._consPreDecr_1 != ((IStrategoAppl)term).getConstructor())
          break Fail248;
        if(c_39.value == null)
          c_39.value = term.getSubterm(0);
        else
          if(c_39.value != term.getSubterm(0) && !c_39.value.match(term.getSubterm(0)))
            break Fail248;
        if(true)
          return term;
      }
      return null;
    }
  }

  @SuppressWarnings("all") private static final class lifted97 extends Strategy 
  { 
    TermReference c_39;

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      Fail249:
      { 
        if(term.getTermType() != IStrategoTerm.APPL || transform._consPreIncr_1 != ((IStrategoAppl)term).getConstructor())
          break Fail249;
        if(c_39.value == null)
          c_39.value = term.getSubterm(0);
        else
          if(c_39.value != term.getSubterm(0) && !c_39.value.match(term.getSubterm(0)))
            break Fail249;
        if(true)
          return term;
      }
      return null;
    }
  }

  @SuppressWarnings("all") private static final class lifted95 extends Strategy 
  { 
    TermReference b_40;

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      Fail250:
      { 
        if(term.getTermType() != IStrategoTerm.APPL || transform._consURightShift_2 != ((IStrategoAppl)term).getConstructor())
          break Fail250;
        if(b_40.value == null)
          b_40.value = term.getSubterm(0);
        else
          if(b_40.value != term.getSubterm(0) && !b_40.value.match(term.getSubterm(0)))
            break Fail250;
        if(true)
          return term;
      }
      return null;
    }
  }

  @SuppressWarnings("all") private static final class lifted92 extends Strategy 
  { 
    TermReference b_40;

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      Fail251:
      { 
        lifted94 lifted940 = new lifted94();
        lifted93 lifted930 = new lifted93();
        lifted940.b_40 = b_40;
        lifted930.b_40 = b_40;
        term = or_2_0.instance.invoke(context, term, lifted930, lifted940);
        if(term == null)
          break Fail251;
        if(true)
          return term;
      }
      return null;
    }
  }

  @SuppressWarnings("all") private static final class lifted94 extends Strategy 
  { 
    TermReference b_40;

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      Fail252:
      { 
        if(term.getTermType() != IStrategoTerm.APPL || transform._consRightShift_2 != ((IStrategoAppl)term).getConstructor())
          break Fail252;
        if(b_40.value == null)
          b_40.value = term.getSubterm(0);
        else
          if(b_40.value != term.getSubterm(0) && !b_40.value.match(term.getSubterm(0)))
            break Fail252;
        if(true)
          return term;
      }
      return null;
    }
  }

  @SuppressWarnings("all") private static final class lifted93 extends Strategy 
  { 
    TermReference b_40;

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      Fail253:
      { 
        if(term.getTermType() != IStrategoTerm.APPL || transform._consLeftShift_2 != ((IStrategoAppl)term).getConstructor())
          break Fail253;
        if(b_40.value == null)
          b_40.value = term.getSubterm(0);
        else
          if(b_40.value != term.getSubterm(0) && !b_40.value.match(term.getSubterm(0)))
            break Fail253;
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
      Fail254:
      { 
        if(term.getTermType() != IStrategoTerm.APPL || transform._consRemain_2 != ((IStrategoAppl)term).getConstructor())
          break Fail254;
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
      Fail255:
      { 
        term = or_2_0.instance.invoke(context, term, lifted85.instance, lifted88.instance);
        if(term == null)
          break Fail255;
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
      Fail256:
      { 
        term = or_2_0.instance.invoke(context, term, lifted89.instance, lifted90.instance);
        if(term == null)
          break Fail256;
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
      Fail257:
      { 
        if(term.getTermType() != IStrategoTerm.APPL || transform._consDiv_2 != ((IStrategoAppl)term).getConstructor())
          break Fail257;
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
      Fail258:
      { 
        if(term.getTermType() != IStrategoTerm.APPL || transform._consMul_2 != ((IStrategoAppl)term).getConstructor())
          break Fail258;
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
      Fail259:
      { 
        term = or_2_0.instance.invoke(context, term, lifted86.instance, lifted87.instance);
        if(term == null)
          break Fail259;
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
      Fail260:
      { 
        if(term.getTermType() != IStrategoTerm.APPL || transform._consMinus_2 != ((IStrategoAppl)term).getConstructor())
          break Fail260;
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
      Fail261:
      { 
        if(term.getTermType() != IStrategoTerm.APPL || transform._consPlus_2 != ((IStrategoAppl)term).getConstructor())
          break Fail261;
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
      Fail262:
      { 
        if(term.getTermType() != IStrategoTerm.APPL || transform._consMinus_1 != ((IStrategoAppl)term).getConstructor())
          break Fail262;
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
      Fail263:
      { 
        if(term.getTermType() != IStrategoTerm.APPL || transform._consPlus_1 != ((IStrategoAppl)term).getConstructor())
          break Fail263;
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
      Fail264:
      { 
        if(term.getTermType() != IStrategoTerm.APPL || transform._consFloat_0 != ((IStrategoAppl)term).getConstructor())
          break Fail264;
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
      Fail265:
      { 
        if(term.getTermType() != IStrategoTerm.APPL || transform._consFloat_1 != ((IStrategoAppl)term).getConstructor())
          break Fail265;
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
      Fail266:
      { 
        if(term.getTermType() != IStrategoTerm.APPL || transform._consBool_1 != ((IStrategoAppl)term).getConstructor())
          break Fail266;
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
      Fail267:
      { 
        if(term.getTermType() != IStrategoTerm.APPL || transform._consBoolean_0 != ((IStrategoAppl)term).getConstructor())
          break Fail267;
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
      Fail268:
      { 
        if(term.getTermType() != IStrategoTerm.APPL || transform._consFloat_1 != ((IStrategoAppl)term).getConstructor())
          break Fail268;
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
      Fail269:
      { 
        if(term.getTermType() != IStrategoTerm.APPL || transform._consFloat_0 != ((IStrategoAppl)term).getConstructor())
          break Fail269;
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
      Fail270:
      { 
        if(term.getTermType() != IStrategoTerm.APPL || transform._consChar_1 != ((IStrategoAppl)term).getConstructor())
          break Fail270;
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
      Fail271:
      { 
        if(term.getTermType() != IStrategoTerm.APPL || transform._consChar_0 != ((IStrategoAppl)term).getConstructor())
          break Fail271;
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
      Fail272:
      { 
        if(term.getTermType() != IStrategoTerm.APPL || transform._consBool_1 != ((IStrategoAppl)term).getConstructor())
          break Fail272;
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
      Fail273:
      { 
        if(term.getTermType() != IStrategoTerm.APPL || transform._consBoolean_0 != ((IStrategoAppl)term).getConstructor())
          break Fail273;
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
      Fail274:
      { 
        if(term.getTermType() != IStrategoTerm.APPL || transform._consChar_1 != ((IStrategoAppl)term).getConstructor())
          break Fail274;
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
      Fail275:
      { 
        if(term.getTermType() != IStrategoTerm.APPL || transform._consChar_0 != ((IStrategoAppl)term).getConstructor())
          break Fail275;
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
      Fail276:
      { 
        if(term.getTermType() != IStrategoTerm.APPL || transform._consFloat_1 != ((IStrategoAppl)term).getConstructor())
          break Fail276;
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
      Fail277:
      { 
        if(term.getTermType() != IStrategoTerm.APPL || transform._consFloat_0 != ((IStrategoAppl)term).getConstructor())
          break Fail277;
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

  @SuppressWarnings("all") private static final class lifted66 extends Strategy 
  { 
    public static final lifted66 instance = new lifted66();

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

  @SuppressWarnings("all") private static final class lifted65 extends Strategy 
  { 
    public static final lifted65 instance = new lifted65();

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      Fail280:
      { 
        if(term.getTermType() != IStrategoTerm.APPL || transform._consBool_1 != ((IStrategoAppl)term).getConstructor())
          break Fail280;
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
      Fail281:
      { 
        if(term.getTermType() != IStrategoTerm.APPL || transform._consBoolean_0 != ((IStrategoAppl)term).getConstructor())
          break Fail281;
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

  @SuppressWarnings("all") private static final class lifted62 extends Strategy 
  { 
    public static final lifted62 instance = new lifted62();

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

  @SuppressWarnings("all") private static final class lifted61 extends Strategy 
  { 
    public static final lifted61 instance = new lifted61();

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      Fail284:
      { 
        if(term.getTermType() != IStrategoTerm.APPL || transform._consFloat_1 != ((IStrategoAppl)term).getConstructor())
          break Fail284;
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
      Fail285:
      { 
        if(term.getTermType() != IStrategoTerm.APPL || transform._consFloat_0 != ((IStrategoAppl)term).getConstructor())
          break Fail285;
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
      Fail286:
      { 
        if(term.getTermType() != IStrategoTerm.APPL || transform._consChar_1 != ((IStrategoAppl)term).getConstructor())
          break Fail286;
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
      Fail287:
      { 
        if(term.getTermType() != IStrategoTerm.APPL || transform._consChar_0 != ((IStrategoAppl)term).getConstructor())
          break Fail287;
        if(true)
          return term;
      }
      return null;
    }
  }

  @SuppressWarnings("all") private static final class lifted57 extends Strategy 
  { 
    TermReference w_23;

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      Fail288:
      { 
        if(term.getTermType() != IStrategoTerm.APPL || transform._consVarArityParam_3 != ((IStrategoAppl)term).getConstructor())
          break Fail288;
        IStrategoTerm arg60 = term.getSubterm(2);
        if(arg60.getTermType() != IStrategoTerm.APPL || transform._consId_1 != ((IStrategoAppl)arg60).getConstructor())
          break Fail288;
        if(w_23.value == null)
          w_23.value = arg60.getSubterm(0);
        else
          if(w_23.value != arg60.getSubterm(0) && !w_23.value.match(arg60.getSubterm(0)))
            break Fail288;
        if(true)
          return term;
      }
      return null;
    }
  }

  @SuppressWarnings("all") private static final class lifted56 extends Strategy 
  { 
    TermReference w_23;

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      Fail289:
      { 
        if(term.getTermType() != IStrategoTerm.APPL || transform._consParam_3 != ((IStrategoAppl)term).getConstructor())
          break Fail289;
        IStrategoTerm arg57 = term.getSubterm(2);
        if(arg57.getTermType() != IStrategoTerm.APPL || transform._consId_1 != ((IStrategoAppl)arg57).getConstructor())
          break Fail289;
        if(w_23.value == null)
          w_23.value = arg57.getSubterm(0);
        else
          if(w_23.value != arg57.getSubterm(0) && !w_23.value.match(arg57.getSubterm(0)))
            break Fail289;
        if(true)
          return term;
      }
      return null;
    }
  }

  @SuppressWarnings("all") private static final class lifted54 extends Strategy 
  { 
    TermReference q_23;

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      Fail290:
      { 
        if(q_23.value == null)
          break Fail290;
        term = fetch_1_0.instance.invoke(context, q_23.value, lifted55.instance);
        if(term == null)
          break Fail290;
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
      Fail291:
      { 
        if(term.getTermType() != IStrategoTerm.APPL || transform._consAnno_2 != ((IStrategoAppl)term).getConstructor())
          break Fail291;
        IStrategoTerm arg51 = term.getSubterm(0);
        if(arg51.getTermType() != IStrategoTerm.APPL || transform._consTypeName_1 != ((IStrategoAppl)arg51).getConstructor())
          break Fail291;
        IStrategoTerm arg52 = arg51.getSubterm(0);
        if(arg52.getTermType() != IStrategoTerm.APPL || transform._consId_1 != ((IStrategoAppl)arg52).getConstructor())
          break Fail291;
        IStrategoTerm arg53 = arg52.getSubterm(0);
        if(arg53.getTermType() != IStrategoTerm.STRING || !"COOLOnExit".equals(((IStrategoString)arg53).stringValue()))
          break Fail291;
        if(true)
          return term;
      }
      return null;
    }
  }

  @SuppressWarnings("all") private static final class lifted52 extends Strategy 
  { 
    TermReference q_23;

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      Fail292:
      { 
        if(q_23.value == null)
          break Fail292;
        term = fetch_1_0.instance.invoke(context, q_23.value, lifted53.instance);
        if(term == null)
          break Fail292;
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
      Fail293:
      { 
        if(term.getTermType() != IStrategoTerm.APPL || transform._consAnno_2 != ((IStrategoAppl)term).getConstructor())
          break Fail293;
        IStrategoTerm arg47 = term.getSubterm(0);
        if(arg47.getTermType() != IStrategoTerm.APPL || transform._consTypeName_1 != ((IStrategoAppl)arg47).getConstructor())
          break Fail293;
        IStrategoTerm arg48 = arg47.getSubterm(0);
        if(arg48.getTermType() != IStrategoTerm.APPL || transform._consId_1 != ((IStrategoAppl)arg48).getConstructor())
          break Fail293;
        IStrategoTerm arg49 = arg48.getSubterm(0);
        if(arg49.getTermType() != IStrategoTerm.STRING || !"COOLOnEntry".equals(((IStrategoString)arg49).stringValue()))
          break Fail293;
        if(true)
          return term;
      }
      return null;
    }
  }

  @SuppressWarnings("all") private static final class lifted51 extends Strategy 
  { 
    TermReference q_23;

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      Fail294:
      { 
        if(term.getTermType() != IStrategoTerm.APPL || transform._consDeprMethodDecHead_7 != ((IStrategoAppl)term).getConstructor())
          break Fail294;
        if(q_23.value == null)
          q_23.value = term.getSubterm(0);
        else
          if(q_23.value != term.getSubterm(0) && !q_23.value.match(term.getSubterm(0)))
            break Fail294;
        if(true)
          return term;
      }
      return null;
    }
  }

  @SuppressWarnings("all") private static final class lifted50 extends Strategy 
  { 
    TermReference q_23;

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      Fail295:
      { 
        if(term.getTermType() != IStrategoTerm.APPL || transform._consMethodDecHead_6 != ((IStrategoAppl)term).getConstructor())
          break Fail295;
        if(q_23.value == null)
          q_23.value = term.getSubterm(0);
        else
          if(q_23.value != term.getSubterm(0) && !q_23.value.match(term.getSubterm(0)))
            break Fail295;
        if(true)
          return term;
      }
      return null;
    }
  }

  @SuppressWarnings("all") private static final class add_external_impl_0_9_fragment_1 extends Strategy 
  { 
    TermReference o_11;

    TermReference p_11;

    TermReference r_11;

    TermReference q_11;

    TermReference s_11;

    TermReference t_11;

    TermReference u_11;

    TermReference v_11;

    TermReference w_11;

    TermReference x_11;

    TermReference y_11;

    TermReference z_11;

    TermReference a_12;

    TermReference b_12;

    TermReference f_12;

    TermReference d_12;

    TermReference c_12;

    TermReference y_10;

    TermReference z_10;

    TermReference a_11;

    TermReference b_11;

    TermReference c_11;

    TermReference d_11;

    TermReference e_11;

    TermReference f_11;

    TermReference g_11;

    TermReference e_12;

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      ITermFactory termFactory = context.getFactory();
      Fail296:
      { 
        IStrategoTerm term31 = term;
        Success168:
        { 
          Fail297:
          { 
            IStrategoTerm w_12 = null;
            w_12 = term;
            if(f_12.value == null)
              break Fail297;
            term = f_12.value;
            if(term.getTermType() != IStrategoTerm.APPL || transform._consRightShift_2 != ((IStrategoAppl)term).getConstructor())
              break Fail297;
            if(u_11.value == null)
              u_11.value = term.getSubterm(0);
            else
              if(u_11.value != term.getSubterm(0) && !u_11.value.match(term.getSubterm(0)))
                break Fail297;
            if(v_11.value == null)
              v_11.value = term.getSubterm(1);
            else
              if(v_11.value != term.getSubterm(1) && !v_11.value.match(term.getSubterm(1)))
                break Fail297;
            term = w_12;
            { 
              IStrategoTerm q_16 = null;
              IStrategoTerm s_16 = null;
              IStrategoTerm w_16 = null;
              IStrategoTerm term32 = term;
              Success169:
              { 
                Fail298:
                { 
                  IStrategoTerm x_12 = null;
                  x_12 = term;
                  if(e_11.value == null)
                    break Fail298;
                  term = termFactory.makeTuple(e_11.value, transform.constNone0);
                  term = equal_0_0.instance.invoke(context, term);
                  if(term == null)
                    break Fail298;
                  term = x_12;
                  { 
                    if(u_11.value == null)
                      break Fail296;
                    term = get_type_of_0_3.instance.invoke(context, u_11.value, e_11.value, y_10.value, z_10.value);
                    if(term == null)
                      break Fail296;
                    term = cast_shift_type_0_0.instance.invoke(context, term);
                    if(term == null)
                      break Fail296;
                    if(p_11.value == null)
                      p_11.value = term;
                    else
                      if(p_11.value != term && !p_11.value.match(term))
                        break Fail296;
                    if(true)
                      break Success169;
                  }
                }
                term = term32;
                if(e_11.value == null)
                  break Fail296;
                term = cast_shift_type_0_0.instance.invoke(context, e_11.value);
                if(term == null)
                  break Fail296;
                if(p_11.value == null)
                  p_11.value = term;
                else
                  if(p_11.value != term && !p_11.value.match(term))
                    break Fail296;
              }
              s_16 = term;
              if(u_11.value == null)
                break Fail296;
              term = add_external_impl_0_9.instance.invokeDynamic(context, u_11.value, NO_STRATEGIES, new IStrategoTerm[]{y_10.value, z_10.value, a_11.value, b_11.value, c_11.value, d_11.value, p_11.value, f_11.value, g_11.value});
              if(term == null)
                break Fail296;
              q_16 = term;
              term = s_16;
              if(v_11.value == null)
                break Fail296;
              w_16 = v_11.value;
              term = add_external_impl_0_9.instance.invokeDynamic(context, w_16, NO_STRATEGIES, new IStrategoTerm[]{y_10.value, z_10.value, a_11.value, b_11.value, c_11.value, d_11.value, transform.constLong0, f_11.value, g_11.value});
              if(term == null)
                break Fail296;
              term = termFactory.makeAppl(transform._consRightShift_2, new IStrategoTerm[]{q_16, term});
              if(true)
                break Success168;
            }
          }
          term = term31;
          IStrategoTerm term33 = term;
          Success170:
          { 
            Fail299:
            { 
              IStrategoTerm y_12 = null;
              y_12 = term;
              if(f_12.value == null)
                break Fail299;
              term = f_12.value;
              if(term.getTermType() != IStrategoTerm.APPL || transform._consURightShift_2 != ((IStrategoAppl)term).getConstructor())
                break Fail299;
              if(u_11.value == null)
                u_11.value = term.getSubterm(0);
              else
                if(u_11.value != term.getSubterm(0) && !u_11.value.match(term.getSubterm(0)))
                  break Fail299;
              if(v_11.value == null)
                v_11.value = term.getSubterm(1);
              else
                if(v_11.value != term.getSubterm(1) && !v_11.value.match(term.getSubterm(1)))
                  break Fail299;
              term = y_12;
              { 
                IStrategoTerm z_16 = null;
                IStrategoTerm b_17 = null;
                IStrategoTerm e_17 = null;
                IStrategoTerm term34 = term;
                Success171:
                { 
                  Fail300:
                  { 
                    IStrategoTerm z_12 = null;
                    z_12 = term;
                    if(e_11.value == null)
                      break Fail300;
                    term = termFactory.makeTuple(e_11.value, transform.constNone0);
                    term = equal_0_0.instance.invoke(context, term);
                    if(term == null)
                      break Fail300;
                    term = z_12;
                    { 
                      if(u_11.value == null)
                        break Fail296;
                      term = get_type_of_0_3.instance.invoke(context, u_11.value, e_11.value, y_10.value, z_10.value);
                      if(term == null)
                        break Fail296;
                      term = cast_shift_type_0_0.instance.invoke(context, term);
                      if(term == null)
                        break Fail296;
                      if(p_11.value == null)
                        p_11.value = term;
                      else
                        if(p_11.value != term && !p_11.value.match(term))
                          break Fail296;
                      if(true)
                        break Success171;
                    }
                  }
                  term = term34;
                  if(e_11.value == null)
                    break Fail296;
                  term = cast_shift_type_0_0.instance.invoke(context, e_11.value);
                  if(term == null)
                    break Fail296;
                  if(p_11.value == null)
                    p_11.value = term;
                  else
                    if(p_11.value != term && !p_11.value.match(term))
                      break Fail296;
                }
                b_17 = term;
                if(u_11.value == null)
                  break Fail296;
                term = add_external_impl_0_9.instance.invokeDynamic(context, u_11.value, NO_STRATEGIES, new IStrategoTerm[]{y_10.value, z_10.value, a_11.value, b_11.value, c_11.value, d_11.value, p_11.value, f_11.value, g_11.value});
                if(term == null)
                  break Fail296;
                z_16 = term;
                term = b_17;
                if(v_11.value == null)
                  break Fail296;
                e_17 = v_11.value;
                term = add_external_impl_0_9.instance.invokeDynamic(context, e_17, NO_STRATEGIES, new IStrategoTerm[]{y_10.value, z_10.value, a_11.value, b_11.value, c_11.value, d_11.value, transform.constLong0, f_11.value, g_11.value});
                if(term == null)
                  break Fail296;
                term = termFactory.makeAppl(transform._consURightShift_2, new IStrategoTerm[]{z_16, term});
                if(true)
                  break Success170;
              }
            }
            term = term33;
            IStrategoTerm term35 = term;
            Success172:
            { 
              Fail301:
              { 
                IStrategoTerm a_13 = null;
                a_13 = term;
                if(f_12.value == null)
                  break Fail301;
                term = f_12.value;
                if(term.getTermType() != IStrategoTerm.APPL || transform._consPreIncr_1 != ((IStrategoAppl)term).getConstructor())
                  break Fail301;
                if(d_12.value == null)
                  d_12.value = term.getSubterm(0);
                else
                  if(d_12.value != term.getSubterm(0) && !d_12.value.match(term.getSubterm(0)))
                    break Fail301;
                term = a_13;
                { 
                  if(d_12.value == null)
                    break Fail296;
                  term = get_type_of_0_3.instance.invoke(context, d_12.value, e_11.value, y_10.value, z_10.value);
                  if(term == null)
                    break Fail296;
                  if(o_11.value == null)
                    o_11.value = term;
                  else
                    if(o_11.value != term && !o_11.value.match(term))
                      break Fail296;
                  IStrategoTerm term36 = term;
                  Success173:
                  { 
                    Fail302:
                    { 
                      IStrategoTerm e_13 = null;
                      e_13 = term;
                      if(o_11.value == null)
                        break Fail302;
                      term = termFactory.makeTuple(o_11.value, transform.constNone0);
                      term = equal_0_0.instance.invoke(context, term);
                      if(term == null)
                        break Fail302;
                      term = e_13;
                      { 
                        IStrategoTerm term37 = term;
                        Success174:
                        { 
                          Fail303:
                          { 
                            IStrategoTerm f_13 = null;
                            f_13 = term;
                            if(e_11.value == null)
                              break Fail303;
                            term = termFactory.makeTuple(e_11.value, transform.constNone0);
                            term = equal_0_0.instance.invoke(context, term);
                            if(term == null)
                              break Fail303;
                            term = f_13;
                            { 
                              term = transform.constDouble0;
                              if(p_11.value == null)
                                p_11.value = term;
                              else
                                if(p_11.value != term && !p_11.value.match(term))
                                  break Fail296;
                              if(true)
                                break Success174;
                            }
                          }
                          term = term37;
                          if(e_11.value == null)
                            break Fail296;
                          term = ensure__number_0_0.instance.invoke(context, e_11.value);
                          if(term == null)
                            break Fail296;
                          if(p_11.value == null)
                            p_11.value = term;
                          else
                            if(p_11.value != term && !p_11.value.match(term))
                              break Fail296;
                        }
                        if(true)
                          break Success173;
                      }
                    }
                    term = term36;
                    if(o_11.value == null)
                      break Fail296;
                    term = ensure__number_0_0.instance.invoke(context, o_11.value);
                    if(term == null)
                      break Fail296;
                    if(p_11.value == null)
                      p_11.value = term;
                    else
                      if(p_11.value != term && !p_11.value.match(term))
                        break Fail296;
                  }
                  if(d_12.value == null)
                    break Fail296;
                  term = add_external_impl_0_9.instance.invokeDynamic(context, d_12.value, NO_STRATEGIES, new IStrategoTerm[]{y_10.value, z_10.value, a_11.value, b_11.value, c_11.value, d_11.value, p_11.value, f_11.value, g_11.value});
                  if(term == null)
                    break Fail296;
                  term = termFactory.makeAppl(transform._consPreIncr_1, new IStrategoTerm[]{term});
                  if(true)
                    break Success172;
                }
              }
              term = term35;
              IStrategoTerm term38 = term;
              Success175:
              { 
                Fail304:
                { 
                  IStrategoTerm g_13 = null;
                  g_13 = term;
                  if(f_12.value == null)
                    break Fail304;
                  term = f_12.value;
                  if(term.getTermType() != IStrategoTerm.APPL || transform._consPostIncr_1 != ((IStrategoAppl)term).getConstructor())
                    break Fail304;
                  if(d_12.value == null)
                    d_12.value = term.getSubterm(0);
                  else
                    if(d_12.value != term.getSubterm(0) && !d_12.value.match(term.getSubterm(0)))
                      break Fail304;
                  term = g_13;
                  { 
                    if(d_12.value == null)
                      break Fail296;
                    term = get_type_of_0_3.instance.invoke(context, d_12.value, e_11.value, y_10.value, z_10.value);
                    if(term == null)
                      break Fail296;
                    if(o_11.value == null)
                      o_11.value = term;
                    else
                      if(o_11.value != term && !o_11.value.match(term))
                        break Fail296;
                    IStrategoTerm term39 = term;
                    Success176:
                    { 
                      Fail305:
                      { 
                        IStrategoTerm h_13 = null;
                        h_13 = term;
                        if(o_11.value == null)
                          break Fail305;
                        term = termFactory.makeTuple(o_11.value, transform.constNone0);
                        term = equal_0_0.instance.invoke(context, term);
                        if(term == null)
                          break Fail305;
                        term = h_13;
                        { 
                          IStrategoTerm term40 = term;
                          Success177:
                          { 
                            Fail306:
                            { 
                              IStrategoTerm i_13 = null;
                              i_13 = term;
                              if(e_11.value == null)
                                break Fail306;
                              term = termFactory.makeTuple(e_11.value, transform.constNone0);
                              term = equal_0_0.instance.invoke(context, term);
                              if(term == null)
                                break Fail306;
                              term = i_13;
                              { 
                                term = transform.constDouble0;
                                if(p_11.value == null)
                                  p_11.value = term;
                                else
                                  if(p_11.value != term && !p_11.value.match(term))
                                    break Fail296;
                                if(true)
                                  break Success177;
                              }
                            }
                            term = term40;
                            if(e_11.value == null)
                              break Fail296;
                            term = ensure__number_0_0.instance.invoke(context, e_11.value);
                            if(term == null)
                              break Fail296;
                            if(p_11.value == null)
                              p_11.value = term;
                            else
                              if(p_11.value != term && !p_11.value.match(term))
                                break Fail296;
                          }
                          if(true)
                            break Success176;
                        }
                      }
                      term = term39;
                      if(o_11.value == null)
                        break Fail296;
                      term = ensure__number_0_0.instance.invoke(context, o_11.value);
                      if(term == null)
                        break Fail296;
                      if(p_11.value == null)
                        p_11.value = term;
                      else
                        if(p_11.value != term && !p_11.value.match(term))
                          break Fail296;
                    }
                    if(d_12.value == null)
                      break Fail296;
                    term = add_external_impl_0_9.instance.invokeDynamic(context, d_12.value, NO_STRATEGIES, new IStrategoTerm[]{y_10.value, z_10.value, a_11.value, b_11.value, c_11.value, d_11.value, p_11.value, f_11.value, g_11.value});
                    if(term == null)
                      break Fail296;
                    term = termFactory.makeAppl(transform._consPostIncr_1, new IStrategoTerm[]{term});
                    if(true)
                      break Success175;
                  }
                }
                term = term38;
                IStrategoTerm term41 = term;
                Success178:
                { 
                  Fail307:
                  { 
                    IStrategoTerm m_13 = null;
                    m_13 = term;
                    if(f_12.value == null)
                      break Fail307;
                    term = f_12.value;
                    if(term.getTermType() != IStrategoTerm.APPL || transform._consPreDecr_1 != ((IStrategoAppl)term).getConstructor())
                      break Fail307;
                    if(d_12.value == null)
                      d_12.value = term.getSubterm(0);
                    else
                      if(d_12.value != term.getSubterm(0) && !d_12.value.match(term.getSubterm(0)))
                        break Fail307;
                    term = m_13;
                    { 
                      if(d_12.value == null)
                        break Fail296;
                      term = get_type_of_0_3.instance.invoke(context, d_12.value, e_11.value, y_10.value, z_10.value);
                      if(term == null)
                        break Fail296;
                      if(o_11.value == null)
                        o_11.value = term;
                      else
                        if(o_11.value != term && !o_11.value.match(term))
                          break Fail296;
                      IStrategoTerm term42 = term;
                      Success179:
                      { 
                        Fail308:
                        { 
                          IStrategoTerm n_13 = null;
                          n_13 = term;
                          if(o_11.value == null)
                            break Fail308;
                          term = termFactory.makeTuple(o_11.value, transform.constNone0);
                          term = equal_0_0.instance.invoke(context, term);
                          if(term == null)
                            break Fail308;
                          term = n_13;
                          { 
                            IStrategoTerm term43 = term;
                            Success180:
                            { 
                              Fail309:
                              { 
                                IStrategoTerm o_13 = null;
                                o_13 = term;
                                if(e_11.value == null)
                                  break Fail309;
                                term = termFactory.makeTuple(e_11.value, transform.constNone0);
                                term = equal_0_0.instance.invoke(context, term);
                                if(term == null)
                                  break Fail309;
                                term = o_13;
                                { 
                                  term = transform.constDouble0;
                                  if(p_11.value == null)
                                    p_11.value = term;
                                  else
                                    if(p_11.value != term && !p_11.value.match(term))
                                      break Fail296;
                                  if(true)
                                    break Success180;
                                }
                              }
                              term = term43;
                              if(e_11.value == null)
                                break Fail296;
                              term = ensure__number_0_0.instance.invoke(context, e_11.value);
                              if(term == null)
                                break Fail296;
                              if(p_11.value == null)
                                p_11.value = term;
                              else
                                if(p_11.value != term && !p_11.value.match(term))
                                  break Fail296;
                            }
                            if(true)
                              break Success179;
                          }
                        }
                        term = term42;
                        if(o_11.value == null)
                          break Fail296;
                        term = ensure__number_0_0.instance.invoke(context, o_11.value);
                        if(term == null)
                          break Fail296;
                        if(p_11.value == null)
                          p_11.value = term;
                        else
                          if(p_11.value != term && !p_11.value.match(term))
                            break Fail296;
                      }
                      if(d_12.value == null)
                        break Fail296;
                      term = add_external_impl_0_9.instance.invokeDynamic(context, d_12.value, NO_STRATEGIES, new IStrategoTerm[]{y_10.value, z_10.value, a_11.value, b_11.value, c_11.value, d_11.value, p_11.value, f_11.value, g_11.value});
                      if(term == null)
                        break Fail296;
                      term = termFactory.makeAppl(transform._consPreDecr_1, new IStrategoTerm[]{term});
                      if(true)
                        break Success178;
                    }
                  }
                  term = term41;
                  IStrategoTerm term44 = term;
                  Success181:
                  { 
                    Fail310:
                    { 
                      IStrategoTerm p_13 = null;
                      p_13 = term;
                      if(f_12.value == null)
                        break Fail310;
                      term = f_12.value;
                      if(term.getTermType() != IStrategoTerm.APPL || transform._consPostDecr_1 != ((IStrategoAppl)term).getConstructor())
                        break Fail310;
                      if(d_12.value == null)
                        d_12.value = term.getSubterm(0);
                      else
                        if(d_12.value != term.getSubterm(0) && !d_12.value.match(term.getSubterm(0)))
                          break Fail310;
                      term = p_13;
                      { 
                        if(d_12.value == null)
                          break Fail296;
                        term = get_type_of_0_3.instance.invoke(context, d_12.value, e_11.value, y_10.value, z_10.value);
                        if(term == null)
                          break Fail296;
                        if(o_11.value == null)
                          o_11.value = term;
                        else
                          if(o_11.value != term && !o_11.value.match(term))
                            break Fail296;
                        IStrategoTerm term45 = term;
                        Success182:
                        { 
                          Fail311:
                          { 
                            IStrategoTerm q_13 = null;
                            q_13 = term;
                            if(o_11.value == null)
                              break Fail311;
                            term = termFactory.makeTuple(o_11.value, transform.constNone0);
                            term = equal_0_0.instance.invoke(context, term);
                            if(term == null)
                              break Fail311;
                            term = q_13;
                            { 
                              IStrategoTerm term46 = term;
                              Success183:
                              { 
                                Fail312:
                                { 
                                  IStrategoTerm r_13 = null;
                                  r_13 = term;
                                  if(e_11.value == null)
                                    break Fail312;
                                  term = termFactory.makeTuple(e_11.value, transform.constNone0);
                                  term = equal_0_0.instance.invoke(context, term);
                                  if(term == null)
                                    break Fail312;
                                  term = r_13;
                                  { 
                                    term = transform.constDouble0;
                                    if(p_11.value == null)
                                      p_11.value = term;
                                    else
                                      if(p_11.value != term && !p_11.value.match(term))
                                        break Fail296;
                                    if(true)
                                      break Success183;
                                  }
                                }
                                term = term46;
                                if(e_11.value == null)
                                  break Fail296;
                                term = ensure__number_0_0.instance.invoke(context, e_11.value);
                                if(term == null)
                                  break Fail296;
                                if(p_11.value == null)
                                  p_11.value = term;
                                else
                                  if(p_11.value != term && !p_11.value.match(term))
                                    break Fail296;
                              }
                              if(true)
                                break Success182;
                            }
                          }
                          term = term45;
                          if(o_11.value == null)
                            break Fail296;
                          term = ensure__number_0_0.instance.invoke(context, o_11.value);
                          if(term == null)
                            break Fail296;
                          if(p_11.value == null)
                            p_11.value = term;
                          else
                            if(p_11.value != term && !p_11.value.match(term))
                              break Fail296;
                        }
                        if(d_12.value == null)
                          break Fail296;
                        term = add_external_impl_0_9.instance.invokeDynamic(context, d_12.value, NO_STRATEGIES, new IStrategoTerm[]{y_10.value, z_10.value, a_11.value, b_11.value, c_11.value, d_11.value, p_11.value, f_11.value, g_11.value});
                        if(term == null)
                          break Fail296;
                        term = termFactory.makeAppl(transform._consPostDecr_1, new IStrategoTerm[]{term});
                        if(true)
                          break Success181;
                      }
                    }
                    term = term44;
                    IStrategoTerm term47 = term;
                    Success184:
                    { 
                      Fail313:
                      { 
                        IStrategoTerm s_13 = null;
                        s_13 = term;
                        if(f_12.value == null)
                          break Fail313;
                        term = f_12.value;
                        if(term.getTermType() != IStrategoTerm.APPL || transform._consNot_1 != ((IStrategoAppl)term).getConstructor())
                          break Fail313;
                        term = s_13;
                        { 
                          if(e_12.value == null)
                            break Fail296;
                          term = e_12.value;
                          lifted40 lifted400 = new lifted40();
                          lifted400.y_10 = y_10;
                          lifted400.z_10 = z_10;
                          lifted400.a_11 = a_11;
                          lifted400.b_11 = b_11;
                          lifted400.c_11 = c_11;
                          lifted400.d_11 = d_11;
                          lifted400.f_11 = f_11;
                          lifted400.g_11 = g_11;
                          term = SRTS_all.instance.invoke(context, term, lifted400);
                          if(term == null)
                            break Fail296;
                          if(true)
                            break Success184;
                        }
                      }
                      term = term47;
                      IStrategoTerm term48 = term;
                      Success185:
                      { 
                        Fail314:
                        { 
                          IStrategoTerm t_13 = null;
                          t_13 = term;
                          if(f_12.value == null)
                            break Fail314;
                          term = or_2_0.instance.invoke(context, f_12.value, lifted41.instance, lifted44.instance);
                          if(term == null)
                            break Fail314;
                          term = t_13;
                          { 
                            if(e_12.value == null)
                              break Fail296;
                            term = e_12.value;
                            lifted45 lifted450 = new lifted45();
                            lifted450.e_12 = e_12;
                            lifted450.e_11 = e_11;
                            lifted450.y_10 = y_10;
                            lifted450.z_10 = z_10;
                            lifted450.a_11 = a_11;
                            lifted450.b_11 = b_11;
                            lifted450.c_11 = c_11;
                            lifted450.d_11 = d_11;
                            lifted450.f_11 = f_11;
                            lifted450.g_11 = g_11;
                            term = SRTS_all.instance.invoke(context, term, lifted450);
                            if(term == null)
                              break Fail296;
                            if(true)
                              break Success185;
                          }
                        }
                        term = term48;
                        IStrategoTerm term49 = term;
                        Success186:
                        { 
                          Fail315:
                          { 
                            IStrategoTerm u_13 = null;
                            u_13 = term;
                            if(f_12.value == null)
                              break Fail315;
                            term = f_12.value;
                            if(term.getTermType() != IStrategoTerm.APPL || transform._consAssign_2 != ((IStrategoAppl)term).getConstructor())
                              break Fail315;
                            if(q_11.value == null)
                              q_11.value = term.getSubterm(0);
                            else
                              if(q_11.value != term.getSubterm(0) && !q_11.value.match(term.getSubterm(0)))
                                break Fail315;
                            if(d_12.value == null)
                              d_12.value = term.getSubterm(1);
                            else
                              if(d_12.value != term.getSubterm(1) && !d_12.value.match(term.getSubterm(1)))
                                break Fail315;
                            term = u_13;
                            { 
                              IStrategoTerm s_17 = null;
                              IStrategoTerm t_17 = null;
                              if(q_11.value == null)
                                break Fail296;
                              term = get_$L$H$S_type_0_3.instance.invoke(context, q_11.value, e_11.value, y_10.value, z_10.value);
                              if(term == null)
                                break Fail296;
                              if(r_11.value == null)
                                r_11.value = term;
                              else
                                if(r_11.value != term && !r_11.value.match(term))
                                  break Fail296;
                              t_17 = term;
                              if(d_12.value == null)
                                break Fail296;
                              term = add_external_impl_0_9.instance.invokeDynamic(context, d_12.value, NO_STRATEGIES, new IStrategoTerm[]{y_10.value, z_10.value, a_11.value, b_11.value, c_11.value, d_11.value, r_11.value, f_11.value, g_11.value});
                              if(term == null)
                                break Fail296;
                              s_17 = term;
                              term = t_17;
                              if(q_11.value == null)
                                break Fail296;
                              term = termFactory.makeAppl(transform._consAssign_2, new IStrategoTerm[]{q_11.value, s_17});
                              if(true)
                                break Success186;
                            }
                          }
                          term = term49;
                          IStrategoTerm term50 = term;
                          Success187:
                          { 
                            Fail316:
                            { 
                              IStrategoTerm y_13 = null;
                              y_13 = term;
                              if(f_12.value == null)
                                break Fail316;
                              term = f_12.value;
                              if(term.getTermType() != IStrategoTerm.APPL || transform._consAssignMul_2 != ((IStrategoAppl)term).getConstructor())
                                break Fail316;
                              if(q_11.value == null)
                                q_11.value = term.getSubterm(0);
                              else
                                if(q_11.value != term.getSubterm(0) && !q_11.value.match(term.getSubterm(0)))
                                  break Fail316;
                              if(d_12.value == null)
                                d_12.value = term.getSubterm(1);
                              else
                                if(d_12.value != term.getSubterm(1) && !d_12.value.match(term.getSubterm(1)))
                                  break Fail316;
                              term = y_13;
                              { 
                                IStrategoTerm u_17 = null;
                                IStrategoTerm v_17 = null;
                                IStrategoTerm x_17 = null;
                                if(q_11.value == null)
                                  break Fail296;
                                term = get_$L$H$S_type_0_3.instance.invoke(context, q_11.value, e_11.value, y_10.value, z_10.value);
                                if(term == null)
                                  break Fail296;
                                v_17 = term;
                                if(d_12.value == null)
                                  break Fail296;
                                x_17 = d_12.value;
                                term = add_external_impl_0_9.instance.invokeDynamic(context, x_17, NO_STRATEGIES, new IStrategoTerm[]{y_10.value, z_10.value, a_11.value, b_11.value, c_11.value, d_11.value, transform.constDouble0, f_11.value, g_11.value});
                                if(term == null)
                                  break Fail296;
                                u_17 = term;
                                term = v_17;
                                if(q_11.value == null)
                                  break Fail296;
                                term = termFactory.makeAppl(transform._consAssignMul_2, new IStrategoTerm[]{q_11.value, u_17});
                                if(true)
                                  break Success187;
                              }
                            }
                            term = term50;
                            IStrategoTerm term51 = term;
                            Success188:
                            { 
                              Fail317:
                              { 
                                IStrategoTerm z_13 = null;
                                z_13 = term;
                                if(f_12.value == null)
                                  break Fail317;
                                term = f_12.value;
                                if(term.getTermType() != IStrategoTerm.APPL || transform._consAssignDiv_2 != ((IStrategoAppl)term).getConstructor())
                                  break Fail317;
                                if(q_11.value == null)
                                  q_11.value = term.getSubterm(0);
                                else
                                  if(q_11.value != term.getSubterm(0) && !q_11.value.match(term.getSubterm(0)))
                                    break Fail317;
                                if(d_12.value == null)
                                  d_12.value = term.getSubterm(1);
                                else
                                  if(d_12.value != term.getSubterm(1) && !d_12.value.match(term.getSubterm(1)))
                                    break Fail317;
                                term = z_13;
                                { 
                                  IStrategoTerm y_17 = null;
                                  IStrategoTerm z_17 = null;
                                  IStrategoTerm b_18 = null;
                                  if(q_11.value == null)
                                    break Fail296;
                                  term = get_$L$H$S_type_0_3.instance.invoke(context, q_11.value, e_11.value, y_10.value, z_10.value);
                                  if(term == null)
                                    break Fail296;
                                  z_17 = term;
                                  if(d_12.value == null)
                                    break Fail296;
                                  b_18 = d_12.value;
                                  term = add_external_impl_0_9.instance.invokeDynamic(context, b_18, NO_STRATEGIES, new IStrategoTerm[]{y_10.value, z_10.value, a_11.value, b_11.value, c_11.value, d_11.value, transform.constDouble0, f_11.value, g_11.value});
                                  if(term == null)
                                    break Fail296;
                                  y_17 = term;
                                  term = z_17;
                                  if(q_11.value == null)
                                    break Fail296;
                                  term = termFactory.makeAppl(transform._consAssignDiv_2, new IStrategoTerm[]{q_11.value, y_17});
                                  if(true)
                                    break Success188;
                                }
                              }
                              term = term51;
                              IStrategoTerm term52 = term;
                              Success189:
                              { 
                                Fail318:
                                { 
                                  IStrategoTerm a_14 = null;
                                  a_14 = term;
                                  if(f_12.value == null)
                                    break Fail318;
                                  term = f_12.value;
                                  if(term.getTermType() != IStrategoTerm.APPL || transform._consAssignRemain_2 != ((IStrategoAppl)term).getConstructor())
                                    break Fail318;
                                  if(q_11.value == null)
                                    q_11.value = term.getSubterm(0);
                                  else
                                    if(q_11.value != term.getSubterm(0) && !q_11.value.match(term.getSubterm(0)))
                                      break Fail318;
                                  if(d_12.value == null)
                                    d_12.value = term.getSubterm(1);
                                  else
                                    if(d_12.value != term.getSubterm(1) && !d_12.value.match(term.getSubterm(1)))
                                      break Fail318;
                                  term = a_14;
                                  { 
                                    IStrategoTerm c_18 = null;
                                    IStrategoTerm d_18 = null;
                                    IStrategoTerm f_18 = null;
                                    if(q_11.value == null)
                                      break Fail296;
                                    term = get_$L$H$S_type_0_3.instance.invoke(context, q_11.value, e_11.value, y_10.value, z_10.value);
                                    if(term == null)
                                      break Fail296;
                                    d_18 = term;
                                    if(d_12.value == null)
                                      break Fail296;
                                    f_18 = d_12.value;
                                    term = add_external_impl_0_9.instance.invokeDynamic(context, f_18, NO_STRATEGIES, new IStrategoTerm[]{y_10.value, z_10.value, a_11.value, b_11.value, c_11.value, d_11.value, transform.constDouble0, f_11.value, g_11.value});
                                    if(term == null)
                                      break Fail296;
                                    c_18 = term;
                                    term = d_18;
                                    if(q_11.value == null)
                                      break Fail296;
                                    term = termFactory.makeAppl(transform._consAssignRemain_2, new IStrategoTerm[]{q_11.value, c_18});
                                    if(true)
                                      break Success189;
                                  }
                                }
                                term = term52;
                                IStrategoTerm term53 = term;
                                Success190:
                                { 
                                  Fail319:
                                  { 
                                    IStrategoTerm b_14 = null;
                                    b_14 = term;
                                    if(f_12.value == null)
                                      break Fail319;
                                    term = f_12.value;
                                    if(term.getTermType() != IStrategoTerm.APPL || transform._consAssignPlus_2 != ((IStrategoAppl)term).getConstructor())
                                      break Fail319;
                                    if(q_11.value == null)
                                      q_11.value = term.getSubterm(0);
                                    else
                                      if(q_11.value != term.getSubterm(0) && !q_11.value.match(term.getSubterm(0)))
                                        break Fail319;
                                    if(d_12.value == null)
                                      d_12.value = term.getSubterm(1);
                                    else
                                      if(d_12.value != term.getSubterm(1) && !d_12.value.match(term.getSubterm(1)))
                                        break Fail319;
                                    term = b_14;
                                    { 
                                      IStrategoTerm g_18 = null;
                                      IStrategoTerm j_18 = null;
                                      IStrategoTerm l_18 = null;
                                      if(q_11.value == null)
                                        break Fail296;
                                      term = get_$L$H$S_type_0_3.instance.invoke(context, q_11.value, e_11.value, y_10.value, z_10.value);
                                      if(term == null)
                                        break Fail296;
                                      j_18 = term;
                                      if(d_12.value == null)
                                        break Fail296;
                                      l_18 = d_12.value;
                                      term = add_external_impl_0_9.instance.invokeDynamic(context, l_18, NO_STRATEGIES, new IStrategoTerm[]{y_10.value, z_10.value, a_11.value, b_11.value, c_11.value, d_11.value, transform.constDouble0, f_11.value, g_11.value});
                                      if(term == null)
                                        break Fail296;
                                      g_18 = term;
                                      term = j_18;
                                      if(q_11.value == null)
                                        break Fail296;
                                      term = termFactory.makeAppl(transform._consAssignPlus_2, new IStrategoTerm[]{q_11.value, g_18});
                                      if(true)
                                        break Success190;
                                    }
                                  }
                                  term = term53;
                                  IStrategoTerm term54 = term;
                                  Success191:
                                  { 
                                    Fail320:
                                    { 
                                      IStrategoTerm c_14 = null;
                                      c_14 = term;
                                      if(f_12.value == null)
                                        break Fail320;
                                      term = f_12.value;
                                      if(term.getTermType() != IStrategoTerm.APPL || transform._consAssignMinus_2 != ((IStrategoAppl)term).getConstructor())
                                        break Fail320;
                                      if(q_11.value == null)
                                        q_11.value = term.getSubterm(0);
                                      else
                                        if(q_11.value != term.getSubterm(0) && !q_11.value.match(term.getSubterm(0)))
                                          break Fail320;
                                      if(d_12.value == null)
                                        d_12.value = term.getSubterm(1);
                                      else
                                        if(d_12.value != term.getSubterm(1) && !d_12.value.match(term.getSubterm(1)))
                                          break Fail320;
                                      term = c_14;
                                      { 
                                        IStrategoTerm m_18 = null;
                                        IStrategoTerm n_18 = null;
                                        IStrategoTerm p_18 = null;
                                        if(q_11.value == null)
                                          break Fail296;
                                        term = get_$L$H$S_type_0_3.instance.invoke(context, q_11.value, e_11.value, y_10.value, z_10.value);
                                        if(term == null)
                                          break Fail296;
                                        n_18 = term;
                                        if(d_12.value == null)
                                          break Fail296;
                                        p_18 = d_12.value;
                                        term = add_external_impl_0_9.instance.invokeDynamic(context, p_18, NO_STRATEGIES, new IStrategoTerm[]{y_10.value, z_10.value, a_11.value, b_11.value, c_11.value, d_11.value, transform.constDouble0, f_11.value, g_11.value});
                                        if(term == null)
                                          break Fail296;
                                        m_18 = term;
                                        term = n_18;
                                        if(q_11.value == null)
                                          break Fail296;
                                        term = termFactory.makeAppl(transform._consAssignMinus_2, new IStrategoTerm[]{q_11.value, m_18});
                                        if(true)
                                          break Success191;
                                      }
                                    }
                                    term = term54;
                                    IStrategoTerm term55 = term;
                                    Success192:
                                    { 
                                      Fail321:
                                      { 
                                        IStrategoTerm d_14 = null;
                                        d_14 = term;
                                        if(f_12.value == null)
                                          break Fail321;
                                        term = f_12.value;
                                        if(term.getTermType() != IStrategoTerm.APPL || transform._consAssignLeftShift_2 != ((IStrategoAppl)term).getConstructor())
                                          break Fail321;
                                        if(q_11.value == null)
                                          q_11.value = term.getSubterm(0);
                                        else
                                          if(q_11.value != term.getSubterm(0) && !q_11.value.match(term.getSubterm(0)))
                                            break Fail321;
                                        if(d_12.value == null)
                                          d_12.value = term.getSubterm(1);
                                        else
                                          if(d_12.value != term.getSubterm(1) && !d_12.value.match(term.getSubterm(1)))
                                            break Fail321;
                                        term = d_14;
                                        { 
                                          IStrategoTerm q_18 = null;
                                          IStrategoTerm r_18 = null;
                                          IStrategoTerm t_18 = null;
                                          if(q_11.value == null)
                                            break Fail296;
                                          term = get_$L$H$S_type_0_3.instance.invoke(context, q_11.value, e_11.value, y_10.value, z_10.value);
                                          if(term == null)
                                            break Fail296;
                                          r_18 = term;
                                          if(d_12.value == null)
                                            break Fail296;
                                          t_18 = d_12.value;
                                          term = add_external_impl_0_9.instance.invokeDynamic(context, t_18, NO_STRATEGIES, new IStrategoTerm[]{y_10.value, z_10.value, a_11.value, b_11.value, c_11.value, d_11.value, transform.constLong0, f_11.value, g_11.value});
                                          if(term == null)
                                            break Fail296;
                                          q_18 = term;
                                          term = r_18;
                                          if(q_11.value == null)
                                            break Fail296;
                                          term = termFactory.makeAppl(transform._consAssignLeftShift_2, new IStrategoTerm[]{q_11.value, q_18});
                                          if(true)
                                            break Success192;
                                        }
                                      }
                                      term = term55;
                                      IStrategoTerm term56 = term;
                                      Success193:
                                      { 
                                        Fail322:
                                        { 
                                          IStrategoTerm e_14 = null;
                                          e_14 = term;
                                          if(f_12.value == null)
                                            break Fail322;
                                          term = f_12.value;
                                          if(term.getTermType() != IStrategoTerm.APPL || transform._consAssignRightShift_2 != ((IStrategoAppl)term).getConstructor())
                                            break Fail322;
                                          if(q_11.value == null)
                                            q_11.value = term.getSubterm(0);
                                          else
                                            if(q_11.value != term.getSubterm(0) && !q_11.value.match(term.getSubterm(0)))
                                              break Fail322;
                                          if(d_12.value == null)
                                            d_12.value = term.getSubterm(1);
                                          else
                                            if(d_12.value != term.getSubterm(1) && !d_12.value.match(term.getSubterm(1)))
                                              break Fail322;
                                          term = e_14;
                                          { 
                                            IStrategoTerm u_18 = null;
                                            IStrategoTerm v_18 = null;
                                            IStrategoTerm x_18 = null;
                                            if(q_11.value == null)
                                              break Fail296;
                                            term = get_$L$H$S_type_0_3.instance.invoke(context, q_11.value, e_11.value, y_10.value, z_10.value);
                                            if(term == null)
                                              break Fail296;
                                            v_18 = term;
                                            if(d_12.value == null)
                                              break Fail296;
                                            x_18 = d_12.value;
                                            term = add_external_impl_0_9.instance.invokeDynamic(context, x_18, NO_STRATEGIES, new IStrategoTerm[]{y_10.value, z_10.value, a_11.value, b_11.value, c_11.value, d_11.value, transform.constLong0, f_11.value, g_11.value});
                                            if(term == null)
                                              break Fail296;
                                            u_18 = term;
                                            term = v_18;
                                            if(q_11.value == null)
                                              break Fail296;
                                            term = termFactory.makeAppl(transform._consAssignRightShift_2, new IStrategoTerm[]{q_11.value, u_18});
                                            if(true)
                                              break Success193;
                                          }
                                        }
                                        term = term56;
                                        IStrategoTerm term57 = term;
                                        Success194:
                                        { 
                                          Fail323:
                                          { 
                                            IStrategoTerm f_14 = null;
                                            f_14 = term;
                                            if(f_12.value == null)
                                              break Fail323;
                                            term = f_12.value;
                                            if(term.getTermType() != IStrategoTerm.APPL || transform._consAssignURightShift_2 != ((IStrategoAppl)term).getConstructor())
                                              break Fail323;
                                            if(q_11.value == null)
                                              q_11.value = term.getSubterm(0);
                                            else
                                              if(q_11.value != term.getSubterm(0) && !q_11.value.match(term.getSubterm(0)))
                                                break Fail323;
                                            if(d_12.value == null)
                                              d_12.value = term.getSubterm(1);
                                            else
                                              if(d_12.value != term.getSubterm(1) && !d_12.value.match(term.getSubterm(1)))
                                                break Fail323;
                                            term = f_14;
                                            { 
                                              IStrategoTerm y_18 = null;
                                              IStrategoTerm z_18 = null;
                                              IStrategoTerm b_19 = null;
                                              if(q_11.value == null)
                                                break Fail296;
                                              term = get_$L$H$S_type_0_3.instance.invoke(context, q_11.value, e_11.value, y_10.value, z_10.value);
                                              if(term == null)
                                                break Fail296;
                                              z_18 = term;
                                              if(d_12.value == null)
                                                break Fail296;
                                              b_19 = d_12.value;
                                              term = add_external_impl_0_9.instance.invokeDynamic(context, b_19, NO_STRATEGIES, new IStrategoTerm[]{y_10.value, z_10.value, a_11.value, b_11.value, c_11.value, d_11.value, transform.constLong0, f_11.value, g_11.value});
                                              if(term == null)
                                                break Fail296;
                                              y_18 = term;
                                              term = z_18;
                                              if(q_11.value == null)
                                                break Fail296;
                                              term = termFactory.makeAppl(transform._consAssignURightShift_2, new IStrategoTerm[]{q_11.value, y_18});
                                              if(true)
                                                break Success194;
                                            }
                                          }
                                          term = term57;
                                          add_external_impl_0_9_fragment_0 add_external_impl_0_9_fragment_00 = new add_external_impl_0_9_fragment_0();
                                          add_external_impl_0_9_fragment_00.r_11 = r_11;
                                          add_external_impl_0_9_fragment_00.q_11 = q_11;
                                          add_external_impl_0_9_fragment_00.s_11 = s_11;
                                          add_external_impl_0_9_fragment_00.t_11 = t_11;
                                          add_external_impl_0_9_fragment_00.u_11 = u_11;
                                          add_external_impl_0_9_fragment_00.v_11 = v_11;
                                          add_external_impl_0_9_fragment_00.w_11 = w_11;
                                          add_external_impl_0_9_fragment_00.x_11 = x_11;
                                          add_external_impl_0_9_fragment_00.y_11 = y_11;
                                          add_external_impl_0_9_fragment_00.z_11 = z_11;
                                          add_external_impl_0_9_fragment_00.a_12 = a_12;
                                          add_external_impl_0_9_fragment_00.b_12 = b_12;
                                          add_external_impl_0_9_fragment_00.f_12 = f_12;
                                          add_external_impl_0_9_fragment_00.d_12 = d_12;
                                          add_external_impl_0_9_fragment_00.c_12 = c_12;
                                          add_external_impl_0_9_fragment_00.y_10 = y_10;
                                          add_external_impl_0_9_fragment_00.z_10 = z_10;
                                          add_external_impl_0_9_fragment_00.a_11 = a_11;
                                          add_external_impl_0_9_fragment_00.b_11 = b_11;
                                          add_external_impl_0_9_fragment_00.c_11 = c_11;
                                          add_external_impl_0_9_fragment_00.d_11 = d_11;
                                          add_external_impl_0_9_fragment_00.e_11 = e_11;
                                          add_external_impl_0_9_fragment_00.f_11 = f_11;
                                          add_external_impl_0_9_fragment_00.g_11 = g_11;
                                          add_external_impl_0_9_fragment_00.e_12 = e_12;
                                          term = add_external_impl_0_9_fragment_00.invoke(context, term);
                                          if(term == null)
                                            break Fail296;
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
    TermReference r_11;

    TermReference q_11;

    TermReference s_11;

    TermReference t_11;

    TermReference u_11;

    TermReference v_11;

    TermReference w_11;

    TermReference x_11;

    TermReference y_11;

    TermReference z_11;

    TermReference a_12;

    TermReference b_12;

    TermReference f_12;

    TermReference d_12;

    TermReference c_12;

    TermReference y_10;

    TermReference z_10;

    TermReference a_11;

    TermReference b_11;

    TermReference c_11;

    TermReference d_11;

    TermReference e_11;

    TermReference f_11;

    TermReference g_11;

    TermReference e_12;

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      ITermFactory termFactory = context.getFactory();
      Fail324:
      { 
        IStrategoTerm term58 = term;
        Success195:
        { 
          Fail325:
          { 
            IStrategoTerm g_14 = null;
            g_14 = term;
            if(f_12.value == null)
              break Fail325;
            term = f_12.value;
            if(term.getTermType() != IStrategoTerm.APPL || transform._consAssignAnd_2 != ((IStrategoAppl)term).getConstructor())
              break Fail325;
            if(q_11.value == null)
              q_11.value = term.getSubterm(0);
            else
              if(q_11.value != term.getSubterm(0) && !q_11.value.match(term.getSubterm(0)))
                break Fail325;
            if(d_12.value == null)
              d_12.value = term.getSubterm(1);
            else
              if(d_12.value != term.getSubterm(1) && !d_12.value.match(term.getSubterm(1)))
                break Fail325;
            term = g_14;
            { 
              IStrategoTerm d_19 = null;
              IStrategoTerm e_19 = null;
              IStrategoTerm g_19 = null;
              if(q_11.value == null)
                break Fail324;
              term = get_$L$H$S_type_0_3.instance.invoke(context, q_11.value, e_11.value, y_10.value, z_10.value);
              if(term == null)
                break Fail324;
              if(r_11.value == null)
                r_11.value = term;
              else
                if(r_11.value != term && !r_11.value.match(term))
                  break Fail324;
              e_19 = term;
              if(d_12.value == null)
                break Fail324;
              term = d_12.value;
              g_19 = d_12.value;
              if(r_11.value == null)
                break Fail324;
              term = cast_bounded_conditional_type_0_0.instance.invoke(context, r_11.value);
              if(term == null)
                break Fail324;
              term = add_external_impl_0_9.instance.invokeDynamic(context, g_19, NO_STRATEGIES, new IStrategoTerm[]{y_10.value, z_10.value, a_11.value, b_11.value, c_11.value, d_11.value, term, f_11.value, g_11.value});
              if(term == null)
                break Fail324;
              d_19 = term;
              term = e_19;
              if(q_11.value == null)
                break Fail324;
              term = termFactory.makeAppl(transform._consAssignAnd_2, new IStrategoTerm[]{q_11.value, d_19});
              if(true)
                break Success195;
            }
          }
          term = term58;
          IStrategoTerm term59 = term;
          Success196:
          { 
            Fail326:
            { 
              IStrategoTerm h_14 = null;
              h_14 = term;
              if(f_12.value == null)
                break Fail326;
              term = f_12.value;
              if(term.getTermType() != IStrategoTerm.APPL || transform._consAssignExcOr_2 != ((IStrategoAppl)term).getConstructor())
                break Fail326;
              if(q_11.value == null)
                q_11.value = term.getSubterm(0);
              else
                if(q_11.value != term.getSubterm(0) && !q_11.value.match(term.getSubterm(0)))
                  break Fail326;
              if(d_12.value == null)
                d_12.value = term.getSubterm(1);
              else
                if(d_12.value != term.getSubterm(1) && !d_12.value.match(term.getSubterm(1)))
                  break Fail326;
              term = h_14;
              { 
                IStrategoTerm h_19 = null;
                IStrategoTerm k_19 = null;
                IStrategoTerm m_19 = null;
                if(q_11.value == null)
                  break Fail324;
                term = get_$L$H$S_type_0_3.instance.invoke(context, q_11.value, e_11.value, y_10.value, z_10.value);
                if(term == null)
                  break Fail324;
                if(r_11.value == null)
                  r_11.value = term;
                else
                  if(r_11.value != term && !r_11.value.match(term))
                    break Fail324;
                k_19 = term;
                if(d_12.value == null)
                  break Fail324;
                term = d_12.value;
                m_19 = d_12.value;
                if(r_11.value == null)
                  break Fail324;
                term = cast_bounded_conditional_type_0_0.instance.invoke(context, r_11.value);
                if(term == null)
                  break Fail324;
                term = add_external_impl_0_9.instance.invokeDynamic(context, m_19, NO_STRATEGIES, new IStrategoTerm[]{y_10.value, z_10.value, a_11.value, b_11.value, c_11.value, d_11.value, term, f_11.value, g_11.value});
                if(term == null)
                  break Fail324;
                h_19 = term;
                term = k_19;
                if(q_11.value == null)
                  break Fail324;
                term = termFactory.makeAppl(transform._consAssignExcOr_2, new IStrategoTerm[]{q_11.value, h_19});
                if(true)
                  break Success196;
              }
            }
            term = term59;
            IStrategoTerm term60 = term;
            Success197:
            { 
              Fail327:
              { 
                IStrategoTerm i_14 = null;
                i_14 = term;
                if(f_12.value == null)
                  break Fail327;
                term = f_12.value;
                if(term.getTermType() != IStrategoTerm.APPL || transform._consAssignOr_2 != ((IStrategoAppl)term).getConstructor())
                  break Fail327;
                if(q_11.value == null)
                  q_11.value = term.getSubterm(0);
                else
                  if(q_11.value != term.getSubterm(0) && !q_11.value.match(term.getSubterm(0)))
                    break Fail327;
                if(d_12.value == null)
                  d_12.value = term.getSubterm(1);
                else
                  if(d_12.value != term.getSubterm(1) && !d_12.value.match(term.getSubterm(1)))
                    break Fail327;
                term = i_14;
                { 
                  IStrategoTerm n_19 = null;
                  IStrategoTerm o_19 = null;
                  IStrategoTerm q_19 = null;
                  if(q_11.value == null)
                    break Fail324;
                  term = get_$L$H$S_type_0_3.instance.invoke(context, q_11.value, e_11.value, y_10.value, z_10.value);
                  if(term == null)
                    break Fail324;
                  if(r_11.value == null)
                    r_11.value = term;
                  else
                    if(r_11.value != term && !r_11.value.match(term))
                      break Fail324;
                  o_19 = term;
                  if(d_12.value == null)
                    break Fail324;
                  term = d_12.value;
                  q_19 = d_12.value;
                  if(r_11.value == null)
                    break Fail324;
                  term = cast_bounded_conditional_type_0_0.instance.invoke(context, r_11.value);
                  if(term == null)
                    break Fail324;
                  term = add_external_impl_0_9.instance.invokeDynamic(context, q_19, NO_STRATEGIES, new IStrategoTerm[]{y_10.value, z_10.value, a_11.value, b_11.value, c_11.value, d_11.value, term, f_11.value, g_11.value});
                  if(term == null)
                    break Fail324;
                  n_19 = term;
                  term = o_19;
                  if(q_11.value == null)
                    break Fail324;
                  term = termFactory.makeAppl(transform._consAssignOr_2, new IStrategoTerm[]{q_11.value, n_19});
                  if(true)
                    break Success197;
                }
              }
              term = term60;
              IStrategoTerm term61 = term;
              Success198:
              { 
                Fail328:
                { 
                  IStrategoTerm j_14 = null;
                  j_14 = term;
                  if(f_12.value == null)
                    break Fail328;
                  term = or_2_0.instance.invoke(context, f_12.value, lifted46.instance, lifted47.instance);
                  if(term == null)
                    break Fail328;
                  term = j_14;
                  { 
                    if(e_12.value == null)
                      break Fail324;
                    term = e_12.value;
                    lifted48 lifted480 = new lifted48();
                    lifted480.y_10 = y_10;
                    lifted480.z_10 = z_10;
                    lifted480.a_11 = a_11;
                    lifted480.b_11 = b_11;
                    lifted480.c_11 = c_11;
                    lifted480.d_11 = d_11;
                    lifted480.f_11 = f_11;
                    lifted480.g_11 = g_11;
                    term = SRTS_all.instance.invoke(context, term, lifted480);
                    if(term == null)
                      break Fail324;
                    if(true)
                      break Success198;
                  }
                }
                term = term61;
                IStrategoTerm term62 = term;
                Success199:
                { 
                  Fail329:
                  { 
                    IStrategoTerm k_14 = null;
                    k_14 = term;
                    if(f_12.value == null)
                      break Fail329;
                    term = f_12.value;
                    if(term.getTermType() != IStrategoTerm.APPL || transform._consIf_2 != ((IStrategoAppl)term).getConstructor())
                      break Fail329;
                    if(d_12.value == null)
                      d_12.value = term.getSubterm(0);
                    else
                      if(d_12.value != term.getSubterm(0) && !d_12.value.match(term.getSubterm(0)))
                        break Fail329;
                    if(s_11.value == null)
                      s_11.value = term.getSubterm(1);
                    else
                      if(s_11.value != term.getSubterm(1) && !s_11.value.match(term.getSubterm(1)))
                        break Fail329;
                    term = k_14;
                    { 
                      IStrategoTerm t_19 = null;
                      IStrategoTerm w_19 = null;
                      IStrategoTerm y_19 = null;
                      IStrategoTerm b_20 = null;
                      w_19 = term;
                      if(d_12.value == null)
                        break Fail324;
                      y_19 = d_12.value;
                      term = add_external_impl_0_9.instance.invokeDynamic(context, y_19, NO_STRATEGIES, new IStrategoTerm[]{y_10.value, z_10.value, a_11.value, b_11.value, c_11.value, d_11.value, transform.constBoolean0, f_11.value, g_11.value});
                      if(term == null)
                        break Fail324;
                      t_19 = term;
                      term = w_19;
                      if(s_11.value == null)
                        break Fail324;
                      b_20 = s_11.value;
                      term = add_external_impl_0_9.instance.invokeDynamic(context, b_20, NO_STRATEGIES, new IStrategoTerm[]{y_10.value, z_10.value, a_11.value, b_11.value, c_11.value, d_11.value, transform.constNone0, f_11.value, g_11.value});
                      if(term == null)
                        break Fail324;
                      term = termFactory.makeAppl(transform._consIf_2, new IStrategoTerm[]{t_19, term});
                      if(true)
                        break Success199;
                    }
                  }
                  term = term62;
                  IStrategoTerm term63 = term;
                  Success200:
                  { 
                    Fail330:
                    { 
                      IStrategoTerm l_14 = null;
                      l_14 = term;
                      if(f_12.value == null)
                        break Fail330;
                      term = f_12.value;
                      if(term.getTermType() != IStrategoTerm.APPL || transform._consIf_3 != ((IStrategoAppl)term).getConstructor())
                        break Fail330;
                      if(d_12.value == null)
                        d_12.value = term.getSubterm(0);
                      else
                        if(d_12.value != term.getSubterm(0) && !d_12.value.match(term.getSubterm(0)))
                          break Fail330;
                      if(s_11.value == null)
                        s_11.value = term.getSubterm(1);
                      else
                        if(s_11.value != term.getSubterm(1) && !s_11.value.match(term.getSubterm(1)))
                          break Fail330;
                      if(t_11.value == null)
                        t_11.value = term.getSubterm(2);
                      else
                        if(t_11.value != term.getSubterm(2) && !t_11.value.match(term.getSubterm(2)))
                          break Fail330;
                      term = l_14;
                      { 
                        IStrategoTerm c_20 = null;
                        IStrategoTerm f_20 = null;
                        IStrategoTerm h_20 = null;
                        IStrategoTerm d_20 = null;
                        IStrategoTerm i_20 = null;
                        IStrategoTerm k_20 = null;
                        IStrategoTerm n_20 = null;
                        f_20 = term;
                        if(d_12.value == null)
                          break Fail324;
                        h_20 = d_12.value;
                        term = add_external_impl_0_9.instance.invokeDynamic(context, h_20, NO_STRATEGIES, new IStrategoTerm[]{y_10.value, z_10.value, a_11.value, b_11.value, c_11.value, d_11.value, transform.constBoolean0, f_11.value, g_11.value});
                        if(term == null)
                          break Fail324;
                        c_20 = term;
                        term = f_20;
                        i_20 = f_20;
                        if(s_11.value == null)
                          break Fail324;
                        k_20 = s_11.value;
                        term = add_external_impl_0_9.instance.invokeDynamic(context, k_20, NO_STRATEGIES, new IStrategoTerm[]{y_10.value, z_10.value, a_11.value, b_11.value, c_11.value, d_11.value, transform.constNone0, f_11.value, g_11.value});
                        if(term == null)
                          break Fail324;
                        d_20 = term;
                        term = i_20;
                        if(t_11.value == null)
                          break Fail324;
                        n_20 = t_11.value;
                        term = add_external_impl_0_9.instance.invokeDynamic(context, n_20, NO_STRATEGIES, new IStrategoTerm[]{y_10.value, z_10.value, a_11.value, b_11.value, c_11.value, d_11.value, transform.constNone0, f_11.value, g_11.value});
                        if(term == null)
                          break Fail324;
                        term = termFactory.makeAppl(transform._consIf_3, new IStrategoTerm[]{c_20, d_20, term});
                        if(true)
                          break Success200;
                      }
                    }
                    term = term63;
                    IStrategoTerm term64 = term;
                    Success201:
                    { 
                      Fail331:
                      { 
                        IStrategoTerm m_14 = null;
                        m_14 = term;
                        if(f_12.value == null)
                          break Fail331;
                        term = f_12.value;
                        if(term.getTermType() != IStrategoTerm.APPL || transform._consAssertStm_1 != ((IStrategoAppl)term).getConstructor())
                          break Fail331;
                        if(d_12.value == null)
                          d_12.value = term.getSubterm(0);
                        else
                          if(d_12.value != term.getSubterm(0) && !d_12.value.match(term.getSubterm(0)))
                            break Fail331;
                        term = m_14;
                        { 
                          IStrategoTerm r_20 = null;
                          if(d_12.value == null)
                            break Fail324;
                          r_20 = d_12.value;
                          term = add_external_impl_0_9.instance.invokeDynamic(context, r_20, NO_STRATEGIES, new IStrategoTerm[]{y_10.value, z_10.value, a_11.value, b_11.value, c_11.value, d_11.value, transform.constBoolean0, f_11.value, g_11.value});
                          if(term == null)
                            break Fail324;
                          term = termFactory.makeAppl(transform._consAssertStm_1, new IStrategoTerm[]{term});
                          if(true)
                            break Success201;
                        }
                      }
                      term = term64;
                      IStrategoTerm term65 = term;
                      Success202:
                      { 
                        Fail332:
                        { 
                          IStrategoTerm n_14 = null;
                          n_14 = term;
                          if(f_12.value == null)
                            break Fail332;
                          term = f_12.value;
                          if(term.getTermType() != IStrategoTerm.APPL || transform._consAssertStm_2 != ((IStrategoAppl)term).getConstructor())
                            break Fail332;
                          if(u_11.value == null)
                            u_11.value = term.getSubterm(0);
                          else
                            if(u_11.value != term.getSubterm(0) && !u_11.value.match(term.getSubterm(0)))
                              break Fail332;
                          if(v_11.value == null)
                            v_11.value = term.getSubterm(1);
                          else
                            if(v_11.value != term.getSubterm(1) && !v_11.value.match(term.getSubterm(1)))
                              break Fail332;
                          term = n_14;
                          { 
                            IStrategoTerm s_20 = null;
                            IStrategoTerm u_20 = null;
                            IStrategoTerm w_20 = null;
                            IStrategoTerm z_20 = null;
                            u_20 = term;
                            if(u_11.value == null)
                              break Fail324;
                            w_20 = u_11.value;
                            term = add_external_impl_0_9.instance.invokeDynamic(context, w_20, NO_STRATEGIES, new IStrategoTerm[]{y_10.value, z_10.value, a_11.value, b_11.value, c_11.value, d_11.value, transform.constBoolean0, f_11.value, g_11.value});
                            if(term == null)
                              break Fail324;
                            s_20 = term;
                            term = u_20;
                            if(v_11.value == null)
                              break Fail324;
                            z_20 = v_11.value;
                            term = add_external_impl_0_9.instance.invokeDynamic(context, z_20, NO_STRATEGIES, new IStrategoTerm[]{y_10.value, z_10.value, a_11.value, b_11.value, c_11.value, d_11.value, transform.constBoolean0, f_11.value, g_11.value});
                            if(term == null)
                              break Fail324;
                            term = termFactory.makeAppl(transform._consAssertStm_2, new IStrategoTerm[]{s_20, term});
                            if(true)
                              break Success202;
                          }
                        }
                        term = term65;
                        IStrategoTerm term66 = term;
                        Success203:
                        { 
                          Fail333:
                          { 
                            IStrategoTerm o_14 = null;
                            o_14 = term;
                            if(f_12.value == null)
                              break Fail333;
                            term = f_12.value;
                            if(term.getTermType() != IStrategoTerm.APPL || transform._consWhile_2 != ((IStrategoAppl)term).getConstructor())
                              break Fail333;
                            if(d_12.value == null)
                              d_12.value = term.getSubterm(0);
                            else
                              if(d_12.value != term.getSubterm(0) && !d_12.value.match(term.getSubterm(0)))
                                break Fail333;
                            if(b_12.value == null)
                              b_12.value = term.getSubterm(1);
                            else
                              if(b_12.value != term.getSubterm(1) && !b_12.value.match(term.getSubterm(1)))
                                break Fail333;
                            term = o_14;
                            { 
                              IStrategoTerm a_21 = null;
                              IStrategoTerm c_21 = null;
                              IStrategoTerm e_21 = null;
                              IStrategoTerm h_21 = null;
                              c_21 = term;
                              if(d_12.value == null)
                                break Fail324;
                              e_21 = d_12.value;
                              term = add_external_impl_0_9.instance.invokeDynamic(context, e_21, NO_STRATEGIES, new IStrategoTerm[]{y_10.value, z_10.value, a_11.value, b_11.value, c_11.value, d_11.value, transform.constBoolean0, f_11.value, g_11.value});
                              if(term == null)
                                break Fail324;
                              a_21 = term;
                              term = c_21;
                              if(b_12.value == null)
                                break Fail324;
                              h_21 = b_12.value;
                              term = add_external_impl_0_9.instance.invokeDynamic(context, h_21, NO_STRATEGIES, new IStrategoTerm[]{y_10.value, z_10.value, a_11.value, b_11.value, c_11.value, d_11.value, transform.constNone0, f_11.value, g_11.value});
                              if(term == null)
                                break Fail324;
                              term = termFactory.makeAppl(transform._consWhile_2, new IStrategoTerm[]{a_21, term});
                              if(true)
                                break Success203;
                            }
                          }
                          term = term66;
                          IStrategoTerm term67 = term;
                          Success204:
                          { 
                            Fail334:
                            { 
                              IStrategoTerm p_14 = null;
                              p_14 = term;
                              if(f_12.value == null)
                                break Fail334;
                              term = f_12.value;
                              if(term.getTermType() != IStrategoTerm.APPL || transform._consDoWhile_2 != ((IStrategoAppl)term).getConstructor())
                                break Fail334;
                              if(b_12.value == null)
                                b_12.value = term.getSubterm(0);
                              else
                                if(b_12.value != term.getSubterm(0) && !b_12.value.match(term.getSubterm(0)))
                                  break Fail334;
                              if(d_12.value == null)
                                d_12.value = term.getSubterm(1);
                              else
                                if(d_12.value != term.getSubterm(1) && !d_12.value.match(term.getSubterm(1)))
                                  break Fail334;
                              term = p_14;
                              { 
                                IStrategoTerm i_21 = null;
                                IStrategoTerm k_21 = null;
                                IStrategoTerm m_21 = null;
                                IStrategoTerm p_21 = null;
                                k_21 = term;
                                if(b_12.value == null)
                                  break Fail324;
                                m_21 = b_12.value;
                                term = add_external_impl_0_9.instance.invokeDynamic(context, m_21, NO_STRATEGIES, new IStrategoTerm[]{y_10.value, z_10.value, a_11.value, b_11.value, c_11.value, d_11.value, transform.constNone0, f_11.value, g_11.value});
                                if(term == null)
                                  break Fail324;
                                i_21 = term;
                                term = k_21;
                                if(d_12.value == null)
                                  break Fail324;
                                p_21 = d_12.value;
                                term = add_external_impl_0_9.instance.invokeDynamic(context, p_21, NO_STRATEGIES, new IStrategoTerm[]{y_10.value, z_10.value, a_11.value, b_11.value, c_11.value, d_11.value, transform.constBoolean0, f_11.value, g_11.value});
                                if(term == null)
                                  break Fail324;
                                term = termFactory.makeAppl(transform._consDoWhile_2, new IStrategoTerm[]{i_21, term});
                                if(true)
                                  break Success204;
                              }
                            }
                            term = term67;
                            IStrategoTerm term68 = term;
                            Success205:
                            { 
                              Fail335:
                              { 
                                IStrategoTerm s_14 = null;
                                s_14 = term;
                                if(f_12.value == null)
                                  break Fail335;
                                term = f_12.value;
                                if(term.getTermType() != IStrategoTerm.APPL || transform._consFor_4 != ((IStrategoAppl)term).getConstructor())
                                  break Fail335;
                                if(w_11.value == null)
                                  w_11.value = term.getSubterm(0);
                                else
                                  if(w_11.value != term.getSubterm(0) && !w_11.value.match(term.getSubterm(0)))
                                    break Fail335;
                                if(d_12.value == null)
                                  d_12.value = term.getSubterm(1);
                                else
                                  if(d_12.value != term.getSubterm(1) && !d_12.value.match(term.getSubterm(1)))
                                    break Fail335;
                                if(x_11.value == null)
                                  x_11.value = term.getSubterm(2);
                                else
                                  if(x_11.value != term.getSubterm(2) && !x_11.value.match(term.getSubterm(2)))
                                    break Fail335;
                                if(b_12.value == null)
                                  b_12.value = term.getSubterm(3);
                                else
                                  if(b_12.value != term.getSubterm(3) && !b_12.value.match(term.getSubterm(3)))
                                    break Fail335;
                                term = s_14;
                                { 
                                  IStrategoTerm q_21 = null;
                                  IStrategoTerm u_21 = null;
                                  IStrategoTerm w_21 = null;
                                  IStrategoTerm r_21 = null;
                                  IStrategoTerm x_21 = null;
                                  IStrategoTerm z_21 = null;
                                  IStrategoTerm s_21 = null;
                                  IStrategoTerm a_22 = null;
                                  IStrategoTerm c_22 = null;
                                  IStrategoTerm f_22 = null;
                                  u_21 = term;
                                  if(w_11.value == null)
                                    break Fail324;
                                  w_21 = w_11.value;
                                  term = add_external_impl_0_9.instance.invokeDynamic(context, w_21, NO_STRATEGIES, new IStrategoTerm[]{y_10.value, z_10.value, a_11.value, b_11.value, c_11.value, d_11.value, transform.constNone0, f_11.value, g_11.value});
                                  if(term == null)
                                    break Fail324;
                                  q_21 = term;
                                  term = u_21;
                                  x_21 = u_21;
                                  if(d_12.value == null)
                                    break Fail324;
                                  z_21 = d_12.value;
                                  term = add_external_impl_0_9.instance.invokeDynamic(context, z_21, NO_STRATEGIES, new IStrategoTerm[]{y_10.value, z_10.value, a_11.value, b_11.value, c_11.value, d_11.value, transform.constBoolean0, f_11.value, g_11.value});
                                  if(term == null)
                                    break Fail324;
                                  r_21 = term;
                                  term = x_21;
                                  a_22 = x_21;
                                  if(x_11.value == null)
                                    break Fail324;
                                  c_22 = x_11.value;
                                  term = add_external_impl_0_9.instance.invokeDynamic(context, c_22, NO_STRATEGIES, new IStrategoTerm[]{y_10.value, z_10.value, a_11.value, b_11.value, c_11.value, d_11.value, transform.constNone0, f_11.value, g_11.value});
                                  if(term == null)
                                    break Fail324;
                                  s_21 = term;
                                  term = a_22;
                                  if(b_12.value == null)
                                    break Fail324;
                                  f_22 = b_12.value;
                                  term = add_external_impl_0_9.instance.invokeDynamic(context, f_22, NO_STRATEGIES, new IStrategoTerm[]{y_10.value, z_10.value, a_11.value, b_11.value, c_11.value, d_11.value, transform.constNone0, f_11.value, g_11.value});
                                  if(term == null)
                                    break Fail324;
                                  term = termFactory.makeAppl(transform._consFor_4, new IStrategoTerm[]{q_21, r_21, s_21, term});
                                  if(true)
                                    break Success205;
                                }
                              }
                              term = term68;
                              IStrategoTerm term69 = term;
                              Success206:
                              { 
                                Fail336:
                                { 
                                  IStrategoTerm t_14 = null;
                                  t_14 = term;
                                  if(f_12.value == null)
                                    break Fail336;
                                  term = f_12.value;
                                  if(term.getTermType() != IStrategoTerm.APPL || transform._consFor_4 != ((IStrategoAppl)term).getConstructor())
                                    break Fail336;
                                  if(y_11.value == null)
                                    y_11.value = term.getSubterm(0);
                                  else
                                    if(y_11.value != term.getSubterm(0) && !y_11.value.match(term.getSubterm(0)))
                                      break Fail336;
                                  if(d_12.value == null)
                                    d_12.value = term.getSubterm(1);
                                  else
                                    if(d_12.value != term.getSubterm(1) && !d_12.value.match(term.getSubterm(1)))
                                      break Fail336;
                                  if(z_11.value == null)
                                    z_11.value = term.getSubterm(2);
                                  else
                                    if(z_11.value != term.getSubterm(2) && !z_11.value.match(term.getSubterm(2)))
                                      break Fail336;
                                  if(b_12.value == null)
                                    b_12.value = term.getSubterm(3);
                                  else
                                    if(b_12.value != term.getSubterm(3) && !b_12.value.match(term.getSubterm(3)))
                                      break Fail336;
                                  term = t_14;
                                  { 
                                    IStrategoTerm g_22 = null;
                                    IStrategoTerm k_22 = null;
                                    IStrategoTerm m_22 = null;
                                    IStrategoTerm h_22 = null;
                                    IStrategoTerm n_22 = null;
                                    IStrategoTerm p_22 = null;
                                    IStrategoTerm i_22 = null;
                                    IStrategoTerm q_22 = null;
                                    IStrategoTerm s_22 = null;
                                    IStrategoTerm v_22 = null;
                                    k_22 = term;
                                    if(y_11.value == null)
                                      break Fail324;
                                    m_22 = y_11.value;
                                    term = add_external_impl_0_9.instance.invokeDynamic(context, m_22, NO_STRATEGIES, new IStrategoTerm[]{y_10.value, z_10.value, a_11.value, b_11.value, c_11.value, d_11.value, transform.constNone0, f_11.value, g_11.value});
                                    if(term == null)
                                      break Fail324;
                                    g_22 = term;
                                    term = k_22;
                                    n_22 = k_22;
                                    if(d_12.value == null)
                                      break Fail324;
                                    p_22 = d_12.value;
                                    term = add_external_impl_0_9.instance.invokeDynamic(context, p_22, NO_STRATEGIES, new IStrategoTerm[]{y_10.value, z_10.value, a_11.value, b_11.value, c_11.value, d_11.value, transform.constBoolean0, f_11.value, g_11.value});
                                    if(term == null)
                                      break Fail324;
                                    h_22 = term;
                                    term = n_22;
                                    q_22 = n_22;
                                    if(z_11.value == null)
                                      break Fail324;
                                    s_22 = z_11.value;
                                    term = add_external_impl_0_9.instance.invokeDynamic(context, s_22, NO_STRATEGIES, new IStrategoTerm[]{y_10.value, z_10.value, a_11.value, b_11.value, c_11.value, d_11.value, transform.constNone0, f_11.value, g_11.value});
                                    if(term == null)
                                      break Fail324;
                                    i_22 = term;
                                    term = q_22;
                                    if(b_12.value == null)
                                      break Fail324;
                                    v_22 = b_12.value;
                                    term = add_external_impl_0_9.instance.invokeDynamic(context, v_22, NO_STRATEGIES, new IStrategoTerm[]{y_10.value, z_10.value, a_11.value, b_11.value, c_11.value, d_11.value, transform.constNone0, f_11.value, g_11.value});
                                    if(term == null)
                                      break Fail324;
                                    term = termFactory.makeAppl(transform._consFor_4, new IStrategoTerm[]{g_22, h_22, i_22, term});
                                    if(true)
                                      break Success206;
                                  }
                                }
                                term = term69;
                                IStrategoTerm term70 = term;
                                Success207:
                                { 
                                  Fail337:
                                  { 
                                    IStrategoTerm u_14 = null;
                                    u_14 = term;
                                    if(f_12.value == null)
                                      break Fail337;
                                    term = f_12.value;
                                    if(term.getTermType() != IStrategoTerm.APPL || transform._consForEach_3 != ((IStrategoAppl)term).getConstructor())
                                      break Fail337;
                                    if(a_12.value == null)
                                      a_12.value = term.getSubterm(0);
                                    else
                                      if(a_12.value != term.getSubterm(0) && !a_12.value.match(term.getSubterm(0)))
                                        break Fail337;
                                    if(d_12.value == null)
                                      d_12.value = term.getSubterm(1);
                                    else
                                      if(d_12.value != term.getSubterm(1) && !d_12.value.match(term.getSubterm(1)))
                                        break Fail337;
                                    if(b_12.value == null)
                                      b_12.value = term.getSubterm(2);
                                    else
                                      if(b_12.value != term.getSubterm(2) && !b_12.value.match(term.getSubterm(2)))
                                        break Fail337;
                                    term = u_14;
                                    { 
                                      IStrategoTerm w_22 = null;
                                      IStrategoTerm z_22 = null;
                                      IStrategoTerm b_23 = null;
                                      IStrategoTerm x_22 = null;
                                      IStrategoTerm c_23 = null;
                                      IStrategoTerm e_23 = null;
                                      IStrategoTerm h_23 = null;
                                      z_22 = term;
                                      if(a_12.value == null)
                                        break Fail324;
                                      b_23 = a_12.value;
                                      term = add_external_impl_0_9.instance.invokeDynamic(context, b_23, NO_STRATEGIES, new IStrategoTerm[]{y_10.value, z_10.value, a_11.value, b_11.value, c_11.value, d_11.value, transform.constNone0, f_11.value, g_11.value});
                                      if(term == null)
                                        break Fail324;
                                      w_22 = term;
                                      term = z_22;
                                      c_23 = z_22;
                                      if(d_12.value == null)
                                        break Fail324;
                                      e_23 = d_12.value;
                                      term = add_external_impl_0_9.instance.invokeDynamic(context, e_23, NO_STRATEGIES, new IStrategoTerm[]{y_10.value, z_10.value, a_11.value, b_11.value, c_11.value, d_11.value, transform.constNone0, f_11.value, g_11.value});
                                      if(term == null)
                                        break Fail324;
                                      x_22 = term;
                                      term = c_23;
                                      if(b_12.value == null)
                                        break Fail324;
                                      h_23 = b_12.value;
                                      term = add_external_impl_0_9.instance.invokeDynamic(context, h_23, NO_STRATEGIES, new IStrategoTerm[]{y_10.value, z_10.value, a_11.value, b_11.value, c_11.value, d_11.value, transform.constNone0, f_11.value, g_11.value});
                                      if(term == null)
                                        break Fail324;
                                      term = termFactory.makeAppl(transform._consForEach_3, new IStrategoTerm[]{w_22, x_22, term});
                                      if(true)
                                        break Success207;
                                    }
                                  }
                                  term = term70;
                                  IStrategoTerm term71 = term;
                                  Success208:
                                  { 
                                    Fail338:
                                    { 
                                      IStrategoTerm v_14 = null;
                                      v_14 = term;
                                      if(f_12.value == null)
                                        break Fail338;
                                      term = f_12.value;
                                      if(term.getTermType() != IStrategoTerm.APPL || transform._consCastPrim_2 != ((IStrategoAppl)term).getConstructor())
                                        break Fail338;
                                      if(c_12.value == null)
                                        c_12.value = term.getSubterm(0);
                                      else
                                        if(c_12.value != term.getSubterm(0) && !c_12.value.match(term.getSubterm(0)))
                                          break Fail338;
                                      if(d_12.value == null)
                                        d_12.value = term.getSubterm(1);
                                      else
                                        if(d_12.value != term.getSubterm(1) && !d_12.value.match(term.getSubterm(1)))
                                          break Fail338;
                                      term = v_14;
                                      { 
                                        IStrategoTerm i_23 = null;
                                        IStrategoTerm j_23 = null;
                                        IStrategoTerm l_23 = null;
                                        j_23 = term;
                                        if(d_12.value == null)
                                          break Fail324;
                                        l_23 = d_12.value;
                                        term = add_external_impl_0_9.instance.invokeDynamic(context, l_23, NO_STRATEGIES, new IStrategoTerm[]{y_10.value, z_10.value, a_11.value, b_11.value, c_11.value, d_11.value, transform.constNone0, f_11.value, g_11.value});
                                        if(term == null)
                                          break Fail324;
                                        i_23 = term;
                                        term = j_23;
                                        if(c_12.value == null)
                                          break Fail324;
                                        term = termFactory.makeAppl(transform._consCastPrim_2, new IStrategoTerm[]{c_12.value, i_23});
                                        if(true)
                                          break Success208;
                                      }
                                    }
                                    term = term71;
                                    IStrategoTerm term72 = term;
                                    Success209:
                                    { 
                                      Fail339:
                                      { 
                                        IStrategoTerm w_14 = null;
                                        w_14 = term;
                                        if(f_12.value == null)
                                          break Fail339;
                                        term = f_12.value;
                                        if(term.getTermType() != IStrategoTerm.APPL || transform._consCastRef_2 != ((IStrategoAppl)term).getConstructor())
                                          break Fail339;
                                        if(c_12.value == null)
                                          c_12.value = term.getSubterm(0);
                                        else
                                          if(c_12.value != term.getSubterm(0) && !c_12.value.match(term.getSubterm(0)))
                                            break Fail339;
                                        if(d_12.value == null)
                                          d_12.value = term.getSubterm(1);
                                        else
                                          if(d_12.value != term.getSubterm(1) && !d_12.value.match(term.getSubterm(1)))
                                            break Fail339;
                                        term = w_14;
                                        { 
                                          IStrategoTerm m_23 = null;
                                          IStrategoTerm n_23 = null;
                                          IStrategoTerm p_23 = null;
                                          n_23 = term;
                                          if(d_12.value == null)
                                            break Fail324;
                                          p_23 = d_12.value;
                                          term = add_external_impl_0_9.instance.invokeDynamic(context, p_23, NO_STRATEGIES, new IStrategoTerm[]{y_10.value, z_10.value, a_11.value, b_11.value, c_11.value, d_11.value, transform.constNone0, f_11.value, g_11.value});
                                          if(term == null)
                                            break Fail324;
                                          m_23 = term;
                                          term = n_23;
                                          if(c_12.value == null)
                                            break Fail324;
                                          term = termFactory.makeAppl(transform._consCastRef_2, new IStrategoTerm[]{c_12.value, m_23});
                                          if(true)
                                            break Success209;
                                        }
                                      }
                                      term = term72;
                                      if(e_12.value == null)
                                        break Fail324;
                                      term = e_12.value;
                                      lifted49 lifted490 = new lifted49();
                                      lifted490.y_10 = y_10;
                                      lifted490.z_10 = z_10;
                                      lifted490.a_11 = a_11;
                                      lifted490.b_11 = b_11;
                                      lifted490.c_11 = c_11;
                                      lifted490.d_11 = d_11;
                                      lifted490.e_11 = e_11;
                                      lifted490.f_11 = f_11;
                                      lifted490.g_11 = g_11;
                                      term = SRTS_all.instance.invoke(context, term, lifted490);
                                      if(term == null)
                                        break Fail324;
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
    TermReference y_10;

    TermReference z_10;

    TermReference a_11;

    TermReference b_11;

    TermReference c_11;

    TermReference d_11;

    TermReference e_11;

    TermReference f_11;

    TermReference g_11;

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      Fail340:
      { 
        term = add_external_impl_0_9.instance.invokeDynamic(context, term, NO_STRATEGIES, new IStrategoTerm[]{y_10.value, z_10.value, a_11.value, b_11.value, c_11.value, d_11.value, e_11.value, f_11.value, g_11.value});
        if(term == null)
          break Fail340;
        if(true)
          return term;
      }
      return null;
    }
  }

  @SuppressWarnings("all") private static final class lifted48 extends Strategy 
  { 
    TermReference y_10;

    TermReference z_10;

    TermReference a_11;

    TermReference b_11;

    TermReference c_11;

    TermReference d_11;

    TermReference f_11;

    TermReference g_11;

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      Fail341:
      { 
        IStrategoTerm s_19 = null;
        s_19 = term;
        term = add_external_impl_0_9.instance.invokeDynamic(context, s_19, NO_STRATEGIES, new IStrategoTerm[]{y_10.value, z_10.value, a_11.value, b_11.value, c_11.value, d_11.value, transform.constBoolean0, f_11.value, g_11.value});
        if(term == null)
          break Fail341;
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
      Fail342:
      { 
        if(term.getTermType() != IStrategoTerm.APPL || transform._consLazyOr_2 != ((IStrategoAppl)term).getConstructor())
          break Fail342;
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
      Fail343:
      { 
        if(term.getTermType() != IStrategoTerm.APPL || transform._consLazyAnd_2 != ((IStrategoAppl)term).getConstructor())
          break Fail343;
        if(true)
          return term;
      }
      return null;
    }
  }

  @SuppressWarnings("all") private static final class lifted45 extends Strategy 
  { 
    TermReference e_12;

    TermReference e_11;

    TermReference y_10;

    TermReference z_10;

    TermReference a_11;

    TermReference b_11;

    TermReference c_11;

    TermReference d_11;

    TermReference f_11;

    TermReference g_11;

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      Fail344:
      { 
        IStrategoTerm r_17 = null;
        r_17 = term;
        if(e_12.value == null)
          break Fail344;
        term = type_of_0_3.instance.invoke(context, e_12.value, e_11.value, y_10.value, z_10.value);
        if(term == null)
          break Fail344;
        term = add_external_impl_0_9.instance.invokeDynamic(context, r_17, NO_STRATEGIES, new IStrategoTerm[]{y_10.value, z_10.value, a_11.value, b_11.value, c_11.value, d_11.value, term, f_11.value, g_11.value});
        if(term == null)
          break Fail344;
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
      Fail345:
      { 
        if(term.getTermType() != IStrategoTerm.APPL || transform._consComplement_1 != ((IStrategoAppl)term).getConstructor())
          break Fail345;
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
      Fail346:
      { 
        term = or_2_0.instance.invoke(context, term, lifted42.instance, lifted43.instance);
        if(term == null)
          break Fail346;
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
      Fail347:
      { 
        if(term.getTermType() != IStrategoTerm.APPL || transform._consPlus_1 != ((IStrategoAppl)term).getConstructor())
          break Fail347;
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
      Fail348:
      { 
        if(term.getTermType() != IStrategoTerm.APPL || transform._consMinus_1 != ((IStrategoAppl)term).getConstructor())
          break Fail348;
        if(true)
          return term;
      }
      return null;
    }
  }

  @SuppressWarnings("all") private static final class lifted40 extends Strategy 
  { 
    TermReference y_10;

    TermReference z_10;

    TermReference a_11;

    TermReference b_11;

    TermReference c_11;

    TermReference d_11;

    TermReference f_11;

    TermReference g_11;

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      Fail349:
      { 
        IStrategoTerm p_17 = null;
        p_17 = term;
        term = add_external_impl_0_9.instance.invokeDynamic(context, p_17, NO_STRATEGIES, new IStrategoTerm[]{y_10.value, z_10.value, a_11.value, b_11.value, c_11.value, d_11.value, transform.constBoolean0, f_11.value, g_11.value});
        if(term == null)
          break Fail349;
        if(true)
          return term;
      }
      return null;
    }
  }

  @SuppressWarnings("all") private static final class lifted39 extends Strategy 
  { 
    TermReference e_11;

    TermReference y_10;

    TermReference z_10;

    TermReference a_11;

    TermReference b_11;

    TermReference c_11;

    TermReference d_11;

    TermReference f_11;

    TermReference g_11;

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      Fail350:
      { 
        IStrategoTerm f_16 = null;
        f_16 = term;
        if(e_11.value == null)
          break Fail350;
        term = cast_bounded_arithmetic_type_0_0.instance.invoke(context, e_11.value);
        if(term == null)
          break Fail350;
        term = add_external_impl_0_9.instance.invokeDynamic(context, f_16, NO_STRATEGIES, new IStrategoTerm[]{y_10.value, z_10.value, a_11.value, b_11.value, c_11.value, d_11.value, term, f_11.value, g_11.value});
        if(term == null)
          break Fail350;
        if(true)
          return term;
      }
      return null;
    }
  }

  @SuppressWarnings("all") private static final class lifted38 extends Strategy 
  { 
    TermReference y_10;

    TermReference z_10;

    TermReference a_11;

    TermReference b_11;

    TermReference c_11;

    TermReference d_11;

    TermReference f_11;

    TermReference g_11;

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      Fail351:
      { 
        IStrategoTerm d_16 = null;
        d_16 = term;
        term = add_external_impl_0_9.instance.invokeDynamic(context, d_16, NO_STRATEGIES, new IStrategoTerm[]{y_10.value, z_10.value, a_11.value, b_11.value, c_11.value, d_11.value, transform.constDouble0, f_11.value, g_11.value});
        if(term == null)
          break Fail351;
        if(true)
          return term;
      }
      return null;
    }
  }

  @SuppressWarnings("all") private static final class lifted37 extends Strategy 
  { 
    TermReference u_11;

    TermReference v_11;

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      Fail352:
      { 
        if(term.getTermType() != IStrategoTerm.APPL || transform._consRemain_2 != ((IStrategoAppl)term).getConstructor())
          break Fail352;
        if(u_11.value == null)
          u_11.value = term.getSubterm(0);
        else
          if(u_11.value != term.getSubterm(0) && !u_11.value.match(term.getSubterm(0)))
            break Fail352;
        if(v_11.value == null)
          v_11.value = term.getSubterm(1);
        else
          if(v_11.value != term.getSubterm(1) && !v_11.value.match(term.getSubterm(1)))
            break Fail352;
        if(true)
          return term;
      }
      return null;
    }
  }

  @SuppressWarnings("all") private static final class lifted30 extends Strategy 
  { 
    TermReference u_11;

    TermReference v_11;

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      Fail353:
      { 
        lifted34 lifted340 = new lifted34();
        lifted31 lifted311 = new lifted31();
        lifted340.u_11 = u_11;
        lifted340.v_11 = v_11;
        lifted311.u_11 = u_11;
        lifted311.v_11 = v_11;
        term = or_2_0.instance.invoke(context, term, lifted311, lifted340);
        if(term == null)
          break Fail353;
        if(true)
          return term;
      }
      return null;
    }
  }

  @SuppressWarnings("all") private static final class lifted34 extends Strategy 
  { 
    TermReference u_11;

    TermReference v_11;

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      Fail354:
      { 
        lifted36 lifted360 = new lifted36();
        lifted35 lifted350 = new lifted35();
        lifted360.u_11 = u_11;
        lifted360.v_11 = v_11;
        lifted350.u_11 = u_11;
        lifted350.v_11 = v_11;
        term = or_2_0.instance.invoke(context, term, lifted350, lifted360);
        if(term == null)
          break Fail354;
        if(true)
          return term;
      }
      return null;
    }
  }

  @SuppressWarnings("all") private static final class lifted36 extends Strategy 
  { 
    TermReference u_11;

    TermReference v_11;

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      Fail355:
      { 
        if(term.getTermType() != IStrategoTerm.APPL || transform._consDiv_2 != ((IStrategoAppl)term).getConstructor())
          break Fail355;
        if(u_11.value == null)
          u_11.value = term.getSubterm(0);
        else
          if(u_11.value != term.getSubterm(0) && !u_11.value.match(term.getSubterm(0)))
            break Fail355;
        if(v_11.value == null)
          v_11.value = term.getSubterm(1);
        else
          if(v_11.value != term.getSubterm(1) && !v_11.value.match(term.getSubterm(1)))
            break Fail355;
        if(true)
          return term;
      }
      return null;
    }
  }

  @SuppressWarnings("all") private static final class lifted35 extends Strategy 
  { 
    TermReference u_11;

    TermReference v_11;

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      Fail356:
      { 
        if(term.getTermType() != IStrategoTerm.APPL || transform._consMul_2 != ((IStrategoAppl)term).getConstructor())
          break Fail356;
        if(u_11.value == null)
          u_11.value = term.getSubterm(0);
        else
          if(u_11.value != term.getSubterm(0) && !u_11.value.match(term.getSubterm(0)))
            break Fail356;
        if(v_11.value == null)
          v_11.value = term.getSubterm(1);
        else
          if(v_11.value != term.getSubterm(1) && !v_11.value.match(term.getSubterm(1)))
            break Fail356;
        if(true)
          return term;
      }
      return null;
    }
  }

  @SuppressWarnings("all") private static final class lifted31 extends Strategy 
  { 
    TermReference u_11;

    TermReference v_11;

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      Fail357:
      { 
        lifted33 lifted330 = new lifted33();
        lifted32 lifted320 = new lifted32();
        lifted330.u_11 = u_11;
        lifted330.v_11 = v_11;
        lifted320.u_11 = u_11;
        lifted320.v_11 = v_11;
        term = or_2_0.instance.invoke(context, term, lifted320, lifted330);
        if(term == null)
          break Fail357;
        if(true)
          return term;
      }
      return null;
    }
  }

  @SuppressWarnings("all") private static final class lifted33 extends Strategy 
  { 
    TermReference u_11;

    TermReference v_11;

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      Fail358:
      { 
        if(term.getTermType() != IStrategoTerm.APPL || transform._consMinus_2 != ((IStrategoAppl)term).getConstructor())
          break Fail358;
        if(u_11.value == null)
          u_11.value = term.getSubterm(0);
        else
          if(u_11.value != term.getSubterm(0) && !u_11.value.match(term.getSubterm(0)))
            break Fail358;
        if(v_11.value == null)
          v_11.value = term.getSubterm(1);
        else
          if(v_11.value != term.getSubterm(1) && !v_11.value.match(term.getSubterm(1)))
            break Fail358;
        if(true)
          return term;
      }
      return null;
    }
  }

  @SuppressWarnings("all") private static final class lifted32 extends Strategy 
  { 
    TermReference u_11;

    TermReference v_11;

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      Fail359:
      { 
        if(term.getTermType() != IStrategoTerm.APPL || transform._consPlus_2 != ((IStrategoAppl)term).getConstructor())
          break Fail359;
        if(u_11.value == null)
          u_11.value = term.getSubterm(0);
        else
          if(u_11.value != term.getSubterm(0) && !u_11.value.match(term.getSubterm(0)))
            break Fail359;
        if(v_11.value == null)
          v_11.value = term.getSubterm(1);
        else
          if(v_11.value != term.getSubterm(1) && !v_11.value.match(term.getSubterm(1)))
            break Fail359;
        if(true)
          return term;
      }
      return null;
    }
  }

  @SuppressWarnings("all") private static final class lifted29 extends Strategy 
  { 
    TermReference y_10;

    TermReference z_10;

    TermReference a_11;

    TermReference b_11;

    TermReference c_11;

    TermReference d_11;

    TermReference f_11;

    TermReference g_11;

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      Fail360:
      { 
        IStrategoTerm z_15 = null;
        z_15 = term;
        term = add_external_impl_0_9.instance.invokeDynamic(context, z_15, NO_STRATEGIES, new IStrategoTerm[]{y_10.value, z_10.value, a_11.value, b_11.value, c_11.value, d_11.value, transform.constDouble0, f_11.value, g_11.value});
        if(term == null)
          break Fail360;
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
      Fail361:
      { 
        term = or_2_0.instance.invoke(context, term, lifted27.instance, lifted28.instance);
        if(term == null)
          break Fail361;
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
      Fail362:
      { 
        if(term.getTermType() != IStrategoTerm.APPL || transform._consGtEq_2 != ((IStrategoAppl)term).getConstructor())
          break Fail362;
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
      Fail363:
      { 
        if(term.getTermType() != IStrategoTerm.APPL || transform._consGt_2 != ((IStrategoAppl)term).getConstructor())
          break Fail363;
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
      Fail364:
      { 
        term = or_2_0.instance.invoke(context, term, lifted24.instance, lifted25.instance);
        if(term == null)
          break Fail364;
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
      Fail365:
      { 
        if(term.getTermType() != IStrategoTerm.APPL || transform._consLtEq_2 != ((IStrategoAppl)term).getConstructor())
          break Fail365;
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
      Fail366:
      { 
        if(term.getTermType() != IStrategoTerm.APPL || transform._consLt_2 != ((IStrategoAppl)term).getConstructor())
          break Fail366;
        if(true)
          return term;
      }
      return null;
    }
  }

  @SuppressWarnings("all") private static final class lifted22 extends Strategy 
  { 
    TermReference e_11;

    TermReference y_10;

    TermReference z_10;

    TermReference a_11;

    TermReference b_11;

    TermReference c_11;

    TermReference d_11;

    TermReference f_11;

    TermReference g_11;

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      Fail367:
      { 
        IStrategoTerm x_15 = null;
        x_15 = term;
        if(e_11.value == null)
          break Fail367;
        term = cast_bounded_conditional_type_0_0.instance.invoke(context, e_11.value);
        if(term == null)
          break Fail367;
        term = add_external_impl_0_9.instance.invokeDynamic(context, x_15, NO_STRATEGIES, new IStrategoTerm[]{y_10.value, z_10.value, a_11.value, b_11.value, c_11.value, d_11.value, term, f_11.value, g_11.value});
        if(term == null)
          break Fail367;
        if(true)
          return term;
      }
      return null;
    }
  }

  @SuppressWarnings("all") private static final class lifted21 extends Strategy 
  { 
    TermReference u_11;

    TermReference v_11;

    TermReference e_11;

    TermReference y_10;

    TermReference z_10;

    TermReference a_11;

    TermReference b_11;

    TermReference c_11;

    TermReference d_11;

    TermReference f_11;

    TermReference g_11;

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      ITermFactory termFactory = context.getFactory();
      Fail368:
      { 
        IStrategoTerm u_15 = null;
        u_15 = term;
        if(u_11.value == null || v_11.value == null)
          break Fail368;
        term = termFactory.makeTuple(u_11.value, v_11.value);
        term = try_to_get_type_0_3.instance.invoke(context, term, e_11.value, y_10.value, z_10.value);
        if(term == null)
          break Fail368;
        term = cast_conditional_type_0_0.instance.invoke(context, term);
        if(term == null)
          break Fail368;
        term = add_external_impl_0_9.instance.invokeDynamic(context, u_15, NO_STRATEGIES, new IStrategoTerm[]{y_10.value, z_10.value, a_11.value, b_11.value, c_11.value, d_11.value, term, f_11.value, g_11.value});
        if(term == null)
          break Fail368;
        if(true)
          return term;
      }
      return null;
    }
  }

  @SuppressWarnings("all") private static final class lifted20 extends Strategy 
  { 
    TermReference u_11;

    TermReference v_11;

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      Fail369:
      { 
        if(term.getTermType() != IStrategoTerm.APPL || transform._consAnd_2 != ((IStrategoAppl)term).getConstructor())
          break Fail369;
        if(u_11.value == null)
          u_11.value = term.getSubterm(0);
        else
          if(u_11.value != term.getSubterm(0) && !u_11.value.match(term.getSubterm(0)))
            break Fail369;
        if(v_11.value == null)
          v_11.value = term.getSubterm(1);
        else
          if(v_11.value != term.getSubterm(1) && !v_11.value.match(term.getSubterm(1)))
            break Fail369;
        if(true)
          return term;
      }
      return null;
    }
  }

  @SuppressWarnings("all") private static final class lifted17 extends Strategy 
  { 
    TermReference u_11;

    TermReference v_11;

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      Fail370:
      { 
        lifted19 lifted190 = new lifted19();
        lifted18 lifted180 = new lifted18();
        lifted190.u_11 = u_11;
        lifted190.v_11 = v_11;
        lifted180.u_11 = u_11;
        lifted180.v_11 = v_11;
        term = or_2_0.instance.invoke(context, term, lifted180, lifted190);
        if(term == null)
          break Fail370;
        if(true)
          return term;
      }
      return null;
    }
  }

  @SuppressWarnings("all") private static final class lifted19 extends Strategy 
  { 
    TermReference u_11;

    TermReference v_11;

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      Fail371:
      { 
        if(term.getTermType() != IStrategoTerm.APPL || transform._consExcOr_2 != ((IStrategoAppl)term).getConstructor())
          break Fail371;
        if(u_11.value == null)
          u_11.value = term.getSubterm(0);
        else
          if(u_11.value != term.getSubterm(0) && !u_11.value.match(term.getSubterm(0)))
            break Fail371;
        if(v_11.value == null)
          v_11.value = term.getSubterm(1);
        else
          if(v_11.value != term.getSubterm(1) && !v_11.value.match(term.getSubterm(1)))
            break Fail371;
        if(true)
          return term;
      }
      return null;
    }
  }

  @SuppressWarnings("all") private static final class lifted18 extends Strategy 
  { 
    TermReference u_11;

    TermReference v_11;

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      Fail372:
      { 
        if(term.getTermType() != IStrategoTerm.APPL || transform._consOr_2 != ((IStrategoAppl)term).getConstructor())
          break Fail372;
        if(u_11.value == null)
          u_11.value = term.getSubterm(0);
        else
          if(u_11.value != term.getSubterm(0) && !u_11.value.match(term.getSubterm(0)))
            break Fail372;
        if(v_11.value == null)
          v_11.value = term.getSubterm(1);
        else
          if(v_11.value != term.getSubterm(1) && !v_11.value.match(term.getSubterm(1)))
            break Fail372;
        if(true)
          return term;
      }
      return null;
    }
  }

  @SuppressWarnings("all") private static final class lifted16 extends Strategy 
  { 
    TermReference u_11;

    TermReference v_11;

    TermReference y_10;

    TermReference z_10;

    TermReference a_11;

    TermReference b_11;

    TermReference c_11;

    TermReference d_11;

    TermReference f_11;

    TermReference g_11;

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      ITermFactory termFactory = context.getFactory();
      Fail373:
      { 
        IStrategoTerm q_15 = null;
        IStrategoTerm s_15 = null;
        q_15 = term;
        if(u_11.value == null || v_11.value == null)
          break Fail373;
        term = termFactory.makeTuple(u_11.value, v_11.value);
        s_15 = term;
        term = try_to_get_type_0_3.instance.invoke(context, s_15, transform.constNone0, y_10.value, z_10.value);
        if(term == null)
          break Fail373;
        term = cast_equality_type_0_0.instance.invoke(context, term);
        if(term == null)
          break Fail373;
        term = add_external_impl_0_9.instance.invokeDynamic(context, q_15, NO_STRATEGIES, new IStrategoTerm[]{y_10.value, z_10.value, a_11.value, b_11.value, c_11.value, d_11.value, term, f_11.value, g_11.value});
        if(term == null)
          break Fail373;
        if(true)
          return term;
      }
      return null;
    }
  }

  @SuppressWarnings("all") private static final class lifted15 extends Strategy 
  { 
    TermReference u_11;

    TermReference v_11;

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      Fail374:
      { 
        if(term.getTermType() != IStrategoTerm.APPL || transform._consNotEq_2 != ((IStrategoAppl)term).getConstructor())
          break Fail374;
        if(u_11.value == null)
          u_11.value = term.getSubterm(0);
        else
          if(u_11.value != term.getSubterm(0) && !u_11.value.match(term.getSubterm(0)))
            break Fail374;
        if(v_11.value == null)
          v_11.value = term.getSubterm(1);
        else
          if(v_11.value != term.getSubterm(1) && !v_11.value.match(term.getSubterm(1)))
            break Fail374;
        if(true)
          return term;
      }
      return null;
    }
  }

  @SuppressWarnings("all") private static final class lifted14 extends Strategy 
  { 
    TermReference u_11;

    TermReference v_11;

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      Fail375:
      { 
        if(term.getTermType() != IStrategoTerm.APPL || transform._consEq_2 != ((IStrategoAppl)term).getConstructor())
          break Fail375;
        if(u_11.value == null)
          u_11.value = term.getSubterm(0);
        else
          if(u_11.value != term.getSubterm(0) && !u_11.value.match(term.getSubterm(0)))
            break Fail375;
        if(v_11.value == null)
          v_11.value = term.getSubterm(1);
        else
          if(v_11.value != term.getSubterm(1) && !v_11.value.match(term.getSubterm(1)))
            break Fail375;
        if(true)
          return term;
      }
      return null;
    }
  }

  @SuppressWarnings("all") private static final class lifted13 extends Strategy 
  { 
    TermReference y_10;

    TermReference z_10;

    TermReference a_11;

    TermReference b_11;

    TermReference c_11;

    TermReference d_11;

    TermReference c_12;

    TermReference f_11;

    TermReference g_11;

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      Fail376:
      { 
        term = add_external_impl_0_9.instance.invokeDynamic(context, term, NO_STRATEGIES, new IStrategoTerm[]{y_10.value, z_10.value, a_11.value, b_11.value, c_11.value, d_11.value, c_12.value, f_11.value, g_11.value});
        if(term == null)
          break Fail376;
        if(true)
          return term;
      }
      return null;
    }
  }

  @SuppressWarnings("all") private static final class lifted12 extends Strategy 
  { 
    TermReference c_12;

    TermReference n_11;

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      Fail377:
      { 
        if(term.getTermType() != IStrategoTerm.APPL || transform._consLocalVarDec_3 != ((IStrategoAppl)term).getConstructor())
          break Fail377;
        if(c_12.value == null)
          c_12.value = term.getSubterm(1);
        else
          if(c_12.value != term.getSubterm(1) && !c_12.value.match(term.getSubterm(1)))
            break Fail377;
        if(n_11.value == null)
          n_11.value = term.getSubterm(2);
        else
          if(n_11.value != term.getSubterm(2) && !n_11.value.match(term.getSubterm(2)))
            break Fail377;
        if(true)
          return term;
      }
      return null;
    }
  }

  @SuppressWarnings("all") private static final class lifted11 extends Strategy 
  { 
    TermReference c_12;

    TermReference n_11;

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      Fail378:
      { 
        if(term.getTermType() != IStrategoTerm.APPL || transform._consFieldDec_3 != ((IStrategoAppl)term).getConstructor())
          break Fail378;
        if(c_12.value == null)
          c_12.value = term.getSubterm(1);
        else
          if(c_12.value != term.getSubterm(1) && !c_12.value.match(term.getSubterm(1)))
            break Fail378;
        if(n_11.value == null)
          n_11.value = term.getSubterm(2);
        else
          if(n_11.value != term.getSubterm(2) && !n_11.value.match(term.getSubterm(2)))
            break Fail378;
        if(true)
          return term;
      }
      return null;
    }
  }

  @SuppressWarnings("all") private static final class lifted10 extends Strategy 
  { 
    TermReference y_10;

    TermReference z_10;

    TermReference a_11;

    TermReference b_11;

    TermReference c_11;

    TermReference d_11;

    TermReference e_11;

    TermReference f_11;

    TermReference g_11;

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      Fail379:
      { 
        term = add_external_impl_0_9.instance.invokeDynamic(context, term, NO_STRATEGIES, new IStrategoTerm[]{y_10.value, z_10.value, a_11.value, b_11.value, c_11.value, d_11.value, e_11.value, f_11.value, g_11.value});
        if(term == null)
          break Fail379;
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
      Fail380:
      { 
        if(term.getTermType() != IStrategoTerm.APPL || transform._consExprName_2 != ((IStrategoAppl)term).getConstructor())
          break Fail380;
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
      Fail381:
      { 
        if(term.getTermType() != IStrategoTerm.APPL || transform._consExprName_1 != ((IStrategoAppl)term).getConstructor())
          break Fail381;
        if(true)
          return term;
      }
      return null;
    }
  }

  @SuppressWarnings("all") private static final class lifted7 extends Strategy 
  { 
    TermReference y_10;

    TermReference k_11;

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      Fail382:
      { 
        term = decreament_0_2.instance.invoke(context, term, y_10.value, k_11.value);
        if(term == null)
          break Fail382;
        if(true)
          return term;
      }
      return null;
    }
  }

  @SuppressWarnings("all") private static final class lifted6 extends Strategy 
  { 
    TermReference y_10;

    TermReference z_10;

    TermReference a_11;

    TermReference k_11;

    TermReference c_11;

    TermReference d_11;

    TermReference e_11;

    TermReference i_11;

    TermReference g_11;

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      Fail383:
      { 
        term = add_external_impl_0_9.instance.invokeDynamic(context, term, NO_STRATEGIES, new IStrategoTerm[]{y_10.value, z_10.value, a_11.value, k_11.value, c_11.value, d_11.value, e_11.value, i_11.value, g_11.value});
        if(term == null)
          break Fail383;
        if(true)
          return term;
      }
      return null;
    }
  }

  @SuppressWarnings("all") private static final class lifted4 extends Strategy 
  { 
    TermReference y_10;

    TermReference k_11;

    TermReference z_10;

    TermReference e_11;

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      Fail384:
      { 
        lifted5 lifted510 = new lifted5();
        lifted510.y_10 = y_10;
        lifted510.k_11 = k_11;
        lifted510.z_10 = z_10;
        lifted510.e_11 = e_11;
        term = try_1_0.instance.invoke(context, term, lifted510);
        if(term == null)
          break Fail384;
        if(true)
          return term;
      }
      return null;
    }
  }

  @SuppressWarnings("all") private static final class lifted5 extends Strategy 
  { 
    TermReference y_10;

    TermReference k_11;

    TermReference z_10;

    TermReference e_11;

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      Fail385:
      { 
        term = add__params_0_4.instance.invoke(context, term, y_10.value, k_11.value, z_10.value, e_11.value);
        if(term == null)
          break Fail385;
        if(true)
          return term;
      }
      return null;
    }
  }

  @SuppressWarnings("all") private static final class lifted3 extends Strategy 
  { 
    TermReference y_10;

    TermReference k_11;

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      Fail386:
      { 
        term = decreament_0_2.instance.invoke(context, term, y_10.value, k_11.value);
        if(term == null)
          break Fail386;
        if(true)
          return term;
      }
      return null;
    }
  }

  @SuppressWarnings("all") private static final class lifted2 extends Strategy 
  { 
    TermReference y_10;

    TermReference z_10;

    TermReference a_11;

    TermReference k_11;

    TermReference c_11;

    TermReference d_11;

    TermReference e_11;

    TermReference f_11;

    TermReference g_11;

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      Fail387:
      { 
        term = add_external_impl_0_9.instance.invokeDynamic(context, term, NO_STRATEGIES, new IStrategoTerm[]{y_10.value, z_10.value, a_11.value, k_11.value, c_11.value, d_11.value, e_11.value, f_11.value, g_11.value});
        if(term == null)
          break Fail387;
        if(true)
          return term;
      }
      return null;
    }
  }

  @SuppressWarnings("all") private static final class lifted0 extends Strategy 
  { 
    TermReference d_9;

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      Fail388:
      { 
        lifted1 lifted130 = new lifted1();
        lifted130.d_9 = d_9;
        term = try_1_0.instance.invoke(context, term, lifted130);
        if(term == null)
          break Fail388;
        if(true)
          return term;
      }
      return null;
    }
  }

  @SuppressWarnings("all") private static final class lifted1 extends Strategy 
  { 
    TermReference d_9;

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      ITermFactory termFactory = context.getFactory();
      Fail389:
      { 
        IStrategoTerm e_9 = null;
        if(term.getTermType() != IStrategoTerm.APPL || transform._consClassBody_1 != ((IStrategoAppl)term).getConstructor())
          break Fail389;
        e_9 = term.getSubterm(0);
        if(d_9.value == null)
          break Fail389;
        term = iset_elements_0_0.instance.invoke(context, d_9.value);
        if(term == null)
          break Fail389;
        term = termFactory.makeTuple(e_9, term);
        term = conc_0_0.instance.invoke(context, term);
        if(term == null)
          break Fail389;
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
      varScope.addSVar("make_on_entry_method_0_4", new InteropSDefT(make_on_entry_method_0_4.instance, context));
      varScope.addSVar("make_on_exit_method_0_4", new InteropSDefT(make_on_exit_method_0_4.instance, context));
      varScope.addSVar("convert_0_0", new InteropSDefT(convert_0_0.instance, context));
      varScope.addSVar("generate_imports_0_2", new InteropSDefT(generate_imports_0_2.instance, context));
      varScope.addSVar("get_coordinator_0_1", new InteropSDefT(get_coordinator_0_1.instance, context));
      varScope.addSVar("fetch_coordinator_type_0_0", new InteropSDefT(fetch_coordinator_type_0_0.instance, context));
      varScope.addSVar("convert_coordinator_declaration_0_1", new InteropSDefT(convert_coordinator_declaration_0_1.instance, context));
      varScope.addSVar("gen_coordinator_body_0_1", new InteropSDefT(gen_coordinator_body_0_1.instance, context));
      varScope.addSVar("make_lock_and_unlock_methods_0_7", new InteropSDefT(make_lock_and_unlock_methods_0_7.instance, context));
      varScope.addSVar("make_unlock_method_0_3", new InteropSDefT(make_unlock_method_0_3.instance, context));
      varScope.addSVar("make_lock_method_0_6", new InteropSDefT(make_lock_method_0_6.instance, context));
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
      varScope.addSVar("make_on_entry_method_0_4", new InteropSDefT(classLoader, "transform$make_on_entry_method_0_4", context));
      varScope.addSVar("make_on_exit_method_0_4", new InteropSDefT(classLoader, "transform$make_on_exit_method_0_4", context));
      varScope.addSVar("convert_0_0", new InteropSDefT(classLoader, "transform$convert_0_0", context));
      varScope.addSVar("generate_imports_0_2", new InteropSDefT(classLoader, "transform$generate_imports_0_2", context));
      varScope.addSVar("get_coordinator_0_1", new InteropSDefT(classLoader, "transform$get_coordinator_0_1", context));
      varScope.addSVar("fetch_coordinator_type_0_0", new InteropSDefT(classLoader, "transform$fetch_coordinator_type_0_0", context));
      varScope.addSVar("convert_coordinator_declaration_0_1", new InteropSDefT(classLoader, "transform$convert_coordinator_declaration_0_1", context));
      varScope.addSVar("gen_coordinator_body_0_1", new InteropSDefT(classLoader, "transform$gen_coordinator_body_0_1", context));
      varScope.addSVar("make_lock_and_unlock_methods_0_7", new InteropSDefT(classLoader, "transform$make_lock_and_unlock_methods_0_7", context));
      varScope.addSVar("make_unlock_method_0_3", new InteropSDefT(classLoader, "transform$make_unlock_method_0_3", context));
      varScope.addSVar("make_lock_method_0_6", new InteropSDefT(classLoader, "transform$make_lock_method_0_6", context));
      varScope.addSVar("fillMethodMaps_0_4", new InteropSDefT(classLoader, "transform$fill$Method$Maps_0_4", context));
      varScope.addSVar("add_condition_fields_0_0", new InteropSDefT(classLoader, "transform$add_condition_fields_0_0", context));
      varScope.addSVar("add_coordinator_fields_0_0", new InteropSDefT(classLoader, "transform$add_coordinator_fields_0_0", context));
      varScope.addSVar("get_methods_list_0_0", new InteropSDefT(classLoader, "transform$get_methods_list_0_0", context));
    }
  }
}