/**
 * Created by Nkem Ohanenye on 3/7/17.
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ButtonPress
        extends JFrame implements ActionListener{
    private JButton button;
    public JPanel panel; //makes both variables global
    public static void main(String args[]){new ButtonPress();}
    public ButtonPress(){
        this.setSize(500,500);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("CHANGE!");
        panel = new JPanel();
        button = new JButton("Click me to change");
        button.addActionListener(this);
        //makes button actionlistener
        panel.add(button);
        this.add(panel);
        this.setVisible(true);
    }
    private int clickCount = 0;
    public void actionPerformed(ActionEvent e){
        if(e.getSource()==button){
            clickCount++;
            //clicking goes up by one
            Color color;
            if (clickCount == 1){
                //after you click the button the background changes
                color = Color.red.darker().darker().darker();
                //makes color darker to not hurt the eyes
                button.setBackground(Color.blue);
                //button.repaint();
                panel.setBackground(color);
                panel.repaint();
                //repaints the background when pressing the button
                button.setText("Hi im red");
                //changes button text
              }
        }
    }
}
