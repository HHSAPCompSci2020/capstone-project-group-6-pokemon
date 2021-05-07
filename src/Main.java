import java.awt.*;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 * 
 * @author Kelsey Shan
 *
 */
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
		InstructionsPanel panel2 = new InstructionsPanel(this);
		SelectPanel panel3 = new SelectPanel(this);

		cardPanel.add(panel1, "1"); // Card is named "1"
		cardPanel.add(panel2, "2"); // Card is named "2"
		cardPanel.add(panel3, "3"); // Card is named "3"


		add(cardPanel);
		addKeyListener(panel3);

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
