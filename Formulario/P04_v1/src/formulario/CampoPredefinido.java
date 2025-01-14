package formulario;

public class CampoPredefinido implements Validador {

	private String[] valores;

	public CampoPredefinido(String... valores) {
		this.valores = valores;
	}

	@Override
	public boolean validar(String texto) {
		for (String valor : valores)
			if (texto.toLowerCase().equals(valor.toLowerCase()))
				return true;
		return false;
	}
}
