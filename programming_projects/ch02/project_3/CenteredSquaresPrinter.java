import java.awt.Rectangle;

public class CenteredSquaresPrinter
{
   public static void main(String[] args) 
   { 
      // Construct a Rectangle object and print its location, width and height
      Rectangle square = new Rectangle(100, 100, 200, 200);
      System.out.println(square);
      
      // Shrink the size of the Rectangle object to half 
      // the width and height of the former
      square.grow(-50, -50);
      System.out.println(square);
   }   
}
