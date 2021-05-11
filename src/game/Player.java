package game;

import java.util.ArrayList;

import pokemon.*;

public class Player {
	ArrayList<Pokemon> team;
	Pokemon current;

	public Player() {
		team = new ArrayList<Pokemon>();
		current = new Pokemon();
	}

	/**
	 * This method adds a new pokemon to the team of the player.
	 * 
	 * @param p the pokemon being added to the team
	 */
	public void addToTeam(Pokemon p) {
		team.add(p);
	}

	/**
	 * This method switches out the current pokemon
	 * 
	 * @param i The index of the pokemon being switched in. It should be a valid
	 *          index of the list of pokemon
	 */
	public void switchPokemon(int i) {
		current = team.get(i);
	}
}
