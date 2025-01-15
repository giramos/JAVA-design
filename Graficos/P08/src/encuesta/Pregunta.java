package encuesta;

import java.util.ArrayList;
import java.util.List;

import observer.Actualizacion;
import observer.GraficoCircular;

public class Pregunta {

	private int si, no;
	private String pregunta;
	private List<Actualizacion> lista = new ArrayList<>();

	public Pregunta(String pregunta) {
		this.pregunta = pregunta;
	}

	public String getPregunta() {
		return pregunta;
	}

	public int getVotosSi() {
		return si;
	}

	public int getVotosNo() {
		return no;
	}

	public void incrementaSi() {
		si++;
		notificar();
	}

	public void incrementaNo() {
		no++;
		notificar();
	}


	private void notificar() {
		for(Actualizacion a: lista ) {
			a.update(this);
		}
		
	}

	public void añade(Actualizacion actualizacion) {
		lista.add(actualizacion);
	}


}
