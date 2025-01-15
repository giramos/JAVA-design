package observer;

import encuesta.Pregunta;

public class GraficoBarras implements Actualizacion {

	@Override
	public void update(Pregunta pregunta) {
		System.out.println("Aquí se dibujaría el gráfico de barras.");

	}

}
