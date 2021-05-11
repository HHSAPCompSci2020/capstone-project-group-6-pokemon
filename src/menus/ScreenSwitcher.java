package menus;
/**
 * Author: Kelsey Shan
 */

public interface ScreenSwitcher {
	public static final int SCREEN1 = 0; //menu
	public static final int SCREEN2 = 1; //select
	public static final int SCREEN3 = 2; //rules
	public static final int SCREEN4 = 3; //game
	
	public void switchScreen(int i);
}
