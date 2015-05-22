package closure;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.apache.commons.io.FileUtils;
import org.apache.commons.io.FilenameUtils;
import org.spoofax.interpreter.terms.IStrategoTerm;
import org.spoofax.jsglr.client.ParseTable;
import org.spoofax.jsglr.client.imploder.TermTreeFactory;
import org.spoofax.jsglr.client.imploder.TreeBuilder;
import org.spoofax.jsglr.io.SGLR;
import org.spoofax.terms.TermFactory;
import org.spoofax.terms.io.binary.TermReader;
import org.strategoxt.lang.Context;

import org.openu.awesome.frontend.FrontendAspect;
import closure.transform.transform_0_0;

public aspect ClosureFrontendAspect extends FrontendAspect {
	private static Logger logger = Logger.getLogger(ClosureFrontendAspect.class.getName());

	List<File> convertedFiles = new ArrayList<File>();

	ClosureFrontendAspect() {
		new InteropRegisterer(joinpoint_0_3.instance);
	}

	after(String[] originalArgs): parseCommandLine(originalArgs) {
		for (File file : convertedFiles) {
			String input = readFileToString(file);

			writeStringToFile(file, fixJoinpointCalls(input));
		}
	}

	private void writeStringToFile(File file, String output) {
		try {
			FileUtils.writeStringToFile(file, output);
		} catch (IOException e) {
			// // not possible
			e.printStackTrace();
		}
	}

	private String readFileToString(File file) {
		try {
			return FileUtils.readFileToString(file);
		} catch (IOException e) {
			// not possible
			e.printStackTrace();
			return null;
		}
	}

	private static Pattern a = Pattern.compile("@Closure public void (.*?)\\((.*?)\\)");

	private String fixJoinpointCalls(String input) {
		Matcher matcher = a.matcher(input);
		while(matcher.find()) {
			String joinpointCall = matcher.group(0);
			String joinpointName = matcher.group(1);
			String joinpointArgs = getJoinpointArgumentsAsString(matcher.group(2));

			if (!joinpoint_0_3.instance.isJoinpointDeclared(joinpointName)) {
				continue;
			}

			String returnType = joinpoint_0_3.instance.getReturnTypeForJoinpoint(joinpointName);
			String exceptions = joinpoint_0_3.instance.getExceptionForJoinpoint(joinpointName);

			String modifiedJoinpointCall = joinpointCall.replaceFirst("void", returnType) + (exceptions.isEmpty() ? "" : exceptions);
			input = input.replace(joinpointCall, modifiedJoinpointCall);
		}

		return input;
	}

	public static String getJoinpointArgumentsAsString(String args) {
		String output = "";
		for (String arg : args.split(",")) {
			output += ":" +  arg.trim().split("\\s+")[0];
		}
		return output.isEmpty() ? "" : output.substring(1);
	}

	@Override
	protected List<String> postfix() {
		return Arrays.asList("aj", "java");
	}

	@Override
	protected File convert2java(File input) throws Exception {
	    Context context = transform.init();
	    context.setStandAlone(true);
	    IStrategoTerm result = null;
	    IStrategoTerm pathTerm = new TermFactory().makeString(input.getAbsolutePath());

	    try {
                result = transform_0_0.instance.invoke(context, pathTerm);
	    }
	    finally {
	    	context.setStandAlone(false);
	    	context.getIOAgent().closeAllFiles();
	    }

		String path = input.getPath();
		logger.info("input path: " + path);
		String outputPath = path.replaceFirst("src", "generated");
		logger.info("output path: " + outputPath);
		File output = new File(outputPath);
		if (output.exists())
			FileUtils.forceDelete(output);
		
		FileUtils.forceMkdir(output.getParentFile());
		output.createNewFile();
		FileUtils.writeStringToFile(output, aa(result.toString())); 

		convertedFiles.add(output);

		return output;
	}

	private String aa(String  input) {
		return input.substring(1, input.length()-1).replaceAll("\\\\n", "\n").replaceAll("\\\\\"", ""+'"');
	}
}
