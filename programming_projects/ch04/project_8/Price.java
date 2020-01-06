import java.util.Scanner;

/**
        This program extracts the dollars and cents from a price given
        as a floating-point value        
*/
public class Price
{
        public static void main(String[] args)
        {
                // Construct an object of the Scanner class
                Scanner in = new Scanner(System.in);
                
                System.out.print("Enter the price to be extracted: ");
                double price = in.nextDouble();
                
                int dollars = (int) price;
                int cents = (int) ((price - dollars) * 100 + 0.5);
                
                System.out.printf("%d dollars and %d cents\n", dollars, cents);
        }
}