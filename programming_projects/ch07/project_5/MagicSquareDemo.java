import java.util.Scanner;

/**
    Program written to test if a sequence of numbers 1 - 16
    form a magic square when put on a 4x4 matrix
*/
public class MagicSquareDemo
{
    public static final int SIZE = 4;
     
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
         
        System.out.print("Sequence of numbers that forms a magic square");
        System.out.println("on a 4x4 matrix.");
        System.out.println();
        
        System.out.print("Enter numbers 1,2,3,...,16 such that it is a");
        System.out.println(" magic square, Q to quit:");
        
        MagicSquares magicSquares = new MagicSquares(SIZE);
        while (in.hasNextInt())
        {
            if (!magicSquares.add(in.nextInt()))
            {
                System.out.print("No more values can be added ");
                System.out.println("to the 4x4 matrix.");
                return;
            } 
        }
        
        if (magicSquares.hasAllValues())
        {
            String output;
            if (magicSquares.isMagicSquare())
            {
                output = "is a magic square"; 
            }
            else 
            { 
                output = "isn't a magic square";
            }
            magicSquares.display();
            System.out.println(output);
        }           
        else
        {
            System.out.println("4x4 matrix missing some values.");
        }
    }
}