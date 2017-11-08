package ProjectTests;

import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.*;
import java.util.*;
import java.awt.event.*;

public class BingoGame2 extends JFrame{
    private JLabel number;
    private JPanel pnlTop, pnlMid, pnlBot;
    private JButton randBtn, again, exit;
    private char adds = '.';

    private static final int row = 5;
    private static final int column = 5;
    private Cell[][] pan = new Cell[row][column];
    private int numCalled = 0;
    private ArrayList<Integer> array;

    public BingoGame2() {

        pnlMid = new JPanel(new GridLayout(row, column));
        for (int i = 0; i < pan.length; i++) {
            for (int j = 0; j < pan[i].length; j++) {
                pan[i][j] = new Cell();
                if (i == 2 && j == 2) {
                    pan[i][j].setBackground(Color.BLACK);
                    pan[i][j].setText("");
                    pan[i][j].setEnabled(false);
                    pan[i][j].setToken(adds);
                }
                pnlMid.add(pan[i][j]);
            }
        }

        TopPanel();
        BotPanel();

        setTitle("Bingo Game");
        setSize(500, 500);
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        setLayout(new BorderLayout());
        add(pnlTop, BorderLayout.WEST);
        add(pnlMid);
        add(pnlBot, BorderLayout.SOUTH);
        setVisible(true);
    }

    public void TopPanel() {
        pnlTop = new JPanel();
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(5, 1));
        JLabel lbl = new JLabel("B");
        JLabel lbl2 = new JLabel("I");
        JLabel lbl3 = new JLabel("N");
        JLabel lbl4 = new JLabel("G");
        JLabel lbl5 = new JLabel("O");
        Font font = new Font("", Font.BOLD, 70);
        lbl.setFont(font);
        lbl2.setFont(font);
        lbl3.setFont(font);
        lbl4.setFont(font);
        lbl5.setFont(font);
        panel.add(lbl);
        panel.add(lbl2);
        panel.add(lbl3);
        panel.add(lbl4);
        panel.add(lbl5);
        panel.setBackground(Color.white);
        pnlTop.setBackground(Color.WHITE);
        pnlTop.add(panel);
    }

    public boolean Won(char token) {
        /**
         * Horizontal win
         */
        for(int i = 0; i < pan.length; i++) {
            if ((pan[i][0].getToken() == token)
                    && (pan[i][1].getToken() == token)
                    && (pan[i][2].getToken() == token)
                    && (pan[i][3].getToken() == token)
                    && (pan[i][4].getToken() == token)) {
                return true;
            }
        }
        /**
         * Vertical win
         */
        for (int i = 0; i < pan.length; i++) {
            for (int j = 0; j < pan[i].length; j++) {
                if ((pan[0][j].getToken() == token)
                        && (pan[1][j].getToken() == token)
                        && (pan[2][j].getToken() == token)
                        && (pan[3][j].getToken() == token)
                        && (pan[4][j].getToken() == token)) {
                    return true;
                }
            }
        }
        /**
         * Diagonal win
         */
        if ((pan[0][0].getToken() == token)
                && (pan[1][1].getToken() == token)
                && (pan[2][2].getToken() == token)
                && (pan[3][3].getToken() == token)
                && (pan[4][4].getToken() == token)
                || (pan[0][4].getToken() == token)
                && (pan[1][3].getToken() == token)
                && (pan[2][2].getToken() == token)
                && (pan[3][1].getToken() == token)
                && (pan[4][0].getToken() == token)){
            return true;
        }
        return false;
    }

    public void BotPanel() {
        pnlBot = new JPanel();
        pnlBot.setBackground(Color.WHITE);
        pnlBot.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        pnlBot.setLayout(new FlowLayout());
        number = new JLabel();
        Font font = new Font("", Font.BOLD, 20);
        number.setFont(font);
        randBtn = new JButton("Call the next number");
        randBtn.addActionListener(new RndButtonListener());
        pnlBot.add(randBtn);
        pnlBot.add(number);
    }

    private class RndButtonListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            array = new ArrayList<Integer>();
            boolean allCalled = false;
            for (int i = 1; i <= 75; i++) {
                if (!array.contains(i))
                    break;
                if (i == 75)
                    allCalled = true;
            }
            if (allCalled) {
                number.setText("All numbers have been called");
                randBtn.setVisible(false);
                pnlBot.add(again);
                pnlBot.add(exit);
            } else {
                Random rand = new Random();
                int random = rand.nextInt(75) + 1;
                while (array.contains(random))
                    random = rand.nextInt(75) + 1;
                array.add(random);
                number.setText("" + random);
            }
        }
    }

    public class Cell extends JButton {
        private char token = ' ';

        public Cell() {
            Random rand = new Random();
            Font font = new Font("", Font.BOLD, 50);
            setFont(font);
            setBorder(new LineBorder(Color.black));
            addActionListener(new CellAction());
            setText("" + (rand.nextInt(3) + 1 + numCalled*3));
            numCalled++;
        }

        public char getToken() {
            return token;
        }

        public void setToken(char c) {
            token = c;
            repaint();
        }

        private class CellAction implements ActionListener {
            public void actionPerformed(ActionEvent e) {
                // If cell is empty and game is not over
                if (token == ' ') {
                    setToken(adds); // Set token in the cell
                    setBackground(Color.BLACK);
                    setEnabled(false);
                    setText("");

                    // Check game status
                    if (Won(adds)) {
                        adds = ' ';
                        number.setVisible(false);
                        randBtn.setEnabled(false);
                        randBtn.setText("You Win!");
                        again = new JButton("Play Again?");
                        again.addActionListener(new ActionListener() {
                            @Override
                            public void actionPerformed(ActionEvent actionEvent) {
                                dispose();
                                new BingoHelp();
                            }
                        });
                        exit = new JButton("Exit");
                        exit.addActionListener(new ActionListener() {
                            @Override
                            public void actionPerformed(ActionEvent actionEvent) {
                                System.exit(0);
                            }
                        });
                        pnlBot.add(again);
                        pnlBot.add(exit);
                    }
                }
            }
        }
    }
    public static void main(String args[]) {
        new BingoHelp();
    }
}