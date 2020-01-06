import java.util.Scanner;

public class SolidShapesDemo
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        
        System.out.print("Height: ");
        double height = in.nextDouble();
        
        System.out.print("Radius: ");
        double radius = in.nextDouble();
        
        Cube cube = new Cube(height);
        System.out.println("Volume(cube): " + cube.volume());
        System.out.println("Area(cube): " + cube.surfaceArea());
        
        Sphere sphere = new Sphere(radius);
        System.out.println("Volume(sphere): " + sphere.volume());
        System.out.println("Area(sphere): " + sphere.surfaceArea());
        
        Cylinder cylinder = new Cylinder(radius, height);
        System.out.println("Volume(cylinder): " + cylinder.volume());
        System.out.println("Area(cylinder): " + cylinder.surfaceArea());
        
        Cone cone = new Cone(radius, height);
        System.out.println("Volume(cone): " + cone.volume());
        System.out.println("Area(cone): " + cone.surfaceArea());
    } 
}