package main;

import java.io.*;

import fileSystem.FileSystem;
import outputs.BluetoothOutput;
import outputs.FileOutput;
import outputs.InternetOutput;

public class Main {

	public static void main(String[] args) throws IOException {

		FileSystem fs = new FileSystem();

		fs.copyFile("privado.txt", new FileOutput("copia.txt"));
		fs.copyFile("privado.txt", new InternetOutput("156.17.11.196"));
		fs.copyFile("privado.txt", new BluetoothOutput("Galaxy de Ra�l"));
	}

}
