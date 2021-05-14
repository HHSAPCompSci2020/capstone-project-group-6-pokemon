package pokemon;

/**
 * This represents a Jiggly Puff pokemon
 * 
 * @author Rishi Zamvar
 *
 */
public class JigglyPuff extends Pokemon {
	/**
	 * Constructs a Jiggly Puff with the attributes of a generic pokemon
	 */
	public JigglyPuff() {
		super();
	}

	/**
	 * Constructs a Jiggly Puff with the given health and level
	 * 
	 * @param health the starting health of the Jiggly Puff
	 * @param level  the starting level of the Jiggly Puff
	 */
	public JigglyPuff(int health, int level) {
		super('n', health, level);
		setSpeedBase(10);
		setMoveName(0, "Rollout");
		setMoveName(1, "Protect");
		setMoveName(2, "Recover");
		/*
		 * moves.add("Rollout"); moves.add("Protect"); moves.add("Recover");
		 */
	}

	/**
	 * This determines the damage done by one of Jiggly Puff's moves
	 * 
	 * @param num the index of the move
	 * @return the damage done by the move made
	 */
	public int move(int num) {
		if (num == 1) {
			return (int) (50 * getAStat());
		} else if (num == 2) {
			setProtected(true);
			return 0;
		}

		else {
			if (getMaxHealth() / 2 >= getHealth()) {
				this.addHealth(this.getMaxHealth() / 2); // addHealth(getMaxHealth()/2);
			}

			else
				this.setHealth(this.getMaxHealth());
			return 0;
		}
	}

}
