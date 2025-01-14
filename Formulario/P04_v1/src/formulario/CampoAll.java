package formulario;

import java.util.Arrays;
import java.util.List;

public class CampoAll implements Validador {

	private List<Validador> lista;

	public CampoAll(Validador... validadors) {
		this.lista = Arrays.asList(validadors);
	}

	@Override
	public boolean validar(String texto) {
		for (Validador v : lista)
			if (!v.validar(texto))
				return false;
		return true;
	}

}
