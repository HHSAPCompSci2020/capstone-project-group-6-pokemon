package pokemon;

public class Pokemon {
	int health, level;
	boolean isAlive;
	
	
	
	char type; // a = air, f = fire, e = earth, w = water;
	
	int aStatN;  // attack stat numerator and denominator
	
	double aStatM; // attack stat multiplier
	
	int sStatN;  // speed stat numerator and denominator
	
	double sStatM; // speed stat multiplier
	
	
	public Pokemon() {
		type = 'n';
		health = 100;
		level = 50;
		isAlive = true; 
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
	
	
}
