import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.JFrame;

public class Window extends JFrame{
	
	private static final long serialVersionUID = 1L;

	public Window(String Titre) {
		super(Titre);
		Panel content=new Panel();
		setContentPane(content);
		content.setBackground(new Color(140,50,150));
		content.setLayout(new GridLayout(3,3,50,50));
		setSize(1000,1000);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setResizable(false);
		setLocationRelativeTo(null);
		setVisible(true);
	}
}
