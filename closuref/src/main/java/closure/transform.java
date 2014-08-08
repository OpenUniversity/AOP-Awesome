package closure;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.java_front.*;
import org.strategoxt.stratego_gpp.*;
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

  protected static IStrategoTerm const85;

  protected static IStrategoTerm const84;

  protected static IStrategoTerm const83;

  protected static IStrategoTerm const82;

  protected static IStrategoTerm const81;

  protected static IStrategoTerm const80;

  protected static IStrategoTerm constCons25;

  protected static IStrategoTerm constTypeImportOnDemandDec0;

  protected static IStrategoTerm constPackageName0;

  protected static IStrategoTerm constCons24;

  protected static IStrategoTerm constId3;

  protected static IStrategoTerm const79;

  protected static IStrategoTerm constCons23;

  protected static IStrategoTerm constId2;

  protected static IStrategoTerm const78;

  protected static IStrategoTerm const77;

  protected static IStrategoTerm const76;

  protected static IStrategoTerm const75;

  protected static IStrategoTerm const74;

  protected static IStrategoTerm const73;

  protected static IStrategoTerm constCons22;

  protected static IStrategoTerm constMarkerAnno0;

  protected static IStrategoTerm constCons21;

  protected static IStrategoTerm constClassOrInterfaceType0;

  protected static IStrategoTerm constTypeName1;

  protected static IStrategoTerm constId1;

  protected static IStrategoTerm const72;

  protected static IStrategoTerm const71;

  protected static IStrategoTerm const70;

  protected static IStrategoTerm constRefTypePattern0;

  protected static IStrategoTerm constNamePattern0;

  protected static IStrategoTerm constModPattern0;

  protected static IStrategoTerm constAnnoPattern0;

  protected static IStrategoTerm constCons20;

  protected static IStrategoTerm constSimpleAnnoPatternExact0;

  protected static IStrategoTerm constTypeName0;

  protected static IStrategoTerm constId0;

  protected static IStrategoTerm const69;

  protected static IStrategoTerm constBlock0;

  protected static IStrategoTerm constVoid0;

  protected static IStrategoTerm constCons19;

  protected static IStrategoTerm constPublic0;

  protected static IStrategoTerm constCons18;

  protected static IStrategoTerm constStatic0;

  protected static IStrategoTerm constNone0;

  protected static IStrategoTerm const68;

  protected static IStrategoTerm constFBOX47;

  protected static IStrategoTerm constS64;

  protected static IStrategoTerm const67;

  protected static IStrategoTerm constFBOX46;

  protected static IStrategoTerm constS63;

  protected static IStrategoTerm const66;

  protected static IStrategoTerm constFBOX45;

  protected static IStrategoTerm constS62;

  protected static IStrategoTerm const65;

  protected static IStrategoTerm constFBOX44;

  protected static IStrategoTerm constS61;

  protected static IStrategoTerm const64;

  protected static IStrategoTerm constFBOX43;

  protected static IStrategoTerm constS60;

  protected static IStrategoTerm const63;

  protected static IStrategoTerm constCons17;

  protected static IStrategoTerm constSOpt4;

  protected static IStrategoTerm constCons16;

  protected static IStrategoTerm constCons15;

  protected static IStrategoTerm constSOpt3;

  protected static IStrategoTerm const62;

  protected static IStrategoTerm constIS0;

  protected static IStrategoTerm constCons14;

  protected static IStrategoTerm constFBOX42;

  protected static IStrategoTerm constS59;

  protected static IStrategoTerm const61;

  protected static IStrategoTerm constFBOX41;

  protected static IStrategoTerm constS58;

  protected static IStrategoTerm const60;

  protected static IStrategoTerm constFBOX40;

  protected static IStrategoTerm constS57;

  protected static IStrategoTerm const59;

  protected static IStrategoTerm constFBOX39;

  protected static IStrategoTerm constS56;

  protected static IStrategoTerm const58;

  protected static IStrategoTerm constFBOX38;

  protected static IStrategoTerm constS55;

  protected static IStrategoTerm const57;

  protected static IStrategoTerm constFBOX37;

  protected static IStrategoTerm constS54;

  protected static IStrategoTerm const56;

  protected static IStrategoTerm constFBOX36;

  protected static IStrategoTerm constS53;

  protected static IStrategoTerm const55;

  protected static IStrategoTerm constFBOX35;

  protected static IStrategoTerm constS52;

  protected static IStrategoTerm const54;

  protected static IStrategoTerm constS51;

  protected static IStrategoTerm const53;

  protected static IStrategoTerm constS50;

  protected static IStrategoTerm const52;

  protected static IStrategoTerm constS49;

  protected static IStrategoTerm const51;

  protected static IStrategoTerm constS48;

  protected static IStrategoTerm const50;

  protected static IStrategoTerm constFBOX34;

  protected static IStrategoTerm constS47;

  protected static IStrategoTerm const49;

  protected static IStrategoTerm constFBOX33;

  protected static IStrategoTerm constS46;

  protected static IStrategoTerm const48;

  protected static IStrategoTerm constFBOX32;

  protected static IStrategoTerm constS45;

  protected static IStrategoTerm const47;

  protected static IStrategoTerm constFBOX31;

  protected static IStrategoTerm constS44;

  protected static IStrategoTerm const46;

  protected static IStrategoTerm constFBOX30;

  protected static IStrategoTerm constS43;

  protected static IStrategoTerm const45;

  protected static IStrategoTerm constFBOX29;

  protected static IStrategoTerm constS42;

  protected static IStrategoTerm const44;

  protected static IStrategoTerm constCons13;

  protected static IStrategoTerm constFBOX28;

  protected static IStrategoTerm constS41;

  protected static IStrategoTerm const43;

  protected static IStrategoTerm constFBOX27;

  protected static IStrategoTerm constS40;

  protected static IStrategoTerm const42;

  protected static IStrategoTerm constFBOX26;

  protected static IStrategoTerm constS39;

  protected static IStrategoTerm const41;

  protected static IStrategoTerm constFBOX25;

  protected static IStrategoTerm constS38;

  protected static IStrategoTerm const40;

  protected static IStrategoTerm constFBOX24;

  protected static IStrategoTerm constS37;

  protected static IStrategoTerm const39;

  protected static IStrategoTerm constFBOX23;

  protected static IStrategoTerm constCons12;

  protected static IStrategoTerm constFBOX22;

  protected static IStrategoTerm constFBOX21;

  protected static IStrategoTerm constCons11;

  protected static IStrategoTerm constSOpt2;

  protected static IStrategoTerm constVS0;

  protected static IStrategoTerm constS36;

  protected static IStrategoTerm const38;

  protected static IStrategoTerm constS35;

  protected static IStrategoTerm const37;

  protected static IStrategoTerm constS34;

  protected static IStrategoTerm const36;

  protected static IStrategoTerm constFBOX20;

  protected static IStrategoTerm constS33;

  protected static IStrategoTerm const35;

  protected static IStrategoTerm constS32;

  protected static IStrategoTerm const34;

  protected static IStrategoTerm constCons10;

  protected static IStrategoTerm constCons9;

  protected static IStrategoTerm constCons8;

  protected static IStrategoTerm constFBOX19;

  protected static IStrategoTerm constS31;

  protected static IStrategoTerm const33;

  protected static IStrategoTerm constS30;

  protected static IStrategoTerm const32;

  protected static IStrategoTerm constCons7;

  protected static IStrategoTerm constS29;

  protected static IStrategoTerm const31;

  protected static IStrategoTerm constFBOX18;

  protected static IStrategoTerm constS28;

  protected static IStrategoTerm const30;

  protected static IStrategoTerm constFBOX17;

  protected static IStrategoTerm constCons6;

  protected static IStrategoTerm constS27;

  protected static IStrategoTerm const29;

  protected static IStrategoTerm constFBOX16;

  protected static IStrategoTerm constS26;

  protected static IStrategoTerm const28;

  protected static IStrategoTerm constCons5;

  protected static IStrategoTerm constS25;

  protected static IStrategoTerm const27;

  protected static IStrategoTerm constFBOX15;

  protected static IStrategoTerm constS24;

  protected static IStrategoTerm const26;

  protected static IStrategoTerm constCons4;

  protected static IStrategoTerm constSOpt1;

  protected static IStrategoTerm const25;

  protected static IStrategoTerm constS23;

  protected static IStrategoTerm const24;

  protected static IStrategoTerm constS22;

  protected static IStrategoTerm const23;

  protected static IStrategoTerm constS21;

  protected static IStrategoTerm const22;

  protected static IStrategoTerm constS20;

  protected static IStrategoTerm const21;

  protected static IStrategoTerm constS19;

  protected static IStrategoTerm const20;

  protected static IStrategoTerm constS18;

  protected static IStrategoTerm const19;

  protected static IStrategoTerm constS17;

  protected static IStrategoTerm const18;

  protected static IStrategoTerm constFBOX14;

  protected static IStrategoTerm constS16;

  protected static IStrategoTerm const17;

  protected static IStrategoTerm constFBOX13;

  protected static IStrategoTerm constS15;

  protected static IStrategoTerm const16;

  protected static IStrategoTerm constFBOX12;

  protected static IStrategoTerm constS14;

  protected static IStrategoTerm const15;

  protected static IStrategoTerm constFBOX11;

  protected static IStrategoTerm constS13;

  protected static IStrategoTerm const14;

  protected static IStrategoTerm constFBOX10;

  protected static IStrategoTerm constS12;

  protected static IStrategoTerm const13;

  protected static IStrategoTerm constFBOX9;

  protected static IStrategoTerm constS11;

  protected static IStrategoTerm const12;

  protected static IStrategoTerm constFBOX8;

  protected static IStrategoTerm constS10;

  protected static IStrategoTerm const11;

  protected static IStrategoTerm constFBOX7;

  protected static IStrategoTerm constS9;

  protected static IStrategoTerm const10;

  protected static IStrategoTerm constH0;

  protected static IStrategoTerm constCons3;

  protected static IStrategoTerm constFBOX6;

  protected static IStrategoTerm constS8;

  protected static IStrategoTerm const9;

  protected static IStrategoTerm constCons2;

  protected static IStrategoTerm constFBOX5;

  protected static IStrategoTerm constS7;

  protected static IStrategoTerm const8;

  protected static IStrategoTerm constFBOX4;

  protected static IStrategoTerm constS6;

  protected static IStrategoTerm const7;

  protected static IStrategoTerm constFBOX3;

  protected static IStrategoTerm constS5;

  protected static IStrategoTerm const6;

  protected static IStrategoTerm constFBOX2;

  protected static IStrategoTerm constS4;

  protected static IStrategoTerm const5;

  protected static IStrategoTerm constFBOX1;

  protected static IStrategoTerm constS3;

  protected static IStrategoTerm const4;

  protected static IStrategoTerm constFBOX0;

  protected static IStrategoTerm constS2;

  protected static IStrategoTerm const3;

  protected static IStrategoTerm constKW0;

  protected static IStrategoTerm constS1;

  protected static IStrategoTerm const2;

  protected static IStrategoTerm constCons1;

  protected static IStrategoTerm constS0;

  protected static IStrategoTerm const1;

  protected static IStrategoTerm constCons0;

  protected static IStrategoTerm constSOpt0;

  protected static IStrategoTerm const0;

  protected static IStrategoTerm constHS0;

  protected static IStrategoTerm constNil0;

  public static IStrategoConstructor _consConc_2;

  protected static IStrategoConstructor _consIS_0;

  protected static IStrategoConstructor _consVS_0;

  protected static IStrategoConstructor _consV_2;

  protected static IStrategoConstructor _consKW_0;

  protected static IStrategoConstructor _consFBOX_2;

  protected static IStrategoConstructor _consS_1;

  protected static IStrategoConstructor _consHS_0;

  protected static IStrategoConstructor _consSOpt_2;

  protected static IStrategoConstructor _consH_2;

  public static IStrategoConstructor _consClosureJoinpoints_4;

  public static IStrategoConstructor _consShortClosureJoinpoints_2;

  public static IStrategoConstructor _consDecError_2;

  public static IStrategoConstructor _consDecSoft_2;

  public static IStrategoConstructor _consCJPAdvice_4;

  public static IStrategoConstructor _consRegularTypePattern_1;

  public static IStrategoConstructor _consSimpleAnnoPatternValue_2;

  public static IStrategoConstructor _consJoinpointDeclaration_4;

  public static IStrategoConstructor _consCJPBefore_2;

  public static IStrategoConstructor _consCJPAfter_2;

  public static IStrategoConstructor _consCJPAfterReturning_3;

  public static IStrategoConstructor _consCJPAround_3;

  public static IStrategoConstructor _consCJPSingleParam_1;

  public static IStrategoConstructor _consNil_0;

  public static IStrategoConstructor _consPackageName_1;

  public static IStrategoConstructor _consPackageDec_2;

  public static IStrategoConstructor _consTypeImportOnDemandDec_1;

  public static IStrategoConstructor _consCompilationUnit_3;

  public static IStrategoConstructor _consMethodName_1;

  public static IStrategoConstructor _consMethodName_2;

  public static IStrategoConstructor _consClassOrInterfaceType_2;

  public static IStrategoConstructor _consNewInstance_4;

  public static IStrategoConstructor _consInvoke_2;

  public static IStrategoConstructor _consBlock_1;

  public static IStrategoConstructor _consMethodDec_2;

  public static IStrategoConstructor _consMethodDecHead_6;

  public static IStrategoConstructor _consParam_3;

  public static IStrategoConstructor _consNoMethodBody_0;

  public static IStrategoConstructor _consClassDec_2;

  public static IStrategoConstructor _consClassBody_1;

  public static IStrategoConstructor _consMethod_3;

  public static IStrategoConstructor _consMarkerAnno_1;

  public static IStrategoConstructor _consId_1;

  public static IStrategoConstructor _consPublic_0;

  public static IStrategoConstructor _consStatic_0;

  public static IStrategoConstructor _consTypeName_1;

  public static IStrategoConstructor _consDecParent_3;

  public static IStrategoConstructor _consDecWarning_3;

  public static IStrategoConstructor _consDecPrecedence_2;

  public static IStrategoConstructor _consDecAnno_4;

  public static IStrategoConstructor _consDecAnnoType_0;

  public static IStrategoConstructor _consDecAnnoConstructor_0;

  public static IStrategoConstructor _consDecAnnoMethod_0;

  public static IStrategoConstructor _consDecAnnoField_0;

  public static IStrategoConstructor _consAdviceDec_5;

  public static IStrategoConstructor _consBefore_1;

  public static IStrategoConstructor _consAfter_2;

  public static IStrategoConstructor _consAround_2;

  public static IStrategoConstructor _consReturning_0;

  public static IStrategoConstructor _consReturning_1;

  public static IStrategoConstructor _consThrowing_0;

  public static IStrategoConstructor _consThrowing_1;

  public static IStrategoConstructor _consIntertypeMethodDec_2;

  public static IStrategoConstructor _consIntertypeConstrDec_2;

  public static IStrategoConstructor _consIntertypeFieldDec_5;

  public static IStrategoConstructor _consIntertypeMethodDecHead_8;

  public static IStrategoConstructor _consIntertypeConstrDecHead_6;

  public static IStrategoConstructor _consAspectDec_2;

  public static IStrategoConstructor _consAspectDecHead_6;

  public static IStrategoConstructor _consPerTarget_1;

  public static IStrategoConstructor _consPerThis_1;

  public static IStrategoConstructor _consPerCFlow_1;

  public static IStrategoConstructor _consPerCFlowBelow_1;

  public static IStrategoConstructor _consPerTypeWithin_1;

  public static IStrategoConstructor _consIsSingleton_0;

  public static IStrategoConstructor _consAspectBody_1;

  public static IStrategoConstructor _consPrivileged_0;

  public static IStrategoConstructor _consSimpleNamePattern_1;

  public static IStrategoConstructor _consFormalWildcard_0;

  public static IStrategoConstructor _consVarArityParamPattern_1;

  public static IStrategoConstructor _consVoid_0;

  public static IStrategoConstructor _consGenericTypePattern_2;

  public static IStrategoConstructor _consGenericSubtypePattern_2;

  public static IStrategoConstructor _consNamePattern_1;

  public static IStrategoConstructor _consNamePattern_2;

  public static IStrategoConstructor _consWildcardNamePattern_2;

  public static IStrategoConstructor _consRefTypePattern_1;

  public static IStrategoConstructor _consPrimTypePattern_1;

  public static IStrategoConstructor _consAnnoTypePattern_2;

  public static IStrategoConstructor _consMethodPattern_6;

  public static IStrategoConstructor _consConstrPattern_5;

  public static IStrategoConstructor _consFieldPattern_4;

  public static IStrategoConstructor _consMemberName_1;

  public static IStrategoConstructor _consMemberName_2;

  public static IStrategoConstructor _consWildcardMemberName_2;

  public static IStrategoConstructor _consConstrName_0;

  public static IStrategoConstructor _consConstrName_1;

  public static IStrategoConstructor _consWildcardConstrName_1;

  public static IStrategoConstructor _consModPattern_1;

  public static IStrategoConstructor _consThrowsPattern_1;

  public static IStrategoConstructor _consNotThrowsCondition_1;

  public static IStrategoConstructor _consThrowsCondition_1;

  public static IStrategoConstructor _consSimpleAnnoPattern_1;

  public static IStrategoConstructor _consSimpleAnnoPatternExact_1;

  public static IStrategoConstructor _consNot_1;

  public static IStrategoConstructor _consAnnoPattern_1;

  public static IStrategoConstructor _consPointcutDec_2;

  public static IStrategoConstructor _consPointcutDecHead_3;

  public static IStrategoConstructor _consPointcutBody_1;

  public static IStrategoConstructor _consNoPointcutBody_0;

  public static IStrategoConstructor _consNotComp_1;

  public static IStrategoConstructor _consAndComp_2;

  public static IStrategoConstructor _consOrComp_2;

  public static IStrategoConstructor _consCall_1;

  public static IStrategoConstructor _consExec_1;

  public static IStrategoConstructor _consInitExec_1;

  public static IStrategoConstructor _consPreInitExec_1;

  public static IStrategoConstructor _consStaticInitExec_1;

  public static IStrategoConstructor _consGetField_1;

  public static IStrategoConstructor _consSetField_1;

  public static IStrategoConstructor _consHandler_1;

  public static IStrategoConstructor _consAdviceExec_0;

  public static IStrategoConstructor _consWithin_1;

  public static IStrategoConstructor _consWithinCode_1;

  public static IStrategoConstructor _consCFlow_1;

  public static IStrategoConstructor _consCFlowBelow_1;

  public static IStrategoConstructor _consIf_1;

  public static IStrategoConstructor _consThis_1;

  public static IStrategoConstructor _consTarget_1;

  public static IStrategoConstructor _consArgs_1;

  public static IStrategoConstructor _consAtThis_1;

  public static IStrategoConstructor _consAtTarget_1;

  public static IStrategoConstructor _consAtWithin_1;

  public static IStrategoConstructor _consAtWithinCode_1;

  public static IStrategoConstructor _consAtAnno_1;

  public static IStrategoConstructor _consAtArgs_1;

  public static IStrategoConstructor _consNamedPointcut_2;

  public static IStrategoConstructor _consPointcutName_1;

  public static IStrategoConstructor _consPointcutName_2;

  public static IStrategoConstructor _consWildcard_0;

  public static IStrategoConstructor _consDotWildcard_0;

  public static IStrategoConstructor _consSubtype_1;

  public static IStrategoConstructor _consNone_0;

  public static IStrategoConstructor _consSome_1;

  public static IStrategoConstructor _consCons_2;

  public static IStrategoConstructor _consProceed_0;

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
    _consIS_0 = termFactory.makeConstructor("IS", 0);
    _consVS_0 = termFactory.makeConstructor("VS", 0);
    _consV_2 = termFactory.makeConstructor("V", 2);
    _consKW_0 = termFactory.makeConstructor("KW", 0);
    _consFBOX_2 = termFactory.makeConstructor("FBOX", 2);
    _consS_1 = termFactory.makeConstructor("S", 1);
    _consHS_0 = termFactory.makeConstructor("HS", 0);
    _consSOpt_2 = termFactory.makeConstructor("SOpt", 2);
    _consH_2 = termFactory.makeConstructor("H", 2);
    _consClosureJoinpoints_4 = termFactory.makeConstructor("ClosureJoinpoints", 4);
    _consShortClosureJoinpoints_2 = termFactory.makeConstructor("ShortClosureJoinpoints", 2);
    _consDecError_2 = termFactory.makeConstructor("DecError", 2);
    _consDecSoft_2 = termFactory.makeConstructor("DecSoft", 2);
    _consCJPAdvice_4 = termFactory.makeConstructor("CJPAdvice", 4);
    _consRegularTypePattern_1 = termFactory.makeConstructor("RegularTypePattern", 1);
    _consSimpleAnnoPatternValue_2 = termFactory.makeConstructor("SimpleAnnoPatternValue", 2);
    _consJoinpointDeclaration_4 = termFactory.makeConstructor("JoinpointDeclaration", 4);
    _consCJPBefore_2 = termFactory.makeConstructor("CJPBefore", 2);
    _consCJPAfter_2 = termFactory.makeConstructor("CJPAfter", 2);
    _consCJPAfterReturning_3 = termFactory.makeConstructor("CJPAfterReturning", 3);
    _consCJPAround_3 = termFactory.makeConstructor("CJPAround", 3);
    _consCJPSingleParam_1 = termFactory.makeConstructor("CJPSingleParam", 1);
    _consNil_0 = termFactory.makeConstructor("Nil", 0);
    _consPackageName_1 = termFactory.makeConstructor("PackageName", 1);
    _consPackageDec_2 = termFactory.makeConstructor("PackageDec", 2);
    _consTypeImportOnDemandDec_1 = termFactory.makeConstructor("TypeImportOnDemandDec", 1);
    _consCompilationUnit_3 = termFactory.makeConstructor("CompilationUnit", 3);
    _consMethodName_1 = termFactory.makeConstructor("MethodName", 1);
    _consMethodName_2 = termFactory.makeConstructor("MethodName", 2);
    _consClassOrInterfaceType_2 = termFactory.makeConstructor("ClassOrInterfaceType", 2);
    _consNewInstance_4 = termFactory.makeConstructor("NewInstance", 4);
    _consInvoke_2 = termFactory.makeConstructor("Invoke", 2);
    _consBlock_1 = termFactory.makeConstructor("Block", 1);
    _consMethodDec_2 = termFactory.makeConstructor("MethodDec", 2);
    _consMethodDecHead_6 = termFactory.makeConstructor("MethodDecHead", 6);
    _consParam_3 = termFactory.makeConstructor("Param", 3);
    _consNoMethodBody_0 = termFactory.makeConstructor("NoMethodBody", 0);
    _consClassDec_2 = termFactory.makeConstructor("ClassDec", 2);
    _consClassBody_1 = termFactory.makeConstructor("ClassBody", 1);
    _consMethod_3 = termFactory.makeConstructor("Method", 3);
    _consMarkerAnno_1 = termFactory.makeConstructor("MarkerAnno", 1);
    _consId_1 = termFactory.makeConstructor("Id", 1);
    _consPublic_0 = termFactory.makeConstructor("Public", 0);
    _consStatic_0 = termFactory.makeConstructor("Static", 0);
    _consTypeName_1 = termFactory.makeConstructor("TypeName", 1);
    _consDecParent_3 = termFactory.makeConstructor("DecParent", 3);
    _consDecWarning_3 = termFactory.makeConstructor("DecWarning", 3);
    _consDecPrecedence_2 = termFactory.makeConstructor("DecPrecedence", 2);
    _consDecAnno_4 = termFactory.makeConstructor("DecAnno", 4);
    _consDecAnnoType_0 = termFactory.makeConstructor("DecAnnoType", 0);
    _consDecAnnoConstructor_0 = termFactory.makeConstructor("DecAnnoConstructor", 0);
    _consDecAnnoMethod_0 = termFactory.makeConstructor("DecAnnoMethod", 0);
    _consDecAnnoField_0 = termFactory.makeConstructor("DecAnnoField", 0);
    _consAdviceDec_5 = termFactory.makeConstructor("AdviceDec", 5);
    _consBefore_1 = termFactory.makeConstructor("Before", 1);
    _consAfter_2 = termFactory.makeConstructor("After", 2);
    _consAround_2 = termFactory.makeConstructor("Around", 2);
    _consReturning_0 = termFactory.makeConstructor("Returning", 0);
    _consReturning_1 = termFactory.makeConstructor("Returning", 1);
    _consThrowing_0 = termFactory.makeConstructor("Throwing", 0);
    _consThrowing_1 = termFactory.makeConstructor("Throwing", 1);
    _consIntertypeMethodDec_2 = termFactory.makeConstructor("IntertypeMethodDec", 2);
    _consIntertypeConstrDec_2 = termFactory.makeConstructor("IntertypeConstrDec", 2);
    _consIntertypeFieldDec_5 = termFactory.makeConstructor("IntertypeFieldDec", 5);
    _consIntertypeMethodDecHead_8 = termFactory.makeConstructor("IntertypeMethodDecHead", 8);
    _consIntertypeConstrDecHead_6 = termFactory.makeConstructor("IntertypeConstrDecHead", 6);
    _consAspectDec_2 = termFactory.makeConstructor("AspectDec", 2);
    _consAspectDecHead_6 = termFactory.makeConstructor("AspectDecHead", 6);
    _consPerTarget_1 = termFactory.makeConstructor("PerTarget", 1);
    _consPerThis_1 = termFactory.makeConstructor("PerThis", 1);
    _consPerCFlow_1 = termFactory.makeConstructor("PerCFlow", 1);
    _consPerCFlowBelow_1 = termFactory.makeConstructor("PerCFlowBelow", 1);
    _consPerTypeWithin_1 = termFactory.makeConstructor("PerTypeWithin", 1);
    _consIsSingleton_0 = termFactory.makeConstructor("IsSingleton", 0);
    _consAspectBody_1 = termFactory.makeConstructor("AspectBody", 1);
    _consPrivileged_0 = termFactory.makeConstructor("Privileged", 0);
    _consSimpleNamePattern_1 = termFactory.makeConstructor("SimpleNamePattern", 1);
    _consFormalWildcard_0 = termFactory.makeConstructor("FormalWildcard", 0);
    _consVarArityParamPattern_1 = termFactory.makeConstructor("VarArityParamPattern", 1);
    _consVoid_0 = termFactory.makeConstructor("Void", 0);
    _consGenericTypePattern_2 = termFactory.makeConstructor("GenericTypePattern", 2);
    _consGenericSubtypePattern_2 = termFactory.makeConstructor("GenericSubtypePattern", 2);
    _consNamePattern_1 = termFactory.makeConstructor("NamePattern", 1);
    _consNamePattern_2 = termFactory.makeConstructor("NamePattern", 2);
    _consWildcardNamePattern_2 = termFactory.makeConstructor("WildcardNamePattern", 2);
    _consRefTypePattern_1 = termFactory.makeConstructor("RefTypePattern", 1);
    _consPrimTypePattern_1 = termFactory.makeConstructor("PrimTypePattern", 1);
    _consAnnoTypePattern_2 = termFactory.makeConstructor("AnnoTypePattern", 2);
    _consMethodPattern_6 = termFactory.makeConstructor("MethodPattern", 6);
    _consConstrPattern_5 = termFactory.makeConstructor("ConstrPattern", 5);
    _consFieldPattern_4 = termFactory.makeConstructor("FieldPattern", 4);
    _consMemberName_1 = termFactory.makeConstructor("MemberName", 1);
    _consMemberName_2 = termFactory.makeConstructor("MemberName", 2);
    _consWildcardMemberName_2 = termFactory.makeConstructor("WildcardMemberName", 2);
    _consConstrName_0 = termFactory.makeConstructor("ConstrName", 0);
    _consConstrName_1 = termFactory.makeConstructor("ConstrName", 1);
    _consWildcardConstrName_1 = termFactory.makeConstructor("WildcardConstrName", 1);
    _consModPattern_1 = termFactory.makeConstructor("ModPattern", 1);
    _consThrowsPattern_1 = termFactory.makeConstructor("ThrowsPattern", 1);
    _consNotThrowsCondition_1 = termFactory.makeConstructor("NotThrowsCondition", 1);
    _consThrowsCondition_1 = termFactory.makeConstructor("ThrowsCondition", 1);
    _consSimpleAnnoPattern_1 = termFactory.makeConstructor("SimpleAnnoPattern", 1);
    _consSimpleAnnoPatternExact_1 = termFactory.makeConstructor("SimpleAnnoPatternExact", 1);
    _consNot_1 = termFactory.makeConstructor("Not", 1);
    _consAnnoPattern_1 = termFactory.makeConstructor("AnnoPattern", 1);
    _consPointcutDec_2 = termFactory.makeConstructor("PointcutDec", 2);
    _consPointcutDecHead_3 = termFactory.makeConstructor("PointcutDecHead", 3);
    _consPointcutBody_1 = termFactory.makeConstructor("PointcutBody", 1);
    _consNoPointcutBody_0 = termFactory.makeConstructor("NoPointcutBody", 0);
    _consNotComp_1 = termFactory.makeConstructor("NotComp", 1);
    _consAndComp_2 = termFactory.makeConstructor("AndComp", 2);
    _consOrComp_2 = termFactory.makeConstructor("OrComp", 2);
    _consCall_1 = termFactory.makeConstructor("Call", 1);
    _consExec_1 = termFactory.makeConstructor("Exec", 1);
    _consInitExec_1 = termFactory.makeConstructor("InitExec", 1);
    _consPreInitExec_1 = termFactory.makeConstructor("PreInitExec", 1);
    _consStaticInitExec_1 = termFactory.makeConstructor("StaticInitExec", 1);
    _consGetField_1 = termFactory.makeConstructor("GetField", 1);
    _consSetField_1 = termFactory.makeConstructor("SetField", 1);
    _consHandler_1 = termFactory.makeConstructor("Handler", 1);
    _consAdviceExec_0 = termFactory.makeConstructor("AdviceExec", 0);
    _consWithin_1 = termFactory.makeConstructor("Within", 1);
    _consWithinCode_1 = termFactory.makeConstructor("WithinCode", 1);
    _consCFlow_1 = termFactory.makeConstructor("CFlow", 1);
    _consCFlowBelow_1 = termFactory.makeConstructor("CFlowBelow", 1);
    _consIf_1 = termFactory.makeConstructor("If", 1);
    _consThis_1 = termFactory.makeConstructor("This", 1);
    _consTarget_1 = termFactory.makeConstructor("Target", 1);
    _consArgs_1 = termFactory.makeConstructor("Args", 1);
    _consAtThis_1 = termFactory.makeConstructor("AtThis", 1);
    _consAtTarget_1 = termFactory.makeConstructor("AtTarget", 1);
    _consAtWithin_1 = termFactory.makeConstructor("AtWithin", 1);
    _consAtWithinCode_1 = termFactory.makeConstructor("AtWithinCode", 1);
    _consAtAnno_1 = termFactory.makeConstructor("AtAnno", 1);
    _consAtArgs_1 = termFactory.makeConstructor("AtArgs", 1);
    _consNamedPointcut_2 = termFactory.makeConstructor("NamedPointcut", 2);
    _consPointcutName_1 = termFactory.makeConstructor("PointcutName", 1);
    _consPointcutName_2 = termFactory.makeConstructor("PointcutName", 2);
    _consWildcard_0 = termFactory.makeConstructor("Wildcard", 0);
    _consDotWildcard_0 = termFactory.makeConstructor("DotWildcard", 0);
    _consSubtype_1 = termFactory.makeConstructor("Subtype", 1);
    _consNone_0 = termFactory.makeConstructor("None", 0);
    _consSome_1 = termFactory.makeConstructor("Some", 1);
    _consCons_2 = termFactory.makeConstructor("Cons", 2);
    _consProceed_0 = termFactory.makeConstructor("Proceed", 0);
  }

  public static void initConstants(ITermFactory termFactory)
  { 
    constNil0 = (IStrategoTerm)termFactory.makeList(Term.NO_TERMS);
    constHS0 = termFactory.makeAppl(transform._consHS_0, NO_TERMS);
    const0 = termFactory.makeString("0");
    constSOpt0 = termFactory.makeAppl(transform._consSOpt_2, new IStrategoTerm[]{transform.constHS0, transform.const0});
    constCons0 = (IStrategoTerm)termFactory.makeListCons(transform.constSOpt0, (IStrategoList)transform.constNil0);
    const1 = termFactory.makeString(")");
    constS0 = termFactory.makeAppl(transform._consS_1, new IStrategoTerm[]{transform.const1});
    constCons1 = (IStrategoTerm)termFactory.makeListCons(transform.constS0, (IStrategoList)transform.constNil0);
    const2 = termFactory.makeString("(");
    constS1 = termFactory.makeAppl(transform._consS_1, new IStrategoTerm[]{transform.const2});
    constKW0 = termFactory.makeAppl(transform._consKW_0, NO_TERMS);
    const3 = termFactory.makeString("initialization");
    constS2 = termFactory.makeAppl(transform._consS_1, new IStrategoTerm[]{transform.const3});
    constFBOX0 = termFactory.makeAppl(transform._consFBOX_2, new IStrategoTerm[]{transform.constKW0, transform.constS2});
    const4 = termFactory.makeString("preinitialization");
    constS3 = termFactory.makeAppl(transform._consS_1, new IStrategoTerm[]{transform.const4});
    constFBOX1 = termFactory.makeAppl(transform._consFBOX_2, new IStrategoTerm[]{transform.constKW0, transform.constS3});
    const5 = termFactory.makeString("staticinitialization");
    constS4 = termFactory.makeAppl(transform._consS_1, new IStrategoTerm[]{transform.const5});
    constFBOX2 = termFactory.makeAppl(transform._consFBOX_2, new IStrategoTerm[]{transform.constKW0, transform.constS4});
    const6 = termFactory.makeString("get");
    constS5 = termFactory.makeAppl(transform._consS_1, new IStrategoTerm[]{transform.const6});
    constFBOX3 = termFactory.makeAppl(transform._consFBOX_2, new IStrategoTerm[]{transform.constKW0, transform.constS5});
    const7 = termFactory.makeString("set");
    constS6 = termFactory.makeAppl(transform._consS_1, new IStrategoTerm[]{transform.const7});
    constFBOX4 = termFactory.makeAppl(transform._consFBOX_2, new IStrategoTerm[]{transform.constKW0, transform.constS6});
    const8 = termFactory.makeString("handler");
    constS7 = termFactory.makeAppl(transform._consS_1, new IStrategoTerm[]{transform.const8});
    constFBOX5 = termFactory.makeAppl(transform._consFBOX_2, new IStrategoTerm[]{transform.constKW0, transform.constS7});
    constCons2 = (IStrategoTerm)termFactory.makeListCons(transform.constS1, (IStrategoList)transform.constCons1);
    const9 = termFactory.makeString("adviceexecution");
    constS8 = termFactory.makeAppl(transform._consS_1, new IStrategoTerm[]{transform.const9});
    constFBOX6 = termFactory.makeAppl(transform._consFBOX_2, new IStrategoTerm[]{transform.constKW0, transform.constS8});
    constCons3 = (IStrategoTerm)termFactory.makeListCons(transform.constFBOX6, (IStrategoList)transform.constCons2);
    constH0 = termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{transform.constCons0, transform.constCons3});
    const10 = termFactory.makeString("within");
    constS9 = termFactory.makeAppl(transform._consS_1, new IStrategoTerm[]{transform.const10});
    constFBOX7 = termFactory.makeAppl(transform._consFBOX_2, new IStrategoTerm[]{transform.constKW0, transform.constS9});
    const11 = termFactory.makeString("withincode");
    constS10 = termFactory.makeAppl(transform._consS_1, new IStrategoTerm[]{transform.const11});
    constFBOX8 = termFactory.makeAppl(transform._consFBOX_2, new IStrategoTerm[]{transform.constKW0, transform.constS10});
    const12 = termFactory.makeString("cflow");
    constS11 = termFactory.makeAppl(transform._consS_1, new IStrategoTerm[]{transform.const12});
    constFBOX9 = termFactory.makeAppl(transform._consFBOX_2, new IStrategoTerm[]{transform.constKW0, transform.constS11});
    const13 = termFactory.makeString("cflowbelow");
    constS12 = termFactory.makeAppl(transform._consS_1, new IStrategoTerm[]{transform.const13});
    constFBOX10 = termFactory.makeAppl(transform._consFBOX_2, new IStrategoTerm[]{transform.constKW0, transform.constS12});
    const14 = termFactory.makeString("if");
    constS13 = termFactory.makeAppl(transform._consS_1, new IStrategoTerm[]{transform.const14});
    constFBOX11 = termFactory.makeAppl(transform._consFBOX_2, new IStrategoTerm[]{transform.constKW0, transform.constS13});
    const15 = termFactory.makeString("this");
    constS14 = termFactory.makeAppl(transform._consS_1, new IStrategoTerm[]{transform.const15});
    constFBOX12 = termFactory.makeAppl(transform._consFBOX_2, new IStrategoTerm[]{transform.constKW0, transform.constS14});
    const16 = termFactory.makeString("target");
    constS15 = termFactory.makeAppl(transform._consS_1, new IStrategoTerm[]{transform.const16});
    constFBOX13 = termFactory.makeAppl(transform._consFBOX_2, new IStrategoTerm[]{transform.constKW0, transform.constS15});
    const17 = termFactory.makeString("args");
    constS16 = termFactory.makeAppl(transform._consS_1, new IStrategoTerm[]{transform.const17});
    constFBOX14 = termFactory.makeAppl(transform._consFBOX_2, new IStrategoTerm[]{transform.constKW0, transform.constS16});
    const18 = termFactory.makeString("@this");
    constS17 = termFactory.makeAppl(transform._consS_1, new IStrategoTerm[]{transform.const18});
    const19 = termFactory.makeString("@target");
    constS18 = termFactory.makeAppl(transform._consS_1, new IStrategoTerm[]{transform.const19});
    const20 = termFactory.makeString("@within");
    constS19 = termFactory.makeAppl(transform._consS_1, new IStrategoTerm[]{transform.const20});
    const21 = termFactory.makeString("@withincode");
    constS20 = termFactory.makeAppl(transform._consS_1, new IStrategoTerm[]{transform.const21});
    const22 = termFactory.makeString("@annotation");
    constS21 = termFactory.makeAppl(transform._consS_1, new IStrategoTerm[]{transform.const22});
    const23 = termFactory.makeString("@args");
    constS22 = termFactory.makeAppl(transform._consS_1, new IStrategoTerm[]{transform.const23});
    const24 = termFactory.makeString(".");
    constS23 = termFactory.makeAppl(transform._consS_1, new IStrategoTerm[]{transform.const24});
    const25 = termFactory.makeString("1");
    constSOpt1 = termFactory.makeAppl(transform._consSOpt_2, new IStrategoTerm[]{transform.constHS0, transform.const25});
    constCons4 = (IStrategoTerm)termFactory.makeListCons(transform.constSOpt1, (IStrategoList)transform.constNil0);
    const26 = termFactory.makeString("pointcut");
    constS24 = termFactory.makeAppl(transform._consS_1, new IStrategoTerm[]{transform.const26});
    constFBOX15 = termFactory.makeAppl(transform._consFBOX_2, new IStrategoTerm[]{transform.constKW0, transform.constS24});
    const27 = termFactory.makeString(";");
    constS25 = termFactory.makeAppl(transform._consS_1, new IStrategoTerm[]{transform.const27});
    constCons5 = (IStrategoTerm)termFactory.makeListCons(transform.constS25, (IStrategoList)transform.constNil0);
    const28 = termFactory.makeString(":");
    constS26 = termFactory.makeAppl(transform._consS_1, new IStrategoTerm[]{transform.const28});
    constFBOX16 = termFactory.makeAppl(transform._consFBOX_2, new IStrategoTerm[]{transform.constKW0, transform.constS25});
    const29 = termFactory.makeString("+");
    constS27 = termFactory.makeAppl(transform._consS_1, new IStrategoTerm[]{transform.const29});
    constCons6 = (IStrategoTerm)termFactory.makeListCons(transform.constS27, (IStrategoList)transform.constNil0);
    constFBOX17 = termFactory.makeAppl(transform._consFBOX_2, new IStrategoTerm[]{transform.constKW0, transform.constS23});
    const30 = termFactory.makeString("..");
    constS28 = termFactory.makeAppl(transform._consS_1, new IStrategoTerm[]{transform.const30});
    constFBOX18 = termFactory.makeAppl(transform._consFBOX_2, new IStrategoTerm[]{transform.constKW0, transform.constS28});
    const31 = termFactory.makeString("...");
    constS29 = termFactory.makeAppl(transform._consS_1, new IStrategoTerm[]{transform.const31});
    constCons7 = (IStrategoTerm)termFactory.makeListCons(transform.constS29, (IStrategoList)transform.constNil0);
    const32 = termFactory.makeString("*");
    constS30 = termFactory.makeAppl(transform._consS_1, new IStrategoTerm[]{transform.const32});
    const33 = termFactory.makeString("new");
    constS31 = termFactory.makeAppl(transform._consS_1, new IStrategoTerm[]{transform.const33});
    constFBOX19 = termFactory.makeAppl(transform._consFBOX_2, new IStrategoTerm[]{transform.constKW0, transform.constS31});
    constCons8 = (IStrategoTerm)termFactory.makeListCons(transform.constFBOX19, (IStrategoList)transform.constNil0);
    constCons9 = (IStrategoTerm)termFactory.makeListCons(transform.constS23, (IStrategoList)transform.constCons8);
    constCons10 = (IStrategoTerm)termFactory.makeListCons(transform.constS28, (IStrategoList)transform.constCons8);
    const34 = termFactory.makeString("!");
    constS32 = termFactory.makeAppl(transform._consS_1, new IStrategoTerm[]{transform.const34});
    const35 = termFactory.makeString("throws");
    constS33 = termFactory.makeAppl(transform._consS_1, new IStrategoTerm[]{transform.const35});
    constFBOX20 = termFactory.makeAppl(transform._consFBOX_2, new IStrategoTerm[]{transform.constKW0, transform.constS33});
    const36 = termFactory.makeString("@");
    constS34 = termFactory.makeAppl(transform._consS_1, new IStrategoTerm[]{transform.const36});
    const37 = termFactory.makeString("&&");
    constS35 = termFactory.makeAppl(transform._consS_1, new IStrategoTerm[]{transform.const37});
    const38 = termFactory.makeString("||");
    constS36 = termFactory.makeAppl(transform._consS_1, new IStrategoTerm[]{transform.const38});
    constVS0 = termFactory.makeAppl(transform._consVS_0, NO_TERMS);
    constSOpt2 = termFactory.makeAppl(transform._consSOpt_2, new IStrategoTerm[]{transform.constVS0, transform.const0});
    constCons11 = (IStrategoTerm)termFactory.makeListCons(transform.constSOpt2, (IStrategoList)transform.constNil0);
    constFBOX21 = termFactory.makeAppl(transform._consFBOX_2, new IStrategoTerm[]{transform.constKW0, transform.constS26});
    constFBOX22 = termFactory.makeAppl(transform._consFBOX_2, new IStrategoTerm[]{transform.constKW0, transform.constS0});
    constCons12 = (IStrategoTerm)termFactory.makeListCons(transform.constFBOX22, (IStrategoList)transform.constNil0);
    constFBOX23 = termFactory.makeAppl(transform._consFBOX_2, new IStrategoTerm[]{transform.constKW0, transform.constS1});
    const39 = termFactory.makeString("before");
    constS37 = termFactory.makeAppl(transform._consS_1, new IStrategoTerm[]{transform.const39});
    constFBOX24 = termFactory.makeAppl(transform._consFBOX_2, new IStrategoTerm[]{transform.constKW0, transform.constS37});
    const40 = termFactory.makeString("after");
    constS38 = termFactory.makeAppl(transform._consS_1, new IStrategoTerm[]{transform.const40});
    constFBOX25 = termFactory.makeAppl(transform._consFBOX_2, new IStrategoTerm[]{transform.constKW0, transform.constS38});
    const41 = termFactory.makeString("around");
    constS39 = termFactory.makeAppl(transform._consS_1, new IStrategoTerm[]{transform.const41});
    constFBOX26 = termFactory.makeAppl(transform._consFBOX_2, new IStrategoTerm[]{transform.constKW0, transform.constS39});
    const42 = termFactory.makeString("returning");
    constS40 = termFactory.makeAppl(transform._consS_1, new IStrategoTerm[]{transform.const42});
    constFBOX27 = termFactory.makeAppl(transform._consFBOX_2, new IStrategoTerm[]{transform.constKW0, transform.constS40});
    const43 = termFactory.makeString("throwing");
    constS41 = termFactory.makeAppl(transform._consS_1, new IStrategoTerm[]{transform.const43});
    constFBOX28 = termFactory.makeAppl(transform._consFBOX_2, new IStrategoTerm[]{transform.constKW0, transform.constS41});
    constCons13 = (IStrategoTerm)termFactory.makeListCons(transform.constFBOX16, (IStrategoList)transform.constNil0);
    const44 = termFactory.makeString("parents");
    constS42 = termFactory.makeAppl(transform._consS_1, new IStrategoTerm[]{transform.const44});
    constFBOX29 = termFactory.makeAppl(transform._consFBOX_2, new IStrategoTerm[]{transform.constKW0, transform.constS42});
    const45 = termFactory.makeString("declare");
    constS43 = termFactory.makeAppl(transform._consS_1, new IStrategoTerm[]{transform.const45});
    constFBOX30 = termFactory.makeAppl(transform._consFBOX_2, new IStrategoTerm[]{transform.constKW0, transform.constS43});
    const46 = termFactory.makeString("warning");
    constS44 = termFactory.makeAppl(transform._consS_1, new IStrategoTerm[]{transform.const46});
    constFBOX31 = termFactory.makeAppl(transform._consFBOX_2, new IStrategoTerm[]{transform.constKW0, transform.constS44});
    const47 = termFactory.makeString("error");
    constS45 = termFactory.makeAppl(transform._consS_1, new IStrategoTerm[]{transform.const47});
    constFBOX32 = termFactory.makeAppl(transform._consFBOX_2, new IStrategoTerm[]{transform.constKW0, transform.constS45});
    const48 = termFactory.makeString("soft");
    constS46 = termFactory.makeAppl(transform._consS_1, new IStrategoTerm[]{transform.const48});
    constFBOX33 = termFactory.makeAppl(transform._consFBOX_2, new IStrategoTerm[]{transform.constKW0, transform.constS46});
    const49 = termFactory.makeString("precedence");
    constS47 = termFactory.makeAppl(transform._consS_1, new IStrategoTerm[]{transform.const49});
    constFBOX34 = termFactory.makeAppl(transform._consFBOX_2, new IStrategoTerm[]{transform.constKW0, transform.constS47});
    const50 = termFactory.makeString("@type");
    constS48 = termFactory.makeAppl(transform._consS_1, new IStrategoTerm[]{transform.const50});
    const51 = termFactory.makeString("@constructor");
    constS49 = termFactory.makeAppl(transform._consS_1, new IStrategoTerm[]{transform.const51});
    const52 = termFactory.makeString("@method");
    constS50 = termFactory.makeAppl(transform._consS_1, new IStrategoTerm[]{transform.const52});
    const53 = termFactory.makeString("@field");
    constS51 = termFactory.makeAppl(transform._consS_1, new IStrategoTerm[]{transform.const53});
    const54 = termFactory.makeString("aspect");
    constS52 = termFactory.makeAppl(transform._consS_1, new IStrategoTerm[]{transform.const54});
    constFBOX35 = termFactory.makeAppl(transform._consFBOX_2, new IStrategoTerm[]{transform.constKW0, transform.constS52});
    const55 = termFactory.makeString("pertarget");
    constS53 = termFactory.makeAppl(transform._consS_1, new IStrategoTerm[]{transform.const55});
    constFBOX36 = termFactory.makeAppl(transform._consFBOX_2, new IStrategoTerm[]{transform.constKW0, transform.constS53});
    const56 = termFactory.makeString("perthis");
    constS54 = termFactory.makeAppl(transform._consS_1, new IStrategoTerm[]{transform.const56});
    constFBOX37 = termFactory.makeAppl(transform._consFBOX_2, new IStrategoTerm[]{transform.constKW0, transform.constS54});
    const57 = termFactory.makeString("percflow");
    constS55 = termFactory.makeAppl(transform._consS_1, new IStrategoTerm[]{transform.const57});
    constFBOX38 = termFactory.makeAppl(transform._consFBOX_2, new IStrategoTerm[]{transform.constKW0, transform.constS55});
    const58 = termFactory.makeString("percflowbelow");
    constS56 = termFactory.makeAppl(transform._consS_1, new IStrategoTerm[]{transform.const58});
    constFBOX39 = termFactory.makeAppl(transform._consFBOX_2, new IStrategoTerm[]{transform.constKW0, transform.constS56});
    const59 = termFactory.makeString("pertypewithin");
    constS57 = termFactory.makeAppl(transform._consS_1, new IStrategoTerm[]{transform.const59});
    constFBOX40 = termFactory.makeAppl(transform._consFBOX_2, new IStrategoTerm[]{transform.constKW0, transform.constS57});
    const60 = termFactory.makeString("issingleton");
    constS58 = termFactory.makeAppl(transform._consS_1, new IStrategoTerm[]{transform.const60});
    constFBOX41 = termFactory.makeAppl(transform._consFBOX_2, new IStrategoTerm[]{transform.constKW0, transform.constS58});
    const61 = termFactory.makeString("}");
    constS59 = termFactory.makeAppl(transform._consS_1, new IStrategoTerm[]{transform.const61});
    constFBOX42 = termFactory.makeAppl(transform._consFBOX_2, new IStrategoTerm[]{transform.constKW0, transform.constS59});
    constCons14 = (IStrategoTerm)termFactory.makeListCons(transform.constFBOX42, (IStrategoList)transform.constNil0);
    constIS0 = termFactory.makeAppl(transform._consIS_0, NO_TERMS);
    const62 = termFactory.makeString("2");
    constSOpt3 = termFactory.makeAppl(transform._consSOpt_2, new IStrategoTerm[]{transform.constIS0, transform.const62});
    constCons15 = (IStrategoTerm)termFactory.makeListCons(transform.constSOpt3, (IStrategoList)transform.constNil0);
    constCons16 = (IStrategoTerm)termFactory.makeListCons(transform.constSOpt2, (IStrategoList)transform.constCons15);
    constSOpt4 = termFactory.makeAppl(transform._consSOpt_2, new IStrategoTerm[]{transform.constVS0, transform.const25});
    constCons17 = (IStrategoTerm)termFactory.makeListCons(transform.constSOpt4, (IStrategoList)transform.constNil0);
    const63 = termFactory.makeString("{");
    constS60 = termFactory.makeAppl(transform._consS_1, new IStrategoTerm[]{transform.const63});
    constFBOX43 = termFactory.makeAppl(transform._consFBOX_2, new IStrategoTerm[]{transform.constKW0, transform.constS60});
    const64 = termFactory.makeString("privileged");
    constS61 = termFactory.makeAppl(transform._consS_1, new IStrategoTerm[]{transform.const64});
    constFBOX44 = termFactory.makeAppl(transform._consFBOX_2, new IStrategoTerm[]{transform.constKW0, transform.constS61});
    const65 = termFactory.makeString("proceed");
    constS62 = termFactory.makeAppl(transform._consS_1, new IStrategoTerm[]{transform.const65});
    constFBOX45 = termFactory.makeAppl(transform._consFBOX_2, new IStrategoTerm[]{transform.constKW0, transform.constS62});
    const66 = termFactory.makeString("call");
    constS63 = termFactory.makeAppl(transform._consS_1, new IStrategoTerm[]{transform.const66});
    constFBOX46 = termFactory.makeAppl(transform._consFBOX_2, new IStrategoTerm[]{transform.constKW0, transform.constS63});
    const67 = termFactory.makeString("execution");
    constS64 = termFactory.makeAppl(transform._consS_1, new IStrategoTerm[]{transform.const67});
    constFBOX47 = termFactory.makeAppl(transform._consFBOX_2, new IStrategoTerm[]{transform.constKW0, transform.constS64});
    const68 = termFactory.makeInt(80);
    constNone0 = termFactory.makeAppl(transform._consNone_0, NO_TERMS);
    constStatic0 = termFactory.makeAppl(transform._consStatic_0, NO_TERMS);
    constCons18 = (IStrategoTerm)termFactory.makeListCons(transform.constStatic0, (IStrategoList)transform.constNil0);
    constPublic0 = termFactory.makeAppl(transform._consPublic_0, NO_TERMS);
    constCons19 = (IStrategoTerm)termFactory.makeListCons(transform.constPublic0, (IStrategoList)transform.constCons18);
    constVoid0 = termFactory.makeAppl(transform._consVoid_0, NO_TERMS);
    constBlock0 = termFactory.makeAppl(transform._consBlock_1, new IStrategoTerm[]{transform.constNil0});
    const69 = termFactory.makeString("Closure");
    constId0 = termFactory.makeAppl(transform._consId_1, new IStrategoTerm[]{transform.const69});
    constTypeName0 = termFactory.makeAppl(transform._consTypeName_1, new IStrategoTerm[]{transform.constId0});
    constSimpleAnnoPatternExact0 = termFactory.makeAppl(transform._consSimpleAnnoPatternExact_1, new IStrategoTerm[]{transform.constTypeName0});
    constCons20 = (IStrategoTerm)termFactory.makeListCons(transform.constSimpleAnnoPatternExact0, (IStrategoList)transform.constNil0);
    constAnnoPattern0 = termFactory.makeAppl(transform._consAnnoPattern_1, new IStrategoTerm[]{transform.constCons20});
    constModPattern0 = termFactory.makeAppl(transform._consModPattern_1, new IStrategoTerm[]{transform.constNil0});
    constNamePattern0 = termFactory.makeAppl(transform._consNamePattern_1, new IStrategoTerm[]{transform.const32});
    constRefTypePattern0 = termFactory.makeAppl(transform._consRefTypePattern_1, new IStrategoTerm[]{transform.constNamePattern0});
    const70 = termFactory.makeString(",");
    const71 = termFactory.makeString("in closures..");
    const72 = termFactory.makeString("Object");
    constId1 = termFactory.makeAppl(transform._consId_1, new IStrategoTerm[]{transform.const72});
    constTypeName1 = termFactory.makeAppl(transform._consTypeName_1, new IStrategoTerm[]{transform.constId1});
    constClassOrInterfaceType0 = termFactory.makeAppl(transform._consClassOrInterfaceType_2, new IStrategoTerm[]{transform.constTypeName1, transform.constNone0});
    constCons21 = (IStrategoTerm)termFactory.makeListCons(transform.constPublic0, (IStrategoList)transform.constNil0);
    constMarkerAnno0 = termFactory.makeAppl(transform._consMarkerAnno_1, new IStrategoTerm[]{transform.constTypeName0});
    constCons22 = (IStrategoTerm)termFactory.makeListCons(transform.constMarkerAnno0, (IStrategoList)transform.constCons21);
    const73 = termFactory.makeString("in short closures..");
    const74 = termFactory.makeString("w");
    const75 = termFactory.makeString("bbb");
    const76 = termFactory.makeString("ccc");
    const77 = termFactory.makeString("dddd");
    const78 = termFactory.makeString("runtime");
    constId2 = termFactory.makeAppl(transform._consId_1, new IStrategoTerm[]{transform.const78});
    constCons23 = (IStrategoTerm)termFactory.makeListCons(transform.constId2, (IStrategoList)transform.constNil0);
    const79 = termFactory.makeString("closures");
    constId3 = termFactory.makeAppl(transform._consId_1, new IStrategoTerm[]{transform.const79});
    constCons24 = (IStrategoTerm)termFactory.makeListCons(transform.constId3, (IStrategoList)transform.constCons23);
    constPackageName0 = termFactory.makeAppl(transform._consPackageName_1, new IStrategoTerm[]{transform.constCons24});
    constTypeImportOnDemandDec0 = termFactory.makeAppl(transform._consTypeImportOnDemandDec_1, new IStrategoTerm[]{transform.constPackageName0});
    constCons25 = (IStrategoTerm)termFactory.makeListCons(transform.constTypeImportOnDemandDec0, (IStrategoList)transform.constNil0);
    const80 = termFactory.makeString("eee");
    const81 = termFactory.makeString("fff");
    const82 = termFactory.makeString("Internal error: with clause failed unexpectedly in rule 'closures-converter-compilation-unit'");
    const83 = termFactory.makeString("aaaa");
    const84 = termFactory.makeString("Internal error: with clause failed unexpectedly in rule 'check-for-change-in-aspect-or-class'");
    const85 = termFactory.makeString("Internal error: with clause failed unexpectedly in rule 'closures-converter-aspect-or-class'");
  }

  @SuppressWarnings("all") public static class aspectj_to_box_0_0_fragment_4 extends Strategy 
  { 
    public static aspectj_to_box_0_0_fragment_4 instance = new aspectj_to_box_0_0_fragment_4();

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      ITermFactory termFactory = context.getFactory();
      context.push("aspectj_to_box_0_0_fragment_4");
      Fail0:
      { 
        IStrategoTerm term0 = term;
        IStrategoConstructor cons0 = term.getTermType() == IStrategoTerm.APPL ? ((IStrategoAppl)term).getConstructor() : null;
        Success0:
        { 
          if(cons0 == transform._consInitExec_1)
          { 
            Fail1:
            { 
              IStrategoTerm h_20 = null;
              h_20 = term.getSubterm(0);
              term = termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{transform.constCons0, (IStrategoTerm)termFactory.makeListCons(transform.constFBOX0, termFactory.makeListCons(transform.constS1, termFactory.makeListCons(h_20, (IStrategoList)transform.constCons1)))});
              if(true)
                break Success0;
            }
            term = term0;
          }
          Success1:
          { 
            if(cons0 == transform._consPreInitExec_1)
            { 
              Fail2:
              { 
                IStrategoTerm g_20 = null;
                g_20 = term.getSubterm(0);
                term = termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{transform.constCons0, (IStrategoTerm)termFactory.makeListCons(transform.constFBOX1, termFactory.makeListCons(transform.constS1, termFactory.makeListCons(g_20, (IStrategoList)transform.constCons1)))});
                if(true)
                  break Success1;
              }
              term = term0;
            }
            Success2:
            { 
              if(cons0 == transform._consStaticInitExec_1)
              { 
                Fail3:
                { 
                  IStrategoTerm f_20 = null;
                  f_20 = term.getSubterm(0);
                  term = termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{transform.constCons0, (IStrategoTerm)termFactory.makeListCons(transform.constFBOX2, termFactory.makeListCons(transform.constS1, termFactory.makeListCons(f_20, (IStrategoList)transform.constCons1)))});
                  if(true)
                    break Success2;
                }
                term = term0;
              }
              Success3:
              { 
                if(cons0 == transform._consGetField_1)
                { 
                  Fail4:
                  { 
                    IStrategoTerm e_20 = null;
                    e_20 = term.getSubterm(0);
                    term = termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{transform.constCons0, (IStrategoTerm)termFactory.makeListCons(transform.constFBOX3, termFactory.makeListCons(transform.constS1, termFactory.makeListCons(e_20, (IStrategoList)transform.constCons1)))});
                    if(true)
                      break Success3;
                  }
                  term = term0;
                }
                Success4:
                { 
                  if(cons0 == transform._consSetField_1)
                  { 
                    Fail5:
                    { 
                      IStrategoTerm d_20 = null;
                      d_20 = term.getSubterm(0);
                      term = termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{transform.constCons0, (IStrategoTerm)termFactory.makeListCons(transform.constFBOX4, termFactory.makeListCons(transform.constS1, termFactory.makeListCons(d_20, (IStrategoList)transform.constCons1)))});
                      if(true)
                        break Success4;
                    }
                    term = term0;
                  }
                  Success5:
                  { 
                    if(cons0 == transform._consHandler_1)
                    { 
                      Fail6:
                      { 
                        IStrategoTerm c_20 = null;
                        c_20 = term.getSubterm(0);
                        term = termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{transform.constCons0, (IStrategoTerm)termFactory.makeListCons(transform.constFBOX5, termFactory.makeListCons(transform.constS1, termFactory.makeListCons(c_20, (IStrategoList)transform.constCons1)))});
                        if(true)
                          break Success5;
                      }
                      term = term0;
                    }
                    Success6:
                    { 
                      if(cons0 == transform._consAdviceExec_0)
                      { 
                        Fail7:
                        { 
                          term = transform.constH0;
                          if(true)
                            break Success6;
                        }
                        term = term0;
                      }
                      Success7:
                      { 
                        if(cons0 == transform._consWithin_1)
                        { 
                          Fail8:
                          { 
                            IStrategoTerm b_20 = null;
                            b_20 = term.getSubterm(0);
                            term = termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{transform.constCons0, (IStrategoTerm)termFactory.makeListCons(transform.constFBOX7, termFactory.makeListCons(transform.constS1, termFactory.makeListCons(b_20, (IStrategoList)transform.constCons1)))});
                            if(true)
                              break Success7;
                          }
                          term = term0;
                        }
                        Success8:
                        { 
                          if(cons0 == transform._consWithinCode_1)
                          { 
                            Fail9:
                            { 
                              IStrategoTerm a_20 = null;
                              a_20 = term.getSubterm(0);
                              term = termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{transform.constCons0, (IStrategoTerm)termFactory.makeListCons(transform.constFBOX8, termFactory.makeListCons(transform.constS1, termFactory.makeListCons(a_20, (IStrategoList)transform.constCons1)))});
                              if(true)
                                break Success8;
                            }
                            term = term0;
                          }
                          Success9:
                          { 
                            if(cons0 == transform._consCFlow_1)
                            { 
                              Fail10:
                              { 
                                IStrategoTerm z_19 = null;
                                z_19 = term.getSubterm(0);
                                term = termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{transform.constCons0, (IStrategoTerm)termFactory.makeListCons(transform.constFBOX9, termFactory.makeListCons(transform.constS1, termFactory.makeListCons(z_19, (IStrategoList)transform.constCons1)))});
                                if(true)
                                  break Success9;
                              }
                              term = term0;
                            }
                            Success10:
                            { 
                              if(cons0 == transform._consCFlowBelow_1)
                              { 
                                Fail11:
                                { 
                                  IStrategoTerm y_19 = null;
                                  y_19 = term.getSubterm(0);
                                  term = termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{transform.constCons0, (IStrategoTerm)termFactory.makeListCons(transform.constFBOX10, termFactory.makeListCons(transform.constS1, termFactory.makeListCons(y_19, (IStrategoList)transform.constCons1)))});
                                  if(true)
                                    break Success10;
                                }
                                term = term0;
                              }
                              Success11:
                              { 
                                if(cons0 == transform._consIf_1)
                                { 
                                  Fail12:
                                  { 
                                    IStrategoTerm x_19 = null;
                                    x_19 = term.getSubterm(0);
                                    term = termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{transform.constCons0, (IStrategoTerm)termFactory.makeListCons(transform.constFBOX11, termFactory.makeListCons(transform.constS1, termFactory.makeListCons(x_19, (IStrategoList)transform.constCons1)))});
                                    if(true)
                                      break Success11;
                                  }
                                  term = term0;
                                }
                                Success12:
                                { 
                                  if(cons0 == transform._consThis_1)
                                  { 
                                    Fail13:
                                    { 
                                      IStrategoTerm w_19 = null;
                                      w_19 = term.getSubterm(0);
                                      term = termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{transform.constCons0, (IStrategoTerm)termFactory.makeListCons(transform.constFBOX12, termFactory.makeListCons(transform.constS1, termFactory.makeListCons(w_19, (IStrategoList)transform.constCons1)))});
                                      if(true)
                                        break Success12;
                                    }
                                    term = term0;
                                  }
                                  Success13:
                                  { 
                                    if(cons0 == transform._consTarget_1)
                                    { 
                                      Fail14:
                                      { 
                                        IStrategoTerm u_19 = null;
                                        u_19 = term.getSubterm(0);
                                        term = termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{transform.constCons0, (IStrategoTerm)termFactory.makeListCons(transform.constFBOX13, termFactory.makeListCons(transform.constS1, termFactory.makeListCons(u_19, (IStrategoList)transform.constCons1)))});
                                        if(true)
                                          break Success13;
                                      }
                                      term = term0;
                                    }
                                    Success14:
                                    { 
                                      if(cons0 == transform._consArgs_1)
                                      { 
                                        Fail15:
                                        { 
                                          IStrategoTerm r_19 = null;
                                          r_19 = term.getSubterm(0);
                                          term = list_to_args_0_0.instance.invoke(context, r_19);
                                          if(term == null)
                                            break Fail15;
                                          term = termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{transform.constCons0, (IStrategoTerm)termFactory.makeListCons(transform.constFBOX14, termFactory.makeListCons(term, (IStrategoList)transform.constNil0))});
                                          if(true)
                                            break Success14;
                                        }
                                        term = term0;
                                      }
                                      Success15:
                                      { 
                                        if(cons0 == transform._consNamedPointcut_2)
                                        { 
                                          Fail16:
                                          { 
                                            IStrategoTerm n_19 = null;
                                            IStrategoTerm o_19 = null;
                                            n_19 = term.getSubterm(0);
                                            o_19 = term.getSubterm(1);
                                            term = list_to_args_0_0.instance.invoke(context, o_19);
                                            if(term == null)
                                              break Fail16;
                                            term = termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{transform.constCons0, (IStrategoTerm)termFactory.makeListCons(n_19, termFactory.makeListCons(term, (IStrategoList)transform.constNil0))});
                                            if(true)
                                              break Success15;
                                          }
                                          term = term0;
                                        }
                                        Success16:
                                        { 
                                          if(cons0 == transform._consAtThis_1)
                                          { 
                                            Fail17:
                                            { 
                                              IStrategoTerm m_19 = null;
                                              m_19 = term.getSubterm(0);
                                              term = termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{transform.constCons0, (IStrategoTerm)termFactory.makeListCons(transform.constS17, termFactory.makeListCons(transform.constS1, termFactory.makeListCons(m_19, (IStrategoList)transform.constCons1)))});
                                              if(true)
                                                break Success16;
                                            }
                                            term = term0;
                                          }
                                          Success17:
                                          { 
                                            if(cons0 == transform._consAtTarget_1)
                                            { 
                                              Fail18:
                                              { 
                                                IStrategoTerm l_19 = null;
                                                l_19 = term.getSubterm(0);
                                                term = termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{transform.constCons0, (IStrategoTerm)termFactory.makeListCons(transform.constS18, termFactory.makeListCons(transform.constS1, termFactory.makeListCons(l_19, (IStrategoList)transform.constCons1)))});
                                                if(true)
                                                  break Success17;
                                              }
                                              term = term0;
                                            }
                                            term = aspectj_to_box_0_0_fragment_3.instance.invoke(context, term);
                                            if(term == null)
                                              break Fail0;
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

  @SuppressWarnings("all") public static class aspectj_to_box_0_0_fragment_3 extends Strategy 
  { 
    public static aspectj_to_box_0_0_fragment_3 instance = new aspectj_to_box_0_0_fragment_3();

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      ITermFactory termFactory = context.getFactory();
      context.push("aspectj_to_box_0_0_fragment_3");
      Fail19:
      { 
        IStrategoTerm term18 = term;
        IStrategoConstructor cons1 = term.getTermType() == IStrategoTerm.APPL ? ((IStrategoAppl)term).getConstructor() : null;
        Success18:
        { 
          if(cons1 == transform._consAtWithin_1)
          { 
            Fail20:
            { 
              IStrategoTerm k_19 = null;
              k_19 = term.getSubterm(0);
              term = termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{transform.constCons0, (IStrategoTerm)termFactory.makeListCons(transform.constS19, termFactory.makeListCons(transform.constS1, termFactory.makeListCons(k_19, (IStrategoList)transform.constCons1)))});
              if(true)
                break Success18;
            }
            term = term18;
          }
          Success19:
          { 
            if(cons1 == transform._consAtWithinCode_1)
            { 
              Fail21:
              { 
                IStrategoTerm h_19 = null;
                h_19 = term.getSubterm(0);
                term = termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{transform.constCons0, (IStrategoTerm)termFactory.makeListCons(transform.constS20, termFactory.makeListCons(transform.constS1, termFactory.makeListCons(h_19, (IStrategoList)transform.constCons1)))});
                if(true)
                  break Success19;
              }
              term = term18;
            }
            Success20:
            { 
              if(cons1 == transform._consAtAnno_1)
              { 
                Fail22:
                { 
                  IStrategoTerm g_19 = null;
                  g_19 = term.getSubterm(0);
                  term = termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{transform.constCons0, (IStrategoTerm)termFactory.makeListCons(transform.constS21, termFactory.makeListCons(transform.constS1, termFactory.makeListCons(g_19, (IStrategoList)transform.constCons1)))});
                  if(true)
                    break Success20;
                }
                term = term18;
              }
              Success21:
              { 
                if(cons1 == transform._consAtArgs_1)
                { 
                  Fail23:
                  { 
                    IStrategoTerm d_19 = null;
                    d_19 = term.getSubterm(0);
                    term = list_to_args_0_0.instance.invoke(context, d_19);
                    if(term == null)
                      break Fail23;
                    term = termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{transform.constCons0, (IStrategoTerm)termFactory.makeListCons(transform.constS22, termFactory.makeListCons(term, (IStrategoList)transform.constNil0))});
                    if(true)
                      break Success21;
                  }
                  term = term18;
                }
                Success22:
                { 
                  if(cons1 == transform._consPointcutName_1)
                  { 
                    Fail24:
                    { 
                      IStrategoTerm b_19 = null;
                      b_19 = term.getSubterm(0);
                      term = b_19;
                      if(true)
                        break Success22;
                    }
                    term = term18;
                  }
                  Success23:
                  { 
                    if(cons1 == transform._consPointcutName_2)
                    { 
                      Fail25:
                      { 
                        IStrategoTerm z_18 = null;
                        IStrategoTerm a_19 = null;
                        z_18 = term.getSubterm(0);
                        a_19 = term.getSubterm(1);
                        term = termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{transform.constCons0, (IStrategoTerm)termFactory.makeListCons(z_18, termFactory.makeListCons(transform.constS23, termFactory.makeListCons(a_19, (IStrategoList)transform.constNil0)))});
                        if(true)
                          break Success23;
                      }
                      term = term18;
                    }
                    Success24:
                    { 
                      if(cons1 == transform._consPointcutDec_2)
                      { 
                        Fail26:
                        { 
                          IStrategoTerm x_18 = null;
                          IStrategoTerm y_18 = null;
                          x_18 = term.getSubterm(0);
                          y_18 = term.getSubterm(1);
                          term = termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{transform.constCons4, (IStrategoTerm)termFactory.makeListCons(x_18, termFactory.makeListCons(y_18, (IStrategoList)transform.constNil0))});
                          if(true)
                            break Success24;
                        }
                        term = term18;
                      }
                      Success25:
                      { 
                        if(cons1 == transform._consPointcutDecHead_3)
                        { 
                          Fail27:
                          { 
                            IStrategoTerm q_18 = null;
                            IStrategoTerm r_18 = null;
                            IStrategoTerm s_18 = null;
                            IStrategoTerm t_18 = null;
                            q_18 = term.getSubterm(0);
                            r_18 = term.getSubterm(1);
                            s_18 = term.getSubterm(2);
                            term = list_to_args_0_0.instance.invoke(context, s_18);
                            if(term == null)
                              break Fail27;
                            t_18 = term;
                            term = termFactory.makeTuple(q_18, (IStrategoTerm)termFactory.makeListCons(transform.constFBOX15, termFactory.makeListCons(r_18, termFactory.makeListCons(t_18, (IStrategoList)transform.constNil0))));
                            term = make$Conc_0_0.instance.invoke(context, term);
                            if(term == null)
                              break Fail27;
                            term = termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{transform.constCons4, term});
                            if(true)
                              break Success25;
                          }
                          term = term18;
                        }
                        Success26:
                        { 
                          if(cons1 == transform._consPointcutBody_1)
                          { 
                            Fail28:
                            { 
                              IStrategoTerm p_18 = null;
                              p_18 = term.getSubterm(0);
                              term = termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{transform.constCons0, (IStrategoTerm)termFactory.makeListCons(transform.constS26, termFactory.makeListCons(p_18, (IStrategoList)transform.constCons5))});
                              if(true)
                                break Success26;
                            }
                            term = term18;
                          }
                          Success27:
                          { 
                            if(cons1 == transform._consNoPointcutBody_0)
                            { 
                              Fail29:
                              { 
                                term = transform.constFBOX16;
                                if(true)
                                  break Success27;
                              }
                              term = term18;
                            }
                            Success28:
                            { 
                              if(cons1 == transform._consRefTypePattern_1)
                              { 
                                Fail30:
                                { 
                                  IStrategoTerm o_18 = null;
                                  o_18 = term.getSubterm(0);
                                  term = o_18;
                                  if(true)
                                    break Success28;
                                }
                                term = term18;
                              }
                              Success29:
                              { 
                                if(cons1 == transform._consPrimTypePattern_1)
                                { 
                                  Fail31:
                                  { 
                                    IStrategoTerm n_18 = null;
                                    n_18 = term.getSubterm(0);
                                    term = n_18;
                                    if(true)
                                      break Success29;
                                  }
                                  term = term18;
                                }
                                Success30:
                                { 
                                  if(cons1 == transform._consSubtype_1)
                                  { 
                                    Fail32:
                                    { 
                                      IStrategoTerm m_18 = null;
                                      m_18 = term.getSubterm(0);
                                      term = termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{transform.constCons0, (IStrategoTerm)termFactory.makeListCons(m_18, (IStrategoList)transform.constCons6)});
                                      if(true)
                                        break Success30;
                                    }
                                    term = term18;
                                  }
                                  Success31:
                                  { 
                                    if(cons1 == transform._consGenericTypePattern_2)
                                    { 
                                      Fail33:
                                      { 
                                        IStrategoTerm k_18 = null;
                                        IStrategoTerm l_18 = null;
                                        k_18 = term.getSubterm(0);
                                        l_18 = term.getSubterm(1);
                                        term = termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{transform.constCons0, (IStrategoTerm)termFactory.makeListCons(k_18, termFactory.makeListCons(l_18, (IStrategoList)transform.constNil0))});
                                        if(true)
                                          break Success31;
                                      }
                                      term = term18;
                                    }
                                    Success32:
                                    { 
                                      if(cons1 == transform._consGenericSubtypePattern_2)
                                      { 
                                        Fail34:
                                        { 
                                          IStrategoTerm g_18 = null;
                                          IStrategoTerm j_18 = null;
                                          g_18 = term.getSubterm(0);
                                          j_18 = term.getSubterm(1);
                                          term = termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{transform.constCons0, (IStrategoTerm)termFactory.makeListCons(g_18, termFactory.makeListCons(j_18, (IStrategoList)transform.constCons6))});
                                          if(true)
                                            break Success32;
                                        }
                                        term = term18;
                                      }
                                      Success33:
                                      { 
                                        if(cons1 == transform._consAnnoTypePattern_2)
                                        { 
                                          Fail35:
                                          { 
                                            IStrategoTerm c_18 = null;
                                            IStrategoTerm d_18 = null;
                                            IStrategoTerm arg0 = term.getSubterm(0);
                                            if(arg0.getTermType() != IStrategoTerm.APPL || transform._consAnnoPattern_1 != ((IStrategoAppl)arg0).getConstructor())
                                              break Fail35;
                                            c_18 = arg0.getSubterm(0);
                                            d_18 = term.getSubterm(1);
                                            term = termFactory.makeTuple(c_18, (IStrategoTerm)termFactory.makeListCons(d_18, (IStrategoList)transform.constNil0));
                                            term = make$Conc_0_0.instance.invoke(context, term);
                                            if(term == null)
                                              break Fail35;
                                            term = termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{transform.constCons0, (IStrategoTerm)termFactory.makeListCons(termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{transform.constCons4, term}), (IStrategoList)transform.constNil0)});
                                            if(true)
                                              break Success33;
                                          }
                                          term = term18;
                                        }
                                        Success34:
                                        { 
                                          if(cons1 == transform._consNamePattern_1)
                                          { 
                                            Fail36:
                                            { 
                                              IStrategoTerm b_18 = null;
                                              b_18 = term.getSubterm(0);
                                              term = termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{transform.constCons0, (IStrategoTerm)termFactory.makeListCons(termFactory.makeAppl(transform._consS_1, new IStrategoTerm[]{b_18}), (IStrategoList)transform.constNil0)});
                                              if(true)
                                                break Success34;
                                            }
                                            term = term18;
                                          }
                                          Success35:
                                          { 
                                            if(cons1 == transform._consNamePattern_2)
                                            { 
                                              Fail37:
                                              { 
                                                IStrategoTerm z_17 = null;
                                                IStrategoTerm a_18 = null;
                                                z_17 = term.getSubterm(0);
                                                a_18 = term.getSubterm(1);
                                                term = termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{transform.constCons0, (IStrategoTerm)termFactory.makeListCons(z_17, termFactory.makeListCons(transform.constFBOX17, termFactory.makeListCons(termFactory.makeAppl(transform._consS_1, new IStrategoTerm[]{a_18}), (IStrategoList)transform.constNil0)))});
                                                if(true)
                                                  break Success35;
                                              }
                                              term = term18;
                                            }
                                            Success36:
                                            { 
                                              if(cons1 == transform._consWildcardNamePattern_2)
                                              { 
                                                Fail38:
                                                { 
                                                  IStrategoTerm x_17 = null;
                                                  IStrategoTerm y_17 = null;
                                                  x_17 = term.getSubterm(0);
                                                  y_17 = term.getSubterm(1);
                                                  term = termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{transform.constCons0, (IStrategoTerm)termFactory.makeListCons(x_17, termFactory.makeListCons(transform.constFBOX18, termFactory.makeListCons(termFactory.makeAppl(transform._consS_1, new IStrategoTerm[]{y_17}), (IStrategoList)transform.constNil0)))});
                                                  if(true)
                                                    break Success36;
                                                }
                                                term = term18;
                                              }
                                              Success37:
                                              { 
                                                if(cons1 == transform._consFormalWildcard_0)
                                                { 
                                                  Fail39:
                                                  { 
                                                    term = transform.constS28;
                                                    if(true)
                                                      break Success37;
                                                  }
                                                  term = term18;
                                                }
                                                Success38:
                                                { 
                                                  if(cons1 == transform._consVarArityParamPattern_1)
                                                  { 
                                                    Fail40:
                                                    { 
                                                      IStrategoTerm w_17 = null;
                                                      w_17 = term.getSubterm(0);
                                                      term = termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{transform.constCons4, (IStrategoTerm)termFactory.makeListCons(w_17, (IStrategoList)transform.constCons7)});
                                                      if(true)
                                                        break Success38;
                                                    }
                                                    term = term18;
                                                  }
                                                  Success39:
                                                  { 
                                                    if(cons1 == transform._consRegularTypePattern_1)
                                                    { 
                                                      Fail41:
                                                      { 
                                                        IStrategoTerm v_17 = null;
                                                        v_17 = term.getSubterm(0);
                                                        term = termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{transform.constCons0, (IStrategoTerm)termFactory.makeListCons(v_17, (IStrategoList)transform.constNil0)});
                                                        if(true)
                                                          break Success39;
                                                      }
                                                      term = term18;
                                                    }
                                                    Success40:
                                                    { 
                                                      if(cons1 == transform._consWildcard_0)
                                                      { 
                                                        Fail42:
                                                        { 
                                                          term = transform.constS30;
                                                          if(true)
                                                            break Success40;
                                                        }
                                                        term = term18;
                                                      }
                                                      Success41:
                                                      { 
                                                        if(cons1 == transform._consDotWildcard_0)
                                                        { 
                                                          Fail43:
                                                          { 
                                                            term = transform.constS28;
                                                            if(true)
                                                              break Success41;
                                                          }
                                                          term = term18;
                                                        }
                                                        Success42:
                                                        { 
                                                          if(cons1 == transform._consSimpleNamePattern_1)
                                                          { 
                                                            Fail44:
                                                            { 
                                                              IStrategoTerm u_17 = null;
                                                              u_17 = term.getSubterm(0);
                                                              term = u_17;
                                                              if(true)
                                                                break Success42;
                                                            }
                                                            term = term18;
                                                          }
                                                          Success43:
                                                          { 
                                                            if(cons1 == transform._consMethodPattern_6)
                                                            { 
                                                              Fail45:
                                                              { 
                                                                IStrategoTerm i_17 = null;
                                                                IStrategoTerm j_17 = null;
                                                                IStrategoTerm k_17 = null;
                                                                IStrategoTerm l_17 = null;
                                                                IStrategoTerm m_17 = null;
                                                                IStrategoTerm n_17 = null;
                                                                IStrategoTerm o_17 = null;
                                                                IStrategoTerm p_17 = null;
                                                                IStrategoTerm q_17 = null;
                                                                IStrategoTerm r_17 = null;
                                                                IStrategoTerm arg4 = term.getSubterm(0);
                                                                if(arg4.getTermType() != IStrategoTerm.APPL || transform._consAnnoPattern_1 != ((IStrategoAppl)arg4).getConstructor())
                                                                  break Fail45;
                                                                k_17 = arg4.getSubterm(0);
                                                                IStrategoTerm arg5 = term.getSubterm(1);
                                                                if(arg5.getTermType() != IStrategoTerm.APPL || transform._consModPattern_1 != ((IStrategoAppl)arg5).getConstructor())
                                                                  break Fail45;
                                                                l_17 = arg5.getSubterm(0);
                                                                i_17 = term.getSubterm(2);
                                                                j_17 = term.getSubterm(3);
                                                                n_17 = term.getSubterm(4);
                                                                p_17 = term.getSubterm(5);
                                                                r_17 = term;
                                                                term = termFactory.makeTuple(k_17, l_17);
                                                                term = conc_0_0.instance.invoke(context, term);
                                                                if(term == null)
                                                                  break Fail45;
                                                                m_17 = term;
                                                                term = list_to_args_0_0.instance.invoke(context, n_17);
                                                                if(term == null)
                                                                  break Fail45;
                                                                o_17 = term;
                                                                term = option_to_boxes_0_0.instance.invoke(context, p_17);
                                                                if(term == null)
                                                                  break Fail45;
                                                                q_17 = term;
                                                                term = r_17;
                                                                IStrategoList list0;
                                                                list0 = checkListTail(q_17);
                                                                if(list0 == null)
                                                                  break Fail45;
                                                                term = termFactory.makeTuple(m_17, (IStrategoTerm)termFactory.makeListCons(i_17, termFactory.makeListCons(termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{transform.constCons0, (IStrategoTerm)termFactory.makeListCons(j_17, termFactory.makeListCons(o_17, (IStrategoList)transform.constNil0))}), list0)));
                                                                term = make$Conc_0_0.instance.invoke(context, term);
                                                                if(term == null)
                                                                  break Fail45;
                                                                term = termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{transform.constCons4, term});
                                                                if(true)
                                                                  break Success43;
                                                              }
                                                              term = term18;
                                                            }
                                                            Success44:
                                                            { 
                                                              if(cons1 == transform._consConstrPattern_5)
                                                              { 
                                                                Fail46:
                                                                { 
                                                                  IStrategoTerm v_16 = null;
                                                                  IStrategoTerm w_16 = null;
                                                                  IStrategoTerm z_16 = null;
                                                                  IStrategoTerm a_17 = null;
                                                                  IStrategoTerm b_17 = null;
                                                                  IStrategoTerm c_17 = null;
                                                                  IStrategoTerm d_17 = null;
                                                                  IStrategoTerm arg6 = term.getSubterm(0);
                                                                  if(arg6.getTermType() != IStrategoTerm.APPL || transform._consAnnoPattern_1 != ((IStrategoAppl)arg6).getConstructor())
                                                                    break Fail46;
                                                                  z_16 = arg6.getSubterm(0);
                                                                  IStrategoTerm arg7 = term.getSubterm(1);
                                                                  if(arg7.getTermType() != IStrategoTerm.APPL || transform._consModPattern_1 != ((IStrategoAppl)arg7).getConstructor())
                                                                    break Fail46;
                                                                  a_17 = arg7.getSubterm(0);
                                                                  v_16 = term.getSubterm(2);
                                                                  c_17 = term.getSubterm(3);
                                                                  w_16 = term.getSubterm(4);
                                                                  term = termFactory.makeTuple(z_16, a_17);
                                                                  term = conc_0_0.instance.invoke(context, term);
                                                                  if(term == null)
                                                                    break Fail46;
                                                                  b_17 = term;
                                                                  term = list_to_args_0_0.instance.invoke(context, c_17);
                                                                  if(term == null)
                                                                    break Fail46;
                                                                  d_17 = term;
                                                                  term = termFactory.makeTuple(b_17, (IStrategoTerm)termFactory.makeListCons(termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{transform.constCons0, (IStrategoTerm)termFactory.makeListCons(v_16, termFactory.makeListCons(d_17, (IStrategoList)transform.constNil0))}), termFactory.makeListCons(w_16, (IStrategoList)transform.constNil0)));
                                                                  term = make$Conc_0_0.instance.invoke(context, term);
                                                                  if(term == null)
                                                                    break Fail46;
                                                                  term = termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{transform.constCons4, term});
                                                                  if(true)
                                                                    break Success44;
                                                                }
                                                                term = term18;
                                                              }
                                                              term = aspectj_to_box_0_0_fragment_2.instance.invoke(context, term);
                                                              if(term == null)
                                                                break Fail19;
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

  @SuppressWarnings("all") public static class aspectj_to_box_0_0_fragment_2 extends Strategy 
  { 
    public static aspectj_to_box_0_0_fragment_2 instance = new aspectj_to_box_0_0_fragment_2();

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      ITermFactory termFactory = context.getFactory();
      context.push("aspectj_to_box_0_0_fragment_2");
      Fail47:
      { 
        IStrategoTerm term45 = term;
        IStrategoConstructor cons2 = term.getTermType() == IStrategoTerm.APPL ? ((IStrategoAppl)term).getConstructor() : null;
        Success45:
        { 
          if(cons2 == transform._consFieldPattern_4)
          { 
            Fail48:
            { 
              IStrategoTerm j_16 = null;
              IStrategoTerm k_16 = null;
              IStrategoTerm l_16 = null;
              IStrategoTerm p_16 = null;
              IStrategoTerm q_16 = null;
              IStrategoTerm arg8 = term.getSubterm(0);
              if(arg8.getTermType() != IStrategoTerm.APPL || transform._consAnnoPattern_1 != ((IStrategoAppl)arg8).getConstructor())
                break Fail48;
              l_16 = arg8.getSubterm(0);
              IStrategoTerm arg9 = term.getSubterm(1);
              if(arg9.getTermType() != IStrategoTerm.APPL || transform._consModPattern_1 != ((IStrategoAppl)arg9).getConstructor())
                break Fail48;
              p_16 = arg9.getSubterm(0);
              j_16 = term.getSubterm(2);
              k_16 = term.getSubterm(3);
              term = termFactory.makeTuple(l_16, p_16);
              term = conc_0_0.instance.invoke(context, term);
              if(term == null)
                break Fail48;
              q_16 = term;
              term = termFactory.makeTuple(q_16, (IStrategoTerm)termFactory.makeListCons(j_16, termFactory.makeListCons(k_16, (IStrategoList)transform.constNil0)));
              term = make$Conc_0_0.instance.invoke(context, term);
              if(term == null)
                break Fail48;
              term = termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{transform.constCons4, term});
              if(true)
                break Success45;
            }
            term = term45;
          }
          Success46:
          { 
            if(cons2 == transform._consMemberName_1)
            { 
              Fail49:
              { 
                IStrategoTerm h_16 = null;
                h_16 = term.getSubterm(0);
                term = termFactory.makeAppl(transform._consS_1, new IStrategoTerm[]{h_16});
                if(true)
                  break Success46;
              }
              term = term45;
            }
            Success47:
            { 
              if(cons2 == transform._consMemberName_2)
              { 
                Fail50:
                { 
                  IStrategoTerm f_16 = null;
                  IStrategoTerm g_16 = null;
                  f_16 = term.getSubterm(0);
                  g_16 = term.getSubterm(1);
                  term = termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{transform.constCons0, (IStrategoTerm)termFactory.makeListCons(f_16, termFactory.makeListCons(transform.constS23, termFactory.makeListCons(termFactory.makeAppl(transform._consS_1, new IStrategoTerm[]{g_16}), (IStrategoList)transform.constNil0)))});
                  if(true)
                    break Success47;
                }
                term = term45;
              }
              Success48:
              { 
                if(cons2 == transform._consWildcardMemberName_2)
                { 
                  Fail51:
                  { 
                    IStrategoTerm d_16 = null;
                    IStrategoTerm e_16 = null;
                    d_16 = term.getSubterm(0);
                    e_16 = term.getSubterm(1);
                    term = termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{transform.constCons0, (IStrategoTerm)termFactory.makeListCons(d_16, termFactory.makeListCons(transform.constS28, termFactory.makeListCons(termFactory.makeAppl(transform._consS_1, new IStrategoTerm[]{e_16}), (IStrategoList)transform.constNil0)))});
                    if(true)
                      break Success48;
                  }
                  term = term45;
                }
                Success49:
                { 
                  if(cons2 == transform._consConstrName_0)
                  { 
                    Fail52:
                    { 
                      term = transform.constFBOX19;
                      if(true)
                        break Success49;
                    }
                    term = term45;
                  }
                  Success50:
                  { 
                    if(cons2 == transform._consConstrName_1)
                    { 
                      Fail53:
                      { 
                        IStrategoTerm c_16 = null;
                        c_16 = term.getSubterm(0);
                        term = termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{transform.constCons0, (IStrategoTerm)termFactory.makeListCons(c_16, (IStrategoList)transform.constCons9)});
                        if(true)
                          break Success50;
                      }
                      term = term45;
                    }
                    Success51:
                    { 
                      if(cons2 == transform._consWildcardConstrName_1)
                      { 
                        Fail54:
                        { 
                          IStrategoTerm z_15 = null;
                          z_15 = term.getSubterm(0);
                          term = termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{transform.constCons0, (IStrategoTerm)termFactory.makeListCons(z_15, (IStrategoList)transform.constCons10)});
                          if(true)
                            break Success51;
                        }
                        term = term45;
                      }
                      Success52:
                      { 
                        if(cons2 == transform._consNot_1)
                        { 
                          Fail55:
                          { 
                            IStrategoTerm y_15 = null;
                            y_15 = term.getSubterm(0);
                            term = termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{transform.constCons0, (IStrategoTerm)termFactory.makeListCons(transform.constS32, termFactory.makeListCons(y_15, (IStrategoList)transform.constNil0))});
                            if(true)
                              break Success52;
                          }
                          term = term45;
                        }
                        Success53:
                        { 
                          if(cons2 == transform._consModPattern_1)
                          { 
                            Fail56:
                            { 
                              IStrategoTerm x_15 = null;
                              x_15 = term.getSubterm(0);
                              term = termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{transform.constCons4, x_15});
                              if(true)
                                break Success53;
                            }
                            term = term45;
                          }
                          Success54:
                          { 
                            if(cons2 == transform._consThrowsPattern_1)
                            { 
                              Fail57:
                              { 
                                IStrategoTerm t_15 = null;
                                t_15 = term.getSubterm(0);
                                term = separate_by_comma_0_0.instance.invoke(context, t_15);
                                if(term == null)
                                  break Fail57;
                                term = termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{transform.constCons4, (IStrategoTerm)termFactory.makeListCons(transform.constFBOX20, termFactory.makeListCons(term, (IStrategoList)transform.constNil0))});
                                if(true)
                                  break Success54;
                              }
                              term = term45;
                            }
                            Success55:
                            { 
                              if(cons2 == transform._consNotThrowsCondition_1)
                              { 
                                Fail58:
                                { 
                                  IStrategoTerm s_15 = null;
                                  s_15 = term.getSubterm(0);
                                  term = termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{transform.constCons0, (IStrategoTerm)termFactory.makeListCons(transform.constS32, termFactory.makeListCons(s_15, (IStrategoList)transform.constNil0))});
                                  if(true)
                                    break Success55;
                                }
                                term = term45;
                              }
                              Success56:
                              { 
                                if(cons2 == transform._consThrowsCondition_1)
                                { 
                                  Fail59:
                                  { 
                                    IStrategoTerm q_15 = null;
                                    q_15 = term.getSubterm(0);
                                    term = has_leftmost_not_0_0.instance.invoke(context, q_15);
                                    if(term == null)
                                      break Fail59;
                                    term = termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{transform.constCons0, (IStrategoTerm)termFactory.makeListCons(transform.constS1, termFactory.makeListCons(q_15, (IStrategoList)transform.constCons1))});
                                    if(true)
                                      break Success56;
                                  }
                                  term = term45;
                                }
                                Success57:
                                { 
                                  if(cons2 == transform._consThrowsCondition_1)
                                  { 
                                    Fail60:
                                    { 
                                      IStrategoTerm o_15 = null;
                                      o_15 = term.getSubterm(0);
                                      term = o_15;
                                      IStrategoTerm term58 = term;
                                      Success58:
                                      { 
                                        Fail61:
                                        { 
                                          term = has_leftmost_not_0_0.instance.invoke(context, term);
                                          if(term == null)
                                            break Fail61;
                                          { 
                                            if(true)
                                              break Fail60;
                                            if(true)
                                              break Success58;
                                          }
                                        }
                                        term = term58;
                                      }
                                      term = o_15;
                                      if(true)
                                        break Success57;
                                    }
                                    term = term45;
                                  }
                                  Success59:
                                  { 
                                    if(cons2 == transform._consSimpleAnnoPatternExact_1)
                                    { 
                                      Fail62:
                                      { 
                                        IStrategoTerm i_15 = null;
                                        i_15 = term.getSubterm(0);
                                        term = termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{transform.constCons0, (IStrategoTerm)termFactory.makeListCons(transform.constS34, termFactory.makeListCons(i_15, (IStrategoList)transform.constNil0))});
                                        if(true)
                                          break Success59;
                                      }
                                      term = term45;
                                    }
                                    Success60:
                                    { 
                                      if(cons2 == transform._consSimpleAnnoPattern_1)
                                      { 
                                        Fail63:
                                        { 
                                          IStrategoTerm h_15 = null;
                                          h_15 = term.getSubterm(0);
                                          term = termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{transform.constCons0, (IStrategoTerm)termFactory.makeListCons(transform.constS34, termFactory.makeListCons(transform.constS1, termFactory.makeListCons(h_15, (IStrategoList)transform.constCons1)))});
                                          if(true)
                                            break Success60;
                                        }
                                        term = term45;
                                      }
                                      Success61:
                                      { 
                                        if(cons2 == transform._consSimpleAnnoPatternValue_2)
                                        { 
                                          Fail64:
                                          { 
                                            IStrategoTerm f_15 = null;
                                            IStrategoTerm g_15 = null;
                                            f_15 = term.getSubterm(0);
                                            g_15 = term.getSubterm(1);
                                            term = termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{transform.constCons0, (IStrategoTerm)termFactory.makeListCons(transform.constS34, termFactory.makeListCons(f_15, termFactory.makeListCons(transform.constS1, termFactory.makeListCons(g_15, (IStrategoList)transform.constCons1))))});
                                            if(true)
                                              break Success61;
                                          }
                                          term = term45;
                                        }
                                        Success62:
                                        { 
                                          if(cons2 == transform._consNotComp_1)
                                          { 
                                            Fail65:
                                            { 
                                              IStrategoTerm d_15 = null;
                                              d_15 = term.getSubterm(0);
                                              term = termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{transform.constCons0, (IStrategoTerm)termFactory.makeListCons(transform.constS32, termFactory.makeListCons(d_15, (IStrategoList)transform.constNil0))});
                                              if(true)
                                                break Success62;
                                            }
                                            term = term45;
                                          }
                                          Success63:
                                          { 
                                            if(cons2 == transform._consAndComp_2)
                                            { 
                                              Fail66:
                                              { 
                                                IStrategoTerm b_15 = null;
                                                IStrategoTerm c_15 = null;
                                                b_15 = term.getSubterm(0);
                                                c_15 = term.getSubterm(1);
                                                term = termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{transform.constCons4, (IStrategoTerm)termFactory.makeListCons(b_15, termFactory.makeListCons(transform.constS35, termFactory.makeListCons(c_15, (IStrategoList)transform.constNil0)))});
                                                if(true)
                                                  break Success63;
                                              }
                                              term = term45;
                                            }
                                            Success64:
                                            { 
                                              if(cons2 == transform._consOrComp_2)
                                              { 
                                                Fail67:
                                                { 
                                                  IStrategoTerm z_14 = null;
                                                  IStrategoTerm a_15 = null;
                                                  z_14 = term.getSubterm(0);
                                                  a_15 = term.getSubterm(1);
                                                  term = termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{transform.constCons4, (IStrategoTerm)termFactory.makeListCons(z_14, termFactory.makeListCons(transform.constS36, termFactory.makeListCons(a_15, (IStrategoList)transform.constNil0)))});
                                                  if(true)
                                                    break Success64;
                                                }
                                                term = term45;
                                              }
                                              Success65:
                                              { 
                                                if(cons2 == transform._consIntertypeMethodDec_2)
                                                { 
                                                  Fail68:
                                                  { 
                                                    IStrategoTerm x_14 = null;
                                                    IStrategoTerm y_14 = null;
                                                    x_14 = term.getSubterm(0);
                                                    IStrategoTerm arg10 = term.getSubterm(1);
                                                    y_14 = arg10;
                                                    if(arg10.getTermType() != IStrategoTerm.APPL || transform._consBlock_1 != ((IStrategoAppl)arg10).getConstructor())
                                                      break Fail68;
                                                    term = termFactory.makeAppl(transform._consV_2, new IStrategoTerm[]{transform.constCons11, (IStrategoTerm)termFactory.makeListCons(x_14, termFactory.makeListCons(y_14, (IStrategoList)transform.constNil0))});
                                                    if(true)
                                                      break Success65;
                                                  }
                                                  term = term45;
                                                }
                                                Success66:
                                                { 
                                                  if(cons2 == transform._consIntertypeMethodDec_2)
                                                  { 
                                                    Fail69:
                                                    { 
                                                      IStrategoTerm w_14 = null;
                                                      w_14 = term.getSubterm(0);
                                                      IStrategoTerm arg12 = term.getSubterm(1);
                                                      if(arg12.getTermType() != IStrategoTerm.APPL || transform._consNoMethodBody_0 != ((IStrategoAppl)arg12).getConstructor())
                                                        break Fail69;
                                                      term = termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{transform.constCons0, (IStrategoTerm)termFactory.makeListCons(w_14, (IStrategoList)transform.constCons5)});
                                                      if(true)
                                                        break Success66;
                                                    }
                                                    term = term45;
                                                  }
                                                  Success67:
                                                  { 
                                                    if(cons2 == transform._consIntertypeMethodDecHead_8)
                                                    { 
                                                      Fail70:
                                                      { 
                                                        IStrategoTerm c_14 = null;
                                                        IStrategoTerm d_14 = null;
                                                        IStrategoTerm e_14 = null;
                                                        IStrategoTerm f_14 = null;
                                                        IStrategoTerm g_14 = null;
                                                        IStrategoTerm h_14 = null;
                                                        IStrategoTerm i_14 = null;
                                                        IStrategoTerm j_14 = null;
                                                        IStrategoTerm k_14 = null;
                                                        IStrategoTerm l_14 = null;
                                                        IStrategoTerm m_14 = null;
                                                        IStrategoTerm n_14 = null;
                                                        IStrategoTerm o_14 = null;
                                                        IStrategoTerm p_14 = null;
                                                        IStrategoTerm u_14 = null;
                                                        IStrategoTerm v_14 = null;
                                                        m_14 = term.getSubterm(0);
                                                        h_14 = term.getSubterm(1);
                                                        c_14 = term.getSubterm(2);
                                                        d_14 = term.getSubterm(3);
                                                        i_14 = term.getSubterm(4);
                                                        IStrategoTerm arg13 = term.getSubterm(5);
                                                        if(arg13.getTermType() != IStrategoTerm.APPL || transform._consId_1 != ((IStrategoAppl)arg13).getConstructor())
                                                          break Fail70;
                                                        e_14 = arg13.getSubterm(0);
                                                        f_14 = term.getSubterm(6);
                                                        k_14 = term.getSubterm(7);
                                                        p_14 = term;
                                                        term = list_to_args_0_0.instance.invoke(context, f_14);
                                                        if(term == null)
                                                          break Fail70;
                                                        g_14 = term;
                                                        term = type_params_to_boxes_0_0.instance.invoke(context, h_14);
                                                        if(term == null)
                                                          break Fail70;
                                                        n_14 = term;
                                                        term = type_params_to_boxes_0_0.instance.invoke(context, i_14);
                                                        if(term == null)
                                                          break Fail70;
                                                        j_14 = term;
                                                        term = option_to_boxes_0_0.instance.invoke(context, k_14);
                                                        if(term == null)
                                                          break Fail70;
                                                        l_14 = term;
                                                        term = termFactory.makeTuple(m_14, n_14);
                                                        term = conc_0_0.instance.invoke(context, term);
                                                        if(term == null)
                                                          break Fail70;
                                                        o_14 = term;
                                                        term = p_14;
                                                        v_14 = term;
                                                        term = termFactory.makeTuple(j_14, (IStrategoTerm)termFactory.makeListCons(transform.constS23, termFactory.makeListCons(termFactory.makeAppl(transform._consS_1, new IStrategoTerm[]{e_14}), termFactory.makeListCons(g_14, (IStrategoList)transform.constNil0))));
                                                        term = make$Conc_0_0.instance.invoke(context, term);
                                                        if(term == null)
                                                          break Fail70;
                                                        u_14 = term;
                                                        term = v_14;
                                                        IStrategoList list2;
                                                        IStrategoList list1;
                                                        list1 = checkListTail(l_14);
                                                        if(list1 == null)
                                                          break Fail70;
                                                        list2 = checkListTail(u_14);
                                                        if(list2 == null)
                                                          break Fail70;
                                                        term = termFactory.makeTuple(o_14, (IStrategoTerm)termFactory.makeListCons(c_14, termFactory.makeListCons(termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{transform.constCons0, (IStrategoTerm)termFactory.makeListCons(d_14, list2)}), list1)));
                                                        term = make$Conc_0_0.instance.invoke(context, term);
                                                        if(term == null)
                                                          break Fail70;
                                                        term = termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{transform.constCons4, term});
                                                        if(true)
                                                          break Success67;
                                                      }
                                                      term = term45;
                                                    }
                                                    Success68:
                                                    { 
                                                      if(cons2 == transform._consIntertypeConstrDec_2)
                                                      { 
                                                        Fail71:
                                                        { 
                                                          IStrategoTerm a_14 = null;
                                                          IStrategoTerm b_14 = null;
                                                          a_14 = term.getSubterm(0);
                                                          b_14 = term.getSubterm(1);
                                                          term = termFactory.makeAppl(transform._consV_2, new IStrategoTerm[]{transform.constCons11, (IStrategoTerm)termFactory.makeListCons(a_14, termFactory.makeListCons(b_14, (IStrategoList)transform.constNil0))});
                                                          if(true)
                                                            break Success68;
                                                        }
                                                        term = term45;
                                                      }
                                                      term = aspectj_to_box_0_0_fragment_1.instance.invoke(context, term);
                                                      if(term == null)
                                                        break Fail47;
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

  @SuppressWarnings("all") public static class aspectj_to_box_0_0_fragment_1 extends Strategy 
  { 
    public static aspectj_to_box_0_0_fragment_1 instance = new aspectj_to_box_0_0_fragment_1();

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      ITermFactory termFactory = context.getFactory();
      context.push("aspectj_to_box_0_0_fragment_1");
      Fail72:
      { 
        IStrategoTerm term69 = term;
        IStrategoConstructor cons3 = term.getTermType() == IStrategoTerm.APPL ? ((IStrategoAppl)term).getConstructor() : null;
        Success69:
        { 
          if(cons3 == transform._consIntertypeConstrDecHead_6)
          { 
            Fail73:
            { 
              IStrategoTerm e_13 = null;
              IStrategoTerm f_13 = null;
              IStrategoTerm g_13 = null;
              IStrategoTerm h_13 = null;
              IStrategoTerm i_13 = null;
              IStrategoTerm m_13 = null;
              IStrategoTerm n_13 = null;
              IStrategoTerm o_13 = null;
              IStrategoTerm p_13 = null;
              IStrategoTerm q_13 = null;
              IStrategoTerm r_13 = null;
              IStrategoTerm s_13 = null;
              IStrategoTerm y_13 = null;
              IStrategoTerm z_13 = null;
              p_13 = term.getSubterm(0);
              h_13 = term.getSubterm(1);
              e_13 = term.getSubterm(2);
              i_13 = term.getSubterm(3);
              f_13 = term.getSubterm(4);
              n_13 = term.getSubterm(5);
              s_13 = term;
              term = list_to_args_0_0.instance.invoke(context, f_13);
              if(term == null)
                break Fail73;
              g_13 = term;
              term = type_params_to_boxes_0_0.instance.invoke(context, h_13);
              if(term == null)
                break Fail73;
              q_13 = term;
              term = type_params_to_boxes_0_0.instance.invoke(context, i_13);
              if(term == null)
                break Fail73;
              m_13 = term;
              term = option_to_boxes_0_0.instance.invoke(context, n_13);
              if(term == null)
                break Fail73;
              o_13 = term;
              term = termFactory.makeTuple(p_13, q_13);
              term = conc_0_0.instance.invoke(context, term);
              if(term == null)
                break Fail73;
              r_13 = term;
              term = s_13;
              z_13 = term;
              term = termFactory.makeTuple(m_13, (IStrategoTerm)termFactory.makeListCons(transform.constS23, termFactory.makeListCons(transform.constFBOX19, termFactory.makeListCons(g_13, (IStrategoList)transform.constNil0))));
              term = make$Conc_0_0.instance.invoke(context, term);
              if(term == null)
                break Fail73;
              y_13 = term;
              term = z_13;
              IStrategoList list4;
              IStrategoList list3;
              list3 = checkListTail(o_13);
              if(list3 == null)
                break Fail73;
              list4 = checkListTail(y_13);
              if(list4 == null)
                break Fail73;
              term = termFactory.makeTuple(r_13, (IStrategoTerm)termFactory.makeListCons(termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{transform.constCons0, (IStrategoTerm)termFactory.makeListCons(e_13, list4)}), list3));
              term = make$Conc_0_0.instance.invoke(context, term);
              if(term == null)
                break Fail73;
              term = termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{transform.constCons4, term});
              if(true)
                break Success69;
            }
            term = term69;
          }
          Success70:
          { 
            if(cons3 == transform._consIntertypeFieldDec_5)
            { 
              Fail74:
              { 
                IStrategoTerm q_12 = null;
                IStrategoTerm r_12 = null;
                IStrategoTerm s_12 = null;
                IStrategoTerm t_12 = null;
                IStrategoTerm u_12 = null;
                IStrategoTerm v_12 = null;
                IStrategoTerm w_12 = null;
                IStrategoTerm z_12 = null;
                IStrategoTerm a_13 = null;
                q_12 = term.getSubterm(0);
                r_12 = term.getSubterm(1);
                s_12 = term.getSubterm(2);
                u_12 = term.getSubterm(3);
                t_12 = term.getSubterm(4);
                w_12 = term;
                term = option_to_boxes_0_0.instance.invoke(context, u_12);
                if(term == null)
                  break Fail74;
                v_12 = term;
                term = w_12;
                a_13 = term;
                term = termFactory.makeTuple(v_12, (IStrategoTerm)termFactory.makeListCons(transform.constS23, termFactory.makeListCons(t_12, (IStrategoList)transform.constCons5)));
                term = make$Conc_0_0.instance.invoke(context, term);
                if(term == null)
                  break Fail74;
                z_12 = term;
                term = a_13;
                IStrategoList list5;
                list5 = checkListTail(z_12);
                if(list5 == null)
                  break Fail74;
                term = termFactory.makeTuple(q_12, (IStrategoTerm)termFactory.makeListCons(r_12, termFactory.makeListCons(termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{transform.constCons0, (IStrategoTerm)termFactory.makeListCons(s_12, list5)}), (IStrategoList)transform.constNil0)));
                term = make$Conc_0_0.instance.invoke(context, term);
                if(term == null)
                  break Fail74;
                term = termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{transform.constCons4, term});
                if(true)
                  break Success70;
              }
              term = term69;
            }
            Success71:
            { 
              if(cons3 == transform._consAdviceDec_5)
              { 
                Fail75:
                { 
                  IStrategoTerm f_12 = null;
                  IStrategoTerm g_12 = null;
                  IStrategoTerm h_12 = null;
                  IStrategoTerm i_12 = null;
                  IStrategoTerm j_12 = null;
                  IStrategoTerm k_12 = null;
                  IStrategoTerm l_12 = null;
                  IStrategoTerm o_12 = null;
                  IStrategoTerm p_12 = null;
                  f_12 = term.getSubterm(0);
                  g_12 = term.getSubterm(1);
                  j_12 = term.getSubterm(2);
                  h_12 = term.getSubterm(3);
                  i_12 = term.getSubterm(4);
                  l_12 = term;
                  term = option_to_boxes_0_0.instance.invoke(context, j_12);
                  if(term == null)
                    break Fail75;
                  k_12 = term;
                  term = l_12;
                  p_12 = term;
                  term = termFactory.makeTuple(k_12, (IStrategoTerm)termFactory.makeListCons(transform.constFBOX21, termFactory.makeListCons(h_12, (IStrategoList)transform.constNil0)));
                  term = make$Conc_0_0.instance.invoke(context, term);
                  if(term == null)
                    break Fail75;
                  o_12 = term;
                  term = p_12;
                  IStrategoList list6;
                  list6 = checkListTail(o_12);
                  if(list6 == null)
                    break Fail75;
                  term = termFactory.makeTuple(f_12, (IStrategoTerm)termFactory.makeListCons(g_12, list6));
                  term = make$Conc_0_0.instance.invoke(context, term);
                  if(term == null)
                    break Fail75;
                  term = termFactory.makeAppl(transform._consV_2, new IStrategoTerm[]{transform.constCons11, (IStrategoTerm)termFactory.makeListCons(termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{transform.constCons4, term}), termFactory.makeListCons(i_12, (IStrategoList)transform.constNil0))});
                  if(true)
                    break Success71;
                }
                term = term69;
              }
              Success72:
              { 
                if(cons3 == transform._consBefore_1)
                { 
                  Fail76:
                  { 
                    IStrategoTerm c_12 = null;
                    c_12 = term.getSubterm(0);
                    term = separate_by_comma_0_0.instance.invoke(context, c_12);
                    if(term == null)
                      break Fail76;
                    term = termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{transform.constCons0, (IStrategoTerm)termFactory.makeListCons(transform.constFBOX24, termFactory.makeListCons(transform.constFBOX23, termFactory.makeListCons(term, (IStrategoList)transform.constCons12)))});
                    if(true)
                      break Success72;
                  }
                  term = term69;
                }
                Success73:
                { 
                  if(cons3 == transform._consAfter_2)
                  { 
                    Fail77:
                    { 
                      IStrategoTerm y_11 = null;
                      IStrategoTerm z_11 = null;
                      z_11 = term.getSubterm(0);
                      y_11 = term.getSubterm(1);
                      term = separate_by_comma_0_0.instance.invoke(context, z_11);
                      if(term == null)
                        break Fail77;
                      term = termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{transform.constCons4, (IStrategoTerm)termFactory.makeListCons(termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{transform.constCons0, (IStrategoTerm)termFactory.makeListCons(transform.constFBOX25, termFactory.makeListCons(transform.constFBOX23, termFactory.makeListCons(term, (IStrategoList)transform.constCons12)))}), termFactory.makeListCons(y_11, (IStrategoList)transform.constNil0))});
                      if(true)
                        break Success73;
                    }
                    term = term69;
                  }
                  Success74:
                  { 
                    if(cons3 == transform._consAround_2)
                    { 
                      Fail78:
                      { 
                        IStrategoTerm u_11 = null;
                        IStrategoTerm v_11 = null;
                        u_11 = term.getSubterm(0);
                        v_11 = term.getSubterm(1);
                        term = separate_by_comma_0_0.instance.invoke(context, v_11);
                        if(term == null)
                          break Fail78;
                        term = termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{transform.constCons4, (IStrategoTerm)termFactory.makeListCons(u_11, termFactory.makeListCons(termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{transform.constCons0, (IStrategoTerm)termFactory.makeListCons(transform.constFBOX26, termFactory.makeListCons(transform.constFBOX23, termFactory.makeListCons(term, (IStrategoList)transform.constCons12)))}), (IStrategoList)transform.constNil0))});
                        if(true)
                          break Success74;
                      }
                      term = term69;
                    }
                    Success75:
                    { 
                      if(cons3 == transform._consReturning_0)
                      { 
                        Fail79:
                        { 
                          term = transform.constFBOX27;
                          if(true)
                            break Success75;
                        }
                        term = term69;
                      }
                      Success76:
                      { 
                        if(cons3 == transform._consReturning_1)
                        { 
                          Fail80:
                          { 
                            IStrategoTerm t_11 = null;
                            t_11 = term.getSubterm(0);
                            term = termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{transform.constCons0, (IStrategoTerm)termFactory.makeListCons(transform.constFBOX27, termFactory.makeListCons(transform.constFBOX23, termFactory.makeListCons(t_11, (IStrategoList)transform.constCons12)))});
                            if(true)
                              break Success76;
                          }
                          term = term69;
                        }
                        Success77:
                        { 
                          if(cons3 == transform._consThrowing_0)
                          { 
                            Fail81:
                            { 
                              term = transform.constFBOX28;
                              if(true)
                                break Success77;
                            }
                            term = term69;
                          }
                          Success78:
                          { 
                            if(cons3 == transform._consThrowing_1)
                            { 
                              Fail82:
                              { 
                                IStrategoTerm s_11 = null;
                                s_11 = term.getSubterm(0);
                                term = termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{transform.constCons0, (IStrategoTerm)termFactory.makeListCons(transform.constFBOX28, termFactory.makeListCons(transform.constFBOX23, termFactory.makeListCons(s_11, (IStrategoList)transform.constCons12)))});
                                if(true)
                                  break Success78;
                              }
                              term = term69;
                            }
                            Success79:
                            { 
                              if(cons3 == transform._consDecParent_3)
                              { 
                                Fail83:
                                { 
                                  IStrategoTerm n_11 = null;
                                  IStrategoTerm o_11 = null;
                                  IStrategoTerm p_11 = null;
                                  n_11 = term.getSubterm(0);
                                  o_11 = term.getSubterm(1);
                                  p_11 = term.getSubterm(2);
                                  term = termFactory.makeTuple(n_11, (IStrategoTerm)termFactory.makeListCons(transform.constFBOX30, termFactory.makeListCons(transform.constFBOX29, termFactory.makeListCons(transform.constFBOX21, termFactory.makeListCons(o_11, termFactory.makeListCons(p_11, (IStrategoList)transform.constCons13))))));
                                  term = make$Conc_0_0.instance.invoke(context, term);
                                  if(term == null)
                                    break Fail83;
                                  term = termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{transform.constCons4, term});
                                  if(true)
                                    break Success79;
                                }
                                term = term69;
                              }
                              Success80:
                              { 
                                if(cons3 == transform._consDecWarning_3)
                                { 
                                  Fail84:
                                  { 
                                    IStrategoTerm i_11 = null;
                                    IStrategoTerm j_11 = null;
                                    IStrategoTerm k_11 = null;
                                    i_11 = term.getSubterm(0);
                                    j_11 = term.getSubterm(1);
                                    k_11 = term.getSubterm(2);
                                    term = termFactory.makeTuple(i_11, (IStrategoTerm)termFactory.makeListCons(transform.constFBOX30, termFactory.makeListCons(transform.constFBOX31, termFactory.makeListCons(transform.constFBOX21, termFactory.makeListCons(j_11, termFactory.makeListCons(transform.constFBOX21, termFactory.makeListCons(k_11, (IStrategoList)transform.constCons13)))))));
                                    term = make$Conc_0_0.instance.invoke(context, term);
                                    if(term == null)
                                      break Fail84;
                                    term = termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{transform.constCons4, term});
                                    if(true)
                                      break Success80;
                                  }
                                  term = term69;
                                }
                                term = aspectj_to_box_0_0_fragment_0.instance.invoke(context, term);
                                if(term == null)
                                  break Fail72;
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

  @SuppressWarnings("all") public static class aspectj_to_box_0_0_fragment_0 extends Strategy 
  { 
    public static aspectj_to_box_0_0_fragment_0 instance = new aspectj_to_box_0_0_fragment_0();

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      ITermFactory termFactory = context.getFactory();
      context.push("aspectj_to_box_0_0_fragment_0");
      Fail85:
      { 
        IStrategoTerm term81 = term;
        IStrategoConstructor cons4 = term.getTermType() == IStrategoTerm.APPL ? ((IStrategoAppl)term).getConstructor() : null;
        Success81:
        { 
          if(cons4 == transform._consDecError_2)
          { 
            Fail86:
            { 
              IStrategoTerm g_11 = null;
              IStrategoTerm h_11 = null;
              g_11 = term.getSubterm(0);
              h_11 = term.getSubterm(1);
              term = termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{transform.constCons4, (IStrategoTerm)termFactory.makeListCons(transform.constFBOX30, termFactory.makeListCons(transform.constFBOX32, termFactory.makeListCons(transform.constFBOX21, termFactory.makeListCons(g_11, termFactory.makeListCons(transform.constFBOX21, termFactory.makeListCons(h_11, (IStrategoList)transform.constCons13))))))});
              if(true)
                break Success81;
            }
            term = term81;
          }
          Success82:
          { 
            if(cons4 == transform._consDecSoft_2)
            { 
              Fail87:
              { 
                IStrategoTerm e_11 = null;
                IStrategoTerm f_11 = null;
                e_11 = term.getSubterm(0);
                f_11 = term.getSubterm(1);
                term = termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{transform.constCons4, (IStrategoTerm)termFactory.makeListCons(transform.constFBOX30, termFactory.makeListCons(transform.constFBOX33, termFactory.makeListCons(transform.constFBOX21, termFactory.makeListCons(e_11, termFactory.makeListCons(transform.constFBOX21, termFactory.makeListCons(f_11, (IStrategoList)transform.constCons13))))))});
                if(true)
                  break Success82;
              }
              term = term81;
            }
            Success83:
            { 
              if(cons4 == transform._consDecPrecedence_2)
              { 
                Fail88:
                { 
                  IStrategoTerm y_10 = null;
                  IStrategoTerm z_10 = null;
                  IStrategoTerm a_11 = null;
                  y_10 = term.getSubterm(0);
                  z_10 = term.getSubterm(1);
                  term = separate_by_comma_0_0.instance.invoke(context, z_10);
                  if(term == null)
                    break Fail88;
                  a_11 = term;
                  term = termFactory.makeTuple(y_10, (IStrategoTerm)termFactory.makeListCons(transform.constFBOX30, termFactory.makeListCons(transform.constFBOX34, termFactory.makeListCons(transform.constFBOX21, termFactory.makeListCons(a_11, (IStrategoList)transform.constCons13)))));
                  term = make$Conc_0_0.instance.invoke(context, term);
                  if(term == null)
                    break Fail88;
                  term = termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{transform.constCons4, term});
                  if(true)
                    break Success83;
                }
                term = term81;
              }
              Success84:
              { 
                if(cons4 == transform._consDecAnno_4)
                { 
                  Fail89:
                  { 
                    IStrategoTerm o_10 = null;
                    IStrategoTerm t_10 = null;
                    IStrategoTerm u_10 = null;
                    IStrategoTerm v_10 = null;
                    o_10 = term.getSubterm(0);
                    t_10 = term.getSubterm(1);
                    u_10 = term.getSubterm(2);
                    v_10 = term.getSubterm(3);
                    term = termFactory.makeTuple(o_10, (IStrategoTerm)termFactory.makeListCons(transform.constFBOX30, termFactory.makeListCons(t_10, termFactory.makeListCons(transform.constS26, termFactory.makeListCons(u_10, termFactory.makeListCons(transform.constS26, termFactory.makeListCons(v_10, (IStrategoList)transform.constCons5)))))));
                    term = make$Conc_0_0.instance.invoke(context, term);
                    if(term == null)
                      break Fail89;
                    term = termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{transform.constCons4, term});
                    if(true)
                      break Success84;
                  }
                  term = term81;
                }
                Success85:
                { 
                  if(cons4 == transform._consDecAnnoType_0)
                  { 
                    Fail90:
                    { 
                      term = transform.constS48;
                      if(true)
                        break Success85;
                    }
                    term = term81;
                  }
                  Success86:
                  { 
                    if(cons4 == transform._consDecAnnoConstructor_0)
                    { 
                      Fail91:
                      { 
                        term = transform.constS49;
                        if(true)
                          break Success86;
                      }
                      term = term81;
                    }
                    Success87:
                    { 
                      if(cons4 == transform._consDecAnnoMethod_0)
                      { 
                        Fail92:
                        { 
                          term = transform.constS50;
                          if(true)
                            break Success87;
                        }
                        term = term81;
                      }
                      Success88:
                      { 
                        if(cons4 == transform._consDecAnnoField_0)
                        { 
                          Fail93:
                          { 
                            term = transform.constS51;
                            if(true)
                              break Success88;
                          }
                          term = term81;
                        }
                        Success89:
                        { 
                          if(cons4 == transform._consAspectDec_2)
                          { 
                            Fail94:
                            { 
                              IStrategoTerm m_10 = null;
                              IStrategoTerm n_10 = null;
                              m_10 = term.getSubterm(0);
                              n_10 = term.getSubterm(1);
                              term = termFactory.makeAppl(transform._consV_2, new IStrategoTerm[]{transform.constCons11, (IStrategoTerm)termFactory.makeListCons(m_10, termFactory.makeListCons(n_10, (IStrategoList)transform.constNil0))});
                              if(true)
                                break Success89;
                            }
                            term = term81;
                          }
                          Success90:
                          { 
                            if(cons4 == transform._consAspectDecHead_6)
                            { 
                              Fail95:
                              { 
                                IStrategoTerm m_9 = null;
                                IStrategoTerm o_9 = null;
                                IStrategoTerm p_9 = null;
                                IStrategoTerm r_9 = null;
                                IStrategoTerm s_9 = null;
                                IStrategoTerm v_9 = null;
                                IStrategoTerm w_9 = null;
                                IStrategoTerm x_9 = null;
                                IStrategoTerm y_9 = null;
                                IStrategoTerm z_9 = null;
                                IStrategoTerm a_10 = null;
                                IStrategoTerm d_10 = null;
                                IStrategoTerm e_10 = null;
                                m_9 = term.getSubterm(0);
                                o_9 = term.getSubterm(1);
                                p_9 = term.getSubterm(2);
                                s_9 = term.getSubterm(3);
                                w_9 = term.getSubterm(4);
                                y_9 = term.getSubterm(5);
                                a_10 = term;
                                term = option_to_boxes_0_0.instance.invoke(context, p_9);
                                if(term == null)
                                  break Fail95;
                                r_9 = term;
                                term = option_to_boxes_0_0.instance.invoke(context, s_9);
                                if(term == null)
                                  break Fail95;
                                v_9 = term;
                                term = option_to_boxes_0_0.instance.invoke(context, w_9);
                                if(term == null)
                                  break Fail95;
                                x_9 = term;
                                term = option_to_boxes_0_0.instance.invoke(context, y_9);
                                if(term == null)
                                  break Fail95;
                                z_9 = term;
                                term = a_10;
                                e_10 = term;
                                term = termFactory.makeTuple(x_9, z_9);
                                term = make$Conc_0_0.instance.invoke(context, term);
                                if(term == null)
                                  break Fail95;
                                term = termFactory.makeTuple(v_9, term);
                                term = make$Conc_0_0.instance.invoke(context, term);
                                if(term == null)
                                  break Fail95;
                                term = termFactory.makeTuple(r_9, term);
                                term = make$Conc_0_0.instance.invoke(context, term);
                                if(term == null)
                                  break Fail95;
                                d_10 = term;
                                term = e_10;
                                IStrategoList list7;
                                list7 = checkListTail(d_10);
                                if(list7 == null)
                                  break Fail95;
                                term = termFactory.makeTuple(m_9, (IStrategoTerm)termFactory.makeListCons(transform.constFBOX35, termFactory.makeListCons(o_9, list7)));
                                term = make$Conc_0_0.instance.invoke(context, term);
                                if(term == null)
                                  break Fail95;
                                term = termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{transform.constCons4, term});
                                if(true)
                                  break Success90;
                              }
                              term = term81;
                            }
                            Success91:
                            { 
                              if(cons4 == transform._consPerTarget_1)
                              { 
                                Fail96:
                                { 
                                  IStrategoTerm l_9 = null;
                                  l_9 = term.getSubterm(0);
                                  term = termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{transform.constCons0, (IStrategoTerm)termFactory.makeListCons(transform.constFBOX36, termFactory.makeListCons(transform.constS1, termFactory.makeListCons(l_9, (IStrategoList)transform.constCons1)))});
                                  if(true)
                                    break Success91;
                                }
                                term = term81;
                              }
                              Success92:
                              { 
                                if(cons4 == transform._consPerThis_1)
                                { 
                                  Fail97:
                                  { 
                                    IStrategoTerm j_9 = null;
                                    j_9 = term.getSubterm(0);
                                    term = termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{transform.constCons0, (IStrategoTerm)termFactory.makeListCons(transform.constFBOX37, termFactory.makeListCons(transform.constS1, termFactory.makeListCons(j_9, (IStrategoList)transform.constCons1)))});
                                    if(true)
                                      break Success92;
                                  }
                                  term = term81;
                                }
                                Success93:
                                { 
                                  if(cons4 == transform._consPerCFlow_1)
                                  { 
                                    Fail98:
                                    { 
                                      IStrategoTerm i_9 = null;
                                      i_9 = term.getSubterm(0);
                                      term = termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{transform.constCons0, (IStrategoTerm)termFactory.makeListCons(transform.constFBOX38, termFactory.makeListCons(transform.constS1, termFactory.makeListCons(i_9, (IStrategoList)transform.constCons1)))});
                                      if(true)
                                        break Success93;
                                    }
                                    term = term81;
                                  }
                                  Success94:
                                  { 
                                    if(cons4 == transform._consPerCFlowBelow_1)
                                    { 
                                      Fail99:
                                      { 
                                        IStrategoTerm h_9 = null;
                                        h_9 = term.getSubterm(0);
                                        term = termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{transform.constCons0, (IStrategoTerm)termFactory.makeListCons(transform.constFBOX39, termFactory.makeListCons(transform.constS1, termFactory.makeListCons(h_9, (IStrategoList)transform.constCons1)))});
                                        if(true)
                                          break Success94;
                                      }
                                      term = term81;
                                    }
                                    Success95:
                                    { 
                                      if(cons4 == transform._consPerTypeWithin_1)
                                      { 
                                        Fail100:
                                        { 
                                          IStrategoTerm g_9 = null;
                                          g_9 = term.getSubterm(0);
                                          term = termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{transform.constCons0, (IStrategoTerm)termFactory.makeListCons(transform.constFBOX40, termFactory.makeListCons(transform.constS1, termFactory.makeListCons(g_9, (IStrategoList)transform.constCons1)))});
                                          if(true)
                                            break Success95;
                                        }
                                        term = term81;
                                      }
                                      Success96:
                                      { 
                                        if(cons4 == transform._consIsSingleton_0)
                                        { 
                                          Fail101:
                                          { 
                                            term = transform.constFBOX41;
                                            if(true)
                                              break Success96;
                                          }
                                          term = term81;
                                        }
                                        Success97:
                                        { 
                                          if(cons4 == transform._consAspectBody_1)
                                          { 
                                            Fail102:
                                            { 
                                              IStrategoTerm f_9 = null;
                                              f_9 = term.getSubterm(0);
                                              term = termFactory.makeAppl(transform._consV_2, new IStrategoTerm[]{transform.constNil0, (IStrategoTerm)termFactory.makeListCons(termFactory.makeAppl(transform._consV_2, new IStrategoTerm[]{transform.constCons16, (IStrategoTerm)termFactory.makeListCons(transform.constFBOX43, termFactory.makeListCons(termFactory.makeAppl(transform._consV_2, new IStrategoTerm[]{transform.constCons17, f_9}), (IStrategoList)transform.constNil0))}), (IStrategoList)transform.constCons14)});
                                              if(true)
                                                break Success97;
                                            }
                                            term = term81;
                                          }
                                          Success98:
                                          { 
                                            if(cons4 == transform._consPrivileged_0)
                                            { 
                                              Fail103:
                                              { 
                                                term = transform.constFBOX44;
                                                if(true)
                                                  break Success98;
                                              }
                                              term = term81;
                                            }
                                            if(cons4 == transform._consProceed_0)
                                            { 
                                              term = transform.constFBOX45;
                                            }
                                            else
                                            { 
                                              break Fail85;
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

  @SuppressWarnings("all") public static class aspectj_to_box_0_0 extends Strategy 
  { 
    public static aspectj_to_box_0_0 instance = new aspectj_to_box_0_0();

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      ITermFactory termFactory = context.getFactory();
      context.push("aspectj_to_box_0_0");
      Fail104:
      { 
        IStrategoTerm term99 = term;
        IStrategoConstructor cons5 = term.getTermType() == IStrategoTerm.APPL ? ((IStrategoAppl)term).getConstructor() : null;
        Success99:
        { 
          if(cons5 == transform._consCall_1)
          { 
            Fail105:
            { 
              IStrategoTerm j_20 = null;
              j_20 = term.getSubterm(0);
              term = termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{transform.constCons0, (IStrategoTerm)termFactory.makeListCons(transform.constFBOX46, termFactory.makeListCons(transform.constS1, termFactory.makeListCons(j_20, (IStrategoList)transform.constCons1)))});
              if(true)
                break Success99;
            }
            term = term99;
          }
          Success100:
          { 
            if(cons5 == transform._consExec_1)
            { 
              Fail106:
              { 
                IStrategoTerm i_20 = null;
                i_20 = term.getSubterm(0);
                term = termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{transform.constCons0, (IStrategoTerm)termFactory.makeListCons(transform.constFBOX47, termFactory.makeListCons(transform.constS1, termFactory.makeListCons(i_20, (IStrategoList)transform.constCons1)))});
                if(true)
                  break Success100;
              }
              term = term99;
            }
            term = aspectj_to_box_0_0_fragment_4.instance.invoke(context, term);
            if(term == null)
              break Fail104;
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

  @SuppressWarnings("all") public static class has_leftmost_not_0_0 extends Strategy 
  { 
    public static has_leftmost_not_0_0 instance = new has_leftmost_not_0_0();

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      context.push("has_leftmost_not_0_0");
      Fail107:
      { 
        term = k_20.instance.invoke(context, term);
        if(term == null)
          break Fail107;
        context.popOnSuccess();
        if(true)
          return term;
      }
      context.popOnFailure();
      return null;
    }
  }

  @SuppressWarnings("all") public static class option_to_boxes_0_0 extends Strategy 
  { 
    public static option_to_boxes_0_0 instance = new option_to_boxes_0_0();

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      ITermFactory termFactory = context.getFactory();
      Fail108:
      { 
        IStrategoTerm term103 = term;
        IStrategoConstructor cons6 = term.getTermType() == IStrategoTerm.APPL ? ((IStrategoAppl)term).getConstructor() : null;
        Success101:
        { 
          if(cons6 == transform._consSome_1)
          { 
            Fail109:
            { 
              IStrategoTerm l_20 = null;
              l_20 = term.getSubterm(0);
              term = l_20;
              term = (IStrategoTerm)termFactory.makeListCons(term, (IStrategoList)transform.constNil0);
              if(true)
                break Success101;
            }
            term = term103;
          }
          if(cons6 == transform._consNone_0)
          { 
            term = transform.constNil0;
          }
          else
          { 
            break Fail108;
          }
        }
        if(true)
          return term;
      }
      context.push("option_to_boxes_0_0");
      context.popOnFailure();
      return null;
    }
  }

  @SuppressWarnings("all") public static class pp_aspectj_string_0_0 extends Strategy 
  { 
    public static pp_aspectj_string_0_0 instance = new pp_aspectj_string_0_0();

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      context.push("pp_aspectj_string_0_0");
      Fail110:
      { 
        IStrategoTerm p_20 = null;
        term = pp_java5_to_abox_1_0.instance.invoke(context, term, lifted3.instance);
        if(term == null)
          break Fail110;
        p_20 = term;
        term = box2text_string_0_1.instance.invoke(context, p_20, transform.const68);
        if(term == null)
          break Fail110;
        context.popOnSuccess();
        if(true)
          return term;
      }
      context.popOnFailure();
      return null;
    }
  }

  @SuppressWarnings("all") public static class remove_closures_additions_0_0 extends Strategy 
  { 
    public static remove_closures_additions_0_0 instance = new remove_closures_additions_0_0();

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      Fail111:
      { 
        IStrategoTerm term105 = term;
        IStrategoConstructor cons7 = term.getTermType() == IStrategoTerm.APPL ? ((IStrategoAppl)term).getConstructor() : null;
        Success102:
        { 
          if(cons7 == transform._consJoinpointDeclaration_4)
          { 
            Fail112:
            { 
              term = transform.constNone0;
              if(true)
                break Success102;
            }
            term = term105;
          }
          Success103:
          { 
            if(cons7 == transform._consShortClosureJoinpoints_2)
            { 
              Fail113:
              { 
                term = transform.constNone0;
                if(true)
                  break Success103;
              }
              term = term105;
            }
            Success104:
            { 
              if(cons7 == transform._consClosureJoinpoints_4)
              { 
                Fail114:
                { 
                  term = transform.constNone0;
                  if(true)
                    break Success104;
                }
                term = term105;
              }
              if(cons7 == transform._consCJPAdvice_4)
              { 
                term = transform.constNone0;
              }
              else
              { 
                break Fail111;
              }
            }
          }
        }
        if(true)
          return term;
      }
      context.push("remove_closures_additions_0_0");
      context.popOnFailure();
      return null;
    }
  }

  @SuppressWarnings("all") public static class closures_to_ajc_0_1 extends Strategy 
  { 
    public static closures_to_ajc_0_1 instance = new closures_to_ajc_0_1();

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm ref_t_20)
    { 
      ITermFactory termFactory = context.getFactory();
      TermReference t_20 = new TermReference(ref_t_20);
      context.push("closures_to_ajc_0_1");
      Fail115:
      { 
        TermReference u_20 = new TermReference();
        IStrategoTerm v_20 = null;
        IStrategoTerm w_20 = null;
        if(term.getTermType() != IStrategoTerm.APPL || transform._consAspectDec_2 != ((IStrategoAppl)term).getConstructor())
          break Fail115;
        w_20 = term.getSubterm(0);
        IStrategoTerm arg28 = term.getSubterm(1);
        if(arg28.getTermType() != IStrategoTerm.APPL || transform._consAspectBody_1 != ((IStrategoAppl)arg28).getConstructor())
          break Fail115;
        v_20 = arg28.getSubterm(0);
        term = w_20;
        if(term.getTermType() != IStrategoTerm.APPL || transform._consAspectDecHead_6 != ((IStrategoAppl)term).getConstructor())
          break Fail115;
        IStrategoTerm arg30 = term.getSubterm(1);
        if(arg30.getTermType() != IStrategoTerm.APPL || transform._consId_1 != ((IStrategoAppl)arg30).getConstructor())
          break Fail115;
        if(u_20.value == null)
          u_20.value = arg30.getSubterm(0);
        else
          if(u_20.value != arg30.getSubterm(0) && !u_20.value.match(arg30.getSubterm(0)))
            break Fail115;
        term = v_20;
        lifted4 lifted40 = new lifted4();
        lifted40.t_20 = t_20;
        lifted40.u_20 = u_20;
        term = topdown_1_0.instance.invoke(context, term, lifted40);
        if(term == null)
          break Fail115;
        term = topdown_1_0.instance.invoke(context, term, lifted6.instance);
        if(term == null)
          break Fail115;
        term = termFactory.makeAppl(transform._consAspectDec_2, new IStrategoTerm[]{w_20, termFactory.makeAppl(transform._consAspectBody_1, new IStrategoTerm[]{term})});
        context.popOnSuccess();
        if(true)
          return term;
      }
      context.popOnFailure();
      return null;
    }
  }

  @SuppressWarnings("all") public static class closures_to_ajc_0_2 extends Strategy 
  { 
    public static closures_to_ajc_0_2 instance = new closures_to_ajc_0_2();

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm m_41, IStrategoTerm n_41)
    { 
      ITermFactory termFactory = context.getFactory();
      context.push("closures_to_ajc_0_2");
      Fail116:
      { 
        IStrategoTerm term108 = term;
        IStrategoConstructor cons8 = term.getTermType() == IStrategoTerm.APPL ? ((IStrategoAppl)term).getConstructor() : null;
        Success105:
        { 
          if(cons8 == transform._consJoinpointDeclaration_4)
          { 
            Fail117:
            { 
              IStrategoTerm k_23 = null;
              IStrategoTerm l_23 = null;
              IStrategoTerm m_23 = null;
              IStrategoTerm n_23 = null;
              IStrategoTerm p_23 = null;
              k_23 = term.getSubterm(0);
              l_23 = term.getSubterm(1);
              m_23 = term.getSubterm(2);
              n_23 = term.getSubterm(3);
              p_23 = l_23;
              term = joinpoint_params_to_string_0_0.instance.invoke(context, m_23);
              if(term == null)
                break Fail117;
              term = joinpoint_0_3.instance.invoke(context, p_23, term, k_23, n_23);
              if(term == null)
                break Fail117;
              term = termFactory.makeAppl(transform._consMethodDec_2, new IStrategoTerm[]{termFactory.makeAppl(transform._consMethodDecHead_6, new IStrategoTerm[]{transform.constCons19, transform.constNone0, transform.constVoid0, l_23, m_23, n_23}), transform.constBlock0});
              if(true)
                break Success105;
            }
            term = term108;
          }
          Success106:
          { 
            if(cons8 == transform._consCJPAdvice_4)
            { 
              Fail118:
              { 
                IStrategoTerm v_22 = null;
                IStrategoTerm w_22 = null;
                IStrategoTerm x_22 = null;
                IStrategoTerm y_22 = null;
                IStrategoTerm z_22 = null;
                IStrategoTerm c_23 = null;
                v_22 = term.getSubterm(0);
                IStrategoTerm arg35 = term.getSubterm(1);
                if(arg35.getTermType() != IStrategoTerm.APPL || transform._consCJPAround_3 != ((IStrategoAppl)arg35).getConstructor())
                  break Fail118;
                w_22 = arg35.getSubterm(0);
                IStrategoTerm arg36 = arg35.getSubterm(1);
                if(arg36.getTermType() != IStrategoTerm.APPL || transform._consId_1 != ((IStrategoAppl)arg36).getConstructor())
                  break Fail118;
                x_22 = arg36.getSubterm(0);
                y_22 = arg35.getSubterm(2);
                z_22 = term.getSubterm(3);
                term = map_1_0.instance.invoke(context, y_22, lifted8.instance);
                if(term == null)
                  break Fail118;
                c_23 = term;
                term = map_1_0.instance.invoke(context, y_22, lifted9.instance);
                if(term == null)
                  break Fail118;
                term = termFactory.makeAppl(transform._consAdviceDec_5, new IStrategoTerm[]{v_22, termFactory.makeAppl(transform._consAround_2, new IStrategoTerm[]{w_22, y_22}), transform.constNone0, termFactory.makeAppl(transform._consAndComp_2, new IStrategoTerm[]{termFactory.makeAppl(transform._consCall_1, new IStrategoTerm[]{termFactory.makeAppl(transform._consMethodPattern_6, new IStrategoTerm[]{transform.constAnnoPattern0, transform.constModPattern0, transform.constRefTypePattern0, termFactory.makeAppl(transform._consMemberName_1, new IStrategoTerm[]{x_22}), c_23, transform.constNone0})}), termFactory.makeAppl(transform._consArgs_1, new IStrategoTerm[]{term})}), z_22});
                if(true)
                  break Success106;
              }
              term = term108;
            }
            Success107:
            { 
              if(cons8 == transform._consCJPAdvice_4)
              { 
                Fail119:
                { 
                  IStrategoTerm g_22 = null;
                  IStrategoTerm h_22 = null;
                  IStrategoTerm i_22 = null;
                  IStrategoTerm j_22 = null;
                  IStrategoTerm m_22 = null;
                  g_22 = term.getSubterm(0);
                  IStrategoTerm arg42 = term.getSubterm(1);
                  if(arg42.getTermType() != IStrategoTerm.APPL || transform._consCJPBefore_2 != ((IStrategoAppl)arg42).getConstructor())
                    break Fail119;
                  IStrategoTerm arg43 = arg42.getSubterm(0);
                  if(arg43.getTermType() != IStrategoTerm.APPL || transform._consId_1 != ((IStrategoAppl)arg43).getConstructor())
                    break Fail119;
                  h_22 = arg43.getSubterm(0);
                  i_22 = arg42.getSubterm(1);
                  j_22 = term.getSubterm(3);
                  term = map_1_0.instance.invoke(context, i_22, lifted10.instance);
                  if(term == null)
                    break Fail119;
                  m_22 = term;
                  term = map_1_0.instance.invoke(context, i_22, lifted11.instance);
                  if(term == null)
                    break Fail119;
                  term = termFactory.makeAppl(transform._consAdviceDec_5, new IStrategoTerm[]{g_22, termFactory.makeAppl(transform._consBefore_1, new IStrategoTerm[]{i_22}), transform.constNone0, termFactory.makeAppl(transform._consAndComp_2, new IStrategoTerm[]{termFactory.makeAppl(transform._consCall_1, new IStrategoTerm[]{termFactory.makeAppl(transform._consMethodPattern_6, new IStrategoTerm[]{transform.constAnnoPattern0, transform.constModPattern0, transform.constRefTypePattern0, termFactory.makeAppl(transform._consMemberName_1, new IStrategoTerm[]{h_22}), m_22, transform.constNone0})}), termFactory.makeAppl(transform._consArgs_1, new IStrategoTerm[]{term})}), j_22});
                  if(true)
                    break Success107;
                }
                term = term108;
              }
              Success108:
              { 
                if(cons8 == transform._consCJPAdvice_4)
                { 
                  Fail120:
                  { 
                    IStrategoTerm r_21 = null;
                    IStrategoTerm s_21 = null;
                    IStrategoTerm t_21 = null;
                    IStrategoTerm u_21 = null;
                    IStrategoTerm x_21 = null;
                    r_21 = term.getSubterm(0);
                    IStrategoTerm arg49 = term.getSubterm(1);
                    if(arg49.getTermType() != IStrategoTerm.APPL || transform._consCJPAfter_2 != ((IStrategoAppl)arg49).getConstructor())
                      break Fail120;
                    IStrategoTerm arg50 = arg49.getSubterm(0);
                    if(arg50.getTermType() != IStrategoTerm.APPL || transform._consId_1 != ((IStrategoAppl)arg50).getConstructor())
                      break Fail120;
                    s_21 = arg50.getSubterm(0);
                    t_21 = arg49.getSubterm(1);
                    u_21 = term.getSubterm(3);
                    term = map_1_0.instance.invoke(context, t_21, lifted12.instance);
                    if(term == null)
                      break Fail120;
                    x_21 = term;
                    term = map_1_0.instance.invoke(context, t_21, lifted13.instance);
                    if(term == null)
                      break Fail120;
                    term = termFactory.makeAppl(transform._consAdviceDec_5, new IStrategoTerm[]{r_21, termFactory.makeAppl(transform._consAfter_2, new IStrategoTerm[]{t_21, transform.constNone0}), transform.constNone0, termFactory.makeAppl(transform._consAndComp_2, new IStrategoTerm[]{termFactory.makeAppl(transform._consCall_1, new IStrategoTerm[]{termFactory.makeAppl(transform._consMethodPattern_6, new IStrategoTerm[]{transform.constAnnoPattern0, transform.constModPattern0, transform.constRefTypePattern0, termFactory.makeAppl(transform._consMemberName_1, new IStrategoTerm[]{s_21}), x_21, transform.constNone0})}), termFactory.makeAppl(transform._consArgs_1, new IStrategoTerm[]{term})}), u_21});
                    if(true)
                      break Success108;
                  }
                  term = term108;
                }
                if(cons8 == transform._consCJPAdvice_4)
                { 
                  IStrategoTerm b_21 = null;
                  IStrategoTerm c_21 = null;
                  IStrategoTerm d_21 = null;
                  IStrategoTerm e_21 = null;
                  IStrategoTerm f_21 = null;
                  IStrategoTerm i_21 = null;
                  b_21 = term.getSubterm(0);
                  IStrategoTerm arg56 = term.getSubterm(1);
                  if(arg56.getTermType() != IStrategoTerm.APPL || transform._consCJPAfterReturning_3 != ((IStrategoAppl)arg56).getConstructor())
                    break Fail116;
                  IStrategoTerm arg57 = arg56.getSubterm(0);
                  if(arg57.getTermType() != IStrategoTerm.APPL || transform._consId_1 != ((IStrategoAppl)arg57).getConstructor())
                    break Fail116;
                  d_21 = arg57.getSubterm(0);
                  e_21 = arg56.getSubterm(1);
                  IStrategoTerm arg58 = arg56.getSubterm(2);
                  if(arg58.getTermType() != IStrategoTerm.APPL || transform._consSome_1 != ((IStrategoAppl)arg58).getConstructor())
                    break Fail116;
                  IStrategoTerm arg59 = arg58.getSubterm(0);
                  if(arg59.getTermType() != IStrategoTerm.APPL || transform._consCJPSingleParam_1 != ((IStrategoAppl)arg59).getConstructor())
                    break Fail116;
                  IStrategoTerm arg60 = arg59.getSubterm(0);
                  if(arg60.getTermType() != IStrategoTerm.APPL || transform._consSome_1 != ((IStrategoAppl)arg60).getConstructor())
                    break Fail116;
                  c_21 = arg60.getSubterm(0);
                  f_21 = term.getSubterm(3);
                  term = map_1_0.instance.invoke(context, e_21, lifted14.instance);
                  if(term == null)
                    break Fail116;
                  i_21 = term;
                  term = map_1_0.instance.invoke(context, e_21, lifted15.instance);
                  if(term == null)
                    break Fail116;
                  term = termFactory.makeAppl(transform._consAdviceDec_5, new IStrategoTerm[]{b_21, termFactory.makeAppl(transform._consAfter_2, new IStrategoTerm[]{e_21, termFactory.makeAppl(transform._consSome_1, new IStrategoTerm[]{termFactory.makeAppl(transform._consReturning_1, new IStrategoTerm[]{c_21})})}), transform.constNone0, termFactory.makeAppl(transform._consAndComp_2, new IStrategoTerm[]{termFactory.makeAppl(transform._consCall_1, new IStrategoTerm[]{termFactory.makeAppl(transform._consMethodPattern_6, new IStrategoTerm[]{transform.constAnnoPattern0, transform.constModPattern0, transform.constRefTypePattern0, termFactory.makeAppl(transform._consMemberName_1, new IStrategoTerm[]{d_21}), i_21, transform.constNone0})}), termFactory.makeAppl(transform._consArgs_1, new IStrategoTerm[]{term})}), f_21});
                }
                else
                { 
                  break Fail116;
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

  @SuppressWarnings("all") public static class joinpoint_params_to_string_0_0 extends Strategy 
  { 
    public static joinpoint_params_to_string_0_0 instance = new joinpoint_params_to_string_0_0();

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      context.push("joinpoint_params_to_string_0_0");
      Fail121:
      { 
        term = map_1_0.instance.invoke(context, term, lifted16.instance);
        if(term == null)
          break Fail121;
        term = concat_strings_0_0.instance.invoke(context, term);
        if(term == null)
          break Fail121;
        context.popOnSuccess();
        if(true)
          return term;
      }
      context.popOnFailure();
      return null;
    }
  }

  @SuppressWarnings("all") public static class closures_to_java_0_0 extends Strategy 
  { 
    public static closures_to_java_0_0 instance = new closures_to_java_0_0();

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      ITermFactory termFactory = context.getFactory();
      context.push("closures_to_java_0_0");
      Fail122:
      { 
        IStrategoTerm o_27 = null;
        IStrategoTerm p_27 = null;
        if(term.getTermType() != IStrategoTerm.APPL || transform._consClassDec_2 != ((IStrategoAppl)term).getConstructor())
          break Fail122;
        o_27 = term.getSubterm(0);
        IStrategoTerm arg68 = term.getSubterm(1);
        if(arg68.getTermType() != IStrategoTerm.APPL || transform._consClassBody_1 != ((IStrategoAppl)arg68).getConstructor())
          break Fail122;
        p_27 = arg68.getSubterm(0);
        term = topdown_1_0.instance.invoke(context, p_27, lifted17.instance);
        if(term == null)
          break Fail122;
        term = termFactory.makeAppl(transform._consClassDec_2, new IStrategoTerm[]{o_27, termFactory.makeAppl(transform._consClassBody_1, new IStrategoTerm[]{term})});
        context.popOnSuccess();
        if(true)
          return term;
      }
      context.popOnFailure();
      return null;
    }
  }

  @SuppressWarnings("all") public static class closure_to_java_impl_0_0 extends Strategy 
  { 
    public static closure_to_java_impl_0_0 instance = new closure_to_java_impl_0_0();

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      ITermFactory termFactory = context.getFactory();
      context.push("closure_to_java_impl_0_0");
      Fail123:
      { 
        IStrategoTerm term112 = term;
        Success109:
        { 
          Fail124:
          { 
            IStrategoTerm w_27 = null;
            IStrategoTerm x_27 = null;
            TermReference y_27 = new TermReference();
            IStrategoTerm z_27 = null;
            IStrategoTerm a_28 = null;
            if(term.getTermType() != IStrategoTerm.APPL || transform._consClosureJoinpoints_4 != ((IStrategoAppl)term).getConstructor())
              break Fail124;
            a_28 = term.getSubterm(0);
            w_27 = term.getSubterm(1);
            x_27 = term.getSubterm(2);
            z_27 = term.getSubterm(3);
            term = a_28;
            lifted20 lifted200 = new lifted20();
            lifted19 lifted190 = new lifted19();
            lifted200.y_27 = y_27;
            lifted190.y_27 = y_27;
            term = or_2_0.instance.invoke(context, term, lifted190, lifted200);
            if(term == null)
              break Fail124;
            term = debug_0_0.instance.invoke(context, transform.const71);
            if(term == null)
              break Fail124;
            if(y_27.value == null)
              break Fail124;
            term = termFactory.makeAppl(transform._consInvoke_2, new IStrategoTerm[]{termFactory.makeAppl(transform._consMethod_3, new IStrategoTerm[]{termFactory.makeAppl(transform._consNewInstance_4, new IStrategoTerm[]{transform.constNone0, transform.constClassOrInterfaceType0, transform.constNil0, termFactory.makeAppl(transform._consSome_1, new IStrategoTerm[]{termFactory.makeAppl(transform._consClassBody_1, new IStrategoTerm[]{(IStrategoTerm)termFactory.makeListCons(termFactory.makeAppl(transform._consMethodDec_2, new IStrategoTerm[]{termFactory.makeAppl(transform._consMethodDecHead_6, new IStrategoTerm[]{transform.constCons22, transform.constNone0, transform.constVoid0, termFactory.makeAppl(transform._consId_1, new IStrategoTerm[]{y_27.value}), w_27, transform.constNone0}), x_27}), (IStrategoList)transform.constNil0)})})}), transform.constNone0, termFactory.makeAppl(transform._consId_1, new IStrategoTerm[]{y_27.value})}), z_27});
            if(true)
              break Success109;
          }
          term = term112;
          IStrategoTerm t_27 = null;
          TermReference u_27 = new TermReference();
          IStrategoTerm v_27 = null;
          if(term.getTermType() != IStrategoTerm.APPL || transform._consShortClosureJoinpoints_2 != ((IStrategoAppl)term).getConstructor())
            break Fail123;
          v_27 = term.getSubterm(0);
          t_27 = term.getSubterm(1);
          term = v_27;
          lifted22 lifted220 = new lifted22();
          lifted21 lifted210 = new lifted21();
          lifted220.u_27 = u_27;
          lifted210.u_27 = u_27;
          term = or_2_0.instance.invoke(context, term, lifted210, lifted220);
          if(term == null)
            break Fail123;
          term = debug_0_0.instance.invoke(context, transform.const73);
          if(term == null)
            break Fail123;
          if(u_27.value == null)
            break Fail123;
          term = termFactory.makeAppl(transform._consInvoke_2, new IStrategoTerm[]{termFactory.makeAppl(transform._consMethod_3, new IStrategoTerm[]{termFactory.makeAppl(transform._consNewInstance_4, new IStrategoTerm[]{transform.constNone0, transform.constClassOrInterfaceType0, transform.constNil0, termFactory.makeAppl(transform._consSome_1, new IStrategoTerm[]{termFactory.makeAppl(transform._consClassBody_1, new IStrategoTerm[]{(IStrategoTerm)termFactory.makeListCons(termFactory.makeAppl(transform._consMethodDec_2, new IStrategoTerm[]{termFactory.makeAppl(transform._consMethodDecHead_6, new IStrategoTerm[]{transform.constCons22, transform.constNone0, transform.constVoid0, termFactory.makeAppl(transform._consId_1, new IStrategoTerm[]{u_27.value}), transform.constNil0, transform.constNone0}), t_27}), (IStrategoList)transform.constNil0)})})}), transform.constNone0, termFactory.makeAppl(transform._consId_1, new IStrategoTerm[]{u_27.value})}), transform.constNil0});
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
      Fail125:
      { 
        term = handle_io_0_0.instance.invoke(context, term);
        if(term == null)
          break Fail125;
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
      Fail126:
      { 
        IStrategoTerm d_28 = null;
        IStrategoTerm e_28 = null;
        IStrategoTerm f_28 = null;
        IStrategoTerm g_28 = null;
        IStrategoTerm j_28 = null;
        IStrategoTerm p_28 = null;
        IStrategoTerm l_28 = null;
        if(term.getTermType() != IStrategoTerm.LIST || ((IStrategoList)term).isEmpty())
          break Fail126;
        d_28 = ((IStrategoList)term).tail();
        term = debug_0_0.instance.invoke(context, d_28);
        if(term == null)
          break Fail126;
        term = d_28;
        if(term.getTermType() != IStrategoTerm.LIST || ((IStrategoList)term).isEmpty())
          break Fail126;
        j_28 = ((IStrategoList)term).head();
        term = j_28;
        term = $Read$From$File_0_0.instance.invoke(context, term);
        if(term == null)
          break Fail126;
        e_28 = term;
        term = d_28;
        if(term.getTermType() != IStrategoTerm.LIST || ((IStrategoList)term).isEmpty())
          break Fail126;
        p_28 = ((IStrategoList)term).tail();
        term = p_28;
        if(term.getTermType() != IStrategoTerm.LIST || ((IStrategoList)term).isEmpty())
          break Fail126;
        l_28 = ((IStrategoList)term).head();
        f_28 = l_28;
        term = convert_0_0.instance.invoke(context, e_28);
        if(term == null)
          break Fail126;
        term = pp_aspectj_string_0_0.instance.invoke(context, term);
        if(term == null)
          break Fail126;
        g_28 = term;
        term = termFactory.makeTuple(f_28, transform.const74);
        term = fopen_0_0.instance.invoke(context, term);
        if(term == null)
          break Fail126;
        term = termFactory.makeTuple(g_28, term);
        term = fputs_0_0.instance.invoke(context, term);
        if(term == null)
          break Fail126;
        term = fclose_0_0.instance.invoke(context, term);
        if(term == null)
          break Fail126;
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
      context.push("convert_0_0");
      Fail127:
      { 
        term = try_1_0.instance.invoke(context, term, closures_converter_compilation_unit_0_0.instance);
        if(term == null)
          break Fail127;
        context.popOnSuccess();
        if(true)
          return term;
      }
      context.popOnFailure();
      return null;
    }
  }

  @SuppressWarnings("all") public static class closures_converter_compilation_unit_0_0 extends Strategy 
  { 
    public static closures_converter_compilation_unit_0_0 instance = new closures_converter_compilation_unit_0_0();

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      ITermFactory termFactory = context.getFactory();
      context.push("closures_converter_compilation_unit_0_0");
      Fail128:
      { 
        IStrategoTerm z_28 = null;
        IStrategoTerm a_29 = null;
        IStrategoTerm c_29 = null;
        IStrategoTerm e_29 = null;
        TermReference f_29 = new TermReference();
        IStrategoTerm g_29 = null;
        IStrategoTerm h_29 = null;
        IStrategoTerm m_29 = null;
        if(term.getTermType() != IStrategoTerm.APPL || transform._consCompilationUnit_3 != ((IStrategoAppl)term).getConstructor())
          break Fail128;
        a_29 = term.getSubterm(0);
        c_29 = term.getSubterm(1);
        g_29 = term.getSubterm(2);
        m_29 = term;
        IStrategoTerm term113 = term;
        Success110:
        { 
          Fail129:
          { 
            Success111:
            { 
              Fail130:
              { 
                IStrategoTerm i_29 = null;
                IStrategoTerm n_29 = null;
                i_29 = term;
                term = SRTS_all.instance.invoke(context, g_29, lifted24.instance);
                if(term == null)
                  break Fail130;
                n_29 = term;
                z_28 = g_29;
                term = n_29;
                if(term != z_28 && !z_28.match(term))
                  break Fail130;
                term = i_29;
                { 
                  term = debug_0_0.instance.invoke(context, transform.const75);
                  if(term == null)
                    break Fail129;
                  e_29 = c_29;
                  term = g_29;
                  h_29 = g_29;
                  if(true)
                    break Success111;
                }
              }
              term = debug_0_0.instance.invoke(context, transform.const76);
              if(term == null)
                break Fail129;
              Success112:
              { 
                Fail131:
                { 
                  IStrategoTerm j_29 = null;
                  j_29 = term;
                  term = a_29;
                  if(term.getTermType() != IStrategoTerm.APPL || transform._consSome_1 != ((IStrategoAppl)term).getConstructor())
                    break Fail131;
                  IStrategoTerm arg75 = term.getSubterm(0);
                  if(arg75.getTermType() != IStrategoTerm.APPL || transform._consPackageDec_2 != ((IStrategoAppl)arg75).getConstructor())
                    break Fail131;
                  term = j_29;
                  { 
                    term = a_29;
                    if(term.getTermType() != IStrategoTerm.APPL || transform._consSome_1 != ((IStrategoAppl)term).getConstructor())
                      break Fail129;
                    IStrategoTerm arg78 = term.getSubterm(0);
                    if(arg78.getTermType() != IStrategoTerm.APPL || transform._consPackageDec_2 != ((IStrategoAppl)arg78).getConstructor())
                      break Fail129;
                    if(f_29.value == null)
                      f_29.value = arg78.getSubterm(1);
                    else
                      if(f_29.value != arg78.getSubterm(1) && !f_29.value.match(arg78.getSubterm(1)))
                        break Fail129;
                    if(true)
                      break Success112;
                  }
                }
                term = transform.constNone0;
                if(f_29.value == null)
                  f_29.value = term;
                else
                  if(f_29.value != term && !f_29.value.match(term))
                    break Fail129;
              }
              term = debug_0_0.instance.invoke(context, transform.const77);
              if(term == null)
                break Fail129;
              term = termFactory.makeTuple(c_29, transform.constCons25);
              term = conc_0_0.instance.invoke(context, term);
              if(term == null)
                break Fail129;
              e_29 = term;
              term = debug_0_0.instance.invoke(context, transform.const80);
              if(term == null)
                break Fail129;
              term = debug_0_0.instance.invoke(context, g_29);
              if(term == null)
                break Fail129;
              lifted26 lifted260 = new lifted26();
              lifted260.f_29 = f_29;
              term = SRTS_all.instance.invoke(context, term, lifted260);
              if(term == null)
                break Fail129;
              h_29 = term;
              term = debug_0_0.instance.invoke(context, transform.const81);
              if(term == null)
                break Fail129;
            }
            if(true)
              break Success110;
          }
          term = term113;
          IStrategoTerm k_29 = null;
          IStrategoTerm l_29 = null;
          IStrategoTerm q_29 = null;
          k_29 = term;
          term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
          if(term == null)
            break Fail128;
          l_29 = term;
          q_29 = k_29;
          term = report_with_failure_0_2.instance.invoke(context, q_29, transform.const82, l_29);
          if(term == null)
            break Fail128;
        }
        term = m_29;
        if(e_29 == null || h_29 == null)
          break Fail128;
        term = termFactory.makeAppl(transform._consCompilationUnit_3, new IStrategoTerm[]{a_29, e_29, h_29});
        context.popOnSuccess();
        if(true)
          return term;
      }
      context.popOnFailure();
      return null;
    }
  }

  @SuppressWarnings("all") public static class check_for_change_in_aspect_or_class_0_0 extends Strategy 
  { 
    public static check_for_change_in_aspect_or_class_0_0 instance = new check_for_change_in_aspect_or_class_0_0();

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      ITermFactory termFactory = context.getFactory();
      context.push("check_for_change_in_aspect_or_class_0_0");
      Fail132:
      { 
        IStrategoTerm term116 = term;
        IStrategoConstructor cons9 = term.getTermType() == IStrategoTerm.APPL ? ((IStrategoAppl)term).getConstructor() : null;
        Success113:
        { 
          if(cons9 == transform._consClassDec_2)
          { 
            Fail133:
            { 
              IStrategoTerm e_30 = null;
              IStrategoTerm j_30 = null;
              IStrategoTerm k_30 = null;
              IStrategoTerm e_31 = null;
              e_30 = term.getSubterm(0);
              j_30 = term.getSubterm(1);
              e_31 = term;
              IStrategoTerm term117 = term;
              Success114:
              { 
                Fail134:
                { 
                  term = debug_0_0.instance.invoke(context, transform.const83);
                  if(term == null)
                    break Fail134;
                  term = termFactory.makeAppl(transform._consClassDec_2, new IStrategoTerm[]{e_30, j_30});
                  term = topdown_1_0.instance.invoke(context, term, lifted28.instance);
                  if(term == null)
                    break Fail134;
                  term = debug_0_0.instance.invoke(context, term);
                  if(term == null)
                    break Fail134;
                  k_30 = term;
                  if(true)
                    break Success114;
                }
                term = term117;
                IStrategoTerm l_30 = null;
                IStrategoTerm m_30 = null;
                IStrategoTerm m_31 = null;
                l_30 = term;
                term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
                if(term == null)
                  break Fail133;
                m_30 = term;
                m_31 = l_30;
                term = report_with_failure_0_2.instance.invoke(context, m_31, transform.const84, m_30);
                if(term == null)
                  break Fail133;
              }
              term = e_31;
              if(k_30 == null)
                break Fail133;
              term = k_30;
              if(true)
                break Success113;
            }
            term = term116;
          }
          if(cons9 == transform._consAspectDec_2)
          { 
            IStrategoTerm t_29 = null;
            IStrategoTerm u_29 = null;
            IStrategoTerm v_29 = null;
            IStrategoTerm z_29 = null;
            t_29 = term.getSubterm(0);
            u_29 = term.getSubterm(1);
            z_29 = term;
            IStrategoTerm term119 = term;
            Success115:
            { 
              Fail135:
              { 
                term = termFactory.makeAppl(transform._consAspectDec_2, new IStrategoTerm[]{t_29, u_29});
                term = topdown_1_0.instance.invoke(context, term, lifted30.instance);
                if(term == null)
                  break Fail135;
                v_29 = term;
                if(true)
                  break Success115;
              }
              term = term119;
              IStrategoTerm w_29 = null;
              IStrategoTerm y_29 = null;
              IStrategoTerm b_30 = null;
              w_29 = term;
              term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
              if(term == null)
                break Fail132;
              y_29 = term;
              b_30 = w_29;
              term = report_with_failure_0_2.instance.invoke(context, b_30, transform.const84, y_29);
              if(term == null)
                break Fail132;
            }
            term = z_29;
            if(v_29 == null)
              break Fail132;
            term = v_29;
          }
          else
          { 
            break Fail132;
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

  @SuppressWarnings("all") public static class closures_converter_aspect_or_class_0_1 extends Strategy 
  { 
    public static closures_converter_aspect_or_class_0_1 instance = new closures_converter_aspect_or_class_0_1();

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm q_41)
    { 
      ITermFactory termFactory = context.getFactory();
      context.push("closures_converter_aspect_or_class_0_1");
      Fail136:
      { 
        IStrategoTerm term120 = term;
        IStrategoConstructor cons10 = term.getTermType() == IStrategoTerm.APPL ? ((IStrategoAppl)term).getConstructor() : null;
        Success116:
        { 
          if(cons10 == transform._consAspectDec_2)
          { 
            Fail137:
            { 
              IStrategoTerm w_33 = null;
              IStrategoTerm x_33 = null;
              IStrategoTerm y_33 = null;
              IStrategoTerm b_34 = null;
              w_33 = term.getSubterm(0);
              x_33 = term.getSubterm(1);
              b_34 = term;
              IStrategoTerm term121 = term;
              Success117:
              { 
                Fail138:
                { 
                  term = termFactory.makeAppl(transform._consAspectDec_2, new IStrategoTerm[]{w_33, x_33});
                  term = closures_to_ajc_0_1.instance.invoke(context, term, q_41);
                  if(term == null)
                    break Fail138;
                  y_33 = term;
                  if(true)
                    break Success117;
                }
                term = term121;
                IStrategoTerm z_33 = null;
                IStrategoTerm a_34 = null;
                IStrategoTerm d_34 = null;
                z_33 = term;
                term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
                if(term == null)
                  break Fail137;
                a_34 = term;
                d_34 = z_33;
                term = report_with_failure_0_2.instance.invoke(context, d_34, transform.const85, a_34);
                if(term == null)
                  break Fail137;
              }
              term = b_34;
              if(y_33 == null)
                break Fail137;
              term = y_33;
              if(true)
                break Success116;
            }
            term = term120;
          }
          if(cons10 == transform._consClassDec_2)
          { 
            IStrategoTerm d_33 = null;
            IStrategoTerm e_33 = null;
            IStrategoTerm f_33 = null;
            IStrategoTerm m_33 = null;
            d_33 = term.getSubterm(0);
            e_33 = term.getSubterm(1);
            m_33 = term;
            IStrategoTerm term122 = term;
            Success118:
            { 
              Fail139:
              { 
                term = termFactory.makeAppl(transform._consClassDec_2, new IStrategoTerm[]{d_33, e_33});
                term = closures_to_java_0_0.instance.invoke(context, term);
                if(term == null)
                  break Fail139;
                f_33 = term;
                if(true)
                  break Success118;
              }
              term = term122;
              IStrategoTerm k_33 = null;
              IStrategoTerm l_33 = null;
              IStrategoTerm s_33 = null;
              k_33 = term;
              term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
              if(term == null)
                break Fail136;
              l_33 = term;
              s_33 = k_33;
              term = report_with_failure_0_2.instance.invoke(context, s_33, transform.const85, l_33);
              if(term == null)
                break Fail136;
            }
            term = m_33;
            if(f_33 == null)
              break Fail136;
            term = f_33;
          }
          else
          { 
            break Fail136;
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

  @SuppressWarnings("all") public static class $Or$Comp_2_0 extends Strategy 
  { 
    public static $Or$Comp_2_0 instance = new $Or$Comp_2_0();

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy g_35, Strategy h_35)
    { 
      ITermFactory termFactory = context.getFactory();
      context.push("OrComp_2_0");
      Fail140:
      { 
        IStrategoTerm p_170 = null;
        IStrategoTerm m_170 = null;
        IStrategoTerm n_170 = null;
        IStrategoTerm q_170 = null;
        if(term.getTermType() != IStrategoTerm.APPL || transform._consOrComp_2 != ((IStrategoAppl)term).getConstructor())
          break Fail140;
        m_170 = term.getSubterm(0);
        n_170 = term.getSubterm(1);
        IStrategoList annos0 = term.getAnnotations();
        p_170 = annos0;
        term = g_35.invoke(context, m_170);
        if(term == null)
          break Fail140;
        q_170 = term;
        term = h_35.invoke(context, n_170);
        if(term == null)
          break Fail140;
        term = termFactory.annotateTerm(termFactory.makeAppl(transform._consOrComp_2, new IStrategoTerm[]{q_170, term}), checkListAnnos(termFactory, p_170));
        context.popOnSuccess();
        if(true)
          return term;
      }
      context.popOnFailure();
      return null;
    }
  }

  @SuppressWarnings("all") public static class $And$Comp_2_0 extends Strategy 
  { 
    public static $And$Comp_2_0 instance = new $And$Comp_2_0();

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy i_35, Strategy j_35)
    { 
      ITermFactory termFactory = context.getFactory();
      context.push("AndComp_2_0");
      Fail141:
      { 
        IStrategoTerm v_170 = null;
        IStrategoTerm s_170 = null;
        IStrategoTerm t_170 = null;
        IStrategoTerm w_170 = null;
        if(term.getTermType() != IStrategoTerm.APPL || transform._consAndComp_2 != ((IStrategoAppl)term).getConstructor())
          break Fail141;
        s_170 = term.getSubterm(0);
        t_170 = term.getSubterm(1);
        IStrategoList annos1 = term.getAnnotations();
        v_170 = annos1;
        term = i_35.invoke(context, s_170);
        if(term == null)
          break Fail141;
        w_170 = term;
        term = j_35.invoke(context, t_170);
        if(term == null)
          break Fail141;
        term = termFactory.annotateTerm(termFactory.makeAppl(transform._consAndComp_2, new IStrategoTerm[]{w_170, term}), checkListAnnos(termFactory, v_170));
        context.popOnSuccess();
        if(true)
          return term;
      }
      context.popOnFailure();
      return null;
    }
  }

  @SuppressWarnings("all") public static class $Not$Comp_1_0 extends Strategy 
  { 
    public static $Not$Comp_1_0 instance = new $Not$Comp_1_0();

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy k_35)
    { 
      ITermFactory termFactory = context.getFactory();
      context.push("NotComp_1_0");
      Fail142:
      { 
        IStrategoTerm z_170 = null;
        IStrategoTerm y_170 = null;
        if(term.getTermType() != IStrategoTerm.APPL || transform._consNotComp_1 != ((IStrategoAppl)term).getConstructor())
          break Fail142;
        y_170 = term.getSubterm(0);
        IStrategoList annos2 = term.getAnnotations();
        z_170 = annos2;
        term = k_35.invoke(context, y_170);
        if(term == null)
          break Fail142;
        term = termFactory.annotateTerm(termFactory.makeAppl(transform._consNotComp_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, z_170));
        context.popOnSuccess();
        if(true)
          return term;
      }
      context.popOnFailure();
      return null;
    }
  }

  @SuppressWarnings("all") private static final class lifted30 extends Strategy 
  { 
    public static final lifted30 instance = new lifted30();

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      Fail143:
      { 
        term = try_1_0.instance.invoke(context, term, remove_closures_additions_0_0.instance);
        if(term == null)
          break Fail143;
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
      Fail144:
      { 
        term = try_1_0.instance.invoke(context, term, lifted29.instance);
        if(term == null)
          break Fail144;
        if(true)
          return term;
      }
      return null;
    }
  }

  @SuppressWarnings("all") private static final class lifted29 extends Strategy 
  { 
    public static final lifted29 instance = new lifted29();

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      Fail145:
      { 
        IStrategoTerm term118 = term;
        IStrategoConstructor cons11 = term.getTermType() == IStrategoTerm.APPL ? ((IStrategoAppl)term).getConstructor() : null;
        Success119:
        { 
          if(cons11 == transform._consShortClosureJoinpoints_2)
          { 
            Fail146:
            { 
              term = transform.constNone0;
              if(true)
                break Success119;
            }
            term = term118;
          }
          if(cons11 == transform._consClosureJoinpoints_4)
          { 
            term = transform.constNone0;
          }
          else
          { 
            break Fail145;
          }
        }
        if(true)
          return term;
      }
      return null;
    }
  }

  @SuppressWarnings("all") private static final class lifted26 extends Strategy 
  { 
    TermReference f_29;

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      Fail147:
      { 
        lifted27 lifted270 = new lifted27();
        lifted270.f_29 = f_29;
        term = try_1_0.instance.invoke(context, term, lifted270);
        if(term == null)
          break Fail147;
        if(true)
          return term;
      }
      return null;
    }
  }

  @SuppressWarnings("all") private static final class lifted27 extends Strategy 
  { 
    TermReference f_29;

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      Fail148:
      { 
        term = closures_converter_aspect_or_class_0_1.instance.invoke(context, term, f_29.value);
        if(term == null)
          break Fail148;
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
      Fail149:
      { 
        term = try_1_0.instance.invoke(context, term, check_for_change_in_aspect_or_class_0_0.instance);
        if(term == null)
          break Fail149;
        if(true)
          return term;
      }
      return null;
    }
  }

  @SuppressWarnings("all") private static final class lifted22 extends Strategy 
  { 
    TermReference u_27;

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      Fail150:
      { 
        if(term.getTermType() != IStrategoTerm.APPL || transform._consMethodName_2 != ((IStrategoAppl)term).getConstructor())
          break Fail150;
        IStrategoTerm arg74 = term.getSubterm(1);
        if(arg74.getTermType() != IStrategoTerm.APPL || transform._consId_1 != ((IStrategoAppl)arg74).getConstructor())
          break Fail150;
        if(u_27.value == null)
          u_27.value = arg74.getSubterm(0);
        else
          if(u_27.value != arg74.getSubterm(0) && !u_27.value.match(arg74.getSubterm(0)))
            break Fail150;
        if(true)
          return term;
      }
      return null;
    }
  }

  @SuppressWarnings("all") private static final class lifted21 extends Strategy 
  { 
    TermReference u_27;

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      Fail151:
      { 
        if(term.getTermType() != IStrategoTerm.APPL || transform._consMethodName_1 != ((IStrategoAppl)term).getConstructor())
          break Fail151;
        IStrategoTerm arg72 = term.getSubterm(0);
        if(arg72.getTermType() != IStrategoTerm.APPL || transform._consId_1 != ((IStrategoAppl)arg72).getConstructor())
          break Fail151;
        if(u_27.value == null)
          u_27.value = arg72.getSubterm(0);
        else
          if(u_27.value != arg72.getSubterm(0) && !u_27.value.match(arg72.getSubterm(0)))
            break Fail151;
        if(true)
          return term;
      }
      return null;
    }
  }

  @SuppressWarnings("all") private static final class lifted20 extends Strategy 
  { 
    TermReference y_27;

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      Fail152:
      { 
        if(term.getTermType() != IStrategoTerm.APPL || transform._consMethodName_2 != ((IStrategoAppl)term).getConstructor())
          break Fail152;
        IStrategoTerm arg71 = term.getSubterm(1);
        if(arg71.getTermType() != IStrategoTerm.APPL || transform._consId_1 != ((IStrategoAppl)arg71).getConstructor())
          break Fail152;
        if(y_27.value == null)
          y_27.value = arg71.getSubterm(0);
        else
          if(y_27.value != arg71.getSubterm(0) && !y_27.value.match(arg71.getSubterm(0)))
            break Fail152;
        if(true)
          return term;
      }
      return null;
    }
  }

  @SuppressWarnings("all") private static final class lifted19 extends Strategy 
  { 
    TermReference y_27;

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      Fail153:
      { 
        if(term.getTermType() != IStrategoTerm.APPL || transform._consMethodName_1 != ((IStrategoAppl)term).getConstructor())
          break Fail153;
        IStrategoTerm arg69 = term.getSubterm(0);
        if(arg69.getTermType() != IStrategoTerm.APPL || transform._consId_1 != ((IStrategoAppl)arg69).getConstructor())
          break Fail153;
        if(y_27.value == null)
          y_27.value = arg69.getSubterm(0);
        else
          if(y_27.value != arg69.getSubterm(0) && !y_27.value.match(arg69.getSubterm(0)))
            break Fail153;
        if(true)
          return term;
      }
      return null;
    }
  }

  @SuppressWarnings("all") private static final class lifted17 extends Strategy 
  { 
    public static final lifted17 instance = new lifted17();

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      Fail154:
      { 
        term = try_1_0.instance.invoke(context, term, closure_to_java_impl_0_0.instance);
        if(term == null)
          break Fail154;
        if(true)
          return term;
      }
      return null;
    }
  }

  @SuppressWarnings("all") private static final class lifted16 extends Strategy 
  { 
    public static final lifted16 instance = new lifted16();

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      ITermFactory termFactory = context.getFactory();
      Fail155:
      { 
        IStrategoTerm q_23 = null;
        if(term.getTermType() != IStrategoTerm.APPL || transform._consParam_3 != ((IStrategoAppl)term).getConstructor())
          break Fail155;
        q_23 = term.getSubterm(1);
        term = pp_java5_to_string_0_0.instance.invoke(context, q_23);
        if(term == null)
          break Fail155;
        term = termFactory.makeTuple(transform.const70, term);
        term = conc_strings_0_0.instance.invoke(context, term);
        if(term == null)
          break Fail155;
        if(true)
          return term;
      }
      return null;
    }
  }

  @SuppressWarnings("all") private static final class lifted15 extends Strategy 
  { 
    public static final lifted15 instance = new lifted15();

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      ITermFactory termFactory = context.getFactory();
      Fail156:
      { 
        IStrategoTerm h_21 = null;
        if(term.getTermType() != IStrategoTerm.APPL || transform._consParam_3 != ((IStrategoAppl)term).getConstructor())
          break Fail156;
        IStrategoTerm arg65 = term.getSubterm(2);
        if(arg65.getTermType() != IStrategoTerm.APPL || transform._consId_1 != ((IStrategoAppl)arg65).getConstructor())
          break Fail156;
        h_21 = arg65.getSubterm(0);
        term = termFactory.makeAppl(transform._consClassOrInterfaceType_2, new IStrategoTerm[]{termFactory.makeAppl(transform._consTypeName_1, new IStrategoTerm[]{termFactory.makeAppl(transform._consId_1, new IStrategoTerm[]{h_21})}), transform.constNone0});
        if(true)
          return term;
      }
      return null;
    }
  }

  @SuppressWarnings("all") private static final class lifted14 extends Strategy 
  { 
    public static final lifted14 instance = new lifted14();

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      ITermFactory termFactory = context.getFactory();
      Fail157:
      { 
        IStrategoTerm g_21 = null;
        if(term.getTermType() != IStrategoTerm.APPL || transform._consParam_3 != ((IStrategoAppl)term).getConstructor())
          break Fail157;
        g_21 = term.getSubterm(1);
        term = pp_aspectj_string_0_0.instance.invoke(context, g_21);
        if(term == null)
          break Fail157;
        term = termFactory.makeAppl(transform._consRegularTypePattern_1, new IStrategoTerm[]{termFactory.makeAppl(transform._consRefTypePattern_1, new IStrategoTerm[]{termFactory.makeAppl(transform._consNamePattern_1, new IStrategoTerm[]{term})})});
        if(true)
          return term;
      }
      return null;
    }
  }

  @SuppressWarnings("all") private static final class lifted13 extends Strategy 
  { 
    public static final lifted13 instance = new lifted13();

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      ITermFactory termFactory = context.getFactory();
      Fail158:
      { 
        IStrategoTerm w_21 = null;
        if(term.getTermType() != IStrategoTerm.APPL || transform._consParam_3 != ((IStrategoAppl)term).getConstructor())
          break Fail158;
        IStrategoTerm arg55 = term.getSubterm(2);
        if(arg55.getTermType() != IStrategoTerm.APPL || transform._consId_1 != ((IStrategoAppl)arg55).getConstructor())
          break Fail158;
        w_21 = arg55.getSubterm(0);
        term = termFactory.makeAppl(transform._consClassOrInterfaceType_2, new IStrategoTerm[]{termFactory.makeAppl(transform._consTypeName_1, new IStrategoTerm[]{termFactory.makeAppl(transform._consId_1, new IStrategoTerm[]{w_21})}), transform.constNone0});
        if(true)
          return term;
      }
      return null;
    }
  }

  @SuppressWarnings("all") private static final class lifted12 extends Strategy 
  { 
    public static final lifted12 instance = new lifted12();

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      ITermFactory termFactory = context.getFactory();
      Fail159:
      { 
        IStrategoTerm v_21 = null;
        if(term.getTermType() != IStrategoTerm.APPL || transform._consParam_3 != ((IStrategoAppl)term).getConstructor())
          break Fail159;
        v_21 = term.getSubterm(1);
        term = pp_aspectj_string_0_0.instance.invoke(context, v_21);
        if(term == null)
          break Fail159;
        term = termFactory.makeAppl(transform._consRegularTypePattern_1, new IStrategoTerm[]{termFactory.makeAppl(transform._consRefTypePattern_1, new IStrategoTerm[]{termFactory.makeAppl(transform._consNamePattern_1, new IStrategoTerm[]{term})})});
        if(true)
          return term;
      }
      return null;
    }
  }

  @SuppressWarnings("all") private static final class lifted11 extends Strategy 
  { 
    public static final lifted11 instance = new lifted11();

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      ITermFactory termFactory = context.getFactory();
      Fail160:
      { 
        IStrategoTerm l_22 = null;
        if(term.getTermType() != IStrategoTerm.APPL || transform._consParam_3 != ((IStrategoAppl)term).getConstructor())
          break Fail160;
        IStrategoTerm arg48 = term.getSubterm(2);
        if(arg48.getTermType() != IStrategoTerm.APPL || transform._consId_1 != ((IStrategoAppl)arg48).getConstructor())
          break Fail160;
        l_22 = arg48.getSubterm(0);
        term = termFactory.makeAppl(transform._consClassOrInterfaceType_2, new IStrategoTerm[]{termFactory.makeAppl(transform._consTypeName_1, new IStrategoTerm[]{termFactory.makeAppl(transform._consId_1, new IStrategoTerm[]{l_22})}), transform.constNone0});
        if(true)
          return term;
      }
      return null;
    }
  }

  @SuppressWarnings("all") private static final class lifted10 extends Strategy 
  { 
    public static final lifted10 instance = new lifted10();

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      ITermFactory termFactory = context.getFactory();
      Fail161:
      { 
        IStrategoTerm k_22 = null;
        if(term.getTermType() != IStrategoTerm.APPL || transform._consParam_3 != ((IStrategoAppl)term).getConstructor())
          break Fail161;
        k_22 = term.getSubterm(1);
        term = pp_aspectj_string_0_0.instance.invoke(context, k_22);
        if(term == null)
          break Fail161;
        term = termFactory.makeAppl(transform._consRegularTypePattern_1, new IStrategoTerm[]{termFactory.makeAppl(transform._consRefTypePattern_1, new IStrategoTerm[]{termFactory.makeAppl(transform._consNamePattern_1, new IStrategoTerm[]{term})})});
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
      ITermFactory termFactory = context.getFactory();
      Fail162:
      { 
        IStrategoTerm b_23 = null;
        if(term.getTermType() != IStrategoTerm.APPL || transform._consParam_3 != ((IStrategoAppl)term).getConstructor())
          break Fail162;
        IStrategoTerm arg41 = term.getSubterm(2);
        if(arg41.getTermType() != IStrategoTerm.APPL || transform._consId_1 != ((IStrategoAppl)arg41).getConstructor())
          break Fail162;
        b_23 = arg41.getSubterm(0);
        term = termFactory.makeAppl(transform._consClassOrInterfaceType_2, new IStrategoTerm[]{termFactory.makeAppl(transform._consTypeName_1, new IStrategoTerm[]{termFactory.makeAppl(transform._consId_1, new IStrategoTerm[]{b_23})}), transform.constNone0});
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
      ITermFactory termFactory = context.getFactory();
      Fail163:
      { 
        IStrategoTerm a_23 = null;
        if(term.getTermType() != IStrategoTerm.APPL || transform._consParam_3 != ((IStrategoAppl)term).getConstructor())
          break Fail163;
        a_23 = term.getSubterm(1);
        term = pp_aspectj_string_0_0.instance.invoke(context, a_23);
        if(term == null)
          break Fail163;
        term = termFactory.makeAppl(transform._consRegularTypePattern_1, new IStrategoTerm[]{termFactory.makeAppl(transform._consRefTypePattern_1, new IStrategoTerm[]{termFactory.makeAppl(transform._consNamePattern_1, new IStrategoTerm[]{term})})});
        if(true)
          return term;
      }
      return null;
    }
  }

  @SuppressWarnings("all") private static final class lifted6 extends Strategy 
  { 
    public static final lifted6 instance = new lifted6();

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      Fail164:
      { 
        term = try_1_0.instance.invoke(context, term, closure_to_java_impl_0_0.instance);
        if(term == null)
          break Fail164;
        if(true)
          return term;
      }
      return null;
    }
  }

  @SuppressWarnings("all") private static final class lifted4 extends Strategy 
  { 
    TermReference t_20;

    TermReference u_20;

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      Fail165:
      { 
        lifted5 lifted50 = new lifted5();
        lifted50.t_20 = t_20;
        lifted50.u_20 = u_20;
        term = try_1_0.instance.invoke(context, term, lifted50);
        if(term == null)
          break Fail165;
        if(true)
          return term;
      }
      return null;
    }
  }

  @SuppressWarnings("all") private static final class lifted5 extends Strategy 
  { 
    TermReference t_20;

    TermReference u_20;

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      Fail166:
      { 
        term = closures_to_ajc_0_2.instance.invoke(context, term, t_20.value, u_20.value);
        if(term == null)
          break Fail166;
        if(true)
          return term;
      }
      return null;
    }
  }

  @SuppressWarnings("all") private static final class lifted3 extends Strategy 
  { 
    public static final lifted3 instance = new lifted3();

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      Fail167:
      { 
        IStrategoTerm term104 = term;
        Success120:
        { 
          Fail168:
          { 
            term = aspectj_to_box_0_0.instance.invoke(context, term);
            if(term == null)
              break Fail168;
            if(true)
              break Success120;
          }
          term = java_to_box_0_0.instance.invoke(context, term104);
          if(term == null)
            break Fail167;
        }
        if(true)
          return term;
      }
      return null;
    }
  }

  @SuppressWarnings("all") private static final class k_20 extends Strategy 
  { 
    public static final k_20 instance = new k_20();

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      Fail169:
      { 
        IStrategoTerm term101 = term;
        Success121:
        { 
          Fail170:
          { 
            term = $Not$Comp_1_0.instance.invoke(context, term, _Id.instance);
            if(term == null)
              break Fail170;
            if(true)
              break Success121;
          }
          term = term101;
          IStrategoTerm term102 = term;
          Success122:
          { 
            Fail171:
            { 
              term = $And$Comp_2_0.instance.invoke(context, term, this, _Id.instance);
              if(term == null)
                break Fail171;
              if(true)
                break Success122;
            }
            term = $Or$Comp_2_0.instance.invoke(context, term102, this, _Id.instance);
            if(term == null)
              break Fail169;
          }
        }
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
      varScope.addSVar("aspectj_to_box_0_0_fragment_4", new InteropSDefT(aspectj_to_box_0_0_fragment_4.instance, context));
      varScope.addSVar("aspectj_to_box_0_0_fragment_3", new InteropSDefT(aspectj_to_box_0_0_fragment_3.instance, context));
      varScope.addSVar("aspectj_to_box_0_0_fragment_2", new InteropSDefT(aspectj_to_box_0_0_fragment_2.instance, context));
      varScope.addSVar("aspectj_to_box_0_0_fragment_1", new InteropSDefT(aspectj_to_box_0_0_fragment_1.instance, context));
      varScope.addSVar("aspectj_to_box_0_0_fragment_0", new InteropSDefT(aspectj_to_box_0_0_fragment_0.instance, context));
      varScope.addSVar("aspectj_to_box_0_0", new InteropSDefT(aspectj_to_box_0_0.instance, context));
      varScope.addSVar("has_leftmost_not_0_0", new InteropSDefT(has_leftmost_not_0_0.instance, context));
      varScope.addSVar("option_to_boxes_0_0", new InteropSDefT(option_to_boxes_0_0.instance, context));
      varScope.addSVar("pp_aspectj_string_0_0", new InteropSDefT(pp_aspectj_string_0_0.instance, context));
      varScope.addSVar("remove_closures_additions_0_0", new InteropSDefT(remove_closures_additions_0_0.instance, context));
      varScope.addSVar("closures_to_ajc_0_1", new InteropSDefT(closures_to_ajc_0_1.instance, context));
      varScope.addSVar("closures_to_ajc_0_2", new InteropSDefT(closures_to_ajc_0_2.instance, context));
      varScope.addSVar("joinpoint_params_to_string_0_0", new InteropSDefT(joinpoint_params_to_string_0_0.instance, context));
      varScope.addSVar("closures_to_java_0_0", new InteropSDefT(closures_to_java_0_0.instance, context));
      varScope.addSVar("closure_to_java_impl_0_0", new InteropSDefT(closure_to_java_impl_0_0.instance, context));
      varScope.addSVar("main_0_0", new InteropSDefT(main_0_0.instance, context));
      varScope.addSVar("handle_io_0_0", new InteropSDefT(handle_io_0_0.instance, context));
      varScope.addSVar("convert_0_0", new InteropSDefT(convert_0_0.instance, context));
      varScope.addSVar("closures_converter_compilation_unit_0_0", new InteropSDefT(closures_converter_compilation_unit_0_0.instance, context));
      varScope.addSVar("check_for_change_in_aspect_or_class_0_0", new InteropSDefT(check_for_change_in_aspect_or_class_0_0.instance, context));
      varScope.addSVar("closures_converter_aspect_or_class_0_1", new InteropSDefT(closures_converter_aspect_or_class_0_1.instance, context));
      varScope.addSVar("OrComp_2_0", new InteropSDefT($Or$Comp_2_0.instance, context));
      varScope.addSVar("AndComp_2_0", new InteropSDefT($And$Comp_2_0.instance, context));
      varScope.addSVar("NotComp_1_0", new InteropSDefT($Not$Comp_1_0.instance, context));
    }

    private void registerLazy(org.spoofax.interpreter.core.IContext context, Context compiledContext, ClassLoader classLoader, org.spoofax.interpreter.core.VarScope varScope)
    { 
      compiledContext.registerComponent("transform");
      transform.init(compiledContext);
      varScope.addSVar("aspectj_to_box_0_0_fragment_4", new InteropSDefT(classLoader, "transform$aspectj_to_box_0_0_fragment_4", context));
      varScope.addSVar("aspectj_to_box_0_0_fragment_3", new InteropSDefT(classLoader, "transform$aspectj_to_box_0_0_fragment_3", context));
      varScope.addSVar("aspectj_to_box_0_0_fragment_2", new InteropSDefT(classLoader, "transform$aspectj_to_box_0_0_fragment_2", context));
      varScope.addSVar("aspectj_to_box_0_0_fragment_1", new InteropSDefT(classLoader, "transform$aspectj_to_box_0_0_fragment_1", context));
      varScope.addSVar("aspectj_to_box_0_0_fragment_0", new InteropSDefT(classLoader, "transform$aspectj_to_box_0_0_fragment_0", context));
      varScope.addSVar("aspectj_to_box_0_0", new InteropSDefT(classLoader, "transform$aspectj_to_box_0_0", context));
      varScope.addSVar("has_leftmost_not_0_0", new InteropSDefT(classLoader, "transform$has_leftmost_not_0_0", context));
      varScope.addSVar("option_to_boxes_0_0", new InteropSDefT(classLoader, "transform$option_to_boxes_0_0", context));
      varScope.addSVar("pp_aspectj_string_0_0", new InteropSDefT(classLoader, "transform$pp_aspectj_string_0_0", context));
      varScope.addSVar("remove_closures_additions_0_0", new InteropSDefT(classLoader, "transform$remove_closures_additions_0_0", context));
      varScope.addSVar("closures_to_ajc_0_1", new InteropSDefT(classLoader, "transform$closures_to_ajc_0_1", context));
      varScope.addSVar("closures_to_ajc_0_2", new InteropSDefT(classLoader, "transform$closures_to_ajc_0_2", context));
      varScope.addSVar("joinpoint_params_to_string_0_0", new InteropSDefT(classLoader, "transform$joinpoint_params_to_string_0_0", context));
      varScope.addSVar("closures_to_java_0_0", new InteropSDefT(classLoader, "transform$closures_to_java_0_0", context));
      varScope.addSVar("closure_to_java_impl_0_0", new InteropSDefT(classLoader, "transform$closure_to_java_impl_0_0", context));
      varScope.addSVar("main_0_0", new InteropSDefT(classLoader, "transform$main_0_0", context));
      varScope.addSVar("handle_io_0_0", new InteropSDefT(classLoader, "transform$handle_io_0_0", context));
      varScope.addSVar("convert_0_0", new InteropSDefT(classLoader, "transform$convert_0_0", context));
      varScope.addSVar("closures_converter_compilation_unit_0_0", new InteropSDefT(classLoader, "transform$closures_converter_compilation_unit_0_0", context));
      varScope.addSVar("check_for_change_in_aspect_or_class_0_0", new InteropSDefT(classLoader, "transform$check_for_change_in_aspect_or_class_0_0", context));
      varScope.addSVar("closures_converter_aspect_or_class_0_1", new InteropSDefT(classLoader, "transform$closures_converter_aspect_or_class_0_1", context));
      varScope.addSVar("OrComp_2_0", new InteropSDefT(classLoader, "transform$$Or$Comp_2_0", context));
      varScope.addSVar("AndComp_2_0", new InteropSDefT(classLoader, "transform$$And$Comp_2_0", context));
      varScope.addSVar("NotComp_1_0", new InteropSDefT(classLoader, "transform$$Not$Comp_1_0", context));
    }
  }
}