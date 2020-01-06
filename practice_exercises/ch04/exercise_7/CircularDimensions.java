import java.util.Scanner;

/**
        This program prompts a user for the radius of a circle, and prints
        the area and circumference of a circle with that radius and the surface area
        and volume of a sphere with that radius
*/
public class CircularDimensions
{
        public static void main(String[] args)
        {
                Scanner in = new Scanner(System.in);
                System.out.print("Please enter the radius of a  round object: ");
                double radius = in.nextDouble();
                
                // Calculate and print the area of a circle
                double area = Math.PI * radius * radius;
                System.out.printf("Area of circle of radius %.2f unit is %.2f square unit", radius, area);
                System.out.println();
                
                // Calculate and print thecircumference of a circle
                double circumference = 2 * Math.PI * radius;
                System.out.printf("Circumference of a circle with radius %.2f unit is %.2f unit", 
                        radius, circumference); 
                System.out.println();
                
                // Calculate the surface area of a sphere
                double surfaceArea = 4 * Math.PI * radius * radius;
                System.out.printf("The surface area of a sphere of radius %.2f unit is %.2f square unit",
                        radius, surfaceArea);
                System.out.println();
                
                // Calculate the volume of the sphere
                double volume = 4 * Math.PI * Math.pow(radius, 3) / 3;
                System.out.printf("The volume of the sphere with radius %.2f unit is %.2f unit cube", 
                        radius, volume);
                System.out.println();                                                                    
        }
}