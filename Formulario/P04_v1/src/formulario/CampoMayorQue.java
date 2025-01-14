package formulario;

public class CampoMayorQue implements Validador {
	
	int limit;

	public CampoMayorQue(int i) {
		this.limit = i;
	}

	@Override
	public boolean validar(String texto) {
		if(Integer.parseInt(texto) <= limit) {
			return false;
		}
		return true;
	}

}
