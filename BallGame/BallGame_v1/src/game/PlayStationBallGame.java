package game;

import java.awt.Point;

import platform.Image2D;
import platform.playstation.*;

public class PlayStationBallGame extends BallGame {

	Playstation5API play = new Playstation5API();
	
	@Override
	protected Image2D loadImage(String file) {
		return play.loadGraphics(file);
	}

	@Override
	protected void drawBall(Image2D image, Point point) {
		play.render(point.x, point.y, image);
	}

	@Override
	protected Point getPosition() {
		return play.getJoystick();
	}

}
