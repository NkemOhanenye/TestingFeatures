import javax.swing.*;

/**
 * Created by otakusenseihig on 2/17/17.
 */
//extends the class and makes one specifically for Framing
public class ShowPicture2 {
    public static void main(String args[]) {
        new MyFrame();
        //new My2ndFrame();
    }
}

class MyFrame extends JFrame{
    MyFrame(){
        ImageIcon icon = new ImageIcon("shu.jpg"); //calls the picture file
        JLabel label = new JLabel(icon); //places the icon
        add(label);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pack();
        setVisible(true);
    }
}
/*
class My2ndFrame extends JFrame{
    My2ndFrame(){
        ImageIcon icon = new ImageIcon("reh.jpg"); //calls the picture file
        JLabel label = new JLabel(icon); //places the icon
        add(label);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pack();
        setVisible(true);
    }
}
*/
/**
 * opening up more than one window is possible
 * but closing one causes the program to end
 */
