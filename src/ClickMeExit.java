/**
 * Created by otakusenseihig on 2/24/17.
 */
import javax.swing.*;
import java.awt.event.*;
public class ClickMeExit extends JFrame{
    public static void main(String args[]){new ClickMeExit();}
    private JButton button1, exitButton;
    private int clickCount = 0;
    public ClickMeExit(){
        this.setSize(275, 100);
        this.setTitle("I'm Listening");
        this.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        JPanel panel1 = new JPanel();
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                exitButton.doClick();
            }
        });
        button1 = new JButton("Click Me!");
        button1.addActionListener(e -> button1Click());
        panel1.add(button1);
        exitButton = new JButton("Exit");
        exitButton.addActionListener(e -> exitButtonClick());
        panel1.add(exitButton);
        this.add(panel1);
        this.setVisible(true);
    }
    public void button1Click(){
        clickCount++;
        if (clickCount ==1)
            button1.setText("I've ben clicked!");
        else
            button1.setText("I've been clicked "
                + clickCount + " times!");
    }
    public void exitButtonClick(){
        if (clickCount > 0)
            System.exit(0);
        else{
            JOptionPane.showMessageDialog(
                    ClickMeExit.this,
                    "You must click at least once!",
                    "Not so fast, buddy",
                    JOptionPane.ERROR_MESSAGE);
        }
    }
}
