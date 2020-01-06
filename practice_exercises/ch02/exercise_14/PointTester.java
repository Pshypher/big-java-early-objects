import java.awt.Point;

/**
   @author ehost
 */
public class PointTester
{
   public static void main(String[] args)
   {
      // constructs two Point objects
      Point aPoint = new Point(3, 4);
      Point another = new Point(-3, -4);
      
      // displays the distance between aPoint and another
      System.out.print("distance: ");
      System.out.println(aPoint.distance(another));
      System.out.print("Expected: ");
      System.out.println(10.0);
      
   }
}
