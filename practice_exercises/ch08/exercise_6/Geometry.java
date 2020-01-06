import static java.lang.Math.*;

/**
    Useful methods for calculating the volumes and
    surface areas of various geometric shapes
*/
public class Geometry
{
    /**
        Calculates the volume of a cube
        @param h the height of the cube
        @return the cube's volume
    */
    public static double cubeVolume(double h)
    {
        return pow(h, 3);
    }
    
    /**
        Calculates the surface area of a cube
        @param h the height of the cube
        @return total area of cube
    */
    public static double cubeSurface(double h)
    {
        return 6 * pow(h, 2);
    }
    
    /**
        Calculates the volume of a sphere
        @param r the radius of the sphere
        @return the sphere's volume
    */
    public static double sphereVolume(double r)
    {
        return (4 / 3.0) * PI * pow(r, 3);
    }
    
    /**
        Calculates the surface area of the sphere
        @param the radius of the sphere
        @return surface area of sphere
    */
    public static double sphereSurface(double r)
    {
        return 4 * PI * pow(r, 2);
    }
    
    /**
        Calculates the volume of a cylinder with a circular 
        base
        @param r the radius of cylinder
        @param h height of the cylinder
        @return volume of the cylinder
    */
    public static double cylinderVolume(double r, double h)
    {
        return PI * pow(r, 2) * h;
    }
    
    /**
        Computes the surface area of a cylinder with a 
        circular base
        @param r the radius of cylinder
        @param h height of the cylinder
        @return total surface area of the cylinder
    */
    public static double cylinderSurface(double r, double h)
    {
        return 2 * PI * pow(r, 2) + 2 * PI * r * h;
    }
    
    /**
        Computes the volume of a cone with a circular 
        base
        @param r radius of the cone
        @param h height of the cone
        @return the volume of the cone
    */
    public static double coneVolume(double r, double h)
    {
        return (1 / 3.0) * PI * pow(r, 2) * h;
    } 
    
    /**
        Computes the surface area of a cone with a  
        circular base
        @param r radius of the cone
        @param h height of the cone
        @return the surface area of the cone
    */
    public static double coneSurface(double r, double h)
    {
        // calculate the slant-height
        double l = sqrt(pow(h, 2) + pow(r * 0.5, 2)); 
        return PI * pow(r, 2) + PI * r * l;
    }
}