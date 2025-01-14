package formulario;

public class CampoMenorQue implements Validador {
	
	int limit;

	public CampoMenorQue(int i) {
		this.limit = i;
	}

	@Override
	public boolean validar(String texto) {
		if(Integer.parseInt(texto) >= limit) {
			return false;
		}
		return true;
	}

}
