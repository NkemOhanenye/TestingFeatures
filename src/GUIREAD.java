/*
 * Created by IntelliJ IDEA.
 * User: otakusenseihig
 * Date: 9/29/17
 * Time: 3:14 PM
 */

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;
import java.util.*;

public class GUIREAD extends JFrame{

    private JPanel panel;
    private JButton exit;
    private JTextArea field;
    private String code = new String();

    GUIREAD() throws FileNotFoundException{ //thrown incase File is not found

        //Writes and reads the text file and loops the line
        // to read the text as a string
        //PrintStream txtCreate = new PrintStream("Variable.txt");
        Scanner txtFile = new Scanner(new File("Variable.txt"));
        while (txtFile.hasNextLine()){
            code += (txtFile.nextLine());
        }

        Font font = new Font("",Font.BOLD, 20);

        this.setSize(500,500);
        this.setLocationRelativeTo(null); //places frame in the middle of the screen
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        panel = new JPanel();

        //reads the string variable and sets the size of the field (h*w)
        field = new JTextArea(code, 10,20);
        field.setBorder(BorderFactory.createLineBorder(Color.BLACK));

        exit = new JButton("X");
        exit.addActionListener(new ButtonAction());
        exit.setFont(font);

        panel.add(exit);
        panel.add(field);
        this.add(panel);

        //txtCreate.close(); //closes the file when code is closed
        txtFile.close(); //closes the file when code is closed
        setVisible(true);

    }
    public class ButtonAction implements ActionListener{
        public void actionPerformed(ActionEvent actionEvent) {
            System.exit(0);
        }
    }
    public static void main(String args[])
            throws FileNotFoundException{ //needed for Constructor to read the code
        new GUIREAD();
    }
}