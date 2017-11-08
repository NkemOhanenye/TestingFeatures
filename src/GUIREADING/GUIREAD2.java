package GUIREADING;/*
 * Created by IntelliJ IDEA.
 * User: otakusenseihig
 * Date: 10/4/17
 * Time: 5:11 PM
 */

/**
 * BROKEN
 */

import javax.swing.*;
import java.io.*;

public class GUIREAD2 extends JFrame {

    private JTextArea field;
    private JPanel panel;

    public GUIREAD2() throws IOException{
        panel = new JPanel();
        setSize(500,500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        Read();
        setVisible(true);
    }
    public void Read() throws IOException{
        File file = new File("Variable.txt");

        //creates new file
        //file.createNewFile();

        //creates a FileWriter Object
        //FileWriter writer = new FileWriter(file);

        //Writes the content to the file
        //writer.write("This\n is\n an\n example\n");
        //writer.flush();
        //writer.close();

        //Creates a FileReader Object
        FileReader reader = new FileReader(file);
        char [] a = new char[50];
        reader.read(a); //reads the content to the array

        for(char c : a) {
            Character.toString(c);
            field = new JTextArea(String.valueOf(c), 10, 20);
            panel.add(field);
            add(field);
            System.out.print(c); //prints the characters one by one
        }
        reader.close();
    }

    public static void main(String args[]) throws IOException{
        new GUIREAD2();
    }
}