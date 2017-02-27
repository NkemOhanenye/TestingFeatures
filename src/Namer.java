/**
 * Created by otakusenseihig on 2/24/17.
 */
import javax.swing.*;
import java.awt.event.*;
public class Namer extends JFrame{
    public static void main(String args[]){new Namer();}
    private JButton buttonOK;
    //private JTextField textName;
    private JTextField textCount;
    public Namer(){
        this.setSize(325,100);
        this.setTitle("Who Are You?");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel panel1 = new JPanel();
        panel1.add(new JLabel("Enter your name: "));
        textCount = new JTextField(15);
        //text count for numbers
        //textName = new JTextField(15);
        panel1.add(textCount);
        buttonOK = new JButton("OK");
        buttonOK.addActionListener(e -> buttonOKClick());
        panel1.add(buttonOK);
        this.add(panel1);
        this.setVisible(true);
    }
    private boolean isInt(JTextField f, String msg){
        int count = Integer.parseInt(textCount.getText());
        try{
            Integer.parseInt(f.getText());
            return true;
        }
        catch (NumberFormatException e){
            JOptionPane.showMessageDialog(f,
                    "Entry Error", msg,
                    JOptionPane.ERROR_MESSAGE);
            f.requestFocus();
            return false;
        }
    }
    public void buttonOKClick(){
        String name = textCount.getText();
        if (isInt(textCount,
                "You must enter an integer.")){
            JOptionPane.showMessageDialog(Namer.this,
                    "You entered " +
            Integer.parseInt(textCount.getText()),
                    "Your Number",
                    JOptionPane.INFORMATION_MESSAGE);
        }
        else {
            JOptionPane.showMessageDialog(
                    Namer.this,
                    "Good morning " + name,
                    "Salutations",
                    JOptionPane.INFORMATION_MESSAGE);
        }
        /*String name = textName.getText();
        if (name.length() == 0){
            JOptionPane.showMessageDialog(
                    Namer.this,
                    "You didn't enter anything!",
                    "Moron",
                    JOptionPane.INFORMATION_MESSAGE);
        }*/
        /*else {
            JOptionPane.showMessageDialog(
                    Namer.this,
                    "Good morning " + name,
                    "Salutations",
                    JOptionPane.INFORMATION_MESSAGE);
        }*/
        textCount.requestFocus();
        //textName.requestFocus();
        //move back to the text field after clicking button
    }
}
