package formulario;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Campo {

	Validador validador;
	String etiqueta;
	String texto;

	public Campo(String etiqueta, Validador validadorParam) {
		this.validador = validadorParam;
		this.etiqueta = etiqueta;
	}

	public void pideDato() {
		BufferedReader consola = new BufferedReader(new InputStreamReader(System.in));

		do {
			try {
				System.out.print(etiqueta + ": ");
				texto = consola.readLine();

			} catch (IOException ex) {
				System.out.println(ex);
			}
		} while (!validador.validar(texto));
	}

	public String getEtiqueta() {
		return etiqueta;
	}

	public String getTexto() {
		return texto;
	}

}
