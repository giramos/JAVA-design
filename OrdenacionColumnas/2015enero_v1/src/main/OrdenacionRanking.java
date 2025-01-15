package main;

import java.util.List;

public class OrdenacionRanking implements Ordenacion {

	@Override
	public void ordena(List<Juego> juegos, boolean ascendente) {
		for (int i = 0; i < (juegos.size() - 1); i++) {
			for (int j = 0; j < juegos.size() - i - 1; j++) {

				Juego juegoA = juegos.get(j);
				Juego juegoB = juegos.get(j + 1);

				boolean intercambiar = false;

				if (ascendente) {
					intercambiar = juegoA.getRanking() > juegoB.getRanking();
				} else {
					intercambiar = juegoA.getRanking() < juegoB.getRanking();

				}
				if (intercambiar) {
					Juego temp = juegoA;
					juegos.set(j, juegoB);
					juegos.set(j + 1, temp);
				}

			}

		}
	}
}
