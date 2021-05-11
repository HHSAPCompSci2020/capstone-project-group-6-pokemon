import java.awt.*;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import processing.awt.PSurfaceAWT;
import processing.core.PApplet;

/**
 * 
 * @author Kelsey Shan
 *
 */
public class Main {

	public static void main(String args[]) {

		DrawingSurface drawing = new DrawingSurface();
		PApplet.runSketch(new String[]{""}, drawing);
		PSurfaceAWT surf = (PSurfaceAWT) drawing.getSurface();
		PSurfaceAWT.SmoothCanvas canvas = (PSurfaceAWT.SmoothCanvas) surf.getNative();
		JFrame window = (JFrame)canvas.getFrame();

		window.setSize(800, 600);
		window.setMinimumSize(new Dimension(100,100));
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setResizable(true);

		window.setVisible(true);
		
		
		canvas.requestFocus();
	}

}

	/*
	JPanel cardPanel;

	public Main(String title) {
		super(title);
		setBounds(100, 100, 400, 300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		cardPanel = new JPanel();
		CardLayout cl = new CardLayout();
		cardPanel.setLayout(cl);

		MenuPanel panel1 = new MenuPanel(this);
		InstructionsPanel panel2 = new InstructionsPanel(this);
		SelectPanel panel3 = new SelectPanel(this);

		cardPanel.add(panel1, "1"); // Card is named "1"
		cardPanel.add(panel2, "2"); // Card is named "2"
		cardPanel.add(panel3, "3"); // Card is named "3"


		add(cardPanel);
		//addKeyListener(panel3);

		setVisible(true);
	}

	/**
	 * This method switches between the different screens
	 * @param name the name of the next panel card
	 **/
	/*
	public void changePanel(String name) {
		((CardLayout) cardPanel.getLayout()).show(cardPanel, name);
		requestFocus();
	}

	/**
	 * This is the main method
	 * @param args
	 */
	/*
	public static void main(String[] args) {
		Main w = new Main("Pokemon Fighting");
	}
	
	*/
	

