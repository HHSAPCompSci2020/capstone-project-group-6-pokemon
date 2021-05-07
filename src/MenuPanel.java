import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.geom.AffineTransform;

public class MenuPanel extends JPanel implements ActionListener {

	private Main w;
	public MenuPanel(Main w) {
		this.w = w;
		JPanel p = new JPanel();
		p.setLayout(new BoxLayout(p, BoxLayout.X_AXIS));
		p.add(Box.createVerticalStrut(600));

		JButton button1 = new JButton("Start!");
		JButton button2 = new JButton("Rules");
		button1.addActionListener(this);
		button2.addActionListener(this);
		p.add(button1);
		p.add(Box.createHorizontalStrut(100));
		p.add(button2);

		add(p);
	}

	public void actionPerformed(ActionEvent e) {
		w.changePanel("2");
	}

	public void paintComponent(Graphics g) {
		super.paintComponent(g); // Call JPanel's paintComponent method to paint the background

	}

}
