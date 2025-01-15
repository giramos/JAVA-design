package main.instrucciones;

import main.State;

public class Push extends AbstractInstruccion {

	private String[] ins;

	public Push(String[] instruccion) {
		this.ins = instruccion;
	}

	@Override
	protected void doExecute(State state) {
		state.push(Integer.parseInt(ins[1]));

	}

}
