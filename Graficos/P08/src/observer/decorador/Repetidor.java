package observer.decorador;

import encuesta.Pregunta;
import observer.Actualizacion;
import observer.GraficoCircular;

public class Repetidor implements Actualizacion {

	private Actualizacion actualizacion;
	private int contador, frecuencia;

	public Repetidor(int frecuencia, Actualizacion act) {
		this.actualizacion = act;
		this.contador = this.frecuencia = frecuencia;
	}

	@Override
	public void update(Pregunta pregunta) {
		if (contador == frecuencia) {
			actualizacion.update(pregunta);
			contador = 1;
		} else {
			contador++;
		}

	}

}
