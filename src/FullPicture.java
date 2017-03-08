/**
 * Created by otakusenseihig on 3/4/17.
 */
import javax.swing.*;
import java.awt.*;

public class FullPicture extends JFrame{
    private JButton exitButton, button, button2, button3;
    public static void main(String args[]){new FullPicture();}
    public FullPicture() {
        JPanel panel1 = new JPanel();
        exitButton = new JButton("Exit");
        exitButton.addActionListener(e -> exitButtonClick());
        panel1.add(exitButton);
        //exitButton.setBorder(BorderFactory.createEmptyBorder());
        //exitButton.setContentAreaFilled(false);
        this.add(panel1);
        //this.setExtendedState(JFrame.MAXIMIZED_BOTH);
        this.setUndecorated(true);
        GraphicsEnvironment.getLocalGraphicsEnvironment().
                getDefaultScreenDevice().setFullScreenWindow(this);
        /** a different way of achieving full screen using the GraphicsEnviroment package
         * unlike the previous version, the program cannot be closed without the button*/
        ImageIcon closebt = new ImageIcon("/home/otakusenseihig/IdeaProjects/TestingFeatures/closebt.png");
        button3 = new JButton(closebt);
        setLayout(new FlowLayout());
        add(button3);
        button3.setBorder(BorderFactory.createEmptyBorder());
        button3.setContentAreaFilled(false);
        ImageIcon upArrow = new ImageIcon("/home/otakusenseihig/IdeaProjects/TestingFeatures/upArrow.png");
        button = new JButton(upArrow);
        setLayout(new FlowLayout());
        add(button);
        button.setBorder(BorderFactory.createEmptyBorder());
        button.setContentAreaFilled(false);
        ImageIcon downArrow = new ImageIcon("/home/otakusenseihig/IdeaProjects/TestingFeatures/downArrow.png");
        button2 = new JButton(downArrow);
        setLayout(new FlowLayout());
        add(button2);
        button2.setBorder(BorderFactory.createEmptyBorder());
        button2.setContentAreaFilled(false);
        this.setDefaultCloseOperation
                (JFrame.EXIT_ON_CLOSE);
        this.pack();
        this.getContentPane().setBackground(Color.red.darker().darker().darker());
        this.setVisible(true);
    }
    void exitButtonClick(){
        System.exit(0);
    }
}
