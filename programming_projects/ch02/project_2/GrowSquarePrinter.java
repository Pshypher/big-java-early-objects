import java.awt.Rectangle;

public class GrowSquarePrinter 
{
   public static void main(String[] args) 
   {
      // Construct a Rectangle at coordinates (100, 100) 
      // and a side length of 50
      Rectangle square = new Rectangle(100, 100, 50, 50);
      System.out.println(square);
      
      // Increase the size of the Rectangle and translate the position 
      // of the Rectangle object back to (100,100)
      square.grow(25, 25);
      square.translate(25, 25);
      System.out.println(square);
   }        
}
