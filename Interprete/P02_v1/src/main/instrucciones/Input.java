package main.instrucciones;

import main.State;

public class Input extends AbstractInstruccion {

	@Override
	protected void doExecute(State state) {
		System.out.println("Escriba un entero:");
		state.push(state.console.nextInt());
		
	}

	
	

}
