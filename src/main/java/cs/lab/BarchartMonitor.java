package cs.lab;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PiePlot3D;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;

import java.io.File;

public class BarchartMonitor {
    private BarchartMonitor(){}
    public static void generateBarchart(int dataA, int dataB, int dataC, int dataD){
        final DefaultCategoryDataset dataset=new DefaultCategoryDataset();
        dataset.setValue(dataA,"A","Variables");
        dataset.setValue(dataB,"B","Variables");
        dataset.setValue(dataC,"C","Variables");
        dataset.setValue(dataD,"D","Variables");
        JFreeChart barchart= ChartFactory.createBarChart("Barchart","","value",dataset, PlotOrientation.VERTICAL,true,true,false);
        File pieChart3D= new File("barchart.jpeg");

    }
}
