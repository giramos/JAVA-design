package state;

import java.util.List;

import console.GameAndWatch;

public class EstadoMenu implements Estado {

	private List<Estado> games;
	private int selectedGame;
	private GameAndWatch game;

	public EstadoMenu(GameAndWatch game) {
		this.game = game;
		this.games = List.of(new EstadoMortalMaze(game), new EstadoF1(game), new EstadoSpaceInvaders(game));
		selectedGame = 0;
	}

	@Override
	public void upPressed() {
		if (selectedGame > 0)
			selectedGame--;
	}

	@Override
	public void downPressed() {
		if (selectedGame < games.size() - 1)
			selectedGame++;
	}

	@Override
	public void leftPressed() {

	}

	@Override
	public void rightPressed() {
		game.setEstado(games.get(selectedGame));

	}

	@Override
	public void backPressed() {
		game.exit = true;

	}

	@Override
	public void draw() {
		System.out.println("\n--------------------");
		System.out.println("Select a game: (W/S -> up/down. D -> play game)");
		for (int i = 0; i < games.size(); i++) {
			System.out.print((i == selectedGame) ? " >> " : "    ");
			System.out.println(games.get(i));
		}
		System.out.println("(C -> turn off)");

	}

	@Override
	public void restart() {
	}

}
