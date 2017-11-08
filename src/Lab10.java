import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.Timer;

public class Lab10 extends JFrame {

	public Lab10() {
		
		setSize(500,500);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JPanel p1 = new JPanel();
		add(p1);
		p1.add(new MovingHelloPanel());	
		setVisible(true);
	}

	public static void main(String[] args) {
		new Lab10();
	}

}
