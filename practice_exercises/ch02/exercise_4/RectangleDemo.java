import java.awt.Rectangle;

public class RectangleDemo 
{
   public static void main(String[] args)
   { 
      // Print the width and height of rectangle with an area of 42
      Rectangle box = new Rectangle(12, 9);
      System.out.print("The width of a rectangle with a perimeter of 42 is " + box.getWidth());
      System.out.println(" and the height is " + box.getHeight());
      box.setSize(6, 7);
      System.out.print("The width of a rectangle with an area of 42 sq unit is " + box.getWidth());
      System.out.println(" and the height is " + box.getHeight());
   }
}
