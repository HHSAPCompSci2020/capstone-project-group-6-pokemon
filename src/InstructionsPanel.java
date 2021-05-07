
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
public class InstructionsPanel extends JPanel implements ActionListener {

	private Main w;

	JButton button1;
	String message = "Instructions: \nAdd rules";

	public InstructionsPanel(Main w) {
		this.w = w;
		JPanel p = new JPanel();
		p.setLayout(new BoxLayout(p, BoxLayout.X_AXIS));
		p.add(Box.createVerticalStrut(100));

		button1 = new JButton("Play");

		button1.addActionListener(this);

		p.add(button1);

		add(p);
	}

	public void actionPerformed(ActionEvent e) {
		w.changePanel("3");
	}

	public void paintComponent(Graphics g) {
		super.paintComponent(g); // Call JPanel's paintComponent method to paint the background

		Graphics2D g2 = (Graphics2D) g;

		int width = getWidth();
		int height = getHeight();

		double ratioX = (double) width / 800.0;
		double ratioY = (double) height / 600.0;

		AffineTransform at = g2.getTransform();
		g2.scale(ratioX, ratioY);

		g.setColor(Color.BLACK);
		g.setFont(new Font("SansSerif", Font.BOLD, 15));
		int strWidth = g.getFontMetrics().stringWidth(message);
		g.drawString(message, 400 - strWidth / 2, 300);

		g2.setTransform(at);

	}
}
