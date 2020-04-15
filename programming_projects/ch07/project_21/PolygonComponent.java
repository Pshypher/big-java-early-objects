import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Point2D;
import javax.swing.JComponent;

public class PolygonComponent extends JComponent
{
    public void paintComponent(Graphics g)
    {
        // recover graphics2D object
        Graphics2D g2 = (Graphics2D) g;
        
        Polygon pentagon = new Polygon(5, 5);
        
        Point2D.Double p1 = new Point2D.Double(100, 0);
        Point2D.Double p2 = new Point2D.Double(150, 40);
        Point2D.Double p3 = new Point2D.Double(130, 95);
        Point2D.Double p4 = new Point2D.Double(70, 95);
        Point2D.Double p5 = new Point2D.Double(50, 40);
        
        Point2D.Double[] pentagonVertices = { p1, p2, p3, p4, p5 };
        for (Point2D.Double aPoint : pentagonVertices)
        {
            pentagon.add(aPoint);
        }
        pentagon.draw(g2);
        
        Polygon square = new Polygon(getWidth() / 2, getHeight() / 2);
        
        Point2D.Double v1 = new Point2D.Double(0, 0);
        Point2D.Double v2 = new Point2D.Double(100, 0);
        Point2D.Double v3 = new Point2D.Double(100, 100);
        Point2D.Double v4 = new Point2D.Double(0, 100);
        
        Point2D.Double[] squareVertices = { v1, v2, v3, v4 };
        for (Point2D.Double aPoint : squareVertices)
        {
            square.add(aPoint);
        }
        square.draw(g2);
    }
}