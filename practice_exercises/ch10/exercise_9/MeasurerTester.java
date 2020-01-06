package exercise_9;

import java.awt.Rectangle;

/**
    This program demonstrates the use of a Measurer.
*/
public class MeasurerTester
{
    public static void main(String[] args)
    {
        Measurer areaMeas = new AreaMeasurer();        
        Measurer perimeterMeas = new PerimeterMeasurer();

        Rectangle[] rects = 
            {
                new Rectangle(5, 10, 20, 30),
                new Rectangle(10, 20, 30, 40),
                new Rectangle(20, 30, 5, 15)
            };

        double averageArea = Data.average(rects, areaMeas);
        Object obj = Data.max(rects, perimeterMeas);
        Rectangle largestRectangle = (Rectangle) obj;
        
        System.out.println("Average area: " + averageArea);
        System.out.println("Expected: 625");
        
        System.out.println("Largest rectangle: " + largestRectangle);
        System.out.println("Expected: Rectangle[x=10,y=20,width=30,height=40]");       
    }
}
