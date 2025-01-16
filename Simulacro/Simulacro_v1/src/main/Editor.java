package main;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Editor {
	StringBuilder texto = new StringBuilder("");
	
	ActionManager am = new ActionManager(this );

	public StringBuilder getTexto() {
		return texto;
	}

	public void setTexto(StringBuilder texto) {
		this.texto = texto;
	}

	public StringBuilder reemplazar(StringBuilder text, String[] params) {
		am.execute(new CommandReemplazar(text,params));
		return text;
	}

	public StringBuilder borra(StringBuilder text) {
		int indexOfLastWord = text.toString().trim().lastIndexOf(" ");
		if (indexOfLastWord == -1)
			text = new StringBuilder("");
		else
			text.setLength(indexOfLastWord + 1);
		return text;
	}

	public void insertar(StringBuilder text, String[] params) {
		for (String word : params) {
			text.append(word + " ");
		}
	}

	public StringBuilder abrir(StringBuilder text, String[] params) {
		try {
			String filename = params[0];
			text = new StringBuilder(readFile(filename));
		} catch (IOException e) {
			System.out.println("No se pudo leer el fichero");
		}
		return text;
	}

	public String readFile(String filename) throws IOException {
		BufferedReader input = new BufferedReader(new FileReader(filename));
		String line;
		StringBuilder result = new StringBuilder();
		while ((line = input.readLine()) != null) {
			result.append(line);
		}
		input.close();
		return result.toString();
	}

}
