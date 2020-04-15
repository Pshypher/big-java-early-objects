import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Point2D;

/**
    An ellipse is drawn to represent the letter O. 
*/
public class LetterO
{
    private double x;
    private double y;
    
    /**
        Construct a class that handles the drawing of the letter O.
        @param p of the top-left corner of the shape.
    */
    public LetterO(Point2D.Double p)
    {
        x = p.getX();
        y = p.getY();
    }
    
    /**
        draw a shape for this LetterO
        @param g2 the graphics context
    */
    public void draw(Graphics2D g2)
    {
        final int FONT_HEIGHT = 20;
        final int FONT_WIDTH = 12;
    
        Ellipse2D.Double o = new Ellipse2D.Double(x, y, FONT_WIDTH,
            FONT_HEIGHT);     
        g2.draw(o);
    }
}  