package menus;

/**
 * Author: Kelsey Shan
 */
import java.awt.Point;
import java.awt.Rectangle;
import java.awt.event.*;

public class SelectScreen extends Screen {

	private int x, y;

	private DrawingSurface surface;

	private Rectangle[] options = new Rectangle[10];
	private Rectangle done;
	private int choice1 = -1, choice2 = -1;

	public SelectScreen(DrawingSurface surface) {
		super(800, 600);
		this.surface = surface;
		// PIKACHU
		options[0] = new Rectangle(50, 100, 200, 50);
		options[1] = new Rectangle(550, 100, 200, 50);
		// JIGGLYPUFF
		options[2] = new Rectangle(50, 175, 200, 50);
		options[3] = new Rectangle(550, 175, 200, 50);
		// BULBASAUR
		options[4] = new Rectangle(50, 250, 200, 50);
		options[5] = new Rectangle(550, 250, 200, 50);
		// CHARMANDER
		options[6] = new Rectangle(50, 325, 200, 50);
		options[7] = new Rectangle(550, 325, 200, 50);
		// SQUIRTLE
		options[8] = new Rectangle(50, 400, 200, 50);
		options[9] = new Rectangle(550, 400, 200, 50);

		done = new Rectangle(800 / 2 - 100, 600 / 2 + 150, 200, 100);

	}

	public void draw() {

		// Draw stuff

		surface.pushStyle();

		surface.background(255); // Clear the screen with a white background
		surface.stroke(0); // Set line drawing color to white
		surface.noFill();

		surface.rect(done.x, done.y, done.width, done.height, 10, 10, 10, 10);
		for (int i = 0; i < options.length; i++) {
			if (choice1 == i || choice2 == i) {
				surface.fill(100);
			} else
				surface.noFill();
			surface.rect(options[i].x, options[i].y, options[i].width, options[i].height, 10, 10, 10, 10);
		}

		surface.fill(0);

		surface.text("Player 1: Select a Pokemon", 60, 50);
		surface.text("Player 2: Select a Pokemon", 560, 50);

		String[] names = new String[5];
		names[0] = "Pikachu";
		names[1] = "Jiggly Puff";
		names[2] = "Bulbasaur";
		names[3] = "Charmander";
		names[4] = "Squirtle";

		for (int i = 0; i < options.length; i++) {
			String str = names[i / 2];
			float w = surface.textWidth(str);
			surface.text(str, options[i].x + options[i].width / 2 - w / 2, options[i].y + options[i].height / 2);

		}

		String str = "Done Choosing";
		float w = surface.textWidth(str);
		surface.text(str, done.x + done.width / 2 - w / 2, done.y + done.height / 2);

		surface.popStyle();

	}

	public void mousePressed() {
		Point p = surface.actualCoordinatesToAssumed(new Point(surface.mouseX, surface.mouseY));
		if (done.contains(p)) // got to gamescreen
			surface.switchScreen(ScreenSwitcher.SCREEN4);
		for (int i = 0; i < options.length; i++) {
			if (options[i].contains(p)) {
				if (i % 2 == 0)
					choice1 = i;
				else
					choice2 = i;
			}
		}
	}

	public int getChoice1() {
		return choice1;
	}

	public int getChoice2() {
		return choice2;
	}
}