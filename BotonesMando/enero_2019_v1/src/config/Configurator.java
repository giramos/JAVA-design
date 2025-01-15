package config;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

import dash.Action;
import dash.Dash;

public class Configurator {

	public Configurator() {
		this.acciones = new ArrayList<Action>();
	}

	public void configure(Dash dash) throws IOException {
		System.out.println("\n----------------------------------------------------------");
		System.out.println("CONFIGURADOR");
		System.out.println(dash);

		try {
			System.out.println("Escriba el número de botón a cambiar:");
			int button = Integer.parseInt(in.readLine());
			if (button < 0 || button >= acciones.size()) {
				System.out.println("No es un número de botón válido: operación cancelada");
				return;
			}

			System.out.println(
					"Escriba el número de acción a asignar al botón de entre las siguientes (o 'N' para ninguna):");
			printActions();
			System.out.print("> ");
			String line = in.readLine();

			// Comprueba primero si la opción escogida para ese botón es no hacer nada
			if (line.toUpperCase().equals("N")) {
				dash.changeButton(button, null);
				System.out.println("Botón asignado");
				return;
			}

			// Si no, es que tiene que tratarse de una acción existente
			int actionNumber = Integer.parseInt(line);
			if (actionNumber < 0 || actionNumber >= acciones.size()) {
				System.out.println("No es una acción válida: operación cancelada");
				return;
			}

			dash.changeButton(button, acciones.get(actionNumber));

			System.out.println("Botón asignado");

		} catch (NumberFormatException e) {
			System.out.println("Se esperaba un número");
		}
	}

	private void printActions() {
		System.out.println(" N. No hacer nada.");
		for (int i = 0; i < acciones.size(); i++) {

			System.out.println("  " + i + ". " + acciones.get(i).descripcion());
		}

	}

	BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	List<Action> acciones;

	public void addAction(Action nada) {
		acciones.add(nada);
	}
}
