/**
 * Created by otakusenseihig on 2/22/17.
 */
import javax.swing.*;
import java.awt.event.*;
public class ClickMeInner extends JFrame{
    public static void main(String args[]){new ClickMeInner();}
    private JButton button1;
    public ClickMeInner(){
        this.setSize(300,150);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("I'm Listening");
        ClickListener cl = new ClickListener();
        //defined as Inner because it is in the middle of the class
        //creates ClickListener and assigns variable cl
        JPanel panel1 = new JPanel();
        button1 = new JButton("Click Me!");
        button1.addActionListener(cl);
        //could have coded
        // button1.addActionListener(new ClickListener());
        panel1.add(button1);
        this.add(panel1);
        this.setVisible(true);
    }
    private class ClickListener
            implements ActionListener{
        //extends JFrame and implements ActionListener
        private int clickCount = 0;
        public void actionPerformed(ActionEvent e){
            if (e.getSource() == button1){
                clickCount++;
                if (clickCount == 1)
                    button1.setText("I've been clicked!");
                else
                    button1.setText("I've been clicked "
                    + clickCount + " times");
            }
        }
    }
}
