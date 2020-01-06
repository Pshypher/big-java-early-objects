import java.awt.Graphics2D;
import java.awt.geom.Line2D;
import java.awt.geom.Point2D; 

public class FourLeavedRose
{
    public static final double FULL_TURN = 2 * Math.PI;
    
    private int xLeft;
    private int yTop;
    private double scale;
    
    /**
        Constructor of four-leaved rose whose origin is at (x, y)
        @param x the x-coordinate of the first point of the rose
        @param y the y-coordinate of the first point of the rose
        @param k the scale-factor determines the size of the rose
         
    */
    public FourLeavedRose(int x, int y, double k)
    {
        xLeft = x;
        yTop = y;
        scale = k;    
    }
    
    /**
        Draw a four-leaved rose
        @param g2 the graphics context
    */
    public void draw(Graphics2D g2)
    {
        double step = FULL_TURN / 100;
        for (double theta = 0; theta < FULL_TURN; theta = theta + step)
        {
            Point2D.Double p0 = getPoint(theta, 0);
            Point2D.Double p1 = getPoint(theta, step);
            Line2D.Double edge = new Line2D.Double(p0, p1);
            g2.draw(edge);              
        }       
    }
    
    /**
        Computes a point that fall on the four-leaved rose 
        @param theta the angle of the point from 0 radians
        @param step the interval between each angle
    */
    public Point2D.Double getPoint(double theta, double step)
    {
        double radius = scale * Math.cos(2 * (theta + step));
        double x = radius * Math.cos(theta + step);
        double y = radius * Math.sin(theta + step);
        
        return new Point2D.Double(x + xLeft, y + yTop);
    }
    
}