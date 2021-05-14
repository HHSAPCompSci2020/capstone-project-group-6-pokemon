package menus;

import java.awt.Point;
import java.awt.Rectangle;
import java.util.ArrayList;

import game.*;
import pokemon.*;

/**
 * This represents a PApplet screen that is the game screen is.
 * 
 * @author Isa Pudiyapura
 *
 */
public class BattleScreen extends Screen {

	private Game game;

	private DrawingSurface surface;

	private Rectangle[] actions = new Rectangle[3];
	private Rectangle[] stats = new Rectangle[2];

	private boolean[] clickState = new boolean[3];

	private Rectangle dialogue;
	private Rectangle health1;
	private Rectangle health2;

	private String[] actionLabels;
	private String dialogueText;

	// when false, it is player 1's turn, when true it is player 2's turn
	/**
	 * Constructs a screen with the given game on the provided PApplet surface
	 * 
	 * @param surface the surface the screen will be drawn on
	 * @param game    the that is going to be played
	 */
	public BattleScreen(DrawingSurface surface, Game game) {
		super(800, 600);
		this.game = game;
		this.surface = surface;
		// actions
		actions[0] = new Rectangle(430, 400, 170, 50); // top left
		actions[1] = new Rectangle(430, 470, 170, 50); // bottom left
		actions[2] = new Rectangle(610, 400, 170, 50); // top right
		// actions[3] = new Rectangle(610, 470, 170, 50); //bottom right
		for (int i = 0; i < clickState.length; i++) {
			clickState[i] = false;
		}

		// stats for each pokemon
		stats[0] = new Rectangle(20, 400, 350, 120);
		stats[1] = new Rectangle(430, 100, 350, 75);
		health2 = new Rectangle(450, 120, 200, 10);
		health1 = new Rectangle(40, 420, 200, 10);

		// dialogue
		dialogue = new Rectangle(50, 540, 700, 50);

		// text
		actionLabels = new String[3];
		actionLabels[0] = "Attack -15";
		actionLabels[1] = "Heal 10";
		actionLabels[2] = "Random Attack Chance";

	}

	/**
	 * This draws the screen on the PApplet surface
	 */
	public void draw() {
		surface.pushStyle();

		surface.background(255);
		surface.stroke(0);
		surface.noFill();

		// adding shapes
		surface.fill(82, 168, 72);
		surface.rect(0, 300, 800, 300);

		surface.fill(212, 238, 252);
		surface.rect(0, 0, 800, 300);
		for (int i = 0; i < actions.length; i++) {
			if (clickState[i]) {
				surface.fill(100);
			} else
				surface.fill(255);
			surface.rect(actions[i].x, actions[i].y, actions[i].width, actions[i].height, 10, 10, 10, 10);
		}

		for (int i = 0; i < stats.length; i++) {
			surface.rect(stats[i].x, stats[i].y, stats[i].width, stats[i].height, 10, 10, 10, 10);
		}

		surface.rect(dialogue.x, dialogue.y, dialogue.width, dialogue.height, 10, 10, 10, 10);
		health1.width = game.getp1().getHealth() * 2;
		health2.width = game.getp2().getHealth() * 2;
		// adding health bars
		surface.fill(255, 0, 0);
		surface.rect(health1.x, health1.y, health1.width, health1.height);
		surface.rect(health2.x, health2.y, health2.width, health2.height);

		surface.fill(0);

		// adding text

		// action button labels
		for (int i = 0; i < actions.length; i++) {
			float w = surface.textWidth(actionLabels[i]);
			surface.text(actionLabels[i], actions[i].x + actions[i].width / 2 - w / 2,
					actions[i].y + actions[i].height / 2);

		}

		// dialogue box text
		dialogueText = "Player " + game.getTurn() + " select a move";
		float dialogueTextWidth = surface.textWidth(dialogueText);
		surface.text(dialogueText, dialogue.x + dialogue.width / 2 - dialogueTextWidth / 2,
				dialogue.y + dialogue.height / 2);

		// stats
		surface.text("HP: ", health1.x + health1.width + 20, health1.y);
		surface.text(game.getp1().getHealth(), health1.x + health1.width + 50, health1.y);

		surface.text("HP: ", health2.x + health2.width + 20, health2.y);
		surface.text(game.getp2().getHealth(), health2.x + health2.width + 50, health2.y);

		surface.text("Player 1", health1.x, health1.y + 30);
		surface.text("Player 2", health2.x, health2.y + 30);

		surface.image(surface.loadImage("pikachu.png"), health1.x, health2.y + 70, 150, 180);

		surface.image(surface.loadImage("charmander.png"), health2.x + 200, health2.y + 70, 150, 180);

		surface.popStyle();

		if (game.win() == 1 || game.win() == 2) {
			game.getp1().setHealth(100);
			game.getp2().setHealth(100);
			game.setTurn(0);
			surface.switchScreen(ScreenSwitcher.SCREEN5);
		}
	}

	/**
	 * This changes with screens and buttons when the mouse is pressed
	 */
	public void mousePressed() {
		Point p = surface.actualCoordinatesToAssumed(new Point(surface.mouseX, surface.mouseY));
		ArrayList<Integer> moveToUse = new ArrayList<Integer>();
		for (int i = 0; i < clickState.length; i++) {
			clickState[i] = false;
			if (actions[i].contains(p)) {
				clickState[i] = !clickState[i];
                if (game.getTurn()==1) {
                	
                	if(moveToUse.size()>=2) {
                		game.move(moveToUse);
                		moveToUse.remove(0);
                		moveToUse.remove(0);
                	}
                	
                	else
                		moveToUse.add(i);
                }
				if (i == 0) {
					if (game.getTurn() != 1)
						game.getp2().addHealth(-10);
					else
						game.getp1().addHealth(-10);

				} else if (i == 1) {
					if (game.getTurn() != 1)
						game.getp1().addHealth(10);
					else
						game.getp2().addHealth(10);

				} else if (i == 2) {
					if (game.getTurn() != 1)
						game.getp2().addHealth((int) (-Math.random() * 25));
					else
						game.getp1().addHealth((int) (-Math.random() * 25));

				}
				game.changeTurn();
				
				for (int j = 0; j < clickState.length; j++) {
					clickState[i] = false;
				}
				break;
			}
		}

	}

}
