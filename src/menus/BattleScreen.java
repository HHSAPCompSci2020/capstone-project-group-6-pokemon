package menus;

import java.awt.Point;
import java.awt.Rectangle;
import java.util.ArrayList;

import processing.core.PApplet;
import processing.core.PConstants;
import processing.sound.SoundFile;

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

	private Rectangle soundToggle;
	private String[] soundFileNames;
	private SoundFile[] sounds;
	private String soundText;
	private int loadIndex;
	private int currentPlaying;

	private Rectangle[] actions = new Rectangle[3];
	private Rectangle[] stats = new Rectangle[2];

	private boolean[] clickState = new boolean[3];

	private Rectangle dialogue;
	private Rectangle health1;
	private Rectangle health2;
	private EndScreen screen;
	private String[] actionLabels;
	private String dialogueText;
	private String player1 = "";
	private String player2 = "";

	// when false, it is player 1's turn, when true it is player 2's turn
	/**
	 * Constructs a screen with the given game on the provided PApplet surface
	 * 
	 * @param surface the surface the screen will be drawn on
	 * @param screen  the screen that will appear after the game is won
	 */
	public BattleScreen(DrawingSurface surface, EndScreen screen) {
		super(800, 600);
		game = new Game(new Pokemon(), new Pokemon());
		this.surface = surface;
		this.screen = screen;
		// actions
		actions[0] = new Rectangle(430, 400, 170, 50); // top left
		actions[1] = new Rectangle(430, 470, 170, 50); // bottom left
		actions[2] = new Rectangle(610, 400, 170, 50); // top right
		// actions[3] = new Rectangle(610, 470, 170, 50); //bottom right
		for (int i = 0; i < clickState.length; i++) {
			clickState[i] = false;
		}

		// stats for each pokemon
		stats[0] = new Rectangle(20, 400, 350, 75);
		stats[1] = new Rectangle(430, 100, 350, 75);
		health2 = new Rectangle(450, 120, 200, 10);
		health1 = new Rectangle(40, 420, 200, 10);

		// dialogue
		dialogue = new Rectangle(50, 540, 700, 50);

		// text
		actionLabels = new String[3];

		// music
		soundFileNames = new String[] { "audio/music.mp3" };
		sounds = new SoundFile[soundFileNames.length];
		soundToggle = new Rectangle(10, 10, 60, 50);
		soundText = "no music";
		loadIndex = 0;
		currentPlaying = -1;

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

		surface.rect(soundToggle.x, soundToggle.y, soundToggle.width, soundToggle.height, 10, 10, 10, 10);

		surface.rect(dialogue.x, dialogue.y, dialogue.width, dialogue.height, 10, 10, 10, 10);
		health1.width = game.getp1().getHealth() * 2;
		health2.width = game.getp2().getHealth() * 2;
		// adding health bars
		surface.fill(255, 0, 0);
		surface.rect(health1.x, health1.y, health1.width, health1.height);
		surface.rect(health2.x, health2.y, health2.width, health2.height);
		surface.fill(0);

		// adding text
		float j = surface.textWidth(soundText);
		surface.text(soundText, soundToggle.x + soundToggle.width / 2 - j / 2, soundToggle.y + soundToggle.height / 2);

		// action button labels
		for (int i = 0; i < actions.length; i++) {
			String str = "";
			if (game.getTurn() == 1)
				str = game.getp1().getMoveName(i);
			else
				str = game.getp2().getMoveName(i);
			float w = surface.textWidth(str);
			surface.text(str, actions[i].x + actions[i].width / 2 - w / 2, actions[i].y + actions[i].height / 2);

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

		// player 1

		if (game.getp1() instanceof Pikachu) {
			player1 = "pikachu";
		} else if (game.getp1() instanceof Charmander) {
			player1 = "charmander";
		} else if (game.getp1() instanceof JigglyPuff) {
			player1 = "jigglypuff";
		} else if (game.getp1() instanceof Bulbasaur) {
			player1 = "bulbasaur";
		} else {
			player1 = "squirtle";
		}
		surface.image(surface.loadImage("images/" + player1 + ".png"), health1.x, health2.y + 70, 150, 180);

		// player 2
		if (game.getp2() instanceof Pikachu) {
			player2 = "pikachu";
		} else if (game.getp2() instanceof Charmander) {
			player2 = "charmander";
		} else if (game.getp2() instanceof JigglyPuff) {
			player2 = "jigglypuff";
		} else if (game.getp2() instanceof Bulbasaur) {
			player2 = "bulbasaur";
		} else {
			player2 = "squirtle";
		}
		surface.image(surface.loadImage("images/" + player2 + ".png"), health2.x + 160, health2.y + 70, 150, 180);

		surface.popStyle();
		// reset if win
		if (game.win() == 1 || game.win() == 2) {
			screen.setWinner(game.win());
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
		if (soundToggle.contains(p) && loadIndex >= sounds.length) {
			if (currentPlaying >= 0) {
				sounds[currentPlaying].stop();
				soundText = "no music";
				currentPlaying = -1;
			} else {
				sounds[0].cue(0);
				sounds[0].play();
				currentPlaying = 0;
				soundText = "music";
			}

		}
		ArrayList<Integer> moveToUse = new ArrayList<Integer>();
		for (int i = 0; i < clickState.length; i++) {
			clickState[i] = false;
			if (actions[i].contains(p)) {
				clickState[i] = !clickState[i];
				game.move(i);
				game.changeTurn();

				for (int j = 0; j < clickState.length; j++) {
					clickState[i] = false;
				}
				break;
			}
		}
	}

	/**
	 * This gets the game of that will be displayed on the battle screen
	 * 
	 * @return the game
	 */
	public Game getGame() {
		return game;
	}

	public void loadNextSong() {
		for (loadIndex = 0; loadIndex < soundFileNames.length; loadIndex++) {
			sounds[loadIndex] = new SoundFile(this, soundFileNames[loadIndex]);
		}
	}
}
