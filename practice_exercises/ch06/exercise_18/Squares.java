import java.util.Scanner;

/**
    This program displays using asterisks a filled and hollow  
    square.
*/
public class Squares
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        
        System.out.print("Side length: ");
        int sideLength = in.nextInt();
        
        for (int row = 1; row <= sideLength; row++)
        {
            for (int col = 1; col <= sideLength; col++)
            {
                System.out.print("*");
            }
            System.out.print(" ");
            if (row == 1 || row == sideLength)
            {
                for (int col = 1; col <= sideLength; col++)
                {
                    System.out.print("*");
                }
            }
            else
            {
                for (int col = 1; col <= sideLength; col++)
                {
                    if (col == 1 || col == sideLength)
                    {
                        System.out.print("*");
                    }
                    else { System.out.print(" "); }
                }
            }
            System.out.println();
        }
    }
}