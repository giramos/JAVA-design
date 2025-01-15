package observer;

import encuesta.Pregunta;

public class Backup implements Actualizacion {

	@Override
	public void update(Pregunta pregunta) {
		System.out.println("Aquí se guardarían los datos en disco/BD.");


	}

}
