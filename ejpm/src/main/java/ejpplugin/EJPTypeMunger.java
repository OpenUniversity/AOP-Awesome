package ejpplugin;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.logging.Logger;

import org.aspectj.apache.bcel.classfile.annotation.AnnotationGen;
import org.aspectj.weaver.ResolvedMember;
import org.aspectj.weaver.ResolvedPointcutDefinition;
import org.aspectj.weaver.ResolvedType;
import org.aspectj.weaver.UnresolvedType;
import org.aspectj.weaver.bcel.BcelMethod;
import org.aspectj.weaver.patterns.Pointcut;

public class EJPTypeMunger {

	private Logger logger = Logger.getLogger(EJPTypeMunger.class.getName());

	PointcutargsHandler pointcutargsHandler = new PointcutargsHandler();
	
	public EJPTypeMunger() {
	}

	public void process(ResolvedType clazz) {
//		logger.info("at process " + clazz.getName());
		ResolvedMember[] pointcuts = clazz.getDeclaredPointcuts();
		if (pointcuts.length > 0) {
//			logger.info("type:");
//			logger.info(pointcuts[0].getClass().getName());
			ResolvedPointcutDefinition rpd = (ResolvedPointcutDefinition) pointcuts[0];
			Pointcut pc = rpd.getPointcut();
		}
		for (ResolvedMember method : clazz.getDeclaredMethods()) {
			AnnotationGen ann = Utils.getEJPAnnotation(method);
			if (ann == null)
				continue;
			String typeName = ann.getTypeName();
//			logger.info("found annotation " + typeName);
			if (typeName.equals(Utils.EJP_Pointcutargs.getName())) {
				processPointcutargs((BcelMethod) method, ann);
				return;
			}
			if (typeName.equals(Utils.EJP_ExplicitScopedJoinPoint.getName())) {
				processScopedEjp((BcelMethod)method);
				return;
			}
			if (typeName.equals(Utils.EJP_ExplicitJoinPoint.getName())) {
				processEjp((BcelMethod)method);
				return;
			}
		}
	}

	private void processPointcutargs(BcelMethod method, AnnotationGen ann) {
		String methodName = method.getName();
//		logger.info("syntetic pointcut name = " + methodName);
		UnresolvedType a = method.getDeclaringType();
		String pointcutName = Utils.getAnnotationElementValue(ann, "joinpoint").stringifyValue()
				+ "." + Utils.getAnnotationElementValue(ann, "pointcut").stringifyValue();
		String expr = Utils.getAnnotationElementValue(ann, "expr").stringifyValue();
//		logger.info("got expr: " + expr);
		pointcutargsHandler.add(a, pointcutName, expr);
	}

	private void processScopedEjp(BcelMethod method) {
//		logger.info("scoped method name = " + method.getName());
//		logger.info("scoped method declaring type = " + method.getDeclaringType());
	}

	private void processEjp(BcelMethod method) {
//		logger.info("regular mehtod name = " + method.getName());
	}
	
	public void clear() {
		
	}

	public String getExprForPointcutargs(UnresolvedType type, String method) {
		List<String> exprs = pointcutargsHandler.getFor(type, method);
		if (exprs == null)
			return null;
		
		Iterator<String> exprIterator = exprs.iterator();
		String result = exprIterator.hasNext() ? "("+exprIterator.next()+")" : "";
		while (exprIterator.hasNext())
			result += " || (" + exprIterator.next() + ")";
		return result;
	}
	
	private class PointcutargsHandler {
		private Map<UnresolvedType, Map<Object, List<String>>> type2pointcutargsExtensions = new HashMap<UnresolvedType, Map<Object,List<String>>>();
		
		public void add(UnresolvedType aspect, Object method, String expr) {
//			logger.info("adding aspect = " + aspect + " method = " + method);
			if (!type2pointcutargsExtensions.containsKey(aspect)) {
				type2pointcutargsExtensions.put(aspect, new HashMap<Object, List<String>>());
			}
			
			Map<Object, List<String>> pointcutargs2exprs = type2pointcutargsExtensions.get(aspect);
			
			if (!pointcutargs2exprs.containsKey(method)) {
				pointcutargs2exprs.put(method, new ArrayList<String>());
			}
			
			pointcutargs2exprs.get(method).add(expr);
		}
		
		public List<String> getFor(UnresolvedType type, String method) {
			if (!type2pointcutargsExtensions.containsKey(type))
				return null;
			
			Map<Object, List<String>> li = type2pointcutargsExtensions.get(type);
			for (Object key : li.keySet()) {
				if (method.startsWith("ajc$pointcut$" + key))
					return li.get(key);
			}
				
			return null;
		}
	}
}
