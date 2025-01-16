package state;

public interface Estado {

	public void upPressed();
	public void downPressed();
	public void leftPressed();
	public void rightPressed();
	public void backPressed();
	public void draw();
	public void restart();
}
