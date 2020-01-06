import java.util.Scanner;

/**
        This program performs integer operations on two integer operands
         input by the user
*/
public class BinaryOperations
{
        public static void main(String[] args)
        {
                // Prompt user for two integer operands
                Scanner in = new Scanner(System.in);
                
                System.out.print("Please enter the first integer operand: ");
                int first = in.nextInt();
                
                System.out.print("Please enter the second integer operand: ");
                int second = in.nextInt();
                
                // Displays the sum of both operands
                System.out.print("Sum: ");
                System.out.println(first + second);
                
                // Print the difference
                System.out.print("Difference: ");
                System.out.println(first - second);
                
                // Print the product
                System.out.print("Product: ");
                System.out.println(first * second);
                
                // Print the average
                System.out.print("Average: ");
                double sum = first + second;
                System.out.println(sum / 2);
                
                // Displays the distance between both integers on the number line
                System.out.print("Distance: ");
                System.out.println(Math.abs(first - second));
                
                // The larger of the two integers
                System.out.print("Maximum: ");
                System.out.println(Math.max(first, second));
                
                // The smaller of both integers
                System.out.print("Minimum: ");
                System.out.println(Math.min(first, second));
        }
}