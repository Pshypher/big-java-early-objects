import java.util.ArrayList;
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JComponent;

public class PieChartComponent extends JComponent
{
    private ArrayList<Double> data;
    private PieChart pieChart;
    
    public PieChartComponent(ArrayList<Double> dataValues)
    {
        data = dataValues;            
    }
    
    public void paintComponent(Graphics g)
    {
        // recover graphics2D object
        Graphics2D g2 = (Graphics2D) g;
        double size = (getWidth() < getHeight()) ? getWidth() : getHeight(); 
        PieChart pieChart = new PieChart(size);
        for (double value : data)
        {
            pieChart.add(value);
        }
        pieChart.draw(g2);
    }
}