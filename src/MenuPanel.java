import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MenuPanel extends JPanel implements ActionListener {

	private Main w;

	public MenuPanel(Main w) {
		this.w = w;
		JPanel p = new JPanel();

		p.setLayout(new BoxLayout(p, BoxLayout.Y_AXIS));
		p.add(Box.createVerticalStrut(300));

		JButton button = new JButton("Play the Game!");
		button.addActionListener(this);
		p.add(button);
		add(p);
	}

	public void actionPerformed(ActionEvent e) {
		w.changePanel("2");
	}

}
