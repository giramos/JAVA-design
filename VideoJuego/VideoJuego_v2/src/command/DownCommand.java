package command;

import state.Estado;

public class DownCommand implements Command {

	@Override
	public void execute(Estado estado) {
		estado.downPressed();
	}

}
