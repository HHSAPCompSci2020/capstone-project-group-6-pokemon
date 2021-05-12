package menus;

import java.awt.Point;
import java.awt.Rectangle;

public class EndScreen extends Screen {
	private DrawingSurface surface;

	private Rectangle button, button2, win;
	private String winner;
	public EndScreen(DrawingSurface surface) {
		super(800,600);
		this.surface = surface;
		winner = "";
		button = new Rectangle(800/2-100,600/2-150,200,100);
		button2 = new Rectangle(800/2-100,600/2+100,200,100);
		win = new Rectangle(800/2-100,600/2-250,200,100);
	}

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

	public void mousePressed() {
		Point p = surface.actualCoordinatesToAssumed(new Point(surface.mouseX, surface.mouseY));
		if (button.contains(p)) // got to play
			surface.switchScreen(ScreenSwitcher.SCREEN1);
		if (button2.contains(p)) // got to instructions
			surface.switchScreen(ScreenSwitcher.SCREEN4);
	}
	
	public void setWinner(int i) {
		winner = "The winner is " + i;
	}
}
