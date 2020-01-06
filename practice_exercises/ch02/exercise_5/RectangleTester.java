import java.awt.Rectangle;

public class RectangleTester
{
   public static void main(String[] args)
   {
      Rectangle box = new Rectangle(5, 10, 20, 30);
      box.add(0, 0);
              
      System.out.print("Expected: ");
      System.out.println("X is 0, Y is 0, the width is 25px and the height is 40px");
              
      System.out.print("Actual: ");
      System.out.print("X is " + box.getX());
      System.out.print(", Y is " + box.getY());
      System.out.print(", the width is " + box.getWidth());
      System.out.println("px and the height is " + box.getHeight() + "px");
   }   
}
