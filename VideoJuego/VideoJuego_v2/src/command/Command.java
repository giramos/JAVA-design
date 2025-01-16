package command;

import state.Estado;

public interface Command {
	
	void execute(Estado estado);

}
