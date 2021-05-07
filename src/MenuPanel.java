import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.geom.AffineTransform;
/**
 * 
 * @author Kelsey Shan
 *
 */
public class MenuPanel extends JPanel implements ActionListener {

	private Main w;

	JButton button1, button2;

	public MenuPanel(Main w) {
		this.w = w;
		JPanel p = new JPanel();
		p.setLayout(new BoxLayout(p, BoxLayout.X_AXIS));
		p.add(Box.createVerticalStrut(600));

		button1 = new JButton("Start!");
		
		button1.addActionListener(this);
		
		p.add(button1);

		add(p);
	}

	public void actionPerformed(ActionEvent e) {
			w.changePanel("2"); // go to rules
	}

	public void paintComponent(Graphics g) {
		super.paintComponent(g); // Call JPanel's paintComponent method to paint the background

	}

}
