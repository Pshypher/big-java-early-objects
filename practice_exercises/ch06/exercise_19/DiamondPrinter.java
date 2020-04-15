import java.util.Scanner;

/**
    This program prompts a user for a given side length and displays
    using asterisks a filled diamond of the given side length
*/
public class DiamondPrinter
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        
        System.out.print("Side length of diamond: ");
        int sideLength = in.nextInt();
        
        int height = 2 * sideLength - 1; // Height of diamond is made up of 
                                         // discrete rows. 
        int asterisks = 1;
        int spaces = sideLength - 1;
        
        for (int row = 1; row <= height; row++)
        {
            for (int i = 0; i <= spaces; i++)
            {
                System.out.print(" ");
            }
            for (int i = 1; i <= asterisks; i++)
            {
                System.out.print("*");
            }
            
            System.out.println();
            
            if (row / sideLength > 0)
            {
                asterisks = asterisks - 2;
                spaces++;
            }
            else
            {
                asterisks = asterisks + 2;
                spaces--;
            }
        }
    }
}