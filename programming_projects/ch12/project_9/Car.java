import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Shape;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.awt.geom.Rectangle2D;

/**
   A Car consists of several parts; roof, body and tires.
*/
public class Car implements Drawable
{

   private Shape[] parts;
   private Color color;
   
   /**
      Constructs a car at the given (x, y) coordinates
      @param xLeft car position across the horizontal plane
      @param yTop car position along the vertical plane
      @param n value to scale the car size
      @param aColor color of the car
   */
   public Car(int xLeft, int yTop, int n, Color aColor)
   {
      parts = new Shape[]
            {
               new Line2D.Double(xLeft + n,
                  yTop + n, xLeft + n * 2, yTop),
               new Line2D.Double(xLeft + n * 4, 
                  yTop, xLeft + n * 5, yTop + n),
               new Line2D.Double(xLeft + n * 2, yTop, 
                  xLeft + n * 4, yTop),
               new Rectangle2D.Double(xLeft, yTop + n, n * 6, n),
               new Ellipse2D.Double(xLeft + n, 
                  yTop + n * 2, n, n),
               new Ellipse2D.Double(xLeft + n * 4, 
                  yTop + n * 2, n, n)
            };
      color = aColor;                                               
   }
   
   public void draw(Graphics2D g2)
   {
      g2.setColor(color);
      for (Shape s : parts)
      {
         g2.draw(s);  
      }
   }
   
   public boolean intersects(Object anObject)
   {
      if (!(anObject instanceof Car)) { 
         return false; }
      
      Car other = (Car) anObject;
      return getBounds().intersects(other.getBounds());
   }
  
   /**
      Gets the rectangle surrounding this car.
      @return the rectangular boundary
   */
   private Rectangle2D getBounds()
   {
      int i = 0;
      Rectangle2D.Double rect = null;
      while (i < parts.length && rect == null)
      {
         if (parts[i] instanceof Rectangle2D.Double)
         {
            Rectangle2D.Double body = (Rectangle2D.Double) parts[i];
            double xLeft = (double) body.getX();
            double height = (double) body.getHeight() * 3;
            double width = (double) body.getWidth();
            double yTop = (double) body.getY() - height;
            rect = new Rectangle2D.Double(xLeft, yTop, width, height);
         }
         i++;
      }
      return rect;
   }
}