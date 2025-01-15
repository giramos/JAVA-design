package main;

import java.io.IOException;

import encuesta.Pregunta;
import encuesta.TextUserInterface;
import observer.Backup;
import observer.GraficoBarras;
import observer.GraficoCircular;
import observer.LineaEstado;
import observer.decorador.Activador;
import observer.decorador.Repetidor;

public class Main {

	public static void main(String[] args) throws IOException {
		Pregunta encuesta = new Pregunta("¿Está a favor de la energia nuclear?");

		encuesta.añade(new Activador(3, new GraficoCircular()));
		encuesta.añade(new Repetidor(3, new GraficoBarras()));
		encuesta.añade(new Activador(4, new Repetidor(2, new LineaEstado())));
		encuesta.añade(new Backup());

		TextUserInterface userInterface = new TextUserInterface();
		userInterface.rellena(encuesta);
	}

}
