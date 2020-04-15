/**
    This program tests the implemented BetterRectangle class.
*/
public class BetterRectangleTester
{
    public static void main(String[] args)
    {
        BetterRectangle emptyRectangle = new BetterRectangle(150, 55, 0, 0);
        System.out.println("Area: " + emptyRectangle.getArea());
        System.out.println("Expected: 0.0");
        System.out.println("Perimeter: " + emptyRectangle.getPerimeter());
        System.out.println("Expected: 0.0");
        
        BetterRectangle flatLine = new BetterRectangle(65, 38, 0, 72);
        System.out.println("Area: " + flatLine.getArea());
        System.out.println("Expected: 0.0");
        System.out.println("Perimeter: " + flatLine.getPerimeter());
        System.out.println("Expected: 72.0");
        
        BetterRectangle aRectangle = new BetterRectangle(50, 35, 15, 6);
        System.out.println("Area: " + aRectangle.getArea());
        System.out.println("Expected: 90.0");
        System.out.println("Perimeter: " + aRectangle.getPerimeter());
        System.out.println("Expected: 42.0");
        
        BetterRectangle square = new BetterRectangle(50, 35, 17, 17);
        System.out.println("Area: " + square.getArea());
        System.out.println("Expected: 289.0");
        System.out.println("Perimeter: " + square.getPerimeter());
        System.out.println("Expected: 68.0");
    }
}