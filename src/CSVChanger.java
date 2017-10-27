/*
 * Created by IntelliJ IDEA.
 * User: otakusenseihig
 * Date: 10/13/17
 * Time: 10:09 AM
 */


import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.chart.plot.XYPlot;
import org.jfree.data.xy.XYSeries;
import org.jfree.data.xy.XYSeriesCollection;

import javax.swing.*;
import java.awt.*;
import java.io.File;
import java.util.Scanner;

public class CSVChanger extends JFrame{

    private JPanel chart;

    private Scanner csv;

    public CSVChanger() {

        //variable initiators
        chart = new JPanel();

        //frame settings
        setSize(500, 500);
        setTitle("CSV Changer");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setBackground(Color.white);

        //panel settings
        chart.setBackground(Color.white);

        XYSeriesCollection scatterChartData = new XYSeriesCollection();         // creates the collection

        //creates and add points of the scatterplot
        XYSeries set1 = new XYSeries("Set 1");
        XYSeries set2 = new XYSeries("Set 2");
        XYSeries set3 = new XYSeries("Set 3");

        JFreeChart scatterChart = ChartFactory.createScatterPlot(          //creates scatter chart
                "CSV Test",          //Chart Title
                "Placement",          //domain axis label
                "File Numbers",          //range axis label
                scatterChartData,                   //data
                PlotOrientation.VERTICAL,           //orientation
                true,              //include legend
                true,              //tooltips?
                false                 //URL?
        );

        //creates the plot
        XYPlot plot = (XYPlot) scatterChart.getPlot();
        plot.setNoDataMessage("NO DATA"); //error message
        plot.setBackgroundPaint(new Color(0,0,0));

        //open file
        try {
            csv = new Scanner(new File("test.csv"));
        } catch (Exception e) {
            System.out.println("could not find file");
        }

        //reading file
        while (csv.hasNextLine()) {
            String a = csv.nextLine();

            //converts the string to an int and ignores the ","
            int aI = Integer.parseInt(a.split(",")[0]);
            int bI = Integer.parseInt(a.split(",")[1]);
            int cI = Integer.parseInt(a.split(",")[2]);
            int dI = Integer.parseInt(a.split(",")[3]);
            int eI = Integer.parseInt(a.split(",")[4]);
            int fI = Integer.parseInt(a.split(",")[5]);
            int gI = Integer.parseInt(a.split(",")[6]);
            int hI = Integer.parseInt(a.split(",")[7]);
            int iI = Integer.parseInt(a.split(",")[8]);
            int jI = Integer.parseInt(a.split(",")[9]);

            //ads points to sets
            set1.add(1, aI);
            set1.add(2, bI);
            set1.add(3, cI);
            set2.add(4, dI);
            set2.add(5, eI);
            set2.add(6, fI);
            set2.add(7, gI);
            set3.add(8, hI);
            set3.add(9, iI);
            set3.add(10, jI);

        }
        //adds the series to the chart
        scatterChartData.addSeries(set1);
        scatterChartData.addSeries(set2);
        scatterChartData.addSeries(set3);

        //creates the chart's panel and adds to the pain panel
        ChartPanel scatterPanel = new ChartPanel(scatterChart); //creates the chart panel
        scatterPanel.setMouseWheelEnabled(true);            //lets zoom by mouse scroller
        scatterPanel.setPreferredSize(new Dimension(480, 460));     //changes the size of the panel to fit the JPanel
        chart.removeAll();                 //removes the previous panel before adding another one (prevent stacking)
        chart.add(scatterPanel, BorderLayout.CENTER);
        chart.validate();          //similar to setVisible(true)

        //add to frame
        add(chart);

        //closes file
        csv.close();

        //visible
        setVisible(true);
    }
    public static void main (String args[]){
        new CSVChanger();
    }
}