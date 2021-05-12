/**
 * 
 * @author Rishi Zamvar
 *
 */

package pokemon;

public class Pokemon {
	private int health;
	
	private double level;
	
	private boolean isAlive;
	
	private int maxHealth; 
	
	private int speedBase; 
	
	
	private char type; // a = air, f = fire, e = earth, w = water, g = grass;
	
	private int aStatN;  // attack stat numerator 
	
	private double aStatM; // attack stat multiplier
	
	private int sStatN;  // speed stat numerator 
	
	private double sStatM; // speed stat multiplier
	
	private boolean isProtected; //for move protect
	
	
	public Pokemon() {
		type = 'n';
		health = 100;
		level = 50;
		isAlive = true; 
		
		aStatN = 2;
		aStatM = aStatN/2;
		
		sStatN = 2;
		sStatM = sStatN/2;
		
		
	}
	
	public Pokemon (char type, int maxHealth, double level) {
		this.type = type; 
		this.maxHealth=((int)(maxHealth * (level/10)));
		this.health = this.getMaxHealth(); 
		this.level = level; 
		
		
		aStatN = 2;
		aStatM = (aStatN/2)*(level/10);
		
		sStatN = 2;
		sStatM = sStatN/2*(level/10);
	}
	
	
	public char getType() {
		return type; 
	}
	
	public double getLevel() {
		return level; 
	}
	
	public void setLevel(double amt) {
		level+=amt; 
	}
	
	public void changeAstat(int amt) {
		aStatN += amt; 
		aStatM = aStatN/2;
	}
	
	public void changeSstat(int amt) {
		sStatN += amt; 
		sStatM = sStatN/2;
	}
	
	public double getAStat() {
		return aStatM;
	}
	
	public double getSstat() {
		return sStatM*speedBase;
	}

	public int getSpeedBase() {
		return speedBase;
	}

	public void setSpeedBase(int speedBase) {
		this.speedBase += speedBase;
	}

	public boolean isProtected() {
		return isProtected;
	}

	public void setProtected(boolean isProtected) {
		this.isProtected = isProtected;
	}

	public int getMaxHealth() {
		return maxHealth;
	}

	public void setMaxHealth() {
		this.maxHealth *= level/10;
	}
	
	public int getHealth() {
		return health;
	}
	
	public void addHealth(int add) {
		this.health+=add; 
	}
	
	public void setHealth(int health) {
		this.health=health; 
	}
	
	
}
