package exercise_11;

import java.awt.Rectangle;
import exercise_8.Measurer;
import exercise_8.Data;

/**
    This program demonstrates the use of a Measurer.
*/
public class MeasurerTester
{
    public static void main(String[] args)
    {
    
        class AreaMeasurer implements Measurer<Rectangle>
        {
            public double measure(Rectangle rect)
            {
                double area = rect.getWidth() * rect.getHeight();
                return area;
            }
        }
    
        class PerimeterMeasurer implements Measurer<Rectangle>
        {
            public double measure(Rectangle rect)
            {
                double perimeter = 2 * (rect.getWidth() + rect.getHeight());
                return perimeter;
            }
        }
        
        Measurer areaMeas = new AreaMeasurer();        
        Measurer perimeterMeas = new PerimeterMeasurer();

        Rectangle[] rects = new Rectangle[]
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
