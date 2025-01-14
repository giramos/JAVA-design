package outputs.decorators;

import java.io.IOException;

import outputs.Output;

public class Normalizar implements Output {
	
	private Output output;

	public Normalizar(Output out) {
		this.output = out;
	}

	@Override
	public void send(char caracter) throws IOException {
		if(caracter != '\r')
			output.send(caracter);
	}

	@Override
	public void close() throws IOException {
		output.close();
	}

}
