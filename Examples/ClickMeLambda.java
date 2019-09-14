import javax.swing.*;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

/**
 * Created by Nkem Ohanenye on 2/23/17.
 */
public class ClickMeLambda extends JFrame{
    public static void main(String args[]){new ClickMeLambda();}
    //private JButton button1;
    private JButton button1, exitButton;
    //creates 2 buttons
    public ClickMeLambda(){
        this.setSize(300,150);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        //the window frame close button wont work
        this.setTitle("I'm Listening");
        JPanel panel1 = new JPanel();
        button1 = new JButton("Click Me!");
        exitButton = new JButton("Exit");
        exitButton.addActionListener(e -> exitButtonClick());
        panel1.add(exitButton);
        //button1.addActionListener(e -> button1Click());
        button1.addActionListener(e ->{
            clickCount++;
            if (clickCount ==1)
                button1.setText("I've been clicked!");
            else
                button1.setText("I've been clicked "
                    + clickCount + " times!");
                });
        //calls the method button1Click whenever the button is clicked
        panel1.add(button1);
        this.add(panel1);
        this.setVisible(true);
    }
    private int clickCount = 0; //declared as a class field
    /*public void button1Click(){
        clickCount++;
        if (clickCount == 1)
            button1.setText("I've been clicked!");
        else
            button1.setText("I've been clicked "
                + clickCount + " times!");
    }*/
    public void exitButtonClick(){
        if (clickCount > 0)
            System.exit(0);
        //used to end program
        else{
            JOptionPane.showMessageDialog(
                    ClickMeLambda.this,
                    "You must click at least once!",
                    //text
                    "Not so fast, buddy",
                    //title
                    JOptionPane.ERROR_MESSAGE);
        }
    }
}

