package validator;

import ligafutbol.Equipo;

public class MismoEquipo implements Validador {

	@Override
	public boolean validar(Equipo equipo, Equipo candidato) {
		return equipo != candidato;
	}

}
