import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;
import javax.swing.JComponent;

public class TargetComponent extends JComponent
{
        public void paintComponent(Graphics g)
        {
                // Recover the Graphics2D object
                Graphics2D g2 = (Graphics2D) g;
                
                int outermostCircleDiameter = 100;
                double x = getWidth() / 2 - outermostCircleDiameter / 2;
                double y = getHeight() / 2 - outermostCircleDiameter / 2;
                
                // Draw the target of concentric black and white circles
                Target target = new Target(x, y, outermostCircleDiameter);
                target.draw(g2);
        }
}