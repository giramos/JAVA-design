package main;

import dash.*;
import simulator.*;

import java.io.*;

import config.*;

public class Main {

	public static void main(String[] args) throws IOException {
		
		
		OrderCoffe cafe = new OrderCoffe();
		OrderGillette gillette = new OrderGillette();
		DoNothing nada = new DoNothing();
		TellTheTime time = new TellTheTime();
		
		Dash dash = new Dash();
		
		dash.addAction(cafe);
		dash.addAction(nada);
		dash.addAction(time);
		
		Configurator configurator = new Configurator();

		configurator.addAction(nada);
		configurator.addAction(cafe);
		configurator.addAction(gillette);
		configurator.addAction(time);
		
		menu(dash, configurator);
	}

	public static void menu(Dash dash, Configurator configurator) throws IOException {
		Simulator simulator = new Simulator();

		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

		do {
			System.out.println("\n===========================");
			System.out.println("MENU PRINCIPAL. Elija opción:");
			System.out.println("    1. Simular Dash");
			System.out.println("    2. Reprogramar botón del Dash");
			System.out.println("    S. Salir");
			System.out.print("> ");

			String line = in.readLine();
			if (line.equals("1"))
				simulator.simulate(dash);
			else if (line.equals("2"))
				configurator.configure(dash);
			else if (line.toUpperCase().equals("S"))
				return;
			else
				System.out.println("Opción desconocida");

		} while (true);
	}

}
