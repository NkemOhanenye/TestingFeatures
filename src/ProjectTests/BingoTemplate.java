package ProjectTests;

import javax.swing.*;
import java.awt.*;

public class BingoTemplate extends JFrame{
    private JPanel[][] pan;
    private JPanel pnlMid;


    private static final int row = 5;
    private static final int column = 5;
    private int counter = 0;

    public BingoTemplate(){
        
        setTitle("Bingo Template");
        setSize(500, 500);
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        MidPanel();
        add(pnlMid);
        setVisible(true);
    }
    public void MidPanel(){
        pnlMid = new JPanel();
        pnlMid.setLayout(new GridLayout(row, column));
        pan = new JPanel[row][column];
        
        for (int i = 0; i < pan.length; i++) {
            for (int j = 0; j < pan[i].length; j++) {
                pan[i][j] = new JPanel();

                pan[i][j].setBorder(BorderFactory.createLineBorder(Color.BLACK));
                pnlMid.add(pan[i][j]);
            }
        }     
    }
    public static void main(String args[]){new BingoTemplate();}
}
