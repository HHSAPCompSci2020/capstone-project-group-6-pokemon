package game;

import pokemon.*;

public class Game {
	Pokemon p1, p2;
	int turn; // 0 for player1, 1 for player2

	public Game(Pokemon p1, Pokemon p2) {
		this.p1 = p1;
		this.p2 = p2;
		turn = 0;
	}

	public void act() {
		if (win() == 0) {
			if (turn == 0) {
				p1.
			} else {

			}

			changeTurn();
		}
	}

	public void changeTurn() {
		turn++;
		turn = turn % 2;
	}

	public int win() {
		if (p1.getHealth() == 0)
			return 2; // player 1's pokemon dies
		else if (p2.getHealth() == 0) {
			return 1; // player 2's pokemon dies
		}

		return 0;
	}
}
