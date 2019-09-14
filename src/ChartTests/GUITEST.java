package ChartTests;/*
 * Created by IntelliJ IDEA.
 * User: Nkem Ohanenye
 * Date: 10/27/17
 * Time: 9:24 PM
 */

import org.jfree.data.time.Second;

import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUITEST extends JFrame{

    private JPanel top;
    private JPanel bottom;
    private JPanel west;
    private JPanel east;
    private JPanel center;
    private JPanel butTop;
    private JPanel exitP;
    private JPanel sliderP;
    private JPanel timeP;

    private static final int row = 4;
    private static final int column = 2;
    private JPanel[][] change = new JPanel[row][column];

    private JButton but1;
    private JButton but2;
    private JButton exit;

    private JLabel time;

    private JLabel lbl;
    private JLabel lbl2;
    private JLabel lbl3;
    private JLabel lbl4;

    private JSlider slider;

    public GUITEST(){

        //Variable Initializers
        top = new JPanel();
        bottom = new JPanel();
        west = new JPanel(new GridLayout(row,column));
        east = new JPanel();
        center = new JPanel();
        butTop = new JPanel();
        exitP = new JPanel();
        sliderP = new JPanel();
        timeP = new JPanel();

        but1 = new JButton("button 1");
        but2 = new JButton("button 2");

        time = new JLabel();

        lbl = new JLabel();
        lbl2 = new JLabel();
        lbl3 = new JLabel();
        lbl4 = new JLabel();

        slider = new JSlider();

        //frame settings
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setUndecorated(true);
        GraphicsEnvironment.getLocalGraphicsEnvironment().
                getDefaultScreenDevice().setFullScreenWindow(this);
        setLayout(new BorderLayout(5,5));

        //panel settings
        top.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        bottom.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        west.setBorder(BorderFactory.createLineBorder(Color.BLACK));

        butTop.setLayout(new GridLayout(1,2));
        exitP.setLayout(new FlowLayout());
        top.setLayout(new BorderLayout(5,0));
        bottom.setLayout(new GridLayout(1,2));

        //methods
        Top();


        //add to panel
        butTop.add(but1);
        butTop.add(but2);
        exitP.add(exit);
        sliderP.add(slider);
        timeP.add(time);
        top.add(butTop);
        top.add(exitP, BorderLayout.EAST);
        west.add(lbl);
        west.add(lbl2);
        west.add(lbl3);
        west.add(lbl4);
        bottom.add(sliderP);
        bottom.add(timeP);


        //add to frame
        add(top, BorderLayout.NORTH);
        //add(center, BorderLayout.CENTER);
        add(bottom, BorderLayout.SOUTH);
        add(west, BorderLayout.WEST);
        //add(east, BorderLayout.EAST);

        //visible
        setVisible(true);

        Bottom();
        West();

    }

    public void Top(){

        ImageIcon closebt = new ImageIcon("./Resources/closebt.png");
        exit = new JButton(closebt);
        exit.setBorder(BorderFactory.createEmptyBorder());
        exit.setContentAreaFilled(false);

        exit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                System.exit(0);
            }
        });

    }

    private void Bottom() {

        slider.setMajorTickSpacing(90);
        //servoSlider.setMajorTickSpacing(100);
        slider.setSnapToTicks(true);
        slider.setPaintTicks(true);
        slider.setPaintLabels(true);

        while (System.currentTimeMillis() >= 0) {
            Second now = new Second();
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
                time.setText("Failed");
            }
            String s = now.toString();
            time.setText(s);
            //System.out.println(s);
        }

    }

    private void West(){

        for(int i = 0; i < change.length; i++){
            for(int j = 0; j < change[i].length; j++){
                change[i][j] = new JPanel();
                if (i == 0 && j == 0) {
                    change[i][j].setBorder(new LineBorder(Color.BLACK));
                }
                if(i == 0 && j == 1) {
                    lbl.setText("Current: " + "/amps");
                    change[i][j].add(lbl);
                }
                if (i == 1 && j == 0) {
                    lbl2.setText("Volts: " + "/volts");
                    change[i][j].add(lbl2);
                }
                if(i == 2 && j == 0){
                    lbl3.setText("Temperature: " + "/°C");
                    change[i][j].add(lbl3);
                }
                if(i == 3 && j == 0){
                    lbl4.setText("Force: " + "/N");
                    change[i][j].add(lbl4);
                }
                west.add(change[i][j]);
            }
        }

    }

    public static void main(String args[]){
        new GUITEST();
    }
}