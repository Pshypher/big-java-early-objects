package exercise_9;

import java.awt.Rectangle;

/**
    This class measures a rectangle by its perimeter
*/
public class PerimeterMeasurer implements Measurer
{
    public double measure(Object anObject)
    {
        Rectangle rect = (Rectangle) anObject;
        double perimeter = 2 * (rect.getWidth() + rect.getHeight());
        return perimeter; 
    }
}