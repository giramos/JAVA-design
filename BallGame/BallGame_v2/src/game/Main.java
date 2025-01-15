package game;

import game.adapters.AdapterAndroid;

public class Main {
	public static void main(String[] args) {
		BallGame game = new BallGame(new AdapterAndroid());
		game.play();
	}
}
