import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.util.ArrayList; 
import javax.swing.JComponent;

/**
    This component displays a rectangle that can be moved. 
*/
public class RectangleComponent2 extends JComponent
{
    private static final int BOX_WIDTH = 20;
    private static final int BOX_HEIGHT = 30;

    private ArrayList<Rectangle> boxes;

    public RectangleComponent2()
    {  
        // The rectangle that the paintComponent method draws 
        boxes = new ArrayList<Rectangle>();         
    }

    public void paintComponent(Graphics g)
    {  
        Graphics2D g2 = (Graphics2D) g;
        for (Rectangle box : boxes)
        {
            g2.draw(box);
        } 
    }

    /**
        Adds a rectangle to the given location on this component.
        @param x the x-position of the new rectangle
        @param y the y-position of the new rectangle
    */
    public void addRectangle(int x, int y)
    {
        Rectangle box = new Rectangle(x, y, BOX_WIDTH, BOX_HEIGHT);
        boxes.add(box);
        repaint();      
    }
}
