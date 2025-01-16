package console;

public class GameAndWatch {

	boolean exit;
	Estado estado;

	public GameAndWatch() {

		// $ Inicialización del menu -----------------------------

		this.estado = new EstadoMenu(this);
	}

	// # ------------------------------------------------------------------
	// # Botones de la consola

	public void upPressed() {
		estado.upPressed();
	}

	public void downPressed() {
		estado.downPressed();
	}

	public void leftPressed() {
		estado.leftPressed();
	}

	public void rightPressed() {
		estado.rightPressed();
	}

	public void backPressed() {
		estado.backPressed();
	}

	// # ------------------------------------------------------------------
	// # Otros métodos de la consola

	public boolean exit() {
		return exit;
	}

	public void draw() {
		estado.draw();
	}

	public void gameFinished() {
		draw(); // Necesario para dibujar el último frame
		setEstado(new EstadoMenu(this));
	}

	void setEstado(Estado estado) {
		this.estado = estado;
		restart();
	}

	void restart() {
		estado.restart();
	}

}