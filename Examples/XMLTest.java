/**
 * Created by Nkem Ohanenye on 2/17/17.
 */
import java.awt.*;
import javax.swing.*;
public class XMLTest {
    public static void main(String args[]){
        JFrame frame = new JFrame();
        frame.setLayout (new GridLayout(4,2));
        //sets the layout (rows, columns)

        JLabel labels[] = //the contents of the grid
                {new JLabel ("Name"), new JLabel("Phone"),
                new JLabel("Alice"), new JLabel("555-1234"),
                new JLabel("Bob"), new JLabel("555-4321"),
                new JLabel("Carol"), new JLabel("555-3000") };
        frame.add(labels[0]);
        frame.add(labels[1]);

        JLabel boldLabel = new JLabel("Name"); //makes title bold
        Font boldFont = boldLabel.getFont(); //changeable font (bol)
        Font plainFont = new Font(boldFont.getName(), //change font type
                Font.PLAIN, boldFont.getSize());
        for (int i = 2; i < 8; i++){
            labels[i].setFont(plainFont);
            frame.add(labels[i]);
        }

        frame.pack();
        frame.setVisible(true); //makes visible
    }
}
