import javax.swing.*;
import java.awt.*;
import java.util.*;
import java.awt.event.*;

public class BingoGame extends JFrame{
    private JLabel lbl, number;
    private JButton[][] pan;
    private JPanel pnlTop, pnlMid, pnlBot;
    private JButton btn, again, exit;


    private static final int row = 5;
    private static final int column = 5;
    private int counter = 0;

    public BingoGame(){
        
        setTitle("Bingo Game");
        setSize(500, 500);
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        TopPanel();
        MidPanel();
        BotPanel();

        setLayout(new BorderLayout());
        add(pnlTop, BorderLayout.NORTH);
        add(pnlMid);
        add(pnlBot, BorderLayout.SOUTH);
        setVisible(true);
    }
    public void TopPanel(){
        pnlTop = new JPanel();
        lbl = new JLabel("B  I  N  G  O");
        Font font = new Font("", Font.BOLD, 70);
        lbl.setFont(font);
        pnlTop.setBackground(Color.WHITE);
        pnlTop.add(lbl);
    }
    public void MidPanel(){
        pnlMid = new JPanel();
        Font font = new Font("", Font.BOLD, 50);
        counter++;
        pnlMid.setLayout(new GridLayout(row, column));
        pan = new JButton[row][column];
        
        for (int i = 0; i < pan.length; i++) {
            for (int j = 0; j < pan[i].length; j++) {
                
                int random = (int)(Math.random() * 3) + 1;
                
                int random4 = 4 + (int)(Math.random() * 3);
                int random5 = 7 + (int)(Math.random() * 3);
                int random2 = 10 + (int)(Math.random() * 3);
                int random3 = 13 + (int)(Math.random() * 3);

                int random8 = 16 + (int)(Math.random() * 3);
                int random10 = 19 + (int)(Math.random() * 2);
                int random9 = 21 + (int)(Math.random() * 3);
                int random6 = 24 + (int)(Math.random() * 3);
                int random7 = 27 + (int)(Math.random() * 4);

                int random14 = 31 + (int)(Math.random() * 4);
                int random15 = 35 + (int)(Math.random() * 3);
                int random12 = 38 + (int)(Math.random() * 4);
                int random11 = 42 + (int)(Math.random() * 4);

                int random19 = 46 + (int)(Math.random() * 3);
                int random17 = 49 + (int)(Math.random() * 2);
                int random16 = 51 + (int)(Math.random() * 3);
                int random20 = 54 + (int)(Math.random() * 4);
                int random18 = 58 + (int)(Math.random() * 3);

                int random24 = 61 + (int)(Math.random() * 3);
                int random21 = 64 + (int)(Math.random() * 3);
                int random25 = 67 + (int)(Math.random() * 3);
                int random22 = 70 + (int)(Math.random() * 3);
                int random23 = 73 + (int)(Math.random() * 3);
                
                pan[i][j] = new JButton();
                
                pan[0][0] = new JButton("" + random);
                pan[0][0].addActionListener(new ActionListener(){
                    public void actionPerformed(ActionEvent e){
                        JButton button = (JButton) e.getSource();
                            button.setBackground(Color.BLACK);
                            button.setOpaque(true);
                    }
                });
                pan[0][1] = new JButton("" + random6);
                pan[0][1].addActionListener(new ActionListener(){
                    public void actionPerformed(ActionEvent e){
                        JButton button2 = (JButton) e.getSource();
                            button2.setBackground(Color.BLACK);
                            button2.setOpaque(true);
                    }
                });
                pan[0][2] = new JButton("" + random11);
                pan[0][2].addActionListener(new ActionListener(){
                    public void actionPerformed(ActionEvent e){
                        JButton button3 = (JButton) e.getSource();
                            button3.setBackground(Color.BLACK);
                            button3.setOpaque(true);
                    }
                });
                pan[0][3] = new JButton("" + random16);
                pan[0][3].addActionListener(new ActionListener(){
                    public void actionPerformed(ActionEvent e){
                        JButton button4 = (JButton) e.getSource();
                            button4.setBackground(Color.BLACK);
                            button4.setOpaque(true);
                    }
                });
                pan[0][4] = new JButton("" + random21);
                pan[0][4].addActionListener(new ActionListener(){
                    public void actionPerformed(ActionEvent e){
                        JButton button5 = (JButton) e.getSource();
                            button5.setBackground(Color.BLACK);
                            button5.setOpaque(true);
                    }
                });
                pan[1][0] = new JButton("" + random2);
                pan[1][0].addActionListener(new ActionListener(){
                    public void actionPerformed(ActionEvent e){
                        JButton button6 = (JButton) e.getSource();
                            button6.setBackground(Color.BLACK);
                            button6.setOpaque(true);
                    }
                });
                pan[1][1] = new JButton("" + random7);
                pan[1][1].addActionListener(new ActionListener(){
                    public void actionPerformed(ActionEvent e){
                        JButton button7 = (JButton) e.getSource();
                            button7.setBackground(Color.BLACK);
                            button7.setOpaque(true);
                    }
                });
                pan[1][2] = new JButton("" + random12);
                pan[1][2].addActionListener(new ActionListener(){
                    public void actionPerformed(ActionEvent e){
                        JButton button8 = (JButton) e.getSource();
                            button8.setBackground(Color.BLACK);
                            button8.setOpaque(true);
                    }
                });
                pan[1][3] = new JButton("" + random17);
                pan[1][3].addActionListener(new ActionListener(){
                    public void actionPerformed(ActionEvent e){
                        JButton button9 = (JButton) e.getSource();
                            button9.setBackground(Color.BLACK);
                            button9.setOpaque(true);
                    }
                });
                pan[1][4] = new JButton("" + random22);
                pan[1][4].addActionListener(new ActionListener(){
                    public void actionPerformed(ActionEvent e){
                        JButton button10 = (JButton) e.getSource();
                            button10.setBackground(Color.BLACK);
                            button10.setOpaque(true);
                    }
                });
                pan[2][0] = new JButton("" + random3);
                pan[2][0].addActionListener(new ActionListener(){
                    public void actionPerformed(ActionEvent e){
                        JButton button11 = (JButton) e.getSource();
                            button11.setBackground(Color.BLACK);
                            button11.setOpaque(true);
                    }
                });
                pan[2][1] = new JButton("" + random8);
                pan[2][1].addActionListener(new ActionListener(){
                    public void actionPerformed(ActionEvent e){
                        JButton button12 = (JButton) e.getSource();
                            button12.setBackground(Color.BLACK);
                            button12.setOpaque(true);
                    }
                });

                pan[2][2] = new JButton();
                pan[2][2].setBackground(Color.BLACK);
                pan[2][2].setEnabled(false);

                pan[2][3] = new JButton("" + random18);
                pan[2][3].addActionListener(new ActionListener(){
                    public void actionPerformed(ActionEvent e){
                        JButton button14 = (JButton) e.getSource();
                            button14.setBackground(Color.BLACK);
                            button14.setOpaque(true);
                    }
                });
                pan[2][4] = new JButton("" + random23);
                pan[2][4].addActionListener(new ActionListener(){
                    public void actionPerformed(ActionEvent e){
                        JButton button15 = (JButton) e.getSource();
                            button15.setBackground(Color.BLACK);
                            button15.setOpaque(true);
                    }
                });
                pan[3][0] = new JButton("" + random4);
                pan[3][0].addActionListener(new ActionListener(){
                    public void actionPerformed(ActionEvent e){
                        JButton button16 = (JButton) e.getSource();
                            button16.setBackground(Color.BLACK);
                            button16.setOpaque(true);
                    }
                });
                pan[3][1] = new JButton("" + random9);
                pan[3][1].addActionListener(new ActionListener(){
                    public void actionPerformed(ActionEvent e){
                        JButton button17 = (JButton) e.getSource();
                            button17.setBackground(Color.BLACK);
                            button17.setOpaque(true);
                    }
                });
                pan[3][2] = new JButton("" + random14);
                pan[3][2].addActionListener(new ActionListener(){
                    public void actionPerformed(ActionEvent e){
                        JButton button18 = (JButton) e.getSource();
                            button18.setBackground(Color.BLACK);
                            button18.setOpaque(true);
                    }
                });
                pan[3][3] = new JButton("" + random19);
                pan[3][3].addActionListener(new ActionListener(){
                    public void actionPerformed(ActionEvent e){
                        JButton button19 = (JButton) e.getSource();
                            button19.setBackground(Color.BLACK);
                            button19.setOpaque(true);
                    }
                });
                pan[3][4] = new JButton("" + random24);
                pan[3][4].addActionListener(new ActionListener(){
                    public void actionPerformed(ActionEvent e){
                        JButton button20 = (JButton) e.getSource();
                            button20.setBackground(Color.BLACK);
                            button20.setOpaque(true);
                    }
                });
                pan[4][0] = new JButton("" + random5);
                pan[4][0].addActionListener(new ActionListener(){
                    public void actionPerformed(ActionEvent e){
                        JButton button21 = (JButton) e.getSource();
                            button21.setBackground(Color.BLACK);
                            button21.setOpaque(true);
                    }
                });
                pan[4][1] = new JButton("" + random10);
                pan[4][1].addActionListener(new ActionListener(){
                    public void actionPerformed(ActionEvent e){
                        JButton button22 = (JButton) e.getSource();
                            button22.setBackground(Color.BLACK);
                            button22.setOpaque(true);
                    }
                });
                pan[4][2] = new JButton("" + random15);
                pan[4][2].addActionListener(new ActionListener(){
                    public void actionPerformed(ActionEvent e){
                        JButton button23 = (JButton) e.getSource();
                            button23.setBackground(Color.BLACK);
                            button23.setOpaque(true);
                    }
                });
                pan[4][3] = new JButton("" + random20);
                pan[4][3].addActionListener(new ActionListener(){
                    public void actionPerformed(ActionEvent e){
                        JButton button24 = (JButton) e.getSource();
                            button24.setBackground(Color.BLACK);
                            button24.setOpaque(true);
                    }
                });
                pan[4][4] = new JButton("" + random25);
                pan[4][4].addActionListener(new ActionListener(){
                    public void actionPerformed(ActionEvent e){
                        JButton button25 = (JButton) e.getSource();
                            button25.setBackground(Color.BLACK);
                            button25.setOpaque(true);
                    }
                });
                /**
                 * Horizontal win
                 */
                if (pan[0][0].getBackground().equals(Color.black) && pan[0][1].getBackground().equals(Color.black)
                        && pan[0][2].getBackground().equals(Color.black)
                        && pan[0][3].getBackground().equals(Color.black)
                        && pan[0][4].getBackground().equals(Color.black)
                        || pan[1][0].getBackground().equals(Color.black)
                        && pan[1][1].getBackground().equals(Color.black)
                        && pan[1][2].getBackground().equals(Color.black)
                        && pan[1][3].getBackground().equals(Color.black)
                        && pan[1][4].getBackground().equals(Color.black)
                        || pan[2][0].getBackground().equals(Color.black)
                        && pan[2][1].getBackground().equals(Color.black)
                        && pan[2][2].getBackground().equals(Color.black)
                        && pan[2][3].getBackground().equals(Color.black)
                        && pan[2][4].getBackground().equals(Color.black)
                        || pan[3][0].getBackground().equals(Color.black)
                        && pan[3][1].getBackground().equals(Color.black)
                        && pan[3][2].getBackground().equals(Color.black)
                        && pan[3][3].getBackground().equals(Color.black)
                        && pan[3][4].getBackground().equals(Color.black)
                        || pan[4][0].getBackground().equals(Color.black)
                        && pan[4][1].getBackground().equals(Color.black)
                        && pan[4][2].getBackground().equals(Color.black)
                        && pan[4][3].getBackground().equals(Color.black)
                        && pan[4][4].getBackground().equals(Color.black)){
                    getNumber().setVisible(false);
                    getBtn().setEnabled(false);
                    getBtn().setText("You Win!");
                    pnlBot.add(again);
                    pnlBot.add(exit);
                }
                /**
                 * Vertical win
                 */
                /*if(pan[0][0] && pan[1][0]
                        && pan[2][0]
                        && pan[3][0]
                        && pan[4][0]
                        || pan[0][1]
                        && pan[0][]){
                    number.setVisible(false);
                    btn.setEnabled(false);
                    btn.setText("You Win!");
                    pnlBot.add(again);
                    pnlBot.add(exit);
                }*/
                /**
                 * Diagonal win
                 */
                /*if(pan[0][0]){
                    number.setVisible(false);
                    btn.setEnabled(false);
                    btn.setText("You Win!");
                    pnlBot.add(again);
                    pnlBot.add(exit);
                }*/

                pan[i][j].setFont(font);
                pan[i][j].setBorder(BorderFactory.createLineBorder(Color.BLACK));
                pnlMid.setBackground(Color.white);
                pnlMid.add(pan[i][j]);
            }
        }     
    }
    public void BotPanel(){
        pnlBot = new JPanel();
        pnlBot.setBackground(Color.WHITE);
        pnlBot.setLayout(new FlowLayout());
        number = new JLabel();
        Font font = new Font("", Font.BOLD, 20);
        number.setFont(font);
        btn = new JButton("Call the next number");
        btn.addActionListener(new RndButtonListener());
        pnlBot.add(btn);
        pnlBot.add(number);
    }
    private class RndButtonListener implements ActionListener{
        public void actionPerformed(ActionEvent e){
            ArrayList<Integer> array = new ArrayList<Integer>();
            int send = (int) (Math.random() * 75);
            int random;
            int rand;
            for (random = send; random < array.size(); random++) {
                array.add(random);
                /*for(rand = send; rand < array[random].size(); rand++){

                }*/
            }
            number.setText("" + random);
        }
    }
    public static void main(String args[]){new BingoGame();}
    public JButton getBtn(){return btn;}
    public JLabel getNumber(){return number;}
}
