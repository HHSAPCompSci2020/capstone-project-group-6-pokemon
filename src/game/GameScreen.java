package game;

import menus.*;
import java.awt.Rectangle;

public class GameScreen extends Screen {
	private DrawingSurface surface;

	public GameScreen(DrawingSurface surface) {
		super(800, 600);
		this.surface = surface;
	}

	public void draw() {

		// Draw stuff

		surface.pushStyle();

		surface.background(255); // Clear the screen with a white background
		surface.stroke(0); // Set line drawing color to white
		surface.noFill();

		surface.popStyle();

	}
}
