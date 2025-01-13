package ligafutbol;

public class ValidadorGenero implements Validator {

	@Override
	public boolean algoritmo(Equipo equipo, Equipo candidato) {
		 return equipo.isMasculino() == candidato.isMasculino();
	}


}
