import java.awt.Graphics2D;

/**
   Describes an item that can be drawn on a screen
*/
public interface Drawable
{
   /**
      Draws an object of a particular shape and dimensions
      on a screen
   */
   void draw(Graphics2D g2);
   
   /**
      Checks whether a particular object of the given shape
      intersect with another of the same type on the screen. 
   */
   boolean intersects(Object anObject);
}