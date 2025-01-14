package outputs;

import java.io.IOException;

public interface Output {

	public void send(char caracter) throws IOException;
	public void close() throws IOException;
}
