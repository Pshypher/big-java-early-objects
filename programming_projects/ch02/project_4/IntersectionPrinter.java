import java.awt.Rectangle;

public class IntersectionPrinter 
{
   public static void main(String[] args)
   { 
      // Construct two Rectangle objects that intersect
      // The second rectangle has its x and y coordinates 
      // at the midpoint of the first rectangle
      Rectangle r1 = new Rectangle(5, 10, 50, 30);
      Rectangle r2 = new Rectangle(30, 25,  36, 64);
      
      // A Rectangle object is returned from the insection of r1 and r2
      Rectangle r3 = r1.intersection(r2);
      System.out.println(r3);
      
      // translate r2 right across the abscissa and down along the ordinate
      // such that there is no intersection between r1 and r2
      r2.translate(25, 15);
      r3 = r1.intersection(r2);
      System.out.println(r3);
   }      
}
