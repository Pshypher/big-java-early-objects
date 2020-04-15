import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.geom.Line2D;
import java.awt.geom.Point2D;

public class SquareSpiral
{
    private int xLeft;
    private int yTop;
    private int turns;
    
    /**
        Constructs a square spiral whose center is at (x,y) and
        has numberOfTurns turns.
        @param x the x-coordinate of the center of the spiral
        @param y the y-coordinate of the center of the spiral
        @param turnings the number of turns in the spiral
    */
    public SquareSpiral(int x, int y, int turnings)
    {
        xLeft = x;
        yTop = y;
        turns = turnings;
    }
    
    /**
        Draws the square spiral
        @param g2 the graphics context
    */
    public void draw(Graphics2D g2)
    {
        g2.setColor(new Color(124, 17, 147));
        for (int i = 1; i <= turns; i++)
        {
            Point2D.Double v1 = new Point2D.Double(xLeft, yTop);
            int increasePerTurn = 3; // each turn in increased by this value 
            int delta = increasePerTurn * i;
            if (i == turns) { delta = delta - increasePerTurn * 2; }
            switch (i % 4)
            {
                case 1:
                    xLeft = xLeft + delta;
                    break;
                case 2:
                    yTop = yTop - delta;
                    break;
                case 3:
                    xLeft = xLeft - delta;
                    break;
                default:
                    yTop = yTop + delta;
                    break;
            }
            
            Point2D.Double v2 = new Point2D.Double(xLeft, yTop);
            Line2D.Double edge = new Line2D.Double(v1, v2);
            g2.draw(edge);   
        }
        
    }
}

