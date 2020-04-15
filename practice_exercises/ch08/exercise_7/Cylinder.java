import static java.lang.Math.*;

/**
    A closed cylinder with a circular base 
*/
public class Cylinder
{
    private double r;
    private double h;
    
    /**
        Construct a cylinder with the given height and radius
        @param radius radius of the base of cylinder
        @param height the height of the cylinder
    */
    public Cylinder(double radius, double height)
    {
        r = radius;
        h = height;
    }
    
    /**
        Calculate the volume of the cylinder
        @return volume of this Cylinder
    */
    public double volume()
    {
        return PI * pow(r, 2) * h;
    }
    
    /**
        Calculate the surface area of the cylinder
        @return surface area of the cylinder
    */
    public double surfaceArea()
    {
        return 2 * PI * pow(r, 2) + 2 * PI * r * h;
    }
    
    /**
        Get the height of the cylinder
        @return this Cylinder height
    */
    public double getHeight()
    {
        return h;
    }
    
    /**
        Get the radius of this Cylinder
        @return radius of this Cylinder
    */
    public double getRadius()
    {
        return r;
    }
}