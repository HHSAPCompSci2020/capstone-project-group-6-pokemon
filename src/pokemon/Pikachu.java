package pokemon;

/**
 * This represents a Pikachu pokemon
 * 
 * @author Rishi Zamvar
 *
 */
public class Pikachu extends Pokemon {
	/**
	 * Constructs a Pikachu with the attributes of a generic pokemon
	 */
	public Pikachu() {
		super();
	}

	/**
	 * Constructs a Pikachu with the given health and level
	 * 
	 * @param health the starting health of the Pikachu
	 * @param level  the starting level of the Pikachu
	 */
	public Pikachu(int health, int level) {
		super('e', health, level);
		setSpeedBase(60);
		setMoveName(1, "Nuzzle");
		setMoveName(2, "Protect");
		setMoveName(0, "Agility");
		/*
		 * moves.add("Nuzzle"); moves.add("Protect"); moves.add("Agility");
		 */
	}

	/**
	 * This determines the damage done by one of Pikachu's moves
	 * 
	 * @param num the index of the move
	 * @return the damage done by the move made
	 */
	public int move(int num) {
		if (num == 1) {
			return (int) (25 * getAStat());
		} else if (num == 2) {
			setProtected(true);
			return 0;
		} 

		else {
			changeSstat(2);
			return 0;
		}
	}

}
