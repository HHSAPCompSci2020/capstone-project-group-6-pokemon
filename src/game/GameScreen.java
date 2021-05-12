package game;

import menus.*;

import java.awt.Point;
import java.awt.Rectangle;

public class GameScreen extends Screen {
	private DrawingSurface surface;
	private Game game;
	private Rectangle button;

	// Game play;
	public GameScreen(DrawingSurface surface) {
		super(800, 600);
		game = new Game(null, null);
		this.surface = surface;
		// play = new Game();
		button = new Rectangle(800 / 2 - 100, 600 / 2 + 100, 200, 100);
	}

	public void draw() {

		// Draw stuff

		surface.pushStyle();
		surface.background(255); // Clear the screen with a white background
		surface.stroke(0); // Set line drawing color to white
		surface.noFill();

		surface.rect(button.x, button.y, button.width, button.height, 10, 10, 10, 10);

		surface.fill(0);
		String str = "End Screen";
		float w = surface.textWidth(str);
		surface.text(str, button.x + button.width / 2 - w / 2, button.y + button.height / 2);

		surface.popStyle();

	}

	public void mousePressed() {
		Point p = surface.actualCoordinatesToAssumed(new Point(surface.mouseX, surface.mouseY));
		if (button.contains(p)) // got to main menu
			surface.switchScreen(ScreenSwitcher.SCREEN5);
	}
}
