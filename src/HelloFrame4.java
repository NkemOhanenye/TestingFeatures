/**
 * Created by otakusenseihig on 2/20/17.
 */
import javax.swing.*;
public class HelloFrame4 extends JFrame{
    public static void main(String args[]){new HelloFrame4();}
    public HelloFrame4(){
        this.setSize(300,150);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("Hello, World!");
        //JButton button1 = new JButton("Click me!");
        JButton button1 = new JButton();
        button1.setText("Click me!");
        this.add(button1); //required for the button to be shown
        /* This method specifies the location and size
         * of button. In method setBounds(x, y, width, height)
         * x,y) are cordinates from the top left
         * corner and remaining two arguments are the width
         * and height of the button.
         */
        button1.setBounds(50,50,200,50);
        this.setLayout(null);
        //stops placed element from overlaying the whole frame
        this.setVisible(true);
    }
}
/**
 *Required for buttons:
 * JButton (name) = new JButton("button name");
 * or
 * JButton (name) = new JButton();
 * (name).setText("button name");
 * this.add(name);
 * this.setLayout(null)
 * name.setBounds(x, y, width, height);
 */