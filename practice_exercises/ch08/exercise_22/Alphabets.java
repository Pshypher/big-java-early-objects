import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.awt.geom.Point2D;

public class Alphabets
{

    public static final int FONT_HEIGHT = 20;
    public static final int FONT_WIDTH = 12;
     
    /**
        Draw an H shape on the graphics window using lines.
        @param g2 the graphics context.
        @param p top left corner of the shape.
    */
    public static void drawH(Graphics2D g2, Point2D.Double p)
    {
        Line2D.Double v1 = new Line2D.Double(p.getX(), p.getY(),
            p.getX(), p.getY() + FONT_HEIGHT);
        Line2D.Double h = new Line2D.Double(p.getX(), p.getY() + FONT_HEIGHT
            * 0.5, p.getX() + FONT_WIDTH, p.getY() + FONT_HEIGHT * 0.5);
        Line2D.Double v2 = new Line2D.Double(p.getX() + FONT_WIDTH, p.getY(),
            p.getX() + FONT_WIDTH, p.getY() + FONT_HEIGHT);
        
        g2.draw(v1);
        g2.draw(h);
        g2.draw(v2);                                  
    }
    
    /**
        Using lines, draws an E shape on the graphics window.
        @param g2 the graphics context.
        @param p top left corner of the shape.
    */
    public static void drawE(Graphics2D g2, Point2D.Double p)
    {
        Line2D.Double v = new Line2D.Double(p.getX(), p.getY(),
            p.getX(), p.getY() + FONT_HEIGHT);
        Line2D.Double h1 = new Line2D.Double(p.getX(), p.getY(),
            p.getX() + FONT_WIDTH, p.getY());
        Line2D.Double h2 = new Line2D.Double(p.getX(), p.getY() + FONT_HEIGHT 
            * 0.5, p.getX() + FONT_WIDTH, p.getY() + FONT_HEIGHT * 0.5);
        Line2D.Double h3 = new Line2D.Double(p.getX(), p.getY() + FONT_HEIGHT,
            p.getX() + FONT_WIDTH, p.getY() + FONT_HEIGHT);
            
        g2.draw(v);
        g2.draw(h1);
        g2.draw(h2);
        g2.draw(h3);                                              
    }
    
    /**
        Using lines, draws an L shape on the graphics window.
        @param g2 the graphics context.
        @param p the top left corner of the shape.
    */
    public static void drawL(Graphics2D g2, Point2D.Double p)
    {
        Line2D.Double v = new Line2D.Double(p.getX(), p.getY(),
            p.getX(), p.getY() + FONT_HEIGHT);
        Line2D.Double h = new Line2D.Double(p.getX(), p.getY() + FONT_HEIGHT,
            p.getX() + FONT_WIDTH, p.getY() + FONT_HEIGHT);
            
        g2.draw(v);
        g2.draw(h);                      
    }
    
    /**
        Draws the O shape on the plane of the graphics coordinate.
        @param g2 the graphics context
        @param p top left corner of the shape. 
    */
    public static void drawO(Graphics2D g2, Point2D.Double p)
    {
        Ellipse2D.Double o = new Ellipse2D.Double(p.getX(), p.getY(),
            FONT_WIDTH, FONT_HEIGHT);
            
        g2.draw(o);                       
    }
}