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

		JButton button1 = new JButton("Start!");
		JButton button2 = new JButton("Rules");
		button1.addActionListener(this);
		button2.addActionListener(this);
		
		p.add(button1);
		p.add(button2);
		add(p);
	}

	public void actionPerformed(ActionEvent e) {
		w.changePanel("2");
	}

}
