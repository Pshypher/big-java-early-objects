import java.util.Scanner;

/**
    This program reads a number and print all of the binary 
    digits of the number.
*/
public class BinaryDigits
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a positive integer: ");
        if (in.hasNextInt())
        {
            int number = in.nextInt();
            
            if (number < 0)
            {
                System.out.println("Error: " + number + 
                    "isn't a positive integer");
            }
            else
            {
                while (number != 0)
                {
                    int binaryDigit = number % 2;
                    number = number / 2;
                    System.out.println(binaryDigit);
                } 
            }
        }
        else
        {
            System.out.println("Error: Not an integer");
        }
    }
}