package BASICCODE;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FrameColorChanger extends JFrame implements ActionListener {
    private JButton button;
    private JPanel panel;
    private int clickCount = 0;

    public FrameColorChanger() {
        button = new JButton("Click to change color");
        panel = new JPanel();
        setSize(500, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setTitle("Hello World");
        panel.add(button);
        panel.setBackground(Color.pink);
        add(panel);
        button.addActionListener(this);

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
                button.setText("ProjectTests.RestartButton");
            }
            if (clickCount == 6) {
                dispose();
                new FrameColorChanger();
            }
        }
    }

    public static void main(String args[]) {
        new FrameColorChanger();
    }
}