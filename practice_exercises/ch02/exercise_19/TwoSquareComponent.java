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
      
      // Construct a square
      Rectangle box = new Rectangle(20, 20, 40, 40);
      g2.draw(box);
      
      // Adjust box dimensions
      box.setSize(20, 20);
      box.translate(10, 10);
      g2.draw(box);
   }
}