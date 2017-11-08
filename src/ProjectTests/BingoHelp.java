package ProjectTests;

import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.*;
import java.util.*;
import java.awt.event.*;

public class BingoHelp extends JFrame{
    private JPanel pnlMid;

    private static final int row = 5;
    private static final int column = 5;
    private JPanel[][] pan = new JPanel[row][column];

    public BingoHelp() {

        pnlMid = new JPanel(new GridLayout(row, column));
        for (int i = 0; i < pan.length; i++) {
            for (int j = 0; j < pan[i].length; j++) {
                pan[i][j] = new JPanel();
                if (i == 2 && j == 2) {
                    pan[i][j].setBackground(Color.BLACK);
                    pan[i][j].setEnabled(false);
                }
                pan[i][j].setBorder(new LineBorder(Color.black));
                pnlMid.add(pan[i][j]);
            }
        }

        setTitle("Bingo Game");
        setSize(500, 500);
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        setLayout(new BorderLayout());
        add(pnlMid);
        setVisible(true);
    }

    public static void main(String args[]) {
        new BingoHelp();
    }
}