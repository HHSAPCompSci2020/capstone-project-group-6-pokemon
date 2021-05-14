package menus;

import java.awt.Point;
import java.awt.Rectangle;
import java.awt.event.*;

import game.Game;
import pokemon.*;

/**
 * This represents a PApplet screen that can have user interactions. This is
 * where the pokemon are selected
 * 
 * @author Kelsey Shan
 */
public class SelectScreen extends Screen {

	private int x, y;

	private DrawingSurface surface;
	private BattleScreen screen;
	private Rectangle[] options = new Rectangle[10];
	private Rectangle done;
	private int choice1 = -1, choice2 = -1;
	private Pokemon p1, p2;

	/**
	 * Constructs a select screen with a width of 800 and a height of 600. The
	 * players can choose which pokemon they will fight with and their selection
	 * will be indicated with the button having a different color.
	 */
	public SelectScreen(DrawingSurface surface, BattleScreen screen) {
		super(800, 600);
		this.surface = surface;
		this.screen = screen;
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
		p1 = new Pokemon();
		p2 = new Pokemon();
	}

	/**
	 * This draws the buttons and text on PApplet surface
	 */
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

	/**
	 * Changes the PApplet screen when the mouse is pressed on certain buttons and
	 * selects the Pokemon choosen if their button is pressed.
	 */
	public void mousePressed() {
		Point p = surface.actualCoordinatesToAssumed(new Point(surface.mouseX, surface.mouseY));
		if (done.contains(p) && p1 != null && p2 != null) { // go to gamescreen only if they have choosen
			choice1 = -1;
			choice2 = -1;
			surface.switchScreen(ScreenSwitcher.SCREEN4);
		}
		for (int i = 0; i < options.length; i++) {
			if (options[i].contains(p)) {
				if (i % 2 == 0)
					choice1 = i;
				else
					choice2 = i;

				if (choice1 == 0) {
					screen.getGame().setP1(new Pikachu(1000, 1));
				} else if (choice1 == 2) {
					screen.getGame().setP1(new JigglyPuff(1000, 1));
				} else if (choice1 == 4) {
					screen.getGame().setP1(new Bulbasaur(1000, 1));
				} else if (choice1 == 6) {
					screen.getGame().setP1(new Charmander(1000, 1));
				} else if (choice1 == 8) {
					screen.getGame().setP1(new Squirtle(1000, 1));
				}

				if (choice2 == 1) {
					screen.getGame().setP2(new Pikachu(1000, 1));
				} else if (choice2 == 3) {
					screen.getGame().setP2(new JigglyPuff(1000, 1));
				} else if (choice2 == 5) {
					screen.getGame().setP2(new Bulbasaur(1000, 1));
				} else if (choice2 == 7) {
					screen.getGame().setP2(new Charmander(1000, 1));
				} else if (choice2 == 9) {
					screen.getGame().setP2(new Squirtle(1000, 1));
				}
			}
		}
	}
}