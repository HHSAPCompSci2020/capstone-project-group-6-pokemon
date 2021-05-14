package menus;

import java.awt.Rectangle;

import game.*;

public class BattleScreen extends Screen{
	

	private Game game;

	private DrawingSurface surface;

	private Rectangle[] actions = new Rectangle[4];
	private Rectangle[] statTag = new Rectangle[2];
	
	private Rectangle dialogue;
	
	private String[] actionLabels;
	
	private boolean turn = false;
	//when false, it is player 1's turn, when true it is player 2's turn
	
	public BattleScreen(DrawingSurface surface)
	{
		super(800, 600);
		game = new Game(null, null);
		this.surface = surface;
		
		//actions
		actions[0] = new Rectangle(430, 400, 170, 50); //top left
		actions[1] = new Rectangle(430, 470, 170, 50); //bottom left
		actions[2] = new Rectangle(610, 400, 170, 50); //top right
		actions[3] = new Rectangle(610, 470, 170, 50); //bottom right
		
		//stats for each pokemon
		statTag[0] = new Rectangle(20, 400, 350, 120);
		statTag[1] = new Rectangle(350, 100, 350, 75);
		
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
			surface.rect(actions[i].x, actions[i].y, actions[i].width, actions[i].height, 10, 10, 10, 10);
		}
		
		for(int i = 0; i<statTag.length; i++)
		{
			surface.rect(statTag[i].x, statTag[i].y, statTag[i].width, statTag[i].height, 10, 10, 10, 10);
		}
		
		surface.rect(dialogue.x, dialogue.y, dialogue.width, dialogue.height, 10, 10, 10, 10);
		
		surface.fill(0);

		//adding text
		for (int i = 0; i < actions.length; i++) {
			float w = surface.textWidth(actionLabels[i]);
			surface.text(actionLabels[i], actions[i].x + actions[i].width / 2 - w / 2, actions[i].y + actions[i].height / 2);

		}
		
		surface.popStyle();
	}
	
	public void mousePressed()
	{
		
	}

}
