import java.awt.Graphics2D;
import java.awt.geom.Line2D;
import java.awt.geom.Point2D;

/**
    Stroke of lines drawn to display the H shape 
*/
public class LetterH
{      
    private double x;
    private double y;
    
    /**
        Construct a class that handles the drawing of the letter H.
        @param p of the top-left corner of the shape.
    */
    public LetterH(Point2D.Double p)
    {
        x = p.getX();
        y = p.getY();
    }
    
    /**
        draw a shape for this LetterH
        @param g2 the graphics context
    */
    public void draw(Graphics2D g2)
    {
        final int FONT_HEIGHT = 20;
        final int FONT_WIDTH = 12;

        Line2D.Double v1 = new Line2D.Double(x, y, x, y + FONT_HEIGHT);
        Line2D.Double h = new Line2D.Double(x, y + FONT_HEIGHT * 0.5, x + 
            FONT_WIDTH, y + FONT_HEIGHT * 0.5);
        Line2D.Double v2 = new Line2D.Double(x + FONT_WIDTH, y, x + FONT_WIDTH,
            y + FONT_HEIGHT);
        
        g2.draw(v1);
        g2.draw(h);
        g2.draw(v2);   
    }
}  