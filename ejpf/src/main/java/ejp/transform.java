package ejp;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.java_front.*;
import org.strategoxt.stratego_gpp.*;
import org.strategoxt.stratego_sglr.*;
import org.strategoxt.stratego_lib.*;
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

  protected static IStrategoTerm const119;

  protected static IStrategoTerm const118;

  protected static IStrategoTerm const117;

  protected static IStrategoTerm constCons46;

  protected static IStrategoTerm constTypeImportOnDemandDec0;

  protected static IStrategoTerm constPackageName0;

  protected static IStrategoTerm constCons45;

  protected static IStrategoTerm constId29;

  protected static IStrategoTerm const116;

  protected static IStrategoTerm constCons44;

  protected static IStrategoTerm constId28;

  protected static IStrategoTerm const115;

  public static IStrategoTerm getEjpTbl()
  { 
    return constEjpTbl;
  }

  protected static ImportTerm constEjpTbl;

  protected static IStrategoTerm const114;

  protected static IStrategoTerm const113;

  protected static IStrategoTerm const112;

  protected static IStrategoTerm const111;

  protected static IStrategoTerm constFBOX47;

  protected static IStrategoTerm constS64;

  protected static IStrategoTerm const110;

  protected static IStrategoTerm constFBOX46;

  protected static IStrategoTerm constS63;

  protected static IStrategoTerm const109;

  protected static IStrategoTerm constFBOX45;

  protected static IStrategoTerm constS62;

  protected static IStrategoTerm const108;

  protected static IStrategoTerm constFBOX44;

  protected static IStrategoTerm constS61;

  protected static IStrategoTerm const107;

  protected static IStrategoTerm constFBOX43;

  protected static IStrategoTerm constS60;

  protected static IStrategoTerm const106;

  protected static IStrategoTerm constCons43;

  protected static IStrategoTerm constSOpt4;

  protected static IStrategoTerm constCons42;

  protected static IStrategoTerm constCons41;

  protected static IStrategoTerm constSOpt3;

  protected static IStrategoTerm const105;

  protected static IStrategoTerm constIS0;

  protected static IStrategoTerm constCons40;

  protected static IStrategoTerm constFBOX42;

  protected static IStrategoTerm constS59;

  protected static IStrategoTerm const104;

  protected static IStrategoTerm constFBOX41;

  protected static IStrategoTerm constS58;

  protected static IStrategoTerm const103;

  protected static IStrategoTerm constFBOX40;

  protected static IStrategoTerm constS57;

  protected static IStrategoTerm const102;

  protected static IStrategoTerm constFBOX39;

  protected static IStrategoTerm constS56;

  protected static IStrategoTerm const101;

  protected static IStrategoTerm constFBOX38;

  protected static IStrategoTerm constS55;

  protected static IStrategoTerm const100;

  protected static IStrategoTerm constFBOX37;

  protected static IStrategoTerm constS54;

  protected static IStrategoTerm const99;

  protected static IStrategoTerm constFBOX36;

  protected static IStrategoTerm constS53;

  protected static IStrategoTerm const98;

  protected static IStrategoTerm constFBOX35;

  protected static IStrategoTerm constS52;

  protected static IStrategoTerm constS51;

  protected static IStrategoTerm const97;

  protected static IStrategoTerm constS50;

  protected static IStrategoTerm const96;

  protected static IStrategoTerm constS49;

  protected static IStrategoTerm const95;

  protected static IStrategoTerm constS48;

  protected static IStrategoTerm const94;

  protected static IStrategoTerm constFBOX34;

  protected static IStrategoTerm constS47;

  protected static IStrategoTerm const93;

  protected static IStrategoTerm constFBOX33;

  protected static IStrategoTerm constS46;

  protected static IStrategoTerm const92;

  protected static IStrategoTerm constFBOX32;

  protected static IStrategoTerm constS45;

  protected static IStrategoTerm constFBOX31;

  protected static IStrategoTerm constS44;

  protected static IStrategoTerm const91;

  protected static IStrategoTerm constFBOX30;

  protected static IStrategoTerm constS43;

  protected static IStrategoTerm const90;

  protected static IStrategoTerm constFBOX29;

  protected static IStrategoTerm constS42;

  protected static IStrategoTerm const89;

  protected static IStrategoTerm constCons39;

  protected static IStrategoTerm constFBOX28;

  protected static IStrategoTerm constS41;

  protected static IStrategoTerm const88;

  protected static IStrategoTerm constFBOX27;

  protected static IStrategoTerm constS40;

  protected static IStrategoTerm const87;

  protected static IStrategoTerm constFBOX26;

  protected static IStrategoTerm constS39;

  protected static IStrategoTerm const86;

  protected static IStrategoTerm constFBOX25;

  protected static IStrategoTerm constS38;

  protected static IStrategoTerm const85;

  protected static IStrategoTerm constFBOX24;

  protected static IStrategoTerm constS37;

  protected static IStrategoTerm const84;

  protected static IStrategoTerm constFBOX23;

  protected static IStrategoTerm constCons38;

  protected static IStrategoTerm constFBOX22;

  protected static IStrategoTerm constFBOX21;

  protected static IStrategoTerm constCons37;

  protected static IStrategoTerm constSOpt2;

  protected static IStrategoTerm constVS0;

  protected static IStrategoTerm constS36;

  protected static IStrategoTerm const83;

  protected static IStrategoTerm constS35;

  protected static IStrategoTerm const82;

  protected static IStrategoTerm constS34;

  protected static IStrategoTerm const81;

  protected static IStrategoTerm constFBOX20;

  protected static IStrategoTerm constS33;

  protected static IStrategoTerm const80;

  protected static IStrategoTerm constS32;

  protected static IStrategoTerm const79;

  protected static IStrategoTerm constCons36;

  protected static IStrategoTerm constCons35;

  protected static IStrategoTerm constCons34;

  protected static IStrategoTerm constFBOX19;

  protected static IStrategoTerm constS31;

  protected static IStrategoTerm const78;

  protected static IStrategoTerm constS30;

  protected static IStrategoTerm constCons33;

  protected static IStrategoTerm constS29;

  protected static IStrategoTerm const77;

  protected static IStrategoTerm constFBOX18;

  protected static IStrategoTerm constS28;

  protected static IStrategoTerm const76;

  protected static IStrategoTerm constFBOX17;

  protected static IStrategoTerm constCons32;

  protected static IStrategoTerm constS27;

  protected static IStrategoTerm const75;

  protected static IStrategoTerm constFBOX16;

  protected static IStrategoTerm constS26;

  protected static IStrategoTerm const74;

  protected static IStrategoTerm constCons31;

  protected static IStrategoTerm constS25;

  protected static IStrategoTerm const73;

  protected static IStrategoTerm constFBOX15;

  protected static IStrategoTerm constS24;

  protected static IStrategoTerm constCons30;

  protected static IStrategoTerm constSOpt1;

  protected static IStrategoTerm const72;

  protected static IStrategoTerm constS23;

  protected static IStrategoTerm const71;

  protected static IStrategoTerm constS22;

  protected static IStrategoTerm const70;

  protected static IStrategoTerm constS21;

  protected static IStrategoTerm const69;

  protected static IStrategoTerm constS20;

  protected static IStrategoTerm const68;

  protected static IStrategoTerm constS19;

  protected static IStrategoTerm const67;

  protected static IStrategoTerm constS18;

  protected static IStrategoTerm const66;

  protected static IStrategoTerm constS17;

  protected static IStrategoTerm const65;

  protected static IStrategoTerm constFBOX14;

  protected static IStrategoTerm constS16;

  protected static IStrategoTerm constFBOX13;

  protected static IStrategoTerm constS15;

  protected static IStrategoTerm const64;

  protected static IStrategoTerm constFBOX12;

  protected static IStrategoTerm constS14;

  protected static IStrategoTerm const63;

  protected static IStrategoTerm constFBOX11;

  protected static IStrategoTerm constS13;

  protected static IStrategoTerm const62;

  protected static IStrategoTerm constFBOX10;

  protected static IStrategoTerm constS12;

  protected static IStrategoTerm const61;

  protected static IStrategoTerm constFBOX9;

  protected static IStrategoTerm constS11;

  protected static IStrategoTerm const60;

  protected static IStrategoTerm constFBOX8;

  protected static IStrategoTerm constS10;

  protected static IStrategoTerm const59;

  protected static IStrategoTerm constFBOX7;

  protected static IStrategoTerm constS9;

  protected static IStrategoTerm const58;

  protected static IStrategoTerm constH0;

  protected static IStrategoTerm constCons29;

  protected static IStrategoTerm constFBOX6;

  protected static IStrategoTerm constS8;

  protected static IStrategoTerm const57;

  protected static IStrategoTerm constCons28;

  protected static IStrategoTerm constFBOX5;

  protected static IStrategoTerm constS7;

  protected static IStrategoTerm const56;

  protected static IStrategoTerm constFBOX4;

  protected static IStrategoTerm constS6;

  protected static IStrategoTerm const55;

  protected static IStrategoTerm constFBOX3;

  protected static IStrategoTerm constS5;

  protected static IStrategoTerm const54;

  protected static IStrategoTerm constFBOX2;

  protected static IStrategoTerm constS4;

  protected static IStrategoTerm const53;

  protected static IStrategoTerm constFBOX1;

  protected static IStrategoTerm constS3;

  protected static IStrategoTerm const52;

  protected static IStrategoTerm constFBOX0;

  protected static IStrategoTerm constS2;

  protected static IStrategoTerm const51;

  protected static IStrategoTerm constKW0;

  protected static IStrategoTerm constS1;

  protected static IStrategoTerm const50;

  protected static IStrategoTerm constCons27;

  protected static IStrategoTerm constS0;

  protected static IStrategoTerm const49;

  protected static IStrategoTerm constCons26;

  protected static IStrategoTerm constSOpt0;

  protected static IStrategoTerm constHS0;

  protected static IStrategoTerm constSome2;

  protected static IStrategoTerm constLit9;

  protected static IStrategoTerm constNull0;

  protected static IStrategoTerm constSome1;

  protected static IStrategoTerm constLit8;

  protected static IStrategoTerm constFalse0;

  protected static IStrategoTerm constSome0;

  protected static IStrategoTerm constLit7;

  protected static IStrategoTerm constDeci0;

  protected static IStrategoTerm const48;

  protected static IStrategoTerm constId27;

  protected static IStrategoTerm const47;

  protected static IStrategoTerm constNoPointcutBody0;

  protected static IStrategoTerm constCons25;

  protected static IStrategoTerm constCons24;

  protected static IStrategoTerm constPublic0;

  protected static IStrategoTerm constCons23;

  protected static IStrategoTerm const46;

  protected static IStrategoTerm constCons22;

  protected static IStrategoTerm constElemValPair4;

  protected static IStrategoTerm constLit6;

  protected static IStrategoTerm constString6;

  protected static IStrategoTerm constCons21;

  protected static IStrategoTerm constChars6;

  protected static IStrategoTerm const45;

  protected static IStrategoTerm const44;

  protected static IStrategoTerm constCons20;

  protected static IStrategoTerm constParam1;

  protected static IStrategoTerm constId26;

  protected static IStrategoTerm const43;

  protected static IStrategoTerm constClassOrInterfaceType1;

  protected static IStrategoTerm constCons19;

  protected static IStrategoTerm constElemValPair3;

  protected static IStrategoTerm constLit5;

  protected static IStrategoTerm constString5;

  protected static IStrategoTerm constCons18;

  protected static IStrategoTerm constChars5;

  protected static IStrategoTerm const42;

  protected static IStrategoTerm const41;

  protected static IStrategoTerm constCons17;

  protected static IStrategoTerm constElemValPair2;

  protected static IStrategoTerm constLit4;

  protected static IStrategoTerm constString4;

  protected static IStrategoTerm constCons16;

  protected static IStrategoTerm constChars4;

  protected static IStrategoTerm const40;

  protected static IStrategoTerm constCons15;

  protected static IStrategoTerm constParam0;

  protected static IStrategoTerm constId25;

  protected static IStrategoTerm const39;

  protected static IStrategoTerm constClassOrInterfaceType0;

  protected static IStrategoTerm constTypeName11;

  protected static IStrategoTerm constId24;

  protected static IStrategoTerm const38;

  protected static IStrategoTerm constId23;

  protected static IStrategoTerm const37;

  protected static IStrategoTerm constCons14;

  protected static IStrategoTerm constElemValPair1;

  protected static IStrategoTerm constLit3;

  protected static IStrategoTerm constString3;

  protected static IStrategoTerm constCons13;

  protected static IStrategoTerm constChars3;

  protected static IStrategoTerm const36;

  protected static IStrategoTerm constId22;

  protected static IStrategoTerm const35;

  protected static IStrategoTerm constTypeName10;

  protected static IStrategoTerm constId21;

  protected static IStrategoTerm const34;

  protected static IStrategoTerm constTypeName9;

  protected static IStrategoTerm constId20;

  protected static IStrategoTerm const33;

  protected static IStrategoTerm constPackageOrTypeName3;

  protected static IStrategoTerm constId19;

  protected static IStrategoTerm const32;

  protected static IStrategoTerm constPackageOrTypeName2;

  protected static IStrategoTerm constId18;

  protected static IStrategoTerm const31;

  protected static IStrategoTerm constPackageOrTypeName1;

  protected static IStrategoTerm constId17;

  protected static IStrategoTerm const30;

  protected static IStrategoTerm constPackageOrTypeName0;

  protected static IStrategoTerm constId16;

  protected static IStrategoTerm const29;

  protected static IStrategoTerm constCons12;

  protected static IStrategoTerm constPrivate0;

  protected static IStrategoTerm const28;

  protected static IStrategoTerm constAnnoPattern3;

  protected static IStrategoTerm constCons11;

  protected static IStrategoTerm constNot1;

  protected static IStrategoTerm constAnnoPattern2;

  protected static IStrategoTerm constCons10;

  protected static IStrategoTerm constSimpleAnnoPatternExact1;

  protected static IStrategoTerm constAnnoPattern1;

  protected static IStrategoTerm constCons9;

  protected static IStrategoTerm constNot0;

  protected static IStrategoTerm constAnnoPattern0;

  protected static IStrategoTerm constCons8;

  protected static IStrategoTerm constStatic0;

  protected static IStrategoTerm constCons7;

  protected static IStrategoTerm constSimpleAnnoPatternExact0;

  protected static IStrategoTerm constTypeName8;

  protected static IStrategoTerm constId15;

  protected static IStrategoTerm const27;

  protected static IStrategoTerm constLit2;

  protected static IStrategoTerm constString2;

  protected static IStrategoTerm constCons6;

  protected static IStrategoTerm constChars2;

  protected static IStrategoTerm const26;

  protected static IStrategoTerm constLit1;

  protected static IStrategoTerm constString1;

  protected static IStrategoTerm constCons5;

  protected static IStrategoTerm constChars1;

  protected static IStrategoTerm const25;

  protected static IStrategoTerm constCons4;

  protected static IStrategoTerm const24;

  protected static IStrategoTerm const23;

  protected static IStrategoTerm const22;

  protected static IStrategoTerm constTypeName7;

  protected static IStrategoTerm constId14;

  protected static IStrategoTerm const21;

  protected static IStrategoTerm constCons3;

  protected static IStrategoTerm constFormalWildcard0;

  protected static IStrategoTerm constMemberName0;

  protected static IStrategoTerm constModPattern0;

  protected static IStrategoTerm constTypeName6;

  protected static IStrategoTerm constId13;

  protected static IStrategoTerm const20;

  protected static IStrategoTerm constRefTypePattern0;

  protected static IStrategoTerm constNamePattern0;

  protected static IStrategoTerm const19;

  protected static IStrategoTerm constTypeName5;

  protected static IStrategoTerm constId12;

  protected static IStrategoTerm const18;

  protected static IStrategoTerm const17;

  protected static IStrategoTerm constBlock0;

  protected static IStrategoTerm constId11;

  protected static IStrategoTerm constId10;

  protected static IStrategoTerm const16;

  protected static IStrategoTerm constTypeName4;

  protected static IStrategoTerm constId9;

  protected static IStrategoTerm const15;

  protected static IStrategoTerm const14;

  protected static IStrategoTerm const13;

  protected static IStrategoTerm constCons2;

  protected static IStrategoTerm constFinal0;

  protected static IStrategoTerm constCons1;

  protected static IStrategoTerm const12;

  protected static IStrategoTerm const11;

  protected static IStrategoTerm constId8;

  protected static IStrategoTerm const10;

  protected static IStrategoTerm constId7;

  protected static IStrategoTerm const9;

  protected static IStrategoTerm constId6;

  protected static IStrategoTerm const8;

  protected static IStrategoTerm constTypeName3;

  protected static IStrategoTerm constId5;

  protected static IStrategoTerm const7;

  protected static IStrategoTerm constElemValPair0;

  protected static IStrategoTerm constLit0;

  protected static IStrategoTerm constString0;

  protected static IStrategoTerm constCons0;

  protected static IStrategoTerm constChars0;

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

  public static IStrategoConstructor _consRegularTypePattern_1;

  public static IStrategoConstructor _consEJPCall_2;

  public static IStrategoConstructor _consScopedEJPCall_3;

  public static IStrategoConstructor _consExplicitJoinPoint_3;

  public static IStrategoConstructor _consPointcutargs_1;

  public static IStrategoConstructor _consPointcutarg_3;

  public static IStrategoConstructor _consDecError_2;

  public static IStrategoConstructor _consDecSoft_2;

  public static IStrategoConstructor _consDecNoMatch_4;

  public static IStrategoConstructor _consSimpleAnnoPatternValue_2;

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

  public static IStrategoConstructor _consAnno_2;

  public static IStrategoConstructor _consNil_0;

  public static IStrategoConstructor _consCons_2;

  public static IStrategoConstructor _consNone_0;

  public static IStrategoConstructor _consSome_1;

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
          org.strategoxt.stratego_lib.Main.init(context);
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
    _consRegularTypePattern_1 = termFactory.makeConstructor("RegularTypePattern", 1);
    _consEJPCall_2 = termFactory.makeConstructor("EJPCall", 2);
    _consScopedEJPCall_3 = termFactory.makeConstructor("ScopedEJPCall", 3);
    _consExplicitJoinPoint_3 = termFactory.makeConstructor("ExplicitJoinPoint", 3);
    _consPointcutargs_1 = termFactory.makeConstructor("Pointcutargs", 1);
    _consPointcutarg_3 = termFactory.makeConstructor("Pointcutarg", 3);
    _consDecError_2 = termFactory.makeConstructor("DecError", 2);
    _consDecSoft_2 = termFactory.makeConstructor("DecSoft", 2);
    _consDecNoMatch_4 = termFactory.makeConstructor("DecNoMatch", 4);
    _consSimpleAnnoPatternValue_2 = termFactory.makeConstructor("SimpleAnnoPatternValue", 2);
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
    _consAnno_2 = termFactory.makeConstructor("Anno", 2);
    _consNil_0 = termFactory.makeConstructor("Nil", 0);
    _consCons_2 = termFactory.makeConstructor("Cons", 2);
    _consNone_0 = termFactory.makeConstructor("None", 0);
    _consSome_1 = termFactory.makeConstructor("Some", 1);
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
    const3 = termFactory.makeString("SourceLocation");
    constId2 = termFactory.makeAppl(transform._consId_1, new IStrategoTerm[]{transform.const3});
    constTypeName2 = termFactory.makeAppl(transform._consTypeName_1, new IStrategoTerm[]{transform.constId2});
    const4 = termFactory.makeString("line");
    constId3 = termFactory.makeAppl(transform._consId_1, new IStrategoTerm[]{transform.const4});
    const5 = termFactory.makeString("file");
    constId4 = termFactory.makeAppl(transform._consId_1, new IStrategoTerm[]{transform.const5});
    const6 = termFactory.makeString("/home/ahadas/workspace_ejp/ejp/src/ex_base/Main.java");
    constChars0 = termFactory.makeAppl(transform._consChars_1, new IStrategoTerm[]{transform.const6});
    constCons0 = (IStrategoTerm)termFactory.makeListCons(transform.constChars0, (IStrategoList)transform.constNil0);
    constString0 = termFactory.makeAppl(transform._consString_1, new IStrategoTerm[]{transform.constCons0});
    constLit0 = termFactory.makeAppl(transform._consLit_1, new IStrategoTerm[]{transform.constString0});
    constElemValPair0 = termFactory.makeAppl(transform._consElemValPair_2, new IStrategoTerm[]{transform.constId4, transform.constLit0});
    const7 = termFactory.makeString("ExplicitScopedJoinPoint");
    constId5 = termFactory.makeAppl(transform._consId_1, new IStrategoTerm[]{transform.const7});
    constTypeName3 = termFactory.makeAppl(transform._consTypeName_1, new IStrategoTerm[]{transform.constId5});
    const8 = termFactory.makeString("joinpoint");
    constId6 = termFactory.makeAppl(transform._consId_1, new IStrategoTerm[]{transform.const8});
    const9 = termFactory.makeString("aspect");
    constId7 = termFactory.makeAppl(transform._consId_1, new IStrategoTerm[]{transform.const9});
    const10 = termFactory.makeString("args");
    constId8 = termFactory.makeAppl(transform._consId_1, new IStrategoTerm[]{transform.const10});
    const11 = termFactory.makeString("Internal error: with clause failed unexpectedly in rule 'ejp-call-to-method-invokation'");
    const12 = termFactory.makeString("_instance");
    constCons1 = (IStrategoTerm)termFactory.makeListCons(transform.const12, (IStrategoList)transform.constNil0);
    constFinal0 = termFactory.makeAppl(transform._consFinal_0, NO_TERMS);
    constCons2 = (IStrategoTerm)termFactory.makeListCons(transform.constFinal0, (IStrategoList)transform.constNil0);
    const13 = termFactory.makeString("Internal error: with clause failed unexpectedly in rule 'scoped-ejp-to-java'");
    const14 = termFactory.makeString("pointcut");
    const15 = termFactory.makeString("Pointcutargs");
    constId9 = termFactory.makeAppl(transform._consId_1, new IStrategoTerm[]{transform.const15});
    constTypeName4 = termFactory.makeAppl(transform._consTypeName_1, new IStrategoTerm[]{transform.constId9});
    const16 = termFactory.makeString("expr");
    constId10 = termFactory.makeAppl(transform._consId_1, new IStrategoTerm[]{transform.const16});
    constId11 = termFactory.makeAppl(transform._consId_1, new IStrategoTerm[]{transform.const14});
    constBlock0 = termFactory.makeAppl(transform._consBlock_1, new IStrategoTerm[]{transform.constNil0});
    const17 = termFactory.makeString("Internal error: with clause failed unexpectedly in rule 'remove-vars-decs-from-local-var-dec-stm'");
    const18 = termFactory.makeString("ejps.runtime.ClassAnno");
    constId12 = termFactory.makeAppl(transform._consId_1, new IStrategoTerm[]{transform.const18});
    constTypeName5 = termFactory.makeAppl(transform._consTypeName_1, new IStrategoTerm[]{transform.constId12});
    const19 = termFactory.makeString("*");
    constNamePattern0 = termFactory.makeAppl(transform._consNamePattern_1, new IStrategoTerm[]{transform.const19});
    constRefTypePattern0 = termFactory.makeAppl(transform._consRefTypePattern_1, new IStrategoTerm[]{transform.constNamePattern0});
    const20 = termFactory.makeString("ejps.runtime.MethodAnno");
    constId13 = termFactory.makeAppl(transform._consId_1, new IStrategoTerm[]{transform.const20});
    constTypeName6 = termFactory.makeAppl(transform._consTypeName_1, new IStrategoTerm[]{transform.constId13});
    constModPattern0 = termFactory.makeAppl(transform._consModPattern_1, new IStrategoTerm[]{transform.constNil0});
    constMemberName0 = termFactory.makeAppl(transform._consMemberName_1, new IStrategoTerm[]{transform.const19});
    constFormalWildcard0 = termFactory.makeAppl(transform._consFormalWildcard_0, NO_TERMS);
    constCons3 = (IStrategoTerm)termFactory.makeListCons(transform.constFormalWildcard0, (IStrategoList)transform.constNil0);
    const21 = termFactory.makeString("ejps.runtime.EjpBlockAnno");
    constId14 = termFactory.makeAppl(transform._consId_1, new IStrategoTerm[]{transform.const21});
    constTypeName7 = termFactory.makeAppl(transform._consTypeName_1, new IStrategoTerm[]{transform.constId14});
    const22 = termFactory.makeString("nomatch$");
    const23 = termFactory.makeString("$");
    const24 = termFactory.makeString("ejp$");
    constCons4 = (IStrategoTerm)termFactory.makeListCons(transform.const23, (IStrategoList)transform.constNil0);
    const25 = termFactory.makeString("String");
    constChars1 = termFactory.makeAppl(transform._consChars_1, new IStrategoTerm[]{transform.const25});
    constCons5 = (IStrategoTerm)termFactory.makeListCons(transform.constChars1, (IStrategoList)transform.constNil0);
    constString1 = termFactory.makeAppl(transform._consString_1, new IStrategoTerm[]{transform.constCons5});
    constLit1 = termFactory.makeAppl(transform._consLit_1, new IStrategoTerm[]{transform.constString1});
    const26 = termFactory.makeString("char");
    constChars2 = termFactory.makeAppl(transform._consChars_1, new IStrategoTerm[]{transform.const26});
    constCons6 = (IStrategoTerm)termFactory.makeListCons(transform.constChars2, (IStrategoList)transform.constNil0);
    constString2 = termFactory.makeAppl(transform._consString_1, new IStrategoTerm[]{transform.constCons6});
    constLit2 = termFactory.makeAppl(transform._consLit_1, new IStrategoTerm[]{transform.constString2});
    const27 = termFactory.makeString("ExplicitJoinPoint");
    constId15 = termFactory.makeAppl(transform._consId_1, new IStrategoTerm[]{transform.const27});
    constTypeName8 = termFactory.makeAppl(transform._consTypeName_1, new IStrategoTerm[]{transform.constId15});
    constSimpleAnnoPatternExact0 = termFactory.makeAppl(transform._consSimpleAnnoPatternExact_1, new IStrategoTerm[]{transform.constTypeName8});
    constCons7 = (IStrategoTerm)termFactory.makeListCons(transform.constSimpleAnnoPatternExact0, (IStrategoList)transform.constNil0);
    constStatic0 = termFactory.makeAppl(transform._consStatic_0, NO_TERMS);
    constCons8 = (IStrategoTerm)termFactory.makeListCons(transform.constStatic0, (IStrategoList)transform.constCons2);
    constAnnoPattern0 = termFactory.makeAppl(transform._consAnnoPattern_1, new IStrategoTerm[]{transform.constCons7});
    constNot0 = termFactory.makeAppl(transform._consNot_1, new IStrategoTerm[]{transform.constSimpleAnnoPatternExact0});
    constCons9 = (IStrategoTerm)termFactory.makeListCons(transform.constNot0, (IStrategoList)transform.constNil0);
    constAnnoPattern1 = termFactory.makeAppl(transform._consAnnoPattern_1, new IStrategoTerm[]{transform.constCons9});
    constSimpleAnnoPatternExact1 = termFactory.makeAppl(transform._consSimpleAnnoPatternExact_1, new IStrategoTerm[]{transform.constTypeName3});
    constCons10 = (IStrategoTerm)termFactory.makeListCons(transform.constSimpleAnnoPatternExact1, (IStrategoList)transform.constNil0);
    constAnnoPattern2 = termFactory.makeAppl(transform._consAnnoPattern_1, new IStrategoTerm[]{transform.constCons10});
    constNot1 = termFactory.makeAppl(transform._consNot_1, new IStrategoTerm[]{transform.constSimpleAnnoPatternExact1});
    constCons11 = (IStrategoTerm)termFactory.makeListCons(transform.constNot1, (IStrategoList)transform.constNil0);
    constAnnoPattern3 = termFactory.makeAppl(transform._consAnnoPattern_1, new IStrategoTerm[]{transform.constCons11});
    const28 = termFactory.makeString("this(obj) && ");
    constPrivate0 = termFactory.makeAppl(transform._consPrivate_0, NO_TERMS);
    constCons12 = (IStrategoTerm)termFactory.makeListCons(transform.constPrivate0, (IStrategoList)transform.constNil0);
    const29 = termFactory.makeString("org");
    constId16 = termFactory.makeAppl(transform._consId_1, new IStrategoTerm[]{transform.const29});
    constPackageOrTypeName0 = termFactory.makeAppl(transform._consPackageOrTypeName_1, new IStrategoTerm[]{transform.constId16});
    const30 = termFactory.makeString("aspectj");
    constId17 = termFactory.makeAppl(transform._consId_1, new IStrategoTerm[]{transform.const30});
    constPackageOrTypeName1 = termFactory.makeAppl(transform._consPackageOrTypeName_2, new IStrategoTerm[]{transform.constPackageOrTypeName0, transform.constId17});
    const31 = termFactory.makeString("lang");
    constId18 = termFactory.makeAppl(transform._consId_1, new IStrategoTerm[]{transform.const31});
    constPackageOrTypeName2 = termFactory.makeAppl(transform._consPackageOrTypeName_2, new IStrategoTerm[]{transform.constPackageOrTypeName1, transform.constId18});
    const32 = termFactory.makeString("annotation");
    constId19 = termFactory.makeAppl(transform._consId_1, new IStrategoTerm[]{transform.const32});
    constPackageOrTypeName3 = termFactory.makeAppl(transform._consPackageOrTypeName_2, new IStrategoTerm[]{transform.constPackageOrTypeName2, transform.constId19});
    const33 = termFactory.makeString("Pointcut");
    constId20 = termFactory.makeAppl(transform._consId_1, new IStrategoTerm[]{transform.const33});
    constTypeName9 = termFactory.makeAppl(transform._consTypeName_2, new IStrategoTerm[]{transform.constPackageOrTypeName3, transform.constId20});
    const34 = termFactory.makeString("NoMatch");
    constId21 = termFactory.makeAppl(transform._consId_1, new IStrategoTerm[]{transform.const34});
    constTypeName10 = termFactory.makeAppl(transform._consTypeName_1, new IStrategoTerm[]{transform.constId21});
    const35 = termFactory.makeString("granularity");
    constId22 = termFactory.makeAppl(transform._consId_1, new IStrategoTerm[]{transform.const35});
    const36 = termFactory.makeString("package");
    constChars3 = termFactory.makeAppl(transform._consChars_1, new IStrategoTerm[]{transform.const36});
    constCons13 = (IStrategoTerm)termFactory.makeListCons(transform.constChars3, (IStrategoList)transform.constNil0);
    constString3 = termFactory.makeAppl(transform._consString_1, new IStrategoTerm[]{transform.constCons13});
    constLit3 = termFactory.makeAppl(transform._consLit_1, new IStrategoTerm[]{transform.constString3});
    constElemValPair1 = termFactory.makeAppl(transform._consElemValPair_2, new IStrategoTerm[]{transform.constId22, transform.constLit3});
    constCons14 = (IStrategoTerm)termFactory.makeListCons(transform.constElemValPair1, (IStrategoList)transform.constNil0);
    const37 = termFactory.makeString("error");
    constId23 = termFactory.makeAppl(transform._consId_1, new IStrategoTerm[]{transform.const37});
    const38 = termFactory.makeString("Object");
    constId24 = termFactory.makeAppl(transform._consId_1, new IStrategoTerm[]{transform.const38});
    constTypeName11 = termFactory.makeAppl(transform._consTypeName_1, new IStrategoTerm[]{transform.constId24});
    constClassOrInterfaceType0 = termFactory.makeAppl(transform._consClassOrInterfaceType_2, new IStrategoTerm[]{transform.constTypeName11, transform.constNone0});
    const39 = termFactory.makeString("obj");
    constId25 = termFactory.makeAppl(transform._consId_1, new IStrategoTerm[]{transform.const39});
    constParam0 = termFactory.makeAppl(transform._consParam_3, new IStrategoTerm[]{transform.constNil0, transform.constClassOrInterfaceType0, transform.constId25});
    constCons15 = (IStrategoTerm)termFactory.makeListCons(transform.constParam0, (IStrategoList)transform.constNil0);
    const40 = termFactory.makeString("class");
    constChars4 = termFactory.makeAppl(transform._consChars_1, new IStrategoTerm[]{transform.const40});
    constCons16 = (IStrategoTerm)termFactory.makeListCons(transform.constChars4, (IStrategoList)transform.constNil0);
    constString4 = termFactory.makeAppl(transform._consString_1, new IStrategoTerm[]{transform.constCons16});
    constLit4 = termFactory.makeAppl(transform._consLit_1, new IStrategoTerm[]{transform.constString4});
    constElemValPair2 = termFactory.makeAppl(transform._consElemValPair_2, new IStrategoTerm[]{transform.constId22, transform.constLit4});
    constCons17 = (IStrategoTerm)termFactory.makeListCons(transform.constElemValPair2, (IStrategoList)transform.constNil0);
    const41 = termFactory.makeString("@withincode(anno) && @withincode(ejps.runtime.ExplicitScopedJoinPoint) && ");
    const42 = termFactory.makeString("ejp");
    constChars5 = termFactory.makeAppl(transform._consChars_1, new IStrategoTerm[]{transform.const42});
    constCons18 = (IStrategoTerm)termFactory.makeListCons(transform.constChars5, (IStrategoList)transform.constNil0);
    constString5 = termFactory.makeAppl(transform._consString_1, new IStrategoTerm[]{transform.constCons18});
    constLit5 = termFactory.makeAppl(transform._consLit_1, new IStrategoTerm[]{transform.constString5});
    constElemValPair3 = termFactory.makeAppl(transform._consElemValPair_2, new IStrategoTerm[]{transform.constId22, transform.constLit5});
    constCons19 = (IStrategoTerm)termFactory.makeListCons(transform.constElemValPair3, (IStrategoList)transform.constNil0);
    constClassOrInterfaceType1 = termFactory.makeAppl(transform._consClassOrInterfaceType_2, new IStrategoTerm[]{transform.constTypeName1, transform.constNone0});
    const43 = termFactory.makeString("anno");
    constId26 = termFactory.makeAppl(transform._consId_1, new IStrategoTerm[]{transform.const43});
    constParam1 = termFactory.makeAppl(transform._consParam_3, new IStrategoTerm[]{transform.constNil0, transform.constClassOrInterfaceType1, transform.constId26});
    constCons20 = (IStrategoTerm)termFactory.makeListCons(transform.constParam1, (IStrategoList)transform.constNil0);
    const44 = termFactory.makeString("@withincode(anno) && !@withincode(ejps.runtime.ExplicitScopedJoinPoint) && ");
    const45 = termFactory.makeString("method");
    constChars6 = termFactory.makeAppl(transform._consChars_1, new IStrategoTerm[]{transform.const45});
    constCons21 = (IStrategoTerm)termFactory.makeListCons(transform.constChars6, (IStrategoList)transform.constNil0);
    constString6 = termFactory.makeAppl(transform._consString_1, new IStrategoTerm[]{transform.constCons21});
    constLit6 = termFactory.makeAppl(transform._consLit_1, new IStrategoTerm[]{transform.constString6});
    constElemValPair4 = termFactory.makeAppl(transform._consElemValPair_2, new IStrategoTerm[]{transform.constId22, transform.constLit6});
    constCons22 = (IStrategoTerm)termFactory.makeListCons(transform.constElemValPair4, (IStrategoList)transform.constNil0);
    const46 = termFactory.makeString("Internal error: with clause failed unexpectedly in rule 'ejp-to-ajc'");
    constCons23 = (IStrategoTerm)termFactory.makeListCons(transform.constStatic0, (IStrategoList)transform.constNil0);
    constPublic0 = termFactory.makeAppl(transform._consPublic_0, NO_TERMS);
    constCons24 = (IStrategoTerm)termFactory.makeListCons(transform.constPublic0, (IStrategoList)transform.constCons23);
    constCons25 = (IStrategoTerm)termFactory.makeListCons(transform.constPublic0, (IStrategoList)transform.constNil0);
    constNoPointcutBody0 = termFactory.makeAppl(transform._consNoPointcutBody_0, NO_TERMS);
    const47 = termFactory.makeString("handles");
    constId27 = termFactory.makeAppl(transform._consId_1, new IStrategoTerm[]{transform.const47});
    const48 = termFactory.makeString("0");
    constDeci0 = termFactory.makeAppl(transform._consDeci_1, new IStrategoTerm[]{transform.const48});
    constLit7 = termFactory.makeAppl(transform._consLit_1, new IStrategoTerm[]{transform.constDeci0});
    constSome0 = termFactory.makeAppl(transform._consSome_1, new IStrategoTerm[]{transform.constLit7});
    constFalse0 = termFactory.makeAppl(transform._consFalse_0, NO_TERMS);
    constLit8 = termFactory.makeAppl(transform._consLit_1, new IStrategoTerm[]{transform.constFalse0});
    constSome1 = termFactory.makeAppl(transform._consSome_1, new IStrategoTerm[]{transform.constLit8});
    constNull0 = termFactory.makeAppl(transform._consNull_0, NO_TERMS);
    constLit9 = termFactory.makeAppl(transform._consLit_1, new IStrategoTerm[]{transform.constNull0});
    constSome2 = termFactory.makeAppl(transform._consSome_1, new IStrategoTerm[]{transform.constLit9});
    constHS0 = termFactory.makeAppl(transform._consHS_0, NO_TERMS);
    constSOpt0 = termFactory.makeAppl(transform._consSOpt_2, new IStrategoTerm[]{transform.constHS0, transform.const48});
    constCons26 = (IStrategoTerm)termFactory.makeListCons(transform.constSOpt0, (IStrategoList)transform.constNil0);
    const49 = termFactory.makeString(")");
    constS0 = termFactory.makeAppl(transform._consS_1, new IStrategoTerm[]{transform.const49});
    constCons27 = (IStrategoTerm)termFactory.makeListCons(transform.constS0, (IStrategoList)transform.constNil0);
    const50 = termFactory.makeString("(");
    constS1 = termFactory.makeAppl(transform._consS_1, new IStrategoTerm[]{transform.const50});
    constKW0 = termFactory.makeAppl(transform._consKW_0, NO_TERMS);
    const51 = termFactory.makeString("initialization");
    constS2 = termFactory.makeAppl(transform._consS_1, new IStrategoTerm[]{transform.const51});
    constFBOX0 = termFactory.makeAppl(transform._consFBOX_2, new IStrategoTerm[]{transform.constKW0, transform.constS2});
    const52 = termFactory.makeString("preinitialization");
    constS3 = termFactory.makeAppl(transform._consS_1, new IStrategoTerm[]{transform.const52});
    constFBOX1 = termFactory.makeAppl(transform._consFBOX_2, new IStrategoTerm[]{transform.constKW0, transform.constS3});
    const53 = termFactory.makeString("staticinitialization");
    constS4 = termFactory.makeAppl(transform._consS_1, new IStrategoTerm[]{transform.const53});
    constFBOX2 = termFactory.makeAppl(transform._consFBOX_2, new IStrategoTerm[]{transform.constKW0, transform.constS4});
    const54 = termFactory.makeString("get");
    constS5 = termFactory.makeAppl(transform._consS_1, new IStrategoTerm[]{transform.const54});
    constFBOX3 = termFactory.makeAppl(transform._consFBOX_2, new IStrategoTerm[]{transform.constKW0, transform.constS5});
    const55 = termFactory.makeString("set");
    constS6 = termFactory.makeAppl(transform._consS_1, new IStrategoTerm[]{transform.const55});
    constFBOX4 = termFactory.makeAppl(transform._consFBOX_2, new IStrategoTerm[]{transform.constKW0, transform.constS6});
    const56 = termFactory.makeString("handler");
    constS7 = termFactory.makeAppl(transform._consS_1, new IStrategoTerm[]{transform.const56});
    constFBOX5 = termFactory.makeAppl(transform._consFBOX_2, new IStrategoTerm[]{transform.constKW0, transform.constS7});
    constCons28 = (IStrategoTerm)termFactory.makeListCons(transform.constS1, (IStrategoList)transform.constCons27);
    const57 = termFactory.makeString("adviceexecution");
    constS8 = termFactory.makeAppl(transform._consS_1, new IStrategoTerm[]{transform.const57});
    constFBOX6 = termFactory.makeAppl(transform._consFBOX_2, new IStrategoTerm[]{transform.constKW0, transform.constS8});
    constCons29 = (IStrategoTerm)termFactory.makeListCons(transform.constFBOX6, (IStrategoList)transform.constCons28);
    constH0 = termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{transform.constCons26, transform.constCons29});
    const58 = termFactory.makeString("within");
    constS9 = termFactory.makeAppl(transform._consS_1, new IStrategoTerm[]{transform.const58});
    constFBOX7 = termFactory.makeAppl(transform._consFBOX_2, new IStrategoTerm[]{transform.constKW0, transform.constS9});
    const59 = termFactory.makeString("withincode");
    constS10 = termFactory.makeAppl(transform._consS_1, new IStrategoTerm[]{transform.const59});
    constFBOX8 = termFactory.makeAppl(transform._consFBOX_2, new IStrategoTerm[]{transform.constKW0, transform.constS10});
    const60 = termFactory.makeString("cflow");
    constS11 = termFactory.makeAppl(transform._consS_1, new IStrategoTerm[]{transform.const60});
    constFBOX9 = termFactory.makeAppl(transform._consFBOX_2, new IStrategoTerm[]{transform.constKW0, transform.constS11});
    const61 = termFactory.makeString("cflowbelow");
    constS12 = termFactory.makeAppl(transform._consS_1, new IStrategoTerm[]{transform.const61});
    constFBOX10 = termFactory.makeAppl(transform._consFBOX_2, new IStrategoTerm[]{transform.constKW0, transform.constS12});
    const62 = termFactory.makeString("if");
    constS13 = termFactory.makeAppl(transform._consS_1, new IStrategoTerm[]{transform.const62});
    constFBOX11 = termFactory.makeAppl(transform._consFBOX_2, new IStrategoTerm[]{transform.constKW0, transform.constS13});
    const63 = termFactory.makeString("this");
    constS14 = termFactory.makeAppl(transform._consS_1, new IStrategoTerm[]{transform.const63});
    constFBOX12 = termFactory.makeAppl(transform._consFBOX_2, new IStrategoTerm[]{transform.constKW0, transform.constS14});
    const64 = termFactory.makeString("target");
    constS15 = termFactory.makeAppl(transform._consS_1, new IStrategoTerm[]{transform.const64});
    constFBOX13 = termFactory.makeAppl(transform._consFBOX_2, new IStrategoTerm[]{transform.constKW0, transform.constS15});
    constS16 = termFactory.makeAppl(transform._consS_1, new IStrategoTerm[]{transform.const10});
    constFBOX14 = termFactory.makeAppl(transform._consFBOX_2, new IStrategoTerm[]{transform.constKW0, transform.constS16});
    const65 = termFactory.makeString("@this");
    constS17 = termFactory.makeAppl(transform._consS_1, new IStrategoTerm[]{transform.const65});
    const66 = termFactory.makeString("@target");
    constS18 = termFactory.makeAppl(transform._consS_1, new IStrategoTerm[]{transform.const66});
    const67 = termFactory.makeString("@within");
    constS19 = termFactory.makeAppl(transform._consS_1, new IStrategoTerm[]{transform.const67});
    const68 = termFactory.makeString("@withincode");
    constS20 = termFactory.makeAppl(transform._consS_1, new IStrategoTerm[]{transform.const68});
    const69 = termFactory.makeString("@annotation");
    constS21 = termFactory.makeAppl(transform._consS_1, new IStrategoTerm[]{transform.const69});
    const70 = termFactory.makeString("@args");
    constS22 = termFactory.makeAppl(transform._consS_1, new IStrategoTerm[]{transform.const70});
    const71 = termFactory.makeString(".");
    constS23 = termFactory.makeAppl(transform._consS_1, new IStrategoTerm[]{transform.const71});
    const72 = termFactory.makeString("1");
    constSOpt1 = termFactory.makeAppl(transform._consSOpt_2, new IStrategoTerm[]{transform.constHS0, transform.const72});
    constCons30 = (IStrategoTerm)termFactory.makeListCons(transform.constSOpt1, (IStrategoList)transform.constNil0);
    constS24 = termFactory.makeAppl(transform._consS_1, new IStrategoTerm[]{transform.const14});
    constFBOX15 = termFactory.makeAppl(transform._consFBOX_2, new IStrategoTerm[]{transform.constKW0, transform.constS24});
    const73 = termFactory.makeString(";");
    constS25 = termFactory.makeAppl(transform._consS_1, new IStrategoTerm[]{transform.const73});
    constCons31 = (IStrategoTerm)termFactory.makeListCons(transform.constS25, (IStrategoList)transform.constNil0);
    const74 = termFactory.makeString(":");
    constS26 = termFactory.makeAppl(transform._consS_1, new IStrategoTerm[]{transform.const74});
    constFBOX16 = termFactory.makeAppl(transform._consFBOX_2, new IStrategoTerm[]{transform.constKW0, transform.constS25});
    const75 = termFactory.makeString("+");
    constS27 = termFactory.makeAppl(transform._consS_1, new IStrategoTerm[]{transform.const75});
    constCons32 = (IStrategoTerm)termFactory.makeListCons(transform.constS27, (IStrategoList)transform.constNil0);
    constFBOX17 = termFactory.makeAppl(transform._consFBOX_2, new IStrategoTerm[]{transform.constKW0, transform.constS23});
    const76 = termFactory.makeString("..");
    constS28 = termFactory.makeAppl(transform._consS_1, new IStrategoTerm[]{transform.const76});
    constFBOX18 = termFactory.makeAppl(transform._consFBOX_2, new IStrategoTerm[]{transform.constKW0, transform.constS28});
    const77 = termFactory.makeString("...");
    constS29 = termFactory.makeAppl(transform._consS_1, new IStrategoTerm[]{transform.const77});
    constCons33 = (IStrategoTerm)termFactory.makeListCons(transform.constS29, (IStrategoList)transform.constNil0);
    constS30 = termFactory.makeAppl(transform._consS_1, new IStrategoTerm[]{transform.const19});
    const78 = termFactory.makeString("new");
    constS31 = termFactory.makeAppl(transform._consS_1, new IStrategoTerm[]{transform.const78});
    constFBOX19 = termFactory.makeAppl(transform._consFBOX_2, new IStrategoTerm[]{transform.constKW0, transform.constS31});
    constCons34 = (IStrategoTerm)termFactory.makeListCons(transform.constFBOX19, (IStrategoList)transform.constNil0);
    constCons35 = (IStrategoTerm)termFactory.makeListCons(transform.constS23, (IStrategoList)transform.constCons34);
    constCons36 = (IStrategoTerm)termFactory.makeListCons(transform.constS28, (IStrategoList)transform.constCons34);
    const79 = termFactory.makeString("!");
    constS32 = termFactory.makeAppl(transform._consS_1, new IStrategoTerm[]{transform.const79});
    const80 = termFactory.makeString("throws");
    constS33 = termFactory.makeAppl(transform._consS_1, new IStrategoTerm[]{transform.const80});
    constFBOX20 = termFactory.makeAppl(transform._consFBOX_2, new IStrategoTerm[]{transform.constKW0, transform.constS33});
    const81 = termFactory.makeString("@");
    constS34 = termFactory.makeAppl(transform._consS_1, new IStrategoTerm[]{transform.const81});
    const82 = termFactory.makeString("&&");
    constS35 = termFactory.makeAppl(transform._consS_1, new IStrategoTerm[]{transform.const82});
    const83 = termFactory.makeString("||");
    constS36 = termFactory.makeAppl(transform._consS_1, new IStrategoTerm[]{transform.const83});
    constVS0 = termFactory.makeAppl(transform._consVS_0, NO_TERMS);
    constSOpt2 = termFactory.makeAppl(transform._consSOpt_2, new IStrategoTerm[]{transform.constVS0, transform.const48});
    constCons37 = (IStrategoTerm)termFactory.makeListCons(transform.constSOpt2, (IStrategoList)transform.constNil0);
    constFBOX21 = termFactory.makeAppl(transform._consFBOX_2, new IStrategoTerm[]{transform.constKW0, transform.constS26});
    constFBOX22 = termFactory.makeAppl(transform._consFBOX_2, new IStrategoTerm[]{transform.constKW0, transform.constS0});
    constCons38 = (IStrategoTerm)termFactory.makeListCons(transform.constFBOX22, (IStrategoList)transform.constNil0);
    constFBOX23 = termFactory.makeAppl(transform._consFBOX_2, new IStrategoTerm[]{transform.constKW0, transform.constS1});
    const84 = termFactory.makeString("before");
    constS37 = termFactory.makeAppl(transform._consS_1, new IStrategoTerm[]{transform.const84});
    constFBOX24 = termFactory.makeAppl(transform._consFBOX_2, new IStrategoTerm[]{transform.constKW0, transform.constS37});
    const85 = termFactory.makeString("after");
    constS38 = termFactory.makeAppl(transform._consS_1, new IStrategoTerm[]{transform.const85});
    constFBOX25 = termFactory.makeAppl(transform._consFBOX_2, new IStrategoTerm[]{transform.constKW0, transform.constS38});
    const86 = termFactory.makeString("around");
    constS39 = termFactory.makeAppl(transform._consS_1, new IStrategoTerm[]{transform.const86});
    constFBOX26 = termFactory.makeAppl(transform._consFBOX_2, new IStrategoTerm[]{transform.constKW0, transform.constS39});
    const87 = termFactory.makeString("returning");
    constS40 = termFactory.makeAppl(transform._consS_1, new IStrategoTerm[]{transform.const87});
    constFBOX27 = termFactory.makeAppl(transform._consFBOX_2, new IStrategoTerm[]{transform.constKW0, transform.constS40});
    const88 = termFactory.makeString("throwing");
    constS41 = termFactory.makeAppl(transform._consS_1, new IStrategoTerm[]{transform.const88});
    constFBOX28 = termFactory.makeAppl(transform._consFBOX_2, new IStrategoTerm[]{transform.constKW0, transform.constS41});
    constCons39 = (IStrategoTerm)termFactory.makeListCons(transform.constFBOX16, (IStrategoList)transform.constNil0);
    const89 = termFactory.makeString("parents");
    constS42 = termFactory.makeAppl(transform._consS_1, new IStrategoTerm[]{transform.const89});
    constFBOX29 = termFactory.makeAppl(transform._consFBOX_2, new IStrategoTerm[]{transform.constKW0, transform.constS42});
    const90 = termFactory.makeString("declare");
    constS43 = termFactory.makeAppl(transform._consS_1, new IStrategoTerm[]{transform.const90});
    constFBOX30 = termFactory.makeAppl(transform._consFBOX_2, new IStrategoTerm[]{transform.constKW0, transform.constS43});
    const91 = termFactory.makeString("warning");
    constS44 = termFactory.makeAppl(transform._consS_1, new IStrategoTerm[]{transform.const91});
    constFBOX31 = termFactory.makeAppl(transform._consFBOX_2, new IStrategoTerm[]{transform.constKW0, transform.constS44});
    constS45 = termFactory.makeAppl(transform._consS_1, new IStrategoTerm[]{transform.const37});
    constFBOX32 = termFactory.makeAppl(transform._consFBOX_2, new IStrategoTerm[]{transform.constKW0, transform.constS45});
    const92 = termFactory.makeString("soft");
    constS46 = termFactory.makeAppl(transform._consS_1, new IStrategoTerm[]{transform.const92});
    constFBOX33 = termFactory.makeAppl(transform._consFBOX_2, new IStrategoTerm[]{transform.constKW0, transform.constS46});
    const93 = termFactory.makeString("precedence");
    constS47 = termFactory.makeAppl(transform._consS_1, new IStrategoTerm[]{transform.const93});
    constFBOX34 = termFactory.makeAppl(transform._consFBOX_2, new IStrategoTerm[]{transform.constKW0, transform.constS47});
    const94 = termFactory.makeString("@type");
    constS48 = termFactory.makeAppl(transform._consS_1, new IStrategoTerm[]{transform.const94});
    const95 = termFactory.makeString("@constructor");
    constS49 = termFactory.makeAppl(transform._consS_1, new IStrategoTerm[]{transform.const95});
    const96 = termFactory.makeString("@method");
    constS50 = termFactory.makeAppl(transform._consS_1, new IStrategoTerm[]{transform.const96});
    const97 = termFactory.makeString("@field");
    constS51 = termFactory.makeAppl(transform._consS_1, new IStrategoTerm[]{transform.const97});
    constS52 = termFactory.makeAppl(transform._consS_1, new IStrategoTerm[]{transform.const9});
    constFBOX35 = termFactory.makeAppl(transform._consFBOX_2, new IStrategoTerm[]{transform.constKW0, transform.constS52});
    const98 = termFactory.makeString("pertarget");
    constS53 = termFactory.makeAppl(transform._consS_1, new IStrategoTerm[]{transform.const98});
    constFBOX36 = termFactory.makeAppl(transform._consFBOX_2, new IStrategoTerm[]{transform.constKW0, transform.constS53});
    const99 = termFactory.makeString("perthis");
    constS54 = termFactory.makeAppl(transform._consS_1, new IStrategoTerm[]{transform.const99});
    constFBOX37 = termFactory.makeAppl(transform._consFBOX_2, new IStrategoTerm[]{transform.constKW0, transform.constS54});
    const100 = termFactory.makeString("percflow");
    constS55 = termFactory.makeAppl(transform._consS_1, new IStrategoTerm[]{transform.const100});
    constFBOX38 = termFactory.makeAppl(transform._consFBOX_2, new IStrategoTerm[]{transform.constKW0, transform.constS55});
    const101 = termFactory.makeString("percflowbelow");
    constS56 = termFactory.makeAppl(transform._consS_1, new IStrategoTerm[]{transform.const101});
    constFBOX39 = termFactory.makeAppl(transform._consFBOX_2, new IStrategoTerm[]{transform.constKW0, transform.constS56});
    const102 = termFactory.makeString("pertypewithin");
    constS57 = termFactory.makeAppl(transform._consS_1, new IStrategoTerm[]{transform.const102});
    constFBOX40 = termFactory.makeAppl(transform._consFBOX_2, new IStrategoTerm[]{transform.constKW0, transform.constS57});
    const103 = termFactory.makeString("issingleton");
    constS58 = termFactory.makeAppl(transform._consS_1, new IStrategoTerm[]{transform.const103});
    constFBOX41 = termFactory.makeAppl(transform._consFBOX_2, new IStrategoTerm[]{transform.constKW0, transform.constS58});
    const104 = termFactory.makeString("}");
    constS59 = termFactory.makeAppl(transform._consS_1, new IStrategoTerm[]{transform.const104});
    constFBOX42 = termFactory.makeAppl(transform._consFBOX_2, new IStrategoTerm[]{transform.constKW0, transform.constS59});
    constCons40 = (IStrategoTerm)termFactory.makeListCons(transform.constFBOX42, (IStrategoList)transform.constNil0);
    constIS0 = termFactory.makeAppl(transform._consIS_0, NO_TERMS);
    const105 = termFactory.makeString("2");
    constSOpt3 = termFactory.makeAppl(transform._consSOpt_2, new IStrategoTerm[]{transform.constIS0, transform.const105});
    constCons41 = (IStrategoTerm)termFactory.makeListCons(transform.constSOpt3, (IStrategoList)transform.constNil0);
    constCons42 = (IStrategoTerm)termFactory.makeListCons(transform.constSOpt2, (IStrategoList)transform.constCons41);
    constSOpt4 = termFactory.makeAppl(transform._consSOpt_2, new IStrategoTerm[]{transform.constVS0, transform.const72});
    constCons43 = (IStrategoTerm)termFactory.makeListCons(transform.constSOpt4, (IStrategoList)transform.constNil0);
    const106 = termFactory.makeString("{");
    constS60 = termFactory.makeAppl(transform._consS_1, new IStrategoTerm[]{transform.const106});
    constFBOX43 = termFactory.makeAppl(transform._consFBOX_2, new IStrategoTerm[]{transform.constKW0, transform.constS60});
    const107 = termFactory.makeString("privileged");
    constS61 = termFactory.makeAppl(transform._consS_1, new IStrategoTerm[]{transform.const107});
    constFBOX44 = termFactory.makeAppl(transform._consFBOX_2, new IStrategoTerm[]{transform.constKW0, transform.constS61});
    const108 = termFactory.makeString("proceed");
    constS62 = termFactory.makeAppl(transform._consS_1, new IStrategoTerm[]{transform.const108});
    constFBOX45 = termFactory.makeAppl(transform._consFBOX_2, new IStrategoTerm[]{transform.constKW0, transform.constS62});
    const109 = termFactory.makeString("call");
    constS63 = termFactory.makeAppl(transform._consS_1, new IStrategoTerm[]{transform.const109});
    constFBOX46 = termFactory.makeAppl(transform._consFBOX_2, new IStrategoTerm[]{transform.constKW0, transform.constS63});
    const110 = termFactory.makeString("execution");
    constS64 = termFactory.makeAppl(transform._consS_1, new IStrategoTerm[]{transform.const110});
    constFBOX47 = termFactory.makeAppl(transform._consFBOX_2, new IStrategoTerm[]{transform.constKW0, transform.constS64});
    const111 = termFactory.makeInt(80);
    const112 = termFactory.makeString("src");
    const113 = termFactory.makeString("generated");
    const114 = termFactory.makeString("w");
    constEjpTbl = new ImportTerm(termFactory, transform.class, "//", "ejp.tbl");
    const115 = termFactory.makeString("runtime");
    constId28 = termFactory.makeAppl(transform._consId_1, new IStrategoTerm[]{transform.const115});
    constCons44 = (IStrategoTerm)termFactory.makeListCons(transform.constId28, (IStrategoList)transform.constNil0);
    const116 = termFactory.makeString("ejps");
    constId29 = termFactory.makeAppl(transform._consId_1, new IStrategoTerm[]{transform.const116});
    constCons45 = (IStrategoTerm)termFactory.makeListCons(transform.constId29, (IStrategoList)transform.constCons44);
    constPackageName0 = termFactory.makeAppl(transform._consPackageName_1, new IStrategoTerm[]{transform.constCons45});
    constTypeImportOnDemandDec0 = termFactory.makeAppl(transform._consTypeImportOnDemandDec_1, new IStrategoTerm[]{transform.constPackageName0});
    constCons46 = (IStrategoTerm)termFactory.makeListCons(transform.constTypeImportOnDemandDec0, (IStrategoList)transform.constNil0);
    const117 = termFactory.makeString("Internal error: with clause failed unexpectedly in rule 'ejp-converter-compilation-unit'");
    const118 = termFactory.makeString("Internal error: with clause failed unexpectedly in rule 'check-for-change-in-aspect-or-class'");
    const119 = termFactory.makeString("Internal error: with clause failed unexpectedly in rule 'ejp-converter-aspect-or-class'");
  }

  @SuppressWarnings("all") public static class fetch_0_1 extends Strategy 
  { 
    public static fetch_0_1 instance = new fetch_0_1();

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm z_109)
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
              term = this.invoke(context, z_11, z_109);
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
                term = this.invoke(context, x_11, z_109);
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
                  term = this.invoke(context, term, z_109);
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
                    term = this.invoke(context, s_11, z_109);
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
                      term = this.invoke(context, p_11, z_109);
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
                    term = iset_add_0_1.instance.invoke(context, z_109, n_11);
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

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm ref_a_110, IStrategoTerm ref_b_110, IStrategoTerm ref_c_110, IStrategoTerm ref_d_110)
    { 
      ITermFactory termFactory = context.getFactory();
      TermReference a_110 = new TermReference(ref_a_110);
      TermReference b_110 = new TermReference(ref_b_110);
      TermReference c_110 = new TermReference(ref_c_110);
      TermReference d_110 = new TermReference(ref_d_110);
      context.push("ejp_to_java_0_4");
      Fail7:
      { 
        IStrategoTerm term5 = term;
        Success5:
        { 
          Fail8:
          { 
            IStrategoTerm p_20 = null;
            IStrategoTerm r_20 = null;
            IStrategoTerm v_20 = null;
            IStrategoTerm w_20 = null;
            IStrategoTerm a_21 = null;
            TermReference b_21 = new TermReference();
            IStrategoTerm c_21 = null;
            IStrategoTerm l_21 = null;
            IStrategoTerm o_21 = null;
            if(term.getTermType() != IStrategoTerm.APPL || transform._consClassDec_2 != ((IStrategoAppl)term).getConstructor())
              break Fail8;
            IStrategoTerm arg4 = term.getSubterm(0);
            if(arg4.getTermType() != IStrategoTerm.APPL || transform._consClassDecHead_5 != ((IStrategoAppl)arg4).getConstructor())
              break Fail8;
            p_20 = arg4.getSubterm(0);
            r_20 = arg4.getSubterm(1);
            v_20 = arg4.getSubterm(2);
            w_20 = arg4.getSubterm(3);
            a_21 = arg4.getSubterm(4);
            IStrategoTerm arg5 = term.getSubterm(1);
            if(arg5.getTermType() != IStrategoTerm.APPL || transform._consClassBody_1 != ((IStrategoAppl)arg5).getConstructor())
              break Fail8;
            c_21 = arg5.getSubterm(0);
            IStrategoTerm term6 = term;
            Success6:
            { 
              Fail9:
              { 
                IStrategoTerm p_21 = null;
                IStrategoTerm s_21 = null;
                IStrategoTerm k_22 = null;
                p_21 = term;
                term = r_20;
                if(term.getTermType() != IStrategoTerm.APPL || transform._consId_1 != ((IStrategoAppl)term).getConstructor())
                  break Fail9;
                s_21 = term.getSubterm(0);
                k_22 = s_21;
                term = string_starts_with_0_1.instance.invoke(context, k_22, transform.const1);
                if(term == null)
                  break Fail9;
                term = p_21;
                { 
                  term = termFactory.makeAppl(transform._consClassDecHead_5, new IStrategoTerm[]{p_20, r_20, v_20, w_20, a_21});
                  l_21 = term;
                  term = c_21;
                  lifted2 lifted210 = new lifted2();
                  lifted210.a_110 = a_110;
                  lifted210.b_110 = b_110;
                  lifted210.c_110 = c_110;
                  lifted210.d_110 = d_110;
                  term = SRTS_all.instance.invoke(context, term, lifted210);
                  if(term == null)
                    break Fail8;
                  term = termFactory.makeAppl(transform._consClassBody_1, new IStrategoTerm[]{term});
                  o_21 = term;
                  if(true)
                    break Success6;
                }
              }
              term = term6;
              term = random_string_0_0.instance.invoke(context, term);
              if(term == null)
                break Fail8;
              if(b_21.value == null)
                b_21.value = term;
              else
                if(b_21.value != term && !b_21.value.match(term))
                  break Fail8;
              if(b_21.value == null)
                break Fail8;
              term = termFactory.makeTuple((IStrategoTerm)termFactory.makeListCons(termFactory.makeAppl(transform._consSingleElemAnno_2, new IStrategoTerm[]{transform.constTypeName0, termFactory.makeAppl(transform._consLit_1, new IStrategoTerm[]{termFactory.makeAppl(transform._consDeci_1, new IStrategoTerm[]{b_21.value})})}), (IStrategoList)transform.constNil0), p_20);
              term = conc_0_0.instance.invoke(context, term);
              if(term == null)
                break Fail8;
              term = termFactory.makeAppl(transform._consClassDecHead_5, new IStrategoTerm[]{term, r_20, v_20, w_20, a_21});
              l_21 = term;
              term = c_21;
              lifted4 lifted410 = new lifted4();
              lifted410.a_110 = a_110;
              lifted410.b_21 = b_21;
              lifted410.c_110 = c_110;
              lifted410.d_110 = d_110;
              term = SRTS_all.instance.invoke(context, term, lifted410);
              if(term == null)
                break Fail8;
              term = termFactory.makeAppl(transform._consClassBody_1, new IStrategoTerm[]{term});
              o_21 = term;
            }
            term = termFactory.makeAppl(transform._consClassDec_2, new IStrategoTerm[]{l_21, o_21});
            if(true)
              break Success5;
          }
          term = term5;
          IStrategoTerm term7 = term;
          Success7:
          { 
            Fail10:
            { 
              IStrategoTerm m_17 = null;
              IStrategoTerm o_17 = null;
              IStrategoTerm p_17 = null;
              IStrategoTerm q_17 = null;
              IStrategoTerm r_17 = null;
              IStrategoTerm a_18 = null;
              TermReference b_18 = new TermReference();
              IStrategoTerm c_18 = null;
              IStrategoTerm d_18 = null;
              IStrategoTerm v_18 = null;
              if(term.getTermType() != IStrategoTerm.APPL || transform._consMethodDec_2 != ((IStrategoAppl)term).getConstructor())
                break Fail10;
              IStrategoTerm arg6 = term.getSubterm(0);
              if(arg6.getTermType() != IStrategoTerm.APPL || transform._consMethodDecHead_6 != ((IStrategoAppl)arg6).getConstructor())
                break Fail10;
              m_17 = arg6.getSubterm(0);
              o_17 = arg6.getSubterm(1);
              p_17 = arg6.getSubterm(2);
              q_17 = arg6.getSubterm(3);
              r_17 = arg6.getSubterm(4);
              a_18 = arg6.getSubterm(5);
              IStrategoTerm arg7 = term.getSubterm(1);
              if(arg7.getTermType() != IStrategoTerm.APPL || transform._consBlock_1 != ((IStrategoAppl)arg7).getConstructor())
                break Fail10;
              c_18 = arg7.getSubterm(0);
              term = r_17;
              lifted6 lifted610 = new lifted6();
              lifted610.a_110 = a_110;
              term = SRTS_all.instance.invoke(context, term, lifted610);
              if(term == null)
                break Fail10;
              IStrategoTerm term8 = term;
              Success8:
              { 
                Fail11:
                { 
                  IStrategoTerm w_18 = null;
                  w_18 = term;
                  term = fetch_1_0.instance.invoke(context, m_17, lifted8.instance);
                  if(term == null)
                    break Fail11;
                  term = w_18;
                  { 
                    term = termFactory.makeAppl(transform._consMethodDecHead_6, new IStrategoTerm[]{m_17, o_17, p_17, q_17, r_17, a_18});
                    d_18 = term;
                    lifted9 lifted90 = new lifted9();
                    lifted90.a_110 = a_110;
                    lifted90.b_110 = b_110;
                    lifted90.c_110 = c_110;
                    lifted90.d_110 = d_110;
                    term = allow_extends_1_1.instance.invoke(context, term, lifted90, c_18);
                    if(term == null)
                      break Fail10;
                    term = termFactory.makeAppl(transform._consBlock_1, new IStrategoTerm[]{term});
                    v_18 = term;
                    if(true)
                      break Success8;
                  }
                }
                term = term8;
                term = random_string_0_0.instance.invoke(context, term);
                if(term == null)
                  break Fail10;
                if(b_18.value == null)
                  b_18.value = term;
                else
                  if(b_18.value != term && !b_18.value.match(term))
                    break Fail10;
                if(b_18.value == null)
                  break Fail10;
                term = termFactory.makeTuple((IStrategoTerm)termFactory.makeListCons(termFactory.makeAppl(transform._consSingleElemAnno_2, new IStrategoTerm[]{transform.constTypeName1, termFactory.makeAppl(transform._consLit_1, new IStrategoTerm[]{termFactory.makeAppl(transform._consDeci_1, new IStrategoTerm[]{b_18.value})})}), (IStrategoList)transform.constNil0), m_17);
                term = conc_0_0.instance.invoke(context, term);
                if(term == null)
                  break Fail10;
                term = termFactory.makeAppl(transform._consMethodDecHead_6, new IStrategoTerm[]{term, o_17, p_17, q_17, r_17, a_18});
                d_18 = term;
                lifted10 lifted100 = new lifted10();
                lifted100.a_110 = a_110;
                lifted100.b_110 = b_110;
                lifted100.b_18 = b_18;
                lifted100.d_110 = d_110;
                term = allow_extends_1_1.instance.invoke(context, term, lifted100, c_18);
                if(term == null)
                  break Fail10;
                term = termFactory.makeAppl(transform._consBlock_1, new IStrategoTerm[]{term});
                v_18 = term;
              }
              term = termFactory.makeAppl(transform._consMethodDec_2, new IStrategoTerm[]{d_18, v_18});
              if(true)
                break Success7;
            }
            term = term7;
            IStrategoTerm term9 = term;
            Success9:
            { 
              Fail12:
              { 
                IStrategoTerm e_17 = null;
                if(term.getTermType() != IStrategoTerm.APPL || transform._consBlock_1 != ((IStrategoAppl)term).getConstructor())
                  break Fail12;
                e_17 = term.getSubterm(0);
                term = e_17;
                lifted11 lifted111 = new lifted11();
                lifted111.a_110 = a_110;
                lifted111.b_110 = b_110;
                lifted111.c_110 = c_110;
                lifted111.d_110 = d_110;
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
                  TermReference u_16 = new TermReference();
                  TermReference v_16 = new TermReference();
                  IStrategoTerm w_16 = null;
                  if(term.getTermType() != IStrategoTerm.APPL || transform._consLocalVarDecStm_1 != ((IStrategoAppl)term).getConstructor())
                    break Fail13;
                  IStrategoTerm arg12 = term.getSubterm(0);
                  if(arg12.getTermType() != IStrategoTerm.APPL || transform._consLocalVarDec_3 != ((IStrategoAppl)arg12).getConstructor())
                    break Fail13;
                  if(u_16.value == null)
                    u_16.value = arg12.getSubterm(0);
                  else
                    if(u_16.value != arg12.getSubterm(0) && !u_16.value.match(arg12.getSubterm(0)))
                      break Fail13;
                  if(v_16.value == null)
                    v_16.value = arg12.getSubterm(1);
                  else
                    if(v_16.value != arg12.getSubterm(1) && !v_16.value.match(arg12.getSubterm(1)))
                      break Fail13;
                  w_16 = arg12.getSubterm(2);
                  term = w_16;
                  lifted13 lifted130 = new lifted13();
                  lifted130.a_110 = a_110;
                  lifted130.u_16 = u_16;
                  lifted130.v_16 = v_16;
                  lifted130.b_110 = b_110;
                  lifted130.c_110 = c_110;
                  lifted130.d_110 = d_110;
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
                    TermReference z_15 = new TermReference();
                    IStrategoTerm c_16 = null;
                    if(term.getTermType() != IStrategoTerm.APPL || transform._consInstanceInit_1 != ((IStrategoAppl)term).getConstructor())
                      break Fail14;
                    IStrategoTerm arg13 = term.getSubterm(0);
                    if(arg13.getTermType() != IStrategoTerm.APPL || transform._consBlock_1 != ((IStrategoAppl)arg13).getConstructor())
                      break Fail14;
                    c_16 = arg13.getSubterm(0);
                    term = new_hashtable_0_0.instance.invoke(context, term);
                    if(term == null)
                      break Fail14;
                    if(z_15.value == null)
                      z_15.value = term;
                    else
                      if(z_15.value != term && !z_15.value.match(term))
                        break Fail14;
                    term = c_16;
                    lifted14 lifted140 = new lifted14();
                    lifted140.z_15 = z_15;
                    lifted140.d_110 = d_110;
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
                      TermReference f_15 = new TermReference();
                      IStrategoTerm g_15 = null;
                      if(term.getTermType() != IStrategoTerm.APPL || transform._consStaticInit_1 != ((IStrategoAppl)term).getConstructor())
                        break Fail15;
                      IStrategoTerm arg14 = term.getSubterm(0);
                      if(arg14.getTermType() != IStrategoTerm.APPL || transform._consBlock_1 != ((IStrategoAppl)arg14).getConstructor())
                        break Fail15;
                      g_15 = arg14.getSubterm(0);
                      term = new_hashtable_0_0.instance.invoke(context, term);
                      if(term == null)
                        break Fail15;
                      if(f_15.value == null)
                        f_15.value = term;
                      else
                        if(f_15.value != term && !f_15.value.match(term))
                          break Fail15;
                      term = g_15;
                      lifted16 lifted160 = new lifted16();
                      lifted160.f_15 = f_15;
                      lifted160.d_110 = d_110;
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
                          IStrategoTerm v_14 = null;
                          IStrategoTerm w_14 = null;
                          IStrategoTerm x_14 = null;
                          IStrategoTerm arg15 = term.getSubterm(0);
                          if(arg15.getTermType() != IStrategoTerm.APPL || transform._consAssign_2 != ((IStrategoAppl)arg15).getConstructor())
                            break Fail16;
                          v_14 = arg15.getSubterm(0);
                          IStrategoTerm arg16 = arg15.getSubterm(1);
                          if(arg16.getTermType() != IStrategoTerm.APPL || transform._consEJPCall_2 != ((IStrategoAppl)arg16).getConstructor())
                            break Fail16;
                          w_14 = arg16.getSubterm(0);
                          x_14 = arg16.getSubterm(1);
                          term = termFactory.makeAppl(transform._consEJPCall_2, new IStrategoTerm[]{w_14, x_14});
                          term = ejp_call_to_method_invokation_0_4.instance.invoke(context, term, a_110.value, b_110.value, c_110.value, d_110.value);
                          if(term == null)
                            break Fail16;
                          term = termFactory.makeAppl(transform._consExprStm_1, new IStrategoTerm[]{termFactory.makeAppl(transform._consAssign_2, new IStrategoTerm[]{v_14, term})});
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
                            IStrategoTerm l_14 = null;
                            IStrategoTerm m_14 = null;
                            IStrategoTerm arg17 = term.getSubterm(0);
                            if(arg17.getTermType() != IStrategoTerm.APPL || transform._consEJPCall_2 != ((IStrategoAppl)arg17).getConstructor())
                              break Fail17;
                            l_14 = arg17.getSubterm(0);
                            m_14 = arg17.getSubterm(1);
                            term = termFactory.makeAppl(transform._consEJPCall_2, new IStrategoTerm[]{l_14, m_14});
                            term = ejp_call_to_method_invokation_0_4.instance.invoke(context, term, a_110.value, b_110.value, c_110.value, d_110.value);
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
                              IStrategoTerm d_14 = null;
                              IStrategoTerm arg18 = term.getSubterm(0);
                              if(arg18.getTermType() != IStrategoTerm.APPL || transform._consScopedEJPCall_3 != ((IStrategoAppl)arg18).getConstructor())
                                break Fail18;
                              z_13 = arg18.getSubterm(0);
                              a_14 = arg18.getSubterm(1);
                              IStrategoTerm arg19 = arg18.getSubterm(2);
                              if(arg19.getTermType() != IStrategoTerm.APPL || transform._consBlock_1 != ((IStrategoAppl)arg19).getConstructor())
                                break Fail18;
                              b_14 = arg19.getSubterm(0);
                              IStrategoList annos0 = arg18.getAnnotations();
                              if(annos0.getTermType() != IStrategoTerm.LIST || ((IStrategoList)annos0).isEmpty())
                                break Fail18;
                              c_14 = ((IStrategoList)annos0).head();
                              IStrategoTerm arg20 = ((IStrategoList)annos0).tail();
                              if(arg20.getTermType() != IStrategoTerm.LIST || !((IStrategoList)arg20).isEmpty())
                                break Fail18;
                              term = create_method_invokation_0_1.instance.invoke(context, term, z_13);
                              if(term == null)
                                break Fail18;
                              d_14 = term;
                              term = termFactory.annotateTerm(termFactory.makeAppl(transform._consScopedEJPCall_3, new IStrategoTerm[]{z_13, a_14, termFactory.makeAppl(transform._consBlock_1, new IStrategoTerm[]{b_14})}), checkListAnnos(termFactory, (IStrategoTerm)termFactory.makeListCons(c_14, (IStrategoList)transform.constNil0)));
                              term = scoped_ejp_to_java_0_4.instance.invoke(context, term, a_110.value, b_110.value, c_110.value, d_110.value);
                              if(term == null)
                                break Fail18;
                              term = termFactory.makeTuple((IStrategoTerm)termFactory.makeListCons(termFactory.makeAppl(transform._consExprStm_1, new IStrategoTerm[]{d_14}), (IStrategoList)transform.constNil0), term);
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
                            IStrategoTerm arg21 = term.getSubterm(0);
                            if(arg21.getTermType() != IStrategoTerm.APPL || transform._consAssign_2 != ((IStrategoAppl)arg21).getConstructor())
                              break Fail7;
                            h_13 = arg21.getSubterm(0);
                            IStrategoTerm arg22 = arg21.getSubterm(1);
                            if(arg22.getTermType() != IStrategoTerm.APPL || transform._consScopedEJPCall_3 != ((IStrategoAppl)arg22).getConstructor())
                              break Fail7;
                            i_13 = arg22.getSubterm(0);
                            m_13 = arg22.getSubterm(1);
                            IStrategoTerm arg23 = arg22.getSubterm(2);
                            if(arg23.getTermType() != IStrategoTerm.APPL || transform._consBlock_1 != ((IStrategoAppl)arg23).getConstructor())
                              break Fail7;
                            n_13 = arg23.getSubterm(0);
                            term = create_method_invokation_0_1.instance.invoke(context, term, i_13);
                            if(term == null)
                              break Fail7;
                            o_13 = term;
                            term = termFactory.makeAppl(transform._consScopedEJPCall_3, new IStrategoTerm[]{i_13, m_13, termFactory.makeAppl(transform._consBlock_1, new IStrategoTerm[]{n_13})});
                            term = scoped_ejp_to_java_0_4.instance.invoke(context, term, a_110.value, b_110.value, c_110.value, d_110.value);
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

    public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm n_23, IStrategoTerm o_23, IStrategoTerm r_23, IStrategoTerm u_23, IStrategoTerm v_23, IStrategoTerm c_24)
    { 
      ITermFactory termFactory = context.getFactory();
      context.push("convert_one_var_dec_0_6");
      Fail19:
      { 
        IStrategoTerm d_24 = null;
        IStrategoTerm e_24 = null;
        if(term.getTermType() != IStrategoTerm.APPL || transform._consVarDec_2 != ((IStrategoAppl)term).getConstructor())
          break Fail19;
        d_24 = term.getSubterm(0);
        e_24 = term.getSubterm(1);
        term = termFactory.makeAppl(transform._consVarDec_2, new IStrategoTerm[]{d_24, transform.constNone0});
        term = add_local_var_0_2.instance.invoke(context, term, n_23, r_23);
        if(term == null)
          break Fail19;
        Success16:
        { 
          Fail20:
          { 
            IStrategoTerm f_24 = null;
            f_24 = term;
            term = or_2_0.instance.invoke(context, e_24, lifted18.instance, lifted19.instance);
            if(term == null)
              break Fail20;
            term = f_24;
            { 
              term = termFactory.makeAppl(transform._consVarDec_2, new IStrategoTerm[]{d_24, e_24});
              term = convert_var_dec_by_ejp_call_0_6.instance.invokeDynamic(context, term, NO_STRATEGIES, new IStrategoTerm[]{n_23, o_23, r_23, u_23, v_23, c_24});
              if(term == null)
                break Fail19;
              if(true)
                break Success16;
            }
          }
          term = (IStrategoTerm)termFactory.makeListCons(termFactory.makeAppl(transform._consLocalVarDecStm_1, new IStrategoTerm[]{termFactory.makeAppl(transform._consLocalVarDec_3, new IStrategoTerm[]{o_23, r_23, (IStrategoTerm)termFactory.makeListCons(termFactory.makeAppl(transform._consVarDec_2, new IStrategoTerm[]{d_24, e_24}), (IStrategoList)transform.constNil0)})}), (IStrategoList)transform.constNil0);
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

    public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm e_110, IStrategoTerm f_110, IStrategoTerm g_110, IStrategoTerm h_110, IStrategoTerm i_110, IStrategoTerm j_110)
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
              IStrategoTerm w_25 = null;
              IStrategoTerm z_25 = null;
              IStrategoTerm a_26 = null;
              w_25 = term.getSubterm(0);
              IStrategoTerm arg29 = term.getSubterm(1);
              if(arg29.getTermType() != IStrategoTerm.APPL || transform._consEJPCall_2 != ((IStrategoAppl)arg29).getConstructor())
                break Fail22;
              z_25 = arg29.getSubterm(0);
              a_26 = arg29.getSubterm(1);
              term = termFactory.makeAppl(transform._consEJPCall_2, new IStrategoTerm[]{z_25, a_26});
              term = ejp_call_to_method_invokation_0_4.instance.invoke(context, term, e_110, h_110, i_110, j_110);
              if(term == null)
                break Fail22;
              term = (IStrategoTerm)termFactory.makeListCons(termFactory.makeAppl(transform._consLocalVarDecStm_1, new IStrategoTerm[]{termFactory.makeAppl(transform._consLocalVarDec_3, new IStrategoTerm[]{f_110, g_110, (IStrategoTerm)termFactory.makeListCons(termFactory.makeAppl(transform._consVarDec_2, new IStrategoTerm[]{w_25, term}), (IStrategoList)transform.constNil0)})}), (IStrategoList)transform.constNil0);
              if(true)
                break Success17;
            }
            term = term17;
          }
          if(cons3 == transform._consVarDec_2)
          { 
            IStrategoTerm v_24 = null;
            IStrategoTerm w_24 = null;
            IStrategoTerm z_24 = null;
            IStrategoTerm c_25 = null;
            IStrategoTerm d_25 = null;
            v_24 = term.getSubterm(0);
            IStrategoTerm arg30 = term.getSubterm(1);
            if(arg30.getTermType() != IStrategoTerm.APPL || transform._consScopedEJPCall_3 != ((IStrategoAppl)arg30).getConstructor())
              break Fail21;
            w_24 = arg30.getSubterm(0);
            z_24 = arg30.getSubterm(1);
            IStrategoTerm arg31 = arg30.getSubterm(2);
            if(arg31.getTermType() != IStrategoTerm.APPL || transform._consBlock_1 != ((IStrategoAppl)arg31).getConstructor())
              break Fail21;
            c_25 = arg31.getSubterm(0);
            term = termFactory.makeAppl(transform._consEJPCall_2, new IStrategoTerm[]{w_24, z_24});
            term = ejp_call_to_method_invokation_0_4.instance.invoke(context, term, e_110, h_110, i_110, j_110);
            if(term == null)
              break Fail21;
            d_25 = term;
            term = termFactory.makeAppl(transform._consScopedEJPCall_3, new IStrategoTerm[]{w_24, z_24, termFactory.makeAppl(transform._consBlock_1, new IStrategoTerm[]{c_25})});
            term = scoped_ejp_to_java_0_4.instance.invoke(context, term, e_110, h_110, i_110, j_110);
            if(term == null)
              break Fail21;
            term = termFactory.makeTuple((IStrategoTerm)termFactory.makeListCons(termFactory.makeAppl(transform._consLocalVarDecStm_1, new IStrategoTerm[]{termFactory.makeAppl(transform._consLocalVarDec_3, new IStrategoTerm[]{f_110, g_110, (IStrategoTerm)termFactory.makeListCons(termFactory.makeAppl(transform._consVarDec_2, new IStrategoTerm[]{v_24, d_25}), (IStrategoList)transform.constNil0)})}), (IStrategoList)transform.constNil0), term);
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

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm ref_k_110)
    { 
      TermReference k_110 = new TermReference(ref_k_110);
      context.push("add_local_vars_0_1");
      Fail23:
      { 
        IStrategoTerm term18 = term;
        Success18:
        { 
          Fail24:
          { 
            IStrategoTerm j_26 = null;
            TermReference k_26 = new TermReference();
            IStrategoTerm l_26 = null;
            if(term.getTermType() != IStrategoTerm.APPL || transform._consLocalVarDecStm_1 != ((IStrategoAppl)term).getConstructor())
              break Fail24;
            IStrategoTerm arg32 = term.getSubterm(0);
            if(arg32.getTermType() != IStrategoTerm.APPL || transform._consLocalVarDec_3 != ((IStrategoAppl)arg32).getConstructor())
              break Fail24;
            if(k_26.value == null)
              k_26.value = arg32.getSubterm(1);
            else
              if(k_26.value != arg32.getSubterm(1) && !k_26.value.match(arg32.getSubterm(1)))
                break Fail24;
            j_26 = arg32.getSubterm(2);
            l_26 = term;
            term = j_26;
            lifted20 lifted200 = new lifted20();
            lifted200.k_110 = k_110;
            lifted200.k_26 = k_26;
            term = SRTS_all.instance.invoke(context, term, lifted200);
            if(term == null)
              break Fail24;
            term = l_26;
            if(true)
              break Success18;
          }
          term = term18;
          TermReference e_26 = new TermReference();
          IStrategoTerm f_26 = null;
          lifted25 lifted250 = new lifted25();
          lifted22 lifted220 = new lifted22();
          lifted250.e_26 = e_26;
          lifted220.e_26 = e_26;
          term = or_2_0.instance.invoke(context, term, lifted220, lifted250);
          if(term == null)
            break Fail23;
          f_26 = term;
          if(e_26.value == null)
            break Fail23;
          term = e_26.value;
          lifted26 lifted260 = new lifted26();
          lifted260.k_110 = k_110;
          term = SRTS_all.instance.invoke(context, term, lifted260);
          if(term == null)
            break Fail23;
          term = f_26;
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

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm o_26, IStrategoTerm p_26)
    { 
      context.push("add_local_var_0_2");
      Fail25:
      { 
        TermReference s_26 = new TermReference();
        IStrategoTerm u_26 = null;
        lifted29 lifted290 = new lifted29();
        lifted28 lifted280 = new lifted28();
        lifted290.s_26 = s_26;
        lifted280.s_26 = s_26;
        term = or_2_0.instance.invoke(context, term, lifted280, lifted290);
        if(term == null)
          break Fail25;
        u_26 = term;
        term = hashtable_remove_0_1.instance.invoke(context, o_26, s_26.value);
        if(term == null)
          break Fail25;
        term = hashtable_put_0_2.instance.invoke(context, o_26, s_26.value, p_26);
        if(term == null)
          break Fail25;
        term = u_26;
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

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm x_26)
    { 
      context.push("process_method_param_0_1");
      Fail26:
      { 
        TermReference c_27 = new TermReference();
        TermReference h_27 = new TermReference();
        IStrategoTerm l_27 = null;
        lifted31 lifted311 = new lifted31();
        lifted30 lifted300 = new lifted30();
        lifted311.h_27 = h_27;
        lifted311.c_27 = c_27;
        lifted300.h_27 = h_27;
        lifted300.c_27 = c_27;
        term = or_2_0.instance.invoke(context, term, lifted300, lifted311);
        if(term == null)
          break Fail26;
        l_27 = term;
        term = hashtable_put_0_2.instance.invoke(context, x_26, c_27.value, h_27.value);
        if(term == null)
          break Fail26;
        term = l_27;
        context.popOnSuccess();
        if(true)
          return term;
      }
      context.popOnFailure();
      return null;
    }
  }

  @SuppressWarnings("all") public static class gen_auxilery_class_0_6 extends Strategy 
  { 
    public static gen_auxilery_class_0_6 instance = new gen_auxilery_class_0_6();

    public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm o_27, IStrategoTerm p_27, IStrategoTerm r_27, IStrategoTerm t_27, IStrategoTerm u_27, IStrategoTerm w_27)
    { 
      ITermFactory termFactory = context.getFactory();
      context.push("gen_auxilery_class_0_6");
      Fail27:
      { 
        IStrategoTerm b_28 = null;
        IStrategoTerm i_28 = null;
        IStrategoTerm j_28 = null;
        IStrategoTerm k_28 = null;
        b_28 = term;
        term = r_27;
        if(term.getTermType() != IStrategoTerm.APPL || transform._consExplicitJoinPoint_3 != ((IStrategoAppl)term).getConstructor())
          break Fail27;
        term = gen_compact_var_declaration_0_2.instance.invoke(context, term, o_27, p_27);
        if(term == null)
          break Fail27;
        i_28 = term;
        term = gen_method_annotation_0_0.instance.invoke(context, r_27);
        if(term == null)
          break Fail27;
        j_28 = term;
        term = debug_0_0.instance.invoke(context, w_27);
        if(term == null)
          break Fail27;
        term = gen_source_location_ann_0_0.instance.invoke(context, term);
        if(term == null)
          break Fail27;
        k_28 = term;
        term = gen__ejpscope__method__name_0_0.instance.invoke(context, r_27);
        if(term == null)
          break Fail27;
        term = (IStrategoTerm)termFactory.makeListCons(i_28, termFactory.makeListCons((IStrategoTerm)termFactory.makeListCons(termFactory.makeAppl(transform._consMethodDec_2, new IStrategoTerm[]{termFactory.makeAppl(transform._consMethodDecHead_6, new IStrategoTerm[]{(IStrategoTerm)termFactory.makeListCons(termFactory.makeAppl(transform._consSingleElemAnno_2, new IStrategoTerm[]{transform.constTypeName1, termFactory.makeAppl(transform._consLit_1, new IStrategoTerm[]{termFactory.makeAppl(transform._consDeci_1, new IStrategoTerm[]{u_27})})}), termFactory.makeListCons(j_28, termFactory.makeListCons(k_28, (IStrategoList)transform.constNil0))), transform.constNone0, transform.constVoid0, termFactory.makeAppl(transform._consId_1, new IStrategoTerm[]{term}), transform.constNil0, transform.constNone0}), termFactory.makeAppl(transform._consBlock_1, new IStrategoTerm[]{b_28})}), (IStrategoList)transform.constNil0), (IStrategoList)transform.constNil0));
        term = concat_0_0.instance.invoke(context, term);
        if(term == null)
          break Fail27;
        term = termFactory.makeAppl(transform._consClassDec_2, new IStrategoTerm[]{termFactory.makeAppl(transform._consClassDecHead_5, new IStrategoTerm[]{transform.constNil0, termFactory.makeAppl(transform._consId_1, new IStrategoTerm[]{t_27}), transform.constNone0, transform.constNone0, transform.constNone0}), termFactory.makeAppl(transform._consClassBody_1, new IStrategoTerm[]{term})});
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

  @SuppressWarnings("all") public static class gen_source_location_ann_0_0 extends Strategy 
  { 
    public static gen_source_location_ann_0_0 instance = new gen_source_location_ann_0_0();

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      ITermFactory termFactory = context.getFactory();
      context.push("gen_source_location_ann_0_0");
      Fail28:
      { 
        IStrategoTerm x_28 = null;
        x_28 = term;
        term = original_location_0_0.instance.invoke(context, x_28);
        if(term == null)
          break Fail28;
        term = original_line_0_0.instance.invoke(context, term);
        if(term == null)
          break Fail28;
        term = int_to_string_0_0.instance.invoke(context, term);
        if(term == null)
          break Fail28;
        term = termFactory.makeAppl(transform._consAnno_2, new IStrategoTerm[]{transform.constTypeName2, (IStrategoTerm)termFactory.makeListCons(transform.constElemValPair0, termFactory.makeListCons(termFactory.makeAppl(transform._consElemValPair_2, new IStrategoTerm[]{transform.constId3, termFactory.makeAppl(transform._consLit_1, new IStrategoTerm[]{termFactory.makeAppl(transform._consDeci_1, new IStrategoTerm[]{term})})}), (IStrategoList)transform.constNil0))});
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
      context.push("original_location_0_0");
      Fail29:
      { 
        IStrategoTerm term19 = term;
        Success19:
        { 
          Fail30:
          { 
            IStrategoTerm k_29 = null;
            IStrategoList annos1 = term.getAnnotations();
            if(annos1.getTermType() != IStrategoTerm.LIST || ((IStrategoList)annos1).isEmpty())
              break Fail30;
            k_29 = ((IStrategoList)annos1).head();
            IStrategoTerm arg56 = ((IStrategoList)annos1).tail();
            if(arg56.getTermType() != IStrategoTerm.LIST || !((IStrategoList)arg56).isEmpty())
              break Fail30;
            term = debug_0_0.instance.invoke(context, k_29);
            if(term == null)
              break Fail30;
            if(true)
              break Success19;
          }
          term = term19;
          IStrategoTerm f_29 = null;
          f_29 = term;
          term = context.invokePrimitive("SSL_EXT_origin_location", f_29, NO_STRATEGIES, new IStrategoTerm[]{term});
          if(term == null)
            break Fail29;
        }
        context.popOnSuccess();
        if(true)
          return term;
      }
      context.popOnFailure();
      return null;
    }
  }

  @SuppressWarnings("all") public static class original_line_0_0 extends Strategy 
  { 
    public static original_line_0_0 instance = new original_line_0_0();

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      Fail31:
      { 
        IStrategoTerm l_29 = null;
        if(term.getTermType() != IStrategoTerm.TUPLE || term.getSubtermCount() != 4)
          break Fail31;
        l_29 = term.getSubterm(0);
        term = l_29;
        if(true)
          return term;
      }
      context.push("original_line_0_0");
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
      Fail32:
      { 
        IStrategoTerm m_29 = null;
        IStrategoTerm n_29 = null;
        IStrategoTerm o_29 = null;
        IStrategoTerm p_29 = null;
        if(term.getTermType() != IStrategoTerm.APPL || transform._consExplicitJoinPoint_3 != ((IStrategoAppl)term).getConstructor())
          break Fail32;
        n_29 = term.getSubterm(0);
        IStrategoTerm arg60 = term.getSubterm(1);
        if(arg60.getTermType() != IStrategoTerm.APPL || transform._consId_1 != ((IStrategoAppl)arg60).getConstructor())
          break Fail32;
        o_29 = arg60.getSubterm(0);
        m_29 = term.getSubterm(2);
        term = map_1_0.instance.invoke(context, m_29, fetch_type_0_0.instance);
        if(term == null)
          break Fail32;
        p_29 = term;
        term = pp_aspectj_string_0_0.instance.invoke(context, n_29);
        if(term == null)
          break Fail32;
        term = termFactory.makeAppl(transform._consAnno_2, new IStrategoTerm[]{transform.constTypeName3, (IStrategoTerm)termFactory.makeListCons(termFactory.makeAppl(transform._consElemValPair_2, new IStrategoTerm[]{transform.constId8, termFactory.makeAppl(transform._consElemValArrayInit_1, new IStrategoTerm[]{p_29})}), termFactory.makeListCons(termFactory.makeAppl(transform._consElemValPair_2, new IStrategoTerm[]{transform.constId7, termFactory.makeAppl(transform._consLit_1, new IStrategoTerm[]{termFactory.makeAppl(transform._consString_1, new IStrategoTerm[]{(IStrategoTerm)termFactory.makeListCons(termFactory.makeAppl(transform._consChars_1, new IStrategoTerm[]{term}), (IStrategoList)transform.constNil0)})})}), termFactory.makeListCons(termFactory.makeAppl(transform._consElemValPair_2, new IStrategoTerm[]{transform.constId6, termFactory.makeAppl(transform._consLit_1, new IStrategoTerm[]{termFactory.makeAppl(transform._consString_1, new IStrategoTerm[]{(IStrategoTerm)termFactory.makeListCons(termFactory.makeAppl(transform._consChars_1, new IStrategoTerm[]{o_29}), (IStrategoList)transform.constNil0)})})}), (IStrategoList)transform.constNil0)))});
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

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm t_29, IStrategoTerm ref_u_29)
    { 
      TermReference u_29 = new TermReference(ref_u_29);
      context.push("gen_compact_var_declaration_0_2");
      Fail33:
      { 
        TermReference v_29 = new TermReference();
        term = new_hashtable_0_0.instance.invoke(context, term);
        if(term == null)
          break Fail33;
        if(v_29.value == null)
          v_29.value = term;
        else
          if(v_29.value != term && !v_29.value.match(term))
            break Fail33;
        term = iset_elements_0_0.instance.invoke(context, t_29);
        if(term == null)
          break Fail33;
        lifted33 lifted330 = new lifted33();
        lifted330.v_29 = v_29;
        lifted330.u_29 = u_29;
        term = map_1_0.instance.invoke(context, term, lifted330);
        if(term == null)
          break Fail33;
        if(v_29.value == null)
          break Fail33;
        term = hashtable_keys_0_0.instance.invoke(context, v_29.value);
        if(term == null)
          break Fail33;
        lifted34 lifted340 = new lifted34();
        lifted340.v_29 = v_29;
        term = map_1_0.instance.invoke(context, term, lifted340);
        if(term == null)
          break Fail33;
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

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm k_30, IStrategoTerm ref_l_30)
    { 
      TermReference l_30 = new TermReference(ref_l_30);
      context.push("gen_before_call_assignments_0_2");
      Fail34:
      { 
        term = iset_elements_0_0.instance.invoke(context, k_30);
        if(term == null)
          break Fail34;
        lifted36 lifted360 = new lifted36();
        lifted360.l_30 = l_30;
        term = map_1_0.instance.invoke(context, term, lifted360);
        if(term == null)
          break Fail34;
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

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm s_33, IStrategoTerm ref_t_33)
    { 
      TermReference t_33 = new TermReference(ref_t_33);
      context.push("gen_after_call_simple_assignments_0_2");
      Fail35:
      { 
        term = iset_elements_0_0.instance.invoke(context, s_33);
        if(term == null)
          break Fail35;
        lifted37 lifted370 = new lifted37();
        lifted370.t_33 = t_33;
        term = map_1_0.instance.invoke(context, term, lifted370);
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

  @SuppressWarnings("all") public static class gen_after_call_assignments_with_declarations_0_2 extends Strategy 
  { 
    public static gen_after_call_assignments_with_declarations_0_2 instance = new gen_after_call_assignments_with_declarations_0_2();

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm ref_v_33, IStrategoTerm ref_w_33)
    { 
      TermReference v_33 = new TermReference(ref_v_33);
      TermReference w_33 = new TermReference(ref_w_33);
      context.push("gen_after_call_assignments_with_declarations_0_2");
      Fail36:
      { 
        if(v_33.value == null)
          break Fail36;
        term = hashtable_keys_0_0.instance.invoke(context, v_33.value);
        if(term == null)
          break Fail36;
        lifted38 lifted380 = new lifted38();
        lifted380.v_33 = v_33;
        lifted380.w_33 = w_33;
        term = map_1_0.instance.invoke(context, term, lifted380);
        if(term == null)
          break Fail36;
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

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm a_34, IStrategoTerm b_34)
    { 
      ITermFactory termFactory = context.getFactory();
      context.push("create_method_invokation_0_2");
      Fail37:
      { 
        term = b_34;
        if(term.getTermType() != IStrategoTerm.APPL || transform._consExplicitJoinPoint_3 != ((IStrategoAppl)term).getConstructor())
          break Fail37;
        term = gen__ejpscope__method__name_0_0.instance.invoke(context, b_34);
        if(term == null)
          break Fail37;
        term = termFactory.makeAppl(transform._consInvoke_2, new IStrategoTerm[]{termFactory.makeAppl(transform._consMethod_1, new IStrategoTerm[]{termFactory.makeAppl(transform._consMethodName_2, new IStrategoTerm[]{termFactory.makeAppl(transform._consAmbName_1, new IStrategoTerm[]{termFactory.makeAppl(transform._consId_1, new IStrategoTerm[]{a_34})}), termFactory.makeAppl(transform._consId_1, new IStrategoTerm[]{term})})}), transform.constNil0});
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

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm e_34)
    { 
      ITermFactory termFactory = context.getFactory();
      context.push("create_method_invokation_0_1");
      Fail38:
      { 
        IStrategoTerm f_34 = null;
        IStrategoTerm g_34 = null;
        IStrategoTerm h_34 = null;
        term = e_34;
        if(term.getTermType() != IStrategoTerm.APPL || transform._consExplicitJoinPoint_3 != ((IStrategoAppl)term).getConstructor())
          break Fail38;
        f_34 = term.getSubterm(0);
        g_34 = term.getSubterm(1);
        h_34 = term.getSubterm(2);
        term = typename__2__ambname_0_0.instance.invoke(context, f_34);
        if(term == null)
          break Fail38;
        term = termFactory.makeAppl(transform._consInvoke_2, new IStrategoTerm[]{termFactory.makeAppl(transform._consMethod_1, new IStrategoTerm[]{termFactory.makeAppl(transform._consMethodName_2, new IStrategoTerm[]{term, g_34})}), h_34});
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
      Fail39:
      { 
        IStrategoTerm k_34 = null;
        k_34 = term;
        term = allow_extends_1_1.instance.invoke(context, term, remove_vars_decs_from_local_var_dec_stm_0_0.instance, k_34);
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

  @SuppressWarnings("all") public static class ejp_call_to_method_invokation_0_4 extends Strategy 
  { 
    public static ejp_call_to_method_invokation_0_4 instance = new ejp_call_to_method_invokation_0_4();

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm r_34, IStrategoTerm ref_s_34, IStrategoTerm ref_t_34, IStrategoTerm ref_u_34)
    { 
      ITermFactory termFactory = context.getFactory();
      TermReference s_34 = new TermReference(ref_s_34);
      TermReference t_34 = new TermReference(ref_t_34);
      TermReference u_34 = new TermReference(ref_u_34);
      context.push("ejp_call_to_method_invokation_0_4");
      Fail40:
      { 
        TermReference v_34 = new TermReference();
        IStrategoTerm w_34 = null;
        TermReference y_34 = new TermReference();
        IStrategoTerm z_34 = null;
        IStrategoTerm c_35 = null;
        if(term.getTermType() != IStrategoTerm.APPL || transform._consEJPCall_2 != ((IStrategoAppl)term).getConstructor())
          break Fail40;
        if(y_34.value == null)
          y_34.value = term.getSubterm(0);
        else
          if(y_34.value != term.getSubterm(0) && !y_34.value.match(term.getSubterm(0)))
            break Fail40;
        w_34 = term.getSubterm(1);
        c_35 = term;
        IStrategoTerm term20 = term;
        Success20:
        { 
          Fail41:
          { 
            term = random_string_0_0.instance.invoke(context, term);
            if(term == null)
              break Fail41;
            if(v_34.value == null)
              v_34.value = term;
            else
              if(v_34.value != term && !v_34.value.match(term))
                break Fail41;
            term = w_34;
            lifted40 lifted400 = new lifted40();
            lifted400.s_34 = s_34;
            lifted400.t_34 = t_34;
            lifted400.v_34 = v_34;
            term = topdown_1_0.instance.invoke(context, term, lifted400);
            if(term == null)
              break Fail41;
            term = termFactory.makeAppl(transform._consSome_1, new IStrategoTerm[]{term});
            lifted42 lifted420 = new lifted42();
            lifted420.u_34 = u_34;
            lifted420.y_34 = y_34;
            term = try_1_0.instance.invoke(context, term, lifted420);
            if(term == null)
              break Fail41;
            term = create_method_invokation_0_1.instance.invoke(context, term, y_34.value);
            if(term == null)
              break Fail41;
            z_34 = term;
            if(true)
              break Success20;
          }
          term = term20;
          IStrategoTerm a_35 = null;
          IStrategoTerm b_35 = null;
          IStrategoTerm i_35 = null;
          a_35 = term;
          term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
          if(term == null)
            break Fail40;
          b_35 = term;
          i_35 = a_35;
          term = report_with_failure_0_2.instance.invoke(context, i_35, transform.const11, b_35);
          if(term == null)
            break Fail40;
        }
        term = c_35;
        if(z_34 == null)
          break Fail40;
        term = z_34;
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

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm l_35, IStrategoTerm ref_m_35, IStrategoTerm ref_n_35, IStrategoTerm ref_o_35)
    { 
      ITermFactory termFactory = context.getFactory();
      TermReference m_35 = new TermReference(ref_m_35);
      TermReference n_35 = new TermReference(ref_n_35);
      TermReference o_35 = new TermReference(ref_o_35);
      context.push("scoped_ejp_to_java_0_4");
      Fail42:
      { 
        IStrategoTerm p_35 = null;
        IStrategoTerm v_35 = null;
        IStrategoTerm w_35 = null;
        IStrategoTerm x_35 = null;
        TermReference y_35 = new TermReference();
        IStrategoTerm z_35 = null;
        IStrategoTerm b_36 = null;
        IStrategoTerm c_36 = null;
        IStrategoTerm e_36 = null;
        IStrategoTerm f_36 = null;
        IStrategoTerm g_36 = null;
        IStrategoTerm h_36 = null;
        TermReference i_36 = new TermReference();
        IStrategoTerm j_36 = null;
        IStrategoTerm k_36 = null;
        TermReference l_36 = new TermReference();
        IStrategoTerm m_36 = null;
        IStrategoTerm p_36 = null;
        IStrategoTerm z_37 = null;
        IStrategoTerm a_38 = null;
        IStrategoTerm b_38 = null;
        IStrategoTerm c_38 = null;
        if(term.getTermType() != IStrategoTerm.APPL || transform._consScopedEJPCall_3 != ((IStrategoAppl)term).getConstructor())
          break Fail42;
        if(l_36.value == null)
          l_36.value = term.getSubterm(0);
        else
          if(l_36.value != term.getSubterm(0) && !l_36.value.match(term.getSubterm(0)))
            break Fail42;
        p_35 = term.getSubterm(1);
        IStrategoTerm arg64 = term.getSubterm(2);
        if(arg64.getTermType() != IStrategoTerm.APPL || transform._consBlock_1 != ((IStrategoAppl)arg64).getConstructor())
          break Fail42;
        w_35 = arg64.getSubterm(0);
        p_36 = term;
        IStrategoTerm term21 = term;
        Success21:
        { 
          Fail43:
          { 
            IStrategoTerm y_36 = null;
            IStrategoTerm z_36 = null;
            IStrategoTerm c_37 = null;
            IStrategoTerm e_37 = null;
            IStrategoTerm h_37 = null;
            IStrategoTerm j_37 = null;
            IStrategoTerm k_37 = null;
            IStrategoTerm s_37 = null;
            z_35 = term;
            term = random_string_0_0.instance.invoke(context, term);
            if(term == null)
              break Fail43;
            if(y_35.value == null)
              y_35.value = term;
            else
              if(y_35.value != term && !y_35.value.match(term))
                break Fail43;
            term = p_35;
            lifted43 lifted430 = new lifted43();
            lifted430.m_35 = m_35;
            lifted430.n_35 = n_35;
            lifted430.y_35 = y_35;
            term = topdown_1_0.instance.invoke(context, term, lifted430);
            if(term == null)
              break Fail43;
            lifted45 lifted450 = new lifted45();
            lifted450.o_35 = o_35;
            lifted450.l_36 = l_36;
            term = try_1_0.instance.invoke(context, term, lifted450);
            if(term == null)
              break Fail43;
            term = get_vars_in_block_0_0.instance.invoke(context, w_35);
            if(term == null)
              break Fail43;
            v_35 = term;
            term = get_inner_scoped_vars_0_0.instance.invoke(context, w_35);
            if(term == null)
              break Fail43;
            if(i_36.value == null)
              i_36.value = term;
            else
              if(i_36.value != term && !i_36.value.match(term))
                break Fail43;
            term = new_iset_0_0.instance.invoke(context, term);
            if(term == null)
              break Fail43;
            y_36 = term;
            term = hashtable_keys_0_0.instance.invoke(context, l_35);
            if(term == null)
              break Fail43;
            term = iset_addlist_0_1.instance.invoke(context, y_36, term);
            if(term == null)
              break Fail43;
            term = iset_isect_0_1.instance.invoke(context, term, v_35);
            if(term == null)
              break Fail43;
            h_36 = term;
            term = new_iset_0_0.instance.invoke(context, term);
            if(term == null)
              break Fail43;
            z_36 = term;
            x_35 = term;
            c_37 = z_36;
            term = iset_elements_0_0.instance.invoke(context, h_36);
            if(term == null)
              break Fail43;
            term = iset_addlist_0_1.instance.invoke(context, c_37, term);
            if(term == null)
              break Fail43;
            term = x_35;
            e_37 = x_35;
            if(i_36.value == null)
              break Fail43;
            term = hashtable_keys_0_0.instance.invoke(context, i_36.value);
            if(term == null)
              break Fail43;
            term = iset_addlist_0_1.instance.invoke(context, e_37, term);
            if(term == null)
              break Fail43;
            term = gen_auxilary_class_name_0_0.instance.invoke(context, term);
            if(term == null)
              break Fail43;
            c_36 = term;
            term = my_hashtable_union_0_1.instance.invoke(context, l_35, i_36.value);
            if(term == null)
              break Fail43;
            k_37 = term;
            term = remove_scoped_ejp_var_decs_0_0.instance.invoke(context, w_35);
            if(term == null)
              break Fail43;
            j_37 = term;
            term = k_37;
            lifted46 lifted460 = new lifted46();
            lifted460.i_36 = i_36;
            lifted460.m_35 = m_35;
            lifted460.n_35 = n_35;
            lifted460.o_35 = o_35;
            term = allow_extends_1_1.instance.invoke(context, term, lifted460, j_37);
            if(term == null)
              break Fail43;
            h_37 = term;
            term = gen_auxilery_class_0_6.instance.invokeDynamic(context, h_37, NO_STRATEGIES, new IStrategoTerm[]{x_35, l_35, l_36.value, c_36, y_35.value, z_35});
            if(term == null)
              break Fail43;
            b_36 = term;
            term = (IStrategoTerm)termFactory.makeListCons(c_36, (IStrategoList)transform.constCons1);
            term = concat_strings_0_0.instance.invoke(context, term);
            if(term == null)
              break Fail43;
            k_36 = term;
            term = termFactory.makeAppl(transform._consLocalVarDecStm_1, new IStrategoTerm[]{termFactory.makeAppl(transform._consLocalVarDec_3, new IStrategoTerm[]{transform.constCons2, termFactory.makeAppl(transform._consClassOrInterfaceType_2, new IStrategoTerm[]{termFactory.makeAppl(transform._consTypeName_1, new IStrategoTerm[]{termFactory.makeAppl(transform._consId_1, new IStrategoTerm[]{c_36})}), transform.constNone0}), (IStrategoTerm)termFactory.makeListCons(termFactory.makeAppl(transform._consVarDec_2, new IStrategoTerm[]{termFactory.makeAppl(transform._consId_1, new IStrategoTerm[]{term}), termFactory.makeAppl(transform._consNewInstance_4, new IStrategoTerm[]{transform.constNone0, termFactory.makeAppl(transform._consClassOrInterfaceType_2, new IStrategoTerm[]{termFactory.makeAppl(transform._consTypeName_1, new IStrategoTerm[]{termFactory.makeAppl(transform._consId_1, new IStrategoTerm[]{c_36})}), transform.constNone0}), transform.constNil0, transform.constNone0})}), (IStrategoList)transform.constNil0)})});
            e_36 = term;
            term = gen_before_call_assignments_0_2.instance.invoke(context, term, h_36, k_36);
            if(term == null)
              break Fail43;
            f_36 = term;
            term = gen_after_call_simple_assignments_0_2.instance.invoke(context, term, h_36, k_36);
            if(term == null)
              break Fail43;
            g_36 = term;
            s_37 = term;
            if(i_36.value == null)
              break Fail43;
            term = my_hashtable_remove_0_1.instance.invoke(context, i_36.value, h_36);
            if(term == null)
              break Fail43;
            term = gen_after_call_assignments_with_declarations_0_2.instance.invoke(context, s_37, term, k_36);
            if(term == null)
              break Fail43;
            j_36 = term;
            term = create_method_invokation_0_2.instance.invoke(context, term, k_36, l_36.value);
            if(term == null)
              break Fail43;
            m_36 = term;
            if(true)
              break Success21;
          }
          term = term21;
          IStrategoTerm n_36 = null;
          IStrategoTerm o_36 = null;
          IStrategoTerm y_37 = null;
          n_36 = term;
          term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
          if(term == null)
            break Fail42;
          o_36 = term;
          y_37 = n_36;
          term = report_with_failure_0_2.instance.invoke(context, y_37, transform.const13, o_36);
          if(term == null)
            break Fail42;
        }
        term = p_36;
        a_38 = p_36;
        c_38 = term;
        if(g_36 == null || j_36 == null)
          break Fail42;
        term = termFactory.makeTuple(g_36, termFactory.annotateTerm(j_36, checkListAnnos(termFactory, transform.constNil0)));
        term = make$Conc_0_0.instance.invoke(context, term);
        if(term == null)
          break Fail42;
        b_38 = term;
        term = c_38;
        if(f_36 == null || m_36 == null)
          break Fail42;
        IStrategoList list0;
        list0 = checkListTail(b_38);
        if(list0 == null)
          break Fail42;
        term = termFactory.makeTuple(f_36, (IStrategoTerm)termFactory.makeListCons(termFactory.makeAppl(transform._consExprStm_1, new IStrategoTerm[]{m_36}), list0));
        term = make$Conc_0_0.instance.invoke(context, term);
        if(term == null)
          break Fail42;
        z_37 = term;
        term = a_38;
        if(b_36 == null || e_36 == null)
          break Fail42;
        IStrategoList list1;
        list1 = checkListTail(z_37);
        if(list1 == null)
          break Fail42;
        term = (IStrategoTerm)termFactory.makeListCons(termFactory.makeAppl(transform._consClassDecStm_1, new IStrategoTerm[]{b_36}), termFactory.makeListCons(e_36, list1));
        context.popOnSuccess();
        if(true)
          return term;
      }
      context.popOnFailure();
      return null;
    }
  }

  @SuppressWarnings("all") public static class get_vars_in_block_0_0 extends Strategy 
  { 
    public static get_vars_in_block_0_0 instance = new get_vars_in_block_0_0();

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      context.push("get_vars_in_block_0_0");
      Fail44:
      { 
        IStrategoTerm d_38 = null;
        TermReference e_38 = new TermReference();
        d_38 = term;
        term = new_iset_0_0.instance.invoke(context, term);
        if(term == null)
          break Fail44;
        if(e_38.value == null)
          e_38.value = term;
        else
          if(e_38.value != term && !e_38.value.match(term))
            break Fail44;
        term = d_38;
        lifted47 lifted470 = new lifted47();
        lifted470.e_38 = e_38;
        term = topdown_1_0.instance.invoke(context, term, lifted470);
        if(term == null)
          break Fail44;
        if(e_38.value == null)
          break Fail44;
        term = e_38.value;
        context.popOnSuccess();
        if(true)
          return term;
      }
      context.popOnFailure();
      return null;
    }
  }

  @SuppressWarnings("all") public static class get_inner_scoped_vars_0_0 extends Strategy 
  { 
    public static get_inner_scoped_vars_0_0 instance = new get_inner_scoped_vars_0_0();

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      context.push("get_inner_scoped_vars_0_0");
      Fail45:
      { 
        IStrategoTerm j_38 = null;
        TermReference k_38 = new TermReference();
        j_38 = term;
        term = new_hashtable_0_0.instance.invoke(context, term);
        if(term == null)
          break Fail45;
        if(k_38.value == null)
          k_38.value = term;
        else
          if(k_38.value != term && !k_38.value.match(term))
            break Fail45;
        term = j_38;
        lifted49 lifted490 = new lifted49();
        lifted490.k_38 = k_38;
        term = SRTS_all.instance.invoke(context, term, lifted490);
        if(term == null)
          break Fail45;
        if(k_38.value == null)
          break Fail45;
        term = k_38.value;
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

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm ref_p_38, IStrategoTerm ref_q_38)
    { 
      TermReference p_38 = new TermReference(ref_p_38);
      TermReference q_38 = new TermReference(ref_q_38);
      context.push("handle_pointcutargs_0_2");
      Fail46:
      { 
        IStrategoTerm r_38 = null;
        if(term.getTermType() != IStrategoTerm.APPL || transform._consSome_1 != ((IStrategoAppl)term).getConstructor())
          break Fail46;
        IStrategoTerm arg65 = term.getSubterm(0);
        if(arg65.getTermType() != IStrategoTerm.APPL || transform._consPointcutargs_1 != ((IStrategoAppl)arg65).getConstructor())
          break Fail46;
        r_38 = arg65.getSubterm(0);
        term = r_38;
        lifted51 lifted511 = new lifted51();
        lifted511.q_38 = q_38;
        term = map_1_0.instance.invoke(context, term, lifted511);
        if(term == null)
          break Fail46;
        lifted52 lifted520 = new lifted52();
        lifted520.p_38 = p_38;
        term = map_1_0.instance.invoke(context, term, lifted520);
        if(term == null)
          break Fail46;
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

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm u_38)
    { 
      ITermFactory termFactory = context.getFactory();
      context.push("handle_pointcutarg_helper_0_1");
      Fail47:
      { 
        IStrategoTerm w_38 = null;
        IStrategoTerm x_38 = null;
        IStrategoTerm y_38 = null;
        IStrategoTerm z_38 = null;
        IStrategoTerm a_39 = null;
        IStrategoTerm b_39 = null;
        IStrategoTerm e_39 = null;
        IStrategoTerm c_39 = null;
        IStrategoTerm f_39 = null;
        if(term.getTermType() != IStrategoTerm.APPL || transform._consPointcutarg_3 != ((IStrategoAppl)term).getConstructor())
          break Fail47;
        IStrategoTerm arg66 = term.getSubterm(0);
        if(arg66.getTermType() != IStrategoTerm.APPL || transform._consId_1 != ((IStrategoAppl)arg66).getConstructor())
          break Fail47;
        y_38 = arg66.getSubterm(0);
        a_39 = term.getSubterm(1);
        z_38 = term.getSubterm(2);
        term = u_38;
        if(term.getTermType() != IStrategoTerm.APPL || transform._consExplicitJoinPoint_3 != ((IStrategoAppl)term).getConstructor())
          break Fail47;
        w_38 = term.getSubterm(0);
        IStrategoTerm arg67 = term.getSubterm(1);
        if(arg67.getTermType() != IStrategoTerm.APPL || transform._consId_1 != ((IStrategoAppl)arg67).getConstructor())
          break Fail47;
        x_38 = arg67.getSubterm(0);
        e_39 = term;
        term = pp_aspectj_string_0_0.instance.invoke(context, w_38);
        if(term == null)
          break Fail47;
        b_39 = term;
        f_39 = e_39;
        term = pp_aspectj_string_0_0.instance.invoke(context, z_38);
        if(term == null)
          break Fail47;
        c_39 = term;
        term = f_39;
        term = random_string_0_0.instance.invoke(context, term);
        if(term == null)
          break Fail47;
        term = (IStrategoTerm)termFactory.makeListCons(transform.const14, termFactory.makeListCons(term, (IStrategoList)transform.constNil0));
        term = concat_strings_0_0.instance.invoke(context, term);
        if(term == null)
          break Fail47;
        term = termFactory.makeAppl(transform._consMethodDec_2, new IStrategoTerm[]{termFactory.makeAppl(transform._consMethodDecHead_6, new IStrategoTerm[]{(IStrategoTerm)termFactory.makeListCons(termFactory.makeAppl(transform._consAnno_2, new IStrategoTerm[]{transform.constTypeName4, (IStrategoTerm)termFactory.makeListCons(termFactory.makeAppl(transform._consElemValPair_2, new IStrategoTerm[]{transform.constId7, termFactory.makeAppl(transform._consLit_1, new IStrategoTerm[]{termFactory.makeAppl(transform._consString_1, new IStrategoTerm[]{(IStrategoTerm)termFactory.makeListCons(termFactory.makeAppl(transform._consChars_1, new IStrategoTerm[]{b_39}), (IStrategoList)transform.constNil0)})})}), termFactory.makeListCons(termFactory.makeAppl(transform._consElemValPair_2, new IStrategoTerm[]{transform.constId6, termFactory.makeAppl(transform._consLit_1, new IStrategoTerm[]{termFactory.makeAppl(transform._consString_1, new IStrategoTerm[]{(IStrategoTerm)termFactory.makeListCons(termFactory.makeAppl(transform._consChars_1, new IStrategoTerm[]{x_38}), (IStrategoList)transform.constNil0)})})}), termFactory.makeListCons(termFactory.makeAppl(transform._consElemValPair_2, new IStrategoTerm[]{transform.constId11, termFactory.makeAppl(transform._consLit_1, new IStrategoTerm[]{termFactory.makeAppl(transform._consString_1, new IStrategoTerm[]{(IStrategoTerm)termFactory.makeListCons(termFactory.makeAppl(transform._consChars_1, new IStrategoTerm[]{y_38}), (IStrategoList)transform.constNil0)})})}), termFactory.makeListCons(termFactory.makeAppl(transform._consElemValPair_2, new IStrategoTerm[]{transform.constId10, termFactory.makeAppl(transform._consLit_1, new IStrategoTerm[]{termFactory.makeAppl(transform._consString_1, new IStrategoTerm[]{(IStrategoTerm)termFactory.makeListCons(termFactory.makeAppl(transform._consChars_1, new IStrategoTerm[]{c_39}), (IStrategoList)transform.constNil0)})})}), (IStrategoList)transform.constNil0))))}), (IStrategoList)transform.constNil0), transform.constNone0, transform.constVoid0, termFactory.makeAppl(transform._consId_1, new IStrategoTerm[]{term}), a_39, transform.constNone0}), transform.constBlock0});
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
      Fail48:
      { 
        IStrategoTerm l_39 = null;
        IStrategoTerm m_39 = null;
        IStrategoTerm p_39 = null;
        if(term.getTermType() != IStrategoTerm.APPL || transform._consLocalVarDecStm_1 != ((IStrategoAppl)term).getConstructor())
          break Fail48;
        IStrategoTerm arg68 = term.getSubterm(0);
        if(arg68.getTermType() != IStrategoTerm.APPL || transform._consLocalVarDec_3 != ((IStrategoAppl)arg68).getConstructor())
          break Fail48;
        l_39 = arg68.getSubterm(2);
        p_39 = term;
        IStrategoTerm term22 = term;
        Success22:
        { 
          Fail49:
          { 
            term = allow_extends_1_1.instance.invoke(context, term, remove_var_dec_0_0.instance, l_39);
            if(term == null)
              break Fail49;
            m_39 = term;
            if(true)
              break Success22;
          }
          term = term22;
          IStrategoTerm n_39 = null;
          IStrategoTerm o_39 = null;
          IStrategoTerm t_39 = null;
          n_39 = term;
          term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
          if(term == null)
            break Fail48;
          o_39 = term;
          t_39 = n_39;
          term = report_with_failure_0_2.instance.invoke(context, t_39, transform.const17, o_39);
          if(term == null)
            break Fail48;
        }
        term = p_39;
        if(m_39 == null)
          break Fail48;
        term = m_39;
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
      Fail50:
      { 
        IStrategoTerm term23 = term;
        IStrategoConstructor cons4 = term.getTermType() == IStrategoTerm.APPL ? ((IStrategoAppl)term).getConstructor() : null;
        Success23:
        { 
          if(cons4 == transform._consVarDec_1)
          { 
            Fail51:
            { 
              term = transform.constNone0;
              if(true)
                break Success23;
            }
            term = term23;
          }
          if(cons4 == transform._consVarDec_2)
          { 
            IStrategoTerm u_39 = null;
            IStrategoTerm v_39 = null;
            u_39 = term.getSubterm(0);
            v_39 = term.getSubterm(1);
            term = termFactory.makeAppl(transform._consExprStm_1, new IStrategoTerm[]{termFactory.makeAppl(transform._consAssign_2, new IStrategoTerm[]{termFactory.makeAppl(transform._consExprName_1, new IStrategoTerm[]{u_39}), v_39})});
          }
          else
          { 
            break Fail50;
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

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm l_110, IStrategoTerm m_110, IStrategoTerm n_110)
    { 
      ITermFactory termFactory = context.getFactory();
      Fail52:
      { 
        IStrategoTerm term24 = term;
        IStrategoConstructor cons5 = term.getTermType() == IStrategoTerm.APPL ? ((IStrategoAppl)term).getConstructor() : null;
        Success24:
        { 
          if(cons5 == transform._consThisClass_0)
          { 
            Fail53:
            { 
              term = termFactory.makeAppl(transform._consWithin_1, new IStrategoTerm[]{termFactory.makeAppl(transform._consAnnoTypePattern_2, new IStrategoTerm[]{termFactory.makeAppl(transform._consAnnoPattern_1, new IStrategoTerm[]{(IStrategoTerm)termFactory.makeListCons(termFactory.makeAppl(transform._consSimpleAnnoPatternValue_2, new IStrategoTerm[]{transform.constTypeName5, termFactory.makeAppl(transform._consLit_1, new IStrategoTerm[]{termFactory.makeAppl(transform._consDeci_1, new IStrategoTerm[]{l_110})})}), (IStrategoList)transform.constNil0)}), transform.constRefTypePattern0})});
              if(true)
                break Success24;
            }
            term = term24;
          }
          Success25:
          { 
            if(cons5 == transform._consThisMethod_0)
            { 
              Fail54:
              { 
                term = termFactory.makeAppl(transform._consMethodPattern_6, new IStrategoTerm[]{termFactory.makeAppl(transform._consAnnoPattern_1, new IStrategoTerm[]{(IStrategoTerm)termFactory.makeListCons(termFactory.makeAppl(transform._consSimpleAnnoPatternValue_2, new IStrategoTerm[]{transform.constTypeName6, termFactory.makeAppl(transform._consLit_1, new IStrategoTerm[]{termFactory.makeAppl(transform._consDeci_1, new IStrategoTerm[]{m_110})})}), (IStrategoList)transform.constNil0)}), transform.constModPattern0, transform.constRefTypePattern0, transform.constMemberName0, transform.constCons3, transform.constNone0});
                if(true)
                  break Success25;
              }
              term = term24;
            }
            if(cons5 == transform._consThisBlock_0)
            { 
              term = termFactory.makeAppl(transform._consMethodPattern_6, new IStrategoTerm[]{termFactory.makeAppl(transform._consAnnoPattern_1, new IStrategoTerm[]{(IStrategoTerm)termFactory.makeListCons(termFactory.makeAppl(transform._consSimpleAnnoPatternValue_2, new IStrategoTerm[]{transform.constTypeName7, termFactory.makeAppl(transform._consLit_1, new IStrategoTerm[]{termFactory.makeAppl(transform._consDeci_1, new IStrategoTerm[]{n_110})})}), (IStrategoList)transform.constNil0)}), transform.constModPattern0, transform.constRefTypePattern0, transform.constMemberName0, transform.constCons3, transform.constNone0});
            }
            else
            { 
              break Fail52;
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
      Fail55:
      { 
        IStrategoTerm term26 = term;
        IStrategoConstructor cons6 = term.getTermType() == IStrategoTerm.APPL ? ((IStrategoAppl)term).getConstructor() : null;
        Success26:
        { 
          if(cons6 == transform._consMemberName_1)
          { 
            Fail56:
            { 
              if(true)
                break Success26;
            }
            term = term26;
          }
          if(cons6 == transform._consMemberName_2)
          { 
            IStrategoTerm f_40 = null;
            IStrategoTerm g_40 = null;
            IStrategoTerm arg72 = term.getSubterm(0);
            if(arg72.getTermType() != IStrategoTerm.APPL || transform._consRefTypePattern_1 != ((IStrategoAppl)arg72).getConstructor())
              break Fail55;
            f_40 = arg72.getSubterm(0);
            g_40 = term.getSubterm(1);
            Success27:
            { 
              Fail57:
              { 
                IStrategoTerm h_40 = null;
                h_40 = term;
                term = termFactory.makeTuple(transform.constNamePattern0, f_40);
                term = equal_0_0.instance.invoke(context, term);
                if(term == null)
                  break Fail57;
                term = h_40;
                { 
                  term = termFactory.makeAppl(transform._consMemberName_1, new IStrategoTerm[]{g_40});
                  if(true)
                    break Success27;
                }
              }
              term = termFactory.makeAppl(transform._consMemberName_2, new IStrategoTerm[]{termFactory.makeAppl(transform._consRefTypePattern_1, new IStrategoTerm[]{f_40}), g_40});
              term = pp_aspectj_string_0_0.instance.invoke(context, term);
              if(term == null)
                break Fail55;
              term = termFactory.makeAppl(transform._consMemberName_1, new IStrategoTerm[]{term});
            }
          }
          else
          { 
            break Fail55;
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
      Fail58:
      { 
        IStrategoTerm term28 = term;
        IStrategoConstructor cons7 = term.getTermType() == IStrategoTerm.APPL ? ((IStrategoAppl)term).getConstructor() : null;
        Success28:
        { 
          if(cons7 == transform._consTypeName_1)
          { 
            Fail59:
            { 
              IStrategoTerm b_41 = null;
              b_41 = term.getSubterm(0);
              term = termFactory.makeAppl(transform._consAmbName_1, new IStrategoTerm[]{b_41});
              if(true)
                break Success28;
            }
            term = term28;
          }
          Success29:
          { 
            if(cons7 == transform._consTypeName_2)
            { 
              Fail60:
              { 
                IStrategoTerm x_40 = null;
                IStrategoTerm y_40 = null;
                x_40 = term.getSubterm(0);
                y_40 = term.getSubterm(1);
                term = this.invoke(context, x_40);
                if(term == null)
                  break Fail60;
                term = termFactory.makeAppl(transform._consAmbName_2, new IStrategoTerm[]{term, y_40});
                if(true)
                  break Success29;
              }
              term = term28;
            }
            Success30:
            { 
              if(cons7 == transform._consPackageOrTypeName_1)
              { 
                Fail61:
                { 
                  IStrategoTerm w_40 = null;
                  w_40 = term.getSubterm(0);
                  term = termFactory.makeAppl(transform._consAmbName_1, new IStrategoTerm[]{w_40});
                  if(true)
                    break Success30;
                }
                term = term28;
              }
              if(cons7 == transform._consPackageOrTypeName_2)
              { 
                IStrategoTerm s_40 = null;
                IStrategoTerm t_40 = null;
                s_40 = term.getSubterm(0);
                t_40 = term.getSubterm(1);
                term = this.invoke(context, s_40);
                if(term == null)
                  break Fail58;
                term = termFactory.makeAppl(transform._consAmbName_2, new IStrategoTerm[]{term, t_40});
              }
              else
              { 
                break Fail58;
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
      Fail62:
      { 
        term = random_string_0_0.instance.invoke(context, term);
        if(term == null)
          break Fail62;
        term = (IStrategoTerm)termFactory.makeListCons(transform.const22, termFactory.makeListCons(term, (IStrategoList)transform.constNil0));
        term = concat_strings_0_0.instance.invoke(context, term);
        if(term == null)
          break Fail62;
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

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm o_110, IStrategoTerm p_110)
    { 
      ITermFactory termFactory = context.getFactory();
      context.push("gen__ejpscope__method__name_0_2");
      Fail63:
      { 
        IStrategoTerm term31 = term;
        IStrategoConstructor cons8 = term.getTermType() == IStrategoTerm.APPL ? ((IStrategoAppl)term).getConstructor() : null;
        Success31:
        { 
          if(cons8 == transform._consMemberName_1)
          { 
            Fail64:
            { 
              IStrategoTerm k_41 = null;
              IStrategoTerm l_41 = null;
              k_41 = term.getSubterm(0);
              Success32:
              { 
                Fail65:
                { 
                  IStrategoTerm m_41 = null;
                  m_41 = term;
                  term = o_110;
                  if(term.getTermType() != IStrategoTerm.APPL || transform._consNone_0 != ((IStrategoAppl)term).getConstructor())
                    break Fail65;
                  term = m_41;
                  { 
                    term = (IStrategoTerm)termFactory.makeListCons(transform.const24, termFactory.makeListCons(p_110, termFactory.makeListCons(transform.const23, termFactory.makeListCons(k_41, (IStrategoList)transform.constNil0))));
                    term = concat_strings_0_0.instance.invoke(context, term);
                    if(term == null)
                      break Fail64;
                    l_41 = term;
                    if(true)
                      break Success32;
                  }
                }
                term = convert_package_name_0_0.instance.invoke(context, o_110);
                if(term == null)
                  break Fail64;
                term = (IStrategoTerm)termFactory.makeListCons(transform.const24, termFactory.makeListCons(term, termFactory.makeListCons(p_110, termFactory.makeListCons(transform.const23, termFactory.makeListCons(k_41, (IStrategoList)transform.constNil0)))));
                term = concat_strings_0_0.instance.invoke(context, term);
                if(term == null)
                  break Fail64;
                l_41 = term;
              }
              term = termFactory.makeAppl(transform._consMemberName_2, new IStrategoTerm[]{transform.constRefTypePattern0, l_41});
              if(true)
                break Success31;
            }
            term = term31;
          }
          if(cons8 == transform._consMemberName_2)
          { 
            term = gen__ejpscope__method__name_0_0.instance.invoke(context, term);
            if(term == null)
              break Fail63;
          }
          else
          { 
            break Fail63;
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
      Fail66:
      { 
        IStrategoTerm p_41 = null;
        if(term.getTermType() != IStrategoTerm.APPL || transform._consPackageName_1 != ((IStrategoAppl)term).getConstructor())
          break Fail66;
        p_41 = term.getSubterm(0);
        term = map_1_0.instance.invoke(context, p_41, lifted54.instance);
        if(term == null)
          break Fail66;
        term = concat_strings_0_0.instance.invoke(context, term);
        if(term == null)
          break Fail66;
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
      Fail67:
      { 
        IStrategoTerm term33 = term;
        IStrategoConstructor cons9 = term.getTermType() == IStrategoTerm.APPL ? ((IStrategoAppl)term).getConstructor() : null;
        Success33:
        { 
          if(cons9 == transform._consExplicitJoinPoint_3)
          { 
            Fail68:
            { 
              IStrategoTerm a_42 = null;
              IStrategoTerm b_42 = null;
              a_42 = term.getSubterm(0);
              IStrategoTerm arg75 = term.getSubterm(1);
              if(arg75.getTermType() != IStrategoTerm.APPL || transform._consId_1 != ((IStrategoAppl)arg75).getConstructor())
                break Fail68;
              b_42 = arg75.getSubterm(0);
              term = gen__ejpscope__method__name__helper_0_0.instance.invoke(context, a_42);
              if(term == null)
                break Fail68;
              term = (IStrategoTerm)termFactory.makeListCons(transform.const24, termFactory.makeListCons(term, termFactory.makeListCons(transform.const23, termFactory.makeListCons(b_42, (IStrategoList)transform.constNil0))));
              term = concat_strings_0_0.instance.invoke(context, term);
              if(term == null)
                break Fail68;
              if(true)
                break Success33;
            }
            term = term33;
          }
          if(cons9 == transform._consMemberName_2)
          { 
            IStrategoTerm r_41 = null;
            IStrategoTerm s_41 = null;
            IStrategoTerm arg77 = term.getSubterm(0);
            if(arg77.getTermType() != IStrategoTerm.APPL || transform._consRefTypePattern_1 != ((IStrategoAppl)arg77).getConstructor())
              break Fail67;
            r_41 = arg77.getSubterm(0);
            s_41 = term.getSubterm(1);
            Success34:
            { 
              Fail69:
              { 
                IStrategoTerm t_41 = null;
                t_41 = term;
                term = termFactory.makeTuple(transform.constNamePattern0, r_41);
                term = equal_0_0.instance.invoke(context, term);
                if(term == null)
                  break Fail69;
                term = t_41;
                { 
                  term = (IStrategoTerm)termFactory.makeListCons(transform.const24, termFactory.makeListCons(s_41, (IStrategoList)transform.constNil0));
                  term = concat_strings_0_0.instance.invoke(context, term);
                  if(term == null)
                    break Fail67;
                  term = termFactory.makeAppl(transform._consMemberName_1, new IStrategoTerm[]{term});
                  if(true)
                    break Success34;
                }
              }
              term = gen__ejpscope__method__name__helper_0_0.instance.invoke(context, r_41);
              if(term == null)
                break Fail67;
              term = (IStrategoTerm)termFactory.makeListCons(transform.const24, termFactory.makeListCons(term, termFactory.makeListCons(transform.const23, termFactory.makeListCons(s_41, (IStrategoList)transform.constNil0))));
              term = concat_strings_0_0.instance.invoke(context, term);
              if(term == null)
                break Fail67;
              term = termFactory.makeAppl(transform._consMemberName_1, new IStrategoTerm[]{term});
            }
          }
          else
          { 
            break Fail67;
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
      Fail70:
      { 
        IStrategoTerm term35 = term;
        IStrategoConstructor cons10 = term.getTermType() == IStrategoTerm.APPL ? ((IStrategoAppl)term).getConstructor() : null;
        Success35:
        { 
          if(cons10 == transform._consId_1)
          { 
            Fail71:
            { 
              IStrategoTerm t_42 = null;
              t_42 = term.getSubterm(0);
              term = t_42;
              if(true)
                break Success35;
            }
            term = term35;
          }
          Success36:
          { 
            if(cons10 == transform._consTypeName_1)
            { 
              Fail72:
              { 
                IStrategoTerm s_42 = null;
                IStrategoTerm arg78 = term.getSubterm(0);
                if(arg78.getTermType() != IStrategoTerm.APPL || transform._consId_1 != ((IStrategoAppl)arg78).getConstructor())
                  break Fail72;
                s_42 = arg78.getSubterm(0);
                term = s_42;
                if(true)
                  break Success36;
              }
              term = term35;
            }
            Success37:
            { 
              if(cons10 == transform._consTypeName_2)
              { 
                Fail73:
                { 
                  IStrategoTerm o_42 = null;
                  IStrategoTerm p_42 = null;
                  o_42 = term.getSubterm(0);
                  IStrategoTerm arg79 = term.getSubterm(1);
                  if(arg79.getTermType() != IStrategoTerm.APPL || transform._consId_1 != ((IStrategoAppl)arg79).getConstructor())
                    break Fail73;
                  p_42 = arg79.getSubterm(0);
                  term = this.invoke(context, o_42);
                  if(term == null)
                    break Fail73;
                  term = (IStrategoTerm)termFactory.makeListCons(term, termFactory.makeListCons(transform.const23, termFactory.makeListCons(p_42, (IStrategoList)transform.constNil0)));
                  term = concat_strings_0_0.instance.invoke(context, term);
                  if(term == null)
                    break Fail73;
                  if(true)
                    break Success37;
                }
                term = term35;
              }
              Success38:
              { 
                if(cons10 == transform._consPackageOrTypeName_2)
                { 
                  Fail74:
                  { 
                    IStrategoTerm k_42 = null;
                    IStrategoTerm l_42 = null;
                    k_42 = term.getSubterm(0);
                    IStrategoTerm arg80 = term.getSubterm(1);
                    if(arg80.getTermType() != IStrategoTerm.APPL || transform._consId_1 != ((IStrategoAppl)arg80).getConstructor())
                      break Fail74;
                    l_42 = arg80.getSubterm(0);
                    term = this.invoke(context, k_42);
                    if(term == null)
                      break Fail74;
                    term = (IStrategoTerm)termFactory.makeListCons(term, termFactory.makeListCons(transform.const23, termFactory.makeListCons(l_42, (IStrategoList)transform.constNil0)));
                    term = concat_strings_0_0.instance.invoke(context, term);
                    if(term == null)
                      break Fail74;
                    if(true)
                      break Success38;
                  }
                  term = term35;
                }
                Success39:
                { 
                  if(cons10 == transform._consPackageOrTypeName_1)
                  { 
                    Fail75:
                    { 
                      IStrategoTerm j_42 = null;
                      IStrategoTerm arg81 = term.getSubterm(0);
                      if(arg81.getTermType() != IStrategoTerm.APPL || transform._consId_1 != ((IStrategoAppl)arg81).getConstructor())
                        break Fail75;
                      j_42 = arg81.getSubterm(0);
                      term = j_42;
                      if(true)
                        break Success39;
                    }
                    term = term35;
                  }
                  Success40:
                  { 
                    if(cons10 == transform._consNamePattern_1)
                    { 
                      Fail76:
                      { 
                        IStrategoTerm i_42 = null;
                        i_42 = term.getSubterm(0);
                        term = i_42;
                        if(true)
                          break Success40;
                      }
                      term = term35;
                    }
                    if(cons10 == transform._consNamePattern_2)
                    { 
                      IStrategoTerm e_42 = null;
                      IStrategoTerm f_42 = null;
                      e_42 = term.getSubterm(0);
                      f_42 = term.getSubterm(1);
                      term = this.invoke(context, e_42);
                      if(term == null)
                        break Fail70;
                      term = (IStrategoTerm)termFactory.makeListCons(term, termFactory.makeListCons(transform.const23, termFactory.makeListCons(f_42, (IStrategoList)transform.constNil0)));
                      term = concat_strings_0_0.instance.invoke(context, term);
                      if(term == null)
                        break Fail70;
                    }
                    else
                    { 
                      break Fail70;
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
      Fail77:
      { 
        term = next_random_0_0.instance.invoke(context, term);
        if(term == null)
          break Fail77;
        term = abs_0_0.instance.invoke(context, term);
        if(term == null)
          break Fail77;
        term = int_to_string_0_0.instance.invoke(context, term);
        if(term == null)
          break Fail77;
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
      Fail78:
      { 
        term = random_string_0_0.instance.invoke(context, term);
        if(term == null)
          break Fail78;
        term = (IStrategoTerm)termFactory.makeListCons(transform.const1, termFactory.makeListCons(term, (IStrategoList)transform.constNil0));
        term = concat_strings_0_0.instance.invoke(context, term);
        if(term == null)
          break Fail78;
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

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm d_43)
    { 
      context.push("my_hashtable_remove_0_1");
      Fail79:
      { 
        TermReference e_43 = new TermReference();
        if(e_43.value == null)
          e_43.value = term;
        else
          if(e_43.value != term && !e_43.value.match(term))
            break Fail79;
        term = iset_elements_0_0.instance.invoke(context, d_43);
        if(term == null)
          break Fail79;
        lifted55 lifted550 = new lifted55();
        lifted550.e_43 = e_43;
        term = map_1_0.instance.invoke(context, term, lifted550);
        if(term == null)
          break Fail79;
        if(e_43.value == null)
          break Fail79;
        term = e_43.value;
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

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm ref_i_43)
    { 
      TermReference i_43 = new TermReference(ref_i_43);
      context.push("my_hashtable_union_0_1");
      Fail80:
      { 
        TermReference j_43 = new TermReference();
        if(j_43.value == null)
          j_43.value = term;
        else
          if(j_43.value != term && !j_43.value.match(term))
            break Fail80;
        if(i_43.value == null)
          break Fail80;
        term = hashtable_keys_0_0.instance.invoke(context, i_43.value);
        if(term == null)
          break Fail80;
        lifted56 lifted560 = new lifted56();
        lifted560.i_43 = i_43;
        lifted560.j_43 = j_43;
        term = map_1_0.instance.invoke(context, term, lifted560);
        if(term == null)
          break Fail80;
        if(j_43.value == null)
          break Fail80;
        term = j_43.value;
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

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm n_43, IStrategoTerm o_43)
    { 
      context.push("my_hashtable_union_helper_0_2");
      Fail81:
      { 
        IStrategoTerm p_43 = null;
        IStrategoTerm t_43 = null;
        p_43 = term;
        term = hashtable_remove_0_1.instance.invoke(context, o_43, term);
        if(term == null)
          break Fail81;
        t_43 = o_43;
        term = hashtable_get_0_1.instance.invoke(context, n_43, p_43);
        if(term == null)
          break Fail81;
        term = hashtable_put_0_2.instance.invoke(context, t_43, p_43, term);
        if(term == null)
          break Fail81;
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

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm u_43, IStrategoTerm v_43)
    { 
      ITermFactory termFactory = context.getFactory();
      context.push("add_key_to_multiple_values_table_0_2");
      Fail82:
      { 
        IStrategoTerm w_43 = null;
        w_43 = term;
        Success41:
        { 
          Fail83:
          { 
            IStrategoTerm x_43 = null;
            x_43 = term;
            term = hashtable_keys_0_0.instance.invoke(context, w_43);
            if(term == null)
              break Fail83;
            term = termFactory.makeTuple(u_43, term);
            term = elem_0_0.instance.invoke(context, term);
            if(term == null)
              break Fail83;
            term = x_43;
            { 
              IStrategoTerm d_44 = null;
              d_44 = w_43;
              term = hashtable_get_0_1.instance.invoke(context, w_43, u_43);
              if(term == null)
                break Fail82;
              term = termFactory.makeTuple(term, (IStrategoTerm)termFactory.makeListCons(v_43, (IStrategoList)transform.constNil0));
              term = conc_0_0.instance.invoke(context, term);
              if(term == null)
                break Fail82;
              term = hashtable_put_0_2.instance.invoke(context, d_44, u_43, term);
              if(term == null)
                break Fail82;
              if(true)
                break Success41;
            }
          }
          IStrategoTerm h_44 = null;
          h_44 = w_43;
          term = (IStrategoTerm)termFactory.makeListCons(v_43, (IStrategoList)transform.constNil0);
          term = hashtable_put_0_2.instance.invoke(context, h_44, u_43, term);
          if(term == null)
            break Fail82;
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

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy j_44, IStrategoTerm i_44)
    { 
      context.push("allow_extends_1_1");
      Fail84:
      { 
        term = allow_extends_2_1.instance.invoke(context, term, j_44, _Id.instance, i_44);
        if(term == null)
          break Fail84;
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

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy n_44, Strategy o_44, IStrategoTerm m_44)
    { 
      context.push("allow_extends_2_1");
      Fail85:
      { 
        term = m_44;
        lifted58 lifted580 = new lifted58();
        lifted580.n_44 = n_44;
        lifted580.o_44 = o_44;
        term = SRTS_all.instance.invoke(context, term, lifted580);
        if(term == null)
          break Fail85;
        term = concat_0_0.instance.invoke(context, term);
        if(term == null)
          break Fail85;
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

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy t_44, Strategy u_44)
    { 
      ITermFactory termFactory = context.getFactory();
      context.push("allow_extends_helper_2_0");
      Fail86:
      { 
        IStrategoTerm p_44 = null;
        IStrategoTerm q_44 = null;
        q_44 = term;
        Success42:
        { 
          Fail87:
          { 
            IStrategoTerm r_44 = null;
            r_44 = term;
            term = t_44.invoke(context, q_44);
            if(term == null)
              break Fail87;
            p_44 = term;
            term = r_44;
            { 
              Success43:
              { 
                Fail88:
                { 
                  IStrategoTerm s_44 = null;
                  s_44 = term;
                  term = is_list_0_0.instance.invoke(context, p_44);
                  if(term == null)
                    break Fail88;
                  term = s_44;
                  { 
                    term = p_44;
                    if(true)
                      break Success43;
                  }
                }
                term = (IStrategoTerm)termFactory.makeListCons(p_44, (IStrategoList)transform.constNil0);
              }
              if(true)
                break Success42;
            }
          }
          term = u_44.invoke(context, q_44);
          if(term == null)
            break Fail86;
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
      Fail89:
      { 
        IStrategoTerm z_44 = null;
        IStrategoTerm a_45 = null;
        IStrategoTerm b_45 = null;
        z_44 = term;
        b_45 = term;
        a_45 = term;
        term = b_45;
        IStrategoTerm term44 = term;
        Success44:
        { 
          Fail90:
          { 
            IStrategoTerm c_45 = null;
            c_45 = term;
            term = a_45;
            if(term.getTermType() != IStrategoTerm.APPL || transform._consLit_1 != ((IStrategoAppl)term).getConstructor())
              break Fail90;
            IStrategoTerm arg82 = term.getSubterm(0);
            if(arg82.getTermType() != IStrategoTerm.APPL || transform._consString_1 != ((IStrategoAppl)arg82).getConstructor())
              break Fail90;
            term = c_45;
            { 
              term = transform.constLit1;
              if(true)
                break Success44;
            }
          }
          term = term44;
          Success45:
          { 
            Fail91:
            { 
              IStrategoTerm d_45 = null;
              d_45 = term;
              term = a_45;
              if(term.getTermType() != IStrategoTerm.APPL || transform._consLit_1 != ((IStrategoAppl)term).getConstructor())
                break Fail91;
              IStrategoTerm arg84 = term.getSubterm(0);
              if(arg84.getTermType() != IStrategoTerm.APPL || transform._consChar_1 != ((IStrategoAppl)arg84).getConstructor())
                break Fail91;
              term = d_45;
              { 
                term = transform.constLit2;
                if(true)
                  break Success45;
              }
            }
            term = pp_java5_to_string_0_0.instance.invoke(context, z_44);
            if(term == null)
              break Fail89;
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

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm ref_q_110, IStrategoTerm r_110, IStrategoTerm s_110)
    { 
      ITermFactory termFactory = context.getFactory();
      TermReference q_110 = new TermReference(ref_q_110);
      context.push("ejp_to_ajc_0_3");
      Fail92:
      { 
        IStrategoTerm term46 = term;
        Success46:
        { 
          Fail93:
          { 
            IStrategoTerm b_52 = null;
            IStrategoTerm c_52 = null;
            IStrategoTerm d_52 = null;
            IStrategoTerm e_52 = null;
            IStrategoTerm f_52 = null;
            IStrategoTerm g_52 = null;
            IStrategoTerm k_52 = null;
            if(term.getTermType() != IStrategoTerm.APPL || transform._consExplicitJoinPointPattern_1 != ((IStrategoAppl)term).getConstructor())
              break Fail93;
            IStrategoTerm arg86 = term.getSubterm(0);
            if(arg86.getTermType() != IStrategoTerm.APPL || transform._consMethodPattern_6 != ((IStrategoAppl)arg86).getConstructor())
              break Fail93;
            IStrategoTerm arg87 = arg86.getSubterm(0);
            if(arg87.getTermType() != IStrategoTerm.APPL || transform._consAnnoPattern_1 != ((IStrategoAppl)arg87).getConstructor())
              break Fail93;
            b_52 = arg87.getSubterm(0);
            IStrategoTerm arg88 = arg86.getSubterm(1);
            if(arg88.getTermType() != IStrategoTerm.APPL || transform._consModPattern_1 != ((IStrategoAppl)arg88).getConstructor())
              break Fail93;
            c_52 = arg88.getSubterm(0);
            d_52 = arg86.getSubterm(2);
            e_52 = arg86.getSubterm(3);
            f_52 = arg86.getSubterm(4);
            g_52 = arg86.getSubterm(5);
            term = termFactory.makeTuple(b_52, transform.constCons7);
            term = conc_0_0.instance.invoke(context, term);
            if(term == null)
              break Fail93;
            k_52 = term;
            term = termFactory.makeTuple(c_52, transform.constCons8);
            term = conc_0_0.instance.invoke(context, term);
            if(term == null)
              break Fail93;
            term = termFactory.makeAppl(transform._consMethodPattern_6, new IStrategoTerm[]{termFactory.makeAppl(transform._consAnnoPattern_1, new IStrategoTerm[]{k_52}), termFactory.makeAppl(transform._consModPattern_1, new IStrategoTerm[]{term}), d_52, e_52, f_52, g_52});
            if(true)
              break Success46;
          }
          term = term46;
          IStrategoTerm term47 = term;
          Success47:
          { 
            Fail94:
            { 
              IStrategoTerm r_51 = null;
              IStrategoTerm s_51 = null;
              IStrategoTerm t_51 = null;
              t_51 = term;
              r_51 = term;
              term = or_2_0.instance.invoke(context, t_51, lifted59.instance, lifted60.instance);
              if(term == null)
                break Fail94;
              term = r_51;
              if(term.getTermType() != IStrategoTerm.APPL || transform._consExplicitJoinPointPattern_1 != ((IStrategoAppl)term).getConstructor())
                break Fail94;
              s_51 = term.getSubterm(0);
              term = gen__ejp__name_0_0.instance.invoke(context, s_51);
              if(term == null)
                break Fail94;
              term = termFactory.makeAppl(transform._consMethodPattern_6, new IStrategoTerm[]{transform.constAnnoPattern0, transform.constModPattern0, transform.constRefTypePattern0, term, transform.constCons3, transform.constNone0});
              if(true)
                break Success47;
            }
            term = term47;
            IStrategoTerm term48 = term;
            Success48:
            { 
              Fail95:
              { 
                IStrategoTerm z_50 = null;
                IStrategoTerm a_51 = null;
                IStrategoTerm b_51 = null;
                IStrategoTerm c_51 = null;
                IStrategoTerm d_51 = null;
                IStrategoTerm e_51 = null;
                IStrategoTerm f_51 = null;
                if(term.getTermType() != IStrategoTerm.APPL || transform._consNotExplicitJoinPointPattern_1 != ((IStrategoAppl)term).getConstructor())
                  break Fail95;
                IStrategoTerm arg94 = term.getSubterm(0);
                if(arg94.getTermType() != IStrategoTerm.APPL || transform._consMethodPattern_6 != ((IStrategoAppl)arg94).getConstructor())
                  break Fail95;
                IStrategoTerm arg95 = arg94.getSubterm(0);
                if(arg95.getTermType() != IStrategoTerm.APPL || transform._consAnnoPattern_1 != ((IStrategoAppl)arg95).getConstructor())
                  break Fail95;
                z_50 = arg95.getSubterm(0);
                IStrategoTerm arg96 = arg94.getSubterm(1);
                if(arg96.getTermType() != IStrategoTerm.APPL || transform._consModPattern_1 != ((IStrategoAppl)arg96).getConstructor())
                  break Fail95;
                a_51 = arg96.getSubterm(0);
                b_51 = arg94.getSubterm(2);
                c_51 = arg94.getSubterm(3);
                d_51 = arg94.getSubterm(4);
                e_51 = arg94.getSubterm(5);
                term = termFactory.makeTuple(z_50, transform.constCons9);
                term = conc_0_0.instance.invoke(context, term);
                if(term == null)
                  break Fail95;
                f_51 = term;
                term = termFactory.makeTuple(a_51, transform.constCons8);
                term = conc_0_0.instance.invoke(context, term);
                if(term == null)
                  break Fail95;
                term = termFactory.makeAppl(transform._consMethodPattern_6, new IStrategoTerm[]{termFactory.makeAppl(transform._consAnnoPattern_1, new IStrategoTerm[]{f_51}), termFactory.makeAppl(transform._consModPattern_1, new IStrategoTerm[]{term}), b_51, c_51, d_51, e_51});
                if(true)
                  break Success48;
              }
              term = term48;
              IStrategoTerm term49 = term;
              Success49:
              { 
                Fail96:
                { 
                  IStrategoTerm q_50 = null;
                  IStrategoTerm r_50 = null;
                  IStrategoTerm s_50 = null;
                  s_50 = term;
                  q_50 = term;
                  term = or_2_0.instance.invoke(context, s_50, lifted61.instance, lifted62.instance);
                  if(term == null)
                    break Fail96;
                  term = q_50;
                  if(term.getTermType() != IStrategoTerm.APPL || transform._consNotExplicitJoinPointPattern_1 != ((IStrategoAppl)term).getConstructor())
                    break Fail96;
                  r_50 = term.getSubterm(0);
                  term = gen__ejp__name_0_0.instance.invoke(context, r_50);
                  if(term == null)
                    break Fail96;
                  term = termFactory.makeAppl(transform._consMethodPattern_6, new IStrategoTerm[]{transform.constAnnoPattern1, transform.constModPattern0, transform.constRefTypePattern0, term, transform.constCons3, transform.constNone0});
                  if(true)
                    break Success49;
                }
                term = term49;
                IStrategoTerm term50 = term;
                Success50:
                { 
                  Fail97:
                  { 
                    IStrategoTerm d_50 = null;
                    IStrategoTerm e_50 = null;
                    IStrategoTerm f_50 = null;
                    IStrategoTerm g_50 = null;
                    IStrategoTerm h_50 = null;
                    IStrategoTerm i_50 = null;
                    IStrategoTerm j_50 = null;
                    if(term.getTermType() != IStrategoTerm.APPL || transform._consExplicitJoinPointScopePattern_1 != ((IStrategoAppl)term).getConstructor())
                      break Fail97;
                    IStrategoTerm arg102 = term.getSubterm(0);
                    if(arg102.getTermType() != IStrategoTerm.APPL || transform._consMethodPattern_6 != ((IStrategoAppl)arg102).getConstructor())
                      break Fail97;
                    IStrategoTerm arg103 = arg102.getSubterm(0);
                    if(arg103.getTermType() != IStrategoTerm.APPL || transform._consAnnoPattern_1 != ((IStrategoAppl)arg103).getConstructor())
                      break Fail97;
                    d_50 = arg103.getSubterm(0);
                    e_50 = arg102.getSubterm(1);
                    f_50 = arg102.getSubterm(2);
                    g_50 = arg102.getSubterm(3);
                    h_50 = arg102.getSubterm(4);
                    i_50 = arg102.getSubterm(5);
                    term = termFactory.makeTuple(d_50, transform.constCons10);
                    term = conc_0_0.instance.invoke(context, term);
                    if(term == null)
                      break Fail97;
                    j_50 = term;
                    term = gen__ejpscope__method__name_0_2.instance.invoke(context, g_50, r_110, s_110);
                    if(term == null)
                      break Fail97;
                    term = termFactory.makeAppl(transform._consMethodPattern_6, new IStrategoTerm[]{termFactory.makeAppl(transform._consAnnoPattern_1, new IStrategoTerm[]{j_50}), e_50, f_50, term, h_50, i_50});
                    if(true)
                      break Success50;
                  }
                  term = term50;
                  IStrategoTerm term51 = term;
                  Success51:
                  { 
                    Fail98:
                    { 
                      IStrategoTerm u_49 = null;
                      IStrategoTerm v_49 = null;
                      IStrategoTerm w_49 = null;
                      w_49 = term;
                      u_49 = term;
                      term = or_2_0.instance.invoke(context, w_49, lifted63.instance, lifted64.instance);
                      if(term == null)
                        break Fail98;
                      term = u_49;
                      if(term.getTermType() != IStrategoTerm.APPL || transform._consExplicitJoinPointScopePattern_1 != ((IStrategoAppl)term).getConstructor())
                        break Fail98;
                      v_49 = term.getSubterm(0);
                      term = gen__ejpscope__method__name_0_2.instance.invoke(context, v_49, r_110, s_110);
                      if(term == null)
                        break Fail98;
                      term = termFactory.makeAppl(transform._consMethodPattern_6, new IStrategoTerm[]{transform.constAnnoPattern2, transform.constModPattern0, transform.constRefTypePattern0, term, transform.constCons3, transform.constNone0});
                      if(true)
                        break Success51;
                    }
                    term = term51;
                    IStrategoTerm term52 = term;
                    Success52:
                    { 
                      Fail99:
                      { 
                        IStrategoTerm h_49 = null;
                        IStrategoTerm i_49 = null;
                        IStrategoTerm j_49 = null;
                        IStrategoTerm k_49 = null;
                        IStrategoTerm l_49 = null;
                        IStrategoTerm m_49 = null;
                        IStrategoTerm n_49 = null;
                        if(term.getTermType() != IStrategoTerm.APPL || transform._consNotExplicitJoinPointScopePattern_1 != ((IStrategoAppl)term).getConstructor())
                          break Fail99;
                        IStrategoTerm arg109 = term.getSubterm(0);
                        if(arg109.getTermType() != IStrategoTerm.APPL || transform._consMethodPattern_6 != ((IStrategoAppl)arg109).getConstructor())
                          break Fail99;
                        IStrategoTerm arg110 = arg109.getSubterm(0);
                        if(arg110.getTermType() != IStrategoTerm.APPL || transform._consAnnoPattern_1 != ((IStrategoAppl)arg110).getConstructor())
                          break Fail99;
                        h_49 = arg110.getSubterm(0);
                        i_49 = arg109.getSubterm(1);
                        j_49 = arg109.getSubterm(2);
                        k_49 = arg109.getSubterm(3);
                        l_49 = arg109.getSubterm(4);
                        m_49 = arg109.getSubterm(5);
                        term = termFactory.makeTuple(h_49, transform.constCons11);
                        term = conc_0_0.instance.invoke(context, term);
                        if(term == null)
                          break Fail99;
                        n_49 = term;
                        term = gen__ejpscope__method__name_0_2.instance.invoke(context, k_49, r_110, s_110);
                        if(term == null)
                          break Fail99;
                        term = termFactory.makeAppl(transform._consMethodPattern_6, new IStrategoTerm[]{termFactory.makeAppl(transform._consAnnoPattern_1, new IStrategoTerm[]{n_49}), i_49, j_49, term, l_49, m_49});
                        if(true)
                          break Success52;
                      }
                      term = term52;
                      IStrategoTerm term53 = term;
                      Success53:
                      { 
                        Fail100:
                        { 
                          IStrategoTerm w_48 = null;
                          IStrategoTerm x_48 = null;
                          IStrategoTerm z_48 = null;
                          z_48 = term;
                          w_48 = term;
                          term = or_2_0.instance.invoke(context, z_48, lifted65.instance, lifted66.instance);
                          if(term == null)
                            break Fail100;
                          term = w_48;
                          if(term.getTermType() != IStrategoTerm.APPL || transform._consNotExplicitJoinPointScopePattern_1 != ((IStrategoAppl)term).getConstructor())
                            break Fail100;
                          x_48 = term.getSubterm(0);
                          term = gen__ejpscope__method__name_0_2.instance.invoke(context, x_48, r_110, s_110);
                          if(term == null)
                            break Fail100;
                          term = termFactory.makeAppl(transform._consMethodPattern_6, new IStrategoTerm[]{transform.constAnnoPattern3, transform.constModPattern0, transform.constRefTypePattern0, term, transform.constCons3, transform.constNone0});
                          if(true)
                            break Success53;
                        }
                        term = term53;
                        ejp_to_ajc_0_3_fragment_0 ejp_to_ajc_0_3_fragment_00 = new ejp_to_ajc_0_3_fragment_0();
                        ejp_to_ajc_0_3_fragment_00.q_110 = q_110;
                        term = ejp_to_ajc_0_3_fragment_00.invoke(context, term);
                        if(term == null)
                          break Fail92;
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

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm t_110)
    { 
      ITermFactory termFactory = context.getFactory();
      context.push("gen_pointcutargs_pointcuts_0_1");
      Fail101:
      { 
        IStrategoTerm term59 = term;
        Success54:
        { 
          Fail102:
          { 
            TermReference q_52 = new TermReference();
            IStrategoTerm r_52 = null;
            IStrategoTerm u_52 = null;
            IStrategoTerm w_52 = null;
            IStrategoTerm x_52 = null;
            IStrategoTerm s_52 = null;
            if(term.getTermType() != IStrategoTerm.TUPLE || term.getSubtermCount() != 2)
              break Fail102;
            IStrategoTerm arg125 = term.getSubterm(0);
            if(arg125.getTermType() != IStrategoTerm.APPL || transform._consSome_1 != ((IStrategoAppl)arg125).getConstructor())
              break Fail102;
            IStrategoTerm arg126 = arg125.getSubterm(0);
            if(arg126.getTermType() != IStrategoTerm.APPL || transform._consPointcutargsDec_1 != ((IStrategoAppl)arg126).getConstructor())
              break Fail102;
            r_52 = arg126.getSubterm(0);
            u_52 = term.getSubterm(1);
            term = u_52;
            lifted68 lifted680 = new lifted68();
            lifted67 lifted670 = new lifted67();
            lifted680.q_52 = q_52;
            lifted670.q_52 = q_52;
            term = or_2_0.instance.invoke(context, term, lifted670, lifted680);
            if(term == null)
              break Fail102;
            term = t_110;
            w_52 = t_110;
            if(q_52.value == null)
              break Fail102;
            term = q_52.value;
            if(term.getTermType() != IStrategoTerm.APPL || transform._consExplicitJoinPointDeclarator_3 != ((IStrategoAppl)term).getConstructor())
              break Fail102;
            IStrategoTerm arg130 = term.getSubterm(1);
            if(arg130.getTermType() != IStrategoTerm.APPL || transform._consId_1 != ((IStrategoAppl)arg130).getConstructor())
              break Fail102;
            s_52 = arg130.getSubterm(0);
            x_52 = s_52;
            term = map_1_0.instance.invoke(context, r_52, lifted69.instance);
            if(term == null)
              break Fail102;
            term = termFactory.makeAppl(transform._consAspectDec_2, new IStrategoTerm[]{termFactory.makeAppl(transform._consAspectDecHead_6, new IStrategoTerm[]{transform.constCons24, termFactory.makeAppl(transform._consId_1, new IStrategoTerm[]{x_52}), transform.constNone0, transform.constNone0, transform.constNone0, transform.constNone0}), termFactory.makeAppl(transform._consAspectBody_1, new IStrategoTerm[]{term})});
            term = iset_add_0_1.instance.invoke(context, w_52, term);
            if(term == null)
              break Fail102;
            if(true)
              break Success54;
          }
          term = term59;
          if(term.getTermType() != IStrategoTerm.TUPLE || term.getSubtermCount() != 2)
            break Fail101;
          IStrategoTerm arg132 = term.getSubterm(0);
          if(arg132.getTermType() != IStrategoTerm.APPL || transform._consNone_0 != ((IStrategoAppl)arg132).getConstructor())
            break Fail101;
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
      Fail103:
      { 
        IStrategoTerm d_53 = null;
        IStrategoTerm e_53 = null;
        if(term.getTermType() != IStrategoTerm.APPL || transform._consPointcutargDec_2 != ((IStrategoAppl)term).getConstructor())
          break Fail103;
        d_53 = term.getSubterm(0);
        e_53 = term.getSubterm(1);
        term = termFactory.makeAppl(transform._consPointcutDec_2, new IStrategoTerm[]{termFactory.makeAppl(transform._consPointcutDecHead_3, new IStrategoTerm[]{transform.constCons25, d_53, e_53}), transform.constNoPointcutBody0});
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

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm f_53, IStrategoTerm g_53, IStrategoTerm h_53)
    { 
      ITermFactory termFactory = context.getFactory();
      context.push("gen_method_head_0_3");
      Fail104:
      { 
        TermReference i_53 = new TermReference();
        IStrategoTerm j_53 = null;
        TermReference k_53 = new TermReference();
        IStrategoTerm l_53 = null;
        IStrategoTerm m_53 = null;
        IStrategoTerm n_53 = null;
        term = f_53;
        lifted71 lifted711 = new lifted71();
        lifted70 lifted700 = new lifted70();
        lifted711.k_53 = k_53;
        lifted711.i_53 = i_53;
        lifted700.k_53 = k_53;
        lifted700.i_53 = i_53;
        term = or_2_0.instance.invoke(context, term, lifted700, lifted711);
        if(term == null)
          break Fail104;
        if(i_53.value == null)
          break Fail104;
        term = i_53.value;
        if(term.getTermType() != IStrategoTerm.APPL || transform._consExplicitJoinPointDeclarator_3 != ((IStrategoAppl)term).getConstructor())
          break Fail104;
        l_53 = term.getSubterm(0);
        m_53 = term.getSubterm(1);
        n_53 = term.getSubterm(2);
        term = gen_ejp_annotation_0_1.instance.invoke(context, term, g_53);
        if(term == null)
          break Fail104;
        j_53 = term;
        if(k_53.value == null)
          break Fail104;
        term = termFactory.makeAppl(transform._consMethodDecHead_6, new IStrategoTerm[]{(IStrategoTerm)termFactory.makeListCons(j_53, termFactory.makeListCons(k_53.value, (IStrategoList)transform.constCons8)), transform.constNone0, l_53, m_53, n_53, h_53});
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

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm q_53)
    { 
      ITermFactory termFactory = context.getFactory();
      context.push("gen_ejp_annotation_0_1");
      Fail105:
      { 
        term = fetch_handles_list_0_0.instance.invoke(context, q_53);
        if(term == null)
          break Fail105;
        term = map_1_0.instance.invoke(context, term, lifted72.instance);
        if(term == null)
          break Fail105;
        term = termFactory.makeAppl(transform._consAnno_2, new IStrategoTerm[]{transform.constTypeName8, (IStrategoTerm)termFactory.makeListCons(termFactory.makeAppl(transform._consElemValPair_2, new IStrategoTerm[]{transform.constId27, termFactory.makeAppl(transform._consElemValArrayInit_1, new IStrategoTerm[]{term})}), (IStrategoList)transform.constNil0)});
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

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm x_53, IStrategoTerm y_53)
    { 
      ITermFactory termFactory = context.getFactory();
      context.push("gen_method_body_0_2");
      Fail106:
      { 
        Success55:
        { 
          Fail107:
          { 
            IStrategoTerm z_53 = null;
            z_53 = term;
            term = termFactory.makeTuple(x_53, transform.constNone0);
            term = equal_0_0.instance.invoke(context, term);
            if(term == null)
              break Fail107;
            term = z_53;
            { 
              term = get_default_return_value_for_return_type_0_0.instance.invoke(context, y_53);
              if(term == null)
                break Fail106;
              term = termFactory.makeAppl(transform._consBlock_1, new IStrategoTerm[]{(IStrategoTerm)termFactory.makeListCons(termFactory.makeAppl(transform._consReturn_1, new IStrategoTerm[]{term}), (IStrategoList)transform.constNil0)});
              if(true)
                break Success55;
            }
          }
          term = fetch_default_value_0_0.instance.invoke(context, x_53);
          if(term == null)
            break Fail106;
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
      Fail108:
      { 
        IStrategoTerm e_54 = null;
        IStrategoTerm f_54 = null;
        IStrategoTerm i_54 = null;
        e_54 = term;
        i_54 = term;
        f_54 = e_54;
        term = i_54;
        IStrategoTerm term61 = term;
        Success56:
        { 
          Fail109:
          { 
            IStrategoTerm j_54 = null;
            j_54 = term;
            term = f_54;
            if(term.getTermType() != IStrategoTerm.APPL || transform._consVoid_0 != ((IStrategoAppl)term).getConstructor())
              break Fail109;
            term = j_54;
            { 
              term = transform.constNone0;
              if(true)
                break Success56;
            }
          }
          term = term61;
          IStrategoTerm term62 = term;
          Success57:
          { 
            Fail110:
            { 
              IStrategoTerm k_54 = null;
              k_54 = term;
              term = f_54;
              if(term.getTermType() != IStrategoTerm.APPL || transform._consInt_0 != ((IStrategoAppl)term).getConstructor())
                break Fail110;
              term = k_54;
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
              Fail111:
              { 
                IStrategoTerm l_54 = null;
                l_54 = term;
                term = f_54;
                if(term.getTermType() != IStrategoTerm.APPL || transform._consLong_0 != ((IStrategoAppl)term).getConstructor())
                  break Fail111;
                term = l_54;
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
                Fail112:
                { 
                  IStrategoTerm m_54 = null;
                  m_54 = term;
                  term = f_54;
                  if(term.getTermType() != IStrategoTerm.APPL || transform._consShort_0 != ((IStrategoAppl)term).getConstructor())
                    break Fail112;
                  term = m_54;
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
                  Fail113:
                  { 
                    IStrategoTerm n_54 = null;
                    n_54 = term;
                    term = f_54;
                    if(term.getTermType() != IStrategoTerm.APPL || transform._consByte_0 != ((IStrategoAppl)term).getConstructor())
                      break Fail113;
                    term = n_54;
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
                    Fail114:
                    { 
                      IStrategoTerm o_54 = null;
                      o_54 = term;
                      term = f_54;
                      if(term.getTermType() != IStrategoTerm.APPL || transform._consDouble_0 != ((IStrategoAppl)term).getConstructor())
                        break Fail114;
                      term = o_54;
                      { 
                        term = transform.constSome0;
                        if(true)
                          break Success61;
                      }
                    }
                    term = term66;
                    IStrategoTerm term67 = term;
                    Success62:
                    { 
                      Fail115:
                      { 
                        IStrategoTerm p_54 = null;
                        p_54 = term;
                        term = f_54;
                        if(term.getTermType() != IStrategoTerm.APPL || transform._consFloat_0 != ((IStrategoAppl)term).getConstructor())
                          break Fail115;
                        term = p_54;
                        { 
                          term = transform.constSome0;
                          if(true)
                            break Success62;
                        }
                      }
                      term = term67;
                      Success63:
                      { 
                        Fail116:
                        { 
                          IStrategoTerm s_54 = null;
                          s_54 = term;
                          term = f_54;
                          if(term.getTermType() != IStrategoTerm.APPL || transform._consBoolean_0 != ((IStrategoAppl)term).getConstructor())
                            break Fail116;
                          term = s_54;
                          { 
                            term = transform.constSome1;
                            if(true)
                              break Success63;
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
      Fail117:
      { 
        IStrategoTerm term69 = term;
        IStrategoConstructor cons15 = term.getTermType() == IStrategoTerm.APPL ? ((IStrategoAppl)term).getConstructor() : null;
        Success64:
        { 
          if(cons15 == transform._consSome_1)
          { 
            Fail118:
            { 
              IStrategoTerm w_54 = null;
              IStrategoTerm arg135 = term.getSubterm(0);
              if(arg135.getTermType() != IStrategoTerm.APPL || transform._consExplicitJoinPointInitializer_1 != ((IStrategoAppl)arg135).getConstructor())
                break Fail118;
              w_54 = arg135.getSubterm(0);
              term = w_54;
              if(true)
                break Success64;
            }
            term = term69;
          }
          if(cons15 == transform._consNone_0)
          { 
            term = transform.constNone0;
          }
          else
          { 
            break Fail117;
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
      Fail119:
      { 
        IStrategoTerm term70 = term;
        IStrategoConstructor cons16 = term.getTermType() == IStrategoTerm.APPL ? ((IStrategoAppl)term).getConstructor() : null;
        Success65:
        { 
          if(cons16 == transform._consSome_1)
          { 
            Fail120:
            { 
              IStrategoTerm x_54 = null;
              IStrategoTerm arg136 = term.getSubterm(0);
              if(arg136.getTermType() != IStrategoTerm.APPL || transform._consHandles_1 != ((IStrategoAppl)arg136).getConstructor())
                break Fail120;
              x_54 = arg136.getSubterm(0);
              term = x_54;
              if(true)
                break Success65;
            }
            term = term70;
          }
          if(cons16 == transform._consNone_0)
          { 
            term = transform.constNil0;
          }
          else
          { 
            break Fail119;
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
      Fail121:
      { 
        IStrategoTerm term71 = term;
        IStrategoConstructor cons17 = term.getTermType() == IStrategoTerm.APPL ? ((IStrategoAppl)term).getConstructor() : null;
        Success66:
        { 
          if(cons17 == transform._consExplicitJoinPointDeclaration_5)
          { 
            Fail122:
            { 
              term = transform.constNone0;
              if(true)
                break Success66;
            }
            term = term71;
          }
          Success67:
          { 
            if(cons17 == transform._consDecNoMatch_4)
            { 
              Fail123:
              { 
                term = transform.constNone0;
                if(true)
                  break Success67;
              }
              term = term71;
            }
            Success68:
            { 
              if(cons17 == transform._consExplicitJoinPointPattern_1)
              { 
                Fail124:
                { 
                  term = transform.constNone0;
                  if(true)
                    break Success68;
                }
                term = term71;
              }
              Success69:
              { 
                if(cons17 == transform._consNotExplicitJoinPointPattern_1)
                { 
                  Fail125:
                  { 
                    term = transform.constNone0;
                    if(true)
                      break Success69;
                  }
                  term = term71;
                }
                Success70:
                { 
                  if(cons17 == transform._consExplicitJoinPointScopePattern_1)
                  { 
                    Fail126:
                    { 
                      term = transform.constNone0;
                      if(true)
                        break Success70;
                    }
                    term = term71;
                  }
                  if(cons17 == transform._consNotExplicitJoinPointScopePattern_1)
                  { 
                    term = transform.constNone0;
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
      Fail127:
      { 
        IStrategoTerm term76 = term;
        IStrategoConstructor cons18 = term.getTermType() == IStrategoTerm.APPL ? ((IStrategoAppl)term).getConstructor() : null;
        Success71:
        { 
          if(cons18 == transform._consInitExec_1)
          { 
            Fail128:
            { 
              IStrategoTerm n_75 = null;
              n_75 = term.getSubterm(0);
              term = termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{transform.constCons26, (IStrategoTerm)termFactory.makeListCons(transform.constFBOX0, termFactory.makeListCons(transform.constS1, termFactory.makeListCons(n_75, (IStrategoList)transform.constCons27)))});
              if(true)
                break Success71;
            }
            term = term76;
          }
          Success72:
          { 
            if(cons18 == transform._consPreInitExec_1)
            { 
              Fail129:
              { 
                IStrategoTerm m_75 = null;
                m_75 = term.getSubterm(0);
                term = termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{transform.constCons26, (IStrategoTerm)termFactory.makeListCons(transform.constFBOX1, termFactory.makeListCons(transform.constS1, termFactory.makeListCons(m_75, (IStrategoList)transform.constCons27)))});
                if(true)
                  break Success72;
              }
              term = term76;
            }
            Success73:
            { 
              if(cons18 == transform._consStaticInitExec_1)
              { 
                Fail130:
                { 
                  IStrategoTerm l_75 = null;
                  l_75 = term.getSubterm(0);
                  term = termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{transform.constCons26, (IStrategoTerm)termFactory.makeListCons(transform.constFBOX2, termFactory.makeListCons(transform.constS1, termFactory.makeListCons(l_75, (IStrategoList)transform.constCons27)))});
                  if(true)
                    break Success73;
                }
                term = term76;
              }
              Success74:
              { 
                if(cons18 == transform._consGetField_1)
                { 
                  Fail131:
                  { 
                    IStrategoTerm k_75 = null;
                    k_75 = term.getSubterm(0);
                    term = termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{transform.constCons26, (IStrategoTerm)termFactory.makeListCons(transform.constFBOX3, termFactory.makeListCons(transform.constS1, termFactory.makeListCons(k_75, (IStrategoList)transform.constCons27)))});
                    if(true)
                      break Success74;
                  }
                  term = term76;
                }
                Success75:
                { 
                  if(cons18 == transform._consSetField_1)
                  { 
                    Fail132:
                    { 
                      IStrategoTerm j_75 = null;
                      j_75 = term.getSubterm(0);
                      term = termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{transform.constCons26, (IStrategoTerm)termFactory.makeListCons(transform.constFBOX4, termFactory.makeListCons(transform.constS1, termFactory.makeListCons(j_75, (IStrategoList)transform.constCons27)))});
                      if(true)
                        break Success75;
                    }
                    term = term76;
                  }
                  Success76:
                  { 
                    if(cons18 == transform._consHandler_1)
                    { 
                      Fail133:
                      { 
                        IStrategoTerm i_75 = null;
                        i_75 = term.getSubterm(0);
                        term = termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{transform.constCons26, (IStrategoTerm)termFactory.makeListCons(transform.constFBOX5, termFactory.makeListCons(transform.constS1, termFactory.makeListCons(i_75, (IStrategoList)transform.constCons27)))});
                        if(true)
                          break Success76;
                      }
                      term = term76;
                    }
                    Success77:
                    { 
                      if(cons18 == transform._consAdviceExec_0)
                      { 
                        Fail134:
                        { 
                          term = transform.constH0;
                          if(true)
                            break Success77;
                        }
                        term = term76;
                      }
                      Success78:
                      { 
                        if(cons18 == transform._consWithin_1)
                        { 
                          Fail135:
                          { 
                            IStrategoTerm h_75 = null;
                            h_75 = term.getSubterm(0);
                            term = termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{transform.constCons26, (IStrategoTerm)termFactory.makeListCons(transform.constFBOX7, termFactory.makeListCons(transform.constS1, termFactory.makeListCons(h_75, (IStrategoList)transform.constCons27)))});
                            if(true)
                              break Success78;
                          }
                          term = term76;
                        }
                        Success79:
                        { 
                          if(cons18 == transform._consWithinCode_1)
                          { 
                            Fail136:
                            { 
                              IStrategoTerm g_75 = null;
                              g_75 = term.getSubterm(0);
                              term = termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{transform.constCons26, (IStrategoTerm)termFactory.makeListCons(transform.constFBOX8, termFactory.makeListCons(transform.constS1, termFactory.makeListCons(g_75, (IStrategoList)transform.constCons27)))});
                              if(true)
                                break Success79;
                            }
                            term = term76;
                          }
                          Success80:
                          { 
                            if(cons18 == transform._consCFlow_1)
                            { 
                              Fail137:
                              { 
                                IStrategoTerm f_75 = null;
                                f_75 = term.getSubterm(0);
                                term = termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{transform.constCons26, (IStrategoTerm)termFactory.makeListCons(transform.constFBOX9, termFactory.makeListCons(transform.constS1, termFactory.makeListCons(f_75, (IStrategoList)transform.constCons27)))});
                                if(true)
                                  break Success80;
                              }
                              term = term76;
                            }
                            Success81:
                            { 
                              if(cons18 == transform._consCFlowBelow_1)
                              { 
                                Fail138:
                                { 
                                  IStrategoTerm e_75 = null;
                                  e_75 = term.getSubterm(0);
                                  term = termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{transform.constCons26, (IStrategoTerm)termFactory.makeListCons(transform.constFBOX10, termFactory.makeListCons(transform.constS1, termFactory.makeListCons(e_75, (IStrategoList)transform.constCons27)))});
                                  if(true)
                                    break Success81;
                                }
                                term = term76;
                              }
                              Success82:
                              { 
                                if(cons18 == transform._consIf_1)
                                { 
                                  Fail139:
                                  { 
                                    IStrategoTerm d_75 = null;
                                    d_75 = term.getSubterm(0);
                                    term = termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{transform.constCons26, (IStrategoTerm)termFactory.makeListCons(transform.constFBOX11, termFactory.makeListCons(transform.constS1, termFactory.makeListCons(d_75, (IStrategoList)transform.constCons27)))});
                                    if(true)
                                      break Success82;
                                  }
                                  term = term76;
                                }
                                Success83:
                                { 
                                  if(cons18 == transform._consThis_1)
                                  { 
                                    Fail140:
                                    { 
                                      IStrategoTerm c_75 = null;
                                      c_75 = term.getSubterm(0);
                                      term = termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{transform.constCons26, (IStrategoTerm)termFactory.makeListCons(transform.constFBOX12, termFactory.makeListCons(transform.constS1, termFactory.makeListCons(c_75, (IStrategoList)transform.constCons27)))});
                                      if(true)
                                        break Success83;
                                    }
                                    term = term76;
                                  }
                                  Success84:
                                  { 
                                    if(cons18 == transform._consTarget_1)
                                    { 
                                      Fail141:
                                      { 
                                        IStrategoTerm b_75 = null;
                                        b_75 = term.getSubterm(0);
                                        term = termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{transform.constCons26, (IStrategoTerm)termFactory.makeListCons(transform.constFBOX13, termFactory.makeListCons(transform.constS1, termFactory.makeListCons(b_75, (IStrategoList)transform.constCons27)))});
                                        if(true)
                                          break Success84;
                                      }
                                      term = term76;
                                    }
                                    Success85:
                                    { 
                                      if(cons18 == transform._consArgs_1)
                                      { 
                                        Fail142:
                                        { 
                                          IStrategoTerm y_74 = null;
                                          y_74 = term.getSubterm(0);
                                          term = list_to_args_0_0.instance.invoke(context, y_74);
                                          if(term == null)
                                            break Fail142;
                                          term = termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{transform.constCons26, (IStrategoTerm)termFactory.makeListCons(transform.constFBOX14, termFactory.makeListCons(term, (IStrategoList)transform.constNil0))});
                                          if(true)
                                            break Success85;
                                        }
                                        term = term76;
                                      }
                                      Success86:
                                      { 
                                        if(cons18 == transform._consNamedPointcut_2)
                                        { 
                                          Fail143:
                                          { 
                                            IStrategoTerm u_74 = null;
                                            IStrategoTerm v_74 = null;
                                            u_74 = term.getSubterm(0);
                                            v_74 = term.getSubterm(1);
                                            term = list_to_args_0_0.instance.invoke(context, v_74);
                                            if(term == null)
                                              break Fail143;
                                            term = termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{transform.constCons26, (IStrategoTerm)termFactory.makeListCons(u_74, termFactory.makeListCons(term, (IStrategoList)transform.constNil0))});
                                            if(true)
                                              break Success86;
                                          }
                                          term = term76;
                                        }
                                        Success87:
                                        { 
                                          if(cons18 == transform._consAtThis_1)
                                          { 
                                            Fail144:
                                            { 
                                              IStrategoTerm t_74 = null;
                                              t_74 = term.getSubterm(0);
                                              term = termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{transform.constCons26, (IStrategoTerm)termFactory.makeListCons(transform.constS17, termFactory.makeListCons(transform.constS1, termFactory.makeListCons(t_74, (IStrategoList)transform.constCons27)))});
                                              if(true)
                                                break Success87;
                                            }
                                            term = term76;
                                          }
                                          Success88:
                                          { 
                                            if(cons18 == transform._consAtTarget_1)
                                            { 
                                              Fail145:
                                              { 
                                                IStrategoTerm s_74 = null;
                                                s_74 = term.getSubterm(0);
                                                term = termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{transform.constCons26, (IStrategoTerm)termFactory.makeListCons(transform.constS18, termFactory.makeListCons(transform.constS1, termFactory.makeListCons(s_74, (IStrategoList)transform.constCons27)))});
                                                if(true)
                                                  break Success88;
                                              }
                                              term = term76;
                                            }
                                            term = aspectj_to_box_0_0_fragment_3.instance.invoke(context, term);
                                            if(term == null)
                                              break Fail127;
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
      Fail146:
      { 
        IStrategoTerm term94 = term;
        IStrategoConstructor cons19 = term.getTermType() == IStrategoTerm.APPL ? ((IStrategoAppl)term).getConstructor() : null;
        Success89:
        { 
          if(cons19 == transform._consAtWithin_1)
          { 
            Fail147:
            { 
              IStrategoTerm r_74 = null;
              r_74 = term.getSubterm(0);
              term = termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{transform.constCons26, (IStrategoTerm)termFactory.makeListCons(transform.constS19, termFactory.makeListCons(transform.constS1, termFactory.makeListCons(r_74, (IStrategoList)transform.constCons27)))});
              if(true)
                break Success89;
            }
            term = term94;
          }
          Success90:
          { 
            if(cons19 == transform._consAtWithinCode_1)
            { 
              Fail148:
              { 
                IStrategoTerm q_74 = null;
                q_74 = term.getSubterm(0);
                term = termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{transform.constCons26, (IStrategoTerm)termFactory.makeListCons(transform.constS20, termFactory.makeListCons(transform.constS1, termFactory.makeListCons(q_74, (IStrategoList)transform.constCons27)))});
                if(true)
                  break Success90;
              }
              term = term94;
            }
            Success91:
            { 
              if(cons19 == transform._consAtAnno_1)
              { 
                Fail149:
                { 
                  IStrategoTerm p_74 = null;
                  p_74 = term.getSubterm(0);
                  term = termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{transform.constCons26, (IStrategoTerm)termFactory.makeListCons(transform.constS21, termFactory.makeListCons(transform.constS1, termFactory.makeListCons(p_74, (IStrategoList)transform.constCons27)))});
                  if(true)
                    break Success91;
                }
                term = term94;
              }
              Success92:
              { 
                if(cons19 == transform._consAtArgs_1)
                { 
                  Fail150:
                  { 
                    IStrategoTerm k_74 = null;
                    k_74 = term.getSubterm(0);
                    term = list_to_args_0_0.instance.invoke(context, k_74);
                    if(term == null)
                      break Fail150;
                    term = termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{transform.constCons26, (IStrategoTerm)termFactory.makeListCons(transform.constS22, termFactory.makeListCons(term, (IStrategoList)transform.constNil0))});
                    if(true)
                      break Success92;
                  }
                  term = term94;
                }
                Success93:
                { 
                  if(cons19 == transform._consPointcutName_1)
                  { 
                    Fail151:
                    { 
                      IStrategoTerm j_74 = null;
                      j_74 = term.getSubterm(0);
                      term = j_74;
                      if(true)
                        break Success93;
                    }
                    term = term94;
                  }
                  Success94:
                  { 
                    if(cons19 == transform._consPointcutName_2)
                    { 
                      Fail152:
                      { 
                        IStrategoTerm g_74 = null;
                        IStrategoTerm h_74 = null;
                        g_74 = term.getSubterm(0);
                        h_74 = term.getSubterm(1);
                        term = termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{transform.constCons26, (IStrategoTerm)termFactory.makeListCons(g_74, termFactory.makeListCons(transform.constS23, termFactory.makeListCons(h_74, (IStrategoList)transform.constNil0)))});
                        if(true)
                          break Success94;
                      }
                      term = term94;
                    }
                    Success95:
                    { 
                      if(cons19 == transform._consPointcutDec_2)
                      { 
                        Fail153:
                        { 
                          IStrategoTerm d_74 = null;
                          IStrategoTerm e_74 = null;
                          d_74 = term.getSubterm(0);
                          e_74 = term.getSubterm(1);
                          term = termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{transform.constCons30, (IStrategoTerm)termFactory.makeListCons(d_74, termFactory.makeListCons(e_74, (IStrategoList)transform.constNil0))});
                          if(true)
                            break Success95;
                        }
                        term = term94;
                      }
                      Success96:
                      { 
                        if(cons19 == transform._consPointcutDecHead_3)
                        { 
                          Fail154:
                          { 
                            IStrategoTerm t_73 = null;
                            IStrategoTerm u_73 = null;
                            IStrategoTerm w_73 = null;
                            IStrategoTerm y_73 = null;
                            t_73 = term.getSubterm(0);
                            u_73 = term.getSubterm(1);
                            w_73 = term.getSubterm(2);
                            term = list_to_args_0_0.instance.invoke(context, w_73);
                            if(term == null)
                              break Fail154;
                            y_73 = term;
                            term = termFactory.makeTuple(t_73, (IStrategoTerm)termFactory.makeListCons(transform.constFBOX15, termFactory.makeListCons(u_73, termFactory.makeListCons(y_73, (IStrategoList)transform.constNil0))));
                            term = make$Conc_0_0.instance.invoke(context, term);
                            if(term == null)
                              break Fail154;
                            term = termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{transform.constCons30, term});
                            if(true)
                              break Success96;
                          }
                          term = term94;
                        }
                        Success97:
                        { 
                          if(cons19 == transform._consPointcutBody_1)
                          { 
                            Fail155:
                            { 
                              IStrategoTerm s_73 = null;
                              s_73 = term.getSubterm(0);
                              term = termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{transform.constCons26, (IStrategoTerm)termFactory.makeListCons(transform.constS26, termFactory.makeListCons(s_73, (IStrategoList)transform.constCons31))});
                              if(true)
                                break Success97;
                            }
                            term = term94;
                          }
                          Success98:
                          { 
                            if(cons19 == transform._consNoPointcutBody_0)
                            { 
                              Fail156:
                              { 
                                term = transform.constFBOX16;
                                if(true)
                                  break Success98;
                              }
                              term = term94;
                            }
                            Success99:
                            { 
                              if(cons19 == transform._consRefTypePattern_1)
                              { 
                                Fail157:
                                { 
                                  IStrategoTerm r_73 = null;
                                  r_73 = term.getSubterm(0);
                                  term = r_73;
                                  if(true)
                                    break Success99;
                                }
                                term = term94;
                              }
                              Success100:
                              { 
                                if(cons19 == transform._consPrimTypePattern_1)
                                { 
                                  Fail158:
                                  { 
                                    IStrategoTerm q_73 = null;
                                    q_73 = term.getSubterm(0);
                                    term = q_73;
                                    if(true)
                                      break Success100;
                                  }
                                  term = term94;
                                }
                                Success101:
                                { 
                                  if(cons19 == transform._consSubtype_1)
                                  { 
                                    Fail159:
                                    { 
                                      IStrategoTerm p_73 = null;
                                      p_73 = term.getSubterm(0);
                                      term = termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{transform.constCons26, (IStrategoTerm)termFactory.makeListCons(p_73, (IStrategoList)transform.constCons32)});
                                      if(true)
                                        break Success101;
                                    }
                                    term = term94;
                                  }
                                  Success102:
                                  { 
                                    if(cons19 == transform._consGenericTypePattern_2)
                                    { 
                                      Fail160:
                                      { 
                                        IStrategoTerm m_73 = null;
                                        IStrategoTerm n_73 = null;
                                        m_73 = term.getSubterm(0);
                                        n_73 = term.getSubterm(1);
                                        term = termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{transform.constCons26, (IStrategoTerm)termFactory.makeListCons(m_73, termFactory.makeListCons(n_73, (IStrategoList)transform.constNil0))});
                                        if(true)
                                          break Success102;
                                      }
                                      term = term94;
                                    }
                                    Success103:
                                    { 
                                      if(cons19 == transform._consGenericSubtypePattern_2)
                                      { 
                                        Fail161:
                                        { 
                                          IStrategoTerm j_73 = null;
                                          IStrategoTerm l_73 = null;
                                          j_73 = term.getSubterm(0);
                                          l_73 = term.getSubterm(1);
                                          term = termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{transform.constCons26, (IStrategoTerm)termFactory.makeListCons(j_73, termFactory.makeListCons(l_73, (IStrategoList)transform.constCons32))});
                                          if(true)
                                            break Success103;
                                        }
                                        term = term94;
                                      }
                                      Success104:
                                      { 
                                        if(cons19 == transform._consAnnoTypePattern_2)
                                        { 
                                          Fail162:
                                          { 
                                            IStrategoTerm e_73 = null;
                                            IStrategoTerm f_73 = null;
                                            IStrategoTerm arg150 = term.getSubterm(0);
                                            if(arg150.getTermType() != IStrategoTerm.APPL || transform._consAnnoPattern_1 != ((IStrategoAppl)arg150).getConstructor())
                                              break Fail162;
                                            e_73 = arg150.getSubterm(0);
                                            f_73 = term.getSubterm(1);
                                            term = termFactory.makeTuple(e_73, (IStrategoTerm)termFactory.makeListCons(f_73, (IStrategoList)transform.constNil0));
                                            term = make$Conc_0_0.instance.invoke(context, term);
                                            if(term == null)
                                              break Fail162;
                                            term = termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{transform.constCons26, (IStrategoTerm)termFactory.makeListCons(termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{transform.constCons30, term}), (IStrategoList)transform.constNil0)});
                                            if(true)
                                              break Success104;
                                          }
                                          term = term94;
                                        }
                                        Success105:
                                        { 
                                          if(cons19 == transform._consNamePattern_1)
                                          { 
                                            Fail163:
                                            { 
                                              IStrategoTerm d_73 = null;
                                              d_73 = term.getSubterm(0);
                                              term = termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{transform.constCons26, (IStrategoTerm)termFactory.makeListCons(termFactory.makeAppl(transform._consS_1, new IStrategoTerm[]{d_73}), (IStrategoList)transform.constNil0)});
                                              if(true)
                                                break Success105;
                                            }
                                            term = term94;
                                          }
                                          Success106:
                                          { 
                                            if(cons19 == transform._consNamePattern_2)
                                            { 
                                              Fail164:
                                              { 
                                                IStrategoTerm z_72 = null;
                                                IStrategoTerm b_73 = null;
                                                z_72 = term.getSubterm(0);
                                                b_73 = term.getSubterm(1);
                                                term = termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{transform.constCons26, (IStrategoTerm)termFactory.makeListCons(z_72, termFactory.makeListCons(transform.constFBOX17, termFactory.makeListCons(termFactory.makeAppl(transform._consS_1, new IStrategoTerm[]{b_73}), (IStrategoList)transform.constNil0)))});
                                                if(true)
                                                  break Success106;
                                              }
                                              term = term94;
                                            }
                                            Success107:
                                            { 
                                              if(cons19 == transform._consWildcardNamePattern_2)
                                              { 
                                                Fail165:
                                                { 
                                                  IStrategoTerm u_72 = null;
                                                  IStrategoTerm v_72 = null;
                                                  u_72 = term.getSubterm(0);
                                                  v_72 = term.getSubterm(1);
                                                  term = termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{transform.constCons26, (IStrategoTerm)termFactory.makeListCons(u_72, termFactory.makeListCons(transform.constFBOX18, termFactory.makeListCons(termFactory.makeAppl(transform._consS_1, new IStrategoTerm[]{v_72}), (IStrategoList)transform.constNil0)))});
                                                  if(true)
                                                    break Success107;
                                                }
                                                term = term94;
                                              }
                                              Success108:
                                              { 
                                                if(cons19 == transform._consFormalWildcard_0)
                                                { 
                                                  Fail166:
                                                  { 
                                                    term = transform.constS28;
                                                    if(true)
                                                      break Success108;
                                                  }
                                                  term = term94;
                                                }
                                                Success109:
                                                { 
                                                  if(cons19 == transform._consVarArityParamPattern_1)
                                                  { 
                                                    Fail167:
                                                    { 
                                                      IStrategoTerm s_72 = null;
                                                      s_72 = term.getSubterm(0);
                                                      term = termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{transform.constCons30, (IStrategoTerm)termFactory.makeListCons(s_72, (IStrategoList)transform.constCons33)});
                                                      if(true)
                                                        break Success109;
                                                    }
                                                    term = term94;
                                                  }
                                                  Success110:
                                                  { 
                                                    if(cons19 == transform._consRegularTypePattern_1)
                                                    { 
                                                      Fail168:
                                                      { 
                                                        IStrategoTerm r_72 = null;
                                                        r_72 = term.getSubterm(0);
                                                        term = termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{transform.constCons26, (IStrategoTerm)termFactory.makeListCons(r_72, (IStrategoList)transform.constNil0)});
                                                        if(true)
                                                          break Success110;
                                                      }
                                                      term = term94;
                                                    }
                                                    Success111:
                                                    { 
                                                      if(cons19 == transform._consWildcard_0)
                                                      { 
                                                        Fail169:
                                                        { 
                                                          term = transform.constS30;
                                                          if(true)
                                                            break Success111;
                                                        }
                                                        term = term94;
                                                      }
                                                      Success112:
                                                      { 
                                                        if(cons19 == transform._consDotWildcard_0)
                                                        { 
                                                          Fail170:
                                                          { 
                                                            term = transform.constS28;
                                                            if(true)
                                                              break Success112;
                                                          }
                                                          term = term94;
                                                        }
                                                        Success113:
                                                        { 
                                                          if(cons19 == transform._consSimpleNamePattern_1)
                                                          { 
                                                            Fail171:
                                                            { 
                                                              IStrategoTerm q_72 = null;
                                                              q_72 = term.getSubterm(0);
                                                              term = q_72;
                                                              if(true)
                                                                break Success113;
                                                            }
                                                            term = term94;
                                                          }
                                                          Success114:
                                                          { 
                                                            if(cons19 == transform._consMethodPattern_6)
                                                            { 
                                                              Fail172:
                                                              { 
                                                                IStrategoTerm d_69 = null;
                                                                IStrategoTerm k_69 = null;
                                                                IStrategoTerm o_69 = null;
                                                                IStrategoTerm b_70 = null;
                                                                IStrategoTerm l_70 = null;
                                                                IStrategoTerm q_70 = null;
                                                                IStrategoTerm x_70 = null;
                                                                IStrategoTerm g_71 = null;
                                                                IStrategoTerm r_71 = null;
                                                                IStrategoTerm n_72 = null;
                                                                IStrategoTerm arg151 = term.getSubterm(0);
                                                                if(arg151.getTermType() != IStrategoTerm.APPL || transform._consAnnoPattern_1 != ((IStrategoAppl)arg151).getConstructor())
                                                                  break Fail172;
                                                                o_69 = arg151.getSubterm(0);
                                                                IStrategoTerm arg152 = term.getSubterm(1);
                                                                if(arg152.getTermType() != IStrategoTerm.APPL || transform._consModPattern_1 != ((IStrategoAppl)arg152).getConstructor())
                                                                  break Fail172;
                                                                b_70 = arg152.getSubterm(0);
                                                                d_69 = term.getSubterm(2);
                                                                k_69 = term.getSubterm(3);
                                                                q_70 = term.getSubterm(4);
                                                                g_71 = term.getSubterm(5);
                                                                n_72 = term;
                                                                term = termFactory.makeTuple(o_69, b_70);
                                                                term = conc_0_0.instance.invoke(context, term);
                                                                if(term == null)
                                                                  break Fail172;
                                                                l_70 = term;
                                                                term = list_to_args_0_0.instance.invoke(context, q_70);
                                                                if(term == null)
                                                                  break Fail172;
                                                                x_70 = term;
                                                                term = option_to_boxes_0_0.instance.invoke(context, g_71);
                                                                if(term == null)
                                                                  break Fail172;
                                                                r_71 = term;
                                                                term = n_72;
                                                                IStrategoList list2;
                                                                list2 = checkListTail(r_71);
                                                                if(list2 == null)
                                                                  break Fail172;
                                                                term = termFactory.makeTuple(l_70, (IStrategoTerm)termFactory.makeListCons(d_69, termFactory.makeListCons(termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{transform.constCons26, (IStrategoTerm)termFactory.makeListCons(k_69, termFactory.makeListCons(x_70, (IStrategoList)transform.constNil0))}), list2)));
                                                                term = make$Conc_0_0.instance.invoke(context, term);
                                                                if(term == null)
                                                                  break Fail172;
                                                                term = termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{transform.constCons30, term});
                                                                if(true)
                                                                  break Success114;
                                                              }
                                                              term = term94;
                                                            }
                                                            Success115:
                                                            { 
                                                              if(cons19 == transform._consConstrPattern_5)
                                                              { 
                                                                Fail173:
                                                                { 
                                                                  IStrategoTerm f_62 = null;
                                                                  IStrategoTerm g_62 = null;
                                                                  IStrategoTerm l_62 = null;
                                                                  IStrategoTerm w_62 = null;
                                                                  IStrategoTerm j_63 = null;
                                                                  IStrategoTerm y_64 = null;
                                                                  IStrategoTerm b_67 = null;
                                                                  IStrategoTerm arg153 = term.getSubterm(0);
                                                                  if(arg153.getTermType() != IStrategoTerm.APPL || transform._consAnnoPattern_1 != ((IStrategoAppl)arg153).getConstructor())
                                                                    break Fail173;
                                                                  l_62 = arg153.getSubterm(0);
                                                                  IStrategoTerm arg154 = term.getSubterm(1);
                                                                  if(arg154.getTermType() != IStrategoTerm.APPL || transform._consModPattern_1 != ((IStrategoAppl)arg154).getConstructor())
                                                                    break Fail173;
                                                                  w_62 = arg154.getSubterm(0);
                                                                  f_62 = term.getSubterm(2);
                                                                  y_64 = term.getSubterm(3);
                                                                  g_62 = term.getSubterm(4);
                                                                  term = termFactory.makeTuple(l_62, w_62);
                                                                  term = conc_0_0.instance.invoke(context, term);
                                                                  if(term == null)
                                                                    break Fail173;
                                                                  j_63 = term;
                                                                  term = list_to_args_0_0.instance.invoke(context, y_64);
                                                                  if(term == null)
                                                                    break Fail173;
                                                                  b_67 = term;
                                                                  term = termFactory.makeTuple(j_63, (IStrategoTerm)termFactory.makeListCons(termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{transform.constCons26, (IStrategoTerm)termFactory.makeListCons(f_62, termFactory.makeListCons(b_67, (IStrategoList)transform.constNil0))}), termFactory.makeListCons(g_62, (IStrategoList)transform.constNil0)));
                                                                  term = make$Conc_0_0.instance.invoke(context, term);
                                                                  if(term == null)
                                                                    break Fail173;
                                                                  term = termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{transform.constCons30, term});
                                                                  if(true)
                                                                    break Success115;
                                                                }
                                                                term = term94;
                                                              }
                                                              term = aspectj_to_box_0_0_fragment_2.instance.invoke(context, term);
                                                              if(term == null)
                                                                break Fail146;
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
      Fail174:
      { 
        IStrategoTerm term121 = term;
        IStrategoConstructor cons20 = term.getTermType() == IStrategoTerm.APPL ? ((IStrategoAppl)term).getConstructor() : null;
        Success116:
        { 
          if(cons20 == transform._consFieldPattern_4)
          { 
            Fail175:
            { 
              IStrategoTerm w_61 = null;
              IStrategoTerm x_61 = null;
              IStrategoTerm y_61 = null;
              IStrategoTerm z_61 = null;
              IStrategoTerm a_62 = null;
              IStrategoTerm arg155 = term.getSubterm(0);
              if(arg155.getTermType() != IStrategoTerm.APPL || transform._consAnnoPattern_1 != ((IStrategoAppl)arg155).getConstructor())
                break Fail175;
              y_61 = arg155.getSubterm(0);
              IStrategoTerm arg156 = term.getSubterm(1);
              if(arg156.getTermType() != IStrategoTerm.APPL || transform._consModPattern_1 != ((IStrategoAppl)arg156).getConstructor())
                break Fail175;
              z_61 = arg156.getSubterm(0);
              w_61 = term.getSubterm(2);
              x_61 = term.getSubterm(3);
              term = termFactory.makeTuple(y_61, z_61);
              term = conc_0_0.instance.invoke(context, term);
              if(term == null)
                break Fail175;
              a_62 = term;
              term = termFactory.makeTuple(a_62, (IStrategoTerm)termFactory.makeListCons(w_61, termFactory.makeListCons(x_61, (IStrategoList)transform.constNil0)));
              term = make$Conc_0_0.instance.invoke(context, term);
              if(term == null)
                break Fail175;
              term = termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{transform.constCons30, term});
              if(true)
                break Success116;
            }
            term = term121;
          }
          Success117:
          { 
            if(cons20 == transform._consMemberName_1)
            { 
              Fail176:
              { 
                IStrategoTerm v_61 = null;
                v_61 = term.getSubterm(0);
                term = termFactory.makeAppl(transform._consS_1, new IStrategoTerm[]{v_61});
                if(true)
                  break Success117;
              }
              term = term121;
            }
            Success118:
            { 
              if(cons20 == transform._consMemberName_2)
              { 
                Fail177:
                { 
                  IStrategoTerm t_61 = null;
                  IStrategoTerm u_61 = null;
                  t_61 = term.getSubterm(0);
                  u_61 = term.getSubterm(1);
                  term = termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{transform.constCons26, (IStrategoTerm)termFactory.makeListCons(t_61, termFactory.makeListCons(transform.constS23, termFactory.makeListCons(termFactory.makeAppl(transform._consS_1, new IStrategoTerm[]{u_61}), (IStrategoList)transform.constNil0)))});
                  if(true)
                    break Success118;
                }
                term = term121;
              }
              Success119:
              { 
                if(cons20 == transform._consWildcardMemberName_2)
                { 
                  Fail178:
                  { 
                    IStrategoTerm r_61 = null;
                    IStrategoTerm s_61 = null;
                    r_61 = term.getSubterm(0);
                    s_61 = term.getSubterm(1);
                    term = termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{transform.constCons26, (IStrategoTerm)termFactory.makeListCons(r_61, termFactory.makeListCons(transform.constS28, termFactory.makeListCons(termFactory.makeAppl(transform._consS_1, new IStrategoTerm[]{s_61}), (IStrategoList)transform.constNil0)))});
                    if(true)
                      break Success119;
                  }
                  term = term121;
                }
                Success120:
                { 
                  if(cons20 == transform._consConstrName_0)
                  { 
                    Fail179:
                    { 
                      term = transform.constFBOX19;
                      if(true)
                        break Success120;
                    }
                    term = term121;
                  }
                  Success121:
                  { 
                    if(cons20 == transform._consConstrName_1)
                    { 
                      Fail180:
                      { 
                        IStrategoTerm q_61 = null;
                        q_61 = term.getSubterm(0);
                        term = termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{transform.constCons26, (IStrategoTerm)termFactory.makeListCons(q_61, (IStrategoList)transform.constCons35)});
                        if(true)
                          break Success121;
                      }
                      term = term121;
                    }
                    Success122:
                    { 
                      if(cons20 == transform._consWildcardConstrName_1)
                      { 
                        Fail181:
                        { 
                          IStrategoTerm o_61 = null;
                          o_61 = term.getSubterm(0);
                          term = termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{transform.constCons26, (IStrategoTerm)termFactory.makeListCons(o_61, (IStrategoList)transform.constCons36)});
                          if(true)
                            break Success122;
                        }
                        term = term121;
                      }
                      Success123:
                      { 
                        if(cons20 == transform._consNot_1)
                        { 
                          Fail182:
                          { 
                            IStrategoTerm n_61 = null;
                            n_61 = term.getSubterm(0);
                            term = termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{transform.constCons26, (IStrategoTerm)termFactory.makeListCons(transform.constS32, termFactory.makeListCons(n_61, (IStrategoList)transform.constNil0))});
                            if(true)
                              break Success123;
                          }
                          term = term121;
                        }
                        Success124:
                        { 
                          if(cons20 == transform._consModPattern_1)
                          { 
                            Fail183:
                            { 
                              IStrategoTerm m_61 = null;
                              m_61 = term.getSubterm(0);
                              term = termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{transform.constCons30, m_61});
                              if(true)
                                break Success124;
                            }
                            term = term121;
                          }
                          Success125:
                          { 
                            if(cons20 == transform._consThrowsPattern_1)
                            { 
                              Fail184:
                              { 
                                IStrategoTerm j_61 = null;
                                j_61 = term.getSubterm(0);
                                term = separate_by_comma_0_0.instance.invoke(context, j_61);
                                if(term == null)
                                  break Fail184;
                                term = termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{transform.constCons30, (IStrategoTerm)termFactory.makeListCons(transform.constFBOX20, termFactory.makeListCons(term, (IStrategoList)transform.constNil0))});
                                if(true)
                                  break Success125;
                              }
                              term = term121;
                            }
                            Success126:
                            { 
                              if(cons20 == transform._consNotThrowsCondition_1)
                              { 
                                Fail185:
                                { 
                                  IStrategoTerm i_61 = null;
                                  i_61 = term.getSubterm(0);
                                  term = termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{transform.constCons26, (IStrategoTerm)termFactory.makeListCons(transform.constS32, termFactory.makeListCons(i_61, (IStrategoList)transform.constNil0))});
                                  if(true)
                                    break Success126;
                                }
                                term = term121;
                              }
                              Success127:
                              { 
                                if(cons20 == transform._consThrowsCondition_1)
                                { 
                                  Fail186:
                                  { 
                                    IStrategoTerm g_61 = null;
                                    g_61 = term.getSubterm(0);
                                    term = has_leftmost_not_0_0.instance.invoke(context, g_61);
                                    if(term == null)
                                      break Fail186;
                                    term = termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{transform.constCons26, (IStrategoTerm)termFactory.makeListCons(transform.constS1, termFactory.makeListCons(g_61, (IStrategoList)transform.constCons27))});
                                    if(true)
                                      break Success127;
                                  }
                                  term = term121;
                                }
                                Success128:
                                { 
                                  if(cons20 == transform._consThrowsCondition_1)
                                  { 
                                    Fail187:
                                    { 
                                      IStrategoTerm e_61 = null;
                                      e_61 = term.getSubterm(0);
                                      term = e_61;
                                      IStrategoTerm term134 = term;
                                      Success129:
                                      { 
                                        Fail188:
                                        { 
                                          term = has_leftmost_not_0_0.instance.invoke(context, term);
                                          if(term == null)
                                            break Fail188;
                                          { 
                                            if(true)
                                              break Fail187;
                                            if(true)
                                              break Success129;
                                          }
                                        }
                                        term = term134;
                                      }
                                      term = e_61;
                                      if(true)
                                        break Success128;
                                    }
                                    term = term121;
                                  }
                                  Success130:
                                  { 
                                    if(cons20 == transform._consSimpleAnnoPatternExact_1)
                                    { 
                                      Fail189:
                                      { 
                                        IStrategoTerm d_61 = null;
                                        d_61 = term.getSubterm(0);
                                        term = termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{transform.constCons26, (IStrategoTerm)termFactory.makeListCons(transform.constS34, termFactory.makeListCons(d_61, (IStrategoList)transform.constNil0))});
                                        if(true)
                                          break Success130;
                                      }
                                      term = term121;
                                    }
                                    Success131:
                                    { 
                                      if(cons20 == transform._consSimpleAnnoPattern_1)
                                      { 
                                        Fail190:
                                        { 
                                          IStrategoTerm c_61 = null;
                                          c_61 = term.getSubterm(0);
                                          term = termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{transform.constCons26, (IStrategoTerm)termFactory.makeListCons(transform.constS34, termFactory.makeListCons(transform.constS1, termFactory.makeListCons(c_61, (IStrategoList)transform.constCons27)))});
                                          if(true)
                                            break Success131;
                                        }
                                        term = term121;
                                      }
                                      Success132:
                                      { 
                                        if(cons20 == transform._consSimpleAnnoPatternValue_2)
                                        { 
                                          Fail191:
                                          { 
                                            IStrategoTerm a_61 = null;
                                            IStrategoTerm b_61 = null;
                                            a_61 = term.getSubterm(0);
                                            b_61 = term.getSubterm(1);
                                            term = termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{transform.constCons26, (IStrategoTerm)termFactory.makeListCons(transform.constS34, termFactory.makeListCons(a_61, termFactory.makeListCons(transform.constS1, termFactory.makeListCons(b_61, (IStrategoList)transform.constCons27))))});
                                            if(true)
                                              break Success132;
                                          }
                                          term = term121;
                                        }
                                        Success133:
                                        { 
                                          if(cons20 == transform._consNotComp_1)
                                          { 
                                            Fail192:
                                            { 
                                              IStrategoTerm z_60 = null;
                                              z_60 = term.getSubterm(0);
                                              term = termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{transform.constCons26, (IStrategoTerm)termFactory.makeListCons(transform.constS32, termFactory.makeListCons(z_60, (IStrategoList)transform.constNil0))});
                                              if(true)
                                                break Success133;
                                            }
                                            term = term121;
                                          }
                                          Success134:
                                          { 
                                            if(cons20 == transform._consAndComp_2)
                                            { 
                                              Fail193:
                                              { 
                                                IStrategoTerm x_60 = null;
                                                IStrategoTerm y_60 = null;
                                                x_60 = term.getSubterm(0);
                                                y_60 = term.getSubterm(1);
                                                term = termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{transform.constCons30, (IStrategoTerm)termFactory.makeListCons(x_60, termFactory.makeListCons(transform.constS35, termFactory.makeListCons(y_60, (IStrategoList)transform.constNil0)))});
                                                if(true)
                                                  break Success134;
                                              }
                                              term = term121;
                                            }
                                            Success135:
                                            { 
                                              if(cons20 == transform._consOrComp_2)
                                              { 
                                                Fail194:
                                                { 
                                                  IStrategoTerm v_60 = null;
                                                  IStrategoTerm w_60 = null;
                                                  v_60 = term.getSubterm(0);
                                                  w_60 = term.getSubterm(1);
                                                  term = termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{transform.constCons30, (IStrategoTerm)termFactory.makeListCons(v_60, termFactory.makeListCons(transform.constS36, termFactory.makeListCons(w_60, (IStrategoList)transform.constNil0)))});
                                                  if(true)
                                                    break Success135;
                                                }
                                                term = term121;
                                              }
                                              Success136:
                                              { 
                                                if(cons20 == transform._consIntertypeMethodDec_2)
                                                { 
                                                  Fail195:
                                                  { 
                                                    IStrategoTerm t_60 = null;
                                                    IStrategoTerm u_60 = null;
                                                    t_60 = term.getSubterm(0);
                                                    IStrategoTerm arg157 = term.getSubterm(1);
                                                    u_60 = arg157;
                                                    if(arg157.getTermType() != IStrategoTerm.APPL || transform._consBlock_1 != ((IStrategoAppl)arg157).getConstructor())
                                                      break Fail195;
                                                    term = termFactory.makeAppl(transform._consV_2, new IStrategoTerm[]{transform.constCons37, (IStrategoTerm)termFactory.makeListCons(t_60, termFactory.makeListCons(u_60, (IStrategoList)transform.constNil0))});
                                                    if(true)
                                                      break Success136;
                                                  }
                                                  term = term121;
                                                }
                                                Success137:
                                                { 
                                                  if(cons20 == transform._consIntertypeMethodDec_2)
                                                  { 
                                                    Fail196:
                                                    { 
                                                      IStrategoTerm s_60 = null;
                                                      s_60 = term.getSubterm(0);
                                                      IStrategoTerm arg159 = term.getSubterm(1);
                                                      if(arg159.getTermType() != IStrategoTerm.APPL || transform._consNoMethodBody_0 != ((IStrategoAppl)arg159).getConstructor())
                                                        break Fail196;
                                                      term = termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{transform.constCons26, (IStrategoTerm)termFactory.makeListCons(s_60, (IStrategoList)transform.constCons31)});
                                                      if(true)
                                                        break Success137;
                                                    }
                                                    term = term121;
                                                  }
                                                  Success138:
                                                  { 
                                                    if(cons20 == transform._consIntertypeMethodDecHead_8)
                                                    { 
                                                      Fail197:
                                                      { 
                                                        IStrategoTerm y_59 = null;
                                                        IStrategoTerm z_59 = null;
                                                        IStrategoTerm a_60 = null;
                                                        IStrategoTerm b_60 = null;
                                                        IStrategoTerm c_60 = null;
                                                        IStrategoTerm d_60 = null;
                                                        IStrategoTerm e_60 = null;
                                                        IStrategoTerm g_60 = null;
                                                        IStrategoTerm h_60 = null;
                                                        IStrategoTerm i_60 = null;
                                                        IStrategoTerm j_60 = null;
                                                        IStrategoTerm k_60 = null;
                                                        IStrategoTerm m_60 = null;
                                                        IStrategoTerm n_60 = null;
                                                        IStrategoTerm q_60 = null;
                                                        IStrategoTerm r_60 = null;
                                                        j_60 = term.getSubterm(0);
                                                        d_60 = term.getSubterm(1);
                                                        y_59 = term.getSubterm(2);
                                                        z_59 = term.getSubterm(3);
                                                        e_60 = term.getSubterm(4);
                                                        IStrategoTerm arg160 = term.getSubterm(5);
                                                        if(arg160.getTermType() != IStrategoTerm.APPL || transform._consId_1 != ((IStrategoAppl)arg160).getConstructor())
                                                          break Fail197;
                                                        a_60 = arg160.getSubterm(0);
                                                        b_60 = term.getSubterm(6);
                                                        h_60 = term.getSubterm(7);
                                                        n_60 = term;
                                                        term = list_to_args_0_0.instance.invoke(context, b_60);
                                                        if(term == null)
                                                          break Fail197;
                                                        c_60 = term;
                                                        term = type_params_to_boxes_0_0.instance.invoke(context, d_60);
                                                        if(term == null)
                                                          break Fail197;
                                                        k_60 = term;
                                                        term = type_params_to_boxes_0_0.instance.invoke(context, e_60);
                                                        if(term == null)
                                                          break Fail197;
                                                        g_60 = term;
                                                        term = option_to_boxes_0_0.instance.invoke(context, h_60);
                                                        if(term == null)
                                                          break Fail197;
                                                        i_60 = term;
                                                        term = termFactory.makeTuple(j_60, k_60);
                                                        term = conc_0_0.instance.invoke(context, term);
                                                        if(term == null)
                                                          break Fail197;
                                                        m_60 = term;
                                                        term = n_60;
                                                        r_60 = term;
                                                        term = termFactory.makeTuple(g_60, (IStrategoTerm)termFactory.makeListCons(transform.constS23, termFactory.makeListCons(termFactory.makeAppl(transform._consS_1, new IStrategoTerm[]{a_60}), termFactory.makeListCons(c_60, (IStrategoList)transform.constNil0))));
                                                        term = make$Conc_0_0.instance.invoke(context, term);
                                                        if(term == null)
                                                          break Fail197;
                                                        q_60 = term;
                                                        term = r_60;
                                                        IStrategoList list4;
                                                        IStrategoList list3;
                                                        list3 = checkListTail(i_60);
                                                        if(list3 == null)
                                                          break Fail197;
                                                        list4 = checkListTail(q_60);
                                                        if(list4 == null)
                                                          break Fail197;
                                                        term = termFactory.makeTuple(m_60, (IStrategoTerm)termFactory.makeListCons(y_59, termFactory.makeListCons(termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{transform.constCons26, (IStrategoTerm)termFactory.makeListCons(z_59, list4)}), list3)));
                                                        term = make$Conc_0_0.instance.invoke(context, term);
                                                        if(term == null)
                                                          break Fail197;
                                                        term = termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{transform.constCons30, term});
                                                        if(true)
                                                          break Success138;
                                                      }
                                                      term = term121;
                                                    }
                                                    Success139:
                                                    { 
                                                      if(cons20 == transform._consIntertypeConstrDec_2)
                                                      { 
                                                        Fail198:
                                                        { 
                                                          IStrategoTerm w_59 = null;
                                                          IStrategoTerm x_59 = null;
                                                          w_59 = term.getSubterm(0);
                                                          x_59 = term.getSubterm(1);
                                                          term = termFactory.makeAppl(transform._consV_2, new IStrategoTerm[]{transform.constCons37, (IStrategoTerm)termFactory.makeListCons(w_59, termFactory.makeListCons(x_59, (IStrategoList)transform.constNil0))});
                                                          if(true)
                                                            break Success139;
                                                        }
                                                        term = term121;
                                                      }
                                                      term = aspectj_to_box_0_0_fragment_1.instance.invoke(context, term);
                                                      if(term == null)
                                                        break Fail174;
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
      Fail199:
      { 
        IStrategoTerm term145 = term;
        IStrategoConstructor cons21 = term.getTermType() == IStrategoTerm.APPL ? ((IStrategoAppl)term).getConstructor() : null;
        Success140:
        { 
          if(cons21 == transform._consIntertypeConstrDecHead_6)
          { 
            Fail200:
            { 
              IStrategoTerm f_59 = null;
              IStrategoTerm g_59 = null;
              IStrategoTerm h_59 = null;
              IStrategoTerm i_59 = null;
              IStrategoTerm j_59 = null;
              IStrategoTerm k_59 = null;
              IStrategoTerm l_59 = null;
              IStrategoTerm m_59 = null;
              IStrategoTerm n_59 = null;
              IStrategoTerm p_59 = null;
              IStrategoTerm q_59 = null;
              IStrategoTerm r_59 = null;
              IStrategoTerm u_59 = null;
              IStrategoTerm v_59 = null;
              n_59 = term.getSubterm(0);
              i_59 = term.getSubterm(1);
              f_59 = term.getSubterm(2);
              j_59 = term.getSubterm(3);
              g_59 = term.getSubterm(4);
              l_59 = term.getSubterm(5);
              r_59 = term;
              term = list_to_args_0_0.instance.invoke(context, g_59);
              if(term == null)
                break Fail200;
              h_59 = term;
              term = type_params_to_boxes_0_0.instance.invoke(context, i_59);
              if(term == null)
                break Fail200;
              p_59 = term;
              term = type_params_to_boxes_0_0.instance.invoke(context, j_59);
              if(term == null)
                break Fail200;
              k_59 = term;
              term = option_to_boxes_0_0.instance.invoke(context, l_59);
              if(term == null)
                break Fail200;
              m_59 = term;
              term = termFactory.makeTuple(n_59, p_59);
              term = conc_0_0.instance.invoke(context, term);
              if(term == null)
                break Fail200;
              q_59 = term;
              term = r_59;
              v_59 = term;
              term = termFactory.makeTuple(k_59, (IStrategoTerm)termFactory.makeListCons(transform.constS23, termFactory.makeListCons(transform.constFBOX19, termFactory.makeListCons(h_59, (IStrategoList)transform.constNil0))));
              term = make$Conc_0_0.instance.invoke(context, term);
              if(term == null)
                break Fail200;
              u_59 = term;
              term = v_59;
              IStrategoList list6;
              IStrategoList list5;
              list5 = checkListTail(m_59);
              if(list5 == null)
                break Fail200;
              list6 = checkListTail(u_59);
              if(list6 == null)
                break Fail200;
              term = termFactory.makeTuple(q_59, (IStrategoTerm)termFactory.makeListCons(termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{transform.constCons26, (IStrategoTerm)termFactory.makeListCons(f_59, list6)}), list5));
              term = make$Conc_0_0.instance.invoke(context, term);
              if(term == null)
                break Fail200;
              term = termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{transform.constCons30, term});
              if(true)
                break Success140;
            }
            term = term145;
          }
          Success141:
          { 
            if(cons21 == transform._consIntertypeFieldDec_5)
            { 
              Fail201:
              { 
                IStrategoTerm r_58 = null;
                IStrategoTerm t_58 = null;
                IStrategoTerm u_58 = null;
                IStrategoTerm v_58 = null;
                IStrategoTerm w_58 = null;
                IStrategoTerm z_58 = null;
                IStrategoTerm a_59 = null;
                IStrategoTerm d_59 = null;
                IStrategoTerm e_59 = null;
                r_58 = term.getSubterm(0);
                t_58 = term.getSubterm(1);
                u_58 = term.getSubterm(2);
                w_58 = term.getSubterm(3);
                v_58 = term.getSubterm(4);
                a_59 = term;
                term = option_to_boxes_0_0.instance.invoke(context, w_58);
                if(term == null)
                  break Fail201;
                z_58 = term;
                term = a_59;
                e_59 = term;
                term = termFactory.makeTuple(z_58, (IStrategoTerm)termFactory.makeListCons(transform.constS23, termFactory.makeListCons(v_58, (IStrategoList)transform.constCons31)));
                term = make$Conc_0_0.instance.invoke(context, term);
                if(term == null)
                  break Fail201;
                d_59 = term;
                term = e_59;
                IStrategoList list7;
                list7 = checkListTail(d_59);
                if(list7 == null)
                  break Fail201;
                term = termFactory.makeTuple(r_58, (IStrategoTerm)termFactory.makeListCons(t_58, termFactory.makeListCons(termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{transform.constCons26, (IStrategoTerm)termFactory.makeListCons(u_58, list7)}), (IStrategoList)transform.constNil0)));
                term = make$Conc_0_0.instance.invoke(context, term);
                if(term == null)
                  break Fail201;
                term = termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{transform.constCons30, term});
                if(true)
                  break Success141;
              }
              term = term145;
            }
            Success142:
            { 
              if(cons21 == transform._consAdviceDec_5)
              { 
                Fail202:
                { 
                  IStrategoTerm a_58 = null;
                  IStrategoTerm b_58 = null;
                  IStrategoTerm d_58 = null;
                  IStrategoTerm e_58 = null;
                  IStrategoTerm g_58 = null;
                  IStrategoTerm h_58 = null;
                  IStrategoTerm j_58 = null;
                  IStrategoTerm m_58 = null;
                  IStrategoTerm q_58 = null;
                  a_58 = term.getSubterm(0);
                  b_58 = term.getSubterm(1);
                  g_58 = term.getSubterm(2);
                  d_58 = term.getSubterm(3);
                  e_58 = term.getSubterm(4);
                  j_58 = term;
                  term = option_to_boxes_0_0.instance.invoke(context, g_58);
                  if(term == null)
                    break Fail202;
                  h_58 = term;
                  term = j_58;
                  q_58 = term;
                  term = termFactory.makeTuple(h_58, (IStrategoTerm)termFactory.makeListCons(transform.constFBOX21, termFactory.makeListCons(d_58, (IStrategoList)transform.constNil0)));
                  term = make$Conc_0_0.instance.invoke(context, term);
                  if(term == null)
                    break Fail202;
                  m_58 = term;
                  term = q_58;
                  IStrategoList list8;
                  list8 = checkListTail(m_58);
                  if(list8 == null)
                    break Fail202;
                  term = termFactory.makeTuple(a_58, (IStrategoTerm)termFactory.makeListCons(b_58, list8));
                  term = make$Conc_0_0.instance.invoke(context, term);
                  if(term == null)
                    break Fail202;
                  term = termFactory.makeAppl(transform._consV_2, new IStrategoTerm[]{transform.constCons37, (IStrategoTerm)termFactory.makeListCons(termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{transform.constCons30, term}), termFactory.makeListCons(e_58, (IStrategoList)transform.constNil0))});
                  if(true)
                    break Success142;
                }
                term = term145;
              }
              Success143:
              { 
                if(cons21 == transform._consBefore_1)
                { 
                  Fail203:
                  { 
                    IStrategoTerm w_57 = null;
                    w_57 = term.getSubterm(0);
                    term = separate_by_comma_0_0.instance.invoke(context, w_57);
                    if(term == null)
                      break Fail203;
                    term = termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{transform.constCons26, (IStrategoTerm)termFactory.makeListCons(transform.constFBOX24, termFactory.makeListCons(transform.constFBOX23, termFactory.makeListCons(term, (IStrategoList)transform.constCons38)))});
                    if(true)
                      break Success143;
                  }
                  term = term145;
                }
                Success144:
                { 
                  if(cons21 == transform._consAfter_2)
                  { 
                    Fail204:
                    { 
                      IStrategoTerm s_57 = null;
                      IStrategoTerm t_57 = null;
                      t_57 = term.getSubterm(0);
                      s_57 = term.getSubterm(1);
                      term = separate_by_comma_0_0.instance.invoke(context, t_57);
                      if(term == null)
                        break Fail204;
                      term = termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{transform.constCons30, (IStrategoTerm)termFactory.makeListCons(termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{transform.constCons26, (IStrategoTerm)termFactory.makeListCons(transform.constFBOX25, termFactory.makeListCons(transform.constFBOX23, termFactory.makeListCons(term, (IStrategoList)transform.constCons38)))}), termFactory.makeListCons(s_57, (IStrategoList)transform.constNil0))});
                      if(true)
                        break Success144;
                    }
                    term = term145;
                  }
                  Success145:
                  { 
                    if(cons21 == transform._consAround_2)
                    { 
                      Fail205:
                      { 
                        IStrategoTerm o_57 = null;
                        IStrategoTerm p_57 = null;
                        o_57 = term.getSubterm(0);
                        p_57 = term.getSubterm(1);
                        term = separate_by_comma_0_0.instance.invoke(context, p_57);
                        if(term == null)
                          break Fail205;
                        term = termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{transform.constCons30, (IStrategoTerm)termFactory.makeListCons(o_57, termFactory.makeListCons(termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{transform.constCons26, (IStrategoTerm)termFactory.makeListCons(transform.constFBOX26, termFactory.makeListCons(transform.constFBOX23, termFactory.makeListCons(term, (IStrategoList)transform.constCons38)))}), (IStrategoList)transform.constNil0))});
                        if(true)
                          break Success145;
                      }
                      term = term145;
                    }
                    Success146:
                    { 
                      if(cons21 == transform._consReturning_0)
                      { 
                        Fail206:
                        { 
                          term = transform.constFBOX27;
                          if(true)
                            break Success146;
                        }
                        term = term145;
                      }
                      Success147:
                      { 
                        if(cons21 == transform._consReturning_1)
                        { 
                          Fail207:
                          { 
                            IStrategoTerm n_57 = null;
                            n_57 = term.getSubterm(0);
                            term = termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{transform.constCons26, (IStrategoTerm)termFactory.makeListCons(transform.constFBOX27, termFactory.makeListCons(transform.constFBOX23, termFactory.makeListCons(n_57, (IStrategoList)transform.constCons38)))});
                            if(true)
                              break Success147;
                          }
                          term = term145;
                        }
                        Success148:
                        { 
                          if(cons21 == transform._consThrowing_0)
                          { 
                            Fail208:
                            { 
                              term = transform.constFBOX28;
                              if(true)
                                break Success148;
                            }
                            term = term145;
                          }
                          Success149:
                          { 
                            if(cons21 == transform._consThrowing_1)
                            { 
                              Fail209:
                              { 
                                IStrategoTerm m_57 = null;
                                m_57 = term.getSubterm(0);
                                term = termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{transform.constCons26, (IStrategoTerm)termFactory.makeListCons(transform.constFBOX28, termFactory.makeListCons(transform.constFBOX23, termFactory.makeListCons(m_57, (IStrategoList)transform.constCons38)))});
                                if(true)
                                  break Success149;
                              }
                              term = term145;
                            }
                            Success150:
                            { 
                              if(cons21 == transform._consDecParent_3)
                              { 
                                Fail210:
                                { 
                                  IStrategoTerm h_57 = null;
                                  IStrategoTerm i_57 = null;
                                  IStrategoTerm j_57 = null;
                                  h_57 = term.getSubterm(0);
                                  i_57 = term.getSubterm(1);
                                  j_57 = term.getSubterm(2);
                                  term = termFactory.makeTuple(h_57, (IStrategoTerm)termFactory.makeListCons(transform.constFBOX30, termFactory.makeListCons(transform.constFBOX29, termFactory.makeListCons(transform.constFBOX21, termFactory.makeListCons(i_57, termFactory.makeListCons(j_57, (IStrategoList)transform.constCons39))))));
                                  term = make$Conc_0_0.instance.invoke(context, term);
                                  if(term == null)
                                    break Fail210;
                                  term = termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{transform.constCons30, term});
                                  if(true)
                                    break Success150;
                                }
                                term = term145;
                              }
                              Success151:
                              { 
                                if(cons21 == transform._consDecWarning_3)
                                { 
                                  Fail211:
                                  { 
                                    IStrategoTerm a_57 = null;
                                    IStrategoTerm b_57 = null;
                                    IStrategoTerm c_57 = null;
                                    a_57 = term.getSubterm(0);
                                    b_57 = term.getSubterm(1);
                                    c_57 = term.getSubterm(2);
                                    term = termFactory.makeTuple(a_57, (IStrategoTerm)termFactory.makeListCons(transform.constFBOX30, termFactory.makeListCons(transform.constFBOX31, termFactory.makeListCons(transform.constFBOX21, termFactory.makeListCons(b_57, termFactory.makeListCons(transform.constFBOX21, termFactory.makeListCons(c_57, (IStrategoList)transform.constCons39)))))));
                                    term = make$Conc_0_0.instance.invoke(context, term);
                                    if(term == null)
                                      break Fail211;
                                    term = termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{transform.constCons30, term});
                                    if(true)
                                      break Success151;
                                  }
                                  term = term145;
                                }
                                term = aspectj_to_box_0_0_fragment_0.instance.invoke(context, term);
                                if(term == null)
                                  break Fail199;
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
      Fail212:
      { 
        IStrategoTerm term157 = term;
        IStrategoConstructor cons22 = term.getTermType() == IStrategoTerm.APPL ? ((IStrategoAppl)term).getConstructor() : null;
        Success152:
        { 
          if(cons22 == transform._consDecError_2)
          { 
            Fail213:
            { 
              IStrategoTerm y_56 = null;
              IStrategoTerm z_56 = null;
              y_56 = term.getSubterm(0);
              z_56 = term.getSubterm(1);
              term = termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{transform.constCons30, (IStrategoTerm)termFactory.makeListCons(transform.constFBOX30, termFactory.makeListCons(transform.constFBOX32, termFactory.makeListCons(transform.constFBOX21, termFactory.makeListCons(y_56, termFactory.makeListCons(transform.constFBOX21, termFactory.makeListCons(z_56, (IStrategoList)transform.constCons39))))))});
              if(true)
                break Success152;
            }
            term = term157;
          }
          Success153:
          { 
            if(cons22 == transform._consDecSoft_2)
            { 
              Fail214:
              { 
                IStrategoTerm v_56 = null;
                IStrategoTerm x_56 = null;
                v_56 = term.getSubterm(0);
                x_56 = term.getSubterm(1);
                term = termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{transform.constCons30, (IStrategoTerm)termFactory.makeListCons(transform.constFBOX30, termFactory.makeListCons(transform.constFBOX33, termFactory.makeListCons(transform.constFBOX21, termFactory.makeListCons(v_56, termFactory.makeListCons(transform.constFBOX21, termFactory.makeListCons(x_56, (IStrategoList)transform.constCons39))))))});
                if(true)
                  break Success153;
              }
              term = term157;
            }
            Success154:
            { 
              if(cons22 == transform._consDecPrecedence_2)
              { 
                Fail215:
                { 
                  IStrategoTerm o_56 = null;
                  IStrategoTerm p_56 = null;
                  IStrategoTerm q_56 = null;
                  o_56 = term.getSubterm(0);
                  p_56 = term.getSubterm(1);
                  term = separate_by_comma_0_0.instance.invoke(context, p_56);
                  if(term == null)
                    break Fail215;
                  q_56 = term;
                  term = termFactory.makeTuple(o_56, (IStrategoTerm)termFactory.makeListCons(transform.constFBOX30, termFactory.makeListCons(transform.constFBOX34, termFactory.makeListCons(transform.constFBOX21, termFactory.makeListCons(q_56, (IStrategoList)transform.constCons39)))));
                  term = make$Conc_0_0.instance.invoke(context, term);
                  if(term == null)
                    break Fail215;
                  term = termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{transform.constCons30, term});
                  if(true)
                    break Success154;
                }
                term = term157;
              }
              Success155:
              { 
                if(cons22 == transform._consDecAnno_4)
                { 
                  Fail216:
                  { 
                    IStrategoTerm i_56 = null;
                    IStrategoTerm j_56 = null;
                    IStrategoTerm k_56 = null;
                    IStrategoTerm l_56 = null;
                    i_56 = term.getSubterm(0);
                    j_56 = term.getSubterm(1);
                    k_56 = term.getSubterm(2);
                    l_56 = term.getSubterm(3);
                    term = termFactory.makeTuple(i_56, (IStrategoTerm)termFactory.makeListCons(transform.constFBOX30, termFactory.makeListCons(j_56, termFactory.makeListCons(transform.constS26, termFactory.makeListCons(k_56, termFactory.makeListCons(transform.constS26, termFactory.makeListCons(l_56, (IStrategoList)transform.constCons31)))))));
                    term = make$Conc_0_0.instance.invoke(context, term);
                    if(term == null)
                      break Fail216;
                    term = termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{transform.constCons30, term});
                    if(true)
                      break Success155;
                  }
                  term = term157;
                }
                Success156:
                { 
                  if(cons22 == transform._consDecAnnoType_0)
                  { 
                    Fail217:
                    { 
                      term = transform.constS48;
                      if(true)
                        break Success156;
                    }
                    term = term157;
                  }
                  Success157:
                  { 
                    if(cons22 == transform._consDecAnnoConstructor_0)
                    { 
                      Fail218:
                      { 
                        term = transform.constS49;
                        if(true)
                          break Success157;
                      }
                      term = term157;
                    }
                    Success158:
                    { 
                      if(cons22 == transform._consDecAnnoMethod_0)
                      { 
                        Fail219:
                        { 
                          term = transform.constS50;
                          if(true)
                            break Success158;
                        }
                        term = term157;
                      }
                      Success159:
                      { 
                        if(cons22 == transform._consDecAnnoField_0)
                        { 
                          Fail220:
                          { 
                            term = transform.constS51;
                            if(true)
                              break Success159;
                          }
                          term = term157;
                        }
                        Success160:
                        { 
                          if(cons22 == transform._consAspectDec_2)
                          { 
                            Fail221:
                            { 
                              IStrategoTerm e_56 = null;
                              IStrategoTerm f_56 = null;
                              e_56 = term.getSubterm(0);
                              f_56 = term.getSubterm(1);
                              term = termFactory.makeAppl(transform._consV_2, new IStrategoTerm[]{transform.constCons37, (IStrategoTerm)termFactory.makeListCons(e_56, termFactory.makeListCons(f_56, (IStrategoList)transform.constNil0))});
                              if(true)
                                break Success160;
                            }
                            term = term157;
                          }
                          Success161:
                          { 
                            if(cons22 == transform._consAspectDecHead_6)
                            { 
                              Fail222:
                              { 
                                IStrategoTerm g_55 = null;
                                IStrategoTerm h_55 = null;
                                IStrategoTerm i_55 = null;
                                IStrategoTerm j_55 = null;
                                IStrategoTerm k_55 = null;
                                IStrategoTerm n_55 = null;
                                IStrategoTerm o_55 = null;
                                IStrategoTerm p_55 = null;
                                IStrategoTerm q_55 = null;
                                IStrategoTerm r_55 = null;
                                IStrategoTerm s_55 = null;
                                IStrategoTerm x_55 = null;
                                IStrategoTerm y_55 = null;
                                g_55 = term.getSubterm(0);
                                h_55 = term.getSubterm(1);
                                i_55 = term.getSubterm(2);
                                k_55 = term.getSubterm(3);
                                o_55 = term.getSubterm(4);
                                q_55 = term.getSubterm(5);
                                s_55 = term;
                                term = option_to_boxes_0_0.instance.invoke(context, i_55);
                                if(term == null)
                                  break Fail222;
                                j_55 = term;
                                term = option_to_boxes_0_0.instance.invoke(context, k_55);
                                if(term == null)
                                  break Fail222;
                                n_55 = term;
                                term = option_to_boxes_0_0.instance.invoke(context, o_55);
                                if(term == null)
                                  break Fail222;
                                p_55 = term;
                                term = option_to_boxes_0_0.instance.invoke(context, q_55);
                                if(term == null)
                                  break Fail222;
                                r_55 = term;
                                term = s_55;
                                y_55 = term;
                                term = termFactory.makeTuple(p_55, r_55);
                                term = make$Conc_0_0.instance.invoke(context, term);
                                if(term == null)
                                  break Fail222;
                                term = termFactory.makeTuple(n_55, term);
                                term = make$Conc_0_0.instance.invoke(context, term);
                                if(term == null)
                                  break Fail222;
                                term = termFactory.makeTuple(j_55, term);
                                term = make$Conc_0_0.instance.invoke(context, term);
                                if(term == null)
                                  break Fail222;
                                x_55 = term;
                                term = y_55;
                                IStrategoList list9;
                                list9 = checkListTail(x_55);
                                if(list9 == null)
                                  break Fail222;
                                term = termFactory.makeTuple(g_55, (IStrategoTerm)termFactory.makeListCons(transform.constFBOX35, termFactory.makeListCons(h_55, list9)));
                                term = make$Conc_0_0.instance.invoke(context, term);
                                if(term == null)
                                  break Fail222;
                                term = termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{transform.constCons30, term});
                                if(true)
                                  break Success161;
                              }
                              term = term157;
                            }
                            Success162:
                            { 
                              if(cons22 == transform._consPerTarget_1)
                              { 
                                Fail223:
                                { 
                                  IStrategoTerm f_55 = null;
                                  f_55 = term.getSubterm(0);
                                  term = termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{transform.constCons26, (IStrategoTerm)termFactory.makeListCons(transform.constFBOX36, termFactory.makeListCons(transform.constS1, termFactory.makeListCons(f_55, (IStrategoList)transform.constCons27)))});
                                  if(true)
                                    break Success162;
                                }
                                term = term157;
                              }
                              Success163:
                              { 
                                if(cons22 == transform._consPerThis_1)
                                { 
                                  Fail224:
                                  { 
                                    IStrategoTerm e_55 = null;
                                    e_55 = term.getSubterm(0);
                                    term = termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{transform.constCons26, (IStrategoTerm)termFactory.makeListCons(transform.constFBOX37, termFactory.makeListCons(transform.constS1, termFactory.makeListCons(e_55, (IStrategoList)transform.constCons27)))});
                                    if(true)
                                      break Success163;
                                  }
                                  term = term157;
                                }
                                Success164:
                                { 
                                  if(cons22 == transform._consPerCFlow_1)
                                  { 
                                    Fail225:
                                    { 
                                      IStrategoTerm d_55 = null;
                                      d_55 = term.getSubterm(0);
                                      term = termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{transform.constCons26, (IStrategoTerm)termFactory.makeListCons(transform.constFBOX38, termFactory.makeListCons(transform.constS1, termFactory.makeListCons(d_55, (IStrategoList)transform.constCons27)))});
                                      if(true)
                                        break Success164;
                                    }
                                    term = term157;
                                  }
                                  Success165:
                                  { 
                                    if(cons22 == transform._consPerCFlowBelow_1)
                                    { 
                                      Fail226:
                                      { 
                                        IStrategoTerm a_55 = null;
                                        a_55 = term.getSubterm(0);
                                        term = termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{transform.constCons26, (IStrategoTerm)termFactory.makeListCons(transform.constFBOX39, termFactory.makeListCons(transform.constS1, termFactory.makeListCons(a_55, (IStrategoList)transform.constCons27)))});
                                        if(true)
                                          break Success165;
                                      }
                                      term = term157;
                                    }
                                    Success166:
                                    { 
                                      if(cons22 == transform._consPerTypeWithin_1)
                                      { 
                                        Fail227:
                                        { 
                                          IStrategoTerm z_54 = null;
                                          z_54 = term.getSubterm(0);
                                          term = termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{transform.constCons26, (IStrategoTerm)termFactory.makeListCons(transform.constFBOX40, termFactory.makeListCons(transform.constS1, termFactory.makeListCons(z_54, (IStrategoList)transform.constCons27)))});
                                          if(true)
                                            break Success166;
                                        }
                                        term = term157;
                                      }
                                      Success167:
                                      { 
                                        if(cons22 == transform._consIsSingleton_0)
                                        { 
                                          Fail228:
                                          { 
                                            term = transform.constFBOX41;
                                            if(true)
                                              break Success167;
                                          }
                                          term = term157;
                                        }
                                        Success168:
                                        { 
                                          if(cons22 == transform._consAspectBody_1)
                                          { 
                                            Fail229:
                                            { 
                                              IStrategoTerm y_54 = null;
                                              y_54 = term.getSubterm(0);
                                              term = termFactory.makeAppl(transform._consV_2, new IStrategoTerm[]{transform.constNil0, (IStrategoTerm)termFactory.makeListCons(termFactory.makeAppl(transform._consV_2, new IStrategoTerm[]{transform.constCons42, (IStrategoTerm)termFactory.makeListCons(transform.constFBOX43, termFactory.makeListCons(termFactory.makeAppl(transform._consV_2, new IStrategoTerm[]{transform.constCons43, y_54}), (IStrategoList)transform.constNil0))}), (IStrategoList)transform.constCons40)});
                                              if(true)
                                                break Success168;
                                            }
                                            term = term157;
                                          }
                                          Success169:
                                          { 
                                            if(cons22 == transform._consPrivileged_0)
                                            { 
                                              Fail230:
                                              { 
                                                term = transform.constFBOX44;
                                                if(true)
                                                  break Success169;
                                              }
                                              term = term157;
                                            }
                                            if(cons22 == transform._consProceed_0)
                                            { 
                                              term = transform.constFBOX45;
                                            }
                                            else
                                            { 
                                              break Fail212;
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
      Fail231:
      { 
        IStrategoTerm term175 = term;
        IStrategoConstructor cons23 = term.getTermType() == IStrategoTerm.APPL ? ((IStrategoAppl)term).getConstructor() : null;
        Success170:
        { 
          if(cons23 == transform._consCall_1)
          { 
            Fail232:
            { 
              IStrategoTerm p_75 = null;
              p_75 = term.getSubterm(0);
              term = termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{transform.constCons26, (IStrategoTerm)termFactory.makeListCons(transform.constFBOX46, termFactory.makeListCons(transform.constS1, termFactory.makeListCons(p_75, (IStrategoList)transform.constCons27)))});
              if(true)
                break Success170;
            }
            term = term175;
          }
          Success171:
          { 
            if(cons23 == transform._consExec_1)
            { 
              Fail233:
              { 
                IStrategoTerm o_75 = null;
                o_75 = term.getSubterm(0);
                term = termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{transform.constCons26, (IStrategoTerm)termFactory.makeListCons(transform.constFBOX47, termFactory.makeListCons(transform.constS1, termFactory.makeListCons(o_75, (IStrategoList)transform.constCons27)))});
                if(true)
                  break Success171;
              }
              term = term175;
            }
            term = aspectj_to_box_0_0_fragment_4.instance.invoke(context, term);
            if(term == null)
              break Fail231;
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
      Fail234:
      { 
        term = q_75.instance.invoke(context, term);
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

  @SuppressWarnings("all") public static class option_to_boxes_0_0 extends Strategy 
  { 
    public static option_to_boxes_0_0 instance = new option_to_boxes_0_0();

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      ITermFactory termFactory = context.getFactory();
      Fail235:
      { 
        IStrategoTerm term179 = term;
        IStrategoConstructor cons24 = term.getTermType() == IStrategoTerm.APPL ? ((IStrategoAppl)term).getConstructor() : null;
        Success172:
        { 
          if(cons24 == transform._consSome_1)
          { 
            Fail236:
            { 
              IStrategoTerm r_75 = null;
              r_75 = term.getSubterm(0);
              term = r_75;
              term = (IStrategoTerm)termFactory.makeListCons(term, (IStrategoList)transform.constNil0);
              if(true)
                break Success172;
            }
            term = term179;
          }
          if(cons24 == transform._consNone_0)
          { 
            term = transform.constNil0;
          }
          else
          { 
            break Fail235;
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
      Fail237:
      { 
        IStrategoTerm v_75 = null;
        term = pp_java5_to_abox_1_0.instance.invoke(context, term, lifted76.instance);
        if(term == null)
          break Fail237;
        v_75 = term;
        term = box2text_string_0_1.instance.invoke(context, v_75, transform.const111);
        if(term == null)
          break Fail237;
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
      Fail238:
      { 
        term = handle_io_0_0.instance.invoke(context, term);
        if(term == null)
          break Fail238;
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
      Fail239:
      { 
        IStrategoTerm b_76 = null;
        IStrategoTerm d_76 = null;
        IStrategoTerm e_76 = null;
        IStrategoTerm i_76 = null;
        IStrategoTerm p_76 = null;
        IStrategoTerm x_76 = null;
        IStrategoTerm a_77 = null;
        IStrategoTerm b_77 = null;
        if(term.getTermType() != IStrategoTerm.LIST || ((IStrategoList)term).isEmpty())
          break Fail239;
        b_76 = ((IStrategoList)term).tail();
        term = debug_0_0.instance.invoke(context, b_76);
        if(term == null)
          break Fail239;
        term = b_76;
        if(term.getTermType() != IStrategoTerm.LIST || ((IStrategoList)term).isEmpty())
          break Fail239;
        i_76 = ((IStrategoList)term).head();
        term = i_76;
        d_76 = i_76;
        term = $Read$From$File_0_0.instance.invoke(context, term);
        if(term == null)
          break Fail239;
        term = b_76;
        if(term.getTermType() != IStrategoTerm.LIST || ((IStrategoList)term).isEmpty())
          break Fail239;
        p_76 = ((IStrategoList)term).tail();
        term = p_76;
        if(term.getTermType() != IStrategoTerm.LIST || ((IStrategoList)term).isEmpty())
          break Fail239;
        term = transform_0_0.instance.invoke(context, d_76);
        if(term == null)
          break Fail239;
        e_76 = term;
        a_77 = d_76;
        x_76 = transform.const112;
        b_77 = a_77;
        term = string_replace_0_2.instance.invoke(context, b_77, x_76, transform.const113);
        if(term == null)
          break Fail239;
        term = termFactory.makeTuple(term, transform.const114);
        term = fopen_0_0.instance.invoke(context, term);
        if(term == null)
          break Fail239;
        term = termFactory.makeTuple(e_76, term);
        term = fputs_0_0.instance.invoke(context, term);
        if(term == null)
          break Fail239;
        term = fclose_0_0.instance.invoke(context, term);
        if(term == null)
          break Fail239;
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
      Fail240:
      { 
        IStrategoTerm l_77 = null;
        IStrategoTerm r_77 = null;
        IStrategoTerm u_77 = null;
        l_77 = term;
        r_77 = l_77;
        u_77 = transform.constEjpTbl;
        term = parse_file_0_1.instance.invoke(context, r_77, u_77);
        if(term == null)
          break Fail240;
        term = topdown_1_0.instance.invoke(context, term, lifted77.instance);
        if(term == null)
          break Fail240;
        term = transform_ast_0_0.instance.invoke(context, term);
        if(term == null)
          break Fail240;
        term = pp_aspectj_string_0_0.instance.invoke(context, term);
        if(term == null)
          break Fail240;
        context.popOnSuccess();
        if(true)
          return term;
      }
      context.popOnFailure();
      return null;
    }
  }

  @SuppressWarnings("all") public static class transform_ast_0_0 extends Strategy 
  { 
    public static transform_ast_0_0 instance = new transform_ast_0_0();

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      context.push("transform_ast_0_0");
      Fail241:
      { 
        term = try_1_0.instance.invoke(context, term, ejp_converter_compilation_unit_0_0.instance);
        if(term == null)
          break Fail241;
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
      Fail242:
      { 
        IStrategoTerm i_78 = null;
        IStrategoTerm j_78 = null;
        IStrategoTerm k_78 = null;
        IStrategoTerm l_78 = null;
        TermReference p_78 = new TermReference();
        IStrategoTerm r_78 = null;
        IStrategoTerm s_78 = null;
        IStrategoTerm x_78 = null;
        if(term.getTermType() != IStrategoTerm.APPL || transform._consCompilationUnit_3 != ((IStrategoAppl)term).getConstructor())
          break Fail242;
        j_78 = term.getSubterm(0);
        k_78 = term.getSubterm(1);
        r_78 = term.getSubterm(2);
        x_78 = term;
        IStrategoTerm term181 = term;
        Success173:
        { 
          Fail243:
          { 
            IStrategoTerm term182 = term;
            Success174:
            { 
              Fail244:
              { 
                IStrategoTerm t_78 = null;
                IStrategoTerm y_78 = null;
                t_78 = term;
                term = SRTS_all.instance.invoke(context, r_78, lifted79.instance);
                if(term == null)
                  break Fail244;
                y_78 = term;
                i_78 = r_78;
                term = y_78;
                if(term != i_78 && !i_78.match(term))
                  break Fail244;
                term = t_78;
                { 
                  l_78 = k_78;
                  term = r_78;
                  s_78 = r_78;
                  if(true)
                    break Success174;
                }
              }
              term = term182;
              Success175:
              { 
                Fail245:
                { 
                  IStrategoTerm u_78 = null;
                  u_78 = term;
                  term = j_78;
                  if(term.getTermType() != IStrategoTerm.APPL || transform._consSome_1 != ((IStrategoAppl)term).getConstructor())
                    break Fail245;
                  IStrategoTerm arg161 = term.getSubterm(0);
                  if(arg161.getTermType() != IStrategoTerm.APPL || transform._consPackageDec_2 != ((IStrategoAppl)arg161).getConstructor())
                    break Fail245;
                  term = u_78;
                  { 
                    term = j_78;
                    if(term.getTermType() != IStrategoTerm.APPL || transform._consSome_1 != ((IStrategoAppl)term).getConstructor())
                      break Fail243;
                    IStrategoTerm arg164 = term.getSubterm(0);
                    if(arg164.getTermType() != IStrategoTerm.APPL || transform._consPackageDec_2 != ((IStrategoAppl)arg164).getConstructor())
                      break Fail243;
                    if(p_78.value == null)
                      p_78.value = arg164.getSubterm(1);
                    else
                      if(p_78.value != arg164.getSubterm(1) && !p_78.value.match(arg164.getSubterm(1)))
                        break Fail243;
                    if(true)
                      break Success175;
                  }
                }
                term = transform.constNone0;
                if(p_78.value == null)
                  p_78.value = term;
                else
                  if(p_78.value != term && !p_78.value.match(term))
                    break Fail243;
              }
              term = termFactory.makeTuple(k_78, transform.constCons46);
              term = conc_0_0.instance.invoke(context, term);
              if(term == null)
                break Fail243;
              l_78 = term;
              term = r_78;
              lifted81 lifted810 = new lifted81();
              lifted810.p_78 = p_78;
              term = SRTS_all.instance.invoke(context, term, lifted810);
              if(term == null)
                break Fail243;
              s_78 = term;
            }
            if(true)
              break Success173;
          }
          term = term181;
          IStrategoTerm v_78 = null;
          IStrategoTerm w_78 = null;
          IStrategoTerm c_79 = null;
          v_78 = term;
          term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
          if(term == null)
            break Fail242;
          w_78 = term;
          c_79 = v_78;
          term = report_with_failure_0_2.instance.invoke(context, c_79, transform.const117, w_78);
          if(term == null)
            break Fail242;
        }
        term = x_78;
        if(l_78 == null || s_78 == null)
          break Fail242;
        term = termFactory.makeAppl(transform._consCompilationUnit_3, new IStrategoTerm[]{j_78, l_78, s_78});
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
      Fail246:
      { 
        IStrategoTerm term184 = term;
        IStrategoConstructor cons25 = term.getTermType() == IStrategoTerm.APPL ? ((IStrategoAppl)term).getConstructor() : null;
        Success176:
        { 
          if(cons25 == transform._consClassDec_2)
          { 
            Fail247:
            { 
              IStrategoTerm x_79 = null;
              IStrategoTerm y_79 = null;
              IStrategoTerm z_79 = null;
              IStrategoTerm c_80 = null;
              x_79 = term.getSubterm(0);
              y_79 = term.getSubterm(1);
              c_80 = term;
              IStrategoTerm term185 = term;
              Success177:
              { 
                Fail248:
                { 
                  term = termFactory.makeAppl(transform._consClassDec_2, new IStrategoTerm[]{x_79, y_79});
                  term = topdown_1_0.instance.invoke(context, term, lifted83.instance);
                  if(term == null)
                    break Fail248;
                  z_79 = term;
                  if(true)
                    break Success177;
                }
                term = term185;
                IStrategoTerm a_80 = null;
                IStrategoTerm b_80 = null;
                IStrategoTerm e_80 = null;
                a_80 = term;
                term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
                if(term == null)
                  break Fail247;
                b_80 = term;
                e_80 = a_80;
                term = report_with_failure_0_2.instance.invoke(context, e_80, transform.const118, b_80);
                if(term == null)
                  break Fail247;
              }
              term = c_80;
              if(z_79 == null)
                break Fail247;
              term = z_79;
              if(true)
                break Success176;
            }
            term = term184;
          }
          if(cons25 == transform._consAspectDec_2)
          { 
            IStrategoTerm h_79 = null;
            IStrategoTerm j_79 = null;
            IStrategoTerm k_79 = null;
            IStrategoTerm p_79 = null;
            h_79 = term.getSubterm(0);
            j_79 = term.getSubterm(1);
            p_79 = term;
            IStrategoTerm term187 = term;
            Success178:
            { 
              Fail249:
              { 
                term = termFactory.makeAppl(transform._consAspectDec_2, new IStrategoTerm[]{h_79, j_79});
                term = topdown_1_0.instance.invoke(context, term, lifted85.instance);
                if(term == null)
                  break Fail249;
                k_79 = term;
                if(true)
                  break Success178;
              }
              term = term187;
              IStrategoTerm n_79 = null;
              IStrategoTerm o_79 = null;
              IStrategoTerm u_79 = null;
              n_79 = term;
              term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
              if(term == null)
                break Fail246;
              o_79 = term;
              u_79 = n_79;
              term = report_with_failure_0_2.instance.invoke(context, u_79, transform.const118, o_79);
              if(term == null)
                break Fail246;
            }
            term = p_79;
            if(k_79 == null)
              break Fail246;
            term = k_79;
          }
          else
          { 
            break Fail246;
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

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm ref_u_110)
    { 
      ITermFactory termFactory = context.getFactory();
      TermReference u_110 = new TermReference(ref_u_110);
      context.push("ejp_converter_aspect_or_class_0_1");
      Fail250:
      { 
        IStrategoTerm term188 = term;
        Success179:
        { 
          Fail251:
          { 
            IStrategoTerm v_80 = null;
            TermReference a_81 = new TermReference();
            IStrategoTerm b_81 = null;
            TermReference c_81 = new TermReference();
            IStrategoTerm d_81 = null;
            IStrategoTerm g_81 = null;
            if(term.getTermType() != IStrategoTerm.APPL || transform._consAspectDec_2 != ((IStrategoAppl)term).getConstructor())
              break Fail251;
            v_80 = term.getSubterm(0);
            IStrategoTerm arg171 = term.getSubterm(1);
            if(arg171.getTermType() != IStrategoTerm.APPL || transform._consAspectBody_1 != ((IStrategoAppl)arg171).getConstructor())
              break Fail251;
            b_81 = arg171.getSubterm(0);
            g_81 = term;
            IStrategoTerm term189 = term;
            Success180:
            { 
              Fail252:
              { 
                IStrategoTerm l_81 = null;
                IStrategoTerm n_81 = null;
                term = v_80;
                if(term.getTermType() != IStrategoTerm.APPL || transform._consAspectDecHead_6 != ((IStrategoAppl)term).getConstructor())
                  break Fail252;
                IStrategoTerm arg173 = term.getSubterm(1);
                if(arg173.getTermType() != IStrategoTerm.APPL || transform._consId_1 != ((IStrategoAppl)arg173).getConstructor())
                  break Fail252;
                if(a_81.value == null)
                  a_81.value = arg173.getSubterm(0);
                else
                  if(a_81.value != arg173.getSubterm(0) && !a_81.value.match(arg173.getSubterm(0)))
                    break Fail252;
                term = new_iset_0_0.instance.invoke(context, term);
                if(term == null)
                  break Fail252;
                if(c_81.value == null)
                  c_81.value = term;
                else
                  if(c_81.value != term && !c_81.value.match(term))
                    break Fail252;
                n_81 = term;
                term = b_81;
                lifted87 lifted870 = new lifted87();
                lifted870.c_81 = c_81;
                lifted870.u_110 = u_110;
                lifted870.a_81 = a_81;
                term = topdown_1_0.instance.invoke(context, term, lifted870);
                if(term == null)
                  break Fail252;
                l_81 = term;
                term = n_81;
                if(c_81.value == null)
                  break Fail252;
                term = iset_elements_0_0.instance.invoke(context, c_81.value);
                if(term == null)
                  break Fail252;
                term = termFactory.makeTuple(l_81, term);
                term = conc_0_0.instance.invoke(context, term);
                if(term == null)
                  break Fail252;
                term = termFactory.makeAppl(transform._consAspectBody_1, new IStrategoTerm[]{term});
                d_81 = term;
                if(true)
                  break Success180;
              }
              term = term189;
              IStrategoTerm e_81 = null;
              IStrategoTerm f_81 = null;
              IStrategoTerm r_81 = null;
              e_81 = term;
              term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
              if(term == null)
                break Fail251;
              f_81 = term;
              r_81 = e_81;
              term = report_with_failure_0_2.instance.invoke(context, r_81, transform.const119, f_81);
              if(term == null)
                break Fail251;
            }
            term = g_81;
            if(d_81 == null)
              break Fail251;
            term = termFactory.makeAppl(transform._consAspectDec_2, new IStrategoTerm[]{v_80, d_81});
            if(true)
              break Success179;
          }
          term = term188;
          IStrategoTerm k_80 = null;
          IStrategoTerm l_80 = null;
          IStrategoTerm m_80 = null;
          IStrategoTerm p_80 = null;
          if(term.getTermType() != IStrategoTerm.APPL || transform._consClassDec_2 != ((IStrategoAppl)term).getConstructor())
            break Fail250;
          k_80 = term.getSubterm(0);
          l_80 = term.getSubterm(1);
          p_80 = term;
          IStrategoTerm term190 = term;
          Success181:
          { 
            Fail253:
            { 
              term = termFactory.makeAppl(transform._consClassDec_2, new IStrategoTerm[]{k_80, l_80});
              term = ejp_to_java2_0_0.instance.invoke(context, term);
              if(term == null)
                break Fail253;
              m_80 = term;
              if(true)
                break Success181;
            }
            term = term190;
            IStrategoTerm n_80 = null;
            IStrategoTerm o_80 = null;
            IStrategoTerm r_80 = null;
            n_80 = term;
            term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
            if(term == null)
              break Fail250;
            o_80 = term;
            r_80 = n_80;
            term = report_with_failure_0_2.instance.invoke(context, r_80, transform.const119, o_80);
            if(term == null)
              break Fail250;
          }
          term = p_80;
          if(m_80 == null)
            break Fail250;
          term = m_80;
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

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy f_83, Strategy m_83)
    { 
      ITermFactory termFactory = context.getFactory();
      context.push("OrComp_2_0");
      Fail254:
      { 
        IStrategoTerm k_239 = null;
        IStrategoTerm i_239 = null;
        IStrategoTerm j_239 = null;
        IStrategoTerm l_239 = null;
        if(term.getTermType() != IStrategoTerm.APPL || transform._consOrComp_2 != ((IStrategoAppl)term).getConstructor())
          break Fail254;
        i_239 = term.getSubterm(0);
        j_239 = term.getSubterm(1);
        IStrategoList annos2 = term.getAnnotations();
        k_239 = annos2;
        term = f_83.invoke(context, i_239);
        if(term == null)
          break Fail254;
        l_239 = term;
        term = m_83.invoke(context, j_239);
        if(term == null)
          break Fail254;
        term = termFactory.annotateTerm(termFactory.makeAppl(transform._consOrComp_2, new IStrategoTerm[]{l_239, term}), checkListAnnos(termFactory, k_239));
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

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy n_83, Strategy s_83)
    { 
      ITermFactory termFactory = context.getFactory();
      context.push("AndComp_2_0");
      Fail255:
      { 
        IStrategoTerm q_239 = null;
        IStrategoTerm o_239 = null;
        IStrategoTerm p_239 = null;
        IStrategoTerm t_239 = null;
        if(term.getTermType() != IStrategoTerm.APPL || transform._consAndComp_2 != ((IStrategoAppl)term).getConstructor())
          break Fail255;
        o_239 = term.getSubterm(0);
        p_239 = term.getSubterm(1);
        IStrategoList annos3 = term.getAnnotations();
        q_239 = annos3;
        term = n_83.invoke(context, o_239);
        if(term == null)
          break Fail255;
        t_239 = term;
        term = s_83.invoke(context, p_239);
        if(term == null)
          break Fail255;
        term = termFactory.annotateTerm(termFactory.makeAppl(transform._consAndComp_2, new IStrategoTerm[]{t_239, term}), checkListAnnos(termFactory, q_239));
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

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy u_83)
    { 
      ITermFactory termFactory = context.getFactory();
      context.push("NotComp_1_0");
      Fail256:
      { 
        IStrategoTerm w_239 = null;
        IStrategoTerm v_239 = null;
        if(term.getTermType() != IStrategoTerm.APPL || transform._consNotComp_1 != ((IStrategoAppl)term).getConstructor())
          break Fail256;
        v_239 = term.getSubterm(0);
        IStrategoList annos4 = term.getAnnotations();
        w_239 = annos4;
        term = u_83.invoke(context, v_239);
        if(term == null)
          break Fail256;
        term = termFactory.annotateTerm(termFactory.makeAppl(transform._consNotComp_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, w_239));
        context.popOnSuccess();
        if(true)
          return term;
      }
      context.popOnFailure();
      return null;
    }
  }

  @SuppressWarnings("all") private static final class lifted87 extends Strategy 
  { 
    TermReference c_81;

    TermReference u_110;

    TermReference a_81;

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      Fail257:
      { 
        lifted88 lifted880 = new lifted88();
        lifted880.c_81 = c_81;
        lifted880.u_110 = u_110;
        lifted880.a_81 = a_81;
        term = try_1_0.instance.invoke(context, term, lifted880);
        if(term == null)
          break Fail257;
        if(true)
          return term;
      }
      return null;
    }
  }

  @SuppressWarnings("all") private static final class lifted88 extends Strategy 
  { 
    TermReference c_81;

    TermReference u_110;

    TermReference a_81;

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      Fail258:
      { 
        term = ejp_to_ajc_0_3.instance.invoke(context, term, c_81.value, u_110.value, a_81.value);
        if(term == null)
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
        term = try_1_0.instance.invoke(context, term, remove_ejp_decs_0_0.instance);
        if(term == null)
          break Fail259;
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
      Fail260:
      { 
        term = try_1_0.instance.invoke(context, term, lifted84.instance);
        if(term == null)
          break Fail260;
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
      Fail261:
      { 
        IStrategoTerm term186 = term;
        IStrategoConstructor cons26 = term.getTermType() == IStrategoTerm.APPL ? ((IStrategoAppl)term).getConstructor() : null;
        Success182:
        { 
          if(cons26 == transform._consScopedEJPCall_3)
          { 
            Fail262:
            { 
              term = transform.constNone0;
              if(true)
                break Success182;
            }
            term = term186;
          }
          if(cons26 == transform._consEJPCall_2)
          { 
            term = transform.constNone0;
          }
          else
          { 
            break Fail261;
          }
        }
        if(true)
          return term;
      }
      return null;
    }
  }

  @SuppressWarnings("all") private static final class lifted81 extends Strategy 
  { 
    TermReference p_78;

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      Fail263:
      { 
        lifted82 lifted820 = new lifted82();
        lifted820.p_78 = p_78;
        term = try_1_0.instance.invoke(context, term, lifted820);
        if(term == null)
          break Fail263;
        if(true)
          return term;
      }
      return null;
    }
  }

  @SuppressWarnings("all") private static final class lifted82 extends Strategy 
  { 
    TermReference p_78;

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      Fail264:
      { 
        term = ejp_converter_aspect_or_class_0_1.instance.invoke(context, term, p_78.value);
        if(term == null)
          break Fail264;
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
      Fail265:
      { 
        term = try_1_0.instance.invoke(context, term, check_for_change_in_aspect_or_class_0_0.instance);
        if(term == null)
          break Fail265;
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
      ITermFactory termFactory = context.getFactory();
      Fail266:
      { 
        IStrategoTerm j_77 = null;
        j_77 = term;
        term = original_location_0_0.instance.invoke(context, term);
        if(term == null)
          break Fail266;
        term = termFactory.annotateTerm(j_77, checkListAnnos(termFactory, (IStrategoTerm)termFactory.makeListCons(term, (IStrategoList)transform.constNil0)));
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
      Fail267:
      { 
        IStrategoTerm term180 = term;
        Success183:
        { 
          Fail268:
          { 
            term = aspectj_to_box_0_0.instance.invoke(context, term);
            if(term == null)
              break Fail268;
            if(true)
              break Success183;
          }
          term = java_to_box_0_0.instance.invoke(context, term180);
          if(term == null)
            break Fail267;
        }
        if(true)
          return term;
      }
      return null;
    }
  }

  @SuppressWarnings("all") private static final class q_75 extends Strategy 
  { 
    public static final q_75 instance = new q_75();

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      Fail269:
      { 
        IStrategoTerm term177 = term;
        Success184:
        { 
          Fail270:
          { 
            term = $Not$Comp_1_0.instance.invoke(context, term, _Id.instance);
            if(term == null)
              break Fail270;
            if(true)
              break Success184;
          }
          term = term177;
          IStrategoTerm term178 = term;
          Success185:
          { 
            Fail271:
            { 
              term = $And$Comp_2_0.instance.invoke(context, term, this, _Id.instance);
              if(term == null)
                break Fail271;
              if(true)
                break Success185;
            }
            term = $Or$Comp_2_0.instance.invoke(context, term178, this, _Id.instance);
            if(term == null)
              break Fail269;
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
      Fail272:
      { 
        IStrategoTerm r_53 = null;
        if(term.getTermType() != IStrategoTerm.APPL || transform._consClassType_2 != ((IStrategoAppl)term).getConstructor())
          break Fail272;
        r_53 = term.getSubterm(0);
        term = pp_aspectj_string_0_0.instance.invoke(context, r_53);
        if(term == null)
          break Fail272;
        term = termFactory.makeAppl(transform._consLit_1, new IStrategoTerm[]{termFactory.makeAppl(transform._consString_1, new IStrategoTerm[]{(IStrategoTerm)termFactory.makeListCons(termFactory.makeAppl(transform._consChars_1, new IStrategoTerm[]{term}), (IStrategoList)transform.constNil0)})});
        if(true)
          return term;
      }
      return null;
    }
  }

  @SuppressWarnings("all") private static final class lifted71 extends Strategy 
  { 
    TermReference k_53;

    TermReference i_53;

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      Fail273:
      { 
        if(term.getTermType() != IStrategoTerm.APPL || transform._consScopedExplicitJoinPointPHeader_2 != ((IStrategoAppl)term).getConstructor())
          break Fail273;
        if(k_53.value == null)
          k_53.value = term.getSubterm(0);
        else
          if(k_53.value != term.getSubterm(0) && !k_53.value.match(term.getSubterm(0)))
            break Fail273;
        if(i_53.value == null)
          i_53.value = term.getSubterm(1);
        else
          if(i_53.value != term.getSubterm(1) && !i_53.value.match(term.getSubterm(1)))
            break Fail273;
        if(true)
          return term;
      }
      return null;
    }
  }

  @SuppressWarnings("all") private static final class lifted70 extends Strategy 
  { 
    TermReference k_53;

    TermReference i_53;

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      Fail274:
      { 
        if(term.getTermType() != IStrategoTerm.APPL || transform._consNonScopedExplicitJoinPointPHeader_2 != ((IStrategoAppl)term).getConstructor())
          break Fail274;
        if(k_53.value == null)
          k_53.value = term.getSubterm(0);
        else
          if(k_53.value != term.getSubterm(0) && !k_53.value.match(term.getSubterm(0)))
            break Fail274;
        if(i_53.value == null)
          i_53.value = term.getSubterm(1);
        else
          if(i_53.value != term.getSubterm(1) && !i_53.value.match(term.getSubterm(1)))
            break Fail274;
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
      Fail275:
      { 
        term = convet_pointcutarg_to_pointcut_0_0.instance.invoke(context, term);
        if(term == null)
          break Fail275;
        if(true)
          return term;
      }
      return null;
    }
  }

  @SuppressWarnings("all") private static final class lifted68 extends Strategy 
  { 
    TermReference q_52;

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      Fail276:
      { 
        if(term.getTermType() != IStrategoTerm.APPL || transform._consScopedExplicitJoinPointPHeader_2 != ((IStrategoAppl)term).getConstructor())
          break Fail276;
        if(q_52.value == null)
          q_52.value = term.getSubterm(1);
        else
          if(q_52.value != term.getSubterm(1) && !q_52.value.match(term.getSubterm(1)))
            break Fail276;
        if(true)
          return term;
      }
      return null;
    }
  }

  @SuppressWarnings("all") private static final class lifted67 extends Strategy 
  { 
    TermReference q_52;

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      Fail277:
      { 
        if(term.getTermType() != IStrategoTerm.APPL || transform._consNonScopedExplicitJoinPointPHeader_2 != ((IStrategoAppl)term).getConstructor())
          break Fail277;
        if(q_52.value == null)
          q_52.value = term.getSubterm(1);
        else
          if(q_52.value != term.getSubterm(1) && !q_52.value.match(term.getSubterm(1)))
            break Fail277;
        if(true)
          return term;
      }
      return null;
    }
  }

  @SuppressWarnings("all") private static final class ejp_to_ajc_0_3_fragment_0 extends Strategy 
  { 
    TermReference q_110;

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      ITermFactory termFactory = context.getFactory();
      Fail278:
      { 
        IStrategoTerm term54 = term;
        IStrategoConstructor cons27 = term.getTermType() == IStrategoTerm.APPL ? ((IStrategoAppl)term).getConstructor() : null;
        Success186:
        { 
          if(cons27 == transform._consDecNoMatch_4)
          { 
            Fail279:
            { 
              IStrategoTerm i_48 = null;
              IStrategoTerm j_48 = null;
              IStrategoTerm k_48 = null;
              IStrategoTerm l_48 = null;
              IStrategoTerm o_48 = null;
              IStrategoTerm m_48 = null;
              IStrategoTerm p_48 = null;
              IStrategoTerm arg116 = term.getSubterm(0);
              if(arg116.getTermType() != IStrategoTerm.APPL || transform._consByPackageGranularity_0 != ((IStrategoAppl)arg116).getConstructor())
                break Fail279;
              k_48 = term.getSubterm(1);
              i_48 = term.getSubterm(2);
              j_48 = term.getSubterm(3);
              o_48 = term;
              term = pp_aspectj_string_0_0.instance.invoke(context, i_48);
              if(term == null)
                break Fail279;
              l_48 = term;
              p_48 = o_48;
              term = pp_aspectj_string_0_0.instance.invoke(context, k_48);
              if(term == null)
                break Fail279;
              term = (IStrategoTerm)termFactory.makeListCons(transform.const28, termFactory.makeListCons(term, (IStrategoList)transform.constNil0));
              term = concat_strings_0_0.instance.invoke(context, term);
              if(term == null)
                break Fail279;
              m_48 = term;
              term = p_48;
              term = gen__nomatch__pointcut__name_0_0.instance.invoke(context, term);
              if(term == null)
                break Fail279;
              term = termFactory.makeAppl(transform._consMethodDec_2, new IStrategoTerm[]{termFactory.makeAppl(transform._consMethodDecHead_6, new IStrategoTerm[]{(IStrategoTerm)termFactory.makeListCons(termFactory.makeAppl(transform._consAnno_2, new IStrategoTerm[]{transform.constTypeName10, (IStrategoTerm)termFactory.makeListCons(termFactory.makeAppl(transform._consElemValPair_2, new IStrategoTerm[]{transform.constId10, termFactory.makeAppl(transform._consLit_1, new IStrategoTerm[]{termFactory.makeAppl(transform._consString_1, new IStrategoTerm[]{(IStrategoTerm)termFactory.makeListCons(termFactory.makeAppl(transform._consChars_1, new IStrategoTerm[]{l_48}), (IStrategoList)transform.constNil0)})})}), termFactory.makeListCons(termFactory.makeAppl(transform._consElemValPair_2, new IStrategoTerm[]{transform.constId23, termFactory.makeAppl(transform._consLit_1, new IStrategoTerm[]{j_48})}), (IStrategoList)transform.constCons14))}), termFactory.makeListCons(termFactory.makeAppl(transform._consSingleElemAnno_2, new IStrategoTerm[]{transform.constTypeName9, termFactory.makeAppl(transform._consLit_1, new IStrategoTerm[]{termFactory.makeAppl(transform._consString_1, new IStrategoTerm[]{(IStrategoTerm)termFactory.makeListCons(termFactory.makeAppl(transform._consChars_1, new IStrategoTerm[]{m_48}), (IStrategoList)transform.constNil0)})})}), (IStrategoList)transform.constCons12)), transform.constNone0, transform.constVoid0, termFactory.makeAppl(transform._consId_1, new IStrategoTerm[]{term}), transform.constCons15, transform.constNone0}), transform.constBlock0});
              if(true)
                break Success186;
            }
            term = term54;
          }
          Success187:
          { 
            if(cons27 == transform._consDecNoMatch_4)
            { 
              Fail280:
              { 
                IStrategoTerm u_47 = null;
                IStrategoTerm v_47 = null;
                IStrategoTerm w_47 = null;
                IStrategoTerm x_47 = null;
                IStrategoTerm a_48 = null;
                IStrategoTerm y_47 = null;
                IStrategoTerm b_48 = null;
                IStrategoTerm arg117 = term.getSubterm(0);
                if(arg117.getTermType() != IStrategoTerm.APPL || transform._consByClassGranularity_0 != ((IStrategoAppl)arg117).getConstructor())
                  break Fail280;
                w_47 = term.getSubterm(1);
                u_47 = term.getSubterm(2);
                v_47 = term.getSubterm(3);
                a_48 = term;
                term = pp_aspectj_string_0_0.instance.invoke(context, u_47);
                if(term == null)
                  break Fail280;
                x_47 = term;
                b_48 = a_48;
                term = pp_aspectj_string_0_0.instance.invoke(context, w_47);
                if(term == null)
                  break Fail280;
                term = (IStrategoTerm)termFactory.makeListCons(transform.const28, termFactory.makeListCons(term, (IStrategoList)transform.constNil0));
                term = concat_strings_0_0.instance.invoke(context, term);
                if(term == null)
                  break Fail280;
                y_47 = term;
                term = b_48;
                term = gen__nomatch__pointcut__name_0_0.instance.invoke(context, term);
                if(term == null)
                  break Fail280;
                term = termFactory.makeAppl(transform._consMethodDec_2, new IStrategoTerm[]{termFactory.makeAppl(transform._consMethodDecHead_6, new IStrategoTerm[]{(IStrategoTerm)termFactory.makeListCons(termFactory.makeAppl(transform._consAnno_2, new IStrategoTerm[]{transform.constTypeName10, (IStrategoTerm)termFactory.makeListCons(termFactory.makeAppl(transform._consElemValPair_2, new IStrategoTerm[]{transform.constId10, termFactory.makeAppl(transform._consLit_1, new IStrategoTerm[]{termFactory.makeAppl(transform._consString_1, new IStrategoTerm[]{(IStrategoTerm)termFactory.makeListCons(termFactory.makeAppl(transform._consChars_1, new IStrategoTerm[]{x_47}), (IStrategoList)transform.constNil0)})})}), termFactory.makeListCons(termFactory.makeAppl(transform._consElemValPair_2, new IStrategoTerm[]{transform.constId23, termFactory.makeAppl(transform._consLit_1, new IStrategoTerm[]{v_47})}), (IStrategoList)transform.constCons17))}), termFactory.makeListCons(termFactory.makeAppl(transform._consSingleElemAnno_2, new IStrategoTerm[]{transform.constTypeName9, termFactory.makeAppl(transform._consLit_1, new IStrategoTerm[]{termFactory.makeAppl(transform._consString_1, new IStrategoTerm[]{(IStrategoTerm)termFactory.makeListCons(termFactory.makeAppl(transform._consChars_1, new IStrategoTerm[]{y_47}), (IStrategoList)transform.constNil0)})})}), (IStrategoList)transform.constCons12)), transform.constNone0, transform.constVoid0, termFactory.makeAppl(transform._consId_1, new IStrategoTerm[]{term}), transform.constCons15, transform.constNone0}), transform.constBlock0});
                if(true)
                  break Success187;
              }
              term = term54;
            }
            Success188:
            { 
              if(cons27 == transform._consDecNoMatch_4)
              { 
                Fail281:
                { 
                  IStrategoTerm g_47 = null;
                  IStrategoTerm h_47 = null;
                  IStrategoTerm i_47 = null;
                  IStrategoTerm j_47 = null;
                  IStrategoTerm m_47 = null;
                  IStrategoTerm k_47 = null;
                  IStrategoTerm n_47 = null;
                  IStrategoTerm arg118 = term.getSubterm(0);
                  if(arg118.getTermType() != IStrategoTerm.APPL || transform._consByEjpGranularity_0 != ((IStrategoAppl)arg118).getConstructor())
                    break Fail281;
                  i_47 = term.getSubterm(1);
                  g_47 = term.getSubterm(2);
                  h_47 = term.getSubterm(3);
                  m_47 = term;
                  term = pp_aspectj_string_0_0.instance.invoke(context, g_47);
                  if(term == null)
                    break Fail281;
                  j_47 = term;
                  n_47 = m_47;
                  term = pp_aspectj_string_0_0.instance.invoke(context, i_47);
                  if(term == null)
                    break Fail281;
                  term = (IStrategoTerm)termFactory.makeListCons(transform.const41, termFactory.makeListCons(term, (IStrategoList)transform.constNil0));
                  term = concat_strings_0_0.instance.invoke(context, term);
                  if(term == null)
                    break Fail281;
                  k_47 = term;
                  term = n_47;
                  term = gen__nomatch__pointcut__name_0_0.instance.invoke(context, term);
                  if(term == null)
                    break Fail281;
                  term = termFactory.makeAppl(transform._consMethodDec_2, new IStrategoTerm[]{termFactory.makeAppl(transform._consMethodDecHead_6, new IStrategoTerm[]{(IStrategoTerm)termFactory.makeListCons(termFactory.makeAppl(transform._consAnno_2, new IStrategoTerm[]{transform.constTypeName10, (IStrategoTerm)termFactory.makeListCons(termFactory.makeAppl(transform._consElemValPair_2, new IStrategoTerm[]{transform.constId10, termFactory.makeAppl(transform._consLit_1, new IStrategoTerm[]{termFactory.makeAppl(transform._consString_1, new IStrategoTerm[]{(IStrategoTerm)termFactory.makeListCons(termFactory.makeAppl(transform._consChars_1, new IStrategoTerm[]{j_47}), (IStrategoList)transform.constNil0)})})}), termFactory.makeListCons(termFactory.makeAppl(transform._consElemValPair_2, new IStrategoTerm[]{transform.constId23, termFactory.makeAppl(transform._consLit_1, new IStrategoTerm[]{h_47})}), (IStrategoList)transform.constCons19))}), termFactory.makeListCons(termFactory.makeAppl(transform._consSingleElemAnno_2, new IStrategoTerm[]{transform.constTypeName9, termFactory.makeAppl(transform._consLit_1, new IStrategoTerm[]{termFactory.makeAppl(transform._consString_1, new IStrategoTerm[]{(IStrategoTerm)termFactory.makeListCons(termFactory.makeAppl(transform._consChars_1, new IStrategoTerm[]{k_47}), (IStrategoList)transform.constNil0)})})}), (IStrategoList)transform.constCons12)), transform.constNone0, transform.constVoid0, termFactory.makeAppl(transform._consId_1, new IStrategoTerm[]{term}), transform.constCons20, transform.constNone0}), transform.constBlock0});
                  if(true)
                    break Success188;
                }
                term = term54;
              }
              Success189:
              { 
                if(cons27 == transform._consDecNoMatch_4)
                { 
                  Fail282:
                  { 
                    IStrategoTerm q_46 = null;
                    IStrategoTerm r_46 = null;
                    IStrategoTerm s_46 = null;
                    IStrategoTerm t_46 = null;
                    IStrategoTerm y_46 = null;
                    IStrategoTerm w_46 = null;
                    IStrategoTerm z_46 = null;
                    IStrategoTerm arg119 = term.getSubterm(0);
                    if(arg119.getTermType() != IStrategoTerm.APPL || transform._consByMethodGranularity_0 != ((IStrategoAppl)arg119).getConstructor())
                      break Fail282;
                    s_46 = term.getSubterm(1);
                    q_46 = term.getSubterm(2);
                    r_46 = term.getSubterm(3);
                    y_46 = term;
                    term = pp_aspectj_string_0_0.instance.invoke(context, q_46);
                    if(term == null)
                      break Fail282;
                    t_46 = term;
                    z_46 = y_46;
                    term = pp_aspectj_string_0_0.instance.invoke(context, s_46);
                    if(term == null)
                      break Fail282;
                    term = (IStrategoTerm)termFactory.makeListCons(transform.const44, termFactory.makeListCons(term, (IStrategoList)transform.constNil0));
                    term = concat_strings_0_0.instance.invoke(context, term);
                    if(term == null)
                      break Fail282;
                    w_46 = term;
                    term = z_46;
                    term = gen__nomatch__pointcut__name_0_0.instance.invoke(context, term);
                    if(term == null)
                      break Fail282;
                    term = termFactory.makeAppl(transform._consMethodDec_2, new IStrategoTerm[]{termFactory.makeAppl(transform._consMethodDecHead_6, new IStrategoTerm[]{(IStrategoTerm)termFactory.makeListCons(termFactory.makeAppl(transform._consAnno_2, new IStrategoTerm[]{transform.constTypeName10, (IStrategoTerm)termFactory.makeListCons(termFactory.makeAppl(transform._consElemValPair_2, new IStrategoTerm[]{transform.constId10, termFactory.makeAppl(transform._consLit_1, new IStrategoTerm[]{termFactory.makeAppl(transform._consString_1, new IStrategoTerm[]{(IStrategoTerm)termFactory.makeListCons(termFactory.makeAppl(transform._consChars_1, new IStrategoTerm[]{t_46}), (IStrategoList)transform.constNil0)})})}), termFactory.makeListCons(termFactory.makeAppl(transform._consElemValPair_2, new IStrategoTerm[]{transform.constId23, termFactory.makeAppl(transform._consLit_1, new IStrategoTerm[]{r_46})}), (IStrategoList)transform.constCons22))}), termFactory.makeListCons(termFactory.makeAppl(transform._consSingleElemAnno_2, new IStrategoTerm[]{transform.constTypeName9, termFactory.makeAppl(transform._consLit_1, new IStrategoTerm[]{termFactory.makeAppl(transform._consString_1, new IStrategoTerm[]{(IStrategoTerm)termFactory.makeListCons(termFactory.makeAppl(transform._consChars_1, new IStrategoTerm[]{w_46}), (IStrategoList)transform.constNil0)})})}), (IStrategoList)transform.constCons12)), transform.constNone0, transform.constVoid0, termFactory.makeAppl(transform._consId_1, new IStrategoTerm[]{term}), transform.constCons20, transform.constNone0}), transform.constBlock0});
                    if(true)
                      break Success189;
                  }
                  term = term54;
                }
                if(cons27 == transform._consExplicitJoinPointDeclaration_5)
                { 
                  IStrategoTerm v_45 = null;
                  IStrategoTerm w_45 = null;
                  IStrategoTerm x_45 = null;
                  IStrategoTerm y_45 = null;
                  IStrategoTerm z_45 = null;
                  IStrategoTerm a_46 = null;
                  IStrategoTerm b_46 = null;
                  IStrategoTerm c_46 = null;
                  IStrategoTerm f_46 = null;
                  w_45 = term.getSubterm(0);
                  v_45 = term.getSubterm(1);
                  x_45 = term.getSubterm(2);
                  y_45 = term.getSubterm(3);
                  a_46 = term.getSubterm(4);
                  f_46 = term;
                  IStrategoTerm term58 = term;
                  Success190:
                  { 
                    Fail283:
                    { 
                      IStrategoTerm g_46 = null;
                      term = termFactory.makeTuple(v_45, w_45);
                      term = gen_pointcutargs_pointcuts_0_1.instance.invoke(context, term, q_110.value);
                      if(term == null)
                        break Fail283;
                      term = gen_method_head_0_3.instance.invoke(context, term, w_45, x_45, y_45);
                      if(term == null)
                        break Fail283;
                      g_46 = term;
                      z_45 = term;
                      term = g_46;
                      if(term.getTermType() != IStrategoTerm.APPL || transform._consMethodDecHead_6 != ((IStrategoAppl)term).getConstructor())
                        break Fail283;
                      b_46 = term.getSubterm(2);
                      term = gen_method_body_0_2.instance.invoke(context, term, a_46, b_46);
                      if(term == null)
                        break Fail283;
                      c_46 = term;
                      if(true)
                        break Success190;
                    }
                    term = term58;
                    IStrategoTerm d_46 = null;
                    IStrategoTerm e_46 = null;
                    IStrategoTerm l_46 = null;
                    d_46 = term;
                    term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
                    if(term == null)
                      break Fail278;
                    e_46 = term;
                    l_46 = d_46;
                    term = report_with_failure_0_2.instance.invoke(context, l_46, transform.const46, e_46);
                    if(term == null)
                      break Fail278;
                  }
                  term = f_46;
                  if(z_45 == null || c_46 == null)
                    break Fail278;
                  term = termFactory.makeAppl(transform._consMethodDec_2, new IStrategoTerm[]{z_45, c_46});
                }
                else
                { 
                  break Fail278;
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
      Fail284:
      { 
        if(term.getTermType() != IStrategoTerm.APPL || transform._consNotExplicitJoinPointScopePattern_1 != ((IStrategoAppl)term).getConstructor())
          break Fail284;
        IStrategoTerm arg113 = term.getSubterm(0);
        if(arg113.getTermType() != IStrategoTerm.APPL || transform._consMemberName_2 != ((IStrategoAppl)arg113).getConstructor())
          break Fail284;
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
      Fail285:
      { 
        if(term.getTermType() != IStrategoTerm.APPL || transform._consNotExplicitJoinPointScopePattern_1 != ((IStrategoAppl)term).getConstructor())
          break Fail285;
        IStrategoTerm arg111 = term.getSubterm(0);
        if(arg111.getTermType() != IStrategoTerm.APPL || transform._consMemberName_1 != ((IStrategoAppl)arg111).getConstructor())
          break Fail285;
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
      Fail286:
      { 
        if(term.getTermType() != IStrategoTerm.APPL || transform._consExplicitJoinPointScopePattern_1 != ((IStrategoAppl)term).getConstructor())
          break Fail286;
        IStrategoTerm arg106 = term.getSubterm(0);
        if(arg106.getTermType() != IStrategoTerm.APPL || transform._consMemberName_2 != ((IStrategoAppl)arg106).getConstructor())
          break Fail286;
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
      Fail287:
      { 
        if(term.getTermType() != IStrategoTerm.APPL || transform._consExplicitJoinPointScopePattern_1 != ((IStrategoAppl)term).getConstructor())
          break Fail287;
        IStrategoTerm arg104 = term.getSubterm(0);
        if(arg104.getTermType() != IStrategoTerm.APPL || transform._consMemberName_1 != ((IStrategoAppl)arg104).getConstructor())
          break Fail287;
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
      Fail288:
      { 
        if(term.getTermType() != IStrategoTerm.APPL || transform._consNotExplicitJoinPointPattern_1 != ((IStrategoAppl)term).getConstructor())
          break Fail288;
        IStrategoTerm arg99 = term.getSubterm(0);
        if(arg99.getTermType() != IStrategoTerm.APPL || transform._consMemberName_2 != ((IStrategoAppl)arg99).getConstructor())
          break Fail288;
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
      Fail289:
      { 
        if(term.getTermType() != IStrategoTerm.APPL || transform._consNotExplicitJoinPointPattern_1 != ((IStrategoAppl)term).getConstructor())
          break Fail289;
        IStrategoTerm arg97 = term.getSubterm(0);
        if(arg97.getTermType() != IStrategoTerm.APPL || transform._consMemberName_1 != ((IStrategoAppl)arg97).getConstructor())
          break Fail289;
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
      Fail290:
      { 
        if(term.getTermType() != IStrategoTerm.APPL || transform._consExplicitJoinPointPattern_1 != ((IStrategoAppl)term).getConstructor())
          break Fail290;
        IStrategoTerm arg91 = term.getSubterm(0);
        if(arg91.getTermType() != IStrategoTerm.APPL || transform._consMemberName_2 != ((IStrategoAppl)arg91).getConstructor())
          break Fail290;
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
      Fail291:
      { 
        if(term.getTermType() != IStrategoTerm.APPL || transform._consExplicitJoinPointPattern_1 != ((IStrategoAppl)term).getConstructor())
          break Fail291;
        IStrategoTerm arg89 = term.getSubterm(0);
        if(arg89.getTermType() != IStrategoTerm.APPL || transform._consMemberName_1 != ((IStrategoAppl)arg89).getConstructor())
          break Fail291;
        if(true)
          return term;
      }
      return null;
    }
  }

  @SuppressWarnings("all") private static final class lifted58 extends Strategy 
  { 
    Strategy n_44;

    Strategy o_44;

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      Fail292:
      { 
        term = allow_extends_helper_2_0.instance.invoke(context, term, n_44, o_44);
        if(term == null)
          break Fail292;
        if(true)
          return term;
      }
      return null;
    }
  }

  @SuppressWarnings("all") private static final class lifted56 extends Strategy 
  { 
    TermReference i_43;

    TermReference j_43;

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      Fail293:
      { 
        term = my_hashtable_union_helper_0_2.instance.invoke(context, term, i_43.value, j_43.value);
        if(term == null)
          break Fail293;
        if(true)
          return term;
      }
      return null;
    }
  }

  @SuppressWarnings("all") private static final class lifted55 extends Strategy 
  { 
    TermReference e_43;

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      Fail294:
      { 
        IStrategoTerm f_43 = null;
        f_43 = term;
        if(e_43.value == null)
          break Fail294;
        term = hashtable_remove_0_1.instance.invoke(context, e_43.value, f_43);
        if(term == null)
          break Fail294;
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
      Fail295:
      { 
        IStrategoTerm q_41 = null;
        if(term.getTermType() != IStrategoTerm.APPL || transform._consId_1 != ((IStrategoAppl)term).getConstructor())
          break Fail295;
        q_41 = term.getSubterm(0);
        term = (IStrategoTerm)termFactory.makeListCons(q_41, (IStrategoList)transform.constCons4);
        term = concat_strings_0_0.instance.invoke(context, term);
        if(term == null)
          break Fail295;
        if(true)
          return term;
      }
      return null;
    }
  }

  @SuppressWarnings("all") private static final class lifted51 extends Strategy 
  { 
    TermReference q_38;

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      Fail296:
      { 
        term = handle_pointcutarg_helper_0_1.instance.invoke(context, term, q_38.value);
        if(term == null)
          break Fail296;
        if(true)
          return term;
      }
      return null;
    }
  }

  @SuppressWarnings("all") private static final class lifted52 extends Strategy 
  { 
    TermReference p_38;

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      Fail297:
      { 
        IStrategoTerm t_38 = null;
        t_38 = term;
        if(p_38.value == null)
          break Fail297;
        term = iset_add_0_1.instance.invoke(context, p_38.value, t_38);
        if(term == null)
          break Fail297;
        if(true)
          return term;
      }
      return null;
    }
  }

  @SuppressWarnings("all") private static final class lifted49 extends Strategy 
  { 
    TermReference k_38;

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      Fail298:
      { 
        lifted50 lifted500 = new lifted50();
        lifted500.k_38 = k_38;
        term = try_1_0.instance.invoke(context, term, lifted500);
        if(term == null)
          break Fail298;
        if(true)
          return term;
      }
      return null;
    }
  }

  @SuppressWarnings("all") private static final class lifted50 extends Strategy 
  { 
    TermReference k_38;

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      Fail299:
      { 
        term = add_local_vars_0_1.instance.invoke(context, term, k_38.value);
        if(term == null)
          break Fail299;
        if(true)
          return term;
      }
      return null;
    }
  }

  @SuppressWarnings("all") private static final class lifted47 extends Strategy 
  { 
    TermReference e_38;

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      Fail300:
      { 
        lifted48 lifted480 = new lifted48();
        lifted480.e_38 = e_38;
        term = try_1_0.instance.invoke(context, term, lifted480);
        if(term == null)
          break Fail300;
        if(true)
          return term;
      }
      return null;
    }
  }

  @SuppressWarnings("all") private static final class lifted48 extends Strategy 
  { 
    TermReference e_38;

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      Fail301:
      { 
        term = fetch_0_1.instance.invoke(context, term, e_38.value);
        if(term == null)
          break Fail301;
        if(true)
          return term;
      }
      return null;
    }
  }

  @SuppressWarnings("all") private static final class lifted46 extends Strategy 
  { 
    TermReference i_36;

    TermReference m_35;

    TermReference n_35;

    TermReference o_35;

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      Fail302:
      { 
        term = ejp_to_java_0_4.instance.invoke(context, term, i_36.value, m_35.value, n_35.value, o_35.value);
        if(term == null)
          break Fail302;
        if(true)
          return term;
      }
      return null;
    }
  }

  @SuppressWarnings("all") private static final class lifted45 extends Strategy 
  { 
    TermReference o_35;

    TermReference l_36;

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      Fail303:
      { 
        term = handle_pointcutargs_0_2.instance.invoke(context, term, o_35.value, l_36.value);
        if(term == null)
          break Fail303;
        if(true)
          return term;
      }
      return null;
    }
  }

  @SuppressWarnings("all") private static final class lifted43 extends Strategy 
  { 
    TermReference m_35;

    TermReference n_35;

    TermReference y_35;

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      Fail304:
      { 
        lifted44 lifted440 = new lifted44();
        lifted440.m_35 = m_35;
        lifted440.n_35 = n_35;
        lifted440.y_35 = y_35;
        term = try_1_0.instance.invoke(context, term, lifted440);
        if(term == null)
          break Fail304;
        if(true)
          return term;
      }
      return null;
    }
  }

  @SuppressWarnings("all") private static final class lifted44 extends Strategy 
  { 
    TermReference m_35;

    TermReference n_35;

    TermReference y_35;

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      Fail305:
      { 
        term = pointcutarg_0_3.instance.invoke(context, term, m_35.value, n_35.value, y_35.value);
        if(term == null)
          break Fail305;
        if(true)
          return term;
      }
      return null;
    }
  }

  @SuppressWarnings("all") private static final class lifted42 extends Strategy 
  { 
    TermReference u_34;

    TermReference y_34;

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      Fail306:
      { 
        term = handle_pointcutargs_0_2.instance.invoke(context, term, u_34.value, y_34.value);
        if(term == null)
          break Fail306;
        if(true)
          return term;
      }
      return null;
    }
  }

  @SuppressWarnings("all") private static final class lifted40 extends Strategy 
  { 
    TermReference s_34;

    TermReference t_34;

    TermReference v_34;

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      Fail307:
      { 
        lifted41 lifted411 = new lifted41();
        lifted411.s_34 = s_34;
        lifted411.t_34 = t_34;
        lifted411.v_34 = v_34;
        term = try_1_0.instance.invoke(context, term, lifted411);
        if(term == null)
          break Fail307;
        if(true)
          return term;
      }
      return null;
    }
  }

  @SuppressWarnings("all") private static final class lifted41 extends Strategy 
  { 
    TermReference s_34;

    TermReference t_34;

    TermReference v_34;

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      Fail308:
      { 
        term = pointcutarg_0_3.instance.invoke(context, term, s_34.value, t_34.value, v_34.value);
        if(term == null)
          break Fail308;
        if(true)
          return term;
      }
      return null;
    }
  }

  @SuppressWarnings("all") private static final class lifted38 extends Strategy 
  { 
    TermReference v_33;

    TermReference w_33;

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      ITermFactory termFactory = context.getFactory();
      Fail309:
      { 
        IStrategoTerm x_33 = null;
        IStrategoTerm y_33 = null;
        IStrategoTerm z_33 = null;
        x_33 = term;
        z_33 = term;
        if(v_33.value == null)
          break Fail309;
        term = hashtable_get_0_1.instance.invoke(context, v_33.value, x_33);
        if(term == null)
          break Fail309;
        y_33 = term;
        term = z_33;
        if(w_33.value == null)
          break Fail309;
        term = termFactory.makeAppl(transform._consLocalVarDecStm_1, new IStrategoTerm[]{termFactory.makeAppl(transform._consLocalVarDec_3, new IStrategoTerm[]{transform.constNil0, y_33, (IStrategoTerm)termFactory.makeListCons(termFactory.makeAppl(transform._consVarDec_2, new IStrategoTerm[]{termFactory.makeAppl(transform._consId_1, new IStrategoTerm[]{x_33}), termFactory.makeAppl(transform._consExprName_2, new IStrategoTerm[]{termFactory.makeAppl(transform._consAmbName_1, new IStrategoTerm[]{termFactory.makeAppl(transform._consId_1, new IStrategoTerm[]{w_33.value})}), termFactory.makeAppl(transform._consId_1, new IStrategoTerm[]{x_33})})}), (IStrategoList)transform.constNil0)})});
        if(true)
          return term;
      }
      return null;
    }
  }

  @SuppressWarnings("all") private static final class lifted37 extends Strategy 
  { 
    TermReference t_33;

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      ITermFactory termFactory = context.getFactory();
      Fail310:
      { 
        IStrategoTerm u_33 = null;
        u_33 = term;
        if(t_33.value == null)
          break Fail310;
        term = termFactory.makeAppl(transform._consExprStm_1, new IStrategoTerm[]{termFactory.makeAppl(transform._consAssign_2, new IStrategoTerm[]{termFactory.makeAppl(transform._consExprName_1, new IStrategoTerm[]{termFactory.makeAppl(transform._consId_1, new IStrategoTerm[]{u_33})}), termFactory.makeAppl(transform._consExprName_2, new IStrategoTerm[]{termFactory.makeAppl(transform._consAmbName_1, new IStrategoTerm[]{termFactory.makeAppl(transform._consId_1, new IStrategoTerm[]{t_33.value})}), termFactory.makeAppl(transform._consId_1, new IStrategoTerm[]{u_33})})})});
        if(true)
          return term;
      }
      return null;
    }
  }

  @SuppressWarnings("all") private static final class lifted36 extends Strategy 
  { 
    TermReference l_30;

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      ITermFactory termFactory = context.getFactory();
      Fail311:
      { 
        IStrategoTerm m_30 = null;
        m_30 = term;
        if(l_30.value == null)
          break Fail311;
        term = termFactory.makeAppl(transform._consExprStm_1, new IStrategoTerm[]{termFactory.makeAppl(transform._consAssign_2, new IStrategoTerm[]{termFactory.makeAppl(transform._consExprName_2, new IStrategoTerm[]{termFactory.makeAppl(transform._consAmbName_1, new IStrategoTerm[]{termFactory.makeAppl(transform._consId_1, new IStrategoTerm[]{l_30.value})}), termFactory.makeAppl(transform._consId_1, new IStrategoTerm[]{m_30})}), termFactory.makeAppl(transform._consExprName_1, new IStrategoTerm[]{termFactory.makeAppl(transform._consId_1, new IStrategoTerm[]{m_30})})})});
        if(true)
          return term;
      }
      return null;
    }
  }

  @SuppressWarnings("all") private static final class lifted33 extends Strategy 
  { 
    TermReference v_29;

    TermReference u_29;

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      Fail312:
      { 
        IStrategoTerm w_29 = null;
        IStrategoTerm d_30 = null;
        w_29 = term;
        if(v_29.value == null)
          break Fail312;
        term = v_29.value;
        d_30 = v_29.value;
        if(u_29.value == null)
          break Fail312;
        term = hashtable_get_0_1.instance.invoke(context, u_29.value, w_29);
        if(term == null)
          break Fail312;
        term = add_key_to_multiple_values_table_0_2.instance.invoke(context, d_30, term, w_29);
        if(term == null)
          break Fail312;
        if(true)
          return term;
      }
      return null;
    }
  }

  @SuppressWarnings("all") private static final class lifted34 extends Strategy 
  { 
    TermReference v_29;

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      ITermFactory termFactory = context.getFactory();
      Fail313:
      { 
        IStrategoTerm y_29 = null;
        y_29 = term;
        if(v_29.value == null)
          break Fail313;
        term = hashtable_get_0_1.instance.invoke(context, v_29.value, y_29);
        if(term == null)
          break Fail313;
        term = map_1_0.instance.invoke(context, term, lifted35.instance);
        if(term == null)
          break Fail313;
        term = termFactory.makeAppl(transform._consFieldDec_3, new IStrategoTerm[]{transform.constNil0, y_29, term});
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
      Fail314:
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
    TermReference h_27;

    TermReference c_27;

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      Fail315:
      { 
        if(term.getTermType() != IStrategoTerm.APPL || transform._consVarArityParam_3 != ((IStrategoAppl)term).getConstructor())
          break Fail315;
        if(h_27.value == null)
          h_27.value = term.getSubterm(1);
        else
          if(h_27.value != term.getSubterm(1) && !h_27.value.match(term.getSubterm(1)))
            break Fail315;
        IStrategoTerm arg55 = term.getSubterm(2);
        if(arg55.getTermType() != IStrategoTerm.APPL || transform._consId_1 != ((IStrategoAppl)arg55).getConstructor())
          break Fail315;
        if(c_27.value == null)
          c_27.value = arg55.getSubterm(0);
        else
          if(c_27.value != arg55.getSubterm(0) && !c_27.value.match(arg55.getSubterm(0)))
            break Fail315;
        if(true)
          return term;
      }
      return null;
    }
  }

  @SuppressWarnings("all") private static final class lifted30 extends Strategy 
  { 
    TermReference h_27;

    TermReference c_27;

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      Fail316:
      { 
        if(term.getTermType() != IStrategoTerm.APPL || transform._consParam_3 != ((IStrategoAppl)term).getConstructor())
          break Fail316;
        if(h_27.value == null)
          h_27.value = term.getSubterm(1);
        else
          if(h_27.value != term.getSubterm(1) && !h_27.value.match(term.getSubterm(1)))
            break Fail316;
        IStrategoTerm arg53 = term.getSubterm(2);
        if(arg53.getTermType() != IStrategoTerm.APPL || transform._consId_1 != ((IStrategoAppl)arg53).getConstructor())
          break Fail316;
        if(c_27.value == null)
          c_27.value = arg53.getSubterm(0);
        else
          if(c_27.value != arg53.getSubterm(0) && !c_27.value.match(arg53.getSubterm(0)))
            break Fail316;
        if(true)
          return term;
      }
      return null;
    }
  }

  @SuppressWarnings("all") private static final class lifted29 extends Strategy 
  { 
    TermReference s_26;

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      Fail317:
      { 
        if(term.getTermType() != IStrategoTerm.APPL || transform._consVarDec_2 != ((IStrategoAppl)term).getConstructor())
          break Fail317;
        IStrategoTerm arg50 = term.getSubterm(0);
        if(arg50.getTermType() != IStrategoTerm.APPL || transform._consId_1 != ((IStrategoAppl)arg50).getConstructor())
          break Fail317;
        if(s_26.value == null)
          s_26.value = arg50.getSubterm(0);
        else
          if(s_26.value != arg50.getSubterm(0) && !s_26.value.match(arg50.getSubterm(0)))
            break Fail317;
        if(true)
          return term;
      }
      return null;
    }
  }

  @SuppressWarnings("all") private static final class lifted28 extends Strategy 
  { 
    TermReference s_26;

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      Fail318:
      { 
        if(term.getTermType() != IStrategoTerm.APPL || transform._consVarDec_1 != ((IStrategoAppl)term).getConstructor())
          break Fail318;
        IStrategoTerm arg49 = term.getSubterm(0);
        if(arg49.getTermType() != IStrategoTerm.APPL || transform._consId_1 != ((IStrategoAppl)arg49).getConstructor())
          break Fail318;
        if(s_26.value == null)
          s_26.value = arg49.getSubterm(0);
        else
          if(s_26.value != arg49.getSubterm(0) && !s_26.value.match(arg49.getSubterm(0)))
            break Fail318;
        if(true)
          return term;
      }
      return null;
    }
  }

  @SuppressWarnings("all") private static final class lifted26 extends Strategy 
  { 
    TermReference k_110;

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      Fail319:
      { 
        lifted27 lifted270 = new lifted27();
        lifted270.k_110 = k_110;
        term = try_1_0.instance.invoke(context, term, lifted270);
        if(term == null)
          break Fail319;
        if(true)
          return term;
      }
      return null;
    }
  }

  @SuppressWarnings("all") private static final class lifted27 extends Strategy 
  { 
    TermReference k_110;

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      Fail320:
      { 
        term = add_local_vars_0_1.instance.invoke(context, term, k_110.value);
        if(term == null)
          break Fail320;
        if(true)
          return term;
      }
      return null;
    }
  }

  @SuppressWarnings("all") private static final class lifted25 extends Strategy 
  { 
    TermReference e_26;

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      Fail321:
      { 
        if(term.getTermType() != IStrategoTerm.APPL || transform._consVarDec_2 != ((IStrategoAppl)term).getConstructor())
          break Fail321;
        IStrategoTerm arg45 = term.getSubterm(1);
        if(arg45.getTermType() != IStrategoTerm.APPL || transform._consScopedEJPCall_3 != ((IStrategoAppl)arg45).getConstructor())
          break Fail321;
        IStrategoTerm arg48 = arg45.getSubterm(2);
        if(arg48.getTermType() != IStrategoTerm.APPL || transform._consBlock_1 != ((IStrategoAppl)arg48).getConstructor())
          break Fail321;
        if(e_26.value == null)
          e_26.value = arg48.getSubterm(0);
        else
          if(e_26.value != arg48.getSubterm(0) && !e_26.value.match(arg48.getSubterm(0)))
            break Fail321;
        if(true)
          return term;
      }
      return null;
    }
  }

  @SuppressWarnings("all") private static final class lifted22 extends Strategy 
  { 
    TermReference e_26;

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      Fail322:
      { 
        lifted24 lifted240 = new lifted24();
        lifted23 lifted230 = new lifted23();
        lifted240.e_26 = e_26;
        lifted230.e_26 = e_26;
        term = or_2_0.instance.invoke(context, term, lifted230, lifted240);
        if(term == null)
          break Fail322;
        if(true)
          return term;
      }
      return null;
    }
  }

  @SuppressWarnings("all") private static final class lifted24 extends Strategy 
  { 
    TermReference e_26;

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      Fail323:
      { 
        if(term.getTermType() != IStrategoTerm.APPL || transform._consExprStm_1 != ((IStrategoAppl)term).getConstructor())
          break Fail323;
        IStrategoTerm arg38 = term.getSubterm(0);
        if(arg38.getTermType() != IStrategoTerm.APPL || transform._consAssign_2 != ((IStrategoAppl)arg38).getConstructor())
          break Fail323;
        IStrategoTerm arg40 = arg38.getSubterm(1);
        if(arg40.getTermType() != IStrategoTerm.APPL || transform._consScopedEJPCall_3 != ((IStrategoAppl)arg40).getConstructor())
          break Fail323;
        IStrategoTerm arg43 = arg40.getSubterm(2);
        if(arg43.getTermType() != IStrategoTerm.APPL || transform._consBlock_1 != ((IStrategoAppl)arg43).getConstructor())
          break Fail323;
        if(e_26.value == null)
          e_26.value = arg43.getSubterm(0);
        else
          if(e_26.value != arg43.getSubterm(0) && !e_26.value.match(arg43.getSubterm(0)))
            break Fail323;
        if(true)
          return term;
      }
      return null;
    }
  }

  @SuppressWarnings("all") private static final class lifted23 extends Strategy 
  { 
    TermReference e_26;

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      Fail324:
      { 
        if(term.getTermType() != IStrategoTerm.APPL || transform._consExprStm_1 != ((IStrategoAppl)term).getConstructor())
          break Fail324;
        IStrategoTerm arg34 = term.getSubterm(0);
        if(arg34.getTermType() != IStrategoTerm.APPL || transform._consScopedEJPCall_3 != ((IStrategoAppl)arg34).getConstructor())
          break Fail324;
        IStrategoTerm arg37 = arg34.getSubterm(2);
        if(arg37.getTermType() != IStrategoTerm.APPL || transform._consBlock_1 != ((IStrategoAppl)arg37).getConstructor())
          break Fail324;
        if(e_26.value == null)
          e_26.value = arg37.getSubterm(0);
        else
          if(e_26.value != arg37.getSubterm(0) && !e_26.value.match(arg37.getSubterm(0)))
            break Fail324;
        if(true)
          return term;
      }
      return null;
    }
  }

  @SuppressWarnings("all") private static final class lifted20 extends Strategy 
  { 
    TermReference k_110;

    TermReference k_26;

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      Fail325:
      { 
        lifted21 lifted211 = new lifted21();
        lifted211.k_110 = k_110;
        lifted211.k_26 = k_26;
        term = try_1_0.instance.invoke(context, term, lifted211);
        if(term == null)
          break Fail325;
        if(true)
          return term;
      }
      return null;
    }
  }

  @SuppressWarnings("all") private static final class lifted21 extends Strategy 
  { 
    TermReference k_110;

    TermReference k_26;

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      Fail326:
      { 
        term = add_local_var_0_2.instance.invoke(context, term, k_110.value, k_26.value);
        if(term == null)
          break Fail326;
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
      Fail327:
      { 
        if(term.getTermType() != IStrategoTerm.APPL || transform._consEJPCall_2 != ((IStrategoAppl)term).getConstructor())
          break Fail327;
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
      Fail328:
      { 
        if(term.getTermType() != IStrategoTerm.APPL || transform._consScopedEJPCall_3 != ((IStrategoAppl)term).getConstructor())
          break Fail328;
        if(true)
          return term;
      }
      return null;
    }
  }

  @SuppressWarnings("all") private static final class lifted16 extends Strategy 
  { 
    TermReference f_15;

    TermReference d_110;

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      Fail329:
      { 
        lifted17 lifted170 = new lifted17();
        lifted170.f_15 = f_15;
        lifted170.d_110 = d_110;
        term = try_1_0.instance.invoke(context, term, lifted170);
        if(term == null)
          break Fail329;
        if(true)
          return term;
      }
      return null;
    }
  }

  @SuppressWarnings("all") private static final class lifted17 extends Strategy 
  { 
    TermReference f_15;

    TermReference d_110;

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      Fail330:
      { 
        IStrategoTerm q_15 = null;
        IStrategoTerm s_15 = null;
        IStrategoTerm t_15 = null;
        s_15 = term;
        q_15 = transform.constNone0;
        t_15 = s_15;
        term = ejp_to_java_0_4.instance.invoke(context, t_15, f_15.value, q_15, transform.constNone0, d_110.value);
        if(term == null)
          break Fail330;
        if(true)
          return term;
      }
      return null;
    }
  }

  @SuppressWarnings("all") private static final class lifted14 extends Strategy 
  { 
    TermReference z_15;

    TermReference d_110;

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      Fail331:
      { 
        lifted15 lifted150 = new lifted15();
        lifted150.z_15 = z_15;
        lifted150.d_110 = d_110;
        term = try_1_0.instance.invoke(context, term, lifted150);
        if(term == null)
          break Fail331;
        if(true)
          return term;
      }
      return null;
    }
  }

  @SuppressWarnings("all") private static final class lifted15 extends Strategy 
  { 
    TermReference z_15;

    TermReference d_110;

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      Fail332:
      { 
        IStrategoTerm h_16 = null;
        IStrategoTerm k_16 = null;
        IStrategoTerm l_16 = null;
        k_16 = term;
        h_16 = transform.constNone0;
        l_16 = k_16;
        term = ejp_to_java_0_4.instance.invoke(context, l_16, z_15.value, h_16, transform.constNone0, d_110.value);
        if(term == null)
          break Fail332;
        if(true)
          return term;
      }
      return null;
    }
  }

  @SuppressWarnings("all") private static final class lifted13 extends Strategy 
  { 
    TermReference a_110;

    TermReference u_16;

    TermReference v_16;

    TermReference b_110;

    TermReference c_110;

    TermReference d_110;

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      Fail333:
      { 
        term = convert_one_var_dec_0_6.instance.invokeDynamic(context, term, NO_STRATEGIES, new IStrategoTerm[]{a_110.value, u_16.value, v_16.value, b_110.value, c_110.value, d_110.value});
        if(term == null)
          break Fail333;
        if(true)
          return term;
      }
      return null;
    }
  }

  @SuppressWarnings("all") private static final class lifted11 extends Strategy 
  { 
    TermReference a_110;

    TermReference b_110;

    TermReference c_110;

    TermReference d_110;

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      Fail334:
      { 
        lifted12 lifted120 = new lifted12();
        lifted120.a_110 = a_110;
        lifted120.b_110 = b_110;
        lifted120.c_110 = c_110;
        lifted120.d_110 = d_110;
        term = try_1_0.instance.invoke(context, term, lifted120);
        if(term == null)
          break Fail334;
        if(true)
          return term;
      }
      return null;
    }
  }

  @SuppressWarnings("all") private static final class lifted12 extends Strategy 
  { 
    TermReference a_110;

    TermReference b_110;

    TermReference c_110;

    TermReference d_110;

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      Fail335:
      { 
        IStrategoTerm h_17 = null;
        h_17 = term;
        if(a_110.value == null)
          break Fail335;
        term = hashtable_copy_0_0.instance.invoke(context, a_110.value);
        if(term == null)
          break Fail335;
        term = ejp_to_java_0_4.instance.invoke(context, h_17, term, b_110.value, c_110.value, d_110.value);
        if(term == null)
          break Fail335;
        if(true)
          return term;
      }
      return null;
    }
  }

  @SuppressWarnings("all") private static final class lifted10 extends Strategy 
  { 
    TermReference a_110;

    TermReference b_110;

    TermReference b_18;

    TermReference d_110;

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      Fail336:
      { 
        term = ejp_to_java_0_4.instance.invoke(context, term, a_110.value, b_110.value, b_18.value, d_110.value);
        if(term == null)
          break Fail336;
        if(true)
          return term;
      }
      return null;
    }
  }

  @SuppressWarnings("all") private static final class lifted9 extends Strategy 
  { 
    TermReference a_110;

    TermReference b_110;

    TermReference c_110;

    TermReference d_110;

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      Fail337:
      { 
        term = ejp_to_java_0_4.instance.invoke(context, term, a_110.value, b_110.value, c_110.value, d_110.value);
        if(term == null)
          break Fail337;
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
      Fail338:
      { 
        if(term.getTermType() != IStrategoTerm.APPL || transform._consAnno_2 != ((IStrategoAppl)term).getConstructor())
          break Fail338;
        IStrategoTerm arg8 = term.getSubterm(0);
        if(arg8.getTermType() != IStrategoTerm.APPL || transform._consTypeName_1 != ((IStrategoAppl)arg8).getConstructor())
          break Fail338;
        IStrategoTerm arg9 = arg8.getSubterm(0);
        if(arg9.getTermType() != IStrategoTerm.APPL || transform._consId_1 != ((IStrategoAppl)arg9).getConstructor())
          break Fail338;
        IStrategoTerm arg10 = arg9.getSubterm(0);
        if(arg10.getTermType() != IStrategoTerm.STRING || !"ExplicitScopedJoinPoint".equals(((IStrategoString)arg10).stringValue()))
          break Fail338;
        if(true)
          return term;
      }
      return null;
    }
  }

  @SuppressWarnings("all") private static final class lifted6 extends Strategy 
  { 
    TermReference a_110;

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      Fail339:
      { 
        lifted7 lifted710 = new lifted7();
        lifted710.a_110 = a_110;
        term = try_1_0.instance.invoke(context, term, lifted710);
        if(term == null)
          break Fail339;
        if(true)
          return term;
      }
      return null;
    }
  }

  @SuppressWarnings("all") private static final class lifted7 extends Strategy 
  { 
    TermReference a_110;

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      Fail340:
      { 
        term = process_method_param_0_1.instance.invoke(context, term, a_110.value);
        if(term == null)
          break Fail340;
        if(true)
          return term;
      }
      return null;
    }
  }

  @SuppressWarnings("all") private static final class lifted4 extends Strategy 
  { 
    TermReference a_110;

    TermReference b_21;

    TermReference c_110;

    TermReference d_110;

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      Fail341:
      { 
        lifted5 lifted510 = new lifted5();
        lifted510.a_110 = a_110;
        lifted510.b_21 = b_21;
        lifted510.c_110 = c_110;
        lifted510.d_110 = d_110;
        term = try_1_0.instance.invoke(context, term, lifted510);
        if(term == null)
          break Fail341;
        if(true)
          return term;
      }
      return null;
    }
  }

  @SuppressWarnings("all") private static final class lifted5 extends Strategy 
  { 
    TermReference a_110;

    TermReference b_21;

    TermReference c_110;

    TermReference d_110;

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      Fail342:
      { 
        IStrategoTerm m_23 = null;
        m_23 = term;
        if(a_110.value == null)
          break Fail342;
        term = hashtable_copy_0_0.instance.invoke(context, a_110.value);
        if(term == null)
          break Fail342;
        term = ejp_to_java_0_4.instance.invoke(context, m_23, term, b_21.value, c_110.value, d_110.value);
        if(term == null)
          break Fail342;
        if(true)
          return term;
      }
      return null;
    }
  }

  @SuppressWarnings("all") private static final class lifted2 extends Strategy 
  { 
    TermReference a_110;

    TermReference b_110;

    TermReference c_110;

    TermReference d_110;

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      Fail343:
      { 
        lifted3 lifted310 = new lifted3();
        lifted310.a_110 = a_110;
        lifted310.b_110 = b_110;
        lifted310.c_110 = c_110;
        lifted310.d_110 = d_110;
        term = try_1_0.instance.invoke(context, term, lifted310);
        if(term == null)
          break Fail343;
        if(true)
          return term;
      }
      return null;
    }
  }

  @SuppressWarnings("all") private static final class lifted3 extends Strategy 
  { 
    TermReference a_110;

    TermReference b_110;

    TermReference c_110;

    TermReference d_110;

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      Fail344:
      { 
        IStrategoTerm v_22 = null;
        v_22 = term;
        if(a_110.value == null)
          break Fail344;
        term = hashtable_copy_0_0.instance.invoke(context, a_110.value);
        if(term == null)
          break Fail344;
        term = ejp_to_java_0_4.instance.invoke(context, v_22, term, b_110.value, c_110.value, d_110.value);
        if(term == null)
          break Fail344;
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
      Fail345:
      { 
        lifted1 lifted110 = new lifted1();
        lifted110.g_12 = g_12;
        lifted110.j_12 = j_12;
        term = try_1_0.instance.invoke(context, term, lifted110);
        if(term == null)
          break Fail345;
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
      Fail346:
      { 
        IStrategoTerm q_12 = null;
        IStrategoTerm s_12 = null;
        IStrategoTerm v_12 = null;
        s_12 = term;
        term = new_hashtable_0_0.instance.invoke(context, term);
        if(term == null)
          break Fail346;
        q_12 = term;
        v_12 = s_12;
        term = ejp_to_java_0_4.instance.invoke(context, v_12, q_12, g_12.value, transform.constNone0, j_12.value);
        if(term == null)
          break Fail346;
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
      varScope.addSVar("gen_auxilery_class_0_6", new InteropSDefT(gen_auxilery_class_0_6.instance, context));
      varScope.addSVar("gen_source_location_ann_0_0", new InteropSDefT(gen_source_location_ann_0_0.instance, context));
      varScope.addSVar("original_location_0_0", new InteropSDefT(original_location_0_0.instance, context));
      varScope.addSVar("original_line_0_0", new InteropSDefT(original_line_0_0.instance, context));
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
      varScope.addSVar("get_vars_in_block_0_0", new InteropSDefT(get_vars_in_block_0_0.instance, context));
      varScope.addSVar("get_inner_scoped_vars_0_0", new InteropSDefT(get_inner_scoped_vars_0_0.instance, context));
      varScope.addSVar("handle_pointcutargs_0_2", new InteropSDefT(handle_pointcutargs_0_2.instance, context));
      varScope.addSVar("handle_pointcutarg_helper_0_1", new InteropSDefT(handle_pointcutarg_helper_0_1.instance, context));
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
      varScope.addSVar("transform_0_0", new InteropSDefT(transform_0_0.instance, context));
      varScope.addSVar("transform_ast_0_0", new InteropSDefT(transform_ast_0_0.instance, context));
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
      varScope.addSVar("gen_auxilery_class_0_6", new InteropSDefT(classLoader, "transform$gen_auxilery_class_0_6", context));
      varScope.addSVar("gen_source_location_ann_0_0", new InteropSDefT(classLoader, "transform$gen_source_location_ann_0_0", context));
      varScope.addSVar("original_location_0_0", new InteropSDefT(classLoader, "transform$original_location_0_0", context));
      varScope.addSVar("original_line_0_0", new InteropSDefT(classLoader, "transform$original_line_0_0", context));
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
      varScope.addSVar("get_vars_in_block_0_0", new InteropSDefT(classLoader, "transform$get_vars_in_block_0_0", context));
      varScope.addSVar("get_inner_scoped_vars_0_0", new InteropSDefT(classLoader, "transform$get_inner_scoped_vars_0_0", context));
      varScope.addSVar("handle_pointcutargs_0_2", new InteropSDefT(classLoader, "transform$handle_pointcutargs_0_2", context));
      varScope.addSVar("handle_pointcutarg_helper_0_1", new InteropSDefT(classLoader, "transform$handle_pointcutarg_helper_0_1", context));
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
      varScope.addSVar("transform_0_0", new InteropSDefT(classLoader, "transform$transform_0_0", context));
      varScope.addSVar("transform_ast_0_0", new InteropSDefT(classLoader, "transform$transform_ast_0_0", context));
      varScope.addSVar("ejp_converter_compilation_unit_0_0", new InteropSDefT(classLoader, "transform$ejp_converter_compilation_unit_0_0", context));
      varScope.addSVar("check_for_change_in_aspect_or_class_0_0", new InteropSDefT(classLoader, "transform$check_for_change_in_aspect_or_class_0_0", context));
      varScope.addSVar("ejp_converter_aspect_or_class_0_1", new InteropSDefT(classLoader, "transform$ejp_converter_aspect_or_class_0_1", context));
      varScope.addSVar("OrComp_2_0", new InteropSDefT(classLoader, "transform$$Or$Comp_2_0", context));
      varScope.addSVar("AndComp_2_0", new InteropSDefT(classLoader, "transform$$And$Comp_2_0", context));
      varScope.addSVar("NotComp_1_0", new InteropSDefT(classLoader, "transform$$Not$Comp_1_0", context));
    }
  }
}
