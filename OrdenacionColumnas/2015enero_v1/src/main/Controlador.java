package main;

import java.util.*;

public class Controlador {

	public Controlador(List<Juego> juegos, Pantalla pantalla) {
		this.juegos = new ArrayList<Juego>(juegos);
		this.pantalla = pantalla;
		this.ascendente = true;
		this.ordenUltima = null;
		pantalla.imprimeJuegos(juegos);
	}

	public void pulsadaColumnaRanking() {
		aplicarEstrategia(new OrdenacionRanking());
	}

	public void pulsadaColumnaNombre() {
		aplicarEstrategia(new OrdenacionNombre());
	}

	public void pulsadaColumnaMedia() {
		aplicarEstrategia(new OrdenacionMedia());
	}

	public void pulsadaColumnaVotos() {
		aplicarEstrategia(new OrdenacionVotos());
	}

	private void aplicarEstrategia(Ordenacion orden) {
		criterioAscendencia(orden);
		orden.ordena(juegos, ascendente);
		pantalla.imprimeJuegos(juegos);
	}

	private void criterioAscendencia(Ordenacion orden) {
		if (ordenUltima != null && orden.getClass() == ordenUltima.getClass()) {
			ascendente = !ascendente;
		} else {
			ascendente = true;
		}
		ordenUltima = orden;
	}

	private List<Juego> juegos;
	private Pantalla pantalla;
	private boolean ascendente;
	private Ordenacion ordenUltima;

}
