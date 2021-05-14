package pokemon;

/**
 * This represents a Squirtle pokemon
 * 
 * @author Rishi Zamvar
 *
 */
public class Squirtle extends Pokemon {
	/**
	 * Constructs a Squirtle with the attributes of a generic pokemon
	 */
	public Squirtle() {
		super();
	}

	/**
	 * Constructs a Squirtle with the given health and level
	 * 
	 * @param health the starting health of the Squirtle
	 * @param level  the starting level of the Squirtle
	 */
	public Squirtle(int health, int level) {
		super('g', health, level);
		setSpeedBase(40);
		moves.add("Water Gun");
		moves.add("Protect");
		moves.add("Calm Mind");
	}

	/**
	 * This determines the damage done by one of Squirtle's moves
	 * 
	 * @param num the index of the move
	 * @return the damage done by the move made
	 */
	public int move(int num) {
		if (num == 1) {
			return (int) (20 * getAStat());
		} else if (num == 2) {
			setProtected(true);
			return 0;
		}

		else {
			changeAstat(2);
			changeSstat(2);
			return 0;
		}
	}
}
