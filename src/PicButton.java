/**
 * Created by otakusenseihig on 3/4/17.
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PicButton extends JFrame{

    private JButton exitButton, upbutton, downbutton; //makes the JButton variables global
    private JPanel panel, panel2; //makes the JPanel variables global variable

    public PicButton() { //creates constructor
        panel = new JPanel(); //creates JPanel
        panel2 = new JPanel(); //creates a second JPanel

        getContentPane().setBackground(Color.red.darker().darker().darker()); //colors the background red
        //this.setSize(500,500); //sets size of frame, used to debug problems with fullscreen
        setUndecorated(true); //removes window bar
        GraphicsEnvironment.getLocalGraphicsEnvironment().
                getDefaultScreenDevice().setFullScreenWindow(this);//sets fullscreen and removes taskbar

        Buttons();
        ExitButtonInside();
        //create Methods here

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //closes program upon clicking x button
        setVisible(true); //makes the program visible
    }
    public static void main(String args[]){new PicButton();}

    public void ExitButtonInside(){ //creates the Exit button
        panel.setLayout(new BorderLayout());
        //makes the panel a global variable
        ImageIcon closebt = new ImageIcon("/home/otakusenseihig/IdeaProjects/TestingFeatures/closebt.png");
        //imports picture for the exitbutton
        exitButton = new JButton(closebt);
        //makes the exitbutton a global variable
        exitButton.addActionListener(e -> exitButtonClick());
        //creates exitButton actionlistener

        exitButton.setBorder(BorderFactory.createEmptyBorder());
        //removes the exitbutton border
        exitButton.setContentAreaFilled(false);
        //removes the border and area around the button

        panel.add(exitButton, BorderLayout.EAST); //adds button to panel and the borderlayer east
        panel.setBackground(null);
        //removes the default panel button
        add(panel, BorderLayout.NORTH); //adds panel to frame, with borderlayer north
    }
    void exitButtonClick(){
        System.exit(0);
        //closes program on click
    }

    public void Buttons(){
        ServoIncrt pulseWidth = new ServoIncrt();
        //creates the inner class, and mankes actionlistener a variable
        GridBagConstraints gbc = new GridBagConstraints();
        //creates the gridbagconstraints to be used
        panel2.setLayout(new GridBagLayout());
        //gives button GridBagLayout
        ImageIcon upArrow = new ImageIcon("/home/otakusenseihig/IdeaProjects/TestingFeatures/upArrow.png");
        //adds an image to the upbutton
        ImageIcon downArrow = new ImageIcon("/home/otakusenseihig/IdeaProjects/TestingFeatures/downArrow.png");
        //adds an image to the downbutton

        upbutton = new JButton(upArrow);
        //makes upbutton a global variable
        upbutton.addActionListener(pulseWidth);
        //adds actionlistener to the upbutton

        downbutton = new JButton(downArrow);
        //makes downbutton a global variable
        downbutton.addActionListener(pulseWidth);
        //adds actionlistener to the downbutton

        upbutton.setBorder(BorderFactory.createEmptyBorder());
        //removes the border of upbutton
        upbutton.setContentAreaFilled(false);
        //removes the area around the button
        downbutton.setBorder(BorderFactory.createEmptyBorder());
        //removes the border of upbutton
        downbutton.setContentAreaFilled(false);
        //removes the area around the button

        gbc.weightx = 1;
        //extends the horizontal weight
        gbc.gridx = 0;
        gbc.gridy = 0;
        //sends the upbutton to coordinates (0, 0)
        gbc.insets = new Insets(0,100,50,0);
        //Insets (top, left, bottom, right);
        //seperates from the left side by 100 and the bottom by 50
        gbc.anchor = GridBagConstraints.LINE_START;
        //moves the upbutton to the left most of the frame
        panel2.add(upbutton, gbc);
        //implements the upbutton and gbc to the panel

        gbc.gridx = 0;
        gbc.gridy = 1;
        //sends the downbutton to coordinates (0,1)
        gbc.anchor = GridBagConstraints.LINE_START;
        //moves the downbutton to the left most of the frame
        panel2.add(downbutton, gbc);
        //implementes the downbutton and gbc to the panel
        panel2.setBackground(null);
        //removes the default panel background
        add(panel2);
        //adds the panel to the frame
    }
    private class ServoIncrt implements ActionListener{
        //creates an inner class that implements ActionListener
        private double Incrementer = 1.0;
        ///creates the Incrementer double variable
        private JPanel TextPanel;
        private JTextField incrthere;
        public void actionPerformed(ActionEvent e) {
            //creates the actionPerformed method
            TextPanel = new JPanel();
            incrthere = new JTextField();

            Font myFont = new Font("Dialog", Font.BOLD, 25);
            incrthere.setFont(myFont);
            incrthere.setForeground(Color.black);

            incrthere.setText("Increment: " + Incrementer);
            TextPanel.add(incrthere);
            incrthere.setBackground(null);
            incrthere.setBorder(null);
            TextPanel.setBackground(null);
            add(TextPanel);
            setVisible(true);

            if(e.getSource() == upbutton && Incrementer <= 2.0){
                System.out.println(e.getSource());
                System.out.println(upbutton);
                //conditional if upbutton is clicked and limit is less or equal to 2
                Incrementer += 0.1;
                //increments + .1
                if (Math.floor(Incrementer) == 2.0) {
                    //@param Math.floor rounds the output of adding .1 down
                    upbutton.setText("MAX");
                }
            }
            if(e.getSource() == downbutton && Incrementer >= 1.0) {
                System.out.println(e.getSource());
                System.out.println(downbutton);
                //conditional if downbutton is clicked and limit is greater or equal to 1
                Incrementer -= 0.1;
                //increments - .1
                if (Math.ceil(Incrementer) == 1.0) {
                    //Math.ceil rounds number up
                    downbutton.setText("MAX");
                }
            }
        }
    }
}
