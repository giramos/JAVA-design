package formulario;

import java.util.*;

public class CampoAny implements Validador {

	private List<Validador> lista;

	public CampoAny(Validador... validadors) {
		this.lista = Arrays.asList(validadors);
	}

	@Override
	public boolean validar(String texto) {
		for (Validador v : lista)
			if (v.validar(texto))
				return true;
		return false;
	}

}
