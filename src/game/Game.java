package game;

import pokemon.*;

public class Game {
	private Pokemon p1, p2;
	private int turn; // 0 for player1, 1 for player2

	public Game(Pokemon p1, Pokemon p2) {
		this.p1 = p1;
		this.p2 = p2;
		turn = 0;
	}

	public void setP1(Pokemon p) {
		p1 = p;
	}

	public void setP2(Pokemon p) {
		p2 = p;
	}
	
	public void move() {
		
		
		
		if (p1.getSpeedBase()> p2.getSpeedBase()) {
			p2.addHealth(p1.move(1)*-1); 
		}
		else  {
			p1.addHealth(p2.move(1)*-1); 
		}
		
		win();
		
	}

	

	public void changeTurn() {
		
		if (turn % 2 == 0) {
			turn = 1;
		}
		turn++;
		
	}
	
	public Pokemon getp1()
	{
		return p1;
	}
	
	public Pokemon getp2()
	{
		return p2;
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
