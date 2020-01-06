import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Point2D;
import java.util.ArrayList;

public class Cloud
{
    private ArrayList<Point2D.Double> points;
    
    /**
        Constructs a Cloud with no points in space
        @param width width of space surrounding this Cloud
        @param height height of the the surrounding space of 
        this Cloud 
    */
    public Cloud()
    {   
        points = new ArrayList<Point2D.Double>();           
    }
    
    /**
        Adds a Point to this Cloud
        @param aPoint point added to this Cloud
    */
    public void add(Point2D.Double aPoint)
    {
        points.add(aPoint);
    }
    
    /**
        Draws this Cloud
        @param g2 the graphics context
    */
    public void draw(Graphics2D g2)
    {
        for (int i = 0; i < points.size(); i++)
        {
            double x = points.get(i).getX();
            double y = points.get(i).getY();
            double r = 5;
            Ellipse2D.Double dot = new Ellipse2D.Double(
                                                        x - r / 2,
                                                        y - r / 2,
                                                            r, r);
            g2.draw(dot);
        } 
    }
}