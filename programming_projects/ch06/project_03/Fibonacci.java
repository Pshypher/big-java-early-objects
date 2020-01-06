import java.util.Scanner;

/**
    This program uses the fibonacci algorithm to simulate the
    population of rabbits in the nth generation.
*/
public class Fibonacci
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        
        System.out.print("Enter nth sequence(an integer): ");
        if (in.hasNextInt())
        {
            int n = in.nextInt();
            int fold1 = 1;
            int fold2 = 1;
            
            int population;
            if (n == 0)
            {
                population = 0;
            }
            else if (n < 3)
            {
                population = fold2;
            }
            else
            {
                int fnew;
                do
                {
                    fnew = fold1 + fold2;
                    fold2 = fold1;
                    fold1 = fnew;/
                    n--;
                }
                while (n > 2);
                population = fnew;
            }
            System.out.println(population);
        }
        else { System.out.println("Bad input."); }
    }
}