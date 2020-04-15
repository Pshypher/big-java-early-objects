import java.awt.Rectangle;

public class FourRectanglePrinter 
{
   public static void main(String[] args)
   {
      // Construct and print a Rectangle object
      Rectangle box = new Rectangle(5, 10, 15, 45);
      System.out.println(box);
      
      // Translate and print the Rectangle object three more 
      // times in such a way that it forms a larger rectangle
      box.translate(15, 0);
      System.out.println(box);
      box.translate(0, 45);
      System.out.println(box);
      box.translate(-15, 0);
      System.out.println(box);
   }    
}
