import java.util.Scanner;

/**
        This program prompts a user for a number between 1,000 and 999,999
        and prints it with a comma seperating the thousands
*/

public class NumberFormatter
{
        public static void main(String[] args)
        {
                // Construct an object of the Scanner class
                Scanner in = new Scanner(System.in);
                
                System.out.print("Please enter an integer between 1000 and 999999: ");
                String number = in.next();
                
                String firstHalf = number.substring(0, number.length() - 3);
                String otherHalf = number.substring(number.length() - 3);
                
                System.out.println(firstHalf + "," + otherHalf);                
        }
}