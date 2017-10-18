/*
 * Created by IntelliJ IDEA.
 * User: otakusenseihig
 * Date: 10/13/17
 * Time: 10:09 AM
 */


import javax.swing.*;
import java.awt.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class CVSChanger extends JFrame{

    private JPanel panel;

    public CVSChanger() throws FileNotFoundException{

        panel = new JPanel();

        setSize(500,500);
        setTitle("CVS Changer");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        panel.setLayout(new GridLayout(1, 6));
        panel.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        add(panel);

        Scanner cvs = new Scanner(new File("test.csv"));

        while (cvs.hasNextLine()){
            String num = cvs.nextLine();
            //String[] values = num.split(",");
            System.out.println(num);
            JLabel label = new JLabel(num);
            panel.add(label);
        }
        cvs.close();
        setVisible(true);
    }
    public static void main (String args[]) throws FileNotFoundException{
        new CVSChanger();
    }
}