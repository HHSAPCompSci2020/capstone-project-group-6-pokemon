package menus;

import java.awt.Point;
import java.awt.Rectangle;

import game.*;
import processing.core.PImage;

public class BattleScreen extends Screen{
	

	private Game game;

	private DrawingSurface surface;

	private Rectangle[] actions = new Rectangle[4];
	private Rectangle[] stats = new Rectangle[2];
	
	private boolean[] clickState = new boolean[4];
	
	private Rectangle dialogue;
	private Rectangle health1;
	private Rectangle health2;
	
	private String[] actionLabels;
	private String dialogueText;
	
	private PImage image;
	
	private boolean turn = false;
	//when false, it is player 1's turn, when true it is player 2's turn
	
	public BattleScreen(DrawingSurface surface, Game game)
	{
		super(800, 600);
		this.game = game;
		this.surface = surface;
		//actions
		actions[0] = new Rectangle(430, 400, 170, 50); //top left
		actions[1] = new Rectangle(430, 470, 170, 50); //bottom left
		actions[2] = new Rectangle(610, 400, 170, 50); //top right
		actions[3] = new Rectangle(610, 470, 170, 50); //bottom right
		for(int i = 0; i<clickState.length; i++)
		{
			clickState[i] = false;
		}
		
		//stats for each pokemon
		stats[0] = new Rectangle(20, 400, 350, 120);
		stats[1] = new Rectangle(350, 100, 350, 75);
		health2 = new Rectangle(370,120,200,10);
		health1 = new Rectangle(40,420,200,10);
		
		//dialogue
		dialogue = new Rectangle(50,540,700,50);
		
		//text
		actionLabels = new String[4];
		for(int i = 0; i<actionLabels.length; i++)
		{
			actionLabels[i] = "action";
		}

	}
	
	public void draw()
	{
		surface.pushStyle();
		
		surface.background(255);
		surface.stroke(0);
		surface.noFill();
		
		//adding shapes
		for(int i = 0; i<actions.length; i++)
		{
			if(clickState[i])
			{
				surface.fill(100);
			}
			surface.rect(actions[i].x, actions[i].y, actions[i].width, actions[i].height, 10, 10, 10, 10);
			surface.noFill();
		}
		
		for(int i = 0; i<stats.length; i++)
		{
			surface.rect(stats[i].x, stats[i].y, stats[i].width, stats[i].height, 10, 10, 10, 10);
		}
		
		surface.rect(dialogue.x, dialogue.y, dialogue.width, dialogue.height, 10, 10, 10, 10);
		
		//adding health bars
		surface.fill(255, 0, 0);
		surface.rect(health1.x, health1.y, health1.width, health1.height);
		surface.rect(health2.x, health2.y, health2.width, health2.height);
		
		surface.fill(0);

		
		//adding text
		
		//action button labels
		for (int i = 0; i < actions.length; i++) {
			float w = surface.textWidth(actionLabels[i]);
			surface.text(actionLabels[i], 
							actions[i].x + actions[i].width / 2 - w / 2, 
							actions[i].y + actions[i].height / 2);

		}
		
		//dialogue box text
		dialogueText = "dialogue";
		float dialogueTextWidth = surface.textWidth(dialogueText);
		surface.text(dialogueText, dialogue.x + dialogue.width / 2 - dialogueTextWidth / 2, dialogue.y + dialogue.height / 2);
		
		//stats
		surface.text("HP: ", health1.x+health1.width+20, health1.y);
		surface.text("100/100" /*game.getp1().getHealth()*/, health1.x+health1.width+50, health1.y);
		
		surface.text("HP: ", health2.x+health2.width+20, health2.y);
		surface.text("100/100" /*game.getp2().getHealth()*/, health2.x+health2.width+50, health2.y);
		
		surface.text("Other stats to be added", health1.x, health1.y+30);
		surface.text("Other stats to be added", health2.x, health2.y+30);
		
		surface.PImage();
		
		
		surface.popStyle();
	}
	
	public void mousePressed()
	{
		Point p = surface.actualCoordinatesToAssumed(new Point(surface.mouseX, surface.mouseY));
		
		for(int i = 0; i<clickState.length; i++)
		{
			if(actions[i].contains(p))
			{
				clickState[i] = !clickState[i];
			}
		}
	}

}
