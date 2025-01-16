package main;

public class CommandAbrir implements Command {

	private StringBuilder text;
	private String[] params;

	public CommandAbrir(StringBuilder text, String[] params) {
		this.text = text;
		this.params = params;
	}

	@Override
	public void execute(Editor editor) {
		editor.abrir(text, params);

	}

}
