package menus;

import java.awt.Point;
import java.util.ArrayList;

import processing.core.PApplet;
import processing.core.PApplet;
import processing.core.PConstants;
import processing.sound.SoundFile;

/**
 * This represents a PApplet drawing surface.
 * 
 * @author Mr.Shelby and Kelsey Shan
 *
 */
public class DrawingSurface extends PApplet implements ScreenSwitcher {

	public float ratioX, ratioY;

	private Screen activeScreen;
	private ArrayList<Screen> screens;

	private int loadIndex;
	private int currentPlaying;
	private SoundFile[] sounds;
	private String[] soundFileNames;

	/**
	 * This constructs a PApplet surface
	 */
	public DrawingSurface() {

		screens = new ArrayList<Screen>();

		MenuScreen screen1 = new MenuScreen(this);
		screens.add(screen1);

		EndScreen screen5 = new EndScreen(this);
		BattleScreen screen4 = new BattleScreen(this, screen5);

		SelectScreen screen2 = new SelectScreen(this, screen4);
		screens.add(screen2);

		RuleScreen screen3 = new RuleScreen(this);
		screens.add(screen3);

		screens.add(screen4);

		screens.add(screen5);

		activeScreen = screens.get(0);

		loadIndex = 0;

		currentPlaying = -1;

		soundFileNames = new String[] {"audio/music.mp3"};

		sounds = new SoundFile[soundFileNames.length];

	}

	/**
	 * Sets the size of the current screen
	 */
	public void settings() {
		// size(DRAWING_WIDTH, DRAWING_HEIGHT, P2D);
		size(activeScreen.DRAWING_WIDTH, activeScreen.DRAWING_HEIGHT);
	}

	/**
	 * Sets up the screens
	 */
	public void setup() {
		surface.setResizable(true);
		for (Screen s : screens)
			s.setup();
		thread("loadNextSong");
	}

	/**
	 * Draws the active screen
	 */
	public void draw() {
		ratioX = (float) width / activeScreen.DRAWING_WIDTH;
		ratioY = (float) height / activeScreen.DRAWING_HEIGHT;

		pushMatrix();

		scale(ratioX, ratioY);

		activeScreen.draw();

		popMatrix();
	}

	/**
	 * This performs the result of a mouse press interaction from the user.
	 */
	public void mousePressed() {
		activeScreen.mousePressed();
	}

	/**
	 * This converts the actually coordinates into an assumed point
	 * 
	 * @param actual a point with (x,y)
	 * @return the assumed conversion in point form
	 */
	public Point actualCoordinatesToAssumed(Point actual) {
		return new Point((int) (actual.getX() / ratioX), (int) (actual.getY() / ratioY));
	}

	/**
	 * This switches the current screen.
	 * 
	 * @param i the index of the screen that will be switched with
	 */
	@Override
	public void switchScreen(int i) {
		activeScreen = screens.get(i);
	}

	public void loadNextSong() {
		for (loadIndex = 0; loadIndex < soundFileNames.length; loadIndex++) {
			sounds[loadIndex] = new SoundFile(this, soundFileNames[loadIndex]);
		}
	}

	public void toggleSound() {
		if (currentPlaying == 0) {
			sounds[currentPlaying].stop();
			currentPlaying = -1;
		}
		else {
			sounds[0].cue(0);
			sounds[0].play();
			currentPlaying = 0;
		}
	}
}
