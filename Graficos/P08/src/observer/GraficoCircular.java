package observer;

import encuesta.Pregunta;

public class GraficoCircular implements Actualizacion {

	@Override
	public void update(Pregunta pregunta) {
		System.out.println("Aquí se dibujaría el gráfico circular.");

	}

}
