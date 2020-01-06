import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JComponent;

/**
        Paints the Olympic Ring on a Component
*/
public class OlympicRingComponent extends JComponent
{
        public void paintComponent(Graphics g)
        {
                // Recover the Graphics2D object
                Graphics2D g2 = (Graphics2D) g;
                
                // Construct an OlympicRing to be drawn on the Component
               OlympicRing oRing = new OlympicRing(37, 10, 40);
               oRing.draw(g2);
        }
}
