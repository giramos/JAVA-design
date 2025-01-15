package observer.decorador;

import encuesta.Pregunta;
import observer.Actualizacion;
import observer.GraficoCircular;

public class Activador implements Actualizacion {

	private Actualizacion actualizacion;
	private int contador;

	public Activador(int frecuencia, Actualizacion act) {
		this.actualizacion = act;
		this.contador = frecuencia;
	}

	@Override
	public void update(Pregunta pregunta) {
		if(contador == 1) {
			actualizacion.update(pregunta);
		}
		else {
			contador --;
		}

	}

}
