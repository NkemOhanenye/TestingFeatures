/*
 * Created by IntelliJ IDEA.
 * User: Nkem Ohanenye
 * Date: 11/7/17
 * Time: 2:01 PM
 */
package ChartTests;

import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.*;

public class Grid extends JFrame{

    private JPanel pnl;

    private static final int row = 4;
    private static final int column = 2;
    private JPanel[][] gridPanel = new JPanel[row][column];

    private JLabel lbls;
    private JLabel lbls2;
    private JLabel lbls3;
    private JLabel lbls4;

    public Grid(){

        setTitle("Grid");
        setSize(500,500);
        setResizable(false);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        lbls = new JLabel();
        lbls2 = new JLabel();
        lbls3 = new JLabel();
        lbls4 = new JLabel();

        pnl = new JPanel(new GridLayout(row,column));
        for(int i = 0; i < gridPanel.length; i++){
            for(int j = 0; j < gridPanel[i].length; j++){
                gridPanel[i][j] = new JPanel();
                if (i == 0 && j == 0) {
                    gridPanel[i][j].setBorder(new LineBorder(Color.BLACK));
                }
                if(i == 0 && j == 1) {
                    lbls.setText("Current: " + "/amps");
                    gridPanel[i][j].add(lbls);
                }
                if (i == 1 && j == 0) {
                    lbls2.setText("Volts: " + "/volts");
                    gridPanel[i][j].add(lbls2);
                }
                if(i == 2 && j == 0){
                    lbls3.setText("Temperature: " + "/°C");
                    gridPanel[i][j].add(lbls3);
                }
                if(i == 3 && j == 0){
                    lbls4.setText("Force: " + "/N");
                    gridPanel[i][j].add(lbls4);
                }
                pnl.add(gridPanel[i][j]);
            }
        }

        add(pnl);

        setVisible(true);

    }

    public static void main(String args[]){
        new Grid();
    }

}