package main.instrucciones;

import main.State;

public class Jmpg extends AbstractInstruccion {
	
	private String[] inst;

	public Jmpg(String[] instruccion) {
		this.inst = instruccion;
	}

	@Override
	protected void doExecute(State state) {
		int b = state.pop();
		int a = state.pop();
		if (a > b)
			new Jmp(inst);
		else
			state.ip++;

	}

}
