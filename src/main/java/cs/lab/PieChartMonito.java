package cs.lab;
import org.jfree.data.general.DefaultPieDataset;
import java.io.*;
import java.io.*;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PiePlot3D;
import org.jfree.data.general.DefaultPieDataset;

public class PieChartMonito {
    private PieChartMonito(){}
    public static void generatePiechart(int dataA, int dataB, int dataC, int dataD){
        DefaultPieDataset dataset=new DefaultPieDataset();
        dataset.setValue("dataA", dataA);
        dataset.setValue("dataB", dataB);
        dataset.setValue("dataC", dataC);
        dataset.setValue("dataD", dataD);
        JFreeChart piechart= ChartFactory.createpieChart3D("Piechart",dataset,true,true,false);
        final PiePlot3D plot=(PiePlot3D) Chart.getPlot();
        plot.setStartAngle(280);
        plot.setForegroundAlpha(0.5f);
        plot.setInteriorGap(0.02);
        File pieChart3D= new File("piechart.jpeg");
    }
}
