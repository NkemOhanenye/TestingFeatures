/**
 * Created by Nkem Ohanenye on 2/17/17.
 */
import javax.swing.JFrame;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
public class ShowPicture {
    public static void main (String args[]){
        JFrame frame = new JFrame(); //similar to a window
        ImageIcon icon = new ImageIcon("./Resources/shu.jpg"); //calls the picture file
        JLabel label = new JLabel (icon, JLabel.CENTER); //places the icon
        frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
        frame.add(label);
        frame.setDefaultCloseOperation
                (JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
