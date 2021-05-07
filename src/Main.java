import java.awt.*;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Main extends JFrame {
	JPanel cardPanel;

	public Main(String title) {
		super(title);
		setBounds(100, 100, 800, 600);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		cardPanel = new JPanel();
		CardLayout cl = new CardLayout();
		cardPanel.setLayout(cl);

		MenuPanel panel1 = new MenuPanel(this);
		EndPanel panel2 = new EndPanel(this);

		cardPanel.add(panel1, "1"); // Card is named "1"
		cardPanel.add(panel2, "2"); // Card is named "2"

		add(cardPanel);
		addKeyListener(panel2);

		setVisible(true);
	}

	public void changePanel(String name) {
		((CardLayout) cardPanel.getLayout()).show(cardPanel, name);
		requestFocus();
	}

	public static void main(String[] args) {
		Main w = new Main("Pokemon Fighting");
	}
}
