import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class EndPanel extends JFrame implements ActionListener {
	Main w;
	// JFrame
	static JFrame f;

	// JButton
	static JButton b1, b2, b3;

	// label to display text
	static JLabel l;

	public EndPanel(Main w) {
		this.w = w;
		JPanel p = new JPanel();

		p.setLayout(new BoxLayout(p, BoxLayout.Y_AXIS));
		p.add(Box.createVerticalStrut(300));

		// create a new buttons
		b1 = new JButton("Restart");
		b2 = new JButton("Exit");
		b3 = new JButton("Fight Again");

		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);

		p.add(b1);
		p.add(b2);
		p.add(b3);
		add(p);
	}

	public void actionPerformed(ActionEvent e) {
		w.changePanel("1");
	}
}
