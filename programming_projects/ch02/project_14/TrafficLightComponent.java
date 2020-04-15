import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.awt.geom.Rectangle2D;
import javax.swing.JComponent;

public class TrafficLightComponent extends JComponent
{
        public void paintComponent(Graphics g) 
        {       
                // Recover Graphics2D object from Graphics argument g
                Graphics2D g2 = (Graphics2D) g;
                
                // Draw the box that holds all three bulbs
                Rectangle2D.Double box = new Rectangle2D.Double(25, 25, 40, 80);
                g2.draw(box);
                
                // Draw the red bulb
                Ellipse2D.Double red = new Ellipse2D.Double(35, 30, 20, 20);
                g2.setColor(Color.RED);
                g2.fill(red);
                g2.draw(red);
                
                // Draw the yellow bulb
                Ellipse2D.Double yellow = new Ellipse2D.Double(35, 55, 20, 20);
                g2.setColor(Color.YELLOW);
                g2.fill(yellow);
                g2.draw(yellow);
                
                // Draw the green bulb
                Ellipse2D.Double green = new Ellipse2D.Double(35, 80, 20, 20);
                g2.setColor(Color.GREEN);
                g2.fill(green);
                g2.draw(green);
        }
}