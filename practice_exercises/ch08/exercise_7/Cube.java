import static java.lang.Math.*;

/**
    Geometric solid shape of a cube
*/
public class Cube
{
    private double h;
    
    /**
        Construct a cube with the specified height
        @param height this Cube's height
    */
    public Cube(double height)
    {
        h = height;
    }
    
    /**
        Calculate this Cube's volume
        @return volume of this Cube
    */
    public double volume()
    {
        return pow(h, 3);
    }
    
    /**
        Calculate this Cube's surface area
        @return total area of this Cube
    */
    public double surfaceArea()
    {
        return 6 * pow(h, 2);
    }
    
    /**
        Get the cube's height
        @return height of the cube
    */
    public double getHeight()
    {
        return h;
    }
}