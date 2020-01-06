import java.awt.Graphics2D;
import java.awt.geom.Line2D;
import java.awt.geom.Point2D;

public class SineWave
{
    private double x;
    private double height;
    private double step;
    private double[] sineValues;
    
    /**
        Constructor of a SineWave from 0 to 360 degrees at the 
        top-left corner of the frame (x, y)
        @param x the horizontal left position from which this
        SineWave extends
        @param height the height of the frame enclosing this Sinewave
        @param step the gap between consecutive angles in this SineWave
        @param angles an array of integers, angles in this SineWave
    */
    public SineWave(double x, double height, int step, int[] angles)
    {
        this.x = x;
        this.height = height;
        this.step = step;
        sineValues = new double[angles.length];
        
        for (int i = 0 ; i < angles.length; i++)
        {
            sineValues[i] = Math.sin(Math.toRadians(angles[i]));
        } 
    }
    
    /**
        Draw this SineWave
        @param the graphics context
    */
    public void draw(Graphics2D g2)
    {
        
        double highest = maximum();      
        for (int i = 0; i < sineValues.length; i++)
        {
            double middle = height / 2;
            Point2D.Double p1 = new Point2D.Double(x + step * i, 
                middle - sineValues[i] / highest * middle);
            Point2D.Double p2 = new Point2D.Double(x + step * i,
                middle);
            Line2D.Double line = new Line2D.Double(p1, p2);
            g2.draw(line);                          
        }
    }
    
    /**
        Finds the largest value in this SineWave
        @return the largest sine value
    */
    public double maximum()
    {
        double largest = sineValues[0];
        for (int i = 1; i < sineValues.length; i++)
        {
            if (sineValues[i] > largest)
            {
                largest = sineValues[i];
            }
        }
        
        return largest;
    }
}
