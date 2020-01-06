import java.awt.Graphics2D;
import java.awt.geom.Line2D;
import java.awt.geom.Point2D;

/**
    This class is a sketch the  curve f(x) = 0.00005x^3 - 0.03x^2 + 4x + 200
    where x ranges from 0 to 400 
*/
public class Curve
{
    private int xLeft;
    private int yTop;

    /**
        Constructor for the curve f(x) = 0.00005x^3 - 0.03x^2 + 4x + 200
        @param x the x-coordinate of the origin of the curve
        @param y the y-coordinate for the origin of the curve
    */
    public Curve(int x, int y)
    {
        xLeft = x;
        yTop = y;  
    }
    
    /**
        Generates a sketch of the curve f(x) = 0.00005x^3 - 0.03x^2 + 4x + 200
        @param g2 the graphics context
    */
    public void draw(Graphics2D g2)
    {
        double xMin = 0;
        double xMax = 400;
        double d = (xMax - xMin) / 100.0;
        for (double x = 0; x < xMax; x = x + d)
        {    
            Point2D.Double p0 = getPoint(x);
            Point2D.Double p1 = getPoint(x + d);
            Line2D.Double edge = new Line2D.Double(p0, p1);
            
            g2.draw(edge);         
        }  
    }
    
    /**
        Calculates a value for y from a corresponding value of x
        and returns the point on the curve
        @param x the x-coordinate for a point on the curve
        @return a point that fall on the curve 
        f(x) = 0.00005x^3 - 0.03x^2 + 4x + 200 
    */
    public Point2D.Double getPoint(double x)
    { 
        double y = 0.00005 * Math.pow(x, 3) - 0.03 * 
                Math.pow(x, 2) + 4 * x + 200;
        return new Point2D.Double(x + xLeft, y + yTop);                
    } 
}
