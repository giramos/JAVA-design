package ligafutbol;

public class ValidadorEdad implements Validator {



	@Override
	public boolean algoritmo(Equipo equipo, Equipo candidato) {
		return equipo.getEdad() == candidato.getEdad();
	}

}
