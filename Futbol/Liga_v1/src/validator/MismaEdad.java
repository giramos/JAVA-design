package validator;

import ligafutbol.Equipo;

public class MismaEdad implements Validador {

	@Override
	public boolean validar(Equipo equipo, Equipo candidato) {
		return equipo.getEdad() == candidato.getEdad();
	}

}
