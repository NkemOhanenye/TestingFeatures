/*
 * Created by IntelliJ IDEA.
 * User: Nkem Ohanenye
 * Date: 11/29/17
 * Time: 5:15 PM
 */
package BASICCODE;

import javax.swing.*;

public class InputPaneTest {

    public static void main(String args[]){

        Object[] options1 = { "Try This Number", "Choose A Random Number", "Quit" };

        JPanel panel = new JPanel();
        panel.add(new JLabel("Enter number between 0 and 1000"));
        JTextField textField = new JTextField(10);
        panel.add(textField);

        int result = JOptionPane.showOptionDialog(null,
                panel,
                "Enter a Number",
                JOptionPane.YES_NO_CANCEL_OPTION,
                JOptionPane.PLAIN_MESSAGE,
                null,
                options1,
                null);
        if (result == JOptionPane.YES_OPTION) {
            JOptionPane.showMessageDialog(null, textField.getText());
        }

        //JOptionPane.showInputDialog(null,"This is an Input Dailog using JOptionPane.");

        /*int g = -1;
        while(g < 0) {
            String input = JOptionPane.showInputDialog("Please enter your name.");
            if (input.length() > 0) {
                g++;
                System.out.println("Thank You");
            }else
                System.out.println("Enter your name!");
        }*/
    }
}