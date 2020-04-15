import java.util.Scanner;

/**
        This program checks if a sequence of numbers is increasing, 
        decreasing or neither
*/
public class NumberComparator
{
        public static void main(String[] args)
        {
                Scanner in = new Scanner(System.in);
                
                System.out.print("Please enter a number: ");
                double one = in.nextDouble();
                System.out.print("Please enter another number: ");
                double another = in.nextDouble();
                System.out.print("Please enter a third number: ");
                double other = in.nextDouble();
                
                // Strict comparison for each number
                String result;
                if (one > another && another > other)
                {
                        result = "decreasing";
                }
                else if (one < another && another < other)
                {
                        result = "increasing";
                }                        
                else
                {
                        result = "neither";
                }
                System.out.print(result);
        }
}