package ligafutbol;

import java.util.Arrays;
import java.util.List;

public class ValidadorAll implements Validador {

	private List<Validador> lista;

	public ValidadorAll(Validador... validadors) {
		this.lista = Arrays.asList(validadors);
	}

	@Override
	public boolean validar(Equipo equipo, Equipo candidato) {
		for (Validador v : lista) 
			if (!v.validar(equipo, candidato))
				return false;
		return true;
	}

}
