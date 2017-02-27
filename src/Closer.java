import javax.swing.*;
import java.awt.event.*;


/**
 * Created by otakusenseihig on 2/24/17.
 */
public class Closer extends JFrame implements WindowListener {
    public void windowClosing(WindowEvent e){exitButton.doClick();}
    public void windowActivated(WindowEvent e){}
    public void windowClosed(WindowEvent e){}
    public void windowDeactivated(WindowEvent e){}
    public void windowDeiconified(WindowEvent e){}
    public void windowIconified(WindowEvent e){}
    public void windowOpened(WindowEvent e){}
    private JButton button1, exitButton;
    public static void main(String args[]){new Closer();}
    public Closer(){
        JFrame frame = new JFrame();
        frame.setSize(300, 150);
        frame.setTitle("I'm Listening!");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        JPanel panel1 = new JPanel();
        button1 = new JButton("Click Me!");
        exitButton = new JButton("Exit");
        exitButton.addActionListener(e -> exitButtonClick());
        panel1.add(exitButton);
        button1.addActionListener(e ->{
            clickCount++;
            if (clickCount ==1)
                button1.setText("I've been clicked!");
            else
                button1.setText("I've been clicked "
                        + clickCount + " times!");
        });
        panel1.add(button1);
        frame.add(panel1);
        frame.setVisible(true);
    }
    private int clickCount = 0;
    public void exitButtonClick(){
        if (clickCount > 0)
            System.exit(0);
        else {
            //this.addWindowListener(new Closer());
            JOptionPane.showMessageDialog(
                    Closer.this,
                    "You must click at least once!",
                    //text
                    "Not so fast, buddy",
                    //title
                    JOptionPane.ERROR_MESSAGE);

        }
    }
}
