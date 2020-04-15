import java.util.Scanner;

/**
        This program breaks a five digit integer into a sequence 
        of individual digits
*/

public class NumberSplitter
{
        public static void main(String[] args)
        {
                final int DIVISOR = 10;
                
                // Construct a Scanner object
                Scanner in = new Scanner(System.in);
                
                System.out.print("Enter a five digit integer (e.g 98426): ");
                int digit = in.nextInt();
                
                int unit = digit % DIVISOR;
                digit = digit / DIVISOR;
                int tens = digit % DIVISOR;
                digit = digit / DIVISOR;
                int hundred = digit % DIVISOR;
                digit = digit / DIVISOR;
                int thousand = digit % DIVISOR;
                digit = digit / DIVISOR;
                
                System.out.println(digit + " " + thousand +
                        " " + hundred + " " + tens + " " + unit);
        }
}