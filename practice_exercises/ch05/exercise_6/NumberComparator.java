import java.util.Scanner;

/**
        This program modifies the NumberComparison program so that a user
        decides if a strict or more lenient comparison be done with the numbers
*/
public class NumberComparator
{
        public static void main(String[] args)
        {
                // Constant(s)
                final String STRICT = "strict";
                final String LENIENT = "lenient";
                
                Scanner in = new Scanner(System.in);
                
                System.out.print("Enter a mode \"strict\" or \"lenient\"" +     // strict or lenient comparison of each
                        " for comparing the numbers: ");                        // number is determined by the user
                String mode = in.next();
                
                double one;
                double another;
                double other;
                
                String result;
                if (mode.equals(STRICT))
                {
                        System.out.print("Please enter a number: ");
                        one = in.nextDouble();
                        System.out.print("Please enter another number: ");
                        another = in.nextDouble();
                        System.out.print("Please enter a third number: ");
                        other = in.nextDouble();
                        
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
                }
                else if (mode.equals(LENIENT))
                {
                        System.out.print("Please enter a number: ");
                        one = in.nextDouble();
                        System.out.print("Please enter another number: ");
                        another = in.nextDouble();
                        System.out.print("Please enter a third number: ");
                        other = in.nextDouble();

                        if (one == another && another == other)
                        {
                                result = "increasing and decreasing";
                        }
                        else if (one < another && another <= other)
                        {
                                result = "increasing";
                        }
                        else if (one < another && another < other)
                        {
                                result = "increasing";
                        }
                        else if (one >= another && another > other)
                        {
                                result = "decreasing";
                        }
                        else if (one > another && another >= other)
                        {
                                result = "decreasing";
                        }
                        else if (one > another && another > other)
                        {
                                result = "decreasing";
                        }
                        else
                        {
                                result = "neither";
                        }
                }
                else
                {
                        result = "Error: mode should be either \"strict\" or \"lenient\".";  
                }
                System.out.println(result);
        }
}