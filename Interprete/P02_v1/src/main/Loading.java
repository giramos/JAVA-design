package main;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Loading {

	static void cargaInstruccion(String linea) {
		if (linea.trim().length() == 0)
			return;
	
		String[] palabras = linea.split(" ");
		Main.instrucciones.add(palabras);
	}

	static void cargar() throws FileNotFoundException, IOException {
		BufferedReader fichero = new BufferedReader(new FileReader("programa.txt"));
	
		String linea;
		while ((linea = fichero.readLine()) != null)
			cargaInstruccion(linea);
		fichero.close();
	}

}
