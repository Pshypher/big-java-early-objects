import java.awt.geom.Ellipse2D;
import java.awt.geom.Point2D;

import static java.lang.Math.*;

/**
    An utility class with several useful methods to calculate  
    the dimensions of an ellipse.
*/
public class Geometry
{
    /**
        Compute the minor axis of the ellipse.
        @param e the ellipse within a rectangle whose minor axis is the
        same as either the height or base of the bounding rectangle.
        @return the length of the minor axis.
    */
    public static double getMinorAxis(Ellipse2D.Double e)
    {
        double height = e.getHeight();
        double base = e.getWidth();
        
        if (height < base)
        {
            return height / 2;
        }
        else
        {
            return base / 2;
        }
    }
    
    /**
        Compute the major axis of the ellipse.
        @param e the ellipse within a rectangle whose major axis is the
        same as either the height or base of the bounding rectangle.
        @return the length of the major axis.
    */
    public static double getMajorAxis(Ellipse2D.Double e)
    {
        double height = e.getHeight();
        double base = e.getWidth();
        
        if (height > base)
        {
            return height / 2;
        }
        else
        {
            return base / 2;
        }
    }
        
   /**
        Calculates the perimeter of the ellipse.
        @param e the ellipse object.
        @return perimeter of the ellipse.
    */
    public static double perimeter(Ellipse2D.Double e)
    {
        double a = getMajorAxis(e);
        double b = getMinorAxis(e);
        
        double h = pow(a - b, 2) / pow(a + b, 2);
        
        double perimeter = PI * (a + b) * (1 + 
            3 * h /  (10 + sqrt(4 - 3 * h)));
            
        return perimeter;             
    }
    
    /**
        Calculate the area of the ellipse.
        @param e the ellipse whose area is calculated.
        @return area of the ellipse.
    */
    public static double area(Ellipse2D.Double e)
    {
        double area = PI * getMinorAxis(e) * getMajorAxis(e);
        return area;
    }
    
    /**
        Computes the angle between the x-axis and the line 
        joining the two points.
        @param p coordinate of the point that marks one of the
        ends of the line.
        @param q coordinate of the other end of the line.
        @return the angle between the line joining both points
        and the x-axis.
    */
    public static double angle(Point2D.Double p, Point2D.Double q)
    {
        double angle = toDegrees(atan(slope(p, q)));
        return angle;
    }
    
    /**
        Calculates the slope of the line joining two points.
        @param p coordinate of the point that marks one of the
        ends of the line.
        @param q coordinate of the other end of the line.
        @return the slope of the line between two points.
    */
    public static double slope(Point2D.Double p, Point2D.Double q)
    {
        double slope = 0;
        if (q.getX() - p.getX() != 0)
        {
            slope = (q.getY() - p.getY()) / (q.getX() - p.getX());
        }
        else
        {
            System.out.println("Slope is undefined.");
        }
        
        return slope; 
    }    
}