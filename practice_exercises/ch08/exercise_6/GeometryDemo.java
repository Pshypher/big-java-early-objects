import java.util.Scanner;

public class GeometryDemo
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
    
        System.out.print("Height: ");
        double height = in.nextDouble();
    
        System.out.print("Radius: ");
        double radius = in.nextDouble();
    
        System.out.println();
            
        System.out.println("Volume(cube): " + Geometry.cubeVolume(height));
        System.out.println("Area(cube): " + Geometry.cubeSurface(height));
    
        System.out.println("Volume(sphere): " + Geometry.sphereVolume(radius));
        System.out.println("Area(sphere): " + Geometry.sphereSurface(radius));
    
        System.out.println("Volume(cylinder): " 
            + Geometry.cylinderVolume(radius, height));
        System.out.println("Area(cylinder): " 
            + Geometry.cylinderSurface(radius, height));
        
        System.out.println("Volume(cone): " + Geometry.coneVolume(radius, height));
        System.out.println("Area(cone): " + Geometry.coneSurface(radius, height));
    }
}