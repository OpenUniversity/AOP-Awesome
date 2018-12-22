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
    compiledContext.registerComponent("cool");
    cool.init(compiledContext);
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
    varScope.addSVar("transform_ast_0_0", new InteropSDefT(transform_ast_0_0.instance, context));
    varScope.addSVar("gen_source_location_0_0", new InteropSDefT(gen_source_location_0_0.instance, context));
    varScope.addSVar("origin_location_0_0", new InteropSDefT(origin_location_0_0.instance, context));
    varScope.addSVar("origin_file_0_0", new InteropSDefT(origin_file_0_0.instance, context));
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
    varScope.addSVar("make_lock_and_unlock_methods_0_10", new InteropSDefT(make_lock_and_unlock_methods_0_10.instance, context));
    varScope.addSVar("make_unlock_method_0_3", new InteropSDefT(make_unlock_method_0_3.instance, context));
    varScope.addSVar("make_lock_method_0_9", new InteropSDefT(make_lock_method_0_9.instance, context));
    varScope.addSVar("fillMethodMaps_0_4", new InteropSDefT(fill$Method$Maps_0_4.instance, context));
    varScope.addSVar("add_condition_fields_0_0", new InteropSDefT(add_condition_fields_0_0.instance, context));
    varScope.addSVar("add_coordinator_fields_0_0", new InteropSDefT(add_coordinator_fields_0_0.instance, context));
    varScope.addSVar("get_methods_list_0_0", new InteropSDefT(get_methods_list_0_0.instance, context));
    varScope.addSVar("gen_source_location_ann_0_0", new InteropSDefT(gen_source_location_ann_0_0.instance, context));
    varScope.addSVar("get_location_0_0", new InteropSDefT(get_location_0_0.instance, context));
    varScope.addSVar("get_file_0_0", new InteropSDefT(get_file_0_0.instance, context));
    varScope.addSVar("get_line_0_0", new InteropSDefT(get_line_0_0.instance, context));
  }

  private void registerLazy(org.spoofax.interpreter.core.IContext context, Context compiledContext, ClassLoader classLoader, org.spoofax.interpreter.core.VarScope varScope)
  { 
    compiledContext.registerComponent("cool");
    cool.init(compiledContext);
    varScope.addSVar("fetch__full__class__name_0_0", new InteropSDefT(classLoader, "cool.fetch__full__class__name_0_0", context));
    varScope.addSVar("pp_type_0_0", new InteropSDefT(classLoader, "cool.pp_type_0_0", context));
    varScope.addSVar("add__externals_0_1", new InteropSDefT(classLoader, "cool.add__externals_0_1", context));
    varScope.addSVar("add_external_impl_0_2", new InteropSDefT(classLoader, "cool.add_external_impl_0_2", context));
    varScope.addSVar("add_external_impl_0_9", new InteropSDefT(classLoader, "cool.add_external_impl_0_9", context));
    varScope.addSVar("is__on__entry__or__on__exit__method_0_0", new InteropSDefT(classLoader, "cool.is__on__entry__or__on__exit__method_0_0", context));
    varScope.addSVar("add__params_0_4", new InteropSDefT(classLoader, "cool.add__params_0_4", context));
    varScope.addSVar("add__var_0_5", new InteropSDefT(classLoader, "cool.add__var_0_5", context));
    varScope.addSVar("try_to_get_type_0_3", new InteropSDefT(classLoader, "cool.try_to_get_type_0_3", context));
    varScope.addSVar("cast_equality_type_0_0", new InteropSDefT(classLoader, "cool.cast_equality_type_0_0", context));
    varScope.addSVar("cast_bounded_conditional_type_0_0", new InteropSDefT(classLoader, "cool.cast_bounded_conditional_type_0_0", context));
    varScope.addSVar("cast_shift_type_0_0", new InteropSDefT(classLoader, "cool.cast_shift_type_0_0", context));
    varScope.addSVar("cast_bounded_arithmetic_type_0_0", new InteropSDefT(classLoader, "cool.cast_bounded_arithmetic_type_0_0", context));
    varScope.addSVar("cast_conditional_type_0_0", new InteropSDefT(classLoader, "cool.cast_conditional_type_0_0", context));
    varScope.addSVar("ensure__number_0_0", new InteropSDefT(classLoader, "cool.ensure__number_0_0", context));
    varScope.addSVar("get_LHS_type_0_3", new InteropSDefT(classLoader, "cool.get_$L$H$S_type_0_3", context));
    varScope.addSVar("get_type_of_0_3", new InteropSDefT(classLoader, "cool.get_type_of_0_3", context));
    varScope.addSVar("handle_expr_0_7", new InteropSDefT(classLoader, "cool.handle_expr_0_7", context));
    varScope.addSVar("generate_invoke_ref_0_1", new InteropSDefT(classLoader, "cool.generate_invoke_ref_0_1", context));
    varScope.addSVar("generate_ref_method__name_0_2", new InteropSDefT(classLoader, "cool.generate_ref_method__name_0_2", context));
    varScope.addSVar("increament_0_2", new InteropSDefT(classLoader, "cool.increament_0_2", context));
    varScope.addSVar("decreament_0_2", new InteropSDefT(classLoader, "cool.decreament_0_2", context));
    varScope.addSVar("create_ref_method_0_4", new InteropSDefT(classLoader, "cool.create_ref_method_0_4", context));
    varScope.addSVar("get_expr_type_0_3", new InteropSDefT(classLoader, "cool.get_expr_type_0_3", context));
    varScope.addSVar("type_of_0_3", new InteropSDefT(classLoader, "cool.type_of_0_3", context));
    varScope.addSVar("fetch_0_0", new InteropSDefT(classLoader, "cool.fetch_0_0", context));
    varScope.addSVar("main_0_0", new InteropSDefT(classLoader, "cool.main_0_0", context));
    varScope.addSVar("handle_io_0_0", new InteropSDefT(classLoader, "cool.handle_io_0_0", context));
    varScope.addSVar("transform_0_0", new InteropSDefT(classLoader, "cool.transform_0_0", context));
    varScope.addSVar("transform_ast_0_0", new InteropSDefT(classLoader, "cool.transform_ast_0_0", context));
    varScope.addSVar("gen_source_location_0_0", new InteropSDefT(classLoader, "cool.gen_source_location_0_0", context));
    varScope.addSVar("origin_location_0_0", new InteropSDefT(classLoader, "cool.origin_location_0_0", context));
    varScope.addSVar("origin_file_0_0", new InteropSDefT(classLoader, "cool.origin_file_0_0", context));
    varScope.addSVar("gen_isRunByOthers_method_0_0", new InteropSDefT(classLoader, "cool.gen_is$Run$By$Others_method_0_0", context));
    varScope.addSVar("gen_method_state_0_1", new InteropSDefT(classLoader, "cool.gen_method_state_0_1", context));
    varScope.addSVar("gen_method_state_name_0_1", new InteropSDefT(classLoader, "cool.gen_method_state_name_0_1", context));
    varScope.addSVar("gen_requires_method_name_0_1", new InteropSDefT(classLoader, "cool.gen_requires_method_name_0_1", context));
    varScope.addSVar("gen_on_entry_method_name_0_1", new InteropSDefT(classLoader, "cool.gen_on_entry_method_name_0_1", context));
    varScope.addSVar("gen_on_exit_method_name_0_1", new InteropSDefT(classLoader, "cool.gen_on_exit_method_name_0_1", context));
    varScope.addSVar("make_while_condition_0_1", new InteropSDefT(classLoader, "cool.make_while_condition_0_1", context));
    varScope.addSVar("gen_class_head_0_1", new InteropSDefT(classLoader, "cool.gen_class_head_0_1", context));
    varScope.addSVar("make_requires_method_0_3", new InteropSDefT(classLoader, "cool.make_requires_method_0_3", context));
    varScope.addSVar("make_on_entry_method_0_4", new InteropSDefT(classLoader, "cool.make_on_entry_method_0_4", context));
    varScope.addSVar("make_on_exit_method_0_4", new InteropSDefT(classLoader, "cool.make_on_exit_method_0_4", context));
    varScope.addSVar("convert_0_0", new InteropSDefT(classLoader, "cool.convert_0_0", context));
    varScope.addSVar("generate_imports_0_2", new InteropSDefT(classLoader, "cool.generate_imports_0_2", context));
    varScope.addSVar("get_coordinator_0_1", new InteropSDefT(classLoader, "cool.get_coordinator_0_1", context));
    varScope.addSVar("fetch_coordinator_type_0_0", new InteropSDefT(classLoader, "cool.fetch_coordinator_type_0_0", context));
    varScope.addSVar("convert_coordinator_declaration_0_1", new InteropSDefT(classLoader, "cool.convert_coordinator_declaration_0_1", context));
    varScope.addSVar("gen_coordinator_body_0_1", new InteropSDefT(classLoader, "cool.gen_coordinator_body_0_1", context));
    varScope.addSVar("make_lock_and_unlock_methods_0_10", new InteropSDefT(classLoader, "cool.make_lock_and_unlock_methods_0_10", context));
    varScope.addSVar("make_unlock_method_0_3", new InteropSDefT(classLoader, "cool.make_unlock_method_0_3", context));
    varScope.addSVar("make_lock_method_0_9", new InteropSDefT(classLoader, "cool.make_lock_method_0_9", context));
    varScope.addSVar("fillMethodMaps_0_4", new InteropSDefT(classLoader, "cool.fill$Method$Maps_0_4", context));
    varScope.addSVar("add_condition_fields_0_0", new InteropSDefT(classLoader, "cool.add_condition_fields_0_0", context));
    varScope.addSVar("add_coordinator_fields_0_0", new InteropSDefT(classLoader, "cool.add_coordinator_fields_0_0", context));
    varScope.addSVar("get_methods_list_0_0", new InteropSDefT(classLoader, "cool.get_methods_list_0_0", context));
    varScope.addSVar("gen_source_location_ann_0_0", new InteropSDefT(classLoader, "cool.gen_source_location_ann_0_0", context));
    varScope.addSVar("get_location_0_0", new InteropSDefT(classLoader, "cool.get_location_0_0", context));
    varScope.addSVar("get_file_0_0", new InteropSDefT(classLoader, "cool.get_file_0_0", context));
    varScope.addSVar("get_line_0_0", new InteropSDefT(classLoader, "cool.get_line_0_0", context));
  }
}