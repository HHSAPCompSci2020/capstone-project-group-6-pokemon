package menus;

import java.awt.Rectangle;

public class BattleScreen extends Screen{
	

	private int x, y;

	private DrawingSurface surface;

	private Rectangle[] actions = new Rectangle[4];
	private Rectangle[] statTag = new Rectangle[2];
	
	private Rectangle dialogue;
	
	private boolean turn = false;
	//when false, it is player 1's turn, when true it is player 2's turn
	
	public BattleScreen(DrawingSurface surface)
	{
		super(800, 600);
		this.surface = surface;
		
		//actions
		actions[0] = new Rectangle(450, 400, 150, 50);
		actions[1] = new Rectangle(450, 500, 150, 50);
		actions[2] = new Rectangle(650, 400, 150, 50);
		actions[3] = new Rectangle(650, 500, 150, 50);
		
		//stats for each pokemon
		statTag[0] = new Rectangle(50, 100, 200, 50);
		statTag[1] = new Rectangle(50, 100, 200, 50);
		
		//dialogue
		dialogue = new Rectangle(50,540,700,50);

	}
	
	public void draw()
	{
		surface.pushStyle();
		
		surface.background(255);
		surface.stroke(0);
		surface.noFill();
		
		for(int i = 0; i<actions.length; i++)
		{
			surface.rect(actions[i].x, actions[i].y, actions[i].width, actions[i].height, 10, 10, 10, 10);
		}
		
		for(int i = 0; i<statTag.length; i++)
		{
			surface.rect(statTag[i].x, statTag[i].y, statTag[i].width, statTag[i].height, 10, 10, 10, 10);
		}
		
		surface.popStyle();
	}
	
	public void mousePressed()
	{
		
	}

}
