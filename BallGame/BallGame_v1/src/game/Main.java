package game;

public class Main {
	public static void main(String[] args) {
		BallGame game = new AndroidBallGame();
		game.play();
		game = new WindowsBallGame();
		game.play();
		game = new PlayStationBallGame();
		game.play();
	}
}
