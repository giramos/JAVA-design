package validator;

import java.util.Arrays;

import ligafutbol.Equipo;

public class ValidadorAll implements Validador {

	private Validador[] validadores;

	public ValidadorAll(Validador... validadors) {
		this.validadores = validadors;
	}

	@Override
	public boolean validar(Equipo equipo, Equipo candidato) {
		for(Validador v: validadores) {
			if(v.validar(equipo, candidato)) {
				return true;
			}
		}
		return false;
	}

	public void añadir(Validador v) {
		Arrays.asList(validadores).add(v);
	}
}
