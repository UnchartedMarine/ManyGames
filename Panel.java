import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Panel extends JPanel implements ActionListener{
	
	JButton start =new JButton("Start");
	JButton cB=new JButton("X");
	
	public Panel() {
		add(start);
		start.addActionListener(this);
		add(cB);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==start) {
			System.out.println("test");
		}
		
	}
}
