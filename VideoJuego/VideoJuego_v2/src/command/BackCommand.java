package command;

import state.Estado;

public class BackCommand implements Command {

	@Override
	public void execute(Estado estado) {
		estado.backPressed();

	}

}
