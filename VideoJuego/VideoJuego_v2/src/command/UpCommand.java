package command;

import state.Estado;

public class UpCommand implements Command {

	@Override
	public void execute(Estado estado) {
		estado.upPressed();
	}

}
