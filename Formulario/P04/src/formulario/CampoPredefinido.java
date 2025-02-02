package formulario;

import java.io.*;

public class CampoPredefinido implements Campo {

	private String etiqueta;
	private String[] valores;

	public CampoPredefinido(String etiqueta, String... valores) {
		this.etiqueta = etiqueta;
		this.valores = valores;
	}

	@Override
	public void pideDato() {
		BufferedReader consola = new BufferedReader(new InputStreamReader(System.in));

		boolean valido;
		do {
			valido = false;
			try {
				System.out.print(etiqueta + ": ");
				texto = consola.readLine();

				for (String valor : valores) {
					if (texto.toLowerCase().equals(valor.toLowerCase())) {
						valido = true;
						break;
					}
				}
			} catch (IOException ex) {
				System.out.println(ex);
			}
		} while (!valido);
	}

	@Override
	public String getDato() {
		return texto;
	}

	@Override
	public String getEtiqueta() {
		return etiqueta;
	}
	
	private String texto;
}
