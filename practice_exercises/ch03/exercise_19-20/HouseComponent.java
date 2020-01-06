import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JComponent;

/**
      Draws a House at a location on the Component 
*/
public class HouseComponent extends JComponent
{
   public void paintComponent(Graphics g)
   {
      int y;
      
      // Recover the Graphics2D object
      Graphics2D g2 = (Graphics2D) g;
   
      // Constructs several Houses and places them at their specified coordinate on the Component
      y = getHeight() - 60;
      House small = new House(160, y, 40);
      small.draw(g2);
      
      y = getHeight() - 105; 
      House medium = new House(220, y, 70);
      medium.draw(g2);
      
      y = getHeight() - 210;
      House large = new House(5, y, 140);
      large.draw(g2);
      
      y = getHeight() - 270;
      House xLarge = new House(300, y, 180);
      xLarge.draw(g2);
   }
}