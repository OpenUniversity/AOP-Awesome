package ejp;

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
    compiledContext.registerComponent("ejp");
    ejp.init(compiledContext);
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
    varScope.addSVar("gen_source_location_0_0", new InteropSDefT(gen_source_location_0_0.instance, context));
    varScope.addSVar("origin_location_0_0", new InteropSDefT(origin_location_0_0.instance, context));
    varScope.addSVar("origin_file_0_0", new InteropSDefT(origin_file_0_0.instance, context));
    varScope.addSVar("ejp_converter_compilation_unit_0_0", new InteropSDefT(ejp_converter_compilation_unit_0_0.instance, context));
    varScope.addSVar("check_for_change_in_aspect_or_class_0_0", new InteropSDefT(check_for_change_in_aspect_or_class_0_0.instance, context));
    varScope.addSVar("ejp_converter_aspect_or_class_0_1", new InteropSDefT(ejp_converter_aspect_or_class_0_1.instance, context));
    varScope.addSVar("OrComp_2_0", new InteropSDefT($Or$Comp_2_0.instance, context));
    varScope.addSVar("AndComp_2_0", new InteropSDefT($And$Comp_2_0.instance, context));
    varScope.addSVar("NotComp_1_0", new InteropSDefT($Not$Comp_1_0.instance, context));
  }

  private void registerLazy(org.spoofax.interpreter.core.IContext context, Context compiledContext, ClassLoader classLoader, org.spoofax.interpreter.core.VarScope varScope)
  { 
    compiledContext.registerComponent("ejp");
    ejp.init(compiledContext);
    varScope.addSVar("fetch_0_1", new InteropSDefT(classLoader, "ejp.fetch_0_1", context));
    varScope.addSVar("ejp_to_java2_0_0", new InteropSDefT(classLoader, "ejp.ejp_to_java2_0_0", context));
    varScope.addSVar("ejp_to_java_0_4", new InteropSDefT(classLoader, "ejp.ejp_to_java_0_4", context));
    varScope.addSVar("convert_one_var_dec_0_6", new InteropSDefT(classLoader, "ejp.convert_one_var_dec_0_6", context));
    varScope.addSVar("convert_var_dec_by_ejp_call_0_6", new InteropSDefT(classLoader, "ejp.convert_var_dec_by_ejp_call_0_6", context));
    varScope.addSVar("add_local_vars_0_1", new InteropSDefT(classLoader, "ejp.add_local_vars_0_1", context));
    varScope.addSVar("add_local_var_0_2", new InteropSDefT(classLoader, "ejp.add_local_var_0_2", context));
    varScope.addSVar("process_method_param_0_1", new InteropSDefT(classLoader, "ejp.process_method_param_0_1", context));
    varScope.addSVar("gen_auxilery_class_0_5", new InteropSDefT(classLoader, "ejp.gen_auxilery_class_0_5", context));
    varScope.addSVar("gen_method_annotation_0_0", new InteropSDefT(classLoader, "ejp.gen_method_annotation_0_0", context));
    varScope.addSVar("gen_compact_var_declaration_0_2", new InteropSDefT(classLoader, "ejp.gen_compact_var_declaration_0_2", context));
    varScope.addSVar("gen_before_call_assignments_0_2", new InteropSDefT(classLoader, "ejp.gen_before_call_assignments_0_2", context));
    varScope.addSVar("gen_after_call_simple_assignments_0_2", new InteropSDefT(classLoader, "ejp.gen_after_call_simple_assignments_0_2", context));
    varScope.addSVar("gen_after_call_assignments_with_declarations_0_2", new InteropSDefT(classLoader, "ejp.gen_after_call_assignments_with_declarations_0_2", context));
    varScope.addSVar("create_method_invokation_0_2", new InteropSDefT(classLoader, "ejp.create_method_invokation_0_2", context));
    varScope.addSVar("create_method_invokation_0_1", new InteropSDefT(classLoader, "ejp.create_method_invokation_0_1", context));
    varScope.addSVar("remove_scoped_ejp_var_decs_0_0", new InteropSDefT(classLoader, "ejp.remove_scoped_ejp_var_decs_0_0", context));
    varScope.addSVar("ejp_call_to_method_invokation_0_4", new InteropSDefT(classLoader, "ejp.ejp_call_to_method_invokation_0_4", context));
    varScope.addSVar("scoped_ejp_to_java_0_4", new InteropSDefT(classLoader, "ejp.scoped_ejp_to_java_0_4", context));
    varScope.addSVar("get_vars_in_block_0_0", new InteropSDefT(classLoader, "ejp.get_vars_in_block_0_0", context));
    varScope.addSVar("get_inner_scoped_vars_0_0", new InteropSDefT(classLoader, "ejp.get_inner_scoped_vars_0_0", context));
    varScope.addSVar("handle_pointcutargs_0_2", new InteropSDefT(classLoader, "ejp.handle_pointcutargs_0_2", context));
    varScope.addSVar("handle_pointcutarg_helper_0_1", new InteropSDefT(classLoader, "ejp.handle_pointcutarg_helper_0_1", context));
    varScope.addSVar("remove_vars_decs_from_local_var_dec_stm_0_0", new InteropSDefT(classLoader, "ejp.remove_vars_decs_from_local_var_dec_stm_0_0", context));
    varScope.addSVar("remove_var_dec_0_0", new InteropSDefT(classLoader, "ejp.remove_var_dec_0_0", context));
    varScope.addSVar("pointcutarg_0_3", new InteropSDefT(classLoader, "ejp.pointcutarg_0_3", context));
    varScope.addSVar("gen__ejp__name_0_0", new InteropSDefT(classLoader, "ejp.gen__ejp__name_0_0", context));
    varScope.addSVar("typename__2__ambname_0_0", new InteropSDefT(classLoader, "ejp.typename__2__ambname_0_0", context));
    varScope.addSVar("gen__nomatch__pointcut__name_0_0", new InteropSDefT(classLoader, "ejp.gen__nomatch__pointcut__name_0_0", context));
    varScope.addSVar("gen__ejpscope__method__name_0_2", new InteropSDefT(classLoader, "ejp.gen__ejpscope__method__name_0_2", context));
    varScope.addSVar("convert_package_name_0_0", new InteropSDefT(classLoader, "ejp.convert_package_name_0_0", context));
    varScope.addSVar("gen__ejpscope__method__name_0_0", new InteropSDefT(classLoader, "ejp.gen__ejpscope__method__name_0_0", context));
    varScope.addSVar("gen__ejpscope__method__name__helper_0_0", new InteropSDefT(classLoader, "ejp.gen__ejpscope__method__name__helper_0_0", context));
    varScope.addSVar("random_string_0_0", new InteropSDefT(classLoader, "ejp.random_string_0_0", context));
    varScope.addSVar("gen_auxilary_class_name_0_0", new InteropSDefT(classLoader, "ejp.gen_auxilary_class_name_0_0", context));
    varScope.addSVar("my_hashtable_remove_0_1", new InteropSDefT(classLoader, "ejp.my_hashtable_remove_0_1", context));
    varScope.addSVar("my_hashtable_union_0_1", new InteropSDefT(classLoader, "ejp.my_hashtable_union_0_1", context));
    varScope.addSVar("my_hashtable_union_helper_0_2", new InteropSDefT(classLoader, "ejp.my_hashtable_union_helper_0_2", context));
    varScope.addSVar("add_key_to_multiple_values_table_0_2", new InteropSDefT(classLoader, "ejp.add_key_to_multiple_values_table_0_2", context));
    varScope.addSVar("allow_extends_1_1", new InteropSDefT(classLoader, "ejp.allow_extends_1_1", context));
    varScope.addSVar("allow_extends_2_1", new InteropSDefT(classLoader, "ejp.allow_extends_2_1", context));
    varScope.addSVar("allow_extends_helper_2_0", new InteropSDefT(classLoader, "ejp.allow_extends_helper_2_0", context));
    varScope.addSVar("fetch_type_0_0", new InteropSDefT(classLoader, "ejp.fetch_type_0_0", context));
    varScope.addSVar("ejp_to_ajc_0_3", new InteropSDefT(classLoader, "ejp.ejp_to_ajc_0_3", context));
    varScope.addSVar("gen_pointcutargs_pointcuts_0_1", new InteropSDefT(classLoader, "ejp.gen_pointcutargs_pointcuts_0_1", context));
    varScope.addSVar("convet_pointcutarg_to_pointcut_0_0", new InteropSDefT(classLoader, "ejp.convet_pointcutarg_to_pointcut_0_0", context));
    varScope.addSVar("gen_method_head_0_3", new InteropSDefT(classLoader, "ejp.gen_method_head_0_3", context));
    varScope.addSVar("gen_ejp_annotation_0_1", new InteropSDefT(classLoader, "ejp.gen_ejp_annotation_0_1", context));
    varScope.addSVar("gen_method_body_0_2", new InteropSDefT(classLoader, "ejp.gen_method_body_0_2", context));
    varScope.addSVar("get_default_return_value_for_return_type_0_0", new InteropSDefT(classLoader, "ejp.get_default_return_value_for_return_type_0_0", context));
    varScope.addSVar("fetch_default_value_0_0", new InteropSDefT(classLoader, "ejp.fetch_default_value_0_0", context));
    varScope.addSVar("fetch_handles_list_0_0", new InteropSDefT(classLoader, "ejp.fetch_handles_list_0_0", context));
    varScope.addSVar("remove_ejp_decs_0_0", new InteropSDefT(classLoader, "ejp.remove_ejp_decs_0_0", context));
    varScope.addSVar("aspectj_to_box_0_0_fragment_4", new InteropSDefT(classLoader, "ejp.aspectj_to_box_0_0_fragment_4", context));
    varScope.addSVar("aspectj_to_box_0_0_fragment_3", new InteropSDefT(classLoader, "ejp.aspectj_to_box_0_0_fragment_3", context));
    varScope.addSVar("aspectj_to_box_0_0_fragment_2", new InteropSDefT(classLoader, "ejp.aspectj_to_box_0_0_fragment_2", context));
    varScope.addSVar("aspectj_to_box_0_0_fragment_1", new InteropSDefT(classLoader, "ejp.aspectj_to_box_0_0_fragment_1", context));
    varScope.addSVar("aspectj_to_box_0_0_fragment_0", new InteropSDefT(classLoader, "ejp.aspectj_to_box_0_0_fragment_0", context));
    varScope.addSVar("aspectj_to_box_0_0", new InteropSDefT(classLoader, "ejp.aspectj_to_box_0_0", context));
    varScope.addSVar("has_leftmost_not_0_0", new InteropSDefT(classLoader, "ejp.has_leftmost_not_0_0", context));
    varScope.addSVar("option_to_boxes_0_0", new InteropSDefT(classLoader, "ejp.option_to_boxes_0_0", context));
    varScope.addSVar("pp_aspectj_string_0_0", new InteropSDefT(classLoader, "ejp.pp_aspectj_string_0_0", context));
    varScope.addSVar("main_0_0", new InteropSDefT(classLoader, "ejp.main_0_0", context));
    varScope.addSVar("handle_io_0_0", new InteropSDefT(classLoader, "ejp.handle_io_0_0", context));
    varScope.addSVar("transform_0_0", new InteropSDefT(classLoader, "ejp.transform_0_0", context));
    varScope.addSVar("transform_ast_0_0", new InteropSDefT(classLoader, "ejp.transform_ast_0_0", context));
    varScope.addSVar("gen_source_location_0_0", new InteropSDefT(classLoader, "ejp.gen_source_location_0_0", context));
    varScope.addSVar("origin_location_0_0", new InteropSDefT(classLoader, "ejp.origin_location_0_0", context));
    varScope.addSVar("origin_file_0_0", new InteropSDefT(classLoader, "ejp.origin_file_0_0", context));
    varScope.addSVar("ejp_converter_compilation_unit_0_0", new InteropSDefT(classLoader, "ejp.ejp_converter_compilation_unit_0_0", context));
    varScope.addSVar("check_for_change_in_aspect_or_class_0_0", new InteropSDefT(classLoader, "ejp.check_for_change_in_aspect_or_class_0_0", context));
    varScope.addSVar("ejp_converter_aspect_or_class_0_1", new InteropSDefT(classLoader, "ejp.ejp_converter_aspect_or_class_0_1", context));
    varScope.addSVar("OrComp_2_0", new InteropSDefT(classLoader, "ejp.$Or$Comp_2_0", context));
    varScope.addSVar("AndComp_2_0", new InteropSDefT(classLoader, "ejp.$And$Comp_2_0", context));
    varScope.addSVar("NotComp_1_0", new InteropSDefT(classLoader, "ejp.$Not$Comp_1_0", context));
  }
}