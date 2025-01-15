package main.instrucciones;

import main.State;

public class Load extends AbstractInstruccion {

	@Override
	protected void doExecute(State statestate) {
		int direccion = statestate.pop();
		statestate.push(statestate.read(direccion));
	}

}
