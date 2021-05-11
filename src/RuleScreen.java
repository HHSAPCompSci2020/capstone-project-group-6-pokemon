/**
 * Author: Kelsey Shan
 */
import java.awt.event.KeyEvent;

public class RuleScreen extends Screen {
	private int x, y;

	private DrawingSurface surface;

	public RuleScreen(DrawingSurface surface) {
		super(800,600);
		this.surface = surface;
		
		x = 30;
		y = 30;
	}

	public void draw() {

		// Draw stuff

		surface.pushStyle();

		surface.background(255);   // Clear the screen with a white background
		surface.stroke(0);     // Set line drawing color to white
		surface.noFill();

		
		surface.fill(0);
		surface.textSize(15);
		surface.text("Menu: Space", 10, 30);

		
		surface.text("Rules:", 10, 50);
		surface.text("First choose your starter pokemon to fight with", 10, 75);
		surface.text("Each pokemon has its own moves which can be used during fights", 10, 92);
		surface.text("During a fight, players will alternate turns and make one move per turn", 10, 109);
		surface.text("You win a fight when the other player's pokemon dies from losing all its HP", 10, 126);
		surface.text("Have fun fighting!", 10, 143);
		surface.popStyle();

		// Change stuff

		if (surface.isPressed(KeyEvent.VK_SPACE)) {
			surface.switchScreen(ScreenSwitcher.SCREEN1);
		}
	}

}
