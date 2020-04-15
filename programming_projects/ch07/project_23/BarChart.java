import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.geom.Line2D;
import java.awt.geom.Point2D;
import java.util.ArrayList;

public class BarChart
{
    private ArrayList<Double> values;
    private double x;
    private double y;
    
    /**
        Constructs an empty BarChart with no data
        @param xLeft the left position of the BarChart
        @param yBottom the position of each bar's base 
    */
    public BarChart(double xLeft, double yBottom)
    {
        x = xLeft;
        y = yBottom;
        values = new ArrayList<Double>();
    }
    
    /**
        Adds a value for this BarChart's data set
        @param value the value to be added
    */
    public void add(double value)
    {
        values.add(value);
    }
    
    /**
        Using the heights of each bar, calculates the y positions
        of the initial points of each line
        @return an ArrayList of doubles, y coordinates of the initial
        points on each bar
    */
    public ArrayList<Double> yCoordinates()
    {
        ArrayList<Double> ordinates = new ArrayList<Double>();
        double tallest = maximum();
        for (double barHeight : values)
        {
           
            double yPos = y - barHeight / tallest * y;
            ordinates.add(yPos);
        }
        
        return ordinates;
    }
    
    /**
        Draws each bar in this BarChart
        @param g2 the context of the graphics object
    */
    public void draw(Graphics2D g2)
    {
        int gap = 20;
        ArrayList<Double> ordinates = yCoordinates();
        g2.setColor(Color.MAGENTA);
        for (int i = 0; i < ordinates.size(); i++)
        {
            Point2D.Double top = new Point2D.Double(x + gap * i, 
                ordinates.get(i));
            Point2D.Double bottom = new Point2D.Double(x + gap * i, y);
            Line2D.Double bar = new Line2D.Double(top, bottom);
            g2.draw(bar);
        }    
    }
    
    /**
        Finds the largest value in this BarChart
        @return the tallest bar in this BarChart
    */
    public double maximum()
    {
        double tallest = values.get(0);
        for (int i = 1; i < values.size(); i++)
        {
            if (values.get(i) > tallest)
            {
                tallest = values.get(i);
            }
        }
        return tallest;
    }
}