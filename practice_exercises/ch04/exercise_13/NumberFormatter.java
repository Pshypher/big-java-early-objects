import java.util.Scanner;

/**
        This program removes a comma from a number (between 1,000 and 999,999) 
        entered by the user as a String and displays the formatted string
*/

public class NumberFormatter
{
        public static void main(String[] args)
        {
                // Construct an object of the Scanner class
                Scanner in = new Scanner(System.in);
                
                System.out.print("Please enter an integer between 1,000 and 999,999: ");
                String number = in.next();
                
                // Extract each half of the number with a ","
                String firstHalf = number.substring(0, number.length() - 4);
                String otherHalf = number.substring(number.length() - 4 + 1);
                
                System.out.println(firstHalf + otherHalf);
        }
}