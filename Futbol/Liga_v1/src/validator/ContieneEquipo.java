package validator;

import java.util.List;
import java.util.Map;

import ligafutbol.Equipo;

public class ContieneEquipo implements Validador {

	private Map<Equipo, List<Equipo>> empareja;



	public ContieneEquipo(Map<Equipo, List<Equipo>> emparejamientos) {
		this.empareja = emparejamientos;
	}

	@Override
	public boolean validar(Equipo equipo, Equipo candidato) {
		return !empareja.get(equipo).contains(candidato);
	}

}
