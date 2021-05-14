package menus;

/**
 * This is the interface which allows the screen to be switched
 * 
 * @author Mr.Shelby and Kelsey Shan
 * 
 */
public interface ScreenSwitcher {
	/**
	 * SCREEN1 represents the index of the first PApplet screen
	 */
	public static final int SCREEN1 = 0; // menu
	/**
	 * SCREEN2 represents the index of the second PApplet screen
	 */
	public static final int SCREEN2 = 1; // select
	/**
	 * SCREEN3 represents the index of the third PApplet screen
	 */
	public static final int SCREEN3 = 2; // rules
	/**
	 * SCREEN4 represents the index of the fourth PApplet screen
	 */
	public static final int SCREEN4 = 3; // game
	/**
	 * SCREEN5 represents the index of the fifth PApplet screen
	 */
	public static final int SCREEN5 = 4; // end screen

	/**
	 * This method switches the PApplet screen that is displayed
	 * 
	 * @param i the index of the PApplet screen
	 */
	public void switchScreen(int i);
}
