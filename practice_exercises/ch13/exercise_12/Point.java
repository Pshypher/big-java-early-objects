/**
   A point on a 2-D plane on the corner of a polygon
*/
public class Point
{
   private double x;
   private double y;
   
   /**
      Construct a point at the specified (x, y) position.
      @param xPos location of the point on the abscissa
      @param yPos location of the point on the ordinate
   */
   public Point(double xPos, double yPos)
   {
      x = xPos;
      y = yPos; 
   }
   
   /**
      Gets the position of this point on the x-axis.
      @return position on the x-axis
   */
   public double getX()
   {
      return x;
   }
   
   /**
      Gets the position of this point on the y-axis.
      @return position on the y-axis
   */
   public double getY()
   {
      return y;
   }
}