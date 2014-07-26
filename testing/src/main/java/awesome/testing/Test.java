package awesome.testing;

import java.io.File;
import java.util.ArrayList;
import java.util.List;


public class Test {

	private int num;
	private String dir = "";
	private String title;
	private Compile compile = new Compile();
	private Run run = new Run();

	public Run getRun() {
		return run;
	}

	public void setRun(Run run) {
		this.run = run;
	}

	public Compile getCompile() {
		return compile;
	}

	public void setCompile(Compile compile) {
		this.compile = compile;
	}

	public int getNum() {
		return num;
	}

	public Test setNum(int num) {
		this.num = num;
		return this;
	}

	public String getDir() {
		return dir;
	}

	public Test setDir(String dir) {
		this.dir = dir;
		return this;
	}

	public String getTitle() {
		return title;
	}

	public Test setTitle(String title) {
		this.title = title;
		return this;
	}

	class Compile {
		String files;
		List<Message> messages = new ArrayList<Message>();

		public Compile setFiles(String files) {
			this.files = files;
			return this;
		}

		public String getFiles() {
			String result = "";
			for (String file : files.split(","))
				result += String.format("%s%s%s ", Test.this.getDir(), File.separator, file);
			return result.trim();
		}

		public Compile addMessage(Message message) {
			messages.add(message);
			return this;
		}

		public List<Message> getMessages() {
			return messages;
		}

		@Override
		public String toString() {
			return String.format("%s = %s\n", "files", files);
		}

		public int getNumOfErrorMessages() {
			int result = 0;
			for (Message message : messages)
				result += "error".equals(message.getKind()) ? 1 : 0;
			return result;
		}

		class Message {
			private String line;
			private String kind;

			public String getLine() {
				return line;
			}

			public Message setLine(String line) {
				this.line = line;
				return this;
			}

			public String getKind() {
				return kind;
			}

			public Message setKind(String kind) {
				this.kind = kind;
				return this;
			}
		}
	}

	static class Run {
		String clazz;

		public String getClazz() {
			return clazz;
		}

		public Run setClazz(String clazz) {
			this.clazz = clazz;
			return this;
		}

		@Override
		public String toString() {
			return String.format("%s = %s\n", "class", clazz);
		}
	}

	public Run initRun() {
		return run = new Run();
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder()
		.append(String.format("%s = %s\n", "num", num, "\n"))
		.append(String.format("%s = %s\n", "dir", dir, "\n"))
		.append(String.format("%s = %s\n", "title", title, "\n"))
		.append(compile.toString());

		if (run != null) {
			builder.append(run.toString());
		}
		
		return builder.toString();
	}
}
