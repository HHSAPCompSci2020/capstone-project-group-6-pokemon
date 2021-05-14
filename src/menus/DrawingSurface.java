package menus;

import java.awt.Point;
import java.util.ArrayList;

import processing.core.PApplet;

/**
 * This represents a PApplet drawing surface.
 * 
 * @author Mr.Shelby and Kelsey Shan
 *
 */
public class DrawingSurface extends PApplet implements ScreenSwitcher {

	public float ratioX, ratioY;

	private Screen activeScreen;
	private ArrayList<Screen> screens;

	/**
	 * This constructs a PApplet surface
	 */
	public DrawingSurface() {

		screens = new ArrayList<Screen>();

		MenuScreen screen1 = new MenuScreen(this);
		screens.add(screen1);

		SelectScreen screen2 = new SelectScreen(this);
		screens.add(screen2);

		RuleScreen screen3 = new RuleScreen(this);
		screens.add(screen3);

		BattleScreen screen4 = new BattleScreen(this, screen2.getGame());
		screens.add(screen4);

		EndScreen screen5 = new EndScreen(this);
		screens.add(screen5);

		activeScreen = screens.get(0);

	}

	/**
	 * Sets the size of the current screen
	 */
	public void settings() {
		// size(DRAWING_WIDTH, DRAWING_HEIGHT, P2D);
		size(activeScreen.DRAWING_WIDTH, activeScreen.DRAWING_HEIGHT);
	}

	/**
	 * Sets up the screens
	 */
	public void setup() {
		surface.setResizable(true);
		for (Screen s : screens)
			s.setup();
	}

	/** 
	 * Draws the active screen
	 */
	public void draw() {
		ratioX = (float) width / activeScreen.DRAWING_WIDTH;
		ratioY = (float) height / activeScreen.DRAWING_HEIGHT;

		pushMatrix();

		scale(ratioX, ratioY);

		activeScreen.draw();

		popMatrix();
	}

	/**
	 * This performs the result of a mouse press interaction from the user.
	 */
	public void mousePressed() {
		activeScreen.mousePressed();
	}


	/**
	 * This converts the actually coordinates into an assumed point
	 * @param actual a point with (x,y)
	 * @return the assumed conversion in point form
	 */
	public Point actualCoordinatesToAssumed(Point actual) {
		return new Point((int) (actual.getX() / ratioX), (int) (actual.getY() / ratioY));
	}

	/**This switches the current screen.
	 * @param i the index of the screen that will be switched with
	 */
	@Override
	public void switchScreen(int i) {
		activeScreen = screens.get(i);
	}

}
