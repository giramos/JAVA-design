package main;

import java.io.*;

import fileSystem.FileSystem;
import outputs.BluetoothOutput;
import outputs.FileOutput;
import outputs.InternetOutput;
import outputs.decorators.EliminarEspacios;
import outputs.decorators.Encriptar;
import outputs.decorators.Normalizar;

public class Main {

	public static void main(String[] args) throws IOException {

		FileSystem fs = new FileSystem();

//		fs.copyFile("privado.txt", new FileOutput("copia.txt"));
//		fs.copyFile("privado.txt", new InternetOutput("156.17.11.196"));
//		fs.copyFile("privado.txt", new BluetoothOutput("Galaxy de Ra�l"));
		
		fs.copyFile("privado.txt", new Normalizar(new InternetOutput("156.17.11.196")));
		fs.copyFile("privado.txt", new EliminarEspacios(new InternetOutput("156.17.11.196")));
		fs.copyFile("privado.txt", new Encriptar(new EliminarEspacios(new InternetOutput("156.17.11.196"))));
	}

}
