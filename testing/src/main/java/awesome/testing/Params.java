package awesome.testing;

import java.util.List;

import com.beust.jcommander.IStringConverter;
import com.beust.jcommander.Parameter;
import com.beust.jcommander.Parameters;

//@Parameters(separators="=")
public class Params {

	@Parameter(names = "-file", description="file")
	public List<String> file;

	@Parameter(names = "-n", converter = RangeConverter.class)
	public Range range;

	@Parameter(names = "-classpath")
	public String classpath;

	@Parameter(names = "-1.5", arity=0)
	public boolean java15;

	@Parameter(names = "-Xset:pipelineCompilation=false")
	public boolean notPipeline;

	public static class RangeConverter implements IStringConverter<Range> {
		public Range convert(String value) {
			Range result = new Range();
			String[] s = value.split("-");
			result.from = Integer.parseInt(s[0]);
			result.to = Integer.parseInt(s[1]);

			return result;
		}
	}

	static class Range {
		int from;
		int to;

		@Override
		public String toString() {
			return String.format("from = %s\nto = %s", from, to);
		}
	}

	public String getArguments() {
		String result = "";
		if (java15)
			result += " -1.5";
		if (notPipeline)
			result += " -Xset:pipelineCompilation=false";
		return result.trim();
	}
}
