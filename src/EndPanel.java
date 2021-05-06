import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class EndPanel extends JFrame{
	// JFrame
	static JFrame f;

	// JButton
	static JButton b1, b2, b3;

	// label to display text
	static JLabel l;

	public static void mainMenu() {
		// create a new frame to store text field and button
		f = new JFrame("panel");

		// create a label to display text
		l = new JLabel("Main Menu");

		// create a new buttons
		b1 = new JButton("Fight Again");
		b2 = new JButton("Restart");
		b3 = new JButton("Exit");

		// create a panel to add buttons
		JPanel p = new JPanel();

      //  p.setLayout(new BoxLayout(p, BoxLayout.Y_AXIS));

		// add buttons and textfield to panel
        p.add(l);
		p.add(b1);
		p.add(b2);
		p.add(b3);

		// setbackground of panel
		p.setBackground(Color.white);

		// add panel to frame
		f.add(p);

		// set the size of frame
		f.setSize(800, 600);

		f.show();
	}
}
