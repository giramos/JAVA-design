package main;

public class ActionManager {

	Editor editor;
	
	public ActionManager(Editor editor) {
		this.editor = editor;
	}
	public void execute(Command command) {
		command.execute(editor);
	}
}
