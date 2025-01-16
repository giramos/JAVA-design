package command;

import state.Estado;

public class RightCommand implements Command {

	@Override
	public void execute(Estado estado) {
		estado.rightPressed();

	}

}
