import java.util.Scanner;

/**
        This program counts the number of digits in a number at most 
        ten billion entered by a user 
*/
public class DigitCount
{
        public static void main(String[] args)
        {
                Scanner in = new Scanner(System.in);
                
                System.out.print("Please enter a number (at most 10,000,000,000): ");
                int number = in.nextInt();
                
                number = (number < 0) ? number * -1 : number;
                
                int digits;
                if (number < 10)
                {
                        digits = 1;
                }
                else if (number < 100)
                {
                        digits = 2;
                }
                else if (number < 1000)
                {
                        digits = 3;
                }
                else if (number < 10000)
                {
                        digits = 4;
                }
                else if (number < 100000)
                {
                        digits = 5;
                }
                else if (number < 1000000)
                {
                        digits = 6;
                }
                else if (number < 10000000)
                {
                        digits = 7;
                }
                else if (number < 100000000)
                {
                        digits = 8;
                }
                else if (number < 1000000000)
                {
                        digits = 9;
                }
                else
                {
                        digits = 10;
                }
                System.out.println("Digits: " + digits);
        }
}