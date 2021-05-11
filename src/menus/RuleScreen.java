package menus;

/**
 * Author: Kelsey Shan
 */
import java.awt.Point;
import java.awt.Rectangle;
import java.awt.event.KeyEvent;

public class RuleScreen extends Screen {
	private int x, y;
	private Rectangle button;
	private DrawingSurface surface;

	public RuleScreen(DrawingSurface surface) {
		super(800, 600);
		this.surface = surface;

		x = 30;
		y = 30;
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

		String str = "Back to Menu";
		float w = surface.textWidth(str);
		surface.text(str, button.x + button.width / 2 - w / 2, button.y + button.height / 2);
		surface.textSize(20);

		surface.text("Rules:", 10, 50);
		surface.text("First choose your starter pokemon to fight with", 10, 75);
		surface.text("Each pokemon has its own moves which can be used during fights", 10, 95);
		surface.text("During a fight, players will alternate turns and make one move per turn", 10, 115);
		surface.text("You win a fight when the other player's pokemon dies from losing all its HP", 10, 135);
		surface.text("Have fun fighting!", 10, 155);
		surface.popStyle();

	}

	public void mousePressed() {
		Point p = surface.actualCoordinatesToAssumed(new Point(surface.mouseX, surface.mouseY));
		if (button.contains(p)) // got to main menu
			surface.switchScreen(ScreenSwitcher.SCREEN1);
	}

}
