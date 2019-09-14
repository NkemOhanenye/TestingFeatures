/**
 * Created by Nkem Ohanenye on 2/20/17.
 */
import javax.swing.*;
import java.awt.event.*;


public class HelloButton
        extends JFrame implements ActionListener{
    //adds JFrame and implements the event ActionListener
    private JButton button1;
    //referring to event class variable is usually private
    public static void main(String args[]){new HelloButton();}
    public HelloButton() {
        this.setSize(300, 300);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("HelloButton");
        JPanel panel = new JPanel();
        button1 = new JButton("Click Me!");
        panel.add(button1); //adds the button to a panel
        this.add(panel);
        this.setVisible(true);
        button1.addActionListener(this);
        //sets this statement to refer to the ActionListener
    }
    public void actionPerformed(ActionEvent e){
        if (e.getSource() == button1) {
            //refers the event 'e' to button1
            button1.setText("You clicked!"); //the text after clicked
        }
    }
}