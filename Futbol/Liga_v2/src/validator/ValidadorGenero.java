package validator;

import ligafutbol.Equipo;

public class ValidadorGenero implements Validador {

	@Override
	public boolean validar(Equipo equipo, Equipo candidato) {
		// TODO Auto-generated method stub
		return equipo.isMasculino() == candidato.isMasculino();
	}

}
