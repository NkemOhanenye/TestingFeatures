/**
 * Created by otakusenseihig on 2/19/17.
 */
import javax.swing.*;
// HelloFrame constructor
public class HelloFrame2 extends JFrame{
    public static void main(String args[]){new HelloFrame2();}
    public HelloFrame2(){
        this.setSize(200, 100);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("Hello,World!");

        //JPanel panel = new JPanel();
        HelloPanel panel = // added instead of above
                new HelloPanel(); //added to call class HelloPanel
        this.add(panel); //adds the panel
        this.add(new HelloPanel()); //can be done alternatively
        //code to add components to the panel goes here

        this.setVisible(true);
    }
}
