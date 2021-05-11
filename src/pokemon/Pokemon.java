package pokemon;

public class Pokemon {
	int health, level;
	boolean isAlive;
	
	
	
	char type; // a = air, f = fire, e = earth, w = water;
	
	int aStatN;  // attack stat numerator 
	
	double aStatM; // attack stat multiplier
	
	int sStatN;  // speed stat numerator 
	
	double sStatM; // speed stat multiplier
	
	public boolean isProtected; //for move protect
	
	
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
	
	public Pokemon (char type, int health, int level) {
		this.type = type; 
		this.health = health; 
		this.level = level; 
		
		aStatN = 2;
		aStatM = aStatN/2;
		
		sStatN = 2;
		sStatM = sStatN/2;
	}
	
	public int getHealth() {
		return health; 
	}
	
	public char getType() {
		return type; 
	}
	
	public int getLevel() {
		return level; 
	}
	
	public void changeAstat(int amt) {
		aStatN += amt; 
		aStatM = aStatN/2;
	}
	
	public void changeSstat(int amt) {
		sStatN += amt; 
		sStatM = sStatN/2;
	}
	
	public double getAstat() {
		return aStatM;
	}
	
	public double getSstat() {
		return sStatM;
	}
	
	
}
