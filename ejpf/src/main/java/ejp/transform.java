package ejp;

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

  protected static IStrategoTerm const112;

  protected static IStrategoTerm const111;

  protected static IStrategoTerm const110;

  protected static IStrategoTerm constCons45;

  protected static IStrategoTerm constTypeImportOnDemandDec0;

  protected static IStrategoTerm constPackageName0;

  protected static IStrategoTerm constCons44;

  protected static IStrategoTerm constId26;

  protected static IStrategoTerm constCons43;

  protected static IStrategoTerm constId25;

  protected static IStrategoTerm const109;

  protected static IStrategoTerm const108;

  protected static IStrategoTerm const107;

  protected static IStrategoTerm constFBOX47;

  protected static IStrategoTerm constS64;

  protected static IStrategoTerm const106;

  protected static IStrategoTerm constFBOX46;

  protected static IStrategoTerm constS63;

  protected static IStrategoTerm const105;

  protected static IStrategoTerm constFBOX45;

  protected static IStrategoTerm constS62;

  protected static IStrategoTerm const104;

  protected static IStrategoTerm constFBOX44;

  protected static IStrategoTerm constS61;

  protected static IStrategoTerm const103;

  protected static IStrategoTerm constFBOX43;

  protected static IStrategoTerm constS60;

  protected static IStrategoTerm const102;

  protected static IStrategoTerm constCons42;

  protected static IStrategoTerm constSOpt4;

  protected static IStrategoTerm constCons41;

  protected static IStrategoTerm constCons40;

  protected static IStrategoTerm constSOpt3;

  protected static IStrategoTerm const101;

  protected static IStrategoTerm constIS0;

  protected static IStrategoTerm constCons39;

  protected static IStrategoTerm constFBOX42;

  protected static IStrategoTerm constS59;

  protected static IStrategoTerm const100;

  protected static IStrategoTerm constFBOX41;

  protected static IStrategoTerm constS58;

  protected static IStrategoTerm const99;

  protected static IStrategoTerm constFBOX40;

  protected static IStrategoTerm constS57;

  protected static IStrategoTerm const98;

  protected static IStrategoTerm constFBOX39;

  protected static IStrategoTerm constS56;

  protected static IStrategoTerm const97;

  protected static IStrategoTerm constFBOX38;

  protected static IStrategoTerm constS55;

  protected static IStrategoTerm const96;

  protected static IStrategoTerm constFBOX37;

  protected static IStrategoTerm constS54;

  protected static IStrategoTerm const95;

  protected static IStrategoTerm constFBOX36;

  protected static IStrategoTerm constS53;

  protected static IStrategoTerm const94;

  protected static IStrategoTerm constFBOX35;

  protected static IStrategoTerm constS52;

  protected static IStrategoTerm constS51;

  protected static IStrategoTerm const93;

  protected static IStrategoTerm constS50;

  protected static IStrategoTerm const92;

  protected static IStrategoTerm constS49;

  protected static IStrategoTerm const91;

  protected static IStrategoTerm constS48;

  protected static IStrategoTerm const90;

  protected static IStrategoTerm constFBOX34;

  protected static IStrategoTerm constS47;

  protected static IStrategoTerm const89;

  protected static IStrategoTerm constFBOX33;

  protected static IStrategoTerm constS46;

  protected static IStrategoTerm const88;

  protected static IStrategoTerm constFBOX32;

  protected static IStrategoTerm constS45;

  protected static IStrategoTerm constFBOX31;

  protected static IStrategoTerm constS44;

  protected static IStrategoTerm const87;

  protected static IStrategoTerm constFBOX30;

  protected static IStrategoTerm constS43;

  protected static IStrategoTerm const86;

  protected static IStrategoTerm constFBOX29;

  protected static IStrategoTerm constS42;

  protected static IStrategoTerm const85;

  protected static IStrategoTerm constCons38;

  protected static IStrategoTerm constFBOX28;

  protected static IStrategoTerm constS41;

  protected static IStrategoTerm const84;

  protected static IStrategoTerm constFBOX27;

  protected static IStrategoTerm constS40;

  protected static IStrategoTerm const83;

  protected static IStrategoTerm constFBOX26;

  protected static IStrategoTerm constS39;

  protected static IStrategoTerm const82;

  protected static IStrategoTerm constFBOX25;

  protected static IStrategoTerm constS38;

  protected static IStrategoTerm const81;

  protected static IStrategoTerm constFBOX24;

  protected static IStrategoTerm constS37;

  protected static IStrategoTerm const80;

  protected static IStrategoTerm constFBOX23;

  protected static IStrategoTerm constCons37;

  protected static IStrategoTerm constFBOX22;

  protected static IStrategoTerm constFBOX21;

  protected static IStrategoTerm constCons36;

  protected static IStrategoTerm constSOpt2;

  protected static IStrategoTerm constVS0;

  protected static IStrategoTerm constS36;

  protected static IStrategoTerm const79;

  protected static IStrategoTerm constS35;

  protected static IStrategoTerm const78;

  protected static IStrategoTerm constS34;

  protected static IStrategoTerm const77;

  protected static IStrategoTerm constFBOX20;

  protected static IStrategoTerm constS33;

  protected static IStrategoTerm const76;

  protected static IStrategoTerm constS32;

  protected static IStrategoTerm const75;

  protected static IStrategoTerm constCons35;

  protected static IStrategoTerm constCons34;

  protected static IStrategoTerm constCons33;

  protected static IStrategoTerm constFBOX19;

  protected static IStrategoTerm constS31;

  protected static IStrategoTerm const74;

  protected static IStrategoTerm constS30;

  protected static IStrategoTerm constCons32;

  protected static IStrategoTerm constS29;

  protected static IStrategoTerm const73;

  protected static IStrategoTerm constFBOX18;

  protected static IStrategoTerm constS28;

  protected static IStrategoTerm const72;

  protected static IStrategoTerm constFBOX17;

  protected static IStrategoTerm constCons31;

  protected static IStrategoTerm constS27;

  protected static IStrategoTerm const71;

  protected static IStrategoTerm constFBOX16;

  protected static IStrategoTerm constS26;

  protected static IStrategoTerm const70;

  protected static IStrategoTerm constCons30;

  protected static IStrategoTerm constS25;

  protected static IStrategoTerm const69;

  protected static IStrategoTerm constFBOX15;

  protected static IStrategoTerm constS24;

  protected static IStrategoTerm constCons29;

  protected static IStrategoTerm constSOpt1;

  protected static IStrategoTerm const68;

  protected static IStrategoTerm constS23;

  protected static IStrategoTerm const67;

  protected static IStrategoTerm constS22;

  protected static IStrategoTerm const66;

  protected static IStrategoTerm constS21;

  protected static IStrategoTerm const65;

  protected static IStrategoTerm constS20;

  protected static IStrategoTerm const64;

  protected static IStrategoTerm constS19;

  protected static IStrategoTerm const63;

  protected static IStrategoTerm constS18;

  protected static IStrategoTerm const62;

  protected static IStrategoTerm constS17;

  protected static IStrategoTerm const61;

  protected static IStrategoTerm constFBOX14;

  protected static IStrategoTerm constS16;

  protected static IStrategoTerm constFBOX13;

  protected static IStrategoTerm constS15;

  protected static IStrategoTerm const60;

  protected static IStrategoTerm constFBOX12;

  protected static IStrategoTerm constS14;

  protected static IStrategoTerm const59;

  protected static IStrategoTerm constFBOX11;

  protected static IStrategoTerm constS13;

  protected static IStrategoTerm const58;

  protected static IStrategoTerm constFBOX10;

  protected static IStrategoTerm constS12;

  protected static IStrategoTerm const57;

  protected static IStrategoTerm constFBOX9;

  protected static IStrategoTerm constS11;

  protected static IStrategoTerm const56;

  protected static IStrategoTerm constFBOX8;

  protected static IStrategoTerm constS10;

  protected static IStrategoTerm const55;

  protected static IStrategoTerm constFBOX7;

  protected static IStrategoTerm constS9;

  protected static IStrategoTerm const54;

  protected static IStrategoTerm constH0;

  protected static IStrategoTerm constCons28;

  protected static IStrategoTerm constFBOX6;

  protected static IStrategoTerm constS8;

  protected static IStrategoTerm const53;

  protected static IStrategoTerm constCons27;

  protected static IStrategoTerm constFBOX5;

  protected static IStrategoTerm constS7;

  protected static IStrategoTerm const52;

  protected static IStrategoTerm constFBOX4;

  protected static IStrategoTerm constS6;

  protected static IStrategoTerm const51;

  protected static IStrategoTerm constFBOX3;

  protected static IStrategoTerm constS5;

  protected static IStrategoTerm const50;

  protected static IStrategoTerm constFBOX2;

  protected static IStrategoTerm constS4;

  protected static IStrategoTerm const49;

  protected static IStrategoTerm constFBOX1;

  protected static IStrategoTerm constS3;

  protected static IStrategoTerm const48;

  protected static IStrategoTerm constFBOX0;

  protected static IStrategoTerm constS2;

  protected static IStrategoTerm const47;

  protected static IStrategoTerm constKW0;

  protected static IStrategoTerm constS1;

  protected static IStrategoTerm const46;

  protected static IStrategoTerm constCons26;

  protected static IStrategoTerm constS0;

  protected static IStrategoTerm const45;

  protected static IStrategoTerm constCons25;

  protected static IStrategoTerm constSOpt0;

  protected static IStrategoTerm constHS0;

  protected static IStrategoTerm constSome2;

  protected static IStrategoTerm constLit8;

  protected static IStrategoTerm constNull0;

  protected static IStrategoTerm constSome1;

  protected static IStrategoTerm constLit7;

  protected static IStrategoTerm constFalse0;

  protected static IStrategoTerm constSome0;

  protected static IStrategoTerm constLit6;

  protected static IStrategoTerm constDeci0;

  protected static IStrategoTerm const44;

  protected static IStrategoTerm constId24;

  protected static IStrategoTerm const43;

  protected static IStrategoTerm constNoPointcutBody0;

  protected static IStrategoTerm constCons24;

  protected static IStrategoTerm constCons23;

  protected static IStrategoTerm constPublic0;

  protected static IStrategoTerm constCons22;

  protected static IStrategoTerm const42;

  protected static IStrategoTerm constCons21;

  protected static IStrategoTerm constElemValPair3;

  protected static IStrategoTerm constLit5;

  protected static IStrategoTerm constString5;

  protected static IStrategoTerm constCons20;

  protected static IStrategoTerm constChars5;

  protected static IStrategoTerm const41;

  protected static IStrategoTerm const40;

  protected static IStrategoTerm constCons19;

  protected static IStrategoTerm constParam1;

  protected static IStrategoTerm constId23;

  protected static IStrategoTerm const39;

  protected static IStrategoTerm constClassOrInterfaceType1;

  protected static IStrategoTerm constCons18;

  protected static IStrategoTerm constElemValPair2;

  protected static IStrategoTerm constLit4;

  protected static IStrategoTerm constString4;

  protected static IStrategoTerm constCons17;

  protected static IStrategoTerm constChars4;

  protected static IStrategoTerm const38;

  protected static IStrategoTerm const37;

  protected static IStrategoTerm constCons16;

  protected static IStrategoTerm constElemValPair1;

  protected static IStrategoTerm constLit3;

  protected static IStrategoTerm constString3;

  protected static IStrategoTerm constCons15;

  protected static IStrategoTerm constChars3;

  protected static IStrategoTerm const36;

  protected static IStrategoTerm constCons14;

  protected static IStrategoTerm constParam0;

  protected static IStrategoTerm constId22;

  protected static IStrategoTerm const35;

  protected static IStrategoTerm constClassOrInterfaceType0;

  protected static IStrategoTerm constTypeName10;

  protected static IStrategoTerm constId21;

  protected static IStrategoTerm const34;

  protected static IStrategoTerm constId20;

  protected static IStrategoTerm const33;

  protected static IStrategoTerm constCons13;

  protected static IStrategoTerm constElemValPair0;

  protected static IStrategoTerm constLit2;

  protected static IStrategoTerm constString2;

  protected static IStrategoTerm constCons12;

  protected static IStrategoTerm constChars2;

  protected static IStrategoTerm const32;

  protected static IStrategoTerm constId19;

  protected static IStrategoTerm const31;

  protected static IStrategoTerm constTypeName9;

  protected static IStrategoTerm constId18;

  protected static IStrategoTerm const30;

  protected static IStrategoTerm constTypeName8;

  protected static IStrategoTerm constId17;

  protected static IStrategoTerm const29;

  protected static IStrategoTerm constPackageOrTypeName3;

  protected static IStrategoTerm constId16;

  protected static IStrategoTerm const28;

  protected static IStrategoTerm constPackageOrTypeName2;

  protected static IStrategoTerm constId15;

  protected static IStrategoTerm const27;

  protected static IStrategoTerm constPackageOrTypeName1;

  protected static IStrategoTerm constId14;

  protected static IStrategoTerm const26;

  protected static IStrategoTerm constPackageOrTypeName0;

  protected static IStrategoTerm constId13;

  protected static IStrategoTerm const25;

  protected static IStrategoTerm constCons11;

  protected static IStrategoTerm constPrivate0;

  protected static IStrategoTerm const24;

  protected static IStrategoTerm constAnnoPattern3;

  protected static IStrategoTerm constCons10;

  protected static IStrategoTerm constNot1;

  protected static IStrategoTerm constAnnoPattern2;

  protected static IStrategoTerm constCons9;

  protected static IStrategoTerm constSimpleAnnoPatternExact1;

  protected static IStrategoTerm constAnnoPattern1;

  protected static IStrategoTerm constCons8;

  protected static IStrategoTerm constNot0;

  protected static IStrategoTerm constAnnoPattern0;

  protected static IStrategoTerm constCons7;

  protected static IStrategoTerm constStatic0;

  protected static IStrategoTerm constCons6;

  protected static IStrategoTerm constSimpleAnnoPatternExact0;

  protected static IStrategoTerm constTypeName7;

  protected static IStrategoTerm constId12;

  protected static IStrategoTerm const23;

  protected static IStrategoTerm constLit1;

  protected static IStrategoTerm constString1;

  protected static IStrategoTerm constCons5;

  protected static IStrategoTerm constChars1;

  protected static IStrategoTerm const22;

  protected static IStrategoTerm constLit0;

  protected static IStrategoTerm constString0;

  protected static IStrategoTerm constCons4;

  protected static IStrategoTerm constChars0;

  protected static IStrategoTerm const21;

  protected static IStrategoTerm constCons3;

  protected static IStrategoTerm const20;

  protected static IStrategoTerm const19;

  protected static IStrategoTerm const18;

  protected static IStrategoTerm constTypeName6;

  protected static IStrategoTerm constId11;

  protected static IStrategoTerm const17;

  protected static IStrategoTerm constCons2;

  protected static IStrategoTerm constFormalWildcard0;

  protected static IStrategoTerm constMemberName0;

  protected static IStrategoTerm constModPattern0;

  protected static IStrategoTerm constTypeName5;

  protected static IStrategoTerm constId10;

  protected static IStrategoTerm const16;

  protected static IStrategoTerm constRefTypePattern0;

  protected static IStrategoTerm constNamePattern0;

  protected static IStrategoTerm const15;

  protected static IStrategoTerm constTypeName4;

  protected static IStrategoTerm constId9;

  protected static IStrategoTerm const14;

  protected static IStrategoTerm const13;

  protected static IStrategoTerm constBlock0;

  protected static IStrategoTerm constId8;

  protected static IStrategoTerm constId7;

  protected static IStrategoTerm const12;

  protected static IStrategoTerm constTypeName3;

  protected static IStrategoTerm constId6;

  protected static IStrategoTerm const11;

  protected static IStrategoTerm const10;

  protected static IStrategoTerm const9;

  protected static IStrategoTerm constCons1;

  protected static IStrategoTerm constFinal0;

  protected static IStrategoTerm constCons0;

  protected static IStrategoTerm const8;

  protected static IStrategoTerm const7;

  protected static IStrategoTerm constId5;

  protected static IStrategoTerm const6;

  protected static IStrategoTerm constId4;

  protected static IStrategoTerm const5;

  protected static IStrategoTerm constId3;

  protected static IStrategoTerm const4;

  protected static IStrategoTerm constTypeName2;

  protected static IStrategoTerm constId2;

  protected static IStrategoTerm const3;

  protected static IStrategoTerm constVoid0;

  protected static IStrategoTerm constTypeName1;

  protected static IStrategoTerm constId1;

  protected static IStrategoTerm const2;

  protected static IStrategoTerm const1;

  protected static IStrategoTerm constNone0;

  protected static IStrategoTerm constTypeName0;

  protected static IStrategoTerm constId0;

  protected static IStrategoTerm const0;

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

  protected static IStrategoConstructor _consSome_1;

  protected static IStrategoConstructor _consAnno_2;

  protected static IStrategoConstructor _consNone_0;

  public static IStrategoConstructor _consEJPCall_2;

  public static IStrategoConstructor _consScopedEJPCall_3;

  public static IStrategoConstructor _consDecError_2;

  public static IStrategoConstructor _consDecSoft_2;

  public static IStrategoConstructor _consDecNoMatch_4;

  public static IStrategoConstructor _consRegularTypePattern_1;

  public static IStrategoConstructor _consSimpleAnnoPatternValue_2;

  public static IStrategoConstructor _consExplicitJoinPoint_3;

  public static IStrategoConstructor _consPointcutargs_1;

  public static IStrategoConstructor _consPointcutarg_3;

  public static IStrategoConstructor _consExplicitJoinPointDeclaration_5;

  public static IStrategoConstructor _consScopedExplicitJoinPointPHeader_2;

  public static IStrategoConstructor _consNonScopedExplicitJoinPointPHeader_2;

  public static IStrategoConstructor _consExplicitJoinPointDeclarator_3;

  public static IStrategoConstructor _consPointcutargsDec_1;

  public static IStrategoConstructor _consPointcutargDec_2;

  public static IStrategoConstructor _consHandles_1;

  public static IStrategoConstructor _consExplicitJoinPointInitializer_1;

  public static IStrategoConstructor _consExplicitJoinPointPattern_1;

  public static IStrategoConstructor _consNotExplicitJoinPointPattern_1;

  public static IStrategoConstructor _consExplicitJoinPointScopePattern_1;

  public static IStrategoConstructor _consNotExplicitJoinPointScopePattern_1;

  public static IStrategoConstructor _consThisClass_0;

  public static IStrategoConstructor _consThisMethod_0;

  public static IStrategoConstructor _consThisBlock_0;

  public static IStrategoConstructor _consByPackageGranularity_0;

  public static IStrategoConstructor _consByClassGranularity_0;

  public static IStrategoConstructor _consByMethodGranularity_0;

  public static IStrategoConstructor _consByEjpGranularity_0;

  public static IStrategoConstructor _consPackageName_1;

  public static IStrategoConstructor _consPackageDec_2;

  public static IStrategoConstructor _consTypeImportOnDemandDec_1;

  public static IStrategoConstructor _consCompilationUnit_3;

  public static IStrategoConstructor _consDeci_1;

  public static IStrategoConstructor _consFalse_0;

  public static IStrategoConstructor _consChar_1;

  public static IStrategoConstructor _consString_1;

  public static IStrategoConstructor _consChars_1;

  public static IStrategoConstructor _consNull_0;

  public static IStrategoConstructor _consAmbName_1;

  public static IStrategoConstructor _consAmbName_2;

  public static IStrategoConstructor _consExprName_1;

  public static IStrategoConstructor _consExprName_2;

  public static IStrategoConstructor _consMethodName_2;

  public static IStrategoConstructor _consClassOrInterfaceType_2;

  public static IStrategoConstructor _consClassType_2;

  public static IStrategoConstructor _consLit_1;

  public static IStrategoConstructor _consNewInstance_4;

  public static IStrategoConstructor _consInvoke_2;

  public static IStrategoConstructor _consAssign_2;

  public static IStrategoConstructor _consFieldDec_3;

  public static IStrategoConstructor _consVarDec_1;

  public static IStrategoConstructor _consVarDec_2;

  public static IStrategoConstructor _consLocalVarDecStm_1;

  public static IStrategoConstructor _consLocalVarDec_3;

  public static IStrategoConstructor _consExprStm_1;

  public static IStrategoConstructor _consReturn_1;

  public static IStrategoConstructor _consBlock_1;

  public static IStrategoConstructor _consClassDecStm_1;

  public static IStrategoConstructor _consMethodDec_2;

  public static IStrategoConstructor _consMethodDecHead_6;

  public static IStrategoConstructor _consParam_3;

  public static IStrategoConstructor _consVarArityParam_3;

  public static IStrategoConstructor _consNoMethodBody_0;

  public static IStrategoConstructor _consInstanceInit_1;

  public static IStrategoConstructor _consStaticInit_1;

  public static IStrategoConstructor _consClassDec_2;

  public static IStrategoConstructor _consClassBody_1;

  public static IStrategoConstructor _consClassDecHead_5;

  public static IStrategoConstructor _consMethod_1;

  public static IStrategoConstructor _consSingleElemAnno_2;

  public static IStrategoConstructor _consElemValPair_2;

  public static IStrategoConstructor _consElemValArrayInit_1;

  public static IStrategoConstructor _consId_1;

  public static IStrategoConstructor _consPublic_0;

  public static IStrategoConstructor _consPrivate_0;

  public static IStrategoConstructor _consFinal_0;

  public static IStrategoConstructor _consStatic_0;

  public static IStrategoConstructor _consBoolean_0;

  public static IStrategoConstructor _consByte_0;

  public static IStrategoConstructor _consShort_0;

  public static IStrategoConstructor _consInt_0;

  public static IStrategoConstructor _consLong_0;

  public static IStrategoConstructor _consFloat_0;

  public static IStrategoConstructor _consDouble_0;

  public static IStrategoConstructor _consTypeName_1;

  public static IStrategoConstructor _consTypeName_2;

  public static IStrategoConstructor _consPackageOrTypeName_1;

  public static IStrategoConstructor _consPackageOrTypeName_2;

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
    _consSome_1 = termFactory.makeConstructor("Some", 1);
    _consAnno_2 = termFactory.makeConstructor("Anno", 2);
    _consNone_0 = termFactory.makeConstructor("None", 0);
    _consEJPCall_2 = termFactory.makeConstructor("EJPCall", 2);
    _consScopedEJPCall_3 = termFactory.makeConstructor("ScopedEJPCall", 3);
    _consDecError_2 = termFactory.makeConstructor("DecError", 2);
    _consDecSoft_2 = termFactory.makeConstructor("DecSoft", 2);
    _consDecNoMatch_4 = termFactory.makeConstructor("DecNoMatch", 4);
    _consRegularTypePattern_1 = termFactory.makeConstructor("RegularTypePattern", 1);
    _consSimpleAnnoPatternValue_2 = termFactory.makeConstructor("SimpleAnnoPatternValue", 2);
    _consExplicitJoinPoint_3 = termFactory.makeConstructor("ExplicitJoinPoint", 3);
    _consPointcutargs_1 = termFactory.makeConstructor("Pointcutargs", 1);
    _consPointcutarg_3 = termFactory.makeConstructor("Pointcutarg", 3);
    _consExplicitJoinPointDeclaration_5 = termFactory.makeConstructor("ExplicitJoinPointDeclaration", 5);
    _consScopedExplicitJoinPointPHeader_2 = termFactory.makeConstructor("ScopedExplicitJoinPointPHeader", 2);
    _consNonScopedExplicitJoinPointPHeader_2 = termFactory.makeConstructor("NonScopedExplicitJoinPointPHeader", 2);
    _consExplicitJoinPointDeclarator_3 = termFactory.makeConstructor("ExplicitJoinPointDeclarator", 3);
    _consPointcutargsDec_1 = termFactory.makeConstructor("PointcutargsDec", 1);
    _consPointcutargDec_2 = termFactory.makeConstructor("PointcutargDec", 2);
    _consHandles_1 = termFactory.makeConstructor("Handles", 1);
    _consExplicitJoinPointInitializer_1 = termFactory.makeConstructor("ExplicitJoinPointInitializer", 1);
    _consExplicitJoinPointPattern_1 = termFactory.makeConstructor("ExplicitJoinPointPattern", 1);
    _consNotExplicitJoinPointPattern_1 = termFactory.makeConstructor("NotExplicitJoinPointPattern", 1);
    _consExplicitJoinPointScopePattern_1 = termFactory.makeConstructor("ExplicitJoinPointScopePattern", 1);
    _consNotExplicitJoinPointScopePattern_1 = termFactory.makeConstructor("NotExplicitJoinPointScopePattern", 1);
    _consThisClass_0 = termFactory.makeConstructor("ThisClass", 0);
    _consThisMethod_0 = termFactory.makeConstructor("ThisMethod", 0);
    _consThisBlock_0 = termFactory.makeConstructor("ThisBlock", 0);
    _consByPackageGranularity_0 = termFactory.makeConstructor("ByPackageGranularity", 0);
    _consByClassGranularity_0 = termFactory.makeConstructor("ByClassGranularity", 0);
    _consByMethodGranularity_0 = termFactory.makeConstructor("ByMethodGranularity", 0);
    _consByEjpGranularity_0 = termFactory.makeConstructor("ByEjpGranularity", 0);
    _consPackageName_1 = termFactory.makeConstructor("PackageName", 1);
    _consPackageDec_2 = termFactory.makeConstructor("PackageDec", 2);
    _consTypeImportOnDemandDec_1 = termFactory.makeConstructor("TypeImportOnDemandDec", 1);
    _consCompilationUnit_3 = termFactory.makeConstructor("CompilationUnit", 3);
    _consDeci_1 = termFactory.makeConstructor("Deci", 1);
    _consFalse_0 = termFactory.makeConstructor("False", 0);
    _consChar_1 = termFactory.makeConstructor("Char", 1);
    _consString_1 = termFactory.makeConstructor("String", 1);
    _consChars_1 = termFactory.makeConstructor("Chars", 1);
    _consNull_0 = termFactory.makeConstructor("Null", 0);
    _consAmbName_1 = termFactory.makeConstructor("AmbName", 1);
    _consAmbName_2 = termFactory.makeConstructor("AmbName", 2);
    _consExprName_1 = termFactory.makeConstructor("ExprName", 1);
    _consExprName_2 = termFactory.makeConstructor("ExprName", 2);
    _consMethodName_2 = termFactory.makeConstructor("MethodName", 2);
    _consClassOrInterfaceType_2 = termFactory.makeConstructor("ClassOrInterfaceType", 2);
    _consClassType_2 = termFactory.makeConstructor("ClassType", 2);
    _consLit_1 = termFactory.makeConstructor("Lit", 1);
    _consNewInstance_4 = termFactory.makeConstructor("NewInstance", 4);
    _consInvoke_2 = termFactory.makeConstructor("Invoke", 2);
    _consAssign_2 = termFactory.makeConstructor("Assign", 2);
    _consFieldDec_3 = termFactory.makeConstructor("FieldDec", 3);
    _consVarDec_1 = termFactory.makeConstructor("VarDec", 1);
    _consVarDec_2 = termFactory.makeConstructor("VarDec", 2);
    _consLocalVarDecStm_1 = termFactory.makeConstructor("LocalVarDecStm", 1);
    _consLocalVarDec_3 = termFactory.makeConstructor("LocalVarDec", 3);
    _consExprStm_1 = termFactory.makeConstructor("ExprStm", 1);
    _consReturn_1 = termFactory.makeConstructor("Return", 1);
    _consBlock_1 = termFactory.makeConstructor("Block", 1);
    _consClassDecStm_1 = termFactory.makeConstructor("ClassDecStm", 1);
    _consMethodDec_2 = termFactory.makeConstructor("MethodDec", 2);
    _consMethodDecHead_6 = termFactory.makeConstructor("MethodDecHead", 6);
    _consParam_3 = termFactory.makeConstructor("Param", 3);
    _consVarArityParam_3 = termFactory.makeConstructor("VarArityParam", 3);
    _consNoMethodBody_0 = termFactory.makeConstructor("NoMethodBody", 0);
    _consInstanceInit_1 = termFactory.makeConstructor("InstanceInit", 1);
    _consStaticInit_1 = termFactory.makeConstructor("StaticInit", 1);
    _consClassDec_2 = termFactory.makeConstructor("ClassDec", 2);
    _consClassBody_1 = termFactory.makeConstructor("ClassBody", 1);
    _consClassDecHead_5 = termFactory.makeConstructor("ClassDecHead", 5);
    _consMethod_1 = termFactory.makeConstructor("Method", 1);
    _consSingleElemAnno_2 = termFactory.makeConstructor("SingleElemAnno", 2);
    _consElemValPair_2 = termFactory.makeConstructor("ElemValPair", 2);
    _consElemValArrayInit_1 = termFactory.makeConstructor("ElemValArrayInit", 1);
    _consId_1 = termFactory.makeConstructor("Id", 1);
    _consPublic_0 = termFactory.makeConstructor("Public", 0);
    _consPrivate_0 = termFactory.makeConstructor("Private", 0);
    _consFinal_0 = termFactory.makeConstructor("Final", 0);
    _consStatic_0 = termFactory.makeConstructor("Static", 0);
    _consBoolean_0 = termFactory.makeConstructor("Boolean", 0);
    _consByte_0 = termFactory.makeConstructor("Byte", 0);
    _consShort_0 = termFactory.makeConstructor("Short", 0);
    _consInt_0 = termFactory.makeConstructor("Int", 0);
    _consLong_0 = termFactory.makeConstructor("Long", 0);
    _consFloat_0 = termFactory.makeConstructor("Float", 0);
    _consDouble_0 = termFactory.makeConstructor("Double", 0);
    _consTypeName_1 = termFactory.makeConstructor("TypeName", 1);
    _consTypeName_2 = termFactory.makeConstructor("TypeName", 2);
    _consPackageOrTypeName_1 = termFactory.makeConstructor("PackageOrTypeName", 1);
    _consPackageOrTypeName_2 = termFactory.makeConstructor("PackageOrTypeName", 2);
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
    _consProceed_0 = termFactory.makeConstructor("Proceed", 0);
  }

  public static void initConstants(ITermFactory termFactory)
  { 
    constNil0 = (IStrategoTerm)termFactory.makeList(Term.NO_TERMS);
    const0 = termFactory.makeString("ClassAnno");
    constId0 = termFactory.makeAppl(transform._consId_1, new IStrategoTerm[]{transform.const0});
    constTypeName0 = termFactory.makeAppl(transform._consTypeName_1, new IStrategoTerm[]{transform.constId0});
    constNone0 = termFactory.makeAppl(transform._consNone_0, NO_TERMS);
    const1 = termFactory.makeString("ejpScopedInner");
    const2 = termFactory.makeString("MethodAnno");
    constId1 = termFactory.makeAppl(transform._consId_1, new IStrategoTerm[]{transform.const2});
    constTypeName1 = termFactory.makeAppl(transform._consTypeName_1, new IStrategoTerm[]{transform.constId1});
    constVoid0 = termFactory.makeAppl(transform._consVoid_0, NO_TERMS);
    const3 = termFactory.makeString("ExplicitScopedJoinPoint");
    constId2 = termFactory.makeAppl(transform._consId_1, new IStrategoTerm[]{transform.const3});
    constTypeName2 = termFactory.makeAppl(transform._consTypeName_1, new IStrategoTerm[]{transform.constId2});
    const4 = termFactory.makeString("joinpoint");
    constId3 = termFactory.makeAppl(transform._consId_1, new IStrategoTerm[]{transform.const4});
    const5 = termFactory.makeString("aspect");
    constId4 = termFactory.makeAppl(transform._consId_1, new IStrategoTerm[]{transform.const5});
    const6 = termFactory.makeString("args");
    constId5 = termFactory.makeAppl(transform._consId_1, new IStrategoTerm[]{transform.const6});
    const7 = termFactory.makeString("Internal error: with clause failed unexpectedly in rule 'ejp-call-to-method-invokation'");
    const8 = termFactory.makeString("_instance");
    constCons0 = (IStrategoTerm)termFactory.makeListCons(transform.const8, (IStrategoList)transform.constNil0);
    constFinal0 = termFactory.makeAppl(transform._consFinal_0, NO_TERMS);
    constCons1 = (IStrategoTerm)termFactory.makeListCons(transform.constFinal0, (IStrategoList)transform.constNil0);
    const9 = termFactory.makeString("Internal error: with clause failed unexpectedly in rule 'scoped-ejp-to-java'");
    const10 = termFactory.makeString("pointcut");
    const11 = termFactory.makeString("Pointcutargs");
    constId6 = termFactory.makeAppl(transform._consId_1, new IStrategoTerm[]{transform.const11});
    constTypeName3 = termFactory.makeAppl(transform._consTypeName_1, new IStrategoTerm[]{transform.constId6});
    const12 = termFactory.makeString("expr");
    constId7 = termFactory.makeAppl(transform._consId_1, new IStrategoTerm[]{transform.const12});
    constId8 = termFactory.makeAppl(transform._consId_1, new IStrategoTerm[]{transform.const10});
    constBlock0 = termFactory.makeAppl(transform._consBlock_1, new IStrategoTerm[]{transform.constNil0});
    const13 = termFactory.makeString("Internal error: with clause failed unexpectedly in rule 'remove-vars-decs-from-local-var-dec-stm'");
    const14 = termFactory.makeString("ejp.runtime.ClassAnno");
    constId9 = termFactory.makeAppl(transform._consId_1, new IStrategoTerm[]{transform.const14});
    constTypeName4 = termFactory.makeAppl(transform._consTypeName_1, new IStrategoTerm[]{transform.constId9});
    const15 = termFactory.makeString("*");
    constNamePattern0 = termFactory.makeAppl(transform._consNamePattern_1, new IStrategoTerm[]{transform.const15});
    constRefTypePattern0 = termFactory.makeAppl(transform._consRefTypePattern_1, new IStrategoTerm[]{transform.constNamePattern0});
    const16 = termFactory.makeString("ejp.runtime.MethodAnno");
    constId10 = termFactory.makeAppl(transform._consId_1, new IStrategoTerm[]{transform.const16});
    constTypeName5 = termFactory.makeAppl(transform._consTypeName_1, new IStrategoTerm[]{transform.constId10});
    constModPattern0 = termFactory.makeAppl(transform._consModPattern_1, new IStrategoTerm[]{transform.constNil0});
    constMemberName0 = termFactory.makeAppl(transform._consMemberName_1, new IStrategoTerm[]{transform.const15});
    constFormalWildcard0 = termFactory.makeAppl(transform._consFormalWildcard_0, NO_TERMS);
    constCons2 = (IStrategoTerm)termFactory.makeListCons(transform.constFormalWildcard0, (IStrategoList)transform.constNil0);
    const17 = termFactory.makeString("ejp.runtime.EjpBlockAnno");
    constId11 = termFactory.makeAppl(transform._consId_1, new IStrategoTerm[]{transform.const17});
    constTypeName6 = termFactory.makeAppl(transform._consTypeName_1, new IStrategoTerm[]{transform.constId11});
    const18 = termFactory.makeString("nomatch$");
    const19 = termFactory.makeString("$");
    const20 = termFactory.makeString("ejp$");
    constCons3 = (IStrategoTerm)termFactory.makeListCons(transform.const19, (IStrategoList)transform.constNil0);
    const21 = termFactory.makeString("String");
    constChars0 = termFactory.makeAppl(transform._consChars_1, new IStrategoTerm[]{transform.const21});
    constCons4 = (IStrategoTerm)termFactory.makeListCons(transform.constChars0, (IStrategoList)transform.constNil0);
    constString0 = termFactory.makeAppl(transform._consString_1, new IStrategoTerm[]{transform.constCons4});
    constLit0 = termFactory.makeAppl(transform._consLit_1, new IStrategoTerm[]{transform.constString0});
    const22 = termFactory.makeString("char");
    constChars1 = termFactory.makeAppl(transform._consChars_1, new IStrategoTerm[]{transform.const22});
    constCons5 = (IStrategoTerm)termFactory.makeListCons(transform.constChars1, (IStrategoList)transform.constNil0);
    constString1 = termFactory.makeAppl(transform._consString_1, new IStrategoTerm[]{transform.constCons5});
    constLit1 = termFactory.makeAppl(transform._consLit_1, new IStrategoTerm[]{transform.constString1});
    const23 = termFactory.makeString("ExplicitJoinPoint");
    constId12 = termFactory.makeAppl(transform._consId_1, new IStrategoTerm[]{transform.const23});
    constTypeName7 = termFactory.makeAppl(transform._consTypeName_1, new IStrategoTerm[]{transform.constId12});
    constSimpleAnnoPatternExact0 = termFactory.makeAppl(transform._consSimpleAnnoPatternExact_1, new IStrategoTerm[]{transform.constTypeName7});
    constCons6 = (IStrategoTerm)termFactory.makeListCons(transform.constSimpleAnnoPatternExact0, (IStrategoList)transform.constNil0);
    constStatic0 = termFactory.makeAppl(transform._consStatic_0, NO_TERMS);
    constCons7 = (IStrategoTerm)termFactory.makeListCons(transform.constStatic0, (IStrategoList)transform.constCons1);
    constAnnoPattern0 = termFactory.makeAppl(transform._consAnnoPattern_1, new IStrategoTerm[]{transform.constCons6});
    constNot0 = termFactory.makeAppl(transform._consNot_1, new IStrategoTerm[]{transform.constSimpleAnnoPatternExact0});
    constCons8 = (IStrategoTerm)termFactory.makeListCons(transform.constNot0, (IStrategoList)transform.constNil0);
    constAnnoPattern1 = termFactory.makeAppl(transform._consAnnoPattern_1, new IStrategoTerm[]{transform.constCons8});
    constSimpleAnnoPatternExact1 = termFactory.makeAppl(transform._consSimpleAnnoPatternExact_1, new IStrategoTerm[]{transform.constTypeName2});
    constCons9 = (IStrategoTerm)termFactory.makeListCons(transform.constSimpleAnnoPatternExact1, (IStrategoList)transform.constNil0);
    constAnnoPattern2 = termFactory.makeAppl(transform._consAnnoPattern_1, new IStrategoTerm[]{transform.constCons9});
    constNot1 = termFactory.makeAppl(transform._consNot_1, new IStrategoTerm[]{transform.constSimpleAnnoPatternExact1});
    constCons10 = (IStrategoTerm)termFactory.makeListCons(transform.constNot1, (IStrategoList)transform.constNil0);
    constAnnoPattern3 = termFactory.makeAppl(transform._consAnnoPattern_1, new IStrategoTerm[]{transform.constCons10});
    const24 = termFactory.makeString("this(obj) && ");
    constPrivate0 = termFactory.makeAppl(transform._consPrivate_0, NO_TERMS);
    constCons11 = (IStrategoTerm)termFactory.makeListCons(transform.constPrivate0, (IStrategoList)transform.constNil0);
    const25 = termFactory.makeString("org");
    constId13 = termFactory.makeAppl(transform._consId_1, new IStrategoTerm[]{transform.const25});
    constPackageOrTypeName0 = termFactory.makeAppl(transform._consPackageOrTypeName_1, new IStrategoTerm[]{transform.constId13});
    const26 = termFactory.makeString("aspectj");
    constId14 = termFactory.makeAppl(transform._consId_1, new IStrategoTerm[]{transform.const26});
    constPackageOrTypeName1 = termFactory.makeAppl(transform._consPackageOrTypeName_2, new IStrategoTerm[]{transform.constPackageOrTypeName0, transform.constId14});
    const27 = termFactory.makeString("lang");
    constId15 = termFactory.makeAppl(transform._consId_1, new IStrategoTerm[]{transform.const27});
    constPackageOrTypeName2 = termFactory.makeAppl(transform._consPackageOrTypeName_2, new IStrategoTerm[]{transform.constPackageOrTypeName1, transform.constId15});
    const28 = termFactory.makeString("annotation");
    constId16 = termFactory.makeAppl(transform._consId_1, new IStrategoTerm[]{transform.const28});
    constPackageOrTypeName3 = termFactory.makeAppl(transform._consPackageOrTypeName_2, new IStrategoTerm[]{transform.constPackageOrTypeName2, transform.constId16});
    const29 = termFactory.makeString("Pointcut");
    constId17 = termFactory.makeAppl(transform._consId_1, new IStrategoTerm[]{transform.const29});
    constTypeName8 = termFactory.makeAppl(transform._consTypeName_2, new IStrategoTerm[]{transform.constPackageOrTypeName3, transform.constId17});
    const30 = termFactory.makeString("NoMatch");
    constId18 = termFactory.makeAppl(transform._consId_1, new IStrategoTerm[]{transform.const30});
    constTypeName9 = termFactory.makeAppl(transform._consTypeName_1, new IStrategoTerm[]{transform.constId18});
    const31 = termFactory.makeString("granularity");
    constId19 = termFactory.makeAppl(transform._consId_1, new IStrategoTerm[]{transform.const31});
    const32 = termFactory.makeString("package");
    constChars2 = termFactory.makeAppl(transform._consChars_1, new IStrategoTerm[]{transform.const32});
    constCons12 = (IStrategoTerm)termFactory.makeListCons(transform.constChars2, (IStrategoList)transform.constNil0);
    constString2 = termFactory.makeAppl(transform._consString_1, new IStrategoTerm[]{transform.constCons12});
    constLit2 = termFactory.makeAppl(transform._consLit_1, new IStrategoTerm[]{transform.constString2});
    constElemValPair0 = termFactory.makeAppl(transform._consElemValPair_2, new IStrategoTerm[]{transform.constId19, transform.constLit2});
    constCons13 = (IStrategoTerm)termFactory.makeListCons(transform.constElemValPair0, (IStrategoList)transform.constNil0);
    const33 = termFactory.makeString("error");
    constId20 = termFactory.makeAppl(transform._consId_1, new IStrategoTerm[]{transform.const33});
    const34 = termFactory.makeString("Object");
    constId21 = termFactory.makeAppl(transform._consId_1, new IStrategoTerm[]{transform.const34});
    constTypeName10 = termFactory.makeAppl(transform._consTypeName_1, new IStrategoTerm[]{transform.constId21});
    constClassOrInterfaceType0 = termFactory.makeAppl(transform._consClassOrInterfaceType_2, new IStrategoTerm[]{transform.constTypeName10, transform.constNone0});
    const35 = termFactory.makeString("obj");
    constId22 = termFactory.makeAppl(transform._consId_1, new IStrategoTerm[]{transform.const35});
    constParam0 = termFactory.makeAppl(transform._consParam_3, new IStrategoTerm[]{transform.constNil0, transform.constClassOrInterfaceType0, transform.constId22});
    constCons14 = (IStrategoTerm)termFactory.makeListCons(transform.constParam0, (IStrategoList)transform.constNil0);
    const36 = termFactory.makeString("class");
    constChars3 = termFactory.makeAppl(transform._consChars_1, new IStrategoTerm[]{transform.const36});
    constCons15 = (IStrategoTerm)termFactory.makeListCons(transform.constChars3, (IStrategoList)transform.constNil0);
    constString3 = termFactory.makeAppl(transform._consString_1, new IStrategoTerm[]{transform.constCons15});
    constLit3 = termFactory.makeAppl(transform._consLit_1, new IStrategoTerm[]{transform.constString3});
    constElemValPair1 = termFactory.makeAppl(transform._consElemValPair_2, new IStrategoTerm[]{transform.constId19, transform.constLit3});
    constCons16 = (IStrategoTerm)termFactory.makeListCons(transform.constElemValPair1, (IStrategoList)transform.constNil0);
    const37 = termFactory.makeString("@withincode(anno) && @withincode(ejp.runtime.ExplicitScopedJoinPoint) && ");
    const38 = termFactory.makeString("ejp");
    constChars4 = termFactory.makeAppl(transform._consChars_1, new IStrategoTerm[]{transform.const38});
    constCons17 = (IStrategoTerm)termFactory.makeListCons(transform.constChars4, (IStrategoList)transform.constNil0);
    constString4 = termFactory.makeAppl(transform._consString_1, new IStrategoTerm[]{transform.constCons17});
    constLit4 = termFactory.makeAppl(transform._consLit_1, new IStrategoTerm[]{transform.constString4});
    constElemValPair2 = termFactory.makeAppl(transform._consElemValPair_2, new IStrategoTerm[]{transform.constId19, transform.constLit4});
    constCons18 = (IStrategoTerm)termFactory.makeListCons(transform.constElemValPair2, (IStrategoList)transform.constNil0);
    constClassOrInterfaceType1 = termFactory.makeAppl(transform._consClassOrInterfaceType_2, new IStrategoTerm[]{transform.constTypeName1, transform.constNone0});
    const39 = termFactory.makeString("anno");
    constId23 = termFactory.makeAppl(transform._consId_1, new IStrategoTerm[]{transform.const39});
    constParam1 = termFactory.makeAppl(transform._consParam_3, new IStrategoTerm[]{transform.constNil0, transform.constClassOrInterfaceType1, transform.constId23});
    constCons19 = (IStrategoTerm)termFactory.makeListCons(transform.constParam1, (IStrategoList)transform.constNil0);
    const40 = termFactory.makeString("@withincode(anno) && !@withincode(ejp.runtime.ExplicitScopedJoinPoint) && ");
    const41 = termFactory.makeString("method");
    constChars5 = termFactory.makeAppl(transform._consChars_1, new IStrategoTerm[]{transform.const41});
    constCons20 = (IStrategoTerm)termFactory.makeListCons(transform.constChars5, (IStrategoList)transform.constNil0);
    constString5 = termFactory.makeAppl(transform._consString_1, new IStrategoTerm[]{transform.constCons20});
    constLit5 = termFactory.makeAppl(transform._consLit_1, new IStrategoTerm[]{transform.constString5});
    constElemValPair3 = termFactory.makeAppl(transform._consElemValPair_2, new IStrategoTerm[]{transform.constId19, transform.constLit5});
    constCons21 = (IStrategoTerm)termFactory.makeListCons(transform.constElemValPair3, (IStrategoList)transform.constNil0);
    const42 = termFactory.makeString("Internal error: with clause failed unexpectedly in rule 'ejp-to-ajc'");
    constCons22 = (IStrategoTerm)termFactory.makeListCons(transform.constStatic0, (IStrategoList)transform.constNil0);
    constPublic0 = termFactory.makeAppl(transform._consPublic_0, NO_TERMS);
    constCons23 = (IStrategoTerm)termFactory.makeListCons(transform.constPublic0, (IStrategoList)transform.constCons22);
    constCons24 = (IStrategoTerm)termFactory.makeListCons(transform.constPublic0, (IStrategoList)transform.constNil0);
    constNoPointcutBody0 = termFactory.makeAppl(transform._consNoPointcutBody_0, NO_TERMS);
    const43 = termFactory.makeString("handles");
    constId24 = termFactory.makeAppl(transform._consId_1, new IStrategoTerm[]{transform.const43});
    const44 = termFactory.makeString("0");
    constDeci0 = termFactory.makeAppl(transform._consDeci_1, new IStrategoTerm[]{transform.const44});
    constLit6 = termFactory.makeAppl(transform._consLit_1, new IStrategoTerm[]{transform.constDeci0});
    constSome0 = termFactory.makeAppl(transform._consSome_1, new IStrategoTerm[]{transform.constLit6});
    constFalse0 = termFactory.makeAppl(transform._consFalse_0, NO_TERMS);
    constLit7 = termFactory.makeAppl(transform._consLit_1, new IStrategoTerm[]{transform.constFalse0});
    constSome1 = termFactory.makeAppl(transform._consSome_1, new IStrategoTerm[]{transform.constLit7});
    constNull0 = termFactory.makeAppl(transform._consNull_0, NO_TERMS);
    constLit8 = termFactory.makeAppl(transform._consLit_1, new IStrategoTerm[]{transform.constNull0});
    constSome2 = termFactory.makeAppl(transform._consSome_1, new IStrategoTerm[]{transform.constLit8});
    constHS0 = termFactory.makeAppl(transform._consHS_0, NO_TERMS);
    constSOpt0 = termFactory.makeAppl(transform._consSOpt_2, new IStrategoTerm[]{transform.constHS0, transform.const44});
    constCons25 = (IStrategoTerm)termFactory.makeListCons(transform.constSOpt0, (IStrategoList)transform.constNil0);
    const45 = termFactory.makeString(")");
    constS0 = termFactory.makeAppl(transform._consS_1, new IStrategoTerm[]{transform.const45});
    constCons26 = (IStrategoTerm)termFactory.makeListCons(transform.constS0, (IStrategoList)transform.constNil0);
    const46 = termFactory.makeString("(");
    constS1 = termFactory.makeAppl(transform._consS_1, new IStrategoTerm[]{transform.const46});
    constKW0 = termFactory.makeAppl(transform._consKW_0, NO_TERMS);
    const47 = termFactory.makeString("initialization");
    constS2 = termFactory.makeAppl(transform._consS_1, new IStrategoTerm[]{transform.const47});
    constFBOX0 = termFactory.makeAppl(transform._consFBOX_2, new IStrategoTerm[]{transform.constKW0, transform.constS2});
    const48 = termFactory.makeString("preinitialization");
    constS3 = termFactory.makeAppl(transform._consS_1, new IStrategoTerm[]{transform.const48});
    constFBOX1 = termFactory.makeAppl(transform._consFBOX_2, new IStrategoTerm[]{transform.constKW0, transform.constS3});
    const49 = termFactory.makeString("staticinitialization");
    constS4 = termFactory.makeAppl(transform._consS_1, new IStrategoTerm[]{transform.const49});
    constFBOX2 = termFactory.makeAppl(transform._consFBOX_2, new IStrategoTerm[]{transform.constKW0, transform.constS4});
    const50 = termFactory.makeString("get");
    constS5 = termFactory.makeAppl(transform._consS_1, new IStrategoTerm[]{transform.const50});
    constFBOX3 = termFactory.makeAppl(transform._consFBOX_2, new IStrategoTerm[]{transform.constKW0, transform.constS5});
    const51 = termFactory.makeString("set");
    constS6 = termFactory.makeAppl(transform._consS_1, new IStrategoTerm[]{transform.const51});
    constFBOX4 = termFactory.makeAppl(transform._consFBOX_2, new IStrategoTerm[]{transform.constKW0, transform.constS6});
    const52 = termFactory.makeString("handler");
    constS7 = termFactory.makeAppl(transform._consS_1, new IStrategoTerm[]{transform.const52});
    constFBOX5 = termFactory.makeAppl(transform._consFBOX_2, new IStrategoTerm[]{transform.constKW0, transform.constS7});
    constCons27 = (IStrategoTerm)termFactory.makeListCons(transform.constS1, (IStrategoList)transform.constCons26);
    const53 = termFactory.makeString("adviceexecution");
    constS8 = termFactory.makeAppl(transform._consS_1, new IStrategoTerm[]{transform.const53});
    constFBOX6 = termFactory.makeAppl(transform._consFBOX_2, new IStrategoTerm[]{transform.constKW0, transform.constS8});
    constCons28 = (IStrategoTerm)termFactory.makeListCons(transform.constFBOX6, (IStrategoList)transform.constCons27);
    constH0 = termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{transform.constCons25, transform.constCons28});
    const54 = termFactory.makeString("within");
    constS9 = termFactory.makeAppl(transform._consS_1, new IStrategoTerm[]{transform.const54});
    constFBOX7 = termFactory.makeAppl(transform._consFBOX_2, new IStrategoTerm[]{transform.constKW0, transform.constS9});
    const55 = termFactory.makeString("withincode");
    constS10 = termFactory.makeAppl(transform._consS_1, new IStrategoTerm[]{transform.const55});
    constFBOX8 = termFactory.makeAppl(transform._consFBOX_2, new IStrategoTerm[]{transform.constKW0, transform.constS10});
    const56 = termFactory.makeString("cflow");
    constS11 = termFactory.makeAppl(transform._consS_1, new IStrategoTerm[]{transform.const56});
    constFBOX9 = termFactory.makeAppl(transform._consFBOX_2, new IStrategoTerm[]{transform.constKW0, transform.constS11});
    const57 = termFactory.makeString("cflowbelow");
    constS12 = termFactory.makeAppl(transform._consS_1, new IStrategoTerm[]{transform.const57});
    constFBOX10 = termFactory.makeAppl(transform._consFBOX_2, new IStrategoTerm[]{transform.constKW0, transform.constS12});
    const58 = termFactory.makeString("if");
    constS13 = termFactory.makeAppl(transform._consS_1, new IStrategoTerm[]{transform.const58});
    constFBOX11 = termFactory.makeAppl(transform._consFBOX_2, new IStrategoTerm[]{transform.constKW0, transform.constS13});
    const59 = termFactory.makeString("this");
    constS14 = termFactory.makeAppl(transform._consS_1, new IStrategoTerm[]{transform.const59});
    constFBOX12 = termFactory.makeAppl(transform._consFBOX_2, new IStrategoTerm[]{transform.constKW0, transform.constS14});
    const60 = termFactory.makeString("target");
    constS15 = termFactory.makeAppl(transform._consS_1, new IStrategoTerm[]{transform.const60});
    constFBOX13 = termFactory.makeAppl(transform._consFBOX_2, new IStrategoTerm[]{transform.constKW0, transform.constS15});
    constS16 = termFactory.makeAppl(transform._consS_1, new IStrategoTerm[]{transform.const6});
    constFBOX14 = termFactory.makeAppl(transform._consFBOX_2, new IStrategoTerm[]{transform.constKW0, transform.constS16});
    const61 = termFactory.makeString("@this");
    constS17 = termFactory.makeAppl(transform._consS_1, new IStrategoTerm[]{transform.const61});
    const62 = termFactory.makeString("@target");
    constS18 = termFactory.makeAppl(transform._consS_1, new IStrategoTerm[]{transform.const62});
    const63 = termFactory.makeString("@within");
    constS19 = termFactory.makeAppl(transform._consS_1, new IStrategoTerm[]{transform.const63});
    const64 = termFactory.makeString("@withincode");
    constS20 = termFactory.makeAppl(transform._consS_1, new IStrategoTerm[]{transform.const64});
    const65 = termFactory.makeString("@annotation");
    constS21 = termFactory.makeAppl(transform._consS_1, new IStrategoTerm[]{transform.const65});
    const66 = termFactory.makeString("@args");
    constS22 = termFactory.makeAppl(transform._consS_1, new IStrategoTerm[]{transform.const66});
    const67 = termFactory.makeString(".");
    constS23 = termFactory.makeAppl(transform._consS_1, new IStrategoTerm[]{transform.const67});
    const68 = termFactory.makeString("1");
    constSOpt1 = termFactory.makeAppl(transform._consSOpt_2, new IStrategoTerm[]{transform.constHS0, transform.const68});
    constCons29 = (IStrategoTerm)termFactory.makeListCons(transform.constSOpt1, (IStrategoList)transform.constNil0);
    constS24 = termFactory.makeAppl(transform._consS_1, new IStrategoTerm[]{transform.const10});
    constFBOX15 = termFactory.makeAppl(transform._consFBOX_2, new IStrategoTerm[]{transform.constKW0, transform.constS24});
    const69 = termFactory.makeString(";");
    constS25 = termFactory.makeAppl(transform._consS_1, new IStrategoTerm[]{transform.const69});
    constCons30 = (IStrategoTerm)termFactory.makeListCons(transform.constS25, (IStrategoList)transform.constNil0);
    const70 = termFactory.makeString(":");
    constS26 = termFactory.makeAppl(transform._consS_1, new IStrategoTerm[]{transform.const70});
    constFBOX16 = termFactory.makeAppl(transform._consFBOX_2, new IStrategoTerm[]{transform.constKW0, transform.constS25});
    const71 = termFactory.makeString("+");
    constS27 = termFactory.makeAppl(transform._consS_1, new IStrategoTerm[]{transform.const71});
    constCons31 = (IStrategoTerm)termFactory.makeListCons(transform.constS27, (IStrategoList)transform.constNil0);
    constFBOX17 = termFactory.makeAppl(transform._consFBOX_2, new IStrategoTerm[]{transform.constKW0, transform.constS23});
    const72 = termFactory.makeString("..");
    constS28 = termFactory.makeAppl(transform._consS_1, new IStrategoTerm[]{transform.const72});
    constFBOX18 = termFactory.makeAppl(transform._consFBOX_2, new IStrategoTerm[]{transform.constKW0, transform.constS28});
    const73 = termFactory.makeString("...");
    constS29 = termFactory.makeAppl(transform._consS_1, new IStrategoTerm[]{transform.const73});
    constCons32 = (IStrategoTerm)termFactory.makeListCons(transform.constS29, (IStrategoList)transform.constNil0);
    constS30 = termFactory.makeAppl(transform._consS_1, new IStrategoTerm[]{transform.const15});
    const74 = termFactory.makeString("new");
    constS31 = termFactory.makeAppl(transform._consS_1, new IStrategoTerm[]{transform.const74});
    constFBOX19 = termFactory.makeAppl(transform._consFBOX_2, new IStrategoTerm[]{transform.constKW0, transform.constS31});
    constCons33 = (IStrategoTerm)termFactory.makeListCons(transform.constFBOX19, (IStrategoList)transform.constNil0);
    constCons34 = (IStrategoTerm)termFactory.makeListCons(transform.constS23, (IStrategoList)transform.constCons33);
    constCons35 = (IStrategoTerm)termFactory.makeListCons(transform.constS28, (IStrategoList)transform.constCons33);
    const75 = termFactory.makeString("!");
    constS32 = termFactory.makeAppl(transform._consS_1, new IStrategoTerm[]{transform.const75});
    const76 = termFactory.makeString("throws");
    constS33 = termFactory.makeAppl(transform._consS_1, new IStrategoTerm[]{transform.const76});
    constFBOX20 = termFactory.makeAppl(transform._consFBOX_2, new IStrategoTerm[]{transform.constKW0, transform.constS33});
    const77 = termFactory.makeString("@");
    constS34 = termFactory.makeAppl(transform._consS_1, new IStrategoTerm[]{transform.const77});
    const78 = termFactory.makeString("&&");
    constS35 = termFactory.makeAppl(transform._consS_1, new IStrategoTerm[]{transform.const78});
    const79 = termFactory.makeString("||");
    constS36 = termFactory.makeAppl(transform._consS_1, new IStrategoTerm[]{transform.const79});
    constVS0 = termFactory.makeAppl(transform._consVS_0, NO_TERMS);
    constSOpt2 = termFactory.makeAppl(transform._consSOpt_2, new IStrategoTerm[]{transform.constVS0, transform.const44});
    constCons36 = (IStrategoTerm)termFactory.makeListCons(transform.constSOpt2, (IStrategoList)transform.constNil0);
    constFBOX21 = termFactory.makeAppl(transform._consFBOX_2, new IStrategoTerm[]{transform.constKW0, transform.constS26});
    constFBOX22 = termFactory.makeAppl(transform._consFBOX_2, new IStrategoTerm[]{transform.constKW0, transform.constS0});
    constCons37 = (IStrategoTerm)termFactory.makeListCons(transform.constFBOX22, (IStrategoList)transform.constNil0);
    constFBOX23 = termFactory.makeAppl(transform._consFBOX_2, new IStrategoTerm[]{transform.constKW0, transform.constS1});
    const80 = termFactory.makeString("before");
    constS37 = termFactory.makeAppl(transform._consS_1, new IStrategoTerm[]{transform.const80});
    constFBOX24 = termFactory.makeAppl(transform._consFBOX_2, new IStrategoTerm[]{transform.constKW0, transform.constS37});
    const81 = termFactory.makeString("after");
    constS38 = termFactory.makeAppl(transform._consS_1, new IStrategoTerm[]{transform.const81});
    constFBOX25 = termFactory.makeAppl(transform._consFBOX_2, new IStrategoTerm[]{transform.constKW0, transform.constS38});
    const82 = termFactory.makeString("around");
    constS39 = termFactory.makeAppl(transform._consS_1, new IStrategoTerm[]{transform.const82});
    constFBOX26 = termFactory.makeAppl(transform._consFBOX_2, new IStrategoTerm[]{transform.constKW0, transform.constS39});
    const83 = termFactory.makeString("returning");
    constS40 = termFactory.makeAppl(transform._consS_1, new IStrategoTerm[]{transform.const83});
    constFBOX27 = termFactory.makeAppl(transform._consFBOX_2, new IStrategoTerm[]{transform.constKW0, transform.constS40});
    const84 = termFactory.makeString("throwing");
    constS41 = termFactory.makeAppl(transform._consS_1, new IStrategoTerm[]{transform.const84});
    constFBOX28 = termFactory.makeAppl(transform._consFBOX_2, new IStrategoTerm[]{transform.constKW0, transform.constS41});
    constCons38 = (IStrategoTerm)termFactory.makeListCons(transform.constFBOX16, (IStrategoList)transform.constNil0);
    const85 = termFactory.makeString("parents");
    constS42 = termFactory.makeAppl(transform._consS_1, new IStrategoTerm[]{transform.const85});
    constFBOX29 = termFactory.makeAppl(transform._consFBOX_2, new IStrategoTerm[]{transform.constKW0, transform.constS42});
    const86 = termFactory.makeString("declare");
    constS43 = termFactory.makeAppl(transform._consS_1, new IStrategoTerm[]{transform.const86});
    constFBOX30 = termFactory.makeAppl(transform._consFBOX_2, new IStrategoTerm[]{transform.constKW0, transform.constS43});
    const87 = termFactory.makeString("warning");
    constS44 = termFactory.makeAppl(transform._consS_1, new IStrategoTerm[]{transform.const87});
    constFBOX31 = termFactory.makeAppl(transform._consFBOX_2, new IStrategoTerm[]{transform.constKW0, transform.constS44});
    constS45 = termFactory.makeAppl(transform._consS_1, new IStrategoTerm[]{transform.const33});
    constFBOX32 = termFactory.makeAppl(transform._consFBOX_2, new IStrategoTerm[]{transform.constKW0, transform.constS45});
    const88 = termFactory.makeString("soft");
    constS46 = termFactory.makeAppl(transform._consS_1, new IStrategoTerm[]{transform.const88});
    constFBOX33 = termFactory.makeAppl(transform._consFBOX_2, new IStrategoTerm[]{transform.constKW0, transform.constS46});
    const89 = termFactory.makeString("precedence");
    constS47 = termFactory.makeAppl(transform._consS_1, new IStrategoTerm[]{transform.const89});
    constFBOX34 = termFactory.makeAppl(transform._consFBOX_2, new IStrategoTerm[]{transform.constKW0, transform.constS47});
    const90 = termFactory.makeString("@type");
    constS48 = termFactory.makeAppl(transform._consS_1, new IStrategoTerm[]{transform.const90});
    const91 = termFactory.makeString("@constructor");
    constS49 = termFactory.makeAppl(transform._consS_1, new IStrategoTerm[]{transform.const91});
    const92 = termFactory.makeString("@method");
    constS50 = termFactory.makeAppl(transform._consS_1, new IStrategoTerm[]{transform.const92});
    const93 = termFactory.makeString("@field");
    constS51 = termFactory.makeAppl(transform._consS_1, new IStrategoTerm[]{transform.const93});
    constS52 = termFactory.makeAppl(transform._consS_1, new IStrategoTerm[]{transform.const5});
    constFBOX35 = termFactory.makeAppl(transform._consFBOX_2, new IStrategoTerm[]{transform.constKW0, transform.constS52});
    const94 = termFactory.makeString("pertarget");
    constS53 = termFactory.makeAppl(transform._consS_1, new IStrategoTerm[]{transform.const94});
    constFBOX36 = termFactory.makeAppl(transform._consFBOX_2, new IStrategoTerm[]{transform.constKW0, transform.constS53});
    const95 = termFactory.makeString("perthis");
    constS54 = termFactory.makeAppl(transform._consS_1, new IStrategoTerm[]{transform.const95});
    constFBOX37 = termFactory.makeAppl(transform._consFBOX_2, new IStrategoTerm[]{transform.constKW0, transform.constS54});
    const96 = termFactory.makeString("percflow");
    constS55 = termFactory.makeAppl(transform._consS_1, new IStrategoTerm[]{transform.const96});
    constFBOX38 = termFactory.makeAppl(transform._consFBOX_2, new IStrategoTerm[]{transform.constKW0, transform.constS55});
    const97 = termFactory.makeString("percflowbelow");
    constS56 = termFactory.makeAppl(transform._consS_1, new IStrategoTerm[]{transform.const97});
    constFBOX39 = termFactory.makeAppl(transform._consFBOX_2, new IStrategoTerm[]{transform.constKW0, transform.constS56});
    const98 = termFactory.makeString("pertypewithin");
    constS57 = termFactory.makeAppl(transform._consS_1, new IStrategoTerm[]{transform.const98});
    constFBOX40 = termFactory.makeAppl(transform._consFBOX_2, new IStrategoTerm[]{transform.constKW0, transform.constS57});
    const99 = termFactory.makeString("issingleton");
    constS58 = termFactory.makeAppl(transform._consS_1, new IStrategoTerm[]{transform.const99});
    constFBOX41 = termFactory.makeAppl(transform._consFBOX_2, new IStrategoTerm[]{transform.constKW0, transform.constS58});
    const100 = termFactory.makeString("}");
    constS59 = termFactory.makeAppl(transform._consS_1, new IStrategoTerm[]{transform.const100});
    constFBOX42 = termFactory.makeAppl(transform._consFBOX_2, new IStrategoTerm[]{transform.constKW0, transform.constS59});
    constCons39 = (IStrategoTerm)termFactory.makeListCons(transform.constFBOX42, (IStrategoList)transform.constNil0);
    constIS0 = termFactory.makeAppl(transform._consIS_0, NO_TERMS);
    const101 = termFactory.makeString("2");
    constSOpt3 = termFactory.makeAppl(transform._consSOpt_2, new IStrategoTerm[]{transform.constIS0, transform.const101});
    constCons40 = (IStrategoTerm)termFactory.makeListCons(transform.constSOpt3, (IStrategoList)transform.constNil0);
    constCons41 = (IStrategoTerm)termFactory.makeListCons(transform.constSOpt2, (IStrategoList)transform.constCons40);
    constSOpt4 = termFactory.makeAppl(transform._consSOpt_2, new IStrategoTerm[]{transform.constVS0, transform.const68});
    constCons42 = (IStrategoTerm)termFactory.makeListCons(transform.constSOpt4, (IStrategoList)transform.constNil0);
    const102 = termFactory.makeString("{");
    constS60 = termFactory.makeAppl(transform._consS_1, new IStrategoTerm[]{transform.const102});
    constFBOX43 = termFactory.makeAppl(transform._consFBOX_2, new IStrategoTerm[]{transform.constKW0, transform.constS60});
    const103 = termFactory.makeString("privileged");
    constS61 = termFactory.makeAppl(transform._consS_1, new IStrategoTerm[]{transform.const103});
    constFBOX44 = termFactory.makeAppl(transform._consFBOX_2, new IStrategoTerm[]{transform.constKW0, transform.constS61});
    const104 = termFactory.makeString("proceed");
    constS62 = termFactory.makeAppl(transform._consS_1, new IStrategoTerm[]{transform.const104});
    constFBOX45 = termFactory.makeAppl(transform._consFBOX_2, new IStrategoTerm[]{transform.constKW0, transform.constS62});
    const105 = termFactory.makeString("call");
    constS63 = termFactory.makeAppl(transform._consS_1, new IStrategoTerm[]{transform.const105});
    constFBOX46 = termFactory.makeAppl(transform._consFBOX_2, new IStrategoTerm[]{transform.constKW0, transform.constS63});
    const106 = termFactory.makeString("execution");
    constS64 = termFactory.makeAppl(transform._consS_1, new IStrategoTerm[]{transform.const106});
    constFBOX47 = termFactory.makeAppl(transform._consFBOX_2, new IStrategoTerm[]{transform.constKW0, transform.constS64});
    const107 = termFactory.makeInt(80);
    const108 = termFactory.makeString("w");
    const109 = termFactory.makeString("runtime");
    constId25 = termFactory.makeAppl(transform._consId_1, new IStrategoTerm[]{transform.const109});
    constCons43 = (IStrategoTerm)termFactory.makeListCons(transform.constId25, (IStrategoList)transform.constNil0);
    constId26 = termFactory.makeAppl(transform._consId_1, new IStrategoTerm[]{transform.const38});
    constCons44 = (IStrategoTerm)termFactory.makeListCons(transform.constId26, (IStrategoList)transform.constCons43);
    constPackageName0 = termFactory.makeAppl(transform._consPackageName_1, new IStrategoTerm[]{transform.constCons44});
    constTypeImportOnDemandDec0 = termFactory.makeAppl(transform._consTypeImportOnDemandDec_1, new IStrategoTerm[]{transform.constPackageName0});
    constCons45 = (IStrategoTerm)termFactory.makeListCons(transform.constTypeImportOnDemandDec0, (IStrategoList)transform.constNil0);
    const110 = termFactory.makeString("Internal error: with clause failed unexpectedly in rule 'ejp-converter-compilation-unit'");
    const111 = termFactory.makeString("Internal error: with clause failed unexpectedly in rule 'check-for-change-in-aspect-or-class'");
    const112 = termFactory.makeString("Internal error: with clause failed unexpectedly in rule 'ejp-converter-aspect-or-class'");
  }

  @SuppressWarnings("all") public static class fetch_0_1 extends Strategy 
  { 
    public static fetch_0_1 instance = new fetch_0_1();

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm o_71)
    { 
      ITermFactory termFactory = context.getFactory();
      context.push("fetch_0_1");
      Fail0:
      { 
        IStrategoTerm term0 = term;
        IStrategoConstructor cons0 = term.getTermType() == IStrategoTerm.APPL ? ((IStrategoAppl)term).getConstructor() : null;
        Success0:
        { 
          if(cons0 == transform._consMethodName_2)
          { 
            Fail1:
            { 
              IStrategoTerm z_11 = null;
              z_11 = term.getSubterm(0);
              term = this.invoke(context, z_11, o_71);
              if(term == null)
                break Fail1;
              if(true)
                break Success0;
            }
            term = term0;
          }
          Success1:
          { 
            if(cons0 == transform._consExprName_1)
            { 
              Fail2:
              { 
                IStrategoTerm x_11 = null;
                x_11 = term.getSubterm(0);
                term = this.invoke(context, x_11, o_71);
                if(term == null)
                  break Fail2;
                if(true)
                  break Success1;
              }
              term = term0;
            }
            Success2:
            { 
              if(cons0 == transform._consExprName_2)
              { 
                Fail3:
                { 
                  IStrategoTerm u_11 = null;
                  IStrategoTerm v_11 = null;
                  u_11 = term.getSubterm(0);
                  v_11 = term.getSubterm(1);
                  term = termFactory.makeAppl(transform._consAmbName_2, new IStrategoTerm[]{u_11, v_11});
                  term = this.invoke(context, term, o_71);
                  if(term == null)
                    break Fail3;
                  if(true)
                    break Success2;
                }
                term = term0;
              }
              Success3:
              { 
                if(cons0 == transform._consAmbName_2)
                { 
                  Fail4:
                  { 
                    IStrategoTerm s_11 = null;
                    s_11 = term.getSubterm(0);
                    IStrategoTerm arg1 = term.getSubterm(1);
                    if(arg1.getTermType() != IStrategoTerm.APPL || transform._consId_1 != ((IStrategoAppl)arg1).getConstructor())
                      break Fail4;
                    term = this.invoke(context, s_11, o_71);
                    if(term == null)
                      break Fail4;
                    if(true)
                      break Success3;
                  }
                  term = term0;
                }
                Success4:
                { 
                  if(cons0 == transform._consAmbName_1)
                  { 
                    Fail5:
                    { 
                      IStrategoTerm p_11 = null;
                      p_11 = term.getSubterm(0);
                      term = this.invoke(context, p_11, o_71);
                      if(term == null)
                        break Fail5;
                      if(true)
                        break Success4;
                    }
                    term = term0;
                  }
                  if(cons0 == transform._consId_1)
                  { 
                    IStrategoTerm n_11 = null;
                    n_11 = term.getSubterm(0);
                    term = iset_add_0_1.instance.invoke(context, o_71, n_11);
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

  @SuppressWarnings("all") public static class ejp_to_java2_0_0 extends Strategy 
  { 
    public static ejp_to_java2_0_0 instance = new ejp_to_java2_0_0();

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      ITermFactory termFactory = context.getFactory();
      context.push("ejp_to_java2_0_0");
      Fail6:
      { 
        IStrategoTerm a_12 = null;
        IStrategoTerm c_12 = null;
        IStrategoTerm d_12 = null;
        IStrategoTerm e_12 = null;
        IStrategoTerm f_12 = null;
        TermReference g_12 = new TermReference();
        IStrategoTerm h_12 = null;
        IStrategoTerm i_12 = null;
        TermReference j_12 = new TermReference();
        IStrategoTerm k_12 = null;
        if(term.getTermType() != IStrategoTerm.APPL || transform._consClassDec_2 != ((IStrategoAppl)term).getConstructor())
          break Fail6;
        IStrategoTerm arg2 = term.getSubterm(0);
        if(arg2.getTermType() != IStrategoTerm.APPL || transform._consClassDecHead_5 != ((IStrategoAppl)arg2).getConstructor())
          break Fail6;
        a_12 = arg2.getSubterm(0);
        c_12 = arg2.getSubterm(1);
        d_12 = arg2.getSubterm(2);
        e_12 = arg2.getSubterm(3);
        f_12 = arg2.getSubterm(4);
        IStrategoTerm arg3 = term.getSubterm(1);
        if(arg3.getTermType() != IStrategoTerm.APPL || transform._consClassBody_1 != ((IStrategoAppl)arg3).getConstructor())
          break Fail6;
        h_12 = arg3.getSubterm(0);
        term = random_string_0_0.instance.invoke(context, term);
        if(term == null)
          break Fail6;
        if(g_12.value == null)
          g_12.value = term;
        else
          if(g_12.value != term && !g_12.value.match(term))
            break Fail6;
        if(g_12.value == null)
          break Fail6;
        term = termFactory.makeTuple((IStrategoTerm)termFactory.makeListCons(termFactory.makeAppl(transform._consSingleElemAnno_2, new IStrategoTerm[]{transform.constTypeName0, termFactory.makeAppl(transform._consLit_1, new IStrategoTerm[]{termFactory.makeAppl(transform._consDeci_1, new IStrategoTerm[]{g_12.value})})}), (IStrategoList)transform.constNil0), a_12);
        term = conc_0_0.instance.invoke(context, term);
        if(term == null)
          break Fail6;
        term = termFactory.makeAppl(transform._consClassDecHead_5, new IStrategoTerm[]{term, c_12, d_12, e_12, f_12});
        k_12 = term;
        term = new_iset_0_0.instance.invoke(context, term);
        if(term == null)
          break Fail6;
        if(j_12.value == null)
          j_12.value = term;
        else
          if(j_12.value != term && !j_12.value.match(term))
            break Fail6;
        term = h_12;
        lifted0 lifted00 = new lifted0();
        lifted00.g_12 = g_12;
        lifted00.j_12 = j_12;
        term = SRTS_all.instance.invoke(context, term, lifted00);
        if(term == null)
          break Fail6;
        i_12 = term;
        if(j_12.value == null)
          break Fail6;
        term = iset_elements_0_0.instance.invoke(context, j_12.value);
        if(term == null)
          break Fail6;
        term = termFactory.makeTuple(i_12, term);
        term = conc_0_0.instance.invoke(context, term);
        if(term == null)
          break Fail6;
        term = termFactory.makeAppl(transform._consClassBody_1, new IStrategoTerm[]{term});
        term = termFactory.makeAppl(transform._consClassDec_2, new IStrategoTerm[]{k_12, term});
        context.popOnSuccess();
        if(true)
          return term;
      }
      context.popOnFailure();
      return null;
    }
  }

  @SuppressWarnings("all") public static class ejp_to_java_0_4 extends Strategy 
  { 
    public static ejp_to_java_0_4 instance = new ejp_to_java_0_4();

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm ref_r_71, IStrategoTerm ref_s_71, IStrategoTerm ref_t_71, IStrategoTerm ref_u_71)
    { 
      ITermFactory termFactory = context.getFactory();
      TermReference r_71 = new TermReference(ref_r_71);
      TermReference s_71 = new TermReference(ref_s_71);
      TermReference t_71 = new TermReference(ref_t_71);
      TermReference u_71 = new TermReference(ref_u_71);
      context.push("ejp_to_java_0_4");
      Fail7:
      { 
        IStrategoTerm term5 = term;
        Success5:
        { 
          Fail8:
          { 
            IStrategoTerm j_18 = null;
            IStrategoTerm l_18 = null;
            IStrategoTerm m_18 = null;
            IStrategoTerm n_18 = null;
            IStrategoTerm o_18 = null;
            TermReference p_18 = new TermReference();
            IStrategoTerm q_18 = null;
            IStrategoTerm r_18 = null;
            IStrategoTerm s_18 = null;
            if(term.getTermType() != IStrategoTerm.APPL || transform._consClassDec_2 != ((IStrategoAppl)term).getConstructor())
              break Fail8;
            IStrategoTerm arg4 = term.getSubterm(0);
            if(arg4.getTermType() != IStrategoTerm.APPL || transform._consClassDecHead_5 != ((IStrategoAppl)arg4).getConstructor())
              break Fail8;
            j_18 = arg4.getSubterm(0);
            l_18 = arg4.getSubterm(1);
            m_18 = arg4.getSubterm(2);
            n_18 = arg4.getSubterm(3);
            o_18 = arg4.getSubterm(4);
            IStrategoTerm arg5 = term.getSubterm(1);
            if(arg5.getTermType() != IStrategoTerm.APPL || transform._consClassBody_1 != ((IStrategoAppl)arg5).getConstructor())
              break Fail8;
            q_18 = arg5.getSubterm(0);
            IStrategoTerm term6 = term;
            Success6:
            { 
              Fail9:
              { 
                IStrategoTerm t_18 = null;
                IStrategoTerm u_18 = null;
                IStrategoTerm w_18 = null;
                t_18 = term;
                term = l_18;
                if(term.getTermType() != IStrategoTerm.APPL || transform._consId_1 != ((IStrategoAppl)term).getConstructor())
                  break Fail9;
                u_18 = term.getSubterm(0);
                w_18 = u_18;
                term = string_starts_with_0_1.instance.invoke(context, w_18, transform.const1);
                if(term == null)
                  break Fail9;
                term = t_18;
                { 
                  term = termFactory.makeAppl(transform._consClassDecHead_5, new IStrategoTerm[]{j_18, l_18, m_18, n_18, o_18});
                  r_18 = term;
                  term = q_18;
                  lifted2 lifted210 = new lifted2();
                  lifted210.r_71 = r_71;
                  lifted210.s_71 = s_71;
                  lifted210.t_71 = t_71;
                  lifted210.u_71 = u_71;
                  term = SRTS_all.instance.invoke(context, term, lifted210);
                  if(term == null)
                    break Fail8;
                  term = termFactory.makeAppl(transform._consClassBody_1, new IStrategoTerm[]{term});
                  s_18 = term;
                  if(true)
                    break Success6;
                }
              }
              term = term6;
              term = random_string_0_0.instance.invoke(context, term);
              if(term == null)
                break Fail8;
              if(p_18.value == null)
                p_18.value = term;
              else
                if(p_18.value != term && !p_18.value.match(term))
                  break Fail8;
              if(p_18.value == null)
                break Fail8;
              term = termFactory.makeTuple((IStrategoTerm)termFactory.makeListCons(termFactory.makeAppl(transform._consSingleElemAnno_2, new IStrategoTerm[]{transform.constTypeName0, termFactory.makeAppl(transform._consLit_1, new IStrategoTerm[]{termFactory.makeAppl(transform._consDeci_1, new IStrategoTerm[]{p_18.value})})}), (IStrategoList)transform.constNil0), j_18);
              term = conc_0_0.instance.invoke(context, term);
              if(term == null)
                break Fail8;
              term = termFactory.makeAppl(transform._consClassDecHead_5, new IStrategoTerm[]{term, l_18, m_18, n_18, o_18});
              r_18 = term;
              term = q_18;
              lifted4 lifted410 = new lifted4();
              lifted410.r_71 = r_71;
              lifted410.p_18 = p_18;
              lifted410.t_71 = t_71;
              lifted410.u_71 = u_71;
              term = SRTS_all.instance.invoke(context, term, lifted410);
              if(term == null)
                break Fail8;
              term = termFactory.makeAppl(transform._consClassBody_1, new IStrategoTerm[]{term});
              s_18 = term;
            }
            term = termFactory.makeAppl(transform._consClassDec_2, new IStrategoTerm[]{r_18, s_18});
            if(true)
              break Success5;
          }
          term = term5;
          IStrategoTerm term7 = term;
          Success7:
          { 
            Fail10:
            { 
              IStrategoTerm l_17 = null;
              IStrategoTerm n_17 = null;
              IStrategoTerm o_17 = null;
              IStrategoTerm p_17 = null;
              IStrategoTerm q_17 = null;
              IStrategoTerm r_17 = null;
              TermReference s_17 = new TermReference();
              IStrategoTerm t_17 = null;
              IStrategoTerm u_17 = null;
              IStrategoTerm v_17 = null;
              if(term.getTermType() != IStrategoTerm.APPL || transform._consMethodDec_2 != ((IStrategoAppl)term).getConstructor())
                break Fail10;
              IStrategoTerm arg6 = term.getSubterm(0);
              if(arg6.getTermType() != IStrategoTerm.APPL || transform._consMethodDecHead_6 != ((IStrategoAppl)arg6).getConstructor())
                break Fail10;
              l_17 = arg6.getSubterm(0);
              n_17 = arg6.getSubterm(1);
              o_17 = arg6.getSubterm(2);
              p_17 = arg6.getSubterm(3);
              q_17 = arg6.getSubterm(4);
              r_17 = arg6.getSubterm(5);
              IStrategoTerm arg7 = term.getSubterm(1);
              if(arg7.getTermType() != IStrategoTerm.APPL || transform._consBlock_1 != ((IStrategoAppl)arg7).getConstructor())
                break Fail10;
              t_17 = arg7.getSubterm(0);
              term = q_17;
              lifted6 lifted610 = new lifted6();
              lifted610.r_71 = r_71;
              term = SRTS_all.instance.invoke(context, term, lifted610);
              if(term == null)
                break Fail10;
              IStrategoTerm term8 = term;
              Success8:
              { 
                Fail11:
                { 
                  IStrategoTerm w_17 = null;
                  w_17 = term;
                  term = fetch_1_0.instance.invoke(context, l_17, lifted8.instance);
                  if(term == null)
                    break Fail11;
                  term = w_17;
                  { 
                    term = termFactory.makeAppl(transform._consMethodDecHead_6, new IStrategoTerm[]{l_17, n_17, o_17, p_17, q_17, r_17});
                    u_17 = term;
                    lifted9 lifted90 = new lifted9();
                    lifted90.r_71 = r_71;
                    lifted90.s_71 = s_71;
                    lifted90.t_71 = t_71;
                    lifted90.u_71 = u_71;
                    term = allow_extends_1_1.instance.invoke(context, term, lifted90, t_17);
                    if(term == null)
                      break Fail10;
                    term = termFactory.makeAppl(transform._consBlock_1, new IStrategoTerm[]{term});
                    v_17 = term;
                    if(true)
                      break Success8;
                  }
                }
                term = term8;
                term = random_string_0_0.instance.invoke(context, term);
                if(term == null)
                  break Fail10;
                if(s_17.value == null)
                  s_17.value = term;
                else
                  if(s_17.value != term && !s_17.value.match(term))
                    break Fail10;
                if(s_17.value == null)
                  break Fail10;
                term = termFactory.makeTuple((IStrategoTerm)termFactory.makeListCons(termFactory.makeAppl(transform._consSingleElemAnno_2, new IStrategoTerm[]{transform.constTypeName1, termFactory.makeAppl(transform._consLit_1, new IStrategoTerm[]{termFactory.makeAppl(transform._consDeci_1, new IStrategoTerm[]{s_17.value})})}), (IStrategoList)transform.constNil0), l_17);
                term = conc_0_0.instance.invoke(context, term);
                if(term == null)
                  break Fail10;
                term = termFactory.makeAppl(transform._consMethodDecHead_6, new IStrategoTerm[]{term, n_17, o_17, p_17, q_17, r_17});
                u_17 = term;
                lifted10 lifted100 = new lifted10();
                lifted100.r_71 = r_71;
                lifted100.s_71 = s_71;
                lifted100.s_17 = s_17;
                lifted100.u_71 = u_71;
                term = allow_extends_1_1.instance.invoke(context, term, lifted100, t_17);
                if(term == null)
                  break Fail10;
                term = termFactory.makeAppl(transform._consBlock_1, new IStrategoTerm[]{term});
                v_17 = term;
              }
              term = termFactory.makeAppl(transform._consMethodDec_2, new IStrategoTerm[]{u_17, v_17});
              if(true)
                break Success7;
            }
            term = term7;
            IStrategoTerm term9 = term;
            Success9:
            { 
              Fail12:
              { 
                IStrategoTerm d_17 = null;
                if(term.getTermType() != IStrategoTerm.APPL || transform._consBlock_1 != ((IStrategoAppl)term).getConstructor())
                  break Fail12;
                d_17 = term.getSubterm(0);
                term = d_17;
                lifted11 lifted111 = new lifted11();
                lifted111.r_71 = r_71;
                lifted111.s_71 = s_71;
                lifted111.t_71 = t_71;
                lifted111.u_71 = u_71;
                term = SRTS_all.instance.invoke(context, term, lifted111);
                if(term == null)
                  break Fail12;
                if(true)
                  break Success9;
              }
              term = term9;
              IStrategoTerm term10 = term;
              Success10:
              { 
                Fail13:
                { 
                  TermReference s_16 = new TermReference();
                  TermReference u_16 = new TermReference();
                  IStrategoTerm v_16 = null;
                  if(term.getTermType() != IStrategoTerm.APPL || transform._consLocalVarDecStm_1 != ((IStrategoAppl)term).getConstructor())
                    break Fail13;
                  IStrategoTerm arg12 = term.getSubterm(0);
                  if(arg12.getTermType() != IStrategoTerm.APPL || transform._consLocalVarDec_3 != ((IStrategoAppl)arg12).getConstructor())
                    break Fail13;
                  if(s_16.value == null)
                    s_16.value = arg12.getSubterm(0);
                  else
                    if(s_16.value != arg12.getSubterm(0) && !s_16.value.match(arg12.getSubterm(0)))
                      break Fail13;
                  if(u_16.value == null)
                    u_16.value = arg12.getSubterm(1);
                  else
                    if(u_16.value != arg12.getSubterm(1) && !u_16.value.match(arg12.getSubterm(1)))
                      break Fail13;
                  v_16 = arg12.getSubterm(2);
                  term = v_16;
                  lifted13 lifted130 = new lifted13();
                  lifted130.r_71 = r_71;
                  lifted130.s_16 = s_16;
                  lifted130.u_16 = u_16;
                  lifted130.s_71 = s_71;
                  lifted130.t_71 = t_71;
                  lifted130.u_71 = u_71;
                  term = map_1_0.instance.invoke(context, term, lifted130);
                  if(term == null)
                    break Fail13;
                  term = concat_0_0.instance.invoke(context, term);
                  if(term == null)
                    break Fail13;
                  if(true)
                    break Success10;
                }
                term = term10;
                IStrategoTerm term11 = term;
                Success11:
                { 
                  Fail14:
                  { 
                    TermReference y_15 = new TermReference();
                    IStrategoTerm z_15 = null;
                    if(term.getTermType() != IStrategoTerm.APPL || transform._consInstanceInit_1 != ((IStrategoAppl)term).getConstructor())
                      break Fail14;
                    IStrategoTerm arg13 = term.getSubterm(0);
                    if(arg13.getTermType() != IStrategoTerm.APPL || transform._consBlock_1 != ((IStrategoAppl)arg13).getConstructor())
                      break Fail14;
                    z_15 = arg13.getSubterm(0);
                    term = new_hashtable_0_0.instance.invoke(context, term);
                    if(term == null)
                      break Fail14;
                    if(y_15.value == null)
                      y_15.value = term;
                    else
                      if(y_15.value != term && !y_15.value.match(term))
                        break Fail14;
                    term = z_15;
                    lifted14 lifted140 = new lifted14();
                    lifted140.y_15 = y_15;
                    lifted140.u_71 = u_71;
                    term = SRTS_all.instance.invoke(context, term, lifted140);
                    if(term == null)
                      break Fail14;
                    term = termFactory.makeAppl(transform._consInstanceInit_1, new IStrategoTerm[]{termFactory.makeAppl(transform._consBlock_1, new IStrategoTerm[]{term})});
                    if(true)
                      break Success11;
                  }
                  term = term11;
                  IStrategoTerm term12 = term;
                  Success12:
                  { 
                    Fail15:
                    { 
                      TermReference d_15 = new TermReference();
                      IStrategoTerm f_15 = null;
                      if(term.getTermType() != IStrategoTerm.APPL || transform._consStaticInit_1 != ((IStrategoAppl)term).getConstructor())
                        break Fail15;
                      IStrategoTerm arg14 = term.getSubterm(0);
                      if(arg14.getTermType() != IStrategoTerm.APPL || transform._consBlock_1 != ((IStrategoAppl)arg14).getConstructor())
                        break Fail15;
                      f_15 = arg14.getSubterm(0);
                      term = new_hashtable_0_0.instance.invoke(context, term);
                      if(term == null)
                        break Fail15;
                      if(d_15.value == null)
                        d_15.value = term;
                      else
                        if(d_15.value != term && !d_15.value.match(term))
                          break Fail15;
                      term = f_15;
                      lifted16 lifted160 = new lifted16();
                      lifted160.d_15 = d_15;
                      lifted160.u_71 = u_71;
                      term = SRTS_all.instance.invoke(context, term, lifted160);
                      if(term == null)
                        break Fail15;
                      term = termFactory.makeAppl(transform._consStaticInit_1, new IStrategoTerm[]{termFactory.makeAppl(transform._consBlock_1, new IStrategoTerm[]{term})});
                      if(true)
                        break Success12;
                    }
                    term = term12;
                    IStrategoTerm term13 = term;
                    IStrategoConstructor cons2 = term.getTermType() == IStrategoTerm.APPL ? ((IStrategoAppl)term).getConstructor() : null;
                    Success13:
                    { 
                      if(cons2 == transform._consExprStm_1)
                      { 
                        Fail16:
                        { 
                          IStrategoTerm u_14 = null;
                          IStrategoTerm v_14 = null;
                          IStrategoTerm w_14 = null;
                          IStrategoTerm arg15 = term.getSubterm(0);
                          if(arg15.getTermType() != IStrategoTerm.APPL || transform._consAssign_2 != ((IStrategoAppl)arg15).getConstructor())
                            break Fail16;
                          u_14 = arg15.getSubterm(0);
                          IStrategoTerm arg16 = arg15.getSubterm(1);
                          if(arg16.getTermType() != IStrategoTerm.APPL || transform._consEJPCall_2 != ((IStrategoAppl)arg16).getConstructor())
                            break Fail16;
                          v_14 = arg16.getSubterm(0);
                          w_14 = arg16.getSubterm(1);
                          term = termFactory.makeAppl(transform._consEJPCall_2, new IStrategoTerm[]{v_14, w_14});
                          term = ejp_call_to_method_invokation_0_4.instance.invoke(context, term, r_71.value, s_71.value, t_71.value, u_71.value);
                          if(term == null)
                            break Fail16;
                          term = termFactory.makeAppl(transform._consExprStm_1, new IStrategoTerm[]{termFactory.makeAppl(transform._consAssign_2, new IStrategoTerm[]{u_14, term})});
                          if(true)
                            break Success13;
                        }
                        term = term13;
                      }
                      Success14:
                      { 
                        if(cons2 == transform._consExprStm_1)
                        { 
                          Fail17:
                          { 
                            IStrategoTerm k_14 = null;
                            IStrategoTerm l_14 = null;
                            IStrategoTerm arg17 = term.getSubterm(0);
                            if(arg17.getTermType() != IStrategoTerm.APPL || transform._consEJPCall_2 != ((IStrategoAppl)arg17).getConstructor())
                              break Fail17;
                            k_14 = arg17.getSubterm(0);
                            l_14 = arg17.getSubterm(1);
                            term = termFactory.makeAppl(transform._consEJPCall_2, new IStrategoTerm[]{k_14, l_14});
                            term = ejp_call_to_method_invokation_0_4.instance.invoke(context, term, r_71.value, s_71.value, t_71.value, u_71.value);
                            if(term == null)
                              break Fail17;
                            term = termFactory.makeAppl(transform._consExprStm_1, new IStrategoTerm[]{term});
                            if(true)
                              break Success14;
                          }
                          term = term13;
                        }
                        Success15:
                        { 
                          if(cons2 == transform._consExprStm_1)
                          { 
                            Fail18:
                            { 
                              IStrategoTerm z_13 = null;
                              IStrategoTerm a_14 = null;
                              IStrategoTerm b_14 = null;
                              IStrategoTerm c_14 = null;
                              IStrategoTerm arg18 = term.getSubterm(0);
                              if(arg18.getTermType() != IStrategoTerm.APPL || transform._consScopedEJPCall_3 != ((IStrategoAppl)arg18).getConstructor())
                                break Fail18;
                              z_13 = arg18.getSubterm(0);
                              a_14 = arg18.getSubterm(1);
                              IStrategoTerm arg19 = arg18.getSubterm(2);
                              if(arg19.getTermType() != IStrategoTerm.APPL || transform._consBlock_1 != ((IStrategoAppl)arg19).getConstructor())
                                break Fail18;
                              b_14 = arg19.getSubterm(0);
                              term = create_method_invokation_0_1.instance.invoke(context, term, z_13);
                              if(term == null)
                                break Fail18;
                              c_14 = term;
                              term = termFactory.makeAppl(transform._consScopedEJPCall_3, new IStrategoTerm[]{z_13, a_14, termFactory.makeAppl(transform._consBlock_1, new IStrategoTerm[]{b_14})});
                              term = scoped_ejp_to_java_0_4.instance.invoke(context, term, r_71.value, s_71.value, t_71.value, u_71.value);
                              if(term == null)
                                break Fail18;
                              term = termFactory.makeTuple((IStrategoTerm)termFactory.makeListCons(termFactory.makeAppl(transform._consExprStm_1, new IStrategoTerm[]{c_14}), (IStrategoList)transform.constNil0), term);
                              term = conc_0_0.instance.invoke(context, term);
                              if(term == null)
                                break Fail18;
                              if(true)
                                break Success15;
                            }
                            term = term13;
                          }
                          if(cons2 == transform._consExprStm_1)
                          { 
                            IStrategoTerm h_13 = null;
                            IStrategoTerm i_13 = null;
                            IStrategoTerm m_13 = null;
                            IStrategoTerm n_13 = null;
                            IStrategoTerm o_13 = null;
                            IStrategoTerm arg20 = term.getSubterm(0);
                            if(arg20.getTermType() != IStrategoTerm.APPL || transform._consAssign_2 != ((IStrategoAppl)arg20).getConstructor())
                              break Fail7;
                            h_13 = arg20.getSubterm(0);
                            IStrategoTerm arg21 = arg20.getSubterm(1);
                            if(arg21.getTermType() != IStrategoTerm.APPL || transform._consScopedEJPCall_3 != ((IStrategoAppl)arg21).getConstructor())
                              break Fail7;
                            i_13 = arg21.getSubterm(0);
                            m_13 = arg21.getSubterm(1);
                            IStrategoTerm arg22 = arg21.getSubterm(2);
                            if(arg22.getTermType() != IStrategoTerm.APPL || transform._consBlock_1 != ((IStrategoAppl)arg22).getConstructor())
                              break Fail7;
                            n_13 = arg22.getSubterm(0);
                            term = create_method_invokation_0_1.instance.invoke(context, term, i_13);
                            if(term == null)
                              break Fail7;
                            o_13 = term;
                            term = termFactory.makeAppl(transform._consScopedEJPCall_3, new IStrategoTerm[]{i_13, m_13, termFactory.makeAppl(transform._consBlock_1, new IStrategoTerm[]{n_13})});
                            term = scoped_ejp_to_java_0_4.instance.invoke(context, term, r_71.value, s_71.value, t_71.value, u_71.value);
                            if(term == null)
                              break Fail7;
                            term = termFactory.makeTuple((IStrategoTerm)termFactory.makeListCons(termFactory.makeAppl(transform._consExprStm_1, new IStrategoTerm[]{termFactory.makeAppl(transform._consAssign_2, new IStrategoTerm[]{h_13, o_13})}), (IStrategoList)transform.constNil0), term);
                            term = conc_0_0.instance.invoke(context, term);
                            if(term == null)
                              break Fail7;
                          }
                          else
                          { 
                            break Fail7;
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

  @SuppressWarnings("all") public static class convert_one_var_dec_0_6 extends Strategy 
  { 
    public static convert_one_var_dec_0_6 instance = new convert_one_var_dec_0_6();

    public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm k_19, IStrategoTerm l_19, IStrategoTerm m_19, IStrategoTerm n_19, IStrategoTerm o_19, IStrategoTerm p_19)
    { 
      ITermFactory termFactory = context.getFactory();
      context.push("convert_one_var_dec_0_6");
      Fail19:
      { 
        IStrategoTerm q_19 = null;
        IStrategoTerm r_19 = null;
        if(term.getTermType() != IStrategoTerm.APPL || transform._consVarDec_2 != ((IStrategoAppl)term).getConstructor())
          break Fail19;
        q_19 = term.getSubterm(0);
        r_19 = term.getSubterm(1);
        term = termFactory.makeAppl(transform._consVarDec_2, new IStrategoTerm[]{q_19, transform.constNone0});
        term = add_local_var_0_2.instance.invoke(context, term, k_19, m_19);
        if(term == null)
          break Fail19;
        Success16:
        { 
          Fail20:
          { 
            IStrategoTerm s_19 = null;
            s_19 = term;
            term = or_2_0.instance.invoke(context, r_19, lifted18.instance, lifted19.instance);
            if(term == null)
              break Fail20;
            term = s_19;
            { 
              term = termFactory.makeAppl(transform._consVarDec_2, new IStrategoTerm[]{q_19, r_19});
              term = convert_var_dec_by_ejp_call_0_6.instance.invokeDynamic(context, term, NO_STRATEGIES, new IStrategoTerm[]{k_19, l_19, m_19, n_19, o_19, p_19});
              if(term == null)
                break Fail19;
              if(true)
                break Success16;
            }
          }
          term = (IStrategoTerm)termFactory.makeListCons(termFactory.makeAppl(transform._consLocalVarDecStm_1, new IStrategoTerm[]{termFactory.makeAppl(transform._consLocalVarDec_3, new IStrategoTerm[]{l_19, m_19, (IStrategoTerm)termFactory.makeListCons(termFactory.makeAppl(transform._consVarDec_2, new IStrategoTerm[]{q_19, r_19}), (IStrategoList)transform.constNil0)})}), (IStrategoList)transform.constNil0);
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
      if(sargs == null || targs == null || sargs.length != 0 || targs.length != 6)
        throw new IllegalArgumentException("Illegal arguments for " + getName());
      return invoke(context, term, targs[0], targs[1], targs[2], targs[3], targs[4], targs[5]);
    }
  }

  @SuppressWarnings("all") public static class convert_var_dec_by_ejp_call_0_6 extends Strategy 
  { 
    public static convert_var_dec_by_ejp_call_0_6 instance = new convert_var_dec_by_ejp_call_0_6();

    public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm v_71, IStrategoTerm w_71, IStrategoTerm x_71, IStrategoTerm y_71, IStrategoTerm z_71, IStrategoTerm a_72)
    { 
      ITermFactory termFactory = context.getFactory();
      context.push("convert_var_dec_by_ejp_call_0_6");
      Fail21:
      { 
        IStrategoTerm term17 = term;
        IStrategoConstructor cons3 = term.getTermType() == IStrategoTerm.APPL ? ((IStrategoAppl)term).getConstructor() : null;
        Success17:
        { 
          if(cons3 == transform._consVarDec_2)
          { 
            Fail22:
            { 
              IStrategoTerm o_20 = null;
              IStrategoTerm p_20 = null;
              IStrategoTerm q_20 = null;
              o_20 = term.getSubterm(0);
              IStrategoTerm arg28 = term.getSubterm(1);
              if(arg28.getTermType() != IStrategoTerm.APPL || transform._consEJPCall_2 != ((IStrategoAppl)arg28).getConstructor())
                break Fail22;
              p_20 = arg28.getSubterm(0);
              q_20 = arg28.getSubterm(1);
              term = termFactory.makeAppl(transform._consEJPCall_2, new IStrategoTerm[]{p_20, q_20});
              term = ejp_call_to_method_invokation_0_4.instance.invoke(context, term, v_71, y_71, z_71, a_72);
              if(term == null)
                break Fail22;
              term = (IStrategoTerm)termFactory.makeListCons(termFactory.makeAppl(transform._consLocalVarDecStm_1, new IStrategoTerm[]{termFactory.makeAppl(transform._consLocalVarDec_3, new IStrategoTerm[]{w_71, x_71, (IStrategoTerm)termFactory.makeListCons(termFactory.makeAppl(transform._consVarDec_2, new IStrategoTerm[]{o_20, term}), (IStrategoList)transform.constNil0)})}), (IStrategoList)transform.constNil0);
              if(true)
                break Success17;
            }
            term = term17;
          }
          if(cons3 == transform._consVarDec_2)
          { 
            IStrategoTerm a_20 = null;
            IStrategoTerm b_20 = null;
            IStrategoTerm c_20 = null;
            IStrategoTerm d_20 = null;
            IStrategoTerm e_20 = null;
            a_20 = term.getSubterm(0);
            IStrategoTerm arg29 = term.getSubterm(1);
            if(arg29.getTermType() != IStrategoTerm.APPL || transform._consScopedEJPCall_3 != ((IStrategoAppl)arg29).getConstructor())
              break Fail21;
            b_20 = arg29.getSubterm(0);
            c_20 = arg29.getSubterm(1);
            IStrategoTerm arg30 = arg29.getSubterm(2);
            if(arg30.getTermType() != IStrategoTerm.APPL || transform._consBlock_1 != ((IStrategoAppl)arg30).getConstructor())
              break Fail21;
            d_20 = arg30.getSubterm(0);
            term = termFactory.makeAppl(transform._consEJPCall_2, new IStrategoTerm[]{b_20, c_20});
            term = ejp_call_to_method_invokation_0_4.instance.invoke(context, term, v_71, y_71, z_71, a_72);
            if(term == null)
              break Fail21;
            e_20 = term;
            term = termFactory.makeAppl(transform._consScopedEJPCall_3, new IStrategoTerm[]{b_20, c_20, termFactory.makeAppl(transform._consBlock_1, new IStrategoTerm[]{d_20})});
            term = scoped_ejp_to_java_0_4.instance.invoke(context, term, v_71, y_71, z_71, a_72);
            if(term == null)
              break Fail21;
            term = termFactory.makeTuple((IStrategoTerm)termFactory.makeListCons(termFactory.makeAppl(transform._consLocalVarDecStm_1, new IStrategoTerm[]{termFactory.makeAppl(transform._consLocalVarDec_3, new IStrategoTerm[]{w_71, x_71, (IStrategoTerm)termFactory.makeListCons(termFactory.makeAppl(transform._consVarDec_2, new IStrategoTerm[]{a_20, e_20}), (IStrategoList)transform.constNil0)})}), (IStrategoList)transform.constNil0), term);
            term = conc_0_0.instance.invoke(context, term);
            if(term == null)
              break Fail21;
          }
          else
          { 
            break Fail21;
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
      if(sargs == null || targs == null || sargs.length != 0 || targs.length != 6)
        throw new IllegalArgumentException("Illegal arguments for " + getName());
      return invoke(context, term, targs[0], targs[1], targs[2], targs[3], targs[4], targs[5]);
    }
  }

  @SuppressWarnings("all") public static class add_local_vars_0_1 extends Strategy 
  { 
    public static add_local_vars_0_1 instance = new add_local_vars_0_1();

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm ref_b_72)
    { 
      TermReference b_72 = new TermReference(ref_b_72);
      context.push("add_local_vars_0_1");
      Fail23:
      { 
        IStrategoTerm term18 = term;
        Success18:
        { 
          Fail24:
          { 
            IStrategoTerm z_20 = null;
            TermReference a_21 = new TermReference();
            IStrategoTerm b_21 = null;
            if(term.getTermType() != IStrategoTerm.APPL || transform._consLocalVarDecStm_1 != ((IStrategoAppl)term).getConstructor())
              break Fail24;
            IStrategoTerm arg31 = term.getSubterm(0);
            if(arg31.getTermType() != IStrategoTerm.APPL || transform._consLocalVarDec_3 != ((IStrategoAppl)arg31).getConstructor())
              break Fail24;
            if(a_21.value == null)
              a_21.value = arg31.getSubterm(1);
            else
              if(a_21.value != arg31.getSubterm(1) && !a_21.value.match(arg31.getSubterm(1)))
                break Fail24;
            z_20 = arg31.getSubterm(2);
            b_21 = term;
            term = z_20;
            lifted20 lifted200 = new lifted20();
            lifted200.b_72 = b_72;
            lifted200.a_21 = a_21;
            term = SRTS_all.instance.invoke(context, term, lifted200);
            if(term == null)
              break Fail24;
            term = b_21;
            if(true)
              break Success18;
          }
          term = term18;
          TermReference u_20 = new TermReference();
          IStrategoTerm v_20 = null;
          lifted25 lifted250 = new lifted25();
          lifted22 lifted220 = new lifted22();
          lifted250.u_20 = u_20;
          lifted220.u_20 = u_20;
          term = or_2_0.instance.invoke(context, term, lifted220, lifted250);
          if(term == null)
            break Fail23;
          v_20 = term;
          if(u_20.value == null)
            break Fail23;
          term = u_20.value;
          lifted26 lifted260 = new lifted26();
          lifted260.b_72 = b_72;
          term = SRTS_all.instance.invoke(context, term, lifted260);
          if(term == null)
            break Fail23;
          term = v_20;
        }
        context.popOnSuccess();
        if(true)
          return term;
      }
      context.popOnFailure();
      return null;
    }
  }

  @SuppressWarnings("all") public static class add_local_var_0_2 extends Strategy 
  { 
    public static add_local_var_0_2 instance = new add_local_var_0_2();

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm e_21, IStrategoTerm f_21)
    { 
      context.push("add_local_var_0_2");
      Fail25:
      { 
        TermReference g_21 = new TermReference();
        IStrategoTerm h_21 = null;
        lifted29 lifted290 = new lifted29();
        lifted28 lifted280 = new lifted28();
        lifted290.g_21 = g_21;
        lifted280.g_21 = g_21;
        term = or_2_0.instance.invoke(context, term, lifted280, lifted290);
        if(term == null)
          break Fail25;
        h_21 = term;
        term = hashtable_remove_0_1.instance.invoke(context, e_21, g_21.value);
        if(term == null)
          break Fail25;
        term = hashtable_put_0_2.instance.invoke(context, e_21, g_21.value, f_21);
        if(term == null)
          break Fail25;
        term = h_21;
        context.popOnSuccess();
        if(true)
          return term;
      }
      context.popOnFailure();
      return null;
    }
  }

  @SuppressWarnings("all") public static class process_method_param_0_1 extends Strategy 
  { 
    public static process_method_param_0_1 instance = new process_method_param_0_1();

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm k_21)
    { 
      context.push("process_method_param_0_1");
      Fail26:
      { 
        TermReference l_21 = new TermReference();
        TermReference m_21 = new TermReference();
        IStrategoTerm n_21 = null;
        lifted31 lifted311 = new lifted31();
        lifted30 lifted300 = new lifted30();
        lifted311.m_21 = m_21;
        lifted311.l_21 = l_21;
        lifted300.m_21 = m_21;
        lifted300.l_21 = l_21;
        term = or_2_0.instance.invoke(context, term, lifted300, lifted311);
        if(term == null)
          break Fail26;
        n_21 = term;
        term = hashtable_put_0_2.instance.invoke(context, k_21, l_21.value, m_21.value);
        if(term == null)
          break Fail26;
        term = n_21;
        context.popOnSuccess();
        if(true)
          return term;
      }
      context.popOnFailure();
      return null;
    }
  }

  @SuppressWarnings("all") public static class gen_auxilery_class_0_5 extends Strategy 
  { 
    public static gen_auxilery_class_0_5 instance = new gen_auxilery_class_0_5();

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm q_21, IStrategoTerm r_21, IStrategoTerm s_21, IStrategoTerm t_21, IStrategoTerm u_21)
    { 
      ITermFactory termFactory = context.getFactory();
      context.push("gen_auxilery_class_0_5");
      Fail27:
      { 
        IStrategoTerm y_21 = null;
        IStrategoTerm d_22 = null;
        IStrategoTerm e_22 = null;
        y_21 = term;
        term = s_21;
        if(term.getTermType() != IStrategoTerm.APPL || transform._consExplicitJoinPoint_3 != ((IStrategoAppl)term).getConstructor())
          break Fail27;
        term = gen_compact_var_declaration_0_2.instance.invoke(context, term, q_21, r_21);
        if(term == null)
          break Fail27;
        d_22 = term;
        term = gen_method_annotation_0_0.instance.invoke(context, s_21);
        if(term == null)
          break Fail27;
        e_22 = term;
        term = gen__ejpscope__method__name_0_0.instance.invoke(context, s_21);
        if(term == null)
          break Fail27;
        term = (IStrategoTerm)termFactory.makeListCons(d_22, termFactory.makeListCons((IStrategoTerm)termFactory.makeListCons(termFactory.makeAppl(transform._consMethodDec_2, new IStrategoTerm[]{termFactory.makeAppl(transform._consMethodDecHead_6, new IStrategoTerm[]{(IStrategoTerm)termFactory.makeListCons(termFactory.makeAppl(transform._consSingleElemAnno_2, new IStrategoTerm[]{transform.constTypeName1, termFactory.makeAppl(transform._consLit_1, new IStrategoTerm[]{termFactory.makeAppl(transform._consDeci_1, new IStrategoTerm[]{u_21})})}), termFactory.makeListCons(e_22, (IStrategoList)transform.constNil0)), transform.constNone0, transform.constVoid0, termFactory.makeAppl(transform._consId_1, new IStrategoTerm[]{term}), transform.constNil0, transform.constNone0}), termFactory.makeAppl(transform._consBlock_1, new IStrategoTerm[]{y_21})}), (IStrategoList)transform.constNil0), (IStrategoList)transform.constNil0));
        term = concat_0_0.instance.invoke(context, term);
        if(term == null)
          break Fail27;
        term = termFactory.makeAppl(transform._consClassDec_2, new IStrategoTerm[]{termFactory.makeAppl(transform._consClassDecHead_5, new IStrategoTerm[]{transform.constNil0, termFactory.makeAppl(transform._consId_1, new IStrategoTerm[]{t_21}), transform.constNone0, transform.constNone0, transform.constNone0}), termFactory.makeAppl(transform._consClassBody_1, new IStrategoTerm[]{term})});
        context.popOnSuccess();
        if(true)
          return term;
      }
      context.popOnFailure();
      return null;
    }
  }

  @SuppressWarnings("all") public static class gen_method_annotation_0_0 extends Strategy 
  { 
    public static gen_method_annotation_0_0 instance = new gen_method_annotation_0_0();

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      ITermFactory termFactory = context.getFactory();
      context.push("gen_method_annotation_0_0");
      Fail28:
      { 
        IStrategoTerm j_22 = null;
        IStrategoTerm k_22 = null;
        IStrategoTerm l_22 = null;
        IStrategoTerm m_22 = null;
        if(term.getTermType() != IStrategoTerm.APPL || transform._consExplicitJoinPoint_3 != ((IStrategoAppl)term).getConstructor())
          break Fail28;
        k_22 = term.getSubterm(0);
        IStrategoTerm arg55 = term.getSubterm(1);
        if(arg55.getTermType() != IStrategoTerm.APPL || transform._consId_1 != ((IStrategoAppl)arg55).getConstructor())
          break Fail28;
        l_22 = arg55.getSubterm(0);
        j_22 = term.getSubterm(2);
        term = map_1_0.instance.invoke(context, j_22, fetch_type_0_0.instance);
        if(term == null)
          break Fail28;
        m_22 = term;
        term = pp_aspectj_string_0_0.instance.invoke(context, k_22);
        if(term == null)
          break Fail28;
        term = termFactory.makeAppl(transform._consAnno_2, new IStrategoTerm[]{transform.constTypeName2, (IStrategoTerm)termFactory.makeListCons(termFactory.makeAppl(transform._consElemValPair_2, new IStrategoTerm[]{transform.constId5, termFactory.makeAppl(transform._consElemValArrayInit_1, new IStrategoTerm[]{m_22})}), termFactory.makeListCons(termFactory.makeAppl(transform._consElemValPair_2, new IStrategoTerm[]{transform.constId4, termFactory.makeAppl(transform._consLit_1, new IStrategoTerm[]{termFactory.makeAppl(transform._consString_1, new IStrategoTerm[]{(IStrategoTerm)termFactory.makeListCons(termFactory.makeAppl(transform._consChars_1, new IStrategoTerm[]{term}), (IStrategoList)transform.constNil0)})})}), termFactory.makeListCons(termFactory.makeAppl(transform._consElemValPair_2, new IStrategoTerm[]{transform.constId3, termFactory.makeAppl(transform._consLit_1, new IStrategoTerm[]{termFactory.makeAppl(transform._consString_1, new IStrategoTerm[]{(IStrategoTerm)termFactory.makeListCons(termFactory.makeAppl(transform._consChars_1, new IStrategoTerm[]{l_22}), (IStrategoList)transform.constNil0)})})}), (IStrategoList)transform.constNil0)))});
        context.popOnSuccess();
        if(true)
          return term;
      }
      context.popOnFailure();
      return null;
    }
  }

  @SuppressWarnings("all") public static class gen_compact_var_declaration_0_2 extends Strategy 
  { 
    public static gen_compact_var_declaration_0_2 instance = new gen_compact_var_declaration_0_2();

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm q_22, IStrategoTerm ref_r_22)
    { 
      TermReference r_22 = new TermReference(ref_r_22);
      context.push("gen_compact_var_declaration_0_2");
      Fail29:
      { 
        TermReference s_22 = new TermReference();
        term = new_hashtable_0_0.instance.invoke(context, term);
        if(term == null)
          break Fail29;
        if(s_22.value == null)
          s_22.value = term;
        else
          if(s_22.value != term && !s_22.value.match(term))
            break Fail29;
        term = iset_elements_0_0.instance.invoke(context, q_22);
        if(term == null)
          break Fail29;
        lifted33 lifted330 = new lifted33();
        lifted330.s_22 = s_22;
        lifted330.r_22 = r_22;
        term = map_1_0.instance.invoke(context, term, lifted330);
        if(term == null)
          break Fail29;
        if(s_22.value == null)
          break Fail29;
        term = hashtable_keys_0_0.instance.invoke(context, s_22.value);
        if(term == null)
          break Fail29;
        lifted34 lifted340 = new lifted34();
        lifted340.s_22 = s_22;
        term = map_1_0.instance.invoke(context, term, lifted340);
        if(term == null)
          break Fail29;
        context.popOnSuccess();
        if(true)
          return term;
      }
      context.popOnFailure();
      return null;
    }
  }

  @SuppressWarnings("all") public static class gen_before_call_assignments_0_2 extends Strategy 
  { 
    public static gen_before_call_assignments_0_2 instance = new gen_before_call_assignments_0_2();

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm c_23, IStrategoTerm ref_d_23)
    { 
      TermReference d_23 = new TermReference(ref_d_23);
      context.push("gen_before_call_assignments_0_2");
      Fail30:
      { 
        term = iset_elements_0_0.instance.invoke(context, c_23);
        if(term == null)
          break Fail30;
        lifted36 lifted360 = new lifted36();
        lifted360.d_23 = d_23;
        term = map_1_0.instance.invoke(context, term, lifted360);
        if(term == null)
          break Fail30;
        context.popOnSuccess();
        if(true)
          return term;
      }
      context.popOnFailure();
      return null;
    }
  }

  @SuppressWarnings("all") public static class gen_after_call_simple_assignments_0_2 extends Strategy 
  { 
    public static gen_after_call_simple_assignments_0_2 instance = new gen_after_call_simple_assignments_0_2();

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm f_23, IStrategoTerm ref_g_23)
    { 
      TermReference g_23 = new TermReference(ref_g_23);
      context.push("gen_after_call_simple_assignments_0_2");
      Fail31:
      { 
        term = iset_elements_0_0.instance.invoke(context, f_23);
        if(term == null)
          break Fail31;
        lifted37 lifted370 = new lifted37();
        lifted370.g_23 = g_23;
        term = map_1_0.instance.invoke(context, term, lifted370);
        if(term == null)
          break Fail31;
        context.popOnSuccess();
        if(true)
          return term;
      }
      context.popOnFailure();
      return null;
    }
  }

  @SuppressWarnings("all") public static class gen_after_call_assignments_with_declarations_0_2 extends Strategy 
  { 
    public static gen_after_call_assignments_with_declarations_0_2 instance = new gen_after_call_assignments_with_declarations_0_2();

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm ref_i_23, IStrategoTerm ref_j_23)
    { 
      TermReference i_23 = new TermReference(ref_i_23);
      TermReference j_23 = new TermReference(ref_j_23);
      context.push("gen_after_call_assignments_with_declarations_0_2");
      Fail32:
      { 
        if(i_23.value == null)
          break Fail32;
        term = hashtable_keys_0_0.instance.invoke(context, i_23.value);
        if(term == null)
          break Fail32;
        lifted38 lifted380 = new lifted38();
        lifted380.i_23 = i_23;
        lifted380.j_23 = j_23;
        term = map_1_0.instance.invoke(context, term, lifted380);
        if(term == null)
          break Fail32;
        context.popOnSuccess();
        if(true)
          return term;
      }
      context.popOnFailure();
      return null;
    }
  }

  @SuppressWarnings("all") public static class create_method_invokation_0_2 extends Strategy 
  { 
    public static create_method_invokation_0_2 instance = new create_method_invokation_0_2();

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm n_23, IStrategoTerm o_23)
    { 
      ITermFactory termFactory = context.getFactory();
      context.push("create_method_invokation_0_2");
      Fail33:
      { 
        term = o_23;
        if(term.getTermType() != IStrategoTerm.APPL || transform._consExplicitJoinPoint_3 != ((IStrategoAppl)term).getConstructor())
          break Fail33;
        term = gen__ejpscope__method__name_0_0.instance.invoke(context, o_23);
        if(term == null)
          break Fail33;
        term = termFactory.makeAppl(transform._consInvoke_2, new IStrategoTerm[]{termFactory.makeAppl(transform._consMethod_1, new IStrategoTerm[]{termFactory.makeAppl(transform._consMethodName_2, new IStrategoTerm[]{termFactory.makeAppl(transform._consAmbName_1, new IStrategoTerm[]{termFactory.makeAppl(transform._consId_1, new IStrategoTerm[]{n_23})}), termFactory.makeAppl(transform._consId_1, new IStrategoTerm[]{term})})}), transform.constNil0});
        context.popOnSuccess();
        if(true)
          return term;
      }
      context.popOnFailure();
      return null;
    }
  }

  @SuppressWarnings("all") public static class create_method_invokation_0_1 extends Strategy 
  { 
    public static create_method_invokation_0_1 instance = new create_method_invokation_0_1();

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm r_23)
    { 
      ITermFactory termFactory = context.getFactory();
      context.push("create_method_invokation_0_1");
      Fail34:
      { 
        IStrategoTerm s_23 = null;
        IStrategoTerm t_23 = null;
        IStrategoTerm u_23 = null;
        term = r_23;
        if(term.getTermType() != IStrategoTerm.APPL || transform._consExplicitJoinPoint_3 != ((IStrategoAppl)term).getConstructor())
          break Fail34;
        s_23 = term.getSubterm(0);
        t_23 = term.getSubterm(1);
        u_23 = term.getSubterm(2);
        term = typename__2__ambname_0_0.instance.invoke(context, s_23);
        if(term == null)
          break Fail34;
        term = termFactory.makeAppl(transform._consInvoke_2, new IStrategoTerm[]{termFactory.makeAppl(transform._consMethod_1, new IStrategoTerm[]{termFactory.makeAppl(transform._consMethodName_2, new IStrategoTerm[]{term, t_23})}), u_23});
        context.popOnSuccess();
        if(true)
          return term;
      }
      context.popOnFailure();
      return null;
    }
  }

  @SuppressWarnings("all") public static class remove_scoped_ejp_var_decs_0_0 extends Strategy 
  { 
    public static remove_scoped_ejp_var_decs_0_0 instance = new remove_scoped_ejp_var_decs_0_0();

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      context.push("remove_scoped_ejp_var_decs_0_0");
      Fail35:
      { 
        IStrategoTerm x_23 = null;
        x_23 = term;
        term = allow_extends_1_1.instance.invoke(context, term, remove_vars_decs_from_local_var_dec_stm_0_0.instance, x_23);
        if(term == null)
          break Fail35;
        context.popOnSuccess();
        if(true)
          return term;
      }
      context.popOnFailure();
      return null;
    }
  }

  @SuppressWarnings("all") public static class ejp_call_to_method_invokation_0_4 extends Strategy 
  { 
    public static ejp_call_to_method_invokation_0_4 instance = new ejp_call_to_method_invokation_0_4();

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm e_24, IStrategoTerm ref_f_24, IStrategoTerm ref_g_24, IStrategoTerm ref_h_24)
    { 
      ITermFactory termFactory = context.getFactory();
      TermReference f_24 = new TermReference(ref_f_24);
      TermReference g_24 = new TermReference(ref_g_24);
      TermReference h_24 = new TermReference(ref_h_24);
      context.push("ejp_call_to_method_invokation_0_4");
      Fail36:
      { 
        TermReference i_24 = new TermReference();
        IStrategoTerm j_24 = null;
        TermReference m_24 = new TermReference();
        IStrategoTerm n_24 = null;
        IStrategoTerm q_24 = null;
        if(term.getTermType() != IStrategoTerm.APPL || transform._consEJPCall_2 != ((IStrategoAppl)term).getConstructor())
          break Fail36;
        if(m_24.value == null)
          m_24.value = term.getSubterm(0);
        else
          if(m_24.value != term.getSubterm(0) && !m_24.value.match(term.getSubterm(0)))
            break Fail36;
        j_24 = term.getSubterm(1);
        q_24 = term;
        IStrategoTerm term19 = term;
        Success19:
        { 
          Fail37:
          { 
            term = random_string_0_0.instance.invoke(context, term);
            if(term == null)
              break Fail37;
            if(i_24.value == null)
              i_24.value = term;
            else
              if(i_24.value != term && !i_24.value.match(term))
                break Fail37;
            term = j_24;
            lifted40 lifted400 = new lifted40();
            lifted400.f_24 = f_24;
            lifted400.g_24 = g_24;
            lifted400.i_24 = i_24;
            term = topdown_1_0.instance.invoke(context, term, lifted400);
            if(term == null)
              break Fail37;
            term = termFactory.makeAppl(transform._consSome_1, new IStrategoTerm[]{term});
            lifted42 lifted420 = new lifted42();
            lifted420.h_24 = h_24;
            lifted420.m_24 = m_24;
            term = try_1_0.instance.invoke(context, term, lifted420);
            if(term == null)
              break Fail37;
            term = create_method_invokation_0_1.instance.invoke(context, term, m_24.value);
            if(term == null)
              break Fail37;
            n_24 = term;
            if(true)
              break Success19;
          }
          term = term19;
          IStrategoTerm o_24 = null;
          IStrategoTerm p_24 = null;
          IStrategoTerm w_24 = null;
          o_24 = term;
          term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
          if(term == null)
            break Fail36;
          p_24 = term;
          w_24 = o_24;
          term = report_with_failure_0_2.instance.invoke(context, w_24, transform.const7, p_24);
          if(term == null)
            break Fail36;
        }
        term = q_24;
        if(n_24 == null)
          break Fail36;
        term = n_24;
        context.popOnSuccess();
        if(true)
          return term;
      }
      context.popOnFailure();
      return null;
    }
  }

  @SuppressWarnings("all") public static class scoped_ejp_to_java_0_4 extends Strategy 
  { 
    public static scoped_ejp_to_java_0_4 instance = new scoped_ejp_to_java_0_4();

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm z_24, IStrategoTerm ref_a_25, IStrategoTerm ref_b_25, IStrategoTerm ref_c_25)
    { 
      ITermFactory termFactory = context.getFactory();
      TermReference a_25 = new TermReference(ref_a_25);
      TermReference b_25 = new TermReference(ref_b_25);
      TermReference c_25 = new TermReference(ref_c_25);
      context.push("scoped_ejp_to_java_0_4");
      Fail38:
      { 
        IStrategoTerm d_25 = null;
        TermReference f_25 = new TermReference();
        IStrategoTerm g_25 = null;
        IStrategoTerm h_25 = null;
        TermReference i_25 = new TermReference();
        IStrategoTerm k_25 = null;
        IStrategoTerm l_25 = null;
        IStrategoTerm m_25 = null;
        IStrategoTerm n_25 = null;
        IStrategoTerm o_25 = null;
        IStrategoTerm r_25 = null;
        TermReference s_25 = new TermReference();
        IStrategoTerm t_25 = null;
        IStrategoTerm u_25 = null;
        TermReference v_25 = new TermReference();
        IStrategoTerm w_25 = null;
        IStrategoTerm z_25 = null;
        IStrategoTerm u_27 = null;
        IStrategoTerm v_27 = null;
        IStrategoTerm w_27 = null;
        IStrategoTerm x_27 = null;
        if(term.getTermType() != IStrategoTerm.APPL || transform._consScopedEJPCall_3 != ((IStrategoAppl)term).getConstructor())
          break Fail38;
        if(v_25.value == null)
          v_25.value = term.getSubterm(0);
        else
          if(v_25.value != term.getSubterm(0) && !v_25.value.match(term.getSubterm(0)))
            break Fail38;
        d_25 = term.getSubterm(1);
        IStrategoTerm arg59 = term.getSubterm(2);
        if(arg59.getTermType() != IStrategoTerm.APPL || transform._consBlock_1 != ((IStrategoAppl)arg59).getConstructor())
          break Fail38;
        g_25 = arg59.getSubterm(0);
        z_25 = term;
        IStrategoTerm term20 = term;
        Success20:
        { 
          Fail39:
          { 
            IStrategoTerm j_26 = null;
            IStrategoTerm k_26 = null;
            IStrategoTerm n_26 = null;
            IStrategoTerm p_26 = null;
            IStrategoTerm v_26 = null;
            IStrategoTerm x_26 = null;
            IStrategoTerm z_26 = null;
            IStrategoTerm o_27 = null;
            term = random_string_0_0.instance.invoke(context, term);
            if(term == null)
              break Fail39;
            if(i_25.value == null)
              i_25.value = term;
            else
              if(i_25.value != term && !i_25.value.match(term))
                break Fail39;
            term = d_25;
            lifted43 lifted430 = new lifted43();
            lifted430.a_25 = a_25;
            lifted430.b_25 = b_25;
            lifted430.i_25 = i_25;
            term = topdown_1_0.instance.invoke(context, term, lifted430);
            if(term == null)
              break Fail39;
            lifted45 lifted450 = new lifted45();
            lifted450.c_25 = c_25;
            lifted450.v_25 = v_25;
            term = try_1_0.instance.invoke(context, term, lifted450);
            if(term == null)
              break Fail39;
            term = new_iset_0_0.instance.invoke(context, term);
            if(term == null)
              break Fail39;
            if(f_25.value == null)
              f_25.value = term;
            else
              if(f_25.value != term && !f_25.value.match(term))
                break Fail39;
            term = g_25;
            lifted46 lifted460 = new lifted46();
            lifted460.f_25 = f_25;
            term = topdown_1_0.instance.invoke(context, term, lifted460);
            if(term == null)
              break Fail39;
            term = new_hashtable_0_0.instance.invoke(context, term);
            if(term == null)
              break Fail39;
            if(s_25.value == null)
              s_25.value = term;
            else
              if(s_25.value != term && !s_25.value.match(term))
                break Fail39;
            term = get_inner_scoped_vars_0_1.instance.invoke(context, g_25, s_25.value);
            if(term == null)
              break Fail39;
            term = new_iset_0_0.instance.invoke(context, term);
            if(term == null)
              break Fail39;
            j_26 = term;
            term = hashtable_keys_0_0.instance.invoke(context, z_24);
            if(term == null)
              break Fail39;
            term = iset_addlist_0_1.instance.invoke(context, j_26, term);
            if(term == null)
              break Fail39;
            term = iset_isect_0_1.instance.invoke(context, term, f_25.value);
            if(term == null)
              break Fail39;
            r_25 = term;
            term = new_iset_0_0.instance.invoke(context, term);
            if(term == null)
              break Fail39;
            k_26 = term;
            h_25 = term;
            n_26 = k_26;
            term = iset_elements_0_0.instance.invoke(context, r_25);
            if(term == null)
              break Fail39;
            term = iset_addlist_0_1.instance.invoke(context, n_26, term);
            if(term == null)
              break Fail39;
            term = h_25;
            p_26 = h_25;
            if(s_25.value == null)
              break Fail39;
            term = hashtable_keys_0_0.instance.invoke(context, s_25.value);
            if(term == null)
              break Fail39;
            term = iset_addlist_0_1.instance.invoke(context, p_26, term);
            if(term == null)
              break Fail39;
            term = gen_auxilary_class_name_0_0.instance.invoke(context, term);
            if(term == null)
              break Fail39;
            l_25 = term;
            term = my_hashtable_union_0_1.instance.invoke(context, z_24, s_25.value);
            if(term == null)
              break Fail39;
            z_26 = term;
            term = remove_scoped_ejp_var_decs_0_0.instance.invoke(context, g_25);
            if(term == null)
              break Fail39;
            x_26 = term;
            term = z_26;
            lifted48 lifted480 = new lifted48();
            lifted480.s_25 = s_25;
            lifted480.a_25 = a_25;
            lifted480.b_25 = b_25;
            lifted480.c_25 = c_25;
            term = allow_extends_1_1.instance.invoke(context, term, lifted480, x_26);
            if(term == null)
              break Fail39;
            v_26 = term;
            term = gen_auxilery_class_0_5.instance.invoke(context, v_26, h_25, z_24, v_25.value, l_25, i_25.value);
            if(term == null)
              break Fail39;
            k_25 = term;
            term = (IStrategoTerm)termFactory.makeListCons(l_25, (IStrategoList)transform.constCons0);
            term = concat_strings_0_0.instance.invoke(context, term);
            if(term == null)
              break Fail39;
            u_25 = term;
            term = termFactory.makeAppl(transform._consLocalVarDecStm_1, new IStrategoTerm[]{termFactory.makeAppl(transform._consLocalVarDec_3, new IStrategoTerm[]{transform.constCons1, termFactory.makeAppl(transform._consClassOrInterfaceType_2, new IStrategoTerm[]{termFactory.makeAppl(transform._consTypeName_1, new IStrategoTerm[]{termFactory.makeAppl(transform._consId_1, new IStrategoTerm[]{l_25})}), transform.constNone0}), (IStrategoTerm)termFactory.makeListCons(termFactory.makeAppl(transform._consVarDec_2, new IStrategoTerm[]{termFactory.makeAppl(transform._consId_1, new IStrategoTerm[]{term}), termFactory.makeAppl(transform._consNewInstance_4, new IStrategoTerm[]{transform.constNone0, termFactory.makeAppl(transform._consClassOrInterfaceType_2, new IStrategoTerm[]{termFactory.makeAppl(transform._consTypeName_1, new IStrategoTerm[]{termFactory.makeAppl(transform._consId_1, new IStrategoTerm[]{l_25})}), transform.constNone0}), transform.constNil0, transform.constNone0})}), (IStrategoList)transform.constNil0)})});
            m_25 = term;
            term = gen_before_call_assignments_0_2.instance.invoke(context, term, r_25, u_25);
            if(term == null)
              break Fail39;
            n_25 = term;
            term = gen_after_call_simple_assignments_0_2.instance.invoke(context, term, r_25, u_25);
            if(term == null)
              break Fail39;
            o_25 = term;
            o_27 = term;
            if(s_25.value == null)
              break Fail39;
            term = my_hashtable_remove_0_1.instance.invoke(context, s_25.value, r_25);
            if(term == null)
              break Fail39;
            term = gen_after_call_assignments_with_declarations_0_2.instance.invoke(context, o_27, term, u_25);
            if(term == null)
              break Fail39;
            t_25 = term;
            term = create_method_invokation_0_2.instance.invoke(context, term, u_25, v_25.value);
            if(term == null)
              break Fail39;
            w_25 = term;
            if(true)
              break Success20;
          }
          term = term20;
          IStrategoTerm x_25 = null;
          IStrategoTerm y_25 = null;
          IStrategoTerm t_27 = null;
          x_25 = term;
          term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
          if(term == null)
            break Fail38;
          y_25 = term;
          t_27 = x_25;
          term = report_with_failure_0_2.instance.invoke(context, t_27, transform.const9, y_25);
          if(term == null)
            break Fail38;
        }
        term = z_25;
        v_27 = z_25;
        x_27 = term;
        if(o_25 == null || t_25 == null)
          break Fail38;
        term = termFactory.makeTuple(o_25, termFactory.annotateTerm(t_25, checkListAnnos(termFactory, transform.constNil0)));
        term = make$Conc_0_0.instance.invoke(context, term);
        if(term == null)
          break Fail38;
        w_27 = term;
        term = x_27;
        if(n_25 == null || w_25 == null)
          break Fail38;
        IStrategoList list0;
        list0 = checkListTail(w_27);
        if(list0 == null)
          break Fail38;
        term = termFactory.makeTuple(n_25, (IStrategoTerm)termFactory.makeListCons(termFactory.makeAppl(transform._consExprStm_1, new IStrategoTerm[]{w_25}), list0));
        term = make$Conc_0_0.instance.invoke(context, term);
        if(term == null)
          break Fail38;
        u_27 = term;
        term = v_27;
        if(k_25 == null || m_25 == null)
          break Fail38;
        IStrategoList list1;
        list1 = checkListTail(u_27);
        if(list1 == null)
          break Fail38;
        term = (IStrategoTerm)termFactory.makeListCons(termFactory.makeAppl(transform._consClassDecStm_1, new IStrategoTerm[]{k_25}), termFactory.makeListCons(m_25, list1));
        context.popOnSuccess();
        if(true)
          return term;
      }
      context.popOnFailure();
      return null;
    }
  }

  @SuppressWarnings("all") public static class handle_pointcutargs_0_2 extends Strategy 
  { 
    public static handle_pointcutargs_0_2 instance = new handle_pointcutargs_0_2();

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm ref_y_27, IStrategoTerm ref_z_27)
    { 
      TermReference y_27 = new TermReference(ref_y_27);
      TermReference z_27 = new TermReference(ref_z_27);
      context.push("handle_pointcutargs_0_2");
      Fail40:
      { 
        IStrategoTerm a_28 = null;
        if(term.getTermType() != IStrategoTerm.APPL || transform._consSome_1 != ((IStrategoAppl)term).getConstructor())
          break Fail40;
        IStrategoTerm arg60 = term.getSubterm(0);
        if(arg60.getTermType() != IStrategoTerm.APPL || transform._consPointcutargs_1 != ((IStrategoAppl)arg60).getConstructor())
          break Fail40;
        a_28 = arg60.getSubterm(0);
        term = a_28;
        lifted49 lifted490 = new lifted49();
        lifted490.z_27 = z_27;
        term = map_1_0.instance.invoke(context, term, lifted490);
        if(term == null)
          break Fail40;
        lifted50 lifted500 = new lifted50();
        lifted500.y_27 = y_27;
        term = map_1_0.instance.invoke(context, term, lifted500);
        if(term == null)
          break Fail40;
        context.popOnSuccess();
        if(true)
          return term;
      }
      context.popOnFailure();
      return null;
    }
  }

  @SuppressWarnings("all") public static class handle_pointcutarg_helper_0_1 extends Strategy 
  { 
    public static handle_pointcutarg_helper_0_1 instance = new handle_pointcutarg_helper_0_1();

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm c_28)
    { 
      ITermFactory termFactory = context.getFactory();
      context.push("handle_pointcutarg_helper_0_1");
      Fail41:
      { 
        IStrategoTerm e_28 = null;
        IStrategoTerm f_28 = null;
        IStrategoTerm g_28 = null;
        IStrategoTerm i_28 = null;
        IStrategoTerm j_28 = null;
        IStrategoTerm k_28 = null;
        IStrategoTerm n_28 = null;
        IStrategoTerm l_28 = null;
        IStrategoTerm p_28 = null;
        if(term.getTermType() != IStrategoTerm.APPL || transform._consPointcutarg_3 != ((IStrategoAppl)term).getConstructor())
          break Fail41;
        IStrategoTerm arg61 = term.getSubterm(0);
        if(arg61.getTermType() != IStrategoTerm.APPL || transform._consId_1 != ((IStrategoAppl)arg61).getConstructor())
          break Fail41;
        g_28 = arg61.getSubterm(0);
        j_28 = term.getSubterm(1);
        i_28 = term.getSubterm(2);
        term = c_28;
        if(term.getTermType() != IStrategoTerm.APPL || transform._consExplicitJoinPoint_3 != ((IStrategoAppl)term).getConstructor())
          break Fail41;
        e_28 = term.getSubterm(0);
        IStrategoTerm arg62 = term.getSubterm(1);
        if(arg62.getTermType() != IStrategoTerm.APPL || transform._consId_1 != ((IStrategoAppl)arg62).getConstructor())
          break Fail41;
        f_28 = arg62.getSubterm(0);
        n_28 = term;
        term = pp_aspectj_string_0_0.instance.invoke(context, e_28);
        if(term == null)
          break Fail41;
        k_28 = term;
        p_28 = n_28;
        term = pp_aspectj_string_0_0.instance.invoke(context, i_28);
        if(term == null)
          break Fail41;
        l_28 = term;
        term = p_28;
        term = random_string_0_0.instance.invoke(context, term);
        if(term == null)
          break Fail41;
        term = (IStrategoTerm)termFactory.makeListCons(transform.const10, termFactory.makeListCons(term, (IStrategoList)transform.constNil0));
        term = concat_strings_0_0.instance.invoke(context, term);
        if(term == null)
          break Fail41;
        term = termFactory.makeAppl(transform._consMethodDec_2, new IStrategoTerm[]{termFactory.makeAppl(transform._consMethodDecHead_6, new IStrategoTerm[]{(IStrategoTerm)termFactory.makeListCons(termFactory.makeAppl(transform._consAnno_2, new IStrategoTerm[]{transform.constTypeName3, (IStrategoTerm)termFactory.makeListCons(termFactory.makeAppl(transform._consElemValPair_2, new IStrategoTerm[]{transform.constId4, termFactory.makeAppl(transform._consLit_1, new IStrategoTerm[]{termFactory.makeAppl(transform._consString_1, new IStrategoTerm[]{(IStrategoTerm)termFactory.makeListCons(termFactory.makeAppl(transform._consChars_1, new IStrategoTerm[]{k_28}), (IStrategoList)transform.constNil0)})})}), termFactory.makeListCons(termFactory.makeAppl(transform._consElemValPair_2, new IStrategoTerm[]{transform.constId3, termFactory.makeAppl(transform._consLit_1, new IStrategoTerm[]{termFactory.makeAppl(transform._consString_1, new IStrategoTerm[]{(IStrategoTerm)termFactory.makeListCons(termFactory.makeAppl(transform._consChars_1, new IStrategoTerm[]{f_28}), (IStrategoList)transform.constNil0)})})}), termFactory.makeListCons(termFactory.makeAppl(transform._consElemValPair_2, new IStrategoTerm[]{transform.constId8, termFactory.makeAppl(transform._consLit_1, new IStrategoTerm[]{termFactory.makeAppl(transform._consString_1, new IStrategoTerm[]{(IStrategoTerm)termFactory.makeListCons(termFactory.makeAppl(transform._consChars_1, new IStrategoTerm[]{g_28}), (IStrategoList)transform.constNil0)})})}), termFactory.makeListCons(termFactory.makeAppl(transform._consElemValPair_2, new IStrategoTerm[]{transform.constId7, termFactory.makeAppl(transform._consLit_1, new IStrategoTerm[]{termFactory.makeAppl(transform._consString_1, new IStrategoTerm[]{(IStrategoTerm)termFactory.makeListCons(termFactory.makeAppl(transform._consChars_1, new IStrategoTerm[]{l_28}), (IStrategoList)transform.constNil0)})})}), (IStrategoList)transform.constNil0))))}), (IStrategoList)transform.constNil0), transform.constNone0, transform.constVoid0, termFactory.makeAppl(transform._consId_1, new IStrategoTerm[]{term}), j_28, transform.constNone0}), transform.constBlock0});
        context.popOnSuccess();
        if(true)
          return term;
      }
      context.popOnFailure();
      return null;
    }
  }

  @SuppressWarnings("all") public static class get_inner_scoped_vars_0_1 extends Strategy 
  { 
    public static get_inner_scoped_vars_0_1 instance = new get_inner_scoped_vars_0_1();

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm ref_u_28)
    { 
      TermReference u_28 = new TermReference(ref_u_28);
      context.push("get_inner_scoped_vars_0_1");
      Fail42:
      { 
        IStrategoTerm x_28 = null;
        IStrategoTerm y_28 = null;
        y_28 = term;
        x_28 = term;
        term = y_28;
        lifted51 lifted511 = new lifted51();
        lifted511.u_28 = u_28;
        term = SRTS_all.instance.invoke(context, term, lifted511);
        if(term == null)
          break Fail42;
        term = x_28;
        context.popOnSuccess();
        if(true)
          return term;
      }
      context.popOnFailure();
      return null;
    }
  }

  @SuppressWarnings("all") public static class remove_vars_decs_from_local_var_dec_stm_0_0 extends Strategy 
  { 
    public static remove_vars_decs_from_local_var_dec_stm_0_0 instance = new remove_vars_decs_from_local_var_dec_stm_0_0();

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      context.push("remove_vars_decs_from_local_var_dec_stm_0_0");
      Fail43:
      { 
        IStrategoTerm e_29 = null;
        IStrategoTerm f_29 = null;
        IStrategoTerm i_29 = null;
        if(term.getTermType() != IStrategoTerm.APPL || transform._consLocalVarDecStm_1 != ((IStrategoAppl)term).getConstructor())
          break Fail43;
        IStrategoTerm arg63 = term.getSubterm(0);
        if(arg63.getTermType() != IStrategoTerm.APPL || transform._consLocalVarDec_3 != ((IStrategoAppl)arg63).getConstructor())
          break Fail43;
        e_29 = arg63.getSubterm(2);
        i_29 = term;
        IStrategoTerm term21 = term;
        Success21:
        { 
          Fail44:
          { 
            term = allow_extends_1_1.instance.invoke(context, term, remove_var_dec_0_0.instance, e_29);
            if(term == null)
              break Fail44;
            f_29 = term;
            if(true)
              break Success21;
          }
          term = term21;
          IStrategoTerm g_29 = null;
          IStrategoTerm h_29 = null;
          IStrategoTerm m_29 = null;
          g_29 = term;
          term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
          if(term == null)
            break Fail43;
          h_29 = term;
          m_29 = g_29;
          term = report_with_failure_0_2.instance.invoke(context, m_29, transform.const13, h_29);
          if(term == null)
            break Fail43;
        }
        term = i_29;
        if(f_29 == null)
          break Fail43;
        term = f_29;
        context.popOnSuccess();
        if(true)
          return term;
      }
      context.popOnFailure();
      return null;
    }
  }

  @SuppressWarnings("all") public static class remove_var_dec_0_0 extends Strategy 
  { 
    public static remove_var_dec_0_0 instance = new remove_var_dec_0_0();

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      ITermFactory termFactory = context.getFactory();
      Fail45:
      { 
        IStrategoTerm term22 = term;
        IStrategoConstructor cons4 = term.getTermType() == IStrategoTerm.APPL ? ((IStrategoAppl)term).getConstructor() : null;
        Success22:
        { 
          if(cons4 == transform._consVarDec_1)
          { 
            Fail46:
            { 
              term = transform.constNone0;
              if(true)
                break Success22;
            }
            term = term22;
          }
          if(cons4 == transform._consVarDec_2)
          { 
            IStrategoTerm n_29 = null;
            IStrategoTerm o_29 = null;
            n_29 = term.getSubterm(0);
            o_29 = term.getSubterm(1);
            term = termFactory.makeAppl(transform._consExprStm_1, new IStrategoTerm[]{termFactory.makeAppl(transform._consAssign_2, new IStrategoTerm[]{termFactory.makeAppl(transform._consExprName_1, new IStrategoTerm[]{n_29}), o_29})});
          }
          else
          { 
            break Fail45;
          }
        }
        if(true)
          return term;
      }
      context.push("remove_var_dec_0_0");
      context.popOnFailure();
      return null;
    }
  }

  @SuppressWarnings("all") public static class pointcutarg_0_3 extends Strategy 
  { 
    public static pointcutarg_0_3 instance = new pointcutarg_0_3();

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm c_72, IStrategoTerm d_72, IStrategoTerm e_72)
    { 
      ITermFactory termFactory = context.getFactory();
      Fail47:
      { 
        IStrategoTerm term23 = term;
        IStrategoConstructor cons5 = term.getTermType() == IStrategoTerm.APPL ? ((IStrategoAppl)term).getConstructor() : null;
        Success23:
        { 
          if(cons5 == transform._consThisClass_0)
          { 
            Fail48:
            { 
              term = termFactory.makeAppl(transform._consWithin_1, new IStrategoTerm[]{termFactory.makeAppl(transform._consAnnoTypePattern_2, new IStrategoTerm[]{termFactory.makeAppl(transform._consAnnoPattern_1, new IStrategoTerm[]{(IStrategoTerm)termFactory.makeListCons(termFactory.makeAppl(transform._consSimpleAnnoPatternValue_2, new IStrategoTerm[]{transform.constTypeName4, termFactory.makeAppl(transform._consLit_1, new IStrategoTerm[]{termFactory.makeAppl(transform._consDeci_1, new IStrategoTerm[]{c_72})})}), (IStrategoList)transform.constNil0)}), transform.constRefTypePattern0})});
              if(true)
                break Success23;
            }
            term = term23;
          }
          Success24:
          { 
            if(cons5 == transform._consThisMethod_0)
            { 
              Fail49:
              { 
                term = termFactory.makeAppl(transform._consMethodPattern_6, new IStrategoTerm[]{termFactory.makeAppl(transform._consAnnoPattern_1, new IStrategoTerm[]{(IStrategoTerm)termFactory.makeListCons(termFactory.makeAppl(transform._consSimpleAnnoPatternValue_2, new IStrategoTerm[]{transform.constTypeName5, termFactory.makeAppl(transform._consLit_1, new IStrategoTerm[]{termFactory.makeAppl(transform._consDeci_1, new IStrategoTerm[]{d_72})})}), (IStrategoList)transform.constNil0)}), transform.constModPattern0, transform.constRefTypePattern0, transform.constMemberName0, transform.constCons2, transform.constNone0});
                if(true)
                  break Success24;
              }
              term = term23;
            }
            if(cons5 == transform._consThisBlock_0)
            { 
              term = termFactory.makeAppl(transform._consMethodPattern_6, new IStrategoTerm[]{termFactory.makeAppl(transform._consAnnoPattern_1, new IStrategoTerm[]{(IStrategoTerm)termFactory.makeListCons(termFactory.makeAppl(transform._consSimpleAnnoPatternValue_2, new IStrategoTerm[]{transform.constTypeName6, termFactory.makeAppl(transform._consLit_1, new IStrategoTerm[]{termFactory.makeAppl(transform._consDeci_1, new IStrategoTerm[]{e_72})})}), (IStrategoList)transform.constNil0)}), transform.constModPattern0, transform.constRefTypePattern0, transform.constMemberName0, transform.constCons2, transform.constNone0});
            }
            else
            { 
              break Fail47;
            }
          }
        }
        if(true)
          return term;
      }
      context.push("pointcutarg_0_3");
      context.popOnFailure();
      return null;
    }
  }

  @SuppressWarnings("all") public static class gen__ejp__name_0_0 extends Strategy 
  { 
    public static gen__ejp__name_0_0 instance = new gen__ejp__name_0_0();

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      ITermFactory termFactory = context.getFactory();
      context.push("gen__ejp__name_0_0");
      Fail50:
      { 
        IStrategoTerm term25 = term;
        IStrategoConstructor cons6 = term.getTermType() == IStrategoTerm.APPL ? ((IStrategoAppl)term).getConstructor() : null;
        Success25:
        { 
          if(cons6 == transform._consMemberName_1)
          { 
            Fail51:
            { 
              if(true)
                break Success25;
            }
            term = term25;
          }
          if(cons6 == transform._consMemberName_2)
          { 
            IStrategoTerm z_29 = null;
            IStrategoTerm a_30 = null;
            IStrategoTerm arg67 = term.getSubterm(0);
            if(arg67.getTermType() != IStrategoTerm.APPL || transform._consRefTypePattern_1 != ((IStrategoAppl)arg67).getConstructor())
              break Fail50;
            z_29 = arg67.getSubterm(0);
            a_30 = term.getSubterm(1);
            Success26:
            { 
              Fail52:
              { 
                IStrategoTerm b_30 = null;
                b_30 = term;
                term = termFactory.makeTuple(transform.constNamePattern0, z_29);
                term = equal_0_0.instance.invoke(context, term);
                if(term == null)
                  break Fail52;
                term = b_30;
                { 
                  term = termFactory.makeAppl(transform._consMemberName_1, new IStrategoTerm[]{a_30});
                  if(true)
                    break Success26;
                }
              }
              term = termFactory.makeAppl(transform._consMemberName_2, new IStrategoTerm[]{termFactory.makeAppl(transform._consRefTypePattern_1, new IStrategoTerm[]{z_29}), a_30});
              term = pp_aspectj_string_0_0.instance.invoke(context, term);
              if(term == null)
                break Fail50;
              term = termFactory.makeAppl(transform._consMemberName_1, new IStrategoTerm[]{term});
            }
          }
          else
          { 
            break Fail50;
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

  @SuppressWarnings("all") public static class typename__2__ambname_0_0 extends Strategy 
  { 
    public static typename__2__ambname_0_0 instance = new typename__2__ambname_0_0();

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      ITermFactory termFactory = context.getFactory();
      context.push("typename__2__ambname_0_0");
      Fail53:
      { 
        IStrategoTerm term27 = term;
        IStrategoConstructor cons7 = term.getTermType() == IStrategoTerm.APPL ? ((IStrategoAppl)term).getConstructor() : null;
        Success27:
        { 
          if(cons7 == transform._consTypeName_1)
          { 
            Fail54:
            { 
              IStrategoTerm n_33 = null;
              n_33 = term.getSubterm(0);
              term = termFactory.makeAppl(transform._consAmbName_1, new IStrategoTerm[]{n_33});
              if(true)
                break Success27;
            }
            term = term27;
          }
          Success28:
          { 
            if(cons7 == transform._consTypeName_2)
            { 
              Fail55:
              { 
                IStrategoTerm f_33 = null;
                IStrategoTerm k_33 = null;
                f_33 = term.getSubterm(0);
                k_33 = term.getSubterm(1);
                term = this.invoke(context, f_33);
                if(term == null)
                  break Fail55;
                term = termFactory.makeAppl(transform._consAmbName_2, new IStrategoTerm[]{term, k_33});
                if(true)
                  break Success28;
              }
              term = term27;
            }
            Success29:
            { 
              if(cons7 == transform._consPackageOrTypeName_1)
              { 
                Fail56:
                { 
                  IStrategoTerm e_33 = null;
                  e_33 = term.getSubterm(0);
                  term = termFactory.makeAppl(transform._consAmbName_1, new IStrategoTerm[]{e_33});
                  if(true)
                    break Success29;
                }
                term = term27;
              }
              if(cons7 == transform._consPackageOrTypeName_2)
              { 
                IStrategoTerm n_31 = null;
                IStrategoTerm e_32 = null;
                n_31 = term.getSubterm(0);
                e_32 = term.getSubterm(1);
                term = this.invoke(context, n_31);
                if(term == null)
                  break Fail53;
                term = termFactory.makeAppl(transform._consAmbName_2, new IStrategoTerm[]{term, e_32});
              }
              else
              { 
                break Fail53;
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

  @SuppressWarnings("all") public static class gen__nomatch__pointcut__name_0_0 extends Strategy 
  { 
    public static gen__nomatch__pointcut__name_0_0 instance = new gen__nomatch__pointcut__name_0_0();

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      ITermFactory termFactory = context.getFactory();
      context.push("gen__nomatch__pointcut__name_0_0");
      Fail57:
      { 
        term = random_string_0_0.instance.invoke(context, term);
        if(term == null)
          break Fail57;
        term = (IStrategoTerm)termFactory.makeListCons(transform.const18, termFactory.makeListCons(term, (IStrategoList)transform.constNil0));
        term = concat_strings_0_0.instance.invoke(context, term);
        if(term == null)
          break Fail57;
        context.popOnSuccess();
        if(true)
          return term;
      }
      context.popOnFailure();
      return null;
    }
  }

  @SuppressWarnings("all") public static class gen__ejpscope__method__name_0_2 extends Strategy 
  { 
    public static gen__ejpscope__method__name_0_2 instance = new gen__ejpscope__method__name_0_2();

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm f_72, IStrategoTerm g_72)
    { 
      ITermFactory termFactory = context.getFactory();
      context.push("gen__ejpscope__method__name_0_2");
      Fail58:
      { 
        IStrategoTerm term30 = term;
        IStrategoConstructor cons8 = term.getTermType() == IStrategoTerm.APPL ? ((IStrategoAppl)term).getConstructor() : null;
        Success30:
        { 
          if(cons8 == transform._consMemberName_1)
          { 
            Fail59:
            { 
              IStrategoTerm a_34 = null;
              IStrategoTerm b_34 = null;
              a_34 = term.getSubterm(0);
              Success31:
              { 
                Fail60:
                { 
                  IStrategoTerm c_34 = null;
                  c_34 = term;
                  term = f_72;
                  if(term.getTermType() != IStrategoTerm.APPL || transform._consNone_0 != ((IStrategoAppl)term).getConstructor())
                    break Fail60;
                  term = c_34;
                  { 
                    term = (IStrategoTerm)termFactory.makeListCons(transform.const20, termFactory.makeListCons(g_72, termFactory.makeListCons(transform.const19, termFactory.makeListCons(a_34, (IStrategoList)transform.constNil0))));
                    term = concat_strings_0_0.instance.invoke(context, term);
                    if(term == null)
                      break Fail59;
                    b_34 = term;
                    if(true)
                      break Success31;
                  }
                }
                term = convert_package_name_0_0.instance.invoke(context, f_72);
                if(term == null)
                  break Fail59;
                term = (IStrategoTerm)termFactory.makeListCons(transform.const20, termFactory.makeListCons(term, termFactory.makeListCons(g_72, termFactory.makeListCons(transform.const19, termFactory.makeListCons(a_34, (IStrategoList)transform.constNil0)))));
                term = concat_strings_0_0.instance.invoke(context, term);
                if(term == null)
                  break Fail59;
                b_34 = term;
              }
              term = termFactory.makeAppl(transform._consMemberName_2, new IStrategoTerm[]{transform.constRefTypePattern0, b_34});
              if(true)
                break Success30;
            }
            term = term30;
          }
          if(cons8 == transform._consMemberName_2)
          { 
            term = gen__ejpscope__method__name_0_0.instance.invoke(context, term);
            if(term == null)
              break Fail58;
          }
          else
          { 
            break Fail58;
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

  @SuppressWarnings("all") public static class convert_package_name_0_0 extends Strategy 
  { 
    public static convert_package_name_0_0 instance = new convert_package_name_0_0();

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      context.push("convert_package_name_0_0");
      Fail61:
      { 
        IStrategoTerm f_34 = null;
        if(term.getTermType() != IStrategoTerm.APPL || transform._consPackageName_1 != ((IStrategoAppl)term).getConstructor())
          break Fail61;
        f_34 = term.getSubterm(0);
        term = map_1_0.instance.invoke(context, f_34, lifted54.instance);
        if(term == null)
          break Fail61;
        term = concat_strings_0_0.instance.invoke(context, term);
        if(term == null)
          break Fail61;
        context.popOnSuccess();
        if(true)
          return term;
      }
      context.popOnFailure();
      return null;
    }
  }

  @SuppressWarnings("all") public static class gen__ejpscope__method__name_0_0 extends Strategy 
  { 
    public static gen__ejpscope__method__name_0_0 instance = new gen__ejpscope__method__name_0_0();

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      ITermFactory termFactory = context.getFactory();
      context.push("gen__ejpscope__method__name_0_0");
      Fail62:
      { 
        IStrategoTerm term32 = term;
        IStrategoConstructor cons9 = term.getTermType() == IStrategoTerm.APPL ? ((IStrategoAppl)term).getConstructor() : null;
        Success32:
        { 
          if(cons9 == transform._consExplicitJoinPoint_3)
          { 
            Fail63:
            { 
              IStrategoTerm q_34 = null;
              IStrategoTerm r_34 = null;
              q_34 = term.getSubterm(0);
              IStrategoTerm arg70 = term.getSubterm(1);
              if(arg70.getTermType() != IStrategoTerm.APPL || transform._consId_1 != ((IStrategoAppl)arg70).getConstructor())
                break Fail63;
              r_34 = arg70.getSubterm(0);
              term = gen__ejpscope__method__name__helper_0_0.instance.invoke(context, q_34);
              if(term == null)
                break Fail63;
              term = (IStrategoTerm)termFactory.makeListCons(transform.const20, termFactory.makeListCons(term, termFactory.makeListCons(transform.const19, termFactory.makeListCons(r_34, (IStrategoList)transform.constNil0))));
              term = concat_strings_0_0.instance.invoke(context, term);
              if(term == null)
                break Fail63;
              if(true)
                break Success32;
            }
            term = term32;
          }
          if(cons9 == transform._consMemberName_2)
          { 
            IStrategoTerm h_34 = null;
            IStrategoTerm i_34 = null;
            IStrategoTerm arg72 = term.getSubterm(0);
            if(arg72.getTermType() != IStrategoTerm.APPL || transform._consRefTypePattern_1 != ((IStrategoAppl)arg72).getConstructor())
              break Fail62;
            h_34 = arg72.getSubterm(0);
            i_34 = term.getSubterm(1);
            Success33:
            { 
              Fail64:
              { 
                IStrategoTerm j_34 = null;
                j_34 = term;
                term = termFactory.makeTuple(transform.constNamePattern0, h_34);
                term = equal_0_0.instance.invoke(context, term);
                if(term == null)
                  break Fail64;
                term = j_34;
                { 
                  term = (IStrategoTerm)termFactory.makeListCons(transform.const20, termFactory.makeListCons(i_34, (IStrategoList)transform.constNil0));
                  term = concat_strings_0_0.instance.invoke(context, term);
                  if(term == null)
                    break Fail62;
                  term = termFactory.makeAppl(transform._consMemberName_1, new IStrategoTerm[]{term});
                  if(true)
                    break Success33;
                }
              }
              term = gen__ejpscope__method__name__helper_0_0.instance.invoke(context, h_34);
              if(term == null)
                break Fail62;
              term = (IStrategoTerm)termFactory.makeListCons(transform.const20, termFactory.makeListCons(term, termFactory.makeListCons(transform.const19, termFactory.makeListCons(i_34, (IStrategoList)transform.constNil0))));
              term = concat_strings_0_0.instance.invoke(context, term);
              if(term == null)
                break Fail62;
              term = termFactory.makeAppl(transform._consMemberName_1, new IStrategoTerm[]{term});
            }
          }
          else
          { 
            break Fail62;
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

  @SuppressWarnings("all") public static class gen__ejpscope__method__name__helper_0_0 extends Strategy 
  { 
    public static gen__ejpscope__method__name__helper_0_0 instance = new gen__ejpscope__method__name__helper_0_0();

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      ITermFactory termFactory = context.getFactory();
      context.push("gen__ejpscope__method__name__helper_0_0");
      Fail65:
      { 
        IStrategoTerm term34 = term;
        IStrategoConstructor cons10 = term.getTermType() == IStrategoTerm.APPL ? ((IStrategoAppl)term).getConstructor() : null;
        Success34:
        { 
          if(cons10 == transform._consId_1)
          { 
            Fail66:
            { 
              IStrategoTerm j_35 = null;
              j_35 = term.getSubterm(0);
              term = j_35;
              if(true)
                break Success34;
            }
            term = term34;
          }
          Success35:
          { 
            if(cons10 == transform._consTypeName_1)
            { 
              Fail67:
              { 
                IStrategoTerm i_35 = null;
                IStrategoTerm arg73 = term.getSubterm(0);
                if(arg73.getTermType() != IStrategoTerm.APPL || transform._consId_1 != ((IStrategoAppl)arg73).getConstructor())
                  break Fail67;
                i_35 = arg73.getSubterm(0);
                term = i_35;
                if(true)
                  break Success35;
              }
              term = term34;
            }
            Success36:
            { 
              if(cons10 == transform._consTypeName_2)
              { 
                Fail68:
                { 
                  IStrategoTerm e_35 = null;
                  IStrategoTerm f_35 = null;
                  e_35 = term.getSubterm(0);
                  IStrategoTerm arg74 = term.getSubterm(1);
                  if(arg74.getTermType() != IStrategoTerm.APPL || transform._consId_1 != ((IStrategoAppl)arg74).getConstructor())
                    break Fail68;
                  f_35 = arg74.getSubterm(0);
                  term = this.invoke(context, e_35);
                  if(term == null)
                    break Fail68;
                  term = (IStrategoTerm)termFactory.makeListCons(term, termFactory.makeListCons(transform.const19, termFactory.makeListCons(f_35, (IStrategoList)transform.constNil0)));
                  term = concat_strings_0_0.instance.invoke(context, term);
                  if(term == null)
                    break Fail68;
                  if(true)
                    break Success36;
                }
                term = term34;
              }
              Success37:
              { 
                if(cons10 == transform._consPackageOrTypeName_2)
                { 
                  Fail69:
                  { 
                    IStrategoTerm a_35 = null;
                    IStrategoTerm b_35 = null;
                    a_35 = term.getSubterm(0);
                    IStrategoTerm arg75 = term.getSubterm(1);
                    if(arg75.getTermType() != IStrategoTerm.APPL || transform._consId_1 != ((IStrategoAppl)arg75).getConstructor())
                      break Fail69;
                    b_35 = arg75.getSubterm(0);
                    term = this.invoke(context, a_35);
                    if(term == null)
                      break Fail69;
                    term = (IStrategoTerm)termFactory.makeListCons(term, termFactory.makeListCons(transform.const19, termFactory.makeListCons(b_35, (IStrategoList)transform.constNil0)));
                    term = concat_strings_0_0.instance.invoke(context, term);
                    if(term == null)
                      break Fail69;
                    if(true)
                      break Success37;
                  }
                  term = term34;
                }
                Success38:
                { 
                  if(cons10 == transform._consPackageOrTypeName_1)
                  { 
                    Fail70:
                    { 
                      IStrategoTerm z_34 = null;
                      IStrategoTerm arg76 = term.getSubterm(0);
                      if(arg76.getTermType() != IStrategoTerm.APPL || transform._consId_1 != ((IStrategoAppl)arg76).getConstructor())
                        break Fail70;
                      z_34 = arg76.getSubterm(0);
                      term = z_34;
                      if(true)
                        break Success38;
                    }
                    term = term34;
                  }
                  Success39:
                  { 
                    if(cons10 == transform._consNamePattern_1)
                    { 
                      Fail71:
                      { 
                        IStrategoTerm y_34 = null;
                        y_34 = term.getSubterm(0);
                        term = y_34;
                        if(true)
                          break Success39;
                      }
                      term = term34;
                    }
                    if(cons10 == transform._consNamePattern_2)
                    { 
                      IStrategoTerm u_34 = null;
                      IStrategoTerm v_34 = null;
                      u_34 = term.getSubterm(0);
                      v_34 = term.getSubterm(1);
                      term = this.invoke(context, u_34);
                      if(term == null)
                        break Fail65;
                      term = (IStrategoTerm)termFactory.makeListCons(term, termFactory.makeListCons(transform.const19, termFactory.makeListCons(v_34, (IStrategoList)transform.constNil0)));
                      term = concat_strings_0_0.instance.invoke(context, term);
                      if(term == null)
                        break Fail65;
                    }
                    else
                    { 
                      break Fail65;
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

  @SuppressWarnings("all") public static class random_string_0_0 extends Strategy 
  { 
    public static random_string_0_0 instance = new random_string_0_0();

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      context.push("random_string_0_0");
      Fail72:
      { 
        term = next_random_0_0.instance.invoke(context, term);
        if(term == null)
          break Fail72;
        term = abs_0_0.instance.invoke(context, term);
        if(term == null)
          break Fail72;
        term = int_to_string_0_0.instance.invoke(context, term);
        if(term == null)
          break Fail72;
        context.popOnSuccess();
        if(true)
          return term;
      }
      context.popOnFailure();
      return null;
    }
  }

  @SuppressWarnings("all") public static class gen_auxilary_class_name_0_0 extends Strategy 
  { 
    public static gen_auxilary_class_name_0_0 instance = new gen_auxilary_class_name_0_0();

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      ITermFactory termFactory = context.getFactory();
      context.push("gen_auxilary_class_name_0_0");
      Fail73:
      { 
        term = random_string_0_0.instance.invoke(context, term);
        if(term == null)
          break Fail73;
        term = (IStrategoTerm)termFactory.makeListCons(transform.const1, termFactory.makeListCons(term, (IStrategoList)transform.constNil0));
        term = concat_strings_0_0.instance.invoke(context, term);
        if(term == null)
          break Fail73;
        context.popOnSuccess();
        if(true)
          return term;
      }
      context.popOnFailure();
      return null;
    }
  }

  @SuppressWarnings("all") public static class my_hashtable_remove_0_1 extends Strategy 
  { 
    public static my_hashtable_remove_0_1 instance = new my_hashtable_remove_0_1();

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm t_35)
    { 
      context.push("my_hashtable_remove_0_1");
      Fail74:
      { 
        TermReference u_35 = new TermReference();
        if(u_35.value == null)
          u_35.value = term;
        else
          if(u_35.value != term && !u_35.value.match(term))
            break Fail74;
        term = iset_elements_0_0.instance.invoke(context, t_35);
        if(term == null)
          break Fail74;
        lifted55 lifted550 = new lifted55();
        lifted550.u_35 = u_35;
        term = map_1_0.instance.invoke(context, term, lifted550);
        if(term == null)
          break Fail74;
        if(u_35.value == null)
          break Fail74;
        term = u_35.value;
        context.popOnSuccess();
        if(true)
          return term;
      }
      context.popOnFailure();
      return null;
    }
  }

  @SuppressWarnings("all") public static class my_hashtable_union_0_1 extends Strategy 
  { 
    public static my_hashtable_union_0_1 instance = new my_hashtable_union_0_1();

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm ref_y_35)
    { 
      TermReference y_35 = new TermReference(ref_y_35);
      context.push("my_hashtable_union_0_1");
      Fail75:
      { 
        TermReference z_35 = new TermReference();
        if(z_35.value == null)
          z_35.value = term;
        else
          if(z_35.value != term && !z_35.value.match(term))
            break Fail75;
        if(y_35.value == null)
          break Fail75;
        term = hashtable_keys_0_0.instance.invoke(context, y_35.value);
        if(term == null)
          break Fail75;
        lifted56 lifted560 = new lifted56();
        lifted560.y_35 = y_35;
        lifted560.z_35 = z_35;
        term = map_1_0.instance.invoke(context, term, lifted560);
        if(term == null)
          break Fail75;
        if(z_35.value == null)
          break Fail75;
        term = z_35.value;
        context.popOnSuccess();
        if(true)
          return term;
      }
      context.popOnFailure();
      return null;
    }
  }

  @SuppressWarnings("all") public static class my_hashtable_union_helper_0_2 extends Strategy 
  { 
    public static my_hashtable_union_helper_0_2 instance = new my_hashtable_union_helper_0_2();

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm d_36, IStrategoTerm e_36)
    { 
      context.push("my_hashtable_union_helper_0_2");
      Fail76:
      { 
        IStrategoTerm f_36 = null;
        IStrategoTerm j_36 = null;
        f_36 = term;
        term = hashtable_remove_0_1.instance.invoke(context, e_36, term);
        if(term == null)
          break Fail76;
        j_36 = e_36;
        term = hashtable_get_0_1.instance.invoke(context, d_36, f_36);
        if(term == null)
          break Fail76;
        term = hashtable_put_0_2.instance.invoke(context, j_36, f_36, term);
        if(term == null)
          break Fail76;
        context.popOnSuccess();
        if(true)
          return term;
      }
      context.popOnFailure();
      return null;
    }
  }

  @SuppressWarnings("all") public static class add_key_to_multiple_values_table_0_2 extends Strategy 
  { 
    public static add_key_to_multiple_values_table_0_2 instance = new add_key_to_multiple_values_table_0_2();

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm k_36, IStrategoTerm l_36)
    { 
      ITermFactory termFactory = context.getFactory();
      context.push("add_key_to_multiple_values_table_0_2");
      Fail77:
      { 
        IStrategoTerm m_36 = null;
        m_36 = term;
        Success40:
        { 
          Fail78:
          { 
            IStrategoTerm n_36 = null;
            n_36 = term;
            term = hashtable_keys_0_0.instance.invoke(context, m_36);
            if(term == null)
              break Fail78;
            term = termFactory.makeTuple(k_36, term);
            term = elem_0_0.instance.invoke(context, term);
            if(term == null)
              break Fail78;
            term = n_36;
            { 
              IStrategoTerm t_36 = null;
              t_36 = m_36;
              term = hashtable_get_0_1.instance.invoke(context, m_36, k_36);
              if(term == null)
                break Fail77;
              term = termFactory.makeTuple(term, (IStrategoTerm)termFactory.makeListCons(l_36, (IStrategoList)transform.constNil0));
              term = conc_0_0.instance.invoke(context, term);
              if(term == null)
                break Fail77;
              term = hashtable_put_0_2.instance.invoke(context, t_36, k_36, term);
              if(term == null)
                break Fail77;
              if(true)
                break Success40;
            }
          }
          IStrategoTerm x_36 = null;
          x_36 = m_36;
          term = (IStrategoTerm)termFactory.makeListCons(l_36, (IStrategoList)transform.constNil0);
          term = hashtable_put_0_2.instance.invoke(context, x_36, k_36, term);
          if(term == null)
            break Fail77;
        }
        context.popOnSuccess();
        if(true)
          return term;
      }
      context.popOnFailure();
      return null;
    }
  }

  @SuppressWarnings("all") public static class allow_extends_1_1 extends Strategy 
  { 
    public static allow_extends_1_1 instance = new allow_extends_1_1();

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy z_36, IStrategoTerm y_36)
    { 
      context.push("allow_extends_1_1");
      Fail79:
      { 
        term = allow_extends_2_1.instance.invoke(context, term, z_36, _Id.instance, y_36);
        if(term == null)
          break Fail79;
        context.popOnSuccess();
        if(true)
          return term;
      }
      context.popOnFailure();
      return null;
    }
  }

  @SuppressWarnings("all") public static class allow_extends_2_1 extends Strategy 
  { 
    public static allow_extends_2_1 instance = new allow_extends_2_1();

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy d_37, Strategy e_37, IStrategoTerm c_37)
    { 
      context.push("allow_extends_2_1");
      Fail80:
      { 
        term = c_37;
        lifted58 lifted580 = new lifted58();
        lifted580.d_37 = d_37;
        lifted580.e_37 = e_37;
        term = SRTS_all.instance.invoke(context, term, lifted580);
        if(term == null)
          break Fail80;
        term = concat_0_0.instance.invoke(context, term);
        if(term == null)
          break Fail80;
        context.popOnSuccess();
        if(true)
          return term;
      }
      context.popOnFailure();
      return null;
    }
  }

  @SuppressWarnings("all") public static class allow_extends_helper_2_0 extends Strategy 
  { 
    public static allow_extends_helper_2_0 instance = new allow_extends_helper_2_0();

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy j_37, Strategy k_37)
    { 
      ITermFactory termFactory = context.getFactory();
      context.push("allow_extends_helper_2_0");
      Fail81:
      { 
        IStrategoTerm f_37 = null;
        IStrategoTerm g_37 = null;
        g_37 = term;
        Success41:
        { 
          Fail82:
          { 
            IStrategoTerm h_37 = null;
            h_37 = term;
            term = j_37.invoke(context, g_37);
            if(term == null)
              break Fail82;
            f_37 = term;
            term = h_37;
            { 
              Success42:
              { 
                Fail83:
                { 
                  IStrategoTerm i_37 = null;
                  i_37 = term;
                  term = is_list_0_0.instance.invoke(context, f_37);
                  if(term == null)
                    break Fail83;
                  term = i_37;
                  { 
                    term = f_37;
                    if(true)
                      break Success42;
                  }
                }
                term = (IStrategoTerm)termFactory.makeListCons(f_37, (IStrategoList)transform.constNil0);
              }
              if(true)
                break Success41;
            }
          }
          term = k_37.invoke(context, g_37);
          if(term == null)
            break Fail81;
          term = (IStrategoTerm)termFactory.makeListCons(term, (IStrategoList)transform.constNil0);
        }
        context.popOnSuccess();
        if(true)
          return term;
      }
      context.popOnFailure();
      return null;
    }
  }

  @SuppressWarnings("all") public static class fetch_type_0_0 extends Strategy 
  { 
    public static fetch_type_0_0 instance = new fetch_type_0_0();

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      ITermFactory termFactory = context.getFactory();
      context.push("fetch_type_0_0");
      Fail84:
      { 
        IStrategoTerm p_37 = null;
        IStrategoTerm q_37 = null;
        IStrategoTerm r_37 = null;
        p_37 = term;
        r_37 = term;
        q_37 = term;
        term = r_37;
        IStrategoTerm term43 = term;
        Success43:
        { 
          Fail85:
          { 
            IStrategoTerm s_37 = null;
            s_37 = term;
            term = q_37;
            if(term.getTermType() != IStrategoTerm.APPL || transform._consLit_1 != ((IStrategoAppl)term).getConstructor())
              break Fail85;
            IStrategoTerm arg77 = term.getSubterm(0);
            if(arg77.getTermType() != IStrategoTerm.APPL || transform._consString_1 != ((IStrategoAppl)arg77).getConstructor())
              break Fail85;
            term = s_37;
            { 
              term = transform.constLit0;
              if(true)
                break Success43;
            }
          }
          term = term43;
          Success44:
          { 
            Fail86:
            { 
              IStrategoTerm t_37 = null;
              t_37 = term;
              term = q_37;
              if(term.getTermType() != IStrategoTerm.APPL || transform._consLit_1 != ((IStrategoAppl)term).getConstructor())
                break Fail86;
              IStrategoTerm arg79 = term.getSubterm(0);
              if(arg79.getTermType() != IStrategoTerm.APPL || transform._consChar_1 != ((IStrategoAppl)arg79).getConstructor())
                break Fail86;
              term = t_37;
              { 
                term = transform.constLit1;
                if(true)
                  break Success44;
              }
            }
            term = pp_java5_to_string_0_0.instance.invoke(context, p_37);
            if(term == null)
              break Fail84;
            term = termFactory.makeAppl(transform._consLit_1, new IStrategoTerm[]{termFactory.makeAppl(transform._consString_1, new IStrategoTerm[]{(IStrategoTerm)termFactory.makeListCons(termFactory.makeAppl(transform._consChars_1, new IStrategoTerm[]{term}), (IStrategoList)transform.constNil0)})});
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

  @SuppressWarnings("all") public static class ejp_to_ajc_0_3 extends Strategy 
  { 
    public static ejp_to_ajc_0_3 instance = new ejp_to_ajc_0_3();

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm ref_h_72, IStrategoTerm i_72, IStrategoTerm j_72)
    { 
      ITermFactory termFactory = context.getFactory();
      TermReference h_72 = new TermReference(ref_h_72);
      context.push("ejp_to_ajc_0_3");
      Fail87:
      { 
        IStrategoTerm term45 = term;
        Success45:
        { 
          Fail88:
          { 
            IStrategoTerm g_44 = null;
            IStrategoTerm h_44 = null;
            IStrategoTerm i_44 = null;
            IStrategoTerm j_44 = null;
            IStrategoTerm k_44 = null;
            IStrategoTerm l_44 = null;
            IStrategoTerm m_44 = null;
            if(term.getTermType() != IStrategoTerm.APPL || transform._consExplicitJoinPointPattern_1 != ((IStrategoAppl)term).getConstructor())
              break Fail88;
            IStrategoTerm arg81 = term.getSubterm(0);
            if(arg81.getTermType() != IStrategoTerm.APPL || transform._consMethodPattern_6 != ((IStrategoAppl)arg81).getConstructor())
              break Fail88;
            IStrategoTerm arg82 = arg81.getSubterm(0);
            if(arg82.getTermType() != IStrategoTerm.APPL || transform._consAnnoPattern_1 != ((IStrategoAppl)arg82).getConstructor())
              break Fail88;
            g_44 = arg82.getSubterm(0);
            IStrategoTerm arg83 = arg81.getSubterm(1);
            if(arg83.getTermType() != IStrategoTerm.APPL || transform._consModPattern_1 != ((IStrategoAppl)arg83).getConstructor())
              break Fail88;
            h_44 = arg83.getSubterm(0);
            i_44 = arg81.getSubterm(2);
            j_44 = arg81.getSubterm(3);
            k_44 = arg81.getSubterm(4);
            l_44 = arg81.getSubterm(5);
            term = termFactory.makeTuple(g_44, transform.constCons6);
            term = conc_0_0.instance.invoke(context, term);
            if(term == null)
              break Fail88;
            m_44 = term;
            term = termFactory.makeTuple(h_44, transform.constCons7);
            term = conc_0_0.instance.invoke(context, term);
            if(term == null)
              break Fail88;
            term = termFactory.makeAppl(transform._consMethodPattern_6, new IStrategoTerm[]{termFactory.makeAppl(transform._consAnnoPattern_1, new IStrategoTerm[]{m_44}), termFactory.makeAppl(transform._consModPattern_1, new IStrategoTerm[]{term}), i_44, j_44, k_44, l_44});
            if(true)
              break Success45;
          }
          term = term45;
          IStrategoTerm term46 = term;
          Success46:
          { 
            Fail89:
            { 
              IStrategoTerm x_43 = null;
              IStrategoTerm y_43 = null;
              IStrategoTerm z_43 = null;
              z_43 = term;
              x_43 = term;
              term = or_2_0.instance.invoke(context, z_43, lifted59.instance, lifted60.instance);
              if(term == null)
                break Fail89;
              term = x_43;
              if(term.getTermType() != IStrategoTerm.APPL || transform._consExplicitJoinPointPattern_1 != ((IStrategoAppl)term).getConstructor())
                break Fail89;
              y_43 = term.getSubterm(0);
              term = gen__ejp__name_0_0.instance.invoke(context, y_43);
              if(term == null)
                break Fail89;
              term = termFactory.makeAppl(transform._consMethodPattern_6, new IStrategoTerm[]{transform.constAnnoPattern0, transform.constModPattern0, transform.constRefTypePattern0, term, transform.constCons2, transform.constNone0});
              if(true)
                break Success46;
            }
            term = term46;
            IStrategoTerm term47 = term;
            Success47:
            { 
              Fail90:
              { 
                IStrategoTerm k_43 = null;
                IStrategoTerm l_43 = null;
                IStrategoTerm m_43 = null;
                IStrategoTerm n_43 = null;
                IStrategoTerm o_43 = null;
                IStrategoTerm p_43 = null;
                IStrategoTerm q_43 = null;
                if(term.getTermType() != IStrategoTerm.APPL || transform._consNotExplicitJoinPointPattern_1 != ((IStrategoAppl)term).getConstructor())
                  break Fail90;
                IStrategoTerm arg89 = term.getSubterm(0);
                if(arg89.getTermType() != IStrategoTerm.APPL || transform._consMethodPattern_6 != ((IStrategoAppl)arg89).getConstructor())
                  break Fail90;
                IStrategoTerm arg90 = arg89.getSubterm(0);
                if(arg90.getTermType() != IStrategoTerm.APPL || transform._consAnnoPattern_1 != ((IStrategoAppl)arg90).getConstructor())
                  break Fail90;
                k_43 = arg90.getSubterm(0);
                IStrategoTerm arg91 = arg89.getSubterm(1);
                if(arg91.getTermType() != IStrategoTerm.APPL || transform._consModPattern_1 != ((IStrategoAppl)arg91).getConstructor())
                  break Fail90;
                l_43 = arg91.getSubterm(0);
                m_43 = arg89.getSubterm(2);
                n_43 = arg89.getSubterm(3);
                o_43 = arg89.getSubterm(4);
                p_43 = arg89.getSubterm(5);
                term = termFactory.makeTuple(k_43, transform.constCons8);
                term = conc_0_0.instance.invoke(context, term);
                if(term == null)
                  break Fail90;
                q_43 = term;
                term = termFactory.makeTuple(l_43, transform.constCons7);
                term = conc_0_0.instance.invoke(context, term);
                if(term == null)
                  break Fail90;
                term = termFactory.makeAppl(transform._consMethodPattern_6, new IStrategoTerm[]{termFactory.makeAppl(transform._consAnnoPattern_1, new IStrategoTerm[]{q_43}), termFactory.makeAppl(transform._consModPattern_1, new IStrategoTerm[]{term}), m_43, n_43, o_43, p_43});
                if(true)
                  break Success47;
              }
              term = term47;
              IStrategoTerm term48 = term;
              Success48:
              { 
                Fail91:
                { 
                  IStrategoTerm b_43 = null;
                  IStrategoTerm c_43 = null;
                  IStrategoTerm d_43 = null;
                  d_43 = term;
                  b_43 = term;
                  term = or_2_0.instance.invoke(context, d_43, lifted61.instance, lifted62.instance);
                  if(term == null)
                    break Fail91;
                  term = b_43;
                  if(term.getTermType() != IStrategoTerm.APPL || transform._consNotExplicitJoinPointPattern_1 != ((IStrategoAppl)term).getConstructor())
                    break Fail91;
                  c_43 = term.getSubterm(0);
                  term = gen__ejp__name_0_0.instance.invoke(context, c_43);
                  if(term == null)
                    break Fail91;
                  term = termFactory.makeAppl(transform._consMethodPattern_6, new IStrategoTerm[]{transform.constAnnoPattern1, transform.constModPattern0, transform.constRefTypePattern0, term, transform.constCons2, transform.constNone0});
                  if(true)
                    break Success48;
                }
                term = term48;
                IStrategoTerm term49 = term;
                Success49:
                { 
                  Fail92:
                  { 
                    IStrategoTerm o_42 = null;
                    IStrategoTerm p_42 = null;
                    IStrategoTerm q_42 = null;
                    IStrategoTerm r_42 = null;
                    IStrategoTerm s_42 = null;
                    IStrategoTerm t_42 = null;
                    IStrategoTerm u_42 = null;
                    if(term.getTermType() != IStrategoTerm.APPL || transform._consExplicitJoinPointScopePattern_1 != ((IStrategoAppl)term).getConstructor())
                      break Fail92;
                    IStrategoTerm arg97 = term.getSubterm(0);
                    if(arg97.getTermType() != IStrategoTerm.APPL || transform._consMethodPattern_6 != ((IStrategoAppl)arg97).getConstructor())
                      break Fail92;
                    IStrategoTerm arg98 = arg97.getSubterm(0);
                    if(arg98.getTermType() != IStrategoTerm.APPL || transform._consAnnoPattern_1 != ((IStrategoAppl)arg98).getConstructor())
                      break Fail92;
                    o_42 = arg98.getSubterm(0);
                    p_42 = arg97.getSubterm(1);
                    q_42 = arg97.getSubterm(2);
                    r_42 = arg97.getSubterm(3);
                    s_42 = arg97.getSubterm(4);
                    t_42 = arg97.getSubterm(5);
                    term = termFactory.makeTuple(o_42, transform.constCons9);
                    term = conc_0_0.instance.invoke(context, term);
                    if(term == null)
                      break Fail92;
                    u_42 = term;
                    term = gen__ejpscope__method__name_0_2.instance.invoke(context, r_42, i_72, j_72);
                    if(term == null)
                      break Fail92;
                    term = termFactory.makeAppl(transform._consMethodPattern_6, new IStrategoTerm[]{termFactory.makeAppl(transform._consAnnoPattern_1, new IStrategoTerm[]{u_42}), p_42, q_42, term, s_42, t_42});
                    if(true)
                      break Success49;
                  }
                  term = term49;
                  IStrategoTerm term50 = term;
                  Success50:
                  { 
                    Fail93:
                    { 
                      IStrategoTerm f_42 = null;
                      IStrategoTerm g_42 = null;
                      IStrategoTerm h_42 = null;
                      h_42 = term;
                      f_42 = term;
                      term = or_2_0.instance.invoke(context, h_42, lifted63.instance, lifted64.instance);
                      if(term == null)
                        break Fail93;
                      term = f_42;
                      if(term.getTermType() != IStrategoTerm.APPL || transform._consExplicitJoinPointScopePattern_1 != ((IStrategoAppl)term).getConstructor())
                        break Fail93;
                      g_42 = term.getSubterm(0);
                      term = gen__ejpscope__method__name_0_2.instance.invoke(context, g_42, i_72, j_72);
                      if(term == null)
                        break Fail93;
                      term = termFactory.makeAppl(transform._consMethodPattern_6, new IStrategoTerm[]{transform.constAnnoPattern2, transform.constModPattern0, transform.constRefTypePattern0, term, transform.constCons2, transform.constNone0});
                      if(true)
                        break Success50;
                    }
                    term = term50;
                    IStrategoTerm term51 = term;
                    Success51:
                    { 
                      Fail94:
                      { 
                        IStrategoTerm s_41 = null;
                        IStrategoTerm t_41 = null;
                        IStrategoTerm u_41 = null;
                        IStrategoTerm v_41 = null;
                        IStrategoTerm w_41 = null;
                        IStrategoTerm x_41 = null;
                        IStrategoTerm y_41 = null;
                        if(term.getTermType() != IStrategoTerm.APPL || transform._consNotExplicitJoinPointScopePattern_1 != ((IStrategoAppl)term).getConstructor())
                          break Fail94;
                        IStrategoTerm arg104 = term.getSubterm(0);
                        if(arg104.getTermType() != IStrategoTerm.APPL || transform._consMethodPattern_6 != ((IStrategoAppl)arg104).getConstructor())
                          break Fail94;
                        IStrategoTerm arg105 = arg104.getSubterm(0);
                        if(arg105.getTermType() != IStrategoTerm.APPL || transform._consAnnoPattern_1 != ((IStrategoAppl)arg105).getConstructor())
                          break Fail94;
                        s_41 = arg105.getSubterm(0);
                        t_41 = arg104.getSubterm(1);
                        u_41 = arg104.getSubterm(2);
                        v_41 = arg104.getSubterm(3);
                        w_41 = arg104.getSubterm(4);
                        x_41 = arg104.getSubterm(5);
                        term = termFactory.makeTuple(s_41, transform.constCons10);
                        term = conc_0_0.instance.invoke(context, term);
                        if(term == null)
                          break Fail94;
                        y_41 = term;
                        term = gen__ejpscope__method__name_0_2.instance.invoke(context, v_41, i_72, j_72);
                        if(term == null)
                          break Fail94;
                        term = termFactory.makeAppl(transform._consMethodPattern_6, new IStrategoTerm[]{termFactory.makeAppl(transform._consAnnoPattern_1, new IStrategoTerm[]{y_41}), t_41, u_41, term, w_41, x_41});
                        if(true)
                          break Success51;
                      }
                      term = term51;
                      IStrategoTerm term52 = term;
                      Success52:
                      { 
                        Fail95:
                        { 
                          IStrategoTerm j_41 = null;
                          IStrategoTerm k_41 = null;
                          IStrategoTerm l_41 = null;
                          l_41 = term;
                          j_41 = term;
                          term = or_2_0.instance.invoke(context, l_41, lifted65.instance, lifted66.instance);
                          if(term == null)
                            break Fail95;
                          term = j_41;
                          if(term.getTermType() != IStrategoTerm.APPL || transform._consNotExplicitJoinPointScopePattern_1 != ((IStrategoAppl)term).getConstructor())
                            break Fail95;
                          k_41 = term.getSubterm(0);
                          term = gen__ejpscope__method__name_0_2.instance.invoke(context, k_41, i_72, j_72);
                          if(term == null)
                            break Fail95;
                          term = termFactory.makeAppl(transform._consMethodPattern_6, new IStrategoTerm[]{transform.constAnnoPattern3, transform.constModPattern0, transform.constRefTypePattern0, term, transform.constCons2, transform.constNone0});
                          if(true)
                            break Success52;
                        }
                        term = term52;
                        ejp_to_ajc_0_3_fragment_0 ejp_to_ajc_0_3_fragment_00 = new ejp_to_ajc_0_3_fragment_0();
                        ejp_to_ajc_0_3_fragment_00.h_72 = h_72;
                        term = ejp_to_ajc_0_3_fragment_00.invoke(context, term);
                        if(term == null)
                          break Fail87;
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

  @SuppressWarnings("all") public static class gen_pointcutargs_pointcuts_0_1 extends Strategy 
  { 
    public static gen_pointcutargs_pointcuts_0_1 instance = new gen_pointcutargs_pointcuts_0_1();

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm k_72)
    { 
      ITermFactory termFactory = context.getFactory();
      context.push("gen_pointcutargs_pointcuts_0_1");
      Fail96:
      { 
        IStrategoTerm term58 = term;
        Success53:
        { 
          Fail97:
          { 
            TermReference s_44 = new TermReference();
            IStrategoTerm t_44 = null;
            IStrategoTerm w_44 = null;
            IStrategoTerm y_44 = null;
            IStrategoTerm z_44 = null;
            IStrategoTerm u_44 = null;
            if(term.getTermType() != IStrategoTerm.TUPLE || term.getSubtermCount() != 2)
              break Fail97;
            IStrategoTerm arg120 = term.getSubterm(0);
            if(arg120.getTermType() != IStrategoTerm.APPL || transform._consSome_1 != ((IStrategoAppl)arg120).getConstructor())
              break Fail97;
            IStrategoTerm arg121 = arg120.getSubterm(0);
            if(arg121.getTermType() != IStrategoTerm.APPL || transform._consPointcutargsDec_1 != ((IStrategoAppl)arg121).getConstructor())
              break Fail97;
            t_44 = arg121.getSubterm(0);
            w_44 = term.getSubterm(1);
            term = w_44;
            lifted68 lifted680 = new lifted68();
            lifted67 lifted670 = new lifted67();
            lifted680.s_44 = s_44;
            lifted670.s_44 = s_44;
            term = or_2_0.instance.invoke(context, term, lifted670, lifted680);
            if(term == null)
              break Fail97;
            term = k_72;
            y_44 = k_72;
            if(s_44.value == null)
              break Fail97;
            term = s_44.value;
            if(term.getTermType() != IStrategoTerm.APPL || transform._consExplicitJoinPointDeclarator_3 != ((IStrategoAppl)term).getConstructor())
              break Fail97;
            IStrategoTerm arg125 = term.getSubterm(1);
            if(arg125.getTermType() != IStrategoTerm.APPL || transform._consId_1 != ((IStrategoAppl)arg125).getConstructor())
              break Fail97;
            u_44 = arg125.getSubterm(0);
            z_44 = u_44;
            term = map_1_0.instance.invoke(context, t_44, lifted69.instance);
            if(term == null)
              break Fail97;
            term = termFactory.makeAppl(transform._consAspectDec_2, new IStrategoTerm[]{termFactory.makeAppl(transform._consAspectDecHead_6, new IStrategoTerm[]{transform.constCons23, termFactory.makeAppl(transform._consId_1, new IStrategoTerm[]{z_44}), transform.constNone0, transform.constNone0, transform.constNone0, transform.constNone0}), termFactory.makeAppl(transform._consAspectBody_1, new IStrategoTerm[]{term})});
            term = iset_add_0_1.instance.invoke(context, y_44, term);
            if(term == null)
              break Fail97;
            if(true)
              break Success53;
          }
          term = term58;
          if(term.getTermType() != IStrategoTerm.TUPLE || term.getSubtermCount() != 2)
            break Fail96;
          IStrategoTerm arg127 = term.getSubterm(0);
          if(arg127.getTermType() != IStrategoTerm.APPL || transform._consNone_0 != ((IStrategoAppl)arg127).getConstructor())
            break Fail96;
        }
        context.popOnSuccess();
        if(true)
          return term;
      }
      context.popOnFailure();
      return null;
    }
  }

  @SuppressWarnings("all") public static class convet_pointcutarg_to_pointcut_0_0 extends Strategy 
  { 
    public static convet_pointcutarg_to_pointcut_0_0 instance = new convet_pointcutarg_to_pointcut_0_0();

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      ITermFactory termFactory = context.getFactory();
      Fail98:
      { 
        IStrategoTerm d_45 = null;
        IStrategoTerm e_45 = null;
        if(term.getTermType() != IStrategoTerm.APPL || transform._consPointcutargDec_2 != ((IStrategoAppl)term).getConstructor())
          break Fail98;
        d_45 = term.getSubterm(0);
        e_45 = term.getSubterm(1);
        term = termFactory.makeAppl(transform._consPointcutDec_2, new IStrategoTerm[]{termFactory.makeAppl(transform._consPointcutDecHead_3, new IStrategoTerm[]{transform.constCons24, d_45, e_45}), transform.constNoPointcutBody0});
        if(true)
          return term;
      }
      context.push("convet_pointcutarg_to_pointcut_0_0");
      context.popOnFailure();
      return null;
    }
  }

  @SuppressWarnings("all") public static class gen_method_head_0_3 extends Strategy 
  { 
    public static gen_method_head_0_3 instance = new gen_method_head_0_3();

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm f_45, IStrategoTerm g_45, IStrategoTerm h_45)
    { 
      ITermFactory termFactory = context.getFactory();
      context.push("gen_method_head_0_3");
      Fail99:
      { 
        TermReference i_45 = new TermReference();
        IStrategoTerm j_45 = null;
        TermReference k_45 = new TermReference();
        IStrategoTerm l_45 = null;
        IStrategoTerm m_45 = null;
        IStrategoTerm n_45 = null;
        term = f_45;
        lifted71 lifted711 = new lifted71();
        lifted70 lifted700 = new lifted70();
        lifted711.k_45 = k_45;
        lifted711.i_45 = i_45;
        lifted700.k_45 = k_45;
        lifted700.i_45 = i_45;
        term = or_2_0.instance.invoke(context, term, lifted700, lifted711);
        if(term == null)
          break Fail99;
        if(i_45.value == null)
          break Fail99;
        term = i_45.value;
        if(term.getTermType() != IStrategoTerm.APPL || transform._consExplicitJoinPointDeclarator_3 != ((IStrategoAppl)term).getConstructor())
          break Fail99;
        l_45 = term.getSubterm(0);
        m_45 = term.getSubterm(1);
        n_45 = term.getSubterm(2);
        term = gen_ejp_annotation_0_1.instance.invoke(context, term, g_45);
        if(term == null)
          break Fail99;
        j_45 = term;
        if(k_45.value == null)
          break Fail99;
        term = termFactory.makeAppl(transform._consMethodDecHead_6, new IStrategoTerm[]{(IStrategoTerm)termFactory.makeListCons(j_45, termFactory.makeListCons(k_45.value, (IStrategoList)transform.constCons7)), transform.constNone0, l_45, m_45, n_45, h_45});
        context.popOnSuccess();
        if(true)
          return term;
      }
      context.popOnFailure();
      return null;
    }
  }

  @SuppressWarnings("all") public static class gen_ejp_annotation_0_1 extends Strategy 
  { 
    public static gen_ejp_annotation_0_1 instance = new gen_ejp_annotation_0_1();

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm q_45)
    { 
      ITermFactory termFactory = context.getFactory();
      context.push("gen_ejp_annotation_0_1");
      Fail100:
      { 
        term = fetch_handles_list_0_0.instance.invoke(context, q_45);
        if(term == null)
          break Fail100;
        term = map_1_0.instance.invoke(context, term, lifted72.instance);
        if(term == null)
          break Fail100;
        term = termFactory.makeAppl(transform._consAnno_2, new IStrategoTerm[]{transform.constTypeName7, (IStrategoTerm)termFactory.makeListCons(termFactory.makeAppl(transform._consElemValPair_2, new IStrategoTerm[]{transform.constId24, termFactory.makeAppl(transform._consElemValArrayInit_1, new IStrategoTerm[]{term})}), (IStrategoList)transform.constNil0)});
        context.popOnSuccess();
        if(true)
          return term;
      }
      context.popOnFailure();
      return null;
    }
  }

  @SuppressWarnings("all") public static class gen_method_body_0_2 extends Strategy 
  { 
    public static gen_method_body_0_2 instance = new gen_method_body_0_2();

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm w_45, IStrategoTerm x_45)
    { 
      ITermFactory termFactory = context.getFactory();
      context.push("gen_method_body_0_2");
      Fail101:
      { 
        Success54:
        { 
          Fail102:
          { 
            IStrategoTerm y_45 = null;
            y_45 = term;
            term = termFactory.makeTuple(w_45, transform.constNone0);
            term = equal_0_0.instance.invoke(context, term);
            if(term == null)
              break Fail102;
            term = y_45;
            { 
              term = get_default_return_value_for_return_type_0_0.instance.invoke(context, x_45);
              if(term == null)
                break Fail101;
              term = termFactory.makeAppl(transform._consBlock_1, new IStrategoTerm[]{(IStrategoTerm)termFactory.makeListCons(termFactory.makeAppl(transform._consReturn_1, new IStrategoTerm[]{term}), (IStrategoList)transform.constNil0)});
              if(true)
                break Success54;
            }
          }
          term = fetch_default_value_0_0.instance.invoke(context, w_45);
          if(term == null)
            break Fail101;
          term = termFactory.makeAppl(transform._consBlock_1, new IStrategoTerm[]{(IStrategoTerm)termFactory.makeListCons(termFactory.makeAppl(transform._consReturn_1, new IStrategoTerm[]{termFactory.makeAppl(transform._consSome_1, new IStrategoTerm[]{term})}), (IStrategoList)transform.constNil0)});
        }
        context.popOnSuccess();
        if(true)
          return term;
      }
      context.popOnFailure();
      return null;
    }
  }

  @SuppressWarnings("all") public static class get_default_return_value_for_return_type_0_0 extends Strategy 
  { 
    public static get_default_return_value_for_return_type_0_0 instance = new get_default_return_value_for_return_type_0_0();

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      Fail103:
      { 
        IStrategoTerm d_46 = null;
        IStrategoTerm e_46 = null;
        IStrategoTerm f_46 = null;
        d_46 = term;
        f_46 = term;
        e_46 = d_46;
        term = f_46;
        IStrategoTerm term60 = term;
        Success55:
        { 
          Fail104:
          { 
            IStrategoTerm g_46 = null;
            g_46 = term;
            term = e_46;
            if(term.getTermType() != IStrategoTerm.APPL || transform._consVoid_0 != ((IStrategoAppl)term).getConstructor())
              break Fail104;
            term = g_46;
            { 
              term = transform.constNone0;
              if(true)
                break Success55;
            }
          }
          term = term60;
          IStrategoTerm term61 = term;
          Success56:
          { 
            Fail105:
            { 
              IStrategoTerm h_46 = null;
              h_46 = term;
              term = e_46;
              if(term.getTermType() != IStrategoTerm.APPL || transform._consInt_0 != ((IStrategoAppl)term).getConstructor())
                break Fail105;
              term = h_46;
              { 
                term = transform.constSome0;
                if(true)
                  break Success56;
              }
            }
            term = term61;
            IStrategoTerm term62 = term;
            Success57:
            { 
              Fail106:
              { 
                IStrategoTerm i_46 = null;
                i_46 = term;
                term = e_46;
                if(term.getTermType() != IStrategoTerm.APPL || transform._consLong_0 != ((IStrategoAppl)term).getConstructor())
                  break Fail106;
                term = i_46;
                { 
                  term = transform.constSome0;
                  if(true)
                    break Success57;
                }
              }
              term = term62;
              IStrategoTerm term63 = term;
              Success58:
              { 
                Fail107:
                { 
                  IStrategoTerm j_46 = null;
                  j_46 = term;
                  term = e_46;
                  if(term.getTermType() != IStrategoTerm.APPL || transform._consShort_0 != ((IStrategoAppl)term).getConstructor())
                    break Fail107;
                  term = j_46;
                  { 
                    term = transform.constSome0;
                    if(true)
                      break Success58;
                  }
                }
                term = term63;
                IStrategoTerm term64 = term;
                Success59:
                { 
                  Fail108:
                  { 
                    IStrategoTerm k_46 = null;
                    k_46 = term;
                    term = e_46;
                    if(term.getTermType() != IStrategoTerm.APPL || transform._consByte_0 != ((IStrategoAppl)term).getConstructor())
                      break Fail108;
                    term = k_46;
                    { 
                      term = transform.constSome0;
                      if(true)
                        break Success59;
                    }
                  }
                  term = term64;
                  IStrategoTerm term65 = term;
                  Success60:
                  { 
                    Fail109:
                    { 
                      IStrategoTerm l_46 = null;
                      l_46 = term;
                      term = e_46;
                      if(term.getTermType() != IStrategoTerm.APPL || transform._consDouble_0 != ((IStrategoAppl)term).getConstructor())
                        break Fail109;
                      term = l_46;
                      { 
                        term = transform.constSome0;
                        if(true)
                          break Success60;
                      }
                    }
                    term = term65;
                    IStrategoTerm term66 = term;
                    Success61:
                    { 
                      Fail110:
                      { 
                        IStrategoTerm m_46 = null;
                        m_46 = term;
                        term = e_46;
                        if(term.getTermType() != IStrategoTerm.APPL || transform._consFloat_0 != ((IStrategoAppl)term).getConstructor())
                          break Fail110;
                        term = m_46;
                        { 
                          term = transform.constSome0;
                          if(true)
                            break Success61;
                        }
                      }
                      term = term66;
                      Success62:
                      { 
                        Fail111:
                        { 
                          IStrategoTerm n_46 = null;
                          n_46 = term;
                          term = e_46;
                          if(term.getTermType() != IStrategoTerm.APPL || transform._consBoolean_0 != ((IStrategoAppl)term).getConstructor())
                            break Fail111;
                          term = n_46;
                          { 
                            term = transform.constSome1;
                            if(true)
                              break Success62;
                          }
                        }
                        term = transform.constSome2;
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
      context.push("get_default_return_value_for_return_type_0_0");
      context.popOnFailure();
      return null;
    }
  }

  @SuppressWarnings("all") public static class fetch_default_value_0_0 extends Strategy 
  { 
    public static fetch_default_value_0_0 instance = new fetch_default_value_0_0();

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      Fail112:
      { 
        IStrategoTerm term68 = term;
        IStrategoConstructor cons15 = term.getTermType() == IStrategoTerm.APPL ? ((IStrategoAppl)term).getConstructor() : null;
        Success63:
        { 
          if(cons15 == transform._consSome_1)
          { 
            Fail113:
            { 
              IStrategoTerm q_46 = null;
              IStrategoTerm arg130 = term.getSubterm(0);
              if(arg130.getTermType() != IStrategoTerm.APPL || transform._consExplicitJoinPointInitializer_1 != ((IStrategoAppl)arg130).getConstructor())
                break Fail113;
              q_46 = arg130.getSubterm(0);
              term = q_46;
              if(true)
                break Success63;
            }
            term = term68;
          }
          if(cons15 == transform._consNone_0)
          { 
            term = transform.constNone0;
          }
          else
          { 
            break Fail112;
          }
        }
        if(true)
          return term;
      }
      context.push("fetch_default_value_0_0");
      context.popOnFailure();
      return null;
    }
  }

  @SuppressWarnings("all") public static class fetch_handles_list_0_0 extends Strategy 
  { 
    public static fetch_handles_list_0_0 instance = new fetch_handles_list_0_0();

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      Fail114:
      { 
        IStrategoTerm term69 = term;
        IStrategoConstructor cons16 = term.getTermType() == IStrategoTerm.APPL ? ((IStrategoAppl)term).getConstructor() : null;
        Success64:
        { 
          if(cons16 == transform._consSome_1)
          { 
            Fail115:
            { 
              IStrategoTerm r_46 = null;
              IStrategoTerm arg131 = term.getSubterm(0);
              if(arg131.getTermType() != IStrategoTerm.APPL || transform._consHandles_1 != ((IStrategoAppl)arg131).getConstructor())
                break Fail115;
              r_46 = arg131.getSubterm(0);
              term = r_46;
              if(true)
                break Success64;
            }
            term = term69;
          }
          if(cons16 == transform._consNone_0)
          { 
            term = transform.constNil0;
          }
          else
          { 
            break Fail114;
          }
        }
        if(true)
          return term;
      }
      context.push("fetch_handles_list_0_0");
      context.popOnFailure();
      return null;
    }
  }

  @SuppressWarnings("all") public static class remove_ejp_decs_0_0 extends Strategy 
  { 
    public static remove_ejp_decs_0_0 instance = new remove_ejp_decs_0_0();

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      Fail116:
      { 
        IStrategoTerm term70 = term;
        IStrategoConstructor cons17 = term.getTermType() == IStrategoTerm.APPL ? ((IStrategoAppl)term).getConstructor() : null;
        Success65:
        { 
          if(cons17 == transform._consExplicitJoinPointDeclaration_5)
          { 
            Fail117:
            { 
              term = transform.constNone0;
              if(true)
                break Success65;
            }
            term = term70;
          }
          Success66:
          { 
            if(cons17 == transform._consDecNoMatch_4)
            { 
              Fail118:
              { 
                term = transform.constNone0;
                if(true)
                  break Success66;
              }
              term = term70;
            }
            Success67:
            { 
              if(cons17 == transform._consExplicitJoinPointPattern_1)
              { 
                Fail119:
                { 
                  term = transform.constNone0;
                  if(true)
                    break Success67;
                }
                term = term70;
              }
              Success68:
              { 
                if(cons17 == transform._consNotExplicitJoinPointPattern_1)
                { 
                  Fail120:
                  { 
                    term = transform.constNone0;
                    if(true)
                      break Success68;
                  }
                  term = term70;
                }
                Success69:
                { 
                  if(cons17 == transform._consExplicitJoinPointScopePattern_1)
                  { 
                    Fail121:
                    { 
                      term = transform.constNone0;
                      if(true)
                        break Success69;
                    }
                    term = term70;
                  }
                  if(cons17 == transform._consNotExplicitJoinPointScopePattern_1)
                  { 
                    term = transform.constNone0;
                  }
                  else
                  { 
                    break Fail116;
                  }
                }
              }
            }
          }
        }
        if(true)
          return term;
      }
      context.push("remove_ejp_decs_0_0");
      context.popOnFailure();
      return null;
    }
  }

  @SuppressWarnings("all") public static class aspectj_to_box_0_0_fragment_4 extends Strategy 
  { 
    public static aspectj_to_box_0_0_fragment_4 instance = new aspectj_to_box_0_0_fragment_4();

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      ITermFactory termFactory = context.getFactory();
      context.push("aspectj_to_box_0_0_fragment_4");
      Fail122:
      { 
        IStrategoTerm term75 = term;
        IStrategoConstructor cons18 = term.getTermType() == IStrategoTerm.APPL ? ((IStrategoAppl)term).getConstructor() : null;
        Success70:
        { 
          if(cons18 == transform._consInitExec_1)
          { 
            Fail123:
            { 
              IStrategoTerm x_56 = null;
              x_56 = term.getSubterm(0);
              term = termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{transform.constCons25, (IStrategoTerm)termFactory.makeListCons(transform.constFBOX0, termFactory.makeListCons(transform.constS1, termFactory.makeListCons(x_56, (IStrategoList)transform.constCons26)))});
              if(true)
                break Success70;
            }
            term = term75;
          }
          Success71:
          { 
            if(cons18 == transform._consPreInitExec_1)
            { 
              Fail124:
              { 
                IStrategoTerm v_56 = null;
                v_56 = term.getSubterm(0);
                term = termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{transform.constCons25, (IStrategoTerm)termFactory.makeListCons(transform.constFBOX1, termFactory.makeListCons(transform.constS1, termFactory.makeListCons(v_56, (IStrategoList)transform.constCons26)))});
                if(true)
                  break Success71;
              }
              term = term75;
            }
            Success72:
            { 
              if(cons18 == transform._consStaticInitExec_1)
              { 
                Fail125:
                { 
                  IStrategoTerm u_56 = null;
                  u_56 = term.getSubterm(0);
                  term = termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{transform.constCons25, (IStrategoTerm)termFactory.makeListCons(transform.constFBOX2, termFactory.makeListCons(transform.constS1, termFactory.makeListCons(u_56, (IStrategoList)transform.constCons26)))});
                  if(true)
                    break Success72;
                }
                term = term75;
              }
              Success73:
              { 
                if(cons18 == transform._consGetField_1)
                { 
                  Fail126:
                  { 
                    IStrategoTerm t_56 = null;
                    t_56 = term.getSubterm(0);
                    term = termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{transform.constCons25, (IStrategoTerm)termFactory.makeListCons(transform.constFBOX3, termFactory.makeListCons(transform.constS1, termFactory.makeListCons(t_56, (IStrategoList)transform.constCons26)))});
                    if(true)
                      break Success73;
                  }
                  term = term75;
                }
                Success74:
                { 
                  if(cons18 == transform._consSetField_1)
                  { 
                    Fail127:
                    { 
                      IStrategoTerm s_56 = null;
                      s_56 = term.getSubterm(0);
                      term = termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{transform.constCons25, (IStrategoTerm)termFactory.makeListCons(transform.constFBOX4, termFactory.makeListCons(transform.constS1, termFactory.makeListCons(s_56, (IStrategoList)transform.constCons26)))});
                      if(true)
                        break Success74;
                    }
                    term = term75;
                  }
                  Success75:
                  { 
                    if(cons18 == transform._consHandler_1)
                    { 
                      Fail128:
                      { 
                        IStrategoTerm q_56 = null;
                        q_56 = term.getSubterm(0);
                        term = termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{transform.constCons25, (IStrategoTerm)termFactory.makeListCons(transform.constFBOX5, termFactory.makeListCons(transform.constS1, termFactory.makeListCons(q_56, (IStrategoList)transform.constCons26)))});
                        if(true)
                          break Success75;
                      }
                      term = term75;
                    }
                    Success76:
                    { 
                      if(cons18 == transform._consAdviceExec_0)
                      { 
                        Fail129:
                        { 
                          term = transform.constH0;
                          if(true)
                            break Success76;
                        }
                        term = term75;
                      }
                      Success77:
                      { 
                        if(cons18 == transform._consWithin_1)
                        { 
                          Fail130:
                          { 
                            IStrategoTerm p_56 = null;
                            p_56 = term.getSubterm(0);
                            term = termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{transform.constCons25, (IStrategoTerm)termFactory.makeListCons(transform.constFBOX7, termFactory.makeListCons(transform.constS1, termFactory.makeListCons(p_56, (IStrategoList)transform.constCons26)))});
                            if(true)
                              break Success77;
                          }
                          term = term75;
                        }
                        Success78:
                        { 
                          if(cons18 == transform._consWithinCode_1)
                          { 
                            Fail131:
                            { 
                              IStrategoTerm o_56 = null;
                              o_56 = term.getSubterm(0);
                              term = termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{transform.constCons25, (IStrategoTerm)termFactory.makeListCons(transform.constFBOX8, termFactory.makeListCons(transform.constS1, termFactory.makeListCons(o_56, (IStrategoList)transform.constCons26)))});
                              if(true)
                                break Success78;
                            }
                            term = term75;
                          }
                          Success79:
                          { 
                            if(cons18 == transform._consCFlow_1)
                            { 
                              Fail132:
                              { 
                                IStrategoTerm n_56 = null;
                                n_56 = term.getSubterm(0);
                                term = termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{transform.constCons25, (IStrategoTerm)termFactory.makeListCons(transform.constFBOX9, termFactory.makeListCons(transform.constS1, termFactory.makeListCons(n_56, (IStrategoList)transform.constCons26)))});
                                if(true)
                                  break Success79;
                              }
                              term = term75;
                            }
                            Success80:
                            { 
                              if(cons18 == transform._consCFlowBelow_1)
                              { 
                                Fail133:
                                { 
                                  IStrategoTerm m_56 = null;
                                  m_56 = term.getSubterm(0);
                                  term = termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{transform.constCons25, (IStrategoTerm)termFactory.makeListCons(transform.constFBOX10, termFactory.makeListCons(transform.constS1, termFactory.makeListCons(m_56, (IStrategoList)transform.constCons26)))});
                                  if(true)
                                    break Success80;
                                }
                                term = term75;
                              }
                              Success81:
                              { 
                                if(cons18 == transform._consIf_1)
                                { 
                                  Fail134:
                                  { 
                                    IStrategoTerm l_56 = null;
                                    l_56 = term.getSubterm(0);
                                    term = termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{transform.constCons25, (IStrategoTerm)termFactory.makeListCons(transform.constFBOX11, termFactory.makeListCons(transform.constS1, termFactory.makeListCons(l_56, (IStrategoList)transform.constCons26)))});
                                    if(true)
                                      break Success81;
                                  }
                                  term = term75;
                                }
                                Success82:
                                { 
                                  if(cons18 == transform._consThis_1)
                                  { 
                                    Fail135:
                                    { 
                                      IStrategoTerm k_56 = null;
                                      k_56 = term.getSubterm(0);
                                      term = termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{transform.constCons25, (IStrategoTerm)termFactory.makeListCons(transform.constFBOX12, termFactory.makeListCons(transform.constS1, termFactory.makeListCons(k_56, (IStrategoList)transform.constCons26)))});
                                      if(true)
                                        break Success82;
                                    }
                                    term = term75;
                                  }
                                  Success83:
                                  { 
                                    if(cons18 == transform._consTarget_1)
                                    { 
                                      Fail136:
                                      { 
                                        IStrategoTerm j_56 = null;
                                        j_56 = term.getSubterm(0);
                                        term = termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{transform.constCons25, (IStrategoTerm)termFactory.makeListCons(transform.constFBOX13, termFactory.makeListCons(transform.constS1, termFactory.makeListCons(j_56, (IStrategoList)transform.constCons26)))});
                                        if(true)
                                          break Success83;
                                      }
                                      term = term75;
                                    }
                                    Success84:
                                    { 
                                      if(cons18 == transform._consArgs_1)
                                      { 
                                        Fail137:
                                        { 
                                          IStrategoTerm e_56 = null;
                                          e_56 = term.getSubterm(0);
                                          term = list_to_args_0_0.instance.invoke(context, e_56);
                                          if(term == null)
                                            break Fail137;
                                          term = termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{transform.constCons25, (IStrategoTerm)termFactory.makeListCons(transform.constFBOX14, termFactory.makeListCons(term, (IStrategoList)transform.constNil0))});
                                          if(true)
                                            break Success84;
                                        }
                                        term = term75;
                                      }
                                      Success85:
                                      { 
                                        if(cons18 == transform._consNamedPointcut_2)
                                        { 
                                          Fail138:
                                          { 
                                            IStrategoTerm z_55 = null;
                                            IStrategoTerm b_56 = null;
                                            z_55 = term.getSubterm(0);
                                            b_56 = term.getSubterm(1);
                                            term = list_to_args_0_0.instance.invoke(context, b_56);
                                            if(term == null)
                                              break Fail138;
                                            term = termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{transform.constCons25, (IStrategoTerm)termFactory.makeListCons(z_55, termFactory.makeListCons(term, (IStrategoList)transform.constNil0))});
                                            if(true)
                                              break Success85;
                                          }
                                          term = term75;
                                        }
                                        Success86:
                                        { 
                                          if(cons18 == transform._consAtThis_1)
                                          { 
                                            Fail139:
                                            { 
                                              IStrategoTerm y_55 = null;
                                              y_55 = term.getSubterm(0);
                                              term = termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{transform.constCons25, (IStrategoTerm)termFactory.makeListCons(transform.constS17, termFactory.makeListCons(transform.constS1, termFactory.makeListCons(y_55, (IStrategoList)transform.constCons26)))});
                                              if(true)
                                                break Success86;
                                            }
                                            term = term75;
                                          }
                                          Success87:
                                          { 
                                            if(cons18 == transform._consAtTarget_1)
                                            { 
                                              Fail140:
                                              { 
                                                IStrategoTerm x_55 = null;
                                                x_55 = term.getSubterm(0);
                                                term = termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{transform.constCons25, (IStrategoTerm)termFactory.makeListCons(transform.constS18, termFactory.makeListCons(transform.constS1, termFactory.makeListCons(x_55, (IStrategoList)transform.constCons26)))});
                                                if(true)
                                                  break Success87;
                                              }
                                              term = term75;
                                            }
                                            term = aspectj_to_box_0_0_fragment_3.instance.invoke(context, term);
                                            if(term == null)
                                              break Fail122;
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
      Fail141:
      { 
        IStrategoTerm term93 = term;
        IStrategoConstructor cons19 = term.getTermType() == IStrategoTerm.APPL ? ((IStrategoAppl)term).getConstructor() : null;
        Success88:
        { 
          if(cons19 == transform._consAtWithin_1)
          { 
            Fail142:
            { 
              IStrategoTerm u_55 = null;
              u_55 = term.getSubterm(0);
              term = termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{transform.constCons25, (IStrategoTerm)termFactory.makeListCons(transform.constS19, termFactory.makeListCons(transform.constS1, termFactory.makeListCons(u_55, (IStrategoList)transform.constCons26)))});
              if(true)
                break Success88;
            }
            term = term93;
          }
          Success89:
          { 
            if(cons19 == transform._consAtWithinCode_1)
            { 
              Fail143:
              { 
                IStrategoTerm t_55 = null;
                t_55 = term.getSubterm(0);
                term = termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{transform.constCons25, (IStrategoTerm)termFactory.makeListCons(transform.constS20, termFactory.makeListCons(transform.constS1, termFactory.makeListCons(t_55, (IStrategoList)transform.constCons26)))});
                if(true)
                  break Success89;
              }
              term = term93;
            }
            Success90:
            { 
              if(cons19 == transform._consAtAnno_1)
              { 
                Fail144:
                { 
                  IStrategoTerm s_55 = null;
                  s_55 = term.getSubterm(0);
                  term = termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{transform.constCons25, (IStrategoTerm)termFactory.makeListCons(transform.constS21, termFactory.makeListCons(transform.constS1, termFactory.makeListCons(s_55, (IStrategoList)transform.constCons26)))});
                  if(true)
                    break Success90;
                }
                term = term93;
              }
              Success91:
              { 
                if(cons19 == transform._consAtArgs_1)
                { 
                  Fail145:
                  { 
                    IStrategoTerm p_55 = null;
                    p_55 = term.getSubterm(0);
                    term = list_to_args_0_0.instance.invoke(context, p_55);
                    if(term == null)
                      break Fail145;
                    term = termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{transform.constCons25, (IStrategoTerm)termFactory.makeListCons(transform.constS22, termFactory.makeListCons(term, (IStrategoList)transform.constNil0))});
                    if(true)
                      break Success91;
                  }
                  term = term93;
                }
                Success92:
                { 
                  if(cons19 == transform._consPointcutName_1)
                  { 
                    Fail146:
                    { 
                      IStrategoTerm o_55 = null;
                      o_55 = term.getSubterm(0);
                      term = o_55;
                      if(true)
                        break Success92;
                    }
                    term = term93;
                  }
                  Success93:
                  { 
                    if(cons19 == transform._consPointcutName_2)
                    { 
                      Fail147:
                      { 
                        IStrategoTerm k_55 = null;
                        IStrategoTerm n_55 = null;
                        k_55 = term.getSubterm(0);
                        n_55 = term.getSubterm(1);
                        term = termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{transform.constCons25, (IStrategoTerm)termFactory.makeListCons(k_55, termFactory.makeListCons(transform.constS23, termFactory.makeListCons(n_55, (IStrategoList)transform.constNil0)))});
                        if(true)
                          break Success93;
                      }
                      term = term93;
                    }
                    Success94:
                    { 
                      if(cons19 == transform._consPointcutDec_2)
                      { 
                        Fail148:
                        { 
                          IStrategoTerm i_55 = null;
                          IStrategoTerm j_55 = null;
                          i_55 = term.getSubterm(0);
                          j_55 = term.getSubterm(1);
                          term = termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{transform.constCons29, (IStrategoTerm)termFactory.makeListCons(i_55, termFactory.makeListCons(j_55, (IStrategoList)transform.constNil0))});
                          if(true)
                            break Success94;
                        }
                        term = term93;
                      }
                      Success95:
                      { 
                        if(cons19 == transform._consPointcutDecHead_3)
                        { 
                          Fail149:
                          { 
                            IStrategoTerm z_54 = null;
                            IStrategoTerm a_55 = null;
                            IStrategoTerm d_55 = null;
                            IStrategoTerm e_55 = null;
                            z_54 = term.getSubterm(0);
                            a_55 = term.getSubterm(1);
                            d_55 = term.getSubterm(2);
                            term = list_to_args_0_0.instance.invoke(context, d_55);
                            if(term == null)
                              break Fail149;
                            e_55 = term;
                            term = termFactory.makeTuple(z_54, (IStrategoTerm)termFactory.makeListCons(transform.constFBOX15, termFactory.makeListCons(a_55, termFactory.makeListCons(e_55, (IStrategoList)transform.constNil0))));
                            term = make$Conc_0_0.instance.invoke(context, term);
                            if(term == null)
                              break Fail149;
                            term = termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{transform.constCons29, term});
                            if(true)
                              break Success95;
                          }
                          term = term93;
                        }
                        Success96:
                        { 
                          if(cons19 == transform._consPointcutBody_1)
                          { 
                            Fail150:
                            { 
                              IStrategoTerm y_54 = null;
                              y_54 = term.getSubterm(0);
                              term = termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{transform.constCons25, (IStrategoTerm)termFactory.makeListCons(transform.constS26, termFactory.makeListCons(y_54, (IStrategoList)transform.constCons30))});
                              if(true)
                                break Success96;
                            }
                            term = term93;
                          }
                          Success97:
                          { 
                            if(cons19 == transform._consNoPointcutBody_0)
                            { 
                              Fail151:
                              { 
                                term = transform.constFBOX16;
                                if(true)
                                  break Success97;
                              }
                              term = term93;
                            }
                            Success98:
                            { 
                              if(cons19 == transform._consRefTypePattern_1)
                              { 
                                Fail152:
                                { 
                                  IStrategoTerm x_54 = null;
                                  x_54 = term.getSubterm(0);
                                  term = x_54;
                                  if(true)
                                    break Success98;
                                }
                                term = term93;
                              }
                              Success99:
                              { 
                                if(cons19 == transform._consPrimTypePattern_1)
                                { 
                                  Fail153:
                                  { 
                                    IStrategoTerm w_54 = null;
                                    w_54 = term.getSubterm(0);
                                    term = w_54;
                                    if(true)
                                      break Success99;
                                  }
                                  term = term93;
                                }
                                Success100:
                                { 
                                  if(cons19 == transform._consSubtype_1)
                                  { 
                                    Fail154:
                                    { 
                                      IStrategoTerm v_54 = null;
                                      v_54 = term.getSubterm(0);
                                      term = termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{transform.constCons25, (IStrategoTerm)termFactory.makeListCons(v_54, (IStrategoList)transform.constCons31)});
                                      if(true)
                                        break Success100;
                                    }
                                    term = term93;
                                  }
                                  Success101:
                                  { 
                                    if(cons19 == transform._consGenericTypePattern_2)
                                    { 
                                      Fail155:
                                      { 
                                        IStrategoTerm t_54 = null;
                                        IStrategoTerm u_54 = null;
                                        t_54 = term.getSubterm(0);
                                        u_54 = term.getSubterm(1);
                                        term = termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{transform.constCons25, (IStrategoTerm)termFactory.makeListCons(t_54, termFactory.makeListCons(u_54, (IStrategoList)transform.constNil0))});
                                        if(true)
                                          break Success101;
                                      }
                                      term = term93;
                                    }
                                    Success102:
                                    { 
                                      if(cons19 == transform._consGenericSubtypePattern_2)
                                      { 
                                        Fail156:
                                        { 
                                          IStrategoTerm p_54 = null;
                                          IStrategoTerm s_54 = null;
                                          p_54 = term.getSubterm(0);
                                          s_54 = term.getSubterm(1);
                                          term = termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{transform.constCons25, (IStrategoTerm)termFactory.makeListCons(p_54, termFactory.makeListCons(s_54, (IStrategoList)transform.constCons31))});
                                          if(true)
                                            break Success102;
                                        }
                                        term = term93;
                                      }
                                      Success103:
                                      { 
                                        if(cons19 == transform._consAnnoTypePattern_2)
                                        { 
                                          Fail157:
                                          { 
                                            IStrategoTerm l_54 = null;
                                            IStrategoTerm m_54 = null;
                                            IStrategoTerm arg145 = term.getSubterm(0);
                                            if(arg145.getTermType() != IStrategoTerm.APPL || transform._consAnnoPattern_1 != ((IStrategoAppl)arg145).getConstructor())
                                              break Fail157;
                                            l_54 = arg145.getSubterm(0);
                                            m_54 = term.getSubterm(1);
                                            term = termFactory.makeTuple(l_54, (IStrategoTerm)termFactory.makeListCons(m_54, (IStrategoList)transform.constNil0));
                                            term = make$Conc_0_0.instance.invoke(context, term);
                                            if(term == null)
                                              break Fail157;
                                            term = termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{transform.constCons25, (IStrategoTerm)termFactory.makeListCons(termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{transform.constCons29, term}), (IStrategoList)transform.constNil0)});
                                            if(true)
                                              break Success103;
                                          }
                                          term = term93;
                                        }
                                        Success104:
                                        { 
                                          if(cons19 == transform._consNamePattern_1)
                                          { 
                                            Fail158:
                                            { 
                                              IStrategoTerm k_54 = null;
                                              k_54 = term.getSubterm(0);
                                              term = termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{transform.constCons25, (IStrategoTerm)termFactory.makeListCons(termFactory.makeAppl(transform._consS_1, new IStrategoTerm[]{k_54}), (IStrategoList)transform.constNil0)});
                                              if(true)
                                                break Success104;
                                            }
                                            term = term93;
                                          }
                                          Success105:
                                          { 
                                            if(cons19 == transform._consNamePattern_2)
                                            { 
                                              Fail159:
                                              { 
                                                IStrategoTerm i_54 = null;
                                                IStrategoTerm j_54 = null;
                                                i_54 = term.getSubterm(0);
                                                j_54 = term.getSubterm(1);
                                                term = termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{transform.constCons25, (IStrategoTerm)termFactory.makeListCons(i_54, termFactory.makeListCons(transform.constFBOX17, termFactory.makeListCons(termFactory.makeAppl(transform._consS_1, new IStrategoTerm[]{j_54}), (IStrategoList)transform.constNil0)))});
                                                if(true)
                                                  break Success105;
                                              }
                                              term = term93;
                                            }
                                            Success106:
                                            { 
                                              if(cons19 == transform._consWildcardNamePattern_2)
                                              { 
                                                Fail160:
                                                { 
                                                  IStrategoTerm e_54 = null;
                                                  IStrategoTerm f_54 = null;
                                                  e_54 = term.getSubterm(0);
                                                  f_54 = term.getSubterm(1);
                                                  term = termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{transform.constCons25, (IStrategoTerm)termFactory.makeListCons(e_54, termFactory.makeListCons(transform.constFBOX18, termFactory.makeListCons(termFactory.makeAppl(transform._consS_1, new IStrategoTerm[]{f_54}), (IStrategoList)transform.constNil0)))});
                                                  if(true)
                                                    break Success106;
                                                }
                                                term = term93;
                                              }
                                              Success107:
                                              { 
                                                if(cons19 == transform._consFormalWildcard_0)
                                                { 
                                                  Fail161:
                                                  { 
                                                    term = transform.constS28;
                                                    if(true)
                                                      break Success107;
                                                  }
                                                  term = term93;
                                                }
                                                Success108:
                                                { 
                                                  if(cons19 == transform._consVarArityParamPattern_1)
                                                  { 
                                                    Fail162:
                                                    { 
                                                      IStrategoTerm d_54 = null;
                                                      d_54 = term.getSubterm(0);
                                                      term = termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{transform.constCons29, (IStrategoTerm)termFactory.makeListCons(d_54, (IStrategoList)transform.constCons32)});
                                                      if(true)
                                                        break Success108;
                                                    }
                                                    term = term93;
                                                  }
                                                  Success109:
                                                  { 
                                                    if(cons19 == transform._consRegularTypePattern_1)
                                                    { 
                                                      Fail163:
                                                      { 
                                                        IStrategoTerm c_54 = null;
                                                        c_54 = term.getSubterm(0);
                                                        term = termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{transform.constCons25, (IStrategoTerm)termFactory.makeListCons(c_54, (IStrategoList)transform.constNil0)});
                                                        if(true)
                                                          break Success109;
                                                      }
                                                      term = term93;
                                                    }
                                                    Success110:
                                                    { 
                                                      if(cons19 == transform._consWildcard_0)
                                                      { 
                                                        Fail164:
                                                        { 
                                                          term = transform.constS30;
                                                          if(true)
                                                            break Success110;
                                                        }
                                                        term = term93;
                                                      }
                                                      Success111:
                                                      { 
                                                        if(cons19 == transform._consDotWildcard_0)
                                                        { 
                                                          Fail165:
                                                          { 
                                                            term = transform.constS28;
                                                            if(true)
                                                              break Success111;
                                                          }
                                                          term = term93;
                                                        }
                                                        Success112:
                                                        { 
                                                          if(cons19 == transform._consSimpleNamePattern_1)
                                                          { 
                                                            Fail166:
                                                            { 
                                                              IStrategoTerm b_54 = null;
                                                              b_54 = term.getSubterm(0);
                                                              term = b_54;
                                                              if(true)
                                                                break Success112;
                                                            }
                                                            term = term93;
                                                          }
                                                          Success113:
                                                          { 
                                                            if(cons19 == transform._consMethodPattern_6)
                                                            { 
                                                              Fail167:
                                                              { 
                                                                IStrategoTerm p_53 = null;
                                                                IStrategoTerm q_53 = null;
                                                                IStrategoTerm r_53 = null;
                                                                IStrategoTerm s_53 = null;
                                                                IStrategoTerm t_53 = null;
                                                                IStrategoTerm u_53 = null;
                                                                IStrategoTerm v_53 = null;
                                                                IStrategoTerm w_53 = null;
                                                                IStrategoTerm x_53 = null;
                                                                IStrategoTerm y_53 = null;
                                                                IStrategoTerm arg146 = term.getSubterm(0);
                                                                if(arg146.getTermType() != IStrategoTerm.APPL || transform._consAnnoPattern_1 != ((IStrategoAppl)arg146).getConstructor())
                                                                  break Fail167;
                                                                r_53 = arg146.getSubterm(0);
                                                                IStrategoTerm arg147 = term.getSubterm(1);
                                                                if(arg147.getTermType() != IStrategoTerm.APPL || transform._consModPattern_1 != ((IStrategoAppl)arg147).getConstructor())
                                                                  break Fail167;
                                                                s_53 = arg147.getSubterm(0);
                                                                p_53 = term.getSubterm(2);
                                                                q_53 = term.getSubterm(3);
                                                                u_53 = term.getSubterm(4);
                                                                w_53 = term.getSubterm(5);
                                                                y_53 = term;
                                                                term = termFactory.makeTuple(r_53, s_53);
                                                                term = conc_0_0.instance.invoke(context, term);
                                                                if(term == null)
                                                                  break Fail167;
                                                                t_53 = term;
                                                                term = list_to_args_0_0.instance.invoke(context, u_53);
                                                                if(term == null)
                                                                  break Fail167;
                                                                v_53 = term;
                                                                term = option_to_boxes_0_0.instance.invoke(context, w_53);
                                                                if(term == null)
                                                                  break Fail167;
                                                                x_53 = term;
                                                                term = y_53;
                                                                IStrategoList list2;
                                                                list2 = checkListTail(x_53);
                                                                if(list2 == null)
                                                                  break Fail167;
                                                                term = termFactory.makeTuple(t_53, (IStrategoTerm)termFactory.makeListCons(p_53, termFactory.makeListCons(termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{transform.constCons25, (IStrategoTerm)termFactory.makeListCons(q_53, termFactory.makeListCons(v_53, (IStrategoList)transform.constNil0))}), list2)));
                                                                term = make$Conc_0_0.instance.invoke(context, term);
                                                                if(term == null)
                                                                  break Fail167;
                                                                term = termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{transform.constCons29, term});
                                                                if(true)
                                                                  break Success113;
                                                              }
                                                              term = term93;
                                                            }
                                                            Success114:
                                                            { 
                                                              if(cons19 == transform._consConstrPattern_5)
                                                              { 
                                                                Fail168:
                                                                { 
                                                                  IStrategoTerm f_53 = null;
                                                                  IStrategoTerm g_53 = null;
                                                                  IStrategoTerm h_53 = null;
                                                                  IStrategoTerm i_53 = null;
                                                                  IStrategoTerm j_53 = null;
                                                                  IStrategoTerm k_53 = null;
                                                                  IStrategoTerm l_53 = null;
                                                                  IStrategoTerm arg148 = term.getSubterm(0);
                                                                  if(arg148.getTermType() != IStrategoTerm.APPL || transform._consAnnoPattern_1 != ((IStrategoAppl)arg148).getConstructor())
                                                                    break Fail168;
                                                                  h_53 = arg148.getSubterm(0);
                                                                  IStrategoTerm arg149 = term.getSubterm(1);
                                                                  if(arg149.getTermType() != IStrategoTerm.APPL || transform._consModPattern_1 != ((IStrategoAppl)arg149).getConstructor())
                                                                    break Fail168;
                                                                  i_53 = arg149.getSubterm(0);
                                                                  f_53 = term.getSubterm(2);
                                                                  k_53 = term.getSubterm(3);
                                                                  g_53 = term.getSubterm(4);
                                                                  term = termFactory.makeTuple(h_53, i_53);
                                                                  term = conc_0_0.instance.invoke(context, term);
                                                                  if(term == null)
                                                                    break Fail168;
                                                                  j_53 = term;
                                                                  term = list_to_args_0_0.instance.invoke(context, k_53);
                                                                  if(term == null)
                                                                    break Fail168;
                                                                  l_53 = term;
                                                                  term = termFactory.makeTuple(j_53, (IStrategoTerm)termFactory.makeListCons(termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{transform.constCons25, (IStrategoTerm)termFactory.makeListCons(f_53, termFactory.makeListCons(l_53, (IStrategoList)transform.constNil0))}), termFactory.makeListCons(g_53, (IStrategoList)transform.constNil0)));
                                                                  term = make$Conc_0_0.instance.invoke(context, term);
                                                                  if(term == null)
                                                                    break Fail168;
                                                                  term = termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{transform.constCons29, term});
                                                                  if(true)
                                                                    break Success114;
                                                                }
                                                                term = term93;
                                                              }
                                                              term = aspectj_to_box_0_0_fragment_2.instance.invoke(context, term);
                                                              if(term == null)
                                                                break Fail141;
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
      Fail169:
      { 
        IStrategoTerm term120 = term;
        IStrategoConstructor cons20 = term.getTermType() == IStrategoTerm.APPL ? ((IStrategoAppl)term).getConstructor() : null;
        Success115:
        { 
          if(cons20 == transform._consFieldPattern_4)
          { 
            Fail170:
            { 
              IStrategoTerm x_52 = null;
              IStrategoTerm y_52 = null;
              IStrategoTerm z_52 = null;
              IStrategoTerm a_53 = null;
              IStrategoTerm b_53 = null;
              IStrategoTerm arg150 = term.getSubterm(0);
              if(arg150.getTermType() != IStrategoTerm.APPL || transform._consAnnoPattern_1 != ((IStrategoAppl)arg150).getConstructor())
                break Fail170;
              z_52 = arg150.getSubterm(0);
              IStrategoTerm arg151 = term.getSubterm(1);
              if(arg151.getTermType() != IStrategoTerm.APPL || transform._consModPattern_1 != ((IStrategoAppl)arg151).getConstructor())
                break Fail170;
              a_53 = arg151.getSubterm(0);
              x_52 = term.getSubterm(2);
              y_52 = term.getSubterm(3);
              term = termFactory.makeTuple(z_52, a_53);
              term = conc_0_0.instance.invoke(context, term);
              if(term == null)
                break Fail170;
              b_53 = term;
              term = termFactory.makeTuple(b_53, (IStrategoTerm)termFactory.makeListCons(x_52, termFactory.makeListCons(y_52, (IStrategoList)transform.constNil0)));
              term = make$Conc_0_0.instance.invoke(context, term);
              if(term == null)
                break Fail170;
              term = termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{transform.constCons29, term});
              if(true)
                break Success115;
            }
            term = term120;
          }
          Success116:
          { 
            if(cons20 == transform._consMemberName_1)
            { 
              Fail171:
              { 
                IStrategoTerm w_52 = null;
                w_52 = term.getSubterm(0);
                term = termFactory.makeAppl(transform._consS_1, new IStrategoTerm[]{w_52});
                if(true)
                  break Success116;
              }
              term = term120;
            }
            Success117:
            { 
              if(cons20 == transform._consMemberName_2)
              { 
                Fail172:
                { 
                  IStrategoTerm u_52 = null;
                  IStrategoTerm v_52 = null;
                  u_52 = term.getSubterm(0);
                  v_52 = term.getSubterm(1);
                  term = termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{transform.constCons25, (IStrategoTerm)termFactory.makeListCons(u_52, termFactory.makeListCons(transform.constS23, termFactory.makeListCons(termFactory.makeAppl(transform._consS_1, new IStrategoTerm[]{v_52}), (IStrategoList)transform.constNil0)))});
                  if(true)
                    break Success117;
                }
                term = term120;
              }
              Success118:
              { 
                if(cons20 == transform._consWildcardMemberName_2)
                { 
                  Fail173:
                  { 
                    IStrategoTerm s_52 = null;
                    IStrategoTerm t_52 = null;
                    s_52 = term.getSubterm(0);
                    t_52 = term.getSubterm(1);
                    term = termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{transform.constCons25, (IStrategoTerm)termFactory.makeListCons(s_52, termFactory.makeListCons(transform.constS28, termFactory.makeListCons(termFactory.makeAppl(transform._consS_1, new IStrategoTerm[]{t_52}), (IStrategoList)transform.constNil0)))});
                    if(true)
                      break Success118;
                  }
                  term = term120;
                }
                Success119:
                { 
                  if(cons20 == transform._consConstrName_0)
                  { 
                    Fail174:
                    { 
                      term = transform.constFBOX19;
                      if(true)
                        break Success119;
                    }
                    term = term120;
                  }
                  Success120:
                  { 
                    if(cons20 == transform._consConstrName_1)
                    { 
                      Fail175:
                      { 
                        IStrategoTerm r_52 = null;
                        r_52 = term.getSubterm(0);
                        term = termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{transform.constCons25, (IStrategoTerm)termFactory.makeListCons(r_52, (IStrategoList)transform.constCons34)});
                        if(true)
                          break Success120;
                      }
                      term = term120;
                    }
                    Success121:
                    { 
                      if(cons20 == transform._consWildcardConstrName_1)
                      { 
                        Fail176:
                        { 
                          IStrategoTerm q_52 = null;
                          q_52 = term.getSubterm(0);
                          term = termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{transform.constCons25, (IStrategoTerm)termFactory.makeListCons(q_52, (IStrategoList)transform.constCons35)});
                          if(true)
                            break Success121;
                        }
                        term = term120;
                      }
                      Success122:
                      { 
                        if(cons20 == transform._consNot_1)
                        { 
                          Fail177:
                          { 
                            IStrategoTerm p_52 = null;
                            p_52 = term.getSubterm(0);
                            term = termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{transform.constCons25, (IStrategoTerm)termFactory.makeListCons(transform.constS32, termFactory.makeListCons(p_52, (IStrategoList)transform.constNil0))});
                            if(true)
                              break Success122;
                          }
                          term = term120;
                        }
                        Success123:
                        { 
                          if(cons20 == transform._consModPattern_1)
                          { 
                            Fail178:
                            { 
                              IStrategoTerm o_52 = null;
                              o_52 = term.getSubterm(0);
                              term = termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{transform.constCons29, o_52});
                              if(true)
                                break Success123;
                            }
                            term = term120;
                          }
                          Success124:
                          { 
                            if(cons20 == transform._consThrowsPattern_1)
                            { 
                              Fail179:
                              { 
                                IStrategoTerm l_52 = null;
                                l_52 = term.getSubterm(0);
                                term = separate_by_comma_0_0.instance.invoke(context, l_52);
                                if(term == null)
                                  break Fail179;
                                term = termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{transform.constCons29, (IStrategoTerm)termFactory.makeListCons(transform.constFBOX20, termFactory.makeListCons(term, (IStrategoList)transform.constNil0))});
                                if(true)
                                  break Success124;
                              }
                              term = term120;
                            }
                            Success125:
                            { 
                              if(cons20 == transform._consNotThrowsCondition_1)
                              { 
                                Fail180:
                                { 
                                  IStrategoTerm k_52 = null;
                                  k_52 = term.getSubterm(0);
                                  term = termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{transform.constCons25, (IStrategoTerm)termFactory.makeListCons(transform.constS32, termFactory.makeListCons(k_52, (IStrategoList)transform.constNil0))});
                                  if(true)
                                    break Success125;
                                }
                                term = term120;
                              }
                              Success126:
                              { 
                                if(cons20 == transform._consThrowsCondition_1)
                                { 
                                  Fail181:
                                  { 
                                    IStrategoTerm f_52 = null;
                                    f_52 = term.getSubterm(0);
                                    term = has_leftmost_not_0_0.instance.invoke(context, f_52);
                                    if(term == null)
                                      break Fail181;
                                    term = termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{transform.constCons25, (IStrategoTerm)termFactory.makeListCons(transform.constS1, termFactory.makeListCons(f_52, (IStrategoList)transform.constCons26))});
                                    if(true)
                                      break Success126;
                                  }
                                  term = term120;
                                }
                                Success127:
                                { 
                                  if(cons20 == transform._consThrowsCondition_1)
                                  { 
                                    Fail182:
                                    { 
                                      IStrategoTerm d_52 = null;
                                      d_52 = term.getSubterm(0);
                                      term = d_52;
                                      IStrategoTerm term133 = term;
                                      Success128:
                                      { 
                                        Fail183:
                                        { 
                                          term = has_leftmost_not_0_0.instance.invoke(context, term);
                                          if(term == null)
                                            break Fail183;
                                          { 
                                            if(true)
                                              break Fail182;
                                            if(true)
                                              break Success128;
                                          }
                                        }
                                        term = term133;
                                      }
                                      term = d_52;
                                      if(true)
                                        break Success127;
                                    }
                                    term = term120;
                                  }
                                  Success129:
                                  { 
                                    if(cons20 == transform._consSimpleAnnoPatternExact_1)
                                    { 
                                      Fail184:
                                      { 
                                        IStrategoTerm c_52 = null;
                                        c_52 = term.getSubterm(0);
                                        term = termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{transform.constCons25, (IStrategoTerm)termFactory.makeListCons(transform.constS34, termFactory.makeListCons(c_52, (IStrategoList)transform.constNil0))});
                                        if(true)
                                          break Success129;
                                      }
                                      term = term120;
                                    }
                                    Success130:
                                    { 
                                      if(cons20 == transform._consSimpleAnnoPattern_1)
                                      { 
                                        Fail185:
                                        { 
                                          IStrategoTerm b_52 = null;
                                          b_52 = term.getSubterm(0);
                                          term = termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{transform.constCons25, (IStrategoTerm)termFactory.makeListCons(transform.constS34, termFactory.makeListCons(transform.constS1, termFactory.makeListCons(b_52, (IStrategoList)transform.constCons26)))});
                                          if(true)
                                            break Success130;
                                        }
                                        term = term120;
                                      }
                                      Success131:
                                      { 
                                        if(cons20 == transform._consSimpleAnnoPatternValue_2)
                                        { 
                                          Fail186:
                                          { 
                                            IStrategoTerm z_51 = null;
                                            IStrategoTerm a_52 = null;
                                            z_51 = term.getSubterm(0);
                                            a_52 = term.getSubterm(1);
                                            term = termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{transform.constCons25, (IStrategoTerm)termFactory.makeListCons(transform.constS34, termFactory.makeListCons(z_51, termFactory.makeListCons(transform.constS1, termFactory.makeListCons(a_52, (IStrategoList)transform.constCons26))))});
                                            if(true)
                                              break Success131;
                                          }
                                          term = term120;
                                        }
                                        Success132:
                                        { 
                                          if(cons20 == transform._consNotComp_1)
                                          { 
                                            Fail187:
                                            { 
                                              IStrategoTerm y_51 = null;
                                              y_51 = term.getSubterm(0);
                                              term = termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{transform.constCons25, (IStrategoTerm)termFactory.makeListCons(transform.constS32, termFactory.makeListCons(y_51, (IStrategoList)transform.constNil0))});
                                              if(true)
                                                break Success132;
                                            }
                                            term = term120;
                                          }
                                          Success133:
                                          { 
                                            if(cons20 == transform._consAndComp_2)
                                            { 
                                              Fail188:
                                              { 
                                                IStrategoTerm w_51 = null;
                                                IStrategoTerm x_51 = null;
                                                w_51 = term.getSubterm(0);
                                                x_51 = term.getSubterm(1);
                                                term = termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{transform.constCons29, (IStrategoTerm)termFactory.makeListCons(w_51, termFactory.makeListCons(transform.constS35, termFactory.makeListCons(x_51, (IStrategoList)transform.constNil0)))});
                                                if(true)
                                                  break Success133;
                                              }
                                              term = term120;
                                            }
                                            Success134:
                                            { 
                                              if(cons20 == transform._consOrComp_2)
                                              { 
                                                Fail189:
                                                { 
                                                  IStrategoTerm u_51 = null;
                                                  IStrategoTerm v_51 = null;
                                                  u_51 = term.getSubterm(0);
                                                  v_51 = term.getSubterm(1);
                                                  term = termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{transform.constCons29, (IStrategoTerm)termFactory.makeListCons(u_51, termFactory.makeListCons(transform.constS36, termFactory.makeListCons(v_51, (IStrategoList)transform.constNil0)))});
                                                  if(true)
                                                    break Success134;
                                                }
                                                term = term120;
                                              }
                                              Success135:
                                              { 
                                                if(cons20 == transform._consIntertypeMethodDec_2)
                                                { 
                                                  Fail190:
                                                  { 
                                                    IStrategoTerm s_51 = null;
                                                    IStrategoTerm t_51 = null;
                                                    s_51 = term.getSubterm(0);
                                                    IStrategoTerm arg152 = term.getSubterm(1);
                                                    t_51 = arg152;
                                                    if(arg152.getTermType() != IStrategoTerm.APPL || transform._consBlock_1 != ((IStrategoAppl)arg152).getConstructor())
                                                      break Fail190;
                                                    term = termFactory.makeAppl(transform._consV_2, new IStrategoTerm[]{transform.constCons36, (IStrategoTerm)termFactory.makeListCons(s_51, termFactory.makeListCons(t_51, (IStrategoList)transform.constNil0))});
                                                    if(true)
                                                      break Success135;
                                                  }
                                                  term = term120;
                                                }
                                                Success136:
                                                { 
                                                  if(cons20 == transform._consIntertypeMethodDec_2)
                                                  { 
                                                    Fail191:
                                                    { 
                                                      IStrategoTerm r_51 = null;
                                                      r_51 = term.getSubterm(0);
                                                      IStrategoTerm arg154 = term.getSubterm(1);
                                                      if(arg154.getTermType() != IStrategoTerm.APPL || transform._consNoMethodBody_0 != ((IStrategoAppl)arg154).getConstructor())
                                                        break Fail191;
                                                      term = termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{transform.constCons25, (IStrategoTerm)termFactory.makeListCons(r_51, (IStrategoList)transform.constCons30)});
                                                      if(true)
                                                        break Success136;
                                                    }
                                                    term = term120;
                                                  }
                                                  Success137:
                                                  { 
                                                    if(cons20 == transform._consIntertypeMethodDecHead_8)
                                                    { 
                                                      Fail192:
                                                      { 
                                                        IStrategoTerm u_50 = null;
                                                        IStrategoTerm v_50 = null;
                                                        IStrategoTerm w_50 = null;
                                                        IStrategoTerm x_50 = null;
                                                        IStrategoTerm y_50 = null;
                                                        IStrategoTerm z_50 = null;
                                                        IStrategoTerm a_51 = null;
                                                        IStrategoTerm b_51 = null;
                                                        IStrategoTerm c_51 = null;
                                                        IStrategoTerm d_51 = null;
                                                        IStrategoTerm e_51 = null;
                                                        IStrategoTerm f_51 = null;
                                                        IStrategoTerm h_51 = null;
                                                        IStrategoTerm i_51 = null;
                                                        IStrategoTerm o_51 = null;
                                                        IStrategoTerm p_51 = null;
                                                        e_51 = term.getSubterm(0);
                                                        z_50 = term.getSubterm(1);
                                                        u_50 = term.getSubterm(2);
                                                        v_50 = term.getSubterm(3);
                                                        a_51 = term.getSubterm(4);
                                                        IStrategoTerm arg155 = term.getSubterm(5);
                                                        if(arg155.getTermType() != IStrategoTerm.APPL || transform._consId_1 != ((IStrategoAppl)arg155).getConstructor())
                                                          break Fail192;
                                                        w_50 = arg155.getSubterm(0);
                                                        x_50 = term.getSubterm(6);
                                                        c_51 = term.getSubterm(7);
                                                        i_51 = term;
                                                        term = list_to_args_0_0.instance.invoke(context, x_50);
                                                        if(term == null)
                                                          break Fail192;
                                                        y_50 = term;
                                                        term = type_params_to_boxes_0_0.instance.invoke(context, z_50);
                                                        if(term == null)
                                                          break Fail192;
                                                        f_51 = term;
                                                        term = type_params_to_boxes_0_0.instance.invoke(context, a_51);
                                                        if(term == null)
                                                          break Fail192;
                                                        b_51 = term;
                                                        term = option_to_boxes_0_0.instance.invoke(context, c_51);
                                                        if(term == null)
                                                          break Fail192;
                                                        d_51 = term;
                                                        term = termFactory.makeTuple(e_51, f_51);
                                                        term = conc_0_0.instance.invoke(context, term);
                                                        if(term == null)
                                                          break Fail192;
                                                        h_51 = term;
                                                        term = i_51;
                                                        p_51 = term;
                                                        term = termFactory.makeTuple(b_51, (IStrategoTerm)termFactory.makeListCons(transform.constS23, termFactory.makeListCons(termFactory.makeAppl(transform._consS_1, new IStrategoTerm[]{w_50}), termFactory.makeListCons(y_50, (IStrategoList)transform.constNil0))));
                                                        term = make$Conc_0_0.instance.invoke(context, term);
                                                        if(term == null)
                                                          break Fail192;
                                                        o_51 = term;
                                                        term = p_51;
                                                        IStrategoList list4;
                                                        IStrategoList list3;
                                                        list3 = checkListTail(d_51);
                                                        if(list3 == null)
                                                          break Fail192;
                                                        list4 = checkListTail(o_51);
                                                        if(list4 == null)
                                                          break Fail192;
                                                        term = termFactory.makeTuple(h_51, (IStrategoTerm)termFactory.makeListCons(u_50, termFactory.makeListCons(termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{transform.constCons25, (IStrategoTerm)termFactory.makeListCons(v_50, list4)}), list3)));
                                                        term = make$Conc_0_0.instance.invoke(context, term);
                                                        if(term == null)
                                                          break Fail192;
                                                        term = termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{transform.constCons29, term});
                                                        if(true)
                                                          break Success137;
                                                      }
                                                      term = term120;
                                                    }
                                                    Success138:
                                                    { 
                                                      if(cons20 == transform._consIntertypeConstrDec_2)
                                                      { 
                                                        Fail193:
                                                        { 
                                                          IStrategoTerm s_50 = null;
                                                          IStrategoTerm t_50 = null;
                                                          s_50 = term.getSubterm(0);
                                                          t_50 = term.getSubterm(1);
                                                          term = termFactory.makeAppl(transform._consV_2, new IStrategoTerm[]{transform.constCons36, (IStrategoTerm)termFactory.makeListCons(s_50, termFactory.makeListCons(t_50, (IStrategoList)transform.constNil0))});
                                                          if(true)
                                                            break Success138;
                                                        }
                                                        term = term120;
                                                      }
                                                      term = aspectj_to_box_0_0_fragment_1.instance.invoke(context, term);
                                                      if(term == null)
                                                        break Fail169;
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
      Fail194:
      { 
        IStrategoTerm term144 = term;
        IStrategoConstructor cons21 = term.getTermType() == IStrategoTerm.APPL ? ((IStrategoAppl)term).getConstructor() : null;
        Success139:
        { 
          if(cons21 == transform._consIntertypeConstrDecHead_6)
          { 
            Fail195:
            { 
              IStrategoTerm c_50 = null;
              IStrategoTerm d_50 = null;
              IStrategoTerm e_50 = null;
              IStrategoTerm f_50 = null;
              IStrategoTerm g_50 = null;
              IStrategoTerm h_50 = null;
              IStrategoTerm i_50 = null;
              IStrategoTerm j_50 = null;
              IStrategoTerm k_50 = null;
              IStrategoTerm l_50 = null;
              IStrategoTerm m_50 = null;
              IStrategoTerm n_50 = null;
              IStrategoTerm q_50 = null;
              IStrategoTerm r_50 = null;
              k_50 = term.getSubterm(0);
              f_50 = term.getSubterm(1);
              c_50 = term.getSubterm(2);
              g_50 = term.getSubterm(3);
              d_50 = term.getSubterm(4);
              i_50 = term.getSubterm(5);
              n_50 = term;
              term = list_to_args_0_0.instance.invoke(context, d_50);
              if(term == null)
                break Fail195;
              e_50 = term;
              term = type_params_to_boxes_0_0.instance.invoke(context, f_50);
              if(term == null)
                break Fail195;
              l_50 = term;
              term = type_params_to_boxes_0_0.instance.invoke(context, g_50);
              if(term == null)
                break Fail195;
              h_50 = term;
              term = option_to_boxes_0_0.instance.invoke(context, i_50);
              if(term == null)
                break Fail195;
              j_50 = term;
              term = termFactory.makeTuple(k_50, l_50);
              term = conc_0_0.instance.invoke(context, term);
              if(term == null)
                break Fail195;
              m_50 = term;
              term = n_50;
              r_50 = term;
              term = termFactory.makeTuple(h_50, (IStrategoTerm)termFactory.makeListCons(transform.constS23, termFactory.makeListCons(transform.constFBOX19, termFactory.makeListCons(e_50, (IStrategoList)transform.constNil0))));
              term = make$Conc_0_0.instance.invoke(context, term);
              if(term == null)
                break Fail195;
              q_50 = term;
              term = r_50;
              IStrategoList list6;
              IStrategoList list5;
              list5 = checkListTail(j_50);
              if(list5 == null)
                break Fail195;
              list6 = checkListTail(q_50);
              if(list6 == null)
                break Fail195;
              term = termFactory.makeTuple(m_50, (IStrategoTerm)termFactory.makeListCons(termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{transform.constCons25, (IStrategoTerm)termFactory.makeListCons(c_50, list6)}), list5));
              term = make$Conc_0_0.instance.invoke(context, term);
              if(term == null)
                break Fail195;
              term = termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{transform.constCons29, term});
              if(true)
                break Success139;
            }
            term = term144;
          }
          Success140:
          { 
            if(cons21 == transform._consIntertypeFieldDec_5)
            { 
              Fail196:
              { 
                IStrategoTerm r_49 = null;
                IStrategoTerm s_49 = null;
                IStrategoTerm t_49 = null;
                IStrategoTerm u_49 = null;
                IStrategoTerm v_49 = null;
                IStrategoTerm w_49 = null;
                IStrategoTerm x_49 = null;
                IStrategoTerm a_50 = null;
                IStrategoTerm b_50 = null;
                r_49 = term.getSubterm(0);
                s_49 = term.getSubterm(1);
                t_49 = term.getSubterm(2);
                v_49 = term.getSubterm(3);
                u_49 = term.getSubterm(4);
                x_49 = term;
                term = option_to_boxes_0_0.instance.invoke(context, v_49);
                if(term == null)
                  break Fail196;
                w_49 = term;
                term = x_49;
                b_50 = term;
                term = termFactory.makeTuple(w_49, (IStrategoTerm)termFactory.makeListCons(transform.constS23, termFactory.makeListCons(u_49, (IStrategoList)transform.constCons30)));
                term = make$Conc_0_0.instance.invoke(context, term);
                if(term == null)
                  break Fail196;
                a_50 = term;
                term = b_50;
                IStrategoList list7;
                list7 = checkListTail(a_50);
                if(list7 == null)
                  break Fail196;
                term = termFactory.makeTuple(r_49, (IStrategoTerm)termFactory.makeListCons(s_49, termFactory.makeListCons(termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{transform.constCons25, (IStrategoTerm)termFactory.makeListCons(t_49, list7)}), (IStrategoList)transform.constNil0)));
                term = make$Conc_0_0.instance.invoke(context, term);
                if(term == null)
                  break Fail196;
                term = termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{transform.constCons29, term});
                if(true)
                  break Success140;
              }
              term = term144;
            }
            Success141:
            { 
              if(cons21 == transform._consAdviceDec_5)
              { 
                Fail197:
                { 
                  IStrategoTerm g_49 = null;
                  IStrategoTerm h_49 = null;
                  IStrategoTerm i_49 = null;
                  IStrategoTerm j_49 = null;
                  IStrategoTerm k_49 = null;
                  IStrategoTerm l_49 = null;
                  IStrategoTerm m_49 = null;
                  IStrategoTerm p_49 = null;
                  IStrategoTerm q_49 = null;
                  g_49 = term.getSubterm(0);
                  h_49 = term.getSubterm(1);
                  k_49 = term.getSubterm(2);
                  i_49 = term.getSubterm(3);
                  j_49 = term.getSubterm(4);
                  m_49 = term;
                  term = option_to_boxes_0_0.instance.invoke(context, k_49);
                  if(term == null)
                    break Fail197;
                  l_49 = term;
                  term = m_49;
                  q_49 = term;
                  term = termFactory.makeTuple(l_49, (IStrategoTerm)termFactory.makeListCons(transform.constFBOX21, termFactory.makeListCons(i_49, (IStrategoList)transform.constNil0)));
                  term = make$Conc_0_0.instance.invoke(context, term);
                  if(term == null)
                    break Fail197;
                  p_49 = term;
                  term = q_49;
                  IStrategoList list8;
                  list8 = checkListTail(p_49);
                  if(list8 == null)
                    break Fail197;
                  term = termFactory.makeTuple(g_49, (IStrategoTerm)termFactory.makeListCons(h_49, list8));
                  term = make$Conc_0_0.instance.invoke(context, term);
                  if(term == null)
                    break Fail197;
                  term = termFactory.makeAppl(transform._consV_2, new IStrategoTerm[]{transform.constCons36, (IStrategoTerm)termFactory.makeListCons(termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{transform.constCons29, term}), termFactory.makeListCons(j_49, (IStrategoList)transform.constNil0))});
                  if(true)
                    break Success141;
                }
                term = term144;
              }
              Success142:
              { 
                if(cons21 == transform._consBefore_1)
                { 
                  Fail198:
                  { 
                    IStrategoTerm d_49 = null;
                    d_49 = term.getSubterm(0);
                    term = separate_by_comma_0_0.instance.invoke(context, d_49);
                    if(term == null)
                      break Fail198;
                    term = termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{transform.constCons25, (IStrategoTerm)termFactory.makeListCons(transform.constFBOX24, termFactory.makeListCons(transform.constFBOX23, termFactory.makeListCons(term, (IStrategoList)transform.constCons37)))});
                    if(true)
                      break Success142;
                  }
                  term = term144;
                }
                Success143:
                { 
                  if(cons21 == transform._consAfter_2)
                  { 
                    Fail199:
                    { 
                      IStrategoTerm z_48 = null;
                      IStrategoTerm a_49 = null;
                      a_49 = term.getSubterm(0);
                      z_48 = term.getSubterm(1);
                      term = separate_by_comma_0_0.instance.invoke(context, a_49);
                      if(term == null)
                        break Fail199;
                      term = termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{transform.constCons29, (IStrategoTerm)termFactory.makeListCons(termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{transform.constCons25, (IStrategoTerm)termFactory.makeListCons(transform.constFBOX25, termFactory.makeListCons(transform.constFBOX23, termFactory.makeListCons(term, (IStrategoList)transform.constCons37)))}), termFactory.makeListCons(z_48, (IStrategoList)transform.constNil0))});
                      if(true)
                        break Success143;
                    }
                    term = term144;
                  }
                  Success144:
                  { 
                    if(cons21 == transform._consAround_2)
                    { 
                      Fail200:
                      { 
                        IStrategoTerm v_48 = null;
                        IStrategoTerm w_48 = null;
                        v_48 = term.getSubterm(0);
                        w_48 = term.getSubterm(1);
                        term = separate_by_comma_0_0.instance.invoke(context, w_48);
                        if(term == null)
                          break Fail200;
                        term = termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{transform.constCons29, (IStrategoTerm)termFactory.makeListCons(v_48, termFactory.makeListCons(termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{transform.constCons25, (IStrategoTerm)termFactory.makeListCons(transform.constFBOX26, termFactory.makeListCons(transform.constFBOX23, termFactory.makeListCons(term, (IStrategoList)transform.constCons37)))}), (IStrategoList)transform.constNil0))});
                        if(true)
                          break Success144;
                      }
                      term = term144;
                    }
                    Success145:
                    { 
                      if(cons21 == transform._consReturning_0)
                      { 
                        Fail201:
                        { 
                          term = transform.constFBOX27;
                          if(true)
                            break Success145;
                        }
                        term = term144;
                      }
                      Success146:
                      { 
                        if(cons21 == transform._consReturning_1)
                        { 
                          Fail202:
                          { 
                            IStrategoTerm u_48 = null;
                            u_48 = term.getSubterm(0);
                            term = termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{transform.constCons25, (IStrategoTerm)termFactory.makeListCons(transform.constFBOX27, termFactory.makeListCons(transform.constFBOX23, termFactory.makeListCons(u_48, (IStrategoList)transform.constCons37)))});
                            if(true)
                              break Success146;
                          }
                          term = term144;
                        }
                        Success147:
                        { 
                          if(cons21 == transform._consThrowing_0)
                          { 
                            Fail203:
                            { 
                              term = transform.constFBOX28;
                              if(true)
                                break Success147;
                            }
                            term = term144;
                          }
                          Success148:
                          { 
                            if(cons21 == transform._consThrowing_1)
                            { 
                              Fail204:
                              { 
                                IStrategoTerm t_48 = null;
                                t_48 = term.getSubterm(0);
                                term = termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{transform.constCons25, (IStrategoTerm)termFactory.makeListCons(transform.constFBOX28, termFactory.makeListCons(transform.constFBOX23, termFactory.makeListCons(t_48, (IStrategoList)transform.constCons37)))});
                                if(true)
                                  break Success148;
                              }
                              term = term144;
                            }
                            Success149:
                            { 
                              if(cons21 == transform._consDecParent_3)
                              { 
                                Fail205:
                                { 
                                  IStrategoTerm o_48 = null;
                                  IStrategoTerm p_48 = null;
                                  IStrategoTerm q_48 = null;
                                  o_48 = term.getSubterm(0);
                                  p_48 = term.getSubterm(1);
                                  q_48 = term.getSubterm(2);
                                  term = termFactory.makeTuple(o_48, (IStrategoTerm)termFactory.makeListCons(transform.constFBOX30, termFactory.makeListCons(transform.constFBOX29, termFactory.makeListCons(transform.constFBOX21, termFactory.makeListCons(p_48, termFactory.makeListCons(q_48, (IStrategoList)transform.constCons38))))));
                                  term = make$Conc_0_0.instance.invoke(context, term);
                                  if(term == null)
                                    break Fail205;
                                  term = termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{transform.constCons29, term});
                                  if(true)
                                    break Success149;
                                }
                                term = term144;
                              }
                              Success150:
                              { 
                                if(cons21 == transform._consDecWarning_3)
                                { 
                                  Fail206:
                                  { 
                                    IStrategoTerm j_48 = null;
                                    IStrategoTerm k_48 = null;
                                    IStrategoTerm l_48 = null;
                                    j_48 = term.getSubterm(0);
                                    k_48 = term.getSubterm(1);
                                    l_48 = term.getSubterm(2);
                                    term = termFactory.makeTuple(j_48, (IStrategoTerm)termFactory.makeListCons(transform.constFBOX30, termFactory.makeListCons(transform.constFBOX31, termFactory.makeListCons(transform.constFBOX21, termFactory.makeListCons(k_48, termFactory.makeListCons(transform.constFBOX21, termFactory.makeListCons(l_48, (IStrategoList)transform.constCons38)))))));
                                    term = make$Conc_0_0.instance.invoke(context, term);
                                    if(term == null)
                                      break Fail206;
                                    term = termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{transform.constCons29, term});
                                    if(true)
                                      break Success150;
                                  }
                                  term = term144;
                                }
                                term = aspectj_to_box_0_0_fragment_0.instance.invoke(context, term);
                                if(term == null)
                                  break Fail194;
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
      Fail207:
      { 
        IStrategoTerm term156 = term;
        IStrategoConstructor cons22 = term.getTermType() == IStrategoTerm.APPL ? ((IStrategoAppl)term).getConstructor() : null;
        Success151:
        { 
          if(cons22 == transform._consDecError_2)
          { 
            Fail208:
            { 
              IStrategoTerm h_48 = null;
              IStrategoTerm i_48 = null;
              h_48 = term.getSubterm(0);
              i_48 = term.getSubterm(1);
              term = termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{transform.constCons29, (IStrategoTerm)termFactory.makeListCons(transform.constFBOX30, termFactory.makeListCons(transform.constFBOX32, termFactory.makeListCons(transform.constFBOX21, termFactory.makeListCons(h_48, termFactory.makeListCons(transform.constFBOX21, termFactory.makeListCons(i_48, (IStrategoList)transform.constCons38))))))});
              if(true)
                break Success151;
            }
            term = term156;
          }
          Success152:
          { 
            if(cons22 == transform._consDecSoft_2)
            { 
              Fail209:
              { 
                IStrategoTerm f_48 = null;
                IStrategoTerm g_48 = null;
                f_48 = term.getSubterm(0);
                g_48 = term.getSubterm(1);
                term = termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{transform.constCons29, (IStrategoTerm)termFactory.makeListCons(transform.constFBOX30, termFactory.makeListCons(transform.constFBOX33, termFactory.makeListCons(transform.constFBOX21, termFactory.makeListCons(f_48, termFactory.makeListCons(transform.constFBOX21, termFactory.makeListCons(g_48, (IStrategoList)transform.constCons38))))))});
                if(true)
                  break Success152;
              }
              term = term156;
            }
            Success153:
            { 
              if(cons22 == transform._consDecPrecedence_2)
              { 
                Fail210:
                { 
                  IStrategoTerm z_47 = null;
                  IStrategoTerm a_48 = null;
                  IStrategoTerm b_48 = null;
                  z_47 = term.getSubterm(0);
                  a_48 = term.getSubterm(1);
                  term = separate_by_comma_0_0.instance.invoke(context, a_48);
                  if(term == null)
                    break Fail210;
                  b_48 = term;
                  term = termFactory.makeTuple(z_47, (IStrategoTerm)termFactory.makeListCons(transform.constFBOX30, termFactory.makeListCons(transform.constFBOX34, termFactory.makeListCons(transform.constFBOX21, termFactory.makeListCons(b_48, (IStrategoList)transform.constCons38)))));
                  term = make$Conc_0_0.instance.invoke(context, term);
                  if(term == null)
                    break Fail210;
                  term = termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{transform.constCons29, term});
                  if(true)
                    break Success153;
                }
                term = term156;
              }
              Success154:
              { 
                if(cons22 == transform._consDecAnno_4)
                { 
                  Fail211:
                  { 
                    IStrategoTerm t_47 = null;
                    IStrategoTerm u_47 = null;
                    IStrategoTerm v_47 = null;
                    IStrategoTerm w_47 = null;
                    t_47 = term.getSubterm(0);
                    u_47 = term.getSubterm(1);
                    v_47 = term.getSubterm(2);
                    w_47 = term.getSubterm(3);
                    term = termFactory.makeTuple(t_47, (IStrategoTerm)termFactory.makeListCons(transform.constFBOX30, termFactory.makeListCons(u_47, termFactory.makeListCons(transform.constS26, termFactory.makeListCons(v_47, termFactory.makeListCons(transform.constS26, termFactory.makeListCons(w_47, (IStrategoList)transform.constCons30)))))));
                    term = make$Conc_0_0.instance.invoke(context, term);
                    if(term == null)
                      break Fail211;
                    term = termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{transform.constCons29, term});
                    if(true)
                      break Success154;
                  }
                  term = term156;
                }
                Success155:
                { 
                  if(cons22 == transform._consDecAnnoType_0)
                  { 
                    Fail212:
                    { 
                      term = transform.constS48;
                      if(true)
                        break Success155;
                    }
                    term = term156;
                  }
                  Success156:
                  { 
                    if(cons22 == transform._consDecAnnoConstructor_0)
                    { 
                      Fail213:
                      { 
                        term = transform.constS49;
                        if(true)
                          break Success156;
                      }
                      term = term156;
                    }
                    Success157:
                    { 
                      if(cons22 == transform._consDecAnnoMethod_0)
                      { 
                        Fail214:
                        { 
                          term = transform.constS50;
                          if(true)
                            break Success157;
                        }
                        term = term156;
                      }
                      Success158:
                      { 
                        if(cons22 == transform._consDecAnnoField_0)
                        { 
                          Fail215:
                          { 
                            term = transform.constS51;
                            if(true)
                              break Success158;
                          }
                          term = term156;
                        }
                        Success159:
                        { 
                          if(cons22 == transform._consAspectDec_2)
                          { 
                            Fail216:
                            { 
                              IStrategoTerm r_47 = null;
                              IStrategoTerm s_47 = null;
                              r_47 = term.getSubterm(0);
                              s_47 = term.getSubterm(1);
                              term = termFactory.makeAppl(transform._consV_2, new IStrategoTerm[]{transform.constCons36, (IStrategoTerm)termFactory.makeListCons(r_47, termFactory.makeListCons(s_47, (IStrategoList)transform.constNil0))});
                              if(true)
                                break Success159;
                            }
                            term = term156;
                          }
                          Success160:
                          { 
                            if(cons22 == transform._consAspectDecHead_6)
                            { 
                              Fail217:
                              { 
                                IStrategoTerm y_46 = null;
                                IStrategoTerm z_46 = null;
                                IStrategoTerm a_47 = null;
                                IStrategoTerm b_47 = null;
                                IStrategoTerm c_47 = null;
                                IStrategoTerm d_47 = null;
                                IStrategoTerm e_47 = null;
                                IStrategoTerm f_47 = null;
                                IStrategoTerm g_47 = null;
                                IStrategoTerm h_47 = null;
                                IStrategoTerm i_47 = null;
                                IStrategoTerm l_47 = null;
                                IStrategoTerm m_47 = null;
                                y_46 = term.getSubterm(0);
                                z_46 = term.getSubterm(1);
                                a_47 = term.getSubterm(2);
                                c_47 = term.getSubterm(3);
                                e_47 = term.getSubterm(4);
                                g_47 = term.getSubterm(5);
                                i_47 = term;
                                term = option_to_boxes_0_0.instance.invoke(context, a_47);
                                if(term == null)
                                  break Fail217;
                                b_47 = term;
                                term = option_to_boxes_0_0.instance.invoke(context, c_47);
                                if(term == null)
                                  break Fail217;
                                d_47 = term;
                                term = option_to_boxes_0_0.instance.invoke(context, e_47);
                                if(term == null)
                                  break Fail217;
                                f_47 = term;
                                term = option_to_boxes_0_0.instance.invoke(context, g_47);
                                if(term == null)
                                  break Fail217;
                                h_47 = term;
                                term = i_47;
                                m_47 = term;
                                term = termFactory.makeTuple(f_47, h_47);
                                term = make$Conc_0_0.instance.invoke(context, term);
                                if(term == null)
                                  break Fail217;
                                term = termFactory.makeTuple(d_47, term);
                                term = make$Conc_0_0.instance.invoke(context, term);
                                if(term == null)
                                  break Fail217;
                                term = termFactory.makeTuple(b_47, term);
                                term = make$Conc_0_0.instance.invoke(context, term);
                                if(term == null)
                                  break Fail217;
                                l_47 = term;
                                term = m_47;
                                IStrategoList list9;
                                list9 = checkListTail(l_47);
                                if(list9 == null)
                                  break Fail217;
                                term = termFactory.makeTuple(y_46, (IStrategoTerm)termFactory.makeListCons(transform.constFBOX35, termFactory.makeListCons(z_46, list9)));
                                term = make$Conc_0_0.instance.invoke(context, term);
                                if(term == null)
                                  break Fail217;
                                term = termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{transform.constCons29, term});
                                if(true)
                                  break Success160;
                              }
                              term = term156;
                            }
                            Success161:
                            { 
                              if(cons22 == transform._consPerTarget_1)
                              { 
                                Fail218:
                                { 
                                  IStrategoTerm x_46 = null;
                                  x_46 = term.getSubterm(0);
                                  term = termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{transform.constCons25, (IStrategoTerm)termFactory.makeListCons(transform.constFBOX36, termFactory.makeListCons(transform.constS1, termFactory.makeListCons(x_46, (IStrategoList)transform.constCons26)))});
                                  if(true)
                                    break Success161;
                                }
                                term = term156;
                              }
                              Success162:
                              { 
                                if(cons22 == transform._consPerThis_1)
                                { 
                                  Fail219:
                                  { 
                                    IStrategoTerm w_46 = null;
                                    w_46 = term.getSubterm(0);
                                    term = termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{transform.constCons25, (IStrategoTerm)termFactory.makeListCons(transform.constFBOX37, termFactory.makeListCons(transform.constS1, termFactory.makeListCons(w_46, (IStrategoList)transform.constCons26)))});
                                    if(true)
                                      break Success162;
                                  }
                                  term = term156;
                                }
                                Success163:
                                { 
                                  if(cons22 == transform._consPerCFlow_1)
                                  { 
                                    Fail220:
                                    { 
                                      IStrategoTerm v_46 = null;
                                      v_46 = term.getSubterm(0);
                                      term = termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{transform.constCons25, (IStrategoTerm)termFactory.makeListCons(transform.constFBOX38, termFactory.makeListCons(transform.constS1, termFactory.makeListCons(v_46, (IStrategoList)transform.constCons26)))});
                                      if(true)
                                        break Success163;
                                    }
                                    term = term156;
                                  }
                                  Success164:
                                  { 
                                    if(cons22 == transform._consPerCFlowBelow_1)
                                    { 
                                      Fail221:
                                      { 
                                        IStrategoTerm u_46 = null;
                                        u_46 = term.getSubterm(0);
                                        term = termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{transform.constCons25, (IStrategoTerm)termFactory.makeListCons(transform.constFBOX39, termFactory.makeListCons(transform.constS1, termFactory.makeListCons(u_46, (IStrategoList)transform.constCons26)))});
                                        if(true)
                                          break Success164;
                                      }
                                      term = term156;
                                    }
                                    Success165:
                                    { 
                                      if(cons22 == transform._consPerTypeWithin_1)
                                      { 
                                        Fail222:
                                        { 
                                          IStrategoTerm t_46 = null;
                                          t_46 = term.getSubterm(0);
                                          term = termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{transform.constCons25, (IStrategoTerm)termFactory.makeListCons(transform.constFBOX40, termFactory.makeListCons(transform.constS1, termFactory.makeListCons(t_46, (IStrategoList)transform.constCons26)))});
                                          if(true)
                                            break Success165;
                                        }
                                        term = term156;
                                      }
                                      Success166:
                                      { 
                                        if(cons22 == transform._consIsSingleton_0)
                                        { 
                                          Fail223:
                                          { 
                                            term = transform.constFBOX41;
                                            if(true)
                                              break Success166;
                                          }
                                          term = term156;
                                        }
                                        Success167:
                                        { 
                                          if(cons22 == transform._consAspectBody_1)
                                          { 
                                            Fail224:
                                            { 
                                              IStrategoTerm s_46 = null;
                                              s_46 = term.getSubterm(0);
                                              term = termFactory.makeAppl(transform._consV_2, new IStrategoTerm[]{transform.constNil0, (IStrategoTerm)termFactory.makeListCons(termFactory.makeAppl(transform._consV_2, new IStrategoTerm[]{transform.constCons41, (IStrategoTerm)termFactory.makeListCons(transform.constFBOX43, termFactory.makeListCons(termFactory.makeAppl(transform._consV_2, new IStrategoTerm[]{transform.constCons42, s_46}), (IStrategoList)transform.constNil0))}), (IStrategoList)transform.constCons39)});
                                              if(true)
                                                break Success167;
                                            }
                                            term = term156;
                                          }
                                          Success168:
                                          { 
                                            if(cons22 == transform._consPrivileged_0)
                                            { 
                                              Fail225:
                                              { 
                                                term = transform.constFBOX44;
                                                if(true)
                                                  break Success168;
                                              }
                                              term = term156;
                                            }
                                            if(cons22 == transform._consProceed_0)
                                            { 
                                              term = transform.constFBOX45;
                                            }
                                            else
                                            { 
                                              break Fail207;
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
      Fail226:
      { 
        IStrategoTerm term174 = term;
        IStrategoConstructor cons23 = term.getTermType() == IStrategoTerm.APPL ? ((IStrategoAppl)term).getConstructor() : null;
        Success169:
        { 
          if(cons23 == transform._consCall_1)
          { 
            Fail227:
            { 
              IStrategoTerm z_56 = null;
              z_56 = term.getSubterm(0);
              term = termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{transform.constCons25, (IStrategoTerm)termFactory.makeListCons(transform.constFBOX46, termFactory.makeListCons(transform.constS1, termFactory.makeListCons(z_56, (IStrategoList)transform.constCons26)))});
              if(true)
                break Success169;
            }
            term = term174;
          }
          Success170:
          { 
            if(cons23 == transform._consExec_1)
            { 
              Fail228:
              { 
                IStrategoTerm y_56 = null;
                y_56 = term.getSubterm(0);
                term = termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{transform.constCons25, (IStrategoTerm)termFactory.makeListCons(transform.constFBOX47, termFactory.makeListCons(transform.constS1, termFactory.makeListCons(y_56, (IStrategoList)transform.constCons26)))});
                if(true)
                  break Success170;
              }
              term = term174;
            }
            term = aspectj_to_box_0_0_fragment_4.instance.invoke(context, term);
            if(term == null)
              break Fail226;
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
      Fail229:
      { 
        term = a_57.instance.invoke(context, term);
        if(term == null)
          break Fail229;
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
      Fail230:
      { 
        IStrategoTerm term178 = term;
        IStrategoConstructor cons24 = term.getTermType() == IStrategoTerm.APPL ? ((IStrategoAppl)term).getConstructor() : null;
        Success171:
        { 
          if(cons24 == transform._consSome_1)
          { 
            Fail231:
            { 
              IStrategoTerm b_57 = null;
              b_57 = term.getSubterm(0);
              term = b_57;
              term = (IStrategoTerm)termFactory.makeListCons(term, (IStrategoList)transform.constNil0);
              if(true)
                break Success171;
            }
            term = term178;
          }
          if(cons24 == transform._consNone_0)
          { 
            term = transform.constNil0;
          }
          else
          { 
            break Fail230;
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
      Fail232:
      { 
        IStrategoTerm h_57 = null;
        term = pp_java5_to_abox_1_0.instance.invoke(context, term, lifted76.instance);
        if(term == null)
          break Fail232;
        h_57 = term;
        term = box2text_string_0_1.instance.invoke(context, h_57, transform.const107);
        if(term == null)
          break Fail232;
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
      Fail233:
      { 
        term = handle_io_0_0.instance.invoke(context, term);
        if(term == null)
          break Fail233;
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
      Fail234:
      { 
        IStrategoTerm n_57 = null;
        IStrategoTerm o_57 = null;
        IStrategoTerm p_57 = null;
        IStrategoTerm q_57 = null;
        IStrategoTerm s_57 = null;
        IStrategoTerm x_57 = null;
        IStrategoTerm u_57 = null;
        if(term.getTermType() != IStrategoTerm.LIST || ((IStrategoList)term).isEmpty())
          break Fail234;
        n_57 = ((IStrategoList)term).tail();
        term = debug_0_0.instance.invoke(context, n_57);
        if(term == null)
          break Fail234;
        term = n_57;
        if(term.getTermType() != IStrategoTerm.LIST || ((IStrategoList)term).isEmpty())
          break Fail234;
        s_57 = ((IStrategoList)term).head();
        term = s_57;
        term = $Read$From$File_0_0.instance.invoke(context, term);
        if(term == null)
          break Fail234;
        o_57 = term;
        term = n_57;
        if(term.getTermType() != IStrategoTerm.LIST || ((IStrategoList)term).isEmpty())
          break Fail234;
        x_57 = ((IStrategoList)term).tail();
        term = x_57;
        if(term.getTermType() != IStrategoTerm.LIST || ((IStrategoList)term).isEmpty())
          break Fail234;
        u_57 = ((IStrategoList)term).head();
        p_57 = u_57;
        term = convert_0_0.instance.invoke(context, o_57);
        if(term == null)
          break Fail234;
        term = pp_aspectj_string_0_0.instance.invoke(context, term);
        if(term == null)
          break Fail234;
        q_57 = term;
        term = termFactory.makeTuple(p_57, transform.const108);
        term = fopen_0_0.instance.invoke(context, term);
        if(term == null)
          break Fail234;
        term = termFactory.makeTuple(q_57, term);
        term = fputs_0_0.instance.invoke(context, term);
        if(term == null)
          break Fail234;
        term = fclose_0_0.instance.invoke(context, term);
        if(term == null)
          break Fail234;
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
      Fail235:
      { 
        term = try_1_0.instance.invoke(context, term, ejp_converter_compilation_unit_0_0.instance);
        if(term == null)
          break Fail235;
        context.popOnSuccess();
        if(true)
          return term;
      }
      context.popOnFailure();
      return null;
    }
  }

  @SuppressWarnings("all") public static class ejp_converter_compilation_unit_0_0 extends Strategy 
  { 
    public static ejp_converter_compilation_unit_0_0 instance = new ejp_converter_compilation_unit_0_0();

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      ITermFactory termFactory = context.getFactory();
      context.push("ejp_converter_compilation_unit_0_0");
      Fail236:
      { 
        IStrategoTerm h_58 = null;
        IStrategoTerm j_58 = null;
        IStrategoTerm k_58 = null;
        IStrategoTerm l_58 = null;
        TermReference m_58 = new TermReference();
        IStrategoTerm q_58 = null;
        IStrategoTerm r_58 = null;
        IStrategoTerm z_58 = null;
        if(term.getTermType() != IStrategoTerm.APPL || transform._consCompilationUnit_3 != ((IStrategoAppl)term).getConstructor())
          break Fail236;
        j_58 = term.getSubterm(0);
        k_58 = term.getSubterm(1);
        q_58 = term.getSubterm(2);
        z_58 = term;
        IStrategoTerm term180 = term;
        Success172:
        { 
          Fail237:
          { 
            IStrategoTerm term181 = term;
            Success173:
            { 
              Fail238:
              { 
                IStrategoTerm t_58 = null;
                IStrategoTerm a_59 = null;
                t_58 = term;
                term = SRTS_all.instance.invoke(context, q_58, lifted78.instance);
                if(term == null)
                  break Fail238;
                a_59 = term;
                h_58 = q_58;
                term = a_59;
                if(term != h_58 && !h_58.match(term))
                  break Fail238;
                term = t_58;
                { 
                  l_58 = k_58;
                  term = q_58;
                  r_58 = q_58;
                  if(true)
                    break Success173;
                }
              }
              term = term181;
              Success174:
              { 
                Fail239:
                { 
                  IStrategoTerm u_58 = null;
                  u_58 = term;
                  term = j_58;
                  if(term.getTermType() != IStrategoTerm.APPL || transform._consSome_1 != ((IStrategoAppl)term).getConstructor())
                    break Fail239;
                  IStrategoTerm arg156 = term.getSubterm(0);
                  if(arg156.getTermType() != IStrategoTerm.APPL || transform._consPackageDec_2 != ((IStrategoAppl)arg156).getConstructor())
                    break Fail239;
                  term = u_58;
                  { 
                    term = j_58;
                    if(term.getTermType() != IStrategoTerm.APPL || transform._consSome_1 != ((IStrategoAppl)term).getConstructor())
                      break Fail237;
                    IStrategoTerm arg159 = term.getSubterm(0);
                    if(arg159.getTermType() != IStrategoTerm.APPL || transform._consPackageDec_2 != ((IStrategoAppl)arg159).getConstructor())
                      break Fail237;
                    if(m_58.value == null)
                      m_58.value = arg159.getSubterm(1);
                    else
                      if(m_58.value != arg159.getSubterm(1) && !m_58.value.match(arg159.getSubterm(1)))
                        break Fail237;
                    if(true)
                      break Success174;
                  }
                }
                term = transform.constNone0;
                if(m_58.value == null)
                  m_58.value = term;
                else
                  if(m_58.value != term && !m_58.value.match(term))
                    break Fail237;
              }
              term = termFactory.makeTuple(k_58, transform.constCons45);
              term = conc_0_0.instance.invoke(context, term);
              if(term == null)
                break Fail237;
              l_58 = term;
              term = q_58;
              lifted80 lifted800 = new lifted80();
              lifted800.m_58 = m_58;
              term = SRTS_all.instance.invoke(context, term, lifted800);
              if(term == null)
                break Fail237;
              r_58 = term;
            }
            if(true)
              break Success172;
          }
          term = term180;
          IStrategoTerm v_58 = null;
          IStrategoTerm w_58 = null;
          IStrategoTerm d_59 = null;
          v_58 = term;
          term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
          if(term == null)
            break Fail236;
          w_58 = term;
          d_59 = v_58;
          term = report_with_failure_0_2.instance.invoke(context, d_59, transform.const110, w_58);
          if(term == null)
            break Fail236;
        }
        term = z_58;
        if(l_58 == null || r_58 == null)
          break Fail236;
        term = termFactory.makeAppl(transform._consCompilationUnit_3, new IStrategoTerm[]{j_58, l_58, r_58});
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
      Fail240:
      { 
        IStrategoTerm term183 = term;
        IStrategoConstructor cons25 = term.getTermType() == IStrategoTerm.APPL ? ((IStrategoAppl)term).getConstructor() : null;
        Success175:
        { 
          if(cons25 == transform._consClassDec_2)
          { 
            Fail241:
            { 
              IStrategoTerm q_59 = null;
              IStrategoTerm r_59 = null;
              IStrategoTerm s_59 = null;
              IStrategoTerm v_59 = null;
              q_59 = term.getSubterm(0);
              r_59 = term.getSubterm(1);
              v_59 = term;
              IStrategoTerm term184 = term;
              Success176:
              { 
                Fail242:
                { 
                  term = termFactory.makeAppl(transform._consClassDec_2, new IStrategoTerm[]{q_59, r_59});
                  term = topdown_1_0.instance.invoke(context, term, lifted82.instance);
                  if(term == null)
                    break Fail242;
                  s_59 = term;
                  if(true)
                    break Success176;
                }
                term = term184;
                IStrategoTerm t_59 = null;
                IStrategoTerm u_59 = null;
                IStrategoTerm x_59 = null;
                t_59 = term;
                term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
                if(term == null)
                  break Fail241;
                u_59 = term;
                x_59 = t_59;
                term = report_with_failure_0_2.instance.invoke(context, x_59, transform.const111, u_59);
                if(term == null)
                  break Fail241;
              }
              term = v_59;
              if(s_59 == null)
                break Fail241;
              term = s_59;
              if(true)
                break Success175;
            }
            term = term183;
          }
          if(cons25 == transform._consAspectDec_2)
          { 
            IStrategoTerm g_59 = null;
            IStrategoTerm h_59 = null;
            IStrategoTerm i_59 = null;
            IStrategoTerm l_59 = null;
            g_59 = term.getSubterm(0);
            h_59 = term.getSubterm(1);
            l_59 = term;
            IStrategoTerm term186 = term;
            Success177:
            { 
              Fail243:
              { 
                term = termFactory.makeAppl(transform._consAspectDec_2, new IStrategoTerm[]{g_59, h_59});
                term = topdown_1_0.instance.invoke(context, term, lifted84.instance);
                if(term == null)
                  break Fail243;
                i_59 = term;
                if(true)
                  break Success177;
              }
              term = term186;
              IStrategoTerm j_59 = null;
              IStrategoTerm k_59 = null;
              IStrategoTerm n_59 = null;
              j_59 = term;
              term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
              if(term == null)
                break Fail240;
              k_59 = term;
              n_59 = j_59;
              term = report_with_failure_0_2.instance.invoke(context, n_59, transform.const111, k_59);
              if(term == null)
                break Fail240;
            }
            term = l_59;
            if(i_59 == null)
              break Fail240;
            term = i_59;
          }
          else
          { 
            break Fail240;
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

  @SuppressWarnings("all") public static class ejp_converter_aspect_or_class_0_1 extends Strategy 
  { 
    public static ejp_converter_aspect_or_class_0_1 instance = new ejp_converter_aspect_or_class_0_1();

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm ref_l_72)
    { 
      ITermFactory termFactory = context.getFactory();
      TermReference l_72 = new TermReference(ref_l_72);
      context.push("ejp_converter_aspect_or_class_0_1");
      Fail244:
      { 
        IStrategoTerm term187 = term;
        Success178:
        { 
          Fail245:
          { 
            IStrategoTerm m_60 = null;
            TermReference n_60 = new TermReference();
            IStrategoTerm o_60 = null;
            TermReference p_60 = new TermReference();
            IStrategoTerm q_60 = null;
            IStrategoTerm t_60 = null;
            if(term.getTermType() != IStrategoTerm.APPL || transform._consAspectDec_2 != ((IStrategoAppl)term).getConstructor())
              break Fail245;
            m_60 = term.getSubterm(0);
            IStrategoTerm arg166 = term.getSubterm(1);
            if(arg166.getTermType() != IStrategoTerm.APPL || transform._consAspectBody_1 != ((IStrategoAppl)arg166).getConstructor())
              break Fail245;
            o_60 = arg166.getSubterm(0);
            t_60 = term;
            IStrategoTerm term188 = term;
            Success179:
            { 
              Fail246:
              { 
                IStrategoTerm y_60 = null;
                IStrategoTerm a_61 = null;
                term = m_60;
                if(term.getTermType() != IStrategoTerm.APPL || transform._consAspectDecHead_6 != ((IStrategoAppl)term).getConstructor())
                  break Fail246;
                IStrategoTerm arg168 = term.getSubterm(1);
                if(arg168.getTermType() != IStrategoTerm.APPL || transform._consId_1 != ((IStrategoAppl)arg168).getConstructor())
                  break Fail246;
                if(n_60.value == null)
                  n_60.value = arg168.getSubterm(0);
                else
                  if(n_60.value != arg168.getSubterm(0) && !n_60.value.match(arg168.getSubterm(0)))
                    break Fail246;
                term = new_iset_0_0.instance.invoke(context, term);
                if(term == null)
                  break Fail246;
                if(p_60.value == null)
                  p_60.value = term;
                else
                  if(p_60.value != term && !p_60.value.match(term))
                    break Fail246;
                a_61 = term;
                term = o_60;
                lifted86 lifted860 = new lifted86();
                lifted860.p_60 = p_60;
                lifted860.l_72 = l_72;
                lifted860.n_60 = n_60;
                term = topdown_1_0.instance.invoke(context, term, lifted860);
                if(term == null)
                  break Fail246;
                y_60 = term;
                term = a_61;
                if(p_60.value == null)
                  break Fail246;
                term = iset_elements_0_0.instance.invoke(context, p_60.value);
                if(term == null)
                  break Fail246;
                term = termFactory.makeTuple(y_60, term);
                term = conc_0_0.instance.invoke(context, term);
                if(term == null)
                  break Fail246;
                term = termFactory.makeAppl(transform._consAspectBody_1, new IStrategoTerm[]{term});
                q_60 = term;
                if(true)
                  break Success179;
              }
              term = term188;
              IStrategoTerm r_60 = null;
              IStrategoTerm s_60 = null;
              IStrategoTerm d_61 = null;
              r_60 = term;
              term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
              if(term == null)
                break Fail245;
              s_60 = term;
              d_61 = r_60;
              term = report_with_failure_0_2.instance.invoke(context, d_61, transform.const112, s_60);
              if(term == null)
                break Fail245;
            }
            term = t_60;
            if(q_60 == null)
              break Fail245;
            term = termFactory.makeAppl(transform._consAspectDec_2, new IStrategoTerm[]{m_60, q_60});
            if(true)
              break Success178;
          }
          term = term187;
          IStrategoTerm b_60 = null;
          IStrategoTerm c_60 = null;
          IStrategoTerm d_60 = null;
          IStrategoTerm g_60 = null;
          if(term.getTermType() != IStrategoTerm.APPL || transform._consClassDec_2 != ((IStrategoAppl)term).getConstructor())
            break Fail244;
          b_60 = term.getSubterm(0);
          c_60 = term.getSubterm(1);
          g_60 = term;
          IStrategoTerm term189 = term;
          Success180:
          { 
            Fail247:
            { 
              term = termFactory.makeAppl(transform._consClassDec_2, new IStrategoTerm[]{b_60, c_60});
              term = ejp_to_java2_0_0.instance.invoke(context, term);
              if(term == null)
                break Fail247;
              d_60 = term;
              if(true)
                break Success180;
            }
            term = term189;
            IStrategoTerm e_60 = null;
            IStrategoTerm f_60 = null;
            IStrategoTerm i_60 = null;
            e_60 = term;
            term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
            if(term == null)
              break Fail244;
            f_60 = term;
            i_60 = e_60;
            term = report_with_failure_0_2.instance.invoke(context, i_60, transform.const112, f_60);
            if(term == null)
              break Fail244;
          }
          term = g_60;
          if(d_60 == null)
            break Fail244;
          term = d_60;
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

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy g_62, Strategy h_62)
    { 
      ITermFactory termFactory = context.getFactory();
      context.push("OrComp_2_0");
      Fail248:
      { 
        IStrategoTerm p_200 = null;
        IStrategoTerm n_200 = null;
        IStrategoTerm o_200 = null;
        IStrategoTerm q_200 = null;
        if(term.getTermType() != IStrategoTerm.APPL || transform._consOrComp_2 != ((IStrategoAppl)term).getConstructor())
          break Fail248;
        n_200 = term.getSubterm(0);
        o_200 = term.getSubterm(1);
        IStrategoList annos0 = term.getAnnotations();
        p_200 = annos0;
        term = g_62.invoke(context, n_200);
        if(term == null)
          break Fail248;
        q_200 = term;
        term = h_62.invoke(context, o_200);
        if(term == null)
          break Fail248;
        term = termFactory.annotateTerm(termFactory.makeAppl(transform._consOrComp_2, new IStrategoTerm[]{q_200, term}), checkListAnnos(termFactory, p_200));
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

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy i_62, Strategy j_62)
    { 
      ITermFactory termFactory = context.getFactory();
      context.push("AndComp_2_0");
      Fail249:
      { 
        IStrategoTerm u_200 = null;
        IStrategoTerm s_200 = null;
        IStrategoTerm t_200 = null;
        IStrategoTerm v_200 = null;
        if(term.getTermType() != IStrategoTerm.APPL || transform._consAndComp_2 != ((IStrategoAppl)term).getConstructor())
          break Fail249;
        s_200 = term.getSubterm(0);
        t_200 = term.getSubterm(1);
        IStrategoList annos1 = term.getAnnotations();
        u_200 = annos1;
        term = i_62.invoke(context, s_200);
        if(term == null)
          break Fail249;
        v_200 = term;
        term = j_62.invoke(context, t_200);
        if(term == null)
          break Fail249;
        term = termFactory.annotateTerm(termFactory.makeAppl(transform._consAndComp_2, new IStrategoTerm[]{v_200, term}), checkListAnnos(termFactory, u_200));
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

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy l_62)
    { 
      ITermFactory termFactory = context.getFactory();
      context.push("NotComp_1_0");
      Fail250:
      { 
        IStrategoTerm y_200 = null;
        IStrategoTerm x_200 = null;
        if(term.getTermType() != IStrategoTerm.APPL || transform._consNotComp_1 != ((IStrategoAppl)term).getConstructor())
          break Fail250;
        x_200 = term.getSubterm(0);
        IStrategoList annos2 = term.getAnnotations();
        y_200 = annos2;
        term = l_62.invoke(context, x_200);
        if(term == null)
          break Fail250;
        term = termFactory.annotateTerm(termFactory.makeAppl(transform._consNotComp_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, y_200));
        context.popOnSuccess();
        if(true)
          return term;
      }
      context.popOnFailure();
      return null;
    }
  }

  @SuppressWarnings("all") private static final class lifted86 extends Strategy 
  { 
    TermReference p_60;

    TermReference l_72;

    TermReference n_60;

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      Fail251:
      { 
        lifted87 lifted870 = new lifted87();
        lifted870.p_60 = p_60;
        lifted870.l_72 = l_72;
        lifted870.n_60 = n_60;
        term = try_1_0.instance.invoke(context, term, lifted870);
        if(term == null)
          break Fail251;
        if(true)
          return term;
      }
      return null;
    }
  }

  @SuppressWarnings("all") private static final class lifted87 extends Strategy 
  { 
    TermReference p_60;

    TermReference l_72;

    TermReference n_60;

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      Fail252:
      { 
        term = ejp_to_ajc_0_3.instance.invoke(context, term, p_60.value, l_72.value, n_60.value);
        if(term == null)
          break Fail252;
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
      Fail253:
      { 
        term = try_1_0.instance.invoke(context, term, remove_ejp_decs_0_0.instance);
        if(term == null)
          break Fail253;
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
      Fail254:
      { 
        term = try_1_0.instance.invoke(context, term, lifted83.instance);
        if(term == null)
          break Fail254;
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
      Fail255:
      { 
        IStrategoTerm term185 = term;
        IStrategoConstructor cons26 = term.getTermType() == IStrategoTerm.APPL ? ((IStrategoAppl)term).getConstructor() : null;
        Success181:
        { 
          if(cons26 == transform._consScopedEJPCall_3)
          { 
            Fail256:
            { 
              term = transform.constNone0;
              if(true)
                break Success181;
            }
            term = term185;
          }
          if(cons26 == transform._consEJPCall_2)
          { 
            term = transform.constNone0;
          }
          else
          { 
            break Fail255;
          }
        }
        if(true)
          return term;
      }
      return null;
    }
  }

  @SuppressWarnings("all") private static final class lifted80 extends Strategy 
  { 
    TermReference m_58;

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      Fail257:
      { 
        lifted81 lifted810 = new lifted81();
        lifted810.m_58 = m_58;
        term = try_1_0.instance.invoke(context, term, lifted810);
        if(term == null)
          break Fail257;
        if(true)
          return term;
      }
      return null;
    }
  }

  @SuppressWarnings("all") private static final class lifted81 extends Strategy 
  { 
    TermReference m_58;

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      Fail258:
      { 
        term = ejp_converter_aspect_or_class_0_1.instance.invoke(context, term, m_58.value);
        if(term == null)
          break Fail258;
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
      Fail259:
      { 
        term = try_1_0.instance.invoke(context, term, check_for_change_in_aspect_or_class_0_0.instance);
        if(term == null)
          break Fail259;
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
      Fail260:
      { 
        IStrategoTerm term179 = term;
        Success182:
        { 
          Fail261:
          { 
            term = aspectj_to_box_0_0.instance.invoke(context, term);
            if(term == null)
              break Fail261;
            if(true)
              break Success182;
          }
          term = java_to_box_0_0.instance.invoke(context, term179);
          if(term == null)
            break Fail260;
        }
        if(true)
          return term;
      }
      return null;
    }
  }

  @SuppressWarnings("all") private static final class a_57 extends Strategy 
  { 
    public static final a_57 instance = new a_57();

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      Fail262:
      { 
        IStrategoTerm term176 = term;
        Success183:
        { 
          Fail263:
          { 
            term = $Not$Comp_1_0.instance.invoke(context, term, _Id.instance);
            if(term == null)
              break Fail263;
            if(true)
              break Success183;
          }
          term = term176;
          IStrategoTerm term177 = term;
          Success184:
          { 
            Fail264:
            { 
              term = $And$Comp_2_0.instance.invoke(context, term, this, _Id.instance);
              if(term == null)
                break Fail264;
              if(true)
                break Success184;
            }
            term = $Or$Comp_2_0.instance.invoke(context, term177, this, _Id.instance);
            if(term == null)
              break Fail262;
          }
        }
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
      ITermFactory termFactory = context.getFactory();
      Fail265:
      { 
        IStrategoTerm r_45 = null;
        if(term.getTermType() != IStrategoTerm.APPL || transform._consClassType_2 != ((IStrategoAppl)term).getConstructor())
          break Fail265;
        r_45 = term.getSubterm(0);
        term = pp_aspectj_string_0_0.instance.invoke(context, r_45);
        if(term == null)
          break Fail265;
        term = termFactory.makeAppl(transform._consLit_1, new IStrategoTerm[]{termFactory.makeAppl(transform._consString_1, new IStrategoTerm[]{(IStrategoTerm)termFactory.makeListCons(termFactory.makeAppl(transform._consChars_1, new IStrategoTerm[]{term}), (IStrategoList)transform.constNil0)})});
        if(true)
          return term;
      }
      return null;
    }
  }

  @SuppressWarnings("all") private static final class lifted71 extends Strategy 
  { 
    TermReference k_45;

    TermReference i_45;

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      Fail266:
      { 
        if(term.getTermType() != IStrategoTerm.APPL || transform._consScopedExplicitJoinPointPHeader_2 != ((IStrategoAppl)term).getConstructor())
          break Fail266;
        if(k_45.value == null)
          k_45.value = term.getSubterm(0);
        else
          if(k_45.value != term.getSubterm(0) && !k_45.value.match(term.getSubterm(0)))
            break Fail266;
        if(i_45.value == null)
          i_45.value = term.getSubterm(1);
        else
          if(i_45.value != term.getSubterm(1) && !i_45.value.match(term.getSubterm(1)))
            break Fail266;
        if(true)
          return term;
      }
      return null;
    }
  }

  @SuppressWarnings("all") private static final class lifted70 extends Strategy 
  { 
    TermReference k_45;

    TermReference i_45;

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      Fail267:
      { 
        if(term.getTermType() != IStrategoTerm.APPL || transform._consNonScopedExplicitJoinPointPHeader_2 != ((IStrategoAppl)term).getConstructor())
          break Fail267;
        if(k_45.value == null)
          k_45.value = term.getSubterm(0);
        else
          if(k_45.value != term.getSubterm(0) && !k_45.value.match(term.getSubterm(0)))
            break Fail267;
        if(i_45.value == null)
          i_45.value = term.getSubterm(1);
        else
          if(i_45.value != term.getSubterm(1) && !i_45.value.match(term.getSubterm(1)))
            break Fail267;
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
      Fail268:
      { 
        term = convet_pointcutarg_to_pointcut_0_0.instance.invoke(context, term);
        if(term == null)
          break Fail268;
        if(true)
          return term;
      }
      return null;
    }
  }

  @SuppressWarnings("all") private static final class lifted68 extends Strategy 
  { 
    TermReference s_44;

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      Fail269:
      { 
        if(term.getTermType() != IStrategoTerm.APPL || transform._consScopedExplicitJoinPointPHeader_2 != ((IStrategoAppl)term).getConstructor())
          break Fail269;
        if(s_44.value == null)
          s_44.value = term.getSubterm(1);
        else
          if(s_44.value != term.getSubterm(1) && !s_44.value.match(term.getSubterm(1)))
            break Fail269;
        if(true)
          return term;
      }
      return null;
    }
  }

  @SuppressWarnings("all") private static final class lifted67 extends Strategy 
  { 
    TermReference s_44;

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      Fail270:
      { 
        if(term.getTermType() != IStrategoTerm.APPL || transform._consNonScopedExplicitJoinPointPHeader_2 != ((IStrategoAppl)term).getConstructor())
          break Fail270;
        if(s_44.value == null)
          s_44.value = term.getSubterm(1);
        else
          if(s_44.value != term.getSubterm(1) && !s_44.value.match(term.getSubterm(1)))
            break Fail270;
        if(true)
          return term;
      }
      return null;
    }
  }

  @SuppressWarnings("all") private static final class ejp_to_ajc_0_3_fragment_0 extends Strategy 
  { 
    TermReference h_72;

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      ITermFactory termFactory = context.getFactory();
      Fail271:
      { 
        IStrategoTerm term53 = term;
        IStrategoConstructor cons27 = term.getTermType() == IStrategoTerm.APPL ? ((IStrategoAppl)term).getConstructor() : null;
        Success185:
        { 
          if(cons27 == transform._consDecNoMatch_4)
          { 
            Fail272:
            { 
              IStrategoTerm v_40 = null;
              IStrategoTerm w_40 = null;
              IStrategoTerm x_40 = null;
              IStrategoTerm y_40 = null;
              IStrategoTerm b_41 = null;
              IStrategoTerm z_40 = null;
              IStrategoTerm c_41 = null;
              IStrategoTerm arg111 = term.getSubterm(0);
              if(arg111.getTermType() != IStrategoTerm.APPL || transform._consByPackageGranularity_0 != ((IStrategoAppl)arg111).getConstructor())
                break Fail272;
              x_40 = term.getSubterm(1);
              v_40 = term.getSubterm(2);
              w_40 = term.getSubterm(3);
              b_41 = term;
              term = pp_aspectj_string_0_0.instance.invoke(context, v_40);
              if(term == null)
                break Fail272;
              y_40 = term;
              c_41 = b_41;
              term = pp_aspectj_string_0_0.instance.invoke(context, x_40);
              if(term == null)
                break Fail272;
              term = (IStrategoTerm)termFactory.makeListCons(transform.const24, termFactory.makeListCons(term, (IStrategoList)transform.constNil0));
              term = concat_strings_0_0.instance.invoke(context, term);
              if(term == null)
                break Fail272;
              z_40 = term;
              term = c_41;
              term = gen__nomatch__pointcut__name_0_0.instance.invoke(context, term);
              if(term == null)
                break Fail272;
              term = termFactory.makeAppl(transform._consMethodDec_2, new IStrategoTerm[]{termFactory.makeAppl(transform._consMethodDecHead_6, new IStrategoTerm[]{(IStrategoTerm)termFactory.makeListCons(termFactory.makeAppl(transform._consAnno_2, new IStrategoTerm[]{transform.constTypeName9, (IStrategoTerm)termFactory.makeListCons(termFactory.makeAppl(transform._consElemValPair_2, new IStrategoTerm[]{transform.constId7, termFactory.makeAppl(transform._consLit_1, new IStrategoTerm[]{termFactory.makeAppl(transform._consString_1, new IStrategoTerm[]{(IStrategoTerm)termFactory.makeListCons(termFactory.makeAppl(transform._consChars_1, new IStrategoTerm[]{y_40}), (IStrategoList)transform.constNil0)})})}), termFactory.makeListCons(termFactory.makeAppl(transform._consElemValPair_2, new IStrategoTerm[]{transform.constId20, termFactory.makeAppl(transform._consLit_1, new IStrategoTerm[]{w_40})}), (IStrategoList)transform.constCons13))}), termFactory.makeListCons(termFactory.makeAppl(transform._consSingleElemAnno_2, new IStrategoTerm[]{transform.constTypeName8, termFactory.makeAppl(transform._consLit_1, new IStrategoTerm[]{termFactory.makeAppl(transform._consString_1, new IStrategoTerm[]{(IStrategoTerm)termFactory.makeListCons(termFactory.makeAppl(transform._consChars_1, new IStrategoTerm[]{z_40}), (IStrategoList)transform.constNil0)})})}), (IStrategoList)transform.constCons11)), transform.constNone0, transform.constVoid0, termFactory.makeAppl(transform._consId_1, new IStrategoTerm[]{term}), transform.constCons14, transform.constNone0}), transform.constBlock0});
              if(true)
                break Success185;
            }
            term = term53;
          }
          Success186:
          { 
            if(cons27 == transform._consDecNoMatch_4)
            { 
              Fail273:
              { 
                IStrategoTerm h_40 = null;
                IStrategoTerm i_40 = null;
                IStrategoTerm j_40 = null;
                IStrategoTerm k_40 = null;
                IStrategoTerm n_40 = null;
                IStrategoTerm l_40 = null;
                IStrategoTerm o_40 = null;
                IStrategoTerm arg112 = term.getSubterm(0);
                if(arg112.getTermType() != IStrategoTerm.APPL || transform._consByClassGranularity_0 != ((IStrategoAppl)arg112).getConstructor())
                  break Fail273;
                j_40 = term.getSubterm(1);
                h_40 = term.getSubterm(2);
                i_40 = term.getSubterm(3);
                n_40 = term;
                term = pp_aspectj_string_0_0.instance.invoke(context, h_40);
                if(term == null)
                  break Fail273;
                k_40 = term;
                o_40 = n_40;
                term = pp_aspectj_string_0_0.instance.invoke(context, j_40);
                if(term == null)
                  break Fail273;
                term = (IStrategoTerm)termFactory.makeListCons(transform.const24, termFactory.makeListCons(term, (IStrategoList)transform.constNil0));
                term = concat_strings_0_0.instance.invoke(context, term);
                if(term == null)
                  break Fail273;
                l_40 = term;
                term = o_40;
                term = gen__nomatch__pointcut__name_0_0.instance.invoke(context, term);
                if(term == null)
                  break Fail273;
                term = termFactory.makeAppl(transform._consMethodDec_2, new IStrategoTerm[]{termFactory.makeAppl(transform._consMethodDecHead_6, new IStrategoTerm[]{(IStrategoTerm)termFactory.makeListCons(termFactory.makeAppl(transform._consAnno_2, new IStrategoTerm[]{transform.constTypeName9, (IStrategoTerm)termFactory.makeListCons(termFactory.makeAppl(transform._consElemValPair_2, new IStrategoTerm[]{transform.constId7, termFactory.makeAppl(transform._consLit_1, new IStrategoTerm[]{termFactory.makeAppl(transform._consString_1, new IStrategoTerm[]{(IStrategoTerm)termFactory.makeListCons(termFactory.makeAppl(transform._consChars_1, new IStrategoTerm[]{k_40}), (IStrategoList)transform.constNil0)})})}), termFactory.makeListCons(termFactory.makeAppl(transform._consElemValPair_2, new IStrategoTerm[]{transform.constId20, termFactory.makeAppl(transform._consLit_1, new IStrategoTerm[]{i_40})}), (IStrategoList)transform.constCons16))}), termFactory.makeListCons(termFactory.makeAppl(transform._consSingleElemAnno_2, new IStrategoTerm[]{transform.constTypeName8, termFactory.makeAppl(transform._consLit_1, new IStrategoTerm[]{termFactory.makeAppl(transform._consString_1, new IStrategoTerm[]{(IStrategoTerm)termFactory.makeListCons(termFactory.makeAppl(transform._consChars_1, new IStrategoTerm[]{l_40}), (IStrategoList)transform.constNil0)})})}), (IStrategoList)transform.constCons11)), transform.constNone0, transform.constVoid0, termFactory.makeAppl(transform._consId_1, new IStrategoTerm[]{term}), transform.constCons14, transform.constNone0}), transform.constBlock0});
                if(true)
                  break Success186;
              }
              term = term53;
            }
            Success187:
            { 
              if(cons27 == transform._consDecNoMatch_4)
              { 
                Fail274:
                { 
                  IStrategoTerm t_39 = null;
                  IStrategoTerm u_39 = null;
                  IStrategoTerm v_39 = null;
                  IStrategoTerm w_39 = null;
                  IStrategoTerm z_39 = null;
                  IStrategoTerm x_39 = null;
                  IStrategoTerm a_40 = null;
                  IStrategoTerm arg113 = term.getSubterm(0);
                  if(arg113.getTermType() != IStrategoTerm.APPL || transform._consByEjpGranularity_0 != ((IStrategoAppl)arg113).getConstructor())
                    break Fail274;
                  v_39 = term.getSubterm(1);
                  t_39 = term.getSubterm(2);
                  u_39 = term.getSubterm(3);
                  z_39 = term;
                  term = pp_aspectj_string_0_0.instance.invoke(context, t_39);
                  if(term == null)
                    break Fail274;
                  w_39 = term;
                  a_40 = z_39;
                  term = pp_aspectj_string_0_0.instance.invoke(context, v_39);
                  if(term == null)
                    break Fail274;
                  term = (IStrategoTerm)termFactory.makeListCons(transform.const37, termFactory.makeListCons(term, (IStrategoList)transform.constNil0));
                  term = concat_strings_0_0.instance.invoke(context, term);
                  if(term == null)
                    break Fail274;
                  x_39 = term;
                  term = a_40;
                  term = gen__nomatch__pointcut__name_0_0.instance.invoke(context, term);
                  if(term == null)
                    break Fail274;
                  term = termFactory.makeAppl(transform._consMethodDec_2, new IStrategoTerm[]{termFactory.makeAppl(transform._consMethodDecHead_6, new IStrategoTerm[]{(IStrategoTerm)termFactory.makeListCons(termFactory.makeAppl(transform._consAnno_2, new IStrategoTerm[]{transform.constTypeName9, (IStrategoTerm)termFactory.makeListCons(termFactory.makeAppl(transform._consElemValPair_2, new IStrategoTerm[]{transform.constId7, termFactory.makeAppl(transform._consLit_1, new IStrategoTerm[]{termFactory.makeAppl(transform._consString_1, new IStrategoTerm[]{(IStrategoTerm)termFactory.makeListCons(termFactory.makeAppl(transform._consChars_1, new IStrategoTerm[]{w_39}), (IStrategoList)transform.constNil0)})})}), termFactory.makeListCons(termFactory.makeAppl(transform._consElemValPair_2, new IStrategoTerm[]{transform.constId20, termFactory.makeAppl(transform._consLit_1, new IStrategoTerm[]{u_39})}), (IStrategoList)transform.constCons18))}), termFactory.makeListCons(termFactory.makeAppl(transform._consSingleElemAnno_2, new IStrategoTerm[]{transform.constTypeName8, termFactory.makeAppl(transform._consLit_1, new IStrategoTerm[]{termFactory.makeAppl(transform._consString_1, new IStrategoTerm[]{(IStrategoTerm)termFactory.makeListCons(termFactory.makeAppl(transform._consChars_1, new IStrategoTerm[]{x_39}), (IStrategoList)transform.constNil0)})})}), (IStrategoList)transform.constCons11)), transform.constNone0, transform.constVoid0, termFactory.makeAppl(transform._consId_1, new IStrategoTerm[]{term}), transform.constCons19, transform.constNone0}), transform.constBlock0});
                  if(true)
                    break Success187;
                }
                term = term53;
              }
              Success188:
              { 
                if(cons27 == transform._consDecNoMatch_4)
                { 
                  Fail275:
                  { 
                    IStrategoTerm f_39 = null;
                    IStrategoTerm g_39 = null;
                    IStrategoTerm h_39 = null;
                    IStrategoTerm i_39 = null;
                    IStrategoTerm l_39 = null;
                    IStrategoTerm j_39 = null;
                    IStrategoTerm m_39 = null;
                    IStrategoTerm arg114 = term.getSubterm(0);
                    if(arg114.getTermType() != IStrategoTerm.APPL || transform._consByMethodGranularity_0 != ((IStrategoAppl)arg114).getConstructor())
                      break Fail275;
                    h_39 = term.getSubterm(1);
                    f_39 = term.getSubterm(2);
                    g_39 = term.getSubterm(3);
                    l_39 = term;
                    term = pp_aspectj_string_0_0.instance.invoke(context, f_39);
                    if(term == null)
                      break Fail275;
                    i_39 = term;
                    m_39 = l_39;
                    term = pp_aspectj_string_0_0.instance.invoke(context, h_39);
                    if(term == null)
                      break Fail275;
                    term = (IStrategoTerm)termFactory.makeListCons(transform.const40, termFactory.makeListCons(term, (IStrategoList)transform.constNil0));
                    term = concat_strings_0_0.instance.invoke(context, term);
                    if(term == null)
                      break Fail275;
                    j_39 = term;
                    term = m_39;
                    term = gen__nomatch__pointcut__name_0_0.instance.invoke(context, term);
                    if(term == null)
                      break Fail275;
                    term = termFactory.makeAppl(transform._consMethodDec_2, new IStrategoTerm[]{termFactory.makeAppl(transform._consMethodDecHead_6, new IStrategoTerm[]{(IStrategoTerm)termFactory.makeListCons(termFactory.makeAppl(transform._consAnno_2, new IStrategoTerm[]{transform.constTypeName9, (IStrategoTerm)termFactory.makeListCons(termFactory.makeAppl(transform._consElemValPair_2, new IStrategoTerm[]{transform.constId7, termFactory.makeAppl(transform._consLit_1, new IStrategoTerm[]{termFactory.makeAppl(transform._consString_1, new IStrategoTerm[]{(IStrategoTerm)termFactory.makeListCons(termFactory.makeAppl(transform._consChars_1, new IStrategoTerm[]{i_39}), (IStrategoList)transform.constNil0)})})}), termFactory.makeListCons(termFactory.makeAppl(transform._consElemValPair_2, new IStrategoTerm[]{transform.constId20, termFactory.makeAppl(transform._consLit_1, new IStrategoTerm[]{g_39})}), (IStrategoList)transform.constCons21))}), termFactory.makeListCons(termFactory.makeAppl(transform._consSingleElemAnno_2, new IStrategoTerm[]{transform.constTypeName8, termFactory.makeAppl(transform._consLit_1, new IStrategoTerm[]{termFactory.makeAppl(transform._consString_1, new IStrategoTerm[]{(IStrategoTerm)termFactory.makeListCons(termFactory.makeAppl(transform._consChars_1, new IStrategoTerm[]{j_39}), (IStrategoList)transform.constNil0)})})}), (IStrategoList)transform.constCons11)), transform.constNone0, transform.constVoid0, termFactory.makeAppl(transform._consId_1, new IStrategoTerm[]{term}), transform.constCons19, transform.constNone0}), transform.constBlock0});
                    if(true)
                      break Success188;
                  }
                  term = term53;
                }
                if(cons27 == transform._consExplicitJoinPointDeclaration_5)
                { 
                  IStrategoTerm l_38 = null;
                  IStrategoTerm m_38 = null;
                  IStrategoTerm n_38 = null;
                  IStrategoTerm o_38 = null;
                  IStrategoTerm p_38 = null;
                  IStrategoTerm q_38 = null;
                  IStrategoTerm r_38 = null;
                  IStrategoTerm s_38 = null;
                  IStrategoTerm v_38 = null;
                  m_38 = term.getSubterm(0);
                  l_38 = term.getSubterm(1);
                  n_38 = term.getSubterm(2);
                  o_38 = term.getSubterm(3);
                  q_38 = term.getSubterm(4);
                  v_38 = term;
                  IStrategoTerm term57 = term;
                  Success189:
                  { 
                    Fail276:
                    { 
                      IStrategoTerm w_38 = null;
                      term = termFactory.makeTuple(l_38, m_38);
                      term = gen_pointcutargs_pointcuts_0_1.instance.invoke(context, term, h_72.value);
                      if(term == null)
                        break Fail276;
                      term = gen_method_head_0_3.instance.invoke(context, term, m_38, n_38, o_38);
                      if(term == null)
                        break Fail276;
                      w_38 = term;
                      p_38 = term;
                      term = w_38;
                      if(term.getTermType() != IStrategoTerm.APPL || transform._consMethodDecHead_6 != ((IStrategoAppl)term).getConstructor())
                        break Fail276;
                      r_38 = term.getSubterm(2);
                      term = gen_method_body_0_2.instance.invoke(context, term, q_38, r_38);
                      if(term == null)
                        break Fail276;
                      s_38 = term;
                      if(true)
                        break Success189;
                    }
                    term = term57;
                    IStrategoTerm t_38 = null;
                    IStrategoTerm u_38 = null;
                    IStrategoTerm b_39 = null;
                    t_38 = term;
                    term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
                    if(term == null)
                      break Fail271;
                    u_38 = term;
                    b_39 = t_38;
                    term = report_with_failure_0_2.instance.invoke(context, b_39, transform.const42, u_38);
                    if(term == null)
                      break Fail271;
                  }
                  term = v_38;
                  if(p_38 == null || s_38 == null)
                    break Fail271;
                  term = termFactory.makeAppl(transform._consMethodDec_2, new IStrategoTerm[]{p_38, s_38});
                }
                else
                { 
                  break Fail271;
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

  @SuppressWarnings("all") private static final class lifted66 extends Strategy 
  { 
    public static final lifted66 instance = new lifted66();

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      Fail277:
      { 
        if(term.getTermType() != IStrategoTerm.APPL || transform._consNotExplicitJoinPointScopePattern_1 != ((IStrategoAppl)term).getConstructor())
          break Fail277;
        IStrategoTerm arg108 = term.getSubterm(0);
        if(arg108.getTermType() != IStrategoTerm.APPL || transform._consMemberName_2 != ((IStrategoAppl)arg108).getConstructor())
          break Fail277;
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
      Fail278:
      { 
        if(term.getTermType() != IStrategoTerm.APPL || transform._consNotExplicitJoinPointScopePattern_1 != ((IStrategoAppl)term).getConstructor())
          break Fail278;
        IStrategoTerm arg106 = term.getSubterm(0);
        if(arg106.getTermType() != IStrategoTerm.APPL || transform._consMemberName_1 != ((IStrategoAppl)arg106).getConstructor())
          break Fail278;
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
      Fail279:
      { 
        if(term.getTermType() != IStrategoTerm.APPL || transform._consExplicitJoinPointScopePattern_1 != ((IStrategoAppl)term).getConstructor())
          break Fail279;
        IStrategoTerm arg101 = term.getSubterm(0);
        if(arg101.getTermType() != IStrategoTerm.APPL || transform._consMemberName_2 != ((IStrategoAppl)arg101).getConstructor())
          break Fail279;
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
      Fail280:
      { 
        if(term.getTermType() != IStrategoTerm.APPL || transform._consExplicitJoinPointScopePattern_1 != ((IStrategoAppl)term).getConstructor())
          break Fail280;
        IStrategoTerm arg99 = term.getSubterm(0);
        if(arg99.getTermType() != IStrategoTerm.APPL || transform._consMemberName_1 != ((IStrategoAppl)arg99).getConstructor())
          break Fail280;
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
      Fail281:
      { 
        if(term.getTermType() != IStrategoTerm.APPL || transform._consNotExplicitJoinPointPattern_1 != ((IStrategoAppl)term).getConstructor())
          break Fail281;
        IStrategoTerm arg94 = term.getSubterm(0);
        if(arg94.getTermType() != IStrategoTerm.APPL || transform._consMemberName_2 != ((IStrategoAppl)arg94).getConstructor())
          break Fail281;
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
      Fail282:
      { 
        if(term.getTermType() != IStrategoTerm.APPL || transform._consNotExplicitJoinPointPattern_1 != ((IStrategoAppl)term).getConstructor())
          break Fail282;
        IStrategoTerm arg92 = term.getSubterm(0);
        if(arg92.getTermType() != IStrategoTerm.APPL || transform._consMemberName_1 != ((IStrategoAppl)arg92).getConstructor())
          break Fail282;
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
      Fail283:
      { 
        if(term.getTermType() != IStrategoTerm.APPL || transform._consExplicitJoinPointPattern_1 != ((IStrategoAppl)term).getConstructor())
          break Fail283;
        IStrategoTerm arg86 = term.getSubterm(0);
        if(arg86.getTermType() != IStrategoTerm.APPL || transform._consMemberName_2 != ((IStrategoAppl)arg86).getConstructor())
          break Fail283;
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
      Fail284:
      { 
        if(term.getTermType() != IStrategoTerm.APPL || transform._consExplicitJoinPointPattern_1 != ((IStrategoAppl)term).getConstructor())
          break Fail284;
        IStrategoTerm arg84 = term.getSubterm(0);
        if(arg84.getTermType() != IStrategoTerm.APPL || transform._consMemberName_1 != ((IStrategoAppl)arg84).getConstructor())
          break Fail284;
        if(true)
          return term;
      }
      return null;
    }
  }

  @SuppressWarnings("all") private static final class lifted58 extends Strategy 
  { 
    Strategy d_37;

    Strategy e_37;

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      Fail285:
      { 
        term = allow_extends_helper_2_0.instance.invoke(context, term, d_37, e_37);
        if(term == null)
          break Fail285;
        if(true)
          return term;
      }
      return null;
    }
  }

  @SuppressWarnings("all") private static final class lifted56 extends Strategy 
  { 
    TermReference y_35;

    TermReference z_35;

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      Fail286:
      { 
        term = my_hashtable_union_helper_0_2.instance.invoke(context, term, y_35.value, z_35.value);
        if(term == null)
          break Fail286;
        if(true)
          return term;
      }
      return null;
    }
  }

  @SuppressWarnings("all") private static final class lifted55 extends Strategy 
  { 
    TermReference u_35;

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      Fail287:
      { 
        IStrategoTerm v_35 = null;
        v_35 = term;
        if(u_35.value == null)
          break Fail287;
        term = hashtable_remove_0_1.instance.invoke(context, u_35.value, v_35);
        if(term == null)
          break Fail287;
        if(true)
          return term;
      }
      return null;
    }
  }

  @SuppressWarnings("all") private static final class lifted54 extends Strategy 
  { 
    public static final lifted54 instance = new lifted54();

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      ITermFactory termFactory = context.getFactory();
      Fail288:
      { 
        IStrategoTerm g_34 = null;
        if(term.getTermType() != IStrategoTerm.APPL || transform._consId_1 != ((IStrategoAppl)term).getConstructor())
          break Fail288;
        g_34 = term.getSubterm(0);
        term = (IStrategoTerm)termFactory.makeListCons(g_34, (IStrategoList)transform.constCons3);
        term = concat_strings_0_0.instance.invoke(context, term);
        if(term == null)
          break Fail288;
        if(true)
          return term;
      }
      return null;
    }
  }

  @SuppressWarnings("all") private static final class lifted51 extends Strategy 
  { 
    TermReference u_28;

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      Fail289:
      { 
        lifted52 lifted520 = new lifted52();
        lifted520.u_28 = u_28;
        term = try_1_0.instance.invoke(context, term, lifted520);
        if(term == null)
          break Fail289;
        if(true)
          return term;
      }
      return null;
    }
  }

  @SuppressWarnings("all") private static final class lifted52 extends Strategy 
  { 
    TermReference u_28;

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      Fail290:
      { 
        term = add_local_vars_0_1.instance.invoke(context, term, u_28.value);
        if(term == null)
          break Fail290;
        if(true)
          return term;
      }
      return null;
    }
  }

  @SuppressWarnings("all") private static final class lifted49 extends Strategy 
  { 
    TermReference z_27;

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      Fail291:
      { 
        term = handle_pointcutarg_helper_0_1.instance.invoke(context, term, z_27.value);
        if(term == null)
          break Fail291;
        if(true)
          return term;
      }
      return null;
    }
  }

  @SuppressWarnings("all") private static final class lifted50 extends Strategy 
  { 
    TermReference y_27;

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      Fail292:
      { 
        IStrategoTerm b_28 = null;
        b_28 = term;
        if(y_27.value == null)
          break Fail292;
        term = iset_add_0_1.instance.invoke(context, y_27.value, b_28);
        if(term == null)
          break Fail292;
        if(true)
          return term;
      }
      return null;
    }
  }

  @SuppressWarnings("all") private static final class lifted48 extends Strategy 
  { 
    TermReference s_25;

    TermReference a_25;

    TermReference b_25;

    TermReference c_25;

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      Fail293:
      { 
        term = ejp_to_java_0_4.instance.invoke(context, term, s_25.value, a_25.value, b_25.value, c_25.value);
        if(term == null)
          break Fail293;
        if(true)
          return term;
      }
      return null;
    }
  }

  @SuppressWarnings("all") private static final class lifted46 extends Strategy 
  { 
    TermReference f_25;

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      Fail294:
      { 
        lifted47 lifted470 = new lifted47();
        lifted470.f_25 = f_25;
        term = try_1_0.instance.invoke(context, term, lifted470);
        if(term == null)
          break Fail294;
        if(true)
          return term;
      }
      return null;
    }
  }

  @SuppressWarnings("all") private static final class lifted47 extends Strategy 
  { 
    TermReference f_25;

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      Fail295:
      { 
        term = fetch_0_1.instance.invoke(context, term, f_25.value);
        if(term == null)
          break Fail295;
        if(true)
          return term;
      }
      return null;
    }
  }

  @SuppressWarnings("all") private static final class lifted45 extends Strategy 
  { 
    TermReference c_25;

    TermReference v_25;

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      Fail296:
      { 
        term = handle_pointcutargs_0_2.instance.invoke(context, term, c_25.value, v_25.value);
        if(term == null)
          break Fail296;
        if(true)
          return term;
      }
      return null;
    }
  }

  @SuppressWarnings("all") private static final class lifted43 extends Strategy 
  { 
    TermReference a_25;

    TermReference b_25;

    TermReference i_25;

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      Fail297:
      { 
        lifted44 lifted440 = new lifted44();
        lifted440.a_25 = a_25;
        lifted440.b_25 = b_25;
        lifted440.i_25 = i_25;
        term = try_1_0.instance.invoke(context, term, lifted440);
        if(term == null)
          break Fail297;
        if(true)
          return term;
      }
      return null;
    }
  }

  @SuppressWarnings("all") private static final class lifted44 extends Strategy 
  { 
    TermReference a_25;

    TermReference b_25;

    TermReference i_25;

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      Fail298:
      { 
        term = pointcutarg_0_3.instance.invoke(context, term, a_25.value, b_25.value, i_25.value);
        if(term == null)
          break Fail298;
        if(true)
          return term;
      }
      return null;
    }
  }

  @SuppressWarnings("all") private static final class lifted42 extends Strategy 
  { 
    TermReference h_24;

    TermReference m_24;

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      Fail299:
      { 
        term = handle_pointcutargs_0_2.instance.invoke(context, term, h_24.value, m_24.value);
        if(term == null)
          break Fail299;
        if(true)
          return term;
      }
      return null;
    }
  }

  @SuppressWarnings("all") private static final class lifted40 extends Strategy 
  { 
    TermReference f_24;

    TermReference g_24;

    TermReference i_24;

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      Fail300:
      { 
        lifted41 lifted411 = new lifted41();
        lifted411.f_24 = f_24;
        lifted411.g_24 = g_24;
        lifted411.i_24 = i_24;
        term = try_1_0.instance.invoke(context, term, lifted411);
        if(term == null)
          break Fail300;
        if(true)
          return term;
      }
      return null;
    }
  }

  @SuppressWarnings("all") private static final class lifted41 extends Strategy 
  { 
    TermReference f_24;

    TermReference g_24;

    TermReference i_24;

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      Fail301:
      { 
        term = pointcutarg_0_3.instance.invoke(context, term, f_24.value, g_24.value, i_24.value);
        if(term == null)
          break Fail301;
        if(true)
          return term;
      }
      return null;
    }
  }

  @SuppressWarnings("all") private static final class lifted38 extends Strategy 
  { 
    TermReference i_23;

    TermReference j_23;

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      ITermFactory termFactory = context.getFactory();
      Fail302:
      { 
        IStrategoTerm k_23 = null;
        IStrategoTerm l_23 = null;
        IStrategoTerm m_23 = null;
        k_23 = term;
        m_23 = term;
        if(i_23.value == null)
          break Fail302;
        term = hashtable_get_0_1.instance.invoke(context, i_23.value, k_23);
        if(term == null)
          break Fail302;
        l_23 = term;
        term = m_23;
        if(j_23.value == null)
          break Fail302;
        term = termFactory.makeAppl(transform._consLocalVarDecStm_1, new IStrategoTerm[]{termFactory.makeAppl(transform._consLocalVarDec_3, new IStrategoTerm[]{transform.constNil0, l_23, (IStrategoTerm)termFactory.makeListCons(termFactory.makeAppl(transform._consVarDec_2, new IStrategoTerm[]{termFactory.makeAppl(transform._consId_1, new IStrategoTerm[]{k_23}), termFactory.makeAppl(transform._consExprName_2, new IStrategoTerm[]{termFactory.makeAppl(transform._consAmbName_1, new IStrategoTerm[]{termFactory.makeAppl(transform._consId_1, new IStrategoTerm[]{j_23.value})}), termFactory.makeAppl(transform._consId_1, new IStrategoTerm[]{k_23})})}), (IStrategoList)transform.constNil0)})});
        if(true)
          return term;
      }
      return null;
    }
  }

  @SuppressWarnings("all") private static final class lifted37 extends Strategy 
  { 
    TermReference g_23;

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      ITermFactory termFactory = context.getFactory();
      Fail303:
      { 
        IStrategoTerm h_23 = null;
        h_23 = term;
        if(g_23.value == null)
          break Fail303;
        term = termFactory.makeAppl(transform._consExprStm_1, new IStrategoTerm[]{termFactory.makeAppl(transform._consAssign_2, new IStrategoTerm[]{termFactory.makeAppl(transform._consExprName_1, new IStrategoTerm[]{termFactory.makeAppl(transform._consId_1, new IStrategoTerm[]{h_23})}), termFactory.makeAppl(transform._consExprName_2, new IStrategoTerm[]{termFactory.makeAppl(transform._consAmbName_1, new IStrategoTerm[]{termFactory.makeAppl(transform._consId_1, new IStrategoTerm[]{g_23.value})}), termFactory.makeAppl(transform._consId_1, new IStrategoTerm[]{h_23})})})});
        if(true)
          return term;
      }
      return null;
    }
  }

  @SuppressWarnings("all") private static final class lifted36 extends Strategy 
  { 
    TermReference d_23;

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      ITermFactory termFactory = context.getFactory();
      Fail304:
      { 
        IStrategoTerm e_23 = null;
        e_23 = term;
        if(d_23.value == null)
          break Fail304;
        term = termFactory.makeAppl(transform._consExprStm_1, new IStrategoTerm[]{termFactory.makeAppl(transform._consAssign_2, new IStrategoTerm[]{termFactory.makeAppl(transform._consExprName_2, new IStrategoTerm[]{termFactory.makeAppl(transform._consAmbName_1, new IStrategoTerm[]{termFactory.makeAppl(transform._consId_1, new IStrategoTerm[]{d_23.value})}), termFactory.makeAppl(transform._consId_1, new IStrategoTerm[]{e_23})}), termFactory.makeAppl(transform._consExprName_1, new IStrategoTerm[]{termFactory.makeAppl(transform._consId_1, new IStrategoTerm[]{e_23})})})});
        if(true)
          return term;
      }
      return null;
    }
  }

  @SuppressWarnings("all") private static final class lifted33 extends Strategy 
  { 
    TermReference s_22;

    TermReference r_22;

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      Fail305:
      { 
        IStrategoTerm t_22 = null;
        IStrategoTerm z_22 = null;
        t_22 = term;
        if(s_22.value == null)
          break Fail305;
        term = s_22.value;
        z_22 = s_22.value;
        if(r_22.value == null)
          break Fail305;
        term = hashtable_get_0_1.instance.invoke(context, r_22.value, t_22);
        if(term == null)
          break Fail305;
        term = add_key_to_multiple_values_table_0_2.instance.invoke(context, z_22, term, t_22);
        if(term == null)
          break Fail305;
        if(true)
          return term;
      }
      return null;
    }
  }

  @SuppressWarnings("all") private static final class lifted34 extends Strategy 
  { 
    TermReference s_22;

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      ITermFactory termFactory = context.getFactory();
      Fail306:
      { 
        IStrategoTerm u_22 = null;
        u_22 = term;
        if(s_22.value == null)
          break Fail306;
        term = hashtable_get_0_1.instance.invoke(context, s_22.value, u_22);
        if(term == null)
          break Fail306;
        term = map_1_0.instance.invoke(context, term, lifted35.instance);
        if(term == null)
          break Fail306;
        term = termFactory.makeAppl(transform._consFieldDec_3, new IStrategoTerm[]{transform.constNil0, u_22, term});
        if(true)
          return term;
      }
      return null;
    }
  }

  @SuppressWarnings("all") private static final class lifted35 extends Strategy 
  { 
    public static final lifted35 instance = new lifted35();

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      ITermFactory termFactory = context.getFactory();
      Fail307:
      { 
        term = termFactory.makeAppl(transform._consVarDec_1, new IStrategoTerm[]{termFactory.makeAppl(transform._consId_1, new IStrategoTerm[]{term})});
        if(true)
          return term;
      }
      return null;
    }
  }

  @SuppressWarnings("all") private static final class lifted31 extends Strategy 
  { 
    TermReference m_21;

    TermReference l_21;

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      Fail308:
      { 
        if(term.getTermType() != IStrategoTerm.APPL || transform._consVarArityParam_3 != ((IStrategoAppl)term).getConstructor())
          break Fail308;
        if(m_21.value == null)
          m_21.value = term.getSubterm(1);
        else
          if(m_21.value != term.getSubterm(1) && !m_21.value.match(term.getSubterm(1)))
            break Fail308;
        IStrategoTerm arg54 = term.getSubterm(2);
        if(arg54.getTermType() != IStrategoTerm.APPL || transform._consId_1 != ((IStrategoAppl)arg54).getConstructor())
          break Fail308;
        if(l_21.value == null)
          l_21.value = arg54.getSubterm(0);
        else
          if(l_21.value != arg54.getSubterm(0) && !l_21.value.match(arg54.getSubterm(0)))
            break Fail308;
        if(true)
          return term;
      }
      return null;
    }
  }

  @SuppressWarnings("all") private static final class lifted30 extends Strategy 
  { 
    TermReference m_21;

    TermReference l_21;

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      Fail309:
      { 
        if(term.getTermType() != IStrategoTerm.APPL || transform._consParam_3 != ((IStrategoAppl)term).getConstructor())
          break Fail309;
        if(m_21.value == null)
          m_21.value = term.getSubterm(1);
        else
          if(m_21.value != term.getSubterm(1) && !m_21.value.match(term.getSubterm(1)))
            break Fail309;
        IStrategoTerm arg52 = term.getSubterm(2);
        if(arg52.getTermType() != IStrategoTerm.APPL || transform._consId_1 != ((IStrategoAppl)arg52).getConstructor())
          break Fail309;
        if(l_21.value == null)
          l_21.value = arg52.getSubterm(0);
        else
          if(l_21.value != arg52.getSubterm(0) && !l_21.value.match(arg52.getSubterm(0)))
            break Fail309;
        if(true)
          return term;
      }
      return null;
    }
  }

  @SuppressWarnings("all") private static final class lifted29 extends Strategy 
  { 
    TermReference g_21;

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      Fail310:
      { 
        if(term.getTermType() != IStrategoTerm.APPL || transform._consVarDec_2 != ((IStrategoAppl)term).getConstructor())
          break Fail310;
        IStrategoTerm arg49 = term.getSubterm(0);
        if(arg49.getTermType() != IStrategoTerm.APPL || transform._consId_1 != ((IStrategoAppl)arg49).getConstructor())
          break Fail310;
        if(g_21.value == null)
          g_21.value = arg49.getSubterm(0);
        else
          if(g_21.value != arg49.getSubterm(0) && !g_21.value.match(arg49.getSubterm(0)))
            break Fail310;
        if(true)
          return term;
      }
      return null;
    }
  }

  @SuppressWarnings("all") private static final class lifted28 extends Strategy 
  { 
    TermReference g_21;

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      Fail311:
      { 
        if(term.getTermType() != IStrategoTerm.APPL || transform._consVarDec_1 != ((IStrategoAppl)term).getConstructor())
          break Fail311;
        IStrategoTerm arg48 = term.getSubterm(0);
        if(arg48.getTermType() != IStrategoTerm.APPL || transform._consId_1 != ((IStrategoAppl)arg48).getConstructor())
          break Fail311;
        if(g_21.value == null)
          g_21.value = arg48.getSubterm(0);
        else
          if(g_21.value != arg48.getSubterm(0) && !g_21.value.match(arg48.getSubterm(0)))
            break Fail311;
        if(true)
          return term;
      }
      return null;
    }
  }

  @SuppressWarnings("all") private static final class lifted26 extends Strategy 
  { 
    TermReference b_72;

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      Fail312:
      { 
        lifted27 lifted270 = new lifted27();
        lifted270.b_72 = b_72;
        term = try_1_0.instance.invoke(context, term, lifted270);
        if(term == null)
          break Fail312;
        if(true)
          return term;
      }
      return null;
    }
  }

  @SuppressWarnings("all") private static final class lifted27 extends Strategy 
  { 
    TermReference b_72;

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      Fail313:
      { 
        term = add_local_vars_0_1.instance.invoke(context, term, b_72.value);
        if(term == null)
          break Fail313;
        if(true)
          return term;
      }
      return null;
    }
  }

  @SuppressWarnings("all") private static final class lifted25 extends Strategy 
  { 
    TermReference u_20;

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      Fail314:
      { 
        if(term.getTermType() != IStrategoTerm.APPL || transform._consVarDec_2 != ((IStrategoAppl)term).getConstructor())
          break Fail314;
        IStrategoTerm arg44 = term.getSubterm(1);
        if(arg44.getTermType() != IStrategoTerm.APPL || transform._consScopedEJPCall_3 != ((IStrategoAppl)arg44).getConstructor())
          break Fail314;
        IStrategoTerm arg47 = arg44.getSubterm(2);
        if(arg47.getTermType() != IStrategoTerm.APPL || transform._consBlock_1 != ((IStrategoAppl)arg47).getConstructor())
          break Fail314;
        if(u_20.value == null)
          u_20.value = arg47.getSubterm(0);
        else
          if(u_20.value != arg47.getSubterm(0) && !u_20.value.match(arg47.getSubterm(0)))
            break Fail314;
        if(true)
          return term;
      }
      return null;
    }
  }

  @SuppressWarnings("all") private static final class lifted22 extends Strategy 
  { 
    TermReference u_20;

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      Fail315:
      { 
        lifted24 lifted240 = new lifted24();
        lifted23 lifted230 = new lifted23();
        lifted240.u_20 = u_20;
        lifted230.u_20 = u_20;
        term = or_2_0.instance.invoke(context, term, lifted230, lifted240);
        if(term == null)
          break Fail315;
        if(true)
          return term;
      }
      return null;
    }
  }

  @SuppressWarnings("all") private static final class lifted24 extends Strategy 
  { 
    TermReference u_20;

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      Fail316:
      { 
        if(term.getTermType() != IStrategoTerm.APPL || transform._consExprStm_1 != ((IStrategoAppl)term).getConstructor())
          break Fail316;
        IStrategoTerm arg37 = term.getSubterm(0);
        if(arg37.getTermType() != IStrategoTerm.APPL || transform._consAssign_2 != ((IStrategoAppl)arg37).getConstructor())
          break Fail316;
        IStrategoTerm arg39 = arg37.getSubterm(1);
        if(arg39.getTermType() != IStrategoTerm.APPL || transform._consScopedEJPCall_3 != ((IStrategoAppl)arg39).getConstructor())
          break Fail316;
        IStrategoTerm arg42 = arg39.getSubterm(2);
        if(arg42.getTermType() != IStrategoTerm.APPL || transform._consBlock_1 != ((IStrategoAppl)arg42).getConstructor())
          break Fail316;
        if(u_20.value == null)
          u_20.value = arg42.getSubterm(0);
        else
          if(u_20.value != arg42.getSubterm(0) && !u_20.value.match(arg42.getSubterm(0)))
            break Fail316;
        if(true)
          return term;
      }
      return null;
    }
  }

  @SuppressWarnings("all") private static final class lifted23 extends Strategy 
  { 
    TermReference u_20;

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      Fail317:
      { 
        if(term.getTermType() != IStrategoTerm.APPL || transform._consExprStm_1 != ((IStrategoAppl)term).getConstructor())
          break Fail317;
        IStrategoTerm arg33 = term.getSubterm(0);
        if(arg33.getTermType() != IStrategoTerm.APPL || transform._consScopedEJPCall_3 != ((IStrategoAppl)arg33).getConstructor())
          break Fail317;
        IStrategoTerm arg36 = arg33.getSubterm(2);
        if(arg36.getTermType() != IStrategoTerm.APPL || transform._consBlock_1 != ((IStrategoAppl)arg36).getConstructor())
          break Fail317;
        if(u_20.value == null)
          u_20.value = arg36.getSubterm(0);
        else
          if(u_20.value != arg36.getSubterm(0) && !u_20.value.match(arg36.getSubterm(0)))
            break Fail317;
        if(true)
          return term;
      }
      return null;
    }
  }

  @SuppressWarnings("all") private static final class lifted20 extends Strategy 
  { 
    TermReference b_72;

    TermReference a_21;

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      Fail318:
      { 
        lifted21 lifted211 = new lifted21();
        lifted211.b_72 = b_72;
        lifted211.a_21 = a_21;
        term = try_1_0.instance.invoke(context, term, lifted211);
        if(term == null)
          break Fail318;
        if(true)
          return term;
      }
      return null;
    }
  }

  @SuppressWarnings("all") private static final class lifted21 extends Strategy 
  { 
    TermReference b_72;

    TermReference a_21;

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      Fail319:
      { 
        term = add_local_var_0_2.instance.invoke(context, term, b_72.value, a_21.value);
        if(term == null)
          break Fail319;
        if(true)
          return term;
      }
      return null;
    }
  }

  @SuppressWarnings("all") private static final class lifted19 extends Strategy 
  { 
    public static final lifted19 instance = new lifted19();

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      Fail320:
      { 
        if(term.getTermType() != IStrategoTerm.APPL || transform._consEJPCall_2 != ((IStrategoAppl)term).getConstructor())
          break Fail320;
        if(true)
          return term;
      }
      return null;
    }
  }

  @SuppressWarnings("all") private static final class lifted18 extends Strategy 
  { 
    public static final lifted18 instance = new lifted18();

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      Fail321:
      { 
        if(term.getTermType() != IStrategoTerm.APPL || transform._consScopedEJPCall_3 != ((IStrategoAppl)term).getConstructor())
          break Fail321;
        if(true)
          return term;
      }
      return null;
    }
  }

  @SuppressWarnings("all") private static final class lifted16 extends Strategy 
  { 
    TermReference d_15;

    TermReference u_71;

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      Fail322:
      { 
        lifted17 lifted170 = new lifted17();
        lifted170.d_15 = d_15;
        lifted170.u_71 = u_71;
        term = try_1_0.instance.invoke(context, term, lifted170);
        if(term == null)
          break Fail322;
        if(true)
          return term;
      }
      return null;
    }
  }

  @SuppressWarnings("all") private static final class lifted17 extends Strategy 
  { 
    TermReference d_15;

    TermReference u_71;

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      Fail323:
      { 
        IStrategoTerm p_15 = null;
        IStrategoTerm r_15 = null;
        IStrategoTerm s_15 = null;
        r_15 = term;
        p_15 = transform.constNone0;
        s_15 = r_15;
        term = ejp_to_java_0_4.instance.invoke(context, s_15, d_15.value, p_15, transform.constNone0, u_71.value);
        if(term == null)
          break Fail323;
        if(true)
          return term;
      }
      return null;
    }
  }

  @SuppressWarnings("all") private static final class lifted14 extends Strategy 
  { 
    TermReference y_15;

    TermReference u_71;

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      Fail324:
      { 
        lifted15 lifted150 = new lifted15();
        lifted150.y_15 = y_15;
        lifted150.u_71 = u_71;
        term = try_1_0.instance.invoke(context, term, lifted150);
        if(term == null)
          break Fail324;
        if(true)
          return term;
      }
      return null;
    }
  }

  @SuppressWarnings("all") private static final class lifted15 extends Strategy 
  { 
    TermReference y_15;

    TermReference u_71;

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      Fail325:
      { 
        IStrategoTerm g_16 = null;
        IStrategoTerm j_16 = null;
        IStrategoTerm k_16 = null;
        j_16 = term;
        g_16 = transform.constNone0;
        k_16 = j_16;
        term = ejp_to_java_0_4.instance.invoke(context, k_16, y_15.value, g_16, transform.constNone0, u_71.value);
        if(term == null)
          break Fail325;
        if(true)
          return term;
      }
      return null;
    }
  }

  @SuppressWarnings("all") private static final class lifted13 extends Strategy 
  { 
    TermReference r_71;

    TermReference s_16;

    TermReference u_16;

    TermReference s_71;

    TermReference t_71;

    TermReference u_71;

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      Fail326:
      { 
        term = convert_one_var_dec_0_6.instance.invokeDynamic(context, term, NO_STRATEGIES, new IStrategoTerm[]{r_71.value, s_16.value, u_16.value, s_71.value, t_71.value, u_71.value});
        if(term == null)
          break Fail326;
        if(true)
          return term;
      }
      return null;
    }
  }

  @SuppressWarnings("all") private static final class lifted11 extends Strategy 
  { 
    TermReference r_71;

    TermReference s_71;

    TermReference t_71;

    TermReference u_71;

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      Fail327:
      { 
        lifted12 lifted120 = new lifted12();
        lifted120.r_71 = r_71;
        lifted120.s_71 = s_71;
        lifted120.t_71 = t_71;
        lifted120.u_71 = u_71;
        term = try_1_0.instance.invoke(context, term, lifted120);
        if(term == null)
          break Fail327;
        if(true)
          return term;
      }
      return null;
    }
  }

  @SuppressWarnings("all") private static final class lifted12 extends Strategy 
  { 
    TermReference r_71;

    TermReference s_71;

    TermReference t_71;

    TermReference u_71;

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      Fail328:
      { 
        IStrategoTerm g_17 = null;
        g_17 = term;
        if(r_71.value == null)
          break Fail328;
        term = hashtable_copy_0_0.instance.invoke(context, r_71.value);
        if(term == null)
          break Fail328;
        term = ejp_to_java_0_4.instance.invoke(context, g_17, term, s_71.value, t_71.value, u_71.value);
        if(term == null)
          break Fail328;
        if(true)
          return term;
      }
      return null;
    }
  }

  @SuppressWarnings("all") private static final class lifted10 extends Strategy 
  { 
    TermReference r_71;

    TermReference s_71;

    TermReference s_17;

    TermReference u_71;

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      Fail329:
      { 
        term = ejp_to_java_0_4.instance.invoke(context, term, r_71.value, s_71.value, s_17.value, u_71.value);
        if(term == null)
          break Fail329;
        if(true)
          return term;
      }
      return null;
    }
  }

  @SuppressWarnings("all") private static final class lifted9 extends Strategy 
  { 
    TermReference r_71;

    TermReference s_71;

    TermReference t_71;

    TermReference u_71;

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      Fail330:
      { 
        term = ejp_to_java_0_4.instance.invoke(context, term, r_71.value, s_71.value, t_71.value, u_71.value);
        if(term == null)
          break Fail330;
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
      Fail331:
      { 
        if(term.getTermType() != IStrategoTerm.APPL || transform._consAnno_2 != ((IStrategoAppl)term).getConstructor())
          break Fail331;
        IStrategoTerm arg8 = term.getSubterm(0);
        if(arg8.getTermType() != IStrategoTerm.APPL || transform._consTypeName_1 != ((IStrategoAppl)arg8).getConstructor())
          break Fail331;
        IStrategoTerm arg9 = arg8.getSubterm(0);
        if(arg9.getTermType() != IStrategoTerm.APPL || transform._consId_1 != ((IStrategoAppl)arg9).getConstructor())
          break Fail331;
        IStrategoTerm arg10 = arg9.getSubterm(0);
        if(arg10.getTermType() != IStrategoTerm.STRING || !"ExplicitScopedJoinPoint".equals(((IStrategoString)arg10).stringValue()))
          break Fail331;
        if(true)
          return term;
      }
      return null;
    }
  }

  @SuppressWarnings("all") private static final class lifted6 extends Strategy 
  { 
    TermReference r_71;

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      Fail332:
      { 
        lifted7 lifted710 = new lifted7();
        lifted710.r_71 = r_71;
        term = try_1_0.instance.invoke(context, term, lifted710);
        if(term == null)
          break Fail332;
        if(true)
          return term;
      }
      return null;
    }
  }

  @SuppressWarnings("all") private static final class lifted7 extends Strategy 
  { 
    TermReference r_71;

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      Fail333:
      { 
        term = process_method_param_0_1.instance.invoke(context, term, r_71.value);
        if(term == null)
          break Fail333;
        if(true)
          return term;
      }
      return null;
    }
  }

  @SuppressWarnings("all") private static final class lifted4 extends Strategy 
  { 
    TermReference r_71;

    TermReference p_18;

    TermReference t_71;

    TermReference u_71;

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      Fail334:
      { 
        lifted5 lifted510 = new lifted5();
        lifted510.r_71 = r_71;
        lifted510.p_18 = p_18;
        lifted510.t_71 = t_71;
        lifted510.u_71 = u_71;
        term = try_1_0.instance.invoke(context, term, lifted510);
        if(term == null)
          break Fail334;
        if(true)
          return term;
      }
      return null;
    }
  }

  @SuppressWarnings("all") private static final class lifted5 extends Strategy 
  { 
    TermReference r_71;

    TermReference p_18;

    TermReference t_71;

    TermReference u_71;

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      Fail335:
      { 
        IStrategoTerm h_19 = null;
        h_19 = term;
        if(r_71.value == null)
          break Fail335;
        term = hashtable_copy_0_0.instance.invoke(context, r_71.value);
        if(term == null)
          break Fail335;
        term = ejp_to_java_0_4.instance.invoke(context, h_19, term, p_18.value, t_71.value, u_71.value);
        if(term == null)
          break Fail335;
        if(true)
          return term;
      }
      return null;
    }
  }

  @SuppressWarnings("all") private static final class lifted2 extends Strategy 
  { 
    TermReference r_71;

    TermReference s_71;

    TermReference t_71;

    TermReference u_71;

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      Fail336:
      { 
        lifted3 lifted310 = new lifted3();
        lifted310.r_71 = r_71;
        lifted310.s_71 = s_71;
        lifted310.t_71 = t_71;
        lifted310.u_71 = u_71;
        term = try_1_0.instance.invoke(context, term, lifted310);
        if(term == null)
          break Fail336;
        if(true)
          return term;
      }
      return null;
    }
  }

  @SuppressWarnings("all") private static final class lifted3 extends Strategy 
  { 
    TermReference r_71;

    TermReference s_71;

    TermReference t_71;

    TermReference u_71;

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      Fail337:
      { 
        IStrategoTerm a_19 = null;
        a_19 = term;
        if(r_71.value == null)
          break Fail337;
        term = hashtable_copy_0_0.instance.invoke(context, r_71.value);
        if(term == null)
          break Fail337;
        term = ejp_to_java_0_4.instance.invoke(context, a_19, term, s_71.value, t_71.value, u_71.value);
        if(term == null)
          break Fail337;
        if(true)
          return term;
      }
      return null;
    }
  }

  @SuppressWarnings("all") private static final class lifted0 extends Strategy 
  { 
    TermReference g_12;

    TermReference j_12;

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      Fail338:
      { 
        lifted1 lifted110 = new lifted1();
        lifted110.g_12 = g_12;
        lifted110.j_12 = j_12;
        term = try_1_0.instance.invoke(context, term, lifted110);
        if(term == null)
          break Fail338;
        if(true)
          return term;
      }
      return null;
    }
  }

  @SuppressWarnings("all") private static final class lifted1 extends Strategy 
  { 
    TermReference g_12;

    TermReference j_12;

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      Fail339:
      { 
        IStrategoTerm q_12 = null;
        IStrategoTerm s_12 = null;
        IStrategoTerm v_12 = null;
        s_12 = term;
        term = new_hashtable_0_0.instance.invoke(context, term);
        if(term == null)
          break Fail339;
        q_12 = term;
        v_12 = s_12;
        term = ejp_to_java_0_4.instance.invoke(context, v_12, q_12, g_12.value, transform.constNone0, j_12.value);
        if(term == null)
          break Fail339;
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
      varScope.addSVar("fetch_0_1", new InteropSDefT(fetch_0_1.instance, context));
      varScope.addSVar("ejp_to_java2_0_0", new InteropSDefT(ejp_to_java2_0_0.instance, context));
      varScope.addSVar("ejp_to_java_0_4", new InteropSDefT(ejp_to_java_0_4.instance, context));
      varScope.addSVar("convert_one_var_dec_0_6", new InteropSDefT(convert_one_var_dec_0_6.instance, context));
      varScope.addSVar("convert_var_dec_by_ejp_call_0_6", new InteropSDefT(convert_var_dec_by_ejp_call_0_6.instance, context));
      varScope.addSVar("add_local_vars_0_1", new InteropSDefT(add_local_vars_0_1.instance, context));
      varScope.addSVar("add_local_var_0_2", new InteropSDefT(add_local_var_0_2.instance, context));
      varScope.addSVar("process_method_param_0_1", new InteropSDefT(process_method_param_0_1.instance, context));
      varScope.addSVar("gen_auxilery_class_0_5", new InteropSDefT(gen_auxilery_class_0_5.instance, context));
      varScope.addSVar("gen_method_annotation_0_0", new InteropSDefT(gen_method_annotation_0_0.instance, context));
      varScope.addSVar("gen_compact_var_declaration_0_2", new InteropSDefT(gen_compact_var_declaration_0_2.instance, context));
      varScope.addSVar("gen_before_call_assignments_0_2", new InteropSDefT(gen_before_call_assignments_0_2.instance, context));
      varScope.addSVar("gen_after_call_simple_assignments_0_2", new InteropSDefT(gen_after_call_simple_assignments_0_2.instance, context));
      varScope.addSVar("gen_after_call_assignments_with_declarations_0_2", new InteropSDefT(gen_after_call_assignments_with_declarations_0_2.instance, context));
      varScope.addSVar("create_method_invokation_0_2", new InteropSDefT(create_method_invokation_0_2.instance, context));
      varScope.addSVar("create_method_invokation_0_1", new InteropSDefT(create_method_invokation_0_1.instance, context));
      varScope.addSVar("remove_scoped_ejp_var_decs_0_0", new InteropSDefT(remove_scoped_ejp_var_decs_0_0.instance, context));
      varScope.addSVar("ejp_call_to_method_invokation_0_4", new InteropSDefT(ejp_call_to_method_invokation_0_4.instance, context));
      varScope.addSVar("scoped_ejp_to_java_0_4", new InteropSDefT(scoped_ejp_to_java_0_4.instance, context));
      varScope.addSVar("handle_pointcutargs_0_2", new InteropSDefT(handle_pointcutargs_0_2.instance, context));
      varScope.addSVar("handle_pointcutarg_helper_0_1", new InteropSDefT(handle_pointcutarg_helper_0_1.instance, context));
      varScope.addSVar("get_inner_scoped_vars_0_1", new InteropSDefT(get_inner_scoped_vars_0_1.instance, context));
      varScope.addSVar("remove_vars_decs_from_local_var_dec_stm_0_0", new InteropSDefT(remove_vars_decs_from_local_var_dec_stm_0_0.instance, context));
      varScope.addSVar("remove_var_dec_0_0", new InteropSDefT(remove_var_dec_0_0.instance, context));
      varScope.addSVar("pointcutarg_0_3", new InteropSDefT(pointcutarg_0_3.instance, context));
      varScope.addSVar("gen__ejp__name_0_0", new InteropSDefT(gen__ejp__name_0_0.instance, context));
      varScope.addSVar("typename__2__ambname_0_0", new InteropSDefT(typename__2__ambname_0_0.instance, context));
      varScope.addSVar("gen__nomatch__pointcut__name_0_0", new InteropSDefT(gen__nomatch__pointcut__name_0_0.instance, context));
      varScope.addSVar("gen__ejpscope__method__name_0_2", new InteropSDefT(gen__ejpscope__method__name_0_2.instance, context));
      varScope.addSVar("convert_package_name_0_0", new InteropSDefT(convert_package_name_0_0.instance, context));
      varScope.addSVar("gen__ejpscope__method__name_0_0", new InteropSDefT(gen__ejpscope__method__name_0_0.instance, context));
      varScope.addSVar("gen__ejpscope__method__name__helper_0_0", new InteropSDefT(gen__ejpscope__method__name__helper_0_0.instance, context));
      varScope.addSVar("random_string_0_0", new InteropSDefT(random_string_0_0.instance, context));
      varScope.addSVar("gen_auxilary_class_name_0_0", new InteropSDefT(gen_auxilary_class_name_0_0.instance, context));
      varScope.addSVar("my_hashtable_remove_0_1", new InteropSDefT(my_hashtable_remove_0_1.instance, context));
      varScope.addSVar("my_hashtable_union_0_1", new InteropSDefT(my_hashtable_union_0_1.instance, context));
      varScope.addSVar("my_hashtable_union_helper_0_2", new InteropSDefT(my_hashtable_union_helper_0_2.instance, context));
      varScope.addSVar("add_key_to_multiple_values_table_0_2", new InteropSDefT(add_key_to_multiple_values_table_0_2.instance, context));
      varScope.addSVar("allow_extends_1_1", new InteropSDefT(allow_extends_1_1.instance, context));
      varScope.addSVar("allow_extends_2_1", new InteropSDefT(allow_extends_2_1.instance, context));
      varScope.addSVar("allow_extends_helper_2_0", new InteropSDefT(allow_extends_helper_2_0.instance, context));
      varScope.addSVar("fetch_type_0_0", new InteropSDefT(fetch_type_0_0.instance, context));
      varScope.addSVar("ejp_to_ajc_0_3", new InteropSDefT(ejp_to_ajc_0_3.instance, context));
      varScope.addSVar("gen_pointcutargs_pointcuts_0_1", new InteropSDefT(gen_pointcutargs_pointcuts_0_1.instance, context));
      varScope.addSVar("convet_pointcutarg_to_pointcut_0_0", new InteropSDefT(convet_pointcutarg_to_pointcut_0_0.instance, context));
      varScope.addSVar("gen_method_head_0_3", new InteropSDefT(gen_method_head_0_3.instance, context));
      varScope.addSVar("gen_ejp_annotation_0_1", new InteropSDefT(gen_ejp_annotation_0_1.instance, context));
      varScope.addSVar("gen_method_body_0_2", new InteropSDefT(gen_method_body_0_2.instance, context));
      varScope.addSVar("get_default_return_value_for_return_type_0_0", new InteropSDefT(get_default_return_value_for_return_type_0_0.instance, context));
      varScope.addSVar("fetch_default_value_0_0", new InteropSDefT(fetch_default_value_0_0.instance, context));
      varScope.addSVar("fetch_handles_list_0_0", new InteropSDefT(fetch_handles_list_0_0.instance, context));
      varScope.addSVar("remove_ejp_decs_0_0", new InteropSDefT(remove_ejp_decs_0_0.instance, context));
      varScope.addSVar("aspectj_to_box_0_0_fragment_4", new InteropSDefT(aspectj_to_box_0_0_fragment_4.instance, context));
      varScope.addSVar("aspectj_to_box_0_0_fragment_3", new InteropSDefT(aspectj_to_box_0_0_fragment_3.instance, context));
      varScope.addSVar("aspectj_to_box_0_0_fragment_2", new InteropSDefT(aspectj_to_box_0_0_fragment_2.instance, context));
      varScope.addSVar("aspectj_to_box_0_0_fragment_1", new InteropSDefT(aspectj_to_box_0_0_fragment_1.instance, context));
      varScope.addSVar("aspectj_to_box_0_0_fragment_0", new InteropSDefT(aspectj_to_box_0_0_fragment_0.instance, context));
      varScope.addSVar("aspectj_to_box_0_0", new InteropSDefT(aspectj_to_box_0_0.instance, context));
      varScope.addSVar("has_leftmost_not_0_0", new InteropSDefT(has_leftmost_not_0_0.instance, context));
      varScope.addSVar("option_to_boxes_0_0", new InteropSDefT(option_to_boxes_0_0.instance, context));
      varScope.addSVar("pp_aspectj_string_0_0", new InteropSDefT(pp_aspectj_string_0_0.instance, context));
      varScope.addSVar("main_0_0", new InteropSDefT(main_0_0.instance, context));
      varScope.addSVar("handle_io_0_0", new InteropSDefT(handle_io_0_0.instance, context));
      varScope.addSVar("convert_0_0", new InteropSDefT(convert_0_0.instance, context));
      varScope.addSVar("ejp_converter_compilation_unit_0_0", new InteropSDefT(ejp_converter_compilation_unit_0_0.instance, context));
      varScope.addSVar("check_for_change_in_aspect_or_class_0_0", new InteropSDefT(check_for_change_in_aspect_or_class_0_0.instance, context));
      varScope.addSVar("ejp_converter_aspect_or_class_0_1", new InteropSDefT(ejp_converter_aspect_or_class_0_1.instance, context));
      varScope.addSVar("OrComp_2_0", new InteropSDefT($Or$Comp_2_0.instance, context));
      varScope.addSVar("AndComp_2_0", new InteropSDefT($And$Comp_2_0.instance, context));
      varScope.addSVar("NotComp_1_0", new InteropSDefT($Not$Comp_1_0.instance, context));
    }

    private void registerLazy(org.spoofax.interpreter.core.IContext context, Context compiledContext, ClassLoader classLoader, org.spoofax.interpreter.core.VarScope varScope)
    { 
      compiledContext.registerComponent("transform");
      transform.init(compiledContext);
      varScope.addSVar("fetch_0_1", new InteropSDefT(classLoader, "transform$fetch_0_1", context));
      varScope.addSVar("ejp_to_java2_0_0", new InteropSDefT(classLoader, "transform$ejp_to_java2_0_0", context));
      varScope.addSVar("ejp_to_java_0_4", new InteropSDefT(classLoader, "transform$ejp_to_java_0_4", context));
      varScope.addSVar("convert_one_var_dec_0_6", new InteropSDefT(classLoader, "transform$convert_one_var_dec_0_6", context));
      varScope.addSVar("convert_var_dec_by_ejp_call_0_6", new InteropSDefT(classLoader, "transform$convert_var_dec_by_ejp_call_0_6", context));
      varScope.addSVar("add_local_vars_0_1", new InteropSDefT(classLoader, "transform$add_local_vars_0_1", context));
      varScope.addSVar("add_local_var_0_2", new InteropSDefT(classLoader, "transform$add_local_var_0_2", context));
      varScope.addSVar("process_method_param_0_1", new InteropSDefT(classLoader, "transform$process_method_param_0_1", context));
      varScope.addSVar("gen_auxilery_class_0_5", new InteropSDefT(classLoader, "transform$gen_auxilery_class_0_5", context));
      varScope.addSVar("gen_method_annotation_0_0", new InteropSDefT(classLoader, "transform$gen_method_annotation_0_0", context));
      varScope.addSVar("gen_compact_var_declaration_0_2", new InteropSDefT(classLoader, "transform$gen_compact_var_declaration_0_2", context));
      varScope.addSVar("gen_before_call_assignments_0_2", new InteropSDefT(classLoader, "transform$gen_before_call_assignments_0_2", context));
      varScope.addSVar("gen_after_call_simple_assignments_0_2", new InteropSDefT(classLoader, "transform$gen_after_call_simple_assignments_0_2", context));
      varScope.addSVar("gen_after_call_assignments_with_declarations_0_2", new InteropSDefT(classLoader, "transform$gen_after_call_assignments_with_declarations_0_2", context));
      varScope.addSVar("create_method_invokation_0_2", new InteropSDefT(classLoader, "transform$create_method_invokation_0_2", context));
      varScope.addSVar("create_method_invokation_0_1", new InteropSDefT(classLoader, "transform$create_method_invokation_0_1", context));
      varScope.addSVar("remove_scoped_ejp_var_decs_0_0", new InteropSDefT(classLoader, "transform$remove_scoped_ejp_var_decs_0_0", context));
      varScope.addSVar("ejp_call_to_method_invokation_0_4", new InteropSDefT(classLoader, "transform$ejp_call_to_method_invokation_0_4", context));
      varScope.addSVar("scoped_ejp_to_java_0_4", new InteropSDefT(classLoader, "transform$scoped_ejp_to_java_0_4", context));
      varScope.addSVar("handle_pointcutargs_0_2", new InteropSDefT(classLoader, "transform$handle_pointcutargs_0_2", context));
      varScope.addSVar("handle_pointcutarg_helper_0_1", new InteropSDefT(classLoader, "transform$handle_pointcutarg_helper_0_1", context));
      varScope.addSVar("get_inner_scoped_vars_0_1", new InteropSDefT(classLoader, "transform$get_inner_scoped_vars_0_1", context));
      varScope.addSVar("remove_vars_decs_from_local_var_dec_stm_0_0", new InteropSDefT(classLoader, "transform$remove_vars_decs_from_local_var_dec_stm_0_0", context));
      varScope.addSVar("remove_var_dec_0_0", new InteropSDefT(classLoader, "transform$remove_var_dec_0_0", context));
      varScope.addSVar("pointcutarg_0_3", new InteropSDefT(classLoader, "transform$pointcutarg_0_3", context));
      varScope.addSVar("gen__ejp__name_0_0", new InteropSDefT(classLoader, "transform$gen__ejp__name_0_0", context));
      varScope.addSVar("typename__2__ambname_0_0", new InteropSDefT(classLoader, "transform$typename__2__ambname_0_0", context));
      varScope.addSVar("gen__nomatch__pointcut__name_0_0", new InteropSDefT(classLoader, "transform$gen__nomatch__pointcut__name_0_0", context));
      varScope.addSVar("gen__ejpscope__method__name_0_2", new InteropSDefT(classLoader, "transform$gen__ejpscope__method__name_0_2", context));
      varScope.addSVar("convert_package_name_0_0", new InteropSDefT(classLoader, "transform$convert_package_name_0_0", context));
      varScope.addSVar("gen__ejpscope__method__name_0_0", new InteropSDefT(classLoader, "transform$gen__ejpscope__method__name_0_0", context));
      varScope.addSVar("gen__ejpscope__method__name__helper_0_0", new InteropSDefT(classLoader, "transform$gen__ejpscope__method__name__helper_0_0", context));
      varScope.addSVar("random_string_0_0", new InteropSDefT(classLoader, "transform$random_string_0_0", context));
      varScope.addSVar("gen_auxilary_class_name_0_0", new InteropSDefT(classLoader, "transform$gen_auxilary_class_name_0_0", context));
      varScope.addSVar("my_hashtable_remove_0_1", new InteropSDefT(classLoader, "transform$my_hashtable_remove_0_1", context));
      varScope.addSVar("my_hashtable_union_0_1", new InteropSDefT(classLoader, "transform$my_hashtable_union_0_1", context));
      varScope.addSVar("my_hashtable_union_helper_0_2", new InteropSDefT(classLoader, "transform$my_hashtable_union_helper_0_2", context));
      varScope.addSVar("add_key_to_multiple_values_table_0_2", new InteropSDefT(classLoader, "transform$add_key_to_multiple_values_table_0_2", context));
      varScope.addSVar("allow_extends_1_1", new InteropSDefT(classLoader, "transform$allow_extends_1_1", context));
      varScope.addSVar("allow_extends_2_1", new InteropSDefT(classLoader, "transform$allow_extends_2_1", context));
      varScope.addSVar("allow_extends_helper_2_0", new InteropSDefT(classLoader, "transform$allow_extends_helper_2_0", context));
      varScope.addSVar("fetch_type_0_0", new InteropSDefT(classLoader, "transform$fetch_type_0_0", context));
      varScope.addSVar("ejp_to_ajc_0_3", new InteropSDefT(classLoader, "transform$ejp_to_ajc_0_3", context));
      varScope.addSVar("gen_pointcutargs_pointcuts_0_1", new InteropSDefT(classLoader, "transform$gen_pointcutargs_pointcuts_0_1", context));
      varScope.addSVar("convet_pointcutarg_to_pointcut_0_0", new InteropSDefT(classLoader, "transform$convet_pointcutarg_to_pointcut_0_0", context));
      varScope.addSVar("gen_method_head_0_3", new InteropSDefT(classLoader, "transform$gen_method_head_0_3", context));
      varScope.addSVar("gen_ejp_annotation_0_1", new InteropSDefT(classLoader, "transform$gen_ejp_annotation_0_1", context));
      varScope.addSVar("gen_method_body_0_2", new InteropSDefT(classLoader, "transform$gen_method_body_0_2", context));
      varScope.addSVar("get_default_return_value_for_return_type_0_0", new InteropSDefT(classLoader, "transform$get_default_return_value_for_return_type_0_0", context));
      varScope.addSVar("fetch_default_value_0_0", new InteropSDefT(classLoader, "transform$fetch_default_value_0_0", context));
      varScope.addSVar("fetch_handles_list_0_0", new InteropSDefT(classLoader, "transform$fetch_handles_list_0_0", context));
      varScope.addSVar("remove_ejp_decs_0_0", new InteropSDefT(classLoader, "transform$remove_ejp_decs_0_0", context));
      varScope.addSVar("aspectj_to_box_0_0_fragment_4", new InteropSDefT(classLoader, "transform$aspectj_to_box_0_0_fragment_4", context));
      varScope.addSVar("aspectj_to_box_0_0_fragment_3", new InteropSDefT(classLoader, "transform$aspectj_to_box_0_0_fragment_3", context));
      varScope.addSVar("aspectj_to_box_0_0_fragment_2", new InteropSDefT(classLoader, "transform$aspectj_to_box_0_0_fragment_2", context));
      varScope.addSVar("aspectj_to_box_0_0_fragment_1", new InteropSDefT(classLoader, "transform$aspectj_to_box_0_0_fragment_1", context));
      varScope.addSVar("aspectj_to_box_0_0_fragment_0", new InteropSDefT(classLoader, "transform$aspectj_to_box_0_0_fragment_0", context));
      varScope.addSVar("aspectj_to_box_0_0", new InteropSDefT(classLoader, "transform$aspectj_to_box_0_0", context));
      varScope.addSVar("has_leftmost_not_0_0", new InteropSDefT(classLoader, "transform$has_leftmost_not_0_0", context));
      varScope.addSVar("option_to_boxes_0_0", new InteropSDefT(classLoader, "transform$option_to_boxes_0_0", context));
      varScope.addSVar("pp_aspectj_string_0_0", new InteropSDefT(classLoader, "transform$pp_aspectj_string_0_0", context));
      varScope.addSVar("main_0_0", new InteropSDefT(classLoader, "transform$main_0_0", context));
      varScope.addSVar("handle_io_0_0", new InteropSDefT(classLoader, "transform$handle_io_0_0", context));
      varScope.addSVar("convert_0_0", new InteropSDefT(classLoader, "transform$convert_0_0", context));
      varScope.addSVar("ejp_converter_compilation_unit_0_0", new InteropSDefT(classLoader, "transform$ejp_converter_compilation_unit_0_0", context));
      varScope.addSVar("check_for_change_in_aspect_or_class_0_0", new InteropSDefT(classLoader, "transform$check_for_change_in_aspect_or_class_0_0", context));
      varScope.addSVar("ejp_converter_aspect_or_class_0_1", new InteropSDefT(classLoader, "transform$ejp_converter_aspect_or_class_0_1", context));
      varScope.addSVar("OrComp_2_0", new InteropSDefT(classLoader, "transform$$Or$Comp_2_0", context));
      varScope.addSVar("AndComp_2_0", new InteropSDefT(classLoader, "transform$$And$Comp_2_0", context));
      varScope.addSVar("NotComp_1_0", new InteropSDefT(classLoader, "transform$$Not$Comp_1_0", context));
    }
  }
}