import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.geom.Line2D;
import java.awt.geom.Point2D;
import java.awt.geom.Rectangle2D;

   // Color FaintPurple = new Color(143, 105, 166);

/**
      A simple house with a roof, a window and a door
*/
public class House implements Drawable
{
   private int xLeft;   // Left corner where the house should begin to appear
   private int yTop;    // The top of the house where the roof appears
   private int length;  // The dimension of the body 
   private Color color;
    
   /**
         Construct a house with top-left coordinate on the grid
         @param x the x coordinate of the top-left corner
         @param y the y coordinate of the top-left corner
         @param n side length of the house
         @param aColor the color of this house
   */ 
   public House(int x, int y, int n, Color aColor)
   {
      xLeft = x;
      yTop = y;
      length = n;
      color = aColor;
   }
   

   public void draw(Graphics2D g2)
   {
      // Set the color of the shape outline
      g2.setColor(color);
      
      // Lower left corner of the roof
      Point2D.Double p0 = new Point2D.Double(xLeft, yTop + length / 2);
      // Apex coordinate of the roof
      Point2D.Double p1 = new Point2D.Double(xLeft + length / 2, yTop);
      // Lower right corner of the roof
      Point2D.Double p2 = new Point2D.Double(xLeft + length, yTop 
         + length / 2);
      // Lower left corner to the Apex
      Line2D.Double leftRoofSide = new Line2D.Double(p0, p1);
      // Apex of roof to the lower right corner
      Line2D.Double rightRoofSide = new Line2D.Double(p1, p2);
      
      
      // Body of the house
      Rectangle2D.Double body = new Rectangle2D.Double(
         xLeft, yTop + length / 2, length, length);
      // Door of the house
      Rectangle2D.Double door = new Rectangle2D.Double(xLeft + length / 7,
          yTop + length * 6 / 7, length * 2 / 7, length / 2 + length / 7);
      // Window of the house
      Rectangle2D.Double window = new Rectangle2D.Double(xLeft 
         + length * 4 / 7, yTop + length, length * 2 / 7, length * 2 / 7);
      
      // Draw each unit that constitutes the House
      g2.draw(leftRoofSide);
      g2.draw(rightRoofSide);
      g2.draw(body);
      g2.draw(door);
      g2.draw(window);
   }
   
   public boolean intersects(Object anObject)
   {
      if (!(anObject instanceof House)) { 
         return false; }
      
      House other = (House) anObject;
      return getBounds().intersects(other.getBounds());
   }
   
   /**
      Gets the rectangle surrounding this house
      @return the rectangular boundary
   */
   private Rectangle2D getBounds()
   {
      double height = 1.5 * length;
      double width = length;
      return new Rectangle2D.Double(xLeft, yTop, width, height);
   }
}