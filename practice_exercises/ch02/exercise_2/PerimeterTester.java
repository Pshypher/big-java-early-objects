import java.awt.Rectangle;

/**
   Auto Generated Java Class.
 */
public class PerimeterTester 
{
   public static void main(String[] args)
   { 
      Rectangle box = new Rectangle(0, 0, 172, 125);
      Double perimeter = (2 * box.getWidth()) + (2 * box.getHeight());
      System.out.println("Perimeter: " + perimeter);
              
      // Display the expected value for perimeter
      System.out.println("Expected: " + 594);
   }
}
