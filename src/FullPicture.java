/**
 * Created by otakusenseihig on 3/4/17.
 */
import javax.swing.*;
import java.awt.*;

public class FullPicture extends JFrame{
    private JButton exitButton, upArrow, downArrow, closebt;
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
        this.setUndecorated(true); //enables fullscreen without window bar
        GraphicsEnvironment.getLocalGraphicsEnvironment().
                getDefaultScreenDevice().setFullScreenWindow(this); //enables full screen without taskbar
        /** a different way of achieving full screen using the GraphicsEnviroment package
         * unlike the previous version, the program cannot be closed without the button*/
        ImageIcon closebt = new ImageIcon("file link to closebt.png");
        closebt = new JButton(closebt);
        setLayout(new FlowLayout());
        add(closebt);
        closebt.setBorder(BorderFactory.createEmptyBorder());
        closebt.setContentAreaFilled(false);
        ImageIcon upArrow = new ImageIcon("file link to upArrow.png");
        upArrow = new JButton(upArrow);
        setLayout(new FlowLayout());
        add(upArrow);
        upArrow.setBorder(BorderFactory.createEmptyBorder());
        upArrow.setContentAreaFilled(false);//with top removes button borders
        ImageIcon downArrow = new ImageIcon("file link to downArrow.png");
        downArrow = new JButton(downArrow);
        setLayout(new FlowLayout());
        add(downArrow);
        downArrow.setBorder(BorderFactory.createEmptyBorder());
        downArrow.setContentAreaFilled(false);
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
