package project_27;

import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.Shape;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.awt.geom.Point2D;

/**
   A Car can move in both directions across the screen
*/
public class Car implements MoveableShape
{

   private Shape[] parts;
   private boolean forward;
   
   /**
      Constructs a car at the given (x, y) coordinates
      @param xLeft car position across the horizontal plane
      @param yTop car position along the vertical plane
      @param n value to scale the car size
      @param direction orientation of this car either left or right
   */
   public Car(int xLeft, int yTop, int n, String direction)
   {
      parts = new Shape[]
            {
               new Line2D.Double(xLeft + n,
                  yTop + n, xLeft + n * 2, yTop),
               new Line2D.Double(xLeft + n * 4, 
                  yTop, xLeft + n * 5, yTop + n),
               new Line2D.Double(xLeft + n * 2, yTop, 
                  xLeft + n * 4, yTop),
               new Rectangle(xLeft, yTop + n, n * 6, n),
               new Ellipse2D.Double(xLeft + n, 
                  yTop + n * 2, n, n),
               new Ellipse2D.Double(xLeft + n * 4, 
                  yTop + n * 2, n, n)
            };  
             
      if (direction.equals("right")) { forward = true; }                                    
   }
   
   /**
      Gets current orientation of this car.
      @return the direction of this car
   */
   public String orientation()
   {
      String direction;
      if (forward) { direction = "right"; }
      else { direction = "left"; }
      return direction;
   }
   
   public void move(int width)
   {
      if (getMaxX() > width) { redirect(); }
      else if (getX() < 0) { redirect(); }
      
      int dx;
      if (orientation().equals("right")) { dx = 1; }
      else { dx = -1; }
      
      drive(dx); 
   }
   
   /**
      Change the direction of this car.
   */
   public void redirect()
   {
      if (forward) { forward = false; }
      else { forward = true;}
   }
   
   public void draw(Graphics2D g2)
   {
      for (Shape s : parts)
      {
         g2.draw(s);  
      }
   }
   
   /**
      Moves this car horizontally across the 2D plane.
      @param dx distance moved along the horizontal plane.
   */
   public void drive(int dx)
   {
      for (Shape s : parts)
      {
         if (s instanceof Line2D.Double)
         {
            Line2D.Double line = (Line2D.Double) s;
            line.setLine(
               line.getX1() + dx, line.getY1(),
               line.getX2() + dx, line.getY2());
         }
         else if (s instanceof Rectangle)
         {
            Rectangle body = (Rectangle) s;
            body.translate(dx, 0);
         }
         else if (s instanceof Ellipse2D.Double)
         {
            Ellipse2D.Double tyre = (Ellipse2D.Double) s;
            tyre.setFrame(tyre.getX() + dx, tyre.getY(),
               tyre.getWidth(), tyre.getHeight());
         }
      }
   }
   
   /**
      Gets the x-coordinate of the leftmost edge for this car.
      @return the x-coordinate of the left edge
   */
   public double getX()
   {
      int i = 0;
      while (i < parts.length)
      {
         if (parts[i] instanceof Rectangle)
         {
            return ((Rectangle) parts[i]).getX(); 
         }
         i++;
      }
      return 0;
   }
   
   /**
      Gets the x-coordinate of the rightmost edge for this car.
      @return the x-coordinate of the right edge
   */
   public double getMaxX()
   {
      int i = 0;
      while (i < parts.length)
      {
         if (parts[i] instanceof Rectangle)
         {
            return ((Rectangle) parts[i]).getMaxX(); 
         }
         i++;
      }
      return 0;
   }
}