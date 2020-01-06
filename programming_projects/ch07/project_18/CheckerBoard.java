import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.geom.Rectangle2D;

public class CheckerBoard
{

    private double x;
    private double y;
    private int size;
    private Color[][] pattern;
    
    /**
        Construct a CheckerBoard some (x, y) distance away from the 
        top-left corner of a frame, with alternate white and black
        color patterns
        @param xLeft the distance of this Checkerboard away from the left
        of the frame
        @param yTop distance of this CheckerBoard away from the top of the
        frame
        @param length the dimension of each square grid in this CheckerBoard
        @param form the alternate Colors used
    */
    public CheckerBoard(double xLeft, double yTop, int length, Color[][] form)
    {
        x = xLeft;
        y = yTop;
        size = length;
        pattern = form;
    }
    
    /**
        Draws this CheckerBoard on top of the enclosing frame
        @param g2 the graphics context
    */
    public void draw(Graphics2D g2)
    {
        for (int i = 0; i < pattern.length; i++)
        {
            for (int j = 0; j < pattern[i].length; j++)
            {
                Rectangle2D.Double square = new Rectangle2D.Double(
                    x + (size * j), y + (size * i), size, size);
                g2.setColor(pattern[i][j]);                    
                g2.fill(square);                  
            }
        }
    }
}