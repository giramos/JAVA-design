package ligafutbol;

import java.util.Arrays;
import java.util.List;

public class ValidadorAny implements Validator {

	
	private List<Validator> validadores;

	public ValidadorAny(Validator ...validadores) {
		this.validadores = Arrays.asList(validadores);
	}

	@Override
	public boolean algoritmo(Equipo equipo, Equipo candidato) {
		for(Validator v: validadores) {
			if(!v.algoritmo(equipo, candidato)) {
				return false;
			}
		}
		return true;
	}

}
