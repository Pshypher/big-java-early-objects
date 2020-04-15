import java.util.Scanner;

/**
    This program prints out all the factors of an integer.
*/
public class FactorPrinter
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        
        System.out.print("Enter an integer: ");
        if (in.hasNextInt())
        {
            int numberToFactor = in.nextInt();
            FactorGenerator generator = new FactorGenerator(numberToFactor);
            while (generator.hasMoreFactors())
            {
                System.out.println(generator.nextFactor());
            }
        }
        else
        {
            System.out.print("Wrong type");
        }
    }
}