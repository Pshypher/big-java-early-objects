import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;
import javax.swing.JComponent;

public class EllipseComponent extends JComponent
{
        public void paintComponent(Graphics g)
        {
                // Recover the Graphics2D object
                Graphics2D g2 = (Graphics2D) g;
                
                //Construct an Ellipse with the same dimensions as the Component
                Ellipse2D.Double ellipse = new Ellipse2D.Double(0, 0, getWidth(), getHeight());
                
                g2.draw(ellipse);
                g2.setColor(Color.MAGENTA);
                g2.fill(ellipse);
        }
}