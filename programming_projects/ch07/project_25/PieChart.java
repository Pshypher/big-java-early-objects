import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.geom.Arc2D;
import java.awt.geom.Rectangle2D;
import java.util.ArrayList;

public class PieChart
{
    private ArrayList<Double> dataSet;
    private double size;
    
    public PieChart(double size)
    {
        this.size = size;
        dataSet = new ArrayList<Double>();
    }
    
    public void add(double value)
    {
        dataSet.add(value);
    }
    
    public void draw(Graphics2D g2)
    { 
        double total = sum();
        double start = 0;
        Color[] colors = { Color.ORANGE, Color.YELLOW, Color.CYAN, 
             Color.GREEN, Color.PINK, Color.MAGENTA, Color.RED,
             Color.LIGHT_GRAY, Color.BLACK };
        Rectangle2D.Double box = new Rectangle2D.Double(0, 0, size, size);
        for (int i = 0; i < dataSet.size(); i++)
        {
            double angle = dataSet.get(i) / total * 360;
            g2.setColor(colors[i % colors.length]);
            Arc2D.Double arc = new Arc2D.Double(box, start, angle, Arc2D.PIE);
            g2.fill(arc);
            start = start + angle;
        }
    }
    
    public double sum()
    {   
        double total = 0;
        
        for (double value : dataSet)
        {
            total = total + value;
        }
        
        return total;
    }
}