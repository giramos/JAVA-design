package main;

public class CommandInsertar implements Command {

	private StringBuilder text;
	private String[] params;

	public CommandInsertar(StringBuilder text, String[] params) {
		this.text = text;
		this.params = params;
	}

	@Override
	public void execute(Editor editor) {
		editor.insertar(text, params);

	}

}
