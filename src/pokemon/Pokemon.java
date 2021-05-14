
package pokemon;

import java.util.ArrayList;

/**
 * This is a pokemon entity with stats for level, health, and move factors.
 * 
 * @author Rishi Zamvar
 *
 */
public class Pokemon {
	private int health;

	protected double level;

	private boolean isAlive;

	private int maxHealth;

	private int speedBase;

	private char type; // a = air, f = fire, e = earth, w = water, g = grass;

	private int aStatN; // attack stat numerator

	private double aStatM; // attack stat multiplier

	private int sStatN; // speed stat numerator

	private double sStatM; // speed stat multiplier

	private boolean isProtected; // for move protect

	private String[] moves = new String[3];

	/**
	 * Constructs a pokemon
	 */
	public Pokemon() {
		type = 'n';
		health = 100;
		level = 50;
		isAlive = true;

		aStatN = 2;
		aStatM = aStatN / 2;

		sStatN = 2;
		sStatM = sStatN / 2;
		moves[0] = "attack";
		moves[1] = "heal";
		moves[2] = "random";

	}

	/**
	 * Constructs a pokemon with the given health, level, and type
	 * 
	 * @param type      the type of the pokemon. The char 'a' represents air, 'f'
	 *                  represents fire, 'e' represents earth, 'w' represents water,
	 *                  and 'g' represents grass;
	 * @param maxHealth the maximum amount of health the pokemon can have
	 * @param level     the starting level of the pokemon
	 */
	public Pokemon(char type, int maxHealth, double level) {
		this.type = type;
		this.maxHealth = ((int) (maxHealth * (level / 10)));
		this.health = this.getMaxHealth();
		this.level = level;

		aStatN = 2;
		aStatM = (aStatN / 2) * (level / 10);

		sStatN = 2;
		sStatM = sStatN / 2 * (level / 10);
		moves[0] = "attack";
		moves[1] = "heal";
		moves[2] = "random";
	}

	/**
	 * This gets the type of the Pokemon
	 * 
	 * @return the type of the Pokemon
	 */
	public char getType() {
		return type;
	}

	/**
	 * This gets the level of the Pokemon
	 * 
	 * @return the level of the Pokemon
	 */
	public double getLevel() {
		return level;
	}

	/**
	 * This adds to the level of the pokemon
	 * 
	 * @param amt the amount the level will increase by
	 */
	public void setLevel(double amt) {
		level += amt;
	}

	/**
	 * This adds to the attack stat numerator
	 * 
	 * @param amt the amount added to the attack stat numerator
	 */
	public void changeAstat(int amt) {
		aStatN += amt;
		aStatM = aStatN / 2;
	}

	/**
	 * This adds to the speed stat numerator
	 * 
	 * @param amt the amount added to the speed stat numerator
	 */
	public void changeSstat(int amt) {
		sStatN += amt;
		sStatM = sStatN / 2;
	}

	/**
	 * This gets the attack stat numerator of the Pokemon
	 * 
	 * @return the attack stat numerator of the Pokemon
	 */
	public double getAStat() {
		return aStatM;
	}

	/**
	 * This gets the speed stat numerator of the Pokemon
	 * 
	 * @return the speed stat numerator of the Pokemon
	 */
	public double getSstat() {
		return sStatM * speedBase;
	}

	public boolean getProtect() {
		return isProtected;

	}

	public void toggleProtect() {
		this.isProtected = !isProtected;
	}

	/**
	 * This gets the speed base of the Pokemon
	 * 
	 * @return the speed base of the Pokemon
	 */
	public int getSpeedBase() {
		return speedBase;
	}

	public void setSpeedBase(int speedBase) {
		this.speedBase += speedBase;
	}

	/**
	 * This gets the protection status of the pokemon
	 * 
	 * @return true of the pokemon is protected and false is otherwise
	 */
	public boolean isProtected() {
		return isProtected;
	}

	/**
	 * This sets the pokemon's protection status
	 * 
	 * @param isProtected the boolean value that is true if the pokemon is protected
	 *                    and false if otherwise
	 */
	public void setProtected(boolean isProtected) {
		this.isProtected = isProtected;
	}

	/**
	 * This gets the maximum health of the Pokemon
	 * 
	 * @return the maximum health of the Pokemon
	 */
	public int getMaxHealth() {
		return maxHealth;
	}

	/**
	 * This sets the maximum health of the Pokemon based on the Pokemon's level
	 */
	public void setMaxHealth() {
		this.maxHealth *= level / 10;
	}

	/**
	 * This gets the current health of the Pokemon
	 * 
	 * @return the current health of the Pokemon
	 */
	public int getHealth() {
		return health;
	}

	/**
	 * This added a given amount to the Pokemon's health
	 * 
	 * @param add the amount that will be added to the health
	 */
	public void addHealth(int add) {
		this.health += add;
	}

	/**
	 * This sets the health of the pokemon to the given amount
	 * 
	 * @param health the new value of health
	 */
	public void setHealth(int health) {
		this.health = health;
	}

	/**
	 * This makes the given move and determines the damage
	 * 
	 * @param num the index of the move
	 * @return 0
	 */
	public int move(int num) {
		return 0;

	}
	
	public void toggleAlive() {
		this.isAlive = !isAlive; 
	}

	public String getMoveName(int num) {
		return moves[num];
	}

	public void setMoveName(int num, String s) {
		moves[num] = s;
	}
}
