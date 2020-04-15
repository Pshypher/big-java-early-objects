import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JComponent;

public class CheckerBoardComponent extends JComponent
{
    public static final int GRIDS = 64;
    public static final int COLUMNS = 8;
    
    public void paintComponent(Graphics g)
    {
        
        // recover the graphics2D object
        Graphics2D g2 = (Graphics2D) g;
        
        // create and fill a 2Dimensional-array of Colors 
        Color[][] pattern = new Color[GRIDS / COLUMNS][COLUMNS];
        
        for (int i = 0; i < GRIDS / COLUMNS; i++)
        {
            pattern[i] = new Color[COLUMNS];
            for (int j = 0; j < COLUMNS; j++)
            {
                if (i % 2 == j % 2)
                {
                    pattern[i][j] = Color.BLACK;
                }
                else
                {
                    pattern[i][j] = Color.WHITE;
                }
            }
        }
        
        
        int size = 50;  // size of each grid in pixels
        int x = getWidth() / 2 - size * COLUMNS / 2;
        int y = getHeight() / 2 - (size * GRIDS / COLUMNS) / 2;
        CheckerBoard board = new CheckerBoard(x, y, size, pattern);
        board.draw(g2);
    }
}