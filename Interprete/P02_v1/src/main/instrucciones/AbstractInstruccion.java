package main.instrucciones;

import main.Instruccion;
import main.State;

public abstract class AbstractInstruccion implements Instruccion {

	@Override
	public void execute(State state) {
		doExecute(state);
		state.setIP(+1);;
	}

	protected abstract void doExecute(State state);
}
