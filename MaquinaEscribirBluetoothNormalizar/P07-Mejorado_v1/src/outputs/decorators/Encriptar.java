package outputs.decorators;

import java.io.IOException;

import outputs.Output;

public class Encriptar implements Output {

	private Output output;

	public Encriptar(Output out) {
		this.output = out;
	}

	@Override
	public void send(char caracter) throws IOException {
		if (Character.isDigit(caracter) || Character.isLetter(caracter))
			output.send((char) (caracter+1));
	}

	@Override
	public void close() throws IOException {
		output.close();
	}

}
