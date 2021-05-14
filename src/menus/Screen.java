package menus;

/**
 * This represents a screen where user interactions can take place, and it can
 * be drawn.
 * 
 * @author Mr.Shelby and Kelsey Shan
 *
 */
public abstract class Screen {
	/**
	 * The width of the screen
	 */
	public final int DRAWING_WIDTH;
	/**
	 * The width of the screen
	 */
	public final int DRAWING_HEIGHT;

	/**
	 * This constructs a new screen with the given width and height
	 * 
	 * @param width  the width of the screen
	 * @param height the height of the screen
	 */
	public Screen(int width, int height) {
		this.DRAWING_WIDTH = width;
		this.DRAWING_HEIGHT = height;
	}

	/**
	 * This sets up the screen
	 */
	public void setup() {

	}
	/**
	 * This draws the screen
	 */
	public void draw() {

	}
	/**
	 * This checks and acts if the mouse has been pressed
	 */
	public void mousePressed() {

	}
}
