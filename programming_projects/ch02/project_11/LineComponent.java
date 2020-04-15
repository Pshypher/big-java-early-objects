import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.awt.geom.Point2D;
import javax.swing.JComponent;

public class LineComponent extends JComponent 
{
   public void paintComponent(Graphics g)
   {
      // Recover the Graphics2D object from the Graphics argument g
      Graphics2D g2 = (Graphics2D) g;
      
      // Construct a Line object and display on the component
      Line2D.Double line = new Line2D.Double(100, 100, 200, 200);
      g2.draw(line);
      
      // Construct a Point pt0 and draw on the component
      Point2D.Double pt0 = new Point2D.Double(100, 200); 
      Double distance = line.ptSegDist(pt0);
      Ellipse2D.Double dot0 = new Ellipse2D.Double(100, 200, 3, 3);
      g2.draw(dot0);
      g2.drawString("Distance: " + distance, 105, 200);
      
      // Construct a Point pt1 and draw on the component
      Point2D.Double pt1 = new Point2D.Double(150, 150);
      distance = line.ptSegDist(pt1);
      Ellipse2D.Double dot1 = new Ellipse2D.Double(150, 150, 3, 3);
      g2.draw(dot1);
      g2.drawString("Distance: " + distance, 155, 150);
      
      // Construct a Point pt2 and display on the component
      Point2D.Double pt2 = new Point2D.Double(250, 50);
      distance = line.ptSegDist(pt2);
      Ellipse2D.Double dot2 =  new Ellipse2D.Double(250, 50, 3, 3);
      g2.draw(dot2);
      g2.drawString("Distance: " + distance, 255, 50);        
   }
}