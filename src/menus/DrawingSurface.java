package menus;

/**
 * Author: Kelsey Shan
 */
import java.awt.Point;
import java.util.ArrayList;

import processing.core.PApplet;
import processing.core.PImage;

public class DrawingSurface extends PApplet implements ScreenSwitcher {

	public float ratioX, ratioY;
	
	private ArrayList<Integer> keys;
	
	private Screen activeScreen;
	private ArrayList<Screen> screens;

	
	public DrawingSurface() {
		
		
		screens = new ArrayList<Screen>();
		
		keys = new ArrayList<Integer>();
		
		
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
	
	public void settings() {
		// size(DRAWING_WIDTH, DRAWING_HEIGHT, P2D);
		size(activeScreen.DRAWING_WIDTH, activeScreen.DRAWING_HEIGHT);
	}
	
	public void setup() {
		surface.setResizable(true);
		for (Screen s : screens)
			s.setup();
	}
	
	public void draw() {
		ratioX = (float)width/activeScreen.DRAWING_WIDTH;
		ratioY = (float)height/activeScreen.DRAWING_HEIGHT;

		pushMatrix();
		
		scale(ratioX, ratioY);
		
		activeScreen.draw();
		
		popMatrix();
	}
	
	public void keyPressed() {
		keys.add(keyCode);
	}

	public void keyReleased() {
		while(keys.contains(keyCode))
			keys.remove(new Integer(keyCode));
	}

	public boolean isPressed(Integer code) {
		return keys.contains(code);
	}
	
	public void mousePressed() {
		activeScreen.mousePressed();
	}
	
	public void mouseMoved() {
		activeScreen.mouseMoved();
	}
	
	public void mouseDragged() {
		activeScreen.mouseDragged();
	}
	
	public void mouseReleased() {
		activeScreen.mouseReleased();
	}
	
	public Point assumedCoordinatesToActual(Point assumed) {
		return new Point((int)(assumed.getX()*ratioX), (int)(assumed.getY()*ratioY));
	}

	public Point actualCoordinatesToAssumed(Point actual) {
		return new Point((int)(actual.getX()/ratioX) , (int)(actual.getY()/ratioY));
	}

	@Override
	public void switchScreen(int i) {
		activeScreen = screens.get(i);
	}

}
