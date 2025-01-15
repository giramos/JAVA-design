package main.instrucciones;

import main.Instruccion;
import main.State;

public abstract class AbstractInstruccion implements Instruccion {

	@Override
	public void execute(State state) {
		doExecute(state);
		state.ip ++;
	}

	protected abstract void doExecute(State state);
}
