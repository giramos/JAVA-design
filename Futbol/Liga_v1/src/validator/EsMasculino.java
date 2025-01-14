package validator;

import ligafutbol.Equipo;

public class EsMasculino implements Validador {

	@Override
	public boolean validar(Equipo equipo, Equipo candidato) {
		return equipo.isMasculino() == candidato.isMasculino();
	}

}
