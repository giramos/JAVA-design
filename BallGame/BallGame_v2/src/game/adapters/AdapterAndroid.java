package game.adapters;

import java.awt.Point;

import platform.Image2D;
import platform.android.*;

public class AdapterAndroid implements Adapter {
	
	AndroidAPI android = new AndroidAPI();

	@Override
	public Image2D loadImage(String file) {
		return android.loadResource(file);
	}

	@Override
	public void drawBall(Image2D image, Point point) {
		android.draw(point.x, point.y, image);

	}

	@Override
	public Point getPosition() {
		return android.getTouch();
	}

}
