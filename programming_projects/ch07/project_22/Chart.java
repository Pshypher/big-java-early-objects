import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.geom.Line2D;
import java.util.ArrayList;

public class Chart
{
    private ArrayList<Integer> values;
    private double x;
    private double y; 
    
    public Chart(double xLeft, double yTop)
    {
        x = xLeft;
        y = yTop;
        values = new ArrayList<Integer>();    
    }
    
    public void add(int value)
    {
        values.add(value);
    }
    
    public void draw(Graphics2D g2)
    {
        int gap = 10;
        g2.setColor(Color.MAGENTA);
        
        for (int i = 0; i < values.size(); i++)
        {
            Line2D.Double stick = new Line2D.Double(
                x + (i * gap), y - values.get(i),
                x + (i * gap), y); 
            g2.draw(stick);
                            
        }
    }
}