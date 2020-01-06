import java.awt.Rectangle;

/**
   @author ehost
*/
public class AreaTester
{
    public static void main(String[] args)
    {
        double width;
        double height;
        double area;
        
        Rectangle box = new Rectangle(5, 10, 20, 30);
        
        // get the dimensions of the Rectangle object and calculate the area
        width = box.getWidth();
        height = box.getHeight();
        area = width * height;
        
        System.out.print("Area: ");
        System.out.println(area);
        System.out.print("Expected: ");
        System.out.println(600.0);
    }
}
