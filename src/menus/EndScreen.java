package menus;

import java.awt.Point;
import java.awt.Rectangle;

/**
 * This represents a PApplet screen that is the ending screen for the game.
 * 
 * @author Kelsey Shan
 */
public class EndScreen extends Screen {
	private DrawingSurface surface;
	private Rectangle button, button2, win;
	private String winner;

	/**
	 * Constructs a screen with a width of 800 and a height of 600.
	 * 
	 * @param surface the drawing PApplet surface that the screen will be displayed
	 *                on
	 */
	public EndScreen(DrawingSurface surface) {
		super(800, 600);
		this.surface = surface;

		winner = "";
		button = new Rectangle(800 / 2 - 100, 600 / 2 - 150, 200, 100);
		button2 = new Rectangle(800 / 2 - 100, 600 / 2 + 100, 200, 100);
		win = new Rectangle(800 / 2 - 100, 600 / 2 - 250, 200, 100);
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
		String str = "Main Menu";
		float w = surface.textWidth(str);
		surface.text(str, button.x + button.width / 2 - w / 2, button.y + button.height / 2);
		String str2 = "Play Again";
		float v = surface.textWidth(str2);
		surface.text(str2, button2.x + button2.width / 2 - v / 2, button2.y + button2.height / 2);
		surface.textSize(20);

		float x = surface.textWidth(winner);
		surface.text(winner, win.x + win.width / 2 - x / 2, win.y + win.height / 2);

		surface.popStyle();
	}

	/**
	 * Changes the PApplet screen when the mouse is pressed on certain buttons.
	 */
	public void mousePressed() {
		Point p = surface.actualCoordinatesToAssumed(new Point(surface.mouseX, surface.mouseY));
		if (button.contains(p)) // got to play
			surface.switchScreen(ScreenSwitcher.SCREEN1);
		if (button2.contains(p)) // got to instructions
			surface.switchScreen(ScreenSwitcher.SCREEN4);
	}

	/**
	 * This sets the string text which appears on the PApplet surface with the
	 * player that won.
	 * 
	 * @param i the number of the player that won.
	 */
	public void setWinner(int i) {
		winner = "The winner is player " + i + "!";
	}
}
