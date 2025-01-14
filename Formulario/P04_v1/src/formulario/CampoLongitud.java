package formulario;

public class CampoLongitud implements Validador {

	int longitud;

	public CampoLongitud(int i) {
		this.longitud = i;
	}

	@Override
	public boolean validar(String texto) {
		if(texto.length()>= longitud) {
			return true;
		}
		return false;
	}

}
