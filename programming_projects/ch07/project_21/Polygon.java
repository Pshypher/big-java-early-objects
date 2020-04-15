import java.awt.Graphics2D;
import java.awt.geom.Line2D;
import java.awt.geom.Point2D;
import java.util.ArrayList;

public class Polygon
{
    private double x;
    private double y;
    private ArrayList<Point2D.Double> points;
    
    /**
        Constructs a Polygon with no vertices
        @param xLeft the horizontal distance from the left side 
        of the surrounding frame
        @param yTop the vertical distance from the top of the frame
    */
    public Polygon(double xLeft, double yTop)
    {
        x = xLeft;
        y = yTop;
        points = new ArrayList<Point2D.Double>();
    }
    
    /**
        Adds a point which is a vertex to this Polygon
        @param aPoint vertex of this Polygon 
    */
    public void add(Point2D.Double aPoint)
    {
        points.add(aPoint);  
    }
    
    /**
        Draws this Polygon
        @param g2 the graphics context
    */
    public void draw(Graphics2D g2)
    {
        for (int i = 0; i <= points.size(); i++)
        {
            Point2D.Double current = points.get(i % points.size());
            double x0 = current.getX();
            double y0 = current.getY();
            Point2D.Double next = points.get((i + 1) % points.size());
            double x1 = next.getX();
            double y1 = next.getY();
            Line2D.Double line = new Line2D.Double(x0 + x, 
                y0 + y, x1 + x, y1 + y);
            g2.draw(line);
        }
    }
}