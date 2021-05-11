package game;

import pokemon.*;

public class Game {
	Player [] players = new Player[2]
	int turn; // 0 for player1, 1 for player2

	public Game() {
		players[0] = new Player();
		players[1] = new Player();
		turn = 0;
	}

	public void makeMove(int i) {
		players[turn].move(i);
	}

	public void changeTurn() {
		turn++;
		turn = turn % 2;
	}

	public int win() {
		Pokemon p = players[0].current;
		Pokemon p2 = players[1].current;

		if (p.getHealth() == 0)
			players[1].levelUp();
		return 2; // player 1's pokemon dies
		if (p2.getHealth() == 0) {
			players[0].levelUp();
			return 1; // player 2's pokemon dies
		}

		return 0;
	}
}
