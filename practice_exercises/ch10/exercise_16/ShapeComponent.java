import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.Shape;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import javax.swing.JComponent;
import java.util.Random;

public class ShapeComponent extends JComponent
{    
    private Random generator;
    
    public ShapeComponent()
    {
        generator = new Random();
    }
    
    public void paintComponent(Graphics g)
    {
        final int MAX_SHAPES = 10;
        
        Graphics2D g2 = (Graphics2D) g;
        
        for (int i = 1; i <= MAX_SHAPES; i++)
        {
            Shape s = randomShape();
            g2.draw(s);
        }
    }
    
    private Shape randomShape()
    {
        int choice = generator.nextInt(3);
        
        Shape s;
        switch (choice)
        {
            case 0:
                int xLeft = generator.nextInt(getWidth());
                int yTop = generator.nextInt(getHeight());
                s = new Rectangle(xLeft, yTop, 100, 50);
                break;
            case 1:
                xLeft = generator.nextInt(getWidth());
                yTop = generator.nextInt(getHeight());
                s = new Ellipse2D.Double(xLeft, yTop, 130, 80);
                break;
            case 2:
                int x1 = generator.nextInt(getWidth());
                int x2 = generator.nextInt(getWidth());
                int y1 = generator.nextInt(getHeight());
                int y2 = generator.nextInt(getHeight());
                s = new Line2D.Double(x1, y1, x2, y2);
                break;
            default:
                s = null;                                                    
        }
        return s;
    }
}
