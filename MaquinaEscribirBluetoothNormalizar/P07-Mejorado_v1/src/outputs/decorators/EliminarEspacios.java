package outputs.decorators;

import java.io.IOException;

import outputs.Output;

public class EliminarEspacios implements Output {
	
	private Output output;
	private char lastChar = 0;

	public EliminarEspacios(Output out) {
		this.output = out;
	}

	@Override
	public void send(char caracter) throws IOException {
		if(caracter == ' ' && lastChar == ' ') {
			return;
		}
		output.send(caracter);
		lastChar = caracter;
	}

	@Override
	public void close() throws IOException {
		output.close();

	}

}
