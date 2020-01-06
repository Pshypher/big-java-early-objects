import java.util.Scanner;

/**
        This program constructs objects of the Triangle class 
        and uses its methods
*/

public class TriangleDemo
{
        public static void main(String[] args)
        {
                // Construct an object of the Scanner class
                Scanner in = new Scanner(System.in);
                
                System.out.print("Enter a value for the 1st ordinate: ");
                double x1 = in.nextDouble();
                System.out.print("Enter a value for the 1st abscissa: ");
                double y1 = in.nextDouble();
                System.out.print("Enter a value for the 2nd ordinate: ");
                double x2 = in.nextDouble();
                System.out.print("Enter a value for the 2nd abscissa: ");
                double y2 = in.nextDouble();
                System.out.print("Enter a value for the 3rd ordinate: ");
                double x3 = in.nextDouble();
                System.out.print("Enter a value for the 3rd abscissa: ");
                double y3 = in.nextDouble();
                
                // Construct an object of the triangle class with
                // no sides and 0 surface area
                Triangle triangle = new Triangle();
                
                // Set the dimensions of the triangle
                triangle.setPointA(x1, y1);
                triangle.setPointB(x2, y2);
                triangle.setPointC(x3, y3);
                
                double lengthOfSideBC = triangle.getSegmentBC(); 
                double lengthOfSideAC = triangle.getSegmentAC();
                double lengthOfSideAB = triangle.getSegmentAB();
                
                double angleA = triangle.getAngleA();
                double angleB = triangle.getAngleB();
                double angleC = triangle.getAngleC();
                
                double perimeter = triangle.getPerimeter();
                double area = triangle.getArea();
                
                // Display the properties of the triangle
                System.out.printf("Line BC:   %8.2f\n", lengthOfSideBC);
                System.out.printf("Line AC:   %8.2f\n", lengthOfSideAC);
                System.out.printf("Line AB:   %8.2f\n", lengthOfSideAB);
                System.out.printf("Angle A:   %8.2f\n", angleA);
                System.out.printf("Angle B:   %8.2f\n", angleB);
                System.out.printf("Angle C:   %8.2f\n", angleC);
                System.out.printf("Perimeter: %8.2f\n", perimeter);
                System.out.printf("Area:      %8.2f\n", area);
        }
}