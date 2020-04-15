import java.util.Scanner;

/**
        This program reads in two floating-point numbers and tests
        whether they are the same up to two decimal places
*/
public class FloatingPointComparator
{
        public static void main(String[] args)
        {
                final double ONE_HUNDREDTH = 0.01;
                
                Scanner in = new Scanner(System.in);
                
                System.out.print("Enter two floating-point numbers: ");
                String input = in.nextLine();
                
                // Parse the input and split the numbers using
                // whitespace characters as the delimiter
                int whitespace = input.indexOf(" ");
                double a = Double.parseDouble(input.substring(0, whitespace));
                double b = Double.parseDouble(input.substring(whitespace + 1));
                
                String out;
                if (Math.abs(a - b) > ONE_HUNDREDTH)
                {
                        out = "They are different";
                }
                else
                {
                        out = "They are the same up to two decimal places";
                }
                
                System.out.print(out);
        }
}