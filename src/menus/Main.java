package menus;

import java.awt.*;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import processing.awt.PSurfaceAWT;
import processing.core.PApplet;

/**
 * This is the class that contains the main method.
 * 
 * @author Kelsey Shan
 * 
 */
public class Main {

	/**
	 * This is the main method that runs the program.
	 * 
	 * @param args that argument of the main
	 */
	public static void main(String[] args) {

		DrawingSurface drawing = new DrawingSurface();
		PApplet.runSketch(new String[] { "" }, drawing);
		PSurfaceAWT surf = (PSurfaceAWT) drawing.getSurface();
		PSurfaceAWT.SmoothCanvas canvas = (PSurfaceAWT.SmoothCanvas) surf.getNative();
		JFrame window = (JFrame) canvas.getFrame();

		window.setSize(800, 600);
		window.setMinimumSize(new Dimension(100, 100));
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setResizable(true);

		window.setVisible(true);

		canvas.requestFocus();
	}

}
