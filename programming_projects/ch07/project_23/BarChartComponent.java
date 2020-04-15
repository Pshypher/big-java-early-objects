import java.awt.Graphics;
import java.awt.Graphics2D;
import java.util.ArrayList;
import javax.swing.JComponent;

public class BarChartComponent extends JComponent
{
    private ArrayList<Double> dataSet;
    
    public BarChartComponent(ArrayList<Double> dataSet)
    {
        this.dataSet = dataSet;
    }
    
    public void paintComponent(Graphics g)
    {
        // recover the graphics2D object
        Graphics2D g2 = (Graphics2D) g;
        
        int gap = 20;
        double x = getWidth() / 2 - dataSet.size() * gap / 2;
        double y = getHeight();
        BarChart barChart = new BarChart(x, y);
        
        for (double datum : dataSet)
        {
            barChart.add(datum);
        }
        barChart.draw(g2);
    }
}