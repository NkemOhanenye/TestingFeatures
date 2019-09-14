package ProjectTests;
/**
 * Author: Nkem Ohanenye
 * Date: 4/25/2017
 * Purpose: To create the final
 * project, a bingo game, for
 * use as a fun game.
 */

import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.*;
import java.util.*;
import java.awt.event.*;

public class Bingo extends JFrame{
    /**
     * the main global variables used
     */
    private JLabel numCall;
    private JPanel text, board, btnPnl;
    private JButton random, playAgain, exit;
    /**
     * used to add a character to the buttons when pressed
     * though not drawn on used as a way to see if the
     * button was pressed
     */
    private char addChar = '.';
    /**
     * the global variables for the cells and random numbers
     */
    private static final int row = 5;
    private static final int column = 5;
    private Cell[][] cell = new Cell[row][column];
    private JLabel numbers;
    private ArrayList<Integer> array = new ArrayList<Integer>();
    private int counter = 0;
    private int fixrand = 0;
    /**
     * used to use the extended frame as a global variable
     */
    private JFrame frame = this;


    public Bingo() {
        /**
         * the components of the frame
         */
        setTitle("Bingo Game");
        setSize(500, 500);
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        /**
         * the initiated cells made with a grid layout to
         * make the bingo board
         */
        board = new JPanel(new GridLayout(row, column));
        for (int i = 0; i < cell.length; i++) {
            for (int j = 0; j < cell[i].length; j++) {
                cell[i][j] = new Cell();
                if (i == 2 && j == 2) {
                    cell[i][j].setBackground(Color.black);
                    numbers.setText("");
                    cell[i][j].setEnabled(false);
                    cell[i][j].setSymbol(addChar);
                }
                board.add(cell[i][j]);
            }
        }
        /**
         * the methods used from the constructor
         */
        TopPanel();
        BotPanel();
        /**
         * sets the layout of the frame then adds all the
         * main panels to the frame
         */
        setLayout(new BorderLayout());
        add(text, BorderLayout.WEST);
        add(board);
        add(btnPnl, BorderLayout.SOUTH);
        setVisible(true);
    }

    public void TopPanel() {
        /**
         * initiates the text panel
         */
        text = new JPanel();
        JPanel panel = new JPanel();
        /**
         * creates a grid layout for the word "BINGO"
         * so that they can be seen vertically on the
         * screen
         */
        panel.setLayout(new GridLayout(5, 1));
        JLabel lbl = new JLabel("B");
        JLabel lbl2 = new JLabel("I");
        JLabel lbl3 = new JLabel("N");
        JLabel lbl4 = new JLabel("G");
        JLabel lbl5 = new JLabel("O");
        /**
         * creates a font with the default font, bolded
         * and at pixel size 70
         */
        Font font = new Font("", Font.BOLD, 70);
        /**
         * sets the front to the labels
         */
        lbl.setFont(font);
        lbl2.setFont(font);
        lbl3.setFont(font);
        lbl4.setFont(font);
        lbl5.setFont(font);
        /**
         * adds the labels to the panel
         */
        panel.add(lbl);
        panel.add(lbl2);
        panel.add(lbl3);
        panel.add(lbl4);
        panel.add(lbl5);
        /**
         * sets the backgrounds white to not strain eyes
         */
        panel.setBackground(Color.white);
        text.setBackground(Color.WHITE);
        /**
         * adds the panel to the main panel
         */
        text.add(panel);
    }

    /**
     * creates a method to check the wins are true or false
     * @param symbol char to have the getter still equal to the
     * actual symbol to be used
     * @return if true other event in inner class "Cell"
     * takes effect
     */
    public boolean Winner(char symbol) {
        /**
         * Horizontal win
         */
        for(int i = 0; i < cell.length; i++) {
            if ((cell[i][0].getSymbol() == symbol)
                    && (cell[i][1].getSymbol() == symbol)
                    && (cell[i][2].getSymbol() == symbol)
                    && (cell[i][3].getSymbol() == symbol)
                    && (cell[i][4].getSymbol() == symbol)) {
                return true;
            }
        }
        /**
         * Vertical win
         */
        for (int i = 0; i < cell.length; i++) {
            for (int j = 0; j < cell[i].length; j++) {
                if ((cell[0][j].getSymbol() == symbol)
                        && (cell[1][j].getSymbol() == symbol)
                        && (cell[2][j].getSymbol() == symbol)
                        && (cell[3][j].getSymbol() == symbol)
                        && (cell[4][j].getSymbol() == symbol)) {
                    return true;
                }
            }
        }
        /**
         * Diagonal win
         */
        if ((cell[0][0].getSymbol() == symbol)
                && (cell[1][1].getSymbol() == symbol)
                && (cell[2][2].getSymbol() == symbol)
                && (cell[3][3].getSymbol() == symbol)
                && (cell[4][4].getSymbol() == symbol)
                || (cell[0][4].getSymbol() == symbol)
                && (cell[1][3].getSymbol() == symbol)
                && (cell[2][2].getSymbol() == symbol)
                && (cell[3][1].getSymbol() == symbol)
                && (cell[4][0].getSymbol() == symbol)){
            return true;
        }
        return false;
    }

    /**
     * the main cell that is made to extend JPanel
     */
    public class Cell extends JPanel {
        /**
         * creates second char for setter, getter and added
         * use
         */
        private char symbol = ' ';

        public Cell() {
            Random rand = new Random();
            Font font = new Font("", Font.BOLD, 50);
            setBorder(new LineBorder(Color.black));
            addMouseListener(new MouseAction());
            /**
             * sets the text for the JPanel to increment by 3
             * on each cell
             */
            numbers = new JLabel("" + (rand.nextInt(3) + 1 + fixrand * 3));
            fixrand++;
            numbers.setFont(font);
            add(numbers);

        }

        /**
         * the getter
         * @return symbol
         */
        public char getSymbol() {
            return symbol;
        }

        /**
         * the setter
         * @param c made equal to symbol
         */
        public void setSymbol(char c) {
            symbol = c;
            repaint();
        }

        /**
         * the class used to set the action of the mouse
         * when clicking on the pabels
         */
        private class MouseAction extends MouseAdapter {
            public void mouseClicked(MouseEvent e) {
                /**
                 * if the symbol == ' ' then when that is true on
                 * mouseclick, addChar is added to the section
                 * addChar != ' ', so the panel is still enabled
                 */
                if (symbol == ' ' && addChar != ' ') {
                    setSymbol(addChar);
                    /**
                     * sets the color black on click
                     */
                    setBackground(Color.black);

                    /**
                     * checks for win
                     */
                    if (Winner(addChar)) {
                        random.setText("You won!");
                        /**
                         * sets the panel uneditable
                         */
                        addChar = ' ';
                        numCall.setVisible(false);
                        random.setEnabled(false);
                        random.setText("You Win!");

                        /**
                         * creates the playAgain button
                         */
                        playAgain = new JButton("Play Again?");
                        playAgain.addActionListener( ActionEvent ->  AgainListener());
                        /**
                         * creates the exit button
                         */
                        exit = new JButton("Exit");
                        exit.addActionListener( ActionEvent -> ExitListener());
                        /**
                         * adds the two new buttons to the panel
                         */
                        btnPnl.add(playAgain);
                        btnPnl.add(exit);
                    }
                }
            }
            void AgainListener(){
                /**
                 * instead of discarding everything and reinitializing
                 * it like i have been told by many
                 * @variable frame is disposed in its entirety and
                 * a new Bingo game is created automatically
                 */
                frame.dispose();
                new Bingo();
            }
            void ExitListener(){
                /**
                 * exits the program
                 */
                System.exit(0);
            }
        }
    }

    /**
     * creates the bottom panel for the button and label
     */
    public void BotPanel() {
        /**
         * the main variables used for the bottom panel
         */
        btnPnl = new JPanel();
        random = new JButton("Call me to start");
        numCall = new JLabel();
        Font font = new Font("", Font.BOLD, 20);
        /**
         * he added effects on the variables
         * sets the layout a flow layout
         */
        random.addActionListener(new RandomListener());
        numCall.setFont(font);
        btnPnl.setBackground(Color.WHITE);
        btnPnl.setLayout(new FlowLayout());
        /**
         * adds the button and label to the panel
         */
        btnPnl.add(random);
        btnPnl.add(numCall);
    }

    /**
     * the private class of the button's actionlistener
     */
    private class RandomListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            /**
             * creates a boolean that equals false
             */
            boolean allCalled = false;
            /**
             * creates a counter on the button to change the
             * words on the button on the first click
             */
            if(e.getSource() == random){
                counter++;
                if(counter == 1)
                    random.setText("Call the next number");
            }
            /**
             * checks if allCalled = true to stop the button
             * but not make it freeze the program
             */
            for (int i = 1; i <= 75; i++) {
                if (!array.contains(i))
                    break;
                if (i == 75)
                    allCalled = true;
            }
            /**
             * when allCalled these events will happen
             */
            if (allCalled) {
                numCall.setText("All numbers called");
                /**
                 * the button will show "Call the next number"
                 * so i made it invisible to the user
                 */
                random.setVisible(false);
                /**
                 * sets the panel unable to be pressed
                 * to not initiate a false win
                 */
                addChar = ' ';
                /**
                 * creates a button to ask if you would like to play again
                 */
                playAgain = new JButton("Play Again?");
                /**
                 * lambda event for the button
                 */
                playAgain.addActionListener(ActionEvent->  AgainListener());
                /**
                 * creates an exit button
                 */
                exit = new JButton("Exit");
                /**
                 * lambda event for the button
                 */
                exit.addActionListener(ActionEvent -> ExitListener());
                /**
                 * adds the two new JButtons to the btnPnl
                 */
                btnPnl.add(playAgain);
                btnPnl.add(exit);
            } else {
                /**
                 * if allCalled != true
                 * the numbers will be called with no duplicates
                 */
                Random rand = new Random();
                int random = rand.nextInt(75) + 1;
                /**
                 * while the array contains the numbers already
                 * produced, the array calls more numbers so the
                 * others wont continue
                 */
                while (array.contains(random))
                    random = rand.nextInt(75) + 1;
                array.add(random);
                numCall.setText("" + (random));
            }
        }

        /**
         * the listeners for the playAgain and exit button
         */
        void AgainListener(){
            frame.dispose();
            new Bingo();
        }
        void ExitListener(){
            System.exit(0);
        }
    }

    /**
     * creates the main and initiates the constructor
     */
    public static void main(String args[]) {
        new Bingo();
    }
}