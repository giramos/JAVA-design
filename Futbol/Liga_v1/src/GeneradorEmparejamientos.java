
import java.util.*;

import validator.*;

//Devuelve una tabla hash en la que cada equipo (clave) tiene asociada
//una lista de equipos (valor) con los que tiene que jugar
public class GeneradorEmparejamientos {
	Validador valid;

	public Map<Equipo, List<Equipo>> empareja(List<Equipo> equipos) {
		Map<Equipo, List<Equipo>> emparejamientos = new HashMap<Equipo, List<Equipo>>();

		// inicializa la estructura de datos (inicialmente cada equipo tiene una
		// lista vacía de contrincantes)
		for (Equipo equipo : equipos) {
			emparejamientos.put(equipo, new ArrayList<Equipo>());
		}

		// emparejamientos.get(equipo_N) --> devuelve la lista de equipos contra
		// los que tiene que jugar 'equipo_N'
		for (Equipo equipo : equipos) {
			for (Equipo candidato : equipos) {
				if (añadeValidadores(emparejamientos).validar(equipo, candidato)) {
					emparejamientos.get(equipo).add(candidato);
					emparejamientos.get(candidato).add(equipo);
				}
			}
		}

		return emparejamientos;
	}

	private Validador añadeValidadores(Map<Equipo, List<Equipo>> emparejamientos) {
		ValidadorAll all = new ValidadorAll();
		all.añadir(new ContieneEquipo(emparejamientos));
		all.añadir(new MismoEquipo());
		all.añadir(new MismaEdad());
		all.añadir(new EsMasculino());
		return all;
	}

	

}