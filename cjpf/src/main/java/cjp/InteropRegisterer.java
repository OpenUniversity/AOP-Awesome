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

@SuppressWarnings("unused") public class InteropRegisterer extends org.strategoxt.lang.InteropRegisterer 
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
    compiledContext.registerComponent("cjp");
    cjp.init(compiledContext);
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
    varScope.addSVar("closures_to_ajc_0_2_fragment_0", new InteropSDefT(closures_to_ajc_0_2_fragment_0.instance, context));
    varScope.addSVar("closures_to_ajc_0_2", new InteropSDefT(closures_to_ajc_0_2.instance, context));
    varScope.addSVar("joinpoint_params_to_string_0_0", new InteropSDefT(joinpoint_params_to_string_0_0.instance, context));
    varScope.addSVar("replace_proceed_calls_0_1", new InteropSDefT(replace_proceed_calls_0_1.instance, context));
    varScope.addSVar("primitiveToBoxObject_0_0", new InteropSDefT(primitive$To$Box$Object_0_0.instance, context));
    varScope.addSVar("gen_synthetic_method_name_0_0", new InteropSDefT(gen_synthetic_method_name_0_0.instance, context));
    varScope.addSVar("closures_to_java_0_0", new InteropSDefT(closures_to_java_0_0.instance, context));
    varScope.addSVar("closure_to_java_impl_0_0", new InteropSDefT(closure_to_java_impl_0_0.instance, context));
    varScope.addSVar("main_0_0", new InteropSDefT(main_0_0.instance, context));
    varScope.addSVar("handle_io_0_0", new InteropSDefT(handle_io_0_0.instance, context));
    varScope.addSVar("transform_0_0", new InteropSDefT(transform_0_0.instance, context));
    varScope.addSVar("transform_ast_0_0", new InteropSDefT(transform_ast_0_0.instance, context));
    varScope.addSVar("gen_source_location_0_0", new InteropSDefT(gen_source_location_0_0.instance, context));
    varScope.addSVar("origin_location_0_0", new InteropSDefT(origin_location_0_0.instance, context));
    varScope.addSVar("origin_file_0_0", new InteropSDefT(origin_file_0_0.instance, context));
    varScope.addSVar("closures_converter_compilation_unit_0_0", new InteropSDefT(closures_converter_compilation_unit_0_0.instance, context));
    varScope.addSVar("check_for_change_in_aspect_or_class_0_0", new InteropSDefT(check_for_change_in_aspect_or_class_0_0.instance, context));
    varScope.addSVar("closures_converter_aspect_or_class_0_1", new InteropSDefT(closures_converter_aspect_or_class_0_1.instance, context));
    varScope.addSVar("OrComp_2_0", new InteropSDefT($Or$Comp_2_0.instance, context));
    varScope.addSVar("AndComp_2_0", new InteropSDefT($And$Comp_2_0.instance, context));
    varScope.addSVar("NotComp_1_0", new InteropSDefT($Not$Comp_1_0.instance, context));
  }

  private void registerLazy(org.spoofax.interpreter.core.IContext context, Context compiledContext, ClassLoader classLoader, org.spoofax.interpreter.core.VarScope varScope)
  { 
    compiledContext.registerComponent("cjp");
    cjp.init(compiledContext);
    varScope.addSVar("aspectj_to_box_0_0_fragment_4", new InteropSDefT(classLoader, "cjp.aspectj_to_box_0_0_fragment_4", context));
    varScope.addSVar("aspectj_to_box_0_0_fragment_3", new InteropSDefT(classLoader, "cjp.aspectj_to_box_0_0_fragment_3", context));
    varScope.addSVar("aspectj_to_box_0_0_fragment_2", new InteropSDefT(classLoader, "cjp.aspectj_to_box_0_0_fragment_2", context));
    varScope.addSVar("aspectj_to_box_0_0_fragment_1", new InteropSDefT(classLoader, "cjp.aspectj_to_box_0_0_fragment_1", context));
    varScope.addSVar("aspectj_to_box_0_0_fragment_0", new InteropSDefT(classLoader, "cjp.aspectj_to_box_0_0_fragment_0", context));
    varScope.addSVar("aspectj_to_box_0_0", new InteropSDefT(classLoader, "cjp.aspectj_to_box_0_0", context));
    varScope.addSVar("has_leftmost_not_0_0", new InteropSDefT(classLoader, "cjp.has_leftmost_not_0_0", context));
    varScope.addSVar("option_to_boxes_0_0", new InteropSDefT(classLoader, "cjp.option_to_boxes_0_0", context));
    varScope.addSVar("pp_aspectj_string_0_0", new InteropSDefT(classLoader, "cjp.pp_aspectj_string_0_0", context));
    varScope.addSVar("remove_closures_additions_0_0", new InteropSDefT(classLoader, "cjp.remove_closures_additions_0_0", context));
    varScope.addSVar("closures_to_ajc_0_1", new InteropSDefT(classLoader, "cjp.closures_to_ajc_0_1", context));
    varScope.addSVar("closures_to_ajc_0_2_fragment_0", new InteropSDefT(classLoader, "cjp.closures_to_ajc_0_2_fragment_0", context));
    varScope.addSVar("closures_to_ajc_0_2", new InteropSDefT(classLoader, "cjp.closures_to_ajc_0_2", context));
    varScope.addSVar("joinpoint_params_to_string_0_0", new InteropSDefT(classLoader, "cjp.joinpoint_params_to_string_0_0", context));
    varScope.addSVar("replace_proceed_calls_0_1", new InteropSDefT(classLoader, "cjp.replace_proceed_calls_0_1", context));
    varScope.addSVar("primitiveToBoxObject_0_0", new InteropSDefT(classLoader, "cjp.primitive$To$Box$Object_0_0", context));
    varScope.addSVar("gen_synthetic_method_name_0_0", new InteropSDefT(classLoader, "cjp.gen_synthetic_method_name_0_0", context));
    varScope.addSVar("closures_to_java_0_0", new InteropSDefT(classLoader, "cjp.closures_to_java_0_0", context));
    varScope.addSVar("closure_to_java_impl_0_0", new InteropSDefT(classLoader, "cjp.closure_to_java_impl_0_0", context));
    varScope.addSVar("main_0_0", new InteropSDefT(classLoader, "cjp.main_0_0", context));
    varScope.addSVar("handle_io_0_0", new InteropSDefT(classLoader, "cjp.handle_io_0_0", context));
    varScope.addSVar("transform_0_0", new InteropSDefT(classLoader, "cjp.transform_0_0", context));
    varScope.addSVar("transform_ast_0_0", new InteropSDefT(classLoader, "cjp.transform_ast_0_0", context));
    varScope.addSVar("gen_source_location_0_0", new InteropSDefT(classLoader, "cjp.gen_source_location_0_0", context));
    varScope.addSVar("origin_location_0_0", new InteropSDefT(classLoader, "cjp.origin_location_0_0", context));
    varScope.addSVar("origin_file_0_0", new InteropSDefT(classLoader, "cjp.origin_file_0_0", context));
    varScope.addSVar("closures_converter_compilation_unit_0_0", new InteropSDefT(classLoader, "cjp.closures_converter_compilation_unit_0_0", context));
    varScope.addSVar("check_for_change_in_aspect_or_class_0_0", new InteropSDefT(classLoader, "cjp.check_for_change_in_aspect_or_class_0_0", context));
    varScope.addSVar("closures_converter_aspect_or_class_0_1", new InteropSDefT(classLoader, "cjp.closures_converter_aspect_or_class_0_1", context));
    varScope.addSVar("OrComp_2_0", new InteropSDefT(classLoader, "cjp.$Or$Comp_2_0", context));
    varScope.addSVar("AndComp_2_0", new InteropSDefT(classLoader, "cjp.$And$Comp_2_0", context));
    varScope.addSVar("NotComp_1_0", new InteropSDefT(classLoader, "cjp.$Not$Comp_1_0", context));
  }
}