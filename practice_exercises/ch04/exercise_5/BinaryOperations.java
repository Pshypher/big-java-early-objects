import java.util.Scanner;

/**
        This program demonstrates the various binary operations of the 
        Java library
*/
public class BinaryOperations
{
        public static void main(String[] args)
        {
                // Construct an object of the Scanner class
                Scanner in = new Scanner(System.in);
                
                // Read user input for both integers
                System.out.print("Please enter an integer: ");
                int one = in.nextInt();
                System.out.print("Enter another integer: ");
                int another = in.nextInt();
                
                System.out.printf("Sum:        %6d\n", one + another);
                System.out.printf("Difference: %6d\n", one - another);
                System.out.printf("Product:    %6d\n", one * another);
                System.out.printf("Average:    %9.2f\n", (one + another) / 2.0);
                System.out.printf("Distance:   %6d\n", Math.abs(one - another));
                System.out.printf("Maximum:    %6d\n", Math.max(one, another));
                System.out.printf("Minimum:    %6d\n", Math.min(one, another)); 
        }
}