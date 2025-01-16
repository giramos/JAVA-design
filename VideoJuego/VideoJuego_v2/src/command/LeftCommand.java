package command;

import state.Estado;

public class LeftCommand implements Command {

	@Override
	public void execute(Estado estado) {
		estado.leftPressed();

	}

}
