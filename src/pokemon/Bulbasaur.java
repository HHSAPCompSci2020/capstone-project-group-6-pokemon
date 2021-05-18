package pokemon;

/**
 * This represents a Bulbasaur pokemon
 * 
 * @author Rishi Zamvar
 *
 */
public class Bulbasaur extends Pokemon {
	/**
	 * Constructs a Bulbasaur with the attributes of a generic pokemon
	 */
	public Bulbasaur() {
		super();
	}

	/**
	 * Constructs a Bulbasaur with the given health and level
	 * 
	 * @param health the starting health of the Bulbasaur
	 * @param level  the starting level of the Bulbasaur
	 */
	public Bulbasaur(int health, int level) {
		super('g', health, level);
		setSpeedBase(40);
		setMoveName(1, "Vine Whip");
		setMoveName(2, "Protect");
		setMoveName(0, "Growth");
		/*
		 * moves.add("Vine Whip"); moves.add("Protect"); moves.add("Growth");
		 */
	}

	/**
	 * This determines the damage done by one of Bulbasaur's moves
	 * 
	 * @param num the index of the move
	 * @return the damage done by the move made
	 */
	public int move(int num) {
		if (num == 1) {
			return (int) (15 * getAStat());
		} else if (num == 2) {
			setProtected(true);
			return 0;
		}

		else {
			changeAstat(2);
			return 0;
		}
	}

}
