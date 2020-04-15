import static java.lang.Math.*;

/**
    Models a geometric solid shaped cone 
*/
public class Cone
{
    private double r;
    private double h;
    
    /**
        Constructs a cone with a circular base, some units tall.
        @param height the height of the cone
        @param radius the radius of the cone
    */
    public Cone(double radius, double height)
    {
        r = radius;
        h = height;
    }
    
    /**
        Calculate the volume of the solid cone
        @return volume of this cone
    */
    public double volume()
    {
        return (1.0 / 3) * PI * pow(r, 2) * h;
    }
    
    /**
        Calculate the surface area of the cone
        @return surface area of the cone
    */
    public double surfaceArea()
    {
        double l = sqrt(pow(h, 2) + pow(0.5 * r, 2));
        return PI * pow(r, 2) + PI * r * l;
    }
    
    /**
        Get the cone's radius
        @return radius of this Cone
    */
    public double getRadius()
    {
        return r;
    }
    
    /**
        Get the height of the cone
        @return this Cone's radius
    */
    public double getHeight()
    {
        return h;
    }
}