//import org.jfree.data.category.DefaultCategoryDataset;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/*
 * Created by IntelliJ IDEA.
 * User: otakusenseihig
 * Date: 10/18/17
 * Time: 2:28 PM
 */

public class ChartTest extends JFrame{

    private JPanel top;
    private JPanel bottom;
    private JPanel buttons;
    private JPanel graphPanel;
    private JPanel linePanel;

    private JButton graphChart;
    private JButton lineChart;

    public ChartTest(){

        //initiaing variables
        top = new JPanel();
        //bottom = new JPanel();
        buttons = new JPanel();
        graphPanel = new JPanel();
        linePanel = new JPanel();

        graphChart = new JButton("Graph Chart");
        lineChart = new JButton("Line Chart");

        //Frame settings
        setSize(500,500);
        setTitle("Chart Test Using JFreeChart");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new BorderLayout(20, 0));


        //panel settings
        graphPanel.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        linePanel.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        buttons.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        buttons.setLayout(new FlowLayout());
        //top.setLayout(new FlowLayout());

        //methods
        graphChart.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {


            }
        });

        //add to panel
        buttons.add(graphChart);
        buttons.add(lineChart);

        top.add(graphPanel);
        top.add(linePanel);

        //add to frame
        add(top);
        add(buttons, BorderLayout.SOUTH);

        //visible
        setVisible(true);

    }
    public static void main(String args[]){
        new ChartTest();
    }
}