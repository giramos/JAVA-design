package main.instrucciones;

import main.State;

public class Output extends AbstractInstruccion {

	@Override
	protected void doExecute(State state) {
		System.out.println(state.pop());
	}

}
