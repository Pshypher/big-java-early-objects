import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JComponent;

public class SuburbanScene extends JComponent
{
   private Street currentStreet;
   
   public void paintComponent(Graphics g)
   {
      Graphics2D g2 = (Graphics2D) g;
      if (currentStreet != null) { currentStreet.draw(g2); }
   }
   
   /**
      Updates this suburban scene, so that it displays the specified street.
      @param s the street to be displayed
   */
   public void update(Street s)
   {
      currentStreet = s;
      repaint();
   }
   
   /**
      Adds either a house or car to the current street displayed on this
      suburban scene.
      @param obj either a car or a house
      @return true if the entity was added, false otherwise
   */
   public boolean add(Drawable obj)
   {
      boolean added = false;
      if (currentStreet != null) 
      {
         added = currentStreet.add(obj);
         repaint();
      }
      
      return added;         
   }
}
