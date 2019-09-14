package ChartTests;/*
 * Created by IntelliJ IDEA.
 * User: Nkem Ohanenye
 * Date: 10/20/17
 * Time: 2:39 PM
 */

/**
 * UNFINISHED
 */

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ScrollerTest extends JFrame {

    //private variables
    private JPanel top;
    private JPanel ePanel;
    private JPanel graphPanel;
    private JPanel scrollP;

    private JButton exit;

    private JScrollBar scroller;
    //private SlidingCategoryDataset dataset;

    public ScrollerTest(){

        //initiaing variables
        top = new JPanel();
        ePanel = new JPanel();
        graphPanel = new JPanel();
        scrollP = new JPanel();

        exit = new JButton("exit");

        scroller = new JScrollBar(Adjustable.HORIZONTAL);

        //Frame settings
        setSize(500,500);
        setResizable(false);
        setTitle("Chart Test Using JFreeChart");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new BorderLayout(5, 0));

        //panel settings
        graphPanel.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        ePanel.setBorder(BorderFactory.createLineBorder(Color.BLACK));

        top.setLayout(new BorderLayout());

        //Graph
        DefaultCategoryDataset barChartData = new DefaultCategoryDataset();
        // creates the values for the graph, assigns the value to the row, the column given a specific name
        barChartData.setValue(20000, "Contribution Amount", "JANUARY");
        barChartData.setValue(15000, "Contribution Amount", "FEBRUARY");
        barChartData.setValue(30000, "Contribution Amount", "MARCH");

        JFreeChart barChart = ChartFactory.createBarChart(          //creates bar chart
                "Church Contribution",          //Chart Title
                "Monthly",          //domain axis label
                "Contribution Amount",          //range axis label
                barChartData,                   //data
                PlotOrientation.VERTICAL,           //orientation
                false,              //include legend
                true,              //tooltips?
                false                 //URL?
        );

        CategoryPlot barchrt = barChart.getCategoryPlot();      //creates the plotted points
        barchrt.setRangeGridlinePaint(Color.ORANGE);        //changes the bar's color

        ChartPanel barPanel = new ChartPanel(barChart); //creates the chart panel
        //barPanel.setPreferredSize(new Dimension(460, 407));     //changes the size of the panel to fit the JPanel
        graphPanel.removeAll();                 //removes the previous panel before adding another one (prevent stacking)
        graphPanel.add(barPanel, BorderLayout.WEST);
        graphPanel.validate();          //similar to setVisible(true)

        //Scroller
        /*this.scroller.getModel().addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent changeEvent) {
                barChartData.setFirstCategoryIndex(this.scroller.getValue());
            }
        });*/

        //Action Listeners
        exit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {

                System.exit(0);

            }
        });

        //add to panel
        ePanel.add(exit);
        top.add(graphPanel);
        scrollP.add(scroller);
        top.add(scrollP, BorderLayout.SOUTH);

        //add to frame
        add(top);
        add(ePanel, BorderLayout.SOUTH);

        setVisible(true);

    }
    public static void main (String args[]){
        new ScrollerTest();
    }

}