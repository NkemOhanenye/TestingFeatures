/**
 * Created by Nkem Ohanenye on 2/17/17.
 */
import javax.swing.*;

public class HelloFrame extends JFrame{
    public static void main(String args[]){
        new HelloFrame();
    }
    public HelloFrame(){
        //Toolkit tk = Toolkit.getDefaultToolkit(); //adds the toolkit
        this.setSize(250, 100); //"this" is not needed
        this.setDefaultCloseOperation(
                JFrame.EXIT_ON_CLOSE); //when closing window run ends
        this.setTitle("Hello World!");
        /**Dimension d = tk.getScreenSize();
        *int x = d.width / 2;
        *int y = (d.height /2) - this.getHeight();
        *this.setLocation(x, y);
        */ //gets the screen dimensions and puts the bottom of the frame
        //at a vertical midpoint
        //this.setLocation(0, 0); // (x , y)
        //this.setLocationRelativeTo(null); //centers the window
        this.setVisible(true);
    }
}
