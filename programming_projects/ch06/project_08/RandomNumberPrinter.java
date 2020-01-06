import java.util.Scanner;

/**
    This program prints 100 random numbers using the simple
    random generator class
*/
public class RandomNumberPrinter
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        
        System.out.print("Enter a value of the seed: ");
        int seed = in.nextInt();
        
        RandomGenerator generator = new RandomGenerator(42);
        
        System.out.print("Do you want to change m(yes/no)? ");
        String input = in.next();
        if (input.equals("yes"))
        {
            System.out.print("Enter a value for m: ");
            int m = in.nextInt();
            generator.setDivisor(m);
        }
        
        for (int i = 1; i <= 100; i++)
        {
            int value = generator.nextInt();
            System.out.println(value);
        }
    }
}