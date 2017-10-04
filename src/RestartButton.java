/*
 * Created by IntelliJ IDEA.
 * User: otakusenseihig
 * Date: 10/2/17
 * Time: 9:25 AM
 */

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class RestartButton extends JFrame implements ActionListener {
    private JButton button;
    private JButton exit;
    private JPanel panel;
    private int clickCount = 0;

    public RestartButton() {
        button = new JButton("Click to change color");
        exit = new JButton("Exit?");
        panel = new JPanel();
        setSize(500, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setTitle("Hello World");
        panel.add(button);
        panel.setBackground(Color.pink);
        add(panel);
        button.addActionListener(this);
        exit.addActionListener(this);

        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == button) {
            clickCount++;
            if (clickCount == 1)
                panel.setBackground(Color.red);
            if (clickCount == 2)
                panel.setBackground(Color.blue);
            if (clickCount == 3)
                panel.setBackground(Color.black);
            if (clickCount == 4)
                panel.setBackground(Color.yellow);
            if (clickCount == 5) {
                panel.setBackground(Color.green);
                button.setText("RestartButton");
            }
            if (clickCount == 6) {
                restart();
            }
        }
        if (e.getSource() == exit){
            System.exit(0);
        }
    }

    public void restart(){
        //stop(); // if necessary
        setup(); // set everything to initial state
        start(); // start game
    }
    /*public void stop(){
        // stop any timers, threads, operations etc.
    }*/
    public void setup(){
        // set to initial state
        // something like recreate the button
        // clear everything done
        panel.setVisible(false);
    }
    public void start(){
        // code to initiate the program
        button = new JButton("Click to change color");
        panel = new JPanel();
        panel.add(button);
        panel.setBackground(Color.pink);
        add(panel);
        button.addActionListener(this);
    }

    public static void main(String args[]) {
        new FrameColorChanger();
    }
}