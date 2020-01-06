import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Rectangle;

/**
    Draws a pattern of black and white tiles consisting
    of 64 rows and columns
    
*/
public class CheckerBoard
{
    public static final int GRIDS = 64;
    
    private int xLeft;
    private int yTop;
    private int length;
    
    /**
        Constructs a checker board at the top-left corner (x, y)
        @param x the x coordinate of the checkerboard
        @param y the y coordinate of the checkerboard
        @param sideLength the length of the checkboard
    */
    public CheckerBoard(int x, int y, int sideLength)
    {
        xLeft = x;
        yTop = y;
        length = sideLength;
    }
    
    
    /**
        Draws a 64 x 64 square grid checkerboard pattern
        @param g2 the graphics context
    */
    public void draw(Graphics2D g2)
    {
        int gridSize = length / GRIDS;
        for (int y = yTop; y < yTop + length; y = y + gridSize)
        {
            int rowNumber = (y - yTop) / GRIDS;
            for (int x = xLeft; x < xLeft + length; x = x + gridSize)
            {
                
                int colNumber = (x - xLeft) / GRIDS;
                Rectangle square = new Rectangle(x, y, gridSize, gridSize);
                if (rowNumber % 2 == colNumber % 2)
                {
                    g2.setColor(Color.BLACK);
                    g2.fill(square);         
                }
                else
                {
                    g2.setColor(Color.WHITE);
                    g2.fill(square);
                    
                }
            }
        }  
    }    
}