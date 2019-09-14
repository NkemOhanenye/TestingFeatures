/**
 * Created by Nkem Ohanenye on 2/20/17.
 */
import javax.swing.*;
import java.awt.event.*; //defines the ActionEvent class

public class ClickMe
    extends JFrame implements ActionListener{
    public static void main(String args[]){new ClickMe();}
    private JButton button1;
    public ClickMe(){
        this.setSize(300,150);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("I'm Listening");
        JPanel panel1 = new JPanel();
        button1 = new JButton("Click Me!");
        //makes button say click me before clicked
        button1.addActionListener(this);
        panel1.add(button1);
        //makes button1 a panel
        this.add(panel1);
        this.setVisible(true);
    }
    private int clickCount = 0; // makes clicks start at 0
    public void actionPerformed(ActionEvent e){
        if(e.getSource()==button1){
            clickCount++; //makes sure to add after each click
            if(clickCount == 1)
                button1.setText("I've been clicked!");
            //1 clickCount gives statement
            else
                button1.setText("I've been clicked "
                        + clickCount + " times!");
            //adds click count after each click
        }
    }
}
