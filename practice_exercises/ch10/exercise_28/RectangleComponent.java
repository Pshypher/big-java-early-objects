import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import javax.swing.JComponent;

/**
    This component displays a rectangle that can be moved. 
*/
public class RectangleComponent extends JComponent
{  
    private static final int BOX_X = 100;
    private static final int BOX_Y = 100;
    private static final int BOX_WIDTH = 20;
    private static final int BOX_HEIGHT = 30;

    private Rectangle box;
    private boolean moveLeft;
    private boolean moveUp;
    
    public RectangleComponent()
    {
        // The rectangle that the paintComponent method draws 
        box = new Rectangle(BOX_X, BOX_Y, BOX_WIDTH, BOX_HEIGHT);         
    }

    public void paintComponent(Graphics g)
    {  
        Graphics2D g2 = (Graphics2D) g;
        g2.draw(box);
    }

    /**
        Moves the rectangle by a given amount. 
        @param dx the amount to move in the x-direction 
        @param dy the amount to move in the y-direction 
    */
    public void moveRectangleBy(int dx, int dy)
    {
        redirect();
        if (moveLeft) { dx = -dx; }
        if (moveUp) { dy = -dy; }
        box.translate(dx, dy);
        repaint();      
    }
    
    /**
        Checks and adjusts accordingly the orientation of
        this rectangle
    */
    private void redirect()
    {
        if (box.getMaxX() >= getWidth()) 
        {
            moveLeft = true;
        }
        
        if (box.getX() <= 0) 
        {
            moveLeft = false;
        } 

        if (box.getMaxY() >= getHeight())
        {
            moveUp = true;
        }
        
        if (box.getY() <= 0) 
        {
            moveUp = false;
        }
    }
}
