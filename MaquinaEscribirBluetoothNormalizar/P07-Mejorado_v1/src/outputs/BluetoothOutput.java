package outputs;

import java.io.StringWriter;

public class BluetoothOutput implements Output {
	StringWriter stringWriter;

	public BluetoothOutput(String device) {
		this.stringWriter = new StringWriter();
		stringWriter.append("\n--- START Bluetooth[" + device + "]\n");

	}

	@Override
	public void send(char caracter) {
		stringWriter.append((char) caracter);
	}

	@Override
	public void close() {
		System.out.println(stringWriter.toString());
		System.out.println("--- END   Bluetooth");

	}

}
