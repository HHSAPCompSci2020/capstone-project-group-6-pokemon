package menus;

import java.awt.Point;
import java.awt.Rectangle;

/**
 * This represents a PApplet screen that is the menu starting screen for the
 * game.
 * 
 * @author Kelsey Shan
 *
 */
public class MenuScreen extends Screen {

	private DrawingSurface surface;

	private Rectangle button, button2;

	/**
	 * Constructs a starting screen for the game with a width of 800 and a height of
	 * 600.
	 * 
	 * @param surface the surface the screen will be drawn on
	 * 
	 */
	public MenuScreen(DrawingSurface surface) {
		super(800, 600);
		this.surface = surface;

		button = new Rectangle(800 / 2 - 100, 600 / 2 - 150, 200, 100);
		button2 = new Rectangle(800 / 2 - 100, 600 / 2 + 100, 200, 100);
	}

	/**
	 * This draws the buttons and text on PApplet surface
	 */
	public void draw() {

		surface.pushStyle();

		surface.background(255, 255, 255);

		surface.rect(button.x, button.y, button.width, button.height, 10, 10, 10, 10);
		surface.rect(button2.x, button2.y, button2.width, button2.height, 10, 10, 10, 10);
		surface.fill(0);
		String str = "Play!";
		float w = surface.textWidth(str);
		surface.text(str, button.x + button.width / 2 - w / 2, button.y + button.height / 2);
		String str2 = "Rules";
		float v = surface.textWidth(str2);
		surface.text(str2, button2.x + button2.width / 2 - v / 2, button2.y + button2.height / 2);

		surface.popStyle();
	}

	/**
	 * Changes the PApplet screen when the mouse is pressed on buttons.
	 */
	public void mousePressed() {
		Point p = surface.actualCoordinatesToAssumed(new Point(surface.mouseX, surface.mouseY));
		if (button.contains(p)) // got to play
			surface.switchScreen(ScreenSwitcher.SCREEN2);
		if (button2.contains(p)) // got to instructions
			surface.switchScreen(ScreenSwitcher.SCREEN3);
	}

}
