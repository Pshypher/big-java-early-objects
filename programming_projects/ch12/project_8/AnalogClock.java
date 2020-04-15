import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.awt.geom.Point2D;

/**
   A graphical representation of an analog clock
*/
public class AnalogClock
{
   public static final int MINUTES = 60;
   public static final int HOURS = 12;
   
   private double xLeft;
   private double yTop;
   private double radius;
   private Time time;
   
   /**
      Constructs an analog clock with the given radius and whose top-left 
      corner is at the given (x y) position.
      @param x left position of this clock on the x-axis
      @param y top position of this clock on the y-axis
      @param r the radius
   */
   public AnalogClock(double x, double y, double r)
   {
      xLeft = x;
      yTop = y;
      radius = r;
   }
   
   /**
      Sets the time on this clock.
      @param aTime the time 
   */
   public void setTime(Time aTime)
   { 
      time = aTime;
   }
   
   /**
      Gets the current clock time
      @return the time
   */
   public Time getTime()
   {
      return time;
   }
   
   /**
      Draws this clock on a graphical component
      @param g2 the graphics context
   */
   public void draw(Graphics2D g2)
   {
      Ellipse2D.Double outline = new Ellipse2D.Double(xLeft, yTop, 
         radius * 2, radius * 2);
      g2.setColor(new Color(143, 105, 166));
      g2.draw(outline);
      
      // draw the markers on the clock
      double xCentre = xLeft + radius;
      double yCentre = yTop + radius; 
      for (int t = 0; t < MINUTES; t++)
      {
         double markerSize;
         if (t % 5 == 0) { markerSize = radius * 2 / 15; }
         else { markerSize = radius / 15; }
         double theta = toRadians(t, MINUTES);
         Point2D.Double from = new Point2D.Double(xCentre + radius 
            * Math.cos(theta), yCentre + radius 
            * Math.sin(theta));
         Point2D.Double to = new Point2D.Double(xCentre + (radius - markerSize)
            * Math.cos(theta), yCentre + (radius - markerSize) 
            * Math.sin(theta));
         g2.draw(new Line2D.Double(from, to));                           
      }  
      
      // draw the current minute hand
      double angle = toRadians(time.getMinutes(), MINUTES);   
      Line2D.Double minute = new Line2D.Double(xCentre, yCentre, xCentre 
         + radius * (1 - 2 / 15.0) * Math.cos(angle),  
         yCentre + radius * (1 - 2 / 15.0) * Math.sin(angle));
      g2.draw(minute);
          
      // draw the hour hand 
      angle = toRadians(time.getHour(), HOURS);
      Line2D.Double hour = new Line2D.Double(xCentre, yCentre, xCentre 
         + radius * (1 - 2 / 15.0) * 0.75 * Math.cos(angle),  
         yCentre + radius * (1 - 2 / 15.0) * 0.5 * Math.sin(angle));
      g2.draw(hour);        
   }
   
   /**
      Convert the minutes or hour on this clock to its corresponding 
      angle in unit radians.
      @param n the number of hours or minutes.
      @param type one of HOUR or MINUTES
   */
   private double toRadians(int n, int type)
   {
      final int DEGREES_PER_QUADRANT = 90;
      final int DEGREES = 360;
      
      int m;
      if (type == MINUTES)
      {
         m = DEGREES / MINUTES;
      }
      else
      {
         m = DEGREES / HOURS;
      }
      double theta = n * m - DEGREES_PER_QUADRANT;
      double radians = Math.toRadians(theta);
      return radians;    
   }
}