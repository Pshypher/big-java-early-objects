import java.awt.Rectangle;

/**
    A rectangle class that can compute its area and perimeter.
*/
public class BetterRectangle extends Rectangle
{
    /**
        Construct a rectangle at given coordinates with the specified
        dimensions.
        @param xLeft position of the left corner this rectangle
        @param yTop vertical position from the top of this rectangle
        @param width width of this rectangle
        @param height height of this rectangle
    */
    public BetterRectangle(int xLeft, int yTop, int width, int height)
    {
        super(xLeft, yTop, width, height);
    }
    
    /**
        Computes this rectangle's area.
        @return area of this rectangle
    */
    public double getArea()
    {
        return getWidth() * getHeight(); 
    }
    
    /**
        Compute the perimeter for this rectangle.
        @return perimeter of the rectangle
    */
    public double getPerimeter()
    {
        double perimeter;
        if (getWidth() > 0 && getHeight() > 0 )
        {
            perimeter = 2 * (getWidth() + getHeight());
        }
        else if (getWidth() > 0)
        {
            perimeter = getWidth();
        }
        else
        {
            perimeter = getHeight();
        }
        
        return perimeter;
    }
}