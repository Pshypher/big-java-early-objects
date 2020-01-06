import static java.lang.Math.*;

/**
    Models the geometric solid shape of a sphere
*/
public class Sphere
{
    private double r; 
    
    /**
        Construct a sphere of the given radius
        @param radius the sphere's radius
    */
    public Sphere(double radius)
    {
        r = radius;
    }
    
    /**
        Compute this Sphere's volume
        @return the volume of the sphere
    */
    public double volume()
    {
        return (4.0 / 3) * PI * pow(r, 3);
    }
    
    /**
        Calculate the area of the sphere
        @return surface area of this Sphere
    */
    public double surfaceArea()
    {
        return 4 * PI * pow(r, 2);
    }
    
    public double getRadius()
    {
        return r;
    }
}