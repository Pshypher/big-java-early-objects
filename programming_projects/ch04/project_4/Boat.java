/**
   A class that simulates a boat in a two-dimesional ocean, with a position
   and a angle
*/

public class Boat
{
   private double x;
   private double y;
   private double angle;
   
   /**
      Returns the x-coordinate of the boat on the ocean
      @return the x-coordinate of the boat
   */
   public double getX()
   {
      return x;
   }
         
   /**
      Returns the y-coordinate of the boat on the ocean
      @return the y-coordinate of the boat
   */
   public double getY()
   {
      return y;
   }   
       
   /**
      Returns the angle in degrees the boat is headed
      @return the angle of the boat in the ocean
   */
   public double getDirection()
   {
      return angle;
   }
   
   /**
      Turns the boat by some degree
      @param degrees the amount by which the boat is turned                        
   */
   public void turn(double degrees)
   {
      angle = (angle + degrees) % 360;
   }
           
   /**
      Moves the boat some distance further across the ocean
      @param distance the distance the boat travels across the ocean
   */
   public void move(double distance)
   {
      double m = Math.tan(Math.toRadians(angle));     // m is the gradient of the 
                                                      // line between (x1, y1) and (x2, y2)
      double a = 1 / (m * m) + 1;
      double b = -2 * y / (m * m) - 2 * y;
      double c = (1 / (m * m) + 1) * y * y
         - distance * distance;
              
      // Use the quadratic formula to find the roots;  (-b + Math.sqrt(b * b - 4 * a * c)) yields 
      // the larger root for values of y. note there is also a smaller root of 
      // (-b - Math.sqrt(b * b - 4 * a * c)) for y
      double dy = (-b + Math.sqrt(b * b - 4 * a * c)) / (2 * a) - y;                                                                            
      x = dy / m; 
      y = (-b + Math.sqrt(b * b - 4 * a * c)) / (2 * a);                
   }
}