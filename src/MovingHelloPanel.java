import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JPanel;
import javax.swing.Timer;


public class MovingHelloPanel extends JPanel {

	public MovingHelloPanel() {
		super(true);
		setPreferredSize(new Dimension(500,450));
		setBackground(Color.RED);
		Timer t = new Timer(50,
				new ActionListener(){

					@Override
					public void actionPerformed(ActionEvent e) {
						// TODO Auto-generated method stub
						x+=2;
						if ( x > 500 ) {
							x=-95;
							y+=50;
						}
						repaint();
					}

					});
		t.start();
	}

	private int x=0;
	private int y=50;
	protected void paintComponent(Graphics g)
	{	  
		super.paintComponent(g);
		// draw the background of the display panel
		setForeground(Color.WHITE);
		// move word
		g.setFont(new Font("courier",1,32));
		g.drawString("Hello", x, y);
	}
	
}
