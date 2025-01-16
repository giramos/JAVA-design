
package main;

import java.io.IOException;

import command.BackCommand;
import command.DownCommand;
import command.LeftCommand;
import command.RightCommand;
import command.UpCommand;
import console.GameAndWatch;

public class Main {

	public static void main(String[] args) throws IOException {
		test(new GameAndWatch());
	}

	public static void test(GameAndWatch console) throws IOException {

		do {
			console.draw();

			char key = getKey();

			if (key == 'W')
//                console.upPressed();
//            	console.cambiarCommand(key, new UpCommand());
				console.execute(new UpCommand());
			else if (key == 'S')
//                console.downPressed();
//            	console.cambiarCommand(key, new DownCommand());	
				console.execute(new DownCommand());
			else if (key == 'A')
//                console.leftPressed();
//            	console.cambiarCommand(key, new LeftCommand());
				console.execute(new LeftCommand());
			else if (key == 'D')
//                console.rightPressed();
//            	console.cambiarCommand(key, new RightCommand());
				console.execute(new RightCommand());

			else if (key == 'C')
//                console.backPressed();
//            	console.cambiarCommand(key, new BackCommand());
				console.execute(new BackCommand());

		} while (!console.exit());

	}

	private static char getKey() throws IOException {
		var validKeys = "WASDC";
		char nextChar;
		do {
			nextChar = Character.toUpperCase((char) System.in.read());
		} while (validKeys.indexOf(nextChar) == -1);

		return nextChar;
	}
}