import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Line2D;
import java.awt.geom.Point2D;
import java.awt.geom.Rectangle2D;
import javax.swing.JComponent;


/**
        A Component on which the Bar Chart is displayed
*/
public class BarChartComponent extends JComponent
{
        public void paintComponent(Graphics g)
        {
                // Recover the Graphics2D object
                Graphics2D g2 = (Graphics2D) g;
                
                // Draw the Horizontal and Vertical border lines for the Bar Chart
                Point2D.Double p0 = new Point2D.Double(10, 10);
                Point2D.Double p1 = new Point2D.Double(270, 10);
                Point2D.Double p2 = new Point2D.Double(10, 190);
                
                Line2D.Double horizontal = new Line2D.Double(p0, p1);
                Line2D.Double vertical = new Line2D.Double(p0, p2);
                
                g2.draw(horizontal);
                g2.draw(vertical);
                
                // Draw and Label each bar horizontally along the Vertical axis
                Rectangle2D.Double goldenGate = new Rectangle2D.Double(10, 30, 252, 20);
                g2.draw(goldenGate);
                g2.drawString("Golden Gate", 15, 45);
                
                Rectangle2D.Double brooklyn = new Rectangle2D.Double(10, 70, 80, 20);
                g2.draw(brooklyn);
                g2.drawString("Brooklyn", 15, 85);
                
                Rectangle2D.Double delawareMemorial = new Rectangle2D.Double(10, 110, 132, 20);
                g2.draw(delawareMemorial);
                g2.drawString("Delaware Memorial", 15, 125);
                
                Rectangle2D.Double makinac = new Rectangle2D.Double(10, 150, 228, 20);
                g2.draw(makinac);
                g2.drawString("Makinac", 15, 165);             
        }
}