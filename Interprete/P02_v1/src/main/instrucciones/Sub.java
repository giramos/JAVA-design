package main.instrucciones;

import main.State;

public class Sub extends AbstractInstruccion {

	@Override
	protected void doExecute(State state) {
		int b = state.pop();
		int a = state.pop();
		state.push(a - b);
	}

}
