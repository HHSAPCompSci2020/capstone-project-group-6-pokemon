import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MenuPanel extends JFrame implements ActionListener {
	private Main w;
	
	public MenuPanel(Main w) {
		this.w = w;
		JPanel p = new JPanel();

		p.setLayout(new BoxLayout(p, BoxLayout.Y_AXIS));
		p.add(Box.createVerticalStrut(300));

		// create a new buttons
		JButton b1 = new JButton("Play");
		JButton b2 = new JButton("Instructions");
		JButton b3 = new JButton("Exit");

		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);

		p.add(b1);
		p.add(b2);
		p.add(b3);
		
		add(p);
	}

	public void actionPerformed(ActionEvent e) {
		w.changePanel("2");
	}
}
