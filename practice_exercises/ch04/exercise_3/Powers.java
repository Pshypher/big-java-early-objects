import java.util.Scanner;

/**
        This programs reads a number and calculates the square,
        cube and fourth power of the number
*/
public class Powers
{
        public static void main(String[] args)
        {
                // Construct an object of the Scanner class
                Scanner in = new Scanner(System.in);
                
                System.out.print("Please enter a number: ");
                int number = in.nextInt();
                System.out.println();
                
                System.out.printf("(%d ^ 2): %6d\n", number, 
                        number * number);
                System.out.printf("(%d ^ 3): %6d\n", number,
                        number * number * number);
        
                int fourthPower = (int) Math.pow(number, 4);                     
                System.out.printf("(%d ^ 4): %6d", number, fourthPower);                                                         
        }
}