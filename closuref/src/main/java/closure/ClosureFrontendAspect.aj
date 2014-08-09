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

import awesome.frontend.FrontendAspect;
import closure.transform.convert_0_0;
import closure.transform.pp_aspectj_string_0_0;

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

	private static Pattern a = Pattern.compile("@Closure .*? void (.*?)\\((.*?)\\)");

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

			System.out.println("returnType = " + returnType);

			String modifiedJoinpointCall = joinpointCall.replaceFirst("void", returnType);
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
		final TermFactory factory = new TermFactory();
		final IStrategoTerm tableTerm = new TermReader(factory).parseFromStream(getClass().getResourceAsStream("/Closure.tbl"));
		final ParseTable pt = new ParseTable(tableTerm, factory);
		final SGLR sglr = new SGLR(new TreeBuilder(new TermTreeFactory(new TermFactory()), true), pt);
		sglr.setUseStructureRecovery(false);
		final IStrategoTerm parsed = (IStrategoTerm) sglr.parse(new FileReader(input));

		Context context = transform.init();
	    context.setStandAlone(true);
	    IStrategoTerm result = null;
	    try {
	    	logger.info("parsed: " + parsed);
	    	IStrategoTerm transformed = convert_0_0.instance.invoke(context, parsed);
	    	logger.info("transformed: " + transformed);
	    	result = pp_aspectj_string_0_0.instance.invoke(context, transformed);
	    }
	    finally {
	    	context.setStandAlone(false);
	    	context.getIOAgent().closeAllFiles();
	    }

		String inputPath = input.getPath();
		logger.info("input path: " + inputPath);
		String path = FilenameUtils.removeExtension(inputPath) + ".java";
		String outputPath = FilenameUtils.concat(
				getOutputDir().getAbsolutePath(),
				path.startsWith(File.separator) ? path.substring(1) : path);
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
