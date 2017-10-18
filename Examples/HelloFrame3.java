/**
 * Created by otakusenseihig on 2/20/17.
 */
import javax.swing.*;
public class HelloFrame3 extends JFrame{
    public static void main (String args[]){new HelloFrame3();}
    public HelloFrame3(){
        this.setSize(300, 150);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("Hello, World!");
        JPanel panel1 = new JPanel();
        JLabel label1 = new JLabel("Hello, World");
        panel1.add(label1);
        this.add(panel1);
        this.setVisible(true);
    }
}