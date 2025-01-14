package formulario;

public class CampoTexto implements Validador {

	@Override
	public boolean validar(String texto) {
		for (char ch : texto.toCharArray()) {
			if (!Character.isLetter(ch)) {
				return false;
			}
		}
		return true;
	}
}
