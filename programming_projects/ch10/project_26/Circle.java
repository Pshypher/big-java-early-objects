package project_26;

import java.awt.Graphics2D;
import java.awt.Point;
import java.awt.geom.Ellipse2D;

public class Circle
{
   private Point centre;
   private double radius;
   
   /**
      Gets the this circle centre.
      @return centre of this circle 
   */
   public Point getCentre()
   {
      return centre;
   }
   
   /**
      Adjusts the centre of this circle, with its new centre 
      at the given point.
      @param pt centre of this circle 
   */
   public void recentre(Point pt)
   {
      centre = pt;
   }
   
   /**
      Computes the radius of this circle.
      @return radius of this circle
   */
   public double getRadius()
   {
      return radius;
   }
   
   /**
      Sets the radius of this circle using a point on the
      circumference of this circle.
      @param pt a point on periphery of the circle.
   */
   public void setRadius(Point pt)
   {
      radius = Math.sqrt(Math.pow(centre.getX() - pt.getX(), 2)
            + Math.pow(centre.getY() - pt.getY(), 2));
   }
   
   /**
      Draws this circle on a canvas.
      @param g2 the graphics context
   */
   public void draw(Graphics2D g2)
   {
      double xLeft;
      double yTop;
      double diameter;
      if (centre != null)
      {
         xLeft = centre.getX() - radius;
         yTop = centre.getY() - radius;
         diameter = radius * 2;
      }
      else
      {
         xLeft = 0;
         yTop = 0;
         diameter = 0;   
      }   
      g2.draw(new Ellipse2D.Double(xLeft, yTop, diameter, diameter));
   }
}
