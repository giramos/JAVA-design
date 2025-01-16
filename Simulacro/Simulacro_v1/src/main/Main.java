package main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
	static Editor editor = new Editor();
	static ActionManager am = new ActionManager(editor);

	public static void main(String[] args) {

		

		drawLogo();
		showHelp();

		do {
			System.out.print("> ");

			String userInput = askUser();

			if (userInput.equals("salir")) {
				System.out.println("¡Adiós!");
				return;
			}

			if (userInput.isBlank()) {
				continue;
			}

			String[] parts = userInput.split(" ");
			String option = parts[0];
			String[] params = Arrays.copyOfRange(parts, 1, parts.length);

			// No se comprueba que el número de parámetros sea correcto

			if (option.equals("abrir")) {
				editor.setTexto(editor.abrir(editor.getTexto(), params));
//				am.execute(new CommandAbrir(text, params));
			} else if (option.equals("insertar")) {
				editor.insertar(editor.getTexto(), params);
			} else if (option.equals("borrar")) {
				editor.borra(editor.getTexto());
			} else if (option.equals("reemplazar")) {
				editor.reemplazar(editor.getTexto(), params);
			} else if (option.equals("grabar")) {
				// To be done
			} else if (option.equals("parar")) {
				// To be done
			} else if (option.equals("ejecutar")) {
				// To be done
			} else if (option.equals("ayuda")) {
				showHelp();
			} else {
				System.out.println("Opción incorrecta");
			}

			System.out.println(editor.getTexto());

		} while (true);
	}

	private static String askUser() {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String line = "";
		try {
			line = in.readLine();
		} catch (IOException e) {
			System.out.println("Error al leer la entrada del usuario");
			System.exit(1);
		}
		return line.trim();
	}

	private static void drawLogo() {
		System.out.println(LOGO);
	}

	private static void showHelp() {
		System.out.println(HELP);
	}

	private static final String LOGO = """
			███╗   ███╗ █████╗  ██████╗████████╗███████╗██╗  ██╗
			████╗ ████║██╔══██╗██╔════╝╚══██╔══╝██╔════╝╚██╗██╔╝
			██╔████╔██║███████║██║        ██║   █████╗   ╚███╔╝
			██║╚██╔╝██║██╔══██║██║        ██║   ██╔══╝   ██╔██╗
			██║ ╚═╝ ██║██║  ██║╚██████╗   ██║   ███████╗██╔╝ ██╗
			╚═╝     ╚═╝╚═╝  ╚═╝ ╚═════╝   ╚═╝   ╚══════╝╚═╝  ╚═╝
			""";

	private static final String HELP = """
			┌──────────────────────┬───────────────────────────────────────────┐
			│ abrir <fichero>      │                                           │
			│ insertar <texto>     │ añade el texto al final                   │
			│ borrar               │ borra la última palabra                   │
			│ reemplazar <a> <b>   │ cambia <a> por <b> en todo el texto       │
			├──────────────────────┼───────────────────────────────────────────┤
			│ grabar <macro>       │ comienza la grabación de una macro        │
			│ parar                │ finaliza la grabación                     │
			│ ejecutar <macro>     │ ejecuta la macro cuyo nombre se indique   │
			├──────────────────────┼───────────────────────────────────────────┤
			│ ayuda                │                                           │
			│ salir                │                                           │
			└──────────────────────┴───────────────────────────────────────────┘
			""";
}