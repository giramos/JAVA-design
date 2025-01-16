package main;

import java.util.regex.Pattern;

public class CommandReemplazar implements Command {

	private StringBuilder text;
	private String[] params;

	public CommandReemplazar(StringBuilder text, String[] params) {
		this.text = text;
		this.params = params;
	}

	@Override
	public void execute(Editor editor) {
		String find = params[0];
		String replace = params[1];
		editor.setTexto(new StringBuilder(text.toString().replaceAll(Pattern.quote(find), replace)));
	}

}
