package ChartTests;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.annotations.XYPointerAnnotation;
import org.jfree.chart.axis.NumberAxis;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.PiePlot;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.chart.plot.XYPlot;
import org.jfree.chart.renderer.xy.XYLineAndShapeRenderer;
import org.jfree.chart.title.TextTitle;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.data.function.Function2D;
import org.jfree.data.function.NormalDistributionFunction2D;
import org.jfree.data.general.DatasetUtilities;
import org.jfree.data.general.DefaultPieDataset;
import org.jfree.data.xy.XYSeries;
import org.jfree.data.xy.XYSeriesCollection;
import org.jfree.ui.TextAnchor;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/*
 * Created by IntelliJ IDEA.
 * User: Nkem Ohanenye
 * Date: 10/18/17
 * Time: 2:28 PM
 */

public class ChartTest extends JFrame{

    //private variables
    private JPanel top;
    private JPanel bottom;
    private JPanel gP;
    private JPanel exitP;
    private JPanel lXY;
    private JPanel graphPanel;
    private JPanel linePanel;

    private JButton graphChart;
    private JButton pieChart;
    private JButton lineChart;
    private JButton xyChart;
    private JButton scatterChart;
    private JButton exit;

    public ChartTest(){

        //initiaing variables
        top = new JPanel();
        bottom = new JPanel();
        gP = new JPanel();
        exitP = new JPanel();
        lXY = new JPanel();
        graphPanel = new JPanel();
        linePanel = new JPanel();

        graphChart = new JButton("Graph Chart");
        pieChart = new JButton("Pie Chart");
        lineChart = new JButton("Line Chart");
        xyChart = new JButton("XY Chart");
        scatterChart = new JButton("Scatter Plot");
        exit = new JButton("exit");

        //Frame settings
        setSize(1000,500);
        setResizable(false);
        setTitle("Chart Test Using JFreeChart");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new BorderLayout(5, 5));
        setBackground(Color.BLACK);


        //panel settings
        graphPanel.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        linePanel.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        gP.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        exitP.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        lXY.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        bottom.setBorder(BorderFactory.createLineBorder(Color.BLACK));

        graphPanel.setPreferredSize(new Dimension(470,410));
        linePanel.setPreferredSize(new Dimension(470,410));

        graphPanel.setBackground(Color.white);
        linePanel.setBackground(Color.white);
        top.setBackground(Color.black);
        bottom.setBackground(Color.red);

        top.setLayout(new FlowLayout());
        gP.setLayout(new FlowLayout());
        lXY.setLayout(new FlowLayout());

        //Action Listeners
        graphChart.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {

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
                barPanel.setPreferredSize(new Dimension(460, 400));     //changes the size of the panel to fit the JPanel
                graphPanel.removeAll();                 //removes the previous panel before adding another one (prevent stacking)
                graphPanel.add(barPanel, BorderLayout.CENTER);
                graphPanel.validate();          //similar to setVisible(true)

            }
        });

        pieChart.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {

                DefaultPieDataset pieChartData = new DefaultPieDataset();
                pieChartData.setValue("JANUARY", 30.77);        //title of part, value of part
                pieChartData.setValue("FEBRUARY", 23.08);
                pieChartData.setValue("MARCH", 46.15);

                JFreeChart pieChart = ChartFactory.createPieChart(          //creates bar chart
                        "Church Contribution",          //Chart Title
                        pieChartData,                   //data
                        false,              //include legend
                        true,              //tooltips?
                        false                 //URL?
                );

                pieChart.addSubtitle(new TextTitle("Contribution Amount",
                        new Font("Dialog", Font.PLAIN, 12)));        //adds subtitle above pie chart
                PiePlot plot1 = (PiePlot) pieChart.getPlot();      //creates the plotted points
                plot1.setCircular(true);            //keeps circle circular despite frame/panel size and dimension
                plot1.setInteriorGap(0.04);             //increases gap from edge of graph
                plot1.setMaximumLabelWidth(0.20);           //sets pie in middle at reasonable size

                ChartPanel piePanel = new ChartPanel(pieChart); //creates the chart panel
                piePanel.setPreferredSize(new Dimension(460, 400));     //changes the size of the panel to fit the JPanel
                graphPanel.removeAll();                 //removes the previous panel before adding another one (prevent stacking)
                graphPanel.add(piePanel, BorderLayout.CENTER);
                graphPanel.validate();          //similar to setVisible(true)

            }
        });

        lineChart.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {

                DefaultCategoryDataset lineChartData = new DefaultCategoryDataset();
                // creates the values for the graph, assigns the value to the row, the column given a specific name
                lineChartData.setValue(20000, "Contribution Amount", "JANUARY");
                lineChartData.setValue(15000, "Contribution Amount", "FEBRUARY");
                lineChartData.setValue(30000, "Contribution Amount", "MARCH");

                JFreeChart lineChart = ChartFactory.createLineChart(            //creates line chart
                        "Church Contribution",          //Chart Title
                        "Monthly",          //domain axis label
                        "Contribution Amount",          //range axis label
                        lineChartData,                   //data
                        PlotOrientation.VERTICAL,           //orientation
                        false,              //include legend
                        true,              //tooltips?
                        false                 //URL?
                );

                CategoryPlot linechrt = lineChart.getCategoryPlot();        //creates the plotted points
                linechrt.setRangeGridlinePaint(Color.GREEN);            //changes the bar's color

                ChartPanel linePlane = new ChartPanel(lineChart); //creates the chart panel
                linePlane.setPreferredSize(new Dimension(460, 400));    //changes the size of the panel to fit the JPanel
                linePanel.removeAll();                  //removes the previous panel before adding another one (prevent stacking)
                linePanel.add(linePlane, BorderLayout.CENTER);
                linePanel.validate();           //similar to setVisible(true)

            }
        });

        xyChart.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {

                XYSeriesCollection xyChartData = new XYSeriesCollection();      //creates collection

                //creates the graphs
                Function2D n1 = new NormalDistributionFunction2D(0.0, 1.0);
                XYSeries s1 = DatasetUtilities.sampleFunction2DToSeries(n1, -5.1, 5.1,
                        121, "N1");
                xyChartData.addSeries(s1);

                Function2D n2 = new NormalDistributionFunction2D(0.0, Math.sqrt(0.2));
                XYSeries s2 = DatasetUtilities.sampleFunction2DToSeries(n2, -5.1, 5.1,
                        121, "N2");
                xyChartData.addSeries(s2);

                Function2D n3 = new NormalDistributionFunction2D(0.0, Math.sqrt(5.0));
                XYSeries s3 = DatasetUtilities.sampleFunction2DToSeries(n3, -5.1, 5.1,
                        121, "N3");
                xyChartData.addSeries(s3);

                Function2D n4 = new NormalDistributionFunction2D(-2.0, Math.sqrt(0.5));
                XYSeries s4 = DatasetUtilities.sampleFunction2DToSeries(n4, -5.1, 5.1,
                        121, "N4");
                xyChartData.addSeries(s4);

                /*DefaultCategoryDataset xyChartData = new DefaultCategoryDataset();
                // creates the values for the graph, assigns the value to the row, the column given a specific name
                xyChartData.setValue(20000, "Contribution Amount", "JANUARY");
                xyChartData.setValue(15000, "Contribution Amount", "FEBRUARY");
                xyChartData.setValue(30000, "Contribution Amount", "MARCH");*/

                JFreeChart xyChart = ChartFactory.createXYLineChart(          //creates xy chart
                        "Church Contribution",          //Chart Title
                        "Monthly",          //domain axis label
                        "Contribution Amount",          //range axis label
                        xyChartData,                   //data
                        PlotOrientation.VERTICAL,           //orientation
                        true,              //include legend
                        true,              //tooltips?
                        false                 //URL?
                );

                XYPlot plot = (XYPlot) xyChart.getPlot();

                //change the other lines dashed
                XYLineAndShapeRenderer r = (XYLineAndShapeRenderer) plot.getRenderer();
                r.setDrawSeriesLineAsPath(true);
                r.setSeriesStroke(0, new BasicStroke(1.5f));
                r.setSeriesStroke(1, new BasicStroke(2.0f, BasicStroke.CAP_ROUND,
                        BasicStroke.JOIN_ROUND, 1.0f, new float[] { 6.0f, 4.0f },
                        0.0f));
                r.setSeriesStroke(2, new BasicStroke(2.0f, BasicStroke.CAP_ROUND,
                        BasicStroke.JOIN_ROUND, 1.0f, new float[] { 6.0f, 4.0f, 3.0f,
                        3.0f }, 0.0f));
                r.setSeriesStroke(3, new BasicStroke(2.0f, BasicStroke.CAP_ROUND,
                        BasicStroke.JOIN_ROUND, 1.0f, new float[] { 4.0f, 4.0f },
                        0.0f));

                //creates annotations on graph
                XYPointerAnnotation a1 = new XYPointerAnnotation(
                        "\u03BC = -2.0, \u03C3\u00B2 = 0.5", -2.0, 0.564,
                        5 * Math.PI / 4);
                a1.setLabelOffset(4.0);
                a1.setTextAnchor(TextAnchor.BOTTOM_RIGHT);
                a1.setBackgroundPaint(Color.yellow);
                // a1.setOutlineVisible(true);
                plot.addAnnotation(a1);

                XYPointerAnnotation a2 = new XYPointerAnnotation(
                        "\u03BC = 0.0, \u03C3\u00B2 = 0.2", 0.225, 0.80, 0.0);
                a2.setLabelOffset(4.0);
                a2.setTextAnchor(TextAnchor.CENTER_LEFT);
                a2.setBackgroundPaint(new Color(0, 0, 255, 63));
                // a2.setOutlineVisible(true);
                plot.addAnnotation(a2);

                XYPointerAnnotation a3 = new XYPointerAnnotation(
                        "\u03BC = 0.0, \u03C3\u00B2 = 1.0", 0.75, 0.3, 7 * Math.PI / 4);
                a3.setLabelOffset(4.0);
                a3.setTextAnchor(TextAnchor.HALF_ASCENT_LEFT);
                a3.setBackgroundPaint(new Color(255, 0, 0, 63));
                // a3.setOutlineVisible(true);
                plot.addAnnotation(a3);

                XYPointerAnnotation a4 = new XYPointerAnnotation(
                        "\u03BC = 0.0, \u03C3\u00B2 = 5.0", 3.0, 0.075,
                        3 * Math.PI / 2);
                a4.setLabelOffset(4.0);
                a4.setTextAnchor(TextAnchor.BOTTOM_CENTER);
                a4.setBackgroundPaint(new Color(0, 255, 0, 63));
                // a4.setOutlineVisible(true);
                plot.addAnnotation(a4);

                ChartPanel xyPanel = new ChartPanel(xyChart); //creates the chart panel
                xyPanel.setPreferredSize(new Dimension(460, 400));     //changes the size of the panel to fit the JPanel
                linePanel.removeAll();                 //removes the previous panel before adding another one (prevent stacking)
                linePanel.add(xyPanel, BorderLayout.CENTER);
                linePanel.validate();          //similar to setVisible(true)

            }
        });

        scatterChart.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {

                XYSeriesCollection scatterChartData = new XYSeriesCollection();         // creates the collection

                //creates and add points of the scatterplot
                XYSeries jan = new XYSeries("JANUARY");
                    jan.add(1,1400);
                    jan.add(2,3400);
                    jan.add(3,2124);
                    jan.add(4,4600);
                    jan.add(5,5400);
                    jan.add(6,5800);
                    jan.add(7,6000);
                    jan.add(8,7829);
                    jan.add(9,8934);
                    jan.add(10,9573);
                scatterChartData.addSeries(jan);

                XYSeries feb = new XYSeries("FEBRUARY");
                    feb.add(1,1273);
                    feb.add(2,1378);
                    feb.add(3,1498);
                    feb.add(4,2849);
                    feb.add(5,3905);
                    feb.add(6,3859);
                    feb.add(7,4895);
                    feb.add(8,5953);
                    feb.add(9,6394);
                    feb.add(10,9248);
                scatterChartData.addSeries(feb);

                XYSeries mar = new XYSeries("MARCH");
                    mar.add(1,3498);
                    mar.add(2,3829);
                    mar.add(3,4853);
                    mar.add(4,4830);
                    mar.add(5,5239);
                    mar.add(6,5739);
                    mar.add(7,5930);
                    mar.add(8,6893);
                    mar.add(9,7343);
                    mar.add(10,8473);
                scatterChartData.addSeries(mar);


                JFreeChart scatterChart = ChartFactory.createScatterPlot(          //creates scatter chart
                        "Church Contribution",          //Chart Title
                        "Monthly",          //domain axis label
                        "Contribution Amount",          //range axis label
                            scatterChartData,                   //data
                        PlotOrientation.VERTICAL,           //orientation
                        true,              //include legend
                        true,              //tooltips?
                        false                 //URL?
                );

                //creates the plot
                XYPlot plot = (XYPlot) scatterChart.getPlot();
                plot.setNoDataMessage("NO DATA"); //error message
                plot.setBackgroundPaint(new Color(255, 150, 255)); //adds color to the chart

                plot.setDomainPannable(true);
                plot.setRangePannable(true);
                plot.setDomainZeroBaselineVisible(true);            //visible line for domain
                plot.setRangeZeroBaselineVisible(true);             //visible line for range

                //creates lines on the grid
                plot.setDomainGridlineStroke(new BasicStroke(0.0f));
                plot.setDomainMinorGridlineStroke(new BasicStroke(0.0f));
                plot.setDomainGridlinePaint(Color.blue);
                plot.setRangeGridlineStroke(new BasicStroke(0.0f));
                plot.setRangeMinorGridlineStroke(new BasicStroke(0.0f));
                plot.setRangeGridlinePaint(Color.blue);

                //sets visible
                plot.setDomainMinorGridlinesVisible(true);
                plot.setRangeMinorGridlinesVisible(true);

                //creates shape's outline
                XYLineAndShapeRenderer renderer
                        = (XYLineAndShapeRenderer) plot.getRenderer();
                renderer.setSeriesOutlinePaint(0, Color.black);
                renderer.setUseOutlinePaint(true);
                NumberAxis domainAxis = (NumberAxis) plot.getDomainAxis();
                domainAxis.setAutoRangeIncludesZero(false);

                //controls the ticks to be changed "blue lines"
                domainAxis.setTickMarkInsideLength(2.0f);
                domainAxis.setTickMarkOutsideLength(2.0f);

                domainAxis.setMinorTickCount(2);
                domainAxis.setMinorTickMarksVisible(true);

                NumberAxis rangeAxis = (NumberAxis) plot.getRangeAxis();
                rangeAxis.setTickMarkInsideLength(2.0f);
                rangeAxis.setTickMarkOutsideLength(2.0f);
                rangeAxis.setMinorTickCount(2);
                rangeAxis.setMinorTickMarksVisible(true);

                ChartPanel scatterPanel = new ChartPanel(scatterChart); //creates the chart panel
                scatterPanel.setMouseWheelEnabled(true);            //lets zoom by mouse scroller
                scatterPanel.setPreferredSize(new Dimension(460, 400));     //changes the size of the panel to fit the JPanel
                linePanel.removeAll();                 //removes the previous panel before adding another one (prevent stacking)
                linePanel.add(scatterPanel, BorderLayout.CENTER);
                linePanel.validate();          //similar to setVisible(true)

            }
        });

        exit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {

                System.exit(0);

            }
        });

        //add to panel
        gP.add(graphChart);
        gP.add(pieChart);
        exitP.add(exit);
        lXY.add(lineChart);
        lXY.add(xyChart);
        lXY.add(scatterChart);
        top.add(graphPanel);
        top.add(linePanel);
        bottom.add(gP);
        bottom.add(exitP);
        bottom.add(lXY);

        //add to frame
        add(top);
        add(bottom, BorderLayout.SOUTH);

        //visible
        setVisible(true);

    }
    public static void main(String args[]){
        new ChartTest();
    }
}