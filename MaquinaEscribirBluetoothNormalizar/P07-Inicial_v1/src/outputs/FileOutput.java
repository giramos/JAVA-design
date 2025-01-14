package outputs;

import java.io.FileWriter;
import java.io.IOException;

public class FileOutput implements Output {

	FileWriter writer;

	public FileOutput(String newName) throws IOException {
		this.writer = new FileWriter(newName);
	}

	@Override
	public void send(char caracter) throws IOException {
		writer.append((char) caracter);

	}

	@Override
	public void close() throws IOException {
		writer.close();

	}

}
