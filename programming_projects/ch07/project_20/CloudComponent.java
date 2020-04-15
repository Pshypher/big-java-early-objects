import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Point2D;
import java.util.ArrayList;
import java.util.Random;
import javax.swing.JComponent;

public class CloudComponent extends JComponent
{
    
    public void paintComponent(Graphics g)
    {
        Random generator = new Random();
        
        // recover graphics object
        Graphics2D g2 = (Graphics2D) g;
        
        Point2D.Double[] points = new Point2D.Double[100];
        for (int i = 0; i < points.length; i++)
        {
            int w = (int) getWidth();
            int h = (int) getHeight();
            double x = generator.nextDouble() + generator.nextInt(w);
            double y = generator.nextDouble() + generator.nextInt(h);
            points[i] = new Point2D.Double(x, y);
        }
        
        Cloud aCloud = new Cloud();
        for (int i = 0; i < points.length; i++)
        {
            aCloud.add(points[i]);
        }
        aCloud.draw(g2);   
    }
}