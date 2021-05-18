package pokemon;

/**
 * This represents a Charmander pokemon
 * 
 * @author Rishi Zamvar
 *
 */
public class Charmander extends Pokemon {
	/**
	 * Constructs a Charmander with the attributes of a generic pokemon
	 */
	public Charmander() {
		super();
	}

	/**
	 * Constructs a Charmander with the given health and level
	 * 
	 * @param health the starting health of the Charmander
	 * @param level  the starting level of the Charmander
	 */
	public Charmander(int health, int level) {
		super('f', health, level);
		setSpeedBase(30);
		setMoveName(1,"Ember");
		setMoveName(2,"Protect");
		setMoveName(0,"Blaze");
		/*
		 * moves.add("Ember"); moves.add("Protect"); moves.add("Blaze");
		 */
	}

	/**
	 * This determines the damage done by one of Charmander's moves
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
			changeAstat(1);
			changeSstat(1);
			return 0;
		}
	}

}
