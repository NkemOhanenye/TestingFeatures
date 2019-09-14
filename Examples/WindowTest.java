/**
 * Created by Nkem Ohanenye on 2/17/17.
 */
import javax.swing.*;
public class WindowTest {
    public static void main(String args[]){
        JFrame frame = new JFrame("This is the Title");
        frame.setSize(350, 260); //length x height
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false); //restricts resizing the window
    }
}