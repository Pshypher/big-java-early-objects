import java.util.Scanner;

/**
        This program displays the area, perimeter and diagonal of
        a rectangle from the length of the rectangle's sides
*/
public class RectangleDimensions
{
        public static void main(String[] args)
        {
                // Construct an object of the Scanner class
                Scanner in = new Scanner (System.in);
                
                System.out.print("Please enter the width of the rectangle: ");
                double width = in.nextDouble();
                System.out.print("Please enter the length of the rectangle: ");
                double length = in.nextDouble();
                System.out.println();
                
                // Calculate and print the area and perimeter of the rectangle
                double area = length * width;
                double perimeter = 2 * length + 2 * width;
                System.out.printf("Area:      %6.2f\n", area);
                System.out.printf("Perimeter: %6.2f\n", perimeter);
                
                double lengthOfDiagonal = Math.sqrt(length * length     // Calculate the length of the diagonal
                                        + width * width);         
                System.out.printf("Diagonal:  %6.2f\n", lengthOfDiagonal);                                        
        }
}