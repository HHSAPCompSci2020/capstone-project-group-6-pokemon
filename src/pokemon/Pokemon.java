package pokemon;

public class Pokemon {
	int health, level;
	boolean isAlive;
	
	String [] attackName = new String[4];
	int [] attackValue = new int[4];
	
	char type; // a = air, f = fire, e = earth, w = water;
	
	public Pokemon() {
		type = 'n';
		for (int i = 0; i < attackName.length; i++) {
			attackName[i] = "protect";  
		}
		attackValue[1] = 0;
	}
}
