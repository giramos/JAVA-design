package validator;

import ligafutbol.Equipo;

public class ValidadorEdad implements Validador {

	@Override
	public boolean validar(Equipo equipo, Equipo candidato) {
		// TODO Auto-generated method stub
		return equipo.getEdad() == candidato.getEdad();
	}

}
