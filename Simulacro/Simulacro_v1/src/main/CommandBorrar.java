package main;

public class CommandBorrar implements Command {

	private StringBuilder text;

	public CommandBorrar(StringBuilder text) {
		this.text = text;
	}

	@Override
	public void execute(Editor editor) {
		editor.borra(text);

	}

}
