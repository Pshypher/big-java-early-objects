import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import javax.swing.JComponent;

public class NameComponent extends JComponent
{
   public void paintComponent(Graphics g)
   {
      // Recover Graphics2D object
      Graphics2D g2 = (Graphics2D) g;
      
      // Draws a red rectangle
      Rectangle editor = new Rectangle(0, 0, 175, 20);
      Color blue = new Color(0, 0, 255);
      g2.setColor(blue);
      g2.fill(editor);
      
      // Write the authors name on the editor
      Color red = new Color(255, 0, 0);
      g2.setColor(red);
      g2.drawString("Shote Babajimi Adeyemo", 10, 10);
   }     
}