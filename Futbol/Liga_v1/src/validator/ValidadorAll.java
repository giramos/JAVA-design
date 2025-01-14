package validator;

import java.util.Arrays;
import java.util.List;

import ligafutbol.Equipo;

public class ValidadorAll implements Validador {
	
	private List<Validador> lista;

	public ValidadorAll(Validador ...validadors) {
		this.lista = Arrays.asList(validadors);
	}

	@Override
	public boolean validar(Equipo equipo, Equipo candidato) {
		for(var l : lista) {
			if(l.validar(equipo, candidato))
				return true;
		}
		return false;
	}
	
	public void añadir(Validador valid) {
		lista.add(valid);
	}

}
