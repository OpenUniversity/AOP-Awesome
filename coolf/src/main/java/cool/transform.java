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

  protected static IStrategoTerm const78;

  protected static IStrategoTerm constMarkerAnno1;

  protected static IStrategoTerm constTypeName12;

  protected static IStrategoTerm constId39;

  protected static IStrategoTerm const77;

  protected static IStrategoTerm const76;

  protected static IStrategoTerm constCons26;

  protected static IStrategoTerm constCons25;

  protected static IStrategoTerm constMarkerAnno0;

  protected static IStrategoTerm constTypeName11;

  protected static IStrategoTerm constId38;

  protected static IStrategoTerm const75;

  protected static IStrategoTerm const74;

  protected static IStrategoTerm const73;

  protected static IStrategoTerm const72;

  protected static IStrategoTerm constTypeName10;

  protected static IStrategoTerm constId37;

  protected static IStrategoTerm const71;

  protected static IStrategoTerm constId36;

  protected static IStrategoTerm const70;

  protected static IStrategoTerm constCons24;

  protected static IStrategoTerm constTry0;

  protected static IStrategoTerm constCons23;

  protected static IStrategoTerm constCatch0;

  protected static IStrategoTerm constBlock2;

  protected static IStrategoTerm constCons22;

  protected static IStrategoTerm constReturn1;

  protected static IStrategoTerm constParam1;

  protected static IStrategoTerm constId35;

  protected static IStrategoTerm const69;

  protected static IStrategoTerm constClassOrInterfaceType3;

  protected static IStrategoTerm constTypeName9;

  protected static IStrategoTerm constId34;

  protected static IStrategoTerm const68;

  protected static IStrategoTerm constBlock1;

  protected static IStrategoTerm constCons21;

  protected static IStrategoTerm constExprStm1;

  protected static IStrategoTerm constInvoke4;

  protected static IStrategoTerm constMethod5;

  protected static IStrategoTerm constMethodName5;

  protected static IStrategoTerm constId33;

  protected static IStrategoTerm const67;

  protected static IStrategoTerm const66;

  protected static IStrategoTerm constMethod4;

  protected static IStrategoTerm constMethodName4;

  protected static IStrategoTerm const65;

  protected static IStrategoTerm const64;

  protected static IStrategoTerm const63;

  protected static IStrategoTerm const62;

  protected static IStrategoTerm constCons20;

  protected static IStrategoTerm constExprStm0;

  protected static IStrategoTerm constInvoke3;

  protected static IStrategoTerm constMethod3;

  protected static IStrategoTerm constMethodName3;

  protected static IStrategoTerm constId32;

  protected static IStrategoTerm const61;

  protected static IStrategoTerm constId31;

  protected static IStrategoTerm const60;

  protected static IStrategoTerm constTypeName8;

  protected static IStrategoTerm constId30;

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

  protected static IStrategoTerm constId29;

  protected static IStrategoTerm const56;

  protected static IStrategoTerm constCons15;

  protected static IStrategoTerm constId28;

  protected static IStrategoTerm const55;

  protected static IStrategoTerm constCons14;

  protected static IStrategoTerm constTypeImportOnDemandDec0;

  protected static IStrategoTerm constPackageName0;

  protected static IStrategoTerm constCons13;

  protected static IStrategoTerm constId27;

  protected static IStrategoTerm constCons12;

  protected static IStrategoTerm constId26;

  protected static IStrategoTerm const54;

  protected static IStrategoTerm constTypeName7;

  protected static IStrategoTerm constId25;

  protected static IStrategoTerm const53;

  protected static IStrategoTerm constVoid0;

  protected static IStrategoTerm constTypeName6;

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
    const47 = termFactory.makeString("offset");
    constId19 = termFactory.makeAppl(transform._consId_1, new IStrategoTerm[]{transform.const47});
    const48 = termFactory.makeString("column");
    constId20 = termFactory.makeAppl(transform._consId_1, new IStrategoTerm[]{transform.const48});
    const49 = termFactory.makeString("endLine");
    constId21 = termFactory.makeAppl(transform._consId_1, new IStrategoTerm[]{transform.const49});
    const50 = termFactory.makeString("startLine");
    constId22 = termFactory.makeAppl(transform._consId_1, new IStrategoTerm[]{transform.const50});
    const51 = termFactory.makeString("file");
    constId23 = termFactory.makeAppl(transform._consId_1, new IStrategoTerm[]{transform.const51});
    const52 = termFactory.makeString("COOLOnEntry");
    constId24 = termFactory.makeAppl(transform._consId_1, new IStrategoTerm[]{transform.const52});
    constTypeName6 = termFactory.makeAppl(transform._consTypeName_1, new IStrategoTerm[]{transform.constId24});
    constVoid0 = termFactory.makeAppl(transform._consVoid_0, NO_TERMS);
    const53 = termFactory.makeString("COOLOnExit");
    constId25 = termFactory.makeAppl(transform._consId_1, new IStrategoTerm[]{transform.const53});
    constTypeName7 = termFactory.makeAppl(transform._consTypeName_1, new IStrategoTerm[]{transform.constId25});
    const54 = termFactory.makeString("util");
    constId26 = termFactory.makeAppl(transform._consId_1, new IStrategoTerm[]{transform.const54});
    constCons12 = (IStrategoTerm)termFactory.makeListCons(transform.constId26, (IStrategoList)transform.constNil0);
    constId27 = termFactory.makeAppl(transform._consId_1, new IStrategoTerm[]{transform.const27});
    constCons13 = (IStrategoTerm)termFactory.makeListCons(transform.constId27, (IStrategoList)transform.constCons12);
    constPackageName0 = termFactory.makeAppl(transform._consPackageName_1, new IStrategoTerm[]{transform.constCons13});
    constTypeImportOnDemandDec0 = termFactory.makeAppl(transform._consTypeImportOnDemandDec_1, new IStrategoTerm[]{transform.constPackageName0});
    constCons14 = (IStrategoTerm)termFactory.makeListCons(transform.constTypeImportOnDemandDec0, (IStrategoList)transform.constNil0);
    const55 = termFactory.makeString("runtime");
    constId28 = termFactory.makeAppl(transform._consId_1, new IStrategoTerm[]{transform.const55});
    constCons15 = (IStrategoTerm)termFactory.makeListCons(transform.constId28, (IStrategoList)transform.constNil0);
    const56 = termFactory.makeString("cool");
    constId29 = termFactory.makeAppl(transform._consId_1, new IStrategoTerm[]{transform.const56});
    constCons16 = (IStrategoTerm)termFactory.makeListCons(transform.constId29, (IStrategoList)transform.constCons15);
    constPackageName1 = termFactory.makeAppl(transform._consPackageName_1, new IStrategoTerm[]{transform.constCons16});
    constTypeImportOnDemandDec1 = termFactory.makeAppl(transform._consTypeImportOnDemandDec_1, new IStrategoTerm[]{transform.constPackageName1});
    constCons17 = (IStrategoTerm)termFactory.makeListCons(transform.constTypeImportOnDemandDec1, (IStrategoList)transform.constNil0);
    const57 = termFactory.makeString("'convert-coordinator-declaration'");
    const58 = termFactory.makeString("'gen-coordinator-body'");
    constSynchronized0 = termFactory.makeAppl(transform._consSynchronized_0, NO_TERMS);
    constCons18 = (IStrategoTerm)termFactory.makeListCons(transform.constSynchronized0, (IStrategoList)transform.constNil0);
    constCons19 = (IStrategoTerm)termFactory.makeListCons(transform.constPublic0, (IStrategoList)transform.constCons18);
    const59 = termFactory.makeString("COOLUnlock");
    constId30 = termFactory.makeAppl(transform._consId_1, new IStrategoTerm[]{transform.const59});
    constTypeName8 = termFactory.makeAppl(transform._consTypeName_1, new IStrategoTerm[]{transform.constId30});
    const60 = termFactory.makeString("remove");
    constId31 = termFactory.makeAppl(transform._consId_1, new IStrategoTerm[]{transform.const60});
    const61 = termFactory.makeString("notifyAll");
    constId32 = termFactory.makeAppl(transform._consId_1, new IStrategoTerm[]{transform.const61});
    constMethodName3 = termFactory.makeAppl(transform._consMethodName_1, new IStrategoTerm[]{transform.constId32});
    constMethod3 = termFactory.makeAppl(transform._consMethod_1, new IStrategoTerm[]{transform.constMethodName3});
    constInvoke3 = termFactory.makeAppl(transform._consInvoke_2, new IStrategoTerm[]{transform.constMethod3, transform.constNil0});
    constExprStm0 = termFactory.makeAppl(transform._consExprStm_1, new IStrategoTerm[]{transform.constInvoke3});
    constCons20 = (IStrategoTerm)termFactory.makeListCons(transform.constExprStm0, (IStrategoList)transform.constNil0);
    const62 = termFactory.makeString("'make-unlock-method'");
    const63 = termFactory.makeString("unlock_");
    const64 = termFactory.makeString("COOLMutexLocation");
    const65 = termFactory.makeString("COOLSelfexLocation");
    constMethodName4 = termFactory.makeAppl(transform._consMethodName_1, new IStrategoTerm[]{transform.constId5});
    constMethod4 = termFactory.makeAppl(transform._consMethod_1, new IStrategoTerm[]{transform.constMethodName4});
    const66 = termFactory.makeString("COOLAdditionsLocation");
    const67 = termFactory.makeString("wait");
    constId33 = termFactory.makeAppl(transform._consId_1, new IStrategoTerm[]{transform.const67});
    constMethodName5 = termFactory.makeAppl(transform._consMethodName_1, new IStrategoTerm[]{transform.constId33});
    constMethod5 = termFactory.makeAppl(transform._consMethod_1, new IStrategoTerm[]{transform.constMethodName5});
    constInvoke4 = termFactory.makeAppl(transform._consInvoke_2, new IStrategoTerm[]{transform.constMethod5, transform.constNil0});
    constExprStm1 = termFactory.makeAppl(transform._consExprStm_1, new IStrategoTerm[]{transform.constInvoke4});
    constCons21 = (IStrategoTerm)termFactory.makeListCons(transform.constExprStm1, (IStrategoList)transform.constNil0);
    constBlock1 = termFactory.makeAppl(transform._consBlock_1, new IStrategoTerm[]{transform.constCons21});
    const68 = termFactory.makeString("InterruptedException");
    constId34 = termFactory.makeAppl(transform._consId_1, new IStrategoTerm[]{transform.const68});
    constTypeName9 = termFactory.makeAppl(transform._consTypeName_1, new IStrategoTerm[]{transform.constId34});
    constClassOrInterfaceType3 = termFactory.makeAppl(transform._consClassOrInterfaceType_2, new IStrategoTerm[]{transform.constTypeName9, transform.constNone0});
    const69 = termFactory.makeString("e");
    constId35 = termFactory.makeAppl(transform._consId_1, new IStrategoTerm[]{transform.const69});
    constParam1 = termFactory.makeAppl(transform._consParam_3, new IStrategoTerm[]{transform.constNil0, transform.constClassOrInterfaceType3, transform.constId35});
    constReturn1 = termFactory.makeAppl(transform._consReturn_1, new IStrategoTerm[]{transform.constNone0});
    constCons22 = (IStrategoTerm)termFactory.makeListCons(transform.constReturn1, (IStrategoList)transform.constNil0);
    constBlock2 = termFactory.makeAppl(transform._consBlock_1, new IStrategoTerm[]{transform.constCons22});
    constCatch0 = termFactory.makeAppl(transform._consCatch_2, new IStrategoTerm[]{transform.constParam1, transform.constBlock2});
    constCons23 = (IStrategoTerm)termFactory.makeListCons(transform.constCatch0, (IStrategoList)transform.constNil0);
    constTry0 = termFactory.makeAppl(transform._consTry_2, new IStrategoTerm[]{transform.constBlock1, transform.constCons23});
    constCons24 = (IStrategoTerm)termFactory.makeListCons(transform.constTry0, (IStrategoList)transform.constNil0);
    const70 = termFactory.makeString("add");
    constId36 = termFactory.makeAppl(transform._consId_1, new IStrategoTerm[]{transform.const70});
    const71 = termFactory.makeString("COOLLock");
    constId37 = termFactory.makeAppl(transform._consId_1, new IStrategoTerm[]{transform.const71});
    constTypeName10 = termFactory.makeAppl(transform._consTypeName_1, new IStrategoTerm[]{transform.constId37});
    const72 = termFactory.makeString("'make-lock-method'");
    const73 = termFactory.makeString("lock_");
    const74 = termFactory.makeString("'fillMethodMaps'");
    const75 = termFactory.makeString("COOLConditionField");
    constId38 = termFactory.makeAppl(transform._consId_1, new IStrategoTerm[]{transform.const75});
    constTypeName11 = termFactory.makeAppl(transform._consTypeName_1, new IStrategoTerm[]{transform.constId38});
    constMarkerAnno0 = termFactory.makeAppl(transform._consMarkerAnno_1, new IStrategoTerm[]{transform.constTypeName11});
    constCons25 = (IStrategoTerm)termFactory.makeListCons(transform.constMarkerAnno0, (IStrategoList)transform.constNil0);
    constCons26 = (IStrategoTerm)termFactory.makeListCons(transform.constPrivate0, (IStrategoList)transform.constCons25);
    const76 = termFactory.makeString("'add-condition-fields'");
    const77 = termFactory.makeString("COOLCoordinatorField");
    constId39 = termFactory.makeAppl(transform._consId_1, new IStrategoTerm[]{transform.const77});
    constTypeName12 = termFactory.makeAppl(transform._consTypeName_1, new IStrategoTerm[]{transform.constId39});
    constMarkerAnno1 = termFactory.makeAppl(transform._consMarkerAnno_1, new IStrategoTerm[]{transform.constTypeName12});
    const78 = termFactory.makeString("'add-coordinator-fields'");
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
              IStrategoTerm l_7 = null;
              IStrategoTerm m_7 = null;
              l_7 = term.getSubterm(0);
              IStrategoTerm arg0 = term.getSubterm(1);
              if(arg0.getTermType() != IStrategoTerm.APPL || transform._consId_1 != ((IStrategoAppl)arg0).getConstructor())
                break Fail1;
              m_7 = arg0.getSubterm(0);
              term = this.invoke(context, l_7);
              if(term == null)
                break Fail1;
              term = (IStrategoTerm)termFactory.makeListCons(term, termFactory.makeListCons(transform.const0, termFactory.makeListCons(m_7, (IStrategoList)transform.constNil0)));
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
                IStrategoTerm k_7 = null;
                IStrategoTerm arg1 = term.getSubterm(0);
                if(arg1.getTermType() != IStrategoTerm.APPL || transform._consId_1 != ((IStrategoAppl)arg1).getConstructor())
                  break Fail2;
                k_7 = arg1.getSubterm(0);
                term = k_7;
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
                  IStrategoTerm j_7 = null;
                  IStrategoTerm arg2 = term.getSubterm(0);
                  if(arg2.getTermType() != IStrategoTerm.APPL || transform._consId_1 != ((IStrategoAppl)arg2).getConstructor())
                    break Fail3;
                  j_7 = arg2.getSubterm(0);
                  term = j_7;
                  if(true)
                    break Success2;
                }
                term = term0;
              }
              if(cons0 == transform._consPackageOrTypeName_2)
              { 
                IStrategoTerm f_7 = null;
                IStrategoTerm g_7 = null;
                f_7 = term.getSubterm(0);
                IStrategoTerm arg3 = term.getSubterm(1);
                if(arg3.getTermType() != IStrategoTerm.APPL || transform._consId_1 != ((IStrategoAppl)arg3).getConstructor())
                  break Fail0;
                g_7 = arg3.getSubterm(0);
                term = this.invoke(context, f_7);
                if(term == null)
                  break Fail0;
                term = (IStrategoTerm)termFactory.makeListCons(term, termFactory.makeListCons(transform.const0, termFactory.makeListCons(g_7, (IStrategoList)transform.constNil0)));
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
            IStrategoTerm c_8 = null;
            IStrategoTerm d_8 = null;
            IStrategoTerm e_8 = null;
            c_8 = term;
            e_8 = term;
            d_8 = c_8;
            term = e_8;
            IStrategoTerm term4 = term;
            Success4:
            { 
              Fail6:
              { 
                IStrategoTerm f_8 = null;
                f_8 = term;
                term = d_8;
                if(term.getTermType() != IStrategoTerm.APPL || transform._consByte_0 != ((IStrategoAppl)term).getConstructor())
                  break Fail6;
                term = f_8;
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
                  IStrategoTerm g_8 = null;
                  g_8 = term;
                  term = d_8;
                  if(term.getTermType() != IStrategoTerm.APPL || transform._consChar_0 != ((IStrategoAppl)term).getConstructor())
                    break Fail7;
                  term = g_8;
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
                    IStrategoTerm h_8 = null;
                    h_8 = term;
                    term = d_8;
                    if(term.getTermType() != IStrategoTerm.APPL || transform._consBoolean_0 != ((IStrategoAppl)term).getConstructor())
                      break Fail8;
                    term = h_8;
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
                      IStrategoTerm i_8 = null;
                      i_8 = term;
                      term = d_8;
                      if(term.getTermType() != IStrategoTerm.APPL || transform._consShort_0 != ((IStrategoAppl)term).getConstructor())
                        break Fail9;
                      term = i_8;
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
                        IStrategoTerm j_8 = null;
                        j_8 = term;
                        term = d_8;
                        if(term.getTermType() != IStrategoTerm.APPL || transform._consInt_0 != ((IStrategoAppl)term).getConstructor())
                          break Fail10;
                        term = j_8;
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
                          IStrategoTerm k_8 = null;
                          k_8 = term;
                          term = d_8;
                          if(term.getTermType() != IStrategoTerm.APPL || transform._consLong_0 != ((IStrategoAppl)term).getConstructor())
                            break Fail11;
                          term = k_8;
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
                            IStrategoTerm l_8 = null;
                            l_8 = term;
                            term = d_8;
                            if(term.getTermType() != IStrategoTerm.APPL || transform._consFloat_0 != ((IStrategoAppl)term).getConstructor())
                              break Fail12;
                            term = l_8;
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
                              IStrategoTerm m_8 = null;
                              m_8 = term;
                              term = d_8;
                              if(term.getTermType() != IStrategoTerm.APPL || transform._consDouble_0 != ((IStrategoAppl)term).getConstructor())
                                break Fail13;
                              term = m_8;
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
                IStrategoTerm z_7 = null;
                z_7 = term.getSubterm(0);
                term = this.invoke(context, z_7);
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
                  IStrategoTerm y_7 = null;
                  IStrategoTerm arg4 = term.getSubterm(0);
                  if(arg4.getTermType() != IStrategoTerm.APPL || transform._consTypeName_1 != ((IStrategoAppl)arg4).getConstructor())
                    break Fail15;
                  IStrategoTerm arg5 = arg4.getSubterm(0);
                  if(arg5.getTermType() != IStrategoTerm.APPL || transform._consId_1 != ((IStrategoAppl)arg5).getConstructor())
                    break Fail15;
                  y_7 = arg5.getSubterm(0);
                  term = y_7;
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
                    IStrategoTerm u_7 = null;
                    IStrategoTerm v_7 = null;
                    IStrategoTerm arg7 = term.getSubterm(0);
                    if(arg7.getTermType() != IStrategoTerm.APPL || transform._consTypeName_2 != ((IStrategoAppl)arg7).getConstructor())
                      break Fail16;
                    u_7 = arg7.getSubterm(0);
                    IStrategoTerm arg8 = arg7.getSubterm(1);
                    if(arg8.getTermType() != IStrategoTerm.APPL || transform._consId_1 != ((IStrategoAppl)arg8).getConstructor())
                      break Fail16;
                    v_7 = arg8.getSubterm(0);
                    term = this.invoke(context, u_7);
                    if(term == null)
                      break Fail16;
                    term = (IStrategoTerm)termFactory.makeListCons(term, termFactory.makeListCons(transform.const0, termFactory.makeListCons(v_7, (IStrategoList)transform.constNil0)));
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
                      IStrategoTerm t_7 = null;
                      IStrategoTerm arg10 = term.getSubterm(0);
                      if(arg10.getTermType() != IStrategoTerm.APPL || transform._consId_1 != ((IStrategoAppl)arg10).getConstructor())
                        break Fail17;
                      t_7 = arg10.getSubterm(0);
                      term = t_7;
                      if(true)
                        break Success15;
                    }
                    term = term12;
                  }
                  if(cons1 == transform._consPackageOrTypeName_2)
                  { 
                    IStrategoTerm p_7 = null;
                    IStrategoTerm q_7 = null;
                    p_7 = term.getSubterm(0);
                    IStrategoTerm arg11 = term.getSubterm(1);
                    if(arg11.getTermType() != IStrategoTerm.APPL || transform._consId_1 != ((IStrategoAppl)arg11).getConstructor())
                      break Fail4;
                    q_7 = arg11.getSubterm(0);
                    term = this.invoke(context, p_7);
                    if(term == null)
                      break Fail4;
                    term = (IStrategoTerm)termFactory.makeListCons(term, termFactory.makeListCons(transform.const0, termFactory.makeListCons(q_7, (IStrategoList)transform.constNil0)));
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

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm p_8)
    { 
      context.push("add__externals_0_1");
      Fail18:
      { 
        IStrategoTerm q_8 = null;
        TermReference t_8 = new TermReference();
        q_8 = term;
        term = new_iset_0_0.instance.invoke(context, term);
        if(term == null)
          break Fail18;
        if(t_8.value == null)
          t_8.value = term;
        else
          if(t_8.value != term && !t_8.value.match(term))
            break Fail18;
        term = add_external_impl_0_2.instance.invoke(context, q_8, t_8.value, p_8);
        if(term == null)
          break Fail18;
        lifted0 lifted00 = new lifted0();
        lifted00.t_8 = t_8;
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

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm d_9, IStrategoTerm e_9)
    { 
      context.push("add_external_impl_0_2");
      Fail19:
      { 
        IStrategoTerm f_9 = null;
        IStrategoTerm g_9 = null;
        IStrategoTerm h_9 = null;
        IStrategoTerm i_9 = null;
        IStrategoTerm j_9 = null;
        IStrategoTerm u_9 = null;
        IStrategoTerm v_9 = null;
        IStrategoTerm x_9 = null;
        IStrategoTerm a_10 = null;
        IStrategoTerm b_10 = null;
        f_9 = term;
        term = new_hashtable_0_0.instance.invoke(context, term);
        if(term == null)
          break Fail19;
        g_9 = term;
        term = new_hashtable_0_0.instance.invoke(context, term);
        if(term == null)
          break Fail19;
        i_9 = term;
        term = new_hashtable_0_0.instance.invoke(context, term);
        if(term == null)
          break Fail19;
        j_9 = term;
        term = new_iset_0_0.instance.invoke(context, term);
        if(term == null)
          break Fail19;
        h_9 = term;
        term = f_9;
        x_9 = f_9;
        term = new_hashtable_0_0.instance.invoke(context, term);
        if(term == null)
          break Fail19;
        u_9 = term;
        a_10 = x_9;
        v_9 = transform.constNone0;
        b_10 = a_10;
        term = add_external_impl_0_9.instance.invokeDynamic(context, b_10, NO_STRATEGIES, new IStrategoTerm[]{g_9, u_9, h_9, i_9, d_9, j_9, v_9, transform.constFalse0, e_9});
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

    public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm ref_c_10, IStrategoTerm ref_d_10, IStrategoTerm ref_e_10, IStrategoTerm ref_f_10, IStrategoTerm ref_g_10, IStrategoTerm ref_h_10, IStrategoTerm ref_i_10, IStrategoTerm ref_j_10, IStrategoTerm ref_k_10)
    { 
      ITermFactory termFactory = context.getFactory();
      TermReference c_10 = new TermReference(ref_c_10);
      TermReference d_10 = new TermReference(ref_d_10);
      TermReference e_10 = new TermReference(ref_e_10);
      TermReference f_10 = new TermReference(ref_f_10);
      TermReference g_10 = new TermReference(ref_g_10);
      TermReference h_10 = new TermReference(ref_h_10);
      TermReference i_10 = new TermReference(ref_i_10);
      TermReference j_10 = new TermReference(ref_j_10);
      TermReference k_10 = new TermReference(ref_k_10);
      context.push("add_external_impl_0_9");
      Fail20:
      { 
        IStrategoTerm l_10 = null;
        TermReference m_10 = new TermReference();
        IStrategoTerm n_10 = null;
        TermReference o_10 = new TermReference();
        IStrategoTerm p_10 = null;
        IStrategoTerm q_10 = null;
        TermReference r_10 = new TermReference();
        TermReference s_10 = new TermReference();
        TermReference t_10 = new TermReference();
        TermReference u_10 = new TermReference();
        TermReference v_10 = new TermReference();
        TermReference w_10 = new TermReference();
        TermReference x_10 = new TermReference();
        TermReference y_10 = new TermReference();
        TermReference z_10 = new TermReference();
        TermReference a_11 = new TermReference();
        TermReference b_11 = new TermReference();
        TermReference c_11 = new TermReference();
        TermReference d_11 = new TermReference();
        TermReference e_11 = new TermReference();
        TermReference f_11 = new TermReference();
        TermReference g_11 = new TermReference();
        TermReference h_11 = new TermReference();
        TermReference i_11 = new TermReference();
        TermReference j_11 = new TermReference();
        IStrategoTerm k_11 = null;
        if(i_11.value == null)
          i_11.value = term;
        else
          if(i_11.value != term && !i_11.value.match(term))
            break Fail20;
        k_11 = term;
        if(j_11.value == null)
          j_11.value = term;
        else
          if(j_11.value != term && !j_11.value.match(term))
            break Fail20;
        term = k_11;
        IStrategoTerm term16 = term;
        Success16:
        { 
          Fail21:
          { 
            IStrategoTerm l_11 = null;
            l_11 = term;
            if(j_11.value == null)
              break Fail21;
            term = j_11.value;
            if(term.getTermType() != IStrategoTerm.APPL || transform._consBlock_1 != ((IStrategoAppl)term).getConstructor())
              break Fail21;
            term = l_11;
            { 
              term = new_hashtable_0_0.instance.invoke(context, term);
              if(term == null)
                break Fail20;
              if(o_10.value == null)
                o_10.value = term;
              else
                if(o_10.value != term && !o_10.value.match(term))
                  break Fail20;
              if(i_11.value == null)
                break Fail20;
              term = i_11.value;
              lifted2 lifted210 = new lifted2();
              lifted210.c_10 = c_10;
              lifted210.d_10 = d_10;
              lifted210.e_10 = e_10;
              lifted210.o_10 = o_10;
              lifted210.g_10 = g_10;
              lifted210.h_10 = h_10;
              lifted210.i_10 = i_10;
              lifted210.j_10 = j_10;
              lifted210.k_10 = k_10;
              term = SRTS_all.instance.invoke(context, term, lifted210);
              if(term == null)
                break Fail20;
              p_10 = term;
              if(o_10.value == null)
                break Fail20;
              term = hashtable_keys_0_0.instance.invoke(context, o_10.value);
              if(term == null)
                break Fail20;
              lifted3 lifted310 = new lifted3();
              lifted310.c_10 = c_10;
              lifted310.o_10 = o_10;
              term = map_1_0.instance.invoke(context, term, lifted310);
              if(term == null)
                break Fail20;
              term = p_10;
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
              IStrategoTerm m_11 = null;
              m_11 = term;
              if(j_11.value == null)
                break Fail22;
              term = j_11.value;
              if(term.getTermType() != IStrategoTerm.APPL || transform._consMethodDec_2 != ((IStrategoAppl)term).getConstructor())
                break Fail22;
              l_10 = term.getSubterm(0);
              n_10 = term.getSubterm(1);
              term = m_11;
              { 
                term = new_hashtable_0_0.instance.invoke(context, term);
                if(term == null)
                  break Fail20;
                if(o_10.value == null)
                  o_10.value = term;
                else
                  if(o_10.value != term && !o_10.value.match(term))
                    break Fail20;
                Success18:
                { 
                  Fail23:
                  { 
                    IStrategoTerm n_11 = null;
                    n_11 = term;
                    term = is__on__entry__or__on__exit__method_0_0.instance.invoke(context, l_10);
                    if(term == null)
                      break Fail23;
                    term = n_11;
                    { 
                      term = transform.constTrue0;
                      if(m_10.value == null)
                        m_10.value = term;
                      else
                        if(m_10.value != term && !m_10.value.match(term))
                          break Fail20;
                      if(true)
                        break Success18;
                    }
                  }
                  term = transform.constFalse0;
                  if(m_10.value == null)
                    m_10.value = term;
                  else
                    if(m_10.value != term && !m_10.value.match(term))
                      break Fail20;
                }
                term = l_10;
                lifted4 lifted410 = new lifted4();
                lifted410.c_10 = c_10;
                lifted410.o_10 = o_10;
                lifted410.d_10 = d_10;
                lifted410.i_10 = i_10;
                term = topdown_1_0.instance.invoke(context, term, lifted410);
                if(term == null)
                  break Fail20;
                term = n_10;
                lifted6 lifted610 = new lifted6();
                lifted610.c_10 = c_10;
                lifted610.d_10 = d_10;
                lifted610.e_10 = e_10;
                lifted610.o_10 = o_10;
                lifted610.g_10 = g_10;
                lifted610.h_10 = h_10;
                lifted610.i_10 = i_10;
                lifted610.m_10 = m_10;
                lifted610.k_10 = k_10;
                term = SRTS_all.instance.invoke(context, term, lifted610);
                if(term == null)
                  break Fail20;
                term = termFactory.makeAppl(transform._consMethodDec_2, new IStrategoTerm[]{l_10, term});
                p_10 = term;
                if(o_10.value == null)
                  break Fail20;
                term = hashtable_keys_0_0.instance.invoke(context, o_10.value);
                if(term == null)
                  break Fail20;
                lifted7 lifted710 = new lifted7();
                lifted710.c_10 = c_10;
                lifted710.o_10 = o_10;
                term = map_1_0.instance.invoke(context, term, lifted710);
                if(term == null)
                  break Fail20;
                term = p_10;
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
                IStrategoTerm o_11 = null;
                o_11 = term;
                if(j_11.value == null)
                  break Fail24;
                term = or_2_0.instance.invoke(context, j_11.value, lifted8.instance, lifted9.instance);
                if(term == null)
                  break Fail24;
                term = o_11;
                { 
                  if(i_11.value == null)
                    break Fail20;
                  term = handle_expr_0_7.instance.invokeDynamic(context, i_11.value, NO_STRATEGIES, new IStrategoTerm[]{c_10.value, g_10.value, e_10.value, h_10.value, i_10.value, j_10.value, k_10.value});
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
                  IStrategoTerm p_11 = null;
                  p_11 = term;
                  if(j_11.value == null)
                    break Fail25;
                  term = j_11.value;
                  if(term.getTermType() != IStrategoTerm.APPL || transform._consVarDec_1 != ((IStrategoAppl)term).getConstructor())
                    break Fail25;
                  IStrategoTerm arg16 = term.getSubterm(0);
                  if(arg16.getTermType() != IStrategoTerm.APPL || transform._consId_1 != ((IStrategoAppl)arg16).getConstructor())
                    break Fail25;
                  q_10 = arg16.getSubterm(0);
                  term = p_11;
                  { 
                    term = add__var_0_5.instance.invoke(context, term, q_10, c_10.value, f_10.value, d_10.value, i_10.value);
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
                    IStrategoTerm q_11 = null;
                    q_11 = term;
                    if(j_11.value == null)
                      break Fail26;
                    term = j_11.value;
                    if(term.getTermType() != IStrategoTerm.APPL || transform._consVarDec_2 != ((IStrategoAppl)term).getConstructor())
                      break Fail26;
                    IStrategoTerm arg17 = term.getSubterm(0);
                    if(arg17.getTermType() != IStrategoTerm.APPL || transform._consId_1 != ((IStrategoAppl)arg17).getConstructor())
                      break Fail26;
                    q_10 = arg17.getSubterm(0);
                    if(h_11.value == null)
                      h_11.value = term.getSubterm(1);
                    else
                      if(h_11.value != term.getSubterm(1) && !h_11.value.match(term.getSubterm(1)))
                        break Fail26;
                    term = q_11;
                    { 
                      term = add__var_0_5.instance.invoke(context, term, q_10, c_10.value, f_10.value, d_10.value, i_10.value);
                      if(term == null)
                        break Fail20;
                      if(i_11.value == null)
                        break Fail20;
                      term = i_11.value;
                      lifted10 lifted1010 = new lifted10();
                      lifted1010.c_10 = c_10;
                      lifted1010.d_10 = d_10;
                      lifted1010.e_10 = e_10;
                      lifted1010.f_10 = f_10;
                      lifted1010.g_10 = g_10;
                      lifted1010.h_10 = h_10;
                      lifted1010.i_10 = i_10;
                      lifted1010.j_10 = j_10;
                      lifted1010.k_10 = k_10;
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
                      IStrategoTerm r_11 = null;
                      r_11 = term;
                      if(j_11.value == null)
                        break Fail27;
                      term = j_11.value;
                      lifted12 lifted1210 = new lifted12();
                      lifted11 lifted1110 = new lifted11();
                      lifted1210.g_11 = g_11;
                      lifted1210.r_10 = r_10;
                      lifted1110.g_11 = g_11;
                      lifted1110.r_10 = r_10;
                      term = or_2_0.instance.invoke(context, term, lifted1110, lifted1210);
                      if(term == null)
                        break Fail27;
                      term = r_11;
                      { 
                        if(i_11.value == null)
                          break Fail20;
                        term = i_11.value;
                        lifted13 lifted134 = new lifted13();
                        lifted134.c_10 = c_10;
                        lifted134.d_10 = d_10;
                        lifted134.e_10 = e_10;
                        lifted134.f_10 = f_10;
                        lifted134.g_10 = g_10;
                        lifted134.h_10 = h_10;
                        lifted134.g_11 = g_11;
                        lifted134.j_10 = j_10;
                        lifted134.k_10 = k_10;
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
                        IStrategoTerm s_11 = null;
                        s_11 = term;
                        if(j_11.value == null)
                          break Fail28;
                        term = j_11.value;
                        lifted15 lifted150 = new lifted15();
                        lifted14 lifted140 = new lifted14();
                        lifted150.y_10 = y_10;
                        lifted150.z_10 = z_10;
                        lifted140.y_10 = y_10;
                        lifted140.z_10 = z_10;
                        term = or_2_0.instance.invoke(context, term, lifted140, lifted150);
                        if(term == null)
                          break Fail28;
                        term = s_11;
                        { 
                          if(i_11.value == null)
                            break Fail20;
                          term = i_11.value;
                          lifted16 lifted160 = new lifted16();
                          lifted160.y_10 = y_10;
                          lifted160.z_10 = z_10;
                          lifted160.c_10 = c_10;
                          lifted160.d_10 = d_10;
                          lifted160.e_10 = e_10;
                          lifted160.f_10 = f_10;
                          lifted160.g_10 = g_10;
                          lifted160.h_10 = h_10;
                          lifted160.j_10 = j_10;
                          lifted160.k_10 = k_10;
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
                          IStrategoTerm t_11 = null;
                          t_11 = term;
                          if(j_11.value == null)
                            break Fail29;
                          term = j_11.value;
                          lifted20 lifted200 = new lifted20();
                          lifted17 lifted170 = new lifted17();
                          lifted200.y_10 = y_10;
                          lifted200.z_10 = z_10;
                          lifted170.y_10 = y_10;
                          lifted170.z_10 = z_10;
                          term = or_2_0.instance.invoke(context, term, lifted170, lifted200);
                          if(term == null)
                            break Fail29;
                          term = t_11;
                          { 
                            IStrategoTerm term25 = term;
                            Success25:
                            { 
                              Fail30:
                              { 
                                IStrategoTerm u_11 = null;
                                u_11 = term;
                                if(i_10.value == null)
                                  break Fail30;
                                term = termFactory.makeTuple(i_10.value, transform.constNone0);
                                term = equal_0_0.instance.invoke(context, term);
                                if(term == null)
                                  break Fail30;
                                term = u_11;
                                { 
                                  if(i_11.value == null)
                                    break Fail20;
                                  term = i_11.value;
                                  lifted21 lifted211 = new lifted21();
                                  lifted211.y_10 = y_10;
                                  lifted211.z_10 = z_10;
                                  lifted211.i_10 = i_10;
                                  lifted211.c_10 = c_10;
                                  lifted211.d_10 = d_10;
                                  lifted211.e_10 = e_10;
                                  lifted211.f_10 = f_10;
                                  lifted211.g_10 = g_10;
                                  lifted211.h_10 = h_10;
                                  lifted211.j_10 = j_10;
                                  lifted211.k_10 = k_10;
                                  term = SRTS_all.instance.invoke(context, term, lifted211);
                                  if(term == null)
                                    break Fail20;
                                  if(true)
                                    break Success25;
                                }
                              }
                              term = term25;
                              if(i_11.value == null)
                                break Fail20;
                              term = i_11.value;
                              lifted22 lifted220 = new lifted22();
                              lifted220.i_10 = i_10;
                              lifted220.c_10 = c_10;
                              lifted220.d_10 = d_10;
                              lifted220.e_10 = e_10;
                              lifted220.f_10 = f_10;
                              lifted220.g_10 = g_10;
                              lifted220.h_10 = h_10;
                              lifted220.j_10 = j_10;
                              lifted220.k_10 = k_10;
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
                            IStrategoTerm v_11 = null;
                            v_11 = term;
                            if(j_11.value == null)
                              break Fail31;
                            term = or_2_0.instance.invoke(context, j_11.value, lifted23.instance, lifted26.instance);
                            if(term == null)
                              break Fail31;
                            term = v_11;
                            { 
                              if(i_11.value == null)
                                break Fail20;
                              term = i_11.value;
                              lifted29 lifted290 = new lifted29();
                              lifted290.c_10 = c_10;
                              lifted290.d_10 = d_10;
                              lifted290.e_10 = e_10;
                              lifted290.f_10 = f_10;
                              lifted290.g_10 = g_10;
                              lifted290.h_10 = h_10;
                              lifted290.j_10 = j_10;
                              lifted290.k_10 = k_10;
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
                              IStrategoTerm w_11 = null;
                              w_11 = term;
                              if(j_11.value == null)
                                break Fail32;
                              term = j_11.value;
                              lifted37 lifted370 = new lifted37();
                              lifted30 lifted300 = new lifted30();
                              lifted370.y_10 = y_10;
                              lifted370.z_10 = z_10;
                              lifted300.y_10 = y_10;
                              lifted300.z_10 = z_10;
                              term = or_2_0.instance.invoke(context, term, lifted300, lifted370);
                              if(term == null)
                                break Fail32;
                              term = w_11;
                              { 
                                IStrategoTerm term28 = term;
                                Success28:
                                { 
                                  Fail33:
                                  { 
                                    IStrategoTerm x_11 = null;
                                    x_11 = term;
                                    if(i_10.value == null)
                                      break Fail33;
                                    term = termFactory.makeTuple(i_10.value, transform.constNone0);
                                    term = equal_0_0.instance.invoke(context, term);
                                    if(term == null)
                                      break Fail33;
                                    term = x_11;
                                    { 
                                      if(i_11.value == null)
                                        break Fail20;
                                      term = i_11.value;
                                      lifted38 lifted380 = new lifted38();
                                      lifted380.c_10 = c_10;
                                      lifted380.d_10 = d_10;
                                      lifted380.e_10 = e_10;
                                      lifted380.f_10 = f_10;
                                      lifted380.g_10 = g_10;
                                      lifted380.h_10 = h_10;
                                      lifted380.j_10 = j_10;
                                      lifted380.k_10 = k_10;
                                      term = SRTS_all.instance.invoke(context, term, lifted380);
                                      if(term == null)
                                        break Fail20;
                                      if(true)
                                        break Success28;
                                    }
                                  }
                                  term = term28;
                                  if(i_11.value == null)
                                    break Fail20;
                                  term = i_11.value;
                                  lifted39 lifted390 = new lifted39();
                                  lifted390.i_10 = i_10;
                                  lifted390.c_10 = c_10;
                                  lifted390.d_10 = d_10;
                                  lifted390.e_10 = e_10;
                                  lifted390.f_10 = f_10;
                                  lifted390.g_10 = g_10;
                                  lifted390.h_10 = h_10;
                                  lifted390.j_10 = j_10;
                                  lifted390.k_10 = k_10;
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
                                IStrategoTerm y_11 = null;
                                y_11 = term;
                                if(j_11.value == null)
                                  break Fail34;
                                term = j_11.value;
                                if(term.getTermType() != IStrategoTerm.APPL || transform._consLeftShift_2 != ((IStrategoAppl)term).getConstructor())
                                  break Fail34;
                                if(y_10.value == null)
                                  y_10.value = term.getSubterm(0);
                                else
                                  if(y_10.value != term.getSubterm(0) && !y_10.value.match(term.getSubterm(0)))
                                    break Fail34;
                                if(z_10.value == null)
                                  z_10.value = term.getSubterm(1);
                                else
                                  if(z_10.value != term.getSubterm(1) && !z_10.value.match(term.getSubterm(1)))
                                    break Fail34;
                                term = y_11;
                                { 
                                  IStrategoTerm q_14 = null;
                                  IStrategoTerm s_14 = null;
                                  IStrategoTerm v_14 = null;
                                  IStrategoTerm term30 = term;
                                  Success30:
                                  { 
                                    Fail35:
                                    { 
                                      IStrategoTerm z_11 = null;
                                      z_11 = term;
                                      if(i_10.value == null)
                                        break Fail35;
                                      term = termFactory.makeTuple(i_10.value, transform.constNone0);
                                      term = equal_0_0.instance.invoke(context, term);
                                      if(term == null)
                                        break Fail35;
                                      term = z_11;
                                      { 
                                        if(y_10.value == null)
                                          break Fail20;
                                        term = get_type_of_0_3.instance.invoke(context, y_10.value, i_10.value, c_10.value, d_10.value);
                                        if(term == null)
                                          break Fail20;
                                        term = cast_shift_type_0_0.instance.invoke(context, term);
                                        if(term == null)
                                          break Fail20;
                                        if(t_10.value == null)
                                          t_10.value = term;
                                        else
                                          if(t_10.value != term && !t_10.value.match(term))
                                            break Fail20;
                                        if(true)
                                          break Success30;
                                      }
                                    }
                                    term = term30;
                                    if(i_10.value == null)
                                      break Fail20;
                                    term = cast_shift_type_0_0.instance.invoke(context, i_10.value);
                                    if(term == null)
                                      break Fail20;
                                    if(t_10.value == null)
                                      t_10.value = term;
                                    else
                                      if(t_10.value != term && !t_10.value.match(term))
                                        break Fail20;
                                  }
                                  s_14 = term;
                                  if(y_10.value == null)
                                    break Fail20;
                                  term = this.invokeDynamic(context, y_10.value, NO_STRATEGIES, new IStrategoTerm[]{c_10.value, d_10.value, e_10.value, f_10.value, g_10.value, h_10.value, t_10.value, j_10.value, k_10.value});
                                  if(term == null)
                                    break Fail20;
                                  q_14 = term;
                                  term = s_14;
                                  if(z_10.value == null)
                                    break Fail20;
                                  v_14 = z_10.value;
                                  term = this.invokeDynamic(context, v_14, NO_STRATEGIES, new IStrategoTerm[]{c_10.value, d_10.value, e_10.value, f_10.value, g_10.value, h_10.value, transform.constLong0, j_10.value, k_10.value});
                                  if(term == null)
                                    break Fail20;
                                  term = termFactory.makeAppl(transform._consLeftShift_2, new IStrategoTerm[]{q_14, term});
                                  if(true)
                                    break Success29;
                                }
                              }
                              term = term29;
                              add_external_impl_0_9_fragment_1 add_external_impl_0_9_fragment_10 = new add_external_impl_0_9_fragment_1();
                              add_external_impl_0_9_fragment_10.s_10 = s_10;
                              add_external_impl_0_9_fragment_10.t_10 = t_10;
                              add_external_impl_0_9_fragment_10.v_10 = v_10;
                              add_external_impl_0_9_fragment_10.u_10 = u_10;
                              add_external_impl_0_9_fragment_10.w_10 = w_10;
                              add_external_impl_0_9_fragment_10.x_10 = x_10;
                              add_external_impl_0_9_fragment_10.y_10 = y_10;
                              add_external_impl_0_9_fragment_10.z_10 = z_10;
                              add_external_impl_0_9_fragment_10.a_11 = a_11;
                              add_external_impl_0_9_fragment_10.b_11 = b_11;
                              add_external_impl_0_9_fragment_10.c_11 = c_11;
                              add_external_impl_0_9_fragment_10.d_11 = d_11;
                              add_external_impl_0_9_fragment_10.e_11 = e_11;
                              add_external_impl_0_9_fragment_10.f_11 = f_11;
                              add_external_impl_0_9_fragment_10.j_11 = j_11;
                              add_external_impl_0_9_fragment_10.h_11 = h_11;
                              add_external_impl_0_9_fragment_10.g_11 = g_11;
                              add_external_impl_0_9_fragment_10.c_10 = c_10;
                              add_external_impl_0_9_fragment_10.d_10 = d_10;
                              add_external_impl_0_9_fragment_10.e_10 = e_10;
                              add_external_impl_0_9_fragment_10.f_10 = f_10;
                              add_external_impl_0_9_fragment_10.g_10 = g_10;
                              add_external_impl_0_9_fragment_10.h_10 = h_10;
                              add_external_impl_0_9_fragment_10.i_10 = i_10;
                              add_external_impl_0_9_fragment_10.j_10 = j_10;
                              add_external_impl_0_9_fragment_10.k_10 = k_10;
                              add_external_impl_0_9_fragment_10.i_11 = i_11;
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
        TermReference m_21 = new TermReference();
        lifted51 lifted511 = new lifted51();
        lifted50 lifted500 = new lifted50();
        lifted511.m_21 = m_21;
        lifted500.m_21 = m_21;
        term = or_2_0.instance.invoke(context, term, lifted500, lifted511);
        if(term == null)
          break Fail36;
        IStrategoTerm term73 = term;
        Success31:
        { 
          Fail37:
          { 
            IStrategoTerm n_21 = null;
            n_21 = term;
            lifted54 lifted540 = new lifted54();
            lifted52 lifted520 = new lifted52();
            lifted540.m_21 = m_21;
            lifted520.m_21 = m_21;
            term = or_2_0.instance.invoke(context, term, lifted520, lifted540);
            if(term == null)
              break Fail37;
            term = n_21;
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

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm o_21, IStrategoTerm p_21, IStrategoTerm q_21, IStrategoTerm r_21)
    { 
      context.push("add__params_0_4");
      Fail38:
      { 
        TermReference s_21 = new TermReference();
        lifted57 lifted570 = new lifted57();
        lifted56 lifted560 = new lifted56();
        lifted570.s_21 = s_21;
        lifted560.s_21 = s_21;
        term = or_2_0.instance.invoke(context, term, lifted560, lifted570);
        if(term == null)
          break Fail38;
        term = add__var_0_5.instance.invoke(context, term, s_21.value, o_21, p_21, q_21, r_21);
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

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm v_21, IStrategoTerm w_21, IStrategoTerm x_21, IStrategoTerm y_21, IStrategoTerm z_21)
    { 
      context.push("add__var_0_5");
      Fail39:
      { 
        term = hashtable_put_0_2.instance.invoke(context, y_21, v_21, z_21);
        if(term == null)
          break Fail39;
        term = increament_0_2.instance.invoke(context, w_21, v_21, w_21);
        if(term == null)
          break Fail39;
        term = increament_0_2.instance.invoke(context, x_21, v_21, x_21);
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

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm a_22, IStrategoTerm b_22, IStrategoTerm c_22)
    { 
      ITermFactory termFactory = context.getFactory();
      context.push("try_to_get_type_0_3");
      Fail40:
      { 
        IStrategoTerm d_22 = null;
        IStrategoTerm e_22 = null;
        IStrategoTerm f_22 = null;
        IStrategoTerm g_22 = null;
        if(term.getTermType() != IStrategoTerm.TUPLE || term.getSubtermCount() != 2)
          break Fail40;
        d_22 = term.getSubterm(0);
        f_22 = term.getSubterm(1);
        term = get_type_of_0_3.instance.invoke(context, d_22, a_22, b_22, c_22);
        if(term == null)
          break Fail40;
        e_22 = term;
        Success32:
        { 
          Fail41:
          { 
            IStrategoTerm h_22 = null;
            h_22 = term;
            IStrategoTerm term75 = term;
            Success33:
            { 
              Fail42:
              { 
                term = termFactory.makeTuple(e_22, transform.constNone0);
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
            term = h_22;
            { 
              term = e_22;
              if(true)
                break Success32;
            }
          }
          term = get_type_of_0_3.instance.invoke(context, f_22, a_22, b_22, c_22);
          if(term == null)
            break Fail40;
          g_22 = term;
          Success34:
          { 
            Fail43:
            { 
              IStrategoTerm i_22 = null;
              i_22 = term;
              IStrategoTerm term77 = term;
              Success35:
              { 
                Fail44:
                { 
                  term = termFactory.makeTuple(g_22, transform.constNone0);
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
              term = i_22;
              { 
                term = g_22;
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
        IStrategoTerm l_22 = null;
        IStrategoTerm m_22 = null;
        IStrategoTerm n_22 = null;
        l_22 = term;
        n_22 = term;
        m_22 = l_22;
        term = n_22;
        IStrategoTerm term78 = term;
        Success36:
        { 
          Fail46:
          { 
            IStrategoTerm o_22 = null;
            o_22 = term;
            term = m_22;
            if(term.getTermType() != IStrategoTerm.APPL || transform._consByte_0 != ((IStrategoAppl)term).getConstructor())
              break Fail46;
            term = o_22;
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
              IStrategoTerm p_22 = null;
              p_22 = term;
              term = m_22;
              if(term.getTermType() != IStrategoTerm.APPL || transform._consInt_0 != ((IStrategoAppl)term).getConstructor())
                break Fail47;
              term = p_22;
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
                IStrategoTerm q_22 = null;
                q_22 = term;
                term = m_22;
                if(term.getTermType() != IStrategoTerm.APPL || transform._consShort_0 != ((IStrategoAppl)term).getConstructor())
                  break Fail48;
                term = q_22;
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
                  IStrategoTerm r_22 = null;
                  r_22 = term;
                  term = or_2_0.instance.invoke(context, m_22, lifted58.instance, lifted59.instance);
                  if(term == null)
                    break Fail49;
                  term = r_22;
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
                    IStrategoTerm s_22 = null;
                    s_22 = term;
                    term = or_2_0.instance.invoke(context, m_22, lifted60.instance, lifted61.instance);
                    if(term == null)
                      break Fail50;
                    term = s_22;
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
                      IStrategoTerm t_22 = null;
                      t_22 = term;
                      term = m_22;
                      if(term.getTermType() != IStrategoTerm.APPL || transform._consLong_0 != ((IStrategoAppl)term).getConstructor())
                        break Fail51;
                      term = t_22;
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
                        IStrategoTerm u_22 = null;
                        u_22 = term;
                        term = m_22;
                        if(term.getTermType() != IStrategoTerm.APPL || transform._consDouble_0 != ((IStrategoAppl)term).getConstructor())
                          break Fail52;
                        term = u_22;
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
                          IStrategoTerm v_22 = null;
                          v_22 = term;
                          term = m_22;
                          if(term.getTermType() != IStrategoTerm.APPL || transform._consDeci_1 != ((IStrategoAppl)term).getConstructor())
                            break Fail53;
                          term = v_22;
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
                            IStrategoTerm w_22 = null;
                            w_22 = term;
                            term = or_2_0.instance.invoke(context, m_22, lifted62.instance, lifted63.instance);
                            if(term == null)
                              break Fail54;
                            term = w_22;
                            { 
                              term = transform.constBoolean0;
                              if(true)
                                break Success44;
                            }
                          }
                          term = debug_0_0.instance.invoke(context, transform.const12);
                          if(term == null)
                            break Fail45;
                          term = debug_0_0.instance.invoke(context, l_22);
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
        IStrategoTerm z_22 = null;
        IStrategoTerm a_23 = null;
        IStrategoTerm b_23 = null;
        z_22 = term;
        b_23 = term;
        a_23 = z_22;
        term = b_23;
        IStrategoTerm term87 = term;
        Success45:
        { 
          Fail56:
          { 
            IStrategoTerm c_23 = null;
            c_23 = term;
            term = a_23;
            if(term.getTermType() != IStrategoTerm.APPL || transform._consInt_0 != ((IStrategoAppl)term).getConstructor())
              break Fail56;
            term = c_23;
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
              IStrategoTerm d_23 = null;
              d_23 = term;
              term = a_23;
              if(term.getTermType() != IStrategoTerm.APPL || transform._consLong_0 != ((IStrategoAppl)term).getConstructor())
                break Fail57;
              term = d_23;
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
                IStrategoTerm e_23 = null;
                e_23 = term;
                term = a_23;
                if(term.getTermType() != IStrategoTerm.APPL || transform._consDeci_1 != ((IStrategoAppl)term).getConstructor())
                  break Fail58;
                term = e_23;
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
                  IStrategoTerm f_23 = null;
                  f_23 = term;
                  term = a_23;
                  if(term.getTermType() != IStrategoTerm.APPL || transform._consDouble_0 != ((IStrategoAppl)term).getConstructor())
                    break Fail59;
                  term = f_23;
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
                    IStrategoTerm g_23 = null;
                    g_23 = term;
                    term = or_2_0.instance.invoke(context, a_23, lifted64.instance, lifted65.instance);
                    if(term == null)
                      break Fail60;
                    term = g_23;
                    { 
                      term = transform.constBoolean0;
                      if(true)
                        break Success49;
                    }
                  }
                  term = debug_0_0.instance.invoke(context, transform.const12);
                  if(term == null)
                    break Fail55;
                  term = debug_0_0.instance.invoke(context, z_22);
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
        IStrategoTerm j_23 = null;
        IStrategoTerm k_23 = null;
        IStrategoTerm l_23 = null;
        j_23 = term;
        l_23 = term;
        k_23 = j_23;
        term = l_23;
        IStrategoTerm term92 = term;
        Success50:
        { 
          Fail62:
          { 
            IStrategoTerm m_23 = null;
            m_23 = term;
            term = k_23;
            if(term.getTermType() != IStrategoTerm.APPL || transform._consByte_0 != ((IStrategoAppl)term).getConstructor())
              break Fail62;
            term = m_23;
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
              IStrategoTerm n_23 = null;
              n_23 = term;
              term = k_23;
              if(term.getTermType() != IStrategoTerm.APPL || transform._consShort_0 != ((IStrategoAppl)term).getConstructor())
                break Fail63;
              term = n_23;
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
                IStrategoTerm o_23 = null;
                o_23 = term;
                term = k_23;
                if(term.getTermType() != IStrategoTerm.APPL || transform._consInt_0 != ((IStrategoAppl)term).getConstructor())
                  break Fail64;
                term = o_23;
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
                  IStrategoTerm p_23 = null;
                  p_23 = term;
                  term = k_23;
                  if(term.getTermType() != IStrategoTerm.APPL || transform._consLong_0 != ((IStrategoAppl)term).getConstructor())
                    break Fail65;
                  term = p_23;
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
                    IStrategoTerm q_23 = null;
                    q_23 = term;
                    term = or_2_0.instance.invoke(context, k_23, lifted66.instance, lifted67.instance);
                    if(term == null)
                      break Fail66;
                    term = q_23;
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
                      IStrategoTerm r_23 = null;
                      r_23 = term;
                      term = k_23;
                      if(term.getTermType() != IStrategoTerm.APPL || transform._consDouble_0 != ((IStrategoAppl)term).getConstructor())
                        break Fail67;
                      term = r_23;
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
                        IStrategoTerm s_23 = null;
                        s_23 = term;
                        term = k_23;
                        if(term.getTermType() != IStrategoTerm.APPL || transform._consDeci_1 != ((IStrategoAppl)term).getConstructor())
                          break Fail68;
                        term = s_23;
                        { 
                          term = transform.constLong0;
                          if(true)
                            break Success56;
                        }
                      }
                      term = debug_0_0.instance.invoke(context, transform.const12);
                      if(term == null)
                        break Fail61;
                      term = debug_0_0.instance.invoke(context, j_23);
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
        IStrategoTerm v_23 = null;
        IStrategoTerm w_23 = null;
        IStrategoTerm x_23 = null;
        v_23 = term;
        x_23 = term;
        w_23 = v_23;
        term = x_23;
        IStrategoTerm term99 = term;
        Success57:
        { 
          Fail70:
          { 
            IStrategoTerm y_23 = null;
            y_23 = term;
            term = w_23;
            if(term.getTermType() != IStrategoTerm.APPL || transform._consByte_0 != ((IStrategoAppl)term).getConstructor())
              break Fail70;
            term = y_23;
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
              IStrategoTerm z_23 = null;
              z_23 = term;
              term = w_23;
              if(term.getTermType() != IStrategoTerm.APPL || transform._consShort_0 != ((IStrategoAppl)term).getConstructor())
                break Fail71;
              term = z_23;
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
                IStrategoTerm a_24 = null;
                a_24 = term;
                term = w_23;
                if(term.getTermType() != IStrategoTerm.APPL || transform._consInt_0 != ((IStrategoAppl)term).getConstructor())
                  break Fail72;
                term = a_24;
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
                  IStrategoTerm b_24 = null;
                  b_24 = term;
                  term = w_23;
                  if(term.getTermType() != IStrategoTerm.APPL || transform._consLong_0 != ((IStrategoAppl)term).getConstructor())
                    break Fail73;
                  term = b_24;
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
                    IStrategoTerm c_24 = null;
                    c_24 = term;
                    term = or_2_0.instance.invoke(context, w_23, lifted68.instance, lifted69.instance);
                    if(term == null)
                      break Fail74;
                    term = c_24;
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
                      IStrategoTerm d_24 = null;
                      d_24 = term;
                      term = w_23;
                      if(term.getTermType() != IStrategoTerm.APPL || transform._consDouble_0 != ((IStrategoAppl)term).getConstructor())
                        break Fail75;
                      term = d_24;
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
                        IStrategoTerm e_24 = null;
                        e_24 = term;
                        term = w_23;
                        if(term.getTermType() != IStrategoTerm.APPL || transform._consDeci_1 != ((IStrategoAppl)term).getConstructor())
                          break Fail76;
                        term = e_24;
                        { 
                          term = transform.constLong0;
                          if(true)
                            break Success63;
                        }
                      }
                      term = debug_0_0.instance.invoke(context, transform.const12);
                      if(term == null)
                        break Fail69;
                      term = debug_0_0.instance.invoke(context, v_23);
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
        IStrategoTerm h_24 = null;
        IStrategoTerm i_24 = null;
        IStrategoTerm j_24 = null;
        h_24 = term;
        j_24 = term;
        i_24 = h_24;
        term = j_24;
        IStrategoTerm term106 = term;
        Success64:
        { 
          Fail78:
          { 
            IStrategoTerm k_24 = null;
            k_24 = term;
            term = i_24;
            if(term.getTermType() != IStrategoTerm.APPL || transform._consByte_0 != ((IStrategoAppl)term).getConstructor())
              break Fail78;
            term = k_24;
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
              IStrategoTerm l_24 = null;
              l_24 = term;
              term = or_2_0.instance.invoke(context, i_24, lifted70.instance, lifted71.instance);
              if(term == null)
                break Fail79;
              term = l_24;
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
                IStrategoTerm m_24 = null;
                m_24 = term;
                term = i_24;
                if(term.getTermType() != IStrategoTerm.APPL || transform._consShort_0 != ((IStrategoAppl)term).getConstructor())
                  break Fail80;
                term = m_24;
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
                  IStrategoTerm n_24 = null;
                  n_24 = term;
                  term = i_24;
                  if(term.getTermType() != IStrategoTerm.APPL || transform._consInt_0 != ((IStrategoAppl)term).getConstructor())
                    break Fail81;
                  term = n_24;
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
                    IStrategoTerm o_24 = null;
                    o_24 = term;
                    term = i_24;
                    if(term.getTermType() != IStrategoTerm.APPL || transform._consLong_0 != ((IStrategoAppl)term).getConstructor())
                      break Fail82;
                    term = o_24;
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
                      IStrategoTerm p_24 = null;
                      p_24 = term;
                      term = i_24;
                      if(term.getTermType() != IStrategoTerm.APPL || transform._consDeci_1 != ((IStrategoAppl)term).getConstructor())
                        break Fail83;
                      term = p_24;
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
                        IStrategoTerm q_24 = null;
                        q_24 = term;
                        term = or_2_0.instance.invoke(context, i_24, lifted72.instance, lifted73.instance);
                        if(term == null)
                          break Fail84;
                        term = q_24;
                        { 
                          term = transform.constBoolean0;
                          if(true)
                            break Success70;
                        }
                      }
                      term = debug_0_0.instance.invoke(context, transform.const12);
                      if(term == null)
                        break Fail77;
                      term = debug_0_0.instance.invoke(context, h_24);
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
        IStrategoTerm t_24 = null;
        IStrategoTerm u_24 = null;
        IStrategoTerm v_24 = null;
        t_24 = term;
        v_24 = term;
        u_24 = t_24;
        term = v_24;
        IStrategoTerm term113 = term;
        Success71:
        { 
          Fail86:
          { 
            IStrategoTerm w_24 = null;
            w_24 = term;
            term = u_24;
            if(term.getTermType() != IStrategoTerm.APPL || transform._consByte_0 != ((IStrategoAppl)term).getConstructor())
              break Fail86;
            term = w_24;
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
              IStrategoTerm x_24 = null;
              x_24 = term;
              term = or_2_0.instance.invoke(context, u_24, lifted74.instance, lifted75.instance);
              if(term == null)
                break Fail87;
              term = x_24;
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
                IStrategoTerm y_24 = null;
                y_24 = term;
                term = u_24;
                if(term.getTermType() != IStrategoTerm.APPL || transform._consShort_0 != ((IStrategoAppl)term).getConstructor())
                  break Fail88;
                term = y_24;
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
                  IStrategoTerm z_24 = null;
                  z_24 = term;
                  term = u_24;
                  if(term.getTermType() != IStrategoTerm.APPL || transform._consInt_0 != ((IStrategoAppl)term).getConstructor())
                    break Fail89;
                  term = z_24;
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
                    IStrategoTerm a_25 = null;
                    a_25 = term;
                    term = u_24;
                    if(term.getTermType() != IStrategoTerm.APPL || transform._consLong_0 != ((IStrategoAppl)term).getConstructor())
                      break Fail90;
                    term = a_25;
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
                      IStrategoTerm b_25 = null;
                      b_25 = term;
                      term = u_24;
                      if(term.getTermType() != IStrategoTerm.APPL || transform._consDeci_1 != ((IStrategoAppl)term).getConstructor())
                        break Fail91;
                      term = b_25;
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
                        IStrategoTerm c_25 = null;
                        c_25 = term;
                        term = or_2_0.instance.invoke(context, u_24, lifted76.instance, lifted77.instance);
                        if(term == null)
                          break Fail92;
                        term = c_25;
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
                          IStrategoTerm d_25 = null;
                          d_25 = term;
                          term = u_24;
                          if(term.getTermType() != IStrategoTerm.APPL || transform._consDouble_0 != ((IStrategoAppl)term).getConstructor())
                            break Fail93;
                          term = d_25;
                          { 
                            term = transform.constDouble0;
                            if(true)
                              break Success78;
                          }
                        }
                        term = debug_0_0.instance.invoke(context, transform.const12);
                        if(term == null)
                          break Fail85;
                        term = debug_0_0.instance.invoke(context, t_24);
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

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm g_25, IStrategoTerm h_25, IStrategoTerm i_25)
    { 
      ITermFactory termFactory = context.getFactory();
      context.push("get_LHS_type_0_3");
      Fail94:
      { 
        IStrategoTerm j_25 = null;
        IStrategoTerm k_25 = null;
        IStrategoTerm m_25 = null;
        m_25 = term;
        j_25 = term;
        term = get_type_of_0_3.instance.invoke(context, m_25, g_25, h_25, i_25);
        if(term == null)
          break Fail94;
        k_25 = term;
        Success79:
        { 
          Fail95:
          { 
            IStrategoTerm l_25 = null;
            l_25 = term;
            term = termFactory.makeTuple(k_25, transform.constNone0);
            term = equal_0_0.instance.invoke(context, term);
            if(term == null)
              break Fail95;
            term = l_25;
            { 
              term = debug_0_0.instance.invoke(context, transform.const13);
              if(term == null)
                break Fail94;
              term = debug_0_0.instance.invoke(context, j_25);
              if(term == null)
                break Fail94;
              term = transform.const9;
              if(true)
                break Fail94;
              if(true)
                break Success79;
            }
          }
          term = k_25;
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

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm o_25, IStrategoTerm p_25, IStrategoTerm q_25)
    { 
      context.push("get_type_of_0_3");
      Fail96:
      { 
        IStrategoTerm r_25 = null;
        IStrategoTerm term122 = term;
        Success80:
        { 
          Fail97:
          { 
            IStrategoTerm s_25 = null;
            s_25 = term;
            IStrategoTerm term123 = term;
            Success81:
            { 
              Fail98:
              { 
                term = type_of_0_3.instance.invoke(context, term, o_25, p_25, q_25);
                if(term == null)
                  break Fail98;
                r_25 = term;
                { 
                  if(true)
                    break Fail97;
                  if(true)
                    break Success81;
                }
              }
              term = term123;
            }
            term = s_25;
            { 
              term = transform.constNone0;
              if(r_25 == null)
                r_25 = term;
              else
                if(r_25 != term && !r_25.match(term))
                  break Fail96;
              if(true)
                break Success80;
            }
          }
          term = term122;
        }
        if(r_25 == null)
          break Fail96;
        term = r_25;
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

    public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm v_25, IStrategoTerm w_25, IStrategoTerm x_25, IStrategoTerm y_25, IStrategoTerm z_25, IStrategoTerm a_26, IStrategoTerm b_26)
    { 
      ITermFactory termFactory = context.getFactory();
      context.push("handle_expr_0_7");
      Fail99:
      { 
        IStrategoTerm c_26 = null;
        IStrategoTerm d_26 = null;
        IStrategoTerm e_26 = null;
        IStrategoTerm h_26 = null;
        h_26 = term;
        c_26 = term;
        term = fetch_0_0.instance.invoke(context, h_26);
        if(term == null)
          break Fail99;
        d_26 = term;
        IStrategoTerm term124 = term;
        Success82:
        { 
          Fail100:
          { 
            IStrategoTerm f_26 = null;
            f_26 = term;
            term = hashtable_keys_0_0.instance.invoke(context, v_25);
            if(term == null)
              break Fail100;
            term = termFactory.makeTuple(d_26, term);
            term = elem_0_0.instance.invoke(context, term);
            if(term == null)
              break Fail100;
            term = f_26;
            { 
              term = c_26;
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
              IStrategoTerm g_26 = null;
              g_26 = term;
              term = termFactory.makeTuple(a_26, transform.constFalse0);
              term = equal_0_0.instance.invoke(context, term);
              if(term == null)
                break Fail101;
              term = g_26;
              { 
                term = debug_0_0.instance.invoke(context, transform.const14);
                if(term == null)
                  break Fail99;
                term = debug_0_0.instance.invoke(context, c_26);
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
            IStrategoTerm o_26 = null;
            term = generate_ref_method__name_0_2.instance.invoke(context, term, d_26, y_25);
            if(term == null)
              break Fail99;
            e_26 = term;
            term = w_25;
            o_26 = w_25;
            term = create_ref_method_0_4.instance.invoke(context, term, d_26, e_26, z_25, b_26);
            if(term == null)
              break Fail99;
            term = iset_add_0_1.instance.invoke(context, o_26, term);
            if(term == null)
              break Fail99;
            term = iset_add_0_1.instance.invoke(context, x_25, d_26);
            if(term == null)
              break Fail99;
            term = generate_invoke_ref_0_1.instance.invoke(context, transform.const9, e_26);
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

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm r_26)
    { 
      ITermFactory termFactory = context.getFactory();
      Fail102:
      { 
        term = termFactory.makeAppl(transform._consInvoke_2, new IStrategoTerm[]{termFactory.makeAppl(transform._consMethod_1, new IStrategoTerm[]{termFactory.makeAppl(transform._consMethodName_1, new IStrategoTerm[]{termFactory.makeAppl(transform._consId_1, new IStrategoTerm[]{r_26})})}), transform.constCons1});
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

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm s_26, IStrategoTerm t_26)
    { 
      ITermFactory termFactory = context.getFactory();
      context.push("generate_ref_method__name_0_2");
      Fail103:
      { 
        IStrategoTerm u_26 = null;
        IStrategoTerm term126 = term;
        Success84:
        { 
          Fail104:
          { 
            IStrategoTerm w_26 = null;
            w_26 = term;
            IStrategoTerm term127 = term;
            Success85:
            { 
              Fail105:
              { 
                term = hashtable_keys_0_0.instance.invoke(context, t_26);
                if(term == null)
                  break Fail105;
                term = termFactory.makeTuple(s_26, term);
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
            term = w_26;
            { 
              term = hashtable_keys_0_0.instance.invoke(context, t_26);
              if(term == null)
                break Fail103;
              term = length_0_0.instance.invoke(context, term);
              if(term == null)
                break Fail103;
              term = termFactory.makeTuple(term, transform.const16);
              term = add_0_0.instance.invoke(context, term);
              if(term == null)
                break Fail103;
              u_26 = term;
              term = int_to_string_0_0.instance.invoke(context, u_26);
              if(term == null)
                break Fail103;
              term = (IStrategoTerm)termFactory.makeListCons(transform.const17, termFactory.makeListCons(term, (IStrategoList)transform.constNil0));
              term = concat_strings_0_0.instance.invoke(context, term);
              if(term == null)
                break Fail103;
              term = hashtable_put_0_2.instance.invoke(context, t_26, s_26, term);
              if(term == null)
                break Fail103;
              if(true)
                break Success84;
            }
          }
          term = term126;
        }
        term = hashtable_get_0_1.instance.invoke(context, t_26, s_26);
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

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm d_27, IStrategoTerm e_27)
    { 
      ITermFactory termFactory = context.getFactory();
      context.push("increament_0_2");
      Fail106:
      { 
        IStrategoTerm f_27 = null;
        Success86:
        { 
          Fail107:
          { 
            IStrategoTerm g_27 = null;
            g_27 = term;
            term = hashtable_keys_0_0.instance.invoke(context, e_27);
            if(term == null)
              break Fail107;
            term = termFactory.makeTuple(d_27, term);
            term = elem_0_0.instance.invoke(context, term);
            if(term == null)
              break Fail107;
            term = g_27;
            { 
              IStrategoTerm k_27 = null;
              term = hashtable_get_0_1.instance.invoke(context, e_27, d_27);
              if(term == null)
                break Fail106;
              f_27 = term;
              term = hashtable_remove_0_1.instance.invoke(context, e_27, d_27);
              if(term == null)
                break Fail106;
              k_27 = e_27;
              term = termFactory.makeTuple(transform.const16, f_27);
              term = add_0_0.instance.invoke(context, term);
              if(term == null)
                break Fail106;
              term = hashtable_put_0_2.instance.invoke(context, k_27, d_27, term);
              if(term == null)
                break Fail106;
              if(true)
                break Success86;
            }
          }
          IStrategoTerm m_27 = null;
          m_27 = e_27;
          term = hashtable_put_0_2.instance.invoke(context, m_27, d_27, transform.const16);
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

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm n_27, IStrategoTerm o_27)
    { 
      ITermFactory termFactory = context.getFactory();
      context.push("decreament_0_2");
      Fail108:
      { 
        IStrategoTerm p_27 = null;
        IStrategoTerm q_27 = null;
        q_27 = term;
        IStrategoTerm term129 = term;
        Success87:
        { 
          Fail109:
          { 
            IStrategoTerm r_27 = null;
            r_27 = term;
            term = hashtable_keys_0_0.instance.invoke(context, n_27);
            if(term == null)
              break Fail109;
            term = termFactory.makeTuple(q_27, term);
            term = elem_0_0.instance.invoke(context, term);
            if(term == null)
              break Fail109;
            term = r_27;
            { 
              IStrategoTerm y_27 = null;
              term = hashtable_get_0_1.instance.invoke(context, n_27, q_27);
              if(term == null)
                break Fail108;
              p_27 = term;
              term = hashtable_remove_0_1.instance.invoke(context, n_27, q_27);
              if(term == null)
                break Fail108;
              y_27 = n_27;
              term = hashtable_get_0_1.instance.invoke(context, o_27, q_27);
              if(term == null)
                break Fail108;
              term = termFactory.makeTuple(p_27, term);
              term = subti_0_0.instance.invoke(context, term);
              if(term == null)
                break Fail108;
              term = hashtable_put_0_2.instance.invoke(context, y_27, q_27, term);
              if(term == null)
                break Fail108;
              IStrategoTerm term130 = term;
              Success88:
              { 
                Fail110:
                { 
                  IStrategoTerm s_27 = null;
                  s_27 = term;
                  term = hashtable_get_0_1.instance.invoke(context, n_27, q_27);
                  if(term == null)
                    break Fail110;
                  term = termFactory.makeTuple(term, transform.const18);
                  term = equal_0_0.instance.invoke(context, term);
                  if(term == null)
                    break Fail110;
                  term = s_27;
                  { 
                    term = hashtable_remove_0_1.instance.invoke(context, n_27, q_27);
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
              h_28 = transform.constByte0;
              term = transform.constLit0;
              i_28 = transform.constLit0;
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
                h_28 = transform.constInt0;
                term = transform.constLit0;
                i_28 = transform.constLit0;
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
                  h_28 = transform.constBoolean0;
                  term = transform.constLit1;
                  i_28 = transform.constLit1;
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
                    h_28 = transform.constFloat0;
                    term = transform.constLit2;
                    i_28 = transform.constLit2;
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
                      h_28 = transform.constDouble0;
                      term = transform.constLit2;
                      i_28 = transform.constLit2;
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
                        h_28 = transform.constLong0;
                        term = transform.constLit0;
                        i_28 = transform.constLit0;
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
                          h_28 = transform.constDouble0;
                          term = transform.constLit2;
                          i_28 = transform.constLit2;
                          if(true)
                            break Success95;
                        }
                      }
                      h_28 = transform.constClassOrInterfaceType0;
                      term = transform.constLit3;
                      i_28 = transform.constLit3;
                    }
                  }
                }
              }
            }
          }
        }
        term = termFactory.makeAppl(transform._consMethodDec_2, new IStrategoTerm[]{termFactory.makeAppl(transform._consMethodDecHead_6, new IStrategoTerm[]{(IStrategoTerm)termFactory.makeListCons(termFactory.makeAppl(transform._consAnno_2, new IStrategoTerm[]{transform.constTypeName1, (IStrategoTerm)termFactory.makeListCons(termFactory.makeAppl(transform._consElemValPair_2, new IStrategoTerm[]{transform.constId3, termFactory.makeAppl(transform._consLit_1, new IStrategoTerm[]{termFactory.makeAppl(transform._consString_1, new IStrategoTerm[]{(IStrategoTerm)termFactory.makeListCons(termFactory.makeAppl(transform._consChars_1, new IStrategoTerm[]{d_28}), (IStrategoList)transform.constNil0)})})}), (IStrategoList)transform.constNil0)}), (IStrategoList)transform.constCons2), transform.constNone0, h_28, termFactory.makeAppl(transform._consId_1, new IStrategoTerm[]{e_28}), (IStrategoTerm)termFactory.makeListCons(termFactory.makeAppl(transform._consParam_3, new IStrategoTerm[]{transform.constNil0, termFactory.makeAppl(transform._consClassOrInterfaceType_2, new IStrategoTerm[]{termFactory.makeAppl(transform._consTypeName_1, new IStrategoTerm[]{termFactory.makeAppl(transform._consId_1, new IStrategoTerm[]{g_28})}), transform.constNone0}), transform.constId4}), (IStrategoList)transform.constNil0), transform.constNone0}), termFactory.makeAppl(transform._consBlock_1, new IStrategoTerm[]{(IStrategoTerm)termFactory.makeListCons(termFactory.makeAppl(transform._consReturn_1, new IStrategoTerm[]{termFactory.makeAppl(transform._consSome_1, new IStrategoTerm[]{i_28})}), (IStrategoList)transform.constNil0)})});
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

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm s_28, IStrategoTerm t_28, IStrategoTerm u_28)
    { 
      ITermFactory termFactory = context.getFactory();
      context.push("get_expr_type_0_3");
      Fail119:
      { 
        Success96:
        { 
          Fail120:
          { 
            IStrategoTerm v_28 = null;
            v_28 = term;
            term = hashtable_keys_0_0.instance.invoke(context, t_28);
            if(term == null)
              break Fail120;
            term = termFactory.makeTuple(s_28, term);
            term = elem_0_0.instance.invoke(context, term);
            if(term == null)
              break Fail120;
            term = v_28;
            { 
              term = hashtable_get_0_1.instance.invoke(context, u_28, s_28);
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

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm d_52, IStrategoTerm e_52, IStrategoTerm f_52)
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
                IStrategoTerm r_34 = null;
                r_34 = term;
                term = termFactory.makeTuple(d_52, transform.constNone0);
                term = equal_0_0.instance.invoke(context, term);
                if(term == null)
                  break Fail123;
                term = r_34;
                { 
                  term = transform.constLong0;
                  if(true)
                    break Success98;
                }
              }
              term = d_52;
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
                  IStrategoTerm n_34 = null;
                  n_34 = term;
                  term = termFactory.makeTuple(d_52, transform.constNone0);
                  term = equal_0_0.instance.invoke(context, term);
                  if(term == null)
                    break Fail125;
                  term = n_34;
                  { 
                    term = transform.constDouble0;
                    if(true)
                      break Success100;
                  }
                }
                term = d_52;
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
                    IStrategoTerm j_34 = null;
                    j_34 = term;
                    term = termFactory.makeTuple(d_52, transform.constNone0);
                    term = equal_0_0.instance.invoke(context, term);
                    if(term == null)
                      break Fail127;
                    term = j_34;
                    { 
                      term = transform.constDouble0;
                      if(true)
                        break Success102;
                    }
                  }
                  term = cast_bounded_arithmetic_type_0_0.instance.invoke(context, d_52);
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
                  TermReference e_34 = new TermReference();
                  lifted95 lifted950 = new lifted95();
                  lifted92 lifted920 = new lifted92();
                  lifted950.e_34 = e_34;
                  lifted920.e_34 = e_34;
                  term = or_2_0.instance.invoke(context, term, lifted920, lifted950);
                  if(term == null)
                    break Fail128;
                  Success104:
                  { 
                    Fail129:
                    { 
                      IStrategoTerm f_34 = null;
                      f_34 = term;
                      term = termFactory.makeTuple(d_52, transform.constNone0);
                      term = equal_0_0.instance.invoke(context, term);
                      if(term == null)
                        break Fail129;
                      term = f_34;
                      { 
                        if(e_34.value == null)
                          break Fail128;
                        term = get_type_of_0_3.instance.invoke(context, e_34.value, d_52, e_52, f_52);
                        if(term == null)
                          break Fail128;
                        term = cast_shift_type_0_0.instance.invoke(context, term);
                        if(term == null)
                          break Fail128;
                        if(true)
                          break Success104;
                      }
                    }
                    term = cast_shift_type_0_0.instance.invoke(context, d_52);
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
                      IStrategoTerm y_33 = null;
                      IStrategoTerm z_33 = null;
                      y_33 = term.getSubterm(0);
                      z_33 = term.getSubterm(1);
                      Success106:
                      { 
                        Fail131:
                        { 
                          IStrategoTerm a_34 = null;
                          a_34 = term;
                          term = termFactory.makeTuple(d_52, transform.constNone0);
                          term = equal_0_0.instance.invoke(context, term);
                          if(term == null)
                            break Fail131;
                          term = a_34;
                          { 
                            term = termFactory.makeTuple(y_33, z_33);
                            term = try_to_get_type_0_3.instance.invoke(context, term, d_52, e_52, f_52);
                            if(term == null)
                              break Fail130;
                            term = cast_conditional_type_0_0.instance.invoke(context, term);
                            if(term == null)
                              break Fail130;
                            if(true)
                              break Success106;
                          }
                        }
                        term = cast_bounded_conditional_type_0_0.instance.invoke(context, d_52);
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
                        IStrategoTerm s_33 = null;
                        IStrategoTerm t_33 = null;
                        s_33 = term.getSubterm(0);
                        t_33 = term.getSubterm(1);
                        Success108:
                        { 
                          Fail133:
                          { 
                            IStrategoTerm u_33 = null;
                            u_33 = term;
                            term = termFactory.makeTuple(d_52, transform.constNone0);
                            term = equal_0_0.instance.invoke(context, term);
                            if(term == null)
                              break Fail133;
                            term = u_33;
                            { 
                              term = termFactory.makeTuple(s_33, t_33);
                              term = try_to_get_type_0_3.instance.invoke(context, term, d_52, e_52, f_52);
                              if(term == null)
                                break Fail132;
                              term = cast_conditional_type_0_0.instance.invoke(context, term);
                              if(term == null)
                                break Fail132;
                              if(true)
                                break Success108;
                            }
                          }
                          term = cast_bounded_conditional_type_0_0.instance.invoke(context, d_52);
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
                          IStrategoTerm m_33 = null;
                          IStrategoTerm n_33 = null;
                          m_33 = term.getSubterm(0);
                          n_33 = term.getSubterm(1);
                          Success110:
                          { 
                            Fail135:
                            { 
                              IStrategoTerm o_33 = null;
                              o_33 = term;
                              term = termFactory.makeTuple(d_52, transform.constNone0);
                              term = equal_0_0.instance.invoke(context, term);
                              if(term == null)
                                break Fail135;
                              term = o_33;
                              { 
                                term = termFactory.makeTuple(m_33, n_33);
                                term = try_to_get_type_0_3.instance.invoke(context, term, d_52, e_52, f_52);
                                if(term == null)
                                  break Fail134;
                                term = cast_conditional_type_0_0.instance.invoke(context, term);
                                if(term == null)
                                  break Fail134;
                                if(true)
                                  break Success110;
                              }
                            }
                            term = cast_bounded_conditional_type_0_0.instance.invoke(context, d_52);
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
                          TermReference f_33 = new TermReference();
                          IStrategoTerm g_33 = null;
                          lifted99 lifted990 = new lifted99();
                          lifted96 lifted960 = new lifted96();
                          lifted990.f_33 = f_33;
                          lifted960.f_33 = f_33;
                          term = or_2_0.instance.invoke(context, term, lifted960, lifted990);
                          if(term == null)
                            break Fail136;
                          if(f_33.value == null)
                            break Fail136;
                          term = get_type_of_0_3.instance.invoke(context, f_33.value, d_52, e_52, f_52);
                          if(term == null)
                            break Fail136;
                          g_33 = term;
                          Success112:
                          { 
                            Fail137:
                            { 
                              IStrategoTerm h_33 = null;
                              h_33 = term;
                              term = termFactory.makeTuple(g_33, transform.constNone0);
                              term = equal_0_0.instance.invoke(context, term);
                              if(term == null)
                                break Fail137;
                              term = h_33;
                              { 
                                Success113:
                                { 
                                  Fail138:
                                  { 
                                    IStrategoTerm i_33 = null;
                                    i_33 = term;
                                    term = termFactory.makeTuple(d_52, transform.constNone0);
                                    term = equal_0_0.instance.invoke(context, term);
                                    if(term == null)
                                      break Fail138;
                                    term = i_33;
                                    { 
                                      term = transform.constDouble0;
                                      if(true)
                                        break Success113;
                                    }
                                  }
                                  term = ensure__number_0_0.instance.invoke(context, d_52);
                                  if(term == null)
                                    break Fail136;
                                }
                                if(true)
                                  break Success112;
                              }
                            }
                            term = ensure__number_0_0.instance.invoke(context, g_33);
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
                              IStrategoTerm z_32 = null;
                              z_32 = term;
                              term = fetch_0_0.instance.invoke(context, term);
                              if(term == null)
                                break Fail139;
                              term = get_expr_type_0_3.instance.invoke(context, z_32, term, e_52, f_52);
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
                                IStrategoTerm p_32 = null;
                                p_32 = term;
                                term = fetch_0_0.instance.invoke(context, term);
                                if(term == null)
                                  break Fail140;
                                term = get_expr_type_0_3.instance.invoke(context, p_32, term, e_52, f_52);
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
                                  IStrategoTerm g_32 = null;
                                  g_32 = term.getSubterm(0);
                                  term = g_32;
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
                                                      IStrategoTerm b_31 = null;
                                                      b_31 = term.getSubterm(0);
                                                      term = this.invoke(context, b_31, d_52, e_52, f_52);
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
                                                        IStrategoTerm x_30 = null;
                                                        x_30 = term.getSubterm(0);
                                                        term = this.invoke(context, x_30, d_52, e_52, f_52);
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
                                                          IStrategoTerm t_30 = null;
                                                          t_30 = term.getSubterm(0);
                                                          term = this.invoke(context, t_30, d_52, e_52, f_52);
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
                                                            IStrategoTerm p_30 = null;
                                                            p_30 = term.getSubterm(0);
                                                            term = this.invoke(context, p_30, d_52, e_52, f_52);
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
                                                              IStrategoTerm l_30 = null;
                                                              l_30 = term.getSubterm(0);
                                                              term = this.invoke(context, l_30, d_52, e_52, f_52);
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
                                                                IStrategoTerm h_30 = null;
                                                                h_30 = term.getSubterm(0);
                                                                term = this.invoke(context, h_30, d_52, e_52, f_52);
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
                                                                  IStrategoTerm d_30 = null;
                                                                  d_30 = term.getSubterm(0);
                                                                  term = this.invoke(context, d_30, d_52, e_52, f_52);
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
                                                                    IStrategoTerm z_29 = null;
                                                                    z_29 = term.getSubterm(0);
                                                                    term = this.invoke(context, z_29, d_52, e_52, f_52);
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
                                                                      IStrategoTerm v_29 = null;
                                                                      v_29 = term.getSubterm(0);
                                                                      term = this.invoke(context, v_29, d_52, e_52, f_52);
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
                                                                        IStrategoTerm r_29 = null;
                                                                        r_29 = term.getSubterm(0);
                                                                        term = this.invoke(context, r_29, d_52, e_52, f_52);
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
                                                                          IStrategoTerm n_29 = null;
                                                                          n_29 = term.getSubterm(0);
                                                                          term = this.invoke(context, n_29, d_52, e_52, f_52);
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
                                                                            IStrategoTerm j_29 = null;
                                                                            j_29 = term.getSubterm(0);
                                                                            term = this.invoke(context, j_29, d_52, e_52, f_52);
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
                                                                              IStrategoTerm f_29 = null;
                                                                              f_29 = term.getSubterm(0);
                                                                              term = f_29;
                                                                              if(true)
                                                                                break Success138;
                                                                            }
                                                                            term = term156;
                                                                          }
                                                                          if(cons4 == transform._consCastRef_2)
                                                                          { 
                                                                            IStrategoTerm b_29 = null;
                                                                            b_29 = term.getSubterm(0);
                                                                            term = b_29;
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
              IStrategoTerm a_35 = null;
              a_35 = term.getSubterm(0);
              term = this.invoke(context, a_35);
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
                IStrategoTerm y_34 = null;
                IStrategoTerm z_34 = null;
                y_34 = term.getSubterm(0);
                z_34 = term.getSubterm(1);
                term = termFactory.makeAppl(transform._consAmbName_2, new IStrategoTerm[]{y_34, z_34});
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
                  IStrategoTerm u_34 = null;
                  IStrategoTerm v_34 = null;
                  u_34 = term.getSubterm(0);
                  IStrategoTerm arg127 = term.getSubterm(1);
                  if(arg127.getTermType() != IStrategoTerm.APPL || transform._consId_1 != ((IStrategoAppl)arg127).getConstructor())
                    break Fail167;
                  v_34 = arg127.getSubterm(0);
                  term = this.invoke(context, u_34);
                  if(term == null)
                    break Fail167;
                  term = (IStrategoTerm)termFactory.makeListCons(term, termFactory.makeListCons(transform.const0, termFactory.makeListCons(v_34, (IStrategoList)transform.constNil0)));
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
                    IStrategoTerm t_34 = null;
                    t_34 = term.getSubterm(0);
                    term = this.invoke(context, t_34);
                    if(term == null)
                      break Fail168;
                    if(true)
                      break Success142;
                  }
                  term = term181;
                }
                if(cons5 == transform._consId_1)
                { 
                  IStrategoTerm s_34 = null;
                  s_34 = term.getSubterm(0);
                  term = s_34;
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
        IStrategoTerm c_35 = null;
        IStrategoTerm d_35 = null;
        IStrategoTerm f_35 = null;
        IStrategoTerm k_35 = null;
        IStrategoTerm l_35 = null;
        IStrategoTerm n_35 = null;
        IStrategoTerm s_35 = null;
        IStrategoTerm p_35 = null;
        if(term.getTermType() != IStrategoTerm.LIST || ((IStrategoList)term).isEmpty())
          break Fail170;
        c_35 = ((IStrategoList)term).tail();
        term = debug_0_0.instance.invoke(context, transform.const25);
        if(term == null)
          break Fail170;
        term = debug_0_0.instance.invoke(context, c_35);
        if(term == null)
          break Fail170;
        term = c_35;
        if(term.getTermType() != IStrategoTerm.LIST || ((IStrategoList)term).isEmpty())
          break Fail170;
        n_35 = ((IStrategoList)term).head();
        term = n_35;
        f_35 = n_35;
        term = $Read$From$File_0_0.instance.invoke(context, term);
        if(term == null)
          break Fail170;
        d_35 = term;
        term = c_35;
        if(term.getTermType() != IStrategoTerm.LIST || ((IStrategoList)term).isEmpty())
          break Fail170;
        s_35 = ((IStrategoList)term).tail();
        term = s_35;
        if(term.getTermType() != IStrategoTerm.LIST || ((IStrategoList)term).isEmpty())
          break Fail170;
        p_35 = ((IStrategoList)term).head();
        k_35 = p_35;
        term = transform_0_0.instance.invoke(context, d_35);
        if(term == null)
          break Fail170;
        l_35 = term;
        term = dirname_0_0.instance.invoke(context, f_35);
        if(term == null)
          break Fail170;
        term = base_filename_0_0.instance.invoke(context, f_35);
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
        term = termFactory.makeTuple(k_35, transform.const28);
        term = fopen_0_0.instance.invoke(context, term);
        if(term == null)
          break Fail170;
        term = termFactory.makeTuple(l_35, term);
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

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm x_35)
    { 
      ITermFactory termFactory = context.getFactory();
      context.push("gen_method_state_0_1");
      Fail173:
      { 
        IStrategoTerm z_35 = null;
        if(term.getTermType() != IStrategoTerm.APPL || transform._consMethodSignature_2 != ((IStrategoAppl)term).getConstructor())
          break Fail173;
        IStrategoTerm arg128 = term.getSubterm(0);
        if(arg128.getTermType() != IStrategoTerm.APPL || transform._consId_1 != ((IStrategoAppl)arg128).getConstructor())
          break Fail173;
        z_35 = term;
        term = gen_method_state_name_0_1.instance.invoke(context, z_35, x_35);
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

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm e_36)
    { 
      ITermFactory termFactory = context.getFactory();
      context.push("gen_method_state_name_0_1");
      Fail174:
      { 
        IStrategoTerm f_36 = null;
        IStrategoTerm g_36 = null;
        if(term.getTermType() != IStrategoTerm.APPL || transform._consMethodSignature_2 != ((IStrategoAppl)term).getConstructor())
          break Fail174;
        IStrategoTerm arg130 = term.getSubterm(0);
        if(arg130.getTermType() != IStrategoTerm.APPL || transform._consId_1 != ((IStrategoAppl)arg130).getConstructor())
          break Fail174;
        f_36 = arg130.getSubterm(0);
        g_36 = term;
        term = hashtable_get_0_1.instance.invoke(context, e_36, g_36);
        if(term == null)
          break Fail174;
        term = int_to_string_0_0.instance.invoke(context, term);
        if(term == null)
          break Fail174;
        term = (IStrategoTerm)termFactory.makeListCons(f_36, termFactory.makeListCons(term, (IStrategoList)transform.constCons10));
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

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm l_36)
    { 
      ITermFactory termFactory = context.getFactory();
      context.push("gen_requires_method_name_0_1");
      Fail175:
      { 
        IStrategoTerm m_36 = null;
        IStrategoTerm n_36 = null;
        if(term.getTermType() != IStrategoTerm.APPL || transform._consMethodSignature_2 != ((IStrategoAppl)term).getConstructor())
          break Fail175;
        IStrategoTerm arg132 = term.getSubterm(0);
        if(arg132.getTermType() != IStrategoTerm.APPL || transform._consId_1 != ((IStrategoAppl)arg132).getConstructor())
          break Fail175;
        m_36 = arg132.getSubterm(0);
        n_36 = term;
        term = hashtable_get_0_1.instance.invoke(context, l_36, n_36);
        if(term == null)
          break Fail175;
        term = int_to_string_0_0.instance.invoke(context, term);
        if(term == null)
          break Fail175;
        term = (IStrategoTerm)termFactory.makeListCons(transform.const39, termFactory.makeListCons(m_36, termFactory.makeListCons(term, (IStrategoList)transform.constNil0)));
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

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm s_36)
    { 
      ITermFactory termFactory = context.getFactory();
      context.push("gen_on_entry_method_name_0_1");
      Fail176:
      { 
        IStrategoTerm t_36 = null;
        IStrategoTerm u_36 = null;
        if(term.getTermType() != IStrategoTerm.APPL || transform._consMethodSignature_2 != ((IStrategoAppl)term).getConstructor())
          break Fail176;
        IStrategoTerm arg134 = term.getSubterm(0);
        if(arg134.getTermType() != IStrategoTerm.APPL || transform._consId_1 != ((IStrategoAppl)arg134).getConstructor())
          break Fail176;
        t_36 = arg134.getSubterm(0);
        u_36 = term;
        term = hashtable_get_0_1.instance.invoke(context, s_36, u_36);
        if(term == null)
          break Fail176;
        term = int_to_string_0_0.instance.invoke(context, term);
        if(term == null)
          break Fail176;
        term = (IStrategoTerm)termFactory.makeListCons(transform.const40, termFactory.makeListCons(t_36, termFactory.makeListCons(term, (IStrategoList)transform.constNil0)));
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

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm z_36)
    { 
      ITermFactory termFactory = context.getFactory();
      context.push("gen_on_exit_method_name_0_1");
      Fail177:
      { 
        IStrategoTerm a_37 = null;
        IStrategoTerm b_37 = null;
        if(term.getTermType() != IStrategoTerm.APPL || transform._consMethodSignature_2 != ((IStrategoAppl)term).getConstructor())
          break Fail177;
        IStrategoTerm arg136 = term.getSubterm(0);
        if(arg136.getTermType() != IStrategoTerm.APPL || transform._consId_1 != ((IStrategoAppl)arg136).getConstructor())
          break Fail177;
        a_37 = arg136.getSubterm(0);
        b_37 = term;
        term = hashtable_get_0_1.instance.invoke(context, z_36, b_37);
        if(term == null)
          break Fail177;
        term = int_to_string_0_0.instance.invoke(context, term);
        if(term == null)
          break Fail177;
        term = (IStrategoTerm)termFactory.makeListCons(transform.const41, termFactory.makeListCons(a_37, termFactory.makeListCons(term, (IStrategoList)transform.constNil0)));
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

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm i_37)
    { 
      ITermFactory termFactory = context.getFactory();
      context.push("make_while_condition_0_1");
      Fail178:
      { 
        IStrategoTerm j_37 = null;
        IStrategoTerm k_37 = null;
        IStrategoTerm l_37 = null;
        IStrategoTerm m_37 = null;
        m_37 = term;
        term = length_0_0.instance.invoke(context, i_37);
        if(term == null)
          break Fail178;
        l_37 = term;
        term = m_37;
        IStrategoTerm term185 = term;
        Success143:
        { 
          Fail179:
          { 
            IStrategoTerm n_37 = null;
            IStrategoTerm r_37 = null;
            n_37 = term;
            r_37 = l_37;
            term = equal_0_1.instance.invoke(context, r_37, transform.const18);
            if(term == null)
              break Fail179;
            term = n_37;
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
              IStrategoTerm o_37 = null;
              IStrategoTerm t_37 = null;
              o_37 = term;
              t_37 = l_37;
              term = equal_0_1.instance.invoke(context, t_37, transform.const16);
              if(term == null)
                break Fail180;
              term = o_37;
              { 
                IStrategoTerm p_37 = null;
                term = i_37;
                if(term.getTermType() != IStrategoTerm.LIST || ((IStrategoList)term).isEmpty())
                  break Fail178;
                p_37 = ((IStrategoList)term).head();
                IStrategoTerm arg138 = ((IStrategoList)term).tail();
                if(arg138.getTermType() != IStrategoTerm.LIST || !((IStrategoList)arg138).isEmpty())
                  break Fail178;
                term = p_37;
                if(true)
                  break Success144;
              }
            }
            term = i_37;
            if(term.getTermType() != IStrategoTerm.LIST || ((IStrategoList)term).isEmpty())
              break Fail178;
            k_37 = ((IStrategoList)term).head();
            j_37 = ((IStrategoList)term).tail();
            term = this.invoke(context, term, j_37);
            if(term == null)
              break Fail178;
            term = termFactory.makeAppl(transform._consLazyOr_2, new IStrategoTerm[]{term, k_37});
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

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm w_37)
    { 
      ITermFactory termFactory = context.getFactory();
      context.push("gen_class_head_0_1");
      Fail181:
      { 
        IStrategoTerm y_37 = null;
        IStrategoTerm z_37 = null;
        term = w_37;
        IStrategoTerm term187 = term;
        IStrategoConstructor cons6 = term.getTermType() == IStrategoTerm.APPL ? ((IStrategoAppl)term).getConstructor() : null;
        Success145:
        { 
          if(cons6 == transform._consTypeName_2)
          { 
            Fail182:
            { 
              IStrategoTerm e_154 = null;
              IStrategoTerm arg140 = term.getSubterm(1);
              if(arg140.getTermType() != IStrategoTerm.APPL || transform._consId_1 != ((IStrategoAppl)arg140).getConstructor())
                break Fail182;
              e_154 = arg140.getSubterm(0);
              term = e_154;
              if(true)
                break Success145;
            }
            term = term187;
          }
          if(cons6 == transform._consTypeName_1)
          { 
            IStrategoTerm f_154 = null;
            IStrategoTerm arg141 = term.getSubterm(0);
            if(arg141.getTermType() != IStrategoTerm.APPL || transform._consId_1 != ((IStrategoAppl)arg141).getConstructor())
              break Fail181;
            f_154 = arg141.getSubterm(0);
            term = f_154;
          }
          else
          { 
            break Fail181;
          }
        }
        z_37 = term;
        term = fetch__full__class__name_0_0.instance.invoke(context, w_37);
        if(term == null)
          break Fail181;
        term = (IStrategoTerm)termFactory.makeListCons(termFactory.makeAppl(transform._consAnno_2, new IStrategoTerm[]{transform.constTypeName4, (IStrategoTerm)termFactory.makeListCons(termFactory.makeAppl(transform._consElemValPair_2, new IStrategoTerm[]{transform.constId15, termFactory.makeAppl(transform._consLit_1, new IStrategoTerm[]{termFactory.makeAppl(transform._consString_1, new IStrategoTerm[]{(IStrategoTerm)termFactory.makeListCons(termFactory.makeAppl(transform._consChars_1, new IStrategoTerm[]{term}), (IStrategoList)transform.constNil0)})})}), (IStrategoList)transform.constNil0)}), (IStrategoList)transform.constCons11);
        y_37 = term;
        term = (IStrategoTerm)termFactory.makeListCons(z_37, (IStrategoList)transform.constCons3);
        term = concat_strings_0_0.instance.invoke(context, term);
        if(term == null)
          break Fail181;
        term = termFactory.makeAppl(transform._consClassDecHead_5, new IStrategoTerm[]{y_37, termFactory.makeAppl(transform._consId_1, new IStrategoTerm[]{term}), transform.constNone0, transform.constNone0, transform.constNone0});
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

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm c_38, IStrategoTerm d_38, IStrategoTerm e_38)
    { 
      ITermFactory termFactory = context.getFactory();
      context.push("make_requires_method_0_3");
      Fail183:
      { 
        IStrategoTerm f_38 = null;
        IStrategoTerm g_38 = null;
        IStrategoTerm h_38 = null;
        IStrategoTerm i_38 = null;
        IStrategoTerm j_38 = null;
        if(term.getTermType() != IStrategoTerm.APPL || transform._consMethodSignature_2 != ((IStrategoAppl)term).getConstructor())
          break Fail183;
        IStrategoTerm arg142 = term.getSubterm(0);
        if(arg142.getTermType() != IStrategoTerm.APPL || transform._consId_1 != ((IStrategoAppl)arg142).getConstructor())
          break Fail183;
        f_38 = arg142.getSubterm(0);
        g_38 = term.getSubterm(1);
        j_38 = term;
        term = map_1_0.instance.invoke(context, g_38, pp_type_0_0.instance);
        if(term == null)
          break Fail183;
        term = map_1_0.instance.invoke(context, term, lifted103.instance);
        if(term == null)
          break Fail183;
        term = (IStrategoTerm)termFactory.makeListCons(termFactory.makeAppl(transform._consAnno_2, new IStrategoTerm[]{transform.constTypeName5, (IStrategoTerm)termFactory.makeListCons(termFactory.makeAppl(transform._consElemValPair_2, new IStrategoTerm[]{transform.constId18, termFactory.makeAppl(transform._consLit_1, new IStrategoTerm[]{termFactory.makeAppl(transform._consString_1, new IStrategoTerm[]{(IStrategoTerm)termFactory.makeListCons(termFactory.makeAppl(transform._consChars_1, new IStrategoTerm[]{f_38}), (IStrategoList)transform.constNil0)})})}), termFactory.makeListCons(transform.constElemValPair0, termFactory.makeListCons(termFactory.makeAppl(transform._consElemValPair_2, new IStrategoTerm[]{transform.constId17, termFactory.makeAppl(transform._consElemValArrayInit_1, new IStrategoTerm[]{term})}), (IStrategoList)transform.constNil0)))}), (IStrategoList)transform.constCons2);
        h_38 = term;
        term = gen_requires_method_name_0_1.instance.invoke(context, j_38, e_38);
        if(term == null)
          break Fail183;
        i_38 = term;
        term = hashtable_put_0_2.instance.invoke(context, d_38, j_38, term);
        if(term == null)
          break Fail183;
        term = hashtable_get_0_1.instance.invoke(context, c_38, j_38);
        if(term == null)
          break Fail183;
        term = termFactory.makeAppl(transform._consMethodDec_2, new IStrategoTerm[]{termFactory.makeAppl(transform._consMethodDecHead_6, new IStrategoTerm[]{h_38, transform.constNone0, transform.constBoolean0, termFactory.makeAppl(transform._consId_1, new IStrategoTerm[]{i_38}), transform.constNil0, transform.constNone0}), termFactory.makeAppl(transform._consBlock_1, new IStrategoTerm[]{(IStrategoTerm)termFactory.makeListCons(termFactory.makeAppl(transform._consReturn_1, new IStrategoTerm[]{termFactory.makeAppl(transform._consSome_1, new IStrategoTerm[]{term})}), (IStrategoList)transform.constNil0)})});
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

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm d_39)
    { 
      ITermFactory termFactory = context.getFactory();
      context.push("gen_source_location_ann_0_1");
      Fail184:
      { 
        IStrategoTerm e_39 = null;
        IStrategoTerm g_39 = null;
        IStrategoTerm h_39 = null;
        IStrategoTerm i_39 = null;
        IStrategoTerm j_39 = null;
        IStrategoTerm f_39 = null;
        e_39 = term;
        term = original_file_0_0.instance.invoke(context, e_39);
        if(term == null)
          break Fail184;
        g_39 = term;
        term = original_location_0_0.instance.invoke(context, e_39);
        if(term == null)
          break Fail184;
        term = original_start_line_0_0.instance.invoke(context, term);
        if(term == null)
          break Fail184;
        term = int_to_string_0_0.instance.invoke(context, term);
        if(term == null)
          break Fail184;
        h_39 = term;
        term = original_location_0_0.instance.invoke(context, e_39);
        if(term == null)
          break Fail184;
        term = original_end_line_0_0.instance.invoke(context, term);
        if(term == null)
          break Fail184;
        term = int_to_string_0_0.instance.invoke(context, term);
        if(term == null)
          break Fail184;
        i_39 = term;
        term = original_location_0_0.instance.invoke(context, e_39);
        if(term == null)
          break Fail184;
        term = original_column_0_0.instance.invoke(context, term);
        if(term == null)
          break Fail184;
        term = int_to_string_0_0.instance.invoke(context, term);
        if(term == null)
          break Fail184;
        j_39 = term;
        term = original_offset_0_0.instance.invoke(context, e_39);
        if(term == null)
          break Fail184;
        if(term.getTermType() != IStrategoTerm.TUPLE || term.getSubtermCount() != 2)
          break Fail184;
        f_39 = term.getSubterm(0);
        term = int_to_string_0_0.instance.invoke(context, f_39);
        if(term == null)
          break Fail184;
        term = termFactory.makeAppl(transform._consAnno_2, new IStrategoTerm[]{termFactory.makeAppl(transform._consTypeName_1, new IStrategoTerm[]{termFactory.makeAppl(transform._consId_1, new IStrategoTerm[]{d_39})}), (IStrategoTerm)termFactory.makeListCons(termFactory.makeAppl(transform._consElemValPair_2, new IStrategoTerm[]{transform.constId23, termFactory.makeAppl(transform._consLit_1, new IStrategoTerm[]{termFactory.makeAppl(transform._consString_1, new IStrategoTerm[]{(IStrategoTerm)termFactory.makeListCons(termFactory.makeAppl(transform._consChars_1, new IStrategoTerm[]{g_39}), (IStrategoList)transform.constNil0)})})}), termFactory.makeListCons(termFactory.makeAppl(transform._consElemValPair_2, new IStrategoTerm[]{transform.constId22, termFactory.makeAppl(transform._consLit_1, new IStrategoTerm[]{termFactory.makeAppl(transform._consDeci_1, new IStrategoTerm[]{h_39})})}), termFactory.makeListCons(termFactory.makeAppl(transform._consElemValPair_2, new IStrategoTerm[]{transform.constId21, termFactory.makeAppl(transform._consLit_1, new IStrategoTerm[]{termFactory.makeAppl(transform._consDeci_1, new IStrategoTerm[]{i_39})})}), termFactory.makeListCons(termFactory.makeAppl(transform._consElemValPair_2, new IStrategoTerm[]{transform.constId20, termFactory.makeAppl(transform._consLit_1, new IStrategoTerm[]{termFactory.makeAppl(transform._consDeci_1, new IStrategoTerm[]{j_39})})}), termFactory.makeListCons(termFactory.makeAppl(transform._consElemValPair_2, new IStrategoTerm[]{transform.constId19, termFactory.makeAppl(transform._consLit_1, new IStrategoTerm[]{termFactory.makeAppl(transform._consDeci_1, new IStrategoTerm[]{term})})}), (IStrategoList)transform.constNil0)))))});
        context.popOnSuccess();
        if(true)
          return term;
      }
      context.popOnFailure();
      return null;
    }
  }

  @SuppressWarnings("all") public static class original_file_0_0 extends Strategy 
  { 
    public static original_file_0_0 instance = new original_file_0_0();

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      Fail185:
      { 
        IStrategoTerm r_39 = null;
        r_39 = term;
        term = context.invokePrimitive("SSL_EXT_origin_file", r_39, NO_STRATEGIES, new IStrategoTerm[]{term});
        if(term == null)
          break Fail185;
        if(true)
          return term;
      }
      context.push("original_file_0_0");
      context.popOnFailure();
      return null;
    }
  }

  @SuppressWarnings("all") public static class original_location_0_0 extends Strategy 
  { 
    public static original_location_0_0 instance = new original_location_0_0();

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      Fail186:
      { 
        IStrategoTerm v_39 = null;
        v_39 = term;
        term = context.invokePrimitive("SSL_EXT_origin_location", v_39, NO_STRATEGIES, new IStrategoTerm[]{term});
        if(term == null)
          break Fail186;
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
      Fail187:
      { 
        IStrategoTerm y_39 = null;
        if(term.getTermType() != IStrategoTerm.TUPLE || term.getSubtermCount() != 4)
          break Fail187;
        y_39 = term.getSubterm(0);
        term = y_39;
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
      Fail188:
      { 
        IStrategoTerm z_39 = null;
        if(term.getTermType() != IStrategoTerm.TUPLE || term.getSubtermCount() != 4)
          break Fail188;
        z_39 = term.getSubterm(1);
        term = z_39;
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
      Fail189:
      { 
        IStrategoTerm a_40 = null;
        if(term.getTermType() != IStrategoTerm.TUPLE || term.getSubtermCount() != 4)
          break Fail189;
        a_40 = term.getSubterm(2);
        term = a_40;
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
      Fail190:
      { 
        IStrategoTerm c_40 = null;
        c_40 = term;
        term = context.invokePrimitive("SSL_EXT_origin_offset", c_40, NO_STRATEGIES, new IStrategoTerm[]{term});
        if(term == null)
          break Fail190;
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

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm f_40, IStrategoTerm g_40, IStrategoTerm h_40, IStrategoTerm i_40)
    { 
      ITermFactory termFactory = context.getFactory();
      context.push("make_on_entry_method_0_4");
      Fail191:
      { 
        IStrategoTerm j_40 = null;
        IStrategoTerm k_40 = null;
        IStrategoTerm l_40 = null;
        IStrategoTerm m_40 = null;
        IStrategoTerm n_40 = null;
        if(term.getTermType() != IStrategoTerm.APPL || transform._consMethodSignature_2 != ((IStrategoAppl)term).getConstructor())
          break Fail191;
        IStrategoTerm arg153 = term.getSubterm(0);
        if(arg153.getTermType() != IStrategoTerm.APPL || transform._consId_1 != ((IStrategoAppl)arg153).getConstructor())
          break Fail191;
        j_40 = arg153.getSubterm(0);
        k_40 = term.getSubterm(1);
        n_40 = term;
        term = map_1_0.instance.invoke(context, k_40, pp_type_0_0.instance);
        if(term == null)
          break Fail191;
        term = map_1_0.instance.invoke(context, term, lifted105.instance);
        if(term == null)
          break Fail191;
        term = (IStrategoTerm)termFactory.makeListCons(termFactory.makeAppl(transform._consAnno_2, new IStrategoTerm[]{transform.constTypeName6, (IStrategoTerm)termFactory.makeListCons(termFactory.makeAppl(transform._consElemValPair_2, new IStrategoTerm[]{transform.constId18, termFactory.makeAppl(transform._consLit_1, new IStrategoTerm[]{termFactory.makeAppl(transform._consString_1, new IStrategoTerm[]{(IStrategoTerm)termFactory.makeListCons(termFactory.makeAppl(transform._consChars_1, new IStrategoTerm[]{j_40}), (IStrategoList)transform.constNil0)})})}), termFactory.makeListCons(transform.constElemValPair0, termFactory.makeListCons(termFactory.makeAppl(transform._consElemValPair_2, new IStrategoTerm[]{transform.constId17, termFactory.makeAppl(transform._consElemValArrayInit_1, new IStrategoTerm[]{term})}), (IStrategoList)transform.constNil0)))}), (IStrategoList)transform.constCons2);
        l_40 = term;
        term = gen_on_entry_method_name_0_1.instance.invoke(context, n_40, i_40);
        if(term == null)
          break Fail191;
        m_40 = term;
        term = hashtable_put_0_2.instance.invoke(context, h_40, n_40, term);
        if(term == null)
          break Fail191;
        term = hashtable_get_0_1.instance.invoke(context, f_40, n_40);
        if(term == null)
          break Fail191;
        term = termFactory.makeAppl(transform._consMethodDec_2, new IStrategoTerm[]{termFactory.makeAppl(transform._consMethodDecHead_6, new IStrategoTerm[]{l_40, transform.constNone0, transform.constVoid0, termFactory.makeAppl(transform._consId_1, new IStrategoTerm[]{m_40}), (IStrategoTerm)termFactory.makeListCons(termFactory.makeAppl(transform._consParam_3, new IStrategoTerm[]{transform.constNil0, termFactory.makeAppl(transform._consTypeName_1, new IStrategoTerm[]{termFactory.makeAppl(transform._consId_1, new IStrategoTerm[]{g_40})}), transform.constId0}), (IStrategoList)transform.constNil0), transform.constNone0}), term});
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

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm v_40, IStrategoTerm w_40, IStrategoTerm x_40, IStrategoTerm y_40)
    { 
      ITermFactory termFactory = context.getFactory();
      context.push("make_on_exit_method_0_4");
      Fail192:
      { 
        IStrategoTerm z_40 = null;
        IStrategoTerm a_41 = null;
        IStrategoTerm b_41 = null;
        IStrategoTerm c_41 = null;
        IStrategoTerm d_41 = null;
        if(term.getTermType() != IStrategoTerm.APPL || transform._consMethodSignature_2 != ((IStrategoAppl)term).getConstructor())
          break Fail192;
        IStrategoTerm arg154 = term.getSubterm(0);
        if(arg154.getTermType() != IStrategoTerm.APPL || transform._consId_1 != ((IStrategoAppl)arg154).getConstructor())
          break Fail192;
        z_40 = arg154.getSubterm(0);
        a_41 = term.getSubterm(1);
        d_41 = term;
        term = map_1_0.instance.invoke(context, a_41, pp_type_0_0.instance);
        if(term == null)
          break Fail192;
        term = map_1_0.instance.invoke(context, term, lifted107.instance);
        if(term == null)
          break Fail192;
        term = (IStrategoTerm)termFactory.makeListCons(termFactory.makeAppl(transform._consAnno_2, new IStrategoTerm[]{transform.constTypeName7, (IStrategoTerm)termFactory.makeListCons(termFactory.makeAppl(transform._consElemValPair_2, new IStrategoTerm[]{transform.constId18, termFactory.makeAppl(transform._consLit_1, new IStrategoTerm[]{termFactory.makeAppl(transform._consString_1, new IStrategoTerm[]{(IStrategoTerm)termFactory.makeListCons(termFactory.makeAppl(transform._consChars_1, new IStrategoTerm[]{z_40}), (IStrategoList)transform.constNil0)})})}), termFactory.makeListCons(transform.constElemValPair0, termFactory.makeListCons(termFactory.makeAppl(transform._consElemValPair_2, new IStrategoTerm[]{transform.constId17, termFactory.makeAppl(transform._consElemValArrayInit_1, new IStrategoTerm[]{term})}), (IStrategoList)transform.constNil0)))}), (IStrategoList)transform.constCons2);
        b_41 = term;
        term = gen_on_exit_method_name_0_1.instance.invoke(context, d_41, y_40);
        if(term == null)
          break Fail192;
        c_41 = term;
        term = hashtable_put_0_2.instance.invoke(context, x_40, d_41, term);
        if(term == null)
          break Fail192;
        term = hashtable_get_0_1.instance.invoke(context, v_40, d_41);
        if(term == null)
          break Fail192;
        term = termFactory.makeAppl(transform._consMethodDec_2, new IStrategoTerm[]{termFactory.makeAppl(transform._consMethodDecHead_6, new IStrategoTerm[]{b_41, transform.constNone0, transform.constVoid0, termFactory.makeAppl(transform._consId_1, new IStrategoTerm[]{c_41}), (IStrategoTerm)termFactory.makeListCons(termFactory.makeAppl(transform._consParam_3, new IStrategoTerm[]{transform.constNil0, termFactory.makeAppl(transform._consTypeName_1, new IStrategoTerm[]{termFactory.makeAppl(transform._consId_1, new IStrategoTerm[]{w_40})}), transform.constId0}), (IStrategoList)transform.constNil0), transform.constNone0}), term});
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
      Fail193:
      { 
        IStrategoTerm l_41 = null;
        IStrategoTerm m_41 = null;
        IStrategoTerm n_41 = null;
        IStrategoTerm o_41 = null;
        IStrategoTerm p_41 = null;
        IStrategoTerm q_41 = null;
        IStrategoTerm r_41 = null;
        IStrategoTerm s_41 = null;
        if(term.getTermType() != IStrategoTerm.APPL || transform._consCompilationUnit_3 != ((IStrategoAppl)term).getConstructor())
          break Fail193;
        n_41 = term.getSubterm(0);
        o_41 = term.getSubterm(1);
        m_41 = term.getSubterm(2);
        s_41 = term;
        Success146:
        { 
          Fail194:
          { 
            IStrategoTerm t_41 = null;
            t_41 = term;
            term = get_coordinator_0_1.instance.invoke(context, s_41, m_41);
            if(term == null)
              break Fail194;
            l_41 = term;
            term = t_41;
            { 
              IStrategoTerm w_41 = null;
              term = fetch_coordinator_type_0_0.instance.invoke(context, l_41);
              if(term == null)
                break Fail193;
              p_41 = term;
              term = convert_coordinator_declaration_0_1.instance.invoke(context, l_41, term);
              if(term == null)
                break Fail193;
              q_41 = term;
              term = remove_all_1_0.instance.invoke(context, m_41, lifted108.instance);
              if(term == null)
                break Fail193;
              r_41 = term;
              term = generate_imports_0_2.instance.invoke(context, term, o_41, p_41);
              if(term == null)
                break Fail193;
              w_41 = term;
              term = termFactory.makeTuple((IStrategoTerm)termFactory.makeListCons(q_41, (IStrategoList)transform.constNil0), r_41);
              term = conc_0_0.instance.invoke(context, term);
              if(term == null)
                break Fail193;
              term = termFactory.makeAppl(transform._consCompilationUnit_3, new IStrategoTerm[]{n_41, w_41, term});
              if(true)
                break Success146;
            }
          }
          term = s_41;
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

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm a_42, IStrategoTerm b_42)
    { 
      ITermFactory termFactory = context.getFactory();
      context.push("generate_imports_0_2");
      Fail195:
      { 
        term = termFactory.makeTuple(a_42, (IStrategoTerm)termFactory.makeListCons(termFactory.makeAppl(transform._consTypeImportDec_1, new IStrategoTerm[]{b_42}), (IStrategoList)transform.constNil0), transform.constCons14, transform.constCons17);
        term = conc_0_0.instance.invoke(context, term);
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

  @SuppressWarnings("all") public static class get_coordinator_0_1 extends Strategy 
  { 
    public static get_coordinator_0_1 instance = new get_coordinator_0_1();

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm c_42)
    { 
      context.push("get_coordinator_0_1");
      Fail196:
      { 
        term = getfirst_1_0.instance.invoke(context, c_42, lifted109.instance);
        if(term == null)
          break Fail196;
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
      Fail197:
      { 
        IStrategoTerm e_42 = null;
        IStrategoTerm f_42 = null;
        if(term.getTermType() != IStrategoTerm.APPL || transform._consCoordinatorDec_2 != ((IStrategoAppl)term).getConstructor())
          break Fail197;
        e_42 = term.getSubterm(0);
        term = e_42;
        if(term.getTermType() != IStrategoTerm.APPL || transform._consCoordinatorDecHead_1 != ((IStrategoAppl)term).getConstructor())
          break Fail197;
        f_42 = term.getSubterm(0);
        term = f_42;
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

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm i_42)
    { 
      ITermFactory termFactory = context.getFactory();
      context.push("convert_coordinator_declaration_0_1");
      Fail198:
      { 
        IStrategoTerm k_42 = null;
        IStrategoTerm l_42 = null;
        IStrategoTerm m_42 = null;
        IStrategoTerm p_42 = null;
        if(term.getTermType() != IStrategoTerm.APPL || transform._consCoordinatorDec_2 != ((IStrategoAppl)term).getConstructor())
          break Fail198;
        k_42 = term.getSubterm(1);
        m_42 = term;
        IStrategoTerm term189 = term;
        Success147:
        { 
          Fail199:
          { 
            term = i_42;
            IStrategoTerm term190 = term;
            IStrategoConstructor cons7 = term.getTermType() == IStrategoTerm.APPL ? ((IStrategoAppl)term).getConstructor() : null;
            Success148:
            { 
              if(cons7 == transform._consTypeName_2)
              { 
                Fail200:
                { 
                  IStrategoTerm g_154 = null;
                  IStrategoTerm arg160 = term.getSubterm(1);
                  if(arg160.getTermType() != IStrategoTerm.APPL || transform._consId_1 != ((IStrategoAppl)arg160).getConstructor())
                    break Fail200;
                  g_154 = arg160.getSubterm(0);
                  term = g_154;
                  if(true)
                    break Success148;
                }
                term = term190;
              }
              if(cons7 == transform._consTypeName_1)
              { 
                IStrategoTerm h_154 = null;
                IStrategoTerm arg161 = term.getSubterm(0);
                if(arg161.getTermType() != IStrategoTerm.APPL || transform._consId_1 != ((IStrategoAppl)arg161).getConstructor())
                  break Fail199;
                h_154 = arg161.getSubterm(0);
                term = h_154;
              }
              else
              { 
                break Fail199;
              }
            }
            l_42 = term;
            if(true)
              break Success147;
          }
          term = term189;
          IStrategoTerm o_42 = null;
          o_42 = term;
          term = report_with_failure_0_1.instance.invoke(context, o_42, transform.const57);
          if(term == null)
            break Fail198;
        }
        term = m_42;
        term = gen_class_head_0_1.instance.invoke(context, term, i_42);
        if(term == null)
          break Fail198;
        p_42 = term;
        term = gen_coordinator_body_0_1.instance.invoke(context, k_42, l_42);
        if(term == null)
          break Fail198;
        term = termFactory.makeAppl(transform._consClassDec_2, new IStrategoTerm[]{p_42, term});
        term = add__externals_0_1.instance.invoke(context, term, l_42);
        if(term == null)
          break Fail198;
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

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm ref_v_42)
    { 
      ITermFactory termFactory = context.getFactory();
      TermReference v_42 = new TermReference(ref_v_42);
      context.push("gen_coordinator_body_0_1");
      Fail201:
      { 
        TermReference w_42 = new TermReference();
        TermReference x_42 = new TermReference();
        TermReference y_42 = new TermReference();
        IStrategoTerm z_42 = null;
        TermReference a_43 = new TermReference();
        TermReference b_43 = new TermReference();
        TermReference c_43 = new TermReference();
        TermReference d_43 = new TermReference();
        IStrategoTerm e_43 = null;
        IStrategoTerm f_43 = null;
        TermReference g_43 = new TermReference();
        IStrategoTerm h_43 = null;
        TermReference i_43 = new TermReference();
        TermReference j_43 = new TermReference();
        TermReference k_43 = new TermReference();
        TermReference l_43 = new TermReference();
        IStrategoTerm q_43 = null;
        IStrategoTerm r_44 = null;
        IStrategoTerm z_44 = null;
        IStrategoTerm s_44 = null;
        IStrategoTerm a_45 = null;
        IStrategoTerm t_44 = null;
        IStrategoTerm b_45 = null;
        IStrategoTerm u_44 = null;
        IStrategoTerm c_45 = null;
        IStrategoTerm v_44 = null;
        IStrategoTerm d_45 = null;
        IStrategoTerm w_44 = null;
        IStrategoTerm e_45 = null;
        IStrategoTerm x_44 = null;
        IStrategoTerm f_45 = null;
        if(term.getTermType() != IStrategoTerm.APPL || transform._consCoordinatorBody_1 != ((IStrategoAppl)term).getConstructor())
          break Fail201;
        f_43 = term.getSubterm(0);
        q_43 = term;
        IStrategoTerm term191 = term;
        Success149:
        { 
          Fail202:
          { 
            term = new_hashtable_0_0.instance.invoke(context, term);
            if(term == null)
              break Fail202;
            if(i_43.value == null)
              i_43.value = term;
            else
              if(i_43.value != term && !i_43.value.match(term))
                break Fail202;
            term = new_hashtable_0_0.instance.invoke(context, term);
            if(term == null)
              break Fail202;
            if(j_43.value == null)
              j_43.value = term;
            else
              if(j_43.value != term && !j_43.value.match(term))
                break Fail202;
            term = new_hashtable_0_0.instance.invoke(context, term);
            if(term == null)
              break Fail202;
            if(k_43.value == null)
              k_43.value = term;
            else
              if(k_43.value != term && !k_43.value.match(term))
                break Fail202;
            term = new_hashtable_0_0.instance.invoke(context, term);
            if(term == null)
              break Fail202;
            if(w_42.value == null)
              w_42.value = term;
            else
              if(w_42.value != term && !w_42.value.match(term))
                break Fail202;
            term = new_hashtable_0_0.instance.invoke(context, term);
            if(term == null)
              break Fail202;
            if(x_42.value == null)
              x_42.value = term;
            else
              if(x_42.value != term && !x_42.value.match(term))
                break Fail202;
            term = new_hashtable_0_0.instance.invoke(context, term);
            if(term == null)
              break Fail202;
            if(y_42.value == null)
              y_42.value = term;
            else
              if(y_42.value != term && !y_42.value.match(term))
                break Fail202;
            term = new_hashtable_0_0.instance.invoke(context, term);
            if(term == null)
              break Fail202;
            if(l_43.value == null)
              l_43.value = term;
            else
              if(l_43.value != term && !l_43.value.match(term))
                break Fail202;
            term = new_hashtable_0_0.instance.invoke(context, term);
            if(term == null)
              break Fail202;
            if(g_43.value == null)
              g_43.value = term;
            else
              if(g_43.value != term && !g_43.value.match(term))
                break Fail202;
            term = new_hashtable_0_0.instance.invoke(context, term);
            if(term == null)
              break Fail202;
            if(a_43.value == null)
              a_43.value = term;
            else
              if(a_43.value != term && !a_43.value.match(term))
                break Fail202;
            term = new_hashtable_0_0.instance.invoke(context, term);
            if(term == null)
              break Fail202;
            if(b_43.value == null)
              b_43.value = term;
            else
              if(b_43.value != term && !b_43.value.match(term))
                break Fail202;
            term = getfirst_1_0.instance.invoke(context, f_43, lifted110.instance);
            if(term == null)
              break Fail202;
            z_42 = term;
            term = getfirst_1_0.instance.invoke(context, f_43, lifted111.instance);
            if(term == null)
              break Fail202;
            term = get_methods_list_0_0.instance.invoke(context, term);
            if(term == null)
              break Fail202;
            if(c_43.value == null)
              c_43.value = term;
            else
              if(c_43.value != term && !c_43.value.match(term))
                break Fail202;
            term = getfirst_1_0.instance.invoke(context, f_43, lifted112.instance);
            if(term == null)
              break Fail202;
            term = get_methods_list_0_0.instance.invoke(context, term);
            if(term == null)
              break Fail202;
            if(d_43.value == null)
              d_43.value = term;
            else
              if(d_43.value != term && !d_43.value.match(term))
                break Fail202;
            if(c_43.value == null)
              break Fail202;
            term = c_43.value;
            lifted113 lifted1130 = new lifted113();
            lifted1130.a_43 = a_43;
            term = map_1_0.instance.invoke(context, term, lifted1130);
            if(term == null)
              break Fail202;
            if(d_43.value == null)
              break Fail202;
            term = d_43.value;
            lifted114 lifted1140 = new lifted114();
            lifted1140.b_43 = b_43;
            term = map_1_0.instance.invoke(context, term, lifted1140);
            if(term == null)
              break Fail202;
            if(c_43.value == null || d_43.value == null)
              break Fail202;
            term = termFactory.makeTuple(c_43.value, d_43.value);
            term = union_0_0.instance.invoke(context, term);
            if(term == null)
              break Fail202;
            e_43 = term;
            lifted115 lifted1150 = new lifted115();
            lifted1150.l_43 = l_43;
            term = map_1_0.instance.invoke(context, term, lifted1150);
            if(term == null)
              break Fail202;
            term = retain_all_1_0.instance.invoke(context, f_43, lifted116.instance);
            if(term == null)
              break Fail202;
            h_43 = term;
            lifted117 lifted1170 = new lifted117();
            lifted1170.g_43 = g_43;
            term = map_1_0.instance.invoke(context, term, lifted1170);
            if(term == null)
              break Fail202;
            term = h_43;
            lifted118 lifted1180 = new lifted118();
            lifted1180.i_43 = i_43;
            lifted1180.j_43 = j_43;
            lifted1180.k_43 = k_43;
            lifted1180.l_43 = l_43;
            term = map_1_0.instance.invoke(context, term, lifted1180);
            if(term == null)
              break Fail202;
            if(true)
              break Success149;
          }
          term = term191;
          IStrategoTerm o_44 = null;
          o_44 = term;
          term = report_with_failure_0_1.instance.invoke(context, o_44, transform.const58);
          if(term == null)
            break Fail201;
        }
        term = q_43;
        z_44 = term;
        if(z_42 == null)
          break Fail201;
        term = add_condition_fields_0_0.instance.invoke(context, z_42);
        if(term == null)
          break Fail201;
        r_44 = term;
        a_45 = z_44;
        term = add_coordinator_fields_0_0.instance.invoke(context, f_43);
        if(term == null)
          break Fail201;
        s_44 = term;
        term = a_45;
        b_45 = a_45;
        if(e_43 == null)
          break Fail201;
        term = e_43;
        lifted119 lifted1190 = new lifted119();
        lifted1190.l_43 = l_43;
        term = map_1_0.instance.invoke(context, term, lifted1190);
        if(term == null)
          break Fail201;
        t_44 = term;
        term = b_45;
        c_45 = b_45;
        term = gen_is$Run$By$Others_method_0_0.instance.invoke(context, term);
        if(term == null)
          break Fail201;
        u_44 = term;
        term = c_45;
        d_45 = c_45;
        if(i_43.value == null)
          break Fail201;
        term = hashtable_keys_0_0.instance.invoke(context, i_43.value);
        if(term == null)
          break Fail201;
        lifted120 lifted1200 = new lifted120();
        lifted1200.i_43 = i_43;
        lifted1200.w_42 = w_42;
        lifted1200.l_43 = l_43;
        term = map_1_0.instance.invoke(context, term, lifted1200);
        if(term == null)
          break Fail201;
        v_44 = term;
        term = d_45;
        e_45 = d_45;
        if(k_43.value == null)
          break Fail201;
        term = hashtable_keys_0_0.instance.invoke(context, k_43.value);
        if(term == null)
          break Fail201;
        lifted121 lifted1211 = new lifted121();
        lifted1211.k_43 = k_43;
        lifted1211.v_42 = v_42;
        lifted1211.y_42 = y_42;
        lifted1211.l_43 = l_43;
        term = map_1_0.instance.invoke(context, term, lifted1211);
        if(term == null)
          break Fail201;
        w_44 = term;
        term = e_45;
        f_45 = e_45;
        if(j_43.value == null)
          break Fail201;
        term = hashtable_keys_0_0.instance.invoke(context, j_43.value);
        if(term == null)
          break Fail201;
        lifted122 lifted1220 = new lifted122();
        lifted1220.j_43 = j_43;
        lifted1220.v_42 = v_42;
        lifted1220.x_42 = x_42;
        lifted1220.l_43 = l_43;
        term = map_1_0.instance.invoke(context, term, lifted1220);
        if(term == null)
          break Fail201;
        x_44 = term;
        term = f_45;
        if(e_43 == null)
          break Fail201;
        term = e_43;
        lifted123 lifted1230 = new lifted123();
        lifted1230.v_42 = v_42;
        lifted1230.x_42 = x_42;
        lifted1230.w_42 = w_42;
        lifted1230.y_42 = y_42;
        lifted1230.c_43 = c_43;
        lifted1230.d_43 = d_43;
        lifted1230.l_43 = l_43;
        lifted1230.a_43 = a_43;
        lifted1230.b_43 = b_43;
        lifted1230.g_43 = g_43;
        term = map_1_0.instance.invoke(context, term, lifted1230);
        if(term == null)
          break Fail201;
        term = concat_0_0.instance.invoke(context, term);
        if(term == null)
          break Fail201;
        term = termFactory.makeTuple(r_44, s_44, t_44, (IStrategoTerm)termFactory.makeListCons(u_44, (IStrategoList)transform.constNil0), v_44, w_44, x_44, term);
        term = conc_0_0.instance.invoke(context, term);
        if(term == null)
          break Fail201;
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

    public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm h_45, IStrategoTerm i_45, IStrategoTerm j_45, IStrategoTerm k_45, IStrategoTerm l_45, IStrategoTerm m_45, IStrategoTerm n_45, IStrategoTerm o_45, IStrategoTerm p_45, IStrategoTerm q_45)
    { 
      ITermFactory termFactory = context.getFactory();
      context.push("make_lock_and_unlock_methods_0_10");
      Fail203:
      { 
        IStrategoTerm r_45 = null;
        IStrategoTerm s_45 = null;
        r_45 = term;
        term = make_lock_method_0_9.instance.invokeDynamic(context, r_45, NO_STRATEGIES, new IStrategoTerm[]{h_45, j_45, k_45, l_45, m_45, n_45, o_45, p_45, q_45});
        if(term == null)
          break Fail203;
        s_45 = term;
        term = make_unlock_method_0_3.instance.invoke(context, r_45, h_45, i_45, n_45);
        if(term == null)
          break Fail203;
        term = (IStrategoTerm)termFactory.makeListCons(s_45, termFactory.makeListCons(term, (IStrategoList)transform.constNil0));
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

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm y_45, IStrategoTerm z_45, IStrategoTerm a_46)
    { 
      ITermFactory termFactory = context.getFactory();
      context.push("make_unlock_method_0_3");
      Fail204:
      { 
        IStrategoTerm b_46 = null;
        IStrategoTerm c_46 = null;
        IStrategoTerm d_46 = null;
        IStrategoTerm e_46 = null;
        IStrategoTerm f_46 = null;
        IStrategoTerm g_46 = null;
        IStrategoTerm k_46 = null;
        IStrategoTerm v_46 = null;
        IStrategoTerm w_46 = null;
        if(term.getTermType() != IStrategoTerm.APPL || transform._consMethodSignature_2 != ((IStrategoAppl)term).getConstructor())
          break Fail204;
        IStrategoTerm arg172 = term.getSubterm(0);
        if(arg172.getTermType() != IStrategoTerm.APPL || transform._consId_1 != ((IStrategoAppl)arg172).getConstructor())
          break Fail204;
        b_46 = arg172.getSubterm(0);
        c_46 = term.getSubterm(1);
        k_46 = term;
        IStrategoTerm term192 = term;
        Success150:
        { 
          Fail205:
          { 
            e_46 = term;
            term = map_1_0.instance.invoke(context, c_46, pp_type_0_0.instance);
            if(term == null)
              break Fail205;
            term = map_1_0.instance.invoke(context, term, lifted125.instance);
            if(term == null)
              break Fail205;
            term = (IStrategoTerm)termFactory.makeListCons(termFactory.makeAppl(transform._consAnno_2, new IStrategoTerm[]{transform.constTypeName8, (IStrategoTerm)termFactory.makeListCons(termFactory.makeAppl(transform._consElemValPair_2, new IStrategoTerm[]{transform.constId18, termFactory.makeAppl(transform._consLit_1, new IStrategoTerm[]{termFactory.makeAppl(transform._consString_1, new IStrategoTerm[]{(IStrategoTerm)termFactory.makeListCons(termFactory.makeAppl(transform._consChars_1, new IStrategoTerm[]{b_46}), (IStrategoList)transform.constNil0)})})}), termFactory.makeListCons(transform.constElemValPair0, termFactory.makeListCons(termFactory.makeAppl(transform._consElemValPair_2, new IStrategoTerm[]{transform.constId17, termFactory.makeAppl(transform._consElemValArrayInit_1, new IStrategoTerm[]{term})}), (IStrategoList)transform.constNil0)))}), (IStrategoList)transform.constCons19);
            d_46 = term;
            Success151:
            { 
              Fail206:
              { 
                IStrategoTerm i_46 = null;
                i_46 = term;
                term = hashtable_keys_0_0.instance.invoke(context, z_45);
                if(term == null)
                  break Fail206;
                term = termFactory.makeTuple(e_46, term);
                term = elem_0_0.instance.invoke(context, term);
                if(term == null)
                  break Fail206;
                term = i_46;
                { 
                  term = hashtable_get_0_1.instance.invoke(context, z_45, e_46);
                  if(term == null)
                    break Fail205;
                  term = termFactory.makeAppl(transform._consExprStm_1, new IStrategoTerm[]{termFactory.makeAppl(transform._consInvoke_2, new IStrategoTerm[]{termFactory.makeAppl(transform._consMethod_1, new IStrategoTerm[]{termFactory.makeAppl(transform._consMethodName_1, new IStrategoTerm[]{termFactory.makeAppl(transform._consId_1, new IStrategoTerm[]{term})})}), transform.constCons1})});
                  f_46 = term;
                  if(true)
                    break Success151;
                }
              }
              term = transform.constNone0;
              f_46 = transform.constNone0;
            }
            term = gen_method_state_name_0_1.instance.invoke(context, e_46, a_46);
            if(term == null)
              break Fail205;
            term = termFactory.makeTuple((IStrategoTerm)termFactory.makeListCons(termFactory.makeAppl(transform._consExprStm_1, new IStrategoTerm[]{termFactory.makeAppl(transform._consInvoke_2, new IStrategoTerm[]{termFactory.makeAppl(transform._consMethod_1, new IStrategoTerm[]{termFactory.makeAppl(transform._consMethodName_2, new IStrategoTerm[]{termFactory.makeAppl(transform._consAmbName_1, new IStrategoTerm[]{termFactory.makeAppl(transform._consId_1, new IStrategoTerm[]{term})}), transform.constId31})}), transform.constCons7})}), (IStrategoList)transform.constNil0), (IStrategoTerm)termFactory.makeListCons(f_46, (IStrategoList)transform.constNil0), transform.constCons20);
            term = conc_0_0.instance.invoke(context, term);
            if(term == null)
              break Fail205;
            g_46 = term;
            if(true)
              break Success150;
          }
          term = term192;
          IStrategoTerm u_46 = null;
          u_46 = term;
          term = report_with_failure_0_1.instance.invoke(context, u_46, transform.const62);
          if(term == null)
            break Fail204;
        }
        w_46 = k_46;
        term = (IStrategoTerm)termFactory.makeListCons(transform.const63, termFactory.makeListCons(b_46, (IStrategoList)transform.constNil0));
        term = concat_strings_0_0.instance.invoke(context, term);
        if(term == null)
          break Fail204;
        v_46 = term;
        term = w_46;
        if(d_46 == null || g_46 == null)
          break Fail204;
        term = termFactory.makeAppl(transform._consMethodDec_2, new IStrategoTerm[]{termFactory.makeAppl(transform._consMethodDecHead_6, new IStrategoTerm[]{d_46, transform.constNone0, transform.constVoid0, termFactory.makeAppl(transform._consId_1, new IStrategoTerm[]{v_46}), (IStrategoTerm)termFactory.makeListCons(termFactory.makeAppl(transform._consParam_3, new IStrategoTerm[]{transform.constNil0, termFactory.makeAppl(transform._consTypeName_1, new IStrategoTerm[]{termFactory.makeAppl(transform._consId_1, new IStrategoTerm[]{y_45})}), transform.constId0}), (IStrategoList)transform.constNil0), transform.constNone0}), termFactory.makeAppl(transform._consBlock_1, new IStrategoTerm[]{g_46})});
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

    public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm z_46, IStrategoTerm a_47, IStrategoTerm b_47, IStrategoTerm c_47, IStrategoTerm d_47, IStrategoTerm ref_e_47, IStrategoTerm f_47, IStrategoTerm g_47, IStrategoTerm h_47)
    { 
      ITermFactory termFactory = context.getFactory();
      TermReference e_47 = new TermReference(ref_e_47);
      context.push("make_lock_method_0_9");
      Fail207:
      { 
        IStrategoTerm i_47 = null;
        IStrategoTerm j_47 = null;
        IStrategoTerm k_47 = null;
        IStrategoTerm l_47 = null;
        IStrategoTerm m_47 = null;
        IStrategoTerm n_47 = null;
        IStrategoTerm o_47 = null;
        IStrategoTerm p_47 = null;
        IStrategoTerm q_47 = null;
        TermReference r_47 = new TermReference();
        IStrategoTerm s_47 = null;
        IStrategoTerm t_47 = null;
        IStrategoTerm u_47 = null;
        IStrategoTerm v_47 = null;
        IStrategoTerm w_47 = null;
        IStrategoTerm h_48 = null;
        IStrategoTerm m_49 = null;
        IStrategoTerm n_49 = null;
        if(term.getTermType() != IStrategoTerm.APPL || transform._consMethodSignature_2 != ((IStrategoAppl)term).getConstructor())
          break Fail207;
        IStrategoTerm arg173 = term.getSubterm(0);
        if(arg173.getTermType() != IStrategoTerm.APPL || transform._consId_1 != ((IStrategoAppl)arg173).getConstructor())
          break Fail207;
        t_47 = arg173.getSubterm(0);
        u_47 = term.getSubterm(1);
        h_48 = term;
        IStrategoTerm term194 = term;
        Success152:
        { 
          Fail208:
          { 
            IStrategoTerm v_48 = null;
            IStrategoTerm c_49 = null;
            IStrategoTerm e_49 = null;
            IStrategoTerm f_49 = null;
            IStrategoTerm u_154 = null;
            if(r_47.value == null)
              r_47.value = term;
            else
              if(r_47.value != term && !r_47.value.match(term))
                break Fail208;
            Success153:
            { 
              Fail209:
              { 
                IStrategoTerm x_47 = null;
                x_47 = term;
                if(r_47.value == null)
                  break Fail209;
                term = termFactory.makeTuple(r_47.value, d_47);
                term = elem_0_0.instance.invoke(context, term);
                if(term == null)
                  break Fail209;
                term = x_47;
                { 
                  IStrategoTerm l_154 = null;
                  term = d_47;
                  lifted126 lifted1260 = new lifted126();
                  lifted1260.r_47 = r_47;
                  term = remove_all_1_0.instance.invoke(context, term, lifted1260);
                  if(term == null)
                    break Fail208;
                  i_47 = term;
                  term = hashtable_get_0_1.instance.invoke(context, g_47, r_47.value);
                  if(term == null)
                    break Fail208;
                  l_154 = term;
                  term = gen_source_location_ann_0_1.instance.invoke(context, l_154, transform.const64);
                  if(term == null)
                    break Fail208;
                  term = (IStrategoTerm)termFactory.makeListCons(term, (IStrategoList)transform.constNil0);
                  j_47 = term;
                  if(true)
                    break Success153;
                }
              }
              i_47 = transform.constNil0;
              term = transform.constNil0;
              j_47 = transform.constNil0;
            }
            Success154:
            { 
              Fail210:
              { 
                IStrategoTerm y_47 = null;
                y_47 = term;
                if(r_47.value == null)
                  break Fail210;
                term = termFactory.makeTuple(r_47.value, c_47);
                term = elem_0_0.instance.invoke(context, term);
                if(term == null)
                  break Fail210;
                term = y_47;
                { 
                  IStrategoTerm p_154 = null;
                  if(r_47.value == null)
                    break Fail208;
                  term = termFactory.makeTuple((IStrategoTerm)termFactory.makeListCons(r_47.value, (IStrategoList)transform.constNil0), i_47);
                  term = conc_0_0.instance.invoke(context, term);
                  if(term == null)
                    break Fail208;
                  k_47 = term;
                  term = hashtable_get_0_1.instance.invoke(context, f_47, r_47.value);
                  if(term == null)
                    break Fail208;
                  p_154 = term;
                  term = gen_source_location_ann_0_1.instance.invoke(context, p_154, transform.const65);
                  if(term == null)
                    break Fail208;
                  term = termFactory.makeTuple((IStrategoTerm)termFactory.makeListCons(term, (IStrategoList)transform.constNil0), j_47);
                  term = conc_0_0.instance.invoke(context, term);
                  if(term == null)
                    break Fail208;
                  o_47 = term;
                  if(true)
                    break Success154;
                }
              }
              k_47 = i_47;
              term = j_47;
              o_47 = j_47;
            }
            term = k_47;
            lifted127 lifted1270 = new lifted127();
            lifted1270.e_47 = e_47;
            term = map_1_0.instance.invoke(context, term, lifted1270);
            if(term == null)
              break Fail208;
            m_47 = term;
            Success155:
            { 
              Fail211:
              { 
                IStrategoTerm a_48 = null;
                IStrategoTerm q_48 = null;
                IStrategoTerm r_48 = null;
                a_48 = term;
                r_48 = term;
                term = hashtable_keys_0_0.instance.invoke(context, a_47);
                if(term == null)
                  break Fail211;
                q_48 = term;
                term = r_48;
                if(r_47.value == null)
                  break Fail211;
                term = termFactory.makeTuple(r_47.value, q_48);
                term = elem_0_0.instance.invoke(context, term);
                if(term == null)
                  break Fail211;
                term = a_48;
                { 
                  term = hashtable_get_0_1.instance.invoke(context, a_47, r_47.value);
                  if(term == null)
                    break Fail208;
                  term = termFactory.makeAppl(transform._consInvoke_2, new IStrategoTerm[]{termFactory.makeAppl(transform._consMethod_1, new IStrategoTerm[]{termFactory.makeAppl(transform._consMethodName_1, new IStrategoTerm[]{termFactory.makeAppl(transform._consId_1, new IStrategoTerm[]{term})})}), transform.constNil0});
                  term = termFactory.makeAppl(transform._consNot_1, new IStrategoTerm[]{term});
                  l_47 = term;
                  IStrategoList list0;
                  list0 = checkListTail(m_47);
                  if(list0 == null)
                    break Fail208;
                  term = (IStrategoTerm)termFactory.makeListCons(l_47, list0);
                  n_47 = term;
                  if(true)
                    break Success155;
                }
              }
              term = m_47;
              n_47 = m_47;
            }
            v_48 = term;
            term = reverse_0_0.instance.invoke(context, n_47);
            if(term == null)
              break Fail208;
            term = make_while_condition_0_1.instance.invoke(context, v_48, term);
            if(term == null)
              break Fail208;
            p_47 = term;
            Success156:
            { 
              Fail212:
              { 
                IStrategoTerm d_48 = null;
                IStrategoTerm w_48 = null;
                IStrategoTerm x_48 = null;
                d_48 = term;
                x_48 = term;
                term = hashtable_keys_0_0.instance.invoke(context, b_47);
                if(term == null)
                  break Fail212;
                w_48 = term;
                term = x_48;
                if(r_47.value == null)
                  break Fail212;
                term = termFactory.makeTuple(r_47.value, w_48);
                term = elem_0_0.instance.invoke(context, term);
                if(term == null)
                  break Fail212;
                term = d_48;
                { 
                  term = hashtable_get_0_1.instance.invoke(context, b_47, r_47.value);
                  if(term == null)
                    break Fail208;
                  term = termFactory.makeAppl(transform._consExprStm_1, new IStrategoTerm[]{termFactory.makeAppl(transform._consInvoke_2, new IStrategoTerm[]{termFactory.makeAppl(transform._consMethod_1, new IStrategoTerm[]{termFactory.makeAppl(transform._consMethodName_1, new IStrategoTerm[]{termFactory.makeAppl(transform._consId_1, new IStrategoTerm[]{term})})}), transform.constCons1})});
                  q_47 = term;
                  if(true)
                    break Success156;
                }
              }
              term = transform.constNone0;
              q_47 = transform.constNone0;
            }
            Success157:
            { 
              Fail213:
              { 
                IStrategoTerm f_48 = null;
                IStrategoTerm y_48 = null;
                IStrategoTerm z_48 = null;
                f_48 = term;
                z_48 = term;
                term = hashtable_keys_0_0.instance.invoke(context, h_47);
                if(term == null)
                  break Fail213;
                y_48 = term;
                term = z_48;
                if(r_47.value == null)
                  break Fail213;
                term = termFactory.makeTuple(r_47.value, y_48);
                term = elem_0_0.instance.invoke(context, term);
                if(term == null)
                  break Fail213;
                term = f_48;
                { 
                  IStrategoTerm t_154 = null;
                  term = hashtable_get_0_1.instance.invoke(context, h_47, r_47.value);
                  if(term == null)
                    break Fail208;
                  t_154 = term;
                  term = gen_source_location_ann_0_1.instance.invoke(context, t_154, transform.const66);
                  if(term == null)
                    break Fail208;
                  term = termFactory.makeTuple((IStrategoTerm)termFactory.makeListCons(term, (IStrategoList)transform.constNil0), o_47);
                  term = conc_0_0.instance.invoke(context, term);
                  if(term == null)
                    break Fail208;
                  v_47 = term;
                  if(true)
                    break Success157;
                }
              }
              term = o_47;
              v_47 = o_47;
            }
            e_49 = term;
            f_49 = transform.constCons24;
            u_154 = p_47;
            term = termFactory.makeAppl(transform._consWhile_2, new IStrategoTerm[]{u_154, termFactory.makeAppl(transform._consBlock_1, new IStrategoTerm[]{f_49})});
            c_49 = term;
            term = e_49;
            if(r_47.value == null)
              break Fail208;
            term = gen_method_state_name_0_1.instance.invoke(context, r_47.value, e_47.value);
            if(term == null)
              break Fail208;
            term = termFactory.makeTuple((IStrategoTerm)termFactory.makeListCons(c_49, (IStrategoList)transform.constNil0), (IStrategoTerm)termFactory.makeListCons(q_47, (IStrategoList)transform.constNil0), (IStrategoTerm)termFactory.makeListCons(termFactory.makeAppl(transform._consExprStm_1, new IStrategoTerm[]{termFactory.makeAppl(transform._consInvoke_2, new IStrategoTerm[]{termFactory.makeAppl(transform._consMethod_1, new IStrategoTerm[]{termFactory.makeAppl(transform._consMethodName_2, new IStrategoTerm[]{termFactory.makeAppl(transform._consAmbName_1, new IStrategoTerm[]{termFactory.makeAppl(transform._consId_1, new IStrategoTerm[]{term})}), transform.constId36})}), transform.constCons7})}), (IStrategoList)transform.constNil0));
            term = conc_0_0.instance.invoke(context, term);
            if(term == null)
              break Fail208;
            s_47 = term;
            term = map_1_0.instance.invoke(context, u_47, pp_type_0_0.instance);
            if(term == null)
              break Fail208;
            term = map_1_0.instance.invoke(context, term, lifted129.instance);
            if(term == null)
              break Fail208;
            term = termFactory.makeTuple((IStrategoTerm)termFactory.makeListCons(termFactory.makeAppl(transform._consAnno_2, new IStrategoTerm[]{transform.constTypeName10, (IStrategoTerm)termFactory.makeListCons(termFactory.makeAppl(transform._consElemValPair_2, new IStrategoTerm[]{transform.constId18, termFactory.makeAppl(transform._consLit_1, new IStrategoTerm[]{termFactory.makeAppl(transform._consString_1, new IStrategoTerm[]{(IStrategoTerm)termFactory.makeListCons(termFactory.makeAppl(transform._consChars_1, new IStrategoTerm[]{t_47}), (IStrategoList)transform.constNil0)})})}), termFactory.makeListCons(transform.constElemValPair0, termFactory.makeListCons(termFactory.makeAppl(transform._consElemValPair_2, new IStrategoTerm[]{transform.constId17, termFactory.makeAppl(transform._consElemValArrayInit_1, new IStrategoTerm[]{term})}), (IStrategoList)transform.constNil0)))}), (IStrategoList)transform.constCons19), v_47);
            term = conc_0_0.instance.invoke(context, term);
            if(term == null)
              break Fail208;
            w_47 = term;
            if(true)
              break Success152;
          }
          term = term194;
          IStrategoTerm l_49 = null;
          l_49 = term;
          term = report_with_failure_0_1.instance.invoke(context, l_49, transform.const72);
          if(term == null)
            break Fail207;
        }
        n_49 = h_48;
        term = (IStrategoTerm)termFactory.makeListCons(transform.const73, termFactory.makeListCons(t_47, (IStrategoList)transform.constNil0));
        term = concat_strings_0_0.instance.invoke(context, term);
        if(term == null)
          break Fail207;
        m_49 = term;
        term = n_49;
        if(w_47 == null || s_47 == null)
          break Fail207;
        term = termFactory.makeAppl(transform._consMethodDec_2, new IStrategoTerm[]{termFactory.makeAppl(transform._consMethodDecHead_6, new IStrategoTerm[]{w_47, transform.constNone0, transform.constVoid0, termFactory.makeAppl(transform._consId_1, new IStrategoTerm[]{m_49}), (IStrategoTerm)termFactory.makeListCons(termFactory.makeAppl(transform._consParam_3, new IStrategoTerm[]{transform.constNil0, termFactory.makeAppl(transform._consTypeName_1, new IStrategoTerm[]{termFactory.makeAppl(transform._consId_1, new IStrategoTerm[]{z_46})}), transform.constId0}), (IStrategoList)transform.constNil0), transform.constNone0}), termFactory.makeAppl(transform._consBlock_1, new IStrategoTerm[]{s_47})});
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

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm q_49, IStrategoTerm r_49, IStrategoTerm s_49, IStrategoTerm t_49)
    { 
      ITermFactory termFactory = context.getFactory();
      context.push("fillMethodMaps_0_4");
      Fail214:
      { 
        IStrategoTerm u_49 = null;
        IStrategoTerm v_49 = null;
        IStrategoTerm w_49 = null;
        IStrategoTerm x_49 = null;
        if(term.getTermType() != IStrategoTerm.APPL || transform._consMethodAdditions_4 != ((IStrategoAppl)term).getConstructor())
          break Fail214;
        w_49 = term.getSubterm(0);
        u_49 = term.getSubterm(1);
        v_49 = term.getSubterm(2);
        x_49 = term.getSubterm(3);
        IStrategoTerm term200 = term;
        Success158:
        { 
          Fail215:
          { 
            IStrategoTerm term201 = term;
            Success159:
            { 
              Fail216:
              { 
                IStrategoTerm y_49 = null;
                y_49 = term;
                IStrategoTerm term202 = term;
                Success160:
                { 
                  Fail217:
                  { 
                    term = termFactory.makeTuple(u_49, transform.constNone0);
                    term = equal_0_0.instance.invoke(context, term);
                    if(term == null)
                      break Fail217;
                    { 
                      if(true)
                        break Fail216;
                      if(true)
                        break Success160;
                    }
                  }
                  term = term202;
                }
                term = y_49;
                { 
                  IStrategoTerm h_50 = null;
                  IStrategoTerm z_49 = null;
                  h_50 = q_49;
                  term = u_49;
                  if(term.getTermType() != IStrategoTerm.APPL || transform._consSome_1 != ((IStrategoAppl)term).getConstructor())
                    break Fail215;
                  IStrategoTerm arg174 = term.getSubterm(0);
                  if(arg174.getTermType() != IStrategoTerm.APPL || transform._consRequires_1 != ((IStrategoAppl)arg174).getConstructor())
                    break Fail215;
                  z_49 = arg174.getSubterm(0);
                  term = hashtable_put_0_2.instance.invoke(context, h_50, w_49, z_49);
                  if(term == null)
                    break Fail215;
                  if(true)
                    break Success159;
                }
              }
              term = term201;
            }
            IStrategoTerm term203 = term;
            Success161:
            { 
              Fail218:
              { 
                IStrategoTerm a_50 = null;
                a_50 = term;
                IStrategoTerm term204 = term;
                Success162:
                { 
                  Fail219:
                  { 
                    term = termFactory.makeTuple(v_49, transform.constNone0);
                    term = equal_0_0.instance.invoke(context, term);
                    if(term == null)
                      break Fail219;
                    { 
                      if(true)
                        break Fail218;
                      if(true)
                        break Success162;
                    }
                  }
                  term = term204;
                }
                term = a_50;
                { 
                  IStrategoTerm j_50 = null;
                  IStrategoTerm b_50 = null;
                  j_50 = s_49;
                  term = v_49;
                  if(term.getTermType() != IStrategoTerm.APPL || transform._consSome_1 != ((IStrategoAppl)term).getConstructor())
                    break Fail215;
                  IStrategoTerm arg175 = term.getSubterm(0);
                  if(arg175.getTermType() != IStrategoTerm.APPL || transform._consOnEntry_1 != ((IStrategoAppl)arg175).getConstructor())
                    break Fail215;
                  b_50 = arg175.getSubterm(0);
                  term = hashtable_put_0_2.instance.invoke(context, j_50, w_49, b_50);
                  if(term == null)
                    break Fail215;
                  if(true)
                    break Success161;
                }
              }
              term = term203;
            }
            IStrategoTerm term205 = term;
            Success163:
            { 
              Fail220:
              { 
                IStrategoTerm c_50 = null;
                c_50 = term;
                IStrategoTerm term206 = term;
                Success164:
                { 
                  Fail221:
                  { 
                    term = termFactory.makeTuple(x_49, transform.constNone0);
                    term = equal_0_0.instance.invoke(context, term);
                    if(term == null)
                      break Fail221;
                    { 
                      if(true)
                        break Fail220;
                      if(true)
                        break Success164;
                    }
                  }
                  term = term206;
                }
                term = c_50;
                { 
                  IStrategoTerm l_50 = null;
                  IStrategoTerm e_50 = null;
                  l_50 = r_49;
                  term = x_49;
                  if(term.getTermType() != IStrategoTerm.APPL || transform._consSome_1 != ((IStrategoAppl)term).getConstructor())
                    break Fail215;
                  IStrategoTerm arg176 = term.getSubterm(0);
                  if(arg176.getTermType() != IStrategoTerm.APPL || transform._consOnExit_1 != ((IStrategoAppl)arg176).getConstructor())
                    break Fail215;
                  e_50 = arg176.getSubterm(0);
                  term = hashtable_put_0_2.instance.invoke(context, l_50, w_49, e_50);
                  if(term == null)
                    break Fail215;
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
          IStrategoTerm o_50 = null;
          o_50 = term;
          term = report_with_failure_0_1.instance.invoke(context, o_50, transform.const74);
          if(term == null)
            break Fail214;
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
      Fail222:
      { 
        IStrategoTerm r_50 = null;
        IStrategoTerm s_50 = null;
        IStrategoTerm v_50 = null;
        if(term.getTermType() != IStrategoTerm.APPL || transform._consConditionDec_1 != ((IStrategoAppl)term).getConstructor())
          break Fail222;
        r_50 = term.getSubterm(0);
        v_50 = term;
        IStrategoTerm term207 = term;
        Success165:
        { 
          Fail223:
          { 
            term = map_1_0.instance.invoke(context, r_50, lifted130.instance);
            if(term == null)
              break Fail223;
            s_50 = term;
            if(true)
              break Success165;
          }
          term = term207;
          IStrategoTerm x_50 = null;
          x_50 = term;
          term = report_with_failure_0_1.instance.invoke(context, x_50, transform.const76);
          if(term == null)
            break Fail222;
        }
        term = v_50;
        if(s_50 == null)
          break Fail222;
        term = s_50;
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
      Fail224:
      { 
        IStrategoTerm d_51 = null;
        IStrategoTerm e_51 = null;
        IStrategoTerm i_51 = null;
        d_51 = term;
        i_51 = term;
        IStrategoTerm term208 = term;
        Success166:
        { 
          Fail225:
          { 
            term = retain_all_1_0.instance.invoke(context, d_51, lifted131.instance);
            if(term == null)
              break Fail225;
            e_51 = term;
            if(true)
              break Success166;
          }
          term = term208;
          IStrategoTerm k_51 = null;
          k_51 = term;
          term = report_with_failure_0_1.instance.invoke(context, k_51, transform.const78);
          if(term == null)
            break Fail224;
        }
        term = i_51;
        if(e_51 == null)
          break Fail224;
        term = map_1_0.instance.invoke(context, e_51, lifted132.instance);
        if(term == null)
          break Fail224;
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
      Fail226:
      { 
        IStrategoTerm term209 = term;
        IStrategoConstructor cons8 = term.getTermType() == IStrategoTerm.APPL ? ((IStrategoAppl)term).getConstructor() : null;
        Success167:
        { 
          if(cons8 == transform._consSelfex_1)
          { 
            Fail227:
            { 
              IStrategoTerm m_51 = null;
              m_51 = term.getSubterm(0);
              term = m_51;
              if(true)
                break Success167;
            }
            term = term209;
          }
          Success168:
          { 
            if(cons8 == transform._consMutex_1)
            { 
              Fail228:
              { 
                IStrategoTerm l_51 = null;
                l_51 = term.getSubterm(0);
                term = l_51;
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
              break Fail226;
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
      Fail229:
      { 
        if(term.getTermType() != IStrategoTerm.APPL || transform._consFieldDec_3 != ((IStrategoAppl)term).getConstructor())
          break Fail229;
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
      Fail230:
      { 
        IStrategoTerm f_51 = null;
        IStrategoTerm g_51 = null;
        IStrategoTerm h_51 = null;
        if(term.getTermType() != IStrategoTerm.APPL || transform._consFieldDec_3 != ((IStrategoAppl)term).getConstructor())
          break Fail230;
        f_51 = term.getSubterm(0);
        g_51 = term.getSubterm(1);
        h_51 = term.getSubterm(2);
        IStrategoList list1;
        list1 = checkListTail(f_51);
        if(list1 == null)
          break Fail230;
        term = termFactory.makeAppl(transform._consFieldDec_3, new IStrategoTerm[]{(IStrategoTerm)termFactory.makeListCons(transform.constPrivate0, termFactory.makeListCons(transform.constMarkerAnno1, list1)), g_51, h_51});
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
      Fail231:
      { 
        IStrategoTerm t_50 = null;
        IStrategoTerm u_50 = null;
        if(term.getTermType() != IStrategoTerm.APPL || transform._consAssign_2 != ((IStrategoAppl)term).getConstructor())
          break Fail231;
        IStrategoTerm arg177 = term.getSubterm(0);
        if(arg177.getTermType() != IStrategoTerm.APPL || transform._consExprName_1 != ((IStrategoAppl)arg177).getConstructor())
          break Fail231;
        t_50 = arg177.getSubterm(0);
        u_50 = term.getSubterm(1);
        term = termFactory.makeAppl(transform._consFieldDec_3, new IStrategoTerm[]{transform.constCons26, transform.constBoolean0, (IStrategoTerm)termFactory.makeListCons(termFactory.makeAppl(transform._consVarDec_2, new IStrategoTerm[]{t_50, u_50}), (IStrategoList)transform.constNil0)});
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
      Fail232:
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
    TermReference e_47;

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      ITermFactory termFactory = context.getFactory();
      Fail233:
      { 
        IStrategoTerm z_47 = null;
        z_47 = term;
        term = gen_method_state_name_0_1.instance.invoke(context, z_47, e_47.value);
        if(term == null)
          break Fail233;
        term = termFactory.makeAppl(transform._consInvoke_2, new IStrategoTerm[]{transform.constMethod4, (IStrategoTerm)termFactory.makeListCons(termFactory.makeAppl(transform._consExprName_1, new IStrategoTerm[]{termFactory.makeAppl(transform._consId_1, new IStrategoTerm[]{term})}), (IStrategoList)transform.constNil0)});
        if(true)
          return term;
      }
      return null;
    }
  }

  @SuppressWarnings("all") private static final class lifted126 extends Strategy 
  { 
    TermReference r_47;

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      Fail234:
      { 
        term = equal_0_1.instance.invoke(context, term, r_47.value);
        if(term == null)
          break Fail234;
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
      Fail235:
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
    TermReference v_42;

    TermReference x_42;

    TermReference w_42;

    TermReference y_42;

    TermReference c_43;

    TermReference d_43;

    TermReference l_43;

    TermReference a_43;

    TermReference b_43;

    TermReference g_43;

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      Fail236:
      { 
        term = make_lock_and_unlock_methods_0_10.instance.invokeDynamic(context, term, NO_STRATEGIES, new IStrategoTerm[]{v_42.value, x_42.value, w_42.value, y_42.value, c_43.value, d_43.value, l_43.value, a_43.value, b_43.value, g_43.value});
        if(term == null)
          break Fail236;
        if(true)
          return term;
      }
      return null;
    }
  }

  @SuppressWarnings("all") private static final class lifted122 extends Strategy 
  { 
    TermReference j_43;

    TermReference v_42;

    TermReference x_42;

    TermReference l_43;

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      Fail237:
      { 
        term = make_on_exit_method_0_4.instance.invoke(context, term, j_43.value, v_42.value, x_42.value, l_43.value);
        if(term == null)
          break Fail237;
        if(true)
          return term;
      }
      return null;
    }
  }

  @SuppressWarnings("all") private static final class lifted121 extends Strategy 
  { 
    TermReference k_43;

    TermReference v_42;

    TermReference y_42;

    TermReference l_43;

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      Fail238:
      { 
        term = make_on_entry_method_0_4.instance.invoke(context, term, k_43.value, v_42.value, y_42.value, l_43.value);
        if(term == null)
          break Fail238;
        if(true)
          return term;
      }
      return null;
    }
  }

  @SuppressWarnings("all") private static final class lifted120 extends Strategy 
  { 
    TermReference i_43;

    TermReference w_42;

    TermReference l_43;

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      Fail239:
      { 
        term = make_requires_method_0_3.instance.invoke(context, term, i_43.value, w_42.value, l_43.value);
        if(term == null)
          break Fail239;
        if(true)
          return term;
      }
      return null;
    }
  }

  @SuppressWarnings("all") private static final class lifted119 extends Strategy 
  { 
    TermReference l_43;

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      Fail240:
      { 
        term = gen_method_state_0_1.instance.invoke(context, term, l_43.value);
        if(term == null)
          break Fail240;
        if(true)
          return term;
      }
      return null;
    }
  }

  @SuppressWarnings("all") private static final class lifted117 extends Strategy 
  { 
    TermReference g_43;

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      Fail241:
      { 
        IStrategoTerm p_43 = null;
        if(term.getTermType() != IStrategoTerm.APPL || transform._consMethodAdditions_4 != ((IStrategoAppl)term).getConstructor())
          break Fail241;
        p_43 = term.getSubterm(0);
        if(g_43.value == null)
          break Fail241;
        term = hashtable_put_0_2.instance.invoke(context, g_43.value, p_43, p_43);
        if(term == null)
          break Fail241;
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
      Fail242:
      { 
        if(term.getTermType() != IStrategoTerm.APPL || transform._consMethodAdditions_4 != ((IStrategoAppl)term).getConstructor())
          break Fail242;
        if(true)
          return term;
      }
      return null;
    }
  }

  @SuppressWarnings("all") private static final class lifted115 extends Strategy 
  { 
    TermReference l_43;

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      Fail243:
      { 
        IStrategoTerm o_43 = null;
        IStrategoTerm m_44 = null;
        o_43 = term;
        if(l_43.value == null)
          break Fail243;
        term = l_43.value;
        m_44 = l_43.value;
        if(l_43.value == null)
          break Fail243;
        term = hashtable_keys_0_0.instance.invoke(context, l_43.value);
        if(term == null)
          break Fail243;
        term = length_0_0.instance.invoke(context, term);
        if(term == null)
          break Fail243;
        term = hashtable_put_0_2.instance.invoke(context, m_44, o_43, term);
        if(term == null)
          break Fail243;
        if(true)
          return term;
      }
      return null;
    }
  }

  @SuppressWarnings("all") private static final class lifted114 extends Strategy 
  { 
    TermReference b_43;

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      Fail244:
      { 
        IStrategoTerm n_43 = null;
        n_43 = term;
        if(b_43.value == null)
          break Fail244;
        term = hashtable_put_0_2.instance.invoke(context, b_43.value, n_43, n_43);
        if(term == null)
          break Fail244;
        if(true)
          return term;
      }
      return null;
    }
  }

  @SuppressWarnings("all") private static final class lifted113 extends Strategy 
  { 
    TermReference a_43;

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      Fail245:
      { 
        IStrategoTerm m_43 = null;
        m_43 = term;
        if(a_43.value == null)
          break Fail245;
        term = hashtable_put_0_2.instance.invoke(context, a_43.value, m_43, m_43);
        if(term == null)
          break Fail245;
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
      Fail246:
      { 
        if(term.getTermType() != IStrategoTerm.APPL || transform._consMutex_1 != ((IStrategoAppl)term).getConstructor())
          break Fail246;
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
      Fail247:
      { 
        if(term.getTermType() != IStrategoTerm.APPL || transform._consSelfex_1 != ((IStrategoAppl)term).getConstructor())
          break Fail247;
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
      Fail248:
      { 
        if(term.getTermType() != IStrategoTerm.APPL || transform._consConditionDec_1 != ((IStrategoAppl)term).getConstructor())
          break Fail248;
        if(true)
          return term;
      }
      return null;
    }
  }

  @SuppressWarnings("all") private static final class lifted118 extends Strategy 
  { 
    TermReference i_43;

    TermReference j_43;

    TermReference k_43;

    TermReference l_43;

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      Fail249:
      { 
        term = fill$Method$Maps_0_4.instance.invoke(context, term, i_43.value, j_43.value, k_43.value, l_43.value);
        if(term == null)
          break Fail249;
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

  @SuppressWarnings("all") private static final class lifted108 extends Strategy 
  { 
    public static final lifted108 instance = new lifted108();

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      Fail251:
      { 
        if(term.getTermType() != IStrategoTerm.APPL || transform._consCoordinatorDec_2 != ((IStrategoAppl)term).getConstructor())
          break Fail251;
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
      Fail252:
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
      Fail253:
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
      Fail254:
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
    TermReference f_33;

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      Fail255:
      { 
        lifted101 lifted1011 = new lifted101();
        lifted100 lifted1000 = new lifted100();
        lifted1011.f_33 = f_33;
        lifted1000.f_33 = f_33;
        term = or_2_0.instance.invoke(context, term, lifted1000, lifted1011);
        if(term == null)
          break Fail255;
        if(true)
          return term;
      }
      return null;
    }
  }

  @SuppressWarnings("all") private static final class lifted101 extends Strategy 
  { 
    TermReference f_33;

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      Fail256:
      { 
        if(term.getTermType() != IStrategoTerm.APPL || transform._consPostDecr_1 != ((IStrategoAppl)term).getConstructor())
          break Fail256;
        if(f_33.value == null)
          f_33.value = term.getSubterm(0);
        else
          if(f_33.value != term.getSubterm(0) && !f_33.value.match(term.getSubterm(0)))
            break Fail256;
        if(true)
          return term;
      }
      return null;
    }
  }

  @SuppressWarnings("all") private static final class lifted100 extends Strategy 
  { 
    TermReference f_33;

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      Fail257:
      { 
        if(term.getTermType() != IStrategoTerm.APPL || transform._consPostIncr_1 != ((IStrategoAppl)term).getConstructor())
          break Fail257;
        if(f_33.value == null)
          f_33.value = term.getSubterm(0);
        else
          if(f_33.value != term.getSubterm(0) && !f_33.value.match(term.getSubterm(0)))
            break Fail257;
        if(true)
          return term;
      }
      return null;
    }
  }

  @SuppressWarnings("all") private static final class lifted96 extends Strategy 
  { 
    TermReference f_33;

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      Fail258:
      { 
        lifted98 lifted980 = new lifted98();
        lifted97 lifted970 = new lifted97();
        lifted980.f_33 = f_33;
        lifted970.f_33 = f_33;
        term = or_2_0.instance.invoke(context, term, lifted970, lifted980);
        if(term == null)
          break Fail258;
        if(true)
          return term;
      }
      return null;
    }
  }

  @SuppressWarnings("all") private static final class lifted98 extends Strategy 
  { 
    TermReference f_33;

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      Fail259:
      { 
        if(term.getTermType() != IStrategoTerm.APPL || transform._consPreDecr_1 != ((IStrategoAppl)term).getConstructor())
          break Fail259;
        if(f_33.value == null)
          f_33.value = term.getSubterm(0);
        else
          if(f_33.value != term.getSubterm(0) && !f_33.value.match(term.getSubterm(0)))
            break Fail259;
        if(true)
          return term;
      }
      return null;
    }
  }

  @SuppressWarnings("all") private static final class lifted97 extends Strategy 
  { 
    TermReference f_33;

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      Fail260:
      { 
        if(term.getTermType() != IStrategoTerm.APPL || transform._consPreIncr_1 != ((IStrategoAppl)term).getConstructor())
          break Fail260;
        if(f_33.value == null)
          f_33.value = term.getSubterm(0);
        else
          if(f_33.value != term.getSubterm(0) && !f_33.value.match(term.getSubterm(0)))
            break Fail260;
        if(true)
          return term;
      }
      return null;
    }
  }

  @SuppressWarnings("all") private static final class lifted95 extends Strategy 
  { 
    TermReference e_34;

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      Fail261:
      { 
        if(term.getTermType() != IStrategoTerm.APPL || transform._consURightShift_2 != ((IStrategoAppl)term).getConstructor())
          break Fail261;
        if(e_34.value == null)
          e_34.value = term.getSubterm(0);
        else
          if(e_34.value != term.getSubterm(0) && !e_34.value.match(term.getSubterm(0)))
            break Fail261;
        if(true)
          return term;
      }
      return null;
    }
  }

  @SuppressWarnings("all") private static final class lifted92 extends Strategy 
  { 
    TermReference e_34;

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      Fail262:
      { 
        lifted94 lifted940 = new lifted94();
        lifted93 lifted930 = new lifted93();
        lifted940.e_34 = e_34;
        lifted930.e_34 = e_34;
        term = or_2_0.instance.invoke(context, term, lifted930, lifted940);
        if(term == null)
          break Fail262;
        if(true)
          return term;
      }
      return null;
    }
  }

  @SuppressWarnings("all") private static final class lifted94 extends Strategy 
  { 
    TermReference e_34;

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      Fail263:
      { 
        if(term.getTermType() != IStrategoTerm.APPL || transform._consRightShift_2 != ((IStrategoAppl)term).getConstructor())
          break Fail263;
        if(e_34.value == null)
          e_34.value = term.getSubterm(0);
        else
          if(e_34.value != term.getSubterm(0) && !e_34.value.match(term.getSubterm(0)))
            break Fail263;
        if(true)
          return term;
      }
      return null;
    }
  }

  @SuppressWarnings("all") private static final class lifted93 extends Strategy 
  { 
    TermReference e_34;

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      Fail264:
      { 
        if(term.getTermType() != IStrategoTerm.APPL || transform._consLeftShift_2 != ((IStrategoAppl)term).getConstructor())
          break Fail264;
        if(e_34.value == null)
          e_34.value = term.getSubterm(0);
        else
          if(e_34.value != term.getSubterm(0) && !e_34.value.match(term.getSubterm(0)))
            break Fail264;
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
      Fail265:
      { 
        if(term.getTermType() != IStrategoTerm.APPL || transform._consRemain_2 != ((IStrategoAppl)term).getConstructor())
          break Fail265;
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
      Fail266:
      { 
        term = or_2_0.instance.invoke(context, term, lifted85.instance, lifted88.instance);
        if(term == null)
          break Fail266;
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
      Fail267:
      { 
        term = or_2_0.instance.invoke(context, term, lifted89.instance, lifted90.instance);
        if(term == null)
          break Fail267;
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
      Fail268:
      { 
        if(term.getTermType() != IStrategoTerm.APPL || transform._consDiv_2 != ((IStrategoAppl)term).getConstructor())
          break Fail268;
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
      Fail269:
      { 
        if(term.getTermType() != IStrategoTerm.APPL || transform._consMul_2 != ((IStrategoAppl)term).getConstructor())
          break Fail269;
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
      Fail270:
      { 
        term = or_2_0.instance.invoke(context, term, lifted86.instance, lifted87.instance);
        if(term == null)
          break Fail270;
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
      Fail271:
      { 
        if(term.getTermType() != IStrategoTerm.APPL || transform._consMinus_2 != ((IStrategoAppl)term).getConstructor())
          break Fail271;
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
      Fail272:
      { 
        if(term.getTermType() != IStrategoTerm.APPL || transform._consPlus_2 != ((IStrategoAppl)term).getConstructor())
          break Fail272;
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
      Fail273:
      { 
        if(term.getTermType() != IStrategoTerm.APPL || transform._consMinus_1 != ((IStrategoAppl)term).getConstructor())
          break Fail273;
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
      Fail274:
      { 
        if(term.getTermType() != IStrategoTerm.APPL || transform._consPlus_1 != ((IStrategoAppl)term).getConstructor())
          break Fail274;
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
      Fail275:
      { 
        if(term.getTermType() != IStrategoTerm.APPL || transform._consFloat_0 != ((IStrategoAppl)term).getConstructor())
          break Fail275;
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

  @SuppressWarnings("all") private static final class lifted79 extends Strategy 
  { 
    public static final lifted79 instance = new lifted79();

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      Fail277:
      { 
        if(term.getTermType() != IStrategoTerm.APPL || transform._consBool_1 != ((IStrategoAppl)term).getConstructor())
          break Fail277;
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
      Fail278:
      { 
        if(term.getTermType() != IStrategoTerm.APPL || transform._consBoolean_0 != ((IStrategoAppl)term).getConstructor())
          break Fail278;
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
      Fail279:
      { 
        if(term.getTermType() != IStrategoTerm.APPL || transform._consFloat_1 != ((IStrategoAppl)term).getConstructor())
          break Fail279;
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
      Fail280:
      { 
        if(term.getTermType() != IStrategoTerm.APPL || transform._consFloat_0 != ((IStrategoAppl)term).getConstructor())
          break Fail280;
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
      Fail281:
      { 
        if(term.getTermType() != IStrategoTerm.APPL || transform._consChar_1 != ((IStrategoAppl)term).getConstructor())
          break Fail281;
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
      Fail282:
      { 
        if(term.getTermType() != IStrategoTerm.APPL || transform._consChar_0 != ((IStrategoAppl)term).getConstructor())
          break Fail282;
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
      Fail283:
      { 
        if(term.getTermType() != IStrategoTerm.APPL || transform._consBool_1 != ((IStrategoAppl)term).getConstructor())
          break Fail283;
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
      Fail284:
      { 
        if(term.getTermType() != IStrategoTerm.APPL || transform._consBoolean_0 != ((IStrategoAppl)term).getConstructor())
          break Fail284;
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
      Fail285:
      { 
        if(term.getTermType() != IStrategoTerm.APPL || transform._consChar_1 != ((IStrategoAppl)term).getConstructor())
          break Fail285;
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
      Fail286:
      { 
        if(term.getTermType() != IStrategoTerm.APPL || transform._consChar_0 != ((IStrategoAppl)term).getConstructor())
          break Fail286;
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
      Fail287:
      { 
        if(term.getTermType() != IStrategoTerm.APPL || transform._consFloat_1 != ((IStrategoAppl)term).getConstructor())
          break Fail287;
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
      Fail288:
      { 
        if(term.getTermType() != IStrategoTerm.APPL || transform._consFloat_0 != ((IStrategoAppl)term).getConstructor())
          break Fail288;
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
      Fail289:
      { 
        if(term.getTermType() != IStrategoTerm.APPL || transform._consFloat_1 != ((IStrategoAppl)term).getConstructor())
          break Fail289;
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
      Fail290:
      { 
        if(term.getTermType() != IStrategoTerm.APPL || transform._consFloat_0 != ((IStrategoAppl)term).getConstructor())
          break Fail290;
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
      Fail291:
      { 
        if(term.getTermType() != IStrategoTerm.APPL || transform._consBool_1 != ((IStrategoAppl)term).getConstructor())
          break Fail291;
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
      Fail292:
      { 
        if(term.getTermType() != IStrategoTerm.APPL || transform._consBoolean_0 != ((IStrategoAppl)term).getConstructor())
          break Fail292;
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
      Fail293:
      { 
        if(term.getTermType() != IStrategoTerm.APPL || transform._consBool_1 != ((IStrategoAppl)term).getConstructor())
          break Fail293;
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
      Fail294:
      { 
        if(term.getTermType() != IStrategoTerm.APPL || transform._consBoolean_0 != ((IStrategoAppl)term).getConstructor())
          break Fail294;
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
      Fail295:
      { 
        if(term.getTermType() != IStrategoTerm.APPL || transform._consFloat_1 != ((IStrategoAppl)term).getConstructor())
          break Fail295;
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
      Fail296:
      { 
        if(term.getTermType() != IStrategoTerm.APPL || transform._consFloat_0 != ((IStrategoAppl)term).getConstructor())
          break Fail296;
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
      Fail297:
      { 
        if(term.getTermType() != IStrategoTerm.APPL || transform._consChar_1 != ((IStrategoAppl)term).getConstructor())
          break Fail297;
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
      Fail298:
      { 
        if(term.getTermType() != IStrategoTerm.APPL || transform._consChar_0 != ((IStrategoAppl)term).getConstructor())
          break Fail298;
        if(true)
          return term;
      }
      return null;
    }
  }

  @SuppressWarnings("all") private static final class lifted57 extends Strategy 
  { 
    TermReference s_21;

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      Fail299:
      { 
        if(term.getTermType() != IStrategoTerm.APPL || transform._consVarArityParam_3 != ((IStrategoAppl)term).getConstructor())
          break Fail299;
        IStrategoTerm arg60 = term.getSubterm(2);
        if(arg60.getTermType() != IStrategoTerm.APPL || transform._consId_1 != ((IStrategoAppl)arg60).getConstructor())
          break Fail299;
        if(s_21.value == null)
          s_21.value = arg60.getSubterm(0);
        else
          if(s_21.value != arg60.getSubterm(0) && !s_21.value.match(arg60.getSubterm(0)))
            break Fail299;
        if(true)
          return term;
      }
      return null;
    }
  }

  @SuppressWarnings("all") private static final class lifted56 extends Strategy 
  { 
    TermReference s_21;

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      Fail300:
      { 
        if(term.getTermType() != IStrategoTerm.APPL || transform._consParam_3 != ((IStrategoAppl)term).getConstructor())
          break Fail300;
        IStrategoTerm arg57 = term.getSubterm(2);
        if(arg57.getTermType() != IStrategoTerm.APPL || transform._consId_1 != ((IStrategoAppl)arg57).getConstructor())
          break Fail300;
        if(s_21.value == null)
          s_21.value = arg57.getSubterm(0);
        else
          if(s_21.value != arg57.getSubterm(0) && !s_21.value.match(arg57.getSubterm(0)))
            break Fail300;
        if(true)
          return term;
      }
      return null;
    }
  }

  @SuppressWarnings("all") private static final class lifted54 extends Strategy 
  { 
    TermReference m_21;

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      Fail301:
      { 
        if(m_21.value == null)
          break Fail301;
        term = fetch_1_0.instance.invoke(context, m_21.value, lifted55.instance);
        if(term == null)
          break Fail301;
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
      Fail302:
      { 
        if(term.getTermType() != IStrategoTerm.APPL || transform._consAnno_2 != ((IStrategoAppl)term).getConstructor())
          break Fail302;
        IStrategoTerm arg51 = term.getSubterm(0);
        if(arg51.getTermType() != IStrategoTerm.APPL || transform._consTypeName_1 != ((IStrategoAppl)arg51).getConstructor())
          break Fail302;
        IStrategoTerm arg52 = arg51.getSubterm(0);
        if(arg52.getTermType() != IStrategoTerm.APPL || transform._consId_1 != ((IStrategoAppl)arg52).getConstructor())
          break Fail302;
        IStrategoTerm arg53 = arg52.getSubterm(0);
        if(arg53.getTermType() != IStrategoTerm.STRING || !"COOLOnExit".equals(((IStrategoString)arg53).stringValue()))
          break Fail302;
        if(true)
          return term;
      }
      return null;
    }
  }

  @SuppressWarnings("all") private static final class lifted52 extends Strategy 
  { 
    TermReference m_21;

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      Fail303:
      { 
        if(m_21.value == null)
          break Fail303;
        term = fetch_1_0.instance.invoke(context, m_21.value, lifted53.instance);
        if(term == null)
          break Fail303;
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
      Fail304:
      { 
        if(term.getTermType() != IStrategoTerm.APPL || transform._consAnno_2 != ((IStrategoAppl)term).getConstructor())
          break Fail304;
        IStrategoTerm arg47 = term.getSubterm(0);
        if(arg47.getTermType() != IStrategoTerm.APPL || transform._consTypeName_1 != ((IStrategoAppl)arg47).getConstructor())
          break Fail304;
        IStrategoTerm arg48 = arg47.getSubterm(0);
        if(arg48.getTermType() != IStrategoTerm.APPL || transform._consId_1 != ((IStrategoAppl)arg48).getConstructor())
          break Fail304;
        IStrategoTerm arg49 = arg48.getSubterm(0);
        if(arg49.getTermType() != IStrategoTerm.STRING || !"COOLOnEntry".equals(((IStrategoString)arg49).stringValue()))
          break Fail304;
        if(true)
          return term;
      }
      return null;
    }
  }

  @SuppressWarnings("all") private static final class lifted51 extends Strategy 
  { 
    TermReference m_21;

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      Fail305:
      { 
        if(term.getTermType() != IStrategoTerm.APPL || transform._consDeprMethodDecHead_7 != ((IStrategoAppl)term).getConstructor())
          break Fail305;
        if(m_21.value == null)
          m_21.value = term.getSubterm(0);
        else
          if(m_21.value != term.getSubterm(0) && !m_21.value.match(term.getSubterm(0)))
            break Fail305;
        if(true)
          return term;
      }
      return null;
    }
  }

  @SuppressWarnings("all") private static final class lifted50 extends Strategy 
  { 
    TermReference m_21;

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      Fail306:
      { 
        if(term.getTermType() != IStrategoTerm.APPL || transform._consMethodDecHead_6 != ((IStrategoAppl)term).getConstructor())
          break Fail306;
        if(m_21.value == null)
          m_21.value = term.getSubterm(0);
        else
          if(m_21.value != term.getSubterm(0) && !m_21.value.match(term.getSubterm(0)))
            break Fail306;
        if(true)
          return term;
      }
      return null;
    }
  }

  @SuppressWarnings("all") private static final class add_external_impl_0_9_fragment_1 extends Strategy 
  { 
    TermReference s_10;

    TermReference t_10;

    TermReference v_10;

    TermReference u_10;

    TermReference w_10;

    TermReference x_10;

    TermReference y_10;

    TermReference z_10;

    TermReference a_11;

    TermReference b_11;

    TermReference c_11;

    TermReference d_11;

    TermReference e_11;

    TermReference f_11;

    TermReference j_11;

    TermReference h_11;

    TermReference g_11;

    TermReference c_10;

    TermReference d_10;

    TermReference e_10;

    TermReference f_10;

    TermReference g_10;

    TermReference h_10;

    TermReference i_10;

    TermReference j_10;

    TermReference k_10;

    TermReference i_11;

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      ITermFactory termFactory = context.getFactory();
      Fail307:
      { 
        IStrategoTerm term31 = term;
        Success169:
        { 
          Fail308:
          { 
            IStrategoTerm a_12 = null;
            a_12 = term;
            if(j_11.value == null)
              break Fail308;
            term = j_11.value;
            if(term.getTermType() != IStrategoTerm.APPL || transform._consRightShift_2 != ((IStrategoAppl)term).getConstructor())
              break Fail308;
            if(y_10.value == null)
              y_10.value = term.getSubterm(0);
            else
              if(y_10.value != term.getSubterm(0) && !y_10.value.match(term.getSubterm(0)))
                break Fail308;
            if(z_10.value == null)
              z_10.value = term.getSubterm(1);
            else
              if(z_10.value != term.getSubterm(1) && !z_10.value.match(term.getSubterm(1)))
                break Fail308;
            term = a_12;
            { 
              IStrategoTerm w_14 = null;
              IStrategoTerm y_14 = null;
              IStrategoTerm b_15 = null;
              IStrategoTerm term32 = term;
              Success170:
              { 
                Fail309:
                { 
                  IStrategoTerm b_12 = null;
                  b_12 = term;
                  if(i_10.value == null)
                    break Fail309;
                  term = termFactory.makeTuple(i_10.value, transform.constNone0);
                  term = equal_0_0.instance.invoke(context, term);
                  if(term == null)
                    break Fail309;
                  term = b_12;
                  { 
                    if(y_10.value == null)
                      break Fail307;
                    term = get_type_of_0_3.instance.invoke(context, y_10.value, i_10.value, c_10.value, d_10.value);
                    if(term == null)
                      break Fail307;
                    term = cast_shift_type_0_0.instance.invoke(context, term);
                    if(term == null)
                      break Fail307;
                    if(t_10.value == null)
                      t_10.value = term;
                    else
                      if(t_10.value != term && !t_10.value.match(term))
                        break Fail307;
                    if(true)
                      break Success170;
                  }
                }
                term = term32;
                if(i_10.value == null)
                  break Fail307;
                term = cast_shift_type_0_0.instance.invoke(context, i_10.value);
                if(term == null)
                  break Fail307;
                if(t_10.value == null)
                  t_10.value = term;
                else
                  if(t_10.value != term && !t_10.value.match(term))
                    break Fail307;
              }
              y_14 = term;
              if(y_10.value == null)
                break Fail307;
              term = add_external_impl_0_9.instance.invokeDynamic(context, y_10.value, NO_STRATEGIES, new IStrategoTerm[]{c_10.value, d_10.value, e_10.value, f_10.value, g_10.value, h_10.value, t_10.value, j_10.value, k_10.value});
              if(term == null)
                break Fail307;
              w_14 = term;
              term = y_14;
              if(z_10.value == null)
                break Fail307;
              b_15 = z_10.value;
              term = add_external_impl_0_9.instance.invokeDynamic(context, b_15, NO_STRATEGIES, new IStrategoTerm[]{c_10.value, d_10.value, e_10.value, f_10.value, g_10.value, h_10.value, transform.constLong0, j_10.value, k_10.value});
              if(term == null)
                break Fail307;
              term = termFactory.makeAppl(transform._consRightShift_2, new IStrategoTerm[]{w_14, term});
              if(true)
                break Success169;
            }
          }
          term = term31;
          IStrategoTerm term33 = term;
          Success171:
          { 
            Fail310:
            { 
              IStrategoTerm c_12 = null;
              c_12 = term;
              if(j_11.value == null)
                break Fail310;
              term = j_11.value;
              if(term.getTermType() != IStrategoTerm.APPL || transform._consURightShift_2 != ((IStrategoAppl)term).getConstructor())
                break Fail310;
              if(y_10.value == null)
                y_10.value = term.getSubterm(0);
              else
                if(y_10.value != term.getSubterm(0) && !y_10.value.match(term.getSubterm(0)))
                  break Fail310;
              if(z_10.value == null)
                z_10.value = term.getSubterm(1);
              else
                if(z_10.value != term.getSubterm(1) && !z_10.value.match(term.getSubterm(1)))
                  break Fail310;
              term = c_12;
              { 
                IStrategoTerm c_15 = null;
                IStrategoTerm e_15 = null;
                IStrategoTerm h_15 = null;
                IStrategoTerm term34 = term;
                Success172:
                { 
                  Fail311:
                  { 
                    IStrategoTerm d_12 = null;
                    d_12 = term;
                    if(i_10.value == null)
                      break Fail311;
                    term = termFactory.makeTuple(i_10.value, transform.constNone0);
                    term = equal_0_0.instance.invoke(context, term);
                    if(term == null)
                      break Fail311;
                    term = d_12;
                    { 
                      if(y_10.value == null)
                        break Fail307;
                      term = get_type_of_0_3.instance.invoke(context, y_10.value, i_10.value, c_10.value, d_10.value);
                      if(term == null)
                        break Fail307;
                      term = cast_shift_type_0_0.instance.invoke(context, term);
                      if(term == null)
                        break Fail307;
                      if(t_10.value == null)
                        t_10.value = term;
                      else
                        if(t_10.value != term && !t_10.value.match(term))
                          break Fail307;
                      if(true)
                        break Success172;
                    }
                  }
                  term = term34;
                  if(i_10.value == null)
                    break Fail307;
                  term = cast_shift_type_0_0.instance.invoke(context, i_10.value);
                  if(term == null)
                    break Fail307;
                  if(t_10.value == null)
                    t_10.value = term;
                  else
                    if(t_10.value != term && !t_10.value.match(term))
                      break Fail307;
                }
                e_15 = term;
                if(y_10.value == null)
                  break Fail307;
                term = add_external_impl_0_9.instance.invokeDynamic(context, y_10.value, NO_STRATEGIES, new IStrategoTerm[]{c_10.value, d_10.value, e_10.value, f_10.value, g_10.value, h_10.value, t_10.value, j_10.value, k_10.value});
                if(term == null)
                  break Fail307;
                c_15 = term;
                term = e_15;
                if(z_10.value == null)
                  break Fail307;
                h_15 = z_10.value;
                term = add_external_impl_0_9.instance.invokeDynamic(context, h_15, NO_STRATEGIES, new IStrategoTerm[]{c_10.value, d_10.value, e_10.value, f_10.value, g_10.value, h_10.value, transform.constLong0, j_10.value, k_10.value});
                if(term == null)
                  break Fail307;
                term = termFactory.makeAppl(transform._consURightShift_2, new IStrategoTerm[]{c_15, term});
                if(true)
                  break Success171;
              }
            }
            term = term33;
            IStrategoTerm term35 = term;
            Success173:
            { 
              Fail312:
              { 
                IStrategoTerm e_12 = null;
                e_12 = term;
                if(j_11.value == null)
                  break Fail312;
                term = j_11.value;
                if(term.getTermType() != IStrategoTerm.APPL || transform._consPreIncr_1 != ((IStrategoAppl)term).getConstructor())
                  break Fail312;
                if(h_11.value == null)
                  h_11.value = term.getSubterm(0);
                else
                  if(h_11.value != term.getSubterm(0) && !h_11.value.match(term.getSubterm(0)))
                    break Fail312;
                term = e_12;
                { 
                  if(h_11.value == null)
                    break Fail307;
                  term = get_type_of_0_3.instance.invoke(context, h_11.value, i_10.value, c_10.value, d_10.value);
                  if(term == null)
                    break Fail307;
                  if(s_10.value == null)
                    s_10.value = term;
                  else
                    if(s_10.value != term && !s_10.value.match(term))
                      break Fail307;
                  IStrategoTerm term36 = term;
                  Success174:
                  { 
                    Fail313:
                    { 
                      IStrategoTerm f_12 = null;
                      f_12 = term;
                      if(s_10.value == null)
                        break Fail313;
                      term = termFactory.makeTuple(s_10.value, transform.constNone0);
                      term = equal_0_0.instance.invoke(context, term);
                      if(term == null)
                        break Fail313;
                      term = f_12;
                      { 
                        IStrategoTerm term37 = term;
                        Success175:
                        { 
                          Fail314:
                          { 
                            IStrategoTerm g_12 = null;
                            g_12 = term;
                            if(i_10.value == null)
                              break Fail314;
                            term = termFactory.makeTuple(i_10.value, transform.constNone0);
                            term = equal_0_0.instance.invoke(context, term);
                            if(term == null)
                              break Fail314;
                            term = g_12;
                            { 
                              term = transform.constDouble0;
                              if(t_10.value == null)
                                t_10.value = term;
                              else
                                if(t_10.value != term && !t_10.value.match(term))
                                  break Fail307;
                              if(true)
                                break Success175;
                            }
                          }
                          term = term37;
                          if(i_10.value == null)
                            break Fail307;
                          term = ensure__number_0_0.instance.invoke(context, i_10.value);
                          if(term == null)
                            break Fail307;
                          if(t_10.value == null)
                            t_10.value = term;
                          else
                            if(t_10.value != term && !t_10.value.match(term))
                              break Fail307;
                        }
                        if(true)
                          break Success174;
                      }
                    }
                    term = term36;
                    if(s_10.value == null)
                      break Fail307;
                    term = ensure__number_0_0.instance.invoke(context, s_10.value);
                    if(term == null)
                      break Fail307;
                    if(t_10.value == null)
                      t_10.value = term;
                    else
                      if(t_10.value != term && !t_10.value.match(term))
                        break Fail307;
                  }
                  if(h_11.value == null)
                    break Fail307;
                  term = add_external_impl_0_9.instance.invokeDynamic(context, h_11.value, NO_STRATEGIES, new IStrategoTerm[]{c_10.value, d_10.value, e_10.value, f_10.value, g_10.value, h_10.value, t_10.value, j_10.value, k_10.value});
                  if(term == null)
                    break Fail307;
                  term = termFactory.makeAppl(transform._consPreIncr_1, new IStrategoTerm[]{term});
                  if(true)
                    break Success173;
                }
              }
              term = term35;
              IStrategoTerm term38 = term;
              Success176:
              { 
                Fail315:
                { 
                  IStrategoTerm h_12 = null;
                  h_12 = term;
                  if(j_11.value == null)
                    break Fail315;
                  term = j_11.value;
                  if(term.getTermType() != IStrategoTerm.APPL || transform._consPostIncr_1 != ((IStrategoAppl)term).getConstructor())
                    break Fail315;
                  if(h_11.value == null)
                    h_11.value = term.getSubterm(0);
                  else
                    if(h_11.value != term.getSubterm(0) && !h_11.value.match(term.getSubterm(0)))
                      break Fail315;
                  term = h_12;
                  { 
                    if(h_11.value == null)
                      break Fail307;
                    term = get_type_of_0_3.instance.invoke(context, h_11.value, i_10.value, c_10.value, d_10.value);
                    if(term == null)
                      break Fail307;
                    if(s_10.value == null)
                      s_10.value = term;
                    else
                      if(s_10.value != term && !s_10.value.match(term))
                        break Fail307;
                    IStrategoTerm term39 = term;
                    Success177:
                    { 
                      Fail316:
                      { 
                        IStrategoTerm i_12 = null;
                        i_12 = term;
                        if(s_10.value == null)
                          break Fail316;
                        term = termFactory.makeTuple(s_10.value, transform.constNone0);
                        term = equal_0_0.instance.invoke(context, term);
                        if(term == null)
                          break Fail316;
                        term = i_12;
                        { 
                          IStrategoTerm term40 = term;
                          Success178:
                          { 
                            Fail317:
                            { 
                              IStrategoTerm j_12 = null;
                              j_12 = term;
                              if(i_10.value == null)
                                break Fail317;
                              term = termFactory.makeTuple(i_10.value, transform.constNone0);
                              term = equal_0_0.instance.invoke(context, term);
                              if(term == null)
                                break Fail317;
                              term = j_12;
                              { 
                                term = transform.constDouble0;
                                if(t_10.value == null)
                                  t_10.value = term;
                                else
                                  if(t_10.value != term && !t_10.value.match(term))
                                    break Fail307;
                                if(true)
                                  break Success178;
                              }
                            }
                            term = term40;
                            if(i_10.value == null)
                              break Fail307;
                            term = ensure__number_0_0.instance.invoke(context, i_10.value);
                            if(term == null)
                              break Fail307;
                            if(t_10.value == null)
                              t_10.value = term;
                            else
                              if(t_10.value != term && !t_10.value.match(term))
                                break Fail307;
                          }
                          if(true)
                            break Success177;
                        }
                      }
                      term = term39;
                      if(s_10.value == null)
                        break Fail307;
                      term = ensure__number_0_0.instance.invoke(context, s_10.value);
                      if(term == null)
                        break Fail307;
                      if(t_10.value == null)
                        t_10.value = term;
                      else
                        if(t_10.value != term && !t_10.value.match(term))
                          break Fail307;
                    }
                    if(h_11.value == null)
                      break Fail307;
                    term = add_external_impl_0_9.instance.invokeDynamic(context, h_11.value, NO_STRATEGIES, new IStrategoTerm[]{c_10.value, d_10.value, e_10.value, f_10.value, g_10.value, h_10.value, t_10.value, j_10.value, k_10.value});
                    if(term == null)
                      break Fail307;
                    term = termFactory.makeAppl(transform._consPostIncr_1, new IStrategoTerm[]{term});
                    if(true)
                      break Success176;
                  }
                }
                term = term38;
                IStrategoTerm term41 = term;
                Success179:
                { 
                  Fail318:
                  { 
                    IStrategoTerm k_12 = null;
                    k_12 = term;
                    if(j_11.value == null)
                      break Fail318;
                    term = j_11.value;
                    if(term.getTermType() != IStrategoTerm.APPL || transform._consPreDecr_1 != ((IStrategoAppl)term).getConstructor())
                      break Fail318;
                    if(h_11.value == null)
                      h_11.value = term.getSubterm(0);
                    else
                      if(h_11.value != term.getSubterm(0) && !h_11.value.match(term.getSubterm(0)))
                        break Fail318;
                    term = k_12;
                    { 
                      if(h_11.value == null)
                        break Fail307;
                      term = get_type_of_0_3.instance.invoke(context, h_11.value, i_10.value, c_10.value, d_10.value);
                      if(term == null)
                        break Fail307;
                      if(s_10.value == null)
                        s_10.value = term;
                      else
                        if(s_10.value != term && !s_10.value.match(term))
                          break Fail307;
                      IStrategoTerm term42 = term;
                      Success180:
                      { 
                        Fail319:
                        { 
                          IStrategoTerm l_12 = null;
                          l_12 = term;
                          if(s_10.value == null)
                            break Fail319;
                          term = termFactory.makeTuple(s_10.value, transform.constNone0);
                          term = equal_0_0.instance.invoke(context, term);
                          if(term == null)
                            break Fail319;
                          term = l_12;
                          { 
                            IStrategoTerm term43 = term;
                            Success181:
                            { 
                              Fail320:
                              { 
                                IStrategoTerm m_12 = null;
                                m_12 = term;
                                if(i_10.value == null)
                                  break Fail320;
                                term = termFactory.makeTuple(i_10.value, transform.constNone0);
                                term = equal_0_0.instance.invoke(context, term);
                                if(term == null)
                                  break Fail320;
                                term = m_12;
                                { 
                                  term = transform.constDouble0;
                                  if(t_10.value == null)
                                    t_10.value = term;
                                  else
                                    if(t_10.value != term && !t_10.value.match(term))
                                      break Fail307;
                                  if(true)
                                    break Success181;
                                }
                              }
                              term = term43;
                              if(i_10.value == null)
                                break Fail307;
                              term = ensure__number_0_0.instance.invoke(context, i_10.value);
                              if(term == null)
                                break Fail307;
                              if(t_10.value == null)
                                t_10.value = term;
                              else
                                if(t_10.value != term && !t_10.value.match(term))
                                  break Fail307;
                            }
                            if(true)
                              break Success180;
                          }
                        }
                        term = term42;
                        if(s_10.value == null)
                          break Fail307;
                        term = ensure__number_0_0.instance.invoke(context, s_10.value);
                        if(term == null)
                          break Fail307;
                        if(t_10.value == null)
                          t_10.value = term;
                        else
                          if(t_10.value != term && !t_10.value.match(term))
                            break Fail307;
                      }
                      if(h_11.value == null)
                        break Fail307;
                      term = add_external_impl_0_9.instance.invokeDynamic(context, h_11.value, NO_STRATEGIES, new IStrategoTerm[]{c_10.value, d_10.value, e_10.value, f_10.value, g_10.value, h_10.value, t_10.value, j_10.value, k_10.value});
                      if(term == null)
                        break Fail307;
                      term = termFactory.makeAppl(transform._consPreDecr_1, new IStrategoTerm[]{term});
                      if(true)
                        break Success179;
                    }
                  }
                  term = term41;
                  IStrategoTerm term44 = term;
                  Success182:
                  { 
                    Fail321:
                    { 
                      IStrategoTerm n_12 = null;
                      n_12 = term;
                      if(j_11.value == null)
                        break Fail321;
                      term = j_11.value;
                      if(term.getTermType() != IStrategoTerm.APPL || transform._consPostDecr_1 != ((IStrategoAppl)term).getConstructor())
                        break Fail321;
                      if(h_11.value == null)
                        h_11.value = term.getSubterm(0);
                      else
                        if(h_11.value != term.getSubterm(0) && !h_11.value.match(term.getSubterm(0)))
                          break Fail321;
                      term = n_12;
                      { 
                        if(h_11.value == null)
                          break Fail307;
                        term = get_type_of_0_3.instance.invoke(context, h_11.value, i_10.value, c_10.value, d_10.value);
                        if(term == null)
                          break Fail307;
                        if(s_10.value == null)
                          s_10.value = term;
                        else
                          if(s_10.value != term && !s_10.value.match(term))
                            break Fail307;
                        IStrategoTerm term45 = term;
                        Success183:
                        { 
                          Fail322:
                          { 
                            IStrategoTerm o_12 = null;
                            o_12 = term;
                            if(s_10.value == null)
                              break Fail322;
                            term = termFactory.makeTuple(s_10.value, transform.constNone0);
                            term = equal_0_0.instance.invoke(context, term);
                            if(term == null)
                              break Fail322;
                            term = o_12;
                            { 
                              IStrategoTerm term46 = term;
                              Success184:
                              { 
                                Fail323:
                                { 
                                  IStrategoTerm p_12 = null;
                                  p_12 = term;
                                  if(i_10.value == null)
                                    break Fail323;
                                  term = termFactory.makeTuple(i_10.value, transform.constNone0);
                                  term = equal_0_0.instance.invoke(context, term);
                                  if(term == null)
                                    break Fail323;
                                  term = p_12;
                                  { 
                                    term = transform.constDouble0;
                                    if(t_10.value == null)
                                      t_10.value = term;
                                    else
                                      if(t_10.value != term && !t_10.value.match(term))
                                        break Fail307;
                                    if(true)
                                      break Success184;
                                  }
                                }
                                term = term46;
                                if(i_10.value == null)
                                  break Fail307;
                                term = ensure__number_0_0.instance.invoke(context, i_10.value);
                                if(term == null)
                                  break Fail307;
                                if(t_10.value == null)
                                  t_10.value = term;
                                else
                                  if(t_10.value != term && !t_10.value.match(term))
                                    break Fail307;
                              }
                              if(true)
                                break Success183;
                            }
                          }
                          term = term45;
                          if(s_10.value == null)
                            break Fail307;
                          term = ensure__number_0_0.instance.invoke(context, s_10.value);
                          if(term == null)
                            break Fail307;
                          if(t_10.value == null)
                            t_10.value = term;
                          else
                            if(t_10.value != term && !t_10.value.match(term))
                              break Fail307;
                        }
                        if(h_11.value == null)
                          break Fail307;
                        term = add_external_impl_0_9.instance.invokeDynamic(context, h_11.value, NO_STRATEGIES, new IStrategoTerm[]{c_10.value, d_10.value, e_10.value, f_10.value, g_10.value, h_10.value, t_10.value, j_10.value, k_10.value});
                        if(term == null)
                          break Fail307;
                        term = termFactory.makeAppl(transform._consPostDecr_1, new IStrategoTerm[]{term});
                        if(true)
                          break Success182;
                      }
                    }
                    term = term44;
                    IStrategoTerm term47 = term;
                    Success185:
                    { 
                      Fail324:
                      { 
                        IStrategoTerm q_12 = null;
                        q_12 = term;
                        if(j_11.value == null)
                          break Fail324;
                        term = j_11.value;
                        if(term.getTermType() != IStrategoTerm.APPL || transform._consNot_1 != ((IStrategoAppl)term).getConstructor())
                          break Fail324;
                        term = q_12;
                        { 
                          if(i_11.value == null)
                            break Fail307;
                          term = i_11.value;
                          lifted40 lifted400 = new lifted40();
                          lifted400.c_10 = c_10;
                          lifted400.d_10 = d_10;
                          lifted400.e_10 = e_10;
                          lifted400.f_10 = f_10;
                          lifted400.g_10 = g_10;
                          lifted400.h_10 = h_10;
                          lifted400.j_10 = j_10;
                          lifted400.k_10 = k_10;
                          term = SRTS_all.instance.invoke(context, term, lifted400);
                          if(term == null)
                            break Fail307;
                          if(true)
                            break Success185;
                        }
                      }
                      term = term47;
                      IStrategoTerm term48 = term;
                      Success186:
                      { 
                        Fail325:
                        { 
                          IStrategoTerm r_12 = null;
                          r_12 = term;
                          if(j_11.value == null)
                            break Fail325;
                          term = or_2_0.instance.invoke(context, j_11.value, lifted41.instance, lifted44.instance);
                          if(term == null)
                            break Fail325;
                          term = r_12;
                          { 
                            if(i_11.value == null)
                              break Fail307;
                            term = i_11.value;
                            lifted45 lifted450 = new lifted45();
                            lifted450.i_11 = i_11;
                            lifted450.i_10 = i_10;
                            lifted450.c_10 = c_10;
                            lifted450.d_10 = d_10;
                            lifted450.e_10 = e_10;
                            lifted450.f_10 = f_10;
                            lifted450.g_10 = g_10;
                            lifted450.h_10 = h_10;
                            lifted450.j_10 = j_10;
                            lifted450.k_10 = k_10;
                            term = SRTS_all.instance.invoke(context, term, lifted450);
                            if(term == null)
                              break Fail307;
                            if(true)
                              break Success186;
                          }
                        }
                        term = term48;
                        IStrategoTerm term49 = term;
                        Success187:
                        { 
                          Fail326:
                          { 
                            IStrategoTerm s_12 = null;
                            s_12 = term;
                            if(j_11.value == null)
                              break Fail326;
                            term = j_11.value;
                            if(term.getTermType() != IStrategoTerm.APPL || transform._consAssign_2 != ((IStrategoAppl)term).getConstructor())
                              break Fail326;
                            if(u_10.value == null)
                              u_10.value = term.getSubterm(0);
                            else
                              if(u_10.value != term.getSubterm(0) && !u_10.value.match(term.getSubterm(0)))
                                break Fail326;
                            if(h_11.value == null)
                              h_11.value = term.getSubterm(1);
                            else
                              if(h_11.value != term.getSubterm(1) && !h_11.value.match(term.getSubterm(1)))
                                break Fail326;
                            term = s_12;
                            { 
                              IStrategoTerm u_15 = null;
                              IStrategoTerm v_15 = null;
                              if(u_10.value == null)
                                break Fail307;
                              term = get_$L$H$S_type_0_3.instance.invoke(context, u_10.value, i_10.value, c_10.value, d_10.value);
                              if(term == null)
                                break Fail307;
                              if(v_10.value == null)
                                v_10.value = term;
                              else
                                if(v_10.value != term && !v_10.value.match(term))
                                  break Fail307;
                              v_15 = term;
                              if(h_11.value == null)
                                break Fail307;
                              term = add_external_impl_0_9.instance.invokeDynamic(context, h_11.value, NO_STRATEGIES, new IStrategoTerm[]{c_10.value, d_10.value, e_10.value, f_10.value, g_10.value, h_10.value, v_10.value, j_10.value, k_10.value});
                              if(term == null)
                                break Fail307;
                              u_15 = term;
                              term = v_15;
                              if(u_10.value == null)
                                break Fail307;
                              term = termFactory.makeAppl(transform._consAssign_2, new IStrategoTerm[]{u_10.value, u_15});
                              if(true)
                                break Success187;
                            }
                          }
                          term = term49;
                          IStrategoTerm term50 = term;
                          Success188:
                          { 
                            Fail327:
                            { 
                              IStrategoTerm t_12 = null;
                              t_12 = term;
                              if(j_11.value == null)
                                break Fail327;
                              term = j_11.value;
                              if(term.getTermType() != IStrategoTerm.APPL || transform._consAssignMul_2 != ((IStrategoAppl)term).getConstructor())
                                break Fail327;
                              if(u_10.value == null)
                                u_10.value = term.getSubterm(0);
                              else
                                if(u_10.value != term.getSubterm(0) && !u_10.value.match(term.getSubterm(0)))
                                  break Fail327;
                              if(h_11.value == null)
                                h_11.value = term.getSubterm(1);
                              else
                                if(h_11.value != term.getSubterm(1) && !h_11.value.match(term.getSubterm(1)))
                                  break Fail327;
                              term = t_12;
                              { 
                                IStrategoTerm w_15 = null;
                                IStrategoTerm x_15 = null;
                                IStrategoTerm z_15 = null;
                                if(u_10.value == null)
                                  break Fail307;
                                term = get_$L$H$S_type_0_3.instance.invoke(context, u_10.value, i_10.value, c_10.value, d_10.value);
                                if(term == null)
                                  break Fail307;
                                x_15 = term;
                                if(h_11.value == null)
                                  break Fail307;
                                z_15 = h_11.value;
                                term = add_external_impl_0_9.instance.invokeDynamic(context, z_15, NO_STRATEGIES, new IStrategoTerm[]{c_10.value, d_10.value, e_10.value, f_10.value, g_10.value, h_10.value, transform.constDouble0, j_10.value, k_10.value});
                                if(term == null)
                                  break Fail307;
                                w_15 = term;
                                term = x_15;
                                if(u_10.value == null)
                                  break Fail307;
                                term = termFactory.makeAppl(transform._consAssignMul_2, new IStrategoTerm[]{u_10.value, w_15});
                                if(true)
                                  break Success188;
                              }
                            }
                            term = term50;
                            IStrategoTerm term51 = term;
                            Success189:
                            { 
                              Fail328:
                              { 
                                IStrategoTerm u_12 = null;
                                u_12 = term;
                                if(j_11.value == null)
                                  break Fail328;
                                term = j_11.value;
                                if(term.getTermType() != IStrategoTerm.APPL || transform._consAssignDiv_2 != ((IStrategoAppl)term).getConstructor())
                                  break Fail328;
                                if(u_10.value == null)
                                  u_10.value = term.getSubterm(0);
                                else
                                  if(u_10.value != term.getSubterm(0) && !u_10.value.match(term.getSubterm(0)))
                                    break Fail328;
                                if(h_11.value == null)
                                  h_11.value = term.getSubterm(1);
                                else
                                  if(h_11.value != term.getSubterm(1) && !h_11.value.match(term.getSubterm(1)))
                                    break Fail328;
                                term = u_12;
                                { 
                                  IStrategoTerm a_16 = null;
                                  IStrategoTerm b_16 = null;
                                  IStrategoTerm d_16 = null;
                                  if(u_10.value == null)
                                    break Fail307;
                                  term = get_$L$H$S_type_0_3.instance.invoke(context, u_10.value, i_10.value, c_10.value, d_10.value);
                                  if(term == null)
                                    break Fail307;
                                  b_16 = term;
                                  if(h_11.value == null)
                                    break Fail307;
                                  d_16 = h_11.value;
                                  term = add_external_impl_0_9.instance.invokeDynamic(context, d_16, NO_STRATEGIES, new IStrategoTerm[]{c_10.value, d_10.value, e_10.value, f_10.value, g_10.value, h_10.value, transform.constDouble0, j_10.value, k_10.value});
                                  if(term == null)
                                    break Fail307;
                                  a_16 = term;
                                  term = b_16;
                                  if(u_10.value == null)
                                    break Fail307;
                                  term = termFactory.makeAppl(transform._consAssignDiv_2, new IStrategoTerm[]{u_10.value, a_16});
                                  if(true)
                                    break Success189;
                                }
                              }
                              term = term51;
                              IStrategoTerm term52 = term;
                              Success190:
                              { 
                                Fail329:
                                { 
                                  IStrategoTerm v_12 = null;
                                  v_12 = term;
                                  if(j_11.value == null)
                                    break Fail329;
                                  term = j_11.value;
                                  if(term.getTermType() != IStrategoTerm.APPL || transform._consAssignRemain_2 != ((IStrategoAppl)term).getConstructor())
                                    break Fail329;
                                  if(u_10.value == null)
                                    u_10.value = term.getSubterm(0);
                                  else
                                    if(u_10.value != term.getSubterm(0) && !u_10.value.match(term.getSubterm(0)))
                                      break Fail329;
                                  if(h_11.value == null)
                                    h_11.value = term.getSubterm(1);
                                  else
                                    if(h_11.value != term.getSubterm(1) && !h_11.value.match(term.getSubterm(1)))
                                      break Fail329;
                                  term = v_12;
                                  { 
                                    IStrategoTerm e_16 = null;
                                    IStrategoTerm f_16 = null;
                                    IStrategoTerm h_16 = null;
                                    if(u_10.value == null)
                                      break Fail307;
                                    term = get_$L$H$S_type_0_3.instance.invoke(context, u_10.value, i_10.value, c_10.value, d_10.value);
                                    if(term == null)
                                      break Fail307;
                                    f_16 = term;
                                    if(h_11.value == null)
                                      break Fail307;
                                    h_16 = h_11.value;
                                    term = add_external_impl_0_9.instance.invokeDynamic(context, h_16, NO_STRATEGIES, new IStrategoTerm[]{c_10.value, d_10.value, e_10.value, f_10.value, g_10.value, h_10.value, transform.constDouble0, j_10.value, k_10.value});
                                    if(term == null)
                                      break Fail307;
                                    e_16 = term;
                                    term = f_16;
                                    if(u_10.value == null)
                                      break Fail307;
                                    term = termFactory.makeAppl(transform._consAssignRemain_2, new IStrategoTerm[]{u_10.value, e_16});
                                    if(true)
                                      break Success190;
                                  }
                                }
                                term = term52;
                                IStrategoTerm term53 = term;
                                Success191:
                                { 
                                  Fail330:
                                  { 
                                    IStrategoTerm w_12 = null;
                                    w_12 = term;
                                    if(j_11.value == null)
                                      break Fail330;
                                    term = j_11.value;
                                    if(term.getTermType() != IStrategoTerm.APPL || transform._consAssignPlus_2 != ((IStrategoAppl)term).getConstructor())
                                      break Fail330;
                                    if(u_10.value == null)
                                      u_10.value = term.getSubterm(0);
                                    else
                                      if(u_10.value != term.getSubterm(0) && !u_10.value.match(term.getSubterm(0)))
                                        break Fail330;
                                    if(h_11.value == null)
                                      h_11.value = term.getSubterm(1);
                                    else
                                      if(h_11.value != term.getSubterm(1) && !h_11.value.match(term.getSubterm(1)))
                                        break Fail330;
                                    term = w_12;
                                    { 
                                      IStrategoTerm i_16 = null;
                                      IStrategoTerm j_16 = null;
                                      IStrategoTerm l_16 = null;
                                      if(u_10.value == null)
                                        break Fail307;
                                      term = get_$L$H$S_type_0_3.instance.invoke(context, u_10.value, i_10.value, c_10.value, d_10.value);
                                      if(term == null)
                                        break Fail307;
                                      j_16 = term;
                                      if(h_11.value == null)
                                        break Fail307;
                                      l_16 = h_11.value;
                                      term = add_external_impl_0_9.instance.invokeDynamic(context, l_16, NO_STRATEGIES, new IStrategoTerm[]{c_10.value, d_10.value, e_10.value, f_10.value, g_10.value, h_10.value, transform.constDouble0, j_10.value, k_10.value});
                                      if(term == null)
                                        break Fail307;
                                      i_16 = term;
                                      term = j_16;
                                      if(u_10.value == null)
                                        break Fail307;
                                      term = termFactory.makeAppl(transform._consAssignPlus_2, new IStrategoTerm[]{u_10.value, i_16});
                                      if(true)
                                        break Success191;
                                    }
                                  }
                                  term = term53;
                                  IStrategoTerm term54 = term;
                                  Success192:
                                  { 
                                    Fail331:
                                    { 
                                      IStrategoTerm x_12 = null;
                                      x_12 = term;
                                      if(j_11.value == null)
                                        break Fail331;
                                      term = j_11.value;
                                      if(term.getTermType() != IStrategoTerm.APPL || transform._consAssignMinus_2 != ((IStrategoAppl)term).getConstructor())
                                        break Fail331;
                                      if(u_10.value == null)
                                        u_10.value = term.getSubterm(0);
                                      else
                                        if(u_10.value != term.getSubterm(0) && !u_10.value.match(term.getSubterm(0)))
                                          break Fail331;
                                      if(h_11.value == null)
                                        h_11.value = term.getSubterm(1);
                                      else
                                        if(h_11.value != term.getSubterm(1) && !h_11.value.match(term.getSubterm(1)))
                                          break Fail331;
                                      term = x_12;
                                      { 
                                        IStrategoTerm m_16 = null;
                                        IStrategoTerm n_16 = null;
                                        IStrategoTerm p_16 = null;
                                        if(u_10.value == null)
                                          break Fail307;
                                        term = get_$L$H$S_type_0_3.instance.invoke(context, u_10.value, i_10.value, c_10.value, d_10.value);
                                        if(term == null)
                                          break Fail307;
                                        n_16 = term;
                                        if(h_11.value == null)
                                          break Fail307;
                                        p_16 = h_11.value;
                                        term = add_external_impl_0_9.instance.invokeDynamic(context, p_16, NO_STRATEGIES, new IStrategoTerm[]{c_10.value, d_10.value, e_10.value, f_10.value, g_10.value, h_10.value, transform.constDouble0, j_10.value, k_10.value});
                                        if(term == null)
                                          break Fail307;
                                        m_16 = term;
                                        term = n_16;
                                        if(u_10.value == null)
                                          break Fail307;
                                        term = termFactory.makeAppl(transform._consAssignMinus_2, new IStrategoTerm[]{u_10.value, m_16});
                                        if(true)
                                          break Success192;
                                      }
                                    }
                                    term = term54;
                                    IStrategoTerm term55 = term;
                                    Success193:
                                    { 
                                      Fail332:
                                      { 
                                        IStrategoTerm y_12 = null;
                                        y_12 = term;
                                        if(j_11.value == null)
                                          break Fail332;
                                        term = j_11.value;
                                        if(term.getTermType() != IStrategoTerm.APPL || transform._consAssignLeftShift_2 != ((IStrategoAppl)term).getConstructor())
                                          break Fail332;
                                        if(u_10.value == null)
                                          u_10.value = term.getSubterm(0);
                                        else
                                          if(u_10.value != term.getSubterm(0) && !u_10.value.match(term.getSubterm(0)))
                                            break Fail332;
                                        if(h_11.value == null)
                                          h_11.value = term.getSubterm(1);
                                        else
                                          if(h_11.value != term.getSubterm(1) && !h_11.value.match(term.getSubterm(1)))
                                            break Fail332;
                                        term = y_12;
                                        { 
                                          IStrategoTerm q_16 = null;
                                          IStrategoTerm r_16 = null;
                                          IStrategoTerm t_16 = null;
                                          if(u_10.value == null)
                                            break Fail307;
                                          term = get_$L$H$S_type_0_3.instance.invoke(context, u_10.value, i_10.value, c_10.value, d_10.value);
                                          if(term == null)
                                            break Fail307;
                                          r_16 = term;
                                          if(h_11.value == null)
                                            break Fail307;
                                          t_16 = h_11.value;
                                          term = add_external_impl_0_9.instance.invokeDynamic(context, t_16, NO_STRATEGIES, new IStrategoTerm[]{c_10.value, d_10.value, e_10.value, f_10.value, g_10.value, h_10.value, transform.constLong0, j_10.value, k_10.value});
                                          if(term == null)
                                            break Fail307;
                                          q_16 = term;
                                          term = r_16;
                                          if(u_10.value == null)
                                            break Fail307;
                                          term = termFactory.makeAppl(transform._consAssignLeftShift_2, new IStrategoTerm[]{u_10.value, q_16});
                                          if(true)
                                            break Success193;
                                        }
                                      }
                                      term = term55;
                                      IStrategoTerm term56 = term;
                                      Success194:
                                      { 
                                        Fail333:
                                        { 
                                          IStrategoTerm z_12 = null;
                                          z_12 = term;
                                          if(j_11.value == null)
                                            break Fail333;
                                          term = j_11.value;
                                          if(term.getTermType() != IStrategoTerm.APPL || transform._consAssignRightShift_2 != ((IStrategoAppl)term).getConstructor())
                                            break Fail333;
                                          if(u_10.value == null)
                                            u_10.value = term.getSubterm(0);
                                          else
                                            if(u_10.value != term.getSubterm(0) && !u_10.value.match(term.getSubterm(0)))
                                              break Fail333;
                                          if(h_11.value == null)
                                            h_11.value = term.getSubterm(1);
                                          else
                                            if(h_11.value != term.getSubterm(1) && !h_11.value.match(term.getSubterm(1)))
                                              break Fail333;
                                          term = z_12;
                                          { 
                                            IStrategoTerm u_16 = null;
                                            IStrategoTerm v_16 = null;
                                            IStrategoTerm x_16 = null;
                                            if(u_10.value == null)
                                              break Fail307;
                                            term = get_$L$H$S_type_0_3.instance.invoke(context, u_10.value, i_10.value, c_10.value, d_10.value);
                                            if(term == null)
                                              break Fail307;
                                            v_16 = term;
                                            if(h_11.value == null)
                                              break Fail307;
                                            x_16 = h_11.value;
                                            term = add_external_impl_0_9.instance.invokeDynamic(context, x_16, NO_STRATEGIES, new IStrategoTerm[]{c_10.value, d_10.value, e_10.value, f_10.value, g_10.value, h_10.value, transform.constLong0, j_10.value, k_10.value});
                                            if(term == null)
                                              break Fail307;
                                            u_16 = term;
                                            term = v_16;
                                            if(u_10.value == null)
                                              break Fail307;
                                            term = termFactory.makeAppl(transform._consAssignRightShift_2, new IStrategoTerm[]{u_10.value, u_16});
                                            if(true)
                                              break Success194;
                                          }
                                        }
                                        term = term56;
                                        IStrategoTerm term57 = term;
                                        Success195:
                                        { 
                                          Fail334:
                                          { 
                                            IStrategoTerm a_13 = null;
                                            a_13 = term;
                                            if(j_11.value == null)
                                              break Fail334;
                                            term = j_11.value;
                                            if(term.getTermType() != IStrategoTerm.APPL || transform._consAssignURightShift_2 != ((IStrategoAppl)term).getConstructor())
                                              break Fail334;
                                            if(u_10.value == null)
                                              u_10.value = term.getSubterm(0);
                                            else
                                              if(u_10.value != term.getSubterm(0) && !u_10.value.match(term.getSubterm(0)))
                                                break Fail334;
                                            if(h_11.value == null)
                                              h_11.value = term.getSubterm(1);
                                            else
                                              if(h_11.value != term.getSubterm(1) && !h_11.value.match(term.getSubterm(1)))
                                                break Fail334;
                                            term = a_13;
                                            { 
                                              IStrategoTerm y_16 = null;
                                              IStrategoTerm z_16 = null;
                                              IStrategoTerm b_17 = null;
                                              if(u_10.value == null)
                                                break Fail307;
                                              term = get_$L$H$S_type_0_3.instance.invoke(context, u_10.value, i_10.value, c_10.value, d_10.value);
                                              if(term == null)
                                                break Fail307;
                                              z_16 = term;
                                              if(h_11.value == null)
                                                break Fail307;
                                              b_17 = h_11.value;
                                              term = add_external_impl_0_9.instance.invokeDynamic(context, b_17, NO_STRATEGIES, new IStrategoTerm[]{c_10.value, d_10.value, e_10.value, f_10.value, g_10.value, h_10.value, transform.constLong0, j_10.value, k_10.value});
                                              if(term == null)
                                                break Fail307;
                                              y_16 = term;
                                              term = z_16;
                                              if(u_10.value == null)
                                                break Fail307;
                                              term = termFactory.makeAppl(transform._consAssignURightShift_2, new IStrategoTerm[]{u_10.value, y_16});
                                              if(true)
                                                break Success195;
                                            }
                                          }
                                          term = term57;
                                          add_external_impl_0_9_fragment_0 add_external_impl_0_9_fragment_00 = new add_external_impl_0_9_fragment_0();
                                          add_external_impl_0_9_fragment_00.v_10 = v_10;
                                          add_external_impl_0_9_fragment_00.u_10 = u_10;
                                          add_external_impl_0_9_fragment_00.w_10 = w_10;
                                          add_external_impl_0_9_fragment_00.x_10 = x_10;
                                          add_external_impl_0_9_fragment_00.y_10 = y_10;
                                          add_external_impl_0_9_fragment_00.z_10 = z_10;
                                          add_external_impl_0_9_fragment_00.a_11 = a_11;
                                          add_external_impl_0_9_fragment_00.b_11 = b_11;
                                          add_external_impl_0_9_fragment_00.c_11 = c_11;
                                          add_external_impl_0_9_fragment_00.d_11 = d_11;
                                          add_external_impl_0_9_fragment_00.e_11 = e_11;
                                          add_external_impl_0_9_fragment_00.f_11 = f_11;
                                          add_external_impl_0_9_fragment_00.j_11 = j_11;
                                          add_external_impl_0_9_fragment_00.h_11 = h_11;
                                          add_external_impl_0_9_fragment_00.g_11 = g_11;
                                          add_external_impl_0_9_fragment_00.c_10 = c_10;
                                          add_external_impl_0_9_fragment_00.d_10 = d_10;
                                          add_external_impl_0_9_fragment_00.e_10 = e_10;
                                          add_external_impl_0_9_fragment_00.f_10 = f_10;
                                          add_external_impl_0_9_fragment_00.g_10 = g_10;
                                          add_external_impl_0_9_fragment_00.h_10 = h_10;
                                          add_external_impl_0_9_fragment_00.i_10 = i_10;
                                          add_external_impl_0_9_fragment_00.j_10 = j_10;
                                          add_external_impl_0_9_fragment_00.k_10 = k_10;
                                          add_external_impl_0_9_fragment_00.i_11 = i_11;
                                          term = add_external_impl_0_9_fragment_00.invoke(context, term);
                                          if(term == null)
                                            break Fail307;
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
    TermReference v_10;

    TermReference u_10;

    TermReference w_10;

    TermReference x_10;

    TermReference y_10;

    TermReference z_10;

    TermReference a_11;

    TermReference b_11;

    TermReference c_11;

    TermReference d_11;

    TermReference e_11;

    TermReference f_11;

    TermReference j_11;

    TermReference h_11;

    TermReference g_11;

    TermReference c_10;

    TermReference d_10;

    TermReference e_10;

    TermReference f_10;

    TermReference g_10;

    TermReference h_10;

    TermReference i_10;

    TermReference j_10;

    TermReference k_10;

    TermReference i_11;

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      ITermFactory termFactory = context.getFactory();
      Fail335:
      { 
        IStrategoTerm term58 = term;
        Success196:
        { 
          Fail336:
          { 
            IStrategoTerm b_13 = null;
            b_13 = term;
            if(j_11.value == null)
              break Fail336;
            term = j_11.value;
            if(term.getTermType() != IStrategoTerm.APPL || transform._consAssignAnd_2 != ((IStrategoAppl)term).getConstructor())
              break Fail336;
            if(u_10.value == null)
              u_10.value = term.getSubterm(0);
            else
              if(u_10.value != term.getSubterm(0) && !u_10.value.match(term.getSubterm(0)))
                break Fail336;
            if(h_11.value == null)
              h_11.value = term.getSubterm(1);
            else
              if(h_11.value != term.getSubterm(1) && !h_11.value.match(term.getSubterm(1)))
                break Fail336;
            term = b_13;
            { 
              IStrategoTerm c_17 = null;
              IStrategoTerm d_17 = null;
              IStrategoTerm f_17 = null;
              if(u_10.value == null)
                break Fail335;
              term = get_$L$H$S_type_0_3.instance.invoke(context, u_10.value, i_10.value, c_10.value, d_10.value);
              if(term == null)
                break Fail335;
              if(v_10.value == null)
                v_10.value = term;
              else
                if(v_10.value != term && !v_10.value.match(term))
                  break Fail335;
              d_17 = term;
              if(h_11.value == null)
                break Fail335;
              term = h_11.value;
              f_17 = h_11.value;
              if(v_10.value == null)
                break Fail335;
              term = cast_bounded_conditional_type_0_0.instance.invoke(context, v_10.value);
              if(term == null)
                break Fail335;
              term = add_external_impl_0_9.instance.invokeDynamic(context, f_17, NO_STRATEGIES, new IStrategoTerm[]{c_10.value, d_10.value, e_10.value, f_10.value, g_10.value, h_10.value, term, j_10.value, k_10.value});
              if(term == null)
                break Fail335;
              c_17 = term;
              term = d_17;
              if(u_10.value == null)
                break Fail335;
              term = termFactory.makeAppl(transform._consAssignAnd_2, new IStrategoTerm[]{u_10.value, c_17});
              if(true)
                break Success196;
            }
          }
          term = term58;
          IStrategoTerm term59 = term;
          Success197:
          { 
            Fail337:
            { 
              IStrategoTerm c_13 = null;
              c_13 = term;
              if(j_11.value == null)
                break Fail337;
              term = j_11.value;
              if(term.getTermType() != IStrategoTerm.APPL || transform._consAssignExcOr_2 != ((IStrategoAppl)term).getConstructor())
                break Fail337;
              if(u_10.value == null)
                u_10.value = term.getSubterm(0);
              else
                if(u_10.value != term.getSubterm(0) && !u_10.value.match(term.getSubterm(0)))
                  break Fail337;
              if(h_11.value == null)
                h_11.value = term.getSubterm(1);
              else
                if(h_11.value != term.getSubterm(1) && !h_11.value.match(term.getSubterm(1)))
                  break Fail337;
              term = c_13;
              { 
                IStrategoTerm g_17 = null;
                IStrategoTerm h_17 = null;
                IStrategoTerm j_17 = null;
                if(u_10.value == null)
                  break Fail335;
                term = get_$L$H$S_type_0_3.instance.invoke(context, u_10.value, i_10.value, c_10.value, d_10.value);
                if(term == null)
                  break Fail335;
                if(v_10.value == null)
                  v_10.value = term;
                else
                  if(v_10.value != term && !v_10.value.match(term))
                    break Fail335;
                h_17 = term;
                if(h_11.value == null)
                  break Fail335;
                term = h_11.value;
                j_17 = h_11.value;
                if(v_10.value == null)
                  break Fail335;
                term = cast_bounded_conditional_type_0_0.instance.invoke(context, v_10.value);
                if(term == null)
                  break Fail335;
                term = add_external_impl_0_9.instance.invokeDynamic(context, j_17, NO_STRATEGIES, new IStrategoTerm[]{c_10.value, d_10.value, e_10.value, f_10.value, g_10.value, h_10.value, term, j_10.value, k_10.value});
                if(term == null)
                  break Fail335;
                g_17 = term;
                term = h_17;
                if(u_10.value == null)
                  break Fail335;
                term = termFactory.makeAppl(transform._consAssignExcOr_2, new IStrategoTerm[]{u_10.value, g_17});
                if(true)
                  break Success197;
              }
            }
            term = term59;
            IStrategoTerm term60 = term;
            Success198:
            { 
              Fail338:
              { 
                IStrategoTerm d_13 = null;
                d_13 = term;
                if(j_11.value == null)
                  break Fail338;
                term = j_11.value;
                if(term.getTermType() != IStrategoTerm.APPL || transform._consAssignOr_2 != ((IStrategoAppl)term).getConstructor())
                  break Fail338;
                if(u_10.value == null)
                  u_10.value = term.getSubterm(0);
                else
                  if(u_10.value != term.getSubterm(0) && !u_10.value.match(term.getSubterm(0)))
                    break Fail338;
                if(h_11.value == null)
                  h_11.value = term.getSubterm(1);
                else
                  if(h_11.value != term.getSubterm(1) && !h_11.value.match(term.getSubterm(1)))
                    break Fail338;
                term = d_13;
                { 
                  IStrategoTerm k_17 = null;
                  IStrategoTerm l_17 = null;
                  IStrategoTerm n_17 = null;
                  if(u_10.value == null)
                    break Fail335;
                  term = get_$L$H$S_type_0_3.instance.invoke(context, u_10.value, i_10.value, c_10.value, d_10.value);
                  if(term == null)
                    break Fail335;
                  if(v_10.value == null)
                    v_10.value = term;
                  else
                    if(v_10.value != term && !v_10.value.match(term))
                      break Fail335;
                  l_17 = term;
                  if(h_11.value == null)
                    break Fail335;
                  term = h_11.value;
                  n_17 = h_11.value;
                  if(v_10.value == null)
                    break Fail335;
                  term = cast_bounded_conditional_type_0_0.instance.invoke(context, v_10.value);
                  if(term == null)
                    break Fail335;
                  term = add_external_impl_0_9.instance.invokeDynamic(context, n_17, NO_STRATEGIES, new IStrategoTerm[]{c_10.value, d_10.value, e_10.value, f_10.value, g_10.value, h_10.value, term, j_10.value, k_10.value});
                  if(term == null)
                    break Fail335;
                  k_17 = term;
                  term = l_17;
                  if(u_10.value == null)
                    break Fail335;
                  term = termFactory.makeAppl(transform._consAssignOr_2, new IStrategoTerm[]{u_10.value, k_17});
                  if(true)
                    break Success198;
                }
              }
              term = term60;
              IStrategoTerm term61 = term;
              Success199:
              { 
                Fail339:
                { 
                  IStrategoTerm e_13 = null;
                  e_13 = term;
                  if(j_11.value == null)
                    break Fail339;
                  term = or_2_0.instance.invoke(context, j_11.value, lifted46.instance, lifted47.instance);
                  if(term == null)
                    break Fail339;
                  term = e_13;
                  { 
                    if(i_11.value == null)
                      break Fail335;
                    term = i_11.value;
                    lifted48 lifted480 = new lifted48();
                    lifted480.c_10 = c_10;
                    lifted480.d_10 = d_10;
                    lifted480.e_10 = e_10;
                    lifted480.f_10 = f_10;
                    lifted480.g_10 = g_10;
                    lifted480.h_10 = h_10;
                    lifted480.j_10 = j_10;
                    lifted480.k_10 = k_10;
                    term = SRTS_all.instance.invoke(context, term, lifted480);
                    if(term == null)
                      break Fail335;
                    if(true)
                      break Success199;
                  }
                }
                term = term61;
                IStrategoTerm term62 = term;
                Success200:
                { 
                  Fail340:
                  { 
                    IStrategoTerm f_13 = null;
                    f_13 = term;
                    if(j_11.value == null)
                      break Fail340;
                    term = j_11.value;
                    if(term.getTermType() != IStrategoTerm.APPL || transform._consIf_2 != ((IStrategoAppl)term).getConstructor())
                      break Fail340;
                    if(h_11.value == null)
                      h_11.value = term.getSubterm(0);
                    else
                      if(h_11.value != term.getSubterm(0) && !h_11.value.match(term.getSubterm(0)))
                        break Fail340;
                    if(w_10.value == null)
                      w_10.value = term.getSubterm(1);
                    else
                      if(w_10.value != term.getSubterm(1) && !w_10.value.match(term.getSubterm(1)))
                        break Fail340;
                    term = f_13;
                    { 
                      IStrategoTerm q_17 = null;
                      IStrategoTerm s_17 = null;
                      IStrategoTerm u_17 = null;
                      IStrategoTerm x_17 = null;
                      s_17 = term;
                      if(h_11.value == null)
                        break Fail335;
                      u_17 = h_11.value;
                      term = add_external_impl_0_9.instance.invokeDynamic(context, u_17, NO_STRATEGIES, new IStrategoTerm[]{c_10.value, d_10.value, e_10.value, f_10.value, g_10.value, h_10.value, transform.constBoolean0, j_10.value, k_10.value});
                      if(term == null)
                        break Fail335;
                      q_17 = term;
                      term = s_17;
                      if(w_10.value == null)
                        break Fail335;
                      x_17 = w_10.value;
                      term = add_external_impl_0_9.instance.invokeDynamic(context, x_17, NO_STRATEGIES, new IStrategoTerm[]{c_10.value, d_10.value, e_10.value, f_10.value, g_10.value, h_10.value, transform.constNone0, j_10.value, k_10.value});
                      if(term == null)
                        break Fail335;
                      term = termFactory.makeAppl(transform._consIf_2, new IStrategoTerm[]{q_17, term});
                      if(true)
                        break Success200;
                    }
                  }
                  term = term62;
                  IStrategoTerm term63 = term;
                  Success201:
                  { 
                    Fail341:
                    { 
                      IStrategoTerm g_13 = null;
                      g_13 = term;
                      if(j_11.value == null)
                        break Fail341;
                      term = j_11.value;
                      if(term.getTermType() != IStrategoTerm.APPL || transform._consIf_3 != ((IStrategoAppl)term).getConstructor())
                        break Fail341;
                      if(h_11.value == null)
                        h_11.value = term.getSubterm(0);
                      else
                        if(h_11.value != term.getSubterm(0) && !h_11.value.match(term.getSubterm(0)))
                          break Fail341;
                      if(w_10.value == null)
                        w_10.value = term.getSubterm(1);
                      else
                        if(w_10.value != term.getSubterm(1) && !w_10.value.match(term.getSubterm(1)))
                          break Fail341;
                      if(x_10.value == null)
                        x_10.value = term.getSubterm(2);
                      else
                        if(x_10.value != term.getSubterm(2) && !x_10.value.match(term.getSubterm(2)))
                          break Fail341;
                      term = g_13;
                      { 
                        IStrategoTerm y_17 = null;
                        IStrategoTerm b_18 = null;
                        IStrategoTerm d_18 = null;
                        IStrategoTerm z_17 = null;
                        IStrategoTerm e_18 = null;
                        IStrategoTerm g_18 = null;
                        IStrategoTerm j_18 = null;
                        b_18 = term;
                        if(h_11.value == null)
                          break Fail335;
                        d_18 = h_11.value;
                        term = add_external_impl_0_9.instance.invokeDynamic(context, d_18, NO_STRATEGIES, new IStrategoTerm[]{c_10.value, d_10.value, e_10.value, f_10.value, g_10.value, h_10.value, transform.constBoolean0, j_10.value, k_10.value});
                        if(term == null)
                          break Fail335;
                        y_17 = term;
                        term = b_18;
                        e_18 = b_18;
                        if(w_10.value == null)
                          break Fail335;
                        g_18 = w_10.value;
                        term = add_external_impl_0_9.instance.invokeDynamic(context, g_18, NO_STRATEGIES, new IStrategoTerm[]{c_10.value, d_10.value, e_10.value, f_10.value, g_10.value, h_10.value, transform.constNone0, j_10.value, k_10.value});
                        if(term == null)
                          break Fail335;
                        z_17 = term;
                        term = e_18;
                        if(x_10.value == null)
                          break Fail335;
                        j_18 = x_10.value;
                        term = add_external_impl_0_9.instance.invokeDynamic(context, j_18, NO_STRATEGIES, new IStrategoTerm[]{c_10.value, d_10.value, e_10.value, f_10.value, g_10.value, h_10.value, transform.constNone0, j_10.value, k_10.value});
                        if(term == null)
                          break Fail335;
                        term = termFactory.makeAppl(transform._consIf_3, new IStrategoTerm[]{y_17, z_17, term});
                        if(true)
                          break Success201;
                      }
                    }
                    term = term63;
                    IStrategoTerm term64 = term;
                    Success202:
                    { 
                      Fail342:
                      { 
                        IStrategoTerm h_13 = null;
                        h_13 = term;
                        if(j_11.value == null)
                          break Fail342;
                        term = j_11.value;
                        if(term.getTermType() != IStrategoTerm.APPL || transform._consAssertStm_1 != ((IStrategoAppl)term).getConstructor())
                          break Fail342;
                        if(h_11.value == null)
                          h_11.value = term.getSubterm(0);
                        else
                          if(h_11.value != term.getSubterm(0) && !h_11.value.match(term.getSubterm(0)))
                            break Fail342;
                        term = h_13;
                        { 
                          IStrategoTerm n_18 = null;
                          if(h_11.value == null)
                            break Fail335;
                          n_18 = h_11.value;
                          term = add_external_impl_0_9.instance.invokeDynamic(context, n_18, NO_STRATEGIES, new IStrategoTerm[]{c_10.value, d_10.value, e_10.value, f_10.value, g_10.value, h_10.value, transform.constBoolean0, j_10.value, k_10.value});
                          if(term == null)
                            break Fail335;
                          term = termFactory.makeAppl(transform._consAssertStm_1, new IStrategoTerm[]{term});
                          if(true)
                            break Success202;
                        }
                      }
                      term = term64;
                      IStrategoTerm term65 = term;
                      Success203:
                      { 
                        Fail343:
                        { 
                          IStrategoTerm i_13 = null;
                          i_13 = term;
                          if(j_11.value == null)
                            break Fail343;
                          term = j_11.value;
                          if(term.getTermType() != IStrategoTerm.APPL || transform._consAssertStm_2 != ((IStrategoAppl)term).getConstructor())
                            break Fail343;
                          if(y_10.value == null)
                            y_10.value = term.getSubterm(0);
                          else
                            if(y_10.value != term.getSubterm(0) && !y_10.value.match(term.getSubterm(0)))
                              break Fail343;
                          if(z_10.value == null)
                            z_10.value = term.getSubterm(1);
                          else
                            if(z_10.value != term.getSubterm(1) && !z_10.value.match(term.getSubterm(1)))
                              break Fail343;
                          term = i_13;
                          { 
                            IStrategoTerm o_18 = null;
                            IStrategoTerm q_18 = null;
                            IStrategoTerm s_18 = null;
                            IStrategoTerm v_18 = null;
                            q_18 = term;
                            if(y_10.value == null)
                              break Fail335;
                            s_18 = y_10.value;
                            term = add_external_impl_0_9.instance.invokeDynamic(context, s_18, NO_STRATEGIES, new IStrategoTerm[]{c_10.value, d_10.value, e_10.value, f_10.value, g_10.value, h_10.value, transform.constBoolean0, j_10.value, k_10.value});
                            if(term == null)
                              break Fail335;
                            o_18 = term;
                            term = q_18;
                            if(z_10.value == null)
                              break Fail335;
                            v_18 = z_10.value;
                            term = add_external_impl_0_9.instance.invokeDynamic(context, v_18, NO_STRATEGIES, new IStrategoTerm[]{c_10.value, d_10.value, e_10.value, f_10.value, g_10.value, h_10.value, transform.constBoolean0, j_10.value, k_10.value});
                            if(term == null)
                              break Fail335;
                            term = termFactory.makeAppl(transform._consAssertStm_2, new IStrategoTerm[]{o_18, term});
                            if(true)
                              break Success203;
                          }
                        }
                        term = term65;
                        IStrategoTerm term66 = term;
                        Success204:
                        { 
                          Fail344:
                          { 
                            IStrategoTerm j_13 = null;
                            j_13 = term;
                            if(j_11.value == null)
                              break Fail344;
                            term = j_11.value;
                            if(term.getTermType() != IStrategoTerm.APPL || transform._consWhile_2 != ((IStrategoAppl)term).getConstructor())
                              break Fail344;
                            if(h_11.value == null)
                              h_11.value = term.getSubterm(0);
                            else
                              if(h_11.value != term.getSubterm(0) && !h_11.value.match(term.getSubterm(0)))
                                break Fail344;
                            if(f_11.value == null)
                              f_11.value = term.getSubterm(1);
                            else
                              if(f_11.value != term.getSubterm(1) && !f_11.value.match(term.getSubterm(1)))
                                break Fail344;
                            term = j_13;
                            { 
                              IStrategoTerm w_18 = null;
                              IStrategoTerm y_18 = null;
                              IStrategoTerm a_19 = null;
                              IStrategoTerm d_19 = null;
                              y_18 = term;
                              if(h_11.value == null)
                                break Fail335;
                              a_19 = h_11.value;
                              term = add_external_impl_0_9.instance.invokeDynamic(context, a_19, NO_STRATEGIES, new IStrategoTerm[]{c_10.value, d_10.value, e_10.value, f_10.value, g_10.value, h_10.value, transform.constBoolean0, j_10.value, k_10.value});
                              if(term == null)
                                break Fail335;
                              w_18 = term;
                              term = y_18;
                              if(f_11.value == null)
                                break Fail335;
                              d_19 = f_11.value;
                              term = add_external_impl_0_9.instance.invokeDynamic(context, d_19, NO_STRATEGIES, new IStrategoTerm[]{c_10.value, d_10.value, e_10.value, f_10.value, g_10.value, h_10.value, transform.constNone0, j_10.value, k_10.value});
                              if(term == null)
                                break Fail335;
                              term = termFactory.makeAppl(transform._consWhile_2, new IStrategoTerm[]{w_18, term});
                              if(true)
                                break Success204;
                            }
                          }
                          term = term66;
                          IStrategoTerm term67 = term;
                          Success205:
                          { 
                            Fail345:
                            { 
                              IStrategoTerm k_13 = null;
                              k_13 = term;
                              if(j_11.value == null)
                                break Fail345;
                              term = j_11.value;
                              if(term.getTermType() != IStrategoTerm.APPL || transform._consDoWhile_2 != ((IStrategoAppl)term).getConstructor())
                                break Fail345;
                              if(f_11.value == null)
                                f_11.value = term.getSubterm(0);
                              else
                                if(f_11.value != term.getSubterm(0) && !f_11.value.match(term.getSubterm(0)))
                                  break Fail345;
                              if(h_11.value == null)
                                h_11.value = term.getSubterm(1);
                              else
                                if(h_11.value != term.getSubterm(1) && !h_11.value.match(term.getSubterm(1)))
                                  break Fail345;
                              term = k_13;
                              { 
                                IStrategoTerm e_19 = null;
                                IStrategoTerm g_19 = null;
                                IStrategoTerm i_19 = null;
                                IStrategoTerm l_19 = null;
                                g_19 = term;
                                if(f_11.value == null)
                                  break Fail335;
                                i_19 = f_11.value;
                                term = add_external_impl_0_9.instance.invokeDynamic(context, i_19, NO_STRATEGIES, new IStrategoTerm[]{c_10.value, d_10.value, e_10.value, f_10.value, g_10.value, h_10.value, transform.constNone0, j_10.value, k_10.value});
                                if(term == null)
                                  break Fail335;
                                e_19 = term;
                                term = g_19;
                                if(h_11.value == null)
                                  break Fail335;
                                l_19 = h_11.value;
                                term = add_external_impl_0_9.instance.invokeDynamic(context, l_19, NO_STRATEGIES, new IStrategoTerm[]{c_10.value, d_10.value, e_10.value, f_10.value, g_10.value, h_10.value, transform.constBoolean0, j_10.value, k_10.value});
                                if(term == null)
                                  break Fail335;
                                term = termFactory.makeAppl(transform._consDoWhile_2, new IStrategoTerm[]{e_19, term});
                                if(true)
                                  break Success205;
                              }
                            }
                            term = term67;
                            IStrategoTerm term68 = term;
                            Success206:
                            { 
                              Fail346:
                              { 
                                IStrategoTerm l_13 = null;
                                l_13 = term;
                                if(j_11.value == null)
                                  break Fail346;
                                term = j_11.value;
                                if(term.getTermType() != IStrategoTerm.APPL || transform._consFor_4 != ((IStrategoAppl)term).getConstructor())
                                  break Fail346;
                                if(a_11.value == null)
                                  a_11.value = term.getSubterm(0);
                                else
                                  if(a_11.value != term.getSubterm(0) && !a_11.value.match(term.getSubterm(0)))
                                    break Fail346;
                                if(h_11.value == null)
                                  h_11.value = term.getSubterm(1);
                                else
                                  if(h_11.value != term.getSubterm(1) && !h_11.value.match(term.getSubterm(1)))
                                    break Fail346;
                                if(b_11.value == null)
                                  b_11.value = term.getSubterm(2);
                                else
                                  if(b_11.value != term.getSubterm(2) && !b_11.value.match(term.getSubterm(2)))
                                    break Fail346;
                                if(f_11.value == null)
                                  f_11.value = term.getSubterm(3);
                                else
                                  if(f_11.value != term.getSubterm(3) && !f_11.value.match(term.getSubterm(3)))
                                    break Fail346;
                                term = l_13;
                                { 
                                  IStrategoTerm m_19 = null;
                                  IStrategoTerm q_19 = null;
                                  IStrategoTerm s_19 = null;
                                  IStrategoTerm n_19 = null;
                                  IStrategoTerm t_19 = null;
                                  IStrategoTerm v_19 = null;
                                  IStrategoTerm o_19 = null;
                                  IStrategoTerm w_19 = null;
                                  IStrategoTerm y_19 = null;
                                  IStrategoTerm b_20 = null;
                                  q_19 = term;
                                  if(a_11.value == null)
                                    break Fail335;
                                  s_19 = a_11.value;
                                  term = add_external_impl_0_9.instance.invokeDynamic(context, s_19, NO_STRATEGIES, new IStrategoTerm[]{c_10.value, d_10.value, e_10.value, f_10.value, g_10.value, h_10.value, transform.constNone0, j_10.value, k_10.value});
                                  if(term == null)
                                    break Fail335;
                                  m_19 = term;
                                  term = q_19;
                                  t_19 = q_19;
                                  if(h_11.value == null)
                                    break Fail335;
                                  v_19 = h_11.value;
                                  term = add_external_impl_0_9.instance.invokeDynamic(context, v_19, NO_STRATEGIES, new IStrategoTerm[]{c_10.value, d_10.value, e_10.value, f_10.value, g_10.value, h_10.value, transform.constBoolean0, j_10.value, k_10.value});
                                  if(term == null)
                                    break Fail335;
                                  n_19 = term;
                                  term = t_19;
                                  w_19 = t_19;
                                  if(b_11.value == null)
                                    break Fail335;
                                  y_19 = b_11.value;
                                  term = add_external_impl_0_9.instance.invokeDynamic(context, y_19, NO_STRATEGIES, new IStrategoTerm[]{c_10.value, d_10.value, e_10.value, f_10.value, g_10.value, h_10.value, transform.constNone0, j_10.value, k_10.value});
                                  if(term == null)
                                    break Fail335;
                                  o_19 = term;
                                  term = w_19;
                                  if(f_11.value == null)
                                    break Fail335;
                                  b_20 = f_11.value;
                                  term = add_external_impl_0_9.instance.invokeDynamic(context, b_20, NO_STRATEGIES, new IStrategoTerm[]{c_10.value, d_10.value, e_10.value, f_10.value, g_10.value, h_10.value, transform.constNone0, j_10.value, k_10.value});
                                  if(term == null)
                                    break Fail335;
                                  term = termFactory.makeAppl(transform._consFor_4, new IStrategoTerm[]{m_19, n_19, o_19, term});
                                  if(true)
                                    break Success206;
                                }
                              }
                              term = term68;
                              IStrategoTerm term69 = term;
                              Success207:
                              { 
                                Fail347:
                                { 
                                  IStrategoTerm m_13 = null;
                                  m_13 = term;
                                  if(j_11.value == null)
                                    break Fail347;
                                  term = j_11.value;
                                  if(term.getTermType() != IStrategoTerm.APPL || transform._consFor_4 != ((IStrategoAppl)term).getConstructor())
                                    break Fail347;
                                  if(c_11.value == null)
                                    c_11.value = term.getSubterm(0);
                                  else
                                    if(c_11.value != term.getSubterm(0) && !c_11.value.match(term.getSubterm(0)))
                                      break Fail347;
                                  if(h_11.value == null)
                                    h_11.value = term.getSubterm(1);
                                  else
                                    if(h_11.value != term.getSubterm(1) && !h_11.value.match(term.getSubterm(1)))
                                      break Fail347;
                                  if(d_11.value == null)
                                    d_11.value = term.getSubterm(2);
                                  else
                                    if(d_11.value != term.getSubterm(2) && !d_11.value.match(term.getSubterm(2)))
                                      break Fail347;
                                  if(f_11.value == null)
                                    f_11.value = term.getSubterm(3);
                                  else
                                    if(f_11.value != term.getSubterm(3) && !f_11.value.match(term.getSubterm(3)))
                                      break Fail347;
                                  term = m_13;
                                  { 
                                    IStrategoTerm c_20 = null;
                                    IStrategoTerm g_20 = null;
                                    IStrategoTerm i_20 = null;
                                    IStrategoTerm d_20 = null;
                                    IStrategoTerm j_20 = null;
                                    IStrategoTerm l_20 = null;
                                    IStrategoTerm e_20 = null;
                                    IStrategoTerm m_20 = null;
                                    IStrategoTerm o_20 = null;
                                    IStrategoTerm r_20 = null;
                                    g_20 = term;
                                    if(c_11.value == null)
                                      break Fail335;
                                    i_20 = c_11.value;
                                    term = add_external_impl_0_9.instance.invokeDynamic(context, i_20, NO_STRATEGIES, new IStrategoTerm[]{c_10.value, d_10.value, e_10.value, f_10.value, g_10.value, h_10.value, transform.constNone0, j_10.value, k_10.value});
                                    if(term == null)
                                      break Fail335;
                                    c_20 = term;
                                    term = g_20;
                                    j_20 = g_20;
                                    if(h_11.value == null)
                                      break Fail335;
                                    l_20 = h_11.value;
                                    term = add_external_impl_0_9.instance.invokeDynamic(context, l_20, NO_STRATEGIES, new IStrategoTerm[]{c_10.value, d_10.value, e_10.value, f_10.value, g_10.value, h_10.value, transform.constBoolean0, j_10.value, k_10.value});
                                    if(term == null)
                                      break Fail335;
                                    d_20 = term;
                                    term = j_20;
                                    m_20 = j_20;
                                    if(d_11.value == null)
                                      break Fail335;
                                    o_20 = d_11.value;
                                    term = add_external_impl_0_9.instance.invokeDynamic(context, o_20, NO_STRATEGIES, new IStrategoTerm[]{c_10.value, d_10.value, e_10.value, f_10.value, g_10.value, h_10.value, transform.constNone0, j_10.value, k_10.value});
                                    if(term == null)
                                      break Fail335;
                                    e_20 = term;
                                    term = m_20;
                                    if(f_11.value == null)
                                      break Fail335;
                                    r_20 = f_11.value;
                                    term = add_external_impl_0_9.instance.invokeDynamic(context, r_20, NO_STRATEGIES, new IStrategoTerm[]{c_10.value, d_10.value, e_10.value, f_10.value, g_10.value, h_10.value, transform.constNone0, j_10.value, k_10.value});
                                    if(term == null)
                                      break Fail335;
                                    term = termFactory.makeAppl(transform._consFor_4, new IStrategoTerm[]{c_20, d_20, e_20, term});
                                    if(true)
                                      break Success207;
                                  }
                                }
                                term = term69;
                                IStrategoTerm term70 = term;
                                Success208:
                                { 
                                  Fail348:
                                  { 
                                    IStrategoTerm n_13 = null;
                                    n_13 = term;
                                    if(j_11.value == null)
                                      break Fail348;
                                    term = j_11.value;
                                    if(term.getTermType() != IStrategoTerm.APPL || transform._consForEach_3 != ((IStrategoAppl)term).getConstructor())
                                      break Fail348;
                                    if(e_11.value == null)
                                      e_11.value = term.getSubterm(0);
                                    else
                                      if(e_11.value != term.getSubterm(0) && !e_11.value.match(term.getSubterm(0)))
                                        break Fail348;
                                    if(h_11.value == null)
                                      h_11.value = term.getSubterm(1);
                                    else
                                      if(h_11.value != term.getSubterm(1) && !h_11.value.match(term.getSubterm(1)))
                                        break Fail348;
                                    if(f_11.value == null)
                                      f_11.value = term.getSubterm(2);
                                    else
                                      if(f_11.value != term.getSubterm(2) && !f_11.value.match(term.getSubterm(2)))
                                        break Fail348;
                                    term = n_13;
                                    { 
                                      IStrategoTerm s_20 = null;
                                      IStrategoTerm v_20 = null;
                                      IStrategoTerm x_20 = null;
                                      IStrategoTerm t_20 = null;
                                      IStrategoTerm y_20 = null;
                                      IStrategoTerm a_21 = null;
                                      IStrategoTerm d_21 = null;
                                      v_20 = term;
                                      if(e_11.value == null)
                                        break Fail335;
                                      x_20 = e_11.value;
                                      term = add_external_impl_0_9.instance.invokeDynamic(context, x_20, NO_STRATEGIES, new IStrategoTerm[]{c_10.value, d_10.value, e_10.value, f_10.value, g_10.value, h_10.value, transform.constNone0, j_10.value, k_10.value});
                                      if(term == null)
                                        break Fail335;
                                      s_20 = term;
                                      term = v_20;
                                      y_20 = v_20;
                                      if(h_11.value == null)
                                        break Fail335;
                                      a_21 = h_11.value;
                                      term = add_external_impl_0_9.instance.invokeDynamic(context, a_21, NO_STRATEGIES, new IStrategoTerm[]{c_10.value, d_10.value, e_10.value, f_10.value, g_10.value, h_10.value, transform.constNone0, j_10.value, k_10.value});
                                      if(term == null)
                                        break Fail335;
                                      t_20 = term;
                                      term = y_20;
                                      if(f_11.value == null)
                                        break Fail335;
                                      d_21 = f_11.value;
                                      term = add_external_impl_0_9.instance.invokeDynamic(context, d_21, NO_STRATEGIES, new IStrategoTerm[]{c_10.value, d_10.value, e_10.value, f_10.value, g_10.value, h_10.value, transform.constNone0, j_10.value, k_10.value});
                                      if(term == null)
                                        break Fail335;
                                      term = termFactory.makeAppl(transform._consForEach_3, new IStrategoTerm[]{s_20, t_20, term});
                                      if(true)
                                        break Success208;
                                    }
                                  }
                                  term = term70;
                                  IStrategoTerm term71 = term;
                                  Success209:
                                  { 
                                    Fail349:
                                    { 
                                      IStrategoTerm o_13 = null;
                                      o_13 = term;
                                      if(j_11.value == null)
                                        break Fail349;
                                      term = j_11.value;
                                      if(term.getTermType() != IStrategoTerm.APPL || transform._consCastPrim_2 != ((IStrategoAppl)term).getConstructor())
                                        break Fail349;
                                      if(g_11.value == null)
                                        g_11.value = term.getSubterm(0);
                                      else
                                        if(g_11.value != term.getSubterm(0) && !g_11.value.match(term.getSubterm(0)))
                                          break Fail349;
                                      if(h_11.value == null)
                                        h_11.value = term.getSubterm(1);
                                      else
                                        if(h_11.value != term.getSubterm(1) && !h_11.value.match(term.getSubterm(1)))
                                          break Fail349;
                                      term = o_13;
                                      { 
                                        IStrategoTerm e_21 = null;
                                        IStrategoTerm f_21 = null;
                                        IStrategoTerm h_21 = null;
                                        f_21 = term;
                                        if(h_11.value == null)
                                          break Fail335;
                                        h_21 = h_11.value;
                                        term = add_external_impl_0_9.instance.invokeDynamic(context, h_21, NO_STRATEGIES, new IStrategoTerm[]{c_10.value, d_10.value, e_10.value, f_10.value, g_10.value, h_10.value, transform.constNone0, j_10.value, k_10.value});
                                        if(term == null)
                                          break Fail335;
                                        e_21 = term;
                                        term = f_21;
                                        if(g_11.value == null)
                                          break Fail335;
                                        term = termFactory.makeAppl(transform._consCastPrim_2, new IStrategoTerm[]{g_11.value, e_21});
                                        if(true)
                                          break Success209;
                                      }
                                    }
                                    term = term71;
                                    IStrategoTerm term72 = term;
                                    Success210:
                                    { 
                                      Fail350:
                                      { 
                                        IStrategoTerm p_13 = null;
                                        p_13 = term;
                                        if(j_11.value == null)
                                          break Fail350;
                                        term = j_11.value;
                                        if(term.getTermType() != IStrategoTerm.APPL || transform._consCastRef_2 != ((IStrategoAppl)term).getConstructor())
                                          break Fail350;
                                        if(g_11.value == null)
                                          g_11.value = term.getSubterm(0);
                                        else
                                          if(g_11.value != term.getSubterm(0) && !g_11.value.match(term.getSubterm(0)))
                                            break Fail350;
                                        if(h_11.value == null)
                                          h_11.value = term.getSubterm(1);
                                        else
                                          if(h_11.value != term.getSubterm(1) && !h_11.value.match(term.getSubterm(1)))
                                            break Fail350;
                                        term = p_13;
                                        { 
                                          IStrategoTerm i_21 = null;
                                          IStrategoTerm j_21 = null;
                                          IStrategoTerm l_21 = null;
                                          j_21 = term;
                                          if(h_11.value == null)
                                            break Fail335;
                                          l_21 = h_11.value;
                                          term = add_external_impl_0_9.instance.invokeDynamic(context, l_21, NO_STRATEGIES, new IStrategoTerm[]{c_10.value, d_10.value, e_10.value, f_10.value, g_10.value, h_10.value, transform.constNone0, j_10.value, k_10.value});
                                          if(term == null)
                                            break Fail335;
                                          i_21 = term;
                                          term = j_21;
                                          if(g_11.value == null)
                                            break Fail335;
                                          term = termFactory.makeAppl(transform._consCastRef_2, new IStrategoTerm[]{g_11.value, i_21});
                                          if(true)
                                            break Success210;
                                        }
                                      }
                                      term = term72;
                                      if(i_11.value == null)
                                        break Fail335;
                                      term = i_11.value;
                                      lifted49 lifted490 = new lifted49();
                                      lifted490.c_10 = c_10;
                                      lifted490.d_10 = d_10;
                                      lifted490.e_10 = e_10;
                                      lifted490.f_10 = f_10;
                                      lifted490.g_10 = g_10;
                                      lifted490.h_10 = h_10;
                                      lifted490.i_10 = i_10;
                                      lifted490.j_10 = j_10;
                                      lifted490.k_10 = k_10;
                                      term = SRTS_all.instance.invoke(context, term, lifted490);
                                      if(term == null)
                                        break Fail335;
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
    TermReference c_10;

    TermReference d_10;

    TermReference e_10;

    TermReference f_10;

    TermReference g_10;

    TermReference h_10;

    TermReference i_10;

    TermReference j_10;

    TermReference k_10;

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      Fail351:
      { 
        term = add_external_impl_0_9.instance.invokeDynamic(context, term, NO_STRATEGIES, new IStrategoTerm[]{c_10.value, d_10.value, e_10.value, f_10.value, g_10.value, h_10.value, i_10.value, j_10.value, k_10.value});
        if(term == null)
          break Fail351;
        if(true)
          return term;
      }
      return null;
    }
  }

  @SuppressWarnings("all") private static final class lifted48 extends Strategy 
  { 
    TermReference c_10;

    TermReference d_10;

    TermReference e_10;

    TermReference f_10;

    TermReference g_10;

    TermReference h_10;

    TermReference j_10;

    TermReference k_10;

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      Fail352:
      { 
        IStrategoTerm p_17 = null;
        p_17 = term;
        term = add_external_impl_0_9.instance.invokeDynamic(context, p_17, NO_STRATEGIES, new IStrategoTerm[]{c_10.value, d_10.value, e_10.value, f_10.value, g_10.value, h_10.value, transform.constBoolean0, j_10.value, k_10.value});
        if(term == null)
          break Fail352;
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
      Fail353:
      { 
        if(term.getTermType() != IStrategoTerm.APPL || transform._consLazyOr_2 != ((IStrategoAppl)term).getConstructor())
          break Fail353;
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
      Fail354:
      { 
        if(term.getTermType() != IStrategoTerm.APPL || transform._consLazyAnd_2 != ((IStrategoAppl)term).getConstructor())
          break Fail354;
        if(true)
          return term;
      }
      return null;
    }
  }

  @SuppressWarnings("all") private static final class lifted45 extends Strategy 
  { 
    TermReference i_11;

    TermReference i_10;

    TermReference c_10;

    TermReference d_10;

    TermReference e_10;

    TermReference f_10;

    TermReference g_10;

    TermReference h_10;

    TermReference j_10;

    TermReference k_10;

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      Fail355:
      { 
        IStrategoTerm t_15 = null;
        t_15 = term;
        if(i_11.value == null)
          break Fail355;
        term = type_of_0_3.instance.invoke(context, i_11.value, i_10.value, c_10.value, d_10.value);
        if(term == null)
          break Fail355;
        term = add_external_impl_0_9.instance.invokeDynamic(context, t_15, NO_STRATEGIES, new IStrategoTerm[]{c_10.value, d_10.value, e_10.value, f_10.value, g_10.value, h_10.value, term, j_10.value, k_10.value});
        if(term == null)
          break Fail355;
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
      Fail356:
      { 
        if(term.getTermType() != IStrategoTerm.APPL || transform._consComplement_1 != ((IStrategoAppl)term).getConstructor())
          break Fail356;
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
      Fail357:
      { 
        term = or_2_0.instance.invoke(context, term, lifted42.instance, lifted43.instance);
        if(term == null)
          break Fail357;
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
      Fail358:
      { 
        if(term.getTermType() != IStrategoTerm.APPL || transform._consPlus_1 != ((IStrategoAppl)term).getConstructor())
          break Fail358;
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
      Fail359:
      { 
        if(term.getTermType() != IStrategoTerm.APPL || transform._consMinus_1 != ((IStrategoAppl)term).getConstructor())
          break Fail359;
        if(true)
          return term;
      }
      return null;
    }
  }

  @SuppressWarnings("all") private static final class lifted40 extends Strategy 
  { 
    TermReference c_10;

    TermReference d_10;

    TermReference e_10;

    TermReference f_10;

    TermReference g_10;

    TermReference h_10;

    TermReference j_10;

    TermReference k_10;

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      Fail360:
      { 
        IStrategoTerm r_15 = null;
        r_15 = term;
        term = add_external_impl_0_9.instance.invokeDynamic(context, r_15, NO_STRATEGIES, new IStrategoTerm[]{c_10.value, d_10.value, e_10.value, f_10.value, g_10.value, h_10.value, transform.constBoolean0, j_10.value, k_10.value});
        if(term == null)
          break Fail360;
        if(true)
          return term;
      }
      return null;
    }
  }

  @SuppressWarnings("all") private static final class lifted39 extends Strategy 
  { 
    TermReference i_10;

    TermReference c_10;

    TermReference d_10;

    TermReference e_10;

    TermReference f_10;

    TermReference g_10;

    TermReference h_10;

    TermReference j_10;

    TermReference k_10;

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      Fail361:
      { 
        IStrategoTerm p_14 = null;
        p_14 = term;
        if(i_10.value == null)
          break Fail361;
        term = cast_bounded_arithmetic_type_0_0.instance.invoke(context, i_10.value);
        if(term == null)
          break Fail361;
        term = add_external_impl_0_9.instance.invokeDynamic(context, p_14, NO_STRATEGIES, new IStrategoTerm[]{c_10.value, d_10.value, e_10.value, f_10.value, g_10.value, h_10.value, term, j_10.value, k_10.value});
        if(term == null)
          break Fail361;
        if(true)
          return term;
      }
      return null;
    }
  }

  @SuppressWarnings("all") private static final class lifted38 extends Strategy 
  { 
    TermReference c_10;

    TermReference d_10;

    TermReference e_10;

    TermReference f_10;

    TermReference g_10;

    TermReference h_10;

    TermReference j_10;

    TermReference k_10;

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      Fail362:
      { 
        IStrategoTerm n_14 = null;
        n_14 = term;
        term = add_external_impl_0_9.instance.invokeDynamic(context, n_14, NO_STRATEGIES, new IStrategoTerm[]{c_10.value, d_10.value, e_10.value, f_10.value, g_10.value, h_10.value, transform.constDouble0, j_10.value, k_10.value});
        if(term == null)
          break Fail362;
        if(true)
          return term;
      }
      return null;
    }
  }

  @SuppressWarnings("all") private static final class lifted37 extends Strategy 
  { 
    TermReference y_10;

    TermReference z_10;

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      Fail363:
      { 
        if(term.getTermType() != IStrategoTerm.APPL || transform._consRemain_2 != ((IStrategoAppl)term).getConstructor())
          break Fail363;
        if(y_10.value == null)
          y_10.value = term.getSubterm(0);
        else
          if(y_10.value != term.getSubterm(0) && !y_10.value.match(term.getSubterm(0)))
            break Fail363;
        if(z_10.value == null)
          z_10.value = term.getSubterm(1);
        else
          if(z_10.value != term.getSubterm(1) && !z_10.value.match(term.getSubterm(1)))
            break Fail363;
        if(true)
          return term;
      }
      return null;
    }
  }

  @SuppressWarnings("all") private static final class lifted30 extends Strategy 
  { 
    TermReference y_10;

    TermReference z_10;

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      Fail364:
      { 
        lifted34 lifted340 = new lifted34();
        lifted31 lifted311 = new lifted31();
        lifted340.y_10 = y_10;
        lifted340.z_10 = z_10;
        lifted311.y_10 = y_10;
        lifted311.z_10 = z_10;
        term = or_2_0.instance.invoke(context, term, lifted311, lifted340);
        if(term == null)
          break Fail364;
        if(true)
          return term;
      }
      return null;
    }
  }

  @SuppressWarnings("all") private static final class lifted34 extends Strategy 
  { 
    TermReference y_10;

    TermReference z_10;

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      Fail365:
      { 
        lifted36 lifted360 = new lifted36();
        lifted35 lifted350 = new lifted35();
        lifted360.y_10 = y_10;
        lifted360.z_10 = z_10;
        lifted350.y_10 = y_10;
        lifted350.z_10 = z_10;
        term = or_2_0.instance.invoke(context, term, lifted350, lifted360);
        if(term == null)
          break Fail365;
        if(true)
          return term;
      }
      return null;
    }
  }

  @SuppressWarnings("all") private static final class lifted36 extends Strategy 
  { 
    TermReference y_10;

    TermReference z_10;

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      Fail366:
      { 
        if(term.getTermType() != IStrategoTerm.APPL || transform._consDiv_2 != ((IStrategoAppl)term).getConstructor())
          break Fail366;
        if(y_10.value == null)
          y_10.value = term.getSubterm(0);
        else
          if(y_10.value != term.getSubterm(0) && !y_10.value.match(term.getSubterm(0)))
            break Fail366;
        if(z_10.value == null)
          z_10.value = term.getSubterm(1);
        else
          if(z_10.value != term.getSubterm(1) && !z_10.value.match(term.getSubterm(1)))
            break Fail366;
        if(true)
          return term;
      }
      return null;
    }
  }

  @SuppressWarnings("all") private static final class lifted35 extends Strategy 
  { 
    TermReference y_10;

    TermReference z_10;

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      Fail367:
      { 
        if(term.getTermType() != IStrategoTerm.APPL || transform._consMul_2 != ((IStrategoAppl)term).getConstructor())
          break Fail367;
        if(y_10.value == null)
          y_10.value = term.getSubterm(0);
        else
          if(y_10.value != term.getSubterm(0) && !y_10.value.match(term.getSubterm(0)))
            break Fail367;
        if(z_10.value == null)
          z_10.value = term.getSubterm(1);
        else
          if(z_10.value != term.getSubterm(1) && !z_10.value.match(term.getSubterm(1)))
            break Fail367;
        if(true)
          return term;
      }
      return null;
    }
  }

  @SuppressWarnings("all") private static final class lifted31 extends Strategy 
  { 
    TermReference y_10;

    TermReference z_10;

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      Fail368:
      { 
        lifted33 lifted330 = new lifted33();
        lifted32 lifted320 = new lifted32();
        lifted330.y_10 = y_10;
        lifted330.z_10 = z_10;
        lifted320.y_10 = y_10;
        lifted320.z_10 = z_10;
        term = or_2_0.instance.invoke(context, term, lifted320, lifted330);
        if(term == null)
          break Fail368;
        if(true)
          return term;
      }
      return null;
    }
  }

  @SuppressWarnings("all") private static final class lifted33 extends Strategy 
  { 
    TermReference y_10;

    TermReference z_10;

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      Fail369:
      { 
        if(term.getTermType() != IStrategoTerm.APPL || transform._consMinus_2 != ((IStrategoAppl)term).getConstructor())
          break Fail369;
        if(y_10.value == null)
          y_10.value = term.getSubterm(0);
        else
          if(y_10.value != term.getSubterm(0) && !y_10.value.match(term.getSubterm(0)))
            break Fail369;
        if(z_10.value == null)
          z_10.value = term.getSubterm(1);
        else
          if(z_10.value != term.getSubterm(1) && !z_10.value.match(term.getSubterm(1)))
            break Fail369;
        if(true)
          return term;
      }
      return null;
    }
  }

  @SuppressWarnings("all") private static final class lifted32 extends Strategy 
  { 
    TermReference y_10;

    TermReference z_10;

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      Fail370:
      { 
        if(term.getTermType() != IStrategoTerm.APPL || transform._consPlus_2 != ((IStrategoAppl)term).getConstructor())
          break Fail370;
        if(y_10.value == null)
          y_10.value = term.getSubterm(0);
        else
          if(y_10.value != term.getSubterm(0) && !y_10.value.match(term.getSubterm(0)))
            break Fail370;
        if(z_10.value == null)
          z_10.value = term.getSubterm(1);
        else
          if(z_10.value != term.getSubterm(1) && !z_10.value.match(term.getSubterm(1)))
            break Fail370;
        if(true)
          return term;
      }
      return null;
    }
  }

  @SuppressWarnings("all") private static final class lifted29 extends Strategy 
  { 
    TermReference c_10;

    TermReference d_10;

    TermReference e_10;

    TermReference f_10;

    TermReference g_10;

    TermReference h_10;

    TermReference j_10;

    TermReference k_10;

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      Fail371:
      { 
        IStrategoTerm l_14 = null;
        l_14 = term;
        term = add_external_impl_0_9.instance.invokeDynamic(context, l_14, NO_STRATEGIES, new IStrategoTerm[]{c_10.value, d_10.value, e_10.value, f_10.value, g_10.value, h_10.value, transform.constDouble0, j_10.value, k_10.value});
        if(term == null)
          break Fail371;
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
      Fail372:
      { 
        term = or_2_0.instance.invoke(context, term, lifted27.instance, lifted28.instance);
        if(term == null)
          break Fail372;
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
      Fail373:
      { 
        if(term.getTermType() != IStrategoTerm.APPL || transform._consGtEq_2 != ((IStrategoAppl)term).getConstructor())
          break Fail373;
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
      Fail374:
      { 
        if(term.getTermType() != IStrategoTerm.APPL || transform._consGt_2 != ((IStrategoAppl)term).getConstructor())
          break Fail374;
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
      Fail375:
      { 
        term = or_2_0.instance.invoke(context, term, lifted24.instance, lifted25.instance);
        if(term == null)
          break Fail375;
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
      Fail376:
      { 
        if(term.getTermType() != IStrategoTerm.APPL || transform._consLtEq_2 != ((IStrategoAppl)term).getConstructor())
          break Fail376;
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
      Fail377:
      { 
        if(term.getTermType() != IStrategoTerm.APPL || transform._consLt_2 != ((IStrategoAppl)term).getConstructor())
          break Fail377;
        if(true)
          return term;
      }
      return null;
    }
  }

  @SuppressWarnings("all") private static final class lifted22 extends Strategy 
  { 
    TermReference i_10;

    TermReference c_10;

    TermReference d_10;

    TermReference e_10;

    TermReference f_10;

    TermReference g_10;

    TermReference h_10;

    TermReference j_10;

    TermReference k_10;

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      Fail378:
      { 
        IStrategoTerm j_14 = null;
        j_14 = term;
        if(i_10.value == null)
          break Fail378;
        term = cast_bounded_conditional_type_0_0.instance.invoke(context, i_10.value);
        if(term == null)
          break Fail378;
        term = add_external_impl_0_9.instance.invokeDynamic(context, j_14, NO_STRATEGIES, new IStrategoTerm[]{c_10.value, d_10.value, e_10.value, f_10.value, g_10.value, h_10.value, term, j_10.value, k_10.value});
        if(term == null)
          break Fail378;
        if(true)
          return term;
      }
      return null;
    }
  }

  @SuppressWarnings("all") private static final class lifted21 extends Strategy 
  { 
    TermReference y_10;

    TermReference z_10;

    TermReference i_10;

    TermReference c_10;

    TermReference d_10;

    TermReference e_10;

    TermReference f_10;

    TermReference g_10;

    TermReference h_10;

    TermReference j_10;

    TermReference k_10;

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      ITermFactory termFactory = context.getFactory();
      Fail379:
      { 
        IStrategoTerm h_14 = null;
        h_14 = term;
        if(y_10.value == null || z_10.value == null)
          break Fail379;
        term = termFactory.makeTuple(y_10.value, z_10.value);
        term = try_to_get_type_0_3.instance.invoke(context, term, i_10.value, c_10.value, d_10.value);
        if(term == null)
          break Fail379;
        term = cast_conditional_type_0_0.instance.invoke(context, term);
        if(term == null)
          break Fail379;
        term = add_external_impl_0_9.instance.invokeDynamic(context, h_14, NO_STRATEGIES, new IStrategoTerm[]{c_10.value, d_10.value, e_10.value, f_10.value, g_10.value, h_10.value, term, j_10.value, k_10.value});
        if(term == null)
          break Fail379;
        if(true)
          return term;
      }
      return null;
    }
  }

  @SuppressWarnings("all") private static final class lifted20 extends Strategy 
  { 
    TermReference y_10;

    TermReference z_10;

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      Fail380:
      { 
        if(term.getTermType() != IStrategoTerm.APPL || transform._consAnd_2 != ((IStrategoAppl)term).getConstructor())
          break Fail380;
        if(y_10.value == null)
          y_10.value = term.getSubterm(0);
        else
          if(y_10.value != term.getSubterm(0) && !y_10.value.match(term.getSubterm(0)))
            break Fail380;
        if(z_10.value == null)
          z_10.value = term.getSubterm(1);
        else
          if(z_10.value != term.getSubterm(1) && !z_10.value.match(term.getSubterm(1)))
            break Fail380;
        if(true)
          return term;
      }
      return null;
    }
  }

  @SuppressWarnings("all") private static final class lifted17 extends Strategy 
  { 
    TermReference y_10;

    TermReference z_10;

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      Fail381:
      { 
        lifted19 lifted190 = new lifted19();
        lifted18 lifted180 = new lifted18();
        lifted190.y_10 = y_10;
        lifted190.z_10 = z_10;
        lifted180.y_10 = y_10;
        lifted180.z_10 = z_10;
        term = or_2_0.instance.invoke(context, term, lifted180, lifted190);
        if(term == null)
          break Fail381;
        if(true)
          return term;
      }
      return null;
    }
  }

  @SuppressWarnings("all") private static final class lifted19 extends Strategy 
  { 
    TermReference y_10;

    TermReference z_10;

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      Fail382:
      { 
        if(term.getTermType() != IStrategoTerm.APPL || transform._consExcOr_2 != ((IStrategoAppl)term).getConstructor())
          break Fail382;
        if(y_10.value == null)
          y_10.value = term.getSubterm(0);
        else
          if(y_10.value != term.getSubterm(0) && !y_10.value.match(term.getSubterm(0)))
            break Fail382;
        if(z_10.value == null)
          z_10.value = term.getSubterm(1);
        else
          if(z_10.value != term.getSubterm(1) && !z_10.value.match(term.getSubterm(1)))
            break Fail382;
        if(true)
          return term;
      }
      return null;
    }
  }

  @SuppressWarnings("all") private static final class lifted18 extends Strategy 
  { 
    TermReference y_10;

    TermReference z_10;

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      Fail383:
      { 
        if(term.getTermType() != IStrategoTerm.APPL || transform._consOr_2 != ((IStrategoAppl)term).getConstructor())
          break Fail383;
        if(y_10.value == null)
          y_10.value = term.getSubterm(0);
        else
          if(y_10.value != term.getSubterm(0) && !y_10.value.match(term.getSubterm(0)))
            break Fail383;
        if(z_10.value == null)
          z_10.value = term.getSubterm(1);
        else
          if(z_10.value != term.getSubterm(1) && !z_10.value.match(term.getSubterm(1)))
            break Fail383;
        if(true)
          return term;
      }
      return null;
    }
  }

  @SuppressWarnings("all") private static final class lifted16 extends Strategy 
  { 
    TermReference y_10;

    TermReference z_10;

    TermReference c_10;

    TermReference d_10;

    TermReference e_10;

    TermReference f_10;

    TermReference g_10;

    TermReference h_10;

    TermReference j_10;

    TermReference k_10;

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      ITermFactory termFactory = context.getFactory();
      Fail384:
      { 
        IStrategoTerm d_14 = null;
        IStrategoTerm f_14 = null;
        d_14 = term;
        if(y_10.value == null || z_10.value == null)
          break Fail384;
        term = termFactory.makeTuple(y_10.value, z_10.value);
        f_14 = term;
        term = try_to_get_type_0_3.instance.invoke(context, f_14, transform.constNone0, c_10.value, d_10.value);
        if(term == null)
          break Fail384;
        term = cast_equality_type_0_0.instance.invoke(context, term);
        if(term == null)
          break Fail384;
        term = add_external_impl_0_9.instance.invokeDynamic(context, d_14, NO_STRATEGIES, new IStrategoTerm[]{c_10.value, d_10.value, e_10.value, f_10.value, g_10.value, h_10.value, term, j_10.value, k_10.value});
        if(term == null)
          break Fail384;
        if(true)
          return term;
      }
      return null;
    }
  }

  @SuppressWarnings("all") private static final class lifted15 extends Strategy 
  { 
    TermReference y_10;

    TermReference z_10;

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      Fail385:
      { 
        if(term.getTermType() != IStrategoTerm.APPL || transform._consNotEq_2 != ((IStrategoAppl)term).getConstructor())
          break Fail385;
        if(y_10.value == null)
          y_10.value = term.getSubterm(0);
        else
          if(y_10.value != term.getSubterm(0) && !y_10.value.match(term.getSubterm(0)))
            break Fail385;
        if(z_10.value == null)
          z_10.value = term.getSubterm(1);
        else
          if(z_10.value != term.getSubterm(1) && !z_10.value.match(term.getSubterm(1)))
            break Fail385;
        if(true)
          return term;
      }
      return null;
    }
  }

  @SuppressWarnings("all") private static final class lifted14 extends Strategy 
  { 
    TermReference y_10;

    TermReference z_10;

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      Fail386:
      { 
        if(term.getTermType() != IStrategoTerm.APPL || transform._consEq_2 != ((IStrategoAppl)term).getConstructor())
          break Fail386;
        if(y_10.value == null)
          y_10.value = term.getSubterm(0);
        else
          if(y_10.value != term.getSubterm(0) && !y_10.value.match(term.getSubterm(0)))
            break Fail386;
        if(z_10.value == null)
          z_10.value = term.getSubterm(1);
        else
          if(z_10.value != term.getSubterm(1) && !z_10.value.match(term.getSubterm(1)))
            break Fail386;
        if(true)
          return term;
      }
      return null;
    }
  }

  @SuppressWarnings("all") private static final class lifted13 extends Strategy 
  { 
    TermReference c_10;

    TermReference d_10;

    TermReference e_10;

    TermReference f_10;

    TermReference g_10;

    TermReference h_10;

    TermReference g_11;

    TermReference j_10;

    TermReference k_10;

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      Fail387:
      { 
        term = add_external_impl_0_9.instance.invokeDynamic(context, term, NO_STRATEGIES, new IStrategoTerm[]{c_10.value, d_10.value, e_10.value, f_10.value, g_10.value, h_10.value, g_11.value, j_10.value, k_10.value});
        if(term == null)
          break Fail387;
        if(true)
          return term;
      }
      return null;
    }
  }

  @SuppressWarnings("all") private static final class lifted12 extends Strategy 
  { 
    TermReference g_11;

    TermReference r_10;

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      Fail388:
      { 
        if(term.getTermType() != IStrategoTerm.APPL || transform._consLocalVarDec_3 != ((IStrategoAppl)term).getConstructor())
          break Fail388;
        if(g_11.value == null)
          g_11.value = term.getSubterm(1);
        else
          if(g_11.value != term.getSubterm(1) && !g_11.value.match(term.getSubterm(1)))
            break Fail388;
        if(r_10.value == null)
          r_10.value = term.getSubterm(2);
        else
          if(r_10.value != term.getSubterm(2) && !r_10.value.match(term.getSubterm(2)))
            break Fail388;
        if(true)
          return term;
      }
      return null;
    }
  }

  @SuppressWarnings("all") private static final class lifted11 extends Strategy 
  { 
    TermReference g_11;

    TermReference r_10;

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      Fail389:
      { 
        if(term.getTermType() != IStrategoTerm.APPL || transform._consFieldDec_3 != ((IStrategoAppl)term).getConstructor())
          break Fail389;
        if(g_11.value == null)
          g_11.value = term.getSubterm(1);
        else
          if(g_11.value != term.getSubterm(1) && !g_11.value.match(term.getSubterm(1)))
            break Fail389;
        if(r_10.value == null)
          r_10.value = term.getSubterm(2);
        else
          if(r_10.value != term.getSubterm(2) && !r_10.value.match(term.getSubterm(2)))
            break Fail389;
        if(true)
          return term;
      }
      return null;
    }
  }

  @SuppressWarnings("all") private static final class lifted10 extends Strategy 
  { 
    TermReference c_10;

    TermReference d_10;

    TermReference e_10;

    TermReference f_10;

    TermReference g_10;

    TermReference h_10;

    TermReference i_10;

    TermReference j_10;

    TermReference k_10;

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      Fail390:
      { 
        term = add_external_impl_0_9.instance.invokeDynamic(context, term, NO_STRATEGIES, new IStrategoTerm[]{c_10.value, d_10.value, e_10.value, f_10.value, g_10.value, h_10.value, i_10.value, j_10.value, k_10.value});
        if(term == null)
          break Fail390;
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
      Fail391:
      { 
        if(term.getTermType() != IStrategoTerm.APPL || transform._consExprName_2 != ((IStrategoAppl)term).getConstructor())
          break Fail391;
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
      Fail392:
      { 
        if(term.getTermType() != IStrategoTerm.APPL || transform._consExprName_1 != ((IStrategoAppl)term).getConstructor())
          break Fail392;
        if(true)
          return term;
      }
      return null;
    }
  }

  @SuppressWarnings("all") private static final class lifted7 extends Strategy 
  { 
    TermReference c_10;

    TermReference o_10;

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      Fail393:
      { 
        term = decreament_0_2.instance.invoke(context, term, c_10.value, o_10.value);
        if(term == null)
          break Fail393;
        if(true)
          return term;
      }
      return null;
    }
  }

  @SuppressWarnings("all") private static final class lifted6 extends Strategy 
  { 
    TermReference c_10;

    TermReference d_10;

    TermReference e_10;

    TermReference o_10;

    TermReference g_10;

    TermReference h_10;

    TermReference i_10;

    TermReference m_10;

    TermReference k_10;

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      Fail394:
      { 
        term = add_external_impl_0_9.instance.invokeDynamic(context, term, NO_STRATEGIES, new IStrategoTerm[]{c_10.value, d_10.value, e_10.value, o_10.value, g_10.value, h_10.value, i_10.value, m_10.value, k_10.value});
        if(term == null)
          break Fail394;
        if(true)
          return term;
      }
      return null;
    }
  }

  @SuppressWarnings("all") private static final class lifted4 extends Strategy 
  { 
    TermReference c_10;

    TermReference o_10;

    TermReference d_10;

    TermReference i_10;

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      Fail395:
      { 
        lifted5 lifted510 = new lifted5();
        lifted510.c_10 = c_10;
        lifted510.o_10 = o_10;
        lifted510.d_10 = d_10;
        lifted510.i_10 = i_10;
        term = try_1_0.instance.invoke(context, term, lifted510);
        if(term == null)
          break Fail395;
        if(true)
          return term;
      }
      return null;
    }
  }

  @SuppressWarnings("all") private static final class lifted5 extends Strategy 
  { 
    TermReference c_10;

    TermReference o_10;

    TermReference d_10;

    TermReference i_10;

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      Fail396:
      { 
        term = add__params_0_4.instance.invoke(context, term, c_10.value, o_10.value, d_10.value, i_10.value);
        if(term == null)
          break Fail396;
        if(true)
          return term;
      }
      return null;
    }
  }

  @SuppressWarnings("all") private static final class lifted3 extends Strategy 
  { 
    TermReference c_10;

    TermReference o_10;

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      Fail397:
      { 
        term = decreament_0_2.instance.invoke(context, term, c_10.value, o_10.value);
        if(term == null)
          break Fail397;
        if(true)
          return term;
      }
      return null;
    }
  }

  @SuppressWarnings("all") private static final class lifted2 extends Strategy 
  { 
    TermReference c_10;

    TermReference d_10;

    TermReference e_10;

    TermReference o_10;

    TermReference g_10;

    TermReference h_10;

    TermReference i_10;

    TermReference j_10;

    TermReference k_10;

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      Fail398:
      { 
        term = add_external_impl_0_9.instance.invokeDynamic(context, term, NO_STRATEGIES, new IStrategoTerm[]{c_10.value, d_10.value, e_10.value, o_10.value, g_10.value, h_10.value, i_10.value, j_10.value, k_10.value});
        if(term == null)
          break Fail398;
        if(true)
          return term;
      }
      return null;
    }
  }

  @SuppressWarnings("all") private static final class lifted0 extends Strategy 
  { 
    TermReference t_8;

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      Fail399:
      { 
        lifted1 lifted133 = new lifted1();
        lifted133.t_8 = t_8;
        term = try_1_0.instance.invoke(context, term, lifted133);
        if(term == null)
          break Fail399;
        if(true)
          return term;
      }
      return null;
    }
  }

  @SuppressWarnings("all") private static final class lifted1 extends Strategy 
  { 
    TermReference t_8;

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      ITermFactory termFactory = context.getFactory();
      Fail400:
      { 
        IStrategoTerm u_8 = null;
        if(term.getTermType() != IStrategoTerm.APPL || transform._consClassBody_1 != ((IStrategoAppl)term).getConstructor())
          break Fail400;
        u_8 = term.getSubterm(0);
        if(t_8.value == null)
          break Fail400;
        term = iset_elements_0_0.instance.invoke(context, t_8.value);
        if(term == null)
          break Fail400;
        term = termFactory.makeTuple(u_8, term);
        term = conc_0_0.instance.invoke(context, term);
        if(term == null)
          break Fail400;
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
      varScope.addSVar("original_file_0_0", new InteropSDefT(original_file_0_0.instance, context));
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
      varScope.addSVar("original_file_0_0", new InteropSDefT(classLoader, "transform$original_file_0_0", context));
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
