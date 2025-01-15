package game;

import java.awt.Point;

import game.adapters.Adapter;
import platform.*;
import platform.android.*;
import platform.playstation.*;
import platform.windows.*;

/* Esta clase/paquete sería el código del videojuego, el cual se quiere reutilizar
 * en las distintas plataformas 
 */

enum Platform {
	ANDROID, WINDOWS, PLAYSTATION
};

public class BallGame {

	Adapter adapter;
	
	public BallGame(Adapter adapt) {
		this.adapter = adapt;
	}

	public void play() {

		Image2D image = adapter.loadImage("Bola.jpg");

		// Lógica principal del juego
		for (int i = 0; i < 10; i++) {
			Point point = adapter.getPosition();
			// Comprobar colisiones...
			// Imprimir marcador...
			// Otra lógica del juego...
			adapter.drawBall(image, point);
		}
	}

}
