import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.geom.Line2D;
import java.awt.geom.Point2D;
import java.awt.geom.Rectangle2D;

/**
      A Simple Diagram of a House
*/
public class House
{
   private int x;          // The left corner where the house should begin 
                           // to appear
   private int y;          // The top of the house where the roof appears
   private int length;     // The dimension of the body 
    
   /**
         Construct a house with top-left coordinate on the grid
         @param x the x coordinate of the top-left corner
         @param y the y coordinate of the top-left corner
   */ 
   public House(int x, int y, int length)
   {
      this.x = x;
      this.y = y;
      this.length = length;
   }
   
   /**
         Draws the shape of a simple house
         @param g2 the 2D Graphics context
   */
   public void draw(Graphics2D g2)
   {
      // Set the color of the shape outline
      Color faintPurple = new Color(143, 105, 166);
      g2.setColor(faintPurple);
      
      // Lower left corner of the roof
      Point2D.Double p0 = new Point2D.Double(x, y + length / 2);
      // Apex coordinate of the roof
      Point2D.Double p1 = new Point2D.Double(x + length / 2, y);
      // Lower right corner of the roof
      Point2D.Double p2 = new Point2D.Double(x + length, y + length / 2);
      // Lower left corner to the Apex
      Line2D.Double leftRoofSide = new Line2D.Double(p0, p1);
      // Apex of roof to the lower right corner
      Line2D.Double rightRoofSide = new Line2D.Double(p1, p2);
      
      
      // Body of the house
      Rectangle2D.Double body = new Rectangle2D.Double(x, y + length / 2, length, length);
      // Door of the house
      Rectangle2D.Double door = new Rectangle2D.Double(x + length / 7, y + length * 6 / 7, length * 2 / 7, length / 2 + length / 7);
      // Window of the house
      Rectangle2D.Double window = new Rectangle2D.Double(x + length * 4 / 7, y + length, length * 2 / 7, length * 2 / 7);
      
      // Draw each unit that constitutes the House
      g2.draw(leftRoofSide);
      g2.draw(rightRoofSide);
      g2.draw(body);
      g2.draw(door);
      g2.draw(window);
   }
}