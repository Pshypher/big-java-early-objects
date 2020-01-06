import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import javax.swing.JComponent;

public class TwoSquareComponent extends JComponent 
{
   public void paintComponent(Graphics g)
   {
      // Recover Graphics2D object
      Graphics2D g2 = (Graphics2D) g;
      
      // Draw a square
      Rectangle square = new Rectangle(50, 25, 50, 50);
      Color pink = new Color(255, 175, 175);
      g2.setColor(pink);
      g2.fill(square);
      
      // Shift the square along the x axis right 15 pixels
      square.translate(65, 0);
      Color magenta = Color.MAGENTA;
      g2.setColor(magenta);
      g2.fill(square);
   }              
}
