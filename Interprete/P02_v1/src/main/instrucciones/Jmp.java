package main.instrucciones;

import main.Instruccion;
import main.State;

public class Jmp implements Instruccion {

	private String[] ins;

	public Jmp(String[] instruccion) {
		this.ins = instruccion;
	}

	@Override
	public void execute(State state) {
		state.ip = Integer.parseInt(ins[1]);

	}

}
