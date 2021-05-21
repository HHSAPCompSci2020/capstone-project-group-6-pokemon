package game;

import java.util.ArrayList;

import pokemon.*;

/**
 * This represents a game of pokemon that changes turns between turn players.
 * The game has players make moves to determine a winner
 * 
 * @author Rishi Zamvar and Kelsey Shan
 *
 */
public class Game {
	private Pokemon p1, p2;
	private int turn; // 0 for player1, 1 for player2

	/**
	 * Constructs a game match with the given pokemon
	 * 
	 * @param p1 the first Pokemon
	 * @param p2 the second Pokemon
	 */
	public Game(Pokemon p1, Pokemon p2) {
		this.p1 = p1;
		this.p2 = p2;
		turn = 0;
	}

	/**
	 * This sets the first pokemon
	 * 
	 * @param p the Pokemon that will replace the current one
	 */
	public void setP1(Pokemon p) {
		p1 = p;
	}

	/**
	 * This sets the second pokemon
	 * 
	 * @param p the Pokemon that will replace the current one
	 */
	public void setP2(Pokemon p) {
		p2 = p;
	}

	/**
	 * This makes a move in the game
	 * 
	 * @param num the index of the move that will be performed
	 */
	public void move(int num) {

		if (getTurn() == 1) {
			if (p2.getProtect()) {
				p2.toggleProtect();

			} else
				p2.addHealth(p1.move(num) * (-1));
		}

		else {

			if (p1.getProtect()) {
				p1.toggleProtect();

			} else
				p1.addHealth(p2.move(num) * (-1));

		}
	}

	/**
	 * This gets the move name of the pokemon
	 * @param pok The index of the pokemon that currently has the turn
	 * @param num The index of the move name
	 * @return the name of the move selected
	 */
	public String getName(int pok, int num) {
		if (pok == 1) {
			return p1.getMoveName(num);
		} else {
			return p2.getMoveName(num);
		}
	}

	/**
	 * This changes the turn from one pokemon to another
	 */
	public void changeTurn() {
		if (turn == 0)
			turn = 1;
		else
			turn = 0;

	}

	/**
	 * This gets the first pokemon
	 * 
	 * @return the first pokemon
	 */
	public Pokemon getp1() {
		return p1;
	}

	/**
	 * This gets the second pokemon
	 * 
	 * @return the second pokemon
	 */
	public Pokemon getp2() {
		return p2;
	}

	/**
	 * This determines if a pokemon has won the game
	 * 
	 * @return it returns 1 if the first pokemon wins, 2 if the second pokemon wins,
	 *         and 0 if neither win
	 */
	public int win() {
		if (p1.getHealth() <= 0)
			return 2; // player 1's pokemon dies
		else if (p2.getHealth() <= 0) {
			return 1; // player 2's pokemon dies
		}

		return 0;
	}

	/**
	 * This gets the current turn
	 * 
	 * @return the pokemon who currently has the turn. It returns 1 for the first
	 *         pokemon and 2 for the second pokemon.
	 */
	public int getTurn() {
		return turn + 1;
	}

	/**
	 * This sets which player currently has the turn
	 * @param in the player who will have the turn. 0 represents player 1 and 1 represents player 2.
	 */
	public void setTurn(int in) {
		turn = in;
	}
}
