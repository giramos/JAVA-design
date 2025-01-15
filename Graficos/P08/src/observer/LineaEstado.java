package observer;

import encuesta.Pregunta;

public class LineaEstado implements Actualizacion {

	@Override
	public void update(Pregunta pregunta) {
		System.out.println("Nº votos SI = " + pregunta.getVotosSi() + ". Nº votos NO = " + pregunta.getVotosNo());

	}

}
