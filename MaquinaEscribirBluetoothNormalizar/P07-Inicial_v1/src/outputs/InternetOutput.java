package outputs;

import java.io.StringWriter;

public class InternetOutput implements Output {
	StringWriter stringWriter;

	public InternetOutput(String url) {
		this.stringWriter = new StringWriter();
		stringWriter.append("\n--- START Internet[" + url + "]\n");
	}

	@Override
	public void send(char caracter) {
		stringWriter.append((char) caracter);
	}

	@Override
	public void close() {
		System.out.println(stringWriter.toString());
		System.out.println("--- END   Internet");

	}

}
