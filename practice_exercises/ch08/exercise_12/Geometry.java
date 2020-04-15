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
        Compute the center of the ellipse.
        @param e an ellipse on the coordinates of a graphics plane.
        @return center of the ellipse.
    */
    public static Point2D.Double ellipseCenter(Ellipse2D.Double e)
    {
        Point2D.Double center = new Point2D.Double(
            e.getX() + e.getWidth() * 0.5,
            e.getY() + e.getHeight() * 0.5);
        return center;
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
        Computes the sum of the distances between a point and 
        the two foci of the ellipse.
        @param p a point within the plane of the graphics coordinate.
        @param e ellipse equidistant from a point on its arc and its foci.
        @return the sum of the segments between a point and the two foci
        of the ellipse.
    */
    public static double pointFociLength(Point2D.Double p, Ellipse2D.Double e)
    {
        Point2D.Double c = ellipseCenter(e); 
        double focusLength = sqrt(pow(getMajorAxis(e), 2) - 
                                    pow(getMinorAxis(e), 2));
                                    
        Point2D.Double f1;
        Point2D.Double f2;
        if (e.getWidth() > e.getHeight())
        {
            f1 = new Point2D.Double(c.getX() - focusLength, c.getY());
            f2 = new Point2D.Double(c.getX() + focusLength, c.getY());
        }
        else
        {
            f1 = new Point2D.Double(c.getX(), c.getY() - focusLength);
            f2 = new Point2D.Double(c.getX(), c.getY() + focusLength);
        }
        
        double segmentTotal = distance(p, f1) + distance(p, f2);
        return segmentTotal;
    }
    
    /**
        Computes the distance between two points.
        @param a coordinate of point whose distance from another is calculated.
        @param b coordinate of the other point.
        @return distance between coordinates a and b.
    */
    private static double distance(Point2D.Double a, Point2D.Double b)
    {
        double length = sqrt(pow(a.getX() - b.getX(), 2) +
                                pow(a.getY() - b.getY(), 2));
        return length;                                
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
    
    /**
        Checks if a point is within or lies on the plane of
        an ellipses boundary.
        @param p a point surrounded by an ellipse or outside the
        plane of the ellipse
        @param e the ellipse used as the context to test where 
        the point lies.
        @return true if the point lies within the ellipse, false
        if it lies outside
    */
    public static boolean isInside(Point2D.Double p, Ellipse2D.Double e)
    {
        Point2D.Double c = ellipseCenter(e);
        Point2D.Double pt = new Point2D.Double(c.getX(), e.getY()); // arbritrary point
                                                                    // on ellipse arc                                                                                                   
        return pointFociLength(pt, e) > pointFociLength(p, e);
    }
    
    /**
        Checks if a point lies on the boundary of an
        ellipse
        @param p a point that 
        @param e the ellipse used as the context to test where 
        the point is.
        @return true if the point lies on the boundary of the ellipse,
        false otherwise.
    */
    public static boolean isOnBoundary(Point2D.Double p, Ellipse2D.Double e)
    {
        final double EPSILON = 1E-14;
        Point2D.Double c = ellipseCenter(e);
        Point2D.Double pt = new Point2D.Double(c.getX(), e.getY()); // arbritrary point
                                                                    // on ellipse arc                                                          
        return abs(pointFociLength(pt, e) -
            pointFociLength(p, e)) <= EPSILON;    
    }
}