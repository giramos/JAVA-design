package formulario;

public class CampoNumero implements Validador {



	@Override
	public boolean validar(String texto) {
		for (char ch : texto.toCharArray()) {
			if (!Character.isDigit(ch)) {
				return false;
			}
		}
		return true;
	}

}
